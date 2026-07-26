package com.delorean.aixm.core.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import javax.xml.namespace.NamespaceContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DynamicNamespaceContext implements NamespaceContext {

    private final Map<String, String> prefixToUriMap = new HashMap<>();
    private final Map<String, String> uriToPrefixMap = new HashMap<>();

    /**
     * Constructs a NamespaceContext by reading xmlns attributes from the XML root element.
     * @param document The parsed XML Document.
     */
    public DynamicNamespaceContext(Document document) {
        Node root = document.getDocumentElement(); 
        
        if (root != null) {
            NamedNodeMap attributes = root.getAttributes();
            
            for (int i = 0; i < attributes.getLength(); i++) {
                Node attr = attributes.item(i);
                String attrName = attr.getNodeName();
                String namespaceUri = attr.getNodeValue();

                // Look for standard namespace declarations (xmlns:prefix="uri")
                if (attrName.startsWith("xmlns:")) {
                    String prefix = attrName.substring("xmlns:".length());
                    prefixToUriMap.put(prefix, namespaceUri);
                    uriToPrefixMap.put(namespaceUri, prefix);
                } 
                // Handle the default namespace (xmlns="uri")
                else if (attrName.equals("xmlns")) {
                }
            }
        }
    }

    @Override
    public String getNamespaceURI(String prefix) {
        return prefixToUriMap.get(prefix);
    }

    @Override
    public String getPrefix(String namespaceURI) {
        return uriToPrefixMap.get(namespaceURI);
    }

    @Override
    public Iterator<String> getPrefixes(String namespaceURI) {
        return null; 
    }
}