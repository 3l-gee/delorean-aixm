package com.aixm.delorean.aixm511.util;

import java.util.List;

import com.aixm.delorean.aixm511.gis.type.AixmCurveType;
import com.aixm.delorean.aixm511.gis.type.AixmPointType;
import com.aixm.delorean.aixm511.gis.type.AixmSurfaceType;
import com.aixm.delorean.aixm511.schema.ValDistanceType;
import com.aixm.delorean.aixm511.schema.NotePropertyType;
import com.aixm.delorean.core.gis.type.Arc;
import com.aixm.delorean.core.gis.type.Geodesic;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.Ring;
import com.aixm.delorean.core.gis.type.Segment;
import com.aixm.delorean.core.gis.type.Circle;
import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.GeometricProperty;
import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.components.SegmentType;
import com.aixm.delorean.core.gis.type.gml.GmlCurveType;
import com.aixm.delorean.core.gis.type.gml.GmlPointType;
import com.aixm.delorean.core.gis.type.gml.GmlSurfaceType;

public class GisAIXM511Util {

    public static AixmPointType AIXMPoint(String id , Pos pos, ValDistanceType horizontalAccuracy, List<NotePropertyType> annotation) {
        AixmPointType p = new AixmPointType();
        p.setId(id);
        p.setPos(pos);
        p.setHorizontalAccuracyItem(horizontalAccuracy);
        p.setAnnotation(annotation);
        return p;
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

    public static AixmCurveType AIXMCurve(String id , ValDistanceType horizontalAccuracy, List<NotePropertyType> annotation, Segment... segments) {
        AixmCurveType c = new AixmCurveType();
        c.setId(id);
        c.setSegments(List.of(segments));
        c.setHorizontalAccuracyItem(horizontalAccuracy);
        c.setAnnotation(annotation);
        return c;
    }

    public static GmlCurveType GMLCurve(String id, Long index, GeometricType geometricType, GeometricProperty geometricProperty, Segment... segments) {
        GmlCurveType c = new GmlCurveType();
        c.setId(id);
        c.setIndex(index);
        c.setSegments(List.of(segments));
        c.setGeometricType(geometricType);
        c.setGeometricProperty(geometricProperty);
        return c;
    }

    public static AixmSurfaceType AIXMSurface(String id , Ring exterior, ValDistanceType horizontalAccuracy, List<NotePropertyType> annotation, Ring... interior) {
        AixmSurfaceType s = new AixmSurfaceType();
        s.setId(id);
        s.setExterior(exterior);
        s.setInterior(List.of(interior));
        s.setHorizontalAccuracyItem(horizontalAccuracy);
        s.setAnnotation(annotation);
        return s;
    }
    
    public static GmlSurfaceType GMLSurface(String id, Long index, Ring exterior, GeometricType geometricType, GeometricProperty geometricProperty, Ring... interior) {
        GmlSurfaceType s = new GmlSurfaceType();
        s.setId(id);
        s.setExterior(exterior);
        s.setInterior(List.of(interior));
        s.setGeometricType(geometricType);
        s.setGeometricProperty(geometricProperty);
        return s;
    }

    public static Ring ring(Long index, GmlCurveType... curves) {
        Ring r = new Ring();
        r.setIndex(index);
        r.setGmlCurve(List.of(curves));
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
        a.setGmlPoint(List.of(gmlPoints));
        return a;
    }

    public static Geodesic geodesic(Long index, PosList posList, GmlPointType... gmlPoints) {
        Geodesic a = new Geodesic();
        a.setIndex(index);
        a.setSegmentType(SegmentType.GEODESIC);
        a.setPosList(posList);
        a.setGmlPoint(List.of(gmlPoints));
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
