
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for FlightRoutingElementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRoutingElementType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FlightRoutingElementPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightRoutingElementExtension"/>
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
@XmlType(name = "FlightRoutingElementType", propOrder = {
    "orderNumber",
    "speed",
    "speedReference",
    "speedCriteria",
    "flightLevel",
    "elementDirectFlightElement",
    "elementRoutePortionElement",
    "elementStandardInstrumentDepartureElement",
    "elementStandardInstrumentArrivalElement",
    "pointElementFixDesignatedPoint",
    "pointElementNavaidSystem",
    "pointElementPosition",
    "pointElementRunwayPoint",
    "pointElementAimingPoint",
    "pointElementAirportReferencePoint",
    "elementAirspaceElement",
    "elementAirportHeliportElement",
    "elementAerialRefuellingElement",
    "annotation",
    "extension"
})
@Entity(name = "FlightRoutingElementType")
@Table(name = "flightroutingelement", schema = "route")
public class FlightRoutingElementType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "orderNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> orderNumber;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "speedCriteria", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeComparisonType> speedCriteria;
    @XmlElement(nillable = true)
    protected List<FlightRestrictionLevelPropertyType> flightLevel;
    @XmlElementRef(name = "element_directFlightElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectFlightSegmentPropertyType> elementDirectFlightElement;
    @XmlElementRef(name = "element_routePortionElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> elementRoutePortionElement;
    @XmlElementRef(name = "element_standardInstrumentDepartureElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> elementStandardInstrumentDepartureElement;
    @XmlElementRef(name = "element_standardInstrumentArrivalElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentArrivalPropertyType> elementStandardInstrumentArrivalElement;
    @XmlElementRef(name = "pointElement_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> pointElementFixDesignatedPoint;
    @XmlElementRef(name = "pointElement_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> pointElementNavaidSystem;
    @XmlElementRef(name = "pointElement_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> pointElementPosition;
    @XmlElementRef(name = "pointElement_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> pointElementRunwayPoint;
    @XmlElementRef(name = "pointElement_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> pointElementAimingPoint;
    @XmlElementRef(name = "pointElement_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> pointElementAirportReferencePoint;
    @XmlElementRef(name = "element_airspaceElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> elementAirspaceElement;
    @XmlElementRef(name = "element_airportHeliportElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> elementAirportHeliportElement;
    @XmlElementRef(name = "element_aerialRefuellingElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> elementAerialRefuellingElement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightRoutingElementTypeExtensionType> extension;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoSequenceType> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<NoSequenceType> value) {
        this.orderNumber = value;
    }

    @Transient
    public boolean isSetOrderNumber() {
        return (this.orderNumber!= null);
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    @Transient
    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    /**
     * Gets the value of the speedReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSpeedReferenceType> getSpeedReference() {
        return speedReference;
    }

    /**
     * Sets the value of the speedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    @Transient
    public boolean isSetSpeedReference() {
        return (this.speedReference!= null);
    }

    /**
     * Gets the value of the speedCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeComparisonType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeComparisonType> getSpeedCriteria() {
        return speedCriteria;
    }

    /**
     * Sets the value of the speedCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeComparisonType }{@code >}
     *     
     */
    public void setSpeedCriteria(JAXBElement<CodeComparisonType> value) {
        this.speedCriteria = value;
    }

    @Transient
    public boolean isSetSpeedCriteria() {
        return (this.speedCriteria!= null);
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
    @JoinTable(name = "flightlevel_flightroutingelement_link", schema = "route", joinColumns = {
        @JoinColumn(name = "flightlevel", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "flightroutingelementpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the elementDirectFlightElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DirectFlightSegmentPropertyType> getElementDirectFlightElement() {
        return elementDirectFlightElement;
    }

    /**
     * Sets the value of the elementDirectFlightElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentPropertyType }{@code >}
     *     
     */
    public void setElementDirectFlightElement(JAXBElement<DirectFlightSegmentPropertyType> value) {
        this.elementDirectFlightElement = value;
    }

    @Transient
    public boolean isSetElementDirectFlightElement() {
        return (this.elementDirectFlightElement!= null);
    }

    /**
     * Gets the value of the elementRoutePortionElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePortionPropertyType> getElementRoutePortionElement() {
        return elementRoutePortionElement;
    }

    /**
     * Sets the value of the elementRoutePortionElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setElementRoutePortionElement(JAXBElement<RoutePortionPropertyType> value) {
        this.elementRoutePortionElement = value;
    }

    @Transient
    public boolean isSetElementRoutePortionElement() {
        return (this.elementRoutePortionElement!= null);
    }

    /**
     * Gets the value of the elementStandardInstrumentDepartureElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardInstrumentDeparturePropertyType> getElementStandardInstrumentDepartureElement() {
        return elementStandardInstrumentDepartureElement;
    }

    /**
     * Sets the value of the elementStandardInstrumentDepartureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setElementStandardInstrumentDepartureElement(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.elementStandardInstrumentDepartureElement = value;
    }

    @Transient
    public boolean isSetElementStandardInstrumentDepartureElement() {
        return (this.elementStandardInstrumentDepartureElement!= null);
    }

    /**
     * Gets the value of the elementStandardInstrumentArrivalElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardInstrumentArrivalPropertyType> getElementStandardInstrumentArrivalElement() {
        return elementStandardInstrumentArrivalElement;
    }

    /**
     * Sets the value of the elementStandardInstrumentArrivalElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public void setElementStandardInstrumentArrivalElement(JAXBElement<StandardInstrumentArrivalPropertyType> value) {
        this.elementStandardInstrumentArrivalElement = value;
    }

    @Transient
    public boolean isSetElementStandardInstrumentArrivalElement() {
        return (this.elementStandardInstrumentArrivalElement!= null);
    }

    /**
     * Gets the value of the pointElementFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getPointElementFixDesignatedPoint() {
        return pointElementFixDesignatedPoint;
    }

    /**
     * Sets the value of the pointElementFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPointElementFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.pointElementFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetPointElementFixDesignatedPoint() {
        return (this.pointElementFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the pointElementNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getPointElementNavaidSystem() {
        return pointElementNavaidSystem;
    }

    /**
     * Sets the value of the pointElementNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setPointElementNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.pointElementNavaidSystem = value;
    }

    @Transient
    public boolean isSetPointElementNavaidSystem() {
        return (this.pointElementNavaidSystem!= null);
    }

    /**
     * Gets the value of the pointElementPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getPointElementPosition() {
        return pointElementPosition;
    }

    /**
     * Sets the value of the pointElementPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setPointElementPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.pointElementPosition = value;
    }

    @Transient
    public boolean isSetPointElementPosition() {
        return (this.pointElementPosition!= null);
    }

    /**
     * Gets the value of the pointElementRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getPointElementRunwayPoint() {
        return pointElementRunwayPoint;
    }

    /**
     * Sets the value of the pointElementRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setPointElementRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.pointElementRunwayPoint = value;
    }

    @Transient
    public boolean isSetPointElementRunwayPoint() {
        return (this.pointElementRunwayPoint!= null);
    }

    /**
     * Gets the value of the pointElementAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getPointElementAimingPoint() {
        return pointElementAimingPoint;
    }

    /**
     * Sets the value of the pointElementAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setPointElementAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.pointElementAimingPoint = value;
    }

    @Transient
    public boolean isSetPointElementAimingPoint() {
        return (this.pointElementAimingPoint!= null);
    }

    /**
     * Gets the value of the pointElementAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getPointElementAirportReferencePoint() {
        return pointElementAirportReferencePoint;
    }

    /**
     * Sets the value of the pointElementAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setPointElementAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.pointElementAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetPointElementAirportReferencePoint() {
        return (this.pointElementAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the elementAirspaceElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirspacePropertyType> getElementAirspaceElement() {
        return elementAirspaceElement;
    }

    /**
     * Sets the value of the elementAirspaceElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setElementAirspaceElement(JAXBElement<AirspacePropertyType> value) {
        this.elementAirspaceElement = value;
    }

    @Transient
    public boolean isSetElementAirspaceElement() {
        return (this.elementAirspaceElement!= null);
    }

    /**
     * Gets the value of the elementAirportHeliportElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getElementAirportHeliportElement() {
        return elementAirportHeliportElement;
    }

    /**
     * Sets the value of the elementAirportHeliportElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setElementAirportHeliportElement(JAXBElement<AirportHeliportPropertyType> value) {
        this.elementAirportHeliportElement = value;
    }

    @Transient
    public boolean isSetElementAirportHeliportElement() {
        return (this.elementAirportHeliportElement!= null);
    }

    /**
     * Gets the value of the elementAerialRefuellingElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AerialRefuellingPropertyType> getElementAerialRefuellingElement() {
        return elementAerialRefuellingElement;
    }

    /**
     * Sets the value of the elementAerialRefuellingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setElementAerialRefuellingElement(JAXBElement<AerialRefuellingPropertyType> value) {
        this.elementAerialRefuellingElement = value;
    }

    @Transient
    public boolean isSetElementAerialRefuellingElement() {
        return (this.elementAerialRefuellingElement!= null);
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
    @JoinTable(name = "annotation_flightroutingelement_link", schema = "route", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "flightroutingelementpropertygroup", referencedColumnName = "hjid")
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
     * {@link FlightRoutingElementTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FlightRoutingElementTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_FLIGHT_ROUTING_ELE_0")
    public List<FlightRoutingElementTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FlightRoutingElementTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "ordernumber")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "ordernumber_nilreason"))
    })
    public NoSequenceType getOrderNumberItem() {
        return XmlAdapterUtils.unmarshallSource(NoSequenceType.class, this.getOrderNumber());
    }

    public void setOrderNumberItem(NoSequenceType target) {
        setOrderNumber(XmlAdapterUtils.marshallJAXBElement(NoSequenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "orderNumber"), FlightRoutingElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speed")),
        @AttributeOverride(name = "uom", column = @Column(name = "speed_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speed_nilreason"))
    })
    public ValSpeedType getSpeedItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeed());
    }

    public void setSpeedItem(ValSpeedType target) {
        setSpeed(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speed"), FlightRoutingElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedreference_nilreason"))
    })
    public CodeSpeedReferenceType getSpeedReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpeedReferenceType.class, this.getSpeedReference());
    }

    public void setSpeedReferenceItem(CodeSpeedReferenceType target) {
        setSpeedReference(XmlAdapterUtils.marshallJAXBElement(CodeSpeedReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedReference"), FlightRoutingElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedcriteria")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedcriteria_nilreason"))
    })
    public CodeComparisonType getSpeedCriteriaItem() {
        return XmlAdapterUtils.unmarshallSource(CodeComparisonType.class, this.getSpeedCriteria());
    }

    public void setSpeedCriteriaItem(CodeComparisonType target) {
        setSpeedCriteria(XmlAdapterUtils.marshallJAXBElement(CodeComparisonType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedCriteria"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = DirectFlightSegmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_directflightelement_id", referencedColumnName = "hjid")
    public DirectFlightSegmentPropertyType getElementDirectFlightElementItem() {
        return XmlAdapterUtils.unmarshallSource(DirectFlightSegmentPropertyType.class, this.getElementDirectFlightElement());
    }

    public void setElementDirectFlightElementItem(DirectFlightSegmentPropertyType target) {
        setElementDirectFlightElement(XmlAdapterUtils.marshallJAXBElement(DirectFlightSegmentPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_directFlightElement"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = RoutePortionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_routeportionelement_id", referencedColumnName = "hjid")
    public RoutePortionPropertyType getElementRoutePortionElementItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePortionPropertyType.class, this.getElementRoutePortionElement());
    }

    public void setElementRoutePortionElementItem(RoutePortionPropertyType target) {
        setElementRoutePortionElement(XmlAdapterUtils.marshallJAXBElement(RoutePortionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_routePortionElement"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = StandardInstrumentDeparturePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_standardinstrumentdepartureelement_id", referencedColumnName = "hjid")
    public StandardInstrumentDeparturePropertyType getElementStandardInstrumentDepartureElementItem() {
        return XmlAdapterUtils.unmarshallSource(StandardInstrumentDeparturePropertyType.class, this.getElementStandardInstrumentDepartureElement());
    }

    public void setElementStandardInstrumentDepartureElementItem(StandardInstrumentDeparturePropertyType target) {
        setElementStandardInstrumentDepartureElement(XmlAdapterUtils.marshallJAXBElement(StandardInstrumentDeparturePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_standardInstrumentDepartureElement"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = StandardInstrumentArrivalPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_standardinstrumentarrivalelement_id", referencedColumnName = "hjid")
    public StandardInstrumentArrivalPropertyType getElementStandardInstrumentArrivalElementItem() {
        return XmlAdapterUtils.unmarshallSource(StandardInstrumentArrivalPropertyType.class, this.getElementStandardInstrumentArrivalElement());
    }

    public void setElementStandardInstrumentArrivalElementItem(StandardInstrumentArrivalPropertyType target) {
        setElementStandardInstrumentArrivalElement(XmlAdapterUtils.marshallJAXBElement(StandardInstrumentArrivalPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_standardInstrumentArrivalElement"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointelement_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getPointElementFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getPointElementFixDesignatedPoint());
    }

    public void setPointElementFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setPointElementFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointElement_fixDesignatedPoint"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointelement_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getPointElementNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getPointElementNavaidSystem());
    }

    public void setPointElementNavaidSystemItem(NavaidPropertyType target) {
        setPointElementNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointElement_navaidSystem"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointelement_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getPointElementPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getPointElementPosition());
    }

    public void setPointElementPositionItem(AIXMPointPropertyType target) {
        setPointElementPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointElement_position"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointelement_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getPointElementRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getPointElementRunwayPoint());
    }

    public void setPointElementRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setPointElementRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointElement_runwayPoint"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointelement_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getPointElementAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getPointElementAimingPoint());
    }

    public void setPointElementAimingPointItem(TouchDownLiftOffPropertyType target) {
        setPointElementAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointElement_aimingPoint"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointelement_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getPointElementAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getPointElementAirportReferencePoint());
    }

    public void setPointElementAirportReferencePointItem(AirportHeliportPropertyType target) {
        setPointElementAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointElement_airportReferencePoint"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = AirspacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_airspaceelement_id", referencedColumnName = "hjid")
    public AirspacePropertyType getElementAirspaceElementItem() {
        return XmlAdapterUtils.unmarshallSource(AirspacePropertyType.class, this.getElementAirspaceElement());
    }

    public void setElementAirspaceElementItem(AirspacePropertyType target) {
        setElementAirspaceElement(XmlAdapterUtils.marshallJAXBElement(AirspacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_airspaceElement"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_airportheliportelement_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getElementAirportHeliportElementItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getElementAirportHeliportElement());
    }

    public void setElementAirportHeliportElementItem(AirportHeliportPropertyType target) {
        setElementAirportHeliportElement(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_airportHeliportElement"), FlightRoutingElementType.class, target));
    }

    @ManyToOne(targetEntity = AerialRefuellingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_aerialrefuellingelement_id", referencedColumnName = "hjid")
    public AerialRefuellingPropertyType getElementAerialRefuellingElementItem() {
        return XmlAdapterUtils.unmarshallSource(AerialRefuellingPropertyType.class, this.getElementAerialRefuellingElement());
    }

    public void setElementAerialRefuellingElementItem(AerialRefuellingPropertyType target) {
        setElementAerialRefuellingElement(XmlAdapterUtils.marshallJAXBElement(AerialRefuellingPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "element_aerialRefuellingElement"), FlightRoutingElementType.class, target));
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
        final FlightRoutingElementType that = ((FlightRoutingElementType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FlightRoutingElementTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FlightRoutingElementTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedReference();
            boolean rhsFieldIsSet = that.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> lhsField;
            lhsField = this.getSpeedReference();
            JAXBElement<CodeSpeedReferenceType> rhsField;
            rhsField = that.getSpeedReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeed();
            boolean rhsFieldIsSet = that.isSetSpeed();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getSpeed();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getSpeed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointElementNavaidSystem();
            boolean rhsFieldIsSet = that.isSetPointElementNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getPointElementNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getPointElementNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointElementNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointElementNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElementAirportHeliportElement();
            boolean rhsFieldIsSet = that.isSetElementAirportHeliportElement();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getElementAirportHeliportElement();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getElementAirportHeliportElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementAirportHeliportElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementAirportHeliportElement", rhsField);
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
            boolean lhsFieldIsSet = this.isSetElementRoutePortionElement();
            boolean rhsFieldIsSet = that.isSetElementRoutePortionElement();
            JAXBElement<RoutePortionPropertyType> lhsField;
            lhsField = this.getElementRoutePortionElement();
            JAXBElement<RoutePortionPropertyType> rhsField;
            rhsField = that.getElementRoutePortionElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementRoutePortionElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementRoutePortionElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElementStandardInstrumentArrivalElement();
            boolean rhsFieldIsSet = that.isSetElementStandardInstrumentArrivalElement();
            JAXBElement<StandardInstrumentArrivalPropertyType> lhsField;
            lhsField = this.getElementStandardInstrumentArrivalElement();
            JAXBElement<StandardInstrumentArrivalPropertyType> rhsField;
            rhsField = that.getElementStandardInstrumentArrivalElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementStandardInstrumentArrivalElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementStandardInstrumentArrivalElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointElementAimingPoint();
            boolean rhsFieldIsSet = that.isSetPointElementAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getPointElementAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getPointElementAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointElementAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointElementAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElementStandardInstrumentDepartureElement();
            boolean rhsFieldIsSet = that.isSetElementStandardInstrumentDepartureElement();
            JAXBElement<StandardInstrumentDeparturePropertyType> lhsField;
            lhsField = this.getElementStandardInstrumentDepartureElement();
            JAXBElement<StandardInstrumentDeparturePropertyType> rhsField;
            rhsField = that.getElementStandardInstrumentDepartureElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementStandardInstrumentDepartureElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementStandardInstrumentDepartureElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointElementFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetPointElementFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getPointElementFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getPointElementFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointElementFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointElementFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointElementRunwayPoint();
            boolean rhsFieldIsSet = that.isSetPointElementRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getPointElementRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getPointElementRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointElementRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointElementRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointElementPosition();
            boolean rhsFieldIsSet = that.isSetPointElementPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getPointElementPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getPointElementPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointElementPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointElementPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointElementAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetPointElementAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getPointElementAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getPointElementAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointElementAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointElementAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElementAerialRefuellingElement();
            boolean rhsFieldIsSet = that.isSetElementAerialRefuellingElement();
            JAXBElement<AerialRefuellingPropertyType> lhsField;
            lhsField = this.getElementAerialRefuellingElement();
            JAXBElement<AerialRefuellingPropertyType> rhsField;
            rhsField = that.getElementAerialRefuellingElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementAerialRefuellingElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementAerialRefuellingElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOrderNumber();
            boolean rhsFieldIsSet = that.isSetOrderNumber();
            JAXBElement<NoSequenceType> lhsField;
            lhsField = this.getOrderNumber();
            JAXBElement<NoSequenceType> rhsField;
            rhsField = that.getOrderNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "orderNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "orderNumber", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedCriteria();
            boolean rhsFieldIsSet = that.isSetSpeedCriteria();
            JAXBElement<CodeComparisonType> lhsField;
            lhsField = this.getSpeedCriteria();
            JAXBElement<CodeComparisonType> rhsField;
            rhsField = that.getSpeedCriteria();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedCriteria", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedCriteria", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElementDirectFlightElement();
            boolean rhsFieldIsSet = that.isSetElementDirectFlightElement();
            JAXBElement<DirectFlightSegmentPropertyType> lhsField;
            lhsField = this.getElementDirectFlightElement();
            JAXBElement<DirectFlightSegmentPropertyType> rhsField;
            rhsField = that.getElementDirectFlightElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementDirectFlightElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementDirectFlightElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElementAirspaceElement();
            boolean rhsFieldIsSet = that.isSetElementAirspaceElement();
            JAXBElement<AirspacePropertyType> lhsField;
            lhsField = this.getElementAirspaceElement();
            JAXBElement<AirspacePropertyType> rhsField;
            rhsField = that.getElementAirspaceElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elementAirspaceElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elementAirspaceElement", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetOrderNumber();
            JAXBElement<NoSequenceType> theField;
            theField = this.getOrderNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "orderNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speed", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> theField;
            theField = this.getSpeedReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedCriteria();
            JAXBElement<CodeComparisonType> theField;
            theField = this.getSpeedCriteria();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedCriteria", theField);
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
            boolean theFieldIsSet = this.isSetElementDirectFlightElement();
            JAXBElement<DirectFlightSegmentPropertyType> theField;
            theField = this.getElementDirectFlightElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementDirectFlightElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementRoutePortionElement();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getElementRoutePortionElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementRoutePortionElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementStandardInstrumentDepartureElement();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getElementStandardInstrumentDepartureElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementStandardInstrumentDepartureElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementStandardInstrumentArrivalElement();
            JAXBElement<StandardInstrumentArrivalPropertyType> theField;
            theField = this.getElementStandardInstrumentArrivalElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementStandardInstrumentArrivalElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getPointElementFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointElementFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getPointElementNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointElementNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getPointElementPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointElementPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getPointElementRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointElementRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getPointElementAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointElementAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getPointElementAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointElementAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementAirspaceElement();
            JAXBElement<AirspacePropertyType> theField;
            theField = this.getElementAirspaceElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementAirspaceElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementAirportHeliportElement();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getElementAirportHeliportElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementAirportHeliportElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementAerialRefuellingElement();
            JAXBElement<AerialRefuellingPropertyType> theField;
            theField = this.getElementAerialRefuellingElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elementAerialRefuellingElement", theField);
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
            List<FlightRoutingElementTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetOrderNumber();
            JAXBElement<NoSequenceType> theField;
            theField = this.getOrderNumber();
            strategy.appendField(locator, this, "orderNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> theField;
            theField = this.getSpeedReference();
            strategy.appendField(locator, this, "speedReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedCriteria();
            JAXBElement<CodeComparisonType> theField;
            theField = this.getSpeedCriteria();
            strategy.appendField(locator, this, "speedCriteria", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightLevel();
            List<FlightRestrictionLevelPropertyType> theField;
            theField = (this.isSetFlightLevel()?this.getFlightLevel():null);
            strategy.appendField(locator, this, "flightLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementDirectFlightElement();
            JAXBElement<DirectFlightSegmentPropertyType> theField;
            theField = this.getElementDirectFlightElement();
            strategy.appendField(locator, this, "elementDirectFlightElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementRoutePortionElement();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getElementRoutePortionElement();
            strategy.appendField(locator, this, "elementRoutePortionElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementStandardInstrumentDepartureElement();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getElementStandardInstrumentDepartureElement();
            strategy.appendField(locator, this, "elementStandardInstrumentDepartureElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementStandardInstrumentArrivalElement();
            JAXBElement<StandardInstrumentArrivalPropertyType> theField;
            theField = this.getElementStandardInstrumentArrivalElement();
            strategy.appendField(locator, this, "elementStandardInstrumentArrivalElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getPointElementFixDesignatedPoint();
            strategy.appendField(locator, this, "pointElementFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getPointElementNavaidSystem();
            strategy.appendField(locator, this, "pointElementNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getPointElementPosition();
            strategy.appendField(locator, this, "pointElementPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getPointElementRunwayPoint();
            strategy.appendField(locator, this, "pointElementRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getPointElementAimingPoint();
            strategy.appendField(locator, this, "pointElementAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointElementAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getPointElementAirportReferencePoint();
            strategy.appendField(locator, this, "pointElementAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementAirspaceElement();
            JAXBElement<AirspacePropertyType> theField;
            theField = this.getElementAirspaceElement();
            strategy.appendField(locator, this, "elementAirspaceElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementAirportHeliportElement();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getElementAirportHeliportElement();
            strategy.appendField(locator, this, "elementAirportHeliportElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElementAerialRefuellingElement();
            JAXBElement<AerialRefuellingPropertyType> theField;
            theField = this.getElementAerialRefuellingElement();
            strategy.appendField(locator, this, "elementAerialRefuellingElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightRoutingElementTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
