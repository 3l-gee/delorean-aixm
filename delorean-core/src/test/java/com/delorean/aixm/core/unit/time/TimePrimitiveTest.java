package com.delorean.aixm.core.unit.time;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import org.xmlunit.assertj.XmlAssert;

import com.delorean.aixm.core.gis.helper.CurveGmlHelper;
import com.delorean.aixm.core.gis.helper.PointGmlHelper;
import com.delorean.aixm.core.gis.helper.SurfaceGmlHelper;
import com.delorean.aixm.core.gis.type.Curve;
import com.delorean.aixm.core.gis.type.Point;
import com.delorean.aixm.core.gis.type.Surface;
import com.delorean.aixm.core.gis.type.components.DistanceType;
import com.delorean.aixm.core.gis.type.components.AngleType;
import com.delorean.aixm.core.gis.type.components.HrefType;
import com.delorean.aixm.core.gis.type.components.GeometricType;
import com.delorean.aixm.core.gis.type.gml.GmlCurveType;
import com.delorean.aixm.core.gis.type.gml.GmlSurfaceType;

import java.math.BigDecimal;
import java.time.Instant;

import com.delorean.aixm.core.util.GisUtil;
import com.delorean.aixm.core.util.JaxbUtil;
import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import com.delorean.aixm.core.org.gml.v_3_2.CurveType;
import com.delorean.aixm.core.org.gml.v_3_2.PointType;
import com.delorean.aixm.core.org.gml.v_3_2.SurfaceType;
import com.delorean.aixm.core.org.gml.v_3_2.TimePrimitivePropertyType;
import com.delorean.aixm.core.time.helper.TimeSliceHelper;
import com.delorean.aixm.core.time.type.DeloreanTimeSliceType;
import com.delorean.aixm.core.unit.AngleUom;
import com.delorean.aixm.core.unit.DistanceUom;

import java.util.stream.Stream;

public class TimePrimitiveTest {

    @BeforeAll
	public static void configureAssertJ() {
		org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
	}
    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseValidTime() {
        return Stream.of(
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v1">
                        <gml:beginPosition>2017-01-07T00:00:00</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v1");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v2">
                        <gml:beginPosition>2017-01-07T00:00:00</gml:beginPosition>
                        <gml:endPosition>2018-02-17T10:55:10</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v2");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10Z"));
                }}
            ), // closed iso 8601
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v3">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v3");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601 with Z
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v4">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition>2018-02-17T10:55:10Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v4");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10Z"));
                }}
            ), // closed iso 8601 with Z
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v5">
                        <gml:beginPosition>2017-01-07T01:00:00+01:00</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v5");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601 +1
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v6">
                        <gml:beginPosition>2017-01-07T01:00:00+01:00</gml:beginPosition>
                        <gml:endPosition>2018-02-17T11:55:10+01:00</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v6");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10Z"));
                }}
            ), // closed iso 8601 +1
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v7">
                        <gml:beginPosition>2017-01-07T00:00:00.123Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v7");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00.123Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601 fractional secondes
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v8">
                        <gml:beginPosition>2017-01-07T00:00:00.123Z</gml:beginPosition>
                        <gml:endPosition>2018-02-17T10:55:10.123Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v8");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00.123Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10.123Z"));
                }}
            ), // closed iso 8601 fractional secondes
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v9">
                        <gml:beginPosition>2017-01-07</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v9");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open xs:date
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v10">
                        <gml:beginPosition>2017-01-07</gml:beginPosition>
                        <gml:endPosition>2018-02-17</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v10");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T00:00:00Z"));
                }}
            ),// closed xs:date
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeInstant gml:id="v11">
                        <gml:timePosition>2017-01-07T00:00:00Z</gml:timePosition>
                    </gml:TimeInstant>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v11");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ) // TimeInstant
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseValidTime")
    @DisplayName("Parse valid time correctly")
    void ParseValidTime(String xml, DeloreanTimeSliceType expectedTimeSlice) throws Exception {

        // given
        TimePrimitivePropertyType timePrimitive = JaxbUtil.loadFromXml(xml, TimePrimitivePropertyType.class);

        // do
        DeloreanTimeSliceType parsed = TimeSliceHelper.parseValidTime(timePrimitive);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedTimeSlice);
    }

    static Stream<Arguments> ParseFeatureLifetime() {
        return Stream.of(
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f2">
                        <gml:beginPosition>2017-01-07T00:00:00</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f2");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f3">
                        <gml:beginPosition>2017-01-07T00:00:00</gml:beginPosition>
                        <gml:endPosition>2018-02-17T10:55:10</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f3");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10Z"));
                }}
            ), // closed iso 8601
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f4">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f4");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601 with Z
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f5">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition>2018-02-17T10:55:10Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f5");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10Z"));
                }}
            ), // closed iso 8601 with Z
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f6">
                        <gml:beginPosition>2017-01-07T01:00:00+01:00</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f6");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601 +1
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f7">
                        <gml:beginPosition>2017-01-07T01:00:00+01:00</gml:beginPosition>
                        <gml:endPosition>2018-02-17T11:55:10+01:00</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f7");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10Z"));
                }}
            ), // closed iso 8601 +1
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f8">
                        <gml:beginPosition>2017-01-07T00:00:00.123Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f8");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00.123Z"));
                    setEndPosition(null);
                }}
            ), // open iso 8601 fractional secondes
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f9">
                        <gml:beginPosition>2017-01-07T00:00:00.123Z</gml:beginPosition>
                        <gml:endPosition>2018-02-17T10:55:10.123Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f9");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00.123Z"));
                    setEndPosition(Instant.parse("2018-02-17T10:55:10.123Z"));
                }}
            ), // closed iso 8601 fractional secondes
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f10">
                        <gml:beginPosition>2017-01-07</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f10");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            ), // open xs:date
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f11">
                        <gml:beginPosition>2017-01-07</gml:beginPosition>
                        <gml:endPosition>2018-02-17</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f11");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-17T00:00:00Z"));
                }}
            ) // closed xs:date
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseFeatureLifetime")
    @DisplayName("Parse valid feature lifetime correctly")
    void ParseFeatureLifetime(String xml, DeloreanTimeSliceType expectedTimeSlice) throws Exception {

        // given
        TimePrimitivePropertyType timePrimitive = JaxbUtil.loadFromXml(xml, TimePrimitivePropertyType.class);

        // do
        DeloreanTimeSliceType parsed = TimeSliceHelper.parseFeatureLifetime(timePrimitive);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedTimeSlice);
    }

    static Stream<Arguments> PrintValidTime() {
        return Stream.of(
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v1");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v1">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v2");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-08T01:00:00Z"));
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v2">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition>2018-02-08T01:00:00Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v3");
                    setBeginPosition(Instant.parse("0001-01-01T00:00:00Z"));   // very old date
                    setEndPosition(Instant.parse("9999-12-31T23:59:59.999Z"));  // far future
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v3">
                        <gml:beginPosition>0001-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition>9999-12-31T23:59:59.999Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintValidTime")
    @DisplayName("Print valid time primitve correctly")
    void PrintValidTime(DeloreanTimeSliceType timeSlice, String expectedXml) throws Exception {
        // given
        TimePrimitivePropertyType validTime = TimeSliceHelper.printValidTime(timeSlice);

        //do
        String xml = JaxbUtil.printToXml(validTime, TimePrimitivePropertyType.class);

        //check
        XmlAssert.assertThat(xml)
            .and(expectedXml)
            .ignoreWhitespace()
            .ignoreComments()
            .areIdentical();
    }

    static Stream<Arguments> PrintFeatureLifetime() {
        return Stream.of(
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f1");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f1">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f2");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(Instant.parse("2018-02-08T01:00:00Z"));
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f2">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition>2018-02-08T01:00:00Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f3");
                    setBeginPosition(Instant.parse("0001-01-01T00:00:00Z"));   // very old date
                    setEndPosition(Instant.parse("9999-12-31T23:59:59.999Z"));  // far future
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f3">
                        <gml:beginPosition>0001-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition>9999-12-31T23:59:59.999Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f4");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f4">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f5");
                    setBeginPosition(null);
                    setEndPosition(null);
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f5">
                        <gml:beginPosition indeterminatePosition="unknown"/>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("f6");
                    setBeginPosition(null);
                    setEndPosition(Instant.parse("2019-03-01T12:00:00Z"));
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="f6">
                        <gml:beginPosition indeterminatePosition="unknown"/>
                        <gml:endPosition>2019-03-01T12:00:00Z</gml:endPosition>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintFeatureLifetime")
    @DisplayName("Print valid time primitve correctly")
    void PrintFeatureLifetime(DeloreanTimeSliceType timeSlice, String expectedXml) throws Exception {
        // given
        TimePrimitivePropertyType validTime = TimeSliceHelper.printFeatureLifetime(timeSlice);

        //do
        String xml = JaxbUtil.printToXml(validTime, TimePrimitivePropertyType.class);

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

    static Stream<Arguments> ParseErronousValidTime() {
        return Stream.of(
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                </gml:validTime>
                """
            ), // malformed TimePrimitiveProperty
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                </gml:validTime>
                """
            ), // malformed TimePrimitiveProperty
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v3">
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v4">
                        <gml:beginPosition indeterminatePosition="unknown"/>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v5">
                        <gml:beginPosition>2024-01-01</gml:beginPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v6">
                        <gml:endPosition>2024-01-01</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeInstant gml:id="v7">
                        <gml:timePosition></gml:timePosition>
                    </gml:TimeInstant>
                </gml:validTime>
                """
            ), // malformed TimeInstant
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeNode gml:id="v8">
                        <gml:position>
                            <gml:TimeInstant gml:id="ID">
                                <gml:metaDataProperty>...
                                </gml:metaDataProperty>
                                <gml:description>string</gml:description>
                                <gml:descriptionReference/>
                                <gml:identifier codeSpace="http://www.example.com/">string</gml:identifier>
                                <gml:name>string</gml:name>
                                <gml:relatedTime>...
                                </gml:relatedTime>
                                <gml:timePosition>12:00:00</gml:timePosition>
                            </gml:TimeInstant>
                        </gml:position>
                    </gml:TimeNode>
                </gml:validTime>
                """
            ), // iligal TimeNode
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeEdge gml:id="v9">
                        <gml:relatedTime>
                            <gml:TimeInstant gml:id="ID">
                                <gml:metaDataProperty>...
                                </gml:metaDataProperty>
                                <gml:description>string</gml:description>
                                <gml:descriptionReference/>
                                <gml:identifier codeSpace="http://www.example.com/">string</gml:identifier>
                                <gml:name>string</gml:name>
                                <gml:relatedTime>...
                                </gml:relatedTime>
                                <gml:timePosition>12:00:00</gml:timePosition>
                            </gml:TimeInstant>
                        </gml:relatedTime>
                    </gml:TimeEdge >
                </gml:validTime>
                """
            ) // iligal TimeEdge
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseErronousValidTime")
    @DisplayName("Parse erronous time primitve correctly")
    void ParseErronousValidTime(String xml) throws Exception {

        // given
        TimePrimitivePropertyType validTime = JaxbUtil.loadFromXml(xml, TimePrimitivePropertyType.class);

        // do + check
        assertThatThrownBy(() -> TimeSliceHelper.parseValidTime(validTime))
            .isInstanceOfAny(IllegalArgumentException.class, NullPointerException.class);
    }

    static Stream<Arguments> ParseErronousFeatureLifetime() {
        return Stream.of(
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v3">
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v5">
                        <gml:beginPosition>2024-01-01</gml:beginPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimePeriod gml:id="v6">
                        <gml:endPosition>2024-01-01</gml:endPosition>
                    </gml:TimePeriod>
                </gml:validTime>
                """
            ), // malformed TimePeriod
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeInstant gml:id="v7">
                        <gml:timePosition>2025-01-01</gml:timePosition>
                    </gml:TimeInstant>
                </gml:validTime>
                """
            ), // iligal TimeInstant
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeNode gml:id="v8">
                        <gml:position>
                            <gml:TimeInstant gml:id="ID">
                                <gml:metaDataProperty>...
                                </gml:metaDataProperty>
                                <gml:description>string</gml:description>
                                <gml:descriptionReference/>
                                <gml:identifier codeSpace="http://www.example.com/">string</gml:identifier>
                                <gml:name>string</gml:name>
                                <gml:relatedTime>...
                                </gml:relatedTime>
                                <gml:timePosition>12:00:00</gml:timePosition>
                            </gml:TimeInstant>
                        </gml:position>
                    </gml:TimeNode>
                </gml:validTime>
                """
            ), // iligal TimeNode
            Arguments.of(
                """
                <gml:validTime xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xlink="http://www.w3.org/1999/xlink" xlink:type="simple">
                    <gml:TimeEdge gml:id="v9">
                        <gml:relatedTime>
                            <gml:TimeInstant gml:id="ID">
                                <gml:metaDataProperty>...
                                </gml:metaDataProperty>
                                <gml:description>string</gml:description>
                                <gml:descriptionReference/>
                                <gml:identifier codeSpace="http://www.example.com/">string</gml:identifier>
                                <gml:name>string</gml:name>
                                <gml:relatedTime>...
                                </gml:relatedTime>
                                <gml:timePosition>12:00:00</gml:timePosition>
                            </gml:TimeInstant>
                        </gml:relatedTime>
                    </gml:TimeEdge >
                </gml:validTime>
                """
            ) // iligal TimeEdge
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseErronousFeatureLifetime")
    @DisplayName("Parse erronous time primitve correctly")
    void ParseErronousFeatureLifetime(String xml) throws Exception {

        // given
        TimePrimitivePropertyType validTime = JaxbUtil.loadFromXml(xml, TimePrimitivePropertyType.class);

        // do + check
        assertThatThrownBy(() -> TimeSliceHelper.parseFeatureLifetime(validTime))
            .isInstanceOf(IllegalArgumentException.class);
    }

    static Stream<Arguments> PrintErronousValidTime() {
        return Stream.of(
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v1");
                    setBeginPosition(null);
                    setEndPosition(null);
                }}
            ),
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("v1");
                    setBeginPosition(null);
                    setEndPosition(Instant.parse("2017-01-07T00:00:00Z"));
                }}
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintErronousValidTime")
    @DisplayName("Print valid time primitve correctly")
    void PrintErronousValidTime(DeloreanTimeSliceType timeSlice) throws Exception {

        // given + do + check
        assertThatThrownBy(() -> TimeSliceHelper.printValidTime(timeSlice))
            .isInstanceOf(IllegalArgumentException.class);
    }   
}
