package com.aixm.delorean.core.xml;

import java.io.InputStream;
import java.net.URI;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

public class ResourceResolver implements LSResourceResolver {

        private final String xsdDirectory;

        ResourceResolver(String xsdDirectory) {
            this.xsdDirectory = xsdDirectory;
        }

        @Override
        public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {

            if (systemId == null) {
                return null;
            }

            String resolvedPath = resolvePath(xsdDirectory, systemId);
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resolvedPath);

            if (inputStream != null) {
                return new ClassPathInput(inputStream, publicId, systemId);
            }

            return null;
        }

        private String resolvePath(String baseDir, String relativePath) {
            String normalizedBase = baseDir.replaceAll("^/|/$", "");
            String fullPath = normalizedBase + "/" + relativePath;
            try {
                URI normalizedUri = new URI(fullPath).normalize();
                return normalizedUri.getPath().replaceAll("^/|/$", ""); 
            } catch (Exception e) {
                 return fullPath;
            }
        }
    }