package com.aixm.delorean.util;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlRootElement(name = "XMLGregorianCalendar", namespace = "http://www.opengis.net/gml/3.2")
public class XMLGregorianCalendarWrapper {

    @XmlValue
    public XMLGregorianCalendar value;
}

