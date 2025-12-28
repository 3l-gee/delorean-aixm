package com.aixm.delorean.core.unit.time;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import org.xmlunit.assertj.XmlAssert;

import com.aixm.delorean.core.gis.helper.CurveGmlHelper;
import com.aixm.delorean.core.gis.helper.PointGmlHelper;
import com.aixm.delorean.core.gis.helper.SurfaceGmlHelper;
import com.aixm.delorean.core.gis.type.Curve;
import com.aixm.delorean.core.gis.type.Point;
import com.aixm.delorean.core.gis.type.Surface;
import com.aixm.delorean.core.gis.type.components.DistanceType;
import com.aixm.delorean.core.gis.type.components.AngleType;
import com.aixm.delorean.core.gis.type.components.HrefType;
import com.aixm.delorean.core.gis.type.components.GeometricType;
import com.aixm.delorean.core.gis.type.gml.GmlCurveType;
import com.aixm.delorean.core.gis.type.gml.GmlSurfaceType;

import java.math.BigDecimal;
import java.time.Instant;

import com.aixm.delorean.core.util.GisUtil;
import com.aixm.delorean.core.util.JaxbUtil;
import com.aixm.delorean.core.org.gml.v_3_2.CurveType;
import com.aixm.delorean.core.org.gml.v_3_2.PointType;
import com.aixm.delorean.core.org.gml.v_3_2.SurfaceType;
import com.aixm.delorean.core.org.gml.v_3_2.TimePrimitivePropertyType;
import com.aixm.delorean.core.time.helper.TimeSliceHelper;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import com.aixm.delorean.core.unit.AngleUom;
import com.aixm.delorean.core.unit.DistanceUom;

import java.util.stream.Stream;

public class TimePrimitiveTest {

    @BeforeAll
	public static void configureAssertJ() {
		org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
	}
    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseValidTimePrimitve() {
        return Stream.of(
            Arguments.of(
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:TimePeriod gml:id="t1">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """,
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("t1");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }}
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseValidTimePrimitve")
    @DisplayName("Parse valid time primitve correctly")
    void ParseValidTimePrimitve(String xml, DeloreanTimeSliceType expectedTimeSlice) throws Exception {

        // given
        TimePrimitivePropertyType timePrimitive = JaxbUtil.loadFromXml(xml, TimePrimitivePropertyType.class);

        // do
        DeloreanTimeSliceType parsed = TimeSliceHelper.parseValidTime(timePrimitive);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).usingRecursiveComparison().isEqualTo(expectedTimeSlice);
    }

    static Stream<Arguments> PrintValidTimePrimitive() {
        return Stream.of(
            Arguments.of(
                new DeloreanTimeSliceType() {{
                    setTimePeriodId("t1");
                    setBeginPosition(Instant.parse("2017-01-07T00:00:00Z"));
                    setEndPosition(null);
                }},
                """
                <gml:TimePrimitiveProperty xmlns:gml="http://www.opengis.net/gml/3.2">
                    <gml:TimePeriod gml:id="t1">
                        <gml:beginPosition>2017-01-07T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                    </gml:TimePeriod>
                </gml:TimePrimitiveProperty>
                """
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintValidTimePrimitive")
    @DisplayName("Print valid time primitve correctly")
    void PrintValidTimePrimitive(DeloreanTimeSliceType timeSlice, String expectedXml) throws Exception {
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

    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParseErronousTimePrimitve() {
        return Stream.of(
            Arguments.of(

            )
        );
    }

    @ParameterizedTest()
    @MethodSource("ParseErronousTimePrimitve")
    @DisplayName("Parse erronous time primitve correctly")
    void ParseErronousTimePrimitve(String xml) throws Exception {

        // given
        TimePrimitivePropertyType validTime = JaxbUtil.loadFromXml(xml, TimePrimitivePropertyType.class);

        // do + check
        assertThatThrownBy(() -> TimeSliceHelper.parseValidTime(validTime))
            .isInstanceOf(IllegalArgumentException.class);
    }

    static Stream<Arguments> PrintErronousTimePrimitive() {
        return Stream.of(
            Arguments.of(

            )
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintErronousTimePrimitive")
    @DisplayName("Print valid time primitve correctly")
    void PrintErronousTimePrimitive(DeloreanTimeSliceType timeSlice) throws Exception {

        // given + do + check
        assertThatThrownBy(() -> TimeSliceHelper.printValidTime(timeSlice))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
