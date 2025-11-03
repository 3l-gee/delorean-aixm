package com.aixm.delorean.unit.gis;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.gml.GmlSurfaceType;
import com.aixm.delorean.core.org.gml.v_3_2.SurfaceType;
import com.aixm.delorean.util.GisUtil;
import com.aixm.delorean.util.JaxbUtil;

public class SurfaceGMLTest {
    
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
                    null,
                    null,
                    GisUtil.ring(0L,
                        GisUtil.curveObj("c1", 0L, GeometricType.GML, null,
                            GisUtil.line(0L,
                                GisUtil.posList("4326", "LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)")
                            )
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
        SurfaceType surface = JaxbUtil.loadFromXml(xml, SurfaceType.class);

        // do
        GmlSurfaceType parsed = SurfaceGmlHelper.parseGMLSurface(surface, GmlSurfaceType.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedSurface);

    }


    // static Stream<Arguments> MarshallValidGMLSurface() {
    //     return Stream.of(
    //         Arguments.of(

    //         )
    //     );    
    // }

    // @ParameterizedTest()
    // @MethodSource("MarshallValidGMLSurface")
    // @DisplayName("Print valid GML Surface correctly")
    // void MarshallValidGMLSurface(Surface value, String expectedXml) {
    //     // given

    // }

    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------
    
}
