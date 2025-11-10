
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
 * <p>Java class for VisualGlideSlopeIndicatorTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VisualGlideSlopeIndicatorTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}VisualGlideSlopeIndicatorPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractVisualGlideSlopeIndicatorExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractGroundLightSystemExtension"/>
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
@XmlType(name = "VisualGlideSlopeIndicatorTimeSliceType", propOrder = {
    "emergencyLighting",
    "intensityLevel",
    "colour",
    "element",
    "availability",
    "annotation",
    "type",
    "position",
    "numberBox",
    "portable",
    "slopeAngle",
    "minimumEyeHeightOverThreshold",
    "runwayDirection",
    "extension"
})
@Entity(name = "VisualGlideSlopeIndicatorTimeSliceType")
@Table(name = "visualglideslopeindicator_ts", schema = "airport_heliport")
public class VisualGlideSlopeIndicatorTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "emergencyLighting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> emergencyLighting;
    @XmlElementRef(name = "intensityLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightIntensityType> intensityLevel;
    @XmlElementRef(name = "colour", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> colour;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<GroundLightingAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVASISType> type;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> position;
    @XmlElementRef(name = "numberBox", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> numberBox;
    @XmlElementRef(name = "portable", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> portable;
    @XmlElementRef(name = "slopeAngle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopeAngle;
    @XmlElementRef(name = "minimumEyeHeightOverThreshold", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEyeHeightOverThreshold;
    @XmlElementRef(name = "runwayDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> runwayDirection;
    protected List<VisualGlideSlopeIndicatorExtensionType> extension;

    /**
     * Gets the value of the emergencyLighting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getEmergencyLighting() {
        return emergencyLighting;
    }

    /**
     * Sets the value of the emergencyLighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setEmergencyLighting(JAXBElement<CodeYesNoType> value) {
        this.emergencyLighting = value;
    }

    @Transient
    public boolean isSetEmergencyLighting() {
        return (this.emergencyLighting!= null);
    }

    /**
     * Gets the value of the intensityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLightIntensityType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeLightIntensityType> getIntensityLevel() {
        return intensityLevel;
    }

    /**
     * Sets the value of the intensityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLightIntensityType }{@code >}
     *     
     */
    public void setIntensityLevel(JAXBElement<CodeLightIntensityType> value) {
        this.intensityLevel = value;
    }

    @Transient
    public boolean isSetIntensityLevel() {
        return (this.intensityLevel!= null);
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeColourType> getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setColour(JAXBElement<CodeColourType> value) {
        this.colour = value;
    }

    @Transient
    public boolean isSetColour() {
        return (this.colour!= null);
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = LightElementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "element_id", referencedColumnName = "hjid")
    public List<LightElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return this.element;
    }

    /**
     * 
     * 
     */
    public void setElement(List<LightElementPropertyType> element) {
        this.element = element;
    }

    @Transient
    public boolean isSetElement() {
        return ((this.element!= null)&&(!this.element.isEmpty()));
    }

    public void unsetElement() {
        this.element = null;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightingAvailabilityPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = GroundLightingAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "availability_id", referencedColumnName = "hjid")
    public List<GroundLightingAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<GroundLightingAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVASISType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVASISType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVASISType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeVASISType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSideType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setPosition(JAXBElement<CodeSideType> value) {
        this.position = value;
    }

    @Transient
    public boolean isSetPosition() {
        return (this.position!= null);
    }

    /**
     * Gets the value of the numberBox property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getNumberBox() {
        return numberBox;
    }

    /**
     * Sets the value of the numberBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setNumberBox(JAXBElement<NoNumberType> value) {
        this.numberBox = value;
    }

    @Transient
    public boolean isSetNumberBox() {
        return (this.numberBox!= null);
    }

    /**
     * Gets the value of the portable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getPortable() {
        return portable;
    }

    /**
     * Sets the value of the portable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setPortable(JAXBElement<CodeYesNoType> value) {
        this.portable = value;
    }

    @Transient
    public boolean isSetPortable() {
        return (this.portable!= null);
    }

    /**
     * Gets the value of the slopeAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getSlopeAngle() {
        return slopeAngle;
    }

    /**
     * Sets the value of the slopeAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopeAngle(JAXBElement<ValAngleType> value) {
        this.slopeAngle = value;
    }

    @Transient
    public boolean isSetSlopeAngle() {
        return (this.slopeAngle!= null);
    }

    /**
     * Gets the value of the minimumEyeHeightOverThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumEyeHeightOverThreshold() {
        return minimumEyeHeightOverThreshold;
    }

    /**
     * Sets the value of the minimumEyeHeightOverThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEyeHeightOverThreshold(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEyeHeightOverThreshold = value;
    }

    @Transient
    public boolean isSetMinimumEyeHeightOverThreshold() {
        return (this.minimumEyeHeightOverThreshold!= null);
    }

    /**
     * Gets the value of the runwayDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayDirectionPropertyType> getRunwayDirection() {
        return runwayDirection;
    }

    /**
     * Sets the value of the runwayDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.runwayDirection = value;
    }

    @Transient
    public boolean isSetRunwayDirection() {
        return (this.runwayDirection!= null);
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
     * {@link VisualGlideSlopeIndicatorExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = VisualGlideSlopeIndicatorExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_VISUAL_GLIDE_SLOPE_0")
    public List<VisualGlideSlopeIndicatorExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<VisualGlideSlopeIndicatorExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "emergencylighting")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "emergencylighting_nilreason"))
    })
    public CodeYesNoType getEmergencyLightingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getEmergencyLighting());
    }

    public void setEmergencyLightingItem(CodeYesNoType target) {
        setEmergencyLighting(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "emergencyLighting"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "intensitylevel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "intensitylevel_nilreason"))
    })
    public CodeLightIntensityType getIntensityLevelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightIntensityType.class, this.getIntensityLevel());
    }

    public void setIntensityLevelItem(CodeLightIntensityType target) {
        setIntensityLevel(XmlAdapterUtils.marshallJAXBElement(CodeLightIntensityType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intensityLevel"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "colour")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "colour_nilreason"))
    })
    public CodeColourType getColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getColour());
    }

    public void setColourItem(CodeColourType target) {
        setColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class, new QName("http://www.aixm.aero/schema/5.1.1", "colour"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeVASISType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVASISType.class, this.getType());
    }

    public void setTypeItem(CodeVASISType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeVASISType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "position")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "position_nilreason"))
    })
    public CodeSideType getPositionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getPosition());
    }

    public void setPositionItem(CodeSideType target) {
        setPosition(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class, new QName("http://www.aixm.aero/schema/5.1.1", "position"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "numberbox")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "numberbox_nilreason"))
    })
    public NoNumberType getNumberBoxItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getNumberBox());
    }

    public void setNumberBoxItem(NoNumberType target) {
        setNumberBox(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "numberBox"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "portable")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "portable_nilreason"))
    })
    public CodeYesNoType getPortableItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getPortable());
    }

    public void setPortableItem(CodeYesNoType target) {
        setPortable(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "portable"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slopeangle")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopeangle_nilreason"))
    })
    public ValAngleType getSlopeAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getSlopeAngle());
    }

    public void setSlopeAngleItem(ValAngleType target) {
        setSlopeAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slopeAngle"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumeyeheightoverthreshold")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumeyeheightoverthreshold_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumeyeheightoverthreshold_nilreason"))
    })
    public ValDistanceVerticalType getMinimumEyeHeightOverThresholdItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumEyeHeightOverThreshold());
    }

    public void setMinimumEyeHeightOverThresholdItem(ValDistanceVerticalType target) {
        setMinimumEyeHeightOverThreshold(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumEyeHeightOverThreshold"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayDirectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaydirection_id", referencedColumnName = "hjid")
    public RunwayDirectionPropertyType getRunwayDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayDirectionPropertyType.class, this.getRunwayDirection());
    }

    public void setRunwayDirectionItem(RunwayDirectionPropertyType target) {
        setRunwayDirection(XmlAdapterUtils.marshallJAXBElement(RunwayDirectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "runwayDirection"), VisualGlideSlopeIndicatorTimeSliceType.class, target));
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
        final VisualGlideSlopeIndicatorTimeSliceType that = ((VisualGlideSlopeIndicatorTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetNumberBox();
            boolean rhsFieldIsSet = that.isSetNumberBox();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getNumberBox();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getNumberBox();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numberBox", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numberBox", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmergencyLighting();
            boolean rhsFieldIsSet = that.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getEmergencyLighting();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getEmergencyLighting();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emergencyLighting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emergencyLighting", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPortable();
            boolean rhsFieldIsSet = that.isSetPortable();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getPortable();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getPortable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "portable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "portable", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeVASISType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeVASISType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<VisualGlideSlopeIndicatorExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<VisualGlideSlopeIndicatorExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntensityLevel();
            boolean rhsFieldIsSet = that.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> lhsField;
            lhsField = this.getIntensityLevel();
            JAXBElement<CodeLightIntensityType> rhsField;
            rhsField = that.getIntensityLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intensityLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intensityLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElement();
            boolean rhsFieldIsSet = that.isSetElement();
            List<LightElementPropertyType> lhsField;
            lhsField = (this.isSetElement()?this.getElement():null);
            List<LightElementPropertyType> rhsField;
            rhsField = (that.isSetElement()?that.getElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "element", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "element", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayDirection();
            boolean rhsFieldIsSet = that.isSetRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> lhsField;
            lhsField = this.getRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> rhsField;
            rhsField = that.getRunwayDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetColour();
            boolean rhsFieldIsSet = that.isSetColour();
            JAXBElement<CodeColourType> lhsField;
            lhsField = this.getColour();
            JAXBElement<CodeColourType> rhsField;
            rhsField = that.getColour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "colour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "colour", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMinimumEyeHeightOverThreshold();
            boolean rhsFieldIsSet = that.isSetMinimumEyeHeightOverThreshold();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumEyeHeightOverThreshold();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumEyeHeightOverThreshold();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumEyeHeightOverThreshold", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumEyeHeightOverThreshold", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<GroundLightingAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPosition();
            boolean rhsFieldIsSet = that.isSetPosition();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getPosition();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSlopeAngle();
            boolean rhsFieldIsSet = that.isSetSlopeAngle();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getSlopeAngle();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getSlopeAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slopeAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slopeAngle", rhsField);
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
            boolean theFieldIsSet = this.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEmergencyLighting();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emergencyLighting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intensityLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "colour", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement()?this.getElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "element", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeVASISType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<CodeSideType> theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumberBox();
            JAXBElement<NoNumberType> theField;
            theField = this.getNumberBox();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numberBox", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPortable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPortable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "portable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlopeAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slopeAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumEyeHeightOverThreshold();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumEyeHeightOverThreshold();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumEyeHeightOverThreshold", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getRunwayDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<VisualGlideSlopeIndicatorExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEmergencyLighting();
            strategy.appendField(locator, this, "emergencyLighting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            strategy.appendField(locator, this, "intensityLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            strategy.appendField(locator, this, "colour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement()?this.getElement():null);
            strategy.appendField(locator, this, "element", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeVASISType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<CodeSideType> theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumberBox();
            JAXBElement<NoNumberType> theField;
            theField = this.getNumberBox();
            strategy.appendField(locator, this, "numberBox", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPortable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPortable();
            strategy.appendField(locator, this, "portable", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getSlopeAngle();
            strategy.appendField(locator, this, "slopeAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumEyeHeightOverThreshold();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumEyeHeightOverThreshold();
            strategy.appendField(locator, this, "minimumEyeHeightOverThreshold", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getRunwayDirection();
            strategy.appendField(locator, this, "runwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<VisualGlideSlopeIndicatorExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
