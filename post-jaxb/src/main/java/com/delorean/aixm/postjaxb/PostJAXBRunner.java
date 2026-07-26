package com.delorean.aixm.postjaxb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithAnnotations;
import com.github.javaparser.printer.lexicalpreservation.LexicalPreservingPrinter;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class PostJAXBRunner {

    private static final Path PROJECT_ROOT = Paths.get("").toAbsolutePath().normalize();

    /**
     * Main method to run the PostJAXB utility. It expects a single argument: the path to the configuration YAML file. 
     * The method performs various operations such as applying changes, deletes, regex replacements, and copy operations based on the provided configuration.
     * @param args Command line arguments. The first argument should be the path to the configuration YAML file.
     * @throws IOException If an I/O error occurs during file operations.
    */
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            log.error("Usage: java PostJAXBCodegenFix <configYaml>");
            System.exit(1);
        }

        Path configYamlPath = sanitizePath(args[0]);
        log.info("Post JAXB utility started with: " + configYamlPath + " at: " + PROJECT_ROOT);

        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_15);
        StaticJavaParser.setConfiguration(config);


        // Load combined YAML
        PostJAXBConfig postConfig = loadYaml(configYamlPath.toString(), PostJAXBConfig.class);
        
        if (postConfig.getChange() != null) {
            applyAllChanges(postConfig.getChange(), config);
        } else {
            log.info("No changes defined in YAML");
        }

        if (postConfig.getDelete() != null) {
            applyAllDeletes(postConfig.getDelete());
        } else {
            log.info("No deletes defined in YAML");
        }

        if (postConfig.getRegex() != null) {
            applyAllRegexChanges(postConfig.getRegex());
        } else {
            log.info("No regex patterns defined in YAML");
        }

        if (postConfig.getCopy() != null) {
            applyAllCopyChanges(postConfig.getCopy());
        } else {
            log.info("No copy operations defined in YAML");
        }

        log.info("JAXB Codegen Fix Utility finished.");
    }

    /**
     * Sanitizes the provided raw input path
     * @param rawInputPath The raw input path to sanitize
     * @return The sanitized Path object
     * @throws IllegalArgumentException If the path is empty or null
     */
    public static Path sanitizePath(String rawInputPath) {
        if (rawInputPath == null || rawInputPath.isBlank()) {
            throw new IllegalArgumentException("Path is empty");
        }

        // Null-byte check
        if (rawInputPath.indexOf('\0') >= 0) {
            throw new SecurityException("Invalid path (null byte): " + rawInputPath);
        }

        // Parse path safely
        Path inputPath;
        try {
            inputPath = Path.of(rawInputPath);
        } catch (InvalidPathException e) {
            throw new SecurityException("Invalid path syntax: " + rawInputPath);
        }

        // UNC paths check
        Path root = inputPath.getRoot();
        if (root != null && root.toString().startsWith("\\\\")) {
            throw new SecurityException("UNC paths not allowed: " + rawInputPath);
        }

        // Resolve inside project root
        Path resolved = PROJECT_ROOT.resolve(inputPath).normalize();

        // Bound check
        if (!resolved.startsWith(PROJECT_ROOT)) {
            throw new SecurityException("Path escapes project root: " + rawInputPath);
        }

        // Symlink escape check
        try {
            Path realRoot = PROJECT_ROOT.toRealPath();
            Path realResolved = resolved.toRealPath(LinkOption.NOFOLLOW_LINKS);

            if (!realResolved.startsWith(realRoot)) {
                throw new SecurityException("Symlink escape detected: " + rawInputPath);
            }

            return realResolved;

        } catch (NoSuchFileException e) {
            return resolved;

        } catch (IOException e) {
            // It's safer to block the operation entirely if the path cannot be verified.
            throw new SecurityException("Could not verify real path: " + rawInputPath + " : " + e.getMessage());
        }
    }
    /**
     * Applies all copy operations defined in the provided list.
     * @param copies The list of copy operations to apply.
     * @throws IOException If an I/O error occurs during file operations.
    */
    public static void applyAllCopyChanges(List<Copy> copies) throws IOException {
        if (copies == null || copies.isEmpty()) return;

        int successful = 0;
        for (Copy copy : copies) {
            Path fromPath = sanitizePath(copy.getFrom());
            Path toPath = sanitizePath(copy.getTo());

            try {
                Path parent = toPath.getParent();
                if (parent != null) {
                    Files.createDirectories(parent);
                }
                Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);
                successful++;
            } catch (IOException e) {
                throw new IOException("Copying file from " + copy.getFrom() + " to " + copy.getTo() + ": " + e.getMessage(), e);
            }
        }

        log.info(successful + "/" + copies.size() + " files copied successfully.");
    }

    /**
     * Applies all changes defined in the provided list to the corresponding Java source files.
     * @param changes The list of changes to apply.
     * @param config The ParserConfiguration to use for parsing Java files.
     * @throws IOException If an I/O error occurs during file operations or parsing.
    */
    private static void applyAllChanges(List<Change> changes, ParserConfiguration config) throws IOException {
        if (changes == null || changes.isEmpty()) return;

        final  JavaParser PARSER = new JavaParser(config);

        int successful = 0;
        for (Change change : changes) {
            String filePathStr = change.getWhere().getFilePath();
            if (filePathStr == null || filePathStr.isEmpty()) continue;

            Path path = sanitizePath(filePathStr);

            try {
                ParseResult<CompilationUnit> result = PARSER.parse(path);
                if (!result.isSuccessful() || result.getResult().isEmpty()) {
                    throw new IOException("Failed to parse " + path + ": " + result.getProblems());
                }

                CompilationUnit cu = LexicalPreservingPrinter.setup(result.getResult().get());
                boolean modified = false;

                if (applyChange(cu, change)) {
                    modified = true;
                }

                if (modified) {
                    Files.write(path, LexicalPreservingPrinter.print(cu).getBytes(StandardCharsets.UTF_8));
                }

                successful++;

            } catch (IOException e) {
                throw new IOException("Processing file " + path + ": " + e.getMessage(), e);
            }
        }

        log.info(successful + "/" + changes.size() + " change operations completed.");
    }

    /**
     *  Applies a single change to the provided CompilationUnit. It targets either a method or a field based on the Change object.
     * @param cu The CompilationUnit to which the change will be applied.
     * @param change The Change object containing the update to be applied.
     * @return True if the CompilationUnit was modified, false otherwise.
    */
    private static boolean applyChange(CompilationUnit cu, Change change) {
        String targetMethodName = (change.getWhere() != null) ? change.getWhere().getMethod() : null;
        String targetFieldName = (change.getWhere() != null) ? change.getWhere().getField() : null;

        if (targetMethodName == null && targetFieldName == null) {
            throw new IllegalArgumentException("Change must specify either a method or a field to target.");
        }

        // Update methods
        if (targetMethodName != null) {
            cu.findAll(MethodDeclaration.class).forEach(method -> {
                if (method.getNameAsString().equals(targetMethodName)) {
                    applyUpdates(method, change);
                }
            });
        }

        // Update fields
        if (targetFieldName != null) {
            cu.findAll(FieldDeclaration.class).forEach(field -> {
                field.getVariables().forEach(var -> {
                    if (var.getNameAsString().equals(targetFieldName)) {
                        applyUpdates(field, change);
                    }
                });
            });
        }

        return true;
    }

    /**
     * Applies the updates defined in the Change object to the given node (method or field).
     * @param node The node (method or field) to which the updates will be applied.
     * @param change The Change object containing the updates to be applied.
     * @throws IllegalArgumentException If the new annotation string cannot be parsed into a valid AnnotationExpr.
    */
    private static void applyUpdates(NodeWithAnnotations<?> node, Change change) {
        if (change.getUpdates() == null || change.getUpdates().isEmpty()) return;

        for (ChangeUpdate update : change.getUpdates()) {
            String oldAnnotationName = update.getOld();

            // Remove the old annotation if it exists
            node.getAnnotationByName(oldAnnotationName).ifPresent(AnnotationExpr::remove);

            // Add new annotations
            List<String> newAnnotations = update.getNew();
            for (String newAnnStr : newAnnotations) {
                try {
                    AnnotationExpr newAnnotation = StaticJavaParser.parseAnnotation(newAnnStr);
                    node.addAnnotation(newAnnotation);
                } catch (Exception e) {
                    throw new IllegalArgumentException("Failed to parse and add annotation string: " + newAnnStr + ". Error: " + e.getMessage(), e);
                }
            }
        }
    }

    /**
     * Applies all delete operations defined in the provided list.
     * @param deletes The list of delete operations to apply.
     * @throws IOException If an I/O error occurs during file operations.
     */
    public static void applyAllDeletes(List<Delete> deletes) {
        if (deletes == null || deletes.isEmpty()) return;

        int successful = 0;
        for (Delete delete : deletes) { 
 
            // Throw at absolute paths
            Path path = sanitizePath(delete.getFilePath());

            try {
                // Perform deletion
                Files.delete(path);
                successful++;
            } catch (DirectoryNotEmptyException e) {
                // If it's a non-empty directory, perform recursive deletion
                deletePathRecursively(path);
                successful++;
            } catch (IOException e) {
                // Catch all other IO errors (Permissions, File in Use, etc.)
                throw new UncheckedIOException("Delete failed for " + path + ": " + e.getMessage(), e);
            }
        }
        log.info(successful + "/" + deletes.size() + " delete operations completed.");
    }

    /**
     * Helper method to delete a directory and all its contents recursively.
     * @param dir The directory Path to delete.
     * @throws IOException if deletion fails for any reason other than the path not existing.
     */
    private static void deletePathRecursively(Path dir) {
        try {
            Files.walk(dir)
                .sorted(Comparator.reverseOrder())
                .forEach(path -> {
                    try {
                        Files.delete(path);
                    } catch (IOException e) {
                        throw new UncheckedIOException("Failed to delete: " + path + ": " + e.getMessage(), e);
                    }
                });
        } catch (NoSuchFileException e) {
            // If the directory doesn't exist, we can consider it as already deleted.
            return;
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to access path for recursive deletion: " + dir + ": " + e.getMessage(), e);
        }
    }

    /**
     * Applies all regex changes defined in the provided list.
     * @param regexChanges The list of regex changes to apply.
     * @throws IOException If an I/O error occurs during file operations.
     */
    public static void applyAllRegexChanges(List<Regex> regexChanges) {
        if (regexChanges == null) return;

        int successful = 0;
        for (Regex change : regexChanges) {
            Path filePath = Paths.get(change.getFilePath());

            if (!Files.exists(filePath)) {
                throw new IllegalArgumentException("File does not exist for regex change: " + filePath);
            }

            try {
                String content = Files.readString(filePath);
                Pattern p = Pattern.compile(change.getRegex(), Pattern.MULTILINE);
                Matcher m = p.matcher(content);
                String newContent = m.replaceAll(Matcher.quoteReplacement(change.getReplacement()));

                if (!newContent.equals(content)) {
                    Files.writeString(filePath, newContent);
                    successful++;
                }
            } catch (IOException e) {
                throw new UncheckedIOException("Regex change failed for " + filePath + ": " + e.getMessage(), e);
            }
        }

        log.info(successful + "/" + regexChanges.size() + " regex operations completed.");
    }

    /**
     * Loads a YAML file and converts it to an object of the specified type.
     * @param <T> The type of the object to return.
     * @param yamlFilePath The path to the YAML file.
     * @param type The class of the object to return.
     * @return The loaded object.
     * @throws RuntimeException If the YAML file cannot be read or parsed.
     */
    private static <T> T loadYaml(String yamlFilePath, Class<T> type) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            return mapper.readValue(new File(yamlFilePath), type);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load YAML file: " + yamlFilePath + ". Error: " + e.getMessage(), e);
        }
    }

}