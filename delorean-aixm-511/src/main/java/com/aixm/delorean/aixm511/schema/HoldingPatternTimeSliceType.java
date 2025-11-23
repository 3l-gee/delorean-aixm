
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for HoldingPatternTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingPatternTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}HoldingPatternPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractHoldingPatternExtension"/>
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
@XmlType(name = "HoldingPatternTimeSliceType", propOrder = {
    "type",
    "outboundCourse",
    "outboundCourseType",
    "inboundCourse",
    "turnDirection",
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "speedLimit",
    "instruction",
    "nonStandardHolding",
    "outboundLegSpanEndPoint",
    "outboundLegSpanEndDistance",
    "outboundLegSpanEndTime",
    "holdingPoint",
    "extent",
    "annotation",
    "extension"
})
@Entity(name = "HoldingPatternTimeSliceType")
@Table(name = "holdingpattern_ts", schema = "holding")
public class HoldingPatternTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHoldingUsageType> type;
    @XmlElementRef(name = "outboundCourse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> outboundCourse;
    @XmlElementRef(name = "outboundCourseType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> outboundCourseType;
    @XmlElementRef(name = "inboundCourse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> inboundCourse;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
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
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "nonStandardHolding", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> nonStandardHolding;
    @XmlElementRef(name = "outboundLegSpan_endPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> outboundLegSpanEndPoint;
    @XmlElementRef(name = "outboundLegSpan_endDistance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternDistancePropertyType> outboundLegSpanEndDistance;
    @XmlElementRef(name = "outboundLegSpan_endTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternDurationPropertyType> outboundLegSpanEndTime;
    @XmlElementRef(name = "holdingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> holdingPoint;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<HoldingPatternExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUsageType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeHoldingUsageType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUsageType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeHoldingUsageType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the outboundCourse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getOutboundCourse() {
        return outboundCourse;
    }

    /**
     * Sets the value of the outboundCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setOutboundCourse(JAXBElement<ValBearingType> value) {
        this.outboundCourse = value;
    }

    @Transient
    public boolean isSetOutboundCourse() {
        return (this.outboundCourse!= null);
    }

    /**
     * Gets the value of the outboundCourseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCourseType> getOutboundCourseType() {
        return outboundCourseType;
    }

    /**
     * Sets the value of the outboundCourseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public void setOutboundCourseType(JAXBElement<CodeCourseType> value) {
        this.outboundCourseType = value;
    }

    @Transient
    public boolean isSetOutboundCourseType() {
        return (this.outboundCourseType!= null);
    }

    /**
     * Gets the value of the inboundCourse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getInboundCourse() {
        return inboundCourse;
    }

    /**
     * Sets the value of the inboundCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setInboundCourse(JAXBElement<ValBearingType> value) {
        this.inboundCourse = value;
    }

    @Transient
    public boolean isSetInboundCourse() {
        return (this.inboundCourse!= null);
    }

    /**
     * Gets the value of the turnDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionTurnType> getTurnDirection() {
        return turnDirection;
    }

    /**
     * Sets the value of the turnDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

    @Transient
    public boolean isSetTurnDirection() {
        return (this.turnDirection!= null);
    }

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
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextInstructionType> getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    @Transient
    public boolean isSetInstruction() {
        return (this.instruction!= null);
    }

    /**
     * Gets the value of the nonStandardHolding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getNonStandardHolding() {
        return nonStandardHolding;
    }

    /**
     * Sets the value of the nonStandardHolding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setNonStandardHolding(JAXBElement<CodeYesNoType> value) {
        this.nonStandardHolding = value;
    }

    @Transient
    public boolean isSetNonStandardHolding() {
        return (this.nonStandardHolding!= null);
    }

    /**
     * Gets the value of the outboundLegSpanEndPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SegmentPointPropertyType> getOutboundLegSpanEndPoint() {
        return outboundLegSpanEndPoint;
    }

    /**
     * Sets the value of the outboundLegSpanEndPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public void setOutboundLegSpanEndPoint(JAXBElement<SegmentPointPropertyType> value) {
        this.outboundLegSpanEndPoint = value;
    }

    @Transient
    public boolean isSetOutboundLegSpanEndPoint() {
        return (this.outboundLegSpanEndPoint!= null);
    }

    /**
     * Gets the value of the outboundLegSpanEndDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDistancePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<HoldingPatternDistancePropertyType> getOutboundLegSpanEndDistance() {
        return outboundLegSpanEndDistance;
    }

    /**
     * Sets the value of the outboundLegSpanEndDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDistancePropertyType }{@code >}
     *     
     */
    public void setOutboundLegSpanEndDistance(JAXBElement<HoldingPatternDistancePropertyType> value) {
        this.outboundLegSpanEndDistance = value;
    }

    @Transient
    public boolean isSetOutboundLegSpanEndDistance() {
        return (this.outboundLegSpanEndDistance!= null);
    }

    /**
     * Gets the value of the outboundLegSpanEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDurationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<HoldingPatternDurationPropertyType> getOutboundLegSpanEndTime() {
        return outboundLegSpanEndTime;
    }

    /**
     * Sets the value of the outboundLegSpanEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDurationPropertyType }{@code >}
     *     
     */
    public void setOutboundLegSpanEndTime(JAXBElement<HoldingPatternDurationPropertyType> value) {
        this.outboundLegSpanEndTime = value;
    }

    @Transient
    public boolean isSetOutboundLegSpanEndTime() {
        return (this.outboundLegSpanEndTime!= null);
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
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMCurvePropertyType> getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<AIXMCurvePropertyType> value) {
        this.extent = value;
    }

    @Transient
    public boolean isSetExtent() {
        return (this.extent!= null);
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
    @JoinTable(name = "annotation_holdingpattern_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "holdingpatternpropertygroup", referencedColumnName = "hjid")
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
     * {@link HoldingPatternExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = HoldingPatternExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_HOLDING_PATTERN_TI_0")
    public List<HoldingPatternExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<HoldingPatternExtensionType> extension) {
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
    public CodeHoldingUsageType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHoldingUsageType.class, this.getType());
    }

    public void setTypeItem(CodeHoldingUsageType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeHoldingUsageType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "outboundcourse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outboundcourse_nilreason"))
    })
    public ValBearingType getOutboundCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getOutboundCourse());
    }

    public void setOutboundCourseItem(ValBearingType target) {
        setOutboundCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundCourse"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "outboundcoursetype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outboundcoursetype_nilreason"))
    })
    public CodeCourseType getOutboundCourseTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseType.class, this.getOutboundCourseType());
    }

    public void setOutboundCourseTypeItem(CodeCourseType target) {
        setOutboundCourseType(XmlAdapterUtils.marshallJAXBElement(CodeCourseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundCourseType"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "inboundcourse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "inboundcourse_nilreason"))
    })
    public ValBearingType getInboundCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getInboundCourse());
    }

    public void setInboundCourseItem(ValBearingType target) {
        setInboundCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "inboundCourse"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "turndirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turndirection_nilreason"))
    })
    public CodeDirectionTurnType getTurnDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getTurnDirection());
    }

    public void setTurnDirectionItem(CodeDirectionTurnType target) {
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnDirection"), HoldingPatternTimeSliceType.class, target));
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
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimit"), HoldingPatternTimeSliceType.class, target));
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
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitReference"), HoldingPatternTimeSliceType.class, target));
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
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimit"), HoldingPatternTimeSliceType.class, target));
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
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitReference"), HoldingPatternTimeSliceType.class, target));
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
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedLimit"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "instruction")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "instruction_nilreason"))
    })
    public TextInstructionType getInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getInstruction());
    }

    public void setInstructionItem(TextInstructionType target) {
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instruction"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "nonstandardholding")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "nonstandardholding_nilreason"))
    })
    public CodeYesNoType getNonStandardHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getNonStandardHolding());
    }

    public void setNonStandardHoldingItem(CodeYesNoType target) {
        setNonStandardHolding(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "nonStandardHolding"), HoldingPatternTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "outboundlegspan_endpoint_id", referencedColumnName = "hjid")
    public SegmentPointPropertyType getOutboundLegSpanEndPointItem() {
        return XmlAdapterUtils.unmarshallSource(SegmentPointPropertyType.class, this.getOutboundLegSpanEndPoint());
    }

    public void setOutboundLegSpanEndPointItem(SegmentPointPropertyType target) {
        setOutboundLegSpanEndPoint(XmlAdapterUtils.marshallJAXBElement(SegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundLegSpan_endPoint"), HoldingPatternTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = HoldingPatternDistancePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "outboundlegspan_enddistance_id", referencedColumnName = "hjid")
    public HoldingPatternDistancePropertyType getOutboundLegSpanEndDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingPatternDistancePropertyType.class, this.getOutboundLegSpanEndDistance());
    }

    public void setOutboundLegSpanEndDistanceItem(HoldingPatternDistancePropertyType target) {
        setOutboundLegSpanEndDistance(XmlAdapterUtils.marshallJAXBElement(HoldingPatternDistancePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundLegSpan_endDistance"), HoldingPatternTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = HoldingPatternDurationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "outboundlegspan_endtime_id", referencedColumnName = "hjid")
    public HoldingPatternDurationPropertyType getOutboundLegSpanEndTimeItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingPatternDurationPropertyType.class, this.getOutboundLegSpanEndTime());
    }

    public void setOutboundLegSpanEndTimeItem(HoldingPatternDurationPropertyType target) {
        setOutboundLegSpanEndTime(XmlAdapterUtils.marshallJAXBElement(HoldingPatternDurationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outboundLegSpan_endTime"), HoldingPatternTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdingpoint_id", referencedColumnName = "hjid")
    public SegmentPointPropertyType getHoldingPointItem() {
        return XmlAdapterUtils.unmarshallSource(SegmentPointPropertyType.class, this.getHoldingPoint());
    }

    public void setHoldingPointItem(SegmentPointPropertyType target) {
        setHoldingPoint(XmlAdapterUtils.marshallJAXBElement(SegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "holdingPoint"), HoldingPatternTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_id", referencedColumnName = "hjid")
    public AIXMCurvePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMCurvePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent"), HoldingPatternTimeSliceType.class, target));
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
        final HoldingPatternTimeSliceType that = ((HoldingPatternTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<HoldingPatternExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<HoldingPatternExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTurnDirection();
            boolean rhsFieldIsSet = that.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> lhsField;
            lhsField = this.getTurnDirection();
            JAXBElement<CodeDirectionTurnType> rhsField;
            rhsField = that.getTurnDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turnDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turnDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOutboundCourseType();
            boolean rhsFieldIsSet = that.isSetOutboundCourseType();
            JAXBElement<CodeCourseType> lhsField;
            lhsField = this.getOutboundCourseType();
            JAXBElement<CodeCourseType> rhsField;
            rhsField = that.getOutboundCourseType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundCourseType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundCourseType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOutboundCourse();
            boolean rhsFieldIsSet = that.isSetOutboundCourse();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getOutboundCourse();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getOutboundCourse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundCourse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundCourse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetOutboundLegSpanEndTime();
            boolean rhsFieldIsSet = that.isSetOutboundLegSpanEndTime();
            JAXBElement<HoldingPatternDurationPropertyType> lhsField;
            lhsField = this.getOutboundLegSpanEndTime();
            JAXBElement<HoldingPatternDurationPropertyType> rhsField;
            rhsField = that.getOutboundLegSpanEndTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundLegSpanEndTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundLegSpanEndTime", rhsField);
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
            boolean lhsFieldIsSet = this.isSetInboundCourse();
            boolean rhsFieldIsSet = that.isSetInboundCourse();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getInboundCourse();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getInboundCourse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "inboundCourse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "inboundCourse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            JAXBElement<AIXMCurvePropertyType> lhsField;
            lhsField = this.getExtent();
            JAXBElement<AIXMCurvePropertyType> rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNonStandardHolding();
            boolean rhsFieldIsSet = that.isSetNonStandardHolding();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getNonStandardHolding();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getNonStandardHolding();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nonStandardHolding", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nonStandardHolding", rhsField);
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
            boolean lhsFieldIsSet = this.isSetOutboundLegSpanEndDistance();
            boolean rhsFieldIsSet = that.isSetOutboundLegSpanEndDistance();
            JAXBElement<HoldingPatternDistancePropertyType> lhsField;
            lhsField = this.getOutboundLegSpanEndDistance();
            JAXBElement<HoldingPatternDistancePropertyType> rhsField;
            rhsField = that.getOutboundLegSpanEndDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundLegSpanEndDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundLegSpanEndDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOutboundLegSpanEndPoint();
            boolean rhsFieldIsSet = that.isSetOutboundLegSpanEndPoint();
            JAXBElement<SegmentPointPropertyType> lhsField;
            lhsField = this.getOutboundLegSpanEndPoint();
            JAXBElement<SegmentPointPropertyType> rhsField;
            rhsField = that.getOutboundLegSpanEndPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outboundLegSpanEndPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outboundLegSpanEndPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInstruction();
            boolean rhsFieldIsSet = that.isSetInstruction();
            JAXBElement<TextInstructionType> lhsField;
            lhsField = this.getInstruction();
            JAXBElement<TextInstructionType> rhsField;
            rhsField = that.getInstruction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "instruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "instruction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeHoldingUsageType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeHoldingUsageType> rhsField;
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
            JAXBElement<CodeHoldingUsageType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getOutboundCourse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundCourse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getOutboundCourseType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundCourseType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getInboundCourse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "inboundCourse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turnDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getInstruction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "instruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNonStandardHolding();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getNonStandardHolding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nonStandardHolding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getOutboundLegSpanEndPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundLegSpanEndPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndDistance();
            JAXBElement<HoldingPatternDistancePropertyType> theField;
            theField = this.getOutboundLegSpanEndDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundLegSpanEndDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndTime();
            JAXBElement<HoldingPatternDurationPropertyType> theField;
            theField = this.getOutboundLegSpanEndTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundLegSpanEndTime", theField);
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
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
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
            List<HoldingPatternExtensionType> theField;
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
            JAXBElement<CodeHoldingUsageType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getOutboundCourse();
            strategy.appendField(locator, this, "outboundCourse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getOutboundCourseType();
            strategy.appendField(locator, this, "outboundCourseType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInboundCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getInboundCourse();
            strategy.appendField(locator, this, "inboundCourse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            strategy.appendField(locator, this, "turnDirection", buffer, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getInstruction();
            strategy.appendField(locator, this, "instruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNonStandardHolding();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getNonStandardHolding();
            strategy.appendField(locator, this, "nonStandardHolding", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getOutboundLegSpanEndPoint();
            strategy.appendField(locator, this, "outboundLegSpanEndPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndDistance();
            JAXBElement<HoldingPatternDistancePropertyType> theField;
            theField = this.getOutboundLegSpanEndDistance();
            strategy.appendField(locator, this, "outboundLegSpanEndDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndTime();
            JAXBElement<HoldingPatternDurationPropertyType> theField;
            theField = this.getOutboundLegSpanEndTime();
            strategy.appendField(locator, this, "outboundLegSpanEndTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getHoldingPoint();
            strategy.appendField(locator, this, "holdingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<HoldingPatternExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
