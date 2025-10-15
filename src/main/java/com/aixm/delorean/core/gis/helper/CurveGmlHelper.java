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
import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionType;
import com.aixm.delorean.core.org.gml.v_3_2.GeodesicStringType;
import com.aixm.delorean.core.org.gml.v_3_2.GeodesicType;
import com.aixm.delorean.core.org.gml.v_3_2.LengthType;
import com.aixm.delorean.core.org.gml.v_3_2.LineStringSegmentType;
import com.aixm.delorean.core.org.gml.v_3_2.OffsetCurveType;
import com.aixm.delorean.core.org.gml.v_3_2.PointPropertyType;
import com.aixm.delorean.core.org.gml.v_3_2.PointType;
import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionListType;
import com.aixm.delorean.core.util.AngleUom;
import com.aixm.delorean.core.util.DistanceUom;

import jakarta.xml.bind.JAXBElement;

import java.util.List;

import com.aixm.delorean.core.gis.exception.MalformedGeometryException;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.Pos;
import com.aixm.delorean.core.gis.type.PosList;
import com.aixm.delorean.core.gis.type.SegmentType;
import com.aixm.delorean.core.gis.type.LinestringSegment;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.gis.type.Arc;
import com.aixm.delorean.core.gis.type.ContentType;
import com.aixm.delorean.core.gis.type.Geodesic;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.PointProperty;

public class CurveGmlHelper {
    
    public static <T extends Curve> T parseGMLCurve(CurveType curve, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }

        // A. Sanity Check
        if (curve == null) {
            throw new IllegalArgumentException("<gml:CurveType> cannot be null.");
        }

        if (curve.getSegments() == null) {
            throw new IllegalArgumentException("<gml:CurveType> Content <gml:segments> can not be null.");
        }

        if (curve.getSrsName() == null) {
            throw new IllegalArgumentException("<gml:CurveType> must specify an srsName");
        }

        // B. SRS consistency
        String geometrySrsName = curve.getSrsName() != null ? curve.getSrsName() : null;

        // B. Segments parsing

        for (JAXBElement<? extends AbstractCurveSegmentType> segment : curve.getSegments().getAbstractCurveSegment()) {
            if (segment.getValue() == null) {

            } else if (segment.getValue() instanceof ArcByBulgeType) {
                throw new IllegalArgumentException("AIXM-RULE-1A3EC2 : ArcByBulgeType is not supported");

            } else if (segment.getValue() instanceof ArcByCenterPointType || segment.getValue() instanceof CircleByCenterPointType) {
                ArcByCenterPointType arcByCenterPoint = (ArcByCenterPointType) segment.getValue();
                Arc arc = parseArcByCenterPoint(arcByCenterPoint, geometrySrsName);
                result.getSegments().add(arc);

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
                GeodesicStringType geodesicString = (GeodesicStringType) segment.getValue();
                Geodesic geodesic = parseGeodesic(geodesicString, geometrySrsName);
                result.getSegments().add(geodesic);

            } else if (segment.getValue() instanceof LineStringSegmentType) {
                LineStringSegmentType lineStringSegment = (LineStringSegmentType) segment.getValue();
                LineString lineString = parseLineString(lineStringSegment, geometrySrsName);
                result.getSegments().add(lineString);

            } else if (segment.getValue() instanceof OffsetCurveType) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC6 : OffsetCurveType is not supported");

            } else {
                throw new IllegalArgumentException("Unsupported type " + segment.getValue().getClass().getName());
            }
        }



        // C. carry the AbstractGMLType attributes futrher
        result.setId(curve.getId());
        result.setDescription(curve.getDescription());
        result.setIdentifier(curve.getIdentifier());

        return result;

    }

    public static Arc parseArcByCenterPoint(ArcByCenterPointType value, String geometrySrsName) {

        // A. Sanity Check
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

        // B. SRS consistency
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

        // C. coordinates parsing
        String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPos(), inverse);
        Pos resultPos = new Pos();
        resultPos.setValue(geomWkt);
        resultPos.setSrsName(srsName);
        result.setPos(resultPos);

        // D. Attributes parsing

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

    public static LineString parseLineString(LineStringSegmentType value, String geometrySrsName) {

        // A. Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:LineStringSegmentType> cannot be null.");
        }

        if (value.getPosList() == null && value.getPosOrPointPropertyOrPointRep() == null && value.getPosOrPointPropertyOrPointRep().isEmpty()) {
            throw new IllegalArgumentException("<gml:LineStringSegmentType> Content <gml:posList> or <gml:pos> or <gml:pointProperty> can not be both null or empty.");
        }

        if (value.getPosList() != null && value.getPosOrPointPropertyOrPointRep() != null && !value.getPosOrPointPropertyOrPointRep().isEmpty()) {
            throw new IllegalArgumentException("<gml:LineStringSegmentType> Content <gml:posList> and <gml:pos> cannot be both set.");
        }

        LineString result = new LineString();
        result.setSegmentType(SegmentType.LINE);

    
        if (value.getPosList() != null) {
            // B. SRS consistency
            String posSrsName = value.getPosList().getSrsName() != null ? value.getPosList().getSrsName() : null;

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
            String geomWkt = DirectPositionHelper.parseDirectPositionList(value.getPosList(),inverse);
            PosList resultPosList = new PosList();
            resultPosList.setValue(geomWkt);
            resultPosList.setSrsName(srsName);
            result.setPosList(resultPosList);
            result.setContentType(ContentType.POSLIST);

            return result;

        } else if (value.getPosOrPointPropertyOrPointRep() != null && !value.getPosOrPointPropertyOrPointRep().isEmpty()) {
            List<JAXBElement<?>> geometricPositionGroup = value.getPosOrPointPropertyOrPointRep();
            result.setContentType(ContentType.POINTPROPERTY);

            for (JAXBElement<?> obj : geometricPositionGroup) {
                if (obj.getValue() instanceof DirectPositionType) {
                    DirectPositionType directPosition = (DirectPositionType) obj.getValue();

                    // B. SRS consistency
                    String posSrsName = directPosition.getSrsName() != null ? directPosition.getSrsName() : null;
                    String effectiveSrsName;
                    if (geometrySrsName != null && posSrsName != null) {
                        if (!geometrySrsName.equals(posSrsName)) {
                            throw new IllegalArgumentException(String.format(
                                "<gml:CurveType> and <gml:pos> must specify the same srsName."));
                        }
                        // both set, same CRS
                        effectiveSrsName = geometrySrsName;
                    } else if (geometrySrsName != null) {
                        effectiveSrsName = geometrySrsName;
                    } else if (posSrsName != null) {
                        effectiveSrsName = posSrsName;
                    } else {
                        throw new IllegalArgumentException("<gml:CurveType> or <gml:pos> must specify an srsName.");
                    }

                    String srsName = SRSValidationHelper.parseSrsName(effectiveSrsName);
                    Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(effectiveSrsName);

                    // C. coordinates parsing
                    String geomWkt = DirectPositionHelper.parseDirectPosition(directPosition, inverse);
                    Pos resultPos = new Pos();
                    resultPos.setValue(geomWkt);
                    resultPos.setSrsName(srsName);
                    result.getPos().add(resultPos);

                } else if (obj.getValue() instanceof PointPropertyType) {
                    PointPropertyType point = (PointPropertyType) obj.getValue();

                    // B. Sanity Check
                    if (point.getPoint() != null) {
                        throw new IllegalArgumentException("<gml:LineStringSegmentType> Content <gml:pointProperty> with embedded <gml:Point> is not supported.");
                    }

                    if (point.getHref() == null) {
                        throw new IllegalArgumentException("<gml:LineStringSegmentType> Content <gml:pointProperty> must specify an href to a remote <gml:Point>.");
                    }

                    // C. Attributes parsing
                    PointProperty pointProperty = new PointProperty();
                    pointProperty.setHref(point.getHref());
                    pointProperty.setTitle(point.getSimpleLinkTitle());
                    result.getPointProperty().add(pointProperty);

                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass().getName());
                }
            }

            return result;
        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }
    }


    public static Geodesic parseGeodesic(GeodesicStringType value, String geometrySrsName) {

        // A. Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:GeodesicStringType> cannot be null.");
        }

        if (value.getPosList() == null && (value.getGeometricPositionGroup() == null || value.getGeometricPositionGroup().isEmpty())) {
            throw new IllegalArgumentException("<gml:GeodesicStringType> Content <gml:posList> or <gml:pos> can not be both null or empty.");
        }

        if (value.getPosList() != null && value.getGeometricPositionGroup() != null && !value.getGeometricPositionGroup().isEmpty()) {
            throw new IllegalArgumentException("<gml:GeodesicStringType> Content <gml:posList> and <gml:pos> cannot be both set.");
        }

        Geodesic result = new Geodesic();
        result.setSegmentType(SegmentType.GEODESIC);
    
        if (value.getPosList() != null) {
            // B. SRS consistency
            String posSrsName = value.getPosList().getSrsName() != null ? value.getPosList().getSrsName() : null;

            String effectiveSrsName;
            if (geometrySrsName != null && posSrsName != null) {
                if (!geometrySrsName.equals(posSrsName)) {
                    throw new IllegalArgumentException(String.format(
                        "<gml:CurveType> and <gml:pos> must specify the same srsName."));
                }
                // both set, same CRS
                effectiveSrsName = geometrySrsName;
            } else if (geometrySrsName != null) {
                effectiveSrsName = geometrySrsName;
            } else if (posSrsName != null) {
                effectiveSrsName = posSrsName;
            } else {
                throw new IllegalArgumentException("<gml:CurveType> or <gml:pos> must specify an srsName.");
            }

            String srsName = SRSValidationHelper.parseSrsName(effectiveSrsName);
            Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(effectiveSrsName);

            // C. coordinates parsing
            String geomWkt = DirectPositionHelper.parseDirectPositionList(value.getPosList(),inverse);
            PosList resultPosList = new PosList();
            resultPosList.setValue(geomWkt);
            resultPosList.setSrsName(srsName);
            result.setPosList(resultPosList);
            result.setContentType(ContentType.POSLIST);

            return result;

        } else if (value.getGeometricPositionGroup() != null && !value.getGeometricPositionGroup().isEmpty()) {
            List<Object> geometricPositionGroup = value.getGeometricPositionGroup();
            result.setContentType(ContentType.POINTPROPERTY);

            for (Object obj : geometricPositionGroup) {
                if (obj instanceof DirectPositionType) {
                    DirectPositionType directPosition = (DirectPositionType) obj;

                    // B. SRS consistency
                    String posSrsName = directPosition.getSrsName() != null ? directPosition.getSrsName() : null;
                    String effectiveSrsName;
                    if (geometrySrsName != null && posSrsName != null) {
                        if (!geometrySrsName.equals(posSrsName)) {
                            throw new IllegalArgumentException(String.format(
                                "<gml:CurveType> and <gml:pos> must specify the same srsName."));
                        }
                        // both set, same CRS
                        effectiveSrsName = geometrySrsName;
                    } else if (geometrySrsName != null) {
                        effectiveSrsName = geometrySrsName;
                    } else if (posSrsName != null) {
                        effectiveSrsName = posSrsName;
                    } else {
                        throw new IllegalArgumentException("<gml:CurveType> or <gml:pos> must specify an srsName.");
                    }

                    String srsName = SRSValidationHelper.parseSrsName(effectiveSrsName);
                    Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(effectiveSrsName);

                    // C. coordinates parsing
                    String geomWkt = DirectPositionHelper.parseDirectPosition(directPosition, inverse);
                    Pos resultPos = new Pos();
                    resultPos.setValue(geomWkt);
                    resultPos.setSrsName(srsName);
                    result.getPos().add(resultPos);

                } else if (obj instanceof PointPropertyType) {
                    PointPropertyType point = (PointPropertyType) obj;

                    // B. Sanity Check
                    if (point.getPoint() != null) {
                        throw new IllegalArgumentException("<gml:GeodesicStringType> Content <gml:pointProperty> with embedded <gml:Point> is not supported.");
                    }

                    if (point.getHref() == null) {
                        throw new IllegalArgumentException("<gml:GeodesicStringType> Content <gml:pointProperty> must specify an href to a remote <gml:Point>.");
                    }

                    // C. Attributes parsing
                    PointProperty pointProperty = new PointProperty();
                    pointProperty.setHref(point.getHref());
                    pointProperty.setTitle(point.getSimpleLinkTitle());
                    result.getPointProperty().add(pointProperty);

                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass().getName());
                }
            }

            return result;
        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }
    }


    public static <T extends CurveType> T printGMLCurve(CurveType curve, Class<T> targetType) {
        T result;
        try {
            result = targetType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate " + targetType, e);
        }
        // A. Sanity Check

        // A. Coordinates printing

        // B. carry the AbstractGMLType attributes futrher

        return result;

    }
}
