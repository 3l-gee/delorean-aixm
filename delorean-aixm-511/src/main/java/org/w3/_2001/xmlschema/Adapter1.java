
package org.w3._2001.xmlschema;

import java.time.OffsetDateTime;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, OffsetDateTime>
{


    public OffsetDateTime unmarshal(String value) {
        return (com.aixm.delorean.core.time.adapter.XMLGregorianCalendarAdapter.unmarshal(value));
    }

    public String marshal(OffsetDateTime value) {
        return (com.aixm.delorean.core.time.adapter.XMLGregorianCalendarAdapter.marshal(value));
    }

}
