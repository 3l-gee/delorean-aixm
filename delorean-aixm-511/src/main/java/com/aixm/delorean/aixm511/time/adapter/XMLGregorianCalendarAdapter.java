package com.aixm.delorean.aixm511.time.adapter;

import com.aixm.delorean.core.time.helper.XMLGregorianCalendarHelper;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.OffsetDateTime;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendarAdapter extends XmlAdapter<XMLGregorianCalendar, OffsetDateTime> {

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
