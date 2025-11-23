
package com.aixm.delorean.aixm511.schema;

import com.aixm.delorean.core.gis.type.a5_1_1.AixmElevatedPointType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, AixmElevatedPointType>
{


    public AixmElevatedPointType unmarshal(String value) {
        return new AixmElevatedPointType(value);
    }

    public String marshal(AixmElevatedPointType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
