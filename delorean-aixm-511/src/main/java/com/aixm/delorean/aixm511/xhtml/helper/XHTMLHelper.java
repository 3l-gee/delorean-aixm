package com.aixm.delorean.aixm511.xhtml.helper;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.InputSource;


public class XHTMLHelper{

    private static final DocumentBuilderFactory DOCUMENT_BUILDER_FACTORY;
    private static final TransformerFactory TRANSFORMER_FACTORY;

    static {
        DOCUMENT_BUILDER_FACTORY = DocumentBuilderFactory.newInstance();
        DOCUMENT_BUILDER_FACTORY.setNamespaceAware(true);
        DOCUMENT_BUILDER_FACTORY.setExpandEntityReferences(false);
        DOCUMENT_BUILDER_FACTORY.setXIncludeAware(false);
        try {
            DOCUMENT_BUILDER_FACTORY.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception ignored) {}
        TRANSFORMER_FACTORY = TransformerFactory.newInstance();
    }

    public static String parseXhtml (List<Element> xhtml) throws Exception {
        if (xhtml == null || xhtml.isEmpty()) {
            throw new IllegalArgumentException("Input list is null or empty");
        }

        StringWriter writer = new StringWriter();
        Transformer transformer = TRANSFORMER_FACTORY.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "no");

        for (Element element : xhtml) {
            transformer.transform(new DOMSource(element), new StreamResult(writer));
        }

        return writer.toString();
    }

    public static List<Element> printXhtml (String stringXhtml) throws Exception {
        if (stringXhtml == null || stringXhtml.isBlank()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        // Parse the XHTML string into DOM elements
        DocumentBuilder builder = DOCUMENT_BUILDER_FACTORY.newDocumentBuilder();
        Document doc = builder.parse(new InputSource(new StringReader("<wrapper>" + stringXhtml + "</wrapper>")));

        NodeList nodeList = doc.getDocumentElement().getChildNodes();
        List<Element> elements = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element element) {
                elements.add(element);
            }
        }

        return elements;
    }
}