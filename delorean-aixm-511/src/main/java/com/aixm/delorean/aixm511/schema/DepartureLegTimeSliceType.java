
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
 * <p>Java class for DepartureLegTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DepartureLegTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}DepartureLegPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractDepartureLegExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSegmentLegExtension"/>
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
@XmlType(name = "DepartureLegTimeSliceType", propOrder = {
    "endConditionDesignator",
    "legPath",
    "legTypeARINC",
    "course",
    "courseType",
    "courseDirection",
    "turnDirection",
    "speedLimit",
    "speedReference",
    "speedInterpretation",
    "bankAngle",
    "length",
    "duration",
    "procedureTurnRequired",
    "upperLimitAltitude",
    "upperLimitReference",
    "lowerLimitAltitude",
    "lowerLimitReference",
    "altitudeInterpretation",
    "altitudeOverrideATC",
    "altitudeOverrideReference",
    "verticalAngle",
    "startPoint",
    "endPoint",
    "trajectory",
    "arcCentre",
    "angle",
    "distance",
    "aircraftCategory",
    "holding",
    "designSurface",
    "annotation",
    "requiredNavigationPerformance",
    "minimumObstacleClearanceAltitude",
    "departure",
    "condition",
    "extension"
})
@Entity(name = "DepartureLegTimeSliceType")
@Table(name = "departureleg_ts", schema = "procedure")
public class DepartureLegTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "endConditionDesignator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSegmentTerminationType> endConditionDesignator;
    @XmlElementRef(name = "legPath", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTrajectoryType> legPath;
    @XmlElementRef(name = "legTypeARINC", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSegmentPathType> legTypeARINC;
    @XmlElementRef(name = "course", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> course;
    @XmlElementRef(name = "courseType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> courseType;
    @XmlElementRef(name = "courseDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionReferenceType> courseDirection;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "speedInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> speedInterpretation;
    @XmlElementRef(name = "bankAngle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> bankAngle;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "duration", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> duration;
    @XmlElementRef(name = "procedureTurnRequired", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> procedureTurnRequired;
    @XmlElementRef(name = "upperLimitAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimitAltitude;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimitAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimitAltitude;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "altitudeInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> altitudeInterpretation;
    @XmlElementRef(name = "altitudeOverrideATC", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitudeOverrideATC;
    @XmlElementRef(name = "altitudeOverrideReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeOverrideReference;
    @XmlElementRef(name = "verticalAngle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> verticalAngle;
    @XmlElementRef(name = "startPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> startPoint;
    @XmlElementRef(name = "endPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> endPoint;
    @XmlElementRef(name = "trajectory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> trajectory;
    @XmlElementRef(name = "arcCentre", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> arcCentre;
    @XmlElementRef(name = "angle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleIndicationPropertyType> angle;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceIndicationPropertyType> distance;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElementRef(name = "holding", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingUsePropertyType> holding;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "requiredNavigationPerformance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRNPType> requiredNavigationPerformance;
    @XmlElementRef(name = "minimumObstacleClearanceAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumObstacleClearanceAltitude;
    @XmlElementRef(name = "departure", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> departure;
    @XmlElement(nillable = true)
    protected List<DepartureArrivalConditionPropertyType> condition;
    protected List<DepartureLegExtensionType> extension;

    /**
     * Gets the value of the endConditionDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentTerminationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSegmentTerminationType> getEndConditionDesignator() {
        return endConditionDesignator;
    }

    /**
     * Sets the value of the endConditionDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentTerminationType }{@code >}
     *     
     */
    public void setEndConditionDesignator(JAXBElement<CodeSegmentTerminationType> value) {
        this.endConditionDesignator = value;
    }

    @Transient
    public boolean isSetEndConditionDesignator() {
        return (this.endConditionDesignator!= null);
    }

    /**
     * Gets the value of the legPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTrajectoryType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTrajectoryType> getLegPath() {
        return legPath;
    }

    /**
     * Sets the value of the legPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTrajectoryType }{@code >}
     *     
     */
    public void setLegPath(JAXBElement<CodeTrajectoryType> value) {
        this.legPath = value;
    }

    @Transient
    public boolean isSetLegPath() {
        return (this.legPath!= null);
    }

    /**
     * Gets the value of the legTypeARINC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentPathType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSegmentPathType> getLegTypeARINC() {
        return legTypeARINC;
    }

    /**
     * Sets the value of the legTypeARINC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentPathType }{@code >}
     *     
     */
    public void setLegTypeARINC(JAXBElement<CodeSegmentPathType> value) {
        this.legTypeARINC = value;
    }

    @Transient
    public boolean isSetLegTypeARINC() {
        return (this.legTypeARINC!= null);
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCourse(JAXBElement<ValBearingType> value) {
        this.course = value;
    }

    @Transient
    public boolean isSetCourse() {
        return (this.course!= null);
    }

    /**
     * Gets the value of the courseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCourseType> getCourseType() {
        return courseType;
    }

    /**
     * Sets the value of the courseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public void setCourseType(JAXBElement<CodeCourseType> value) {
        this.courseType = value;
    }

    @Transient
    public boolean isSetCourseType() {
        return (this.courseType!= null);
    }

    /**
     * Gets the value of the courseDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionReferenceType> getCourseDirection() {
        return courseDirection;
    }

    /**
     * Sets the value of the courseDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public void setCourseDirection(JAXBElement<CodeDirectionReferenceType> value) {
        this.courseDirection = value;
    }

    @Transient
    public boolean isSetCourseDirection() {
        return (this.courseDirection!= null);
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
     * Gets the value of the speedReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSpeedReferenceType> getSpeedReference() {
        return speedReference;
    }

    /**
     * Sets the value of the speedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    @Transient
    public boolean isSetSpeedReference() {
        return (this.speedReference!= null);
    }

    /**
     * Gets the value of the speedInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAltitudeUseType> getSpeedInterpretation() {
        return speedInterpretation;
    }

    /**
     * Sets the value of the speedInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public void setSpeedInterpretation(JAXBElement<CodeAltitudeUseType> value) {
        this.speedInterpretation = value;
    }

    @Transient
    public boolean isSetSpeedInterpretation() {
        return (this.speedInterpretation!= null);
    }

    /**
     * Gets the value of the bankAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getBankAngle() {
        return bankAngle;
    }

    /**
     * Sets the value of the bankAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setBankAngle(JAXBElement<ValAngleType> value) {
        this.bankAngle = value;
    }

    @Transient
    public boolean isSetBankAngle() {
        return (this.bankAngle!= null);
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
     * Gets the value of the procedureTurnRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getProcedureTurnRequired() {
        return procedureTurnRequired;
    }

    /**
     * Sets the value of the procedureTurnRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setProcedureTurnRequired(JAXBElement<CodeYesNoType> value) {
        this.procedureTurnRequired = value;
    }

    @Transient
    public boolean isSetProcedureTurnRequired() {
        return (this.procedureTurnRequired!= null);
    }

    /**
     * Gets the value of the upperLimitAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getUpperLimitAltitude() {
        return upperLimitAltitude;
    }

    /**
     * Sets the value of the upperLimitAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimitAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimitAltitude = value;
    }

    @Transient
    public boolean isSetUpperLimitAltitude() {
        return (this.upperLimitAltitude!= null);
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
     * Gets the value of the lowerLimitAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getLowerLimitAltitude() {
        return lowerLimitAltitude;
    }

    /**
     * Sets the value of the lowerLimitAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimitAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimitAltitude = value;
    }

    @Transient
    public boolean isSetLowerLimitAltitude() {
        return (this.lowerLimitAltitude!= null);
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
     * Gets the value of the altitudeInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAltitudeUseType> getAltitudeInterpretation() {
        return altitudeInterpretation;
    }

    /**
     * Sets the value of the altitudeInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public void setAltitudeInterpretation(JAXBElement<CodeAltitudeUseType> value) {
        this.altitudeInterpretation = value;
    }

    @Transient
    public boolean isSetAltitudeInterpretation() {
        return (this.altitudeInterpretation!= null);
    }

    /**
     * Gets the value of the altitudeOverrideATC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getAltitudeOverrideATC() {
        return altitudeOverrideATC;
    }

    /**
     * Sets the value of the altitudeOverrideATC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitudeOverrideATC(JAXBElement<ValDistanceVerticalType> value) {
        this.altitudeOverrideATC = value;
    }

    @Transient
    public boolean isSetAltitudeOverrideATC() {
        return (this.altitudeOverrideATC!= null);
    }

    /**
     * Gets the value of the altitudeOverrideReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getAltitudeOverrideReference() {
        return altitudeOverrideReference;
    }

    /**
     * Sets the value of the altitudeOverrideReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setAltitudeOverrideReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeOverrideReference = value;
    }

    @Transient
    public boolean isSetAltitudeOverrideReference() {
        return (this.altitudeOverrideReference!= null);
    }

    /**
     * Gets the value of the verticalAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValAngleType> getVerticalAngle() {
        return verticalAngle;
    }

    /**
     * Sets the value of the verticalAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setVerticalAngle(JAXBElement<ValAngleType> value) {
        this.verticalAngle = value;
    }

    @Transient
    public boolean isSetVerticalAngle() {
        return (this.verticalAngle!= null);
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TerminalSegmentPointPropertyType> getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setStartPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.startPoint = value;
    }

    @Transient
    public boolean isSetStartPoint() {
        return (this.startPoint!= null);
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TerminalSegmentPointPropertyType> getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setEndPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.endPoint = value;
    }

    @Transient
    public boolean isSetEndPoint() {
        return (this.endPoint!= null);
    }

    /**
     * Gets the value of the trajectory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMCurvePropertyType> getTrajectory() {
        return trajectory;
    }

    /**
     * Sets the value of the trajectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    public void setTrajectory(JAXBElement<AIXMCurvePropertyType> value) {
        this.trajectory = value;
    }

    @Transient
    public boolean isSetTrajectory() {
        return (this.trajectory!= null);
    }

    /**
     * Gets the value of the arcCentre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TerminalSegmentPointPropertyType> getArcCentre() {
        return arcCentre;
    }

    /**
     * Sets the value of the arcCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setArcCentre(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.arcCentre = value;
    }

    @Transient
    public boolean isSetArcCentre() {
        return (this.arcCentre!= null);
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleIndicationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AngleIndicationPropertyType> getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleIndicationPropertyType }{@code >}
     *     
     */
    public void setAngle(JAXBElement<AngleIndicationPropertyType> value) {
        this.angle = value;
    }

    @Transient
    public boolean isSetAngle() {
        return (this.angle!= null);
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DistanceIndicationPropertyType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationPropertyType }{@code >}
     *     
     */
    public void setDistance(JAXBElement<DistanceIndicationPropertyType> value) {
        this.distance = value;
    }

    @Transient
    public boolean isSetDistance() {
        return (this.distance!= null);
    }

    /**
     * Gets the value of the aircraftCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "aircraftcategory_departureleg_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "aircraftcategory", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "departurelegpropertygroup", referencedColumnName = "hjid")
    })
    public List<AircraftCharacteristicPropertyType> getAircraftCategory() {
        if (aircraftCategory == null) {
            aircraftCategory = new ArrayList<>();
        }
        return this.aircraftCategory;
    }

    /**
     * 
     * 
     */
    public void setAircraftCategory(List<AircraftCharacteristicPropertyType> aircraftCategory) {
        this.aircraftCategory = aircraftCategory;
    }

    @Transient
    public boolean isSetAircraftCategory() {
        return ((this.aircraftCategory!= null)&&(!this.aircraftCategory.isEmpty()));
    }

    public void unsetAircraftCategory() {
        this.aircraftCategory = null;
    }

    /**
     * Gets the value of the holding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingUsePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<HoldingUsePropertyType> getHolding() {
        return holding;
    }

    /**
     * Sets the value of the holding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingUsePropertyType }{@code >}
     *     
     */
    public void setHolding(JAXBElement<HoldingUsePropertyType> value) {
        this.holding = value;
    }

    @Transient
    public boolean isSetHolding() {
        return (this.holding!= null);
    }

    /**
     * Gets the value of the designSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignSurface().add(newItem);
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
    @JoinTable(name = "designsurface_departureleg_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "designsurface", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "departurelegpropertygroup", referencedColumnName = "hjid")
    })
    public List<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<>();
        }
        return this.designSurface;
    }

    /**
     * 
     * 
     */
    public void setDesignSurface(List<ObstacleAssessmentAreaPropertyType> designSurface) {
        this.designSurface = designSurface;
    }

    @Transient
    public boolean isSetDesignSurface() {
        return ((this.designSurface!= null)&&(!this.designSurface.isEmpty()));
    }

    public void unsetDesignSurface() {
        this.designSurface = null;
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
    @JoinTable(name = "annotation_departureleg_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "departurelegpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the requiredNavigationPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRNPType> getRequiredNavigationPerformance() {
        return requiredNavigationPerformance;
    }

    /**
     * Sets the value of the requiredNavigationPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public void setRequiredNavigationPerformance(JAXBElement<CodeRNPType> value) {
        this.requiredNavigationPerformance = value;
    }

    @Transient
    public boolean isSetRequiredNavigationPerformance() {
        return (this.requiredNavigationPerformance!= null);
    }

    /**
     * Gets the value of the minimumObstacleClearanceAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumObstacleClearanceAltitude() {
        return minimumObstacleClearanceAltitude;
    }

    /**
     * Sets the value of the minimumObstacleClearanceAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumObstacleClearanceAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumObstacleClearanceAltitude = value;
    }

    @Transient
    public boolean isSetMinimumObstacleClearanceAltitude() {
        return (this.minimumObstacleClearanceAltitude!= null);
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardInstrumentDeparturePropertyType> getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setDeparture(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.departure = value;
    }

    @Transient
    public boolean isSetDeparture() {
        return (this.departure!= null);
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartureArrivalConditionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = DepartureArrivalConditionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "condition_departureleg_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "condition", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "departurelegpropertygroup", referencedColumnName = "hjid")
    })
    public List<DepartureArrivalConditionPropertyType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<>();
        }
        return this.condition;
    }

    /**
     * 
     * 
     */
    public void setCondition(List<DepartureArrivalConditionPropertyType> condition) {
        this.condition = condition;
    }

    @Transient
    public boolean isSetCondition() {
        return ((this.condition!= null)&&(!this.condition.isEmpty()));
    }

    public void unsetCondition() {
        this.condition = null;
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
     * {@link DepartureLegExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = DepartureLegExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<DepartureLegExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<DepartureLegExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "endconditiondesignator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "endconditiondesignator_nilreason"))
    })
    public CodeSegmentTerminationType getEndConditionDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSegmentTerminationType.class, this.getEndConditionDesignator());
    }

    public void setEndConditionDesignatorItem(CodeSegmentTerminationType target) {
        setEndConditionDesignator(XmlAdapterUtils.marshallJAXBElement(CodeSegmentTerminationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endConditionDesignator"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "legpath")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "legpath_nilreason"))
    })
    public CodeTrajectoryType getLegPathItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTrajectoryType.class, this.getLegPath());
    }

    public void setLegPathItem(CodeTrajectoryType target) {
        setLegPath(XmlAdapterUtils.marshallJAXBElement(CodeTrajectoryType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legPath"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "legtypearinc")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "legtypearinc_nilreason"))
    })
    public CodeSegmentPathType getLegTypeARINCItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSegmentPathType.class, this.getLegTypeARINC());
    }

    public void setLegTypeARINCItem(CodeSegmentPathType target) {
        setLegTypeARINC(XmlAdapterUtils.marshallJAXBElement(CodeSegmentPathType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legTypeARINC"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "course")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "course_nilreason"))
    })
    public ValBearingType getCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getCourse());
    }

    public void setCourseItem(ValBearingType target) {
        setCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "course"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coursetype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coursetype_nilreason"))
    })
    public CodeCourseType getCourseTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseType.class, this.getCourseType());
    }

    public void setCourseTypeItem(CodeCourseType target) {
        setCourseType(XmlAdapterUtils.marshallJAXBElement(CodeCourseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseType"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coursedirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coursedirection_nilreason"))
    })
    public CodeDirectionReferenceType getCourseDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionReferenceType.class, this.getCourseDirection());
    }

    public void setCourseDirectionItem(CodeDirectionReferenceType target) {
        setCourseDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseDirection"), DepartureLegTimeSliceType.class, target));
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
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnDirection"), DepartureLegTimeSliceType.class, target));
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
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedLimit"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedreference_nilreason"))
    })
    public CodeSpeedReferenceType getSpeedReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpeedReferenceType.class, this.getSpeedReference());
    }

    public void setSpeedReferenceItem(CodeSpeedReferenceType target) {
        setSpeedReference(XmlAdapterUtils.marshallJAXBElement(CodeSpeedReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedReference"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedinterpretation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedinterpretation_nilreason"))
    })
    public CodeAltitudeUseType getSpeedInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAltitudeUseType.class, this.getSpeedInterpretation());
    }

    public void setSpeedInterpretationItem(CodeAltitudeUseType target) {
        setSpeedInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedInterpretation"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "bankangle")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "bankangle_nilreason"))
    })
    public ValAngleType getBankAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getBankAngle());
    }

    public void setBankAngleItem(ValAngleType target) {
        setBankAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "bankAngle"), DepartureLegTimeSliceType.class, target));
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
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "length"), DepartureLegTimeSliceType.class, target));
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
        setDuration(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "duration"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "procedureturnrequired")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "procedureturnrequired_nilreason"))
    })
    public CodeYesNoType getProcedureTurnRequiredItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getProcedureTurnRequired());
    }

    public void setProcedureTurnRequiredItem(CodeYesNoType target) {
        setProcedureTurnRequired(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "procedureTurnRequired"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlimitaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "upperlimitaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitaltitude_nilreason"))
    })
    public ValDistanceVerticalType getUpperLimitAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimitAltitude());
    }

    public void setUpperLimitAltitudeItem(ValDistanceVerticalType target) {
        setUpperLimitAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitAltitude"), DepartureLegTimeSliceType.class, target));
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
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitReference"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimitaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "lowerlimitaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitaltitude_nilreason"))
    })
    public ValDistanceVerticalType getLowerLimitAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimitAltitude());
    }

    public void setLowerLimitAltitudeItem(ValDistanceVerticalType target) {
        setLowerLimitAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitAltitude"), DepartureLegTimeSliceType.class, target));
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
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitReference"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudeinterpretation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeinterpretation_nilreason"))
    })
    public CodeAltitudeUseType getAltitudeInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAltitudeUseType.class, this.getAltitudeInterpretation());
    }

    public void setAltitudeInterpretationItem(CodeAltitudeUseType target) {
        setAltitudeInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeInterpretation"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudeoverrideatc")),
        @AttributeOverride(name = "uom", column = @Column(name = "altitudeoverrideatc_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeoverrideatc_nilreason"))
    })
    public ValDistanceVerticalType getAltitudeOverrideATCItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAltitudeOverrideATC());
    }

    public void setAltitudeOverrideATCItem(ValDistanceVerticalType target) {
        setAltitudeOverrideATC(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeOverrideATC"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudeoverridereference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeoverridereference_nilreason"))
    })
    public CodeVerticalReferenceType getAltitudeOverrideReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getAltitudeOverrideReference());
    }

    public void setAltitudeOverrideReferenceItem(CodeVerticalReferenceType target) {
        setAltitudeOverrideReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeOverrideReference"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticalangle")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalangle_nilreason"))
    })
    public ValAngleType getVerticalAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getVerticalAngle());
    }

    public void setVerticalAngleItem(ValAngleType target) {
        setVerticalAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalAngle"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "startpoint_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getStartPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getStartPoint());
    }

    public void setStartPointItem(TerminalSegmentPointPropertyType target) {
        setStartPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startPoint"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "endpoint_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getEndPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getEndPoint());
    }

    public void setEndPointItem(TerminalSegmentPointPropertyType target) {
        setEndPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endPoint"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "trajectory_id", referencedColumnName = "hjid")
    public AIXMCurvePropertyType getTrajectoryItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getTrajectory());
    }

    public void setTrajectoryItem(AIXMCurvePropertyType target) {
        setTrajectory(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trajectory"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "arccentre_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getArcCentreItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getArcCentre());
    }

    public void setArcCentreItem(TerminalSegmentPointPropertyType target) {
        setArcCentre(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "arcCentre"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AngleIndicationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "angle_id", referencedColumnName = "hjid")
    public AngleIndicationPropertyType getAngleItem() {
        return XmlAdapterUtils.unmarshallSource(AngleIndicationPropertyType.class, this.getAngle());
    }

    public void setAngleItem(AngleIndicationPropertyType target) {
        setAngle(XmlAdapterUtils.marshallJAXBElement(AngleIndicationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angle"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DistanceIndicationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "distance_id", referencedColumnName = "hjid")
    public DistanceIndicationPropertyType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(DistanceIndicationPropertyType.class, this.getDistance());
    }

    public void setDistanceItem(DistanceIndicationPropertyType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(DistanceIndicationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "distance"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = HoldingUsePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holding_id", referencedColumnName = "hjid")
    public HoldingUsePropertyType getHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingUsePropertyType.class, this.getHolding());
    }

    public void setHoldingItem(HoldingUsePropertyType target) {
        setHolding(XmlAdapterUtils.marshallJAXBElement(HoldingUsePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "holding"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "requirednavigationperformance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "requirednavigationperformance_nilreason"))
    })
    public CodeRNPType getRequiredNavigationPerformanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRNPType.class, this.getRequiredNavigationPerformance());
    }

    public void setRequiredNavigationPerformanceItem(CodeRNPType target) {
        setRequiredNavigationPerformance(XmlAdapterUtils.marshallJAXBElement(CodeRNPType.class, new QName("http://www.aixm.aero/schema/5.1.1", "requiredNavigationPerformance"), DepartureLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumobstacleclearancealtitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumobstacleclearancealtitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumobstacleclearancealtitude_nilreason"))
    })
    public ValDistanceVerticalType getMinimumObstacleClearanceAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumObstacleClearanceAltitude());
    }

    public void setMinimumObstacleClearanceAltitudeItem(ValDistanceVerticalType target) {
        setMinimumObstacleClearanceAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumObstacleClearanceAltitude"), DepartureLegTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = StandardInstrumentDeparturePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "departure_id", referencedColumnName = "hjid")
    public StandardInstrumentDeparturePropertyType getDepartureItem() {
        return XmlAdapterUtils.unmarshallSource(StandardInstrumentDeparturePropertyType.class, this.getDeparture());
    }

    public void setDepartureItem(StandardInstrumentDeparturePropertyType target) {
        setDeparture(XmlAdapterUtils.marshallJAXBElement(StandardInstrumentDeparturePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "departure"), DepartureLegTimeSliceType.class, target));
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
        final DepartureLegTimeSliceType that = ((DepartureLegTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetUpperLimitAltitude();
            boolean rhsFieldIsSet = that.isSetUpperLimitAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getUpperLimitAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getUpperLimitAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimitAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimitAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartPoint();
            boolean rhsFieldIsSet = that.isSetStartPoint();
            JAXBElement<TerminalSegmentPointPropertyType> lhsField;
            lhsField = this.getStartPoint();
            JAXBElement<TerminalSegmentPointPropertyType> rhsField;
            rhsField = that.getStartPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCategory();
            boolean rhsFieldIsSet = that.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCategory()?that.getAircraftCategory():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLegPath();
            boolean rhsFieldIsSet = that.isSetLegPath();
            JAXBElement<CodeTrajectoryType> lhsField;
            lhsField = this.getLegPath();
            JAXBElement<CodeTrajectoryType> rhsField;
            rhsField = that.getLegPath();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "legPath", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "legPath", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            JAXBElement<DistanceIndicationPropertyType> lhsField;
            lhsField = this.getDistance();
            JAXBElement<DistanceIndicationPropertyType> rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndConditionDesignator();
            boolean rhsFieldIsSet = that.isSetEndConditionDesignator();
            JAXBElement<CodeSegmentTerminationType> lhsField;
            lhsField = this.getEndConditionDesignator();
            JAXBElement<CodeSegmentTerminationType> rhsField;
            rhsField = that.getEndConditionDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endConditionDesignator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endConditionDesignator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngle();
            boolean rhsFieldIsSet = that.isSetAngle();
            JAXBElement<AngleIndicationPropertyType> lhsField;
            lhsField = this.getAngle();
            JAXBElement<AngleIndicationPropertyType> rhsField;
            rhsField = that.getAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDeparture();
            boolean rhsFieldIsSet = that.isSetDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> lhsField;
            lhsField = this.getDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> rhsField;
            rhsField = that.getDeparture();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "departure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "departure", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourseDirection();
            boolean rhsFieldIsSet = that.isSetCourseDirection();
            JAXBElement<CodeDirectionReferenceType> lhsField;
            lhsField = this.getCourseDirection();
            JAXBElement<CodeDirectionReferenceType> rhsField;
            rhsField = that.getCourseDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArcCentre();
            boolean rhsFieldIsSet = that.isSetArcCentre();
            JAXBElement<TerminalSegmentPointPropertyType> lhsField;
            lhsField = this.getArcCentre();
            JAXBElement<TerminalSegmentPointPropertyType> rhsField;
            rhsField = that.getArcCentre();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arcCentre", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arcCentre", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeOverrideATC();
            boolean rhsFieldIsSet = that.isSetAltitudeOverrideATC();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getAltitudeOverrideATC();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getAltitudeOverrideATC();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeOverrideATC", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeOverrideATC", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDesignSurface();
            boolean rhsFieldIsSet = that.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> lhsField;
            lhsField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            List<ObstacleAssessmentAreaPropertyType> rhsField;
            rhsField = (that.isSetDesignSurface()?that.getDesignSurface():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designSurface", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedReference();
            boolean rhsFieldIsSet = that.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> lhsField;
            lhsField = this.getSpeedReference();
            JAXBElement<CodeSpeedReferenceType> rhsField;
            rhsField = that.getSpeedReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimitAltitude();
            boolean rhsFieldIsSet = that.isSetLowerLimitAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getLowerLimitAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getLowerLimitAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimitAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimitAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHolding();
            boolean rhsFieldIsSet = that.isSetHolding();
            JAXBElement<HoldingUsePropertyType> lhsField;
            lhsField = this.getHolding();
            JAXBElement<HoldingUsePropertyType> rhsField;
            rhsField = that.getHolding();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holding", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holding", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumObstacleClearanceAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumObstacleClearanceAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumObstacleClearanceAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndPoint();
            boolean rhsFieldIsSet = that.isSetEndPoint();
            JAXBElement<TerminalSegmentPointPropertyType> lhsField;
            lhsField = this.getEndPoint();
            JAXBElement<TerminalSegmentPointPropertyType> rhsField;
            rhsField = that.getEndPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBankAngle();
            boolean rhsFieldIsSet = that.isSetBankAngle();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getBankAngle();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getBankAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "bankAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "bankAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrajectory();
            boolean rhsFieldIsSet = that.isSetTrajectory();
            JAXBElement<AIXMCurvePropertyType> lhsField;
            lhsField = this.getTrajectory();
            JAXBElement<AIXMCurvePropertyType> rhsField;
            rhsField = that.getTrajectory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trajectory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trajectory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourse();
            boolean rhsFieldIsSet = that.isSetCourse();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getCourse();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getCourse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "course", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "course", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAltitudeInterpretation();
            boolean rhsFieldIsSet = that.isSetAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> lhsField;
            lhsField = this.getAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> rhsField;
            rhsField = that.getAltitudeInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourseType();
            boolean rhsFieldIsSet = that.isSetCourseType();
            JAXBElement<CodeCourseType> lhsField;
            lhsField = this.getCourseType();
            JAXBElement<CodeCourseType> rhsField;
            rhsField = that.getCourseType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseType", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAltitudeOverrideReference();
            boolean rhsFieldIsSet = that.isSetAltitudeOverrideReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getAltitudeOverrideReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getAltitudeOverrideReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeOverrideReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeOverrideReference", rhsField);
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
            boolean lhsFieldIsSet = this.isSetVerticalAngle();
            boolean rhsFieldIsSet = that.isSetVerticalAngle();
            JAXBElement<ValAngleType> lhsField;
            lhsField = this.getVerticalAngle();
            JAXBElement<ValAngleType> rhsField;
            rhsField = that.getVerticalAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRequiredNavigationPerformance();
            boolean rhsFieldIsSet = that.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> lhsField;
            lhsField = this.getRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> rhsField;
            rhsField = that.getRequiredNavigationPerformance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "requiredNavigationPerformance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "requiredNavigationPerformance", rhsField);
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
            boolean lhsFieldIsSet = this.isSetProcedureTurnRequired();
            boolean rhsFieldIsSet = that.isSetProcedureTurnRequired();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getProcedureTurnRequired();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getProcedureTurnRequired();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "procedureTurnRequired", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "procedureTurnRequired", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<DepartureLegExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<DepartureLegExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLegTypeARINC();
            boolean rhsFieldIsSet = that.isSetLegTypeARINC();
            JAXBElement<CodeSegmentPathType> lhsField;
            lhsField = this.getLegTypeARINC();
            JAXBElement<CodeSegmentPathType> rhsField;
            rhsField = that.getLegTypeARINC();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "legTypeARINC", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "legTypeARINC", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCondition();
            boolean rhsFieldIsSet = that.isSetCondition();
            List<DepartureArrivalConditionPropertyType> lhsField;
            lhsField = (this.isSetCondition()?this.getCondition():null);
            List<DepartureArrivalConditionPropertyType> rhsField;
            rhsField = (that.isSetCondition()?that.getCondition():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "condition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "condition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedInterpretation();
            boolean rhsFieldIsSet = that.isSetSpeedInterpretation();
            JAXBElement<CodeAltitudeUseType> lhsField;
            lhsField = this.getSpeedInterpretation();
            JAXBElement<CodeAltitudeUseType> rhsField;
            rhsField = that.getSpeedInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedInterpretation", rhsField);
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
            boolean theFieldIsSet = this.isSetEndConditionDesignator();
            JAXBElement<CodeSegmentTerminationType> theField;
            theField = this.getEndConditionDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endConditionDesignator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegPath();
            JAXBElement<CodeTrajectoryType> theField;
            theField = this.getLegPath();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "legPath", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegTypeARINC();
            JAXBElement<CodeSegmentPathType> theField;
            theField = this.getLegTypeARINC();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "legTypeARINC", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getCourse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "course", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getCourseType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseDirection();
            JAXBElement<CodeDirectionReferenceType> theField;
            theField = this.getCourseDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseDirection", theField);
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
            boolean theFieldIsSet = this.isSetSpeedLimit();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeedLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> theField;
            theField = this.getSpeedReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getSpeedInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBankAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getBankAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "bankAngle", theField);
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
            boolean theFieldIsSet = this.isSetDuration();
            JAXBElement<ValDurationType> theField;
            theField = this.getDuration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "duration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcedureTurnRequired();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getProcedureTurnRequired();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "procedureTurnRequired", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimitAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimitAltitude", theField);
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
            boolean theFieldIsSet = this.isSetLowerLimitAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimitAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimitAltitude", theField);
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
            boolean theFieldIsSet = this.isSetAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getAltitudeInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeOverrideATC();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitudeOverrideATC();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeOverrideATC", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeOverrideReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeOverrideReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeOverrideReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getVerticalAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartPoint();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getStartPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPoint();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getEndPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrajectory();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getTrajectory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trajectory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcCentre();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getArcCentre();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arcCentre", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngle();
            JAXBElement<AngleIndicationPropertyType> theField;
            theField = this.getAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<DistanceIndicationPropertyType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHolding();
            JAXBElement<HoldingUsePropertyType> theField;
            theField = this.getHolding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> theField;
            theField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designSurface", theField);
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
            boolean theFieldIsSet = this.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> theField;
            theField = this.getRequiredNavigationPerformance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "requiredNavigationPerformance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumObstacleClearanceAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getDeparture();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "departure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            List<DepartureArrivalConditionPropertyType> theField;
            theField = (this.isSetCondition()?this.getCondition():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "condition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DepartureLegExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetEndConditionDesignator();
            JAXBElement<CodeSegmentTerminationType> theField;
            theField = this.getEndConditionDesignator();
            strategy.appendField(locator, this, "endConditionDesignator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegPath();
            JAXBElement<CodeTrajectoryType> theField;
            theField = this.getLegPath();
            strategy.appendField(locator, this, "legPath", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLegTypeARINC();
            JAXBElement<CodeSegmentPathType> theField;
            theField = this.getLegTypeARINC();
            strategy.appendField(locator, this, "legTypeARINC", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getCourse();
            strategy.appendField(locator, this, "course", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getCourseType();
            strategy.appendField(locator, this, "courseType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseDirection();
            JAXBElement<CodeDirectionReferenceType> theField;
            theField = this.getCourseDirection();
            strategy.appendField(locator, this, "courseDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            strategy.appendField(locator, this, "turnDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedLimit();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeedLimit();
            strategy.appendField(locator, this, "speedLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedReference();
            JAXBElement<CodeSpeedReferenceType> theField;
            theField = this.getSpeedReference();
            strategy.appendField(locator, this, "speedReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getSpeedInterpretation();
            strategy.appendField(locator, this, "speedInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBankAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getBankAngle();
            strategy.appendField(locator, this, "bankAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            JAXBElement<ValDurationType> theField;
            theField = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcedureTurnRequired();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getProcedureTurnRequired();
            strategy.appendField(locator, this, "procedureTurnRequired", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimitAltitude();
            strategy.appendField(locator, this, "upperLimitAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            strategy.appendField(locator, this, "upperLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimitAltitude();
            strategy.appendField(locator, this, "lowerLimitAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            strategy.appendField(locator, this, "lowerLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getAltitudeInterpretation();
            strategy.appendField(locator, this, "altitudeInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeOverrideATC();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitudeOverrideATC();
            strategy.appendField(locator, this, "altitudeOverrideATC", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeOverrideReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeOverrideReference();
            strategy.appendField(locator, this, "altitudeOverrideReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalAngle();
            JAXBElement<ValAngleType> theField;
            theField = this.getVerticalAngle();
            strategy.appendField(locator, this, "verticalAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartPoint();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getStartPoint();
            strategy.appendField(locator, this, "startPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPoint();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getEndPoint();
            strategy.appendField(locator, this, "endPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrajectory();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getTrajectory();
            strategy.appendField(locator, this, "trajectory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArcCentre();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getArcCentre();
            strategy.appendField(locator, this, "arcCentre", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngle();
            JAXBElement<AngleIndicationPropertyType> theField;
            theField = this.getAngle();
            strategy.appendField(locator, this, "angle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<DistanceIndicationPropertyType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            strategy.appendField(locator, this, "aircraftCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHolding();
            JAXBElement<HoldingUsePropertyType> theField;
            theField = this.getHolding();
            strategy.appendField(locator, this, "holding", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> theField;
            theField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            strategy.appendField(locator, this, "designSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> theField;
            theField = this.getRequiredNavigationPerformance();
            strategy.appendField(locator, this, "requiredNavigationPerformance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceAltitude();
            strategy.appendField(locator, this, "minimumObstacleClearanceAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeparture();
            JAXBElement<StandardInstrumentDeparturePropertyType> theField;
            theField = this.getDeparture();
            strategy.appendField(locator, this, "departure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            List<DepartureArrivalConditionPropertyType> theField;
            theField = (this.isSetCondition()?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DepartureLegExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
