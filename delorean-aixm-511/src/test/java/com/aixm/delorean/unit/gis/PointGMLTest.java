package com.aixm.delorean.unit.gis;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import org.xmlunit.assertj.XmlAssert;

import com.aixm.delorean.aixm511.gis.helper.PointGmlHelper;
import com.aixm.delorean.aixm511.gis.type.Point;
import com.aixm.delorean.aixm511.gis.type.components.GeometricType;
import com.aixm.delorean.aixm511.gis.type.gml.GmlPointType;
import com.aixm.delorean.aixm511.org.gml.v_3_2.PointType;
import com.aixm.delorean.util.GisUtil;
import com.aixm.delorean.util.JaxbUtil;

import java.util.stream.Stream;

public class PointGMLTest {

    @BeforeAll
	public static void configureAssertJ() {
		org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
	}
    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseValidGMLPoints() {
        return Stream.of(
            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="p1" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                </gml:Point>
            """,
            GisUtil.pointObj(
                "p1",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601)"   
                ),
                null,
                null
            )
            ), // Standard urn case, EPSG:4326, lat lon order

            Arguments.of("""
                <gml:Point srsName="https://www.opengis.net/def/crs/EPSG/0/4326" gml:id="p2" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                </gml:Point>
            """,
            GisUtil.pointObj(
                "p2",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601)"   
                ),
                null,
                null
            )
            ), // Standard https case, EPSG:4326, lat lon order

            Arguments.of("""
                <gml:Point srsName="http://www.opengis.net/def/crs/EPSG/0/4326" gml:id="p3" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                </gml:Point>
            """,
            GisUtil.pointObj(
                "p3",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                null,
                null
            )
            ), // Standard http case, EPSG:4326, lat lon order

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4258" gml:id="p4" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                </gml:Point>
            """,
            GisUtil.pointObj(
                "p4",
                null,
                GisUtil.pos(
                    "4258",
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                null,
                null
            )
            ), // Standard case, EPSG:4258, lat lon order

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:OGC:1.3:CRS84" gml:id="p5" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>13.377717264214601 52.51630693440871</gml:pos>
                </gml:Point>
            """,
            GisUtil.pointObj(
                "p5",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                null,
                null
            )
            ) // Special case, OGC:1.3:CRS84, lon lat order
        );
    }
    
    @ParameterizedTest()
    @MethodSource("ParseValidGMLPoints")
    @DisplayName("Parse valid GML Points correctly")
    void parseValidGMLPoint(String xml, GmlPointType expectedPoint) throws Exception {

        // given
        PointType point = JaxbUtil.loadFromXml(xml, PointType.class);

        // do
        GmlPointType parsed = PointGmlHelper.parseGMLPoint(point, GmlPointType.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedPoint);
    }

    static Stream<Arguments> PrintValidGMLPoints() {
    return Stream.of(
        Arguments.of(
            GisUtil.pointObj(
                "p1",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                null,
                null
            ),
            """
            <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="p1" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
            </gml:Point>"""
        ),
        Arguments.of(
            GisUtil.pointObj(
                "p2",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                null,
                null
            ),
            """
            <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="p2" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
            </gml:Point>"""
        )
    );
    };

    @ParameterizedTest()
    @MethodSource("PrintValidGMLPoints")
    @DisplayName("Print valid GML Points correctly")
    void marshallValidGMLPoints(Point value, String expectedXml) throws Exception {

        // given
        PointType printed = PointGmlHelper.printGMLPoint(value, PointType.class);

        //do
        String xml = JaxbUtil.printToXml(printed, PointType.class);

        //check
        XmlAssert.assertThat(xml)
            .and(expectedXml)
            .ignoreWhitespace()
            .ignoreComments()
            .areIdentical();
    }

    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseErroneousGMLPoints() {
        return Stream.of(
            Arguments.of("""
                <gml:Point xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                </gml:Point>
            """), // missing srsName

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::9999" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                </gml:Point>
            """), // unsupported EPSG

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.3</gml:pos>
                    <gml:coordinates>52.51630693440871 13.377717264214601</gml:coordinates>
                </gml:Point>
            """), // both pos & coordinates

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:coordinates>52.51630693440871 13.377717264214601</gml:coordinates>
                </gml:Point>
            """), // deprecated use of coordinates

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                </gml:Point>
            """) // missing pos/coordinates entirely
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseErroneousGMLPoints")
    @DisplayName("Reject erroneous GML Points")
    void parseErroneousGMLPoint(String xml) throws Exception {

        // given
        PointType point = JaxbUtil.loadFromXml(xml, PointType.class);

        // do + check
        assertThatThrownBy(() -> PointGmlHelper.parseGMLPoint(point, Point.class))
            .isInstanceOf(IllegalArgumentException.class);
    }
    
    static Stream<Arguments> PrintErroneousGMLPoints() {
    return Stream.of(
        Arguments.of(
            (GmlPointType) null
        ), // null  AIXMPointType

        Arguments.of(
            GisUtil.pointObj(
                "p1",
                null,
                null,
                null,
                null
            )
        ), // Empty AIXMPointType

        Arguments.of(
            GisUtil.pointObj(
                "p3",
                null,
                GisUtil.pos(
                    "4326",
                    null
                ),
                GeometricType.GML,
                null
            )
        ), // missing wkt

        Arguments.of(
            GisUtil.pointObj(
                "p4",
                null,
                GisUtil.pos(
                    "4326",
                    "POINT(52.51630693440871 13.377717264214601"
                ),
                GeometricType.GML,
                null
            )
        ), // malformed wkt

        Arguments.of(
             GisUtil.pointObj(
                "p5",
                null,
                GisUtil.pos(
                    null,
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                GeometricType.GML,
                null
            )
        ), // missing srs

        Arguments.of(
            GisUtil.pointObj(
                "p6",
                null,
                GisUtil.pos(
                    "2056",
                    "POINT(52.51630693440871 13.377717264214601)"
                ),
                GeometricType.GML,
                null
            )
        ) // wrong srs
    );
    };

    @ParameterizedTest()
    @MethodSource("PrintErroneousGMLPoints")
    @DisplayName("Reject erroneous GML Points")
    void marshallErroneousGMLPoints(Point value) throws Exception {

        // given + do + check
        assertThatThrownBy(() -> PointGmlHelper.printGMLPoint(value, PointType.class))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
