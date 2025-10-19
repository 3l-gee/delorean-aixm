package com.aixm.delorean.unit.gis;

import static org.junit.Assert.assertThat;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.namespace.QName;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Ring;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.components.SegmentType;
import com.aixm.delorean.core.gis.type.components.CurveProperty;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.PointProperty;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.ContentType;
import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.Segment;
import com.aixm.delorean.core.gis.type.Arc;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.Geodesic;
import com.aixm.delorean.core.org.gml.v_3_2.SurfaceType;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class SurfaceGMLTest {

    @SuppressWarnings("unchecked")
    private static <T> T loadFromXml(String xml, Class<T> type) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Object result = unmarshaller.unmarshal(new StringReader(xml));
        if (result instanceof JAXBElement<?>) {
            return (T) ((JAXBElement<?>) result).getValue();
        }
        return type.cast(result);
    }

    private static <T> String saveToXml(T object, Class<T> type) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter writer = new StringWriter();

        if (!type.isAnnotationPresent(jakarta.xml.bind.annotation.XmlRootElement.class)) {
            String localName = type.getSimpleName().replace("Type", "");
            QName qName = new QName("http://www.opengis.net/gml/3.2", localName);   
            JAXBElement<T> root = new JAXBElement<>(qName, type, object);
            marshaller.marshal(root, writer);
        } else {
            marshaller.marshal(object, writer);
        }

        return writer.toString().trim();
    }

    private static Surface surface(String id, Ring exterior, Ring... interior) {
        Surface s = new Surface();
        s.setId(id);
        s.setExterior(exterior);
        s.setInterior(List.of(interior));
        return s;
    }

    private static Ring ring(long index, Curve... curves) {
        Ring r = new Ring();
        r.setIndex(index);
        r.setCurves(List.of(curves));
        return r;
    }

    private static Curve curveObj(String id, long index, Segment... segments) {
        Curve c = new Curve();
        c.setId(id);
        c.setIndex(index);
        c.setSegments(List.of(segments));
        c.setContentType(ContentType.OBJECT);
        return c;
    }

    private static Curve curveRef(String id, long index, CurveProperty curveProperty) {
        Curve c = new Curve();
        c.setId(id);
        c.setIndex(index);
        c.setCurveProperty(curveProperty);
        c.setContentType(ContentType.REFERENCE);
        return c;
    }

    private static Arc arcObj( long index, Pos pos, DistanceType radius, AngleType startAngle, AngleType endAngle) {
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

    private static Arc arcRef(long index, PointProperty pointProperty, DistanceType radius, AngleType startAngle, AngleType endAngle) {
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

    private static Arc circleObj(long index, Pos pos, DistanceType radius) {
        Arc a = new Arc();
        a.setIndex(index);
        a.setSegmentType(SegmentType.CIRCLE);
        a.setPos(pos);
        a.setRadius(radius);
        a.setContentType(ContentType.OBJECT);
        return a;
    }

    private static Arc circleRef(long index, PointProperty pointProperty, DistanceType radius) {
        Arc a = new Arc();
        a.setIndex(index);
        a.setSegmentType(SegmentType.CIRCLE);
        a.setPointProperty(pointProperty);
        a.setRadius(radius);
        a.setContentType(ContentType.REFERENCE);
        return a;
    }

    private static LineString linePosList(long index, PosList posList) {
        LineString a = new LineString();
        a.setIndex(index);
        a.setSegmentType(SegmentType.LINE);
        a.setPosList(posList);
        return a;
    }

    private static LineString linePosProp(long index, List<Pos> pos, List<PointProperty> pointProperty) {
        LineString a = new LineString();
        a.setIndex(index);
        a.setSegmentType(SegmentType.LINE);
        a.setPos(pos);
        a.setPointProperty(pointProperty);
        return a;
    }

    private static Geodesic geodesicPosList(long index, PosList posList) {
        Geodesic a = new Geodesic();
        a.setIndex(index);
        a.setSegmentType(SegmentType.GEODESIC);
        a.setPosList(posList);
        return a;
    }

    private static Geodesic geodesicPosProp(long index, List<Pos> pos, List<PointProperty> pointProperty) {
        Geodesic a = new Geodesic();
        a.setIndex(index);
        a.setSegmentType(SegmentType.GEODESIC);
        a.setPos(pos);
        a.setPointProperty(pointProperty);
        return a;
    }

    private static Pos pos (String srsName, String value) {
        Pos p = new Pos();
        p.setSrsName(srsName);
        p.setValue(value);
        return p;
    }

    private static PosList posList (String srsName, String value) {
        PosList p = new PosList();
        p.setSrsName(srsName);
        p.setValue(value);
        return p;
    }

    private static PointProperty pointProperty(Long index, String href, String title, HrefType hrefType) {
        PointProperty pp = new PointProperty();
        pp.setIndex(index);
        pp.setHref(href);
        pp.setTitle(title);
        pp.setHrefType(hrefType);
        return pp;
    }

    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseValidGMLSurface() {
        return Stream.of(
            Arguments.of(
                """
                <gml:Surface gml:id="s1" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:patches>
                        <gml:PolygonPatch>
                            <gml:exterior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="c1">
                                            <gml:segments>
                                                <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """,
                surface(
                    "s1",
                    ring(0,
                        curveObj("c1", 0,
                            geodesicPosList("gs1", 0,
                                posList("urn:ogc:def:crs:EPSG::4326", "52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601")
                            )
                        )
                    )
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseValidGMLSurface")
    @DisplayName("Parse valid GML Surfaces correctly")
    void ParseValidGMLSurface(String xml, Surface expectedSurface) throws Exception {

        // given
        SurfaceType surface = loadFromXml(xml, SurfaceType.class);

        // do
        Surface parsed = SurfaceGmlHelper.parseGMLSurface(surface, Surface.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedSurface);

    }

    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------
    
}
