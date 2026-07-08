package com.delorean.aixm.core.util;

import java.util.ArrayList;
import java.util.List;

import com.delorean.aixm.core.gis.type.Arc;
import com.delorean.aixm.core.gis.type.Geodesic;
import com.delorean.aixm.core.gis.type.LineString;
import com.delorean.aixm.core.gis.type.Ring;
import com.delorean.aixm.core.gis.type.Segment;
import com.delorean.aixm.core.gis.type.Circle;
import com.delorean.aixm.core.gis.type.Polygon;
import com.delorean.aixm.core.gis.type.components.AngleType;
import com.delorean.aixm.core.gis.type.components.GeometricType;
import com.delorean.aixm.core.gis.type.components.DistanceType;
import com.delorean.aixm.core.gis.type.components.GeometricProperty;
import com.delorean.aixm.core.gis.type.components.HrefType;
import com.delorean.aixm.core.gis.type.components.Pos;
import com.delorean.aixm.core.gis.type.components.PosList;
import com.delorean.aixm.core.gis.type.components.SegmentType;
import com.delorean.aixm.core.gis.type.gml.GmlCurveType;
import com.delorean.aixm.core.gis.type.gml.GmlPointType;
import com.delorean.aixm.core.gis.type.gml.GmlSurfaceType;


public class GisUtil {

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
