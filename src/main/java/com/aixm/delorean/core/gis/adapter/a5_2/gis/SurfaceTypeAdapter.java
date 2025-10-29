package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.a5_2.DeloreanSurfaceType;
import com.aixm.delorean.core.schema.a5_2.aixm.SurfaceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class SurfaceTypeAdapter extends XmlAdapter<SurfaceType, DeloreanSurfaceType> {

    @Override
    public DeloreanSurfaceType unmarshal(SurfaceType value) throws Exception {
        String featureType = value.getClass().toString();
        String featureId = "<unknown>";

        try {
            if (value != null && value.getId() != null) {
                featureId = value.getId();
            }

            // Parse GML geometry and CRS
            DeloreanSurfaceType result = SurfaceGmlHelper.parseGMLSurface(value, DeloreanSurfaceType.class);
            
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
    public SurfaceType marshal(DeloreanSurfaceType value) throws Exception {
        String featureType = value.getClass().toString();
        String table = "surface";
        String schema = "gml";
        Long featureId = null;

        try {
            if (value != null && value.getHjid() != null) {
                featureId = value.getHjid();
            }

            // Print GML geometry and CRS
            // ElevatedSurfaceType result = SurfaceGmlHelper.printGMLSurface(value, ElevatedSurfaceType.class);
            SurfaceType result = new SurfaceType();
            
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
