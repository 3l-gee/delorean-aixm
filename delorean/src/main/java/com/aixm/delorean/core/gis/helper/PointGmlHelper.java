package com.aixm.delorean.core.gis.helper;

import java.lang.IllegalArgumentException;
import java.util.List;

import javax.xml.namespace.QName;

import com.aixm.delorean.core.org.gml.v_3_2.PointType;
import com.aixm.delorean.core.util.HrefHelper;

import jakarta.xml.bind.JAXBElement;

import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionType;
import com.aixm.delorean.core.org.gml.v_3_2.PointPropertyType;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;

public class PointGmlHelper {


    public static <T extends Point> T parseGMLPoint(PointType point, Class<T> targetType) {
        return parseGMLPoint(point, targetType, null);
    }

    public static <T extends Point> T parseGMLPoint (PointType point, Class<T> targetType, String parentSrsName) {
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

        if (point.getSrsName() == null && parentSrsName == null) {
            throw new IllegalArgumentException("<gml:PointType> or <gml:pos> srsName cannot be null.");
        }

        // B. SRS consistency
        String geometrySrsName = point.getSrsName() != null ? point.getSrsName() : parentSrsName;
        String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(srsName);

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

    public static PointPropertyType printPointPropertyType(GmlPointType point) {
        // A. Sanity Check
        if (point == null) {
            throw new IllegalArgumentException("<GmlPointType> cannot be null.");
        }

        if (point.getGeometricType() == null) {
            throw new IllegalArgumentException("<GmlPointType> Content <geometricType> must be 'REF' to build a PointPropertyType.");
        }

        PointPropertyType pointProperty = new PointPropertyType();
        if (point.getGeometricType() == GeometricType.REF) {

            if (point.getGeometricProperty() == null) {
                throw new IllegalArgumentException("<GmlPointType> Content <geometricProperty> can not be null.");
            }

            pointProperty.setHref(HrefHelper.printHref(point.getGeometricProperty()));
            pointProperty.setSimpleLinkTitle(point.getGeometricProperty().getTitle());
            return pointProperty;

        } else if (point.getGeometricType() == GeometricType.GML) {
            PointType pointObj = printGMLPoint(point, PointType.class);
            JAXBElement<PointType> pointElement = new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "Point"), PointType.class, pointObj);
            pointProperty.setPoint(pointElement);
            return pointProperty;

        } else {
            throw new IllegalArgumentException("Unsupported GeometricType " + point.getGeometricType());
        }
    }

    public static <T extends PointType> T printGMLPoint(Point point, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // Sanity Check
        if (point == null) {
            throw new IllegalArgumentException("<DeloreanPointType> cannot be null.");
        }

        if (point.getPos() == null) {
            throw new IllegalArgumentException("<DeloreanPointType> Content <pos> can not be null.");
        }

        if (point.getPos().getValue() == null) {
            throw new IllegalArgumentException("<DeloreanPointType> Content <pos> must have a value.");
        }

        if (point.getPos().getSrsName() == null) {
            throw new IllegalArgumentException("<DeloreanPointType> Content <pos> must specify an srsName.");
        }

        // A. Coordinates printing
        String geomWkt = point.getPos().getValue();

        List<String> srsNames = point.aggregateSrsNames();
        
        if (!srsNames.isEmpty()) {
            String firstSrsName = srsNames.get(0);
            for (String srsName : srsNames) {
                if (!srsName.equals(firstSrsName)) {
                    throw new IllegalArgumentException("All segments must have the same SRS name. Found differing SRS names.");
                }
            }
        }

        DirectPositionType pos = DirectPositionHelper.printDirectPosition(geomWkt);
        String epsgCode = SRSValidationHelper.printSrsName(srsNames.get(0));

        // B. carry the AbstractGMLType attributes futrher
        result.setId(point.getId());
        result.setDescription(point.getDescription());
        result.setIdentifier(point.getIdentifier());
        result.setPos(pos);
        result.setSrsName(epsgCode);

        return result;
    }
}