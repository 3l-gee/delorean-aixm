package com.delorean.aixm.core.xml;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

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
import javax.xml.validation.Validator;
import org.w3c.dom.Document;

import com.delorean.aixm.core.DeloreanUtility;
import com.delorean.aixm.core.inspection.InspectionBindingService;
import com.delorean.aixm.core.inspection.ValidationSeverity;
import com.delorean.aixm.core.inspection.InspectionSource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
                com.delorean.aixm.core.org.gco.v2007.ObjectFactory.class,
                com.delorean.aixm.core.org.gmd.v2007.ObjectFactory.class,
                com.delorean.aixm.core.org.gml.v_3_2.ObjectFactory.class,
                com.delorean.aixm.core.org.gsr.v2007.ObjectFactory.class,
                com.delorean.aixm.core.org.gss.v2007.ObjectFactory.class,
                com.delorean.aixm.core.org.gts.v2007.ObjectFactory.class,
                com.delorean.aixm.core.org.w3.xlink.ObjectFactory.class);

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
            throw new RuntimeException("Failed to initialize XmlBindingService for root class: " + root.getName() + " and feature class: " + feature.getName(), e);
        }
        log.atDebug().setMessage("Initialized XmlBindingService");
        log.atDebug().setMessage("Root class: {}").addArgument(() -> root.getName()).log();
        log.atDebug().setMessage("Feature class: {}").addArgument(() -> feature.getName()).log();
        log.atDebug().setMessage("CoreResourceAnchorsClass: {}").addArgument(() -> CoreResourceAnchorsClass.getName()).log();
        log.atDebug().setMessage("AIXMResourceAnchorsClass: {}").addArgument(() -> AIXMResourceAnchorsClass.getName()).log();
        log.atDebug().setMessage("Schema class: {}").addArgument(() -> schema.toString()).log();
        log.atDebug().setMessage("Context class: {}").addArgument(() -> this.context.toString()).log();
        log.atDebug().setMessage("Unmarshaller class: {}").addArgument(() -> this.unmarshaller.toString()).log();
        log.atDebug().setMessage("Marshaller class: {}").addArgument(() -> this.marshaller.toString()).log();
    }

    public Unmarshaller getUnmarshaller() {
        return this.unmarshaller;
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    public boolean unmarshallerEventHandler(ValidationEvent event) {
        log.atDebug().setMessage("JAXB Validation Event: Severity={}, Message={}, LinkedException={}") .addArgument(() -> event.getSeverity()).addArgument(() -> event.getMessage()).addArgument(() -> event.getLinkedException()).log();
        switch (event.getSeverity()) {
            case ValidationEvent.WARNING:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.WARNING, "JAXB Validation", event);
                break;
            case ValidationEvent.ERROR:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.ERROR, "JAXB Validation", event);
                break;
            case ValidationEvent.FATAL_ERROR:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.FATAL, "JAXB Validation", event);
                break;
            default:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.INFO, "JAXB Validation", event);

        }

        return true;
    }

    public boolean marshallerEventHandler(ValidationEvent event) {
        log.atDebug().setMessage("JAXB Validation Event: Severity={}, Message={}, LinkedException={}") .addArgument(() -> event.getSeverity()).addArgument(() -> event.getMessage()).addArgument(() -> event.getLinkedException()).log();
        switch (event.getSeverity()) {
            case ValidationEvent.WARNING:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.WARNING, "JAXB Validation", event);
                break;
            case ValidationEvent.ERROR:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.ERROR, "JAXB Validation", event);
                break;
            case ValidationEvent.FATAL_ERROR:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.FATAL, "JAXB Validation", event);
                break;
            default:
                InspectionBindingService.recordEvent(InspectionSource.JAXB, ValidationSeverity.INFO, "JAXB Validation", event);

        }

        return true;
    }

    public boolean saxInspect(Object object) {
        log.atDebug().setMessage("Sax inspection of object: {}").addArgument(() -> object.getClass().getName()).log();
        if (this.schema == null) {
            throw new IllegalStateException("Cannot validate object because no XML Schema is set for this XmlBindingService.");
        }

        try {
            JAXBSource source = new JAXBSource(this.context, object);
            Validator validator = this.schema.newValidator();
            validator.setErrorHandler(new org.xml.sax.ErrorHandler() {
                @Override
                public void warning(org.xml.sax.SAXParseException e) {
                    InspectionBindingService.recordEvent(InspectionSource.SAX, ValidationSeverity.WARNING, "SAX Validation", e);
                }
                @Override
                public void error(org.xml.sax.SAXParseException e) {
                    InspectionBindingService.recordEvent(InspectionSource.SAX, ValidationSeverity.ERROR, "SAX Validation", e);
                }
                @Override
                public void fatalError(org.xml.sax.SAXParseException e) {
                    InspectionBindingService.recordEvent(InspectionSource.SAX, ValidationSeverity.FATAL, "SAX Validation", e);
                }
            });

        validator.validate(source);
        return true;
        } catch (Exception e) {
            throw new RuntimeException("SAX inspection failed for object of type: " + object.getClass().getName(), e);
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
    public ROOT unmarshal(InputStream xmlStream, String description) {
        log.atDebug().setMessage("Unmarshalling XML stream into ROOT class: {}").addArgument(() -> this.rootClass.getName()).log();
        // Unmarshal the XML content from the InputStream
        Object unmarshalledObject;
        try {
            unmarshalledObject = this.unmarshaller.unmarshal(xmlStream);
        } catch (JAXBException e) {
            log.error("JAXB exception during unmarshalling : " + e.getMessage());
            if (e.getLinkedException() != null) {
                e.getLinkedException().printStackTrace(); 
            }
            
            e.printStackTrace();
            return null;

        } catch (Exception e) {
            throw new RuntimeException("General exception during unmarshalling: " + e.getMessage(), e);
        }

        // Check if the root element is of type JAXBElement
        JAXBElement<?> rootElement;
        if (unmarshalledObject instanceof JAXBElement<?>) {
            rootElement = (JAXBElement<?>) unmarshalledObject;
        } else {
            throw new RuntimeException("Unknown root element type: " + unmarshalledObject.getClass().getName());
        }

        // Verify if the root element matches the expected type
        JAXBElement<ROOT> aixmElement;
        if (this.rootClass.isInstance(rootElement.getValue())) {
            aixmElement = (JAXBElement<ROOT>) rootElement;
            ROOT result = (ROOT) aixmElement.getValue();

            // Dynamically set the description/file name using reflection if provided
            if (description != null && result != null) {
                try {
                    Method method = result.getClass().getMethod("setDeloreanDescription", String.class);
                    method.invoke(result, description);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException("Method setDeloreanDescription(String) not found in class: " + result.getClass().getName(), e);
                } catch (Exception e) {
                    throw new RuntimeException("Error invoking setDeloreanDescription(String) on class: " + result.getClass().getName(), e);
                }
            }

            return result;

        } else {
            throw new RuntimeException("Inconsistent AIXM unmarshalling for: " + rootElement.getValue().getClass().getName());
        }
    }
    
    public void marshal(ROOT record, FileOutputStream outputStream, Class<ROOT> clazz, QName qName) {
        log.atDebug().setMessage("Marshalling record of type: {} with QName: {}").addArgument(() -> clazz.getName()).addArgument(() -> qName.toString()).log();
        if (record == null) {
            throw new RuntimeException("Cannot marshal a null record of type: " + clazz.getName());
        }
        if (qName == null) {
            throw new RuntimeException("Cannot marshal with a null QName for type: " + clazz.getName());
        }
        if (outputStream == null) {
            throw new RuntimeException("Cannot marshal to a null OutputStream for type: " + clazz.getName());
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
            throw new RuntimeException("JAXB exception during marshalling: " + e.getMessage(), e);
        
        } catch (Exception e) {
            throw new RuntimeException("General exception during marshalling: " + e.getMessage(), e);
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

