
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
 * <p>Java class for ChangeOverPointTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ChangeOverPointTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ChangeOverPointPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractChangeOverPointExtension"/>
 *                 </sequence>
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
@XmlType(name = "ChangeOverPointTimeSliceType", propOrder = {
    "distance",
    "locationFixDesignatedPoint",
    "locationNavaidSystem",
    "locationPosition",
    "locationRunwayPoint",
    "locationAimingPoint",
    "locationAirportReferencePoint",
    "applicableRoutePortion",
    "annotation",
    "extension"
})
@Entity(name = "ChangeOverPointTimeSliceType")
@Table(name = "changeoverpoint_ts", schema = "route")
public class ChangeOverPointTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElementRef(name = "location_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> locationFixDesignatedPoint;
    @XmlElementRef(name = "location_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> locationNavaidSystem;
    @XmlElementRef(name = "location_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> locationPosition;
    @XmlElementRef(name = "location_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> locationRunwayPoint;
    @XmlElementRef(name = "location_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> locationAimingPoint;
    @XmlElementRef(name = "location_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> locationAirportReferencePoint;
    @XmlElementRef(name = "applicableRoutePortion", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> applicableRoutePortion;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ChangeOverPointExtensionType> extension;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setDistance(JAXBElement<ValDistanceType> value) {
        this.distance = value;
    }

    @Transient
    public boolean isSetDistance() {
        return (this.distance!= null);
    }

    /**
     * Gets the value of the locationFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getLocationFixDesignatedPoint() {
        return locationFixDesignatedPoint;
    }

    /**
     * Sets the value of the locationFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setLocationFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.locationFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetLocationFixDesignatedPoint() {
        return (this.locationFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the locationNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getLocationNavaidSystem() {
        return locationNavaidSystem;
    }

    /**
     * Sets the value of the locationNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setLocationNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.locationNavaidSystem = value;
    }

    @Transient
    public boolean isSetLocationNavaidSystem() {
        return (this.locationNavaidSystem!= null);
    }

    /**
     * Gets the value of the locationPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getLocationPosition() {
        return locationPosition;
    }

    /**
     * Sets the value of the locationPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setLocationPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.locationPosition = value;
    }

    @Transient
    public boolean isSetLocationPosition() {
        return (this.locationPosition!= null);
    }

    /**
     * Gets the value of the locationRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getLocationRunwayPoint() {
        return locationRunwayPoint;
    }

    /**
     * Sets the value of the locationRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setLocationRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.locationRunwayPoint = value;
    }

    @Transient
    public boolean isSetLocationRunwayPoint() {
        return (this.locationRunwayPoint!= null);
    }

    /**
     * Gets the value of the locationAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getLocationAimingPoint() {
        return locationAimingPoint;
    }

    /**
     * Sets the value of the locationAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setLocationAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.locationAimingPoint = value;
    }

    @Transient
    public boolean isSetLocationAimingPoint() {
        return (this.locationAimingPoint!= null);
    }

    /**
     * Gets the value of the locationAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getLocationAirportReferencePoint() {
        return locationAirportReferencePoint;
    }

    /**
     * Sets the value of the locationAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setLocationAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.locationAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetLocationAirportReferencePoint() {
        return (this.locationAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the applicableRoutePortion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePortionPropertyType> getApplicableRoutePortion() {
        return applicableRoutePortion;
    }

    /**
     * Sets the value of the applicableRoutePortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setApplicableRoutePortion(JAXBElement<RoutePortionPropertyType> value) {
        this.applicableRoutePortion = value;
    }

    @Transient
    public boolean isSetApplicableRoutePortion() {
        return (this.applicableRoutePortion!= null);
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
    @JoinTable(name = "annotation_changeoverpoint_link", schema = "route", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "changeoverpointpropertygroup", referencedColumnName = "hjid")
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
     * {@link ChangeOverPointExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ChangeOverPointExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_CHANGE_OVER_POINT__0")
    public List<ChangeOverPointExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ChangeOverPointExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "distance")),
        @AttributeOverride(name = "uom", column = @Column(name = "distance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "distance_nilreason"))
    })
    public ValDistanceType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getDistance());
    }

    public void setDistanceItem(ValDistanceType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "distance"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getLocationFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getLocationFixDesignatedPoint());
    }

    public void setLocationFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setLocationFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_fixDesignatedPoint"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getLocationNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getLocationNavaidSystem());
    }

    public void setLocationNavaidSystemItem(NavaidPropertyType target) {
        setLocationNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_navaidSystem"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getLocationPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getLocationPosition());
    }

    public void setLocationPositionItem(AIXMPointPropertyType target) {
        setLocationPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_position"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getLocationRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getLocationRunwayPoint());
    }

    public void setLocationRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setLocationRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_runwayPoint"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getLocationAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getLocationAimingPoint());
    }

    public void setLocationAimingPointItem(TouchDownLiftOffPropertyType target) {
        setLocationAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_aimingPoint"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getLocationAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getLocationAirportReferencePoint());
    }

    public void setLocationAirportReferencePointItem(AirportHeliportPropertyType target) {
        setLocationAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_airportReferencePoint"), ChangeOverPointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RoutePortionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "applicablerouteportion_id", referencedColumnName = "hjid")
    public RoutePortionPropertyType getApplicableRoutePortionItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePortionPropertyType.class, this.getApplicableRoutePortion());
    }

    public void setApplicableRoutePortionItem(RoutePortionPropertyType target) {
        setApplicableRoutePortion(XmlAdapterUtils.marshallJAXBElement(RoutePortionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "applicableRoutePortion"), ChangeOverPointTimeSliceType.class, target));
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
        final ChangeOverPointTimeSliceType that = ((ChangeOverPointTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetLocationNavaidSystem();
            boolean rhsFieldIsSet = that.isSetLocationNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getLocationNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getLocationNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationAimingPoint();
            boolean rhsFieldIsSet = that.isSetLocationAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getLocationAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getLocationAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationAimingPoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetLocationFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetLocationFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getLocationFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getLocationFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetLocationAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getLocationAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getLocationAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationRunwayPoint();
            boolean rhsFieldIsSet = that.isSetLocationRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getLocationRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getLocationRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationPosition();
            boolean rhsFieldIsSet = that.isSetLocationPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getLocationPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getLocationPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApplicableRoutePortion();
            boolean rhsFieldIsSet = that.isSetApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> lhsField;
            lhsField = this.getApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> rhsField;
            rhsField = that.getApplicableRoutePortion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "applicableRoutePortion", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "applicableRoutePortion", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ChangeOverPointExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ChangeOverPointExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getLocationFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getLocationNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getLocationPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getLocationRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getLocationAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getLocationAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getApplicableRoutePortion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "applicableRoutePortion", theField);
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
            List<ChangeOverPointExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getLocationFixDesignatedPoint();
            strategy.appendField(locator, this, "locationFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getLocationNavaidSystem();
            strategy.appendField(locator, this, "locationNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getLocationPosition();
            strategy.appendField(locator, this, "locationPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getLocationRunwayPoint();
            strategy.appendField(locator, this, "locationRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getLocationAimingPoint();
            strategy.appendField(locator, this, "locationAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getLocationAirportReferencePoint();
            strategy.appendField(locator, this, "locationAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getApplicableRoutePortion();
            strategy.appendField(locator, this, "applicableRoutePortion", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ChangeOverPointExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
