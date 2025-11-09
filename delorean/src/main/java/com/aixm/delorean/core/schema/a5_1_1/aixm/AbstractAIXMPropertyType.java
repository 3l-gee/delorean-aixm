
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;
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
 * It provides a basis for deriving AIXM feature/object properties. It defines the nilReason attribute and currently, it is only used for properties that are derived from association with an AIM object.
 * 
 * <p>Java class for AbstractAIXMPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonEnumeration" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMPropertyType")
@XmlSeeAlso({
    AerialRefuellingAnchorPropertyType.class,
    AerialRefuellingPointPropertyType.class,
    AerialRefuellingTrackPropertyType.class,
    AuthorityForAerialRefuellingPropertyType.class,
    AirportHeliportAvailabilityPropertyType.class,
    AirportHeliportResponsibilityOrganisationPropertyType.class,
    AirportHeliportUsagePropertyType.class,
    AltimeterSourceStatusPropertyType.class,
    CityPropertyType.class,
    ConditionCombinationPropertyType.class,
    SurfaceCharacteristicsPropertyType.class,
    UsageConditionPropertyType.class,
    WorkareaActivityPropertyType.class,
    ApronAreaAvailabilityPropertyType.class,
    ApronAreaUsagePropertyType.class,
    GroundLightingAvailabilityPropertyType.class,
    LightActivationPropertyType.class,
    MarkingElementPropertyType.class,
    ManoeuvringAreaAvailabilityPropertyType.class,
    ManoeuvringAreaUsagePropertyType.class,
    NavaidEquipmentDistancePropertyType.class,
    RunwayDeclaredDistancePropertyType.class,
    RunwayDeclaredDistanceValuePropertyType.class,
    AircraftStandContaminationPropertyType.class,
    AirportHeliportContaminationPropertyType.class,
    ApronContaminationPropertyType.class,
    RidgePropertyType.class,
    RunwayContaminationPropertyType.class,
    RunwaySectionContaminationPropertyType.class,
    SurfaceContaminationPropertyType.class,
    SurfaceContaminationLayerPropertyType.class,
    TaxiwayContaminationPropertyType.class,
    TouchDownLiftOffContaminationPropertyType.class,
    AirspaceActivationPropertyType.class,
    AirspaceGeometryComponentPropertyType.class,
    AirspaceLayerClassPropertyType.class,
    AirspaceVolumePropertyType.class,
    AirspaceVolumeDependencyPropertyType.class,
    AIXMCurvePropertyType.class,
    AIXMElevatedCurvePropertyType.class,
    AIXMElevatedPointPropertyType.class,
    AIXMElevatedSurfacePropertyType.class,
    AIXMPointPropertyType.class,
    AIXMSurfacePropertyType.class,
    HoldingPatternDistancePropertyType.class,
    HoldingPatternDurationPropertyType.class,
    AuthorityForNavaidEquipmentPropertyType.class,
    AuthorityForSpecialNavigationStationPropertyType.class,
    AuthorityForSpecialNavigationSystemPropertyType.class,
    NavaidComponentPropertyType.class,
    NavaidEquipmentMonitoringPropertyType.class,
    NavaidOperationalStatusPropertyType.class,
    SpecialNavigationStationStatusPropertyType.class,
    AngleUsePropertyType.class,
    EnRouteSegmentPointPropertyType.class,
    PointReferencePropertyType.class,
    SegmentPointPropertyType.class,
    TerminalSegmentPointPropertyType.class,
    LinguisticNotePropertyType.class,
    NotePropertyType.class,
    VerticalStructureLightingStatusPropertyType.class,
    VerticalStructurePartPropertyType.class,
    OrganisationAuthorityAssociationPropertyType.class,
    UnitAvailabilityPropertyType.class,
    UnitDependencyPropertyType.class,
    ApproachAltitudeTablePropertyType.class,
    ApproachConditionPropertyType.class,
    ApproachDistanceTablePropertyType.class,
    ApproachTimingTablePropertyType.class,
    FinalProfilePropertyType.class,
    MissedApproachGroupPropertyType.class,
    TerminalArrivalAreaSectorPropertyType.class,
    FASDataBlockPropertyType.class,
    CirclingRestrictionPropertyType.class,
    EquipmentUnavailableAdjustmentPropertyType.class,
    EquipmentUnavailableAdjustmentColumnPropertyType.class,
    MinimaPropertyType.class,
    DepartureArrivalConditionPropertyType.class,
    NavigationAreaSectorPropertyType.class,
    SectorDesignPropertyType.class,
    SafeAltitudeAreaSectorPropertyType.class,
    HoldingUsePropertyType.class,
    LandingTakeoffAreaCollectionPropertyType.class,
    ProcedureTransitionPropertyType.class,
    ProcedureTransitionLegPropertyType.class,
    ProcedureAvailabilityPropertyType.class,
    RouteAvailabilityPropertyType.class,
    RoutePortionPropertyType.class,
    DirectFlightPropertyType.class,
    DirectFlightClassPropertyType.class,
    DirectFlightSegmentPropertyType.class,
    FlightConditionCircumstancePropertyType.class,
    FlightConditionCombinationPropertyType.class,
    FlightConditionElementPropertyType.class,
    FlightRestrictionLevelPropertyType.class,
    FlightRestrictionRoutePropertyType.class,
    FlightRoutingElementPropertyType.class,
    CallsignDetailPropertyType.class,
    FuelPropertyType.class,
    NitrogenPropertyType.class,
    OilPropertyType.class,
    OxygenPropertyType.class,
    RadioCommunicationOperationalStatusPropertyType.class,
    ServiceOperationalStatusPropertyType.class,
    ContactInformationPropertyType.class,
    OnlineContactPropertyType.class,
    PostalAddressPropertyType.class,
    TelephoneContactPropertyType.class,
    AircraftCharacteristicPropertyType.class,
    FlightCharacteristicPropertyType.class,
    AirspaceLayerPropertyType.class,
    CircleSectorPropertyType.class,
    LightElementPropertyType.class,
    LightElementStatusPropertyType.class,
    MeteorologyPropertyType.class,
    PropertiesWithSchedulePropertyType.class,
    TimesheetPropertyType.class,
    StandardLevelPropertyType.class,
    AltitudeAdjustmentPropertyType.class,
    ObstacleAssessmentAreaPropertyType.class,
    ObstaclePlacementPropertyType.class,
    ObstructionPropertyType.class,
    RadarComponentPropertyType.class,
    ReflectorPropertyType.class,
    SurveillanceGroundStationPropertyType.class
})
@Entity(name = "AbstractAIXMPropertyType")
@Table(name = "abstract_aixm_property", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractAIXMPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlAttribute(name = "nilReason")
    protected String nilReason;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NIL_REASON")
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
        final AbstractAIXMPropertyType that = ((AbstractAIXMPropertyType) object);
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
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nilReason", theField);
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
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
