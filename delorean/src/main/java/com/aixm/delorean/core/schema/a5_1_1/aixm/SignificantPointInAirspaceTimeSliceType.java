
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
 * <p>Java class for SignificantPointInAirspaceTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SignificantPointInAirspaceTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}SignificantPointInAirspacePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSignificantPointInAirspaceExtension"/>
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
@XmlType(name = "SignificantPointInAirspaceTimeSliceType", propOrder = {
    "type",
    "relativeLocation",
    "containingAirspace",
    "locationFixDesignatedPoint",
    "locationNavaidSystem",
    "locationPosition",
    "locationRunwayPoint",
    "locationAimingPoint",
    "locationAirportReferencePoint",
    "annotation",
    "extension"
})
@Entity(name = "SignificantPointInAirspaceTimeSliceType")
@Table(name = "significantpointinairspace_ts", schema = "navaids_point")
public class SignificantPointInAirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspacePointRoleType> type;
    @XmlElementRef(name = "relativeLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspacePointPositionType> relativeLocation;
    @XmlElementRef(name = "containingAirspace", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> containingAirspace;
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
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SignificantPointInAirspaceExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointRoleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirspacePointRoleType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointRoleType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirspacePointRoleType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the relativeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointPositionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirspacePointPositionType> getRelativeLocation() {
        return relativeLocation;
    }

    /**
     * Sets the value of the relativeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointPositionType }{@code >}
     *     
     */
    public void setRelativeLocation(JAXBElement<CodeAirspacePointPositionType> value) {
        this.relativeLocation = value;
    }

    @Transient
    public boolean isSetRelativeLocation() {
        return (this.relativeLocation!= null);
    }

    /**
     * Gets the value of the containingAirspace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirspacePropertyType> getContainingAirspace() {
        return containingAirspace;
    }

    /**
     * Sets the value of the containingAirspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setContainingAirspace(JAXBElement<AirspacePropertyType> value) {
        this.containingAirspace = value;
    }

    @Transient
    public boolean isSetContainingAirspace() {
        return (this.containingAirspace!= null);
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
     * {@link SignificantPointInAirspaceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = SignificantPointInAirspaceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_SIGNIFICANT_POINT__0")
    public List<SignificantPointInAirspaceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<SignificantPointInAirspaceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeAirspacePointRoleType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirspacePointRoleType.class, this.getType());
    }

    public void setTypeItem(CodeAirspacePointRoleType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAirspacePointRoleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "relativelocation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "relativelocation_nilreason"))
    })
    public CodeAirspacePointPositionType getRelativeLocationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirspacePointPositionType.class, this.getRelativeLocation());
    }

    public void setRelativeLocationItem(CodeAirspacePointPositionType target) {
        setRelativeLocation(XmlAdapterUtils.marshallJAXBElement(CodeAirspacePointPositionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "relativeLocation"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirspacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "containingairspace_id", referencedColumnName = "hjid")
    public AirspacePropertyType getContainingAirspaceItem() {
        return XmlAdapterUtils.unmarshallSource(AirspacePropertyType.class, this.getContainingAirspace());
    }

    public void setContainingAirspaceItem(AirspacePropertyType target) {
        setContainingAirspace(XmlAdapterUtils.marshallJAXBElement(AirspacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "containingAirspace"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getLocationFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getLocationFixDesignatedPoint());
    }

    public void setLocationFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setLocationFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_fixDesignatedPoint"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getLocationNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getLocationNavaidSystem());
    }

    public void setLocationNavaidSystemItem(NavaidPropertyType target) {
        setLocationNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_navaidSystem"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getLocationPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getLocationPosition());
    }

    public void setLocationPositionItem(AIXMPointPropertyType target) {
        setLocationPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_position"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getLocationRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getLocationRunwayPoint());
    }

    public void setLocationRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setLocationRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_runwayPoint"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getLocationAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getLocationAimingPoint());
    }

    public void setLocationAimingPointItem(TouchDownLiftOffPropertyType target) {
        setLocationAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_aimingPoint"), SignificantPointInAirspaceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getLocationAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getLocationAirportReferencePoint());
    }

    public void setLocationAirportReferencePointItem(AirportHeliportPropertyType target) {
        setLocationAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location_airportReferencePoint"), SignificantPointInAirspaceTimeSliceType.class, target));
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
        final SignificantPointInAirspaceTimeSliceType that = ((SignificantPointInAirspaceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SignificantPointInAirspaceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<SignificantPointInAirspaceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAirspacePointRoleType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAirspacePointRoleType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
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
            boolean lhsFieldIsSet = this.isSetRelativeLocation();
            boolean rhsFieldIsSet = that.isSetRelativeLocation();
            JAXBElement<CodeAirspacePointPositionType> lhsField;
            lhsField = this.getRelativeLocation();
            JAXBElement<CodeAirspacePointPositionType> rhsField;
            rhsField = that.getRelativeLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContainingAirspace();
            boolean rhsFieldIsSet = that.isSetContainingAirspace();
            JAXBElement<AirspacePropertyType> lhsField;
            lhsField = this.getContainingAirspace();
            JAXBElement<AirspacePropertyType> rhsField;
            rhsField = that.getContainingAirspace();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "containingAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "containingAirspace", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAirspacePointRoleType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeLocation();
            JAXBElement<CodeAirspacePointPositionType> theField;
            theField = this.getRelativeLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContainingAirspace();
            JAXBElement<AirspacePropertyType> theField;
            theField = this.getContainingAirspace();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "containingAirspace", theField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SignificantPointInAirspaceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAirspacePointRoleType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeLocation();
            JAXBElement<CodeAirspacePointPositionType> theField;
            theField = this.getRelativeLocation();
            strategy.appendField(locator, this, "relativeLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContainingAirspace();
            JAXBElement<AirspacePropertyType> theField;
            theField = this.getContainingAirspace();
            strategy.appendField(locator, this, "containingAirspace", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SignificantPointInAirspaceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
