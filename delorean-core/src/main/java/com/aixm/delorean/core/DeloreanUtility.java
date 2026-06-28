package com.aixm.delorean.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.UUID;
import java.util.Arrays;

import com.aixm.delorean.core.log.ConsoleLogger;

import java.nio.file.Path;

public class DeloreanUtility {

    private DeloreanUtility() {
        // Private constructor to prevent instantiation
    }

    /**
     * Loads a file from the disk (external file system) as an InputStream.
     * @param filePath The absolute or relative path to the file.
     * @return The InputStream for the file or the first entry of a zip.
     * @throws Exception If the file is not found, access is denied, or any I/O error occurs.
     */
    public static InputStream absPathToInputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            ConsoleLogger.error("File path cannot be null or empty.");
            return null;
        }
        
        Path path = Paths.get(filePath);

        try {
            if (!Files.exists(path)) {
                ConsoleLogger.error("File not found at path: " + filePath);
                return null;
            }
            
            if (Files.isDirectory(path)) {
                ConsoleLogger.error("Path points to a directory, not a file: " + filePath);
                return null;
            }
            
            return new FileInputStream(path.toFile());
        } catch (SecurityException e) {
            ConsoleLogger.error("Access denied for file at path: " + filePath);
            return null;
        } catch (FileNotFoundException e) {
            ConsoleLogger.error("File not found at path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.error("An unexpected I/O error occurred while accessing: " + filePath + " - " + e.getMessage());
            return null;
        }
    }

    /**
     * Loads a file from the disk (external file system) as an InputStream.
     * @param filePath The absolute or relative path to the file.
     * @return The InputStream for the file or the first entry of a zip.
     * @throws Exception If the file is not found, access is denied, or any I/O error occurs.
     */
    public static InputStream urlToInputStream(String fileUrl) {
        if (fileUrl == null || fileUrl.trim().isEmpty()) {
            ConsoleLogger.error("File url cannot be null or empty.");
            return null;
        }

        String trimmedUrl = fileUrl.trim().toLowerCase();

        if (!trimmedUrl.startsWith("http://") || !trimmedUrl.startsWith("https://")) {
            ConsoleLogger.error("File Url must be a valid Url:" + trimmedUrl);
            return null;
        }

        try {
            URI uri = new URI(trimmedUrl);
            URL url = uri.toURL();
            
            return url.openStream();
            
        } catch (IllegalArgumentException e) {
            ConsoleLogger.error("Malformed URL syntax: " + trimmedUrl);
            return null;
        } catch (FileNotFoundException e) {
            ConsoleLogger.error("Remote file not found (404) at URL: " + trimmedUrl);
            return null;
        } catch (Exception e) {
            ConsoleLogger.error("An error occurred while fetching remote URL: " + trimmedUrl + " - " + e.getMessage());
            return null;
        }
    }

    /**
     * Connects to a remote URL, downloads the .zip dataset, 
     * and returns the InputStream of the first file found inside the archive.
     * * @param fileUrl The valid HTTP or HTTPS URL to the remote zip dataset.
     * @return The InputStream for the first inner file entry, or null on failure.
     */
    public static InputStream urlZipToInputStream(String fileUrl) {
        if (fileUrl == null || fileUrl.trim().isEmpty()) {
            ConsoleLogger.error("File URL cannot be null or empty.");
            return null;
        }

        String trimmedUrl = fileUrl.trim();

        if (!trimmedUrl.startsWith("http://") && !trimmedUrl.startsWith("https://")) {
            ConsoleLogger.error("URL must be a valid HTTP/HTTPS address: " + trimmedUrl);
            return null;
        }

        if (!trimmedUrl.endsWith(".zip")) {
            ConsoleLogger.error("URL does not point to a .zip file: " + trimmedUrl);
            return null;
        }

        try {
            URI uri = new URI(trimmedUrl);
            URL url = uri.toURL();
            
            ZipInputStream zipStream = new ZipInputStream(url.openStream());
            ZipEntry entry = zipStream.getNextEntry();
            
            while (entry != null && entry.isDirectory()) {
                entry = zipStream.getNextEntry();
            }
            
            if (entry == null) {
                ConsoleLogger.error("The zip archive at the URL is empty or contains no files: " + trimmedUrl);
                zipStream.close();
                return null;
            }
            
            return zipStream;
            
        } catch (IllegalArgumentException e) {
            ConsoleLogger.error("Malformed URL syntax: " + trimmedUrl);
            return null;
        } catch (FileNotFoundException e) {
            ConsoleLogger.error("Remote zip file not found (404) at URL: " + trimmedUrl);
            return null;
        } catch (Exception e) {
            ConsoleLogger.error("An error occurred while fetching or processing remote zip: " + trimmedUrl + " - " + e.getMessage());
            return null;
        }
    }

    /**
     * Generates a UUID hash from the provided input strings.
     * @param inputs The input strings to hash.
     * @return The generated UUID hash.
     */
    public static String generateHash(String... inputs) {
        if (inputs == null || inputs.length == 0) {
            throw new IllegalArgumentException("Inputs cannot be null or empty");
        }

        String combined = Arrays.stream(inputs)
                .filter(s -> s != null)
                .collect(Collectors.joining("|"));

        return "urn:oid:" + UUID.nameUUIDFromBytes(combined.getBytes(StandardCharsets.UTF_8)).toString();
    }

    public static InputStream absPathZipToInputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            ConsoleLogger.error("File path cannot be null or empty.");
            return null;
        }

        if (!filePath.toLowerCase().endsWith(".zip")) {
            ConsoleLogger.error("File path must end with .zip: " + filePath);
            return null;
        }
    
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ZipInputStream zis = new ZipInputStream(fis);
            
            ZipEntry entry = zis.getNextEntry();
            
            if (entry == null) {
                ConsoleLogger.error("ZIP file is empty: " + filePath);
                zis.close();
                return null;
            }

            // Return the ZipInputStream itself. 
            // When the caller closes this, it closes the FileInputStream too.
            return zis; 
            
        } catch (IOException e) {
            ConsoleLogger.error("I/O error: " + e.getMessage());
            return null;
        }
    }

    /**
     * Provides a FileOutputStream for writing data to a file on the disk.
     * @param filePath The path where the file should be created/overwritten.
     * @return The FileOutputStream for writing.
     * @throws Exception If the file cannot be created or an I/O error occurs.
     */
    public static FileOutputStream pathToOutputStream(String filePath) {
        Path path = Paths.get(filePath);
        
        // Ensure the parent directories exist before creating the file
        try {
            Files.createDirectories(path.getParent());
        } catch (AccessDeniedException e) {
            ConsoleLogger.error("Access denied when creating directories for path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.error("Failed to create parent directories for path: " + filePath + " - " + e.getMessage());
            return null;
        }

        
        try {
            return new FileOutputStream(path.toFile());
        } catch (FileNotFoundException e) {
            ConsoleLogger.error("File not found when creating FileOutputStream for path: " + filePath);
            return null;
        } catch (Exception e) {
            ConsoleLogger.error("An unexpected I/O error occurred while creating FileOutputStream for: " + filePath + " - " + e.getMessage());
            return null;
        }
    }


    public static Path validateAndGetPath(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            ConsoleLogger.error("File path cannot be null or empty.");
            return null;
        }

        try {
            Path path = Paths.get(filePath);
            if (!Files.exists(path)) {
                ConsoleLogger.error("Path does not exist: " + filePath);
                return null;
            }
            return path;
        } catch (Exception e) {
            ConsoleLogger.error("Invalid file path: " + filePath + " - " + e.getMessage());
            return null;
        }
    }

    public static String pathToSQLRessouce(String resourcePath) {
        InputStream inputStream;
        try  {
            inputStream = DeloreanUtility.class.getResourceAsStream(resourcePath);
        } catch (Exception e) {
            ConsoleLogger.error("Error reading SQL resource: " + resourcePath + " - " + e.getMessage());
            return null;
        } 

        if (inputStream == null) {
            ConsoleLogger.error("SQL resource not found: " + resourcePath);
            return null;
        }

        try {
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            ConsoleLogger.error("Error reading SQL resource stream: " + resourcePath + " - " + e.getMessage());
            return null;
        }
    }

}
