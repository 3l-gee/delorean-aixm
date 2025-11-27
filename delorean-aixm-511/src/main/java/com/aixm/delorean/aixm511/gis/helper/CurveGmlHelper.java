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
import com.aixm.delorean.core.unit.AngleUom;
import com.aixm.delorean.core.unit.DistanceUom;
import com.aixm.delorean.core.unit.HrefHelper;
import com.aixm.delorean.core.org.gml.v_3_2.DirectPositionListType;
import com.aixm.delorean.core.org.gml.v_3_2.CurvePropertyType;

import com.aixm.delorean.core.org.gml.v_3_2.CurveSegmentArrayPropertyType;

import jakarta.xml.bind.JAXBElement;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.xml.namespace.QName;

import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.GeometricProperty;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.components.SegmentType;
import com.aixm.delorean.core.gis.type.gml.GmlCurveType;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.gis.type.Arc;
import com.aixm.delorean.core.gis.type.Circle;
import com.aixm.delorean.core.gis.type.Geodesic;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.Segment;

public class CurveGmlHelper {

    public static <T extends Curve> T parseGMLCurve(CurveType curve, Class<T> targetType) {
        return parseGMLCurve(curve, targetType, null);
    }

    public static <T extends Curve> T parseGMLCurve(CurveType curve, Class<T> targetType, String parentSrsName) {
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

        if (curve.getSrsName() == null && parentSrsName == null) {
            throw new IllegalArgumentException("<gml:CurveType> or parent srsName cannot be null.");
        }

        // B. SRS consistency
        String geometrySrsName = curve.getSrsName() != null ? curve.getSrsName() : parentSrsName;

        // C. Segments parsing
        Long segmentIndex = 0L;
        for (JAXBElement<? extends AbstractCurveSegmentType> segment : curve.getSegments().getAbstractCurveSegment()) {
            if (segment.getValue() == null) {

            } else if (segment.getValue() instanceof ArcByBulgeType) {
                throw new IllegalArgumentException("AIXM-RULE-1A3EC2 : ArcByBulgeType is not supported");


            } else if (segment.getValue().getClass() == CircleByCenterPointType.class) {
                CircleByCenterPointType circleByCenterPoint = (CircleByCenterPointType) segment.getValue();
                Circle circle = parseCircleByCenterPoint(circleByCenterPoint, geometrySrsName);
                circle.setIndex(segmentIndex);
                result.getSegments().add(circle);

            } else if (segment.getValue().getClass() == ArcByCenterPointType.class) {
                ArcByCenterPointType arcByCenterPoint = (ArcByCenterPointType) segment.getValue();
                Arc arc = parseArcByCenterPoint(arcByCenterPoint, geometrySrsName);
                arc.setIndex(segmentIndex);
                result.getSegments().add(arc);

            } else if (segment.getValue().getClass() ==  ArcStringByBulgeType.class) {
                throw new IllegalArgumentException("AIXM-RULE-1A3EC1 : ArcStringByBulgeType is not supported");

            } else if (segment.getValue().getClass() == ArcStringType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : ArcStringType is not supported");

            } else if (segment.getValue().getClass() == ArcType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : ArcType (extension of ArcStringType) is not supported");

            } else if (segment.getValue().getClass() == BSplineType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC4 : BSplineType is not supported");

            } else if (segment.getValue().getClass() == BezierType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC5 : BezierType is not supported");

            } else if (segment.getValue().getClass() == CircleType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC3 : CircleType (extension of ArcType) is not supported");

            } else if (segment.getValue().getClass() == ClothoidType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC7 : ClothoidType is not supported");

            } else if (segment.getValue().getClass() == CubicSplineType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC9 : CubicSplineType is not supported");

            } else if (segment.getValue().getClass() == GeodesicStringType.class || segment.getValue().getClass() == GeodesicType.class) {
                GeodesicStringType geodesicString = (GeodesicStringType) segment.getValue();
                Geodesic geodesic = parseGeodesic(geodesicString, geometrySrsName);
                geodesic.setIndex(segmentIndex);
                result.getSegments().add(geodesic);

            } else if (segment.getValue().getClass() == LineStringSegmentType.class) {
                LineStringSegmentType lineStringSegment = (LineStringSegmentType) segment.getValue();
                LineString lineString = parseLineString(lineStringSegment, geometrySrsName);
                lineString.setIndex(segmentIndex);
                result.getSegments().add(lineString);

            } else if (segment.getValue().getClass() == OffsetCurveType.class) {
                throw new IllegalArgumentException("AIXM-5.1_RULE-1A3EC6 : OffsetCurveType is not supported");

            } else {
                throw new IllegalArgumentException("<gml:CurveSegmentType> Unsupported type : " + segment.getValue().getClass().getName());
            }
            segmentIndex++;
        }

        // D. carry the AbstractGMLType attributes further
        result.setId(curve.getId());
        result.setDescription(curve.getDescription());
        result.setIdentifier(curve.getIdentifier());

        return result;

    }

    public static Circle parseCircleByCenterPoint(CircleByCenterPointType value, String geometrySrsName) {

        // A. Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> cannot be null.");
        }

        if (value.getPos() == null && value.getPointProperty() == null && value.getPosList() == null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> Content <gml:pos>, <gml:posList>, or <gml:pointProperty> can not be null.");
        }

        if ((value.getPos() != null && value.getPointProperty() != null) || 
            (value.getPos() != null && value.getPosList() != null) || 
            (value.getPointProperty() != null && value.getPosList() != null)) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> Content <gml:pos>, <gml:posList> and <gml:pointProperty> can not be set simultaneously.");
        }

        if (value.getPos() != null && value.getPointProperty() != null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> Content <gml:pos> and <gml:pointProperty> can not be both set.");
        }

        if (value.getRadius() == null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> Content <gml:radius> can not be null.");
        }

        if (value.getStartAngle() != null || value.getEndAngle() != null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> must not specify <gml:startAngle> or <gml:endAngle>.");
        }

        Circle result = new Circle();
        result.setSegmentType(SegmentType.CIRCLE);

        // B. SRS consistency
        String epsgCode = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

        // C. coordinates parsing
        if (value.getPos() != null) {
            GmlPointType resultPoint = new GmlPointType();
            resultPoint.setGeometricType(GeometricType.POS);
            String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPos(), inverse);
            Pos resultPos = new Pos();
            resultPos.setValue(geomWkt);
            resultPos.setSrsName(epsgCode);
            resultPoint.setPos(resultPos);
            result.setGmlPoint(resultPoint);

        } else if (value.getPosList() != null) {
            GmlPointType resultPoint = new GmlPointType();
            resultPoint.setGeometricType(GeometricType.POS);
            String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPosList(), inverse);
            Pos resultPos = new Pos();
            resultPos.setValue(geomWkt);
            resultPos.setSrsName(epsgCode);
            resultPoint.setPos(resultPos);
            result.setGmlPoint(resultPoint);

        } else if (value.getPointProperty() != null) {
            if (value.getPointProperty().getPoint() == null) {
                GmlPointType resultPoint = new GmlPointType();
                resultPoint.setGeometricType(GeometricType.REF);
                GeometricProperty geometricProperty = HrefHelper.parseHref(value.getPointProperty().getHref(), value.getPointProperty().getSimpleLinkTitle());
                geometricProperty.setSrsName(epsgCode);
                resultPoint.setGeometricProperty(geometricProperty);
                result.setGmlPoint(resultPoint);

            } else if (value.getPointProperty().getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) value.getPointProperty().getPoint().getValue();
                GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                resultPoint.setGeometricType(GeometricType.GML);
                result.setGmlPoint(resultPoint);

            } else if (com.aixm.delorean.core.org.gml.v_3_2.PointType.class.isAssignableFrom(value.getPointProperty().getPoint().getClass())) {
                ConsoleLogger.log(LogLevel.WARN,"Delorean does not support <" + value.getPointProperty().getPoint().getClass().getName() + "> in <gml:ArcByCenterPointType>. It will be converted to <gml:PointType>.");
                com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) value.getPointProperty().getPoint().getValue();
                GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                resultPoint.setGeometricType(GeometricType.GML);
                result.setGmlPoint(resultPoint);

            } else {
                throw new IllegalArgumentException("Unsupported type " + value.getPointProperty().getPoint().getClass().getName());
            }

        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }

        // D. Attributes parsing
        LengthType radius = value.getRadius();
        DistanceType distanceType = new DistanceType();
        distanceType.setValue(new BigDecimal(radius.getValue()));
        distanceType.setUom(DistanceUom.fromSymbol(radius.getUom()));
        result.setRadius(distanceType);

        return result;
    }

    public static Arc parseArcByCenterPoint(ArcByCenterPointType value, String geometrySrsName) {

        // A. Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> cannot be null.");
        }

        if (value.getPos() == null && value.getPointProperty() == null && value.getPosList() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos>, <gml:posList> or <gml:pointProperty> can not be null.");
        }

        if ((value.getPos() != null && value.getPointProperty() != null) || 
            (value.getPos() != null && value.getPosList() != null) || 
            (value.getPointProperty() != null && value.getPosList() != null)) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos>, <gml:posList> and <gml:pointProperty> can not be set simultaneously.");
        }

        if (value.getRadius() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:radius> can not be null.");
        }

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

        Arc result = new Arc();
        result.setSegmentType(SegmentType.ARC);

        // B. SRS consistency
        String epsgCode = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

        // C. coordinates parsing
        if (value.getPos() != null) {
            GmlPointType resultPoint = new GmlPointType();
            resultPoint.setGeometricType(GeometricType.POS);
            String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPos(), inverse);
            Pos resultPos = new Pos();
            resultPos.setValue(geomWkt);
            resultPos.setSrsName(epsgCode);
            resultPoint.setPos(resultPos);
            result.setGmlPoint(resultPoint);

        } else if (value.getPosList() != null) {
            GmlPointType resultPoint = new GmlPointType();
            resultPoint.setGeometricType(GeometricType.POS);
            String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPosList(), inverse);
            Pos resultPos = new Pos();
            resultPos.setValue(geomWkt);
            resultPos.setSrsName(epsgCode);
            resultPoint.setPos(resultPos);
            result.setGmlPoint(resultPoint);

        } else if (value.getPointProperty() != null) {

            if (value.getPointProperty().getPoint() == null) {
                GmlPointType resultPoint = new GmlPointType();
                resultPoint.setGeometricType(GeometricType.REF);
                GeometricProperty geometricProperty = HrefHelper.parseHref(value.getPointProperty().getHref(), value.getPointProperty().getSimpleLinkTitle());
                geometricProperty.setSrsName(epsgCode);
                resultPoint.setGeometricProperty(geometricProperty);

                result.setGmlPoint(resultPoint);

            } else if (value.getPointProperty().getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) value.getPointProperty().getPoint().getValue();
                GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                resultPoint.setGeometricType(GeometricType.GML);
                result.setGmlPoint(resultPoint);

            } else if (com.aixm.delorean.core.org.gml.v_3_2.PointType.class.isAssignableFrom(value.getPointProperty().getPoint().getClass())) {
                ConsoleLogger.log(LogLevel.WARN,"Delorean does not support <" + value.getPointProperty().getPoint().getClass().getName() + "> in <gml:ArcByCenterPointType>. It will be converted to <gml:PointType>.");
                com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) value.getPointProperty().getPoint().getValue();
                GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                resultPoint.setGeometricType(GeometricType.GML);
                result.setGmlPoint(resultPoint);

            } else {
                throw new IllegalArgumentException("Unsupported type " + value.getPointProperty().getPoint().getClass().getName());

            }

        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }

        // D. Attributes parsing
        LengthType radius = value.getRadius();
        DistanceType distanceType = new DistanceType();
        distanceType.setValue(new BigDecimal(radius.getValue()));
        distanceType.setUom(DistanceUom.fromSymbol(radius.getUom()));
        result.setRadius(distanceType);

        AngleType startAngle = value.getStartAngle();
        com.aixm.delorean.core.gis.type.components.AngleType angleType = new com.aixm.delorean.core.gis.type.components.AngleType();
        angleType.setValue(new BigDecimal(startAngle.getValue()));
        angleType.setUom(AngleUom.fromSymbol(startAngle.getUom()));
        result.setStartAngle(angleType);

        AngleType endAngle = value.getEndAngle();
        com.aixm.delorean.core.gis.type.components.AngleType endAngleType = new com.aixm.delorean.core.gis.type.components.AngleType();
        endAngleType.setValue(new BigDecimal(endAngle.getValue()));
        endAngleType.setUom(AngleUom.fromSymbol(endAngle.getUom()));
        result.setEndAngle(endAngleType);

        return result;
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

        // B. SRS consistency
        String epsgCode = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

    
        if (value.getPosList() != null) {

            // C. coordinates parsing
            String geomWkt = DirectPositionHelper.parseDirectPositionList(value.getPosList(),inverse);
            PosList resultPosList = new PosList();
            resultPosList.setValue(geomWkt);
            resultPosList.setSrsName(epsgCode);
            result.setPosList(resultPosList);
            return result;

        } else if (value.getPosOrPointPropertyOrPointRep() != null && !value.getPosOrPointPropertyOrPointRep().isEmpty()) {
            List<JAXBElement<?>> geometricPositionGroup = value.getPosOrPointPropertyOrPointRep();

            Long index = 0L;
            for (JAXBElement<?> obj : geometricPositionGroup) {
                if (obj.getValue().getClass() == DirectPositionType.class) {
                    DirectPositionType directPosition = (DirectPositionType) obj.getValue();

                    // C. coordinates parsing
                    GmlPointType resultPoint = new GmlPointType();
                    resultPoint.setGeometricType(GeometricType.POS);
                    String geomWkt = DirectPositionHelper.parseDirectPosition(directPosition, inverse);
                    Pos resultPos = new Pos();
                    resultPos.setValue(geomWkt);
                    resultPos.setSrsName(epsgCode);
                    resultPoint.setPos(resultPos);
                    resultPoint.setIndex(index);
                    result.getGmlPoint().add(resultPoint);

                } else if (obj.getValue().getClass() == PointPropertyType.class) {
                    PointPropertyType pointPropertyObj = (PointPropertyType) obj.getValue();

                    if (pointPropertyObj.getPoint() == null) {
                        GmlPointType resultPoint = new GmlPointType();
                        resultPoint.setGeometricType(GeometricType.REF);
                        GeometricProperty geometricProperty = HrefHelper.parseHref(pointPropertyObj.getHref(), pointPropertyObj.getSimpleLinkTitle());
                        geometricProperty.setSrsName(epsgCode);
                        resultPoint.setGeometricProperty(geometricProperty);
                        resultPoint.setIndex(index);
                        result.getGmlPoint().add(resultPoint);

                    } else if (pointPropertyObj.getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                        com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) pointPropertyObj.getPoint().getValue();
                        GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                        resultPoint.setGeometricType(GeometricType.GML);
                        resultPoint.setIndex(index);
                        result.getGmlPoint().add(resultPoint);


                    } else if (com.aixm.delorean.core.org.gml.v_3_2.PointType.class.isAssignableFrom(pointPropertyObj.getPoint().getClass())) {
                        ConsoleLogger.log(LogLevel.WARN,"Delorean does not support <" + pointPropertyObj.getPoint().getClass().getName() + "> in <gml:ArcByCenterPointType>. It will be converted to <gml:PointType>.");
                        com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) pointPropertyObj.getPoint().getValue();
                        GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                        resultPoint.setGeometricType(GeometricType.GML);
                        resultPoint.setIndex(index);
                        result.getGmlPoint().add(resultPoint);

                    } else {
                        throw new IllegalArgumentException("Unsupported type " + pointPropertyObj.getPoint().getClass().getName());

                    }

                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass().getName());
                }
                index++;
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

        // B. SRS consistency
        String epsgCode = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);
    
        if (value.getPosList() != null) {

            // C. coordinates parsing
            String geomWkt = DirectPositionHelper.parseDirectPositionList(value.getPosList(),inverse);
            PosList resultPosList = new PosList();
            resultPosList.setValue(geomWkt);
            resultPosList.setSrsName(epsgCode);
            result.setPosList(resultPosList);

            return result;

        } else if (value.getGeometricPositionGroup() != null && !value.getGeometricPositionGroup().isEmpty()) {
            List<Object> geometricPositionGroup = value.getGeometricPositionGroup();

            Long index = 0L;
            for (Object obj : geometricPositionGroup) {
                if (obj.getClass() == DirectPositionType.class) {
                    DirectPositionType directPosition = (DirectPositionType) obj;

                    // C. coordinates parsing
                    GmlPointType resultPoint = new GmlPointType();
                    resultPoint.setGeometricType(GeometricType.POS);
                    String geomWkt = DirectPositionHelper.parseDirectPosition(directPosition, inverse);
                    Pos resultPos = new Pos();
                    resultPos.setValue(geomWkt);
                    resultPos.setSrsName(epsgCode);
                    resultPoint.setPos(resultPos);
                    resultPoint.setIndex(index);
                    result.getGmlPoint().add(resultPoint);

                } else if (obj.getClass() == PointPropertyType.class) {
                    PointPropertyType pointPropertyObj = (PointPropertyType) obj;

                    if (pointPropertyObj.getPoint() == null) {
                        GmlPointType resultPoint = new GmlPointType();
                        resultPoint.setGeometricType(GeometricType.REF);
                        GeometricProperty geometricProperty = HrefHelper.parseHref(pointPropertyObj.getHref(), pointPropertyObj.getSimpleLinkTitle());
                        geometricProperty.setSrsName(epsgCode);
                        resultPoint.setGeometricProperty(geometricProperty);
                        resultPoint.setIndex(index);
                        result.getGmlPoint().add(resultPoint);

                    } else if (pointPropertyObj.getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                        com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) pointPropertyObj.getPoint().getValue();
                        GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                        resultPoint.setGeometricType(GeometricType.GML);
                        resultPoint.setIndex(index);
                        result.getGmlPoint().add(resultPoint);

                    } else if (com.aixm.delorean.core.org.gml.v_3_2.PointType.class.isAssignableFrom(pointPropertyObj.getPoint().getClass())) {
                        ConsoleLogger.log(LogLevel.WARN,"Delorean does not support <" + pointPropertyObj.getPoint().getClass().getName() + "> in <gml:ArcByCenterPointType>. it will be converted to <gml:PointType>.");
                        com.aixm.delorean.core.org.gml.v_3_2.PointType point = (com.aixm.delorean.core.org.gml.v_3_2.PointType) pointPropertyObj.getPoint().getValue();
                        GmlPointType resultPoint = PointGmlHelper.parseGMLPoint(point, GmlPointType.class, geometrySrsName);
                        resultPoint.setGeometricType(GeometricType.GML);
                        resultPoint.setIndex(index);
                        result.getGmlPoint().add(resultPoint);

                    } else {
                        throw new IllegalArgumentException("Unsupported type " + pointPropertyObj.getPoint().getClass().getName());

                    }

                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass().getName());
                }
                index++;
            }

            return result;
        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }
    }

    public static CurvePropertyType printCurvePropertyType(GmlCurveType curve) {
        // A. Sanity Check
        if (curve == null) {
            throw new IllegalArgumentException("<GmlCurveType> cannot be null.");
        }

        if (curve.getGeometricType() == null) {
            throw new IllegalArgumentException("<GmlCurveType> Content <geometricType> must be 'REF' to build a CurvePropertyType.");
        }

        // B. build CurvePropertyType
        CurvePropertyType curveProperty = new CurvePropertyType();
        if (curve.getGeometricType() == GeometricType.REF) {

            if (curve.getGeometricProperty() == null) {
                throw new IllegalArgumentException("<GmlCurveType> Content <geometricProperty> can not be null.");
            }

            curveProperty.setHref(HrefHelper.printHref(curve.getGeometricProperty()));
            curveProperty.setSimpleLinkTitle(curve.getGeometricProperty().getTitle());
            return curveProperty;

        } else if (curve.getGeometricType() == GeometricType.GML) {
            CurveType curveObj = printGMLCurve(curve, CurveType.class);
            JAXBElement<CurveType> curveElement = new JAXBElement<>(new QName("http://www.opengis.net/gml/3.2", "Curve"), CurveType.class, curveObj);
            curveProperty.setAbstractCurve(curveElement);
            return curveProperty;

        } else {
            throw new IllegalArgumentException("Unsupported GeometricType " + curve.getGeometricType());
        }

    }

    public static <T extends CurveType> T printGMLCurve(Curve curve, Class<T> targetType) {
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

        if (curve.getSegments() == null || curve.getSegments().isEmpty()) {
            throw new IllegalArgumentException("<gml:CurveType> Content <gml:segments> can not be null or empty.");
        }

        // B. Collect all SRS names
        List<String> epsgCodes = curve.aggregateEpsgCode();
        
        if (!epsgCodes.isEmpty()) {
            String firstEpsgCode = epsgCodes.get(0);
            for (String epsgCode : epsgCodes) {
                if (!epsgCode.equals(firstEpsgCode)) {
                    throw new IllegalArgumentException("<T extends CurveType> geometry has inconsistent EPSG codes defined.");
                }   
            }
        } else {
            throw new IllegalArgumentException("<T extends CurveType> geometry must have at least one EPSG code defined.");
        }

        String srsName = SRSValidationHelper.printSrsName(epsgCodes.get(0));

        // C. Coordinates printing
        CurveSegmentArrayPropertyType segments = printGMLCurveSegments(curve.getSegments());
        result.setSegments(segments);

        // D. carry the AbstractGMLType attributes further
        result.setId(curve.getId());
        result.setDescription(curve.getDescription());
        result.setIdentifier(curve.getIdentifier());
        result.setSrsName(srsName);

        return result;

    }

    public static CurveSegmentArrayPropertyType printGMLCurveSegments(List<Segment> segments) {
        CurveSegmentArrayPropertyType result = new CurveSegmentArrayPropertyType();
        
        // A. Sanity Check
        if (segments == null || segments.isEmpty()) {
            throw new IllegalArgumentException("<gml:CurveSegmentArrayPropertyType> segments cannot be null or empty.");
        }

        // Check that all DirectPosition lists have the same EPSG code
        for (Segment segment : segments) {
            if (segment.getClass() == Arc.class) {
                Arc arc = (Arc) segment;
                JAXBElement<ArcByCenterPointType> arcByCenterPoint = printGMLArcByCenterPoint(arc);
                result.getAbstractCurveSegment().add(arcByCenterPoint);

            } else if (segment.getClass() == Circle.class) {
                Circle circle = (Circle) segment;
                JAXBElement<CircleByCenterPointType> circleByCenterPoint = printGMLCircleByCenterPoint(circle);
                result.getAbstractCurveSegment().add(circleByCenterPoint);

            } else if (segment.getClass() == LineString.class) {
                LineString lineString = (LineString) segment;
                JAXBElement<LineStringSegmentType> lineStringSegment = printGMLLineStringSegment(lineString);
                result.getAbstractCurveSegment().add(lineStringSegment);

            } else if (segment.getClass() == Geodesic.class) {
                Geodesic geodesic = (Geodesic) segment;
                JAXBElement<GeodesicStringType> geodesicString = printGMLGeodesicString(geodesic);
                result.getAbstractCurveSegment().add(geodesicString);

            } else {
                throw new IllegalArgumentException("Unsupported Segment type " + segment.getClass().getName());
            }
        }
        // A. Sanity Check

        return result;
    }

    public static JAXBElement<CircleByCenterPointType> printGMLCircleByCenterPoint(Circle circle) {
        CircleByCenterPointType result = new CircleByCenterPointType();

        // A. Sanity Check
        if (circle == null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> cannot be null.");
        }

        if (circle.getRadius() == null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> Content <gml:radius> can not be null.");
        }

        if (circle.getGmlPoint() == null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> Content <gml:pos> or <gml:pointProperty> can not be null.");
        }

        // B. Coordinates printing
        if (circle.getGmlPoint().getGeometricType() == GeometricType.REF || circle.getGmlPoint().getGeometricType() == GeometricType.GML) {
            PointPropertyType pointProperty = PointGmlHelper.printPointPropertyType(circle.getGmlPoint());
            result.setPointProperty(pointProperty);

        } else if (circle.getGmlPoint().getGeometricType() == GeometricType.POS) {
            DirectPositionType pos = DirectPositionHelper.printDirectPosition(circle.getGmlPoint());
            result.setPos(pos);

        } else {
            throw new IllegalArgumentException("Unsupported ContentType " + circle.getGmlPoint().getGeometricType());
        }

        // C . Attributes printing
        LengthType radius = new LengthType();
        radius.setValue(circle.getRadius().getValue().doubleValue());
        radius.setUom(circle.getRadius().getUom().getSymbol());
        result.setRadius(radius);


        return new JAXBElement<CircleByCenterPointType>(new QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"), CircleByCenterPointType.class, result);
    }

    public static JAXBElement<ArcByCenterPointType> printGMLArcByCenterPoint(Arc arc) {
        ArcByCenterPointType result = new ArcByCenterPointType();

        // A. Sanity Check
        if (arc == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> cannot be null.");
        }

        if (arc.getRadius() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:radius> can not be null.");
        }

        if (arc.getStartAngle() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:startAngle> can not be null.");
        }

        if (arc.getEndAngle() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:endAngle> can not be null.");
        }

        if (arc.getGmlPoint() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos> or <gml:pointProperty> can not be null.");
        }

        // B. Coordinates printing
        if (arc.getGmlPoint().getGeometricType() == GeometricType.REF || arc.getGmlPoint().getGeometricType() == GeometricType.GML) {
            PointPropertyType pointProperty = PointGmlHelper.printPointPropertyType(arc.getGmlPoint());
            result.setPointProperty(pointProperty);

        } else if (arc.getGmlPoint().getGeometricType() == GeometricType.POS) {
            DirectPositionType pos = DirectPositionHelper.printDirectPosition(arc.getGmlPoint());
            result.setPos(pos);

        } else {
            throw new IllegalArgumentException("Unsupported ContentType " + arc.getGmlPoint().getGeometricType());
        }

        // C . Attributes printing
        LengthType radius = new LengthType();
        radius.setValue(arc.getRadius().getValue().doubleValue());
        radius.setUom(arc.getRadius().getUom().getSymbol());
        result.setRadius(radius);

        AngleType startAngle = new AngleType();
        startAngle.setValue(arc.getStartAngle().getValue().doubleValue());
        startAngle.setUom(arc.getStartAngle().getUom().getSymbol());
        result.setStartAngle(startAngle);

        AngleType endAngle = new AngleType();
        endAngle.setValue(arc.getEndAngle().getValue().doubleValue());
        endAngle.setUom(arc.getEndAngle().getUom().getSymbol());
        result.setEndAngle(endAngle);

        return new JAXBElement<ArcByCenterPointType>(new QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"), ArcByCenterPointType.class, result);
    }

    public static JAXBElement<LineStringSegmentType> printGMLLineStringSegment(LineString lineString) {
        LineStringSegmentType result = new LineStringSegmentType();

        // A. Sanity Check
        if (lineString == null) {
            throw new IllegalArgumentException("<gml:LineStringSegmentType> cannot be null.");
        }

        if (lineString.getPosList() == null && (lineString.getGmlPoint() == null || lineString.getGmlPoint().isEmpty())) {
            throw new IllegalArgumentException("<gml:LineStringSegmentType> Content <gml:posList> or <gml:pos> or <gml:pointProperty> can not be both null or empty.");
        }

        // B. Coordinates printing
        if (lineString.getPosList() != null) {
            DirectPositionListType posList = DirectPositionHelper.printDirectPositionList(lineString.getPosList().getValue());
            result.setPosList(posList);
            return new JAXBElement<LineStringSegmentType>(new QName("http://www.opengis.net/gml/3.2", "LineStringSegment"), LineStringSegmentType.class, result);

        }

        List<JAXBElement<?>> geometricPositionGroup = new ArrayList<>();

        for (GmlPointType gmlPoint : lineString.getGmlPoint()) {
            if (gmlPoint.getGeometricType() == GeometricType.POS) {
                DirectPositionType directPosition = DirectPositionHelper.printDirectPosition(gmlPoint);
                JAXBElement<DirectPositionType> directPositionElement = new JAXBElement<DirectPositionType>(new QName("http://www.opengis.net/gml/3.2", "pos"), DirectPositionType.class, directPosition);
                geometricPositionGroup.add(directPositionElement);

            } else if (gmlPoint.getGeometricType() == GeometricType.REF || gmlPoint.getGeometricType() == GeometricType.GML) {
                PointPropertyType pointProperty = PointGmlHelper.printPointPropertyType(gmlPoint);
                JAXBElement<PointPropertyType> pointPropertyElement = new JAXBElement<PointPropertyType>(new QName("http://www.opengis.net/gml/3.2", "pointProperty"), PointPropertyType.class, pointProperty);
                geometricPositionGroup.add(pointPropertyElement);

            } else {
                throw new IllegalArgumentException("Unsupported ContentType " + gmlPoint.getGeometricType());
            }
        }

        result.getPosOrPointPropertyOrPointRep().addAll(geometricPositionGroup);

        return new JAXBElement<LineStringSegmentType>(new QName("http://www.opengis.net/gml/3.2", "LineStringSegment"), LineStringSegmentType.class, result);
    }

    public static JAXBElement<GeodesicStringType> printGMLGeodesicString(Geodesic geodesic) {
        GeodesicStringType result = new GeodesicStringType();

        // A. Sanity Check
        if (geodesic == null) {
            throw new IllegalArgumentException("<gml:GeodesicStringType> cannot be null.");
        }

        if (geodesic.getPosList() == null && (geodesic.getGmlPoint() == null || geodesic.getGmlPoint().isEmpty())) {
            throw new IllegalArgumentException("<gml:GeodesicStringType> Content <gml:posList> or <gml:pos> or <gml:pointProperty> can not be both null or empty.");
        }
        
        // B. Coordinates printing
        if (geodesic.getPosList() != null) {
            DirectPositionListType posList = DirectPositionHelper.printDirectPositionList(geodesic.getPosList().getValue());
            result.setPosList(posList);
            return new JAXBElement<GeodesicStringType>(new QName("http://www.opengis.net/gml/3.2", "GeodesicString"), GeodesicStringType.class, result);
        
        }

        List<JAXBElement<?>> geometricPositionGroup = new ArrayList<>();

        for (GmlPointType gmlPoint : geodesic.getGmlPoint()) {
            if (gmlPoint.getGeometricType() == GeometricType.POS) {
                DirectPositionType directPosition = DirectPositionHelper.printDirectPosition(gmlPoint);
                JAXBElement<DirectPositionType> directPositionElement = new JAXBElement<DirectPositionType>(new QName("http://www.opengis.net/gml/3.2", "pos"), DirectPositionType.class, directPosition);
                geometricPositionGroup.add(directPositionElement);

            } else if (gmlPoint.getGeometricType() == GeometricType.REF || gmlPoint.getGeometricType() == GeometricType.GML) {
                PointPropertyType pointProperty = PointGmlHelper.printPointPropertyType(gmlPoint);
                JAXBElement<PointPropertyType> pointPropertyElement = new JAXBElement<PointPropertyType>(new QName("http://www.opengis.net/gml/3.2", "pointProperty"), PointPropertyType.class, pointProperty);
                geometricPositionGroup.add(pointPropertyElement);

            } else {
                throw new IllegalArgumentException("Unsupported ContentType " + gmlPoint.getGeometricType());
            }
        }

        result.getGeometricPositionGroup().addAll(geometricPositionGroup);

        return new JAXBElement<GeodesicStringType>(new QName("http://www.opengis.net/gml/3.2", "GeodesicString"), GeodesicStringType.class, result);
    }
}
