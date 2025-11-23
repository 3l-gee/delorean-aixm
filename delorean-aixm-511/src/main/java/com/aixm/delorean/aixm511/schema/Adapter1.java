
package com.aixm.delorean.aixm511.schema;

import com.aixm.delorean.core.gis.type.a5_1_1.AixmSurfaceType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, AixmSurfaceType>
{


    public AixmSurfaceType unmarshal(String value) {
        return new AixmSurfaceType(value);
    }

    public String marshal(AixmSurfaceType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
