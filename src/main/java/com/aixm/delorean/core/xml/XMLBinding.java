package com.aixm.delorean.core.xml;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
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

public class XMLBinding<T> {
    private JAXBContext context;
    private final Class<T> structure;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;
    private SchemaFactory schemaFactory;
    private Schema schema;

    public XMLBinding(XMLConfig xmlConfig, Class<T> structure) {
        this.schema = xmlConfig.getSchema();
        this.structure = structure;
        try {
            this.context = JAXBContext.newInstance(structure);
            this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            this.unmarshaller = this.context.createUnmarshaller();
            this.marshaller = this.context.createMarshaller();
            this.marshaller.setSchema(this.schema);
            this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            ValidationHandler();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Unmarshaller getUnMarshaller() {
        return this.unmarshaller;
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    private void ValidationHandler() {
        try {
            this.unmarshaller.setSchema(this.schema);
            this.unmarshaller.setEventHandler(new ValidationEventHandler() {
                @Override
                public boolean handleEvent(ValidationEvent event) {
                    System.err.println("═══════════════════════════════════════════");
                    System.err.println("[JAXB VALIDATION EVENT]");
                    System.err.println("Severity: " + event.getSeverity());
                    System.err.println("Message : " + event.getMessage());
                    if (event.getLinkedException() != null) {
                        System.err.println("Linked exception:");
                        event.getLinkedException().printStackTrace(System.err);
                    }
                    if (event.getLocator() != null) {
                        System.err.println("Location:");
                        System.err.println("  Line:   " + event.getLocator().getLineNumber());
                        System.err.println("  Column: " + event.getLocator().getColumnNumber());
                        System.err.println("  Node:   " + event.getLocator().getNode());
                        System.err.println("  URL:    " + event.getLocator().getURL());
                    }
                    System.err.println("═══════════════════════════════════════════");
                    return true;
                }
            });

            System.setProperty("jaxb.debug", "true");
            System.setProperty("eclipselink.logging.level", "FINEST");
            System.setProperty("eclipselink.logging.level.jaxb", "FINEST");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T unmarshal(String path) {
        try (InputStream xmlStream = new FileInputStream(path)) {
            Object unmarshalledObject = this.unmarshaller.unmarshal(xmlStream);

            if (unmarshalledObject instanceof JAXBElement<?>) {
                JAXBElement<T> rootElement = (JAXBElement<T>) unmarshalledObject;
                ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled");
                return rootElement.getValue();
            } else {
                ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled");
                return (T) unmarshalledObject;
            }
        } catch (JAXBException e) {
            ConsoleLogger.log(LogLevel.ERROR, "Unsuccessfully unmarshalled");
            System.err.println("JAXBException while unmarshalling");
            e.printStackTrace();
            if (e.getLinkedException() != null) {
                System.err.println("Linked Exception:");
                e.getLinkedException().printStackTrace(System.err);
            }
        } catch (Exception e) {
            System.err.println("General exception during unmarshalling");
            e.printStackTrace();
        }

        return null;
    }
    

    public void marshal(T record, String path, Class<T> clazz) {
        try (FileOutputStream outputStream = new FileOutputStream(new File(path))) {
            //TODO for now this is easier
            this.marshaller.setSchema(null);

            // Create JAXBElement with the provided class type
            QName qName = new QName("http://www.aixm.aero/schema/5.1/message", "AIXMBasicMessage");
            JAXBElement<T> rootElement = new JAXBElement<>(qName, clazz, record);

            // Marshal the JAXBElement to the output stream
            this.marshaller.marshal(rootElement, outputStream); 

            ConsoleLogger.log(LogLevel.INFO, "Successfully marshalled");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

