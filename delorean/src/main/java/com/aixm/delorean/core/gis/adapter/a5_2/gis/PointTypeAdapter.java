package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import com.aixm.delorean.core.schema.a5_2.aixm.PointType;
import com.aixm.delorean.core.gis.helper.PointGmlHelper;
import com.aixm.delorean.core.gis.type.a5_2.DeloreanPointType;

public class PointTypeAdapter extends XmlAdapter<PointType, DeloreanPointType> {
    @Override
    public DeloreanPointType unmarshal(PointType value) throws Exception {
        String featureType = value.getClass().toString();
        String featureId = "<unknown>";

        try {
            if (value != null && value.getId() != null) {
                featureId = value.getId();
            }

        // Parse GML geometry and CRS
        DeloreanPointType result = PointGmlHelper.parseGMLPoint(value, DeloreanPointType.class);
        
        // --- Copy AIXM-specific attributes ---
        result.setHorizontalAccuracy(value.getHorizontalAccuracy());
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
    public PointType marshal(DeloreanPointType value) throws Exception {
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