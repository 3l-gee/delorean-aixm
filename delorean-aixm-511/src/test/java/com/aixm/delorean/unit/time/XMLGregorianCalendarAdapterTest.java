package com.aixm.delorean.unit.time;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.xmlunit.assertj.XmlAssert;

import static org.assertj.core.api.Assertions.*;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;

import com.aixm.delorean.aixm511.time.adapter.XMLGregorianCalendarAdapter;
import com.aixm.delorean.util.JaxbUtil;
import com.aixm.delorean.util.XMLGregorianCalendarWrapper;

import java.util.stream.Stream;
import jakarta.xml.bind.UnmarshalException;

import javax.xml.datatype.XMLGregorianCalendar;


public class XMLGregorianCalendarAdapterTest {
    
    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

static Stream<Arguments> ParserValidXmlGregorianCalendar() {
    return Stream.of(
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T10:30:00Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 0, ZoneOffset.UTC)
        ), // normal date-time
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2000-01-01T00:00:00Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2000, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)
        ), // Y2K
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2020-02-29T23:59:59Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2020, 2, 29, 23, 59, 59, 0, ZoneOffset.UTC)
        ), // leap year
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >1900-02-28T12:00:00Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(1900, 2, 28, 12, 0, 0, 0, ZoneOffset.UTC)
        ), // non-leap year
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >0001-01-01T00:00:00Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)
        ), // minimum date
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >9999-12-31T23:59:59Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(9999, 12, 31, 23, 59, 59, 0, ZoneOffset.UTC)
        ), // maximum date
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 0, ZoneOffset.UTC)
        ), // UTC timezone
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00+05:00</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 0, ZoneOffset.ofHours(5))
        ), // +05:00 timezone
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00-08:00</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 0, ZoneOffset.ofHours(-8))
        ), // -08:00 timezone
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00.123Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 123_000_000, ZoneOffset.UTC)
        ), // milliseconds
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00.999999999Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 999_999_999, ZoneOffset.UTC)
        ), // nanoseconds
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-12-31T23:59:59Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2024, 12, 31, 23, 59, 59, 0, ZoneOffset.UTC)
        ), // end of year
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2025-01-01T00:00:00Z</XMLGregorianCalendar>
            """,
            OffsetDateTime.of(2025, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)
        ) // start of year
        );
    }

    @ParameterizedTest()
    @MethodSource("ParserValidXmlGregorianCalendar")
    @DisplayName("Parse valid XMLGregorianCalendar")
    void parserValidXmlGregorianCalendar(String xml, OffsetDateTime expected) throws Exception {

        // given
        XMLGregorianCalendarAdapter adapter = new XMLGregorianCalendarAdapter();
        XMLGregorianCalendarWrapper calendarWrapper = JaxbUtil.loadFromXml(xml, XMLGregorianCalendarWrapper.class);

        // do
        OffsetDateTime parsed = adapter.unmarshal(calendarWrapper.value);

        // check
        assertThat(parsed).isNotNull();
        assertThat(parsed).isEqualTo(expected);
    }

    static Stream<Arguments> PrintValidXmlGregorianCalendar() {
        return Stream.of(
            Arguments.of(
                OffsetDateTime.of(2024, 6, 15, 10, 30, 0, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T10:30:00.000Z</XMLGregorianCalendar>
                """
            ), // normal date-time
            Arguments.of(
                OffsetDateTime.of(2000, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2000-01-01T00:00:00.000Z</XMLGregorianCalendar>
                """
            ), // Y2K
            Arguments.of(
                OffsetDateTime.of(2020, 2, 29, 23, 59, 59, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2020-02-29T23:59:59.000Z</XMLGregorianCalendar>
                """
            ), // leap year
            Arguments.of(
                OffsetDateTime.of(1900, 2, 28, 12, 0, 0, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >1900-02-28T12:00:00.000Z</XMLGregorianCalendar>
                """
            ), // non-leap year
            Arguments.of(
                OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >0001-01-01T00:00:00.000Z</XMLGregorianCalendar>
                """
            ), // minimum date
            Arguments.of(
                OffsetDateTime.of(9999, 12, 31, 23, 59, 59, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >9999-12-31T23:59:59.000Z</XMLGregorianCalendar>
                """
            ), // maximum date
            Arguments.of(
                OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 123_000_000, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00.123Z</XMLGregorianCalendar>
                """
            ), // milliseconds
            Arguments.of(
                OffsetDateTime.of(2023, 7, 1, 10, 30, 0, 999_999_999, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2023-07-01T10:30:00.999Z</XMLGregorianCalendar>
                """
            ), // nanoseconds
            Arguments.of(
                OffsetDateTime.of(2024, 12, 31, 23, 59, 59, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-12-31T23:59:59.000Z</XMLGregorianCalendar>
                """
            ), // end of year
            Arguments.of(
                OffsetDateTime.of(2025, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC),
                """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2025-01-01T00:00:00.000Z</XMLGregorianCalendar>
                """
            ) // start of year
        );
    }

    @ParameterizedTest()
    @MethodSource("PrintValidXmlGregorianCalendar")
    @DisplayName("Print valid XMLGregorianCalendar")
    void printValidXmlGregorianCalendar(OffsetDateTime calendar, String expected) throws Exception {

        // given
        XMLGregorianCalendarAdapter adapter = new XMLGregorianCalendarAdapter();
        XMLGregorianCalendar parsed = adapter.marshal(calendar);
        XMLGregorianCalendarWrapper wrapper = new XMLGregorianCalendarWrapper();
        wrapper.value = parsed;

        // do
        String printed = JaxbUtil.printToXml(wrapper, XMLGregorianCalendarWrapper.class);
        // check
        assertThat(printed).isNotNull();
        XmlAssert.assertThat(printed)
            .and(expected)
            .ignoreWhitespace()
            .ignoreComments()
            .areIdentical();
    }

    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> ParserInvalidXmlGregorianCalendar() {
        return Stream.of(
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" ></XMLGregorianCalendar>"
            """
        ), // empty value
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >invalid-date-time</XMLGregorianCalendar>
            """
        ), // invalid format
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >T10:30:00</XMLGregorianCalendar>
            """
        ), // invalid format - missing date
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >T10:30:00Z</XMLGregorianCalendar>
            """
        ), // invalid format - missing date with timezone
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >T10:30:00Z+02:00</XMLGregorianCalendar>
            """
        ), // invalid format - missing date with timezone and offset
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >T10:30</XMLGregorianCalendar>
            """
        ), // invalid format - missing date and seconds
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >T10</XMLGregorianCalendar>
            """
        ), // invalid format - missing date and minutes and seconds
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15</XMLGregorianCalendar>
            """
        ), // invalid format - missing time
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2025-11</XMLGregorianCalendar>
            """
        ), // invalid format - missing day and time
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2025</XMLGregorianCalendar>
            """
        ), // invalid format - missing month day and time
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-13-01T10:30:00</XMLGregorianCalendar>"
            """
        ), // invalid month
        Arguments.of(
            """
            <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-00-10T10:30:00</XMLGregorianCalendar>"
            """
        ), // invalid month 
        Arguments.of(
            """
        <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-32T10:30:00</XMLGregorianCalendar>"
            """
        ), // invalid day
        Arguments.of(
            """
        <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T25:00:00</XMLGregorianCalendar>"
            """
        ), // invalid hour
        Arguments.of(
            """
        <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T10:61:00</XMLGregorianCalendar>"
            """
        ), // invalid minute
        Arguments.of(
            """
        <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T10:30:61</XMLGregorianCalendar>"
            """
        ), // invalid second
        Arguments.of(
            """
        <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T10:30:50</XMLGregorianCalendar>"
            """
        ), // missing timezone
        Arguments.of(
            """
        <XMLGregorianCalendar xmlns="http://www.opengis.net/gml/3.2" >2024-06-15T10:30:50Z+53:00</XMLGregorianCalendar>"
            """
        ) // invalid timezone
        );
    }

    @ParameterizedTest()
    @MethodSource("ParserInvalidXmlGregorianCalendar")
    @DisplayName("Print valid XMLGregorianCalendar")
    void parserInvalidXmlGregorianCalendar(String xml) throws Exception {
        // given + do + check
        assertThatThrownBy(() ->
            {
                XMLGregorianCalendarAdapter adapter = new XMLGregorianCalendarAdapter();
                XMLGregorianCalendarWrapper calendarWrapper = JaxbUtil.loadFromXml(xml, XMLGregorianCalendarWrapper.class);
                if (calendarWrapper.value == null) {
                    throw new IllegalArgumentException("XMLGregorianCalendar value is null");
                }
                adapter.unmarshal(calendarWrapper.value);
            }
        ).isInstanceOfAny(IllegalArgumentException.class, DateTimeParseException.class, UnmarshalException.class);
    }
}
