
package com.aixm.delorean.aixm511.schema;

import com.aixm.delorean.core.gis.type.a5_1_1.AixmElevatedSurfaceType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, AixmElevatedSurfaceType>
{


    public AixmElevatedSurfaceType unmarshal(String value) {
        return new AixmElevatedSurfaceType(value);
    }

    public String marshal(AixmElevatedSurfaceType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
