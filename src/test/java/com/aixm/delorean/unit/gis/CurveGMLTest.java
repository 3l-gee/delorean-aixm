package com.aixm.delorean.unit.gis;

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
import com.aixm.delorean.core.gis.type.components.PointProperty;
import com.aixm.delorean.core.gis.type.components.Pos;
import com.aixm.delorean.core.gis.type.components.PosList;
import com.aixm.delorean.core.gis.type.components.ContentType;

import java.math.BigDecimal;
import com.aixm.delorean.core.util.DistanceUom;
import com.aixm.delorean.util.GisUtil;
import com.aixm.delorean.util.JaxbUtil;
import com.aixm.delorean.core.util.AngleUom;
import com.aixm.delorean.core.org.gml.v_3_2.CurveType;

import java.util.stream.Stream;

import java.util.List;


public class CurveGMLTest {

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
                    0L,
                    GisUtil.linePosList(0L,
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
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
                    0L,
                        GisUtil.linePosList(0L,
                            new PosList() {{
                                setSrsName("4326");
                                setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                            }}
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
                    0L,
                    GisUtil.linePosProp(
                        0L,
                        List.of(
                            new Pos() {{
                                setIndex(0L);
                                setSrsName("4326");
                                setValue("POINT(52.51630693440871 13.377717264214601)");
                            }},
                            new Pos() {{
                                setIndex(1L);
                                setSrsName("4326");
                                setValue("POINT(38.89763528280979 -77.03654820204511)");
                            }}
                        ),
                        List.of(),
                        ContentType.OBJECT
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
                    0L,
                    GisUtil.linePosProp(
                        0L,
                        List.of(
                            new Pos() {{
                                setIndex(0L);
                                setSrsName("4326");
                                setValue("POINT(52.51630693440871 13.377717264214601)");
                            }}
                        ),
                        List.of(
                            new PointProperty() {{
                                setIndex(1L);
                                setHref("d163a00d-609f-4b15-9584-165f12599442");
                                setTitle("external curve");
                                setHrefType(HrefType.URN);
                            }}
                        ),
                        ContentType.REFERENCE
                    )
                )
            ), // urn EPSG:4326, LineStringSegment list of pos and pointProperty, lat lon order
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
                    0L,
                    GisUtil.linePosList(0, 
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
                    ),
                    GisUtil.linePosProp(1, 
                        List.of(
                            new Pos() {{
                                setIndex(0L);
                                setSrsName("4326");
                                setValue("POINT(38.89763528280979 -77.03654820204511)");
                            }},
                            new Pos() {{
                                setIndex(1L);
                                setSrsName("4326");
                                setValue("POINT(-24.589287528217096 -70.1916580926402)");
                            }}
                        ),
                        List.of(),
                        ContentType.OBJECT
                    ),
                    GisUtil.linePosList(2, 
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(-24.589287528217096 -70.1916580926402, -33.85704607534651 151.21496554537183)");
                        }}
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
                    0, 
                    GisUtil.arcObj(
                        0L,
                        new Pos() {{
                            setIndex(0L);
                            setSrsName("4326");
                            setValue("POINT(52.51630693440871 13.377717264214601)");
                        }},
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
                                <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="urn:uuid:d163a00d-609f-4b15-9584-165f12599442" xlink:title="external point"/>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">20.00000</gml:startAngle>
                                <gml:endAngle uom="rad">2</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c7", 
                    0, 
                    GisUtil.arcRef(
                        0L,
                        new PointProperty() {{
                            setIndex(0L);
                            setHref("d163a00d-609f-4b15-9584-165f12599442");
                            setTitle("external point");
                            setHrefType(HrefType.URN);
                        }},
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
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty urn, lat lon case
            Arguments.of("""
                <gml:Curve gml:id="c8" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:segments>
                            <gml:ArcByCenterPoint numArc="1">
                                <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#c6" xlink:title="external point"/>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">20.00000</gml:startAngle>
                                <gml:endAngle uom="rad">2</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c8",
                    0,
                    GisUtil.arcRef(
                        0L,
                        new PointProperty() {{
                            setIndex(0L);
                            setHref("c6");
                            setTitle("external point");
                            setHrefType(HrefType.XML);
                        }},
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
                                <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="https://example.com/points/c6" xlink:title="external point"/>
                                <gml:radius uom="NM">20</gml:radius>
                                <gml:startAngle uom="deg">20.00000</gml:startAngle>
                                <gml:endAngle uom="rad">2</gml:endAngle>
                            </gml:ArcByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c9",
                    0,
                    GisUtil.arcRef(
                        0L,
                        new PointProperty() {{
                            setIndex(0L);
                            setHref("https://example.com/points/c6");
                            setTitle("external point");
                            setHrefType(HrefType.URL);
                        }},
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
                    0, 
                    GisUtil.circleObj(
                        0L,
                        new Pos() {{
                            setIndex(0L);
                            setSrsName("4326");
                            setValue("POINT(48.8566 2.3522)");
                        }},
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
                            <gml:pointProperty xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="urn:uuid:d163a00d-609f-4b15-9584-165f12599442" xlink:title="external point"/>
                            <gml:radius uom="KM">5</gml:radius>
                        </gml:CircleByCenterPoint>
                    </gml:segments>
                </gml:Curve>
                """,
                GisUtil.curveObj(
                    "c11", 
                    0, 
                    GisUtil.circleRef(
                        0L,
                        new PointProperty() {{
                            setIndex(0L);
                            setHref("d163a00d-609f-4b15-9584-165f12599442");
                            setTitle("external point");
                            setHrefType(HrefType.URN);
                        }},
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                )
            ), // urn EPSG:4326, ArcByCenterPoint, pointProperty xml, lat lon case
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
                    0L,
                    GisUtil.geodesicPosList(
                        0L,
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
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
                    0L,
                    GisUtil.geodesicPosList(
                        0L,
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
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
                    0L,
                    GisUtil.geodesicPosList(
                        0L,
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
                    )
                )
            ) // urn CRS:84, Geodesic, posList case, lat lon order
    );      
    }


    @ParameterizedTest()
    @MethodSource("ParseValidGMLCurve")
    @DisplayName("Parse valid GML Curves correctly")
    void parseValidGMLCurve(String xml, Curve expectedCurve) throws Exception {

        // given
        CurveType curve = JaxbUtil.loadFromXml(xml, CurveType.class);

        // do
        Curve parsed = CurveGmlHelper.parseGMLCurve(curve, Curve.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedCurve);

    }

    static Stream<Arguments> MarshallValidGMLCurve() {
        return Stream.of(
            Arguments.of(
                GisUtil.curveObj(
                    "m1",
                    0L,
                    GisUtil.linePosList(
                        0L,
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <ns1:Curve srsName="urn:ogc:def:crs:EPSG::4326" ns1:id="m1" xmlns:ns6="http://www.isotc211.org/2005/gts" xmlns:ns5="http://www.isotc211.org/2005/gmd" xmlns:ns7="http://www.aixm.aero/schema/5.2/message" xmlns:ns2="http://www.w3.org/1999/xlink" xmlns:ns1="http://www.opengis.net/gml/3.2" xmlns:ns4="http://www.isotc211.org/2005/gco" xmlns:ns3="http://www.aixm.aero/schema/5.2">
                    <ns1:segments>
                        <ns1:LineStringSegment interpolation="linear">
                            <ns1:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</ns1:posList>
                        </ns1:LineStringSegment>
                    </ns1:segments>
                </ns1:Curve>""" 
            ), // Standard urn case, EPSG:4326, LineStringSegment lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m2",
                    0L,
                    GisUtil.geodesicPosList(
                        0L,
                        new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <ns1:Curve srsName="urn:ogc:def:crs:EPSG::4326" ns1:id="m2" xmlns:ns6="http://www.isotc211.org/2005/gts" xmlns:ns5="http://www.isotc211.org/2005/gmd" xmlns:ns7="http://www.aixm.aero/schema/5.2/message" xmlns:ns2="http://www.w3.org/1999/xlink" xmlns:ns1="http://www.opengis.net/gml/3.2" xmlns:ns4="http://www.isotc211.org/2005/gco" xmlns:ns3="http://www.aixm.aero/schema/5.2">
                    <ns1:segments>
                        <ns1:GeodesicString interpolation="geodesic">
                            <ns1:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</ns1:posList>
                        </ns1:GeodesicString>
                    </ns1:segments>
                </ns1:Curve>""" 
            ), // Standard urn case, EPSG:4326, GeodesicString lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m3",
                    0L,
                    GisUtil.circleObj(
                        0L,
                        new Pos() {{
                            setIndex(0L);
                            setSrsName("4326");
                            setValue("POINT(52.51630693440871 13.377717264214601)");
                        }},
                        new DistanceType() {{
                            setValue(new BigDecimal(5.0));
                            setUom(DistanceUom.KM);
                        }}
                    )
                ),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <ns1:Curve srsName="urn:ogc:def:crs:EPSG::4326" ns1:id="m3" xmlns:ns6="http://www.isotc211.org/2005/gts" xmlns:ns5="http://www.isotc211.org/2005/gmd" xmlns:ns7="http://www.aixm.aero/schema/5.2/message" xmlns:ns2="http://www.w3.org/1999/xlink" xmlns:ns1="http://www.opengis.net/gml/3.2" xmlns:ns4="http://www.isotc211.org/2005/gco" xmlns:ns3="http://www.aixm.aero/schema/5.2">
                    <ns1:segments>
                        <ns1:CircleByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                            <ns1:pos>52.51630693440871 13.377717264214601</ns1:pos>
                            <ns1:radius uom="KM">5.0</ns1:radius>
                        </ns1:CircleByCenterPoint>
                    </ns1:segments>
                </ns1:Curve>""" 
            ), // Standard urn case, EPSG:4326, CircleByCenterPoint lat lon order
            Arguments.of(
                GisUtil.curveObj(
                    "m3",
                    0L,
                    GisUtil.arcObj(
                        0L,
                        new Pos() {{
                            setIndex(0L);
                            setSrsName("4326");
                            setValue("POINT(52.51630693440871 13.377717264214601)");
                        }},
                        new DistanceType() {{
                            setValue(new BigDecimal(5));
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
                <ns1:Curve srsName="urn:ogc:def:crs:EPSG::4326" ns1:id="m3" xmlns:ns6="http://www.isotc211.org/2005/gts" xmlns:ns5="http://www.isotc211.org/2005/gmd" xmlns:ns7="http://www.aixm.aero/schema/5.2/message" xmlns:ns2="http://www.w3.org/1999/xlink" xmlns:ns1="http://www.opengis.net/gml/3.2" xmlns:ns4="http://www.isotc211.org/2005/gco" xmlns:ns3="http://www.aixm.aero/schema/5.2">
                    <ns1:segments>
                        <ns1:ArcByCenterPoint numArc="1" interpolation="circularArcCenterPointWithRadius">
                                <ns1:pos>52.51630693440871 13.377717264214601</ns1:pos>
                                <ns1:radius uom="NM">20</ns1:radius>
                                <ns1:startAngle uom="deg">0.00000</ns1:startAngle>
                                <ns1:endAngle uom="deg">90.00000</ns1:endAngle>
                            </ns1:ArcByCenterPoint>
                    </ns1:segments>
                </ns1:Curve>""" 
            )
    );
    }

    @ParameterizedTest()
    @MethodSource("MarshallValidGMLCurve")
    @DisplayName("Marshall valid GML Curves correctly")
    void marshallValidGMLCurve(Curve value, String expectedXml) throws Exception {

        // given
        CurveType printed = CurveGmlHelper.printGMLCurve(value, CurveType.class);

        // do
        String xml = JaxbUtil.printToXml(printed, CurveType.class);
        xml = xml.replace("\r\n", "\n");
        expectedXml = expectedXml.replace("\r\n", "\n");
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

    static Stream<Arguments> PrintErroneousGMLCurve() {
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
            """) // use of posList and pos
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintErroneousGMLCurve")
    @DisplayName("Reject erroneous GML Curves")
    void parseErroneousGMLCurve(String xml) throws Exception {

        // given
        CurveType curve = JaxbUtil.loadFromXml(xml, CurveType.class);

        // do + check
        assertThatThrownBy(() -> CurveGmlHelper.parseGMLCurve(curve, Curve.class))
            .isInstanceOf(IllegalArgumentException.class);
    }

    void marshallErroneousGMLCurve() {
        // TODO
    }

}