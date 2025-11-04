package com.aixm.delorean.unit.gis;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import org.xmlunit.assertj.XmlAssert;

import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.gml.GmlCurveType;

import java.math.BigDecimal;
import com.aixm.delorean.core.util.DistanceUom;
import com.aixm.delorean.util.GisUtil;
import com.aixm.delorean.util.JaxbUtil;
import com.aixm.delorean.core.util.AngleUom;
import com.aixm.delorean.core.org.gml.v_3_2.CurveType;

import java.util.stream.Stream;

public class CurveGMLTest {

    @BeforeAll
    public static void configureAssertJ() {
        org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
    }
    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseValidGMLCurve() {
        return Stream.of(
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c1" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c1",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        GisUtil.posList(
                            "4326", 
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                )
            ), // urn EPSG:4326 LineStringSegment posList case, lat lon order
            Arguments.of("""
                <gml:Curve srsName="http://www.opengis.net/def/crs/EPSG/0/4326" gml:id="c2" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c2",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                )
            ), // url EPSG:4326 LineStringSegment posList case, lat lon order
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                            <gml:pos>38.89763528280979 -77.03654820204511</gml:pos>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c3",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ), 
                        GisUtil.pointObj(
                            null,
                            1L,
                            GisUtil.pos(
                                "4326",
                                "POINT(38.89763528280979 -77.03654820204511)"
                            ),
                            GeometricType.POS,
                            null
                        )
                    )
                )
            ), // urn EPSG:4326, LineStringSegment list of pos, lat lon order
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c4" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="urn:uuid:d163a00d-609f-4b15-9584-165f12599442" xlink:title="external curve"/>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c4",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "d163a00d-609f-4b15-9584-165f12599442",
                                "external curve",
                                HrefType.UUID,
                                "4326"
                            )
                        )
                    )
                )
            ), // urn EPSG:4326, LineStringSegment list of pos and pointProperty UUID, lat lon order
            Arguments.of("""
                <gml:Curve gml:id="c5" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:LineStringSegment>
                        <gml:LineStringSegment>
                            <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                            <gml:pos> -24.589287528217096 -70.1916580926402</gml:pos>
                        </gml:LineStringSegment>
                        <gml:LineStringSegment>
                            <gml:posList>-24.589287528217096 -70.1916580926402 -33.85704607534651 151.21496554537183</gml:posList>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c5", 
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L, 
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    ),
                    GisUtil.line(
                        1L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(38.89763528280979 -77.03654820204511)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            GisUtil.pos(
                                "4326",
                                "POINT(-24.589287528217096 -70.1916580926402)"
                            ),
                            GeometricType.POS,
                            null
                        )
                    ),
                    GisUtil.line(
                        2L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(-24.589287528217096 -70.1916580926402, -33.85704607534651 151.21496554537183)"
                        )
                    )
                )
            ), // urn EPSG:4326, list of LineStringSegment posList and pos, lat lon order
            Arguments.of("""
                <gml:Curve gml:id="c6" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                            <gml:ArcByCenterPoint numArc="1">
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">0.00000</gml:startAngle>
                                <gml:endAngle uom="deg">90.00000</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c6", 
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null,
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(0.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(90.0));
                            setUom(AngleUom.DEG);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pos , lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c7" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                            <gml:ArcByCenterPoint numArc="1">
                                <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="urn:uuid:d163a00d-609f-4b15-9584-165f12599442" xlink:title="external point"/>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">20.00000</gml:startAngle>
                                <gml:endAngle uom="rad">2</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c7", 
                    null, 
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null, 
                            null, 
                            null,
                            GeometricType.REF, 
                            GisUtil.geometricProperty(
                                "d163a00d-609f-4b15-9584-165f12599442",
                                "external point",
                                HrefType.UUID,
                                "4326"
                            )
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(2.0));
                            setUom(AngleUom.RAD);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty UUID, lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c8" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                            <gml:ArcByCenterPoint numArc="1">
                                <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="#c6" xlink:title="external point"/>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">20.00000</gml:startAngle>
                                <gml:endAngle uom="rad">2</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c8",
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null, 
                            null, 
                            null,
                            GeometricType.REF, 
                            GisUtil.geometricProperty(
                                "c6",
                                "external point",
                                HrefType.XML,
                                "4326"
                            )
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(2.0));
                            setUom(AngleUom.RAD);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty xml, lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c9" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                            <gml:ArcByCenterPoint numArc="1">
                                <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="https://example.com/points/c6" xlink:title="external point"/>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">20.00000</gml:startAngle>
                                <gml:endAngle uom="rad">2</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c9",
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null, 
                            null, 
                            null,
                            GeometricType.REF, 
                            GisUtil.geometricProperty(
                                "https://example.com/points/c6",
                                "external point",
                                HrefType.URL,
                                "4326"
                            )
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(20.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(2.0));
                            setUom(AngleUom.RAD);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty xml, lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c10" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:CircleByCenterPoint numArc="1">
                            <gml:pos>48.8566 2.3522</gml:pos>
                            <gml:radius uom="KM">5</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c10", 
                    null,
                    null,
                    null,
                    GisUtil.circle(
                        0L,
                        GisUtil.pointObj(
                            null,
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(48.8566 2.3522)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty xml, lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c11" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:CircleByCenterPoint numArc="1">
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink"  xlink:type="simple" xlink:href="urn:uuid:d163a00d-609f-4b15-9584-165f12599442" xlink:title="external point"/>
                            <gml:radius uom="KM">5</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c11", 
                    null,
                    null,
                    null,
                    GisUtil.circle(
                        0L,
                        GisUtil.pointObj(
                            null,
                            null,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "d163a00d-609f-4b15-9584-165f12599442",
                                "external point",
                                HrefType.UUID,
                                "4326"
                            )
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty urn, lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c12" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:GeodesicString>
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:GeodesicString>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c12",
                    null,
                    null,
                    null,
                    GisUtil.geodesic(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                )
            ), // urn EPSG:4326, GeodesicString, posList case, lat lon order
            Arguments.of("""
                <gml:Curve gml:id="c13" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:Geodesic>
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:Geodesic>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c13",
                    null,
                    null,
                    null,
                    GisUtil.geodesic(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                )
            ), // urn EPSG:4326, Geodesic, posList case, lat lon order
            Arguments.of("""
                <gml:Curve gml:id="c14" srsName="urn:ogc:def:crs:OGC:1.3:CRS84" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:Geodesic>
                            <gml:posList>13.377717264214601 52.51630693440871 -77.03654820204511 38.89763528280979</gml:posList>
                        </gml:Geodesic>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c14",
                    null,
                    null,
                    null,
                    GisUtil.geodesic(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                )
            ),// urn CRS:84, Geodesic, posList case, lat lon order
            Arguments.of(
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c15" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:CircleByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pointProperty>
                                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c15">
                                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                </gml:Point>
                            </gml:pointProperty>
                            <gml:radius uom="KM">5.0</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>""",
                GisUtil.curveObj(
                    "c15",
                    null,
                    null,
                    null,
                    GisUtil.circle(
                        0L,
                        GisUtil.pointObj(
                            "c15",
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.GML,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                )
            ), // Standard urn case, EPSG:4326, CircleByCenterPoint with pointProperty convertion in pos lat lon order
            Arguments.of(
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c16" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:CircleByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pointProperty>
                                <aixm:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c16">
                                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                    <aixm:horizontalAccuracy uom="M">1</aixm:horizontalAccuracy>
                                </aixm:Point>
                            </gml:pointProperty>
                            <gml:radius uom="KM">5.0</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>""",
                GisUtil.curveObj(
                    "c16",
                    null,
                    null,
                    null,
                    GisUtil.circle(
                        0L,
                        GisUtil.pointObj(
                            "c16",
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.GML,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                )
            ), // Standard urn case, EPSG:4326, CircleByCenterPoint with pointProperty convertion in pos lat lon order
            Arguments.of(
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c17" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:CircleByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pointProperty>
                                <aixm:ElevatedPoint srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c17">
                                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                    <aixm:horizontalAccuracy uom="M">1</aixm:horizontalAccuracy>
                                </aixm:ElevatedPoint>
                            </gml:pointProperty>
                            <gml:radius uom="KM">5.0</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>""",
                GisUtil.curveObj(
                    "c17",
                    null,
                    null,
                    null,
                    GisUtil.circle(
                        0L,
                        GisUtil.pointObj(
                            "c17",
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.GML,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                )
            ),
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c18" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="d163a00d-609f-4b15-9584-165f12599442" xlink:title="external curve"/>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c18",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "d163a00d-609f-4b15-9584-165f12599442",
                                "external curve",
                                HrefType.UUID,
                                "4326"
                            )
                        )
                    )
                )
            ) // urn EPSG:4326, LineStringSegment list of pos and pointProperty raw UUID, lat lon order
        );  
    }

    @ParameterizedTest()
    @MethodSource("ParseValidGMLCurve")
    @DisplayName("Parse valid GML Curves correctly")
    void parseValidGMLCurve(String xml, Curve expectedCurve) throws Exception {

        // given
        CurveType curve = JaxbUtil.loadFromXml(xml, CurveType.class);

        // do
        GmlCurveType parsed = CurveGmlHelper.parseGMLCurve(curve, GmlCurveType.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedCurve);

    }

    static Stream<Arguments> MarshallValidGMLCurve() {
        return Stream.of(
            Arguments.of(
                GisUtil.curveObj(
                    "m1",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m1" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:LineStringSegment interpolation="linear">
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, LineStringSegment lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m2",
                    null,
                    null,
                    null,
                    GisUtil.geodesic(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m2" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:GeodesicString interpolation="geodesic">
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                        </gml:GeodesicString>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, GeodesicString lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m3",
                    null,
                    null,
                    null,
                    GisUtil.circle(
                        0L,
                        GisUtil.pointObj(
                            null,
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal("5.0"));
                            setUom(DistanceUom.KM);
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m3" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:CircleByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                            <gml:radius uom="KM">5.0</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, CircleByCenterPoint lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m4",
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal("20.0"));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(0.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(90.0));
                            setUom(AngleUom.DEG);
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m4" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:ArcByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                            <gml:radius uom="NM">20.0</gml:radius>
                            <gml:startAngle uom="deg">0.0</gml:startAngle>
                            <gml:endAngle uom="deg">90.0</gml:endAngle>
                        </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, ArcByCenterPoint lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m5",
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            "m5",
                            null,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.GML,
                            null
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal("20.0"));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(0.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(90.0));
                            setUom(AngleUom.DEG);
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m5" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:ArcByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m5">
                                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                </gml:Point>
                            </gml:pointProperty>
                            <gml:radius uom="NM">20.0</gml:radius>
                            <gml:startAngle uom="deg">0.0</gml:startAngle>
                            <gml:endAngle uom="deg">90.0</gml:endAngle>
                        </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, ArcByCenterPoint with pointProperty lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m6",
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null,
                            null,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "d163a00d-609f-4b15-9584-165f12599442",
                                "external point",
                                HrefType.UUID,
                                "4326"
                            )
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal("20.0"));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(0.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(90.0));
                            setUom(AngleUom.DEG);
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m6" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:ArcByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="urn:uuid:d163a00d-609f-4b15-9584-165f12599442" xlink:title="external point"/>
                            <gml:radius uom="NM">20.0</gml:radius>
                            <gml:startAngle uom="deg">0.0</gml:startAngle>
                            <gml:endAngle uom="deg">90.0</gml:endAngle>
                        </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, ArcByCenterPoint with pointProperty as reference
            Arguments.of(
                GisUtil.curveObj(
                    "m7",
                    null,
                    null,
                    null,
                    GisUtil.arc(
                        0L,
                        GisUtil.pointObj(
                            null,
                            null,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "c6",
                                "external point",
                                HrefType.XML,
                                "4326"
                            )
                        ),
                        new DistanceType() {{
                            setValue(new BigDecimal("20.0"));
                            setUom(DistanceUom.NM);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(0.0));
                            setUom(AngleUom.DEG);
                        }},
                        new AngleType() {{
                            setValue(new BigDecimal(90.0));
                            setUom(AngleUom.DEG);
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m7" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:message="http://www.aixm.aero/schema/5.2/message" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:aixm="http://www.aixm.aero/schema/5.2">
                    <gml:segments>
                        <gml:ArcByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="#c6" xlink:title="external point"/>
                            <gml:radius uom="NM">20.0</gml:radius>
                            <gml:startAngle uom="deg">0.0</gml:startAngle>
                            <gml:endAngle uom="deg">90.0</gml:endAngle>
                        </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>""" 
            ), // Standard urn case, EPSG:4326, ArcByCenterPoint with pointProperty as XML reference
            Arguments.of(
                GisUtil.curveObj(
                    "m8",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        GisUtil.posList(
                            "4326",
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, 14.54568750430526 28.52536136261256)"
                        )
                    )
                )
                ,
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m8" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment interpolation="linear">
                            <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 14.54568750430526 28.52536136261256</gml:posList>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>"""
            ),
            Arguments.of(
                GisUtil.curveObj(
                    "m9",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            GisUtil.pos(
                                "4326",
                                "POINT(38.89763528280979 -77.03654820204511)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            2L,
                            GisUtil.pos(
                                "4326",
                                "POINT(14.54568750430526 28.52536136261256)"
                            ),
                            GeometricType.POS,
                            null
                        )
                    )
                )
                ,
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m9" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment interpolation="linear">
                            <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                            <gml:pos>38.89763528280979 -77.03654820204511</gml:pos>
                            <gml:pos>14.54568750430526 28.52536136261256</gml:pos>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>"""
            ),
            Arguments.of(
                GisUtil.curveObj(
                    "m10",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            "m10",
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.GML,
                            null
                        ),
                        GisUtil.pointObj(
                            "m10",
                            1L,
                            GisUtil.pos(
                                "4326",
                                "POINT(38.89763528280979 -77.03654820204511)"
                            ),
                            GeometricType.GML,
                            null
                        ),
                        GisUtil.pointObj(
                            "m10",
                            2L,
                            GisUtil.pos(
                                "4326",
                                "POINT(14.54568750430526 28.52536136261256)"
                            ),
                            GeometricType.GML,
                            null
                        )
                    )
                )
                ,
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m10" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment interpolation="linear">
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m10">
                                    <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                </gml:Point>
                            </gml:pointProperty>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m10">
                                    <gml:pos>38.89763528280979 -77.03654820204511</gml:pos>
                                </gml:Point>
                            </gml:pointProperty>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326" gml:id="m10">
                                    <gml:pos>14.54568750430526 28.52536136261256</gml:pos>
                                </gml:Point>
                            </gml:pointProperty>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>"""
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("MarshallValidGMLCurve")
    @DisplayName("Marshall valid GML Curves correctly")
    void marshallValidGMLCurve(GmlCurveType value, String expectedXml) throws Exception {


        // given
        CurveType printed = CurveGmlHelper.printGMLCurve(value, CurveType.class);

        // do
        String xml = JaxbUtil.printToXml(printed, CurveType.class);
    
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

    static Stream<Arguments> ParseErroneousGMLCurve() {
        return Stream.of(
            Arguments.of("""
                    <gml:Curve gml:id="c1" xmlns:gml="http://www.opengis.net/gml/3.2">  
                        <gml:segments>
                            <gml:LineStringSegment>
                                <gml:pos srsName="urn:ogc:def:crs:EPSG::4258">52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos srsName="urn:ogc:def:crs:EPSG::4326">38.89763528280979 -77.03654820204511</gml:pos>
                            </gml:LineStringSegment>
                        </gml:segments>
                    </gml:Curve>
                    """
            ), // missing geometry srsName
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::9999" gml:id="c2" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:LineStringSegment>
                                <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                            </gml:LineStringSegment>
                        </gml:segments>
                    </gml:Curve>
                    """
            ), // unsupported srsName
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:LineStringSegment>
                                <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:pos> -24.589287528217096 -70.1916580926402</gml:pos>
                            </gml:LineStringSegment>
                        </gml:segments>
                    </gml:Curve>
            """), // use of posList and pos
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:ArcStringByBulge>
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:pos> -24.589287528217096 -70.1916580926402</gml:pos>
                            </gml:ArcStringByBulge>
                        </gml:segments>
                    </gml:Curve>
            """), // use of ArcStringByBulge
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:ArcString>
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:pos> -24.589287528217096 -70.1916580926402</gml:pos>
                            </gml:ArcString>
                        </gml:segments>
                    </gml:Curve>
            """), // use of ArcString
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:Arc>
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:pos> -24.589287528217096 -70.1916580926402</gml:pos>
                            </gml:Arc>
                        </gml:segments>
                    </gml:Curve>
            """), // use of Arc
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:BSpline>
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:degree>2</gml:degree>
                                <gml:knot>0</gml:knot>
                            </gml:BSpline>
                        </gml:segments>
                    </gml:Curve>
            """), // use of BSpline
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:Bezier>
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:degree>2</gml:degree>
                                <gml:knot>0</gml:knot>
                            </gml:Bezier>
                        </gml:segments>
                    </gml:Curve>
            """), // use of Bezier
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:Circle>
                                <gml:pos>52.51630693440871 13.377717264214601</gml:pos>
                                <gml:pos> 38.89763528280979 -77.03654820204511</gml:pos>
                                <gml:pos> -24.589287528217096 -70.1916580926402</gml:pos>
                            </gml:Circle>
                        </gml:segments>
                    </gml:Curve>
            """), // use of Circle
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:Clothoid>
                            </gml:Clothoid>
                        </gml:segments>
                    </gml:Curve>
            """), // use of Clothoid
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:CubicSpline>
                            </gml:CubicSpline>
                        </gml:segments>
                    </gml:Curve>
            """), // use of CubicSpline
            Arguments.of("""
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c3" xmlns:gml="http://www.opengis.net/gml/3.2">
                        <gml:segments>
                            <gml:OffsetCurve>
                            </gml:OffsetCurve>
                        </gml:segments>
                    </gml:Curve>
            """), // use of OffsetCurve¨
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c1" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="id1" xlink:title="external point"/>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="#c6" xlink:title="external point"/>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
            """), // Mallformed pointProperty references
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c1" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="urd:uuid:52z80d3b-5f40-424e-bee4-392cc186a0c2" xlink:title="external point"/>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="#c6" xlink:title="external point"/>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
            """), // Mallformed pointProperty references
            Arguments.of("""
                <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c1" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                        <gml:LineStringSegment>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="C:/Users/rapha/Downloads" xlink:title="external point"/>
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple" xlink:href="#c6" xlink:title="external point"/>
                        </gml:LineStringSegment>
                    </gml:segments>
                </gml:Curve>
            """) // Mallformed pointProperty references
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseErroneousGMLCurve")
    @DisplayName("Reject erroneous GML Curves")
    void parseErroneousGMLCurve(String xml) throws Exception {

        // given
        CurveType curve = JaxbUtil.loadFromXml(xml, CurveType.class);

        // do + check
        assertThatThrownBy(() -> CurveGmlHelper.parseGMLCurve(curve, Curve.class))
            .isInstanceOf(IllegalArgumentException.class);
    }

    static Stream<Arguments> PrintErroneousGMLCurve() {
        return Stream.of(
            Arguments.of(
                (GmlCurveType) null
            ), // null AIXMCurveType
            Arguments.of(
                GisUtil.curveObj(
                    null, 
                    null, 
                    null, 
                    null)
            ), // empty AIXMCurveType
            Arguments.of(
                GisUtil.curveObj(
                    "m3",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        GisUtil.posList(
                            null,
                            "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)"
                        )
                    )
                )
            ), // missing srsName in posList
            Arguments.of(
                GisUtil.curveObj(
                    "m4",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                null,
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            GisUtil.pos(
                                null,
                                "POINT(38.89763528280979 -77.03654820204511)"
                            ),
                            GeometricType.POS,
                            null
                        )
                    )
                )
            ), // missing srsName in pos
            Arguments.of(
                GisUtil.curveObj(
                    "m5",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            GisUtil.pos(
                                "4326",
                                "POINT(52.51630693440871 13.377717264214601)"
                            ),
                            GeometricType.POS,
                            null
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            GisUtil.pos(
                                null,
                                "POINT(38.89763528280979 -77.03654820204511)"
                            ),
                            GeometricType.POS,
                            null
                        )
                    )
                )
            ), // missing srsName in pos
            Arguments.of(
                GisUtil.curveObj(
                    "m6",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "urn:uuid:d163a00d-609f-4b15-9584-165f12599442",
                                "external point",
                                HrefType.URN,
                                null
                            )
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            null,
                            GeometricType.REF,
                                GisUtil.geometricProperty(
                                "c6",
                                "external point",
                                HrefType.XML,
                                null
                            )
                        )
                    )
                )
            ), // missing srsName in reference
            Arguments.of(
                GisUtil.curveObj(
                    "m7",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "urn:uuid:d163a00d-609f-4b15-9584-165f12599442",
                                "external point",
                                HrefType.URN,
                                "4326"
                            )
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "c6",
                                "external point",
                                HrefType.XML,
                                null
                            )
                        )
                    )
                )
            ), // missing srsName in reference
            Arguments.of(
                GisUtil.curveObj(
                    "m8",
                    null,
                    null,
                    null,
                    GisUtil.line(
                        0L,
                        null,
                        GisUtil.pointObj(
                            null,
                            0L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                "c7",
                                "external point",
                                HrefType.XML,
                                "4326"
                            )
                        ),
                        GisUtil.pointObj(
                            null,
                            1L,
                            null,
                            GeometricType.REF,
                            GisUtil.geometricProperty(
                                null,
                                "external point",
                                HrefType.XML,
                                "4326"
                            )
                        )
                    )
                )
           ) // reference is null
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintErroneousGMLCurve")
    @DisplayName("Reject erroneous GML Curves")
    void marshallErroneousGMLCurve(GmlCurveType value) throws Exception {
                
        // given + do + check
        assertThatThrownBy(() -> CurveGmlHelper.printGMLCurve(value, CurveType.class))
            .isInstanceOf(IllegalArgumentException.class);
    }

}   