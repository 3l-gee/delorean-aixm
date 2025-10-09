package com.aixm.delorean.core.gis.helper;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractCurveSegmentType;
import com.aixm.delorean.core.org.gml.v_3_2.ArcByBulgeType;
import com.aixm.delorean.core.org.gml.v_3_2.ArcByCenterPointType;
import com.aixm.delorean.core.org.gml.v_3_2.ArcStringByBulgeType;
import com.aixm.delorean.core.org.gml.v_3_2.ArcStringType;
import com.aixm.delorean.core.org.gml.v_3_2.BSplineType;
import com.aixm.delorean.core.org.gml.v_3_2.BezierType;
import com.aixm.delorean.core.org.gml.v_3_2.ArcType;
import com.aixm.delorean.core.org.gml.v_3_2.CircleByCenterPointType;
import com.aixm.delorean.core.org.gml.v_3_2.CircleType;
import com.aixm.delorean.core.org.gml.v_3_2.ClothoidType;
import com.aixm.delorean.core.org.gml.v_3_2.CubicSplineType;
import com.aixm.delorean.core.org.gml.v_3_2.CurveType;
import com.aixm.delorean.core.org.gml.v_3_2.GeodesicStringType;
import com.aixm.delorean.core.org.gml.v_3_2.GeodesicType;
import com.aixm.delorean.core.org.gml.v_3_2.LineStringSegmentType;
import com.aixm.delorean.core.org.gml.v_3_2.OffsetCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.PointType;

import jakarta.xml.bind.JAXBElement;

import com.aixm.delorean.core.gis.exception.MalformedGeometryException;
import com.aixm.delorean.core.gis.type.DeloreanCurveType;
import com.aixm.delorean.core.gis.type.DeloreanPointType;
import com.aixm.delorean.core.gis.type.LinestringSegment;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

public class CurveGmlHelper {
    
    public static <T extends DeloreanCurveType> T parseGMLCurve(CurveType curve, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // Sanity Check
        if (curve == null) {
            throw new IllegalArgumentException("<gml:CurveType> cannot be null.");
        }

        if (curve.getSegments() == null) {
            throw new IllegalArgumentException("<gml:CurveType> Content <gml:segments> can not be null.");
        }

        if (curve.getSrsName() == null) {
            throw new IllegalArgumentException("<gml:CurveType> must specify an srsName");
        }

        for (JAXBElement<? extends AbstractCurveSegmentType> segment : curve.getSegments().getAbstractCurveSegment()) {
            if (segment.getValue() == null) {

            } else if (segment.getValue() instanceof ArcByBulgeType) {
                throw new IllegalArgumentException("AIXM-RULE-1A3EC2 : ArcByBulgeType is not supported");

            } else if (segment.getValue().getClass().equals(ArcByCenterPointType.class) || segment.getValue().getClass().equals(CircleByCenterPointType.class)) {


            } else if (segment.getValue().getClass().equals(ArcStringByBulgeType.class)) {
                throw new IllegalArgumentException("AIXM-RULE-1A3EC1 : ArcStringByBulgeType is not supported");

            } else if (segment.getValue().getClass().equals(ArcStringType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : ArcStringType is not supported");

            } else if (segment.getValue().getClass().equals(ArcType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : ArcType (extension of ArcStringType) is not supported");

            } else if (segment.getValue().getClass().equals(BSplineType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC4 : BSplineType is not supported");

            } else if (segment.getValue().getClass().equals(BezierType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC5 : BezierType is not supported");

            } else if (segment.getValue().getClass().equals(CircleType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : CircleType (extension of ArcType) is not supported");

            } else if (segment.getValue().getClass().equals(ClothoidType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC7 : ClothoidType is not supported");

            } else if (segment.getValue().getClass().equals(CubicSplineType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC9 : CubicSplineType is not supported");

            } else if (segment.getValue().getClass().equals(GeodesicStringType.class) || segment.getValue().getClass().equals(GeodesicType.class)) {


            } else if (segment.getValue().getClass().equals(LineStringSegmentType.class)) {
 

            } else if (segment.getValue().getClass().equals(OffsetCurveType.class)) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC6 : OffsetCurveType is not supported");

            } else {
                throw new IllegalArgumentException("Unsupported type " + element.getValue().getClass().getName());
            }
        }

        return segment;

        // C. carry the AbstractGMLType attributes futrher

    }

    public static DeloreanArcType parseArcByCenterPoint(ArcByCenterPointType value, String srsName, long counter) {

    }


    public static DeloreanGeodesicType parseGeodesic(GeodesicStringType value, String srsName, long counter) {

    }

    public static <T extends CurveType> printGMLCurve(DeloreanCurveType curve, Class<T> targetType) {
        
        // Sanity Check

        // A. Coordinates printing

        // B. carry the AbstractGMLType attributes futrher

    }
}
