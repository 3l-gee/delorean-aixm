package com.aixm.delorean.aixm511.gis.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.aixm511.gis.type.AixmElevatedSurfaceType;
import com.aixm.delorean.aixm511.schema.ElevatedSurfaceType;


public class ElevatedSurfaceTypeAdapter extends XmlAdapter<ElevatedSurfaceType, AixmElevatedSurfaceType> {
    
    @Override
    public AixmElevatedSurfaceType unmarshal(ElevatedSurfaceType value) throws Exception {
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
            AixmElevatedSurfaceType result = SurfaceGmlHelper.parseGMLSurface(value, AixmElevatedSurfaceType.class);
            
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
    public ElevatedSurfaceType marshal(AixmElevatedSurfaceType value) throws Exception {
        if (value == null) {
            return null;
        }
        String featureType = value.getClass().toString();
        String table = "elevated_surface";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }

            // Print GML geometry and CRS
            ElevatedSurfaceType result = SurfaceGmlHelper.printGMLSurface(value, ElevatedSurfaceType.class);
            
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
