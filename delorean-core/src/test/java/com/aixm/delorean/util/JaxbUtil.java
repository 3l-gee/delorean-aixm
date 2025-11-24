package com.aixm.delorean.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class JaxbUtil {

    @SuppressWarnings("unchecked")
    public static <T> T loadFromXml(String xml, Class<T> type) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Object result = unmarshaller.unmarshal(new StringReader(xml));
        if (result instanceof JAXBElement<?>) {
            return (T) ((JAXBElement<?>) result).getValue();
        }
        return type.cast(result);
    }

    public static <T> String printToXml(T object, Class<T> type) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter writer = new StringWriter();

        if (!type.isAnnotationPresent(jakarta.xml.bind.annotation.XmlRootElement.class)) {
            String localName = type.getSimpleName().replace("Type", "");
            QName qName = new QName("http://www.opengis.net/gml/3.2", localName);   
            JAXBElement<T> root = new JAXBElement<>(qName, type, object);
            marshaller.marshal(root, writer);
        } else {
            marshaller.marshal(object, writer);
        }

        return writer.toString().trim();
    }
    
}
