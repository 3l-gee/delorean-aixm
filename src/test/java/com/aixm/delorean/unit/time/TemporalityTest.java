package com.aixm.delorean.unit.time;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import com.aixm.delorean.core.schema.a5_2.aixm.DMETimeSliceType;
import com.aixm.delorean.util.JaxbUtil;
import com.aixm.delorean.util.AIXMFeatureUtil;
import com.aixm.delorean.core.time.helper.TemporalityHelper;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;

import com.aixm.delorean.core.org.gml.v_3_2.CodeWithAuthorityType;

import java.util.stream.Stream;

public class TemporalityTest {

    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> MergeValidTimeSlices() {
        return Stream.of(
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-001-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP1">
                        <gml:beginPosition>2025-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>1</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>DLRN</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-002-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP2">
                        <gml:beginPosition>2025-01-20T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>TEMPDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    1L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    new com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType() {{
                        setValue("STEVE");
                    }},
                    new com.aixm.delorean.core.schema.a5_2.aixm.TextNameType() {{
                        setNilReason("inapplicable");
                    }}
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-001-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP1">
                        <gml:beginPosition>2025-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>1</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>DLRN</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-002-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP2">
                        <gml:beginPosition>2025-01-20T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>TEMPDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name>SION</aixm:name>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                   "DME-TEST-002-TS",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    1L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    new com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType() {{
                        setValue("STEVE");
                    }},
                    new com.aixm.delorean.core.schema.a5_2.aixm.TextNameType() {{
                        setValue("SION");
                    }}
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-001-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP1">
                        <gml:beginPosition>2025-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>1</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>DLRN</aixm:designator>
                    <aixm:name>SION</aixm:name>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-002-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP2">
                        <gml:beginPosition>2025-01-20T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>TEMPDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                   "DME-TEST-002-TS",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    1L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    new com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType() {{
                        setValue("STEVE");
                    }},
                    new com.aixm.delorean.core.schema.a5_2.aixm.TextNameType() {{
                        setNilReason("inapplicable");
                    }}
                )
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("MergeValidTimeSlices")
    @DisplayName("Merge valid time slices")
    void mergeValidTimeSlices(String curent, String next, DMETimeSliceType expected) throws Exception {

        // given
        DMETimeSliceType currentTimeSlice = JaxbUtil.loadFromXml(curent, DMETimeSliceType.class);
        DMETimeSliceType nextTimeSlice = JaxbUtil.loadFromXml(next, DMETimeSliceType.class);

        // do
        TemporalityHelper.DMEMapper.INSTANCE.merge(currentTimeSlice, nextTimeSlice);

        // check
        assertThat(currentTimeSlice).isNotNull();
        assertThat(currentTimeSlice).usingRecursiveComparison().isEqualTo(expected);

        System.out.println(JaxbUtil.saveToXml(currentTimeSlice, DMETimeSliceType.class));
    }

    static Stream<Arguments> DeltaValidTimeSlices() {
        return Stream.of(
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-001-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP1">
                        <gml:beginPosition>2025-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>1</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>DLRN</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-002-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP2">
                        <gml:beginPosition>2025-01-20T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    null,
                    2L,
                    null,
                    null,
                    new com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType() {{
                        setValue("STEVE");
                    }}
                    , new com.aixm.delorean.core.schema.a5_2.aixm.TextNameType() {{
                        setNilReason("inapplicable");
                    }}
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-001-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP1">
                        <gml:beginPosition>2025-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>1</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>DLRN</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-002-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP2">
                        <gml:beginPosition>2025-01-20T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name>SION</aixm:name>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    null,
                    2L,
                    null,
                    null,
                    new com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType() {{
                        setValue("STEVE");
                    }}
                    , new com.aixm.delorean.core.schema.a5_2.aixm.TextNameType() {{
                        setValue("SION");
                    }}
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-001-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP1">
                        <gml:beginPosition>2025-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>1</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>DLRN</aixm:designator>
                    <aixm:name>SION</aixm:name>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DME-TEST-002-TS"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:aixm="http://www.aixm.aero/schema/5.2" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd">
                    <gml:validTime>
                        <gml:TimePeriod gml:id="TP2">
                        <gml:beginPosition>2025-01-20T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </gml:validTime>
                    <aixm:interpretation>BASELINE</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:featureLifetime>
                        <gml:TimePeriod gml:id="ID_FL_7692166e-60e6-467d-b5f0-c728aeae85d6">
                        <gml:beginPosition>2009-01-01T00:00:00Z</gml:beginPosition>
                        <gml:endPosition indeterminatePosition="unknown"/>
                        </gml:TimePeriod>
                    </aixm:featureLifetime>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    null,
                    2L,
                    null,
                    null,
                    new com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType() {{
                        setValue("STEVE");
                    }}
                    , new com.aixm.delorean.core.schema.a5_2.aixm.TextNameType() {{
                        setNilReason("inapplicable");
                    }}
                )
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("DeltaValidTimeSlices")
    @DisplayName("Delta valid time slices")
    void deltaValidTimeSlices(String curent, String next, DMETimeSliceType expected) throws Exception {

        // given
        DMETimeSliceType currentTimeSlice = JaxbUtil.loadFromXml(curent, DMETimeSliceType.class);
        DMETimeSliceType nextTimeSlice = JaxbUtil.loadFromXml(next, DMETimeSliceType.class);

        // do
        DMETimeSliceType delta = TemporalityHelper.delta(currentTimeSlice, nextTimeSlice, DMETimeSliceType.class);

        // check
        assertThat(delta).isNotNull();
        assertThat(delta).usingRecursiveComparison().isEqualTo(expected);

        System.out.println(JaxbUtil.saveToXml(delta, DMETimeSliceType.class));
    }


    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------
}
