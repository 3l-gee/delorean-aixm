package com.delorean.aixm.postjaxb.unit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

import com.delorean.aixm.postjaxb.PostJAXBRunner;


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
    // Negative cases - common invalid paths
    // -----------------------------
    @ParameterizedTest
    @ValueSource(strings = {
            "../outside",          // attempt to escape project
            "../../etc/passwd",
            "/../absolute/escape", // absolute escape
            "\0bad"                // null byte injection
    })
    void testSanitizePath_CommonInvalidPaths(String input) {
        assertThrows(Exception.class, () -> {
            PostJAXBRunner.sanitizePath(input);
        });
    }

    // -----------------------------
    // Negative paths only relevant on Linux/macOS
    // -----------------------------
    @EnabledOnOs({OS.LINUX, OS.MAC})
    @ParameterizedTest
    @ValueSource(strings = {
            "/etc/passwd",          // absolute path on Unix
            "//server/share/file"   // UNC style on Unix (treated as absolute escape)
    })
    void testSanitizePath_UnixInvalidPaths(String input) {
        assertThrows(Exception.class, () -> {
            PostJAXBRunner.sanitizePath(input);
        });
    }

    // -----------------------------
    // Negative paths only relevant on Windows
    // -----------------------------
    @EnabledOnOs(OS.WINDOWS)
    @ParameterizedTest
    @ValueSource(strings = {
            "C:\\Windows",          // not under project
            "D:\\SomeFolder"
    })
    void testSanitizePath_WindowsInvalidPaths(String input) {
        assertThrows(Exception.class, () -> {
            PostJAXBRunner.sanitizePath(input);
        });
    }
}
