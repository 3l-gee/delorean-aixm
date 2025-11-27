package com.aixm.delorean.aixm511.time.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.aixm.delorean.aixm511.time.helper.XMLGregorianCalendarHelper;

public class XMLGregorianCalendarAdapter extends XmlAdapter<XMLGregorianCalendar, OffsetDateTime> {

    // ISO 8601 : "yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX]"
    @Override
    public OffsetDateTime unmarshal(XMLGregorianCalendar value) {    
        if (value == null) {
            return null;
        }

        return XMLGregorianCalendarHelper.parseXMLGregorianCalendar(value);

    }

    @Override
    public XMLGregorianCalendar marshal(OffsetDateTime value) throws javax.xml.datatype.DatatypeConfigurationException {
        if (value == null) {
            return null;
        }

        return XMLGregorianCalendarHelper.printXMLGregorianCalendar(value);

    }
}
