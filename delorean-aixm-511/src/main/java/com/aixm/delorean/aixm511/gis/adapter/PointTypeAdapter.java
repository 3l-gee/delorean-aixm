package com.aixm.delorean.aixm511.gis.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import com.aixm.delorean.core.gis.helper.PointGmlHelper;
import com.aixm.delorean.aixm511.gis.type.AixmPointType;
import com.aixm.delorean.aixm511.schema.aixm.PointType;

public class PointTypeAdapter extends XmlAdapter<PointType, AixmPointType> {
    @Override
    public AixmPointType unmarshal(PointType value) throws Exception {
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
        AixmPointType result = PointGmlHelper.parseGMLPoint(value, AixmPointType.class);
        
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
    public PointType marshal(AixmPointType value) throws Exception {
        if (value == null) {
            return null;
        }
        String featureType = value.getClass().toString();
        String table = "point";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }

            // Print GML geometry and CRS
            PointType result = PointGmlHelper.printGMLPoint(value, PointType.class);

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