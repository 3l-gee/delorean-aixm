package com.aixm.delorean.core.xml;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Path;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractFeatureType;    

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.ValidationEvent;
import jakarta.xml.bind.ValidationEventHandler;
import jakarta.xml.bind.ValidationEventLocator;
import jakarta.xml.bind.SchemaOutputResolver;

public class XMLBinding<T, X> {
    private final Class<T> root;
    private final Class<X> feature;
    private JAXBContext context;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;
    private SchemaFactory schemaFactory;
    private Schema schema;

    public XMLBinding(Schema schema, Class<T> root, Class<X> feature, Class<?> rootObjectFactory, Class<?> featureObjectFactory) {
        this.schema = schema;
        this.root = root;
        this.feature = feature;
        try {
            this.context = JAXBContext.newInstance(
                root);

            SchemaOutputResolver schemaOutputResolver = new SchemaOutputResolver() {
                @Override
                public javax.xml.transform.Result createOutput(String namespaceUri, String suggestedFileName) throws java.io.IOException {
                    File file = new File("context.xsd");
                    return new javax.xml.transform.stream.StreamResult(file);
                }
            };
            this.context.generateSchema(schemaOutputResolver);

            this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            this.unmarshaller = this.context.createUnmarshaller();
            // this.unmarshaller.setSchema(schema);
            
            this.marshaller = this.context.createMarshaller();
            this.marshaller.setSchema(this.schema);
            this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // Add additional marshaller properties for better data preservation
            this.marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
            ValidationHandler();
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


    @SuppressWarnings("unchecked")
    public T unmarshal(Path path) {
        try (InputStream xmlStream = new FileInputStream(path.toFile())) {
            Object unmarshalledObject = this.unmarshaller.unmarshal(xmlStream);
            JAXBElement<?> rootElement;
            if (unmarshalledObject instanceof JAXBElement<?>) {
                rootElement = (JAXBElement<?>) unmarshalledObject;
            } else {
                ConsoleLogger.log(LogLevel.ERROR, "Unsuccessfully unmarshalled : Unknown root element type " + unmarshalledObject.getClass().getName());
                return null;
            }

            JAXBElement<T> aixmElement;
            if (this.root.isInstance(rootElement.getValue())) {
                aixmElement = (JAXBElement<T>) rootElement;
                ConsoleLogger.log(LogLevel.INFO, "Successfully unmarshalled <" + aixmElement.getDeclaredType().getName() + ">");
                return (T) rootElement.getValue();

            } else {
                ConsoleLogger.log(LogLevel.ERROR, "Inconsistent AIXM unmarshalling for: " + rootElement.getValue().getClass().getName());
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
    
    
    public void marshal(T record, Path path, Class<T> clazz, QName qName) {
        try (FileOutputStream outputStream = new FileOutputStream(path.toFile())) {
            // Don't disable schema validation - keep it for data integrity
            // this.marshaller.setSchema(null);
            
            // Check if the class has @XmlRootElement annotation
            if (clazz.isAnnotationPresent(jakarta.xml.bind.annotation.XmlRootElement.class)) {
                // Direct marshalling for classes with @XmlRootElement
                this.marshaller.marshal(record, outputStream);
            } else {
                // Wrap in JAXBElement for classes without @XmlRootElement
                JAXBElement<T> rootElement = new JAXBElement<>(qName, clazz, record);
                this.marshaller.marshal(rootElement, outputStream);
            }
            
            ConsoleLogger.log(LogLevel.INFO, "Successfully marshalled <" + clazz.getName() + "> to " + path);

        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error during marshalling: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

