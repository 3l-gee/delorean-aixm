package com.aixm.delorean.core.gis.helper;

import java.lang.IllegalArgumentException;
import java.math.BigInteger;

import com.aixm.delorean.core.org.gml.v_3_2.PointType;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;
import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionType;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.Pos;

public class PointGmlHelper {

    public static <T extends Point> T parseGMLPoint (PointType point, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // A. Sanity Check
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

        // B. SRS consistency
        String geometrySrsName = point.getSrsName();
        String posSrsName = point.getPos() != null ? point.getPos().getSrsName() : null;

        String effectiveSrsName;
        if (geometrySrsName != null && posSrsName != null) {
            if (!geometrySrsName.equals(posSrsName)) {
                throw new IllegalArgumentException(String.format(
                    "<gml:PointType> and <gml:pos> must specify the same srsName."));
            }
            // both set, same CRS
            effectiveSrsName = geometrySrsName;
        } else if (geometrySrsName != null) {
            effectiveSrsName = geometrySrsName;
        } else if (posSrsName != null) {
            effectiveSrsName = posSrsName;
        } else {
            throw new IllegalArgumentException("<gml:PointType> or <gml:pos> must specify an srsName.");
        }

        String srsName = SRSValidationHelper.parseSrsName(effectiveSrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(effectiveSrsName);

        // C. coordinates parsing
        String geomWkt = DirectPositionHelper.parseDirectPosition(point.getPos(), inverse);
        Pos resultPos = new Pos();
        resultPos.setValue(geomWkt);
        resultPos.setSrsName(srsName);

 
        // D. carry the AbstractGMLType attributes futrher
        result.setId(point.getId());
        result.setDescription(point.getDescription());
        result.setIdentifier(point.getIdentifier());
        result.setPos(resultPos);


        return result;
    }

    public static <T extends PointType> T printGMLPoint(Point point, Class<T> targetType) {
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
        String geomWkt = point.getPos().getValue();
        String srsName = point.getPos().getSrsName();

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