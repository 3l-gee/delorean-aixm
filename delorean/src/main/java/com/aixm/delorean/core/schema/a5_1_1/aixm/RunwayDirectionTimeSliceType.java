
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
 * <p>Java class for RunwayDirectionTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayDirectionTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RunwayDirectionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayDirectionExtension"/>
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
@XmlType(name = "RunwayDirectionTimeSliceType", propOrder = {
    "designator",
    "trueBearing",
    "trueBearingAccuracy",
    "magneticBearing",
    "patternVFR",
    "slopeTDZ",
    "elevationTDZ",
    "elevationTDZAccuracy",
    "approachMarkingType",
    "approachMarkingCondition",
    "classLightingJAR",
    "precisionApproachGuidance",
    "usedRunway",
    "startingElement",
    "annotation",
    "availability",
    "extension"
})
@Entity(name = "RunwayDirectionTimeSliceType")
@Table(name = "runwaydirection_ts", schema = "airport_heliport")
public class RunwayDirectionTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "trueBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueBearing;
    @XmlElementRef(name = "trueBearingAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> trueBearingAccuracy;
    @XmlElementRef(name = "magneticBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> magneticBearing;
    @XmlElementRef(name = "patternVFR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> patternVFR;
    @XmlElementRef(name = "slopeTDZ", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> slopeTDZ;
    @XmlElementRef(name = "elevationTDZ", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> elevationTDZ;
    @XmlElementRef(name = "elevationTDZAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> elevationTDZAccuracy;
    @XmlElementRef(name = "approachMarkingType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayMarkingType> approachMarkingType;
    @XmlElementRef(name = "approachMarkingCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMarkingConditionType> approachMarkingCondition;
    @XmlElementRef(name = "classLightingJAR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightingJARType> classLightingJAR;
    @XmlElementRef(name = "precisionApproachGuidance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachGuidanceType> precisionApproachGuidance;
    @XmlElementRef(name = "usedRunway", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayPropertyType> usedRunway;
    @XmlElementRef(name = "startingElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayElementPropertyType> startingElement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<ManoeuvringAreaAvailabilityPropertyType> availability;
    protected List<RunwayDirectionExtensionType> extension;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the trueBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getTrueBearing() {
        return trueBearing;
    }

    /**
     * Sets the value of the trueBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueBearing(JAXBElement<ValBearingType> value) {
        this.trueBearing = value;
    }

    @Transient
    public boolean isSetTrueBearing() {
        return (this.trueBearing!= null);
    }

    /**
     * Gets the value of the trueBearingAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getTrueBearingAccuracy() {
        return trueBearingAccuracy;
    }

    /**
     * Sets the value of the trueBearingAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setTrueBearingAccuracy(JAXBElement<ValAngleType> value) {
        this.trueBearingAccuracy = value;
    }

    @Transient
    public boolean isSetTrueBearingAccuracy() {
        return (this.trueBearingAccuracy!= null);
    }

    /**
     * Gets the value of the magneticBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getMagneticBearing() {
        return magneticBearing;
    }

    /**
     * Sets the value of the magneticBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setMagneticBearing(JAXBElement<ValBearingType> value) {
        this.magneticBearing = value;
    }

    @Transient
    public boolean isSetMagneticBearing() {
        return (this.magneticBearing!= null);
    }

    /**
     * Gets the value of the patternVFR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionTurnType> getPatternVFR() {
        return patternVFR;
    }

    /**
     * Sets the value of the patternVFR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setPatternVFR(JAXBElement<CodeDirectionTurnType> value) {
        this.patternVFR = value;
    }

    @Transient
    public boolean isSetPatternVFR() {
        return (this.patternVFR!= null);
    }

    /**
     * Gets the value of the slopeTDZ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSlopeType> getSlopeTDZ() {
        return slopeTDZ;
    }

    /**
     * Sets the value of the slopeTDZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setSlopeTDZ(JAXBElement<ValSlopeType> value) {
        this.slopeTDZ = value;
    }

    @Transient
    public boolean isSetSlopeTDZ() {
        return (this.slopeTDZ!= null);
    }

    /**
     * Gets the value of the elevationTDZ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getElevationTDZ() {
        return elevationTDZ;
    }

    /**
     * Sets the value of the elevationTDZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setElevationTDZ(JAXBElement<ValDistanceVerticalType> value) {
        this.elevationTDZ = value;
    }

    @Transient
    public boolean isSetElevationTDZ() {
        return (this.elevationTDZ!= null);
    }

    /**
     * Gets the value of the elevationTDZAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getElevationTDZAccuracy() {
        return elevationTDZAccuracy;
    }

    /**
     * Sets the value of the elevationTDZAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setElevationTDZAccuracy(JAXBElement<ValDistanceType> value) {
        this.elevationTDZAccuracy = value;
    }

    @Transient
    public boolean isSetElevationTDZAccuracy() {
        return (this.elevationTDZAccuracy!= null);
    }

    /**
     * Gets the value of the approachMarkingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayMarkingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRunwayMarkingType> getApproachMarkingType() {
        return approachMarkingType;
    }

    /**
     * Sets the value of the approachMarkingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayMarkingType }{@code >}
     *     
     */
    public void setApproachMarkingType(JAXBElement<CodeRunwayMarkingType> value) {
        this.approachMarkingType = value;
    }

    @Transient
    public boolean isSetApproachMarkingType() {
        return (this.approachMarkingType!= null);
    }

    /**
     * Gets the value of the approachMarkingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMarkingConditionType> getApproachMarkingCondition() {
        return approachMarkingCondition;
    }

    /**
     * Sets the value of the approachMarkingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public void setApproachMarkingCondition(JAXBElement<CodeMarkingConditionType> value) {
        this.approachMarkingCondition = value;
    }

    @Transient
    public boolean isSetApproachMarkingCondition() {
        return (this.approachMarkingCondition!= null);
    }

    /**
     * Gets the value of the classLightingJAR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLightingJARType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeLightingJARType> getClassLightingJAR() {
        return classLightingJAR;
    }

    /**
     * Sets the value of the classLightingJAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLightingJARType }{@code >}
     *     
     */
    public void setClassLightingJAR(JAXBElement<CodeLightingJARType> value) {
        this.classLightingJAR = value;
    }

    @Transient
    public boolean isSetClassLightingJAR() {
        return (this.classLightingJAR!= null);
    }

    /**
     * Gets the value of the precisionApproachGuidance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachGuidanceType> getPrecisionApproachGuidance() {
        return precisionApproachGuidance;
    }

    /**
     * Sets the value of the precisionApproachGuidance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    public void setPrecisionApproachGuidance(JAXBElement<CodeApproachGuidanceType> value) {
        this.precisionApproachGuidance = value;
    }

    @Transient
    public boolean isSetPrecisionApproachGuidance() {
        return (this.precisionApproachGuidance!= null);
    }

    /**
     * Gets the value of the usedRunway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayPropertyType> getUsedRunway() {
        return usedRunway;
    }

    /**
     * Sets the value of the usedRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}
     *     
     */
    public void setUsedRunway(JAXBElement<RunwayPropertyType> value) {
        this.usedRunway = value;
    }

    @Transient
    public boolean isSetUsedRunway() {
        return (this.usedRunway!= null);
    }

    /**
     * Gets the value of the startingElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayElementPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayElementPropertyType> getStartingElement() {
        return startingElement;
    }

    /**
     * Sets the value of the startingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayElementPropertyType }{@code >}
     *     
     */
    public void setStartingElement(JAXBElement<RunwayElementPropertyType> value) {
        this.startingElement = value;
    }

    @Transient
    public boolean isSetStartingElement() {
        return (this.startingElement!= null);
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
    @JoinTable(name = "annotation_runwaydirection_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaydirectionpropertygroup", referencedColumnName = "hjid")
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
     * {@link ManoeuvringAreaAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ManoeuvringAreaAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_runwaydirection_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaydirectionpropertygroup", referencedColumnName = "hjid")
    })
    public List<ManoeuvringAreaAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<ManoeuvringAreaAvailabilityPropertyType> availability) {
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
     * {@link RunwayDirectionExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayDirectionExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_RUNWAY_DIRECTION_T_0")
    public List<RunwayDirectionExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RunwayDirectionExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "truebearing")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "truebearing_nilreason"))
    })
    public ValBearingType getTrueBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getTrueBearing());
    }

    public void setTrueBearingItem(ValBearingType target) {
        setTrueBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trueBearing"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "truebearingaccuracy")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "truebearingaccuracy_nilreason"))
    })
    public ValAngleType getTrueBearingAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getTrueBearingAccuracy());
    }

    public void setTrueBearingAccuracyItem(ValAngleType target) {
        setTrueBearingAccuracy(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trueBearingAccuracy"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magneticbearing")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magneticbearing_nilreason"))
    })
    public ValBearingType getMagneticBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getMagneticBearing());
    }

    public void setMagneticBearingItem(ValBearingType target) {
        setMagneticBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticBearing"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "patternvfr")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "patternvfr_nilreason"))
    })
    public CodeDirectionTurnType getPatternVFRItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getPatternVFR());
    }

    public void setPatternVFRItem(CodeDirectionTurnType target) {
        setPatternVFR(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "patternVFR"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slopetdz")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopetdz_nilreason"))
    })
    public ValSlopeType getSlopeTDZItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getSlopeTDZ());
    }

    public void setSlopeTDZItem(ValSlopeType target) {
        setSlopeTDZ(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "slopeTDZ"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "elevationtdz")),
        @AttributeOverride(name = "uom", column = @Column(name = "elevationtdz_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "elevationtdz_nilreason"))
    })
    public ValDistanceVerticalType getElevationTDZItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getElevationTDZ());
    }

    public void setElevationTDZItem(ValDistanceVerticalType target) {
        setElevationTDZ(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "elevationTDZ"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "elevationtdzaccuracy")),
        @AttributeOverride(name = "uom", column = @Column(name = "elevationtdzaccuracy_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "elevationtdzaccuracy_nilreason"))
    })
    public ValDistanceType getElevationTDZAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getElevationTDZAccuracy());
    }

    public void setElevationTDZAccuracyItem(ValDistanceType target) {
        setElevationTDZAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "elevationTDZAccuracy"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachmarkingtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachmarkingtype_nilreason"))
    })
    public CodeRunwayMarkingType getApproachMarkingTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayMarkingType.class, this.getApproachMarkingType());
    }

    public void setApproachMarkingTypeItem(CodeRunwayMarkingType target) {
        setApproachMarkingType(XmlAdapterUtils.marshallJAXBElement(CodeRunwayMarkingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachMarkingType"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachmarkingcondition")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachmarkingcondition_nilreason"))
    })
    public CodeMarkingConditionType getApproachMarkingConditionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMarkingConditionType.class, this.getApproachMarkingCondition());
    }

    public void setApproachMarkingConditionItem(CodeMarkingConditionType target) {
        setApproachMarkingCondition(XmlAdapterUtils.marshallJAXBElement(CodeMarkingConditionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachMarkingCondition"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "classlightingjar")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "classlightingjar_nilreason"))
    })
    public CodeLightingJARType getClassLightingJARItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightingJARType.class, this.getClassLightingJAR());
    }

    public void setClassLightingJARItem(CodeLightingJARType target) {
        setClassLightingJAR(XmlAdapterUtils.marshallJAXBElement(CodeLightingJARType.class, new QName("http://www.aixm.aero/schema/5.1.1", "classLightingJAR"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "precisionapproachguidance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "precisionapproachguidance_nilreason"))
    })
    public CodeApproachGuidanceType getPrecisionApproachGuidanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachGuidanceType.class, this.getPrecisionApproachGuidance());
    }

    public void setPrecisionApproachGuidanceItem(CodeApproachGuidanceType target) {
        setPrecisionApproachGuidance(XmlAdapterUtils.marshallJAXBElement(CodeApproachGuidanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "precisionApproachGuidance"), RunwayDirectionTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "usedrunway_id", referencedColumnName = "hjid")
    public RunwayPropertyType getUsedRunwayItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayPropertyType.class, this.getUsedRunway());
    }

    public void setUsedRunwayItem(RunwayPropertyType target) {
        setUsedRunway(XmlAdapterUtils.marshallJAXBElement(RunwayPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "usedRunway"), RunwayDirectionTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayElementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "startingelement_id", referencedColumnName = "hjid")
    public RunwayElementPropertyType getStartingElementItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayElementPropertyType.class, this.getStartingElement());
    }

    public void setStartingElementItem(RunwayElementPropertyType target) {
        setStartingElement(XmlAdapterUtils.marshallJAXBElement(RunwayElementPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startingElement"), RunwayDirectionTimeSliceType.class, target));
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
        final RunwayDirectionTimeSliceType that = ((RunwayDirectionTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetPatternVFR();
            boolean rhsFieldIsSet = that.isSetPatternVFR();
            JAXBElement<CodeDirectionTurnType> lhsField;
            lhsField = this.getPatternVFR();
            JAXBElement<CodeDirectionTurnType> rhsField;
            rhsField = that.getPatternVFR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "patternVFR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "patternVFR", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachMarkingCondition();
            boolean rhsFieldIsSet = that.isSetApproachMarkingCondition();
            JAXBElement<CodeMarkingConditionType> lhsField;
            lhsField = this.getApproachMarkingCondition();
            JAXBElement<CodeMarkingConditionType> rhsField;
            rhsField = that.getApproachMarkingCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachMarkingCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachMarkingCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTrueBearingAccuracy();
            boolean rhsFieldIsSet = that.isSetTrueBearingAccuracy();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getTrueBearingAccuracy();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getTrueBearingAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trueBearingAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trueBearingAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElevationTDZAccuracy();
            boolean rhsFieldIsSet = that.isSetElevationTDZAccuracy();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getElevationTDZAccuracy();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getElevationTDZAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevationTDZAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevationTDZAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPrecisionApproachGuidance();
            boolean rhsFieldIsSet = that.isSetPrecisionApproachGuidance();
            JAXBElement<CodeApproachGuidanceType> lhsField;
            lhsField = this.getPrecisionApproachGuidance();
            JAXBElement<CodeApproachGuidanceType> rhsField;
            rhsField = that.getPrecisionApproachGuidance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "precisionApproachGuidance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "precisionApproachGuidance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMagneticBearing();
            boolean rhsFieldIsSet = that.isSetMagneticBearing();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getMagneticBearing();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getMagneticBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticBearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticBearing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrueBearing();
            boolean rhsFieldIsSet = that.isSetTrueBearing();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getTrueBearing();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getTrueBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trueBearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trueBearing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSlopeTDZ();
            boolean rhsFieldIsSet = that.isSetSlopeTDZ();
            JAXBElement<ValSlopeType> lhsField;
            lhsField = this.getSlopeTDZ();
            JAXBElement<ValSlopeType> rhsField;
            rhsField = that.getSlopeTDZ();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slopeTDZ", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slopeTDZ", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUsedRunway();
            boolean rhsFieldIsSet = that.isSetUsedRunway();
            JAXBElement<RunwayPropertyType> lhsField;
            lhsField = this.getUsedRunway();
            JAXBElement<RunwayPropertyType> rhsField;
            rhsField = that.getUsedRunway();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usedRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usedRunway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachMarkingType();
            boolean rhsFieldIsSet = that.isSetApproachMarkingType();
            JAXBElement<CodeRunwayMarkingType> lhsField;
            lhsField = this.getApproachMarkingType();
            JAXBElement<CodeRunwayMarkingType> rhsField;
            rhsField = that.getApproachMarkingType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachMarkingType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachMarkingType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartingElement();
            boolean rhsFieldIsSet = that.isSetStartingElement();
            JAXBElement<RunwayElementPropertyType> lhsField;
            lhsField = this.getStartingElement();
            JAXBElement<RunwayElementPropertyType> rhsField;
            rhsField = that.getStartingElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startingElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startingElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClassLightingJAR();
            boolean rhsFieldIsSet = that.isSetClassLightingJAR();
            JAXBElement<CodeLightingJARType> lhsField;
            lhsField = this.getClassLightingJAR();
            JAXBElement<CodeLightingJARType> rhsField;
            rhsField = that.getClassLightingJAR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classLightingJAR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classLightingJAR", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<ManoeuvringAreaAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<ManoeuvringAreaAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayDirectionExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RunwayDirectionExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElevationTDZ();
            boolean rhsFieldIsSet = that.isSetElevationTDZ();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getElevationTDZ();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getElevationTDZ();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "elevationTDZ", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "elevationTDZ", rhsField);
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trueBearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearingAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getTrueBearingAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trueBearingAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getMagneticBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticBearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPatternVFR();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getPatternVFR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "patternVFR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeTDZ();
            JAXBElement<ValSlopeType> theField;
            theField = this.getSlopeTDZ();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slopeTDZ", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevationTDZ();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getElevationTDZ();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevationTDZ", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevationTDZAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getElevationTDZAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "elevationTDZAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachMarkingType();
            JAXBElement<CodeRunwayMarkingType> theField;
            theField = this.getApproachMarkingType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachMarkingType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachMarkingCondition();
            JAXBElement<CodeMarkingConditionType> theField;
            theField = this.getApproachMarkingCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachMarkingCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassLightingJAR();
            JAXBElement<CodeLightingJARType> theField;
            theField = this.getClassLightingJAR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classLightingJAR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrecisionApproachGuidance();
            JAXBElement<CodeApproachGuidanceType> theField;
            theField = this.getPrecisionApproachGuidance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "precisionApproachGuidance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsedRunway();
            JAXBElement<RunwayPropertyType> theField;
            theField = this.getUsedRunway();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usedRunway", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartingElement();
            JAXBElement<RunwayElementPropertyType> theField;
            theField = this.getStartingElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startingElement", theField);
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
            boolean theFieldIsSet = this.isSetAvailability();
            List<ManoeuvringAreaAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayDirectionExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueBearing();
            strategy.appendField(locator, this, "trueBearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueBearingAccuracy();
            JAXBElement<ValAngleType> theField;
            theField = this.getTrueBearingAccuracy();
            strategy.appendField(locator, this, "trueBearingAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getMagneticBearing();
            strategy.appendField(locator, this, "magneticBearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPatternVFR();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getPatternVFR();
            strategy.appendField(locator, this, "patternVFR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSlopeTDZ();
            JAXBElement<ValSlopeType> theField;
            theField = this.getSlopeTDZ();
            strategy.appendField(locator, this, "slopeTDZ", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevationTDZ();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getElevationTDZ();
            strategy.appendField(locator, this, "elevationTDZ", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElevationTDZAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getElevationTDZAccuracy();
            strategy.appendField(locator, this, "elevationTDZAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachMarkingType();
            JAXBElement<CodeRunwayMarkingType> theField;
            theField = this.getApproachMarkingType();
            strategy.appendField(locator, this, "approachMarkingType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachMarkingCondition();
            JAXBElement<CodeMarkingConditionType> theField;
            theField = this.getApproachMarkingCondition();
            strategy.appendField(locator, this, "approachMarkingCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassLightingJAR();
            JAXBElement<CodeLightingJARType> theField;
            theField = this.getClassLightingJAR();
            strategy.appendField(locator, this, "classLightingJAR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrecisionApproachGuidance();
            JAXBElement<CodeApproachGuidanceType> theField;
            theField = this.getPrecisionApproachGuidance();
            strategy.appendField(locator, this, "precisionApproachGuidance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsedRunway();
            JAXBElement<RunwayPropertyType> theField;
            theField = this.getUsedRunway();
            strategy.appendField(locator, this, "usedRunway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartingElement();
            JAXBElement<RunwayElementPropertyType> theField;
            theField = this.getStartingElement();
            strategy.appendField(locator, this, "startingElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ManoeuvringAreaAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayDirectionExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
