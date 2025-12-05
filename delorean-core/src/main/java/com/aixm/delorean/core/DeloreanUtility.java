package com.aixm.delorean.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import java.nio.file.Path;

public class DeloreanUtility {

    private DeloreanUtility() {
        // Private constructor to prevent instantiation
    }

    /**
     * Loads a file from the disk (external file system) as an InputStream.
     * * @param filePath The absolute or relative path to the file.
     * @return The InputStream for the file or the first entry of a zip.
     * @throws Exception If the file is not found, access is denied, or any I/O error occurs.
     */
    public static InputStream absPathToInputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            ConsoleLogger.log(LogLevel.ERROR, "File path cannot be null or empty.");
            return null;
        }
        
        Path path = Paths.get(filePath);

        try {
            if (!Files.exists(path)) {
                ConsoleLogger.log(LogLevel.ERROR, "File not found at path: " + filePath);
                return null;
            }
            
            if (Files.isDirectory(path)) {
                ConsoleLogger.log(LogLevel.ERROR, "Path points to a directory, not a file: " + filePath);
                return null;
            }
            
            return new FileInputStream(path.toFile());
        } catch (SecurityException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Access denied for file at path: " + filePath);
            return null;
        } catch (FileNotFoundException e) {
            ConsoleLogger.log(LogLevel.ERROR, "File not found at path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "An unexpected I/O error occurred while accessing: " + filePath + " - " + e.getMessage());
            return null;
        }
    }

    public static InputStream absPathZipToInputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            ConsoleLogger.log(LogLevel.ERROR, "File path cannot be null or empty.");
            return null;
        }

        if (!filePath.toLowerCase().endsWith(".zip")) {
            ConsoleLogger.log(LogLevel.ERROR, "File path must end with .zip: " + filePath);
            return null;
        }
        
        Path path = Paths.get(filePath);

        try {
            ZipFile zipFile = new ZipFile(path.toFile());
                
            if (!zipFile.entries().hasMoreElements()) {
                ConsoleLogger.log(LogLevel.ERROR,"ZIP file is empty: " + filePath);
                return null;
            }
                
            ZipEntry firstEntry = zipFile.entries().nextElement();
                
            return zipFile.getInputStream(firstEntry);
                
        } catch (SecurityException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Access denied for file at path: " + filePath);
            return null;
        } catch (FileNotFoundException e) {
            ConsoleLogger.log(LogLevel.ERROR, "File not found at path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "An unexpected I/O error occurred while accessing: " + filePath + " - " + e.getMessage());
            return null;
        }
    }

    /**
     * Provides a FileOutputStream for writing data to a file on the disk.
     * **NOTE:** Writing directly into a ZIP archive is complex and usually requires 
     * creating a ZipOutputStream, which is a different pattern than a simple FileOutputStream. 
     * This method focuses on writing to a regular file path.
     * * @param filePath The path where the file should be created/overwritten.
     * @return The FileOutputStream for writing.
     * @throws Exception If the file cannot be created or an I/O error occurs.
     */
    public static FileOutputStream pathToOutputStream(String filePath) {
        Path path = Paths.get(filePath);
        
        // Ensure the parent directories exist before creating the file
        try {
            Files.createDirectories(path.getParent());
        } catch (AccessDeniedException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Access denied when creating directories for path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Failed to create parent directories for path: " + filePath + " - " + e.getMessage());
            return null;
        }

        
        try {
            return new FileOutputStream(path.toFile());
        } catch (FileNotFoundException e) {
            ConsoleLogger.log(LogLevel.ERROR, "File not found when creating FileOutputStream for path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "An unexpected I/O error occurred while creating FileOutputStream for: " + filePath + " - " + e.getMessage());
            return null;
        }
    }


    public static Path validateAndGetPath(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            ConsoleLogger.log(LogLevel.ERROR, "File path cannot be null or empty.");
            return null;
        }

        try {
            Path path = Paths.get(filePath);
            if (!Files.exists(path)) {
                ConsoleLogger.log(LogLevel.ERROR, "Path does not exist: " + filePath);
                return null;
            }
            return path;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Invalid file path: " + filePath + " - " + e.getMessage());
            return null;
        }
    }

    public static String pathToSQLRessouce(String resourcePath) {
        InputStream inputStream;
        try  {
            inputStream = DeloreanUtility.class.getResourceAsStream(resourcePath);
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error reading SQL resource: " + resourcePath + " - " + e.getMessage());
            return null;
        } 

        if (inputStream == null) {
            ConsoleLogger.log(LogLevel.ERROR, "SQL resource not found: " + resourcePath);
            return null;
        }

        try {
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error reading SQL resource stream: " + resourcePath + " - " + e.getMessage());
            return null;
        }
    }

}
