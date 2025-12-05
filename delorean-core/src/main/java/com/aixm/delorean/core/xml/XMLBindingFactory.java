package com.aixm.delorean.core.xml;

import java.io.InputStream;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

public class XMLBindingFactory<T, X> {
        protected final Class<T> root;
        protected final Class<X> feature;
        protected final Schema schema;
        protected final SchemaFactory schemaFactory;
        protected final Class<?> CoreResourceAnchorsClass;
        protected final Class<?> AIXMResourceAnchorsClass;

    public XMLBindingFactory(Class<T> root, Class<X> feature, String path, Class<?> CoreResourceAnchorsClass, Class<?> AIXMResourceAnchorsClass) {
        this.root = root;
        this.feature = feature;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        this.schemaFactory.setResourceResolver(new ResourceResolver("schema", AIXMResourceAnchorsClass));
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

    public Class<?> getCoreResourceAnchorsClass() {
        return this.CoreResourceAnchorsClass;
    }

    public Class<?> getAIXMResourceAnchorsClass() {
        return this.AIXMResourceAnchorsClass;
    }

    public XmlBindingService<T, X> createXMLBinding() {
        return new XmlBindingService<>(this.getSchema(), this.getRoot(), this.getFeature());

    }
    
    private Schema getSchemaFromPath(String path, SchemaFactory schemaFactory) {

        // the schem is expected to be in the target classpath

        InputStream inputStream = AIXMResourceAnchorsClass.getResourceAsStream(path);
        Source schemaSource = new StreamSource(inputStream);
        
        URL resourceUrl = AIXMResourceAnchorsClass.getClassLoader().getResource(path);
        if (resourceUrl != null) {
            schemaSource.setSystemId(resourceUrl.toExternalForm());
        }
        
        try {
            return schemaFactory.newSchema(schemaSource);
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Failed to load XML Schema from path: " + path + " - " + e.getMessage());
            return null;
        }
    }
}