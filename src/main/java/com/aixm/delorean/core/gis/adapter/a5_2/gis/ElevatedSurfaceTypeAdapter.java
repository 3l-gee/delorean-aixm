package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.a5_2.DeloreanElevatedSurfaceType;
import com.aixm.delorean.core.schema.a5_2.aixm.ElevatedSurfaceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class ElevatedSurfaceTypeAdapter extends XmlAdapter<ElevatedSurfaceType, DeloreanElevatedSurfaceType> {
    
    @Override
    public DeloreanElevatedSurfaceType unmarshal(ElevatedSurfaceType value) throws Exception {
        String featureType = value.getClass().toString();
        String featureId = "<unknown>";

        try {
            if (value != null && value.getId() != null) {
                featureId = value.getId();
            }
            // Parse GML geometry and CRS
            DeloreanElevatedSurfaceType result = SurfaceGmlHelper.parseGMLSurface(value, DeloreanElevatedSurfaceType.class);
            
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
    public ElevatedSurfaceType marshal(DeloreanElevatedSurfaceType value) throws Exception {
        String featureType = value.getClass().toString();
        String table = "elevated_surface";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }

            // Print GML geometry and CRS
            // ElevatedSurfaceType result = SurfaceGmlHelper.printGMLSurface(value, ElevatedSurfaceType.class);
            ElevatedSurfaceType result = new ElevatedSurfaceType();
            
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
