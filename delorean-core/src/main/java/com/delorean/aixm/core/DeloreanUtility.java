package com.delorean.aixm.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.UUID;
import java.util.Arrays;

import java.nio.file.Path;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeloreanUtility {

    private DeloreanUtility() {
        // Private constructor to prevent instantiation
    }

    /**
     * Loads a file from the disk (external file system) as an InputStream.
     * @param filePath The absolute or relative path to the file.
     * @return The InputStream for the file or the first entry of a zip.
     * @throws IOException If an I/O error occurs while opening the stream.
     * @throws NoSuchFileException If the file is not found.
     * @throws NotDirectoryException If the path points to a directory instead of a file.
     */
    public static InputStream absPathToInputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }
        
        Path path = Paths.get(filePath);

        try {
            if (!Files.exists(path)) {
                throw new NoSuchFileException("File not found at path: " + filePath);
            }

            if (Files.isDirectory(path)) {
                throw new NotDirectoryException("Path points to a directory, not a file: " + filePath);
            }
        
            InputStream stream = Files.newInputStream(path);

            log.atDebug().setMessage("Stream opened: {}").addArgument(() -> filePath);

            return stream;
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to open input stream for path: " + filePath, e);
        }
    
    }

    /**
     * Loads a file from the disk (external file system) as an InputStream.
     * @param filePath The absolute or relative path to the file.
     * @return The InputStream for the file or the first entry of a zip.
     * @throws URISyntaxException If the provided URL is not valid.
     * @throws IOException If an I/O error occurs while opening the stream.
     */
    public static InputStream urlToInputStream(String fileUrl) {
        if (fileUrl == null || fileUrl.trim().isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        try {
            URI uri = new URI(fileUrl.trim());
            String scheme = uri.getScheme();
            if (scheme == null || (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https"))) {
                throw new IllegalArgumentException("URL must use HTTP or HTTPS protocol: " + fileUrl);
            }

            if (uri.getHost() == null || !uri.getHost().contains(".")) {
                throw new IllegalArgumentException("URL is missing a valid domain extension (e.g., .com): " + fileUrl);
            }


            InputStream stream = uri.toURL().openStream();

            log.atDebug().setMessage("Remote stream opened: {}").addArgument(() -> uri.toASCIIString());
            return stream;

        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL syntax: " + fileUrl, e);
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to open input stream for URL: " + fileUrl, e);
        }
    }


    /**
     * Connects to a remote URL, downloads the .zip dataset, 
     * and returns the InputStream of the first file found inside the archive.
     * * @param fileUrl The valid HTTP or HTTPS URL to the remote zip dataset.
     * @return The InputStream for the first inner file entry, or null on failure.
     * @throws IllegalArgumentException If the URL is invalid or does not point to a .zip file.
     * @throws IOException If an I/O error occurs while opening the stream.
     * @throws URISyntaxException If the provided URL is not valid.
     */
    public static InputStream urlZipToInputStream(String fileUrl) {
        if (fileUrl == null || fileUrl.trim().isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        try {
            URI uri = new URI(fileUrl.trim());
            String scheme = uri.getScheme();

            if (scheme == null || (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https"))) {
                throw new IllegalArgumentException("URL must use HTTP or HTTPS protocol: " + fileUrl);
            }

            if (uri.getHost() == null || !uri.getHost().contains(".")) {
                throw new IllegalArgumentException("URL is missing a valid domain extension (e.g., .com): " + fileUrl);
            }

            if (!uri.getHost().contains(".zip")) {
                throw new IllegalArgumentException("URL must point to a .zip file: " + fileUrl);
            }

            InputStream stream = uri.toURL().openStream();
            ZipInputStream zipStream = new ZipInputStream(stream);
            ZipEntry entry = zipStream.getNextEntry();
            if (entry == null) {
                zipStream.close();
                throw new IllegalArgumentException("Zip url is empty: " + uri.toASCIIString());
            }

            log.atDebug()
                .setMessage("Remote stream opened for entry '{}' in zip: {}")
                .addArgument(entry::getName)
                .addArgument(() -> uri.toASCIIString())
                .log();

            return zipStream;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL syntax: " + fileUrl, e);
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to open input stream for URL: " + fileUrl, e);
        }
    }

    /**
     * Generates a UUID hash from the provided input strings.
     * @param inputs The input strings to hash.
     * @return The generated UUID hash.
     * @throws IllegalArgumentException If the inputs are null or empty.
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
    
    /**
     * Converts a local zip file path to an InputStream.
     * @param filePath The path to the local zip file.
     * @return The InputStream for the zip file.
     * @throws IllegalArgumentException If the file path is null or empty or does not point to a .zip file.
     * @throws FileNotFoundException If the file is not found.
     */
    public static InputStream absPathZipToInputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        if (!filePath.toLowerCase().endsWith(".zip")) {
            throw new IllegalArgumentException("File path must end with .zip: " + filePath);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            ZipEntry entry = zipInputStream.getNextEntry();
            if (entry == null) {
                zipInputStream.close();
                throw new IllegalArgumentException("Zip file is empty: " + filePath);
            }

            log.atDebug()
                .setMessage("Stream opened for entry '{}' in zip: {}")
                .addArgument(entry::getName)
                .addArgument(() -> filePath)
                .log();

            return zipInputStream;
        } catch (FileNotFoundException e) {
            throw new UncheckedIOException("File not found at path: " + filePath, e);
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to open zip input stream for path: " + filePath, e);
        }
    }

    /**
     * Provides a FileOutputStream for writing data to a file on the disk.
     * @param filePath The path where the file should be created/overwritten.
     * @return The FileOutputStream for writing.
     * @throws IllegalArgumentException If the file path is null or empty.
     * @throws IOException If an I/O error occurs while creating the output stream.
     */
    public static FileOutputStream pathToOutputStream(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }
        Path path = Paths.get(filePath);

        try {
            FileOutputStream fos = new FileOutputStream(path.toFile());
            log.atDebug().setMessage("Stream opened: {}").addArgument(() -> filePath).log();

            return fos;
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to create directories for path: " + path.getParent(), e);
        }
    }

    /** 
     * Validates the provided file path and returns a Path object.
     * @param filePath The path to validate.
     * @return The validated Path object.
     * @throws IllegalArgumentException If the file path is null or empty.
     */
    public static Path validateAndGetPath(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        Path path = Paths.get(filePath.trim());

        try{
            if (!Files.exists(path)) {
                throw new NoSuchFileException("Path does not exist on the file system: " + filePath);
            }

            log.atDebug().setMessage("Validated path: {}").addArgument(() -> filePath).log();

            return path;
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to validate path: " + filePath, e);
        }
    }

    /**
     * Reads a classpath SQL resource file and converts it into a String.
     * @param resourcePath The path to the SQL resource file relative to the classpath.
     * @return The text content of the SQL file.
     * @throws IllegalArgumentException If the path is null or empty.
     * @throws NullPointerException If the resource is not found on the classpath.
     * @throws IOException If an error occurs while reading the file bytes.
     */
    public static String pathToSQLRessouce(String resourcePath) {
        if (resourcePath == null || resourcePath.trim().isEmpty()) {
            throw new IllegalArgumentException("Resource path cannot be null or empty.");
        }

        try {
            InputStream inputStream = DeloreanUtility.class.getResourceAsStream(resourcePath);
            String sql = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

            log.atDebug().setMessage("SQL resource read: {}").addArgument(() -> resourcePath).log();
            
            return sql;
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to read SQL resource: " + resourcePath, e);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Resource not found on classpath: " + resourcePath, e);
        }
    }
    /**
     * Safely attempts to parse an ISO-8601 Instant string from a JsonNode field.
     * @param json
     * @param fieldName
     * @return
     */
    public static Instant parseInstantSafely(JsonNode json, String fieldName) {
        if (!json.hasNonNull(fieldName)) {
            return null;
        }

        String rawText = json.path(fieldName).asText().trim();
        if (rawText.isEmpty()) {
            return null;
        }

        try {
            return Instant.parse(rawText);
        } catch (DateTimeParseException e) {
            log.warn("Failed to parse field '{}' with raw value '{}' as an ISO-8601 Instant.", fieldName, rawText);
            throw new IllegalArgumentException(
                String.format("Field '%s' must be a valid ISO-8601 timestamp string (e.g., '2026-07-22T00:00:00Z'). Given: '%s'", fieldName, rawText), e
            );
        }
    }

}
