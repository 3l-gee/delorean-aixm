
package com.aixm.delorean.core.schema.a5_1_1.aixm.message;

import java.io.Serializable;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractFeatureMemberType;
import com.aixm.delorean.core.org.w3.xlink.ActuateType;
import com.aixm.delorean.core.org.w3.xlink.ShowType;
import com.aixm.delorean.core.org.w3.xlink.TypeType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAIXMFeatureType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAirportGroundServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractAirportHeliportProtectionAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractApproachLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractGroundLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractNavaidEquipmentType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractNavigationSystemCheckpointType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractProcedureType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractRadarEquipmentType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractSegmentLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractSurveillanceRadarType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AbstractTrafficSeparationServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AerialRefuellingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AeronauticalGroundLightType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirTrafficControlServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirTrafficManagementServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AircraftGroundServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AircraftStandType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirportClearanceServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirportHeliportCollocationType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirportHeliportType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirportHotSpotType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirportProtectionAreaMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirportSuppliesServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirspaceBorderCrossingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AirspaceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AltimeterSourceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AngleIndicationType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ApproachLightingSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ApronElementType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ApronLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ApronMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ApronType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ArrestingGearType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ArrivalFeederLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ArrivalLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AuthorityForAirspaceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.AzimuthType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ChangeOverPointType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.CheckpointINSType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.CheckpointVORType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.CirclingAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DMEType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DeicingAreaMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DeicingAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DepartureLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DesignatedPointType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DirectionFinderType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.DistanceIndicationType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ElevationType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.FinalLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.FireFightingServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.FlightRestrictionType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.FloatingDockSiteType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.GeoBorderType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.GlidepathType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.GroundTrafficControlServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.GuidanceLineLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.GuidanceLineMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.GuidanceLineType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.HoldingAssessmentType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.HoldingPatternType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.InformationServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.InitialLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.InstrumentApproachProcedureType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.IntermediateLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.LocalizerType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.MarkerBeaconType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.MarkingBuoyType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.MissedApproachLegType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.NDBType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.NavaidType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.NavigationAreaRestrictionType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.NavigationAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.NonMovementAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ObstacleAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.OrganisationAuthorityType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.PassengerLoadingBridgeType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.PassengerServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.PilotControlledLightingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.PrecisionApproachRadarType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.PrimarySurveillanceRadarType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.ProcedureDMEType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RadarSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RadioCommunicationChannelType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RadioFrequencyAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RoadType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RouteDMEType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RouteSegmentType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RouteType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RulesProceduresType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayBlastPadType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayCentrelinePointType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayDirectionLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayDirectionType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayElementType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayProtectAreaLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayProtectAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.RunwayVisualRangeType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SDFType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SafeAltitudeAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SeaplaneLandingAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SeaplaneRampSiteType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SearchRescueServiceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SecondarySurveillanceRadarType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SignificantPointInAirspaceType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SpecialDateType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SpecialNavigationStationType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SpecialNavigationSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.StandMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.StandardInstrumentArrivalType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.StandardInstrumentDepartureType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.StandardLevelColumnType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.StandardLevelSectorType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.StandardLevelTableType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.SurveyControlPointType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TACANType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiHoldingPositionLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiHoldingPositionMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiHoldingPositionType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiwayElementType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiwayLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiwayMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TaxiwayType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TerminalArrivalAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TouchDownLiftOffLightSystemType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TouchDownLiftOffMarkingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TouchDownLiftOffSafeAreaType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.TouchDownLiftOffType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.UnitType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.UnplannedHoldingType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.VORType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.VerticalStructureType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.VisualGlideSlopeIndicatorType;
import com.aixm.delorean.core.schema.a5_1_1.aixm.WorkAreaType;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;


/**
 * <p>Java class for BasicMessageMemberAIXMPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BasicMessageMemberAIXMPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *       <choice>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMFeature"/>
 *       </choice>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicMessageMemberAIXMPropertyType", propOrder = {
    "abstractAIXMFeature"
})
@Entity(name = "BasicMessageMemberAIXMPropertyType")
@Table(name = "basic_message_member_property", schema = "aixm")
public class BasicMessageMemberAIXMPropertyType
    extends AbstractFeatureMemberType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * Substitution head for AIXM features.
     * 
     */
    @XmlElementRef(name = "AbstractAIXMFeature", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractAIXMFeatureType> abstractAIXMFeature;
    @XmlAttribute(name = "nilReason")
    protected String nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    public static final TypeType TYPE = TypeType.SIMPLE;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String simpleLinkTitle;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Substitution head for AIXM features.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractAIXMFeatureType> getAbstractAIXMFeature() {
        return abstractAIXMFeature;
    }

    /**
     * Sets the value of the abstractAIXMFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     *     
     * @see #getAbstractAIXMFeature()
     */
    public void setAbstractAIXMFeature(JAXBElement<? extends AbstractAIXMFeatureType> value) {
        this.abstractAIXMFeature = value;
    }

    @Transient
    public boolean isSetAbstractAIXMFeature() {
        return (this.abstractAIXMFeature!= null);
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NIL_REASON", length = 255)
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Sets the value of the nilReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

    @Transient
    public boolean isSetNilReason() {
        return (this.nilReason!= null);
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Transient
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    @Transient
    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "HREF")
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    @Transient
    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ROLE_")
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    @Transient
    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ARCROLE")
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    @Transient
    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Gets the value of the simpleLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SIMPLE_LINK_TITLE", length = 255)
    public String getSimpleLinkTitle() {
        return simpleLinkTitle;
    }

    /**
     * Sets the value of the simpleLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleLinkTitle(String value) {
        this.simpleLinkTitle = value;
    }

    @Transient
    public boolean isSetSimpleLinkTitle() {
        return (this.simpleLinkTitle!= null);
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    @Basic
    @Column(name = "SHOW_", length = 255)
    @Enumerated(EnumType.STRING)
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    @Transient
    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    @Basic
    @Column(name = "ACTUATE", length = 255)
    @Enumerated(EnumType.STRING)
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    @Transient
    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(generator = "delorean_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delorean_seq_gen", sequenceName = "delorean_seq_gen", allocationSize = 1)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Version
    @Column(name = "hjversion")
    public Long gethjversion() {
        return hjversion;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void sethjversion(Long value) {
        this.hjversion = value;
    }

    @Basic
    @Column(name = "ABSTRACT_AIXMFEATURE_NAME")
    public String getAbstractAIXMFeatureName() {
        if (this.getAbstractAIXMFeature() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractAIXMFeatureType.class, this.getAbstractAIXMFeature());
        } else {
            return null;
        }
    }

    public void setAbstractAIXMFeatureName(String target) {
        if (target!= null) {
            setAbstractAIXMFeature(JAXBElementUtils.wrap(this.getAbstractAIXMFeature(), target, AbstractAIXMFeatureType.class));
        }
    }

    @ManyToOne(targetEntity = AbstractAIXMFeatureType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @jakarta.persistence.JoinColumn(name = "feature_id", referencedColumnName = "hjid")
    public AbstractAIXMFeatureType getAbstractAIXMFeatureValue() {
        if (this.getAbstractAIXMFeature() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractAIXMFeatureType.class, this.getAbstractAIXMFeature());
        } else {
            return null;
        }
    }

    public void setAbstractAIXMFeatureValue(AbstractAIXMFeatureType target) {
        if (target!= null) {
            setAbstractAIXMFeature(JAXBElementUtils.wrap(this.getAbstractAIXMFeature(), target));
        }
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BasicMessageMemberAIXMPropertyType that = ((BasicMessageMemberAIXMPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRemoteSchema();
            boolean rhsFieldIsSet = that.isSetRemoteSchema();
            String lhsField;
            lhsField = this.getRemoteSchema();
            String rhsField;
            rhsField = that.getRemoteSchema();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "remoteSchema", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "remoteSchema", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSimpleLinkTitle();
            boolean rhsFieldIsSet = that.isSetSimpleLinkTitle();
            String lhsField;
            lhsField = this.getSimpleLinkTitle();
            String rhsField;
            rhsField = that.getSimpleLinkTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "simpleLinkTitle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "simpleLinkTitle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNilReason();
            boolean rhsFieldIsSet = that.isSetNilReason();
            String lhsField;
            lhsField = this.getNilReason();
            String rhsField;
            rhsField = that.getNilReason();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nilReason", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nilReason", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetShow();
            boolean rhsFieldIsSet = that.isSetShow();
            ShowType lhsField;
            lhsField = this.getShow();
            ShowType rhsField;
            rhsField = that.getShow();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "show", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "show", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRole();
            boolean rhsFieldIsSet = that.isSetRole();
            String lhsField;
            lhsField = this.getRole();
            String rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArcrole();
            boolean rhsFieldIsSet = that.isSetArcrole();
            String lhsField;
            lhsField = this.getArcrole();
            String rhsField;
            rhsField = that.getArcrole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arcrole", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arcrole", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetActuate();
            boolean rhsFieldIsSet = that.isSetActuate();
            ActuateType lhsField;
            lhsField = this.getActuate();
            ActuateType rhsField;
            rhsField = that.getActuate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "actuate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "actuate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractAIXMFeature();
            boolean rhsFieldIsSet = that.isSetAbstractAIXMFeature();
            JAXBElement<? extends AbstractAIXMFeatureType> lhsField;
            lhsField = this.getAbstractAIXMFeature();
            JAXBElement<? extends AbstractAIXMFeatureType> rhsField;
            rhsField = that.getAbstractAIXMFeature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractAIXMFeature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractAIXMFeature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHref();
            boolean rhsFieldIsSet = that.isSetHref();
            String lhsField;
            lhsField = this.getHref();
            String rhsField;
            rhsField = that.getHref();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "href", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "href", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractAIXMFeature();
            JAXBElement<? extends AbstractAIXMFeatureType> theField;
            theField = this.getAbstractAIXMFeature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractAIXMFeature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nilReason", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRemoteSchema();
            String theField;
            theField = this.getRemoteSchema();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "remoteSchema", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHref();
            String theField;
            theField = this.getHref();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "href", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRole();
            String theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcrole();
            String theField;
            theField = this.getArcrole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arcrole", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSimpleLinkTitle();
            String theField;
            theField = this.getSimpleLinkTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "simpleLinkTitle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetShow();
            ShowType theField;
            theField = this.getShow();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "show", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActuate();
            ActuateType theField;
            theField = this.getActuate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "actuate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAbstractAIXMFeature();
            JAXBElement<? extends AbstractAIXMFeatureType> theField;
            theField = this.getAbstractAIXMFeature();
            strategy.appendField(locator, this, "abstractAIXMFeature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRemoteSchema();
            String theField;
            theField = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHref();
            String theField;
            theField = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRole();
            String theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcrole();
            String theField;
            theField = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSimpleLinkTitle();
            String theField;
            theField = this.getSimpleLinkTitle();
            strategy.appendField(locator, this, "simpleLinkTitle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetShow();
            ShowType theField;
            theField = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActuate();
            ActuateType theField;
            theField = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
