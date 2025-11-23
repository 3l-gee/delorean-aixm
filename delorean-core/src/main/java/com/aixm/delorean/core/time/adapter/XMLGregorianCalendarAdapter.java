package com.aixm.delorean.core.time.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendarAdapter extends XmlAdapter<XMLGregorianCalendar, OffsetDateTime> {

    // ISO 8601 : "yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX]"
    private static final DateTimeFormatter ISO = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withResolverStyle(ResolverStyle.STRICT);

    @Override
    public OffsetDateTime unmarshal(XMLGregorianCalendar value) {    
        if (value == null) {
            return null;
        }

        // XMLGregorianCalendar distinguishes between date, time, and datetime
        if (value.getYear() == DatatypeConstants.FIELD_UNDEFINED ||
            value.getMonth() == DatatypeConstants.FIELD_UNDEFINED ||
            value.getDay() == DatatypeConstants.FIELD_UNDEFINED ||
            value.getHour() == DatatypeConstants.FIELD_UNDEFINED ||
            value.getMinute() == DatatypeConstants.FIELD_UNDEFINED) {
            throw new IllegalArgumentException("Invalid ISO 8601 datetime: " + value.toString());
        }
        
        String text = value.toXMLFormat();

        try {
            return OffsetDateTime.parse(text, ISO);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid ISO 8601 datetime format or value: " + text, e);
        }
    }

    @Override
    public XMLGregorianCalendar marshal(OffsetDateTime value) throws javax.xml.datatype.DatatypeConfigurationException {
        if (value == null) {
            return null;
        }

        // Get a reference to the factory
        DatatypeFactory factory = DatatypeFactory.newInstance();
        
        // Convert the ZoneOffset (e.g., Z) to minutes for XMLGregorianCalendar
        int timezoneOffsetInMinutes = value.getOffset().getTotalSeconds() / 60;

        // Use the comprehensive constructor
        // newXMLGregorianCalendar(year, month, day, hour, minute, second, millisecond, timezone)
        return factory.newXMLGregorianCalendar(
                value.getYear(),
                value.getMonthValue(),
                value.getDayOfMonth(),
                value.getHour(),
                value.getMinute(),
                value.getSecond(),
                value.getNano() / 1_000_000, // Convert nanoseconds to milliseconds
                timezoneOffsetInMinutes
        );
    }
}
