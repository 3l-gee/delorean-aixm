
package com.aixm.delorean.aixm511.schema;

import com.aixm.delorean.core.gis.type.a5_1_1.AixmPointType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, AixmPointType>
{


    public AixmPointType unmarshal(String value) {
        return new AixmPointType(value);
    }

    public String marshal(AixmPointType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
