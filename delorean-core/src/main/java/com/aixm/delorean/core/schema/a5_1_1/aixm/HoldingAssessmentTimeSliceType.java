
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
 * <p>Java class for HoldingAssessmentTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingAssessmentTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}HoldingAssessmentPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractHoldingAssessmentExtension"/>
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
@XmlType(name = "HoldingAssessmentTimeSliceType", propOrder = {
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "speedLimit",
    "patternTemplate",
    "turbulentAir",
    "legLengthToward",
    "legLengthAway",
    "holdingPoint",
    "unplannedHolding",
    "assessedHoldingPattern",
    "obstacleAssessment",
    "annotation",
    "extension"
})
@Entity(name = "HoldingAssessmentTimeSliceType")
@Table(name = "holdingassessment_ts", schema = "shared")
public class HoldingAssessmentTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "patternTemplate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> patternTemplate;
    @XmlElementRef(name = "turbulentAir", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> turbulentAir;
    @XmlElementRef(name = "legLengthToward", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> legLengthToward;
    @XmlElementRef(name = "legLengthAway", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> legLengthAway;
    @XmlElementRef(name = "holdingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> holdingPoint;
    @XmlElementRef(name = "unplannedHolding", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<UnplannedHoldingPropertyType> unplannedHolding;
    @XmlElementRef(name = "assessedHoldingPattern", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternPropertyType> assessedHoldingPattern;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> obstacleAssessment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<HoldingAssessmentExtensionType> extension;

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    @Transient
    public boolean isSetUpperLimit() {
        return (this.upperLimit!= null);
    }

    /**
     * Gets the value of the upperLimitReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Sets the value of the upperLimitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    @Transient
    public boolean isSetUpperLimitReference() {
        return (this.upperLimitReference!= null);
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    @Transient
    public boolean isSetLowerLimit() {
        return (this.lowerLimit!= null);
    }

    /**
     * Gets the value of the lowerLimitReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Sets the value of the lowerLimitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    @Transient
    public boolean isSetLowerLimitReference() {
        return (this.lowerLimitReference!= null);
    }

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSpeedType> getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeedLimit(JAXBElement<ValSpeedType> value) {
        this.speedLimit = value;
    }

    @Transient
    public boolean isSetSpeedLimit() {
        return (this.speedLimit!= null);
    }

    /**
     * Gets the value of the patternTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getPatternTemplate() {
        return patternTemplate;
    }

    /**
     * Sets the value of the patternTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setPatternTemplate(JAXBElement<TextNameType> value) {
        this.patternTemplate = value;
    }

    @Transient
    public boolean isSetPatternTemplate() {
        return (this.patternTemplate!= null);
    }

    /**
     * Gets the value of the turbulentAir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getTurbulentAir() {
        return turbulentAir;
    }

    /**
     * Sets the value of the turbulentAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setTurbulentAir(JAXBElement<CodeYesNoType> value) {
        this.turbulentAir = value;
    }

    @Transient
    public boolean isSetTurbulentAir() {
        return (this.turbulentAir!= null);
    }

    /**
     * Gets the value of the legLengthToward property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLegLengthToward() {
        return legLengthToward;
    }

    /**
     * Sets the value of the legLengthToward property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLegLengthToward(JAXBElement<ValDistanceType> value) {
        this.legLengthToward = value;
    }

    @Transient
    public boolean isSetLegLengthToward() {
        return (this.legLengthToward!= null);
    }

    /**
     * Gets the value of the legLengthAway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLegLengthAway() {
        return legLengthAway;
    }

    /**
     * Sets the value of the legLengthAway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLegLengthAway(JAXBElement<ValDistanceType> value) {
        this.legLengthAway = value;
    }

    @Transient
    public boolean isSetLegLengthAway() {
        return (this.legLengthAway!= null);
    }

    /**
     * Gets the value of the holdingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SegmentPointPropertyType> getHoldingPoint() {
        return holdingPoint;
    }

    /**
     * Sets the value of the holdingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public void setHoldingPoint(JAXBElement<SegmentPointPropertyType> value) {
        this.holdingPoint = value;
    }

    @Transient
    public boolean isSetHoldingPoint() {
        return (this.holdingPoint!= null);
    }

    /**
     * Gets the value of the unplannedHolding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<UnplannedHoldingPropertyType> getUnplannedHolding() {
        return unplannedHolding;
    }

    /**
     * Sets the value of the unplannedHolding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingPropertyType }{@code >}
     *     
     */
    public void setUnplannedHolding(JAXBElement<UnplannedHoldingPropertyType> value) {
        this.unplannedHolding = value;
    }

    @Transient
    public boolean isSetUnplannedHolding() {
        return (this.unplannedHolding!= null);
    }

    /**
     * Gets the value of the assessedHoldingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<HoldingPatternPropertyType> getAssessedHoldingPattern() {
        return assessedHoldingPattern;
    }

    /**
     * Sets the value of the assessedHoldingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternPropertyType }{@code >}
     *     
     */
    public void setAssessedHoldingPattern(JAXBElement<HoldingPatternPropertyType> value) {
        this.assessedHoldingPattern = value;
    }

    @Transient
    public boolean isSetAssessedHoldingPattern() {
        return (this.assessedHoldingPattern!= null);
    }

    /**
     * Gets the value of the obstacleAssessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstacleAssessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstacleAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentAreaPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ObstacleAssessmentAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstacleassessment_holdingassessment_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "obstacleassessment", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "holdingassessmentpropertygroup", referencedColumnName = "hjid")
    })
    public List<ObstacleAssessmentAreaPropertyType> getObstacleAssessment() {
        if (obstacleAssessment == null) {
            obstacleAssessment = new ArrayList<>();
        }
        return this.obstacleAssessment;
    }

    /**
     * 
     * 
     */
    public void setObstacleAssessment(List<ObstacleAssessmentAreaPropertyType> obstacleAssessment) {
        this.obstacleAssessment = obstacleAssessment;
    }

    @Transient
    public boolean isSetObstacleAssessment() {
        return ((this.obstacleAssessment!= null)&&(!this.obstacleAssessment.isEmpty()));
    }

    public void unsetObstacleAssessment() {
        this.obstacleAssessment = null;
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
    @JoinTable(name = "annotation_holdingassessment_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "holdingassessmentpropertygroup", referencedColumnName = "hjid")
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
     * {@link HoldingAssessmentExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = HoldingAssessmentExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_HOLDING_ASSESSMENT_0")
    public List<HoldingAssessmentExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<HoldingAssessmentExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "upperlimit")),
        @AttributeOverride(name = "uom", column = @Column(name = "upperlimit_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimit_nilreason"))
    })
    public ValDistanceVerticalType getUpperLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimit());
    }

    public void setUpperLimitItem(ValDistanceVerticalType target) {
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimit"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlimitreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitreference_nilreason"))
    })
    public CodeVerticalReferenceType getUpperLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLimitReference());
    }

    public void setUpperLimitReferenceItem(CodeVerticalReferenceType target) {
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitReference"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimit")),
        @AttributeOverride(name = "uom", column = @Column(name = "lowerlimit_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimit_nilreason"))
    })
    public ValDistanceVerticalType getLowerLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimit());
    }

    public void setLowerLimitItem(ValDistanceVerticalType target) {
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimit"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimitreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitreference_nilreason"))
    })
    public CodeVerticalReferenceType getLowerLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLimitReference());
    }

    public void setLowerLimitReferenceItem(CodeVerticalReferenceType target) {
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitReference"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedlimit")),
        @AttributeOverride(name = "uom", column = @Column(name = "speedlimit_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedlimit_nilreason"))
    })
    public ValSpeedType getSpeedLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeedLimit());
    }

    public void setSpeedLimitItem(ValSpeedType target) {
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedLimit"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "patterntemplate")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "patterntemplate_nilreason"))
    })
    public TextNameType getPatternTemplateItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getPatternTemplate());
    }

    public void setPatternTemplateItem(TextNameType target) {
        setPatternTemplate(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "patternTemplate"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "turbulentair")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turbulentair_nilreason"))
    })
    public CodeYesNoType getTurbulentAirItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getTurbulentAir());
    }

    public void setTurbulentAirItem(CodeYesNoType target) {
        setTurbulentAir(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turbulentAir"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "leglengthtoward")),
        @AttributeOverride(name = "uom", column = @Column(name = "leglengthtoward_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "leglengthtoward_nilreason"))
    })
    public ValDistanceType getLegLengthTowardItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLegLengthToward());
    }

    public void setLegLengthTowardItem(ValDistanceType target) {
        setLegLengthToward(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legLengthToward"), HoldingAssessmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "leglengthaway")),
        @AttributeOverride(name = "uom", column = @Column(name = "leglengthaway_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "leglengthaway_nilreason"))
    })
    public ValDistanceType getLegLengthAwayItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLegLengthAway());
    }

    public void setLegLengthAwayItem(ValDistanceType target) {
        setLegLengthAway(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legLengthAway"), HoldingAssessmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdingpoint_id", referencedColumnName = "hjid")
    public SegmentPointPropertyType getHoldingPointItem() {
        return XmlAdapterUtils.unmarshallSource(SegmentPointPropertyType.class, this.getHoldingPoint());
    }

    public void setHoldingPointItem(SegmentPointPropertyType target) {
        setHoldingPoint(XmlAdapterUtils.marshallJAXBElement(SegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "holdingPoint"), HoldingAssessmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = UnplannedHoldingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "unplannedholding_id", referencedColumnName = "hjid")
    public UnplannedHoldingPropertyType getUnplannedHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(UnplannedHoldingPropertyType.class, this.getUnplannedHolding());
    }

    public void setUnplannedHoldingItem(UnplannedHoldingPropertyType target) {
        setUnplannedHolding(XmlAdapterUtils.marshallJAXBElement(UnplannedHoldingPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "unplannedHolding"), HoldingAssessmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = HoldingPatternPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "assessedholdingpattern_id", referencedColumnName = "hjid")
    public HoldingPatternPropertyType getAssessedHoldingPatternItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingPatternPropertyType.class, this.getAssessedHoldingPattern());
    }

    public void setAssessedHoldingPatternItem(HoldingPatternPropertyType target) {
        setAssessedHoldingPattern(XmlAdapterUtils.marshallJAXBElement(HoldingPatternPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "assessedHoldingPattern"), HoldingAssessmentTimeSliceType.class, target));
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
        final HoldingAssessmentTimeSliceType that = ((HoldingAssessmentTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetLowerLimitReference();
            boolean rhsFieldIsSet = that.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getLowerLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedLimit();
            boolean rhsFieldIsSet = that.isSetSpeedLimit();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getSpeedLimit();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getSpeedLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpperLimit();
            boolean rhsFieldIsSet = that.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getUpperLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getUpperLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLegLengthAway();
            boolean rhsFieldIsSet = that.isSetLegLengthAway();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLegLengthAway();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLegLengthAway();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "legLengthAway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "legLengthAway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObstacleAssessment();
            boolean rhsFieldIsSet = that.isSetObstacleAssessment();
            List<ObstacleAssessmentAreaPropertyType> lhsField;
            lhsField = (this.isSetObstacleAssessment()?this.getObstacleAssessment():null);
            List<ObstacleAssessmentAreaPropertyType> rhsField;
            rhsField = (that.isSetObstacleAssessment()?that.getObstacleAssessment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleAssessment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleAssessment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUnplannedHolding();
            boolean rhsFieldIsSet = that.isSetUnplannedHolding();
            JAXBElement<UnplannedHoldingPropertyType> lhsField;
            lhsField = this.getUnplannedHolding();
            JAXBElement<UnplannedHoldingPropertyType> rhsField;
            rhsField = that.getUnplannedHolding();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unplannedHolding", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unplannedHolding", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTurbulentAir();
            boolean rhsFieldIsSet = that.isSetTurbulentAir();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getTurbulentAir();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getTurbulentAir();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turbulentAir", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turbulentAir", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAssessedHoldingPattern();
            boolean rhsFieldIsSet = that.isSetAssessedHoldingPattern();
            JAXBElement<HoldingPatternPropertyType> lhsField;
            lhsField = this.getAssessedHoldingPattern();
            JAXBElement<HoldingPatternPropertyType> rhsField;
            rhsField = that.getAssessedHoldingPattern();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "assessedHoldingPattern", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "assessedHoldingPattern", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLegLengthToward();
            boolean rhsFieldIsSet = that.isSetLegLengthToward();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLegLengthToward();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLegLengthToward();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "legLengthToward", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "legLengthToward", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHoldingPoint();
            boolean rhsFieldIsSet = that.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> lhsField;
            lhsField = this.getHoldingPoint();
            JAXBElement<SegmentPointPropertyType> rhsField;
            rhsField = that.getHoldingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holdingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holdingPoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetUpperLimitReference();
            boolean rhsFieldIsSet = that.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getUpperLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<HoldingAssessmentExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<HoldingAssessmentExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimit();
            boolean rhsFieldIsSet = that.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getLowerLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getLowerLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPatternTemplate();
            boolean rhsFieldIsSet = that.isSetPatternTemplate();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getPatternTemplate();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getPatternTemplate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "patternTemplate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "patternTemplate", rhsField);
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
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedLimit();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeedLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPatternTemplate();
            JAXBElement<TextNameType> theField;
            theField = this.getPatternTemplate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "patternTemplate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurbulentAir();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getTurbulentAir();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turbulentAir", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegLengthToward();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegLengthToward();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "legLengthToward", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegLengthAway();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegLengthAway();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "legLengthAway", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getHoldingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holdingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnplannedHolding();
            JAXBElement<UnplannedHoldingPropertyType> theField;
            theField = this.getUnplannedHolding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unplannedHolding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssessedHoldingPattern();
            JAXBElement<HoldingPatternPropertyType> theField;
            theField = this.getAssessedHoldingPattern();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "assessedHoldingPattern", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleAssessment();
            List<ObstacleAssessmentAreaPropertyType> theField;
            theField = (this.isSetObstacleAssessment()?this.getObstacleAssessment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleAssessment", theField);
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
            List<HoldingAssessmentExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            strategy.appendField(locator, this, "upperLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            strategy.appendField(locator, this, "upperLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            strategy.appendField(locator, this, "lowerLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            strategy.appendField(locator, this, "lowerLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedLimit();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeedLimit();
            strategy.appendField(locator, this, "speedLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPatternTemplate();
            JAXBElement<TextNameType> theField;
            theField = this.getPatternTemplate();
            strategy.appendField(locator, this, "patternTemplate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurbulentAir();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getTurbulentAir();
            strategy.appendField(locator, this, "turbulentAir", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegLengthToward();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegLengthToward();
            strategy.appendField(locator, this, "legLengthToward", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegLengthAway();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLegLengthAway();
            strategy.appendField(locator, this, "legLengthAway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getHoldingPoint();
            strategy.appendField(locator, this, "holdingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnplannedHolding();
            JAXBElement<UnplannedHoldingPropertyType> theField;
            theField = this.getUnplannedHolding();
            strategy.appendField(locator, this, "unplannedHolding", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssessedHoldingPattern();
            JAXBElement<HoldingPatternPropertyType> theField;
            theField = this.getAssessedHoldingPattern();
            strategy.appendField(locator, this, "assessedHoldingPattern", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleAssessment();
            List<ObstacleAssessmentAreaPropertyType> theField;
            theField = (this.isSetObstacleAssessment()?this.getObstacleAssessment():null);
            strategy.appendField(locator, this, "obstacleAssessment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<HoldingAssessmentExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
