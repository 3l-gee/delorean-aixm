package com.util.postjaxb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.printer.lexicalpreservation.LexicalPreservingPrinter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PostJAXBCodegenFix {

    private static final Path PROJECT_ROOT = Paths.get("delorean/src/main/java/com/aixm/delorean/core");
    private static final String CHANGES_YAML_PATH = "codegen/post-jaxb/change.yaml";
    private static final String DELETES_YAML_PATH = "codegen/post-jaxb/delete.yaml";
    private static final String REGEX_YAML_PATH = "codegen/post-jaxb/regex.yaml";


    public static void main(String[] args) throws IOException {
        System.out.println("[INFO] Starting JAXB Codegen Fix Utility...");

        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_15); // or JAVA_14+
        StaticJavaParser.setConfiguration(config);

        // 1. Load Configurations
        ChangeConfig change = loadYaml(CHANGES_YAML_PATH, ChangeConfig.class);
        DeleteConfig delete = loadYaml(DELETES_YAML_PATH, DeleteConfig.class);
        RegexConfig regex = loadYaml(REGEX_YAML_PATH, RegexConfig.class);
        
        if (change == null) {
            System.out.println("[WARN] No changes loaded from " + CHANGES_YAML_PATH);
        }

        if (delete == null) {
            System.out.println("[WARN] No deletes loaded from " + DELETES_YAML_PATH);
        }

        if (regex == null) {
            System.out.println("[WARN] No regex changes loaded from " + REGEX_YAML_PATH);
        }
        
        // 2. Apply Changes
        applyAllChanges(change.getChange(), config);

        // 3. Apply Deletes
        applyAllDeletes(delete.getDelete());

        // 4. Apply Regex Changes
        applyAllRegexChanges(regex.getRegex());

        System.out.println("[INFO] JAXB Codegen Fix Utility finished.");
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

    }



    private static boolean applyChange(CompilationUnit cu, Change change) {
        String targetMethodName = (change.getWhere() != null) ? change.getWhere().getMethod() : null;
        
        if (targetMethodName == null) {
            return false; 
        }

        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if (method.getNameAsString().equals(targetMethodName)) {
                
                if (change.getUpdates() == null || change.getUpdates().isEmpty()) return;
                
                ChangeUpdate update = change.getUpdates().get(0);
                
                String oldAnnotationName = update.getOld();
                
                method.getAnnotationByName(oldAnnotationName).ifPresent(oldAnn -> {
                    oldAnn.remove();
                });

                List<String> newAnnotations = update.getNew();
                
                for (String newAnnStr : newAnnotations) {
                    try {
                        AnnotationExpr newAnnotation = StaticJavaParser.parseAnnotation(newAnnStr);
                        method.addAnnotation(newAnnotation);
                        method.getComment().ifPresent(c -> c.setContent(c.getContent() + " " + oldAnnotationName));
                        
                    } catch (Exception e) {
                        System.err.println("[ERROR] Failed to parse and add annotation string: " + newAnnStr + " for method " + method.getNameAsString() + ". Error: " + e.getMessage());
                    }
                }
            }
        });

        return cu.findAll(MethodDeclaration.class).stream().anyMatch(m -> m.getNameAsString().equals(targetMethodName));
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