
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAirportGroundServiceType;
import com.aixm.delorean.aixm511.schema.AbstractAirportHeliportProtectionAreaType;
import com.aixm.delorean.aixm511.schema.AbstractApproachLegType;
import com.aixm.delorean.aixm511.schema.AbstractGroundLightSystemType;
import com.aixm.delorean.aixm511.schema.AbstractMarkingType;
import com.aixm.delorean.aixm511.schema.AbstractNavaidEquipmentType;
import com.aixm.delorean.aixm511.schema.AbstractNavigationSystemCheckpointType;
import com.aixm.delorean.aixm511.schema.AbstractProcedureType;
import com.aixm.delorean.aixm511.schema.AbstractRadarEquipmentType;
import com.aixm.delorean.aixm511.schema.AbstractSegmentLegType;
import com.aixm.delorean.aixm511.schema.AbstractServiceType;
import com.aixm.delorean.aixm511.schema.AbstractSurveillanceRadarType;
import com.aixm.delorean.aixm511.schema.AbstractTrafficSeparationServiceType;
import com.aixm.delorean.aixm511.schema.AerialRefuellingType;
import com.aixm.delorean.aixm511.schema.AeronauticalGroundLightType;
import com.aixm.delorean.aixm511.schema.AirTrafficControlServiceType;
import com.aixm.delorean.aixm511.schema.AirTrafficManagementServiceType;
import com.aixm.delorean.aixm511.schema.AircraftGroundServiceType;
import com.aixm.delorean.aixm511.schema.AircraftStandType;
import com.aixm.delorean.aixm511.schema.AirportClearanceServiceType;
import com.aixm.delorean.aixm511.schema.AirportHeliportCollocationType;
import com.aixm.delorean.aixm511.schema.AirportHeliportType;
import com.aixm.delorean.aixm511.schema.AirportHotSpotType;
import com.aixm.delorean.aixm511.schema.AirportProtectionAreaMarkingType;
import com.aixm.delorean.aixm511.schema.AirportSuppliesServiceType;
import com.aixm.delorean.aixm511.schema.AirspaceBorderCrossingType;
import com.aixm.delorean.aixm511.schema.AirspaceType;
import com.aixm.delorean.aixm511.schema.AltimeterSourceType;
import com.aixm.delorean.aixm511.schema.AngleIndicationType;
import com.aixm.delorean.aixm511.schema.ApproachLightingSystemType;
import com.aixm.delorean.aixm511.schema.ApronElementType;
import com.aixm.delorean.aixm511.schema.ApronLightSystemType;
import com.aixm.delorean.aixm511.schema.ApronMarkingType;
import com.aixm.delorean.aixm511.schema.ApronType;
import com.aixm.delorean.aixm511.schema.ArrestingGearType;
import com.aixm.delorean.aixm511.schema.ArrivalFeederLegType;
import com.aixm.delorean.aixm511.schema.ArrivalLegType;
import com.aixm.delorean.aixm511.schema.AuthorityForAirspaceType;
import com.aixm.delorean.aixm511.schema.AzimuthType;
import com.aixm.delorean.aixm511.schema.ChangeOverPointType;
import com.aixm.delorean.aixm511.schema.CheckpointINSType;
import com.aixm.delorean.aixm511.schema.CheckpointVORType;
import com.aixm.delorean.aixm511.schema.CirclingAreaType;
import com.aixm.delorean.aixm511.schema.DMEType;
import com.aixm.delorean.aixm511.schema.DeicingAreaMarkingType;
import com.aixm.delorean.aixm511.schema.DeicingAreaType;
import com.aixm.delorean.aixm511.schema.DepartureLegType;
import com.aixm.delorean.aixm511.schema.DesignatedPointType;
import com.aixm.delorean.aixm511.schema.DirectionFinderType;
import com.aixm.delorean.aixm511.schema.DistanceIndicationType;
import com.aixm.delorean.aixm511.schema.ElevationType;
import com.aixm.delorean.aixm511.schema.FinalLegType;
import com.aixm.delorean.aixm511.schema.FireFightingServiceType;
import com.aixm.delorean.aixm511.schema.FlightRestrictionType;
import com.aixm.delorean.aixm511.schema.FloatingDockSiteType;
import com.aixm.delorean.aixm511.schema.GeoBorderType;
import com.aixm.delorean.aixm511.schema.GlidepathType;
import com.aixm.delorean.aixm511.schema.GroundTrafficControlServiceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineLightSystemType;
import com.aixm.delorean.aixm511.schema.GuidanceLineMarkingType;
import com.aixm.delorean.aixm511.schema.GuidanceLineType;
import com.aixm.delorean.aixm511.schema.HoldingAssessmentType;
import com.aixm.delorean.aixm511.schema.HoldingPatternType;
import com.aixm.delorean.aixm511.schema.InformationServiceType;
import com.aixm.delorean.aixm511.schema.InitialLegType;
import com.aixm.delorean.aixm511.schema.InstrumentApproachProcedureType;
import com.aixm.delorean.aixm511.schema.IntermediateLegType;
import com.aixm.delorean.aixm511.schema.LocalizerType;
import com.aixm.delorean.aixm511.schema.MarkerBeaconType;
import com.aixm.delorean.aixm511.schema.MarkingBuoyType;
import com.aixm.delorean.aixm511.schema.MissedApproachLegType;
import com.aixm.delorean.aixm511.schema.NDBType;
import com.aixm.delorean.aixm511.schema.NavaidType;
import com.aixm.delorean.aixm511.schema.NavigationAreaRestrictionType;
import com.aixm.delorean.aixm511.schema.NavigationAreaType;
import com.aixm.delorean.aixm511.schema.NonMovementAreaType;
import com.aixm.delorean.aixm511.schema.ObstacleAreaType;
import com.aixm.delorean.aixm511.schema.OrganisationAuthorityType;
import com.aixm.delorean.aixm511.schema.PassengerLoadingBridgeType;
import com.aixm.delorean.aixm511.schema.PassengerServiceType;
import com.aixm.delorean.aixm511.schema.PilotControlledLightingType;
import com.aixm.delorean.aixm511.schema.PrecisionApproachRadarType;
import com.aixm.delorean.aixm511.schema.PrimarySurveillanceRadarType;
import com.aixm.delorean.aixm511.schema.ProcedureDMEType;
import com.aixm.delorean.aixm511.schema.RadarSystemType;
import com.aixm.delorean.aixm511.schema.RadioCommunicationChannelType;
import com.aixm.delorean.aixm511.schema.RadioFrequencyAreaType;
import com.aixm.delorean.aixm511.schema.RoadType;
import com.aixm.delorean.aixm511.schema.RouteDMEType;
import com.aixm.delorean.aixm511.schema.RouteSegmentType;
import com.aixm.delorean.aixm511.schema.RouteType;
import com.aixm.delorean.aixm511.schema.RulesProceduresType;
import com.aixm.delorean.aixm511.schema.RunwayBlastPadType;
import com.aixm.delorean.aixm511.schema.RunwayCentrelinePointType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionLightSystemType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionType;
import com.aixm.delorean.aixm511.schema.RunwayElementType;
import com.aixm.delorean.aixm511.schema.RunwayMarkingType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaLightSystemType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaType;
import com.aixm.delorean.aixm511.schema.RunwayType;
import com.aixm.delorean.aixm511.schema.RunwayVisualRangeType;
import com.aixm.delorean.aixm511.schema.SDFType;
import com.aixm.delorean.aixm511.schema.SafeAltitudeAreaType;
import com.aixm.delorean.aixm511.schema.SeaplaneLandingAreaType;
import com.aixm.delorean.aixm511.schema.SeaplaneRampSiteType;
import com.aixm.delorean.aixm511.schema.SearchRescueServiceType;
import com.aixm.delorean.aixm511.schema.SecondarySurveillanceRadarType;
import com.aixm.delorean.aixm511.schema.SignificantPointInAirspaceType;
import com.aixm.delorean.aixm511.schema.SpecialDateType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationStationType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationSystemType;
import com.aixm.delorean.aixm511.schema.StandMarkingType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentArrivalType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentDepartureType;
import com.aixm.delorean.aixm511.schema.StandardLevelColumnType;
import com.aixm.delorean.aixm511.schema.StandardLevelSectorType;
import com.aixm.delorean.aixm511.schema.StandardLevelTableType;
import com.aixm.delorean.aixm511.schema.SurveyControlPointType;
import com.aixm.delorean.aixm511.schema.TACANType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionLightSystemType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionMarkingType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionType;
import com.aixm.delorean.aixm511.schema.TaxiwayElementType;
import com.aixm.delorean.aixm511.schema.TaxiwayLightSystemType;
import com.aixm.delorean.aixm511.schema.TaxiwayMarkingType;
import com.aixm.delorean.aixm511.schema.TaxiwayType;
import com.aixm.delorean.aixm511.schema.TerminalArrivalAreaType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffLightSystemType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffMarkingType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffSafeAreaType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffType;
import com.aixm.delorean.aixm511.schema.UnitType;
import com.aixm.delorean.aixm511.schema.UnplannedHoldingType;
import com.aixm.delorean.aixm511.schema.VORType;
import com.aixm.delorean.aixm511.schema.VerticalStructureType;
import com.aixm.delorean.aixm511.schema.VisualGlideSlopeIndicatorType;
import com.aixm.delorean.aixm511.schema.WorkAreaType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for FeatureArrayPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FeatureArrayPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureArrayPropertyType", propOrder = {
    "abstractFeature"
})
public class FeatureArrayPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractFeatureType>> abstractFeature;

    /**
     * Gets the value of the abstractFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFeatureType>> getAbstractFeature() {
        if (abstractFeature == null) {
            abstractFeature = new ArrayList<>();
        }
        return this.abstractFeature;
    }

    /**
     * 
     * 
     */
    public void setAbstractFeature(List<JAXBElement<? extends AbstractFeatureType>> abstractFeature) {
        this.abstractFeature = abstractFeature;
    }

    public boolean isSetAbstractFeature() {
        return ((this.abstractFeature!= null)&&(!this.abstractFeature.isEmpty()));
    }

    public void unsetAbstractFeature() {
        this.abstractFeature = null;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeatureArrayPropertyType that = ((FeatureArrayPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractFeature();
            boolean rhsFieldIsSet = that.isSetAbstractFeature();
            List<JAXBElement<? extends AbstractFeatureType>> lhsField;
            lhsField = (this.isSetAbstractFeature()?this.getAbstractFeature():null);
            List<JAXBElement<? extends AbstractFeatureType>> rhsField;
            rhsField = (that.isSetAbstractFeature()?that.getAbstractFeature():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractFeature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractFeature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = this.isSetAbstractFeature();
            List<JAXBElement<? extends AbstractFeatureType>> theField;
            theField = (this.isSetAbstractFeature()?this.getAbstractFeature():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractFeature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = this.isSetAbstractFeature();
            List<JAXBElement<? extends AbstractFeatureType>> theField;
            theField = (this.isSetAbstractFeature()?this.getAbstractFeature():null);
            strategy.appendField(locator, this, "abstractFeature", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
