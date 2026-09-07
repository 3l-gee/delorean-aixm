package com.delorean.aixm.core.xml;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.time.LocalTime;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
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
import com.delorean.aixm.core.log.ConsoleLogger;
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
        InputStream xmlStream = path.toLowerCase().endsWith(".zip") 
            ? DeloreanUtility.absPathZipToInputStream(path) 
            : DeloreanUtility.absPathToInputStream(path);

        if (xmlStream == null) return null;

        long featureCount = 0;
        long timeSliceCount = 0;

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            // Disable DTDs/external entities for speed & security
            factory.setProperty(XMLInputFactory.SUPPORT_DTD, false); 
            XMLStreamReader reader = factory.createXMLStreamReader(xmlStream);

            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamConstants.START_ELEMENT) {
                    String localName = reader.getLocalName();
                    
                    // Matches elements under message:hasMember
                    if ("hasMember".equals(localName)) {
                        featureCount++;
                    } 
                    // Matches any aixm:timeSlice element
                    else if ("timeSlice".equals(localName)) {
                        timeSliceCount++;
                    }
                }
            }
            reader.close();
            return "F: " + featureCount + " / T: " + timeSliceCount;

        } catch (Exception e) {
            log.error("Error reading XML stats", e);
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

        Object unmarshalledObject;
        try (BufferedInputStream bufferedStream = new BufferedInputStream(xmlStream, 65536)) {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            factory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
            XMLStreamReader xmlReader = factory.createXMLStreamReader(bufferedStream);

            unmarshalledObject = this.unmarshaller.unmarshal(xmlReader);
                if (!(unmarshalledObject instanceof JAXBElement<?> rootElement)) {
                throw new IllegalStateException("Unexpected root element type: " + 
                    (unmarshalledObject != null ? unmarshalledObject.getClass().getName() : "null"));
            }

            if (!this.rootClass.isInstance(rootElement.getValue())) {
                throw new IllegalStateException("Inconsistent type: expected " + 
                    this.rootClass.getName() + " but got " + rootElement.getValue().getClass().getName());
            }

            @SuppressWarnings("unchecked")
            ROOT result = (ROOT) rootElement.getValue();

            // Avoid reflection: require ROOT classes to implement a simple interface
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

        } catch (JAXBException e) {
            log.error("Failed to unmarshal XML stream: {}", e.getMessage(), e);
            throw new RuntimeException("Unmarshalling error", e);
        } catch (XMLStreamException e) {
            throw new RuntimeException("XML error during unmarshalling", e);
        } catch (IOException  e) {
            throw new RuntimeException("I/O error during unmarshalling", e);
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

        try (BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream, 65536)) {
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            XMLStreamWriter standardWriter = factory.createXMLStreamWriter(bufferedStream, "UTF-8");
            JAXBElement<ROOT> rootElement = new JAXBElement<>(qName, this.rootClass, record);
            this.marshaller.marshal(rootElement, standardWriter);
            standardWriter.flush();
            standardWriter.close();

        } catch (JAXBException e) {
            throw new RuntimeException("JAXB exception during marshalling: " + e);
        } catch (Exception e) {
            throw new RuntimeException("General exception during marshalling: " + e.getMessage(), e);
        }
    }

    // public void marshal(ROOT record, FileOutputStream outputStream, Class<ROOT> clazz, QName qName) {
    //     log.atDebug().setMessage("Marshalling record of type: {} with QName: {}").addArgument(() -> clazz.getName()).addArgument(() -> qName.toString()).log();
    //     if (record == null) {
    //         throw new RuntimeException("Cannot marshal a null record of type: " + clazz.getName());
    //     }
    //     if (qName == null) {
    //         throw new RuntimeException("Cannot marshal with a null QName for type: " + clazz.getName());
    //     }
    //     if (outputStream == null) {
    //         throw new RuntimeException("Cannot marshal to a null OutputStream for type: " + clazz.getName());
    //     }

    //     List<?> originalMembers = null;
    //     Method setHasMemberMethod = null;

    //     System.out.print("start : " + LocalTime.now());

    //     try (BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream, 65536)) {
    //         XMLOutputFactory factory = XMLOutputFactory.newInstance();
    //         XMLStreamWriter standardWriter = factory.createXMLStreamWriter(bufferedStream, "UTF-8");

    //         // 1. Fetch the hasMember collection dynamically without compile-time schema dependencies
    //         Method getHasMemberMethod = record.getClass().getMethod("getHasMember");
    //         originalMembers = (List<?>) getHasMemberMethod.invoke(record);
    //         ConsoleLogger.startProgress("Marshalling", originalMembers.size());

    //         if (originalMembers != null && !originalMembers.isEmpty()) {
    //             setHasMemberMethod = record.getClass().getMethod("setHasMember", List.class);
    //             setHasMemberMethod.invoke(record, new ArrayList<>());
    //         }

    //         System.out.print("Step 1 : " + LocalTime.now());

    //         // 2. Open Root Element
    //         standardWriter.writeStartDocument("UTF-8", "1.0");

    //         String prefix = (qName.getPrefix() != null && !qName.getPrefix().isEmpty()) ? qName.getPrefix() : "aixm";
    //         String nsUri = qName.getNamespaceURI();
    //         standardWriter.writeStartElement(prefix, qName.getLocalPart(), nsUri);

    //         standardWriter.writeNamespace("gml", "http://www.opengis.net/gml/3.2");

    //         String gmlId = invokeGetterString(record, "getId");
    //         if (gmlId != null) {
    //             standardWriter.writeAttribute("gml", "http://www.opengis.net/gml/3.2", "id", gmlId);
    //         }

    //         // AbstractAIXMMessageType: aggregationType
    //         Object aggregationType = invokeGetter(record, "getAggregationType");
    //         if (aggregationType != null) {
    //             standardWriter.writeAttribute("aggregationType", aggregationType.toString());
    //         }

    //         // metaDataProperty (List)
    //         List<?> metaDataProperties = (List<?>) invokeGetter(record, "getMetaDataProperty");
    //         marshalChildElements(metaDataProperties, standardWriter);

    //         // description
    //         Object description = invokeGetter(record, "getDescription");
    //         marshalChildElement(description, standardWriter);

    //         // descriptionReference
    //         Object descriptionReference = invokeGetter(record, "getDescriptionReference");
    //         marshalChildElement(descriptionReference, standardWriter);

    //         // identifier
    //         Object identifier = invokeGetter(record, "getIdentifier");
    //         marshalChildElement(identifier, standardWriter);

    //         // name (List)
    //         List<?> names = (List<?>) invokeGetter(record, "getName");
    //         marshalChildElements(names, standardWriter);

    //         // boundedBy
    //         Object boundedBy = invokeGetter(record, "getBoundedBy");
    //         marshalChildElement(boundedBy, standardWriter);

    //         // location (JAXBElement wrapper)
    //         Object locationObj = invokeGetter(record, "getLocation");
    //         marshalJaxbElementOrObject(locationObj, standardWriter);

    //         // validTime
    //         Object validTime = invokeGetter(record, "getValidTime");
    //         marshalChildElement(validTime, standardWriter);

    //         // history (JAXBElement wrapper)
    //         Object historyObj = invokeGetter(record, "getHistory");
    //         marshalJaxbElementOrObject(historyObj, standardWriter);

    //         // dataSource
    //         Object dataSource = invokeGetter(record, "getDataSource");
    //         marshalChildElement(dataSource, standardWriter);

    //         // dataSourceReference
    //         Object dataSourceReference = invokeGetter(record, "getDataSourceReference");
    //         marshalChildElement(dataSourceReference, standardWriter);

    //         // messageMetadata
    //         Object messageMetadata = invokeGetter(record, "getMessageMetadata");
    //         marshalChildElement(messageMetadata, standardWriter);

    //         // Flush StAX writer to guarantee header & properties are fully written to stream
    //         standardWriter.flush();

    //         System.out.print("Step 2 : " + LocalTime.now());


    //         // 3. Process members in chunks and write directly to the underlying buffered output stream
    //         if (originalMembers != null && !originalMembers.isEmpty()) {
    //             int chunkSize = 2000;
    //             for (int i = 0; i < originalMembers.size(); i += chunkSize) {
    //                 List<?> chunk = originalMembers.subList(i, Math.min(i + chunkSize, originalMembers.size()));
    //                 List<String> xmlSnippets = marshallChunks(chunk);

    //                 for (String xmlSnippet : xmlSnippets) {
    //                     bufferedStream.write(xmlSnippet.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    //                 }
    //                 bufferedStream.flush();

    //                 ConsoleLogger.incrementProgress(chunkSize);

    //             }
    //         }

    //         System.out.print("Step 3 : " + LocalTime.now());


    //         // 4. Close Root Element via standardWriter
    //         standardWriter.writeEndElement();
    //         standardWriter.writeEndDocument();

    //         System.out.print("Step 4 : " + LocalTime.now());


    //         // 5. Clean Flush and Closure
    //         standardWriter.flush();
    //         bufferedStream.flush();
    //         standardWriter.close();

    //         System.out.print("Step 5 : " + LocalTime.now());

            
    //     } catch (Exception e) {
    //         throw new RuntimeException("Exception during parallel AIXM marshalling: " + e.getMessage(), e);
    //     } finally {
    //         // Restore original members to the root object
    //         if (originalMembers != null && setHasMemberMethod != null) {
    //             try {
    //                 setHasMemberMethod.invoke(record, originalMembers);
    //             } catch (Exception ignored) {}
    //         }
    //     }
        
    //     ConsoleLogger.stopProgress();

    // }

    private List<String> marshallChunks(List<?> chunk) throws JAXBException {
        Marshaller threadMarshaller = this.context.createMarshaller();
        threadMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        threadMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);

        List<String> xmlChunks = new ArrayList<>(chunk.size());
        for (Object member : chunk) {
            StringWriter sw = new StringWriter();
            threadMarshaller.marshal(member, sw);
            xmlChunks.add(sw.toString());
        }

        return xmlChunks;
    }

    private void marshalChildElement(Object obj, XMLStreamWriter writer) throws Exception {
        if (obj == null) return;
        Marshaller m = this.context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        m.marshal(obj, writer);
    }

    private void marshalChildElements(List<?> list, XMLStreamWriter writer) throws Exception {
        if (list == null || list.isEmpty()) return;
        Marshaller m = this.context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        for (Object item : list) {
            if (item != null) {
                m.marshal(item, writer);
            }
        }
    }

    private void marshalJaxbElementOrObject(Object obj, XMLStreamWriter writer) throws Exception {
        if (obj == null) return;
        Marshaller m = this.context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        if (obj instanceof JAXBElement) {
            m.marshal((JAXBElement<?>) obj, writer);
        } else {
            m.marshal(obj, writer);
        }
    }

    private Object invokeGetter(Object target, String methodName) {
        try {
            Method method = target.getClass().getMethod(methodName);
            return method.invoke(target);
        } catch (Exception e) {
            return null;
        }
    }

    private String invokeGetterString(Object target, String methodName) {
        Object result = invokeGetter(target, methodName);
        return result != null ? result.toString() : null;
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

