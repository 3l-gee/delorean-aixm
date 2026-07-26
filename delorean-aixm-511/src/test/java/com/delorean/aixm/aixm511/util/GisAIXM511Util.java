package com.delorean.aixm.aixm511.util;

import java.util.ArrayList;
import java.util.List;

import com.delorean.aixm.aixm511.gis.type.AixmElevatedCurveType;
import com.delorean.aixm.aixm511.gis.type.AixmCurveType;
import com.delorean.aixm.aixm511.gis.type.AixmElevatedPointType;
import com.delorean.aixm.aixm511.gis.type.AixmPointType;
import com.delorean.aixm.aixm511.gis.type.AixmElevatedSurfaceType;
import com.delorean.aixm.aixm511.gis.type.AixmSurfaceType;
import com.delorean.aixm.aixm511.schema.ValDistanceType;
import com.delorean.aixm.aixm511.schema.ValDistanceVerticalType;
import com.delorean.aixm.aixm511.schema.NotePropertyType;
import com.delorean.aixm.aixm511.schema.ValDistanceSignedType;
import com.delorean.aixm.aixm511.schema.CodeVerticalDatumType;
import com.delorean.aixm.core.gis.type.Arc;
import com.delorean.aixm.core.gis.type.Circle;
import com.delorean.aixm.core.gis.type.Geodesic;
import com.delorean.aixm.core.gis.type.LineString;
import com.delorean.aixm.core.gis.type.Polygon;
import com.delorean.aixm.core.gis.type.Ring;
import com.delorean.aixm.core.gis.type.Segment;
import com.delorean.aixm.core.gis.type.components.AngleType;
import com.delorean.aixm.core.gis.type.components.DistanceType;
import com.delorean.aixm.core.gis.type.components.GeometricProperty;
import com.delorean.aixm.core.gis.type.components.GeometricType;
import com.delorean.aixm.core.gis.type.components.HrefType;
import com.delorean.aixm.core.gis.type.components.Pos;
import com.delorean.aixm.core.gis.type.components.PosList;
import com.delorean.aixm.core.gis.type.components.SegmentType;
import com.delorean.aixm.core.gis.type.gml.GmlCurveType;
import com.delorean.aixm.core.gis.type.gml.GmlPointType;
import com.delorean.aixm.core.gis.type.gml.GmlSurfaceType;

public class GisAIXM511Util {

    public static AixmPointType AIXMPoint(String id , Pos pos, ValDistanceType horizontalAccuracy, List<NotePropertyType> annotation) {
        AixmPointType p = new AixmPointType();
        p.setId(id);
        p.setPos(pos);
        p.setHorizontalAccuracyItem(horizontalAccuracy);
        p.setAnnotation(annotation);
        return p;
    }

    public static AixmElevatedPointType AIXMElevatedPoint(String id , Pos pos, ValDistanceVerticalType elevation, ValDistanceSignedType geoidUndulation, CodeVerticalDatumType verticalDatum, ValDistanceType horizontalAccuracy, ValDistanceType verticalAccuracy,  List<NotePropertyType> annotation) {
        AixmElevatedPointType p = new AixmElevatedPointType();
        p.setId(id);
        p.setPos(pos);
        p.setElevationItem(elevation);
        p.setGeoidUndulationItem(geoidUndulation);
        p.setVerticalDatumItem(verticalDatum);
        p.setHorizontalAccuracyItem(horizontalAccuracy);
        p.setVerticalAccuracyItem(verticalAccuracy);
        p.setAnnotation(annotation);
        return p;
    }

    public static AixmCurveType AIXMCurve(String id , ValDistanceType horizontalAccuracy, List<NotePropertyType> annotation, Segment... segments) {
        AixmCurveType c = new AixmCurveType();
        c.setId(id);
        c.setSegments(List.of(segments));
        c.setHorizontalAccuracyItem(horizontalAccuracy);
        c.setAnnotation(annotation);
        return c;
    }

    public static AixmElevatedCurveType AIXMElevatedCurve(String id , ValDistanceVerticalType elevation, ValDistanceSignedType geoidUndulation, CodeVerticalDatumType verticalDatum, ValDistanceType horizontalAccuracy, ValDistanceType verticalAccuracy, List<NotePropertyType> annotation, Segment... segments) {
        AixmElevatedCurveType c = new AixmElevatedCurveType();
        c.setId(id);
        c.setElevationItem(elevation);
        c.setGeoidUndulationItem(geoidUndulation);
        c.setVerticalDatumItem(verticalDatum);
        c.setHorizontalAccuracyItem(horizontalAccuracy);
        c.setVerticalAccuracyItem(verticalAccuracy);
        c.setHorizontalAccuracyItem(horizontalAccuracy);
        c.setAnnotation(annotation);
        c.setSegments(List.of(segments));
        return c;
    }

    public static AixmSurfaceType AIXMSurface(String id , ValDistanceType horizontalAccuracy, List<NotePropertyType> annotation, Polygon... polygon) {
        AixmSurfaceType s = new AixmSurfaceType();
        s.setId(id);
        s.setPolygon(new ArrayList<>(List.of(polygon)));
        s.setHorizontalAccuracyItem(horizontalAccuracy);
        s.setAnnotation(annotation);
        return s;
    }

    public static AixmElevatedSurfaceType AIXMElevatedSurface(String id , ValDistanceVerticalType elevation, ValDistanceSignedType geoidUndulation, CodeVerticalDatumType verticalDatum, ValDistanceType horizontalAccuracy, ValDistanceType verticalAccuracy, List<NotePropertyType> annotation, Polygon... polygon) {
        AixmElevatedSurfaceType s = new AixmElevatedSurfaceType();
        s.setId(id);
        s.setElevationItem(elevation);
        s.setGeoidUndulationItem(geoidUndulation);
        s.setVerticalDatumItem(verticalDatum);
        s.setHorizontalAccuracyItem(horizontalAccuracy);
        s.setVerticalAccuracyItem(verticalAccuracy);
        s.setHorizontalAccuracyItem(horizontalAccuracy);
        s.setAnnotation(annotation);
        s.setPolygon(new ArrayList<>(List.of(polygon)));
        return s;
    }

        public static GmlPointType GMLPoint(String id, Long index, Pos pos, GeometricType geometricType, GeometricProperty geometricProperty) {
        GmlPointType p = new GmlPointType();
        p.setId(id);
        p.setIndex(index);
        p.setPos(pos);
        p.setGeometricProperty(geometricProperty);
        p.setGeometricType(geometricType);
        return p;
    }

    public static GmlCurveType GMLCurve(String id, Long index, GeometricType geometricType, GeometricProperty geometricProperty, Segment... segments) {
        GmlCurveType c = new GmlCurveType();
        c.setId(id);
        c.setIndex(index);
        c.setSegments(new ArrayList<>(List.of(segments)));
        c.setGeometricType(geometricType);
        c.setGeometricProperty(geometricProperty);
        return c;
    }
    
    public static GmlSurfaceType GMLSurface(String id, Long index, GeometricType geometricType, GeometricProperty geometricProperty, Polygon... polygon) {
        GmlSurfaceType s = new GmlSurfaceType();
        s.setId(id);
        s.setPolygon(new ArrayList<>(List.of(polygon)));
        s.setGeometricType(geometricType);
        s.setGeometricProperty(geometricProperty);
        return s;
    }

    public static Polygon polygon(Long index, Ring exterior, Ring... interior) {
        Polygon s = new Polygon();
        s.setIndex(index);
        s.setExterior(exterior);
        s.setInterior(new ArrayList<>(List.of(interior)));
        return s;
    }

    public static Ring ring(Long index, GmlCurveType... curves) {
        Ring r = new Ring();
        r.setIndex(index);
        r.setGmlCurve(new ArrayList<>(List.of(curves)));
        return r;
    }

    public static Arc arc(Long index, GmlPointType gmlPoint, DistanceType radius, AngleType startAngle, AngleType endAngle) {
        Arc a = new Arc();
        a.setIndex(index);
        a.setSegmentType(SegmentType.ARC);
        a.setGmlPoint(gmlPoint);
        a.setRadius(radius);
        a.setStartAngle(startAngle);
        a.setEndAngle(endAngle);
        return a;
    }

    public static Circle circle(Long index, GmlPointType gmlPoint, DistanceType radius) {
        Circle a = new Circle();
        a.setIndex(index);
        a.setSegmentType(SegmentType.CIRCLE);
        a.setGmlPoint(gmlPoint);
        a.setRadius(radius);
        return a;
    }

    public static LineString line(Long index, PosList posList, GmlPointType... gmlPoints) {
        LineString a = new LineString();
        a.setIndex(index);
        a.setSegmentType(SegmentType.LINE);
        a.setPosList(posList);
        a.setGmlPoint(new ArrayList<>(List.of(gmlPoints)));
        return a;
    }

    public static Geodesic geodesic(Long index, PosList posList, GmlPointType... gmlPoints) {
        Geodesic a = new Geodesic();
        a.setIndex(index);
        a.setSegmentType(SegmentType.GEODESIC);
        a.setPosList(posList);
        a.setGmlPoint(new ArrayList<>(List.of(gmlPoints)));
        return a;
    }

    public static PosList posList(String srsName, String value) {
        PosList p = new PosList();
        p.setSrsName(srsName);
        p.setValue(value);
        return p;
    }

    public static Pos pos(String srsName, String value) {
        Pos p = new Pos();
        p.setSrsName(srsName);
        p.setValue(value);
        return p;
    }

    public static GeometricProperty geometricProperty(String href, String title, HrefType hrefType, String srsName) {
        GeometricProperty gp = new GeometricProperty();
        gp.setHref(href);
        gp.setSrsName(srsName);
        gp.setTitle(title);
        gp.setHrefType(hrefType);
        return gp;
    }

}
