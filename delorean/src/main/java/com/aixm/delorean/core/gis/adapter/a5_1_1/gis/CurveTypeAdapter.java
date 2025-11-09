package com.aixm.delorean.core.gis.adapter.a5_1_1.gis;

import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.core.gis.type.a5_1_1.AixmCurveType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.CurveType;


import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class CurveTypeAdapter extends XmlAdapter<CurveType, AixmCurveType> {

    @Override
    public AixmCurveType unmarshal(CurveType value) throws Exception {
        String featureType = value.getClass().toString();
        String featureId = "<unknown>";

        try {
            if (value != null && value.getId() != null) {
                featureId = value.getId();
            }
            
            // Parse GML geometry and CRS
            AixmCurveType result = CurveGmlHelper.parseGMLCurve(value, AixmCurveType.class);
            
            // --- Copy AIXM-specific attributes ---
            result.setHorizontalAccuracy(value.getHorizontalAccuracy());
            result.setAnnotation(value.getAnnotation());

            return result;

        } catch (Exception e) {
            throw new RuntimeException(
                "Error during unmarshalling of : " + featureType + " with id : " + featureId + " : " + e.getMessage(),
                e
            );
        }
    }

    @Override
    public CurveType marshal(AixmCurveType value) throws Exception {
        String featureType = value.getClass().toString();
        String table = "curve";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }

            // Print GML geometry and CRS
            CurveType result = CurveGmlHelper.printGMLCurve(value, CurveType.class);

            // --- Copy AIXM-specific attributes ---
            result.setHorizontalAccuracy(value.getHorizontalAccuracy());
            result.setAnnotation(value.getAnnotation());

            return result;

        } catch (Exception e) {
            throw new RuntimeException(
                "Error during marshalling of : " + featureType + " stored at : " + table + " / " + schema + " with id : " + featureId + " : " + e.getMessage(),
                e
            );
        }
    }
}
