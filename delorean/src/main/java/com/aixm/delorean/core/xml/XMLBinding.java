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

public class XMLBinding<T, X> {
    private final String version;
    private final Class<T> root;
    private final Class<X> feature;
    private JAXBContext context;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;
    private SchemaFactory schemaFactory;
    private Schema schema;

    public XMLBinding(XMLConfig xmlConfig, Class<T> root, Class<X> feature) {
        this.version = xmlConfig.getVersion();
        this.schema = xmlConfig.getSchema();
        this.root = root;
        this.feature = feature;
        try {
            this.context = JAXBContext.newInstance(root);
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

    public String getVersion() {
        return this.version;
    }

    public Unmarshaller getUnmarshaller() {
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


    public T, X unmarshal(String path) {
        try (InputStream xmlStream = new FileInputStream(path)) {
            Object unmarshalledObject = this.unmarshaller.unmarshal(xmlStream);

            if (unmarshalledObject instanceof JAXBElement<?>) {
                JAXBElement<?> rootElement = (JAXBElement<?>) unmarshalledObject;

                // Check if T is of type AIXM 5.1.1 or 5.2
                if (com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType.class.isInstance(rootElement.getValue())) {
                    JAXBElement<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType> aixm5_1_1Element = (JAXBElement<com.aixm.delorean.core.schema.a5_1_1.aixm.message.AIXMBasicMessageType>) rootElement;
                    ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled <" + aixm5_1_1Element.getDeclaredType().getName() + "> / : " + aixm5_1_1Element.getValue().getHasMember().size() + " members");
                    return (T) rootElement.getValue();

                } else if (com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType.class.isInstance(rootElement.getValue())) {
                    JAXBElement<com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType> aixm5_2Element = (JAXBElement<com.aixm.delorean.core.schema.a5_2.aixm.message.AIXMBasicMessageType>) rootElement;
                    ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled <" + aixm5_2Element.getDeclaredType().getName() + "> / " + aixm5_2Element.getValue().getHasMember().size() + " members");
                    return (T) rootElement.getValue();
                } else {
                    ConsoleLogger.log(LogLevel.ERROR, "Unknown AIXM version : " + rootElement.getValue().getClass().getName());
                }
            } else {
                ConsoleLogger.log(LogLevel.ERROR, "Unsuccessfully unmarshalled : Unknown root element type " + unmarshalledObject.getClass().getName());
            }

        } catch (JAXBException e) {
            ConsoleLogger.log(LogLevel.ERROR, "JAXB exception during unmarshalling");
            e.printStackTrace();

        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "General exception during unmarshalling");
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

