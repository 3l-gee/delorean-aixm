package com.aixm.delorean.aixm511.xml;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

import com.aixm.delorean.aixm511.log.ConsoleLogger;
import com.aixm.delorean.aixm511.log.LogLevel;

import java.io.InputStream;
import java.io.Reader;
import java.util.Objects;
import java.net.URI;
import java.net.URL;

public enum XMLConfig {

    // The arguments are: (version, entryPointXsd, xsdBaseDirectory)
    AIXM_5_1(
        "a5.1", 
        "message/AIXM_BasicMessage.xsd",
        "a5_1"
    ),
    AIXM_5_1_E(
        "a5.1.e", 
        "message/AIXM_BasicMessage.xsd",
        "a5_1_e"
    ),
    AIXM_5_1_1(
        "a5.1.1", 
        "message/AIXM_BasicMessage.xsd",
        "a5_1_1"
    ),
    AIXM_5_2(
        "a5.2", 
        "message/AIXM_BasicMessage.xsd",
        "a5_2"
    );


    private final String version;
    private final String root; // Entry point XSD path relative to base directory
    private final String xsd;  // Base directory on classpath
    private final Schema schema;
    private final SchemaFactory schemaFactory;

    /**
     * Constructs an XMLConfig instance, loading the XML Schema entirely from the classpath.
     * @param version The schema version identifier.
     * @param root The path to the main XSD file, relative to the base XSD directory.
     * @param xsd The base directory on the classpath containing all necessary XSD resources.
     */
    private XMLConfig(String version, String root, String xsd) {
        this.version = version; 
        this.root = root;
        this.xsd = xsd;

        this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        
        // 1. Set the custom resource resolver to handle schema imports and includes from the classpath
        this.schemaFactory.setResourceResolver(new ClasspathResourceResolver(xsd));
        
        // 2. Load the main schema using a StreamSource pointing to the entry point XSD
        this.schema = loadSchemaFromClasspath(xsd, root);
    }

    public String getVersion() {
        return version;
    }
        
    public Schema getSchema() {
        return schema;
    }

    /**
     * Loads the schema using the main XSD file path.
     * @param baseDir The base directory for all XSDs on the classpath (e.g., "a5_1").
     * @param entryPointXsd The main XSD file path relative to the base directory (e.g., "message/AIXM_BasicMessage.xsd").
     * @return The compiled Schema object.
     */
    private Schema loadSchemaFromClasspath(String baseDir, String entryPointXsd) {
        // Construct the full classpath resource path for the entry point XSD
        String fullPath = baseDir.endsWith("/") ? baseDir + entryPointXsd : baseDir + "/" + entryPointXsd;
        
        ConsoleLogger.log(LogLevel.DEBUG, "Loading schema from classpath: " + fullPath, new Exception().getStackTrace()[0]);

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(fullPath)) {
            if (is == null) {
                String errorMessage = "Resource not found on classpath: " + fullPath;
                ConsoleLogger.log(LogLevel.FATAL, errorMessage, new Exception().getStackTrace()[0]);
                throw new RuntimeException(errorMessage);
            }
            
            Source schemaSource = new StreamSource(is);
            
            URL resourceUrl = getClass().getClassLoader().getResource(fullPath);
            if (resourceUrl != null) {
                schemaSource.setSystemId(resourceUrl.toExternalForm());
            }

            return this.schemaFactory.newSchema(schemaSource);
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.FATAL, "Failed to load schema from classpath: " + fullPath, e.getStackTrace()[0]);
            throw new RuntimeException("Failed to load schema: " + fullPath, e);
        }
    }

    /**
     * Custom LSResourceResolver to resolve schema imports and includes from the classpath.
     * It uses the base XSD directory configured in the XMLConfig enum to resolve relative paths.
     */
    private static class ClasspathResourceResolver implements LSResourceResolver {
        
        private final String xsdBaseDirectory;
        
        public ClasspathResourceResolver(String xsdBaseDirectory) {
            this.xsdBaseDirectory = xsdBaseDirectory;
        }

        @Override
        public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
            // The systemId is the relative path of the imported schema (e.g., "gml.xsd" or "../common.xsd")
            if (systemId == null) {
                return null;
            }

            String resolvedPath = resolvePath(xsdBaseDirectory, systemId);
        
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resolvedPath);

            if (inputStream != null) {
                // If the resource is found, return a custom LSInput implementation holding the stream.
                return new ClasspathLSInput(publicId, systemId, baseURI, inputStream);
            }

            // If not found, return null to let the JAXP implementation try other methods.
            return null;
        }
        
        /**
         * Simple path joining logic: concatenates the base path and the relative path.
         * This handles the common case where all XSDs are under the base directory.
         * For complex relative path traversal (e.g., '..'), we must normalize the path.
         * Note: Since JAXP often provides the 'systemId' relative to the baseURI of the importing document, 
         * we try to resolve the import relative to the classpath root combined with the base directory.
         */
        private String resolvePath(String baseDir, String relativePath) {
            String normalizedBase = baseDir.replaceAll("^/|/$", "");
            String fullPath = normalizedBase + "/" + relativePath;
            try {
                URI normalizedUri = new URI(fullPath).normalize();
                return normalizedUri.getPath().replaceAll("^/|/$", ""); 
            } catch (Exception e) {
                 ConsoleLogger.log(LogLevel.WARN, "Path normalization failed for: " + fullPath + ". Using raw path.", new Exception().getStackTrace()[0]);
                 return fullPath;
            }
        }
    }
    
    /**
     * Simple LSInput implementation to hold the InputStream and metadata for the resource resolver.
     */
    private static class ClasspathLSInput implements LSInput {
        
        private InputStream inputStream;
        private String publicId;
        private String systemId;
        private String baseURI;
        private String encoding;

        public ClasspathLSInput(String publicId, String systemId, String baseURI, InputStream inputStream) {
            this.publicId = publicId;
            this.systemId = systemId;
            this.baseURI = baseURI;
            this.inputStream = inputStream;
            this.encoding = null; 
        }

        @Override
        public Reader getCharacterStream() { return null; }
        @Override
        public void setCharacterStream(Reader characterStream) {}
        @Override
        public InputStream getByteStream() { return inputStream; }
        @Override
        public void setByteStream(InputStream byteStream) { this.inputStream = byteStream; }
        @Override
        public String getStringData() { return null; }
        @Override
        public void setStringData(String stringData) {}
        @Override
        public String getSystemId() { return systemId; }
        @Override
        public void setSystemId(String systemId) { this.systemId = systemId; }
        @Override
        public String getPublicId() { return publicId; }
        @Override
        public void setPublicId(String publicId) { this.publicId = publicId; }
        @Override
        public String getBaseURI() { return baseURI; }
        @Override
        public void setBaseURI(String baseURI) { this.baseURI = baseURI; }
        @Override
        public boolean getCertifiedText() { return false; }
        @Override
        public void setCertifiedText(boolean certifiedText) {}
        @Override
        public String getEncoding() { return encoding; } 
        @Override
        public void setEncoding(String encoding) { this.encoding = encoding; } 
    }

    public static XMLConfig fromString(String version) {
        for (XMLConfig schemaVersion : XMLConfig.values()) {
            if (schemaVersion.getVersion().equals(version)) {
                return schemaVersion;
            }
        }
        throw new IllegalArgumentException("Unsupported schema version: " + version);
    }
}
