package com.aixm.delorean.core.xml;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.util.JAXBSource;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.ValidationEvent;
import jakarta.xml.bind.ValidationEventLocator;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Validator;
import org.xml.sax.SAXParseException;
import org.xml.sax.ErrorHandler;
import org.w3c.dom.Document;

import com.aixm.delorean.core.validation.ValidationBindingService;
import com.aixm.delorean.core.validation.ValidationSeverity;
import com.aixm.delorean.core.validation.ValidationSource;
import com.aixm.delorean.core.DeloreanUtility;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;



public class XmlBindingService<ROOT, FEATURE> {
    private final Class<ROOT> rootClass;
    private final Class<FEATURE> featureClass;
    protected final Class<?> CoreResourceAnchorsClass;
    protected final Class<?> AIXMResourceAnchorsClass;
    private JAXBContext context;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;
    private SchemaFactory schemaFactory;
    private Schema schema;

    public XmlBindingService(Schema schema, Class<ROOT> root, Class<FEATURE> feature, Class<?> CoreResourceAnchorsClass, Class<?> AIXMResourceAnchorsClass) {
        this.CoreResourceAnchorsClass = CoreResourceAnchorsClass;
        this.AIXMResourceAnchorsClass = AIXMResourceAnchorsClass;
        this.schema = schema;
        this.rootClass = root;
        this.featureClass = feature;
        try {
            this.context = JAXBContext.newInstance(
                root, 
                feature,
                com.aixm.delorean.core.org.gco.v2007.ObjectFactory.class,
                com.aixm.delorean.core.org.gmd.v2007.ObjectFactory.class,
                com.aixm.delorean.core.org.gml.v_3_2.ObjectFactory.class,
                com.aixm.delorean.core.org.gsr.v2007.ObjectFactory.class,
                com.aixm.delorean.core.org.gss.v2007.ObjectFactory.class,
                com.aixm.delorean.core.org.gts.v2007.ObjectFactory.class,
                com.aixm.delorean.core.org.w3.xlink.ObjectFactory.class);

            this.schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            this.unmarshaller = this.context.createUnmarshaller();
            this.unmarshaller.setSchema(schema);
            this.unmarshaller.setEventHandler(this::unmarshallerEventHandler);

            this.marshaller = this.context.createMarshaller();
            this.marshaller.setSchema(schema);
            this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            this.marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            this.marshaller.setEventHandler(this::marshallerEventHandler);
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

    public boolean unmarshallerEventHandler(ValidationEvent event) {
        switch (event.getSeverity()) {
            case ValidationEvent.WARNING:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.WARNING, "JAXB Validation", event);
                break;
            case ValidationEvent.ERROR:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.ERROR, "JAXB Validation", event);
                break;
            case ValidationEvent.FATAL_ERROR:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.FATAL, "JAXB Validation", event);
                break;
            default:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.INFO, "JAXB Validation", event);

        }

        return true;
    }

    public boolean marshallerEventHandler(ValidationEvent event) {
        switch (event.getSeverity()) {
            case ValidationEvent.WARNING:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.WARNING, "JAXB Validation", event);
                break;
            case ValidationEvent.ERROR:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.ERROR, "JAXB Validation", event);
                break;
            case ValidationEvent.FATAL_ERROR:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.FATAL, "JAXB Validation", event);
                break;
            default:
                ValidationBindingService.recordEvent(ValidationSource.JAXB_VALIDATION, ValidationSeverity.INFO, "JAXB Validation", event);

        }

        return true;
    }

    public boolean saxValidate(Object object) {
        if (this.schema == null) {
            throw new IllegalStateException("Cannot validate object because no XML Schema is set for this XmlBindingService.");
        }

        try {
            JAXBSource source = new JAXBSource(this.context, object);
            Validator validator = this.schema.newValidator();
            validator.setErrorHandler(new org.xml.sax.ErrorHandler() {
                @Override
                public void warning(org.xml.sax.SAXParseException e) {
                    ValidationBindingService.recordEvent(ValidationSource.SAX_VALIDATION, ValidationSeverity.WARNING, "SAX Validation", e);
                }
                @Override
                public void error(org.xml.sax.SAXParseException e) {
                    ValidationBindingService.recordEvent(ValidationSource.SAX_VALIDATION, ValidationSeverity.ERROR, "SAX Validation", e);
                }
                @Override
                public void fatalError(org.xml.sax.SAXParseException e) {
                    ValidationBindingService.recordEvent(ValidationSource.SAX_VALIDATION, ValidationSeverity.FATAL, "SAX Validation", e);
                }
            });

        validator.validate(source);
        return true;
        } catch (Exception e) {
            ConsoleLogger.error("Validation failed", e);
            return false;
        }
    }

    public String statistics(String path) {
        InputStream xmlStream;
        if (path.toLowerCase().endsWith(".zip")) {
            xmlStream = DeloreanUtility.absPathZipToInputStream(path);
        } else {
            xmlStream = DeloreanUtility.absPathToInputStream(path);
        }

        if (xmlStream == null) {
            return null;
        } 

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true); 
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document xmlDocument = builder.parse(xmlStream);

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            
            xpath.setNamespaceContext(new DynamicNamespaceContext(xmlDocument));

            // --- Query 1: count(/message:AIXMBasicMessage/message:hasMember/*) ---
            String query1 = "count(/message:AIXMBasicMessage/message:hasMember/*)";
            Number count1 = (Number) xpath.evaluate(query1, xmlDocument, XPathConstants.NUMBER);
            long featureCount = count1.longValue();

            // --- Query 2: count(//aixm:timeSlice) ---
            String query2 = "count(//aixm:timeSlice)";
            Number count2 = (Number) xpath.evaluate(query2, xmlDocument, XPathConstants.NUMBER);
            long timeSliceCount = count2.longValue();
            
            // 5. Format and return the statistics
            return new String("F: " + featureCount + " / T: " + timeSliceCount);

        } catch (Exception e) {
            e.printStackTrace();
            return "Error processing XML: " + e.getMessage();
        } finally {
             if (xmlStream != null) {
                 try { xmlStream.close(); } catch (Exception e) { /* ignore */ }
             }
        }
    }

    @SuppressWarnings("unchecked")
    public ROOT unmarshal(InputStream xmlStream) {

        // Unmarshal the XML content from the InputStream
        Object unmarshalledObject;
        try {
            unmarshalledObject = this.unmarshaller.unmarshal(xmlStream);
        } catch (JAXBException e) {
            ConsoleLogger.error("JAXB exception during unmarshalling : " + e.getMessage());
            if (e.getLinkedException() != null) {
                e.getLinkedException().printStackTrace(); 
            }
            
            e.printStackTrace();
            return null;

        } catch (Exception e) {
            ConsoleLogger.error("General exception during unmarshalling : " + e.getMessage());
            return null;
        }

        // Check if the root element is of type JAXBElement
        JAXBElement<?> rootElement;
        if (unmarshalledObject instanceof JAXBElement<?>) {
            rootElement = (JAXBElement<?>) unmarshalledObject;
        } else {
            ConsoleLogger.error("Unsuccessfully unmarshalled : Unknown root element type " + unmarshalledObject.getClass().getName());
            return null;
        }

        // Verify if the root element matches the expected type
        JAXBElement<ROOT> aixmElement;
        if (this.rootClass.isInstance(rootElement.getValue())) {
            aixmElement = (JAXBElement<ROOT>) rootElement;
            return (ROOT) aixmElement.getValue();

        } else {
            ConsoleLogger.error("Inconsistent AIXM unmarshalling for: " + rootElement.getValue().getClass().getName());
        }

        return null;
    }
    
    public void marshal(ROOT record, FileOutputStream outputStream, Class<ROOT> clazz, QName qName) {
        if (record == null) {
            ConsoleLogger.error("Cannot marshal a null record of type: " + clazz.getName());
            return;
        }
        if (qName == null) {
            ConsoleLogger.error("Cannot marshal with a null QName for type: " + clazz.getName());
            return;
        }
        if (outputStream == null) {
            ConsoleLogger.error("Cannot marshal to a null OutputStream for type: " + clazz.getName());
            return;
        }

        try {
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            XMLStreamWriter standardWriter = factory.createXMLStreamWriter(outputStream, "UTF-8");
            XMLStreamWriter customWriter = new XMLWriterHelper(standardWriter);
            JAXBElement<ROOT> rootElement = new JAXBElement<>(qName, this.rootClass, record);
            this.marshaller.marshal(rootElement, customWriter);
            customWriter.flush();
            customWriter.close();

        } catch (JAXBException e) {
            ConsoleLogger.error("JAXB exception during marshalling: " + e.getMessage());
        
        } catch (Exception e) {
            ConsoleLogger.error("Error during marshalling: " + e.getMessage());

        }
    }

    @SuppressWarnings("unchecked")
    private ROOT deepCopyMessage(ROOT message) {
        if (message == null) {
            return null;
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(this.rootClass);
            Document doc = DocumentBuilderFactory.newInstance()
                                                .newDocumentBuilder()
                                                .newDocument();
            
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.marshal(message, doc);
            
            // 4. Unmarshall it back out into a clean, detached clone
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (ROOT) unmarshaller.unmarshal(doc);
            
        } catch (Exception e) {
            throw new RuntimeException("DeLorean Engine failed to deep-copy the AIXM message tree structure.", e);
        }
    }
}

