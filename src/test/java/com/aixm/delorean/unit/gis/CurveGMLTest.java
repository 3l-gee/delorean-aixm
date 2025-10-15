package com.aixm.delorean.unit.gis;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.core.gis.helper.PointGmlHelper;
import com.aixm.delorean.core.gis.type.ContentType;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.LineString;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.PosList;
import com.aixm.delorean.core.gis.type.Segment;
import com.aixm.delorean.core.gis.type.SegmentType;
import com.aixm.delorean.core.org.gml.v_3_2.CurveType;
import com.aixm.delorean.core.org.gml.v_3_2.PointType;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.util.stream.Stream;

import javax.xml.namespace.QName;
import java.util.List;


public class CurveGMLTest {
    
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
                new Curve() {{
                    setId("c1");
                    setSegments(List.of(new LineString() {{
                        setPosList(new PosList() {{
                            setSrsName("4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                            setSegmentType(SegmentType.LINE);
                            setContentType(ContentType.POSLIST);
                        }});
                    }}));
                }} 
            ) // Standard urn case, EPSG:4326, LineStringSegment lat lon order
    );
    }


    @ParameterizedTest()
    @MethodSource("ParseValidGMLCurve")
    @DisplayName("Parse valid GML Curves correctly")
    void parseValidGMLCurve(String xml, Curve expectedCurve) throws Exception {

        // given
        CurveType curve = loadFromXml(xml, CurveType.class);

        // do
        Curve parsed = CurveGmlHelper.parseGMLCurve(curve, Curve.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedCurve);

    }

    static Stream<Arguments> MarshallValidGMLCurve() {
        return Stream.of(
            Arguments.of(
                new Curve() {{
                    setHjid(1L);
                    setId("c1");
                    setSegments(List.of(new LineString() {{
                        setPosList(new PosList() {{
                            setSrsName("EPSG:4326");
                            setValue("LINESTRING(52.51630693440871 13.377717264214601, 38.89763528280979 -77.03654820204511)");
                        }});
                    }}));
                }},
                """
                    <gml:Curve srsName="urn:ogc:def:crs:EPSG::4326" gml:id="c1">
                        <gml:segments>
                            <gml:LineStringSegment>
                                <gml:posList>52.51630693440871 13.377717264214601 38.89763528280979 -77.03654820204511</gml:posList>
                            </gml:LineStringSegment>
                        </gml:segments>
                    </gml:Curve>
                """ 
            ) // Standard urn case, EPSG:4326, LineStringSegment lat lon order
    );
    }

    void marshallValidGMLCurve(Curve value, String expectedXml) {
        // TODO
    }

    
    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------

    void parseErroneousGMLCurve() {
        // TODO
    }

    void marshallErroneousGMLCurve() {
        // TODO
    }

}