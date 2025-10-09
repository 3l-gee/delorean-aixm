package com.aixm.delorean.core.gis.adapter.a5_2.gis;

import com.aixm.delorean.core.gis.type.a5_2.DeloreanElevatedCurveType;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.schema.a5_2.aixm.ElevatedCurveType;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class ElevatedCurveTypeAdapter extends XmlAdapter<ElevatedCurveType, DeloreanElevatedCurveType> {
    
    @Override
    public DeloreanElevatedCurveType unmarshal(ElevatedCurveType value) throws Exception {
        try {
            // ParsedPoint attributes = PointGmlHelper.parseGMLPoint(value);
            // GML attributes
            // DeloreanElevatedPointType result = (DeloreanElevatedPointType)attributes.gml;
            DeloreanElevatedCurveType result = new DeloreanElevatedCurveType();

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

            ConsoleLogger.log(LogLevel.INFO, "unmarshalled ElevatedCurveType :" + value.getId() + " : " + result.getId());
            return result;

        } catch (Exception e) {
            throw new Exception("Error unmarshalling ElevatedPointType at :" + value.getId(), e);
        }
    }

    @Override
    public ElevatedCurveType marshal(DeloreanElevatedCurveType value) throws Exception {
        try {
            return new ElevatedCurveType();
        } catch (Exception e) {
            throw e;
        }
    }
}
