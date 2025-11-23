
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for FlightConditionElementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightConditionElementType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FlightConditionElementPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightConditionElementExtension"/>
 *                 </choice>
 *                 <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "FlightConditionElementType", propOrder = {
    "index",
    "flightConditionWeather",
    "flightConditionAircraft",
    "flightConditionFlight",
    "flightConditionDirectFlightCondition",
    "flightConditionBorderCrossingCondition",
    "flightConditionOperand",
    "flightConditionRoutePortionCondition",
    "flightConditionStandardInstrumentDepartureCondition",
    "flightConditionStandardInstrumentArrivalCondition",
    "flightConditionOrganisationCondition",
    "significantPointConditionFixDesignatedPoint",
    "significantPointConditionNavaidSystem",
    "significantPointConditionPosition",
    "significantPointConditionRunwayPoint",
    "significantPointConditionAimingPoint",
    "significantPointConditionAirportReferencePoint",
    "flightConditionAirspaceCondition",
    "flightConditionAirportHeliportCondition",
    "flightConditionAerialRefuellingCondition",
    "operationalCondition",
    "flightLevel",
    "annotation",
    "extension"
})
@Entity(name = "FlightConditionElementType")
@Table(name = "flightconditionelement", schema = "route")
public class FlightConditionElementType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "index", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> index;
    @XmlElementRef(name = "flightCondition_weather", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MeteorologyPropertyType> flightConditionWeather;
    @XmlElementRef(name = "flightCondition_aircraft", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> flightConditionAircraft;
    @XmlElementRef(name = "flightCondition_flight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightCharacteristicPropertyType> flightConditionFlight;
    @XmlElementRef(name = "flightCondition_directFlightCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectFlightPropertyType> flightConditionDirectFlightCondition;
    @XmlElementRef(name = "flightCondition_borderCrossingCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspaceBorderCrossingPropertyType> flightConditionBorderCrossingCondition;
    @XmlElementRef(name = "flightCondition_operand", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightConditionCombinationPropertyType> flightConditionOperand;
    @XmlElementRef(name = "flightCondition_routePortionCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> flightConditionRoutePortionCondition;
    @XmlElementRef(name = "flightCondition_standardInstrumentDepartureCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> flightConditionStandardInstrumentDepartureCondition;
    @XmlElementRef(name = "flightCondition_standardInstrumentArrivalCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentArrivalPropertyType> flightConditionStandardInstrumentArrivalCondition;
    @XmlElementRef(name = "flightCondition_organisationCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> flightConditionOrganisationCondition;
    @XmlElementRef(name = "significantPointCondition_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> significantPointConditionFixDesignatedPoint;
    @XmlElementRef(name = "significantPointCondition_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> significantPointConditionNavaidSystem;
    @XmlElementRef(name = "significantPointCondition_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> significantPointConditionPosition;
    @XmlElementRef(name = "significantPointCondition_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> significantPointConditionRunwayPoint;
    @XmlElementRef(name = "significantPointCondition_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> significantPointConditionAimingPoint;
    @XmlElementRef(name = "significantPointCondition_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> significantPointConditionAirportReferencePoint;
    @XmlElementRef(name = "flightCondition_airspaceCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> flightConditionAirspaceCondition;
    @XmlElementRef(name = "flightCondition_airportHeliportCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> flightConditionAirportHeliportCondition;
    @XmlElementRef(name = "flightCondition_aerialRefuellingCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> flightConditionAerialRefuellingCondition;
    @XmlElementRef(name = "operationalCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightConditionCircumstancePropertyType> operationalCondition;
    @XmlElement(nillable = true)
    protected List<FlightRestrictionLevelPropertyType> flightLevel;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightConditionElementTypeExtensionType> extension;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setIndex(JAXBElement<NoSequenceType> value) {
        this.index = value;
    }

    @Transient
    public boolean isSetIndex() {
        return (this.index!= null);
    }

    /**
     * Gets the value of the flightConditionWeather property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeteorologyPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<MeteorologyPropertyType> getFlightConditionWeather() {
        return flightConditionWeather;
    }

    /**
     * Sets the value of the flightConditionWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeteorologyPropertyType }{@code >}
     *     
     */
    public void setFlightConditionWeather(JAXBElement<MeteorologyPropertyType> value) {
        this.flightConditionWeather = value;
    }

    @Transient
    public boolean isSetFlightConditionWeather() {
        return (this.flightConditionWeather!= null);
    }

    /**
     * Gets the value of the flightConditionAircraft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AircraftCharacteristicPropertyType> getFlightConditionAircraft() {
        return flightConditionAircraft;
    }

    /**
     * Sets the value of the flightConditionAircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAircraft(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.flightConditionAircraft = value;
    }

    @Transient
    public boolean isSetFlightConditionAircraft() {
        return (this.flightConditionAircraft!= null);
    }

    /**
     * Gets the value of the flightConditionFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightCharacteristicPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<FlightCharacteristicPropertyType> getFlightConditionFlight() {
        return flightConditionFlight;
    }

    /**
     * Sets the value of the flightConditionFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightCharacteristicPropertyType }{@code >}
     *     
     */
    public void setFlightConditionFlight(JAXBElement<FlightCharacteristicPropertyType> value) {
        this.flightConditionFlight = value;
    }

    @Transient
    public boolean isSetFlightConditionFlight() {
        return (this.flightConditionFlight!= null);
    }

    /**
     * Gets the value of the flightConditionDirectFlightCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DirectFlightPropertyType> getFlightConditionDirectFlightCondition() {
        return flightConditionDirectFlightCondition;
    }

    /**
     * Sets the value of the flightConditionDirectFlightCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightPropertyType }{@code >}
     *     
     */
    public void setFlightConditionDirectFlightCondition(JAXBElement<DirectFlightPropertyType> value) {
        this.flightConditionDirectFlightCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionDirectFlightCondition() {
        return (this.flightConditionDirectFlightCondition!= null);
    }

    /**
     * Gets the value of the flightConditionBorderCrossingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirspaceBorderCrossingPropertyType> getFlightConditionBorderCrossingCondition() {
        return flightConditionBorderCrossingCondition;
    }

    /**
     * Sets the value of the flightConditionBorderCrossingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingPropertyType }{@code >}
     *     
     */
    public void setFlightConditionBorderCrossingCondition(JAXBElement<AirspaceBorderCrossingPropertyType> value) {
        this.flightConditionBorderCrossingCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionBorderCrossingCondition() {
        return (this.flightConditionBorderCrossingCondition!= null);
    }

    /**
     * Gets the value of the flightConditionOperand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<FlightConditionCombinationPropertyType> getFlightConditionOperand() {
        return flightConditionOperand;
    }

    /**
     * Sets the value of the flightConditionOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationPropertyType }{@code >}
     *     
     */
    public void setFlightConditionOperand(JAXBElement<FlightConditionCombinationPropertyType> value) {
        this.flightConditionOperand = value;
    }

    @Transient
    public boolean isSetFlightConditionOperand() {
        return (this.flightConditionOperand!= null);
    }

    /**
     * Gets the value of the flightConditionRoutePortionCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePortionPropertyType> getFlightConditionRoutePortionCondition() {
        return flightConditionRoutePortionCondition;
    }

    /**
     * Sets the value of the flightConditionRoutePortionCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setFlightConditionRoutePortionCondition(JAXBElement<RoutePortionPropertyType> value) {
        this.flightConditionRoutePortionCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionRoutePortionCondition() {
        return (this.flightConditionRoutePortionCondition!= null);
    }

    /**
     * Gets the value of the flightConditionStandardInstrumentDepartureCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardInstrumentDeparturePropertyType> getFlightConditionStandardInstrumentDepartureCondition() {
        return flightConditionStandardInstrumentDepartureCondition;
    }

    /**
     * Sets the value of the flightConditionStandardInstrumentDepartureCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setFlightConditionStandardInstrumentDepartureCondition(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.flightConditionStandardInstrumentDepartureCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionStandardInstrumentDepartureCondition() {
        return (this.flightConditionStandardInstrumentDepartureCondition!= null);
    }

    /**
     * Gets the value of the flightConditionStandardInstrumentArrivalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardInstrumentArrivalPropertyType> getFlightConditionStandardInstrumentArrivalCondition() {
        return flightConditionStandardInstrumentArrivalCondition;
    }

    /**
     * Sets the value of the flightConditionStandardInstrumentArrivalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public void setFlightConditionStandardInstrumentArrivalCondition(JAXBElement<StandardInstrumentArrivalPropertyType> value) {
        this.flightConditionStandardInstrumentArrivalCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionStandardInstrumentArrivalCondition() {
        return (this.flightConditionStandardInstrumentArrivalCondition!= null);
    }

    /**
     * Gets the value of the flightConditionOrganisationCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getFlightConditionOrganisationCondition() {
        return flightConditionOrganisationCondition;
    }

    /**
     * Sets the value of the flightConditionOrganisationCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setFlightConditionOrganisationCondition(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.flightConditionOrganisationCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionOrganisationCondition() {
        return (this.flightConditionOrganisationCondition!= null);
    }

    /**
     * Gets the value of the significantPointConditionFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getSignificantPointConditionFixDesignatedPoint() {
        return significantPointConditionFixDesignatedPoint;
    }

    /**
     * Sets the value of the significantPointConditionFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.significantPointConditionFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetSignificantPointConditionFixDesignatedPoint() {
        return (this.significantPointConditionFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the significantPointConditionNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getSignificantPointConditionNavaidSystem() {
        return significantPointConditionNavaidSystem;
    }

    /**
     * Sets the value of the significantPointConditionNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.significantPointConditionNavaidSystem = value;
    }

    @Transient
    public boolean isSetSignificantPointConditionNavaidSystem() {
        return (this.significantPointConditionNavaidSystem!= null);
    }

    /**
     * Gets the value of the significantPointConditionPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getSignificantPointConditionPosition() {
        return significantPointConditionPosition;
    }

    /**
     * Sets the value of the significantPointConditionPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.significantPointConditionPosition = value;
    }

    @Transient
    public boolean isSetSignificantPointConditionPosition() {
        return (this.significantPointConditionPosition!= null);
    }

    /**
     * Gets the value of the significantPointConditionRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getSignificantPointConditionRunwayPoint() {
        return significantPointConditionRunwayPoint;
    }

    /**
     * Sets the value of the significantPointConditionRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.significantPointConditionRunwayPoint = value;
    }

    @Transient
    public boolean isSetSignificantPointConditionRunwayPoint() {
        return (this.significantPointConditionRunwayPoint!= null);
    }

    /**
     * Gets the value of the significantPointConditionAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getSignificantPointConditionAimingPoint() {
        return significantPointConditionAimingPoint;
    }

    /**
     * Sets the value of the significantPointConditionAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.significantPointConditionAimingPoint = value;
    }

    @Transient
    public boolean isSetSignificantPointConditionAimingPoint() {
        return (this.significantPointConditionAimingPoint!= null);
    }

    /**
     * Gets the value of the significantPointConditionAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getSignificantPointConditionAirportReferencePoint() {
        return significantPointConditionAirportReferencePoint;
    }

    /**
     * Sets the value of the significantPointConditionAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.significantPointConditionAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetSignificantPointConditionAirportReferencePoint() {
        return (this.significantPointConditionAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the flightConditionAirspaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirspacePropertyType> getFlightConditionAirspaceCondition() {
        return flightConditionAirspaceCondition;
    }

    /**
     * Sets the value of the flightConditionAirspaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setFlightConditionAirspaceCondition(JAXBElement<AirspacePropertyType> value) {
        this.flightConditionAirspaceCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionAirspaceCondition() {
        return (this.flightConditionAirspaceCondition!= null);
    }

    /**
     * Gets the value of the flightConditionAirportHeliportCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getFlightConditionAirportHeliportCondition() {
        return flightConditionAirportHeliportCondition;
    }

    /**
     * Sets the value of the flightConditionAirportHeliportCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAirportHeliportCondition(JAXBElement<AirportHeliportPropertyType> value) {
        this.flightConditionAirportHeliportCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionAirportHeliportCondition() {
        return (this.flightConditionAirportHeliportCondition!= null);
    }

    /**
     * Gets the value of the flightConditionAerialRefuellingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AerialRefuellingPropertyType> getFlightConditionAerialRefuellingCondition() {
        return flightConditionAerialRefuellingCondition;
    }

    /**
     * Sets the value of the flightConditionAerialRefuellingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAerialRefuellingCondition(JAXBElement<AerialRefuellingPropertyType> value) {
        this.flightConditionAerialRefuellingCondition = value;
    }

    @Transient
    public boolean isSetFlightConditionAerialRefuellingCondition() {
        return (this.flightConditionAerialRefuellingCondition!= null);
    }

    /**
     * Gets the value of the operationalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCircumstancePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<FlightConditionCircumstancePropertyType> getOperationalCondition() {
        return operationalCondition;
    }

    /**
     * Sets the value of the operationalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCircumstancePropertyType }{@code >}
     *     
     */
    public void setOperationalCondition(JAXBElement<FlightConditionCircumstancePropertyType> value) {
        this.operationalCondition = value;
    }

    @Transient
    public boolean isSetOperationalCondition() {
        return (this.operationalCondition!= null);
    }

    /**
     * Gets the value of the flightLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightRestrictionLevelPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = FlightRestrictionLevelPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "flightlevel_flightconditionelement_link", schema = "route", joinColumns = {
        @JoinColumn(name = "flightlevel", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "flightconditionelementpropertygroup", referencedColumnName = "hjid")
    })
    public List<FlightRestrictionLevelPropertyType> getFlightLevel() {
        if (flightLevel == null) {
            flightLevel = new ArrayList<>();
        }
        return this.flightLevel;
    }

    /**
     * 
     * 
     */
    public void setFlightLevel(List<FlightRestrictionLevelPropertyType> flightLevel) {
        this.flightLevel = flightLevel;
    }

    @Transient
    public boolean isSetFlightLevel() {
        return ((this.flightLevel!= null)&&(!this.flightLevel.isEmpty()));
    }

    public void unsetFlightLevel() {
        this.flightLevel = null;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_flightconditionelement_link", schema = "route", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "flightconditionelementpropertygroup", referencedColumnName = "hjid")
    })
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    /**
     * 
     * 
     */
    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightConditionElementTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FlightConditionElementTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_FLIGHT_CONDITION_E_0")
    public List<FlightConditionElementTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FlightConditionElementTypeExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "index")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "index_nilreason"))
    })
    public NoSequenceType getIndexItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getIndex());
    }

    public void setIndexItem(NoSequenceType target) {
        setIndex(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "index"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = MeteorologyPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_weather_id", referencedColumnName = "hjid")
    public MeteorologyPropertyType getFlightConditionWeatherItem() {
        return XmlAdapterUtils.unmarshallSource(MeteorologyPropertyType.class, this.getFlightConditionWeather());
    }

    public void setFlightConditionWeatherItem(MeteorologyPropertyType target) {
        setFlightConditionWeather(XmlAdapterUtils.marshallJAXBElement(MeteorologyPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_weather"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_aircraft_id", referencedColumnName = "hjid")
    public AircraftCharacteristicPropertyType getFlightConditionAircraftItem() {
        return XmlAdapterUtils.unmarshallSource(AircraftCharacteristicPropertyType.class, this.getFlightConditionAircraft());
    }

    public void setFlightConditionAircraftItem(AircraftCharacteristicPropertyType target) {
        setFlightConditionAircraft(XmlAdapterUtils.marshallJAXBElement(AircraftCharacteristicPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_aircraft"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = FlightCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_flight_id", referencedColumnName = "hjid")
    public FlightCharacteristicPropertyType getFlightConditionFlightItem() {
        return XmlAdapterUtils.unmarshallSource(FlightCharacteristicPropertyType.class, this.getFlightConditionFlight());
    }

    public void setFlightConditionFlightItem(FlightCharacteristicPropertyType target) {
        setFlightConditionFlight(XmlAdapterUtils.marshallJAXBElement(FlightCharacteristicPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_flight"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = DirectFlightPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_directflightcondition_id", referencedColumnName = "hjid")
    public DirectFlightPropertyType getFlightConditionDirectFlightConditionItem() {
        return XmlAdapterUtils.unmarshallSource(DirectFlightPropertyType.class, this.getFlightConditionDirectFlightCondition());
    }

    public void setFlightConditionDirectFlightConditionItem(DirectFlightPropertyType target) {
        setFlightConditionDirectFlightCondition(XmlAdapterUtils.marshallJAXBElement(DirectFlightPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_directFlightCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AirspaceBorderCrossingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_bordercrossingcondition_id", referencedColumnName = "hjid")
    public AirspaceBorderCrossingPropertyType getFlightConditionBorderCrossingConditionItem() {
        return XmlAdapterUtils.unmarshallSource(AirspaceBorderCrossingPropertyType.class, this.getFlightConditionBorderCrossingCondition());
    }

    public void setFlightConditionBorderCrossingConditionItem(AirspaceBorderCrossingPropertyType target) {
        setFlightConditionBorderCrossingCondition(XmlAdapterUtils.marshallJAXBElement(AirspaceBorderCrossingPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_borderCrossingCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = FlightConditionCombinationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_operand_id", referencedColumnName = "hjid")
    public FlightConditionCombinationPropertyType getFlightConditionOperandItem() {
        return XmlAdapterUtils.unmarshallSource(FlightConditionCombinationPropertyType.class, this.getFlightConditionOperand());
    }

    public void setFlightConditionOperandItem(FlightConditionCombinationPropertyType target) {
        setFlightConditionOperand(XmlAdapterUtils.marshallJAXBElement(FlightConditionCombinationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_operand"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = RoutePortionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_routeportioncondition_id", referencedColumnName = "hjid")
    public RoutePortionPropertyType getFlightConditionRoutePortionConditionItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePortionPropertyType.class, this.getFlightConditionRoutePortionCondition());
    }

    public void setFlightConditionRoutePortionConditionItem(RoutePortionPropertyType target) {
        setFlightConditionRoutePortionCondition(XmlAdapterUtils.marshallJAXBElement(RoutePortionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_routePortionCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = StandardInstrumentDeparturePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_standardinstrumentdeparturecondition_id", referencedColumnName = "hjid")
    public StandardInstrumentDeparturePropertyType getFlightConditionStandardInstrumentDepartureConditionItem() {
        return XmlAdapterUtils.unmarshallSource(StandardInstrumentDeparturePropertyType.class, this.getFlightConditionStandardInstrumentDepartureCondition());
    }

    public void setFlightConditionStandardInstrumentDepartureConditionItem(StandardInstrumentDeparturePropertyType target) {
        setFlightConditionStandardInstrumentDepartureCondition(XmlAdapterUtils.marshallJAXBElement(StandardInstrumentDeparturePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_standardInstrumentDepartureCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = StandardInstrumentArrivalPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_standardinstrumentarrivalcondition_id", referencedColumnName = "hjid")
    public StandardInstrumentArrivalPropertyType getFlightConditionStandardInstrumentArrivalConditionItem() {
        return XmlAdapterUtils.unmarshallSource(StandardInstrumentArrivalPropertyType.class, this.getFlightConditionStandardInstrumentArrivalCondition());
    }

    public void setFlightConditionStandardInstrumentArrivalConditionItem(StandardInstrumentArrivalPropertyType target) {
        setFlightConditionStandardInstrumentArrivalCondition(XmlAdapterUtils.marshallJAXBElement(StandardInstrumentArrivalPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_standardInstrumentArrivalCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_organisationcondition_id", referencedColumnName = "hjid")
    public OrganisationAuthorityPropertyType getFlightConditionOrganisationConditionItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getFlightConditionOrganisationCondition());
    }

    public void setFlightConditionOrganisationConditionItem(OrganisationAuthorityPropertyType target) {
        setFlightConditionOrganisationCondition(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_organisationCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "significantpointcondition_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getSignificantPointConditionFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getSignificantPointConditionFixDesignatedPoint());
    }

    public void setSignificantPointConditionFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setSignificantPointConditionFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "significantPointCondition_fixDesignatedPoint"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "significantpointcondition_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getSignificantPointConditionNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getSignificantPointConditionNavaidSystem());
    }

    public void setSignificantPointConditionNavaidSystemItem(NavaidPropertyType target) {
        setSignificantPointConditionNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "significantPointCondition_navaidSystem"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "significantpointcondition_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getSignificantPointConditionPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getSignificantPointConditionPosition());
    }

    public void setSignificantPointConditionPositionItem(AIXMPointPropertyType target) {
        setSignificantPointConditionPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "significantPointCondition_position"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "significantpointcondition_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getSignificantPointConditionRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getSignificantPointConditionRunwayPoint());
    }

    public void setSignificantPointConditionRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setSignificantPointConditionRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "significantPointCondition_runwayPoint"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "significantpointcondition_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getSignificantPointConditionAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getSignificantPointConditionAimingPoint());
    }

    public void setSignificantPointConditionAimingPointItem(TouchDownLiftOffPropertyType target) {
        setSignificantPointConditionAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "significantPointCondition_aimingPoint"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "significantpointcondition_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getSignificantPointConditionAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getSignificantPointConditionAirportReferencePoint());
    }

    public void setSignificantPointConditionAirportReferencePointItem(AirportHeliportPropertyType target) {
        setSignificantPointConditionAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "significantPointCondition_airportReferencePoint"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AirspacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_airspacecondition_id", referencedColumnName = "hjid")
    public AirspacePropertyType getFlightConditionAirspaceConditionItem() {
        return XmlAdapterUtils.unmarshallSource(AirspacePropertyType.class, this.getFlightConditionAirspaceCondition());
    }

    public void setFlightConditionAirspaceConditionItem(AirspacePropertyType target) {
        setFlightConditionAirspaceCondition(XmlAdapterUtils.marshallJAXBElement(AirspacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_airspaceCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_airportheliportcondition_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getFlightConditionAirportHeliportConditionItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getFlightConditionAirportHeliportCondition());
    }

    public void setFlightConditionAirportHeliportConditionItem(AirportHeliportPropertyType target) {
        setFlightConditionAirportHeliportCondition(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_airportHeliportCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = AerialRefuellingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcondition_aerialrefuellingcondition_id", referencedColumnName = "hjid")
    public AerialRefuellingPropertyType getFlightConditionAerialRefuellingConditionItem() {
        return XmlAdapterUtils.unmarshallSource(AerialRefuellingPropertyType.class, this.getFlightConditionAerialRefuellingCondition());
    }

    public void setFlightConditionAerialRefuellingConditionItem(AerialRefuellingPropertyType target) {
        setFlightConditionAerialRefuellingCondition(XmlAdapterUtils.marshallJAXBElement(AerialRefuellingPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightCondition_aerialRefuellingCondition"), FlightConditionElementType.class, target));
    }

    @ManyToOne(targetEntity = FlightConditionCircumstancePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "operationalcondition_id", referencedColumnName = "hjid")
    public FlightConditionCircumstancePropertyType getOperationalConditionItem() {
        return XmlAdapterUtils.unmarshallSource(FlightConditionCircumstancePropertyType.class, this.getOperationalCondition());
    }

    public void setOperationalConditionItem(FlightConditionCircumstancePropertyType target) {
        setOperationalCondition(XmlAdapterUtils.marshallJAXBElement(FlightConditionCircumstancePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "operationalCondition"), FlightConditionElementType.class, target));
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
        final FlightConditionElementType that = ((FlightConditionElementType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionOperand();
            boolean rhsFieldIsSet = that.isSetFlightConditionOperand();
            JAXBElement<FlightConditionCombinationPropertyType> lhsField;
            lhsField = this.getFlightConditionOperand();
            JAXBElement<FlightConditionCombinationPropertyType> rhsField;
            rhsField = that.getFlightConditionOperand();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionOperand", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionOperand", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionFlight();
            boolean rhsFieldIsSet = that.isSetFlightConditionFlight();
            JAXBElement<FlightCharacteristicPropertyType> lhsField;
            lhsField = this.getFlightConditionFlight();
            JAXBElement<FlightCharacteristicPropertyType> rhsField;
            rhsField = that.getFlightConditionFlight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionFlight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionFlight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantPointConditionPosition();
            boolean rhsFieldIsSet = that.isSetSignificantPointConditionPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getSignificantPointConditionPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getSignificantPointConditionPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantPointConditionPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantPointConditionPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FlightConditionElementTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FlightConditionElementTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIndex();
            boolean rhsFieldIsSet = that.isSetIndex();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getIndex();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getIndex();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "index", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "index", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantPointConditionRunwayPoint();
            boolean rhsFieldIsSet = that.isSetSignificantPointConditionRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getSignificantPointConditionRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getSignificantPointConditionRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantPointConditionRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantPointConditionRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionAirspaceCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionAirspaceCondition();
            JAXBElement<AirspacePropertyType> lhsField;
            lhsField = this.getFlightConditionAirspaceCondition();
            JAXBElement<AirspacePropertyType> rhsField;
            rhsField = that.getFlightConditionAirspaceCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionAirspaceCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionAirspaceCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation()?this.getAnnotation():null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation()?that.getAnnotation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionDirectFlightCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionDirectFlightCondition();
            JAXBElement<DirectFlightPropertyType> lhsField;
            lhsField = this.getFlightConditionDirectFlightCondition();
            JAXBElement<DirectFlightPropertyType> rhsField;
            rhsField = that.getFlightConditionDirectFlightCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionDirectFlightCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionDirectFlightCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionAirportHeliportCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionAirportHeliportCondition();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getFlightConditionAirportHeliportCondition();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getFlightConditionAirportHeliportCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionAirportHeliportCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionAirportHeliportCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionAircraft();
            boolean rhsFieldIsSet = that.isSetFlightConditionAircraft();
            JAXBElement<AircraftCharacteristicPropertyType> lhsField;
            lhsField = this.getFlightConditionAircraft();
            JAXBElement<AircraftCharacteristicPropertyType> rhsField;
            rhsField = that.getFlightConditionAircraft();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionAircraft", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionAircraft", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantPointConditionAimingPoint();
            boolean rhsFieldIsSet = that.isSetSignificantPointConditionAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getSignificantPointConditionAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getSignificantPointConditionAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantPointConditionAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantPointConditionAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightLevel();
            boolean rhsFieldIsSet = that.isSetFlightLevel();
            List<FlightRestrictionLevelPropertyType> lhsField;
            lhsField = (this.isSetFlightLevel()?this.getFlightLevel():null);
            List<FlightRestrictionLevelPropertyType> rhsField;
            rhsField = (that.isSetFlightLevel()?that.getFlightLevel():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperationalCondition();
            boolean rhsFieldIsSet = that.isSetOperationalCondition();
            JAXBElement<FlightConditionCircumstancePropertyType> lhsField;
            lhsField = this.getOperationalCondition();
            JAXBElement<FlightConditionCircumstancePropertyType> rhsField;
            rhsField = that.getOperationalCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operationalCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operationalCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionStandardInstrumentArrivalCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionStandardInstrumentArrivalCondition();
            JAXBElement<StandardInstrumentArrivalPropertyType> lhsField;
            lhsField = this.getFlightConditionStandardInstrumentArrivalCondition();
            JAXBElement<StandardInstrumentArrivalPropertyType> rhsField;
            rhsField = that.getFlightConditionStandardInstrumentArrivalCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionStandardInstrumentArrivalCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionStandardInstrumentArrivalCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantPointConditionFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetSignificantPointConditionFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getSignificantPointConditionFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getSignificantPointConditionFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantPointConditionFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantPointConditionFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantPointConditionNavaidSystem();
            boolean rhsFieldIsSet = that.isSetSignificantPointConditionNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getSignificantPointConditionNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getSignificantPointConditionNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantPointConditionNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantPointConditionNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionRoutePortionCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionRoutePortionCondition();
            JAXBElement<RoutePortionPropertyType> lhsField;
            lhsField = this.getFlightConditionRoutePortionCondition();
            JAXBElement<RoutePortionPropertyType> rhsField;
            rhsField = that.getFlightConditionRoutePortionCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionRoutePortionCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionRoutePortionCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionOrganisationCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionOrganisationCondition();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getFlightConditionOrganisationCondition();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getFlightConditionOrganisationCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionOrganisationCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionOrganisationCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionBorderCrossingCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionBorderCrossingCondition();
            JAXBElement<AirspaceBorderCrossingPropertyType> lhsField;
            lhsField = this.getFlightConditionBorderCrossingCondition();
            JAXBElement<AirspaceBorderCrossingPropertyType> rhsField;
            rhsField = that.getFlightConditionBorderCrossingCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionBorderCrossingCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionBorderCrossingCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionWeather();
            boolean rhsFieldIsSet = that.isSetFlightConditionWeather();
            JAXBElement<MeteorologyPropertyType> lhsField;
            lhsField = this.getFlightConditionWeather();
            JAXBElement<MeteorologyPropertyType> rhsField;
            rhsField = that.getFlightConditionWeather();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionWeather", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionWeather", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignificantPointConditionAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetSignificantPointConditionAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getSignificantPointConditionAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getSignificantPointConditionAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantPointConditionAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantPointConditionAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionStandardInstrumentDepartureCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionStandardInstrumentDepartureCondition();
            JAXBElement<StandardInstrumentDeparturePropertyType> lhsField;
            lhsField = this.getFlightConditionStandardInstrumentDepartureCondition();
            JAXBElement<StandardInstrumentDeparturePropertyType> rhsField;
            rhsField = that.getFlightConditionStandardInstrumentDepartureCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionStandardInstrumentDepartureCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionStandardInstrumentDepartureCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionAerialRefuellingCondition();
            boolean rhsFieldIsSet = that.isSetFlightConditionAerialRefuellingCondition();
            JAXBElement<AerialRefuellingPropertyType> lhsField;
            lhsField = this.getFlightConditionAerialRefuellingCondition();
            JAXBElement<AerialRefuellingPropertyType> rhsField;
            rhsField = that.getFlightConditionAerialRefuellingCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionAerialRefuellingCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionAerialRefuellingCondition", rhsField);
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
            boolean theFieldIsSet = this.isSetIndex();
            JAXBElement<NoSequenceType> theField;
            theField = this.getIndex();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "index", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionWeather();
            JAXBElement<MeteorologyPropertyType> theField;
            theField = this.getFlightConditionWeather();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionWeather", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAircraft();
            JAXBElement<AircraftCharacteristicPropertyType> theField;
            theField = this.getFlightConditionAircraft();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionAircraft", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionFlight();
            JAXBElement<FlightCharacteristicPropertyType> theField;
            theField = this.getFlightConditionFlight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionFlight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionDirectFlightCondition();
            JAXBElement<DirectFlightPropertyType> theField;
            theField = this.getFlightConditionDirectFlightCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionDirectFlightCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionBorderCrossingCondition();
            JAXBElement<AirspaceBorderCrossingPropertyType> theField;
            theField = this.getFlightConditionBorderCrossingCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionBorderCrossingCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionOperand();
            JAXBElement<FlightConditionCombinationPropertyType> theField;
            theField = this.getFlightConditionOperand();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionOperand", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionRoutePortionCondition();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getFlightConditionRoutePortionCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionRoutePortionCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionStandardInstrumentDepartureCondition();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getFlightConditionStandardInstrumentDepartureCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionStandardInstrumentDepartureCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionStandardInstrumentArrivalCondition();
            JAXBElement<StandardInstrumentArrivalPropertyType> theField;
            theField = this.getFlightConditionStandardInstrumentArrivalCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionStandardInstrumentArrivalCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionOrganisationCondition();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getFlightConditionOrganisationCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionOrganisationCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getSignificantPointConditionFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantPointConditionFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getSignificantPointConditionNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantPointConditionNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getSignificantPointConditionPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantPointConditionPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getSignificantPointConditionRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantPointConditionRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getSignificantPointConditionAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantPointConditionAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getSignificantPointConditionAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantPointConditionAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAirspaceCondition();
            JAXBElement<AirspacePropertyType> theField;
            theField = this.getFlightConditionAirspaceCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionAirspaceCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAirportHeliportCondition();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getFlightConditionAirportHeliportCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionAirportHeliportCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAerialRefuellingCondition();
            JAXBElement<AerialRefuellingPropertyType> theField;
            theField = this.getFlightConditionAerialRefuellingCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionAerialRefuellingCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationalCondition();
            JAXBElement<FlightConditionCircumstancePropertyType> theField;
            theField = this.getOperationalCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operationalCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightLevel();
            List<FlightRestrictionLevelPropertyType> theField;
            theField = (this.isSetFlightLevel()?this.getFlightLevel():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightConditionElementTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetIndex();
            JAXBElement<NoSequenceType> theField;
            theField = this.getIndex();
            strategy.appendField(locator, this, "index", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionWeather();
            JAXBElement<MeteorologyPropertyType> theField;
            theField = this.getFlightConditionWeather();
            strategy.appendField(locator, this, "flightConditionWeather", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAircraft();
            JAXBElement<AircraftCharacteristicPropertyType> theField;
            theField = this.getFlightConditionAircraft();
            strategy.appendField(locator, this, "flightConditionAircraft", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionFlight();
            JAXBElement<FlightCharacteristicPropertyType> theField;
            theField = this.getFlightConditionFlight();
            strategy.appendField(locator, this, "flightConditionFlight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionDirectFlightCondition();
            JAXBElement<DirectFlightPropertyType> theField;
            theField = this.getFlightConditionDirectFlightCondition();
            strategy.appendField(locator, this, "flightConditionDirectFlightCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionBorderCrossingCondition();
            JAXBElement<AirspaceBorderCrossingPropertyType> theField;
            theField = this.getFlightConditionBorderCrossingCondition();
            strategy.appendField(locator, this, "flightConditionBorderCrossingCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionOperand();
            JAXBElement<FlightConditionCombinationPropertyType> theField;
            theField = this.getFlightConditionOperand();
            strategy.appendField(locator, this, "flightConditionOperand", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionRoutePortionCondition();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getFlightConditionRoutePortionCondition();
            strategy.appendField(locator, this, "flightConditionRoutePortionCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionStandardInstrumentDepartureCondition();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getFlightConditionStandardInstrumentDepartureCondition();
            strategy.appendField(locator, this, "flightConditionStandardInstrumentDepartureCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionStandardInstrumentArrivalCondition();
            JAXBElement<StandardInstrumentArrivalPropertyType> theField;
            theField = this.getFlightConditionStandardInstrumentArrivalCondition();
            strategy.appendField(locator, this, "flightConditionStandardInstrumentArrivalCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionOrganisationCondition();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getFlightConditionOrganisationCondition();
            strategy.appendField(locator, this, "flightConditionOrganisationCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getSignificantPointConditionFixDesignatedPoint();
            strategy.appendField(locator, this, "significantPointConditionFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getSignificantPointConditionNavaidSystem();
            strategy.appendField(locator, this, "significantPointConditionNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getSignificantPointConditionPosition();
            strategy.appendField(locator, this, "significantPointConditionPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getSignificantPointConditionRunwayPoint();
            strategy.appendField(locator, this, "significantPointConditionRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getSignificantPointConditionAimingPoint();
            strategy.appendField(locator, this, "significantPointConditionAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantPointConditionAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getSignificantPointConditionAirportReferencePoint();
            strategy.appendField(locator, this, "significantPointConditionAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAirspaceCondition();
            JAXBElement<AirspacePropertyType> theField;
            theField = this.getFlightConditionAirspaceCondition();
            strategy.appendField(locator, this, "flightConditionAirspaceCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAirportHeliportCondition();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getFlightConditionAirportHeliportCondition();
            strategy.appendField(locator, this, "flightConditionAirportHeliportCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightConditionAerialRefuellingCondition();
            JAXBElement<AerialRefuellingPropertyType> theField;
            theField = this.getFlightConditionAerialRefuellingCondition();
            strategy.appendField(locator, this, "flightConditionAerialRefuellingCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationalCondition();
            JAXBElement<FlightConditionCircumstancePropertyType> theField;
            theField = this.getOperationalCondition();
            strategy.appendField(locator, this, "operationalCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightLevel();
            List<FlightRestrictionLevelPropertyType> theField;
            theField = (this.isSetFlightLevel()?this.getFlightLevel():null);
            strategy.appendField(locator, this, "flightLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightConditionElementTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
