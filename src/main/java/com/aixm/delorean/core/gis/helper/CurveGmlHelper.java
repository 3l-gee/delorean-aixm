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
import com.aixm.delorean.core.schema.a5_2.aixm.ElevatedPointType;
import com.aixm.delorean.core.org.gml.v_3_2.CurveSegmentArrayPropertyType;
import com.aixm.delorean.core.util.AngleUom;
import com.aixm.delorean.core.util.DistanceUom;

import jakarta.xml.bind.JAXBElement;

import java.util.List;
import javax.xml.namespace.QName;

import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.components.ContentType;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.PointProperty;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.components.SegmentType;
import com.aixm.delorean.core.gis.type.Arc;
import com.aixm.delorean.core.gis.type.Circle;
import com.aixm.delorean.core.gis.type.Geodesic;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.Segment;
import com.aixm.delorean.core.util.HrefHelper;

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
        result.setIndex(0L);
        result.setContentType(ContentType.OBJECT);
        result.setDescription(curve.getDescription());
        result.setIdentifier(curve.getIdentifier());

        return result;

    }

    public static Circle parseCircleByCenterPoint(CircleByCenterPointType value, String geometrySrsName) {

        // A. Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> cannot be null.");
        }

        if (value.getPos() == null && value.getPointProperty() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos> or <gml:pointProperty> can not be null.");
        }

        if (value.getPos() != null && value.getPointProperty() != null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos> and <gml:pointProperty> can not be both set.");
        }

        if (value.getRadius() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:radius> can not be null.");
        }

        if (value.getStartAngle() != null || value.getEndAngle() != null) {
            throw new IllegalArgumentException("<gml:CircleByCenterPointType> must not specify <gml:startAngle> or <gml:endAngle>.");
        }

        Circle result = new Circle();

        // B. SRS consistency
        String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

        // C. coordinates parsing
        if (value.getPos() != null) {
            String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPos(), inverse);
            Pos resultPos = new Pos();
            resultPos.setValue(geomWkt);
            resultPos.setSrsName(srsName);
            resultPos.setIndex(0L);
            result.setPos(resultPos);
            result.setContentType(ContentType.OBJECT);

        } else if (value.getPointProperty() != null) {
            if (value.getPointProperty().getPoint() == null) {
                PointProperty pointProperty = HrefHelper.parseHref(value.getPointProperty().getHref(), value.getPointProperty().getSimpleLinkTitle());
                pointProperty.setIndex(0L);
                result.setPointProperty(pointProperty);
                result.setContentType(ContentType.REFERENCE);

            } else if (value.getPointProperty().getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support gml PointType in <gml:ArcByCenterPointType>.");

            } else if (value.getPointProperty().getPoint().getValue().getClass() == ElevatedPointType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 ElevatedPointType in <gml:ArcByCenterPointType>.");

            } else if (value.getPointProperty().getPoint().getValue().getClass() == com.aixm.delorean.core.schema.a5_2.aixm.PointType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 PointType in <gml:ArcByCenterPointType>.");

            } else {
                throw new IllegalArgumentException("Unsupported type " + value.getPointProperty().getPoint().getValue().getClass().getName());
            }

        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }

        // D. Attributes parsing
        result.setSegmentType(SegmentType.CIRCLE);

        LengthType radius = value.getRadius();
        DistanceType distanceType = new DistanceType();
        distanceType.setValue(radius.getValue()); 
        distanceType.setUom(DistanceUom.fromSymbol(radius.getUom()));
        result.setRadius(distanceType);

        return result;
    }

    public static Arc parseArcByCenterPoint(ArcByCenterPointType value, String geometrySrsName) {

        // A. Sanity Check
        if (value == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> cannot be null.");
        }

        if (value.getPos() == null && value.getPointProperty() == null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos> or <gml:pointProperty> can not be null.");
        }

        if (value.getPos() != null && value.getPointProperty() != null) {
            throw new IllegalArgumentException("<gml:ArcByCenterPointType> Content <gml:pos> and <gml:pointProperty> can not be both set.");
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

        // B. SRS consistency
        String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
        Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

        // C. coordinates parsing
        if (value.getPos() != null) {
            String geomWkt = DirectPositionHelper.parseDirectPosition(value.getPos(), inverse);
            Pos resultPos = new Pos();
            resultPos.setValue(geomWkt);
            resultPos.setSrsName(srsName);
            resultPos.setIndex(0L);
            result.setPos(resultPos);
            result.setContentType(ContentType.OBJECT);

        } else if (value.getPointProperty() != null) {

            if (value.getPointProperty().getPoint() == null) {
                PointProperty pointProperty = HrefHelper.parseHref(value.getPointProperty().getHref(), value.getPointProperty().getSimpleLinkTitle());
                pointProperty.setIndex(0L);
                result.setPointProperty(pointProperty);
                result.setContentType(ContentType.REFERENCE);

            } else if (value.getPointProperty().getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support gml PointType in <gml:ArcByCenterPointType>.");

            } else if (value.getPointProperty().getPoint().getValue().getClass() == ElevatedPointType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 ElevatedPointType in <gml:ArcByCenterPointType>.");

            } else if (value.getPointProperty().getPoint().getValue().getClass() == com.aixm.delorean.core.schema.a5_2.aixm.PointType.class) {
                throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 PointType in <gml:ArcByCenterPointType>.");

            } else {
                throw new IllegalArgumentException("Unsupported type " + value.getPointProperty().getPoint().getValue().getClass().getName());

            }

        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
        }

        // D. Attributes parsing
        result.setSegmentType(SegmentType.ARC);

        LengthType radius = value.getRadius();
        DistanceType distanceType = new DistanceType();
        distanceType.setValue(radius.getValue()); 
        distanceType.setUom(DistanceUom.fromSymbol(radius.getUom()));
        result.setRadius(distanceType);

        AngleType startAngle = value.getStartAngle();
        com.aixm.delorean.core.gis.type.components.AngleType angleType = new com.aixm.delorean.core.gis.type.components.AngleType();
        angleType.setValue(startAngle.getValue());
        angleType.setUom(AngleUom.fromSymbol(startAngle.getUom()));
        result.setStartAngle(angleType);

        AngleType endAngle = value.getEndAngle();
        com.aixm.delorean.core.gis.type.components.AngleType endAngleType = new com.aixm.delorean.core.gis.type.components.AngleType();
        endAngleType.setValue(endAngle.getValue());
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

    
        if (value.getPosList() != null) {
            // B. SRS consistency
            String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
            Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

            // C. coordinates parsing
            String geomWkt = DirectPositionHelper.parseDirectPositionList(value.getPosList(),inverse);
            PosList resultPosList = new PosList();
            resultPosList.setValue(geomWkt);
            resultPosList.setSrsName(srsName);
            result.setPosList(resultPosList);
            result.setContentType(ContentType.OBJECT);

            return result;

        } else if (value.getPosOrPointPropertyOrPointRep() != null && !value.getPosOrPointPropertyOrPointRep().isEmpty()) {
            List<JAXBElement<?>> geometricPositionGroup = value.getPosOrPointPropertyOrPointRep();

            Long index = 0L;
            for (JAXBElement<?> obj : geometricPositionGroup) {
                if (obj.getValue().getClass() == DirectPositionType.class) {
                    DirectPositionType directPosition = (DirectPositionType) obj.getValue();

                    // B. SRS consistency
                    String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
                    Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

                    // C. coordinates parsing
                    String geomWkt = DirectPositionHelper.parseDirectPosition(directPosition, inverse);
                    Pos resultPos = new Pos();
                    resultPos.setIndex(index);
                    resultPos.setValue(geomWkt);
                    resultPos.setSrsName(srsName);
                    result.getPos().add(resultPos);

                } else if (obj.getValue().getClass() == PointPropertyType.class) {
                    PointPropertyType point = (PointPropertyType) obj.getValue();

                    if (point.getPoint() == null) {
                        PointProperty pointProperty = HrefHelper.parseHref(point.getHref(), point.getSimpleLinkTitle());
                        pointProperty.setIndex(index);
                        result.getPointProperty().add(pointProperty);
                        result.setContentType(ContentType.REFERENCE);

                    } else if (point.getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                        throw new IllegalArgumentException("Delorean does not (yet) support gml PointType in <gml:LineStringSegmentType>.");

                    } else if (point.getPoint().getValue().getClass() == ElevatedPointType.class) {
                        throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 ElevatedPointType in <gml:LineStringSegmentType>.");

                    } else if (point.getPoint().getValue().getClass() == com.aixm.delorean.core.schema.a5_2.aixm.PointType.class) {
                        throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 PointType in <gml:LineStringSegmentType>.");

                    } else {
                        throw new IllegalArgumentException("Unsupported type " + point.getPoint().getValue().getClass().getName());

                    }

                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass().getName());
                }
                index++;
            }


            // if only pos then OBJECT else REFERENCE
            if (result.getContentType() == null) {
                result.setContentType(ContentType.OBJECT);
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
            String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
            Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

            // C. coordinates parsing
            String geomWkt = DirectPositionHelper.parseDirectPositionList(value.getPosList(),inverse);
            PosList resultPosList = new PosList();
            resultPosList.setValue(geomWkt);
            resultPosList.setSrsName(srsName);
            result.setPosList(resultPosList);
            result.setContentType(ContentType.OBJECT);

            return result;

        } else if (value.getGeometricPositionGroup() != null && !value.getGeometricPositionGroup().isEmpty()) {
            List<Object> geometricPositionGroup = value.getGeometricPositionGroup();

            Long index = 0L;
            for (Object obj : geometricPositionGroup) {
                if (obj.getClass() == DirectPositionType.class) {
                    DirectPositionType directPosition = (DirectPositionType) obj;

                    // B. SRS consistency
                    String srsName = SRSValidationHelper.parseSrsName(geometrySrsName);
                    Boolean inverse = SRSValidationHelper.IsInverseAxisOrder(geometrySrsName);

                    // C. coordinates parsing
                    String geomWkt = DirectPositionHelper.parseDirectPosition(directPosition, inverse);
                    Pos resultPos = new Pos();
                    resultPos.setIndex(index);
                    resultPos.setValue(geomWkt);
                    resultPos.setSrsName(srsName);
                    result.getPos().add(resultPos);

                } else if (obj.getClass() == PointPropertyType.class) {
                    PointPropertyType point = (PointPropertyType) obj;

                    if (point.getPoint() == null) {
                        PointProperty pointProperty = HrefHelper.parseHref(point.getHref(), point.getSimpleLinkTitle());
                        pointProperty.setIndex(index);
                        result.getPointProperty().add(pointProperty);
                        result.setContentType(ContentType.REFERENCE);

                    } else if (point.getPoint().getValue().getClass() == com.aixm.delorean.core.org.gml.v_3_2.PointType.class) {
                        throw new IllegalArgumentException("Delorean does not (yet) support gml PointType in <gml:LineStringSegmentType>.");

                    } else if (point.getPoint().getValue().getClass() == ElevatedPointType.class) {
                        throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 ElevatedPointType in <gml:LineStringSegmentType>.");

                    } else if (point.getPoint().getValue().getClass() == com.aixm.delorean.core.schema.a5_2.aixm.PointType.class) {
                        throw new IllegalArgumentException("Delorean does not (yet) support aixm 5.2 PointType in <gml:LineStringSegmentType>.");

                    } else {
                        throw new IllegalArgumentException("Unsupported type " + point.getPoint().getValue().getClass().getName());

                    }

                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass().getName());
                }
                index++;
            }

            // if only pos then OBJECT else REFERENCE
            if (result.getContentType() == null) {
                result.setContentType(ContentType.OBJECT);
            }

            return result;
        } else {
            throw new IllegalArgumentException("Unsupported type " + value.getClass().getName());
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


        // A. Coordinates printing
        if (curve.getContentType() == ContentType.REFERENCE) {

        } else if (curve.getContentType() == ContentType.OBJECT) {



        } else {
            throw new IllegalArgumentException("Unsupported ContentType " + curve.getContentType());
        }


        // B. carry the AbstractGMLType attributes futrher
        result.setId(curve.getId());
        result.setDescription(curve.getDescription());
        result.setIdentifier(curve.getIdentifier());

        return result;

    }

    public static CurveSegmentArrayPropertyType printGMLCurveSegments(List<Segment> segments) {
        CurveSegmentArrayPropertyType result = new CurveSegmentArrayPropertyType();
        for (Segment segment : segments) {
            if (segment.getClass() == Arc.class) {
                Arc arc = (Arc) segment;

            } else if (segment.getClass() == Circle.class) {
                Circle circle = (Circle) segment;
            
            } else if (segment.getClass() == LineString.class) {
                LineString lineString = (LineString) segment;

            } else if (segment.getClass() == Geodesic.class) {
                Geodesic geodesic = (Geodesic) segment;


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
        return new JAXBElement<CircleByCenterPointType>(new QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"), CircleByCenterPointType.class, result);
    }

    public static JAXBElement<ArcByCenterPointType> printGMLArcByCenterPoint(Arc arc) {
        ArcByCenterPointType result = new ArcByCenterPointType();

        // A. Sanity Check
        return new JAXBElement<ArcByCenterPointType>(new QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"), ArcByCenterPointType.class, result);
    }

    public static JAXBElement<LineStringSegmentType> printGMLLineString(LineString lineString) {
        LineStringSegmentType result = new LineStringSegmentType();

        // A. Sanity Check
        return new JAXBElement<LineStringSegmentType>(new QName("http://www.opengis.net/gml/3.2", "LineStringSegment"), LineStringSegmentType.class, result);
    }

    public static JAXBElement<GeodesicStringType>  printGMLGeodesic(Geodesic geodesic) {
        GeodesicStringType result = new GeodesicStringType();

        // A. Sanity Check
        return new JAXBElement<GeodesicStringType>(new QName("http://www.opengis.net/gml/3.2", "GeodesicString"), GeodesicStringType.class, result);
    }


}
