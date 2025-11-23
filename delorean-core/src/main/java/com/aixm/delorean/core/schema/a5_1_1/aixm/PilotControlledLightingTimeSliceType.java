
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
 * <p>Java class for PilotControlledLightingTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PilotControlledLightingTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}PilotControlledLightingPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPilotControlledLightingExtension"/>
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
@XmlType(name = "PilotControlledLightingTimeSliceType", propOrder = {
    "type",
    "duration",
    "intensitySteps",
    "standByIntensity",
    "radioFrequency",
    "activationInstruction",
    "controlledLightIntensity",
    "activatedGroundLighting",
    "annotation",
    "extension"
})
@Entity(name = "PilotControlledLightingTimeSliceType")
@Table(name = "pilotcontrolledlighting_ts", schema = "service")
public class PilotControlledLightingTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePilotControlledLightingType> type;
    @XmlElementRef(name = "duration", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> duration;
    @XmlElementRef(name = "intensitySteps", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> intensitySteps;
    @XmlElementRef(name = "standByIntensity", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeIntensityStandByType> standByIntensity;
    @XmlElementRef(name = "radioFrequency", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> radioFrequency;
    @XmlElementRef(name = "activationInstruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> activationInstruction;
    @XmlElement(nillable = true)
    protected List<LightActivationPropertyType> controlledLightIntensity;
    @XmlElement(nillable = true)
    protected List<GroundLightSystemPropertyType> activatedGroundLighting;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<PilotControlledLightingExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePilotControlledLightingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePilotControlledLightingType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePilotControlledLightingType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodePilotControlledLightingType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDurationType> getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setDuration(JAXBElement<ValDurationType> value) {
        this.duration = value;
    }

    @Transient
    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    /**
     * Gets the value of the intensitySteps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getIntensitySteps() {
        return intensitySteps;
    }

    /**
     * Sets the value of the intensitySteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setIntensitySteps(JAXBElement<NoNumberType> value) {
        this.intensitySteps = value;
    }

    @Transient
    public boolean isSetIntensitySteps() {
        return (this.intensitySteps!= null);
    }

    /**
     * Gets the value of the standByIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeIntensityStandByType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeIntensityStandByType> getStandByIntensity() {
        return standByIntensity;
    }

    /**
     * Sets the value of the standByIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeIntensityStandByType }{@code >}
     *     
     */
    public void setStandByIntensity(JAXBElement<CodeIntensityStandByType> value) {
        this.standByIntensity = value;
    }

    @Transient
    public boolean isSetStandByIntensity() {
        return (this.standByIntensity!= null);
    }

    /**
     * Gets the value of the radioFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFrequencyType> getRadioFrequency() {
        return radioFrequency;
    }

    /**
     * Sets the value of the radioFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setRadioFrequency(JAXBElement<ValFrequencyType> value) {
        this.radioFrequency = value;
    }

    @Transient
    public boolean isSetRadioFrequency() {
        return (this.radioFrequency!= null);
    }

    /**
     * Gets the value of the activationInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextInstructionType> getActivationInstruction() {
        return activationInstruction;
    }

    /**
     * Sets the value of the activationInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setActivationInstruction(JAXBElement<TextInstructionType> value) {
        this.activationInstruction = value;
    }

    @Transient
    public boolean isSetActivationInstruction() {
        return (this.activationInstruction!= null);
    }

    /**
     * Gets the value of the controlledLightIntensity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlledLightIntensity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlledLightIntensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightActivationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = LightActivationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "controlledlightintensity_pilotcontrolledlighting_link", schema = "service", joinColumns = {
        @JoinColumn(name = "controlledlightintensity", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "pilotcontrolledlightingpropertygroup", referencedColumnName = "hjid")
    })
    public List<LightActivationPropertyType> getControlledLightIntensity() {
        if (controlledLightIntensity == null) {
            controlledLightIntensity = new ArrayList<>();
        }
        return this.controlledLightIntensity;
    }

    /**
     * 
     * 
     */
    public void setControlledLightIntensity(List<LightActivationPropertyType> controlledLightIntensity) {
        this.controlledLightIntensity = controlledLightIntensity;
    }

    @Transient
    public boolean isSetControlledLightIntensity() {
        return ((this.controlledLightIntensity!= null)&&(!this.controlledLightIntensity.isEmpty()));
    }

    public void unsetControlledLightIntensity() {
        this.controlledLightIntensity = null;
    }

    /**
     * Gets the value of the activatedGroundLighting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activatedGroundLighting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivatedGroundLighting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightSystemPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = GroundLightSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "activatedgroundlighting_pilotcontrolledlighting_link", schema = "service", joinColumns = {
        @JoinColumn(name = "activatedgroundlighting", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "pilotcontrolledlightingpropertygroup", referencedColumnName = "hjid")
    })
    public List<GroundLightSystemPropertyType> getActivatedGroundLighting() {
        if (activatedGroundLighting == null) {
            activatedGroundLighting = new ArrayList<>();
        }
        return this.activatedGroundLighting;
    }

    /**
     * 
     * 
     */
    public void setActivatedGroundLighting(List<GroundLightSystemPropertyType> activatedGroundLighting) {
        this.activatedGroundLighting = activatedGroundLighting;
    }

    @Transient
    public boolean isSetActivatedGroundLighting() {
        return ((this.activatedGroundLighting!= null)&&(!this.activatedGroundLighting.isEmpty()));
    }

    public void unsetActivatedGroundLighting() {
        this.activatedGroundLighting = null;
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
    @JoinTable(name = "annotation_pilotcontrolledlighting_link", schema = "service", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "pilotcontrolledlightingpropertygroup", referencedColumnName = "hjid")
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
     * {@link PilotControlledLightingExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = PilotControlledLightingExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_PILOT_CONTROLLED_L_0")
    public List<PilotControlledLightingExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<PilotControlledLightingExtensionType> extension) {
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
    public CodePilotControlledLightingType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodePilotControlledLightingType.class, this.getType());
    }

    public void setTypeItem(CodePilotControlledLightingType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodePilotControlledLightingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), PilotControlledLightingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "duration")),
        @AttributeOverride(name = "uom", column = @Column(name = "duration_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "duration_nilreason"))
    })
    public ValDurationType getDurationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getDuration());
    }

    public void setDurationItem(ValDurationType target) {
        setDuration(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "duration"), PilotControlledLightingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "intensitysteps")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "intensitysteps_nilreason"))
    })
    public NoNumberType getIntensityStepsItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getIntensitySteps());
    }

    public void setIntensityStepsItem(NoNumberType target) {
        setIntensitySteps(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intensitySteps"), PilotControlledLightingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "standbyintensity")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "standbyintensity_nilreason"))
    })
    public CodeIntensityStandByType getStandByIntensityItem() {
        return XmlAdapterUtils.unmarshallSource(CodeIntensityStandByType.class, this.getStandByIntensity());
    }

    public void setStandByIntensityItem(CodeIntensityStandByType target) {
        setStandByIntensity(XmlAdapterUtils.marshallJAXBElement(CodeIntensityStandByType.class, new QName("http://www.aixm.aero/schema/5.1.1", "standByIntensity"), PilotControlledLightingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "radiofrequency")),
        @AttributeOverride(name = "uom", column = @Column(name = "radiofrequency_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "radiofrequency_nilreason"))
    })
    public ValFrequencyType getRadioFrequencyItem() {
        return XmlAdapterUtils.unmarshallSource(ValFrequencyType.class, this.getRadioFrequency());
    }

    public void setRadioFrequencyItem(ValFrequencyType target) {
        setRadioFrequency(XmlAdapterUtils.marshallJAXBElement(ValFrequencyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "radioFrequency"), PilotControlledLightingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "activationinstruction")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "activationinstruction_nilreason"))
    })
    public TextInstructionType getActivationInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getActivationInstruction());
    }

    public void setActivationInstructionItem(TextInstructionType target) {
        setActivationInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "activationInstruction"), PilotControlledLightingTimeSliceType.class, target));
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
        final PilotControlledLightingTimeSliceType that = ((PilotControlledLightingTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetControlledLightIntensity();
            boolean rhsFieldIsSet = that.isSetControlledLightIntensity();
            List<LightActivationPropertyType> lhsField;
            lhsField = (this.isSetControlledLightIntensity()?this.getControlledLightIntensity():null);
            List<LightActivationPropertyType> rhsField;
            rhsField = (that.isSetControlledLightIntensity()?that.getControlledLightIntensity():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlledLightIntensity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlledLightIntensity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetActivatedGroundLighting();
            boolean rhsFieldIsSet = that.isSetActivatedGroundLighting();
            List<GroundLightSystemPropertyType> lhsField;
            lhsField = (this.isSetActivatedGroundLighting()?this.getActivatedGroundLighting():null);
            List<GroundLightSystemPropertyType> rhsField;
            rhsField = (that.isSetActivatedGroundLighting()?that.getActivatedGroundLighting():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "activatedGroundLighting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "activatedGroundLighting", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PilotControlledLightingExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<PilotControlledLightingExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDuration();
            boolean rhsFieldIsSet = that.isSetDuration();
            JAXBElement<ValDurationType> lhsField;
            lhsField = this.getDuration();
            JAXBElement<ValDurationType> rhsField;
            rhsField = that.getDuration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "duration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "duration", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntensitySteps();
            boolean rhsFieldIsSet = that.isSetIntensitySteps();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getIntensitySteps();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getIntensitySteps();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intensitySteps", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intensitySteps", rhsField);
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
            boolean lhsFieldIsSet = this.isSetActivationInstruction();
            boolean rhsFieldIsSet = that.isSetActivationInstruction();
            JAXBElement<TextInstructionType> lhsField;
            lhsField = this.getActivationInstruction();
            JAXBElement<TextInstructionType> rhsField;
            rhsField = that.getActivationInstruction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "activationInstruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "activationInstruction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStandByIntensity();
            boolean rhsFieldIsSet = that.isSetStandByIntensity();
            JAXBElement<CodeIntensityStandByType> lhsField;
            lhsField = this.getStandByIntensity();
            JAXBElement<CodeIntensityStandByType> rhsField;
            rhsField = that.getStandByIntensity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "standByIntensity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "standByIntensity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadioFrequency();
            boolean rhsFieldIsSet = that.isSetRadioFrequency();
            JAXBElement<ValFrequencyType> lhsField;
            lhsField = this.getRadioFrequency();
            JAXBElement<ValFrequencyType> rhsField;
            rhsField = that.getRadioFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radioFrequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radioFrequency", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodePilotControlledLightingType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodePilotControlledLightingType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
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
            JAXBElement<CodePilotControlledLightingType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            JAXBElement<ValDurationType> theField;
            theField = this.getDuration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "duration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensitySteps();
            JAXBElement<NoNumberType> theField;
            theField = this.getIntensitySteps();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intensitySteps", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStandByIntensity();
            JAXBElement<CodeIntensityStandByType> theField;
            theField = this.getStandByIntensity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "standByIntensity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioFrequency();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getRadioFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radioFrequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivationInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getActivationInstruction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "activationInstruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlledLightIntensity();
            List<LightActivationPropertyType> theField;
            theField = (this.isSetControlledLightIntensity()?this.getControlledLightIntensity():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlledLightIntensity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivatedGroundLighting();
            List<GroundLightSystemPropertyType> theField;
            theField = (this.isSetActivatedGroundLighting()?this.getActivatedGroundLighting():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "activatedGroundLighting", theField);
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
            List<PilotControlledLightingExtensionType> theField;
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
            JAXBElement<CodePilotControlledLightingType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            JAXBElement<ValDurationType> theField;
            theField = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensitySteps();
            JAXBElement<NoNumberType> theField;
            theField = this.getIntensitySteps();
            strategy.appendField(locator, this, "intensitySteps", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStandByIntensity();
            JAXBElement<CodeIntensityStandByType> theField;
            theField = this.getStandByIntensity();
            strategy.appendField(locator, this, "standByIntensity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioFrequency();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getRadioFrequency();
            strategy.appendField(locator, this, "radioFrequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivationInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getActivationInstruction();
            strategy.appendField(locator, this, "activationInstruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlledLightIntensity();
            List<LightActivationPropertyType> theField;
            theField = (this.isSetControlledLightIntensity()?this.getControlledLightIntensity():null);
            strategy.appendField(locator, this, "controlledLightIntensity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivatedGroundLighting();
            List<GroundLightSystemPropertyType> theField;
            theField = (this.isSetActivatedGroundLighting()?this.getActivatedGroundLighting():null);
            strategy.appendField(locator, this, "activatedGroundLighting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PilotControlledLightingExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
