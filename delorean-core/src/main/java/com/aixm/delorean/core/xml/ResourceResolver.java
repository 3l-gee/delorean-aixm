package com.aixm.delorean.core.xml;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

public class ResourceResolver implements LSResourceResolver {
    private final String xsdDirectory;
    private final Class<?> resourceAnchorsClass;

    ResourceResolver(String xsdDirectory, Class<?> resourceAnchorsClass) {
        this.xsdDirectory = xsdDirectory;
        this.resourceAnchorsClass = resourceAnchorsClass;
    }

    @Override
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {

        if (systemId == null) {
            return null;
        }

        String resolvedPath = resolvePath(xsdDirectory, systemId);
        InputStream inputStream = resourceAnchorsClass.getClassLoader().getResourceAsStream(resolvedPath);

        if (inputStream != null) {
            return new ClassPathInput(publicId, systemId, baseURI, inputStream);
        }

        return null;
    }

    private String resolvePath(String baseDir, String relativePath) {
        String normalizedBase = baseDir.replaceAll("^/|/$", "");
        String fullPath = normalizedBase + "/" + relativePath;

        try {
            URI normalizedUri = new URI(fullPath).normalize();
            String normalized = normalizedUri.getPath().replaceAll("^/|/$", "");

            if (!normalized.startsWith(normalizedBase + "/")) {
                normalized = normalizedBase + "/" + normalized;
            }

            return normalized;
        } catch (Exception e) {
            return fullPath;
        }
    }


    private static class ClassPathInput implements LSInput {
        private InputStream inputStream;
        private String publicId;
        private String systemId;
        private String baseURI;
        private String encoding;

        public ClassPathInput(String publicId, String systemId, String baseURI, InputStream inputStream) {
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