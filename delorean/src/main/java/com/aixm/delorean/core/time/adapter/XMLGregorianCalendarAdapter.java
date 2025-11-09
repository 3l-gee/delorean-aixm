package com.aixm.delorean.core.time.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendarAdapter extends XmlAdapter<XMLGregorianCalendar, LocalDateTime> {

    // ISO 8601 format e.g. 2025-11-09T17:09:32
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    @Override
    public LocalDateTime unmarshal(XMLGregorianCalendar value) {    
        if (value == null) {
            return null;
        }

        LocalDateTime result = LocalDateTime.parse(value.toString(), FORMATTER);
        result.parse(value.toString(), FORMATTER);
        return result;
    }

    @Override
    public XMLGregorianCalendar marshal(LocalDateTime value) throws javax.xml.datatype.DatatypeConfigurationException {
        if (value == null) {
            return null;
        }
        XMLGregorianCalendar result = DatatypeFactory.newInstance().newXMLGregorianCalendar(value.toString());
        return result;
    }
}
