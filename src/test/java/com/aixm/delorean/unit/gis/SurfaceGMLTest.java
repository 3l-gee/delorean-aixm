package com.aixm.delorean.unit.gis;

import static org.assertj.core.api.Assertions.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.stream.Stream;

import javax.xml.namespace.QName;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.gis.type.components.PosList;
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
                GisUtil.surface(
                    "s1",
                    GisUtil.ring(0L,
                        GisUtil.curveObj("c1", 0L,
                            GisUtil.linePosList(0L,
                                new PosList() {{
                                    setSrsName("4326");
                                    setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511, -24.589287528217096 -70.1916580926402, -33.9034433595103 18.411155413722216, 52.51630693440871 13.377717264214601)");
                                }}
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
        SurfaceType surface = loadFromXml(xml, SurfaceType.class);

        // do
        Surface parsed = SurfaceGmlHelper.parseGMLSurface(surface, Surface.class);

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
