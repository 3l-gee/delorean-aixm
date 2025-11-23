
package com.aixm.delorean.aixm511.schema;

import com.aixm.delorean.core.gis.type.a5_1_1.AixmCurveType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, AixmCurveType>
{


    public AixmCurveType unmarshal(String value) {
        return new AixmCurveType(value);
    }

    public String marshal(AixmCurveType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
