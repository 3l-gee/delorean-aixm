package com.aixm.delorean.util;

import java.util.List;

import com.aixm.delorean.core.gis.type.Arc;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Geodesic;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.Ring;
import com.aixm.delorean.core.gis.type.Segment;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.Circle;
import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.ContentType;
import com.aixm.delorean.core.gis.type.components.CurveProperty;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.PointProperty;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.components.SegmentType;


public class GisUtil {

    public static Point point(String id, Pos pos) {
        Point p = new Point();
        p.setId(id);
        p.setPos(pos);
        return p;
    }
    
    public static Surface surface(String id, Ring exterior, Ring... interior) {
        Surface s = new Surface();
        s.setId(id);
        s.setExterior(exterior);
        s.setInterior(List.of(interior));
        return s;
    }

    public static Ring ring(long index, Curve... curves) {
        Ring r = new Ring();
        r.setIndex(index);
        r.setCurves(List.of(curves));
        return r;
    }

    public static Curve curveObj(String id, long index, Segment... segments) {
        Curve c = new Curve();
        c.setId(id);
        c.setIndex(index);
        c.setSegments(List.of(segments));
        c.setContentType(ContentType.OBJECT);
        return c;
    }

    public static Curve curveRef(String id, long index, CurveProperty curveProperty) {
        Curve c = new Curve();
        c.setId(id);
        c.setIndex(index);
        c.setCurveProperty(curveProperty);
        c.setContentType(ContentType.REFERENCE);
        return c;
    }

    public static Arc arcObj( long index, Pos pos, DistanceType radius, AngleType startAngle, AngleType endAngle) {
        Arc a = new Arc();
        a.setIndex(index);
        a.setSegmentType(SegmentType.ARC);
        a.setPos(pos);
        a.setRadius(radius);
        a.setStartAngle(startAngle);
        a.setEndAngle(endAngle);
        a.setContentType(ContentType.OBJECT);
        return a;
    }

    public static Arc arcRef(long index, PointProperty pointProperty, DistanceType radius, AngleType startAngle, AngleType endAngle) {
        Arc a = new Arc();
        a.setIndex(index);
        a.setSegmentType(SegmentType.ARC);
        a.setPointProperty(pointProperty);
        a.setRadius(radius);
        a.setStartAngle(startAngle);
        a.setEndAngle(endAngle);
        a.setContentType(ContentType.REFERENCE);
        return a;
    }

    public static Circle circleObj(long index, Pos pos, DistanceType radius) {
        Circle a = new Circle();
        a.setIndex(index);
        a.setSegmentType(SegmentType.CIRCLE);
        a.setPos(pos);
        a.setRadius(radius);
        a.setContentType(ContentType.OBJECT);
        return a;
    }

    public static Circle circleRef(long index, PointProperty pointProperty, DistanceType radius) {
        Circle a = new Circle();
        a.setIndex(index);
        a.setSegmentType(SegmentType.CIRCLE);
        a.setPointProperty(pointProperty);
        a.setRadius(radius);
        a.setContentType(ContentType.REFERENCE);
        return a;
    }

    public static LineString linePosList(long index, PosList posList) {
        LineString a = new LineString();
        a.setIndex(index);
        a.setSegmentType(SegmentType.LINE);
        a.setPosList(posList);
        a.setContentType(ContentType.OBJECT);
        return a;
    }

    public static LineString linePosProp(long index, List<Pos> pos, List<PointProperty> pointProperty, ContentType contentType) {
        LineString a = new LineString();
        a.setIndex(index);
        a.setSegmentType(SegmentType.LINE);
        a.setPos(pos);
        a.setPointProperty(pointProperty);
        a.setContentType(contentType);
        return a;
    }

    public static Geodesic geodesicPosList(long index, PosList posList) {
        Geodesic a = new Geodesic();
        a.setIndex(index);
        a.setSegmentType(SegmentType.GEODESIC);
        a.setPosList(posList);
        a.setContentType(ContentType.OBJECT);
        return a;
    }

    public static Geodesic geodesicPosProp(long index, List<Pos> pos, List<PointProperty> pointProperty, ContentType contentType) {
        Geodesic a = new Geodesic();
        a.setIndex(index);
        a.setSegmentType(SegmentType.GEODESIC);
        a.setPos(pos);
        a.setPointProperty(pointProperty);
        a.setContentType(contentType);
        return a;
    }

    public static Pos pos (String srsName, String value) {
        Pos p = new Pos();
        p.setSrsName(srsName);
        p.setValue(value);
        return p;
    }

    public static PosList posList (String srsName, String value) {
        PosList p = new PosList();
        p.setSrsName(srsName);
        p.setValue(value);
        return p;
    }

    public static PointProperty pointProperty(Long index, String href, String title, HrefType hrefType) {
        PointProperty pp = new PointProperty();
        pp.setIndex(index);
        pp.setHref(href);
        pp.setTitle(title);
        pp.setHrefType(hrefType);
        return pp;
    }
}
