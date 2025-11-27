package com.aixm.delorean.unit.time;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import com.aixm.delorean.util.JaxbUtil;

import jakarta.xml.bind.JAXBElement;

import com.aixm.delorean.aixm511.schema.CodeNavaidDesignatorType;
import com.aixm.delorean.aixm511.schema.DMETimeSliceType;
import com.aixm.delorean.aixm511.schema.NotePropertyType;
import com.aixm.delorean.aixm511.schema.NoteType;
import com.aixm.delorean.aixm511.time.helper.TemporalityHelper;
import com.aixm.delorean.aixm511.time.type.DeloreanTimeSliceType;
import com.aixm.delorean.util.AIXMFeatureUtil;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;


import javax.xml.namespace.QName;

public class TemporalityTest {

    @BeforeAll
	public static void configureAssertJ() {
		org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed(0);
	}


    static CodeNavaidDesignatorType steve = new CodeNavaidDesignatorType() {{
        setValue("STEVE");
    }};
    static CodeNavaidDesignatorType bob = new CodeNavaidDesignatorType() {{
        setValue("BOB");
    }};

    static CodeNavaidDesignatorType inaplicable = new CodeNavaidDesignatorType() {{
        setValue("");
        setNilReason("inapplicable");
    }};

    static CodeNavaidDesignatorType unknown = new CodeNavaidDesignatorType() {{
        setValue("");
        setNilReason("unknown");
    }};

    static JAXBElement<CodeNavaidDesignatorType> designatorSteve = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, steve);
    static JAXBElement<CodeNavaidDesignatorType> designatorBob = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, bob);
    static JAXBElement<CodeNavaidDesignatorType> designatorInaplicable = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, inaplicable);
    static {
        designatorInaplicable.setNil(true);
    }

    static JAXBElement<CodeNavaidDesignatorType> designatorUnknown = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, unknown);
    static {
        designatorUnknown.setNil(true);
    }

    static NoteType note;
    static {
        try {
            note = JaxbUtil.loadFromXml(
                """
                <aixm:Note gml:id="N1"
                    xmlns:aixm="http://www.aixm.aero/schema/5.2"
                    xmlns:message="http://www.aixm.aero/schema/5.2/message" 
                    xmlns:gts="http://www.isotc211.org/2005/gts" 
                    xmlns:gco="http://www.isotc211.org/2005/gco" 
                    xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
                    xmlns:gml="http://www.opengis.net/gml/3.2" 
                    xmlns:gss="http://www.isotc211.org/2005/gss" 
                    xmlns:gsr="http://www.isotc211.org/2005/gsr" 
                    xmlns:gmd="http://www.isotc211.org/2005/gmd" 
                    xmlns:xlink="http://www.w3.org/1999/xlink" 
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xsi:schemaLocation="http://www.aixm.aero/schema/5.2/message http://www.aixm.aero/schema/5.2/message/AIXM_BasicMessage.xsd"
                    >
                    <aixm:purpose>REMARK</aixm:purpose>
                    <aixm:translatedNote>
                        <aixm:LinguisticNote gml:id="L1">
                            <aixm:note lang="en">first Note</aixm:note>
                        </aixm:LinguisticNote>
                    </aixm:translatedNote>
                </aixm:Note>
                """,
                NoteType.class
            );
        } catch (Exception e) {
            throw new RuntimeException("Failed to load NoteType from XML", e);
        }
    }

    static NotePropertyType noteProperty;
    static {
        noteProperty = new NotePropertyType();
        noteProperty.setNote(note);
    }
    static List<NotePropertyType> listNoteProperty = new ArrayList<>();
    static {
        listNoteProperty.add(noteProperty);
    }

    static List<NotePropertyType> emptyListNoteProperty = new ArrayList<>();
    static {
        emptyListNoteProperty.add(null);
    }   

    // -------------------------------------------------------------------------
    // POSITIVE TESTS
    // -------------------------------------------------------------------------

    static Stream<Arguments> MergeValidTimeSlices() {
        return Stream.of(
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT1"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT2"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:designator>STEVE</aixm:designator>
                </aixm:DMETimeSlice>
                """, // PERMDELTA with only designator changed from BOB to STEVE
                AIXMFeatureUtil.dme(
                    "MT2",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorSteve,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT3"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT4"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:designator xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """, // PERMDELTA with only designator changed from BOB to nil (inapplicable)
                AIXMFeatureUtil.dme(
                    "MT4",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorInaplicable,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT5"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT6"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                </aixm:DMETimeSlice>
                """, // PERMDELTA without any changed property
                AIXMFeatureUtil.dme(
                    "MT6",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorBob,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT7"
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
                    <aixm:designator xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT8"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:designator xsi:nil="true" nilReason="unknown"/>
                </aixm:DMETimeSlice>
                """, // PERMDELTA without any changed property
                AIXMFeatureUtil.dme(
                    "MT8",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorUnknown,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT9"
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
                    <aixm:annotations xsi:nil="true"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT10"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">first Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """, // PERMDELTA annotation added
                AIXMFeatureUtil.dme(
                    "MT10",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    null,
                    null,
                    listNoteProperty
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT11"
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">mistake</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT12"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">first Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """, // PERMDELTA annotation changed
                AIXMFeatureUtil.dme(
                    "MT12",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    null,
                    null,
                    listNoteProperty
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="MT13"
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">mistake</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="MT14"
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:annotation xsi:nil="true"/>
                </aixm:DMETimeSlice>
                """, // PERMDELTA annotation 
                AIXMFeatureUtil.dme(
                    "MT14",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "BASELINE",
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    null,
                    null,
                    emptyListNoteProperty
                )
            )
        );
    }

    @ParameterizedTest()
    @MethodSource("MergeValidTimeSlices")
    @DisplayName("Merge valid time slices")
    void mergeValidTimeSlices(String oldTS, String newTS, DMETimeSliceType expected) throws Exception {

        // given
        DMETimeSliceType oldTimeSlice = JaxbUtil.loadFromXml(oldTS, DMETimeSliceType.class);
        DMETimeSliceType newTimeSlice = JaxbUtil.loadFromXml(newTS, DMETimeSliceType.class);

        // do
        DMETimeSliceType mergedTimeSlice = TemporalityHelper.merge(DMETimeSliceType.class, oldTimeSlice, newTimeSlice);

        // check
        assertThat(mergedTimeSlice).isNotNull();
        assertThat(mergedTimeSlice).usingRecursiveComparison().isEqualTo(expected);
    }

    static Stream<Arguments> DeltaValidTimeSlices() {
        return Stream.of(
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT1"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT2"
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
                </aixm:DMETimeSlice>
                """, // BASELINE with only designator changed from BOB to STEVE
                AIXMFeatureUtil.dme(
                    "DT2",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    designatorSteve,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT3"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT4"
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
                    <aixm:designator xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """, // BASELINE with only designator changed from BOB to STEVE
                AIXMFeatureUtil.dme(
                    "DT4",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    designatorInaplicable,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT5"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT6"
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
                    <aixm:designator>BOB</aixm:designator>
                </aixm:DMETimeSlice>
                """, // PERMDELTA without any changed property
                AIXMFeatureUtil.dme(
                    "DT6",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    null,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT7"
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
                    <aixm:designator xsi:nil="true" nilReason="inapplicable"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT8"
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
                    <aixm:designator xsi:nil="true" nilReason="unknown"/>
                </aixm:DMETimeSlice>
                """, // PERMDELTA without any changed property
                AIXMFeatureUtil.dme(
                    "DT8",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    designatorUnknown,
                    null,
                    null
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT9"
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
                    <aixm:annotations xsi:nil="true"/>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT10"
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">first Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """, // PERMDELTA with added annotation
                AIXMFeatureUtil.dme(
                    "DT10",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    null,
                    null,
                    listNoteProperty
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT11"
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">mistake</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT12"
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">first Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """, // PERMDELTA annotation updated
                AIXMFeatureUtil.dme(
                    "DT12",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    null,
                    null,
                    listNoteProperty
                )
            ),
            Arguments.of(
                """
                <aixm:DMETimeSlice gml:id="DT13"
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N1">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L1">
                                    <aixm:note lang="en">mistake</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                    </aixm:annotation>
                </aixm:DMETimeSlice>
                """,
                """
                <aixm:DMETimeSlice gml:id="DT14"
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
                    <aixm:annotation xsi:nil="true"/>
                </aixm:DMETimeSlice>
                """, // PERMDELTA annotation removed
                AIXMFeatureUtil.dme(
                    "DT14",
                    null,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2025-01-20T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    "PERMDELTA",
                    2L,
                    0L,
                    null,
                    null,
                    null,
                    emptyListNoteProperty
                )
            )
        );
    } 

    @ParameterizedTest()
    @MethodSource("DeltaValidTimeSlices")
    @DisplayName("Delta valid time slices")
    void deltaValidTimeSlices(String oldTS, String newTS, DMETimeSliceType expected) throws Exception {

        // given
        DMETimeSliceType oldTimeSlice = JaxbUtil.loadFromXml(oldTS, DMETimeSliceType.class);
        DMETimeSliceType newTimeSlice = JaxbUtil.loadFromXml(newTS, DMETimeSliceType.class);

        // do
        DMETimeSliceType deltaTimeSlice = TemporalityHelper.delta(DMETimeSliceType.class, oldTimeSlice, newTimeSlice);

        // check
        assertThat(deltaTimeSlice).isNotNull();
        assertThat(deltaTimeSlice).usingRecursiveComparison().isEqualTo(expected);
    }


    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------
}
