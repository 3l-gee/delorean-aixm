
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMObjectType;
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
import com.aixm.delorean.aixm511.schema.AerialRefuellingTimeSliceType;
import com.aixm.delorean.aixm511.schema.AerialRefuellingType;
import com.aixm.delorean.aixm511.schema.AeronauticalGroundLightTimeSliceType;
import com.aixm.delorean.aixm511.schema.AeronauticalGroundLightType;
import com.aixm.delorean.aixm511.schema.AirTrafficControlServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirTrafficControlServiceType;
import com.aixm.delorean.aixm511.schema.AirTrafficManagementServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirTrafficManagementServiceType;
import com.aixm.delorean.aixm511.schema.AircraftGroundServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AircraftGroundServiceType;
import com.aixm.delorean.aixm511.schema.AircraftStandTimeSliceType;
import com.aixm.delorean.aixm511.schema.AircraftStandType;
import com.aixm.delorean.aixm511.schema.AirportClearanceServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportClearanceServiceType;
import com.aixm.delorean.aixm511.schema.AirportHeliportCollocationTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportHeliportCollocationType;
import com.aixm.delorean.aixm511.schema.AirportHeliportTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportHeliportType;
import com.aixm.delorean.aixm511.schema.AirportHotSpotTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportHotSpotType;
import com.aixm.delorean.aixm511.schema.AirportProtectionAreaMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportProtectionAreaMarkingType;
import com.aixm.delorean.aixm511.schema.AirportSuppliesServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportSuppliesServiceType;
import com.aixm.delorean.aixm511.schema.AirspaceBorderCrossingTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirspaceBorderCrossingType;
import com.aixm.delorean.aixm511.schema.AirspaceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirspaceType;
import com.aixm.delorean.aixm511.schema.AltimeterSourceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AltimeterSourceType;
import com.aixm.delorean.aixm511.schema.AngleIndicationTimeSliceType;
import com.aixm.delorean.aixm511.schema.AngleIndicationType;
import com.aixm.delorean.aixm511.schema.ApproachLightingSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApproachLightingSystemType;
import com.aixm.delorean.aixm511.schema.ApronElementTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronElementType;
import com.aixm.delorean.aixm511.schema.ApronLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronLightSystemType;
import com.aixm.delorean.aixm511.schema.ApronMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronMarkingType;
import com.aixm.delorean.aixm511.schema.ApronTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronType;
import com.aixm.delorean.aixm511.schema.ArrestingGearTimeSliceType;
import com.aixm.delorean.aixm511.schema.ArrestingGearType;
import com.aixm.delorean.aixm511.schema.ArrivalFeederLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.ArrivalFeederLegType;
import com.aixm.delorean.aixm511.schema.ArrivalLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.ArrivalLegType;
import com.aixm.delorean.aixm511.schema.AuthorityForAirspaceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AuthorityForAirspaceType;
import com.aixm.delorean.aixm511.schema.AzimuthTimeSliceType;
import com.aixm.delorean.aixm511.schema.AzimuthType;
import com.aixm.delorean.aixm511.schema.ChangeOverPointTimeSliceType;
import com.aixm.delorean.aixm511.schema.ChangeOverPointType;
import com.aixm.delorean.aixm511.schema.CheckpointINSTimeSliceType;
import com.aixm.delorean.aixm511.schema.CheckpointINSType;
import com.aixm.delorean.aixm511.schema.CheckpointVORTimeSliceType;
import com.aixm.delorean.aixm511.schema.CheckpointVORType;
import com.aixm.delorean.aixm511.schema.CirclingAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.CirclingAreaType;
import com.aixm.delorean.aixm511.schema.DMETimeSliceType;
import com.aixm.delorean.aixm511.schema.DMEType;
import com.aixm.delorean.aixm511.schema.DeicingAreaMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.DeicingAreaMarkingType;
import com.aixm.delorean.aixm511.schema.DeicingAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.DeicingAreaType;
import com.aixm.delorean.aixm511.schema.DepartureLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.DepartureLegType;
import com.aixm.delorean.aixm511.schema.DesignatedPointTimeSliceType;
import com.aixm.delorean.aixm511.schema.DesignatedPointType;
import com.aixm.delorean.aixm511.schema.DirectionFinderTimeSliceType;
import com.aixm.delorean.aixm511.schema.DirectionFinderType;
import com.aixm.delorean.aixm511.schema.DistanceIndicationTimeSliceType;
import com.aixm.delorean.aixm511.schema.DistanceIndicationType;
import com.aixm.delorean.aixm511.schema.ElevatedCurveType;
import com.aixm.delorean.aixm511.schema.ElevatedPointType;
import com.aixm.delorean.aixm511.schema.ElevatedSurfaceType;
import com.aixm.delorean.aixm511.schema.ElevationTimeSliceType;
import com.aixm.delorean.aixm511.schema.ElevationType;
import com.aixm.delorean.aixm511.schema.FinalLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.FinalLegType;
import com.aixm.delorean.aixm511.schema.FireFightingServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.FireFightingServiceType;
import com.aixm.delorean.aixm511.schema.FlightRestrictionTimeSliceType;
import com.aixm.delorean.aixm511.schema.FlightRestrictionType;
import com.aixm.delorean.aixm511.schema.FloatingDockSiteTimeSliceType;
import com.aixm.delorean.aixm511.schema.FloatingDockSiteType;
import com.aixm.delorean.aixm511.schema.GeoBorderTimeSliceType;
import com.aixm.delorean.aixm511.schema.GeoBorderType;
import com.aixm.delorean.aixm511.schema.GlidepathTimeSliceType;
import com.aixm.delorean.aixm511.schema.GlidepathType;
import com.aixm.delorean.aixm511.schema.GroundTrafficControlServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.GroundTrafficControlServiceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineLightSystemType;
import com.aixm.delorean.aixm511.schema.GuidanceLineMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineMarkingType;
import com.aixm.delorean.aixm511.schema.GuidanceLineTimeSliceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineType;
import com.aixm.delorean.aixm511.schema.HoldingAssessmentTimeSliceType;
import com.aixm.delorean.aixm511.schema.HoldingAssessmentType;
import com.aixm.delorean.aixm511.schema.HoldingPatternTimeSliceType;
import com.aixm.delorean.aixm511.schema.HoldingPatternType;
import com.aixm.delorean.aixm511.schema.InformationServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.InformationServiceType;
import com.aixm.delorean.aixm511.schema.InitialLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.InitialLegType;
import com.aixm.delorean.aixm511.schema.InstrumentApproachProcedureTimeSliceType;
import com.aixm.delorean.aixm511.schema.InstrumentApproachProcedureType;
import com.aixm.delorean.aixm511.schema.IntermediateLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.IntermediateLegType;
import com.aixm.delorean.aixm511.schema.LocalizerTimeSliceType;
import com.aixm.delorean.aixm511.schema.LocalizerType;
import com.aixm.delorean.aixm511.schema.MarkerBeaconTimeSliceType;
import com.aixm.delorean.aixm511.schema.MarkerBeaconType;
import com.aixm.delorean.aixm511.schema.MarkingBuoyTimeSliceType;
import com.aixm.delorean.aixm511.schema.MarkingBuoyType;
import com.aixm.delorean.aixm511.schema.MissedApproachLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.MissedApproachLegType;
import com.aixm.delorean.aixm511.schema.NDBTimeSliceType;
import com.aixm.delorean.aixm511.schema.NDBType;
import com.aixm.delorean.aixm511.schema.NavaidTimeSliceType;
import com.aixm.delorean.aixm511.schema.NavaidType;
import com.aixm.delorean.aixm511.schema.NavigationAreaRestrictionTimeSliceType;
import com.aixm.delorean.aixm511.schema.NavigationAreaRestrictionType;
import com.aixm.delorean.aixm511.schema.NavigationAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.NavigationAreaType;
import com.aixm.delorean.aixm511.schema.NonMovementAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.NonMovementAreaType;
import com.aixm.delorean.aixm511.schema.ObstacleAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.ObstacleAreaType;
import com.aixm.delorean.aixm511.schema.OrganisationAuthorityTimeSliceType;
import com.aixm.delorean.aixm511.schema.OrganisationAuthorityType;
import com.aixm.delorean.aixm511.schema.PassengerLoadingBridgeTimeSliceType;
import com.aixm.delorean.aixm511.schema.PassengerLoadingBridgeType;
import com.aixm.delorean.aixm511.schema.PassengerServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.PassengerServiceType;
import com.aixm.delorean.aixm511.schema.PilotControlledLightingTimeSliceType;
import com.aixm.delorean.aixm511.schema.PilotControlledLightingType;
import com.aixm.delorean.aixm511.schema.PrecisionApproachRadarTimeSliceType;
import com.aixm.delorean.aixm511.schema.PrecisionApproachRadarType;
import com.aixm.delorean.aixm511.schema.PrimarySurveillanceRadarTimeSliceType;
import com.aixm.delorean.aixm511.schema.PrimarySurveillanceRadarType;
import com.aixm.delorean.aixm511.schema.ProcedureDMETimeSliceType;
import com.aixm.delorean.aixm511.schema.ProcedureDMEType;
import com.aixm.delorean.aixm511.schema.RadarSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.RadarSystemType;
import com.aixm.delorean.aixm511.schema.RadioCommunicationChannelTimeSliceType;
import com.aixm.delorean.aixm511.schema.RadioCommunicationChannelType;
import com.aixm.delorean.aixm511.schema.RadioFrequencyAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.RadioFrequencyAreaType;
import com.aixm.delorean.aixm511.schema.RoadTimeSliceType;
import com.aixm.delorean.aixm511.schema.RoadType;
import com.aixm.delorean.aixm511.schema.RouteDMETimeSliceType;
import com.aixm.delorean.aixm511.schema.RouteDMEType;
import com.aixm.delorean.aixm511.schema.RouteSegmentTimeSliceType;
import com.aixm.delorean.aixm511.schema.RouteSegmentType;
import com.aixm.delorean.aixm511.schema.RouteTimeSliceType;
import com.aixm.delorean.aixm511.schema.RouteType;
import com.aixm.delorean.aixm511.schema.RulesProceduresTimeSliceType;
import com.aixm.delorean.aixm511.schema.RulesProceduresType;
import com.aixm.delorean.aixm511.schema.RunwayBlastPadTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayBlastPadType;
import com.aixm.delorean.aixm511.schema.RunwayCentrelinePointTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayCentrelinePointType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionLightSystemType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionType;
import com.aixm.delorean.aixm511.schema.RunwayElementTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayElementType;
import com.aixm.delorean.aixm511.schema.RunwayMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayMarkingType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaLightSystemType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaType;
import com.aixm.delorean.aixm511.schema.RunwayTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayType;
import com.aixm.delorean.aixm511.schema.RunwayVisualRangeTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayVisualRangeType;
import com.aixm.delorean.aixm511.schema.SDFTimeSliceType;
import com.aixm.delorean.aixm511.schema.SDFType;
import com.aixm.delorean.aixm511.schema.SafeAltitudeAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.SafeAltitudeAreaType;
import com.aixm.delorean.aixm511.schema.SeaplaneLandingAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.SeaplaneLandingAreaType;
import com.aixm.delorean.aixm511.schema.SeaplaneRampSiteTimeSliceType;
import com.aixm.delorean.aixm511.schema.SeaplaneRampSiteType;
import com.aixm.delorean.aixm511.schema.SearchRescueServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.SearchRescueServiceType;
import com.aixm.delorean.aixm511.schema.SecondarySurveillanceRadarTimeSliceType;
import com.aixm.delorean.aixm511.schema.SecondarySurveillanceRadarType;
import com.aixm.delorean.aixm511.schema.SignificantPointInAirspaceTimeSliceType;
import com.aixm.delorean.aixm511.schema.SignificantPointInAirspaceType;
import com.aixm.delorean.aixm511.schema.SpecialDateTimeSliceType;
import com.aixm.delorean.aixm511.schema.SpecialDateType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationStationTimeSliceType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationStationType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationSystemType;
import com.aixm.delorean.aixm511.schema.StandMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandMarkingType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentArrivalTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentArrivalType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentDepartureTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentDepartureType;
import com.aixm.delorean.aixm511.schema.StandardLevelColumnTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardLevelColumnType;
import com.aixm.delorean.aixm511.schema.StandardLevelSectorTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardLevelSectorType;
import com.aixm.delorean.aixm511.schema.StandardLevelTableTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardLevelTableType;
import com.aixm.delorean.aixm511.schema.SurveyControlPointTimeSliceType;
import com.aixm.delorean.aixm511.schema.SurveyControlPointType;
import com.aixm.delorean.aixm511.schema.TACANTimeSliceType;
import com.aixm.delorean.aixm511.schema.TACANType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionLightSystemType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionMarkingType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionType;
import com.aixm.delorean.aixm511.schema.TaxiwayElementTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayElementType;
import com.aixm.delorean.aixm511.schema.TaxiwayLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayLightSystemType;
import com.aixm.delorean.aixm511.schema.TaxiwayMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayMarkingType;
import com.aixm.delorean.aixm511.schema.TaxiwayTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayType;
import com.aixm.delorean.aixm511.schema.TerminalArrivalAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.TerminalArrivalAreaType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffLightSystemType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffMarkingType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffSafeAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffSafeAreaType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffType;
import com.aixm.delorean.aixm511.schema.UnitTimeSliceType;
import com.aixm.delorean.aixm511.schema.UnitType;
import com.aixm.delorean.aixm511.schema.UnplannedHoldingTimeSliceType;
import com.aixm.delorean.aixm511.schema.UnplannedHoldingType;
import com.aixm.delorean.aixm511.schema.VORTimeSliceType;
import com.aixm.delorean.aixm511.schema.VORType;
import com.aixm.delorean.aixm511.schema.VerticalStructureTimeSliceType;
import com.aixm.delorean.aixm511.schema.VerticalStructureType;
import com.aixm.delorean.aixm511.schema.VisualGlideSlopeIndicatorTimeSliceType;
import com.aixm.delorean.aixm511.schema.VisualGlideSlopeIndicatorType;
import com.aixm.delorean.aixm511.schema.WorkAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.WorkAreaType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for ArrayAssociationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayAssociationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractObject" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayAssociationType", propOrder = {
    "abstractObject"
})
public class ArrayAssociationType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<?>> abstractObject;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * This element has no type defined, and is therefore implicitly (according to the rules of W3C XML Schema) an XML Schema anyType. It is used as the head of an XML Schema substitution group which unifies complex content and certain simple content elements used for datatypes in GML, including the gml:AbstractGML substitution group.Gets the value of the abstractObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractObject().add(newItem);
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
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffineCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.schema.PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.org.gml.v_3_2.PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.schema.CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.org.gml.v_3_2.CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.org.gml.v_3_2.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.org.gml.v_3_2.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.schema.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.org.gml.v_3_2.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeInstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeNodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeEdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeTopologyPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeTopologyComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlightRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopologyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffinePlacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShellType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.aixm.delorean.aixm511.org.gml.v_3_2.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link Count }{@code >}
     * {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link DataBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link FileType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoverageFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MappingRuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractObject() {
        if (abstractObject == null) {
            abstractObject = new ArrayList<>();
        }
        return this.abstractObject;
    }

    /**
     * This element has no type defined, and is therefore implicitly (according to the rules of W3C XML Schema) an XML Schema anyType. It is used as the head of an XML Schema substitution group which unifies complex content and certain simple content elements used for datatypes in GML, including the gml:AbstractGML substitution group.
     * 
     */
    public void setAbstractObject(List<JAXBElement<?>> abstractObject) {
        this.abstractObject = abstractObject;
    }

    public boolean isSetAbstractObject() {
        return ((this.abstractObject!= null)&&(!this.abstractObject.isEmpty()));
    }

    public void unsetAbstractObject() {
        this.abstractObject = null;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean getOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
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
        final ArrayAssociationType that = ((ArrayAssociationType) object);
        {
            boolean lhsFieldIsSet = this.isSetOwns();
            boolean rhsFieldIsSet = that.isSetOwns();
            boolean lhsField;
            lhsField = (this.isSetOwns()?this.getOwns():false);
            boolean rhsField;
            rhsField = (that.isSetOwns()?that.getOwns():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "owns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "owns", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractObject();
            boolean rhsFieldIsSet = that.isSetAbstractObject();
            List<JAXBElement<?>> lhsField;
            lhsField = (this.isSetAbstractObject()?this.getAbstractObject():null);
            List<JAXBElement<?>> rhsField;
            rhsField = (that.isSetAbstractObject()?that.getAbstractObject():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractObject", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractObject", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractObject();
            List<JAXBElement<?>> theField;
            theField = (this.isSetAbstractObject()?this.getAbstractObject():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractObject", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "owns", theField);
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
            boolean theFieldIsSet = this.isSetAbstractObject();
            List<JAXBElement<?>> theField;
            theField = (this.isSetAbstractObject()?this.getAbstractObject():null);
            strategy.appendField(locator, this, "abstractObject", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
