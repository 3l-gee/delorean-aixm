package com.delorean.aixm.core.xml;

import java.io.InputStream;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.log.LogLevel;

public class XMLBindingFactory<ROOT, FEATURE> {
        protected final Class<ROOT> rootClass;
        protected final Class<FEATURE> featureClass;
        protected final Class<?> CoreResourceAnchorsClass;
        protected final Class<?> AIXMResourceAnchorsClass;
        protected final Schema schema;
        protected final SchemaFactory schemaFactory;


    public XMLBindingFactory(Class<ROOT> root, Class<FEATURE> feature, String path, Class<?> CoreResourceAnchorsClass, Class<?> AIXMResourceAnchorsClass) {
        this.rootClass = root;
        this.featureClass = feature;
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        this.schemaFactory.setResourceResolver(new ResourceResolver("schema", AIXMResourceAnchorsClass));
        this.schema = getSchemaFromPath(path, this.schemaFactory);
    }

    public Schema getSchema() {
        return this.schema;
    }

    public Class<ROOT> getRootClass() {
        return this.rootClass;
    }

    public Class<FEATURE> getFeatureClass() {
        return this.featureClass;
    }

    public Class<?> getCoreResourceAnchorsClass() {
        return this.CoreResourceAnchorsClass;
    }

    public Class<?> getAIXMResourceAnchorsClass() {
        return this.AIXMResourceAnchorsClass;
    }

    public XmlBindingService<ROOT, FEATURE> createXMLBinding() {
        return new XmlBindingService<>(
            this.getSchema(), 
            this.getRootClass(), 
            this.getFeatureClass(), 
            this.getCoreResourceAnchorsClass(), 
            this.getAIXMResourceAnchorsClass());
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
            ConsoleLogger.error("Failed to load XML Schema from path: " + path + " - " + e.getMessage());
            return null;
        }
    }
}