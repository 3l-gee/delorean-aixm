package com.delorean.aixm.core.time.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.delorean.aixm.core.time.helper.XMLGregorianCalendarHelper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XMLGregorianCalendarAdapter extends XmlAdapter<XMLGregorianCalendar, OffsetDateTime> {

    // ISO 8601 : "yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX]"
    @Override
    public OffsetDateTime unmarshal(XMLGregorianCalendar value) {    
        if (value == null) {
            return null;
        }

        log.atDebug().setMessage("Unmarshalling XMLGregorianCalendar into OffsetDateTime: {}").addArgument(value.toString()).log();;
        return XMLGregorianCalendarHelper.parseXMLGregorianCalendar(value);

    }

    @Override
    public XMLGregorianCalendar marshal(OffsetDateTime value) throws javax.xml.datatype.DatatypeConfigurationException {
        if (value == null) {
            return null;
        }
        
        log.atDebug().setMessage("Marshalling OffsetDateTime into XMLGregorianCalendar: {}").addArgument(value.toString()).log();
        return XMLGregorianCalendarHelper.printXMLGregorianCalendar(value);

    }
}
