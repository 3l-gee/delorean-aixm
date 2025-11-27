package com.aixm.delorean.unit.gis;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.xmlunit.assertj.XmlAssert;

import static org.assertj.core.api.Assertions.*;

import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.gml.GmlSurfaceType;
import com.aixm.delorean.core.org.gml.v_3_2.SurfaceType;
import com.aixm.delorean.util.GisUtil;
import com.aixm.delorean.util.JaxbUtil;

import java.util.stream.Stream;

@Disabled
public class SurfaceGMLTest {

    @BeforeAll
	public static void configureAssertJ() {
		org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
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
                                        <gml:Curve gml:id="e1">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """,
                GisUtil.surfaceObj(
                    "s1",
                    null,
                    GisUtil.ring(null,
                        GisUtil.curveObj("e1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
                        )
                    ),
                    null,
                    null
                )
            ), // Surface with one PolygonPatch and one exterior Ring with one Curve pos list
            Arguments.of(
                """
                <gml:Surface gml:id="s2" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:patches>
                        <gml:PolygonPatch>
                            <gml:exterior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="e1">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                            <gml:interior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="i1">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>47.457661694315526 8.500405759632237 47.44362506469117 8.5869315810565 47.38261839625727 8.564957389137748 47.38261839625727 8.564957389137748 47.457661694315526 8.500405759632237</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:interior>
                            <gml:interior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="i2">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>47.56581942557537 8.383867948906243 47.5709303379544 8.415345303858395 47.576918419662654 8.394814759365808 47.56581942557537 8.383867948906243</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:interior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """,
                GisUtil.surfaceObj(
                    "s2",
                    null,
                    GisUtil.ring(null,
                        GisUtil.curveObj("e1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
                        )
                    ),
                    null,
                    null,
                    GisUtil.ring(0L,
                        GisUtil.curveObj("i1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(47.457661694315526 8.500405759632237, 47.44362506469117 8.5869315810565, 47.38261839625727 8.564957389137748, 47.38261839625727 8.564957389137748, 47.457661694315526 8.500405759632237)")
                            )
                        )
                    ),
                    GisUtil.ring(1L,
                        GisUtil.curveObj("i2", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(47.56581942557537 8.383867948906243, 47.5709303379544 8.415345303858395, 47.576918419662654 8.394814759365808, 47.56581942557537 8.383867948906243)")
                            )
                        )
                    )
                )
            ), // Surface with one PolygonPatch, one exterior Ring with one Curve pos list and two interior Rings with one Curve pos list each
            Arguments.of(
                """
                <gml:Surface gml:id="s1" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:patches>
                        <gml:PolygonPatch>
                            <gml:exterior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="e1" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """,
                GisUtil.surfaceObj(
                    "s1",
                    null,
                    GisUtil.ring(null,
                        GisUtil.curveObj("e1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
                        )
                    ),
                    null,
                    null
                )
            ), // Surface with one PolygonPatch and one exterior Ring with one Curve pos list with explicit srsName
            Arguments.of(
                """
                <gml:Surface gml:id="s2" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:patches>
                        <gml:PolygonPatch>
                            <gml:exterior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="e1" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                            <gml:interior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="i1" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>47.457661694315526 8.500405759632237 47.44362506469117 8.5869315810565 47.38261839625727 8.564957389137748 47.38261839625727 8.564957389137748 47.457661694315526 8.500405759632237</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:interior>
                            <gml:interior>
                                <gml:Ring>
                                    <gml:curveMember>
                                        <gml:Curve gml:id="i2" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment>
                                                    <gml:posList>47.56581942557537 8.383867948906243 47.5709303379544 8.415345303858395 47.576918419662654 8.394814759365808 47.56581942557537 8.383867948906243</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:interior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """,
                GisUtil.surfaceObj(
                    "s2",
                    null,
                    GisUtil.ring(null,
                        GisUtil.curveObj("e1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
                        )
                    ),
                    null,
                    null,
                    GisUtil.ring(0L,
                        GisUtil.curveObj("i1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(47.457661694315526 8.500405759632237, 47.44362506469117 8.5869315810565, 47.38261839625727 8.564957389137748, 47.38261839625727 8.564957389137748, 47.457661694315526 8.500405759632237)")
                            )
                        )
                    ),
                    GisUtil.ring(1L,
                        GisUtil.curveObj("i2", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(47.56581942557537 8.383867948906243, 47.5709303379544 8.415345303858395, 47.576918419662654 8.394814759365808, 47.56581942557537 8.383867948906243)")
                            )
                        )
                    )
                )
            ) // Surface with one PolygonPatch, one exterior Ring with one Curve pos list and two interior Rings with one Curve pos list each with explicit srsName
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseValidGMLSurface")
    @DisplayName("Parse valid GML Surfaces correctly")
    void ParseValidGMLSurface(String xml, Surface expectedSurface) throws Exception {

        // given
        SurfaceType surface = JaxbUtil.loadFromXml(xml, SurfaceType.class);

        // do
        GmlSurfaceType parsed = SurfaceGmlHelper.parseGMLSurface(surface, GmlSurfaceType.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedSurface);

    }


    static Stream<Arguments> MarshallValidGMLSurface() {
        return Stream.of(
            Arguments.of(
                GisUtil.surfaceObj(
                    "s1",
                    null,
                    GisUtil.ring(null,
                        GisUtil.curveObj("e1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
                        )
                    ),
                    null,
                    null
                ),
                """
                <gml:Surface gml:id="s1" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:patches>
                        <gml:PolygonPatch interpolation="planar">
                            <gml:exterior>
                                <gml:Ring>
                                    <gml:curveMember xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                        <gml:Curve gml:id="e1" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment interpolation="linear">
                                                    <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """
            ),
            Arguments.of(
                GisUtil.surfaceObj(
                    "s2",
                    null,
                    GisUtil.ring(null,
                        GisUtil.curveObj("e1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
                        )
                    ),
                    null,
                    null,
                    GisUtil.ring(0L,
                        GisUtil.curveObj("i1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(47.457661694315526 8.500405759632237, 47.44362506469117 8.5869315810565, 47.38261839625727 8.564957389137748, 47.38261839625727 8.564957389137748, 47.457661694315526 8.500405759632237)")
                            )
                        )
                    ),
                    GisUtil.ring(0L,
                        GisUtil.curveObj("i2", 1L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(47.56581942557537 8.383867948906243, 47.5709303379544 8.415345303858395, 47.576918419662654 8.394814759365808, 47.56581942557537 8.383867948906243)")
                            )
                        )
                    )
                ),
                """
                <gml:Surface gml:id="s2" srsName="urn:ogc:def:crs:EPSG::4326" xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:patches>
                        <gml:PolygonPatch interpolation="planar">
                            <gml:exterior>
                                <gml:Ring>
                                    <gml:curveMember xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                        <gml:Curve gml:id="e1" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment interpolation="linear">
                                                    <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511 -24.589287528217096 -70.1916580926402 -33.9034433595103 18.411155413722216 52.51630693440871 13.377717264214601</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:exterior>
                            <gml:interior>
                                <gml:Ring>
                                    <gml:curveMember xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                        <gml:Curve gml:id="i1" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment interpolation="linear">
                                                    <gml:posList>47.457661694315526 8.500405759632237 47.44362506469117 8.5869315810565 47.38261839625727 8.564957389137748 47.38261839625727 8.564957389137748 47.457661694315526 8.500405759632237</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:interior>
                            <gml:interior>
                                <gml:Ring>
                                    <gml:curveMember xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                                        <gml:Curve gml:id="i2" srsName="urn:ogc:def:crs:EPSG::4326">
                                            <gml:segments>
                                                <gml:LineStringSegment interpolation="linear">
                                                    <gml:posList>47.56581942557537 8.383867948906243 47.5709303379544 8.415345303858395 47.576918419662654 8.394814759365808 47.56581942557537 8.383867948906243</gml:posList>
                                                </gml:LineStringSegment>
                                            </gml:segments>
                                        </gml:Curve>
                                    </gml:curveMember>
                                </gml:Ring>
                            </gml:interior>
                        </gml:PolygonPatch>
                    </gml:patches>
                </gml:Surface>
                """
            )
        );    
    }

    @ParameterizedTest()
    @MethodSource("MarshallValidGMLSurface")
    @DisplayName("Print valid GML Surface correctly")
    void MarshallValidGMLSurface(Surface value, String expectedXml) throws Exception {

        // given
        SurfaceType printed = SurfaceGmlHelper.printGMLSurface(value, SurfaceType.class);

        //do
        String xml = JaxbUtil.printToXml(printed, SurfaceType.class);

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
    
}
