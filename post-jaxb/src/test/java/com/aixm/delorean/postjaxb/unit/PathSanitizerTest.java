package com.aixm.delorean.postjaxb.unit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

import com.aixm.delorean.postjaxb.PostJAXBRunner;

public class PathSanitizerTest {

    @TempDir
    Path tempDir;

    // -----------------------------
    // Positive cases (valid paths)
    // -----------------------------
    @ParameterizedTest
    @ValueSource(strings = {
            "src",
            "src/main/java",
            "./src",
            "some/relative/path",
            "folder/file.txt",
            "a/b/../b/c"
    })
    void testSanitizePath_ValidPaths(String input) {
        Path projectRoot = Paths.get("").toAbsolutePath().normalize();

        Path resolved = PostJAXBRunner.sanitizePath(input);

        assertNotNull(resolved);
        assertTrue(resolved.startsWith(projectRoot));
    }
    
    // -----------------------------
    // Negative cases (invalid paths)
    // -----------------------------
    @ParameterizedTest
    @ValueSource(strings = {
            "../outside",          // attempt to escape project
            "../../etc/passwd",
            "/../absolute/escape", // absolute escape
            "//server/share/file", // UNC
            "C:\\Windows",         // absolute path NOT under project
            "\0bad"                // null byte injection
    })
    void testSanitizePath_InvalidPaths(String input) {
        assertThrows(Exception.class, () -> {
            PostJAXBRunner.sanitizePath(input);
        });
    }
}
