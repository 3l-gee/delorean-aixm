package com.aixm.delorean.aixm511.gis.adapter;

import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.a5_1_1.AixmSurfaceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SurfaceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class SurfaceTypeAdapter extends XmlAdapter<SurfaceType, AixmSurfaceType> {

    @Override
    public AixmSurfaceType unmarshal(SurfaceType value) throws Exception {
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
            AixmSurfaceType result = SurfaceGmlHelper.parseGMLSurface(value, AixmSurfaceType.class);
            
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
    public SurfaceType marshal(AixmSurfaceType value) throws Exception {
        if (value == null) {
            return null;
        }
        String featureType = value.getClass().toString();
        String table = "surface";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }

            // Print GML geometry and CRS
            SurfaceType result = SurfaceGmlHelper.printGMLSurface(value, SurfaceType.class);
            
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
