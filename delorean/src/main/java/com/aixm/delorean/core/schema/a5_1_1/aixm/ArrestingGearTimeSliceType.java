
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
 * <p>Java class for ArrestingGearTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrestingGearTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ArrestingGearPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractArrestingGearExtension"/>
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
@XmlType(name = "ArrestingGearTimeSliceType", propOrder = {
    "status",
    "length",
    "width",
    "engageDevice",
    "absorbType",
    "bidirectional",
    "location",
    "runwayDirection",
    "surfaceProperties",
    "extentSurfaceExtent",
    "extentCurveExtent",
    "extentPointExtent",
    "annotation",
    "extension"
})
@Entity(name = "ArrestingGearTimeSliceType")
@Table(name = "arrestinggear_ts", schema = "airport_heliport")
public class ArrestingGearTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusOperationsType> status;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "engageDevice", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeArrestingGearEngageDeviceType> engageDevice;
    @XmlElementRef(name = "absorbType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeArrestingGearEnergyAbsorbType> absorbType;
    @XmlElementRef(name = "bidirectional", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> bidirectional;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> location;
    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> runwayDirection;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "extent_surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedSurfacePropertyType> extentSurfaceExtent;
    @XmlElementRef(name = "extent_curveExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedCurvePropertyType> extentCurveExtent;
    @XmlElementRef(name = "extent_pointExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> extentPointExtent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ArrestingGearExtensionType> extension;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusOperationsType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeStatusOperationsType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusOperationsType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<CodeStatusOperationsType> value) {
        this.status = value;
    }

    @Transient
    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    @Transient
    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidth(JAXBElement<ValDistanceType> value) {
        this.width = value;
    }

    @Transient
    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the engageDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEngageDeviceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeArrestingGearEngageDeviceType> getEngageDevice() {
        return engageDevice;
    }

    /**
     * Sets the value of the engageDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEngageDeviceType }{@code >}
     *     
     */
    public void setEngageDevice(JAXBElement<CodeArrestingGearEngageDeviceType> value) {
        this.engageDevice = value;
    }

    @Transient
    public boolean isSetEngageDevice() {
        return (this.engageDevice!= null);
    }

    /**
     * Gets the value of the absorbType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEnergyAbsorbType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeArrestingGearEnergyAbsorbType> getAbsorbType() {
        return absorbType;
    }

    /**
     * Sets the value of the absorbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEnergyAbsorbType }{@code >}
     *     
     */
    public void setAbsorbType(JAXBElement<CodeArrestingGearEnergyAbsorbType> value) {
        this.absorbType = value;
    }

    @Transient
    public boolean isSetAbsorbType() {
        return (this.absorbType!= null);
    }

    /**
     * Gets the value of the bidirectional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getBidirectional() {
        return bidirectional;
    }

    /**
     * Sets the value of the bidirectional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setBidirectional(JAXBElement<CodeYesNoType> value) {
        this.bidirectional = value;
    }

    @Transient
    public boolean isSetBidirectional() {
        return (this.bidirectional!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<ValDistanceType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the runwayDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayDirectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaydirection_id", referencedColumnName = "hjid")
    public List<RunwayDirectionPropertyType> getRunwayDirection() {
        if (runwayDirection == null) {
            runwayDirection = new ArrayList<>();
        }
        return this.runwayDirection;
    }

    /**
     * 
     * 
     */
    public void setRunwayDirection(List<RunwayDirectionPropertyType> runwayDirection) {
        this.runwayDirection = runwayDirection;
    }

    @Transient
    public boolean isSetRunwayDirection() {
        return ((this.runwayDirection!= null)&&(!this.runwayDirection.isEmpty()));
    }

    public void unsetRunwayDirection() {
        this.runwayDirection = null;
    }

    /**
     * Gets the value of the surfaceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SurfaceCharacteristicsPropertyType> getSurfaceProperties() {
        return surfaceProperties;
    }

    /**
     * Sets the value of the surfaceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public void setSurfaceProperties(JAXBElement<SurfaceCharacteristicsPropertyType> value) {
        this.surfaceProperties = value;
    }

    @Transient
    public boolean isSetSurfaceProperties() {
        return (this.surfaceProperties!= null);
    }

    /**
     * Gets the value of the extentSurfaceExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedSurfacePropertyType> getExtentSurfaceExtent() {
        return extentSurfaceExtent;
    }

    /**
     * Sets the value of the extentSurfaceExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setExtentSurfaceExtent(JAXBElement<AIXMElevatedSurfacePropertyType> value) {
        this.extentSurfaceExtent = value;
    }

    @Transient
    public boolean isSetExtentSurfaceExtent() {
        return (this.extentSurfaceExtent!= null);
    }

    /**
     * Gets the value of the extentCurveExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedCurvePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedCurvePropertyType> getExtentCurveExtent() {
        return extentCurveExtent;
    }

    /**
     * Sets the value of the extentCurveExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedCurvePropertyType }{@code >}
     *     
     */
    public void setExtentCurveExtent(JAXBElement<AIXMElevatedCurvePropertyType> value) {
        this.extentCurveExtent = value;
    }

    @Transient
    public boolean isSetExtentCurveExtent() {
        return (this.extentCurveExtent!= null);
    }

    /**
     * Gets the value of the extentPointExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getExtentPointExtent() {
        return extentPointExtent;
    }

    /**
     * Sets the value of the extentPointExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setExtentPointExtent(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.extentPointExtent = value;
    }

    @Transient
    public boolean isSetExtentPointExtent() {
        return (this.extentPointExtent!= null);
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
     * {@link ArrestingGearExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ArrestingGearExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_ARRESTING_GEAR_TIM_0")
    public List<ArrestingGearExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ArrestingGearExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "status")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "status_nilreason"))
    })
    public CodeStatusOperationsType getStatusItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStatusOperationsType.class, this.getStatus());
    }

    public void setStatusItem(CodeStatusOperationsType target) {
        setStatus(XmlAdapterUtils.marshallJAXBElement(CodeStatusOperationsType.class, new QName("http://www.aixm.aero/schema/5.1.1", "status"), ArrestingGearTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "length")),
        @AttributeOverride(name = "uom", column = @Column(name = "length_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "length_nilreason"))
    })
    public ValDistanceType getLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLength());
    }

    public void setLengthItem(ValDistanceType target) {
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "length"), ArrestingGearTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "width")),
        @AttributeOverride(name = "uom", column = @Column(name = "width_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "width_nilreason"))
    })
    public ValDistanceType getWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidth());
    }

    public void setWidthItem(ValDistanceType target) {
        setWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "width"), ArrestingGearTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "engagedevice")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "engagedevice_nilreason"))
    })
    public CodeArrestingGearEngageDeviceType getEngageDeviceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeArrestingGearEngageDeviceType.class, this.getEngageDevice());
    }

    public void setEngageDeviceItem(CodeArrestingGearEngageDeviceType target) {
        setEngageDevice(XmlAdapterUtils.marshallJAXBElement(CodeArrestingGearEngageDeviceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "engageDevice"), ArrestingGearTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "absorbtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "absorbtype_nilreason"))
    })
    public CodeArrestingGearEnergyAbsorbType getAbsorbTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeArrestingGearEnergyAbsorbType.class, this.getAbsorbType());
    }

    public void setAbsorbTypeItem(CodeArrestingGearEnergyAbsorbType target) {
        setAbsorbType(XmlAdapterUtils.marshallJAXBElement(CodeArrestingGearEnergyAbsorbType.class, new QName("http://www.aixm.aero/schema/5.1.1", "absorbType"), ArrestingGearTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "bidirectional")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "bidirectional_nilreason"))
    })
    public CodeYesNoType getBidirectionalItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getBidirectional());
    }

    public void setBidirectionalItem(CodeYesNoType target) {
        setBidirectional(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "bidirectional"), ArrestingGearTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "location")),
        @AttributeOverride(name = "uom", column = @Column(name = "location_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "location_nilreason"))
    })
    public ValDistanceType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLocation());
    }

    public void setLocationItem(ValDistanceType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), ArrestingGearTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SurfaceCharacteristicsPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surfaceproperties_id", referencedColumnName = "hjid")
    public SurfaceCharacteristicsPropertyType getSurfacePropertiesItem() {
        return XmlAdapterUtils.unmarshallSource(SurfaceCharacteristicsPropertyType.class, this.getSurfaceProperties());
    }

    public void setSurfacePropertiesItem(SurfaceCharacteristicsPropertyType target) {
        setSurfaceProperties(XmlAdapterUtils.marshallJAXBElement(SurfaceCharacteristicsPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surfaceProperties"), ArrestingGearTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_surfaceextent_id", referencedColumnName = "hjid")
    public AIXMElevatedSurfacePropertyType getExtentSurfaceExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedSurfacePropertyType.class, this.getExtentSurfaceExtent());
    }

    public void setExtentSurfaceExtentItem(AIXMElevatedSurfacePropertyType target) {
        setExtentSurfaceExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent_surfaceExtent"), ArrestingGearTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_curveextent_id", referencedColumnName = "hjid")
    public AIXMElevatedCurvePropertyType getExtentCurveExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedCurvePropertyType.class, this.getExtentCurveExtent());
    }

    public void setExtentCurveExtentItem(AIXMElevatedCurvePropertyType target) {
        setExtentCurveExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent_curveExtent"), ArrestingGearTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_pointextent_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getExtentPointExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getExtentPointExtent());
    }

    public void setExtentPointExtentItem(AIXMElevatedPointPropertyType target) {
        setExtentPointExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent_pointExtent"), ArrestingGearTimeSliceType.class, target));
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
        final ArrestingGearTimeSliceType that = ((ArrestingGearTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetStatus();
            boolean rhsFieldIsSet = that.isSetStatus();
            JAXBElement<CodeStatusOperationsType> lhsField;
            lhsField = this.getStatus();
            JAXBElement<CodeStatusOperationsType> rhsField;
            rhsField = that.getStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "status", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "status", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtentSurfaceExtent();
            boolean rhsFieldIsSet = that.isSetExtentSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> lhsField;
            lhsField = this.getExtentSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> rhsField;
            rhsField = that.getExtentSurfaceExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extentSurfaceExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extentSurfaceExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtentPointExtent();
            boolean rhsFieldIsSet = that.isSetExtentPointExtent();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getExtentPointExtent();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getExtentPointExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extentPointExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extentPointExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtentCurveExtent();
            boolean rhsFieldIsSet = that.isSetExtentCurveExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> lhsField;
            lhsField = this.getExtentCurveExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> rhsField;
            rhsField = that.getExtentCurveExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extentCurveExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extentCurveExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbsorbType();
            boolean rhsFieldIsSet = that.isSetAbsorbType();
            JAXBElement<CodeArrestingGearEnergyAbsorbType> lhsField;
            lhsField = this.getAbsorbType();
            JAXBElement<CodeArrestingGearEnergyAbsorbType> rhsField;
            rhsField = that.getAbsorbType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "absorbType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "absorbType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayDirection();
            boolean rhsFieldIsSet = that.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> lhsField;
            lhsField = (this.isSetRunwayDirection()?this.getRunwayDirection():null);
            List<RunwayDirectionPropertyType> rhsField;
            rhsField = (that.isSetRunwayDirection()?that.getRunwayDirection():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWidth();
            boolean rhsFieldIsSet = that.isSetWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "width", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "width", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ArrestingGearExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ArrestingGearExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBidirectional();
            boolean rhsFieldIsSet = that.isSetBidirectional();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getBidirectional();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getBidirectional();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "bidirectional", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "bidirectional", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSurfaceProperties();
            boolean rhsFieldIsSet = that.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> lhsField;
            lhsField = this.getSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> rhsField;
            rhsField = that.getSurfaceProperties();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceProperties", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceProperties", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLength();
            boolean rhsFieldIsSet = that.isSetLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "length", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "length", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEngageDevice();
            boolean rhsFieldIsSet = that.isSetEngageDevice();
            JAXBElement<CodeArrestingGearEngageDeviceType> lhsField;
            lhsField = this.getEngageDevice();
            JAXBElement<CodeArrestingGearEngageDeviceType> rhsField;
            rhsField = that.getEngageDevice();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "engageDevice", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "engageDevice", rhsField);
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
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeStatusOperationsType> theField;
            theField = this.getStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "status", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "length", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "width", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEngageDevice();
            JAXBElement<CodeArrestingGearEngageDeviceType> theField;
            theField = this.getEngageDevice();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "engageDevice", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbsorbType();
            JAXBElement<CodeArrestingGearEnergyAbsorbType> theField;
            theField = this.getAbsorbType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "absorbType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBidirectional();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getBidirectional();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "bidirectional", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetRunwayDirection()?this.getRunwayDirection():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> theField;
            theField = this.getSurfaceProperties();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceProperties", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtentSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getExtentSurfaceExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extentSurfaceExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtentCurveExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> theField;
            theField = this.getExtentCurveExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extentCurveExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtentPointExtent();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getExtentPointExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extentPointExtent", theField);
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
            List<ArrestingGearExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeStatusOperationsType> theField;
            theField = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEngageDevice();
            JAXBElement<CodeArrestingGearEngageDeviceType> theField;
            theField = this.getEngageDevice();
            strategy.appendField(locator, this, "engageDevice", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbsorbType();
            JAXBElement<CodeArrestingGearEnergyAbsorbType> theField;
            theField = this.getAbsorbType();
            strategy.appendField(locator, this, "absorbType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBidirectional();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getBidirectional();
            strategy.appendField(locator, this, "bidirectional", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            List<RunwayDirectionPropertyType> theField;
            theField = (this.isSetRunwayDirection()?this.getRunwayDirection():null);
            strategy.appendField(locator, this, "runwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceProperties();
            JAXBElement<SurfaceCharacteristicsPropertyType> theField;
            theField = this.getSurfaceProperties();
            strategy.appendField(locator, this, "surfaceProperties", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtentSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getExtentSurfaceExtent();
            strategy.appendField(locator, this, "extentSurfaceExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtentCurveExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> theField;
            theField = this.getExtentCurveExtent();
            strategy.appendField(locator, this, "extentCurveExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtentPointExtent();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getExtentPointExtent();
            strategy.appendField(locator, this, "extentPointExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ArrestingGearExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
