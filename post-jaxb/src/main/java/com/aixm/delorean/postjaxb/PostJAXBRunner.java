package com.aixm.delorean.postjaxb;

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

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostJAXBRunner {

    private static final Path PROJECT_ROOT = Paths.get("").toAbsolutePath().normalize();

    private static void warn(String msg) { System.out.println("[WARN] " + msg); }
    private static void info(String msg) { System.out.println("[INFO] " + msg); }
    private static void error(String msg) { System.err.println("[ERROR] " + msg); }

    /*
    */
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            error("Usage: java PostJAXBCodegenFix <configYaml>");
            System.exit(1);
        }

        Path configYamlPath = sanitizePath(args[0]);
        info("Post JAXB utility started with: " + configYamlPath + " at: " + PROJECT_ROOT);

        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_15);
        StaticJavaParser.setConfiguration(config);


        // Load combined YAML
        PostJAXBConfig postConfig = loadYaml(configYamlPath.toString(), PostJAXBConfig.class);
        
        if (postConfig.getChange() != null) {
            applyAllChanges(postConfig.getChange(), config);
        } else {
            info("changes defined in YAML");
        }

        if (postConfig.getDelete() != null) {
            applyAllDeletes(postConfig.getDelete());
        } else {
            info("No deletes defined in YAML");
        }

        if (postConfig.getRegex() != null) {
            applyAllRegexChanges(postConfig.getRegex());
        } else {
            info("No regex patterns defined in YAML");
        }

        if (postConfig.getCopy() != null) {
            applyAllCopyChanges(postConfig.getCopy());
        } else {
            info("No copy operations defined in YAML");
        }

        info("JAXB Codegen Fix Utility finished.");
    }

    public static Path sanitizePath(String rawInputPath) {
        if (rawInputPath == null || rawInputPath.isBlank()) {
            throw new IllegalArgumentException("Path is empty");
        }

        // Block null-byte injection
        if (rawInputPath.indexOf('\0') >= 0) {
            throw new SecurityException("Invalid path (null byte): " + rawInputPath);
        }

        // Normalize slashes (Windows compatibility)
        rawInputPath = rawInputPath.replace('\\', '/');

        // Block UNC paths (\\server\share)
        if (rawInputPath.startsWith("//")) {
            throw new SecurityException("UNC paths not allowed: " + rawInputPath);
        }

        Path inputPath = Paths.get(rawInputPath);

        // Resolve inside project
        Path resolved = PROJECT_ROOT.resolve(inputPath).normalize();

        // Bound check
        if (!resolved.startsWith(PROJECT_ROOT)) {
            throw new SecurityException("Path escapes project root: " + rawInputPath);
        }

        // Prevent symlink escape
        try {
            Path real = resolved.toRealPath(LinkOption.NOFOLLOW_LINKS);
            if (!real.startsWith(PROJECT_ROOT)) {
                throw new SecurityException("Symlink escape detected: " + rawInputPath);
            }
            return real;
        } catch (NoSuchFileException e) {
            return resolved;
        } catch (IOException e) {
            // It's safer to block the operation entirely if the path cannot be verified.
            throw new SecurityException("Could not verify real path: " + rawInputPath + " (" + e.getMessage() + ")");
        }
    }
    /*

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
                error("Copying file from " + copy.getFrom() + " to " + copy.getTo() + ": " + e.getMessage());
            }
        }

        info(successful + "/" + copies.size() + " files copied successfully.");
    }

    /*
    
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
                    warn("Failed to parse " + path);
                    continue;
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
                error("Processing file " + path + ": " + e.getMessage());
            }
        }

        info(successful + "/" + changes.size() + " change operations completed.");
    }

    /*
    
    */
    private static boolean applyChange(CompilationUnit cu, Change change) {
        String targetMethodName = (change.getWhere() != null) ? change.getWhere().getMethod() : null;
        String targetFieldName = (change.getWhere() != null) ? change.getWhere().getField() : null;

        if (targetMethodName == null && targetFieldName == null) {
            warn("No method or field specified.");
            return false;
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

    /*
    
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
                    error("Failed to parse and add annotation string: " + newAnnStr + ". Error: " + e.getMessage());
                }
            }
        }
    }

    /*
    
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
                try {
                    deletePathRecursively(path);
                    successful++;
                } catch (IOException recursiveException) {
                    error("Recursive delete failed for " + path + ": " + recursiveException.getMessage());
                }
            } catch (IOException e) {
                // Catch all other IO errors (Permissions, File in Use, etc.)
                error("Delete failed for " + path + ": " + e.getMessage());
            }
        }
        info(successful + "/" + deletes.size() + " delete operations completed.");
    }

    /**
     * Helper method to delete a directory and all its contents recursively.
     * @param dir The directory Path to delete.
     * @throws IOException if deletion fails for any reason other than the path not existing.
     */
    private static void deletePathRecursively(Path dir) throws IOException {
        Files.walk(dir)
            .sorted(Comparator.reverseOrder())
            .forEach(path -> {
                try {
                    Files.delete(path);
                } catch (IOException e) {
                    // Propagate the exception or handle it, depending on desired robustness.
                    // For simplicity, we rethrow as an unchecked exception to be caught in the main loop.
                    throw new RuntimeException("Failed to delete item during recursive walk: " + path, e);
                }
            });
    }

    /*
    
    */
    public static void applyAllRegexChanges(List<Regex> regexChanges) {
        if (regexChanges == null) return;

        int successful = 0;
        for (Regex change : regexChanges) {
            Path filePath = Paths.get(change.getFilePath());

            if (!Files.exists(filePath)) {
                warn("Regex file not found: " + filePath);
                continue;
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
                error("Regex change failed for " + filePath + ": " + e.getMessage());
            }
        }

        info(successful + "/" + regexChanges.size() + " regex operations completed.");
    }


    private static <T> T loadYaml(String yamlFilePath, Class<T> type) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            return mapper.readValue(new File(yamlFilePath), type);
        } catch (IOException e) {
            error("Loading YAML: " + e.getMessage());
            return null;
        }
    }

}