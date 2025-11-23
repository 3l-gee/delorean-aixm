
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, DeloreanTimeSliceType>
{


    public DeloreanTimeSliceType unmarshal(String value) {
        return new DeloreanTimeSliceType(value);
    }

    public String marshal(DeloreanTimeSliceType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
