package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import com.aixm.delorean.core.gis.helper.PointGmlHelper;
import com.aixm.delorean.core.gis.type.a5_2.AixmElevatedPointType;
import com.aixm.delorean.core.schema.a5_2.aixm.ElevatedPointType;

public class ElevatedPointTypeAdapter extends XmlAdapter<ElevatedPointType, AixmElevatedPointType> {
    
    @Override
    public AixmElevatedPointType unmarshal(ElevatedPointType value) throws Exception {
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
            AixmElevatedPointType result = PointGmlHelper.parseGMLPoint(value, AixmElevatedPointType.class);
            
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
    public ElevatedPointType marshal(AixmElevatedPointType value) throws Exception {
        if (value == null) {
            return null;
        }
        String featureType = value.getClass().toString();
        String table = "elevated_point";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }
            
            // Print GML geometry and CRS
            ElevatedPointType result = PointGmlHelper.printGMLPoint(value, ElevatedPointType.class);

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