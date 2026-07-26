
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for RunwayDirectionTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayDirectionTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type="{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="trueBearing" type="{http://www.aixm.aero/schema/5.2}ValBearingType" minOccurs="0"/>
 *         <element name="magneticBearing" type="{http://www.aixm.aero/schema/5.2}ValBearingType" minOccurs="0"/>
 *         <element name="patternVFR" type="{http://www.aixm.aero/schema/5.2}CodeDirectionTurnType" minOccurs="0"/>
 *         <element name="slopeTDZ" type="{http://www.aixm.aero/schema/5.2}ValSlopeType" minOccurs="0"/>
 *         <element name="elevationTDZ" type="{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="approachMarkingType" type="{http://www.aixm.aero/schema/5.2}CodeRunwayMarkingType" minOccurs="0"/>
 *         <element name="approachMarkingCondition" type="{http://www.aixm.aero/schema/5.2}CodeMarkingConditionType" minOccurs="0"/>
 *         <element name="classLightingJAR" type="{http://www.aixm.aero/schema/5.2}CodeLightingJARType" minOccurs="0"/>
 *         <element name="usedRunway" type="{http://www.aixm.aero/schema/5.2}RunwayPropertyType" minOccurs="0"/>
 *         <element name="startingElement" type="{http://www.aixm.aero/schema/5.2}RunwayElementPropertyType" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="availability" type="{http://www.aixm.aero/schema/5.2}ManoeuvringAreaAvailabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="slope" type="{http://www.aixm.aero/schema/5.2}ValSlopeType" minOccurs="0"/>
 *         <element name="approachGuidance" type="{http://www.aixm.aero/schema/5.2}CodeRunwayApproachGuidanceType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractRunwayDirectionExtension"/>
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
    "magneticBearing",
    "patternVFR",
    "slopeTDZ",
    "elevationTDZ",
    "approachMarkingType",
    "approachMarkingCondition",
    "classLightingJAR",
    "usedRunway",
    "startingElement",
    "annotation",
    "availability",
    "slope",
    "approachGuidance",
    "extension"
})
@Entity(name = "RunwayDirectionTimeSliceType")
@Table(name = "runwaydirection_t", schema = "airport_heliport")
public class RunwayDirectionTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "trueBearing", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueBearing;
    @XmlElementRef(name = "magneticBearing", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> magneticBearing;
    @XmlElementRef(name = "patternVFR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> patternVFR;
    @XmlElementRef(name = "slopeTDZ", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> slopeTDZ;
    @XmlElementRef(name = "elevationTDZ", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> elevationTDZ;
    @XmlElementRef(name = "approachMarkingType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayMarkingType> approachMarkingType;
    @XmlElementRef(name = "approachMarkingCondition", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMarkingConditionType> approachMarkingCondition;
    @XmlElementRef(name = "classLightingJAR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightingJARType> classLightingJAR;
    @XmlElementRef(name = "usedRunway", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayPropertyType> usedRunway;
    @XmlElementRef(name = "startingElement", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayElementPropertyType> startingElement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<ManoeuvringAreaAvailabilityPropertyType> availability;
    @XmlElementRef(name = "slope", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> slope;
    @XmlElementRef(name = "approachGuidance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayApproachGuidanceType> approachGuidance;
    protected List<RunwayDirectionTimeSliceExtensionType> extension;

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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctntmslctp_annttn_l", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runwaydirection_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")
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
    @OneToMany(targetEntity = ManoeuvringAreaAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctntmslctp_avlblt_l", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runwaydirection_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")
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
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSlopeType> getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setSlope(JAXBElement<ValSlopeType> value) {
        this.slope = value;
    }

    @Transient
    public boolean isSetSlope() {
        return (this.slope!= null);
    }

    /**
     * Gets the value of the approachGuidance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayApproachGuidanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRunwayApproachGuidanceType> getApproachGuidance() {
        return approachGuidance;
    }

    /**
     * Sets the value of the approachGuidance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayApproachGuidanceType }{@code >}
     *     
     */
    public void setApproachGuidance(JAXBElement<CodeRunwayApproachGuidanceType> value) {
        this.approachGuidance = value;
    }

    @Transient
    public boolean isSetApproachGuidance() {
        return (this.approachGuidance!= null);
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
     * {@link RunwayDirectionTimeSliceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayDirectionTimeSliceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaydirection_te_hjid", referencedColumnName = "hjid")
    public List<RunwayDirectionTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RunwayDirectionTimeSliceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "character3")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason", columnDefinition = "nilreason"))
    })
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.2", "designator"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "truebearing", columnDefinition = "valbearingbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "truebearingnilreason", columnDefinition = "nilreason")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "truebearingaccuracy", columnDefinition = "numericalwithnilreason"))
    })
    public ValBearingType getTrueBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getTrueBearing());
    }

    public void setTrueBearingItem(ValBearingType target) {
        setTrueBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.2", "trueBearing"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magneticbearing", columnDefinition = "valbearingbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magneticbearingnilreason", columnDefinition = "nilreason")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "magneticbearingaccuracy", columnDefinition = "numericalwithnilreason"))
    })
    public ValBearingType getMagneticBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getMagneticBearing());
    }

    public void setMagneticBearingItem(ValBearingType target) {
        setMagneticBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.2", "magneticBearing"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "patternvfr", columnDefinition = "codedirectionturnbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "patternvfrnilreason", columnDefinition = "nilreason"))
    })
    public CodeDirectionTurnType getPatternVFRItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getPatternVFR());
    }

    public void setPatternVFRItem(CodeDirectionTurnType target) {
        setPatternVFR(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.2", "patternVFR"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slopetdz", columnDefinition = "valslopebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopetdznilreason", columnDefinition = "nilreason")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "slopetdzaccuracy", columnDefinition = "numericalwithnilreason"))
    })
    public ValSlopeType getSlopeTDZItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getSlopeTDZ());
    }

    public void setSlopeTDZItem(ValSlopeType target) {
        setSlopeTDZ(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.2", "slopeTDZ"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "elevationtdz", columnDefinition = "valdistanceverticalbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "elevationtdzuom", columnDefinition = "uomdistancevertical")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "elevationtdzaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "elevationtdznilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceVerticalType getElevationTDZItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getElevationTDZ());
    }

    public void setElevationTDZItem(ValDistanceVerticalType target) {
        setElevationTDZ(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.2", "elevationTDZ"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachmarkingtype", columnDefinition = "coderunwaymarkingbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachmarkingtypenilreason", columnDefinition = "nilreason"))
    })
    public CodeRunwayMarkingType getApproachMarkingTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayMarkingType.class, this.getApproachMarkingType());
    }

    public void setApproachMarkingTypeItem(CodeRunwayMarkingType target) {
        setApproachMarkingType(XmlAdapterUtils.marshallJAXBElement(CodeRunwayMarkingType.class, new QName("http://www.aixm.aero/schema/5.2", "approachMarkingType"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachmarkingcondition", columnDefinition = "codemarkingconditionbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachmarkingconditionnilreason", columnDefinition = "nilreason"))
    })
    public CodeMarkingConditionType getApproachMarkingConditionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMarkingConditionType.class, this.getApproachMarkingCondition());
    }

    public void setApproachMarkingConditionItem(CodeMarkingConditionType target) {
        setApproachMarkingCondition(XmlAdapterUtils.marshallJAXBElement(CodeMarkingConditionType.class, new QName("http://www.aixm.aero/schema/5.2", "approachMarkingCondition"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "classlightingjar", columnDefinition = "codelightingjarbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "classlightingjarnilreason", columnDefinition = "nilreason"))
    })
    public CodeLightingJARType getClassLightingJARItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightingJARType.class, this.getClassLightingJAR());
    }

    public void setClassLightingJARItem(CodeLightingJARType target) {
        setClassLightingJAR(XmlAdapterUtils.marshallJAXBElement(CodeLightingJARType.class, new QName("http://www.aixm.aero/schema/5.2", "classLightingJAR"), RunwayDirectionTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctntmslctp_usdrnw_l", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runwaydirection_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "usedrunway_hjid", referencedColumnName = "hjid")
    })
    public RunwayPropertyType getUsedRunwayItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayPropertyType.class, this.getUsedRunway());
    }

    public void setUsedRunwayItem(RunwayPropertyType target) {
        setUsedRunway(XmlAdapterUtils.marshallJAXBElement(RunwayPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "usedRunway"), RunwayDirectionTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayElementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctntmslctp_strtngelmnt_l", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "runwaydirection_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "startingelement_hjid", referencedColumnName = "hjid")
    })
    public RunwayElementPropertyType getStartingElementItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayElementPropertyType.class, this.getStartingElement());
    }

    public void setStartingElementItem(RunwayElementPropertyType target) {
        setStartingElement(XmlAdapterUtils.marshallJAXBElement(RunwayElementPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "startingElement"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "slope", columnDefinition = "valslopebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "slopenilreason", columnDefinition = "nilreason")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "slopeaccuracy", columnDefinition = "numericalwithnilreason"))
    })
    public ValSlopeType getSlopeItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getSlope());
    }

    public void setSlopeItem(ValSlopeType target) {
        setSlope(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.2", "slope"), RunwayDirectionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachguidance", columnDefinition = "coderunwayapproachguidancebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachguidancenilreason", columnDefinition = "nilreason"))
    })
    public CodeRunwayApproachGuidanceType getApproachGuidanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayApproachGuidanceType.class, this.getApproachGuidance());
    }

    public void setApproachGuidanceItem(CodeRunwayApproachGuidanceType target) {
        setApproachGuidance(XmlAdapterUtils.marshallJAXBElement(CodeRunwayApproachGuidanceType.class, new QName("http://www.aixm.aero/schema/5.2", "approachGuidance"), RunwayDirectionTimeSliceType.class, target));
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayDirectionTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RunwayDirectionTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSlope();
            boolean rhsFieldIsSet = that.isSetSlope();
            JAXBElement<ValSlopeType> lhsField;
            lhsField = this.getSlope();
            JAXBElement<ValSlopeType> rhsField;
            rhsField = that.getSlope();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "slope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "slope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetApproachGuidance();
            boolean rhsFieldIsSet = that.isSetApproachGuidance();
            JAXBElement<CodeRunwayApproachGuidanceType> lhsField;
            lhsField = this.getApproachGuidance();
            JAXBElement<CodeRunwayApproachGuidanceType> rhsField;
            rhsField = that.getApproachGuidance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachGuidance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachGuidance", rhsField);
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
            boolean theFieldIsSet = this.isSetSlope();
            JAXBElement<ValSlopeType> theField;
            theField = this.getSlope();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "slope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachGuidance();
            JAXBElement<CodeRunwayApproachGuidanceType> theField;
            theField = this.getApproachGuidance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachGuidance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayDirectionTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetSlope();
            JAXBElement<ValSlopeType> theField;
            theField = this.getSlope();
            strategy.appendField(locator, this, "slope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachGuidance();
            JAXBElement<CodeRunwayApproachGuidanceType> theField;
            theField = this.getApproachGuidance();
            strategy.appendField(locator, this, "approachGuidance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayDirectionTimeSliceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
