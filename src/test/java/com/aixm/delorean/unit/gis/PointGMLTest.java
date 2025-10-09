package com.aixm.delorean.unit.gis;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import com.aixm.delorean.core.gis.helper.PointGmlHelper;
import com.aixm.delorean.core.gis.type.DeloreanPointType;
import com.aixm.delorean.core.org.gml.v_3_2.PointType;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.util.stream.Stream;

import javax.xml.namespace.QName;

public class PointGMLTest {
    
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

    
    static Stream<Arguments> ParseValidPoints() {
        return Stream.of(
            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.4</gml:pos>
                </gml:Point>
            """,
            "4326",
            "POINT(-32.4 52.3)"), // Standard urn case, EPSG:4326, lat lon order

            Arguments.of("""
                <gml:Point srsName="https://www.opengis.net/def/crs/EPSG/0/4326"
                        xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.4</gml:pos>
                </gml:Point>
            """,
            "4326",
            "POINT(-32.4 52.3)"), // Standard https case, EPSG:4326, lat lon order

            Arguments.of("""
                <gml:Point srsName="http://www.opengis.net/def/crs/EPSG/0/4326"
                        xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.4</gml:pos>
                </gml:Point>
            """,
            "4326",
            "POINT(-32.4 52.3)"), // Standard http case, EPSG:4326, lat lon order

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4258"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>10.0 20.0</gml:pos>
                </gml:Point>
            """,
            "4258",
            "POINT(20.0 10.0)"), // Standard case, EPSG:4258, lat lon order

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:OGC:1.3:CRS84"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>10.0 20.0</gml:pos>
                </gml:Point>
            """,
            "4326",
            "POINT(10.0 20.0)") // Special case, OGC:1.3:CRS84, lon lat order$

        );
    }
    

    @ParameterizedTest()
    @MethodSource("ParseValidPoints")
    @DisplayName("Parse valid GML Points correctly")
    void parseValidGMLPoint(String xml, String expectedSrs, String expectedWkt) throws Exception {

        // given
        PointType point = loadFromXml(xml, PointType.class);

        // do
        DeloreanPointType parsed = PointGmlHelper.parseGMLPoint(point, DeloreanPointType.class);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed.getSrsName()).isEqualTo(expectedSrs);
        assertThat(parsed.getGeomWkt()).isEqualTo(expectedWkt);
    }

    static Stream<Arguments> PrintValidPoints() {
    return Stream.of(
        Arguments.of(
            new DeloreanPointType() {{
                setId("P1");
                setSrsName("4326");
                setGeomWkt("POINT(20.0 10.0)");
            }},
            """
            <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <ns1:Point srsName="urn:ogc:def:crs:EPSG::4326" ns1:id="P1" xmlns:ns6="http://www.isotc211.org/2005/gts" xmlns:ns5="http://www.isotc211.org/2005/gmd" xmlns:ns7="http://www.aixm.aero/schema/5.2/message" xmlns:ns2="http://www.w3.org/1999/xlink" xmlns:ns1="http://www.opengis.net/gml/3.2" xmlns:ns4="http://www.isotc211.org/2005/gco" xmlns:ns3="http://www.aixm.aero/schema/5.2">
                <ns1:pos>10.0 20.0</ns1:pos>
            </ns1:Point>"""
        ),
        Arguments.of(
            new DeloreanPointType() {{
                setId("P2");
                setSrsName("4326");
                setGeomWkt("POINT(-10.0 20.0)");
            }},
            """
            <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <ns1:Point srsName="urn:ogc:def:crs:EPSG::4326" ns1:id="P2" xmlns:ns6="http://www.isotc211.org/2005/gts" xmlns:ns5="http://www.isotc211.org/2005/gmd" xmlns:ns7="http://www.aixm.aero/schema/5.2/message" xmlns:ns2="http://www.w3.org/1999/xlink" xmlns:ns1="http://www.opengis.net/gml/3.2" xmlns:ns4="http://www.isotc211.org/2005/gco" xmlns:ns3="http://www.aixm.aero/schema/5.2">
                <ns1:pos>20.0 -10.0</ns1:pos>
            </ns1:Point>"""
        )
    );
    };

    @ParameterizedTest()
    @MethodSource("PrintValidPoints")
    @DisplayName("Print valid GML Points correctly")
    void validMarshallingGMLPoints(DeloreanPointType value, String expectedXml) throws Exception {

        // given
        PointType printed = PointGmlHelper.printGMLPoint(value, PointType.class);

        //do
        String xml = saveToXml(printed, PointType.class);

        //check
        assertThat(xml).isEqualTo(expectedXml);
    }

    
    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseInvalidPoints() {
        return Stream.of(
            Arguments.of("""
                <gml:Point xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.3</gml:pos>
                </gml:Point>
            """), // missing srsName

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::9999"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.3</gml:pos>
                </gml:Point>
            """), // unsupported EPSG

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:pos>52.3 -32.3</gml:pos>
                    <gml:coordinates>52.3,-32.3</gml:coordinates>
                </gml:Point>
            """), // both pos & coordinates

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:coordinates>52.3,-32.3</gml:coordinates>
                </gml:Point>
            """), // deprecated ues of coordinates

            Arguments.of("""
                <gml:Point srsName="urn:ogc:def:crs:EPSG::4326"
                    xmlns:gml="http://www.opengis.net/gml/3.2">
                </gml:Point>
            """) // missing pos/coordinates entirely
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseInvalidPoints")
    @DisplayName("Reject invalid GML Points")
    void parseInvalidGMLPoint(String xml) throws Exception {

        // given
        PointType point = loadFromXml(xml, PointType.class);

        // do + check
        assertThatThrownBy(() -> PointGmlHelper.parseGMLPoint(point, DeloreanPointType.class))
            .isInstanceOf(IllegalArgumentException.class);
    }

    
    static Stream<Arguments> PrintInvalidPoints() {
    return Stream.of(
        Arguments.of(
            (DeloreanPointType) null
        ), // null  DeloreanPointType

        Arguments.of(
            new DeloreanPointType() {{
            }}
        ), // Empty DeloreanPointType

        Arguments.of(
            new DeloreanPointType() {{
                setId("P1");
                setSrsName("4326");
                setGeomWkt("");
            }}
        ), // missing wkt

        Arguments.of(
            new DeloreanPointType() {{
                setId("P1");
                setSrsName("4326");
                setGeomWkt("POINT(-10.0 20.0");
            }}
        ), // malformed wkt

        Arguments.of(
            new DeloreanPointType() {{
                setId("P2");
                setSrsName("");
                setGeomWkt("POINT(-10.0 20.0)");
            }} 
        ), // missing srs

        Arguments.of(
            new DeloreanPointType() {{
                setId("P2");
                setSrsName("2026");
                setGeomWkt("POINT(-10.0 20.0)");
            }} 
        ) // wrong srs
    );
    };

    @ParameterizedTest()
    @MethodSource("PrintInvalidPoints")
    @DisplayName("Print valid GML Points correctly")
    void invalidMarshallingGMLPoints(DeloreanPointType value) throws Exception {

        // given + do + check
        assertThatThrownBy(() -> PointGmlHelper.printGMLPoint(value, PointType.class))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
