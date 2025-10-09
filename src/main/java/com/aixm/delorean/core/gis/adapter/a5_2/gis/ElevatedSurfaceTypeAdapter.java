package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import com.aixm.delorean.core.gis.type.a5_2.DeloreanElevatedSurfaceType;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.schema.a5_2.aixm.ElevatedSurfaceType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class ElevatedSurfaceTypeAdapter extends XmlAdapter<ElevatedSurfaceType, DeloreanElevatedSurfaceType> {
    
    @Override
    public DeloreanElevatedSurfaceType unmarshal(ElevatedSurfaceType value) throws Exception {
        try {
            // ParsedPoint attributes = PointGmlHelper.parseGMLPoint(value);
            // GML attributes
            // DeloreanElevatedPointType result = (DeloreanElevatedPointType)attributes.gml;
            DeloreanElevatedSurfaceType result = new DeloreanElevatedSurfaceType();

            // Geometry attributes
            // result.setGeomWkt(attributes.geomWkt);
            // result.setSrsName(attributes.srsName);

            // AIXM attributes
            result.setHorizontalAccuracy(value.getHorizontalAccuracy());
            result.setElevation(value.getElevation());
            result.setGeoidUndulation(value.getGeoidUndulation());
            result.setVerticalDatum(value.getVerticalDatum());
            result.setAnnotation(value.getAnnotation());
            result.setExtension(value.getExtension());

            
            ConsoleLogger.log(LogLevel.INFO, "unmarshalled ElevatedSurfaceType :" + value.getId() + " : " + result.getId());
            return result;

        } catch (Exception e) {
            throw new Exception("Error unmarshalling ElevatedPointType at :" + value.getId(), e);
        }
    }

    @Override
    public ElevatedSurfaceType marshal(DeloreanElevatedSurfaceType value) throws Exception {
        try {
            return new ElevatedSurfaceType();
        } catch (Exception e) {
            throw e;
        }
    }
}
