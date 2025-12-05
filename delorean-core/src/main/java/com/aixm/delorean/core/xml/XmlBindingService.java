package com.aixm.delorean.core.xml;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.ValidationEvent;
import jakarta.xml.bind.ValidationEventHandler;
import jakarta.xml.bind.ValidationEventLocator;

public class XmlBindingService<R, F> {
    private final Class<R> root;
    private final Class<F> feature;
    private JAXBContext context;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;
    private SchemaFactory schemaFactory;
    private Schema schema;

    public XmlBindingService(Schema schema, Class<R> root, Class<F> feature) {
        this.schema = schema;
        this.root = root;
        this.feature = feature;
        try {
            this.context = JAXBContext.newInstance(root);

            try (FileOutputStream logFile = new FileOutputStream("context.xml.log", true)) {
                logFile.write(("JAXBContext created with classes: " + this.context.toString() + System.lineSeparator()).getBytes());
                logFile.write(("Schema used for validation: " + this.schema.toString() + System.lineSeparator()).getBytes());
            } catch (Exception e) {
                ConsoleLogger.log(LogLevel.ERROR, "Failed to write JAXBContext creation log: " + e.getMessage());
            }

            this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            this.unmarshaller = this.context.createUnmarshaller();
            this.unmarshaller.setSchema(schema);
            this.unmarshaller.setEventHandler(this::handleEvent);

            this.marshaller = this.context.createMarshaller();
            this.marshaller.setSchema(schema);
            this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            this.marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
            this.marshaller.setEventHandler(this::handleEvent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Unmarshaller getUnmarshaller() {
        return this.unmarshaller;
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    public boolean handleEvent(ValidationEvent event) {
        String severity;
        switch (event.getSeverity()) {
            case ValidationEvent.WARNING:
                severity = "WARNING";
                break;
            case ValidationEvent.ERROR:
                severity = "ERROR";
                break;
            case ValidationEvent.FATAL_ERROR:
                severity = "FATAL";
                break;
            default:
                severity = "UNKNOWN";
        }

        System.err.println("═══════════════════════════════════════════");
        System.err.println("[JAXB VALIDATION EVENT]" + " - " + severity);
        System.err.println("Message : " + event.getMessage());

        ValidationEventLocator locator = event.getLocator();
        if (locator != null) {
            System.err.println("Location:");
            if (locator.getLineNumber() != -1)
                System.err.println("  Line:   " + locator.getLineNumber());
            if (locator.getColumnNumber() != -1)
                System.err.println("  Column: " + locator.getColumnNumber());
            if (locator.getURL() != null)
                System.err.println("  URL:    " + locator.getURL());
            if (locator.getObject() != null)
                System.err.println("  Object: " + locator.getObject().getClass().getName());
            if (locator.getNode() != null) {
                System.err.println("  Node:   " + locator.getNode().getNodeName());
            }

        }

        System.err.println("═══════════════════════════════════════════");

        // return true to continue after validation errors
        return true;
    }


    @SuppressWarnings("unchecked")
    public R unmarshal(InputStream xmlStream) {

        // Unmarshal the XML content from the InputStream
        Object unmarshalledObject;
        try {
            unmarshalledObject = this.unmarshaller.unmarshal(xmlStream);
        } catch (JAXBException e) {
            ConsoleLogger.log(LogLevel.ERROR, "JAXB exception during unmarshalling : " + e.getMessage());
            return null;

        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "General exception during unmarshalling : " + e.getMessage());
            return null;
        }

        // Check if the root element is of type JAXBElement
        JAXBElement<?> rootElement;
        if (unmarshalledObject instanceof JAXBElement<?>) {
            rootElement = (JAXBElement<?>) unmarshalledObject;
        } else {
            ConsoleLogger.log(LogLevel.ERROR, "Unsuccessfully unmarshalled : Unknown root element type " + unmarshalledObject.getClass().getName());
            return null;
        }

        // Verify if the root element matches the expected type
        JAXBElement<R> aixmElement;
        if (this.root.isInstance(rootElement.getValue())) {
            aixmElement = (JAXBElement<R>) rootElement;
            ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled <" + aixmElement.getDeclaredType().getName() + ">");
            return (R) aixmElement.getValue();

        } else {
            ConsoleLogger.log(LogLevel.ERROR, "Inconsistent AIXM unmarshalling for: " + rootElement.getValue().getClass().getName());
        }

        return null;
    }
    
    
    public void marshal(R record, FileOutputStream outputStream, Class<R> clazz, QName qName) {
        if (record == null) {
            ConsoleLogger.log(LogLevel.ERROR, "Cannot marshal a null record of type: " + clazz.getName());
            return;
        }
        if (qName == null) {
            ConsoleLogger.log(LogLevel.ERROR, "Cannot marshal with a null QName for type: " + clazz.getName());
            return;
        }
        if (outputStream == null) {
            ConsoleLogger.log(LogLevel.ERROR, "Cannot marshal to a null OutputStream for type: " + clazz.getName());
            return;
        }

        try {
            JAXBElement<R> rootElement = new JAXBElement<>(qName, this.root, record);
            this.marshaller.marshal(rootElement, outputStream);
            ConsoleLogger.log(LogLevel.INFO, "Successfully marshalled <" + clazz.getName() + ">");
        } catch (JAXBException e) {
            ConsoleLogger.log(LogLevel.ERROR, "JAXB exception during marshalling: " + e.getMessage());
        
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error during marshalling: " + e.getMessage());

        }
    }
}

