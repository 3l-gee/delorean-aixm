
package com.aixm.delorean.aixm511.schema;

import com.aixm.delorean.core.gis.type.a5_1_1.AixmElevatedCurveType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, AixmElevatedCurveType>
{


    public AixmElevatedCurveType unmarshal(String value) {
        return new AixmElevatedCurveType(value);
    }

    public String marshal(AixmElevatedCurveType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
