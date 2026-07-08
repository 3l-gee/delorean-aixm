
package com.delorean.aixm.aixm51.schema;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;

/**
 * Adds the FeatureMetadata, which is common to all AIXM features
 *
 * <p>
 * Java class for AbstractAIXMFeatureType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AbstractAIXMFeatureType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.1}AbstractAIXMFeatureBaseType">
 *       <sequence>
 *         <element name="featureMetadata" type=
"{http://www.aixm.aero/schema/5.1}FeatureMetadataPropertyType" minOccurs="0"/>
 *         <element name="lifecycleStatus" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="APPROVED"/>
 *               <enumeration value="PENDING"/>
 *               <enumeration value="CONFLICT"/>
 *               <enumeration value="DECOMMISSIONED"/>
 *               <enumeration value="IMPORTED"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureType", propOrder = { "featureMetadata" })
@XmlSeeAlso({ RunwayDirectionType.class, RunwayCentrelinePointType.class, RunwayType.class, ArrestingGearType.class,
        RunwayElementType.class, RunwayVisualRangeType.class, RunwayBlastPadType.class, TaxiHoldingPositionType.class,
        TaxiwayType.class, TaxiwayElementType.class, GuidanceLineType.class, ApronType.class, ApronElementType.class,
        AircraftStandType.class, RoadType.class, DeicingAreaType.class, PassengerLoadingBridgeType.class,
        AbstractAirportHeliportProtectionAreaType.class, TouchDownLiftOffType.class,
        AbstractGroundLightSystemType.class, AbstractMarkingType.class, FloatingDockSiteType.class,
        MarkingBuoyType.class, SeaplaneLandingAreaType.class, SeaplaneRampSiteType.class, WorkAreaType.class,
        SurveyControlPointType.class, NonMovementAreaType.class, AirportHeliportCollocationType.class,
        AirportHeliportType.class, AltimeterSourceType.class, AirportHotSpotType.class, AuthorityForAirspaceType.class,
        AirspaceType.class, GeoBorderType.class, RadarSystemType.class, AbstractRadarEquipmentType.class,
        HoldingAssessmentType.class, StandardLevelTableType.class, StandardLevelSectorType.class,
        StandardLevelColumnType.class, RadioFrequencyAreaType.class, SpecialDateType.class,
        RadioCommunicationChannelType.class, PilotControlledLightingType.class, AbstractServiceType.class,
        AngleIndicationType.class, DistanceIndicationType.class, AbstractNavigationSystemCheckpointType.class,
        NavaidType.class, SpecialNavigationStationType.class, SpecialNavigationSystemType.class,
        AbstractNavaidEquipmentType.class, DesignatedPointType.class, SignificantPointInAirspaceType.class,
        AeronauticalGroundLightType.class, OrganisationAuthorityType.class, UnitType.class, ObstacleAreaType.class,
        VerticalStructureType.class, CirclingAreaType.class, TerminalArrivalAreaType.class, NavigationAreaType.class,
        AbstractProcedureType.class, NavigationAreaRestrictionType.class, AbstractSegmentLegType.class,
        ProcedureDMEType.class, SafeAltitudeAreaType.class, HoldingPatternType.class, UnplannedHoldingType.class,
        AirspaceBorderCrossingType.class, FlightRestrictionType.class, RouteSegmentType.class, RouteDMEType.class,
        RouteType.class, ChangeOverPointType.class, AerialRefuellingType.class, RulesProceduresType.class })
@Entity(name = "AbstractAIXMFeatureType")
@Table(name = "aixm_feature", schema = "aixm")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractAIXMFeatureType extends AbstractAIXMFeatureBaseType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    protected FeatureMetadataPropertyType featureMetadata;
    @XmlTransient
    protected String lifecycleStatus;
    @XmlTransient
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the featureMetadata property.
     *
     * @return possible object is {@link FeatureMetadataPropertyType }
     *
     */
    @jakarta.persistence.OneToOne(cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
    @jakarta.persistence.JoinColumn(name = "feature_metadata_hjid", referencedColumnName = "hjid")
    public FeatureMetadataPropertyType getFeatureMetadata() {
        return featureMetadata;
    }

    /**
     * Sets the value of the featureMetadata property.
     *
     * @param value
     *              allowed object is {@link FeatureMetadataPropertyType }
     *
     */
    public void setFeatureMetadata(FeatureMetadataPropertyType value) {
        this.featureMetadata = value;
    }

    @Transient
    public boolean isSetFeatureMetadata() {
        return (this.featureMetadata != null);
    }

    /**
     * Gets the value of the lifecycleStatus property.
     *
     * @return possible object is {@link String }
     *
     */
    @Basic
    @Column(name = "LIFECYCLE_STATUS")
    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    /**
     * Sets the value of the lifecycleStatus property.
     *
     * @param value
     *              allowed object is {@link String }
     *
     */
    public void setLifecycleStatus(String value) {
        this.lifecycleStatus = value;
    }

    @Transient
    public boolean isSetLifecycleStatus() {
        return (this.lifecycleStatus != null);
    }

    /**
     *
     *
     * @return possible object is {@link Long }
     *
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(generator = "delorean_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delorean_seq_gen", sequenceName = "delorean_seq_gen", allocationSize = 1)
    public Long gethjid() {
        return hjid;
    }

    /**
     *
     *
     * @param value
     *              allowed object is {@link Long }
     *
     */
    public void sethjid(Long value) {
        this.hjid = value;
    }

    /**
     *
     *
     * @return possible object is {@link Long }
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
     *              allowed object is {@link Long }
     *
     */
    public void sethjversion(Long value) {
        this.hjversion = value;
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
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
        {
            boolean lhsFieldIsSet = this.isSetLifecycleStatus();
            boolean rhsFieldIsSet = that.isSetLifecycleStatus();
            String lhsField;
            lhsField = this.getLifecycleStatus();
            String rhsField;
            rhsField = that.getLifecycleStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lifecycleStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lifecycleStatus", rhsField);
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
        {
            boolean theFieldIsSet = this.isSetLifecycleStatus();
            String theField;
            theField = this.getLifecycleStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lifecycleStatus", theField);
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
        {
            boolean theFieldIsSet = this.isSetLifecycleStatus();
            String theField;
            theField = this.getLifecycleStatus();
            strategy.appendField(locator, this, "lifecycleStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
