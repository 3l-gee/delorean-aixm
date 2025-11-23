
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import com.aixm.delorean.aixm511.org.w3.xlink.ActuateType;
import com.aixm.delorean.aixm511.org.w3.xlink.ShowType;
import com.aixm.delorean.aixm511.org.w3.xlink.TypeType;
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ProcedurePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcedurePropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedurePropertyType", propOrder = {
    "abstractFeature"
})
public class ProcedurePropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    /**
     * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
     * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
     * 
     */
    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractFeatureType> abstractFeature;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;
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

    /**
     * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
     * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
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
     *     {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
        return abstractFeature;
    }

    /**
     * Sets the value of the abstractFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
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
     *     {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}
     *     
     * @see #getAbstractFeature()
     */
    public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
        this.abstractFeature = value;
    }

    public boolean isSetAbstractFeature() {
        return (this.abstractFeature!= null);
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

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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

    public boolean isSetActuate() {
        return (this.actuate!= null);
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
        final ProcedurePropertyType that = ((ProcedurePropertyType) object);
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
            boolean lhsFieldIsSet = this.isSetAbstractFeature();
            boolean rhsFieldIsSet = that.isSetAbstractFeature();
            JAXBElement<? extends AbstractFeatureType> lhsField;
            lhsField = this.getAbstractFeature();
            JAXBElement<? extends AbstractFeatureType> rhsField;
            rhsField = that.getAbstractFeature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractFeature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractFeature", rhsField);
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
            JAXBElement<? extends AbstractFeatureType> theField;
            theField = this.getAbstractFeature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractFeature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "owns", theField);
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
            JAXBElement<? extends AbstractFeatureType> theField;
            theField = this.getAbstractFeature();
            strategy.appendField(locator, this, "abstractFeature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
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
