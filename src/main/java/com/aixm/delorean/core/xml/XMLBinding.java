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
import jakarta.xml.bind.ValidationEventLocator;

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
            // this.unmarshaller.setSchema(schema);
            
            this.marshaller = this.context.createMarshaller();
            this.marshaller.setSchema(this.schema);
            this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
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
                    System.err.println("[JAXB VALIDATION EVENT]");
                    System.err.println("Severity: " + severity);
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
                    }

                    // OPTIONAL: print a short cause summary instead of full stack
                    if (event.getLinkedException() != null) {
                        Throwable cause = event.getLinkedException();
                        System.err.println("Cause  : " + cause.getClass().getSimpleName() + 
                                        " - " + cause.getMessage());
                    }

                    System.err.println("═══════════════════════════════════════════");

                    // return true to continue after validation errors
                    return true;
                }
            });

            // Optional: remove excessive debug output
            System.clearProperty("jaxb.debug");
            System.clearProperty("eclipselink.logging.level");
            System.clearProperty("eclipselink.logging.level.jaxb");

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

