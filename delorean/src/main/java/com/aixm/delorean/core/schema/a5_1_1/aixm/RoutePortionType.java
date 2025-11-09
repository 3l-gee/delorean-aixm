
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
 * <p>Java class for RoutePortionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoutePortionType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RoutePortionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRoutePortionExtension"/>
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
@XmlType(name = "RoutePortionType", propOrder = {
    "startFixDesignatedPoint",
    "startNavaidSystem",
    "startPosition",
    "startRunwayPoint",
    "startAimingPoint",
    "startAirportReferencePoint",
    "intermediatePointFixDesignatedPoint",
    "intermediatePointNavaidSystem",
    "intermediatePointPosition",
    "intermediatePointRunwayPoint",
    "intermediatePointAimingPoint",
    "intermediatePointAirportReferencePoint",
    "referencedRoute",
    "endFixDesignatedPoint",
    "endNavaidSystem",
    "endPosition",
    "endRunwayPoint",
    "endAimingPoint",
    "endAirportReferencePoint",
    "annotation",
    "extension"
})
@Entity(name = "RoutePortionType")
@Table(name = "routeportion", schema = "route")
public class RoutePortionType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "start_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> startFixDesignatedPoint;
    @XmlElementRef(name = "start_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> startNavaidSystem;
    @XmlElementRef(name = "start_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> startPosition;
    @XmlElementRef(name = "start_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> startRunwayPoint;
    @XmlElementRef(name = "start_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> startAimingPoint;
    @XmlElementRef(name = "start_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> startAirportReferencePoint;
    @XmlElementRef(name = "intermediatePoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> intermediatePointFixDesignatedPoint;
    @XmlElementRef(name = "intermediatePoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> intermediatePointNavaidSystem;
    @XmlElementRef(name = "intermediatePoint_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> intermediatePointPosition;
    @XmlElementRef(name = "intermediatePoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> intermediatePointRunwayPoint;
    @XmlElementRef(name = "intermediatePoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> intermediatePointAimingPoint;
    @XmlElementRef(name = "intermediatePoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> intermediatePointAirportReferencePoint;
    @XmlElementRef(name = "referencedRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> referencedRoute;
    @XmlElementRef(name = "end_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> endFixDesignatedPoint;
    @XmlElementRef(name = "end_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> endNavaidSystem;
    @XmlElementRef(name = "end_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> endPosition;
    @XmlElementRef(name = "end_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> endRunwayPoint;
    @XmlElementRef(name = "end_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> endAimingPoint;
    @XmlElementRef(name = "end_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> endAirportReferencePoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RoutePortionTypeExtensionType> extension;

    /**
     * Gets the value of the startFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getStartFixDesignatedPoint() {
        return startFixDesignatedPoint;
    }

    /**
     * Sets the value of the startFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setStartFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.startFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetStartFixDesignatedPoint() {
        return (this.startFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the startNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getStartNavaidSystem() {
        return startNavaidSystem;
    }

    /**
     * Sets the value of the startNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setStartNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.startNavaidSystem = value;
    }

    @Transient
    public boolean isSetStartNavaidSystem() {
        return (this.startNavaidSystem!= null);
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setStartPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.startPosition = value;
    }

    @Transient
    public boolean isSetStartPosition() {
        return (this.startPosition!= null);
    }

    /**
     * Gets the value of the startRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getStartRunwayPoint() {
        return startRunwayPoint;
    }

    /**
     * Sets the value of the startRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setStartRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.startRunwayPoint = value;
    }

    @Transient
    public boolean isSetStartRunwayPoint() {
        return (this.startRunwayPoint!= null);
    }

    /**
     * Gets the value of the startAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getStartAimingPoint() {
        return startAimingPoint;
    }

    /**
     * Sets the value of the startAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setStartAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.startAimingPoint = value;
    }

    @Transient
    public boolean isSetStartAimingPoint() {
        return (this.startAimingPoint!= null);
    }

    /**
     * Gets the value of the startAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getStartAirportReferencePoint() {
        return startAirportReferencePoint;
    }

    /**
     * Sets the value of the startAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setStartAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.startAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetStartAirportReferencePoint() {
        return (this.startAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the intermediatePointFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getIntermediatePointFixDesignatedPoint() {
        return intermediatePointFixDesignatedPoint;
    }

    /**
     * Sets the value of the intermediatePointFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.intermediatePointFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetIntermediatePointFixDesignatedPoint() {
        return (this.intermediatePointFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the intermediatePointNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getIntermediatePointNavaidSystem() {
        return intermediatePointNavaidSystem;
    }

    /**
     * Sets the value of the intermediatePointNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.intermediatePointNavaidSystem = value;
    }

    @Transient
    public boolean isSetIntermediatePointNavaidSystem() {
        return (this.intermediatePointNavaidSystem!= null);
    }

    /**
     * Gets the value of the intermediatePointPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getIntermediatePointPosition() {
        return intermediatePointPosition;
    }

    /**
     * Sets the value of the intermediatePointPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.intermediatePointPosition = value;
    }

    @Transient
    public boolean isSetIntermediatePointPosition() {
        return (this.intermediatePointPosition!= null);
    }

    /**
     * Gets the value of the intermediatePointRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getIntermediatePointRunwayPoint() {
        return intermediatePointRunwayPoint;
    }

    /**
     * Sets the value of the intermediatePointRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.intermediatePointRunwayPoint = value;
    }

    @Transient
    public boolean isSetIntermediatePointRunwayPoint() {
        return (this.intermediatePointRunwayPoint!= null);
    }

    /**
     * Gets the value of the intermediatePointAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getIntermediatePointAimingPoint() {
        return intermediatePointAimingPoint;
    }

    /**
     * Sets the value of the intermediatePointAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.intermediatePointAimingPoint = value;
    }

    @Transient
    public boolean isSetIntermediatePointAimingPoint() {
        return (this.intermediatePointAimingPoint!= null);
    }

    /**
     * Gets the value of the intermediatePointAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getIntermediatePointAirportReferencePoint() {
        return intermediatePointAirportReferencePoint;
    }

    /**
     * Sets the value of the intermediatePointAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.intermediatePointAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetIntermediatePointAirportReferencePoint() {
        return (this.intermediatePointAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the referencedRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePropertyType> getReferencedRoute() {
        return referencedRoute;
    }

    /**
     * Sets the value of the referencedRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setReferencedRoute(JAXBElement<RoutePropertyType> value) {
        this.referencedRoute = value;
    }

    @Transient
    public boolean isSetReferencedRoute() {
        return (this.referencedRoute!= null);
    }

    /**
     * Gets the value of the endFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getEndFixDesignatedPoint() {
        return endFixDesignatedPoint;
    }

    /**
     * Sets the value of the endFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setEndFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.endFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetEndFixDesignatedPoint() {
        return (this.endFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the endNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getEndNavaidSystem() {
        return endNavaidSystem;
    }

    /**
     * Sets the value of the endNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setEndNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.endNavaidSystem = value;
    }

    @Transient
    public boolean isSetEndNavaidSystem() {
        return (this.endNavaidSystem!= null);
    }

    /**
     * Gets the value of the endPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setEndPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.endPosition = value;
    }

    @Transient
    public boolean isSetEndPosition() {
        return (this.endPosition!= null);
    }

    /**
     * Gets the value of the endRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getEndRunwayPoint() {
        return endRunwayPoint;
    }

    /**
     * Sets the value of the endRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setEndRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.endRunwayPoint = value;
    }

    @Transient
    public boolean isSetEndRunwayPoint() {
        return (this.endRunwayPoint!= null);
    }

    /**
     * Gets the value of the endAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getEndAimingPoint() {
        return endAimingPoint;
    }

    /**
     * Sets the value of the endAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setEndAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.endAimingPoint = value;
    }

    @Transient
    public boolean isSetEndAimingPoint() {
        return (this.endAimingPoint!= null);
    }

    /**
     * Gets the value of the endAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getEndAirportReferencePoint() {
        return endAirportReferencePoint;
    }

    /**
     * Sets the value of the endAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setEndAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.endAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetEndAirportReferencePoint() {
        return (this.endAirportReferencePoint!= null);
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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
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
     * {@link RoutePortionTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RoutePortionTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_ROUTE_PORTION_TYPE_0")
    public List<RoutePortionTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RoutePortionTypeExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getStartFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getStartFixDesignatedPoint());
    }

    public void setStartFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setStartFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start_fixDesignatedPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getStartNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getStartNavaidSystem());
    }

    public void setStartNavaidSystemItem(NavaidPropertyType target) {
        setStartNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start_navaidSystem"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getStartPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getStartPosition());
    }

    public void setStartPositionItem(AIXMPointPropertyType target) {
        setStartPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start_position"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getStartRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getStartRunwayPoint());
    }

    public void setStartRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setStartRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start_runwayPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getStartAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getStartAimingPoint());
    }

    public void setStartAimingPointItem(TouchDownLiftOffPropertyType target) {
        setStartAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start_aimingPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getStartAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getStartAirportReferencePoint());
    }

    public void setStartAirportReferencePointItem(AirportHeliportPropertyType target) {
        setStartAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start_airportReferencePoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "intermediatepoint_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getIntermediatePointFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getIntermediatePointFixDesignatedPoint());
    }

    public void setIntermediatePointFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setIntermediatePointFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intermediatePoint_fixDesignatedPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "intermediatepoint_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getIntermediatePointNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getIntermediatePointNavaidSystem());
    }

    public void setIntermediatePointNavaidSystemItem(NavaidPropertyType target) {
        setIntermediatePointNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intermediatePoint_navaidSystem"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "intermediatepoint_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getIntermediatePointPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getIntermediatePointPosition());
    }

    public void setIntermediatePointPositionItem(AIXMPointPropertyType target) {
        setIntermediatePointPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intermediatePoint_position"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "intermediatepoint_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getIntermediatePointRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getIntermediatePointRunwayPoint());
    }

    public void setIntermediatePointRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setIntermediatePointRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intermediatePoint_runwayPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "intermediatepoint_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getIntermediatePointAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getIntermediatePointAimingPoint());
    }

    public void setIntermediatePointAimingPointItem(TouchDownLiftOffPropertyType target) {
        setIntermediatePointAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intermediatePoint_aimingPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "intermediatepoint_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getIntermediatePointAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getIntermediatePointAirportReferencePoint());
    }

    public void setIntermediatePointAirportReferencePointItem(AirportHeliportPropertyType target) {
        setIntermediatePointAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intermediatePoint_airportReferencePoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = RoutePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "referencedroute_id", referencedColumnName = "hjid")
    public RoutePropertyType getReferencedRouteItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePropertyType.class, this.getReferencedRoute());
    }

    public void setReferencedRouteItem(RoutePropertyType target) {
        setReferencedRoute(XmlAdapterUtils.marshallJAXBElement(RoutePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "referencedRoute"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getEndFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getEndFixDesignatedPoint());
    }

    public void setEndFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setEndFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end_fixDesignatedPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getEndNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getEndNavaidSystem());
    }

    public void setEndNavaidSystemItem(NavaidPropertyType target) {
        setEndNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end_navaidSystem"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getEndPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getEndPosition());
    }

    public void setEndPositionItem(AIXMPointPropertyType target) {
        setEndPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end_position"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getEndRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getEndRunwayPoint());
    }

    public void setEndRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setEndRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end_runwayPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getEndAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getEndAimingPoint());
    }

    public void setEndAimingPointItem(TouchDownLiftOffPropertyType target) {
        setEndAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end_aimingPoint"), RoutePortionType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getEndAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getEndAirportReferencePoint());
    }

    public void setEndAirportReferencePointItem(AirportHeliportPropertyType target) {
        setEndAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end_airportReferencePoint"), RoutePortionType.class, target));
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
        final RoutePortionType that = ((RoutePortionType) object);
        {
            boolean lhsFieldIsSet = this.isSetStartAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetStartAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getStartAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getStartAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startAirportReferencePoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetStartRunwayPoint();
            boolean rhsFieldIsSet = that.isSetStartRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getStartRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getStartRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndAimingPoint();
            boolean rhsFieldIsSet = that.isSetEndAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getEndAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getEndAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntermediatePointAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetIntermediatePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getIntermediatePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getIntermediatePointAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intermediatePointAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intermediatePointAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntermediatePointFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetIntermediatePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getIntermediatePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getIntermediatePointFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intermediatePointFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intermediatePointFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetEndFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getEndFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getEndFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntermediatePointAimingPoint();
            boolean rhsFieldIsSet = that.isSetIntermediatePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getIntermediatePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getIntermediatePointAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intermediatePointAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intermediatePointAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndRunwayPoint();
            boolean rhsFieldIsSet = that.isSetEndRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getEndRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getEndRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndNavaidSystem();
            boolean rhsFieldIsSet = that.isSetEndNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getEndNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getEndNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetStartFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getStartFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getStartFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RoutePortionTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RoutePortionTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntermediatePointRunwayPoint();
            boolean rhsFieldIsSet = that.isSetIntermediatePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getIntermediatePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getIntermediatePointRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intermediatePointRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intermediatePointRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndPosition();
            boolean rhsFieldIsSet = that.isSetEndPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getEndPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getEndPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartPosition();
            boolean rhsFieldIsSet = that.isSetStartPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getStartPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getStartPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntermediatePointPosition();
            boolean rhsFieldIsSet = that.isSetIntermediatePointPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getIntermediatePointPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getIntermediatePointPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intermediatePointPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intermediatePointPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartAimingPoint();
            boolean rhsFieldIsSet = that.isSetStartAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getStartAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getStartAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntermediatePointNavaidSystem();
            boolean rhsFieldIsSet = that.isSetIntermediatePointNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getIntermediatePointNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getIntermediatePointNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intermediatePointNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intermediatePointNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferencedRoute();
            boolean rhsFieldIsSet = that.isSetReferencedRoute();
            JAXBElement<RoutePropertyType> lhsField;
            lhsField = this.getReferencedRoute();
            JAXBElement<RoutePropertyType> rhsField;
            rhsField = that.getReferencedRoute();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referencedRoute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referencedRoute", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartNavaidSystem();
            boolean rhsFieldIsSet = that.isSetStartNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getStartNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getStartNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetEndAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getEndAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getEndAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endAirportReferencePoint", rhsField);
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
            boolean theFieldIsSet = this.isSetStartFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getStartFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getStartNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getStartPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getStartRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getStartAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getStartAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getIntermediatePointFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intermediatePointFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getIntermediatePointNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intermediatePointNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getIntermediatePointPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intermediatePointPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getIntermediatePointRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intermediatePointRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getIntermediatePointAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intermediatePointAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getIntermediatePointAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intermediatePointAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencedRoute();
            JAXBElement<RoutePropertyType> theField;
            theField = this.getReferencedRoute();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referencedRoute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getEndFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getEndNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getEndPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getEndRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getEndAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getEndAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endAirportReferencePoint", theField);
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
            List<RoutePortionTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetStartFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getStartFixDesignatedPoint();
            strategy.appendField(locator, this, "startFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getStartNavaidSystem();
            strategy.appendField(locator, this, "startNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getStartPosition();
            strategy.appendField(locator, this, "startPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getStartRunwayPoint();
            strategy.appendField(locator, this, "startRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getStartAimingPoint();
            strategy.appendField(locator, this, "startAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getStartAirportReferencePoint();
            strategy.appendField(locator, this, "startAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getIntermediatePointFixDesignatedPoint();
            strategy.appendField(locator, this, "intermediatePointFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getIntermediatePointNavaidSystem();
            strategy.appendField(locator, this, "intermediatePointNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getIntermediatePointPosition();
            strategy.appendField(locator, this, "intermediatePointPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getIntermediatePointRunwayPoint();
            strategy.appendField(locator, this, "intermediatePointRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getIntermediatePointAimingPoint();
            strategy.appendField(locator, this, "intermediatePointAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntermediatePointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getIntermediatePointAirportReferencePoint();
            strategy.appendField(locator, this, "intermediatePointAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencedRoute();
            JAXBElement<RoutePropertyType> theField;
            theField = this.getReferencedRoute();
            strategy.appendField(locator, this, "referencedRoute", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getEndFixDesignatedPoint();
            strategy.appendField(locator, this, "endFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getEndNavaidSystem();
            strategy.appendField(locator, this, "endNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getEndPosition();
            strategy.appendField(locator, this, "endPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getEndRunwayPoint();
            strategy.appendField(locator, this, "endRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getEndAimingPoint();
            strategy.appendField(locator, this, "endAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getEndAirportReferencePoint();
            strategy.appendField(locator, this, "endAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RoutePortionTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
