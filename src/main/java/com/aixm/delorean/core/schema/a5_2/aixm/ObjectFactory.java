
package com.aixm.delorean.core.schema.a5_2.aixm;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aixm.delorean.core.schema.a5_2.aixm package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AbstractAIXMFeature_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractAIXMFeature");
    private static final QName _AbstractAIXMObject_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractAIXMObject");
    private static final QName _AbstractExtension_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractExtension");
    private static final QName _Interpretation_QNAME = new QName("http://www.aixm.aero/schema/5.2", "interpretation");
    private static final QName _SequenceNumber_QNAME = new QName("http://www.aixm.aero/schema/5.2", "sequenceNumber");
    private static final QName _CorrectionNumber_QNAME = new QName("http://www.aixm.aero/schema/5.2", "correctionNumber");
    private static final QName _DME_QNAME = new QName("http://www.aixm.aero/schema/5.2", "DME");
    private static final QName _DMETimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.2", "DMETimeSlice");
    private static final QName _AbstractDMEExtension_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractDMEExtension");
    private static final QName _AbstractNavaidEquipmentExtension_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractNavaidEquipmentExtension");
    private static final QName _ElevatedPoint_QNAME = new QName("http://www.aixm.aero/schema/5.2", "ElevatedPoint");
    private static final QName _AbstractElevatedPointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractElevatedPointExtension");
    private static final QName _Note_QNAME = new QName("http://www.aixm.aero/schema/5.2", "Note");
    private static final QName _AbstractNoteExtension_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractNoteExtension");
    private static final QName _LinguisticNote_QNAME = new QName("http://www.aixm.aero/schema/5.2", "LinguisticNote");
    private static final QName _AbstractLinguisticNoteExtension_QNAME = new QName("http://www.aixm.aero/schema/5.2", "AbstractLinguisticNoteExtension");
    private static final QName _LinguisticNoteTypeNote_QNAME = new QName("http://www.aixm.aero/schema/5.2", "note");
    private static final QName _NoteTypePropertyName_QNAME = new QName("http://www.aixm.aero/schema/5.2", "propertyName");
    private static final QName _NoteTypePurpose_QNAME = new QName("http://www.aixm.aero/schema/5.2", "purpose");
    private static final QName _AIXMElevatedPointTypeElevation_QNAME = new QName("http://www.aixm.aero/schema/5.2", "elevation");
    private static final QName _AIXMElevatedPointTypeGeoidUndulation_QNAME = new QName("http://www.aixm.aero/schema/5.2", "geoidUndulation");
    private static final QName _AIXMElevatedPointTypeVerticalDatum_QNAME = new QName("http://www.aixm.aero/schema/5.2", "verticalDatum");
    private static final QName _AIXMElevatedPointTypeHorizontalAccuracy_QNAME = new QName("http://www.aixm.aero/schema/5.2", "horizontalAccuracy");
    private static final QName _DMETimeSliceTypeDesignator_QNAME = new QName("http://www.aixm.aero/schema/5.2", "designator");
    private static final QName _DMETimeSliceTypeName_QNAME = new QName("http://www.aixm.aero/schema/5.2", "name");
    private static final QName _DMETimeSliceTypeEmissionClass_QNAME = new QName("http://www.aixm.aero/schema/5.2", "emissionClass");
    private static final QName _DMETimeSliceTypeMobile_QNAME = new QName("http://www.aixm.aero/schema/5.2", "mobile");
    private static final QName _DMETimeSliceTypeMagneticVariation_QNAME = new QName("http://www.aixm.aero/schema/5.2", "magneticVariation");
    private static final QName _DMETimeSliceTypeDateMagneticVariation_QNAME = new QName("http://www.aixm.aero/schema/5.2", "dateMagneticVariation");
    private static final QName _DMETimeSliceTypeFlightChecked_QNAME = new QName("http://www.aixm.aero/schema/5.2", "flightChecked");
    private static final QName _DMETimeSliceTypeLocation_QNAME = new QName("http://www.aixm.aero/schema/5.2", "location");
    private static final QName _DMETimeSliceTypeType_QNAME = new QName("http://www.aixm.aero/schema/5.2", "type");
    private static final QName _DMETimeSliceTypeChannel_QNAME = new QName("http://www.aixm.aero/schema/5.2", "channel");
    private static final QName _DMETimeSliceTypeDisplace_QNAME = new QName("http://www.aixm.aero/schema/5.2", "displace");
    private static final QName _DMETimeSliceTypeTuningFrequencyVHF_QNAME = new QName("http://www.aixm.aero/schema/5.2", "tuningFrequencyVHF");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aixm.delorean.core.schema.a5_2.aixm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DMEType }
     * 
     * @return
     *     the new instance of {@link DMEType }
     */
    public DMEType createDMEType() {
        return new DMEType();
    }

    /**
     * Create an instance of {@link DMETimeSliceType }
     * 
     * @return
     *     the new instance of {@link DMETimeSliceType }
     */
    public DMETimeSliceType createDMETimeSliceType() {
        return new DMETimeSliceType();
    }

    /**
     * Create an instance of {@link AIXMElevatedPointType }
     * 
     * @return
     *     the new instance of {@link AIXMElevatedPointType }
     */
    public AIXMElevatedPointType createAIXMElevatedPointType() {
        return new AIXMElevatedPointType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     * @return
     *     the new instance of {@link NoteType }
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link LinguisticNoteType }
     * 
     * @return
     *     the new instance of {@link LinguisticNoteType }
     */
    public LinguisticNoteType createLinguisticNoteType() {
        return new LinguisticNoteType();
    }

    /**
     * Create an instance of {@link CodeAircraftFieldLengthType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftFieldLengthType }
     */
    public CodeAircraftFieldLengthType createCodeAircraftFieldLengthType() {
        return new CodeAircraftFieldLengthType();
    }

    /**
     * Create an instance of {@link CodeAirportSignType }
     * 
     * @return
     *     the new instance of {@link CodeAirportSignType }
     */
    public CodeAirportSignType createCodeAirportSignType() {
        return new CodeAirportSignType();
    }

    /**
     * Create an instance of {@link CodeApproachPrecisionCategoryType }
     * 
     * @return
     *     the new instance of {@link CodeApproachPrecisionCategoryType }
     */
    public CodeApproachPrecisionCategoryType createCodeApproachPrecisionCategoryType() {
        return new CodeApproachPrecisionCategoryType();
    }

    /**
     * Create an instance of {@link CodeBuoyDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeBuoyDesignatorType }
     */
    public CodeBuoyDesignatorType createCodeBuoyDesignatorType() {
        return new CodeBuoyDesignatorType();
    }

    /**
     * Create an instance of {@link CodeCourseQualityGBASType }
     * 
     * @return
     *     the new instance of {@link CodeCourseQualityGBASType }
     */
    public CodeCourseQualityGBASType createCodeCourseQualityGBASType() {
        return new CodeCourseQualityGBASType();
    }

    /**
     * Create an instance of {@link CodeDataAssessmentStatusType }
     * 
     * @return
     *     the new instance of {@link CodeDataAssessmentStatusType }
     */
    public CodeDataAssessmentStatusType createCodeDataAssessmentStatusType() {
        return new CodeDataAssessmentStatusType();
    }

    /**
     * Create an instance of {@link CodeDataLinkStandardType }
     * 
     * @return
     *     the new instance of {@link CodeDataLinkStandardType }
     */
    public CodeDataLinkStandardType createCodeDataLinkStandardType() {
        return new CodeDataLinkStandardType();
    }

    /**
     * Create an instance of {@link CodeDistanceVerticalUomType }
     * 
     * @return
     *     the new instance of {@link CodeDistanceVerticalUomType }
     */
    public CodeDistanceVerticalUomType createCodeDistanceVerticalUomType() {
        return new CodeDistanceVerticalUomType();
    }

    /**
     * Create an instance of {@link CodeGangwayType }
     * 
     * @return
     *     the new instance of {@link CodeGangwayType }
     */
    public CodeGangwayType createCodeGangwayType() {
        return new CodeGangwayType();
    }

    /**
     * Create an instance of {@link CodeGBASApproachServiceType }
     * 
     * @return
     *     the new instance of {@link CodeGBASApproachServiceType }
     */
    public CodeGBASApproachServiceType createCodeGBASApproachServiceType() {
        return new CodeGBASApproachServiceType();
    }

    /**
     * Create an instance of {@link CodeICAOCountryType }
     * 
     * @return
     *     the new instance of {@link CodeICAOCountryType }
     */
    public CodeICAOCountryType createCodeICAOCountryType() {
        return new CodeICAOCountryType();
    }

    /**
     * Create an instance of {@link CodeLightDirectionType }
     * 
     * @return
     *     the new instance of {@link CodeLightDirectionType }
     */
    public CodeLightDirectionType createCodeLightDirectionType() {
        return new CodeLightDirectionType();
    }

    /**
     * Create an instance of {@link CodeLightingTechnologyType }
     * 
     * @return
     *     the new instance of {@link CodeLightingTechnologyType }
     */
    public CodeLightingTechnologyType createCodeLightingTechnologyType() {
        return new CodeLightingTechnologyType();
    }

    /**
     * Create an instance of {@link CodeReferencePathIdentifierType }
     * 
     * @return
     *     the new instance of {@link CodeReferencePathIdentifierType }
     */
    public CodeReferencePathIdentifierType createCodeReferencePathIdentifierType() {
        return new CodeReferencePathIdentifierType();
    }

    /**
     * Create an instance of {@link CodeRelativeLocationType }
     * 
     * @return
     *     the new instance of {@link CodeRelativeLocationType }
     */
    public CodeRelativeLocationType createCodeRelativeLocationType() {
        return new CodeRelativeLocationType();
    }

    /**
     * Create an instance of {@link CodeRouteDirectionType }
     * 
     * @return
     *     the new instance of {@link CodeRouteDirectionType }
     */
    public CodeRouteDirectionType createCodeRouteDirectionType() {
        return new CodeRouteDirectionType();
    }

    /**
     * Create an instance of {@link CodeRouteIndicatorType }
     * 
     * @return
     *     the new instance of {@link CodeRouteIndicatorType }
     */
    public CodeRouteIndicatorType createCodeRouteIndicatorType() {
        return new CodeRouteIndicatorType();
    }

    /**
     * Create an instance of {@link CodeRunwayLightType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayLightType }
     */
    public CodeRunwayLightType createCodeRunwayLightType() {
        return new CodeRunwayLightType();
    }

    /**
     * Create an instance of {@link CodeSatelliteApproachType }
     * 
     * @return
     *     the new instance of {@link CodeSatelliteApproachType }
     */
    public CodeSatelliteApproachType createCodeSatelliteApproachType() {
        return new CodeSatelliteApproachType();
    }

    /**
     * Create an instance of {@link CodeSatelliteNavigationServiceType }
     * 
     * @return
     *     the new instance of {@link CodeSatelliteNavigationServiceType }
     */
    public CodeSatelliteNavigationServiceType createCodeSatelliteNavigationServiceType() {
        return new CodeSatelliteNavigationServiceType();
    }

    /**
     * Create an instance of {@link CodeSatelliteSystemType }
     * 
     * @return
     *     the new instance of {@link CodeSatelliteSystemType }
     */
    public CodeSatelliteSystemType createCodeSatelliteSystemType() {
        return new CodeSatelliteSystemType();
    }

    /**
     * Create an instance of {@link CodeSegmentedCircleType }
     * 
     * @return
     *     the new instance of {@link CodeSegmentedCircleType }
     */
    public CodeSegmentedCircleType createCodeSegmentedCircleType() {
        return new CodeSegmentedCircleType();
    }

    /**
     * Create an instance of {@link CodeSignalPolarizationType }
     * 
     * @return
     *     the new instance of {@link CodeSignalPolarizationType }
     */
    public CodeSignalPolarizationType createCodeSignalPolarizationType() {
        return new CodeSignalPolarizationType();
    }

    /**
     * Create an instance of {@link CodeSpeedInterpretationUseType }
     * 
     * @return
     *     the new instance of {@link CodeSpeedInterpretationUseType }
     */
    public CodeSpeedInterpretationUseType createCodeSpeedInterpretationUseType() {
        return new CodeSpeedInterpretationUseType();
    }

    /**
     * Create an instance of {@link CodeTaxiHoldingPositionType }
     * 
     * @return
     *     the new instance of {@link CodeTaxiHoldingPositionType }
     */
    public CodeTaxiHoldingPositionType createCodeTaxiHoldingPositionType() {
        return new CodeTaxiHoldingPositionType();
    }

    /**
     * Create an instance of {@link CodeTaxiwayMarkingType }
     * 
     * @return
     *     the new instance of {@link CodeTaxiwayMarkingType }
     */
    public CodeTaxiwayMarkingType createCodeTaxiwayMarkingType() {
        return new CodeTaxiwayMarkingType();
    }

    /**
     * Create an instance of {@link CodeTelephoneSystemType }
     * 
     * @return
     *     the new instance of {@link CodeTelephoneSystemType }
     */
    public CodeTelephoneSystemType createCodeTelephoneSystemType() {
        return new CodeTelephoneSystemType();
    }

    /**
     * Create an instance of {@link CodeUpperAlphanumericType }
     * 
     * @return
     *     the new instance of {@link CodeUpperAlphanumericType }
     */
    public CodeUpperAlphanumericType createCodeUpperAlphanumericType() {
        return new CodeUpperAlphanumericType();
    }

    /**
     * Create an instance of {@link CodeWeatherSourceType }
     * 
     * @return
     *     the new instance of {@link CodeWeatherSourceType }
     */
    public CodeWeatherSourceType createCodeWeatherSourceType() {
        return new CodeWeatherSourceType();
    }

    /**
     * Create an instance of {@link CodeWeekDayType }
     * 
     * @return
     *     the new instance of {@link CodeWeekDayType }
     */
    public CodeWeekDayType createCodeWeekDayType() {
        return new CodeWeekDayType();
    }

    /**
     * Create an instance of {@link TextDecimalType }
     * 
     * @return
     *     the new instance of {@link TextDecimalType }
     */
    public TextDecimalType createTextDecimalType() {
        return new TextDecimalType();
    }

    /**
     * Create an instance of {@link TextLatitudeDMSType }
     * 
     * @return
     *     the new instance of {@link TextLatitudeDMSType }
     */
    public TextLatitudeDMSType createTextLatitudeDMSType() {
        return new TextLatitudeDMSType();
    }

    /**
     * Create an instance of {@link TextLongitudeDMSType }
     * 
     * @return
     *     the new instance of {@link TextLongitudeDMSType }
     */
    public TextLongitudeDMSType createTextLongitudeDMSType() {
        return new TextLongitudeDMSType();
    }

    /**
     * Create an instance of {@link CodeAerialRefuellingPointType }
     * 
     * @return
     *     the new instance of {@link CodeAerialRefuellingPointType }
     */
    public CodeAerialRefuellingPointType createCodeAerialRefuellingPointType() {
        return new CodeAerialRefuellingPointType();
    }

    /**
     * Create an instance of {@link CodeAerialRefuellingPrefixType }
     * 
     * @return
     *     the new instance of {@link CodeAerialRefuellingPrefixType }
     */
    public CodeAerialRefuellingPrefixType createCodeAerialRefuellingPrefixType() {
        return new CodeAerialRefuellingPrefixType();
    }

    /**
     * Create an instance of {@link CodeAerialRefuellingType }
     * 
     * @return
     *     the new instance of {@link CodeAerialRefuellingType }
     */
    public CodeAerialRefuellingType createCodeAerialRefuellingType() {
        return new CodeAerialRefuellingType();
    }

    /**
     * Create an instance of {@link CodeAircraftLandingCategoryType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftLandingCategoryType }
     */
    public CodeAircraftLandingCategoryType createCodeAircraftLandingCategoryType() {
        return new CodeAircraftLandingCategoryType();
    }

    /**
     * Create an instance of {@link CodeAircraftEngineNumberType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftEngineNumberType }
     */
    public CodeAircraftEngineNumberType createCodeAircraftEngineNumberType() {
        return new CodeAircraftEngineNumberType();
    }

    /**
     * Create an instance of {@link CodeAircraftEngineType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftEngineType }
     */
    public CodeAircraftEngineType createCodeAircraftEngineType() {
        return new CodeAircraftEngineType();
    }

    /**
     * Create an instance of {@link CodeAircraftGroundServiceType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftGroundServiceType }
     */
    public CodeAircraftGroundServiceType createCodeAircraftGroundServiceType() {
        return new CodeAircraftGroundServiceType();
    }

    /**
     * Create an instance of {@link CodeAircraftICAOType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftICAOType }
     */
    public CodeAircraftICAOType createCodeAircraftICAOType() {
        return new CodeAircraftICAOType();
    }

    /**
     * Create an instance of {@link CodeAircraftStandType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftStandType }
     */
    public CodeAircraftStandType createCodeAircraftStandType() {
        return new CodeAircraftStandType();
    }

    /**
     * Create an instance of {@link CodeAircraftCategoryType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftCategoryType }
     */
    public CodeAircraftCategoryType createCodeAircraftCategoryType() {
        return new CodeAircraftCategoryType();
    }

    /**
     * Create an instance of {@link CodeAircraftWingspanClassType }
     * 
     * @return
     *     the new instance of {@link CodeAircraftWingspanClassType }
     */
    public CodeAircraftWingspanClassType createCodeAircraftWingspanClassType() {
        return new CodeAircraftWingspanClassType();
    }

    /**
     * Create an instance of {@link CodeAirportHeliportCollocationType }
     * 
     * @return
     *     the new instance of {@link CodeAirportHeliportCollocationType }
     */
    public CodeAirportHeliportCollocationType createCodeAirportHeliportCollocationType() {
        return new CodeAirportHeliportCollocationType();
    }

    /**
     * Create an instance of {@link CodeAirportHeliportDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeAirportHeliportDesignatorType }
     */
    public CodeAirportHeliportDesignatorType createCodeAirportHeliportDesignatorType() {
        return new CodeAirportHeliportDesignatorType();
    }

    /**
     * Create an instance of {@link CodeAirportHeliportType }
     * 
     * @return
     *     the new instance of {@link CodeAirportHeliportType }
     */
    public CodeAirportHeliportType createCodeAirportHeliportType() {
        return new CodeAirportHeliportType();
    }

    /**
     * Create an instance of {@link CodeAirportWarningType }
     * 
     * @return
     *     the new instance of {@link CodeAirportWarningType }
     */
    public CodeAirportWarningType createCodeAirportWarningType() {
        return new CodeAirportWarningType();
    }

    /**
     * Create an instance of {@link CodeAirspaceActivityType }
     * 
     * @return
     *     the new instance of {@link CodeAirspaceActivityType }
     */
    public CodeAirspaceActivityType createCodeAirspaceActivityType() {
        return new CodeAirspaceActivityType();
    }

    /**
     * Create an instance of {@link CodeAirspaceAggregationType }
     * 
     * @return
     *     the new instance of {@link CodeAirspaceAggregationType }
     */
    public CodeAirspaceAggregationType createCodeAirspaceAggregationType() {
        return new CodeAirspaceAggregationType();
    }

    /**
     * Create an instance of {@link CodeAirspaceClassificationType }
     * 
     * @return
     *     the new instance of {@link CodeAirspaceClassificationType }
     */
    public CodeAirspaceClassificationType createCodeAirspaceClassificationType() {
        return new CodeAirspaceClassificationType();
    }

    /**
     * Create an instance of {@link CodeAirspaceDependencyType }
     * 
     * @return
     *     the new instance of {@link CodeAirspaceDependencyType }
     */
    public CodeAirspaceDependencyType createCodeAirspaceDependencyType() {
        return new CodeAirspaceDependencyType();
    }

    /**
     * Create an instance of {@link CodeAirspaceDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeAirspaceDesignatorType }
     */
    public CodeAirspaceDesignatorType createCodeAirspaceDesignatorType() {
        return new CodeAirspaceDesignatorType();
    }

    /**
     * Create an instance of {@link CodeAirspacePointPositionType }
     * 
     * @return
     *     the new instance of {@link CodeAirspacePointPositionType }
     */
    public CodeAirspacePointPositionType createCodeAirspacePointPositionType() {
        return new CodeAirspacePointPositionType();
    }

    /**
     * Create an instance of {@link CodePointUsageType }
     * 
     * @return
     *     the new instance of {@link CodePointUsageType }
     */
    public CodePointUsageType createCodePointUsageType() {
        return new CodePointUsageType();
    }

    /**
     * Create an instance of {@link CodeAirspaceType }
     * 
     * @return
     *     the new instance of {@link CodeAirspaceType }
     */
    public CodeAirspaceType createCodeAirspaceType() {
        return new CodeAirspaceType();
    }

    /**
     * Create an instance of {@link CodeAltitudeAdjustmentType }
     * 
     * @return
     *     the new instance of {@link CodeAltitudeAdjustmentType }
     */
    public CodeAltitudeAdjustmentType createCodeAltitudeAdjustmentType() {
        return new CodeAltitudeAdjustmentType();
    }

    /**
     * Create an instance of {@link CodeAltitudeUseType }
     * 
     * @return
     *     the new instance of {@link CodeAltitudeUseType }
     */
    public CodeAltitudeUseType createCodeAltitudeUseType() {
        return new CodeAltitudeUseType();
    }

    /**
     * Create an instance of {@link CodeAdditionalEquipmentType }
     * 
     * @return
     *     the new instance of {@link CodeAdditionalEquipmentType }
     */
    public CodeAdditionalEquipmentType createCodeAdditionalEquipmentType() {
        return new CodeAdditionalEquipmentType();
    }

    /**
     * Create an instance of {@link CodeRunwayApproachGuidanceType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayApproachGuidanceType }
     */
    public CodeRunwayApproachGuidanceType createCodeRunwayApproachGuidanceType() {
        return new CodeRunwayApproachGuidanceType();
    }

    /**
     * Create an instance of {@link CodeApproachLightingICAOType }
     * 
     * @return
     *     the new instance of {@link CodeApproachLightingICAOType }
     */
    public CodeApproachLightingICAOType createCodeApproachLightingICAOType() {
        return new CodeApproachLightingICAOType();
    }

    /**
     * Create an instance of {@link CodeApproachLightingType }
     * 
     * @return
     *     the new instance of {@link CodeApproachLightingType }
     */
    public CodeApproachLightingType createCodeApproachLightingType() {
        return new CodeApproachLightingType();
    }

    /**
     * Create an instance of {@link CodeApproachPrefixType }
     * 
     * @return
     *     the new instance of {@link CodeApproachPrefixType }
     */
    public CodeApproachPrefixType createCodeApproachPrefixType() {
        return new CodeApproachPrefixType();
    }

    /**
     * Create an instance of {@link CodeApproachType }
     * 
     * @return
     *     the new instance of {@link CodeApproachType }
     */
    public CodeApproachType createCodeApproachType() {
        return new CodeApproachType();
    }

    /**
     * Create an instance of {@link CodeApprovalType }
     * 
     * @return
     *     the new instance of {@link CodeApprovalType }
     */
    public CodeApprovalType createCodeApprovalType() {
        return new CodeApprovalType();
    }

    /**
     * Create an instance of {@link CodeApronElementType }
     * 
     * @return
     *     the new instance of {@link CodeApronElementType }
     */
    public CodeApronElementType createCodeApronElementType() {
        return new CodeApronElementType();
    }

    /**
     * Create an instance of {@link CodeApronSectionType }
     * 
     * @return
     *     the new instance of {@link CodeApronSectionType }
     */
    public CodeApronSectionType createCodeApronSectionType() {
        return new CodeApronSectionType();
    }

    /**
     * Create an instance of {@link CodeArcDirectionType }
     * 
     * @return
     *     the new instance of {@link CodeArcDirectionType }
     */
    public CodeArcDirectionType createCodeArcDirectionType() {
        return new CodeArcDirectionType();
    }

    /**
     * Create an instance of {@link CodeArrestingGearEnergyAbsorbType }
     * 
     * @return
     *     the new instance of {@link CodeArrestingGearEnergyAbsorbType }
     */
    public CodeArrestingGearEnergyAbsorbType createCodeArrestingGearEnergyAbsorbType() {
        return new CodeArrestingGearEnergyAbsorbType();
    }

    /**
     * Create an instance of {@link CodeArrestingGearEngageDeviceType }
     * 
     * @return
     *     the new instance of {@link CodeArrestingGearEngageDeviceType }
     */
    public CodeArrestingGearEngageDeviceType createCodeArrestingGearEngageDeviceType() {
        return new CodeArrestingGearEngageDeviceType();
    }

    /**
     * Create an instance of {@link CodeATCReportingType }
     * 
     * @return
     *     the new instance of {@link CodeATCReportingType }
     */
    public CodeATCReportingType createCodeATCReportingType() {
        return new CodeATCReportingType();
    }

    /**
     * Create an instance of {@link CodeAuralMorseType }
     * 
     * @return
     *     the new instance of {@link CodeAuralMorseType }
     */
    public CodeAuralMorseType createCodeAuralMorseType() {
        return new CodeAuralMorseType();
    }

    /**
     * Create an instance of {@link CodeAuthorityRoleType }
     * 
     * @return
     *     the new instance of {@link CodeAuthorityRoleType }
     */
    public CodeAuthorityRoleType createCodeAuthorityRoleType() {
        return new CodeAuthorityRoleType();
    }

    /**
     * Create an instance of {@link CodeAuthorityType }
     * 
     * @return
     *     the new instance of {@link CodeAuthorityType }
     */
    public CodeAuthorityType createCodeAuthorityType() {
        return new CodeAuthorityType();
    }

    /**
     * Create an instance of {@link CodeAviationStandardsType }
     * 
     * @return
     *     the new instance of {@link CodeAviationStandardsType }
     */
    public CodeAviationStandardsType createCodeAviationStandardsType() {
        return new CodeAviationStandardsType();
    }

    /**
     * Create an instance of {@link CodeBearingType }
     * 
     * @return
     *     the new instance of {@link CodeBearingType }
     */
    public CodeBearingType createCodeBearingType() {
        return new CodeBearingType();
    }

    /**
     * Create an instance of {@link CodeBuoyType }
     * 
     * @return
     *     the new instance of {@link CodeBuoyType }
     */
    public CodeBuoyType createCodeBuoyType() {
        return new CodeBuoyType();
    }

    /**
     * Create an instance of {@link CodeCardinalDirectionType }
     * 
     * @return
     *     the new instance of {@link CodeCardinalDirectionType }
     */
    public CodeCardinalDirectionType createCodeCardinalDirectionType() {
        return new CodeCardinalDirectionType();
    }

    /**
     * Create an instance of {@link CodeCheckpointCategoryType }
     * 
     * @return
     *     the new instance of {@link CodeCheckpointCategoryType }
     */
    public CodeCheckpointCategoryType createCodeCheckpointCategoryType() {
        return new CodeCheckpointCategoryType();
    }

    /**
     * Create an instance of {@link CodeColourType }
     * 
     * @return
     *     the new instance of {@link CodeColourType }
     */
    public CodeColourType createCodeColourType() {
        return new CodeColourType();
    }

    /**
     * Create an instance of {@link CodeCommunicationChannelType }
     * 
     * @return
     *     the new instance of {@link CodeCommunicationChannelType }
     */
    public CodeCommunicationChannelType createCodeCommunicationChannelType() {
        return new CodeCommunicationChannelType();
    }

    /**
     * Create an instance of {@link CodeCommunicationDirectionType }
     * 
     * @return
     *     the new instance of {@link CodeCommunicationDirectionType }
     */
    public CodeCommunicationDirectionType createCodeCommunicationDirectionType() {
        return new CodeCommunicationDirectionType();
    }

    /**
     * Create an instance of {@link CodeCommunicationModeType }
     * 
     * @return
     *     the new instance of {@link CodeCommunicationModeType }
     */
    public CodeCommunicationModeType createCodeCommunicationModeType() {
        return new CodeCommunicationModeType();
    }

    /**
     * Create an instance of {@link CodeComparisonType }
     * 
     * @return
     *     the new instance of {@link CodeComparisonType }
     */
    public CodeComparisonType createCodeComparisonType() {
        return new CodeComparisonType();
    }

    /**
     * Create an instance of {@link CodeContaminationType }
     * 
     * @return
     *     the new instance of {@link CodeContaminationType }
     */
    public CodeContaminationType createCodeContaminationType() {
        return new CodeContaminationType();
    }

    /**
     * Create an instance of {@link CodeCourseQualityILSType }
     * 
     * @return
     *     the new instance of {@link CodeCourseQualityILSType }
     */
    public CodeCourseQualityILSType createCodeCourseQualityILSType() {
        return new CodeCourseQualityILSType();
    }

    /**
     * Create an instance of {@link CodeCourseType }
     * 
     * @return
     *     the new instance of {@link CodeCourseType }
     */
    public CodeCourseType createCodeCourseType() {
        return new CodeCourseType();
    }

    /**
     * Create an instance of {@link CodeDayType }
     * 
     * @return
     *     the new instance of {@link CodeDayType }
     */
    public CodeDayType createCodeDayType() {
        return new CodeDayType();
    }

    /**
     * Create an instance of {@link CodeDeclaredDistanceType }
     * 
     * @return
     *     the new instance of {@link CodeDeclaredDistanceType }
     */
    public CodeDeclaredDistanceType createCodeDeclaredDistanceType() {
        return new CodeDeclaredDistanceType();
    }

    /**
     * Create an instance of {@link CodeDesignatedPointDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeDesignatedPointDesignatorType }
     */
    public CodeDesignatedPointDesignatorType createCodeDesignatedPointDesignatorType() {
        return new CodeDesignatedPointDesignatorType();
    }

    /**
     * Create an instance of {@link CodeDesignatedPointType }
     * 
     * @return
     *     the new instance of {@link CodeDesignatedPointType }
     */
    public CodeDesignatedPointType createCodeDesignatedPointType() {
        return new CodeDesignatedPointType();
    }

    /**
     * Create an instance of {@link CodeDesignStandardType }
     * 
     * @return
     *     the new instance of {@link CodeDesignStandardType }
     */
    public CodeDesignStandardType createCodeDesignStandardType() {
        return new CodeDesignStandardType();
    }

    /**
     * Create an instance of {@link CodeDirectionReferenceType }
     * 
     * @return
     *     the new instance of {@link CodeDirectionReferenceType }
     */
    public CodeDirectionReferenceType createCodeDirectionReferenceType() {
        return new CodeDirectionReferenceType();
    }

    /**
     * Create an instance of {@link CodeDirectionTurnType }
     * 
     * @return
     *     the new instance of {@link CodeDirectionTurnType }
     */
    public CodeDirectionTurnType createCodeDirectionTurnType() {
        return new CodeDirectionTurnType();
    }

    /**
     * Create an instance of {@link CodeDirectionType }
     * 
     * @return
     *     the new instance of {@link CodeDirectionType }
     */
    public CodeDirectionType createCodeDirectionType() {
        return new CodeDirectionType();
    }

    /**
     * Create an instance of {@link CodeDistanceIndicationType }
     * 
     * @return
     *     the new instance of {@link CodeDistanceIndicationType }
     */
    public CodeDistanceIndicationType createCodeDistanceIndicationType() {
        return new CodeDistanceIndicationType();
    }

    /**
     * Create an instance of {@link CodeDMEChannelType }
     * 
     * @return
     *     the new instance of {@link CodeDMEChannelType }
     */
    public CodeDMEChannelType createCodeDMEChannelType() {
        return new CodeDMEChannelType();
    }

    /**
     * Create an instance of {@link CodeDMEType }
     * 
     * @return
     *     the new instance of {@link CodeDMEType }
     */
    public CodeDMEType createCodeDMEType() {
        return new CodeDMEType();
    }

    /**
     * Create an instance of {@link CodeEmissionBandType }
     * 
     * @return
     *     the new instance of {@link CodeEmissionBandType }
     */
    public CodeEmissionBandType createCodeEmissionBandType() {
        return new CodeEmissionBandType();
    }

    /**
     * Create an instance of {@link CodeEquipmentAntiCollisionType }
     * 
     * @return
     *     the new instance of {@link CodeEquipmentAntiCollisionType }
     */
    public CodeEquipmentAntiCollisionType createCodeEquipmentAntiCollisionType() {
        return new CodeEquipmentAntiCollisionType();
    }

    /**
     * Create an instance of {@link CodeEquipmentUnavailableType }
     * 
     * @return
     *     the new instance of {@link CodeEquipmentUnavailableType }
     */
    public CodeEquipmentUnavailableType createCodeEquipmentUnavailableType() {
        return new CodeEquipmentUnavailableType();
    }

    /**
     * Create an instance of {@link CodeFacilityRankingType }
     * 
     * @return
     *     the new instance of {@link CodeFacilityRankingType }
     */
    public CodeFacilityRankingType createCodeFacilityRankingType() {
        return new CodeFacilityRankingType();
    }

    /**
     * Create an instance of {@link CodeFireFightingType }
     * 
     * @return
     *     the new instance of {@link CodeFireFightingType }
     */
    public CodeFireFightingType createCodeFireFightingType() {
        return new CodeFireFightingType();
    }

    /**
     * Create an instance of {@link CodeFlightDestinationType }
     * 
     * @return
     *     the new instance of {@link CodeFlightDestinationType }
     */
    public CodeFlightDestinationType createCodeFlightDestinationType() {
        return new CodeFlightDestinationType();
    }

    /**
     * Create an instance of {@link CodeFlightOriginType }
     * 
     * @return
     *     the new instance of {@link CodeFlightOriginType }
     */
    public CodeFlightOriginType createCodeFlightOriginType() {
        return new CodeFlightOriginType();
    }

    /**
     * Create an instance of {@link CodeFlightPurposeType }
     * 
     * @return
     *     the new instance of {@link CodeFlightPurposeType }
     */
    public CodeFlightPurposeType createCodeFlightPurposeType() {
        return new CodeFlightPurposeType();
    }

    /**
     * Create an instance of {@link CodeFlightRestrictionDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeFlightRestrictionDesignatorType }
     */
    public CodeFlightRestrictionDesignatorType createCodeFlightRestrictionDesignatorType() {
        return new CodeFlightRestrictionDesignatorType();
    }

    /**
     * Create an instance of {@link CodeFlightRestrictionType }
     * 
     * @return
     *     the new instance of {@link CodeFlightRestrictionType }
     */
    public CodeFlightRestrictionType createCodeFlightRestrictionType() {
        return new CodeFlightRestrictionType();
    }

    /**
     * Create an instance of {@link CodeFlightRuleType }
     * 
     * @return
     *     the new instance of {@link CodeFlightRuleType }
     */
    public CodeFlightRuleType createCodeFlightRuleType() {
        return new CodeFlightRuleType();
    }

    /**
     * Create an instance of {@link CodeFlightStatusType }
     * 
     * @return
     *     the new instance of {@link CodeFlightStatusType }
     */
    public CodeFlightStatusType createCodeFlightStatusType() {
        return new CodeFlightStatusType();
    }

    /**
     * Create an instance of {@link CodeFlightType }
     * 
     * @return
     *     the new instance of {@link CodeFlightType }
     */
    public CodeFlightType createCodeFlightType() {
        return new CodeFlightType();
    }

    /**
     * Create an instance of {@link CodeFlowConditionOperationType }
     * 
     * @return
     *     the new instance of {@link CodeFlowConditionOperationType }
     */
    public CodeFlowConditionOperationType createCodeFlowConditionOperationType() {
        return new CodeFlowConditionOperationType();
    }

    /**
     * Create an instance of {@link CodeFreeFlightType }
     * 
     * @return
     *     the new instance of {@link CodeFreeFlightType }
     */
    public CodeFreeFlightType createCodeFreeFlightType() {
        return new CodeFreeFlightType();
    }

    /**
     * Create an instance of {@link CodeFrictionDeviceType }
     * 
     * @return
     *     the new instance of {@link CodeFrictionDeviceType }
     */
    public CodeFrictionDeviceType createCodeFrictionDeviceType() {
        return new CodeFrictionDeviceType();
    }

    /**
     * Create an instance of {@link CodeFrictionEstimateType }
     * 
     * @return
     *     the new instance of {@link CodeFrictionEstimateType }
     */
    public CodeFrictionEstimateType createCodeFrictionEstimateType() {
        return new CodeFrictionEstimateType();
    }

    /**
     * Create an instance of {@link CodeFuelType }
     * 
     * @return
     *     the new instance of {@link CodeFuelType }
     */
    public CodeFuelType createCodeFuelType() {
        return new CodeFuelType();
    }

    /**
     * Create an instance of {@link CodeGeoBorderType }
     * 
     * @return
     *     the new instance of {@link CodeGeoBorderType }
     */
    public CodeGeoBorderType createCodeGeoBorderType() {
        return new CodeGeoBorderType();
    }

    /**
     * Create an instance of {@link CodeGradeSeparationType }
     * 
     * @return
     *     the new instance of {@link CodeGradeSeparationType }
     */
    public CodeGradeSeparationType createCodeGradeSeparationType() {
        return new CodeGradeSeparationType();
    }

    /**
     * Create an instance of {@link CodeGroundLightingType }
     * 
     * @return
     *     the new instance of {@link CodeGroundLightingType }
     */
    public CodeGroundLightingType createCodeGroundLightingType() {
        return new CodeGroundLightingType();
    }

    /**
     * Create an instance of {@link CodeGuidanceLineType }
     * 
     * @return
     *     the new instance of {@link CodeGuidanceLineType }
     */
    public CodeGuidanceLineType createCodeGuidanceLineType() {
        return new CodeGuidanceLineType();
    }

    /**
     * Create an instance of {@link CodeHeightReferenceType }
     * 
     * @return
     *     the new instance of {@link CodeHeightReferenceType }
     */
    public CodeHeightReferenceType createCodeHeightReferenceType() {
        return new CodeHeightReferenceType();
    }

    /**
     * Create an instance of {@link CodeHelicopterPerformanceClassType }
     * 
     * @return
     *     the new instance of {@link CodeHelicopterPerformanceClassType }
     */
    public CodeHelicopterPerformanceClassType createCodeHelicopterPerformanceClassType() {
        return new CodeHelicopterPerformanceClassType();
    }

    /**
     * Create an instance of {@link CodeHoldingCategoryType }
     * 
     * @return
     *     the new instance of {@link CodeHoldingCategoryType }
     */
    public CodeHoldingCategoryType createCodeHoldingCategoryType() {
        return new CodeHoldingCategoryType();
    }

    /**
     * Create an instance of {@link CodeHoldingUsageType }
     * 
     * @return
     *     the new instance of {@link CodeHoldingUsageType }
     */
    public CodeHoldingUsageType createCodeHoldingUsageType() {
        return new CodeHoldingUsageType();
    }

    /**
     * Create an instance of {@link CodeHoldingUseType }
     * 
     * @return
     *     the new instance of {@link CodeHoldingUseType }
     */
    public CodeHoldingUseType createCodeHoldingUseType() {
        return new CodeHoldingUseType();
    }

    /**
     * Create an instance of {@link CodeIATAType }
     * 
     * @return
     *     the new instance of {@link CodeIATAType }
     */
    public CodeIATAType createCodeIATAType() {
        return new CodeIATAType();
    }

    /**
     * Create an instance of {@link CodeICAOType }
     * 
     * @return
     *     the new instance of {@link CodeICAOType }
     */
    public CodeICAOType createCodeICAOType() {
        return new CodeICAOType();
    }

    /**
     * Create an instance of {@link CodeILSBackCourseType }
     * 
     * @return
     *     the new instance of {@link CodeILSBackCourseType }
     */
    public CodeILSBackCourseType createCodeILSBackCourseType() {
        return new CodeILSBackCourseType();
    }

    /**
     * Create an instance of {@link CodeIntegrityLevelILSType }
     * 
     * @return
     *     the new instance of {@link CodeIntegrityLevelILSType }
     */
    public CodeIntegrityLevelILSType createCodeIntegrityLevelILSType() {
        return new CodeIntegrityLevelILSType();
    }

    /**
     * Create an instance of {@link CodeIntensityStandByType }
     * 
     * @return
     *     the new instance of {@link CodeIntensityStandByType }
     */
    public CodeIntensityStandByType createCodeIntensityStandByType() {
        return new CodeIntensityStandByType();
    }

    /**
     * Create an instance of {@link CodeLanguageType }
     * 
     * @return
     *     the new instance of {@link CodeLanguageType }
     */
    public CodeLanguageType createCodeLanguageType() {
        return new CodeLanguageType();
    }

    /**
     * Create an instance of {@link CodeLevelSeriesType }
     * 
     * @return
     *     the new instance of {@link CodeLevelSeriesType }
     */
    public CodeLevelSeriesType createCodeLevelSeriesType() {
        return new CodeLevelSeriesType();
    }

    /**
     * Create an instance of {@link CodeLevelTableDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeLevelTableDesignatorType }
     */
    public CodeLevelTableDesignatorType createCodeLevelTableDesignatorType() {
        return new CodeLevelTableDesignatorType();
    }

    /**
     * Create an instance of {@link CodeLevelType }
     * 
     * @return
     *     the new instance of {@link CodeLevelType }
     */
    public CodeLevelType createCodeLevelType() {
        return new CodeLevelType();
    }

    /**
     * Create an instance of {@link CodeLightHoldingPositionType }
     * 
     * @return
     *     the new instance of {@link CodeLightHoldingPositionType }
     */
    public CodeLightHoldingPositionType createCodeLightHoldingPositionType() {
        return new CodeLightHoldingPositionType();
    }

    /**
     * Create an instance of {@link CodeLightingJARType }
     * 
     * @return
     *     the new instance of {@link CodeLightingJARType }
     */
    public CodeLightingJARType createCodeLightingJARType() {
        return new CodeLightingJARType();
    }

    /**
     * Create an instance of {@link CodeLightIntensityType }
     * 
     * @return
     *     the new instance of {@link CodeLightIntensityType }
     */
    public CodeLightIntensityType createCodeLightIntensityType() {
        return new CodeLightIntensityType();
    }

    /**
     * Create an instance of {@link CodeLightSourceType }
     * 
     * @return
     *     the new instance of {@link CodeLightSourceType }
     */
    public CodeLightSourceType createCodeLightSourceType() {
        return new CodeLightSourceType();
    }

    /**
     * Create an instance of {@link CodeLoadingBridgeType }
     * 
     * @return
     *     the new instance of {@link CodeLoadingBridgeType }
     */
    public CodeLoadingBridgeType createCodeLoadingBridgeType() {
        return new CodeLoadingBridgeType();
    }

    /**
     * Create an instance of {@link CodeLocationQualifierType }
     * 
     * @return
     *     the new instance of {@link CodeLocationQualifierType }
     */
    public CodeLocationQualifierType createCodeLocationQualifierType() {
        return new CodeLocationQualifierType();
    }

    /**
     * Create an instance of {@link CodeLogicalOperatorType }
     * 
     * @return
     *     the new instance of {@link CodeLogicalOperatorType }
     */
    public CodeLogicalOperatorType createCodeLogicalOperatorType() {
        return new CodeLogicalOperatorType();
    }

    /**
     * Create an instance of {@link CodeMarkerBeaconSignalType }
     * 
     * @return
     *     the new instance of {@link CodeMarkerBeaconSignalType }
     */
    public CodeMarkerBeaconSignalType createCodeMarkerBeaconSignalType() {
        return new CodeMarkerBeaconSignalType();
    }

    /**
     * Create an instance of {@link CodeMarkingConditionType }
     * 
     * @return
     *     the new instance of {@link CodeMarkingConditionType }
     */
    public CodeMarkingConditionType createCodeMarkingConditionType() {
        return new CodeMarkingConditionType();
    }

    /**
     * Create an instance of {@link CodeMarkingStyleType }
     * 
     * @return
     *     the new instance of {@link CodeMarkingStyleType }
     */
    public CodeMarkingStyleType createCodeMarkingStyleType() {
        return new CodeMarkingStyleType();
    }

    /**
     * Create an instance of {@link CodeMeteoConditionsType }
     * 
     * @return
     *     the new instance of {@link CodeMeteoConditionsType }
     */
    public CodeMeteoConditionsType createCodeMeteoConditionsType() {
        return new CodeMeteoConditionsType();
    }

    /**
     * Create an instance of {@link CodeMilitaryOperationsType }
     * 
     * @return
     *     the new instance of {@link CodeMilitaryOperationsType }
     */
    public CodeMilitaryOperationsType createCodeMilitaryOperationsType() {
        return new CodeMilitaryOperationsType();
    }

    /**
     * Create an instance of {@link CodeMilitaryRoutePointType }
     * 
     * @return
     *     the new instance of {@link CodeMilitaryRoutePointType }
     */
    public CodeMilitaryRoutePointType createCodeMilitaryRoutePointType() {
        return new CodeMilitaryRoutePointType();
    }

    /**
     * Create an instance of {@link CodeMilitaryStatusType }
     * 
     * @return
     *     the new instance of {@link CodeMilitaryStatusType }
     */
    public CodeMilitaryStatusType createCodeMilitaryStatusType() {
        return new CodeMilitaryStatusType();
    }

    /**
     * Create an instance of {@link CodeMilitaryTrainingType }
     * 
     * @return
     *     the new instance of {@link CodeMilitaryTrainingType }
     */
    public CodeMilitaryTrainingType createCodeMilitaryTrainingType() {
        return new CodeMilitaryTrainingType();
    }

    /**
     * Create an instance of {@link CodeMinimaFinalApproachPathType }
     * 
     * @return
     *     the new instance of {@link CodeMinimaFinalApproachPathType }
     */
    public CodeMinimaFinalApproachPathType createCodeMinimaFinalApproachPathType() {
        return new CodeMinimaFinalApproachPathType();
    }

    /**
     * Create an instance of {@link CodeMissedApproachType }
     * 
     * @return
     *     the new instance of {@link CodeMissedApproachType }
     */
    public CodeMissedApproachType createCodeMissedApproachType() {
        return new CodeMissedApproachType();
    }

    /**
     * Create an instance of {@link CodeMLSAzimuthType }
     * 
     * @return
     *     the new instance of {@link CodeMLSAzimuthType }
     */
    public CodeMLSAzimuthType createCodeMLSAzimuthType() {
        return new CodeMLSAzimuthType();
    }

    /**
     * Create an instance of {@link CodeMLSChannelType }
     * 
     * @return
     *     the new instance of {@link CodeMLSChannelType }
     */
    public CodeMLSChannelType createCodeMLSChannelType() {
        return new CodeMLSChannelType();
    }

    /**
     * Create an instance of {@link CodeNavaidDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeNavaidDesignatorType }
     */
    public CodeNavaidDesignatorType createCodeNavaidDesignatorType() {
        return new CodeNavaidDesignatorType();
    }

    /**
     * Create an instance of {@link CodeNavaidPurposeType }
     * 
     * @return
     *     the new instance of {@link CodeNavaidPurposeType }
     */
    public CodeNavaidPurposeType createCodeNavaidPurposeType() {
        return new CodeNavaidPurposeType();
    }

    /**
     * Create an instance of {@link CodeNavaidServiceType }
     * 
     * @return
     *     the new instance of {@link CodeNavaidServiceType }
     */
    public CodeNavaidServiceType createCodeNavaidServiceType() {
        return new CodeNavaidServiceType();
    }

    /**
     * Create an instance of {@link CodeNavigationAreaRestrictionType }
     * 
     * @return
     *     the new instance of {@link CodeNavigationAreaRestrictionType }
     */
    public CodeNavigationAreaRestrictionType createCodeNavigationAreaRestrictionType() {
        return new CodeNavigationAreaRestrictionType();
    }

    /**
     * Create an instance of {@link CodeNavigationAreaType }
     * 
     * @return
     *     the new instance of {@link CodeNavigationAreaType }
     */
    public CodeNavigationAreaType createCodeNavigationAreaType() {
        return new CodeNavigationAreaType();
    }

    /**
     * Create an instance of {@link CodeNavigationEquipmentType }
     * 
     * @return
     *     the new instance of {@link CodeNavigationEquipmentType }
     */
    public CodeNavigationEquipmentType createCodeNavigationEquipmentType() {
        return new CodeNavigationEquipmentType();
    }

    /**
     * Create an instance of {@link CodeNavigationSpecificationType }
     * 
     * @return
     *     the new instance of {@link CodeNavigationSpecificationType }
     */
    public CodeNavigationSpecificationType createCodeNavigationSpecificationType() {
        return new CodeNavigationSpecificationType();
    }

    /**
     * Create an instance of {@link CodeNDBUsageType }
     * 
     * @return
     *     the new instance of {@link CodeNDBUsageType }
     */
    public CodeNDBUsageType createCodeNDBUsageType() {
        return new CodeNDBUsageType();
    }

    /**
     * Create an instance of {@link CodeNitrogenType }
     * 
     * @return
     *     the new instance of {@link CodeNitrogenType }
     */
    public CodeNitrogenType createCodeNitrogenType() {
        return new CodeNitrogenType();
    }

    /**
     * Create an instance of {@link CodeNorthReferenceType }
     * 
     * @return
     *     the new instance of {@link CodeNorthReferenceType }
     */
    public CodeNorthReferenceType createCodeNorthReferenceType() {
        return new CodeNorthReferenceType();
    }

    /**
     * Create an instance of {@link CodeNotePurposeType }
     * 
     * @return
     *     the new instance of {@link CodeNotePurposeType }
     */
    public CodeNotePurposeType createCodeNotePurposeType() {
        return new CodeNotePurposeType();
    }

    /**
     * Create an instance of {@link CodeObstacleAreaType }
     * 
     * @return
     *     the new instance of {@link CodeObstacleAreaType }
     */
    public CodeObstacleAreaType createCodeObstacleAreaType() {
        return new CodeObstacleAreaType();
    }

    /**
     * Create an instance of {@link CodeObstacleAssessmentSurfaceType }
     * 
     * @return
     *     the new instance of {@link CodeObstacleAssessmentSurfaceType }
     */
    public CodeObstacleAssessmentSurfaceType createCodeObstacleAssessmentSurfaceType() {
        return new CodeObstacleAssessmentSurfaceType();
    }

    /**
     * Create an instance of {@link CodeObstructionIdSurfaceZoneType }
     * 
     * @return
     *     the new instance of {@link CodeObstructionIdSurfaceZoneType }
     */
    public CodeObstructionIdSurfaceZoneType createCodeObstructionIdSurfaceZoneType() {
        return new CodeObstructionIdSurfaceZoneType();
    }

    /**
     * Create an instance of {@link CodeOilType }
     * 
     * @return
     *     the new instance of {@link CodeOilType }
     */
    public CodeOilType createCodeOilType() {
        return new CodeOilType();
    }

    /**
     * Create an instance of {@link CodeOperationAirportHeliportType }
     * 
     * @return
     *     the new instance of {@link CodeOperationAirportHeliportType }
     */
    public CodeOperationAirportHeliportType createCodeOperationAirportHeliportType() {
        return new CodeOperationAirportHeliportType();
    }

    /**
     * Create an instance of {@link CodeOperationManoeuvringAreaType }
     * 
     * @return
     *     the new instance of {@link CodeOperationManoeuvringAreaType }
     */
    public CodeOperationManoeuvringAreaType createCodeOperationManoeuvringAreaType() {
        return new CodeOperationManoeuvringAreaType();
    }

    /**
     * Create an instance of {@link CodeOrganisationDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeOrganisationDesignatorType }
     */
    public CodeOrganisationDesignatorType createCodeOrganisationDesignatorType() {
        return new CodeOrganisationDesignatorType();
    }

    /**
     * Create an instance of {@link CodeOrganisationHierarchyType }
     * 
     * @return
     *     the new instance of {@link CodeOrganisationHierarchyType }
     */
    public CodeOrganisationHierarchyType createCodeOrganisationHierarchyType() {
        return new CodeOrganisationHierarchyType();
    }

    /**
     * Create an instance of {@link CodeOrganisationType }
     * 
     * @return
     *     the new instance of {@link CodeOrganisationType }
     */
    public CodeOrganisationType createCodeOrganisationType() {
        return new CodeOrganisationType();
    }

    /**
     * Create an instance of {@link CodeOxygenType }
     * 
     * @return
     *     the new instance of {@link CodeOxygenType }
     */
    public CodeOxygenType createCodeOxygenType() {
        return new CodeOxygenType();
    }

    /**
     * Create an instance of {@link CodePARType }
     * 
     * @return
     *     the new instance of {@link CodePARType }
     */
    public CodePARType createCodePARType() {
        return new CodePARType();
    }

    /**
     * Create an instance of {@link CodePassengerServiceType }
     * 
     * @return
     *     the new instance of {@link CodePassengerServiceType }
     */
    public CodePassengerServiceType createCodePassengerServiceType() {
        return new CodePassengerServiceType();
    }

    /**
     * Create an instance of {@link CodePavementStrengthMethodType }
     * 
     * @return
     *     the new instance of {@link CodePavementStrengthMethodType }
     */
    public CodePavementStrengthMethodType createCodePavementStrengthMethodType() {
        return new CodePavementStrengthMethodType();
    }

    /**
     * Create an instance of {@link CodePavementBehaviourType }
     * 
     * @return
     *     the new instance of {@link CodePavementBehaviourType }
     */
    public CodePavementBehaviourType createCodePavementBehaviourType() {
        return new CodePavementBehaviourType();
    }

    /**
     * Create an instance of {@link CodePavementSubgradeType }
     * 
     * @return
     *     the new instance of {@link CodePavementSubgradeType }
     */
    public CodePavementSubgradeType createCodePavementSubgradeType() {
        return new CodePavementSubgradeType();
    }

    /**
     * Create an instance of {@link CodeTyrePressureType }
     * 
     * @return
     *     the new instance of {@link CodeTyrePressureType }
     */
    public CodeTyrePressureType createCodeTyrePressureType() {
        return new CodeTyrePressureType();
    }

    /**
     * Create an instance of {@link CodePilotControlledLightingType }
     * 
     * @return
     *     the new instance of {@link CodePilotControlledLightingType }
     */
    public CodePilotControlledLightingType createCodePilotControlledLightingType() {
        return new CodePilotControlledLightingType();
    }

    /**
     * Create an instance of {@link CodePositionInILSType }
     * 
     * @return
     *     the new instance of {@link CodePositionInILSType }
     */
    public CodePositionInILSType createCodePositionInILSType() {
        return new CodePositionInILSType();
    }

    /**
     * Create an instance of {@link CodePrimaryRadarType }
     * 
     * @return
     *     the new instance of {@link CodePrimaryRadarType }
     */
    public CodePrimaryRadarType createCodePrimaryRadarType() {
        return new CodePrimaryRadarType();
    }

    /**
     * Create an instance of {@link CodeProcedureAvailabilityType }
     * 
     * @return
     *     the new instance of {@link CodeProcedureAvailabilityType }
     */
    public CodeProcedureAvailabilityType createCodeProcedureAvailabilityType() {
        return new CodeProcedureAvailabilityType();
    }

    /**
     * Create an instance of {@link CodeProcedureCodingStandardType }
     * 
     * @return
     *     the new instance of {@link CodeProcedureCodingStandardType }
     */
    public CodeProcedureCodingStandardType createCodeProcedureCodingStandardType() {
        return new CodeProcedureCodingStandardType();
    }

    /**
     * Create an instance of {@link CodeFinalSegmentPointType }
     * 
     * @return
     *     the new instance of {@link CodeFinalSegmentPointType }
     */
    public CodeFinalSegmentPointType createCodeFinalSegmentPointType() {
        return new CodeFinalSegmentPointType();
    }

    /**
     * Create an instance of {@link CodeProcedureFixRoleType }
     * 
     * @return
     *     the new instance of {@link CodeProcedureFixRoleType }
     */
    public CodeProcedureFixRoleType createCodeProcedureFixRoleType() {
        return new CodeProcedureFixRoleType();
    }

    /**
     * Create an instance of {@link CodeProcedurePhaseType }
     * 
     * @return
     *     the new instance of {@link CodeProcedurePhaseType }
     */
    public CodeProcedurePhaseType createCodeProcedurePhaseType() {
        return new CodeProcedurePhaseType();
    }

    /**
     * Create an instance of {@link CodeProtectAreaSectionType }
     * 
     * @return
     *     the new instance of {@link CodeProtectAreaSectionType }
     */
    public CodeProtectAreaSectionType createCodeProtectAreaSectionType() {
        return new CodeProtectAreaSectionType();
    }

    /**
     * Create an instance of {@link CodeRadarServiceType }
     * 
     * @return
     *     the new instance of {@link CodeRadarServiceType }
     */
    public CodeRadarServiceType createCodeRadarServiceType() {
        return new CodeRadarServiceType();
    }

    /**
     * Create an instance of {@link CodeRadioEmissionType }
     * 
     * @return
     *     the new instance of {@link CodeRadioEmissionType }
     */
    public CodeRadioEmissionType createCodeRadioEmissionType() {
        return new CodeRadioEmissionType();
    }

    /**
     * Create an instance of {@link CodeRadioFrequencyAreaType }
     * 
     * @return
     *     the new instance of {@link CodeRadioFrequencyAreaType }
     */
    public CodeRadioFrequencyAreaType createCodeRadioFrequencyAreaType() {
        return new CodeRadioFrequencyAreaType();
    }

    /**
     * Create an instance of {@link CodeRadioSignalType }
     * 
     * @return
     *     the new instance of {@link CodeRadioSignalType }
     */
    public CodeRadioSignalType createCodeRadioSignalType() {
        return new CodeRadioSignalType();
    }

    /**
     * Create an instance of {@link CodeReferenceRoleType }
     * 
     * @return
     *     the new instance of {@link CodeReferenceRoleType }
     */
    public CodeReferenceRoleType createCodeReferenceRoleType() {
        return new CodeReferenceRoleType();
    }

    /**
     * Create an instance of {@link CodeReflectorType }
     * 
     * @return
     *     the new instance of {@link CodeReflectorType }
     */
    public CodeReflectorType createCodeReflectorType() {
        return new CodeReflectorType();
    }

    /**
     * Create an instance of {@link CodeRelativePositionType }
     * 
     * @return
     *     the new instance of {@link CodeRelativePositionType }
     */
    public CodeRelativePositionType createCodeRelativePositionType() {
        return new CodeRelativePositionType();
    }

    /**
     * Create an instance of {@link ValNavigationAccuracyType }
     * 
     * @return
     *     the new instance of {@link ValNavigationAccuracyType }
     */
    public ValNavigationAccuracyType createValNavigationAccuracyType() {
        return new ValNavigationAccuracyType();
    }

    /**
     * Create an instance of {@link CodeRoadType }
     * 
     * @return
     *     the new instance of {@link CodeRoadType }
     */
    public CodeRoadType createCodeRoadType() {
        return new CodeRoadType();
    }

    /**
     * Create an instance of {@link CodeRouteAvailabilityType }
     * 
     * @return
     *     the new instance of {@link CodeRouteAvailabilityType }
     */
    public CodeRouteAvailabilityType createCodeRouteAvailabilityType() {
        return new CodeRouteAvailabilityType();
    }

    /**
     * Create an instance of {@link CodeRouteDesignatorLetterType }
     * 
     * @return
     *     the new instance of {@link CodeRouteDesignatorLetterType }
     */
    public CodeRouteDesignatorLetterType createCodeRouteDesignatorLetterType() {
        return new CodeRouteDesignatorLetterType();
    }

    /**
     * Create an instance of {@link CodeRouteDesignatorPrefixType }
     * 
     * @return
     *     the new instance of {@link CodeRouteDesignatorPrefixType }
     */
    public CodeRouteDesignatorPrefixType createCodeRouteDesignatorPrefixType() {
        return new CodeRouteDesignatorPrefixType();
    }

    /**
     * Create an instance of {@link CodeRouteDesignatorSuffixType }
     * 
     * @return
     *     the new instance of {@link CodeRouteDesignatorSuffixType }
     */
    public CodeRouteDesignatorSuffixType createCodeRouteDesignatorSuffixType() {
        return new CodeRouteDesignatorSuffixType();
    }

    /**
     * Create an instance of {@link CodeNavigationType }
     * 
     * @return
     *     the new instance of {@link CodeNavigationType }
     */
    public CodeNavigationType createCodeNavigationType() {
        return new CodeNavigationType();
    }

    /**
     * Create an instance of {@link CodeRouteOriginType }
     * 
     * @return
     *     the new instance of {@link CodeRouteOriginType }
     */
    public CodeRouteOriginType createCodeRouteOriginType() {
        return new CodeRouteOriginType();
    }

    /**
     * Create an instance of {@link CodeRouteSegmentPathType }
     * 
     * @return
     *     the new instance of {@link CodeRouteSegmentPathType }
     */
    public CodeRouteSegmentPathType createCodeRouteSegmentPathType() {
        return new CodeRouteSegmentPathType();
    }

    /**
     * Create an instance of {@link CodeRouteType }
     * 
     * @return
     *     the new instance of {@link CodeRouteType }
     */
    public CodeRouteType createCodeRouteType() {
        return new CodeRouteType();
    }

    /**
     * Create an instance of {@link CodeRuleProcedureTitleType }
     * 
     * @return
     *     the new instance of {@link CodeRuleProcedureTitleType }
     */
    public CodeRuleProcedureTitleType createCodeRuleProcedureTitleType() {
        return new CodeRuleProcedureTitleType();
    }

    /**
     * Create an instance of {@link CodeRuleProcedureType }
     * 
     * @return
     *     the new instance of {@link CodeRuleProcedureType }
     */
    public CodeRuleProcedureType createCodeRuleProcedureType() {
        return new CodeRuleProcedureType();
    }

    /**
     * Create an instance of {@link CodeRunwayElementType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayElementType }
     */
    public CodeRunwayElementType createCodeRunwayElementType() {
        return new CodeRunwayElementType();
    }

    /**
     * Create an instance of {@link CodeRunwayMarkingType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayMarkingType }
     */
    public CodeRunwayMarkingType createCodeRunwayMarkingType() {
        return new CodeRunwayMarkingType();
    }

    /**
     * Create an instance of {@link CodeRunwayPointRoleType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayPointRoleType }
     */
    public CodeRunwayPointRoleType createCodeRunwayPointRoleType() {
        return new CodeRunwayPointRoleType();
    }

    /**
     * Create an instance of {@link CodeRunwayProtectionAreaType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayProtectionAreaType }
     */
    public CodeRunwayProtectionAreaType createCodeRunwayProtectionAreaType() {
        return new CodeRunwayProtectionAreaType();
    }

    /**
     * Create an instance of {@link CodeRunwaySectionType }
     * 
     * @return
     *     the new instance of {@link CodeRunwaySectionType }
     */
    public CodeRunwaySectionType createCodeRunwaySectionType() {
        return new CodeRunwaySectionType();
    }

    /**
     * Create an instance of {@link CodeRunwayType }
     * 
     * @return
     *     the new instance of {@link CodeRunwayType }
     */
    public CodeRunwayType createCodeRunwayType() {
        return new CodeRunwayType();
    }

    /**
     * Create an instance of {@link CodeRVRReadingType }
     * 
     * @return
     *     the new instance of {@link CodeRVRReadingType }
     */
    public CodeRVRReadingType createCodeRVRReadingType() {
        return new CodeRVRReadingType();
    }

    /**
     * Create an instance of {@link CodeRVSMPointRoleType }
     * 
     * @return
     *     the new instance of {@link CodeRVSMPointRoleType }
     */
    public CodeRVSMPointRoleType createCodeRVSMPointRoleType() {
        return new CodeRVSMPointRoleType();
    }

    /**
     * Create an instance of {@link CodeRVSMType }
     * 
     * @return
     *     the new instance of {@link CodeRVSMType }
     */
    public CodeRVSMType createCodeRVSMType() {
        return new CodeRVSMType();
    }

    /**
     * Create an instance of {@link CodeAreaAltitudeType }
     * 
     * @return
     *     the new instance of {@link CodeAreaAltitudeType }
     */
    public CodeAreaAltitudeType createCodeAreaAltitudeType() {
        return new CodeAreaAltitudeType();
    }

    /**
     * Create an instance of {@link CodeSegmentPathType }
     * 
     * @return
     *     the new instance of {@link CodeSegmentPathType }
     */
    public CodeSegmentPathType createCodeSegmentPathType() {
        return new CodeSegmentPathType();
    }

    /**
     * Create an instance of {@link CodeSegmentTerminationType }
     * 
     * @return
     *     the new instance of {@link CodeSegmentTerminationType }
     */
    public CodeSegmentTerminationType createCodeSegmentTerminationType() {
        return new CodeSegmentTerminationType();
    }

    /**
     * Create an instance of {@link CodeServiceATCType }
     * 
     * @return
     *     the new instance of {@link CodeServiceATCType }
     */
    public CodeServiceATCType createCodeServiceATCType() {
        return new CodeServiceATCType();
    }

    /**
     * Create an instance of {@link CodeServiceATFMType }
     * 
     * @return
     *     the new instance of {@link CodeServiceATFMType }
     */
    public CodeServiceATFMType createCodeServiceATFMType() {
        return new CodeServiceATFMType();
    }

    /**
     * Create an instance of {@link CodeServiceGroundControlType }
     * 
     * @return
     *     the new instance of {@link CodeServiceGroundControlType }
     */
    public CodeServiceGroundControlType createCodeServiceGroundControlType() {
        return new CodeServiceGroundControlType();
    }

    /**
     * Create an instance of {@link CodeServiceInformationType }
     * 
     * @return
     *     the new instance of {@link CodeServiceInformationType }
     */
    public CodeServiceInformationType createCodeServiceInformationType() {
        return new CodeServiceInformationType();
    }

    /**
     * Create an instance of {@link CodeServiceSARType }
     * 
     * @return
     *     the new instance of {@link CodeServiceSARType }
     */
    public CodeServiceSARType createCodeServiceSARType() {
        return new CodeServiceSARType();
    }

    /**
     * Create an instance of {@link CodeSideType }
     * 
     * @return
     *     the new instance of {@link CodeSideType }
     */
    public CodeSideType createCodeSideType() {
        return new CodeSideType();
    }

    /**
     * Create an instance of {@link CodeSignalPerformanceILSType }
     * 
     * @return
     *     the new instance of {@link CodeSignalPerformanceILSType }
     */
    public CodeSignalPerformanceILSType createCodeSignalPerformanceILSType() {
        return new CodeSignalPerformanceILSType();
    }

    /**
     * Create an instance of {@link CodeSpecialDateType }
     * 
     * @return
     *     the new instance of {@link CodeSpecialDateType }
     */
    public CodeSpecialDateType createCodeSpecialDateType() {
        return new CodeSpecialDateType();
    }

    /**
     * Create an instance of {@link CodeSpecialNavigationChainDesignatorType }
     * 
     * @return
     *     the new instance of {@link CodeSpecialNavigationChainDesignatorType }
     */
    public CodeSpecialNavigationChainDesignatorType createCodeSpecialNavigationChainDesignatorType() {
        return new CodeSpecialNavigationChainDesignatorType();
    }

    /**
     * Create an instance of {@link CodeSpecialNavigationStationType }
     * 
     * @return
     *     the new instance of {@link CodeSpecialNavigationStationType }
     */
    public CodeSpecialNavigationStationType createCodeSpecialNavigationStationType() {
        return new CodeSpecialNavigationStationType();
    }

    /**
     * Create an instance of {@link CodeSpecialNavigationSystemType }
     * 
     * @return
     *     the new instance of {@link CodeSpecialNavigationSystemType }
     */
    public CodeSpecialNavigationSystemType createCodeSpecialNavigationSystemType() {
        return new CodeSpecialNavigationSystemType();
    }

    /**
     * Create an instance of {@link CodeSpeedReferenceType }
     * 
     * @return
     *     the new instance of {@link CodeSpeedReferenceType }
     */
    public CodeSpeedReferenceType createCodeSpeedReferenceType() {
        return new CodeSpeedReferenceType();
    }

    /**
     * Create an instance of {@link CodeStandbyPowerType }
     * 
     * @return
     *     the new instance of {@link CodeStandbyPowerType }
     */
    public CodeStandbyPowerType createCodeStandbyPowerType() {
        return new CodeStandbyPowerType();
    }

    /**
     * Create an instance of {@link CodeStatusAirportType }
     * 
     * @return
     *     the new instance of {@link CodeStatusAirportType }
     */
    public CodeStatusAirportType createCodeStatusAirportType() {
        return new CodeStatusAirportType();
    }

    /**
     * Create an instance of {@link CodeStatusAirspaceType }
     * 
     * @return
     *     the new instance of {@link CodeStatusAirspaceType }
     */
    public CodeStatusAirspaceType createCodeStatusAirspaceType() {
        return new CodeStatusAirspaceType();
    }

    /**
     * Create an instance of {@link CodeStatusConstructionType }
     * 
     * @return
     *     the new instance of {@link CodeStatusConstructionType }
     */
    public CodeStatusConstructionType createCodeStatusConstructionType() {
        return new CodeStatusConstructionType();
    }

    /**
     * Create an instance of {@link CodeStatusNavaidType }
     * 
     * @return
     *     the new instance of {@link CodeStatusNavaidType }
     */
    public CodeStatusNavaidType createCodeStatusNavaidType() {
        return new CodeStatusNavaidType();
    }

    /**
     * Create an instance of {@link CodeStatusOperationsType }
     * 
     * @return
     *     the new instance of {@link CodeStatusOperationsType }
     */
    public CodeStatusOperationsType createCodeStatusOperationsType() {
        return new CodeStatusOperationsType();
    }

    /**
     * Create an instance of {@link CodeStatusServiceType }
     * 
     * @return
     *     the new instance of {@link CodeStatusServiceType }
     */
    public CodeStatusServiceType createCodeStatusServiceType() {
        return new CodeStatusServiceType();
    }

    /**
     * Create an instance of {@link CodeSurfaceCompositionType }
     * 
     * @return
     *     the new instance of {@link CodeSurfaceCompositionType }
     */
    public CodeSurfaceCompositionType createCodeSurfaceCompositionType() {
        return new CodeSurfaceCompositionType();
    }

    /**
     * Create an instance of {@link CodeSurfaceConditionType }
     * 
     * @return
     *     the new instance of {@link CodeSurfaceConditionType }
     */
    public CodeSurfaceConditionType createCodeSurfaceConditionType() {
        return new CodeSurfaceConditionType();
    }

    /**
     * Create an instance of {@link CodeSurfacePreparationType }
     * 
     * @return
     *     the new instance of {@link CodeSurfacePreparationType }
     */
    public CodeSurfacePreparationType createCodeSurfacePreparationType() {
        return new CodeSurfacePreparationType();
    }

    /**
     * Create an instance of {@link CodeSystemActivationType }
     * 
     * @return
     *     the new instance of {@link CodeSystemActivationType }
     */
    public CodeSystemActivationType createCodeSystemActivationType() {
        return new CodeSystemActivationType();
    }

    /**
     * Create an instance of {@link CodeTAAType }
     * 
     * @return
     *     the new instance of {@link CodeTAAType }
     */
    public CodeTAAType createCodeTAAType() {
        return new CodeTAAType();
    }

    /**
     * Create an instance of {@link CodeTACANChannelType }
     * 
     * @return
     *     the new instance of {@link CodeTACANChannelType }
     */
    public CodeTACANChannelType createCodeTACANChannelType() {
        return new CodeTACANChannelType();
    }

    /**
     * Create an instance of {@link CodeTaxiwayElementType }
     * 
     * @return
     *     the new instance of {@link CodeTaxiwayElementType }
     */
    public CodeTaxiwayElementType createCodeTaxiwayElementType() {
        return new CodeTaxiwayElementType();
    }

    /**
     * Create an instance of {@link CodeTaxiwaySectionType }
     * 
     * @return
     *     the new instance of {@link CodeTaxiwaySectionType }
     */
    public CodeTaxiwaySectionType createCodeTaxiwaySectionType() {
        return new CodeTaxiwaySectionType();
    }

    /**
     * Create an instance of {@link CodeTaxiwayType }
     * 
     * @return
     *     the new instance of {@link CodeTaxiwayType }
     */
    public CodeTaxiwayType createCodeTaxiwayType() {
        return new CodeTaxiwayType();
    }

    /**
     * Create an instance of {@link CodeTelecomNetworkType }
     * 
     * @return
     *     the new instance of {@link CodeTelecomNetworkType }
     */
    public CodeTelecomNetworkType createCodeTelecomNetworkType() {
        return new CodeTelecomNetworkType();
    }

    /**
     * Create an instance of {@link CodeTimeEventCombinationType }
     * 
     * @return
     *     the new instance of {@link CodeTimeEventCombinationType }
     */
    public CodeTimeEventCombinationType createCodeTimeEventCombinationType() {
        return new CodeTimeEventCombinationType();
    }

    /**
     * Create an instance of {@link CodeTimeEventType }
     * 
     * @return
     *     the new instance of {@link CodeTimeEventType }
     */
    public CodeTimeEventType createCodeTimeEventType() {
        return new CodeTimeEventType();
    }

    /**
     * Create an instance of {@link CodeTimeReferenceType }
     * 
     * @return
     *     the new instance of {@link CodeTimeReferenceType }
     */
    public CodeTimeReferenceType createCodeTimeReferenceType() {
        return new CodeTimeReferenceType();
    }

    /**
     * Create an instance of {@link CodeTLOFSectionType }
     * 
     * @return
     *     the new instance of {@link CodeTLOFSectionType }
     */
    public CodeTLOFSectionType createCodeTLOFSectionType() {
        return new CodeTLOFSectionType();
    }

    /**
     * Create an instance of {@link CodeTrajectoryType }
     * 
     * @return
     *     the new instance of {@link CodeTrajectoryType }
     */
    public CodeTrajectoryType createCodeTrajectoryType() {
        return new CodeTrajectoryType();
    }

    /**
     * Create an instance of {@link CodeTransponderType }
     * 
     * @return
     *     the new instance of {@link CodeTransponderType }
     */
    public CodeTransponderType createCodeTransponderType() {
        return new CodeTransponderType();
    }

    /**
     * Create an instance of {@link CodeUnitDependencyType }
     * 
     * @return
     *     the new instance of {@link CodeUnitDependencyType }
     */
    public CodeUnitDependencyType createCodeUnitDependencyType() {
        return new CodeUnitDependencyType();
    }

    /**
     * Create an instance of {@link CodeUnitType }
     * 
     * @return
     *     the new instance of {@link CodeUnitType }
     */
    public CodeUnitType createCodeUnitType() {
        return new CodeUnitType();
    }

    /**
     * Create an instance of {@link CodeUpperAlphaType }
     * 
     * @return
     *     the new instance of {@link CodeUpperAlphaType }
     */
    public CodeUpperAlphaType createCodeUpperAlphaType() {
        return new CodeUpperAlphaType();
    }

    /**
     * Create an instance of {@link CodeUsageLimitationType }
     * 
     * @return
     *     the new instance of {@link CodeUsageLimitationType }
     */
    public CodeUsageLimitationType createCodeUsageLimitationType() {
        return new CodeUsageLimitationType();
    }

    /**
     * Create an instance of {@link CodeUUIDType }
     * 
     * @return
     *     the new instance of {@link CodeUUIDType }
     */
    public CodeUUIDType createCodeUUIDType() {
        return new CodeUUIDType();
    }

    /**
     * Create an instance of {@link CodeValueInterpretationType }
     * 
     * @return
     *     the new instance of {@link CodeValueInterpretationType }
     */
    public CodeValueInterpretationType createCodeValueInterpretationType() {
        return new CodeValueInterpretationType();
    }

    /**
     * Create an instance of {@link CodeVASISType }
     * 
     * @return
     *     the new instance of {@link CodeVASISType }
     */
    public CodeVASISType createCodeVASISType() {
        return new CodeVASISType();
    }

    /**
     * Create an instance of {@link CodeVerticalReferenceType }
     * 
     * @return
     *     the new instance of {@link CodeVerticalReferenceType }
     */
    public CodeVerticalReferenceType createCodeVerticalReferenceType() {
        return new CodeVerticalReferenceType();
    }

    /**
     * Create an instance of {@link CodeVerticalStructureMarkingType }
     * 
     * @return
     *     the new instance of {@link CodeVerticalStructureMarkingType }
     */
    public CodeVerticalStructureMarkingType createCodeVerticalStructureMarkingType() {
        return new CodeVerticalStructureMarkingType();
    }

    /**
     * Create an instance of {@link CodeVerticalStructureMaterialType }
     * 
     * @return
     *     the new instance of {@link CodeVerticalStructureMaterialType }
     */
    public CodeVerticalStructureMaterialType createCodeVerticalStructureMaterialType() {
        return new CodeVerticalStructureMaterialType();
    }

    /**
     * Create an instance of {@link CodeVerticalStructureType }
     * 
     * @return
     *     the new instance of {@link CodeVerticalStructureType }
     */
    public CodeVerticalStructureType createCodeVerticalStructureType() {
        return new CodeVerticalStructureType();
    }

    /**
     * Create an instance of {@link CodeVisualDockingGuidanceType }
     * 
     * @return
     *     the new instance of {@link CodeVisualDockingGuidanceType }
     */
    public CodeVisualDockingGuidanceType createCodeVisualDockingGuidanceType() {
        return new CodeVisualDockingGuidanceType();
    }

    /**
     * Create an instance of {@link CodeVORType }
     * 
     * @return
     *     the new instance of {@link CodeVORType }
     */
    public CodeVORType createCodeVORType() {
        return new CodeVORType();
    }

    /**
     * Create an instance of {@link CodeWakeTurbulenceType }
     * 
     * @return
     *     the new instance of {@link CodeWakeTurbulenceType }
     */
    public CodeWakeTurbulenceType createCodeWakeTurbulenceType() {
        return new CodeWakeTurbulenceType();
    }

    /**
     * Create an instance of {@link CodeWorkAreaType }
     * 
     * @return
     *     the new instance of {@link CodeWorkAreaType }
     */
    public CodeWorkAreaType createCodeWorkAreaType() {
        return new CodeWorkAreaType();
    }

    /**
     * Create an instance of {@link CodeYesNoType }
     * 
     * @return
     *     the new instance of {@link CodeYesNoType }
     */
    public CodeYesNoType createCodeYesNoType() {
        return new CodeYesNoType();
    }

    /**
     * Create an instance of {@link DateMonthDayType }
     * 
     * @return
     *     the new instance of {@link DateMonthDayType }
     */
    public DateMonthDayType createDateMonthDayType() {
        return new DateMonthDayType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     * @return
     *     the new instance of {@link DateTimeType }
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     * @return
     *     the new instance of {@link DateType }
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link DateYearType }
     * 
     * @return
     *     the new instance of {@link DateYearType }
     */
    public DateYearType createDateYearType() {
        return new DateYearType();
    }

    /**
     * Create an instance of {@link NoNumberType }
     * 
     * @return
     *     the new instance of {@link NoNumberType }
     */
    public NoNumberType createNoNumberType() {
        return new NoNumberType();
    }

    /**
     * Create an instance of {@link NoSequenceType }
     * 
     * @return
     *     the new instance of {@link NoSequenceType }
     */
    public NoSequenceType createNoSequenceType() {
        return new NoSequenceType();
    }

    /**
     * Create an instance of {@link TextAddressType }
     * 
     * @return
     *     the new instance of {@link TextAddressType }
     */
    public TextAddressType createTextAddressType() {
        return new TextAddressType();
    }

    /**
     * Create an instance of {@link TextDesignatorType }
     * 
     * @return
     *     the new instance of {@link TextDesignatorType }
     */
    public TextDesignatorType createTextDesignatorType() {
        return new TextDesignatorType();
    }

    /**
     * Create an instance of {@link TextInstructionType }
     * 
     * @return
     *     the new instance of {@link TextInstructionType }
     */
    public TextInstructionType createTextInstructionType() {
        return new TextInstructionType();
    }

    /**
     * Create an instance of {@link TextDesignatorLongType }
     * 
     * @return
     *     the new instance of {@link TextDesignatorLongType }
     */
    public TextDesignatorLongType createTextDesignatorLongType() {
        return new TextDesignatorLongType();
    }

    /**
     * Create an instance of {@link TextNameType }
     * 
     * @return
     *     the new instance of {@link TextNameType }
     */
    public TextNameType createTextNameType() {
        return new TextNameType();
    }

    /**
     * Create an instance of {@link TextNoteType }
     * 
     * @return
     *     the new instance of {@link TextNoteType }
     */
    public TextNoteType createTextNoteType() {
        return new TextNoteType();
    }

    /**
     * Create an instance of {@link TextPhoneType }
     * 
     * @return
     *     the new instance of {@link TextPhoneType }
     */
    public TextPhoneType createTextPhoneType() {
        return new TextPhoneType();
    }

    /**
     * Create an instance of {@link TextPropertyNameType }
     * 
     * @return
     *     the new instance of {@link TextPropertyNameType }
     */
    public TextPropertyNameType createTextPropertyNameType() {
        return new TextPropertyNameType();
    }

    /**
     * Create an instance of {@link TextRemarkType }
     * 
     * @return
     *     the new instance of {@link TextRemarkType }
     */
    public TextRemarkType createTextRemarkType() {
        return new TextRemarkType();
    }

    /**
     * Create an instance of {@link TextSIDSTARDesignatorType }
     * 
     * @return
     *     the new instance of {@link TextSIDSTARDesignatorType }
     */
    public TextSIDSTARDesignatorType createTextSIDSTARDesignatorType() {
        return new TextSIDSTARDesignatorType();
    }

    /**
     * Create an instance of {@link CodeTDMAEightSlotsType }
     * 
     * @return
     *     the new instance of {@link CodeTDMAEightSlotsType }
     */
    public CodeTDMAEightSlotsType createCodeTDMAEightSlotsType() {
        return new CodeTDMAEightSlotsType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     * @return
     *     the new instance of {@link TimeType }
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link ValAlarmLimitType }
     * 
     * @return
     *     the new instance of {@link ValAlarmLimitType }
     */
    public ValAlarmLimitType createValAlarmLimitType() {
        return new ValAlarmLimitType();
    }

    /**
     * Create an instance of {@link ValAngleType }
     * 
     * @return
     *     the new instance of {@link ValAngleType }
     */
    public ValAngleType createValAngleType() {
        return new ValAngleType();
    }

    /**
     * Create an instance of {@link ValBearingType }
     * 
     * @return
     *     the new instance of {@link ValBearingType }
     */
    public ValBearingType createValBearingType() {
        return new ValBearingType();
    }

    /**
     * Create an instance of {@link ValChannelNumberType }
     * 
     * @return
     *     the new instance of {@link ValChannelNumberType }
     */
    public ValChannelNumberType createValChannelNumberType() {
        return new ValChannelNumberType();
    }

    /**
     * Create an instance of {@link ValDepthType }
     * 
     * @return
     *     the new instance of {@link ValDepthType }
     */
    public ValDepthType createValDepthType() {
        return new ValDepthType();
    }

    /**
     * Create an instance of {@link ValDistanceSignedType }
     * 
     * @return
     *     the new instance of {@link ValDistanceSignedType }
     */
    public ValDistanceSignedType createValDistanceSignedType() {
        return new ValDistanceSignedType();
    }

    /**
     * Create an instance of {@link ValDistanceType }
     * 
     * @return
     *     the new instance of {@link ValDistanceType }
     */
    public ValDistanceType createValDistanceType() {
        return new ValDistanceType();
    }

    /**
     * Create an instance of {@link ValDistanceVerticalType }
     * 
     * @return
     *     the new instance of {@link ValDistanceVerticalType }
     */
    public ValDistanceVerticalType createValDistanceVerticalType() {
        return new ValDistanceVerticalType();
    }

    /**
     * Create an instance of {@link ValDurationType }
     * 
     * @return
     *     the new instance of {@link ValDurationType }
     */
    public ValDurationType createValDurationType() {
        return new ValDurationType();
    }

    /**
     * Create an instance of {@link ValFLType }
     * 
     * @return
     *     the new instance of {@link ValFLType }
     */
    public ValFLType createValFLType() {
        return new ValFLType();
    }

    /**
     * Create an instance of {@link ValFrequencyType }
     * 
     * @return
     *     the new instance of {@link ValFrequencyType }
     */
    public ValFrequencyType createValFrequencyType() {
        return new ValFrequencyType();
    }

    /**
     * Create an instance of {@link ValFrictionType }
     * 
     * @return
     *     the new instance of {@link ValFrictionType }
     */
    public ValFrictionType createValFrictionType() {
        return new ValFrictionType();
    }

    /**
     * Create an instance of {@link ValHexType }
     * 
     * @return
     *     the new instance of {@link ValHexType }
     */
    public ValHexType createValHexType() {
        return new ValHexType();
    }

    /**
     * Create an instance of {@link ValLCNType }
     * 
     * @return
     *     the new instance of {@link ValLCNType }
     */
    public ValLCNType createValLCNType() {
        return new ValLCNType();
    }

    /**
     * Create an instance of {@link ValLightIntensityType }
     * 
     * @return
     *     the new instance of {@link ValLightIntensityType }
     */
    public ValLightIntensityType createValLightIntensityType() {
        return new ValLightIntensityType();
    }

    /**
     * Create an instance of {@link ValMagneticVariationChangeType }
     * 
     * @return
     *     the new instance of {@link ValMagneticVariationChangeType }
     */
    public ValMagneticVariationChangeType createValMagneticVariationChangeType() {
        return new ValMagneticVariationChangeType();
    }

    /**
     * Create an instance of {@link ValMagneticVariationType }
     * 
     * @return
     *     the new instance of {@link ValMagneticVariationType }
     */
    public ValMagneticVariationType createValMagneticVariationType() {
        return new ValMagneticVariationType();
    }

    /**
     * Create an instance of {@link ValPavementStrengthType }
     * 
     * @return
     *     the new instance of {@link ValPavementStrengthType }
     */
    public ValPavementStrengthType createValPavementStrengthType() {
        return new ValPavementStrengthType();
    }

    /**
     * Create an instance of {@link ValPercentType }
     * 
     * @return
     *     the new instance of {@link ValPercentType }
     */
    public ValPercentType createValPercentType() {
        return new ValPercentType();
    }

    /**
     * Create an instance of {@link ValPressureType }
     * 
     * @return
     *     the new instance of {@link ValPressureType }
     */
    public ValPressureType createValPressureType() {
        return new ValPressureType();
    }

    /**
     * Create an instance of {@link ValSlopeType }
     * 
     * @return
     *     the new instance of {@link ValSlopeType }
     */
    public ValSlopeType createValSlopeType() {
        return new ValSlopeType();
    }

    /**
     * Create an instance of {@link ValSpeedType }
     * 
     * @return
     *     the new instance of {@link ValSpeedType }
     */
    public ValSpeedType createValSpeedType() {
        return new ValSpeedType();
    }

    /**
     * Create an instance of {@link ValTemperatureType }
     * 
     * @return
     *     the new instance of {@link ValTemperatureType }
     */
    public ValTemperatureType createValTemperatureType() {
        return new ValTemperatureType();
    }

    /**
     * Create an instance of {@link ValPowerType }
     * 
     * @return
     *     the new instance of {@link ValPowerType }
     */
    public ValPowerType createValPowerType() {
        return new ValPowerType();
    }

    /**
     * Create an instance of {@link ValWeightType }
     * 
     * @return
     *     the new instance of {@link ValWeightType }
     */
    public ValWeightType createValWeightType() {
        return new ValWeightType();
    }

    /**
     * Create an instance of {@link XHTMLType }
     * 
     * @return
     *     the new instance of {@link XHTMLType }
     */
    public XHTMLType createXHTMLType() {
        return new XHTMLType();
    }

    /**
     * Create an instance of {@link FeatureMetadataPropertyType }
     * 
     * @return
     *     the new instance of {@link FeatureMetadataPropertyType }
     */
    public FeatureMetadataPropertyType createFeatureMetadataPropertyType() {
        return new FeatureMetadataPropertyType();
    }

    /**
     * Create an instance of {@link FeatureTimeSliceMetadataPropertyType }
     * 
     * @return
     *     the new instance of {@link FeatureTimeSliceMetadataPropertyType }
     */
    public FeatureTimeSliceMetadataPropertyType createFeatureTimeSliceMetadataPropertyType() {
        return new FeatureTimeSliceMetadataPropertyType();
    }

    /**
     * Create an instance of {@link MessageMetadataPropertyType }
     * 
     * @return
     *     the new instance of {@link MessageMetadataPropertyType }
     */
    public MessageMetadataPropertyType createMessageMetadataPropertyType() {
        return new MessageMetadataPropertyType();
    }

    /**
     * Create an instance of {@link DMETimeSlicePropertyType }
     * 
     * @return
     *     the new instance of {@link DMETimeSlicePropertyType }
     */
    public DMETimeSlicePropertyType createDMETimeSlicePropertyType() {
        return new DMETimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link AIXMElevatedPointPropertyType }
     * 
     * @return
     *     the new instance of {@link AIXMElevatedPointPropertyType }
     */
    public AIXMElevatedPointPropertyType createAIXMElevatedPointPropertyType() {
        return new AIXMElevatedPointPropertyType();
    }

    /**
     * Create an instance of {@link NotePropertyType }
     * 
     * @return
     *     the new instance of {@link NotePropertyType }
     */
    public NotePropertyType createNotePropertyType() {
        return new NotePropertyType();
    }

    /**
     * Create an instance of {@link LinguisticNotePropertyType }
     * 
     * @return
     *     the new instance of {@link LinguisticNotePropertyType }
     */
    public LinguisticNotePropertyType createLinguisticNotePropertyType() {
        return new LinguisticNotePropertyType();
    }

    /**
     * Create an instance of {@link LinguisticNoteTypeExtension }
     * 
     * @return
     *     the new instance of {@link LinguisticNoteTypeExtension }
     */
    public LinguisticNoteTypeExtension createLinguisticNoteTypeExtension() {
        return new LinguisticNoteTypeExtension();
    }

    /**
     * Create an instance of {@link NoteTypeExtension }
     * 
     * @return
     *     the new instance of {@link NoteTypeExtension }
     */
    public NoteTypeExtension createNoteTypeExtension() {
        return new NoteTypeExtension();
    }

    /**
     * Create an instance of {@link ElevatedPointTypeExtension }
     * 
     * @return
     *     the new instance of {@link ElevatedPointTypeExtension }
     */
    public ElevatedPointTypeExtension createElevatedPointTypeExtension() {
        return new ElevatedPointTypeExtension();
    }

    /**
     * Create an instance of {@link DMEExtension }
     * 
     * @return
     *     the new instance of {@link DMEExtension }
     */
    public DMEExtension createDMEExtension() {
        return new DMEExtension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractAIXMFeature", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractAIXMFeatureType> createAbstractAIXMFeature(AbstractAIXMFeatureType value) {
        return new JAXBElement<>(_AbstractAIXMFeature_QNAME, AbstractAIXMFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractAIXMObjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractAIXMObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractAIXMObject", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractAIXMObjectType> createAbstractAIXMObject(AbstractAIXMObjectType value) {
        return new JAXBElement<>(_AbstractAIXMObject_QNAME, AbstractAIXMObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractExtension(AbstractExtensionType value) {
        return new JAXBElement<>(_AbstractExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "interpretation")
    public JAXBElement<String> createInterpretation(String value) {
        return new JAXBElement<>(_Interpretation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "sequenceNumber")
    public JAXBElement<Long> createSequenceNumber(Long value) {
        return new JAXBElement<>(_SequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "correctionNumber")
    public JAXBElement<Long> createCorrectionNumber(Long value) {
        return new JAXBElement<>(_CorrectionNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "DME", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.2", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<DMEType> createDME(DMEType value) {
        return new JAXBElement<>(_DME_QNAME, DMEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMETimeSliceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DMETimeSliceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "DMETimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<DMETimeSliceType> createDMETimeSlice(DMETimeSliceType value) {
        return new JAXBElement<>(_DMETimeSlice_QNAME, DMETimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractDMEExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.2", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractDMEExtension(AbstractExtensionType value) {
        return new JAXBElement<>(_AbstractDMEExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractNavaidEquipmentExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.2", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractNavaidEquipmentExtension(AbstractExtensionType value) {
        return new JAXBElement<>(_AbstractNavaidEquipmentExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AIXMElevatedPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AIXMElevatedPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "ElevatedPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Point")
    public JAXBElement<AIXMElevatedPointType> createElevatedPoint(AIXMElevatedPointType value) {
        return new JAXBElement<>(_ElevatedPoint_QNAME, AIXMElevatedPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractElevatedPointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.2", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractElevatedPointExtension(AbstractExtensionType value) {
        return new JAXBElement<>(_AbstractElevatedPointExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "Note")
    public JAXBElement<NoteType> createNote(NoteType value) {
        return new JAXBElement<>(_Note_QNAME, NoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractNoteExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.2", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractNoteExtension(AbstractExtensionType value) {
        return new JAXBElement<>(_AbstractNoteExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinguisticNoteType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LinguisticNoteType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "LinguisticNote")
    public JAXBElement<LinguisticNoteType> createLinguisticNote(LinguisticNoteType value) {
        return new JAXBElement<>(_LinguisticNote_QNAME, LinguisticNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "AbstractLinguisticNoteExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.2", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractLinguisticNoteExtension(AbstractExtensionType value) {
        return new JAXBElement<>(_AbstractLinguisticNoteExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNoteType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextNoteType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "note", scope = LinguisticNoteType.class)
    public JAXBElement<TextNoteType> createLinguisticNoteTypeNote(TextNoteType value) {
        return new JAXBElement<>(_LinguisticNoteTypeNote_QNAME, TextNoteType.class, LinguisticNoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextPropertyNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextPropertyNameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "propertyName", scope = NoteType.class)
    public JAXBElement<TextPropertyNameType> createNoteTypePropertyName(TextPropertyNameType value) {
        return new JAXBElement<>(_NoteTypePropertyName_QNAME, TextPropertyNameType.class, NoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeNotePurposeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeNotePurposeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "purpose", scope = NoteType.class)
    public JAXBElement<CodeNotePurposeType> createNoteTypePurpose(CodeNotePurposeType value) {
        return new JAXBElement<>(_NoteTypePurpose_QNAME, CodeNotePurposeType.class, NoteType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "elevation", scope = AIXMElevatedPointType.class)
    public JAXBElement<ValDistanceVerticalType> createAIXMElevatedPointTypeElevation(ValDistanceVerticalType value) {
        return new JAXBElement<>(_AIXMElevatedPointTypeElevation_QNAME, ValDistanceVerticalType.class, AIXMElevatedPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "geoidUndulation", scope = AIXMElevatedPointType.class)
    public JAXBElement<ValDistanceSignedType> createAIXMElevatedPointTypeGeoidUndulation(ValDistanceSignedType value) {
        return new JAXBElement<>(_AIXMElevatedPointTypeGeoidUndulation_QNAME, ValDistanceSignedType.class, AIXMElevatedPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "verticalDatum", scope = AIXMElevatedPointType.class)
    public JAXBElement<TextNameType> createAIXMElevatedPointTypeVerticalDatum(TextNameType value) {
        return new JAXBElement<>(_AIXMElevatedPointTypeVerticalDatum_QNAME, TextNameType.class, AIXMElevatedPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "horizontalAccuracy", scope = AIXMElevatedPointType.class)
    public JAXBElement<ValDistanceType> createAIXMElevatedPointTypeHorizontalAccuracy(ValDistanceType value) {
        return new JAXBElement<>(_AIXMElevatedPointTypeHorizontalAccuracy_QNAME, ValDistanceType.class, AIXMElevatedPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeNavaidDesignatorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeNavaidDesignatorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "designator", scope = DMETimeSliceType.class)
    public JAXBElement<CodeNavaidDesignatorType> createDMETimeSliceTypeDesignator(CodeNavaidDesignatorType value) {
        return new JAXBElement<>(_DMETimeSliceTypeDesignator_QNAME, CodeNavaidDesignatorType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "name", scope = DMETimeSliceType.class)
    public JAXBElement<TextNameType> createDMETimeSliceTypeName(TextNameType value) {
        return new JAXBElement<>(_DMETimeSliceTypeName_QNAME, TextNameType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "emissionClass", scope = DMETimeSliceType.class)
    public JAXBElement<CodeRadioEmissionType> createDMETimeSliceTypeEmissionClass(CodeRadioEmissionType value) {
        return new JAXBElement<>(_DMETimeSliceTypeEmissionClass_QNAME, CodeRadioEmissionType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "mobile", scope = DMETimeSliceType.class)
    public JAXBElement<CodeYesNoType> createDMETimeSliceTypeMobile(CodeYesNoType value) {
        return new JAXBElement<>(_DMETimeSliceTypeMobile_QNAME, CodeYesNoType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "magneticVariation", scope = DMETimeSliceType.class)
    public JAXBElement<ValMagneticVariationType> createDMETimeSliceTypeMagneticVariation(ValMagneticVariationType value) {
        return new JAXBElement<>(_DMETimeSliceTypeMagneticVariation_QNAME, ValMagneticVariationType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "dateMagneticVariation", scope = DMETimeSliceType.class)
    public JAXBElement<DateYearType> createDMETimeSliceTypeDateMagneticVariation(DateYearType value) {
        return new JAXBElement<>(_DMETimeSliceTypeDateMagneticVariation_QNAME, DateYearType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "flightChecked", scope = DMETimeSliceType.class)
    public JAXBElement<CodeYesNoType> createDMETimeSliceTypeFlightChecked(CodeYesNoType value) {
        return new JAXBElement<>(_DMETimeSliceTypeFlightChecked_QNAME, CodeYesNoType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "location", scope = DMETimeSliceType.class)
    public JAXBElement<AIXMElevatedPointPropertyType> createDMETimeSliceTypeLocation(AIXMElevatedPointPropertyType value) {
        return new JAXBElement<>(_DMETimeSliceTypeLocation_QNAME, AIXMElevatedPointPropertyType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDMEType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeDMEType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "type", scope = DMETimeSliceType.class)
    public JAXBElement<CodeDMEType> createDMETimeSliceTypeType(CodeDMEType value) {
        return new JAXBElement<>(_DMETimeSliceTypeType_QNAME, CodeDMEType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDMEChannelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeDMEChannelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "channel", scope = DMETimeSliceType.class)
    public JAXBElement<CodeDMEChannelType> createDMETimeSliceTypeChannel(CodeDMEChannelType value) {
        return new JAXBElement<>(_DMETimeSliceTypeChannel_QNAME, CodeDMEChannelType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "displace", scope = DMETimeSliceType.class)
    public JAXBElement<ValDistanceType> createDMETimeSliceTypeDisplace(ValDistanceType value) {
        return new JAXBElement<>(_DMETimeSliceTypeDisplace_QNAME, ValDistanceType.class, DMETimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.2", name = "tuningFrequencyVHF", scope = DMETimeSliceType.class)
    public JAXBElement<ValFrequencyType> createDMETimeSliceTypeTuningFrequencyVHF(ValFrequencyType value) {
        return new JAXBElement<>(_DMETimeSliceTypeTuningFrequencyVHF_QNAME, ValFrequencyType.class, DMETimeSliceType.class, value);
    }

}
