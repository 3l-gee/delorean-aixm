package com.aixm.delorean.aixm511.gis.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.aixm511.gis.type.AixmElevatedCurveType;
import com.aixm.delorean.aixm511.schema.ElevatedCurveType;

public class ElevatedCurveTypeAdapter extends XmlAdapter<ElevatedCurveType, AixmElevatedCurveType> {
    
    @Override
    public AixmElevatedCurveType unmarshal(ElevatedCurveType value) throws Exception {
        if (value == null) {
            return null;
        }
        String featureType = value.getClass().toString();
        String featureId = "<unknown>";

        try {
            if (value != null && value.getId() != null) {
                featureId = value.getId();
            }
            
            // Parse GML geometry and CRS
            AixmElevatedCurveType result = CurveGmlHelper.parseGMLCurve(value, AixmElevatedCurveType.class);
            
            // --- Copy AIXM-specific attributes ---
            result.setHorizontalAccuracy(value.getHorizontalAccuracy());
            result.setElevation(value.getElevation());
            result.setGeoidUndulation(value.getGeoidUndulation());
            result.setVerticalDatum(value.getVerticalDatum());
            result.setAnnotation(value.getAnnotation());
            result.setExtension(value.getExtension());

            return result;

        } catch (Exception e) {
            throw new RuntimeException(
                "Error during unmarshalling of : " + featureType + " with id : " + featureId + " : " + e.getMessage(),
                e
            );
        }
    }

    @Override
    public ElevatedCurveType marshal(AixmElevatedCurveType value) throws Exception {
        if (value == null) {
            return null;
        }
        String featureType = value.getClass().toString();
        String table = "elevated_curve";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }
            
            // Print GML geometry and CRS
            ElevatedCurveType result = CurveGmlHelper.printGMLCurve(value, ElevatedCurveType.class);

            // --- Copy AIXM-specific attributes ---
            result.setHorizontalAccuracy(value.getHorizontalAccuracy());
            result.setElevation(value.getElevation());
            result.setGeoidUndulation(value.getGeoidUndulation());
            result.setVerticalDatum(value.getVerticalDatum());
            result.setAnnotation(value.getAnnotation());
            result.setExtension(value.getExtension());

            return result;

        } catch (Exception e) {
            throw new RuntimeException(
                "Error during marshalling of : " + featureType + " stored at : " + table + " / " + schema + " with id : " + featureId + " : " + e.getMessage(),
                e
            );
        }
    }
}
