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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PostJAXBCodegenFix {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java PostJAXBCodegenFix <configYaml>");
            System.exit(1);
        }

        Path configYamlPath = Paths.get(args[0]);
        System.out.println("[INFO] Starting JAXB Codegen Fix Utility...");
        System.out.println("Config YAML: " + configYamlPath);

        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_15); // or JAVA_14+
        StaticJavaParser.setConfiguration(config);


        // Load combined YAML
        PostJAXBConfig postConfig = loadYaml(configYamlPath.toString(), PostJAXBConfig.class);
        
        if (postConfig.getChange() != null) {
            applyAllChanges(postConfig.getChange().getChange(), config);
        } else {
            System.out.println("[WARN] No changes defined in YAML");
        }

        if (postConfig.getDelete() != null) {
            applyAllDeletes(postConfig.getDelete().getDelete());
        } else {
            System.out.println("[WARN] No deletes defined in YAML");
        }

        if (postConfig.getRegex() != null) {
            applyAllRegexChanges(postConfig.getRegex().getRegex());
        } else {
            System.out.println("[WARN] No regex patterns defined in YAML");
        }

        if (postConfig.getCopy() != null) {
            applyAllCopyChanges(postConfig.getCopy().getCopy());
        } else {
            System.out.println("[WARN] No copy operations defined in YAML");
        }

        System.out.println("[INFO] JAXB Codegen Fix Utility finished.");
    }


    private static void applyAllCopyChanges(List<Copy> copies) throws IOException {
        if (copies == null || copies.isEmpty()) return;

        for (Copy copy : copies) {
            Path fromPath = Paths.get(copy.getFrom());
            Path toPath = Paths.get(copy.getTo());

            try {
                if (Files.exists(fromPath)) {
                    Files.createDirectories(toPath.getParent());
                    Files.copy(fromPath, toPath);
                } else {
                    System.out.println("[WARNING] Source file not found for copy: " + copy.getFrom());
                }
            } catch (IOException e) {
                System.err.println("[ERROR] Copying file from " + copy.getFrom() + " to " + copy.getTo() + ": " + e.getMessage());
            }
        }

        System.out.println("[INFO] " + copies.size() + " Copy operations completed.");
    }

    private static void applyAllChanges(List<Change> changes, ParserConfiguration config) throws IOException {
        if (changes == null || changes.isEmpty()) return;

        JavaParser parser = new JavaParser(config);

        for (Change change : changes) {
            String filePathStr = change.getWhere().getFilePath();
            if (filePathStr == null || filePathStr.isEmpty()) continue;

            Path filePath = Paths.get(filePathStr);
            if (!Files.exists(filePath) || !Files.isRegularFile(filePath)) {
                System.err.println("[WARN] File not found: " + filePath);
                continue;
            }

            try {
                ParseResult<CompilationUnit> result = parser.parse(filePath);
                if (!result.isSuccessful() || result.getResult().isEmpty()) {
                    System.err.println("[WARN] Failed to parse " + filePath);
                    continue;
                }

                CompilationUnit cu = LexicalPreservingPrinter.setup(result.getResult().get());
                boolean modified = false;

                if (applyChange(cu, change)) {
                    modified = true;
                }

                if (modified) {
                    Files.write(filePath, LexicalPreservingPrinter.print(cu).getBytes(StandardCharsets.UTF_8));
                }

            } catch (IOException e) {
                System.err.println("[ERROR] Processing file " + filePath + ": " + e.getMessage());
            }
        }

        System.out.println("[INFO] " + changes.size() + " Change operations completed.");

    }

    private static boolean applyChange(CompilationUnit cu, Change change) {
        String targetMethodName = (change.getWhere() != null) ? change.getWhere().getMethod() : null;
        String targetFieldName = (change.getWhere() != null) ? change.getWhere().getField() : null;

        if (targetMethodName == null && targetFieldName == null) {
            System.err.println("[WARN] No method or field specified.");
            return false;
        }

        // 🔹 Update methods
        if (targetMethodName != null) {
            cu.findAll(MethodDeclaration.class).forEach(method -> {
                if (method.getNameAsString().equals(targetMethodName)) {
                    applyUpdates(method, change);
                }
            });
        }

        // 🔹 Update fields
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
                    System.err.println("[ERROR] Failed to parse and add annotation string: "
                        + newAnnStr + ". Error: " + e.getMessage());
                }
            }
        }
    }


    private static void applyAllDeletes(List<Delete> deletes) {
        if (deletes == null || deletes.isEmpty()) return;

        for (Delete delete : deletes) {
            Path targetPath = Paths.get(delete.getFilePath());
            
            try {
                if (Files.exists(targetPath)) {
                    Files.delete(targetPath);
                } else {
                    System.out.println("[WARNING] File not found for deletion: " + delete.getFilePath());
                }
            } catch (IOException e) {
                System.err.println("[ERROR] Deleting file " + delete.getFilePath() + ": " + e.getMessage());
            }
        }

        System.out.println("[INFO] " + deletes.size() + " Delete operations completed.");
    }

    private static void applyAllRegexChanges(List<Regex> regexChanges) {
        if (regexChanges == null) return;

        for (Regex change : regexChanges) {
            Path filePath = Paths.get(change.getFilePath());

            if (!Files.exists(filePath)) {
                System.out.println("[WARN] Regex file not found: " + filePath);
                continue;
            }

            try {
                String content = Files.readString(filePath);
                String newContent = content.replaceAll(change.getRegex(), change.getReplacement());

                if (!newContent.equals(content)) {
                    Files.writeString(filePath, newContent);
                }
            } catch (IOException e) {
                System.err.println("[ERROR] Regex change failed for " + filePath + ": " + e.getMessage());
            }
        }

        System.out.println("[INFO] " + regexChanges.size() + " Regex operations completed.");
    }


    private static <T> T loadYaml(String yamlFilePath, Class<T> type) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            return mapper.readValue(new File(yamlFilePath), type);
        } catch (IOException e) {
            System.err.println("[ERROR] Loading YAML: " + e.getMessage());
            return null;
        }
    }

}