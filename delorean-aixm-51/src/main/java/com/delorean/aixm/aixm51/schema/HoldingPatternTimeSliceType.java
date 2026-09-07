
package com.delorean.aixm.aixm51.schema;

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
 * <p>Java class for HoldingPatternTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingPatternTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="type" type="{http://www.aixm.aero/schema/5.1}CodeHoldingUsageType" minOccurs="0"/>
 *         <element name="outboundCourse" type="{http://www.aixm.aero/schema/5.1}ValBearingType" minOccurs="0"/>
 *         <element name="outboundCourseType" type="{http://www.aixm.aero/schema/5.1}CodeCourseType" minOccurs="0"/>
 *         <element name="inboundCourse" type="{http://www.aixm.aero/schema/5.1}ValBearingType" minOccurs="0"/>
 *         <element name="turnDirection" type="{http://www.aixm.aero/schema/5.1}CodeDirectionTurnType" minOccurs="0"/>
 *         <element name="upperLimit" type="{http://www.aixm.aero/schema/5.1}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="upperLimitReference" type="{http://www.aixm.aero/schema/5.1}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="lowerLimit" type="{http://www.aixm.aero/schema/5.1}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="lowerLimitReference" type="{http://www.aixm.aero/schema/5.1}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="speedLimit" type="{http://www.aixm.aero/schema/5.1}ValSpeedType" minOccurs="0"/>
 *         <element name="instruction" type="{http://www.aixm.aero/schema/5.1}TextInstructionType" minOccurs="0"/>
 *         <element name="nonStandardHolding" type="{http://www.aixm.aero/schema/5.1}CodeYesNoType" minOccurs="0"/>
 *         <choice>
 *           <element name="outboundLegSpan_endTime" type="{http://www.aixm.aero/schema/5.1}HoldingPatternDurationPropertyType" minOccurs="0"/>
 *           <element name="outboundLegSpan_endDistance" type="{http://www.aixm.aero/schema/5.1}HoldingPatternDistancePropertyType" minOccurs="0"/>
 *           <element name="outboundLegSpan_endPoint" type="{http://www.aixm.aero/schema/5.1}SegmentPointPropertyType" minOccurs="0"/>
 *         </choice>
 *         <element name="holdingPoint" type="{http://www.aixm.aero/schema/5.1}SegmentPointPropertyType" minOccurs="0"/>
 *         <element name="extent" type="{http://www.aixm.aero/schema/5.1}CurvePropertyType" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingPatternExtension"/>
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
    "outboundLegSpanEndTime",
    "outboundLegSpanEndDistance",
    "outboundLegSpanEndPoint",
    "holdingPoint",
    "extent",
    "annotation",
    "extension"
})
@Entity(name = "HoldingPatternTimeSliceType")
@Table(name = "holdingpattern_t", schema = "holding")
public class HoldingPatternTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHoldingUsageType> type;
    @XmlElementRef(name = "outboundCourse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> outboundCourse;
    @XmlElementRef(name = "outboundCourseType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> outboundCourseType;
    @XmlElementRef(name = "inboundCourse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> inboundCourse;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "nonStandardHolding", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> nonStandardHolding;
    @XmlElementRef(name = "outboundLegSpan_endTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternDurationPropertyType> outboundLegSpanEndTime;
    @XmlElementRef(name = "outboundLegSpan_endDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternDistancePropertyType> outboundLegSpanEndDistance;
    @XmlElementRef(name = "outboundLegSpan_endPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> outboundLegSpanEndPoint;
    @XmlElementRef(name = "holdingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> holdingPoint;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<HoldingPatternTimeSliceExtensionType> extension;

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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hldngpttrntmslctp_annttn_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "holdingpattern_t_hjid", referencedColumnName = "hjid")
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
     * {@link HoldingPatternTimeSliceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = HoldingPatternTimeSliceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdingpattern_te_hjid", referencedColumnName = "hjid")
    public List<HoldingPatternTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<HoldingPatternTimeSliceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type", columnDefinition = "codeholdingusagebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason", columnDefinition = "nilreason"))
    })
    public CodeHoldingUsageType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHoldingUsageType.class, this.getType());
    }

    public void setTypeItem(CodeHoldingUsageType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeHoldingUsageType.class, new QName("http://www.aixm.aero/schema/5.1", "type"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "outboundcourse", columnDefinition = "valbearingbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outboundcoursenilreason", columnDefinition = "nilreason"))
    })
    public ValBearingType getOutboundCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getOutboundCourse());
    }

    public void setOutboundCourseItem(ValBearingType target) {
        setOutboundCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1", "outboundCourse"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "outboundcoursetype", columnDefinition = "codecoursebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outboundcoursetypenilreason", columnDefinition = "nilreason"))
    })
    public CodeCourseType getOutboundCourseTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseType.class, this.getOutboundCourseType());
    }

    public void setOutboundCourseTypeItem(CodeCourseType target) {
        setOutboundCourseType(XmlAdapterUtils.marshallJAXBElement(CodeCourseType.class, new QName("http://www.aixm.aero/schema/5.1", "outboundCourseType"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "inboundcourse", columnDefinition = "valbearingbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "inboundcoursenilreason", columnDefinition = "nilreason"))
    })
    public ValBearingType getInboundCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getInboundCourse());
    }

    public void setInboundCourseItem(ValBearingType target) {
        setInboundCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1", "inboundCourse"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "turndirection", columnDefinition = "codedirectionturnbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turndirectionnilreason", columnDefinition = "nilreason"))
    })
    public CodeDirectionTurnType getTurnDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getTurnDirection());
    }

    public void setTurnDirectionItem(CodeDirectionTurnType target) {
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1", "turnDirection"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlimit", columnDefinition = "valdistanceverticalbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "upperlimituom", columnDefinition = "uomdistancevertical")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceVerticalType getUpperLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimit());
    }

    public void setUpperLimitItem(ValDistanceVerticalType target) {
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1", "upperLimit"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlimitreference", columnDefinition = "codeverticalreferencebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitreferencenilreason", columnDefinition = "nilreason"))
    })
    public CodeVerticalReferenceType getUpperLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLimitReference());
    }

    public void setUpperLimitReferenceItem(CodeVerticalReferenceType target) {
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1", "upperLimitReference"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimit", columnDefinition = "valdistanceverticalbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "lowerlimituom", columnDefinition = "uomdistancevertical")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceVerticalType getLowerLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimit());
    }

    public void setLowerLimitItem(ValDistanceVerticalType target) {
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1", "lowerLimit"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimitreference", columnDefinition = "codeverticalreferencebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitreferencenilreason", columnDefinition = "nilreason"))
    })
    public CodeVerticalReferenceType getLowerLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLimitReference());
    }

    public void setLowerLimitReferenceItem(CodeVerticalReferenceType target) {
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1", "lowerLimitReference"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedlimit", columnDefinition = "valspeedbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "speedlimituom", columnDefinition = "uomspeed")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedlimitnilreason", columnDefinition = "nilreason"))
    })
    public ValSpeedType getSpeedLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeedLimit());
    }

    public void setSpeedLimitItem(ValSpeedType target) {
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1", "speedLimit"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "instruction", columnDefinition = "character2")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "instructionnilreason", columnDefinition = "nilreason"))
    })
    public TextInstructionType getInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getInstruction());
    }

    public void setInstructionItem(TextInstructionType target) {
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1", "instruction"), HoldingPatternTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "nonstandardholding", columnDefinition = "codeyesnobase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "nonstandardholdingnilreason", columnDefinition = "nilreason"))
    })
    public CodeYesNoType getNonStandardHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getNonStandardHolding());
    }

    public void setNonStandardHoldingItem(CodeYesNoType target) {
        setNonStandardHolding(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1", "nonStandardHolding"), HoldingPatternTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = HoldingPatternDurationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hldngpttrntmslctp_otbndlgspnendtm_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "holdingpattern_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "outboundlegspanendtime_hjid", referencedColumnName = "hjid")
    })
    public HoldingPatternDurationPropertyType getOutboundLegSpanEndTimeItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingPatternDurationPropertyType.class, this.getOutboundLegSpanEndTime());
    }

    public void setOutboundLegSpanEndTimeItem(HoldingPatternDurationPropertyType target) {
        setOutboundLegSpanEndTime(XmlAdapterUtils.marshallJAXBElement(HoldingPatternDurationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1", "outboundLegSpan_endTime"), HoldingPatternTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = HoldingPatternDistancePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hldngpttrntmslctp_otbndlgspnenddstnc_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "holdingpattern_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "outboundlegspanenddistance_hjid", referencedColumnName = "hjid")
    })
    public HoldingPatternDistancePropertyType getOutboundLegSpanEndDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingPatternDistancePropertyType.class, this.getOutboundLegSpanEndDistance());
    }

    public void setOutboundLegSpanEndDistanceItem(HoldingPatternDistancePropertyType target) {
        setOutboundLegSpanEndDistance(XmlAdapterUtils.marshallJAXBElement(HoldingPatternDistancePropertyType.class, new QName("http://www.aixm.aero/schema/5.1", "outboundLegSpan_endDistance"), HoldingPatternTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hldngpttrntmslctp_otbndlgspnendpnt_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "holdingpattern_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "outboundlegspanendpoint_hjid", referencedColumnName = "hjid")
    })
    public SegmentPointPropertyType getOutboundLegSpanEndPointItem() {
        return XmlAdapterUtils.unmarshallSource(SegmentPointPropertyType.class, this.getOutboundLegSpanEndPoint());
    }

    public void setOutboundLegSpanEndPointItem(SegmentPointPropertyType target) {
        setOutboundLegSpanEndPoint(XmlAdapterUtils.marshallJAXBElement(SegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1", "outboundLegSpan_endPoint"), HoldingPatternTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hldngpttrntmslctp_hldngpnt_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "holdingpattern_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "holdingpoint_hjid", referencedColumnName = "hjid")
    })
    public SegmentPointPropertyType getHoldingPointItem() {
        return XmlAdapterUtils.unmarshallSource(SegmentPointPropertyType.class, this.getHoldingPoint());
    }

    public void setHoldingPointItem(SegmentPointPropertyType target) {
        setHoldingPoint(XmlAdapterUtils.marshallJAXBElement(SegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1", "holdingPoint"), HoldingPatternTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hldngpttrntmslctp_extnt_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "holdingpattern_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "extent_hjid", referencedColumnName = "hjid")
    })
    public AIXMCurvePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMCurvePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1", "extent"), HoldingPatternTimeSliceType.class, target));
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<HoldingPatternTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<HoldingPatternTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndTime();
            JAXBElement<HoldingPatternDurationPropertyType> theField;
            theField = this.getOutboundLegSpanEndTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundLegSpanEndTime", theField);
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
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getOutboundLegSpanEndPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outboundLegSpanEndPoint", theField);
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
            List<HoldingPatternTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndTime();
            JAXBElement<HoldingPatternDurationPropertyType> theField;
            theField = this.getOutboundLegSpanEndTime();
            strategy.appendField(locator, this, "outboundLegSpanEndTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndDistance();
            JAXBElement<HoldingPatternDistancePropertyType> theField;
            theField = this.getOutboundLegSpanEndDistance();
            strategy.appendField(locator, this, "outboundLegSpanEndDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOutboundLegSpanEndPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getOutboundLegSpanEndPoint();
            strategy.appendField(locator, this, "outboundLegSpanEndPoint", buffer, theField, theFieldIsSet);
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
            List<HoldingPatternTimeSliceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
