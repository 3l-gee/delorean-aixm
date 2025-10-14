package com.aixm.delorean.core.gis.helper;

import com.aixm.delorean.core.org.gml.v_3_2.AbstractCurveSegmentType;
import com.aixm.delorean.core.org.gml.v_3_2.AngleType;
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
import com.aixm.delorean.core.org.gml.v_3_2.LengthType;
import com.aixm.delorean.core.org.gml.v_3_2.LineStringSegmentType;
import com.aixm.delorean.core.org.gml.v_3_2.OffsetCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.PointType;
import com.aixm.delorean.core.util.AngleUom;
import com.aixm.delorean.core.util.DistanceUom;

import jakarta.xml.bind.JAXBElement;

import com.aixm.delorean.core.gis.exception.MalformedGeometryException;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.Pos;
import com.aixm.delorean.core.gis.type.SegmentType;
import com.aixm.delorean.core.gis.type.LinestringSegment;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.gis.type.Arc;

public class CurveGmlHelper {
    
    public static <T extends CurveType> T parseGMLCurve(CurveType curve, Class<T> targetType) {
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

            } else if (segment.getValue() instanceof ArcByCenterPointType || segment.getValue() instanceof CircleByCenterPointType) {


            } else if (segment.getValue() instanceof ArcStringByBulgeType) {
                throw new IllegalArgumentException("AIXM-RULE-1A3EC1 : ArcStringByBulgeType is not supported");

            } else if (segment.getValue() instanceof ArcStringType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : ArcStringType is not supported");

            } else if (segment.getValue() instanceof ArcType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : ArcType (extension of ArcStringType) is not supported");

            } else if (segment.getValue() instanceof BSplineType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC4 : BSplineType is not supported");

            } else if (segment.getValue() instanceof BezierType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC5 : BezierType is not supported");

            } else if (segment.getValue() instanceof CircleType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : CircleType (extension of ArcType) is not supported");

            } else if (segment.getValue() instanceof ClothoidType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC7 : ClothoidType is not supported");

            } else if (segment.getValue() instanceof CubicSplineType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC9 : CubicSplineType is not supported");

            } else if (segment.getValue() instanceof GeodesicStringType || segment.getValue() instanceof GeodesicType) {


            } else if (segment.getValue() instanceof LineStringSegmentType) {
 

            } else if (segment.getValue() instanceof OffsetCurveType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC6 : OffsetCurveType is not supported");

            } else {
                throw new IllegalArgumentException("Unsupported type " + segment.getValue().getClass().getName());
            }
        }

        return segment;

        // C. carry the AbstractGMLType attributes futrher

    }

    public static Arc parseArcByCenterPoint(ArcByCenterPointType value, String geometrySrsName, long counter) {

        // Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> cannot be null.");
        }

        if (value.getPos() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos> can not be null.");
        }

        if (value.getRadius() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:radius> can not be null.");
        }

        if (geometrySrsName != null && value.getPos().getSrsName() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> or <gml:pos> must specify an srsName.");
        }

        if (value instanceof CircleByCenterPointType){
            if (value.getStartAngle() != null || value.getEndAngle() != null) {
                throw new IllegalArgumentException("<gml:CircleByCenterPointType> must not specify <gml:startAngle> or <gml:endAngle>.");
            }

        } else if (value instanceof ArcByCenterPointType){
            if (value.getStartAngle() == null) {
                throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:startAngle> can not be null.");
            }

            if (value.getEndAngle() == null) {
                throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:endAngle> can not be null.");
            }

            if (value.getStartAngle().getUom() == null) {
                throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:startAngle> must specify a uom.");
            }

            if (value.getEndAngle().getUom() == null) {
                throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:endAngle> must specify a uom.");
            }
        }

        Arc result = new Arc();

        // A. SRS consistency
        String posSrsName = value.getPos() != null ? value.getPos().getSrsName() : null;
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

        // B. coordinates parsing
        String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPos(), inverse);
        Pos resultPos = new Pos();
        resultPos.setValue(geomWkt);
        resultPos.setSrsName(srsName);
        result.setPos(resultPos);

        // C. Attributes parsing

        if (value instanceof CircleByCenterPointType){
            result.setSegmentType(SegmentType.CIRCLE);

            return result;

        } else if (value instanceof ArcByCenterPointType){
            result.setSegmentType(SegmentType.ARC);

            LengthType radius = value.getRadius();
            Double radiusValue = radius.getValue();
            String radiusUom = radius.getUom();

            result.setRadius(radiusValue);
            result.setRadiusUom(DistanceUom.fromSymbol(radiusUom));

            AngleType startAngle = value.getStartAngle();
            Double startAngleValue = startAngle.getValue();
            String startAngleUom = startAngle.getUom();

            result.setStartAngle(startAngleValue);
            result.setStartAngleUom(AngleUom.fromSymbol(startAngleUom));


            AngleType endAngle = value.getEndAngle();
            Double endAngleValue = endAngle.getValue();
            String endAngleUom = endAngle.getUom();
            
            result.setEndAngle(endAngleValue);
            result.setEndAngleUom(AngleUom.fromSymbol(endAngleUom));

            return result;

        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }
    }


    public static GeodesicType parseGeodesic(GeodesicStringType value, String srsName, long counter) {

    }

    public static <T extends CurveType> printGMLCurve(CurveType curve, Class<T> targetType) {
        
        // Sanity Check

        // A. Coordinates printing

        // B. carry the AbstractGMLType attributes futrher

    }
}
