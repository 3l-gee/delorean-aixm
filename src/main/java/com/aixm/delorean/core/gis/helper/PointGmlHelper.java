package com.aixm.delorean.core.gis.helper;

import java.lang.IllegalArgumentException;
import java.math.BigInteger;

import com.aixm.delorean.core.org.gml.v_3_2.PointType;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;
import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionType;
import com.aixm.delorean.core.gis.type.DeloreanPointType;

public class PointGmlHelper {

    public static <T extends DeloreanPointType> T parseGMLPoint (PointType point, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // Sanity Check
        if (point == null) {
            throw new IllegalArgumentException("<gml:PointType> cannot be null.");
        }

        if (point.getPos() == null) {
            throw new IllegalArgumentException("<gml:PointType> Content <gml:pos> can not be null.");
        }

        if (point.getCoordinates() != null) {
            throw new IllegalArgumentException("<gml:PointType> Content <gml:coordinates> is deprecated.");
        }

        if (point.getSrsName() == null && point.getPos().getSrsName() == null) {
            throw new IllegalArgumentException("<gml:PointType> or <gml:pos> must specify an srsName.");
        }

        // A. SRS consistency
        String effectiveSrsName = point.getPos().getSrsName() != null ? point.getPos().getSrsName() : point.getSrsName();
        String srsName = SRSValidationHelper.parseSrsName(effectiveSrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(effectiveSrsName);

        // B. coordinates parsing
        String geomWkt = DirectPositionHelper.parseDirectPosition(point.getPos(), inverse);
 
        // C. carry the AbstractGMLType attributes futrher
        result.setId(point.getId());
        result.setDescription(point.getDescription());
        result.setIdentifier(point.getIdentifier());
        result.setSrsName(srsName);
        result.setGeomWkt(geomWkt);

        return result;
    }

    public static <T extends PointType> T printGMLPoint(DeloreanPointType point, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // Sanity Check
        if (point == null)
            throw new IllegalArgumentException("<DeloreanPointType> cannot be null.");


        // A. Coordinates printing
        String geomWkt = point.getGeomWkt();
        String srsName = point.getSrsName();

        DirectPositionType pos = DirectPositionHelper.printDirectPosition(geomWkt, srsName);
        String epsgCode = SRSValidationHelper.printSrsName(srsName);

        // B. carry the AbstractGMLType attributes futrher
        result.setId(point.getId());
        result.setDescription(point.getDescription());
        result.setIdentifier(point.getIdentifier());
        result.setPos(pos);
        result.setSrsName(epsgCode);

        return result;
    }
}