package com.aixm.delorean.core.xml;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.locationtech.jts.awt.PointShapeFactory.X;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

public class XMLBindingFactory<T, X> {
        protected final Class<T> root;
        protected final Class<X> feature;
        protected final Schema schema;
        protected final SchemaFactory schemaFactory;
        protected final Class<?> rootObjectFactory;
        protected final Class<?> featureObjectFactory;

    public XMLBindingFactory(Class<T> root, Class<X> feature, String path, Class<?> rootObjectFactory, Class<?> featureObjectFactory) {
        this.root = root;
        this.feature = feature;
        this.rootObjectFactory = rootObjectFactory;
        this.featureObjectFactory = featureObjectFactory;
        this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        this.schemaFactory.setResourceResolver(new ClasspathResourceResolver("schema"));
        this.schema = getSchemaFromPath(path, this.schemaFactory);
    }

    public Schema getSchema() {
        return this.schema;
    }

    public Class<T> getRoot() {
        return this.root;
    }

    public Class<X> getFeature() {
        return this.feature;
    }

    public XMLBinding<T, X> createXMLBinding() {
        return new XMLBinding<>(this.getSchema(), this.getRoot(), this.getFeature(), this.rootObjectFactory, this.featureObjectFactory);

    }

    private Schema getSchemaFromPath(String path, SchemaFactory schemaFactory) {

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
            if (inputStream == null) {
                throw new RuntimeException("Schema file not found in classpath: " + path);
            }
            
            Source schemaSource = new StreamSource(inputStream);
            
            URL resourceUrl = getClass().getClassLoader().getResource(path);
            if (resourceUrl != null) {
                schemaSource.setSystemId(resourceUrl.toExternalForm());
            }

            return schemaFactory.newSchema(schemaSource);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load schema: " + path, e);
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
    
}
