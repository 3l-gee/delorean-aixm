package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import com.aixm.delorean.core.gis.type.a5_2.DeloreanSurfaceType;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.schema.a5_2.aixm.SurfaceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class SurfaceTypeAdapter extends XmlAdapter<SurfaceType, DeloreanSurfaceType> {

    @Override
    public DeloreanSurfaceType unmarshal(SurfaceType value) throws Exception {
        try {
            // ParsedPoint attributes = PointGmlHelper.parseGMLPoint(value);
            // GML attributes
            // DeloreanElevatedPointType result = (DeloreanElevatedPointType)attributes.gml;
            DeloreanSurfaceType result = new DeloreanSurfaceType();

            // Geometry attributes
            // result.setGeomWkt(attributes.geomWkt);
            // result.setSrsName(attributes.srsName);

            // AIXM attributes
            result.setHorizontalAccuracy(value.getHorizontalAccuracy());
            result.setAnnotation(value.getAnnotation());
            result.setExtension(value.getExtension());

            ConsoleLogger.log(LogLevel.INFO, "unmarshalled SurfaceType :" + value.getId() + " : " + result.getId());
            return result;

        } catch (Exception e) {
            throw new Exception("Error unmarshalling ElevatedPointType at :" + value.getId(), e);
        }
    }

    @Override
    public SurfaceType marshal(DeloreanSurfaceType value) throws Exception {
        try {
            return new SurfaceType();
        } catch (Exception e) {
            throw e;
        }
    }
}
