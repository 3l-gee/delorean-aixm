
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Adds the FeatureMetadata, which is common to all AIXM features
 * 
 * <p>Java class for AbstractAIXMFeatureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMFeatureType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMFeatureBaseType">
 *       <sequence>
 *         <element name="featureMetadata" type="{http://www.aixm.aero/schema/5.1.1}FeatureMetadataPropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureType", propOrder = {
    "featureMetadata"
})
@XmlSeeAlso({
    AerialRefuellingType.class,
    AirportHeliportType.class,
    AirportHeliportCollocationType.class,
    AirportHotSpotType.class,
    AltimeterSourceType.class,
    NonMovementAreaType.class,
    SurveyControlPointType.class,
    WorkAreaType.class,
    AircraftStandType.class,
    ApronType.class,
    ApronElementType.class,
    DeicingAreaType.class,
    PassengerLoadingBridgeType.class,
    RoadType.class,
    TouchDownLiftOffType.class,
    AbstractMarkingType.class,
    ArrestingGearType.class,
    RunwayType.class,
    RunwayBlastPadType.class,
    RunwayCentrelinePointType.class,
    RunwayDirectionType.class,
    RunwayElementType.class,
    AbstractAirportHeliportProtectionAreaType.class,
    RunwayVisualRangeType.class,
    AbstractGroundLightSystemType.class,
    FloatingDockSiteType.class,
    MarkingBuoyType.class,
    SeaplaneLandingAreaType.class,
    SeaplaneRampSiteType.class,
    GuidanceLineType.class,
    TaxiHoldingPositionType.class,
    TaxiwayType.class,
    TaxiwayElementType.class,
    AirspaceType.class,
    AuthorityForAirspaceType.class,
    GeoBorderType.class,
    HoldingPatternType.class,
    UnplannedHoldingType.class,
    AbstractNavigationSystemCheckpointType.class,
    NavaidType.class,
    SpecialNavigationStationType.class,
    SpecialNavigationSystemType.class,
    AbstractNavaidEquipmentType.class,
    AngleIndicationType.class,
    DistanceIndicationType.class,
    DesignatedPointType.class,
    SignificantPointInAirspaceType.class,
    AeronauticalGroundLightType.class,
    ObstacleAreaType.class,
    VerticalStructureType.class,
    OrganisationAuthorityType.class,
    UnitType.class,
    TerminalArrivalAreaType.class,
    CirclingAreaType.class,
    NavigationAreaType.class,
    AbstractProcedureType.class,
    SafeAltitudeAreaType.class,
    AbstractSegmentLegType.class,
    NavigationAreaRestrictionType.class,
    ProcedureDMEType.class,
    ChangeOverPointType.class,
    RouteType.class,
    RouteDMEType.class,
    RouteSegmentType.class,
    AirspaceBorderCrossingType.class,
    FlightRestrictionType.class,
    RulesProceduresType.class,
    PilotControlledLightingType.class,
    RadioCommunicationChannelType.class,
    AbstractServiceType.class,
    RadioFrequencyAreaType.class,
    SpecialDateType.class,
    StandardLevelColumnType.class,
    StandardLevelSectorType.class,
    StandardLevelTableType.class,
    HoldingAssessmentType.class,
    RadarSystemType.class,
    AbstractRadarEquipmentType.class
})
@Entity(name = "AbstractAIXMFeatureType")
@Table(name = "aixm_feature", schema = "aixm")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractAIXMFeatureType
    extends AbstractAIXMFeatureBaseType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected FeatureMetadataPropertyType featureMetadata;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the featureMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
@jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
@jakarta.persistence.JoinColumn(name = "feature_metadata_id", referencedColumnName = "hjid")
    public FeatureMetadataPropertyType getFeatureMetadata() {
        return featureMetadata;
    }

    /**
     * Sets the value of the featureMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public void setFeatureMetadata(FeatureMetadataPropertyType value) {
        this.featureMetadata = value;
    }

    @Transient
    public boolean isSetFeatureMetadata() {
        return (this.featureMetadata!= null);
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
        final AbstractAIXMFeatureType that = ((AbstractAIXMFeatureType) object);
        {
            boolean lhsFieldIsSet = this.isSetFeatureMetadata();
            boolean rhsFieldIsSet = that.isSetFeatureMetadata();
            FeatureMetadataPropertyType lhsField;
            lhsField = this.getFeatureMetadata();
            FeatureMetadataPropertyType rhsField;
            rhsField = that.getFeatureMetadata();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureMetadata", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureMetadata", rhsField);
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
            boolean theFieldIsSet = this.isSetFeatureMetadata();
            FeatureMetadataPropertyType theField;
            theField = this.getFeatureMetadata();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureMetadata", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFeatureMetadata();
            FeatureMetadataPropertyType theField;
            theField = this.getFeatureMetadata();
            strategy.appendField(locator, this, "featureMetadata", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
