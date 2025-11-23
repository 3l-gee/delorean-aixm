
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.aixm511.schema.AerialRefuellingTimeSliceType;
import com.aixm.delorean.aixm511.schema.AeronauticalGroundLightTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirTrafficControlServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirTrafficManagementServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AircraftGroundServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AircraftStandTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportClearanceServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportHeliportCollocationTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportHeliportTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportHotSpotTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportProtectionAreaMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirportSuppliesServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirspaceBorderCrossingTimeSliceType;
import com.aixm.delorean.aixm511.schema.AirspaceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AltimeterSourceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AngleIndicationTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApproachLightingSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronElementTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.ApronTimeSliceType;
import com.aixm.delorean.aixm511.schema.ArrestingGearTimeSliceType;
import com.aixm.delorean.aixm511.schema.ArrivalFeederLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.ArrivalLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.AuthorityForAirspaceTimeSliceType;
import com.aixm.delorean.aixm511.schema.AzimuthTimeSliceType;
import com.aixm.delorean.aixm511.schema.ChangeOverPointTimeSliceType;
import com.aixm.delorean.aixm511.schema.CheckpointINSTimeSliceType;
import com.aixm.delorean.aixm511.schema.CheckpointVORTimeSliceType;
import com.aixm.delorean.aixm511.schema.CirclingAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.DMETimeSliceType;
import com.aixm.delorean.aixm511.schema.DeicingAreaMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.DeicingAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.DepartureLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.DesignatedPointTimeSliceType;
import com.aixm.delorean.aixm511.schema.DirectionFinderTimeSliceType;
import com.aixm.delorean.aixm511.schema.DistanceIndicationTimeSliceType;
import com.aixm.delorean.aixm511.schema.ElevationTimeSliceType;
import com.aixm.delorean.aixm511.schema.FinalLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.FireFightingServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.FlightRestrictionTimeSliceType;
import com.aixm.delorean.aixm511.schema.FloatingDockSiteTimeSliceType;
import com.aixm.delorean.aixm511.schema.GeoBorderTimeSliceType;
import com.aixm.delorean.aixm511.schema.GlidepathTimeSliceType;
import com.aixm.delorean.aixm511.schema.GroundTrafficControlServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.GuidanceLineTimeSliceType;
import com.aixm.delorean.aixm511.schema.HoldingAssessmentTimeSliceType;
import com.aixm.delorean.aixm511.schema.HoldingPatternTimeSliceType;
import com.aixm.delorean.aixm511.schema.InformationServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.InitialLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.InstrumentApproachProcedureTimeSliceType;
import com.aixm.delorean.aixm511.schema.IntermediateLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.LocalizerTimeSliceType;
import com.aixm.delorean.aixm511.schema.MarkerBeaconTimeSliceType;
import com.aixm.delorean.aixm511.schema.MarkingBuoyTimeSliceType;
import com.aixm.delorean.aixm511.schema.MissedApproachLegTimeSliceType;
import com.aixm.delorean.aixm511.schema.NDBTimeSliceType;
import com.aixm.delorean.aixm511.schema.NavaidTimeSliceType;
import com.aixm.delorean.aixm511.schema.NavigationAreaRestrictionTimeSliceType;
import com.aixm.delorean.aixm511.schema.NavigationAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.NonMovementAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.ObstacleAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.OrganisationAuthorityTimeSliceType;
import com.aixm.delorean.aixm511.schema.PassengerLoadingBridgeTimeSliceType;
import com.aixm.delorean.aixm511.schema.PassengerServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.PilotControlledLightingTimeSliceType;
import com.aixm.delorean.aixm511.schema.PrecisionApproachRadarTimeSliceType;
import com.aixm.delorean.aixm511.schema.PrimarySurveillanceRadarTimeSliceType;
import com.aixm.delorean.aixm511.schema.ProcedureDMETimeSliceType;
import com.aixm.delorean.aixm511.schema.RadarSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.RadioCommunicationChannelTimeSliceType;
import com.aixm.delorean.aixm511.schema.RadioFrequencyAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.RoadTimeSliceType;
import com.aixm.delorean.aixm511.schema.RouteDMETimeSliceType;
import com.aixm.delorean.aixm511.schema.RouteSegmentTimeSliceType;
import com.aixm.delorean.aixm511.schema.RouteTimeSliceType;
import com.aixm.delorean.aixm511.schema.RulesProceduresTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayBlastPadTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayCentrelinePointTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayDirectionTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayElementTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayProtectAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayTimeSliceType;
import com.aixm.delorean.aixm511.schema.RunwayVisualRangeTimeSliceType;
import com.aixm.delorean.aixm511.schema.SDFTimeSliceType;
import com.aixm.delorean.aixm511.schema.SafeAltitudeAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.SeaplaneLandingAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.SeaplaneRampSiteTimeSliceType;
import com.aixm.delorean.aixm511.schema.SearchRescueServiceTimeSliceType;
import com.aixm.delorean.aixm511.schema.SecondarySurveillanceRadarTimeSliceType;
import com.aixm.delorean.aixm511.schema.SignificantPointInAirspaceTimeSliceType;
import com.aixm.delorean.aixm511.schema.SpecialDateTimeSliceType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationStationTimeSliceType;
import com.aixm.delorean.aixm511.schema.SpecialNavigationSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentArrivalTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardInstrumentDepartureTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardLevelColumnTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardLevelSectorTimeSliceType;
import com.aixm.delorean.aixm511.schema.StandardLevelTableTimeSliceType;
import com.aixm.delorean.aixm511.schema.SurveyControlPointTimeSliceType;
import com.aixm.delorean.aixm511.schema.TACANTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiHoldingPositionTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayElementTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.TaxiwayTimeSliceType;
import com.aixm.delorean.aixm511.schema.TerminalArrivalAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffLightSystemTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffMarkingTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffSafeAreaTimeSliceType;
import com.aixm.delorean.aixm511.schema.TouchDownLiftOffTimeSliceType;
import com.aixm.delorean.aixm511.schema.UnitTimeSliceType;
import com.aixm.delorean.aixm511.schema.UnplannedHoldingTimeSliceType;
import com.aixm.delorean.aixm511.schema.VORTimeSliceType;
import com.aixm.delorean.aixm511.schema.VerticalStructureTimeSliceType;
import com.aixm.delorean.aixm511.schema.VisualGlideSlopeIndicatorTimeSliceType;
import com.aixm.delorean.aixm511.schema.WorkAreaTimeSliceType;
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
 * <p>Java class for HistoryPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HistoryPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractTimeSlice" maxOccurs="unbounded"/>
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
@XmlType(name = "HistoryPropertyType", propOrder = {
    "abstractTimeSlice"
})
public class HistoryPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "AbstractTimeSlice", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractTimeSliceType>> abstractTimeSlice;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * To describe an event — an action that occurs at an instant or over an interval of time — GML provides the gml:AbtractTimeSlice element. A timeslice encapsulates the time-varying properties of a dynamic feature -- it shall be extended to represent a time stamped projection of a specific feature. The gml:dataSource property describes how the temporal data was acquired.
     * A gml:AbstractTimeSlice instance is a GML object that encapsulates updates of the dynamic—or volatile—properties that reflect some change event; it thus includes only those feature properties that have actually changed due to some process.
     * gml:AbstractTimeSlice basically provides a facility for attribute-level time stamping, in contrast to the object-level time stamping of dynamic feature instances. 
     * The time slice can thus be viewed as event or process-oriented, whereas a snapshot is more state or structure-oriented. A timeslice has richer causality, whereas a snapshot merely portrays the status of the whole.Gets the value of the abstractTimeSlice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTimeSlice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTimeSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
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
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractTimeSliceType>> getAbstractTimeSlice() {
        if (abstractTimeSlice == null) {
            abstractTimeSlice = new ArrayList<>();
        }
        return this.abstractTimeSlice;
    }

    /**
     * To describe an event — an action that occurs at an instant or over an interval of time — GML provides the gml:AbtractTimeSlice element. A timeslice encapsulates the time-varying properties of a dynamic feature -- it shall be extended to represent a time stamped projection of a specific feature. The gml:dataSource property describes how the temporal data was acquired.
     * A gml:AbstractTimeSlice instance is a GML object that encapsulates updates of the dynamic—or volatile—properties that reflect some change event; it thus includes only those feature properties that have actually changed due to some process.
     * gml:AbstractTimeSlice basically provides a facility for attribute-level time stamping, in contrast to the object-level time stamping of dynamic feature instances. 
     * The time slice can thus be viewed as event or process-oriented, whereas a snapshot is more state or structure-oriented. A timeslice has richer causality, whereas a snapshot merely portrays the status of the whole.
     * 
     */
    public void setAbstractTimeSlice(List<JAXBElement<? extends AbstractTimeSliceType>> abstractTimeSlice) {
        this.abstractTimeSlice = abstractTimeSlice;
    }

    public boolean isSetAbstractTimeSlice() {
        return ((this.abstractTimeSlice!= null)&&(!this.abstractTimeSlice.isEmpty()));
    }

    public void unsetAbstractTimeSlice() {
        this.abstractTimeSlice = null;
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
        final HistoryPropertyType that = ((HistoryPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractTimeSlice();
            boolean rhsFieldIsSet = that.isSetAbstractTimeSlice();
            List<JAXBElement<? extends AbstractTimeSliceType>> lhsField;
            lhsField = (this.isSetAbstractTimeSlice()?this.getAbstractTimeSlice():null);
            List<JAXBElement<? extends AbstractTimeSliceType>> rhsField;
            rhsField = (that.isSetAbstractTimeSlice()?that.getAbstractTimeSlice():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractTimeSlice", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractTimeSlice", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean theFieldIsSet = this.isSetAbstractTimeSlice();
            List<JAXBElement<? extends AbstractTimeSliceType>> theField;
            theField = (this.isSetAbstractTimeSlice()?this.getAbstractTimeSlice():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractTimeSlice", theField);
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
            boolean theFieldIsSet = this.isSetAbstractTimeSlice();
            List<JAXBElement<? extends AbstractTimeSliceType>> theField;
            theField = (this.isSetAbstractTimeSlice()?this.getAbstractTimeSlice():null);
            strategy.appendField(locator, this, "abstractTimeSlice", buffer, theField, theFieldIsSet);
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
