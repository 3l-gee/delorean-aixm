package com.aixm.delorean.unit.time;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;

import com.aixm.delorean.core.schema.a5_2.aixm.DMETimeSliceType;
import com.aixm.delorean.core.schema.a5_2.aixm.CodeNavaidDesignatorType;
import com.aixm.delorean.core.schema.a5_2.aixm.TextNameType;
import com.aixm.delorean.core.schema.a5_2.aixm.NotePropertyType;
import com.aixm.delorean.core.schema.a5_2.aixm.NoteType;
import com.aixm.delorean.core.time.type.DeloreanTimeSliceType;
import com.aixm.delorean.util.JaxbUtil;

import jakarta.xml.bind.JAXBElement;

import com.aixm.delorean.util.AIXMFeatureUtil;
import com.aixm.delorean.core.time.helper.TemporalityHelper;

import java.util.stream.Stream;
import java.util.List;

import javax.xml.namespace.QName;

public class TemporalityTest {


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

    static JAXBElement<CodeNavaidDesignatorType> designatorSteve = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, steve);
    static JAXBElement<CodeNavaidDesignatorType> designatorBob = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, bob);
    static JAXBElement<CodeNavaidDesignatorType> designatorInaplicableNil = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, inaplicable);
    {
        designatorInaplicableNil.setNil(true);
    }
    static JAXBElement<CodeNavaidDesignatorType> designatorInaplicable = new JAXBElement<CodeNavaidDesignatorType>(new QName("http://www.aixm.aero/schema/5.2", "designator"), CodeNavaidDesignatorType.class, DMETimeSliceType.class, inaplicable);
    {
        designatorInaplicable.setNil(false);
    }

    static TextNameType sion = new TextNameType() {{
        setValue("SION");
    }};
    static TextNameType bern = new TextNameType() {{
        setValue("BERN");
    }};

    static TextNameType inaplicableText = new TextNameType() {{
        setValue("");
        setNilReason("inapplicable");
    }};

    static JAXBElement<TextNameType> nameSion = new JAXBElement<TextNameType>(new QName("http://www.aixm.aero/schema/5.2", "name"), TextNameType.class, DMETimeSliceType.class, sion);
    static JAXBElement<TextNameType> nameBern = new JAXBElement<TextNameType>(new QName("http://www.aixm.aero/schema/5.2", "name"), TextNameType.class, DMETimeSliceType.class, bern);
    static JAXBElement<TextNameType> nameInaplicableNil = new JAXBElement<TextNameType>(new QName("http://www.aixm.aero/schema/5.2", "name"), TextNameType.class, DMETimeSliceType.class, inaplicableText);
    {
        nameInaplicable.setNil(true);
    }

        static JAXBElement<TextNameType> nameInaplicable = new JAXBElement<TextNameType>(new QName("http://www.aixm.aero/schema/5.2", "name"), TextNameType.class, DMETimeSliceType.class, inaplicableText);
    {
        nameInaplicable.setNil(false);
    }


    static NoteType firstNote;
    {
        try {
            firstNote = JaxbUtil.loadFromXml(
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

    static NotePropertyType firstNoteProperty;
    {
        firstNoteProperty = new NotePropertyType();
        firstNoteProperty.setNote(firstNote);
    }

    static NoteType secondNote;
    {
        try {
            secondNote = JaxbUtil.loadFromXml(
                """
                <aixm:Note gml:id="N2"
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
                        <aixm:LinguisticNote gml:id="L2">
                            <aixm:note lang="en">second Note</aixm:note>
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

    static NotePropertyType secondNoteProperty;
    {
        secondNoteProperty = new NotePropertyType();
        secondNoteProperty.setNote(secondNote);
    }

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
                    <aixm:designator>BOB</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>OTHER:SG_PARTIDX</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:designator>STEVE</aixm:designator>
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
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorSteve,
                    nameInaplicableNil,
                    List.of(firstNoteProperty, secondNoteProperty)
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
                    <aixm:designator>BOB</aixm:designator>
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name>SION</aixm:name>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
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
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorSteve,
                    nameSion,
                    List.of(firstNoteProperty, secondNoteProperty)
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
                    <aixm:designator>BOB</aixm:designator>
                    <aixm:name>SION</aixm:name>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
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
                    <aixm:interpretation>PERMDELTA</aixm:interpretation>
                    <aixm:sequenceNumber>2</aixm:sequenceNumber>
                    <aixm:correctionNumber>0</aixm:correctionNumber>
                    <aixm:designator>STEVE</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
                    <aixm:annotation/>
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
                    2L,
                    0L,
                    new DeloreanTimeSliceType() {{
                        setBeginPosition(java.time.Instant.parse("2009-01-01T00:00:00Z"));
                        setEndPosition(null);
                    }},
                    designatorSteve,
                    nameInaplicable,
                    List.of()
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
        DMETimeSliceType mergedTimeSlice = TemporalityHelper.merge(oldTimeSlice, newTimeSlice);

        // check
        assertThat(mergedTimeSlice).isNotNull();
        assertThat(mergedTimeSlice).usingRecursiveComparison().isEqualTo(expected);
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
                    <aixm:designator>BOB</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
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
                    List.of()
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
                    <aixm:designator>BOB</aixm:designator>
                    <aixm:name xsi:nil="true" nilReason="inapplicable"/>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
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
                    <aixm:designator>BOB</aixm:designator>
                    <aixm:name>SION</aixm:name>
                    </aixm:annotation/>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
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
                    nameSion,
                    List.of()
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
                    <aixm:designator>BOB</aixm:designator>
                    <aixm:name>SION</aixm:name>
                    <aixm:annotation/>
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
                    <aixm:annotation>
                        <aixm:Note gml:id="N2">
                            <aixm:purpose>REMARK</aixm:purpose>
                            <aixm:translatedNote>
                                <aixm:LinguisticNote gml:id="L2">
                                        <aixm:note lang="en">second Note</aixm:note>
                                </aixm:LinguisticNote>
                            </aixm:translatedNote>
                        </aixm:Note>
                     </aixm:annotation>
                </aixm:DMETimeSlice>
                """,
                AIXMFeatureUtil.dme(
                    "DME-TEST-002-TS",
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
                    nameInaplicable,
                    List.of(firstNoteProperty, secondNoteProperty)
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
        DMETimeSliceType deltaTimeSlice = TemporalityHelper.delta(oldTimeSlice, newTimeSlice);

        // check
        assertThat(deltaTimeSlice).isNotNull();
        assertThat(deltaTimeSlice).usingRecursiveComparison().isEqualTo(expected);
    }


    // -------------------------------------------------------------------------
    // NEGATIVE TESTS
    // -------------------------------------------------------------------------
}
