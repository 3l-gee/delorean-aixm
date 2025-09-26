
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return new String(value);
    }

    public String marshal(String value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
