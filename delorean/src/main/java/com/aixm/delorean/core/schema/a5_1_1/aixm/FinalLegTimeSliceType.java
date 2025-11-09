
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
 * <p>Java class for FinalLegTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinalLegTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FinalLegPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFinalLegExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractApproachLegExtension"/>
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
@XmlType(name = "FinalLegTimeSliceType", propOrder = {
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
    "approach",
    "guidanceSystem",
    "landingSystemCategory",
    "minimumBaroVnavTemperature",
    "rnpDMEAuthorized",
    "courseOffsetAngle",
    "courseOffsetSide",
    "courseCentrelineDistance",
    "courseOffsetDistance",
    "courseCentrelineIntersect",
    "condition",
    "finalPathAlignmentPointFixDesignatedPoint",
    "finalPathAlignmentPointNavaidSystem",
    "finalPathAlignmentPointPosition",
    "finalPathAlignmentPointRunwayPoint",
    "finalPathAlignmentPointAimingPoint",
    "finalPathAlignmentPointAirportReferencePoint",
    "visualDescentPoint",
    "fasData",
    "extension"
})
@Entity(name = "FinalLegTimeSliceType")
@Table(name = "finalleg_ts", schema = "procedure")
public class FinalLegTimeSliceType
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
    @XmlElementRef(name = "approach", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<InstrumentApproachProcedurePropertyType> approach;
    @XmlElementRef(name = "guidanceSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFinalGuidanceType> guidanceSystem;
    @XmlElementRef(name = "landingSystemCategory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachGuidanceType> landingSystemCategory;
    @XmlElementRef(name = "minimumBaroVnavTemperature", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> minimumBaroVnavTemperature;
    @XmlElementRef(name = "rnpDMEAuthorized", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> rnpDMEAuthorized;
    @XmlElementRef(name = "courseOffsetAngle", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> courseOffsetAngle;
    @XmlElementRef(name = "courseOffsetSide", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> courseOffsetSide;
    @XmlElementRef(name = "courseCentrelineDistance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> courseCentrelineDistance;
    @XmlElementRef(name = "courseOffsetDistance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> courseOffsetDistance;
    @XmlElementRef(name = "courseCentrelineIntersect", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRelativePositionType> courseCentrelineIntersect;
    @XmlElement(nillable = true)
    protected List<ApproachConditionPropertyType> condition;
    @XmlElementRef(name = "finalPathAlignmentPoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> finalPathAlignmentPointFixDesignatedPoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> finalPathAlignmentPointNavaidSystem;
    @XmlElementRef(name = "finalPathAlignmentPoint_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> finalPathAlignmentPointPosition;
    @XmlElementRef(name = "finalPathAlignmentPoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> finalPathAlignmentPointRunwayPoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> finalPathAlignmentPointAimingPoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> finalPathAlignmentPointAirportReferencePoint;
    @XmlElementRef(name = "visualDescentPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> visualDescentPoint;
    @XmlElementRef(name = "FASData", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FASDataBlockPropertyType> fasData;
    protected List<FinalLegExtensionType> extension;

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
    @OneToMany(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraftcategory_id", referencedColumnName = "hjid")
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
    @OneToMany(targetEntity = ObstacleAssessmentAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "designsurface_id", referencedColumnName = "hjid")
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
     * Gets the value of the approach property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<InstrumentApproachProcedurePropertyType> getApproach() {
        return approach;
    }

    /**
     * Sets the value of the approach property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public void setApproach(JAXBElement<InstrumentApproachProcedurePropertyType> value) {
        this.approach = value;
    }

    @Transient
    public boolean isSetApproach() {
        return (this.approach!= null);
    }

    /**
     * Gets the value of the guidanceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFinalGuidanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFinalGuidanceType> getGuidanceSystem() {
        return guidanceSystem;
    }

    /**
     * Sets the value of the guidanceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFinalGuidanceType }{@code >}
     *     
     */
    public void setGuidanceSystem(JAXBElement<CodeFinalGuidanceType> value) {
        this.guidanceSystem = value;
    }

    @Transient
    public boolean isSetGuidanceSystem() {
        return (this.guidanceSystem!= null);
    }

    /**
     * Gets the value of the landingSystemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachGuidanceType> getLandingSystemCategory() {
        return landingSystemCategory;
    }

    /**
     * Sets the value of the landingSystemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    public void setLandingSystemCategory(JAXBElement<CodeApproachGuidanceType> value) {
        this.landingSystemCategory = value;
    }

    @Transient
    public boolean isSetLandingSystemCategory() {
        return (this.landingSystemCategory!= null);
    }

    /**
     * Gets the value of the minimumBaroVnavTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValTemperatureType> getMinimumBaroVnavTemperature() {
        return minimumBaroVnavTemperature;
    }

    /**
     * Sets the value of the minimumBaroVnavTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setMinimumBaroVnavTemperature(JAXBElement<ValTemperatureType> value) {
        this.minimumBaroVnavTemperature = value;
    }

    @Transient
    public boolean isSetMinimumBaroVnavTemperature() {
        return (this.minimumBaroVnavTemperature!= null);
    }

    /**
     * Gets the value of the rnpDMEAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getRnpDMEAuthorized() {
        return rnpDMEAuthorized;
    }

    /**
     * Sets the value of the rnpDMEAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRnpDMEAuthorized(JAXBElement<CodeYesNoType> value) {
        this.rnpDMEAuthorized = value;
    }

    @Transient
    public boolean isSetRnpDMEAuthorized() {
        return (this.rnpDMEAuthorized!= null);
    }

    /**
     * Gets the value of the courseOffsetAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getCourseOffsetAngle() {
        return courseOffsetAngle;
    }

    /**
     * Sets the value of the courseOffsetAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCourseOffsetAngle(JAXBElement<ValBearingType> value) {
        this.courseOffsetAngle = value;
    }

    @Transient
    public boolean isSetCourseOffsetAngle() {
        return (this.courseOffsetAngle!= null);
    }

    /**
     * Gets the value of the courseOffsetSide property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSideType> getCourseOffsetSide() {
        return courseOffsetSide;
    }

    /**
     * Sets the value of the courseOffsetSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setCourseOffsetSide(JAXBElement<CodeSideType> value) {
        this.courseOffsetSide = value;
    }

    @Transient
    public boolean isSetCourseOffsetSide() {
        return (this.courseOffsetSide!= null);
    }

    /**
     * Gets the value of the courseCentrelineDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getCourseCentrelineDistance() {
        return courseCentrelineDistance;
    }

    /**
     * Sets the value of the courseCentrelineDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setCourseCentrelineDistance(JAXBElement<ValDistanceType> value) {
        this.courseCentrelineDistance = value;
    }

    @Transient
    public boolean isSetCourseCentrelineDistance() {
        return (this.courseCentrelineDistance!= null);
    }

    /**
     * Gets the value of the courseOffsetDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getCourseOffsetDistance() {
        return courseOffsetDistance;
    }

    /**
     * Sets the value of the courseOffsetDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setCourseOffsetDistance(JAXBElement<ValDistanceType> value) {
        this.courseOffsetDistance = value;
    }

    @Transient
    public boolean isSetCourseOffsetDistance() {
        return (this.courseOffsetDistance!= null);
    }

    /**
     * Gets the value of the courseCentrelineIntersect property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRelativePositionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRelativePositionType> getCourseCentrelineIntersect() {
        return courseCentrelineIntersect;
    }

    /**
     * Sets the value of the courseCentrelineIntersect property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRelativePositionType }{@code >}
     *     
     */
    public void setCourseCentrelineIntersect(JAXBElement<CodeRelativePositionType> value) {
        this.courseCentrelineIntersect = value;
    }

    @Transient
    public boolean isSetCourseCentrelineIntersect() {
        return (this.courseCentrelineIntersect!= null);
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
     * {@link ApproachConditionPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = ApproachConditionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "condition_id", referencedColumnName = "hjid")
    public List<ApproachConditionPropertyType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<>();
        }
        return this.condition;
    }

    /**
     * 
     * 
     */
    public void setCondition(List<ApproachConditionPropertyType> condition) {
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
     * Gets the value of the finalPathAlignmentPointFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getFinalPathAlignmentPointFixDesignatedPoint() {
        return finalPathAlignmentPointFixDesignatedPoint;
    }

    /**
     * Sets the value of the finalPathAlignmentPointFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.finalPathAlignmentPointFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetFinalPathAlignmentPointFixDesignatedPoint() {
        return (this.finalPathAlignmentPointFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the finalPathAlignmentPointNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getFinalPathAlignmentPointNavaidSystem() {
        return finalPathAlignmentPointNavaidSystem;
    }

    /**
     * Sets the value of the finalPathAlignmentPointNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.finalPathAlignmentPointNavaidSystem = value;
    }

    @Transient
    public boolean isSetFinalPathAlignmentPointNavaidSystem() {
        return (this.finalPathAlignmentPointNavaidSystem!= null);
    }

    /**
     * Gets the value of the finalPathAlignmentPointPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getFinalPathAlignmentPointPosition() {
        return finalPathAlignmentPointPosition;
    }

    /**
     * Sets the value of the finalPathAlignmentPointPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.finalPathAlignmentPointPosition = value;
    }

    @Transient
    public boolean isSetFinalPathAlignmentPointPosition() {
        return (this.finalPathAlignmentPointPosition!= null);
    }

    /**
     * Gets the value of the finalPathAlignmentPointRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getFinalPathAlignmentPointRunwayPoint() {
        return finalPathAlignmentPointRunwayPoint;
    }

    /**
     * Sets the value of the finalPathAlignmentPointRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.finalPathAlignmentPointRunwayPoint = value;
    }

    @Transient
    public boolean isSetFinalPathAlignmentPointRunwayPoint() {
        return (this.finalPathAlignmentPointRunwayPoint!= null);
    }

    /**
     * Gets the value of the finalPathAlignmentPointAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getFinalPathAlignmentPointAimingPoint() {
        return finalPathAlignmentPointAimingPoint;
    }

    /**
     * Sets the value of the finalPathAlignmentPointAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.finalPathAlignmentPointAimingPoint = value;
    }

    @Transient
    public boolean isSetFinalPathAlignmentPointAimingPoint() {
        return (this.finalPathAlignmentPointAimingPoint!= null);
    }

    /**
     * Gets the value of the finalPathAlignmentPointAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getFinalPathAlignmentPointAirportReferencePoint() {
        return finalPathAlignmentPointAirportReferencePoint;
    }

    /**
     * Sets the value of the finalPathAlignmentPointAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.finalPathAlignmentPointAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetFinalPathAlignmentPointAirportReferencePoint() {
        return (this.finalPathAlignmentPointAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the visualDescentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TerminalSegmentPointPropertyType> getVisualDescentPoint() {
        return visualDescentPoint;
    }

    /**
     * Sets the value of the visualDescentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setVisualDescentPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.visualDescentPoint = value;
    }

    @Transient
    public boolean isSetVisualDescentPoint() {
        return (this.visualDescentPoint!= null);
    }

    /**
     * Gets the value of the fasData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASDataBlockPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<FASDataBlockPropertyType> getFASData() {
        return fasData;
    }

    /**
     * Sets the value of the fasData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASDataBlockPropertyType }{@code >}
     *     
     */
    public void setFASData(JAXBElement<FASDataBlockPropertyType> value) {
        this.fasData = value;
    }

    @Transient
    public boolean isSetFASData() {
        return (this.fasData!= null);
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
     * {@link FinalLegExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FinalLegExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_FINAL_LEG_TIME_SLI_0")
    public List<FinalLegExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FinalLegExtensionType> extension) {
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
        setEndConditionDesignator(XmlAdapterUtils.marshallJAXBElement(CodeSegmentTerminationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endConditionDesignator"), FinalLegTimeSliceType.class, target));
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
        setLegPath(XmlAdapterUtils.marshallJAXBElement(CodeTrajectoryType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legPath"), FinalLegTimeSliceType.class, target));
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
        setLegTypeARINC(XmlAdapterUtils.marshallJAXBElement(CodeSegmentPathType.class, new QName("http://www.aixm.aero/schema/5.1.1", "legTypeARINC"), FinalLegTimeSliceType.class, target));
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
        setCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "course"), FinalLegTimeSliceType.class, target));
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
        setCourseType(XmlAdapterUtils.marshallJAXBElement(CodeCourseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseType"), FinalLegTimeSliceType.class, target));
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
        setCourseDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseDirection"), FinalLegTimeSliceType.class, target));
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
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnDirection"), FinalLegTimeSliceType.class, target));
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
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedLimit"), FinalLegTimeSliceType.class, target));
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
        setSpeedReference(XmlAdapterUtils.marshallJAXBElement(CodeSpeedReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedReference"), FinalLegTimeSliceType.class, target));
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
        setSpeedInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speedInterpretation"), FinalLegTimeSliceType.class, target));
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
        setBankAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "bankAngle"), FinalLegTimeSliceType.class, target));
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
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "length"), FinalLegTimeSliceType.class, target));
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
        setDuration(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "duration"), FinalLegTimeSliceType.class, target));
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
        setProcedureTurnRequired(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "procedureTurnRequired"), FinalLegTimeSliceType.class, target));
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
        setUpperLimitAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitAltitude"), FinalLegTimeSliceType.class, target));
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
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitReference"), FinalLegTimeSliceType.class, target));
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
        setLowerLimitAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitAltitude"), FinalLegTimeSliceType.class, target));
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
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitReference"), FinalLegTimeSliceType.class, target));
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
        setAltitudeInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeInterpretation"), FinalLegTimeSliceType.class, target));
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
        setAltitudeOverrideATC(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeOverrideATC"), FinalLegTimeSliceType.class, target));
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
        setAltitudeOverrideReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeOverrideReference"), FinalLegTimeSliceType.class, target));
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
        setVerticalAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalAngle"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "startpoint_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getStartPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getStartPoint());
    }

    public void setStartPointItem(TerminalSegmentPointPropertyType target) {
        setStartPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startPoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "endpoint_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getEndPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getEndPoint());
    }

    public void setEndPointItem(TerminalSegmentPointPropertyType target) {
        setEndPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endPoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "trajectory_id", referencedColumnName = "hjid")
    public AIXMCurvePropertyType getTrajectoryItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getTrajectory());
    }

    public void setTrajectoryItem(AIXMCurvePropertyType target) {
        setTrajectory(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trajectory"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "arccentre_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getArcCentreItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getArcCentre());
    }

    public void setArcCentreItem(TerminalSegmentPointPropertyType target) {
        setArcCentre(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "arcCentre"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AngleIndicationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "angle_id", referencedColumnName = "hjid")
    public AngleIndicationPropertyType getAngleItem() {
        return XmlAdapterUtils.unmarshallSource(AngleIndicationPropertyType.class, this.getAngle());
    }

    public void setAngleItem(AngleIndicationPropertyType target) {
        setAngle(XmlAdapterUtils.marshallJAXBElement(AngleIndicationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angle"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = DistanceIndicationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "distance_id", referencedColumnName = "hjid")
    public DistanceIndicationPropertyType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(DistanceIndicationPropertyType.class, this.getDistance());
    }

    public void setDistanceItem(DistanceIndicationPropertyType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(DistanceIndicationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "distance"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = HoldingUsePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holding_id", referencedColumnName = "hjid")
    public HoldingUsePropertyType getHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingUsePropertyType.class, this.getHolding());
    }

    public void setHoldingItem(HoldingUsePropertyType target) {
        setHolding(XmlAdapterUtils.marshallJAXBElement(HoldingUsePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "holding"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = InstrumentApproachProcedurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approach_id", referencedColumnName = "hjid")
    public InstrumentApproachProcedurePropertyType getApproachItem() {
        return XmlAdapterUtils.unmarshallSource(InstrumentApproachProcedurePropertyType.class, this.getApproach());
    }

    public void setApproachItem(InstrumentApproachProcedurePropertyType target) {
        setApproach(XmlAdapterUtils.marshallJAXBElement(InstrumentApproachProcedurePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approach"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "guidancesystem")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "guidancesystem_nilreason"))
    })
    public CodeFinalGuidanceType getGuidanceSystemItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFinalGuidanceType.class, this.getGuidanceSystem());
    }

    public void setGuidanceSystemItem(CodeFinalGuidanceType target) {
        setGuidanceSystem(XmlAdapterUtils.marshallJAXBElement(CodeFinalGuidanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceSystem"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "landingsystemcategory")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "landingsystemcategory_nilreason"))
    })
    public CodeApproachGuidanceType getLandingSystemCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachGuidanceType.class, this.getLandingSystemCategory());
    }

    public void setLandingSystemCategoryItem(CodeApproachGuidanceType target) {
        setLandingSystemCategory(XmlAdapterUtils.marshallJAXBElement(CodeApproachGuidanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "landingSystemCategory"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumbarovnavtemperature")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumbarovnavtemperature_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumbarovnavtemperature_nilreason"))
    })
    public ValTemperatureType getMinimumBaroVnavTemperatureItem() {
        return XmlAdapterUtils.unmarshallSource(ValTemperatureType.class, this.getMinimumBaroVnavTemperature());
    }

    public void setMinimumBaroVnavTemperatureItem(ValTemperatureType target) {
        setMinimumBaroVnavTemperature(XmlAdapterUtils.marshallJAXBElement(ValTemperatureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumBaroVnavTemperature"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "rnpdmeauthorized")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "rnpdmeauthorized_nilreason"))
    })
    public CodeYesNoType getRnpDMEAuthorizedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getRnpDMEAuthorized());
    }

    public void setRnpDMEAuthorizedItem(CodeYesNoType target) {
        setRnpDMEAuthorized(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "rnpDMEAuthorized"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "courseoffsetangle")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "courseoffsetangle_nilreason"))
    })
    public ValBearingType getCourseOffsetAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getCourseOffsetAngle());
    }

    public void setCourseOffsetAngleItem(ValBearingType target) {
        setCourseOffsetAngle(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseOffsetAngle"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "courseoffsetside")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "courseoffsetside_nilreason"))
    })
    public CodeSideType getCourseOffsetSideItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getCourseOffsetSide());
    }

    public void setCourseOffsetSideItem(CodeSideType target) {
        setCourseOffsetSide(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseOffsetSide"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coursecentrelinedistance")),
        @AttributeOverride(name = "uom", column = @Column(name = "coursecentrelinedistance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coursecentrelinedistance_nilreason"))
    })
    public ValDistanceType getCourseCentrelineDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getCourseCentrelineDistance());
    }

    public void setCourseCentrelineDistanceItem(ValDistanceType target) {
        setCourseCentrelineDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseCentrelineDistance"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "courseoffsetdistance")),
        @AttributeOverride(name = "uom", column = @Column(name = "courseoffsetdistance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "courseoffsetdistance_nilreason"))
    })
    public ValDistanceType getCourseOffsetDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getCourseOffsetDistance());
    }

    public void setCourseOffsetDistanceItem(ValDistanceType target) {
        setCourseOffsetDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseOffsetDistance"), FinalLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coursecentrelineintersect")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coursecentrelineintersect_nilreason"))
    })
    public CodeRelativePositionType getCourseCentrelineIntersectItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRelativePositionType.class, this.getCourseCentrelineIntersect());
    }

    public void setCourseCentrelineIntersectItem(CodeRelativePositionType target) {
        setCourseCentrelineIntersect(XmlAdapterUtils.marshallJAXBElement(CodeRelativePositionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseCentrelineIntersect"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalpathalignmentpoint_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getFinalPathAlignmentPointFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getFinalPathAlignmentPointFixDesignatedPoint());
    }

    public void setFinalPathAlignmentPointFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setFinalPathAlignmentPointFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalPathAlignmentPoint_fixDesignatedPoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalpathalignmentpoint_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getFinalPathAlignmentPointNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getFinalPathAlignmentPointNavaidSystem());
    }

    public void setFinalPathAlignmentPointNavaidSystemItem(NavaidPropertyType target) {
        setFinalPathAlignmentPointNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalPathAlignmentPoint_navaidSystem"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalpathalignmentpoint_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getFinalPathAlignmentPointPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getFinalPathAlignmentPointPosition());
    }

    public void setFinalPathAlignmentPointPositionItem(AIXMPointPropertyType target) {
        setFinalPathAlignmentPointPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalPathAlignmentPoint_position"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalpathalignmentpoint_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getFinalPathAlignmentPointRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getFinalPathAlignmentPointRunwayPoint());
    }

    public void setFinalPathAlignmentPointRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setFinalPathAlignmentPointRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalPathAlignmentPoint_runwayPoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalpathalignmentpoint_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getFinalPathAlignmentPointAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getFinalPathAlignmentPointAimingPoint());
    }

    public void setFinalPathAlignmentPointAimingPointItem(TouchDownLiftOffPropertyType target) {
        setFinalPathAlignmentPointAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalPathAlignmentPoint_aimingPoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalpathalignmentpoint_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getFinalPathAlignmentPointAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getFinalPathAlignmentPointAirportReferencePoint());
    }

    public void setFinalPathAlignmentPointAirportReferencePointItem(AirportHeliportPropertyType target) {
        setFinalPathAlignmentPointAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalPathAlignmentPoint_airportReferencePoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "visualdescentpoint_id", referencedColumnName = "hjid")
    public TerminalSegmentPointPropertyType getVisualDescentPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getVisualDescentPoint());
    }

    public void setVisualDescentPointItem(TerminalSegmentPointPropertyType target) {
        setVisualDescentPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "visualDescentPoint"), FinalLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = FASDataBlockPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "fasdata_id", referencedColumnName = "hjid")
    public FASDataBlockPropertyType getFASDataItem() {
        return XmlAdapterUtils.unmarshallSource(FASDataBlockPropertyType.class, this.getFASData());
    }

    public void setFASDataItem(FASDataBlockPropertyType target) {
        setFASData(XmlAdapterUtils.marshallJAXBElement(FASDataBlockPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "FASData"), FinalLegTimeSliceType.class, target));
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
        final FinalLegTimeSliceType that = ((FinalLegTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetApproach();
            boolean rhsFieldIsSet = that.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> lhsField;
            lhsField = this.getApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> rhsField;
            rhsField = that.getApproach();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approach", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approach", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFinalPathAlignmentPointAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetFinalPathAlignmentPointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getFinalPathAlignmentPointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getFinalPathAlignmentPointAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPathAlignmentPointAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPathAlignmentPointAirportReferencePoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetVisualDescentPoint();
            boolean rhsFieldIsSet = that.isSetVisualDescentPoint();
            JAXBElement<TerminalSegmentPointPropertyType> lhsField;
            lhsField = this.getVisualDescentPoint();
            JAXBElement<TerminalSegmentPointPropertyType> rhsField;
            rhsField = that.getVisualDescentPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "visualDescentPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "visualDescentPoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetFinalPathAlignmentPointNavaidSystem();
            boolean rhsFieldIsSet = that.isSetFinalPathAlignmentPointNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getFinalPathAlignmentPointNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getFinalPathAlignmentPointNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPathAlignmentPointNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPathAlignmentPointNavaidSystem", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCourseOffsetSide();
            boolean rhsFieldIsSet = that.isSetCourseOffsetSide();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getCourseOffsetSide();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getCourseOffsetSide();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseOffsetSide", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseOffsetSide", rhsField);
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
            boolean lhsFieldIsSet = this.isSetRnpDMEAuthorized();
            boolean rhsFieldIsSet = that.isSetRnpDMEAuthorized();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getRnpDMEAuthorized();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getRnpDMEAuthorized();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rnpDMEAuthorized", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rnpDMEAuthorized", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCourseOffsetAngle();
            boolean rhsFieldIsSet = that.isSetCourseOffsetAngle();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getCourseOffsetAngle();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getCourseOffsetAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseOffsetAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseOffsetAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFinalPathAlignmentPointRunwayPoint();
            boolean rhsFieldIsSet = that.isSetFinalPathAlignmentPointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getFinalPathAlignmentPointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getFinalPathAlignmentPointRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPathAlignmentPointRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPathAlignmentPointRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLandingSystemCategory();
            boolean rhsFieldIsSet = that.isSetLandingSystemCategory();
            JAXBElement<CodeApproachGuidanceType> lhsField;
            lhsField = this.getLandingSystemCategory();
            JAXBElement<CodeApproachGuidanceType> rhsField;
            rhsField = that.getLandingSystemCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingSystemCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingSystemCategory", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGuidanceSystem();
            boolean rhsFieldIsSet = that.isSetGuidanceSystem();
            JAXBElement<CodeFinalGuidanceType> lhsField;
            lhsField = this.getGuidanceSystem();
            JAXBElement<CodeFinalGuidanceType> rhsField;
            rhsField = that.getGuidanceSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceSystem", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FinalLegExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FinalLegExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetFinalPathAlignmentPointFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetFinalPathAlignmentPointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getFinalPathAlignmentPointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getFinalPathAlignmentPointFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPathAlignmentPointFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPathAlignmentPointFixDesignatedPoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetFinalPathAlignmentPointAimingPoint();
            boolean rhsFieldIsSet = that.isSetFinalPathAlignmentPointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getFinalPathAlignmentPointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getFinalPathAlignmentPointAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPathAlignmentPointAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPathAlignmentPointAimingPoint", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCourseOffsetDistance();
            boolean rhsFieldIsSet = that.isSetCourseOffsetDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getCourseOffsetDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getCourseOffsetDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseOffsetDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseOffsetDistance", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCourseCentrelineIntersect();
            boolean rhsFieldIsSet = that.isSetCourseCentrelineIntersect();
            JAXBElement<CodeRelativePositionType> lhsField;
            lhsField = this.getCourseCentrelineIntersect();
            JAXBElement<CodeRelativePositionType> rhsField;
            rhsField = that.getCourseCentrelineIntersect();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseCentrelineIntersect", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseCentrelineIntersect", rhsField);
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
            boolean lhsFieldIsSet = this.isSetFinalPathAlignmentPointPosition();
            boolean rhsFieldIsSet = that.isSetFinalPathAlignmentPointPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getFinalPathAlignmentPointPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getFinalPathAlignmentPointPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalPathAlignmentPointPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalPathAlignmentPointPosition", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCondition();
            boolean rhsFieldIsSet = that.isSetCondition();
            List<ApproachConditionPropertyType> lhsField;
            lhsField = (this.isSetCondition()?this.getCondition():null);
            List<ApproachConditionPropertyType> rhsField;
            rhsField = (that.isSetCondition()?that.getCondition():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "condition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "condition", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMinimumBaroVnavTemperature();
            boolean rhsFieldIsSet = that.isSetMinimumBaroVnavTemperature();
            JAXBElement<ValTemperatureType> lhsField;
            lhsField = this.getMinimumBaroVnavTemperature();
            JAXBElement<ValTemperatureType> rhsField;
            rhsField = that.getMinimumBaroVnavTemperature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumBaroVnavTemperature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumBaroVnavTemperature", rhsField);
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
        {
            boolean lhsFieldIsSet = this.isSetFASData();
            boolean rhsFieldIsSet = that.isSetFASData();
            JAXBElement<FASDataBlockPropertyType> lhsField;
            lhsField = this.getFASData();
            JAXBElement<FASDataBlockPropertyType> rhsField;
            rhsField = that.getFASData();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fasData", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fasData", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourseCentrelineDistance();
            boolean rhsFieldIsSet = that.isSetCourseCentrelineDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getCourseCentrelineDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getCourseCentrelineDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseCentrelineDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseCentrelineDistance", rhsField);
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
            boolean theFieldIsSet = this.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproach();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approach", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceSystem();
            JAXBElement<CodeFinalGuidanceType> theField;
            theField = this.getGuidanceSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingSystemCategory();
            JAXBElement<CodeApproachGuidanceType> theField;
            theField = this.getLandingSystemCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingSystemCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumBaroVnavTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getMinimumBaroVnavTemperature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumBaroVnavTemperature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRnpDMEAuthorized();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRnpDMEAuthorized();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rnpDMEAuthorized", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseOffsetAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getCourseOffsetAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseOffsetAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseOffsetSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getCourseOffsetSide();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseOffsetSide", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseCentrelineDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getCourseCentrelineDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseCentrelineDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseOffsetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getCourseOffsetDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseOffsetDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseCentrelineIntersect();
            JAXBElement<CodeRelativePositionType> theField;
            theField = this.getCourseCentrelineIntersect();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseCentrelineIntersect", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            List<ApproachConditionPropertyType> theField;
            theField = (this.isSetCondition()?this.getCondition():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "condition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getFinalPathAlignmentPointFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPathAlignmentPointFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getFinalPathAlignmentPointNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPathAlignmentPointNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getFinalPathAlignmentPointPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPathAlignmentPointPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getFinalPathAlignmentPointRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPathAlignmentPointRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getFinalPathAlignmentPointAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPathAlignmentPointAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getFinalPathAlignmentPointAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalPathAlignmentPointAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisualDescentPoint();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getVisualDescentPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "visualDescentPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFASData();
            JAXBElement<FASDataBlockPropertyType> theField;
            theField = this.getFASData();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fasData", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalLegExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproach();
            strategy.appendField(locator, this, "approach", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceSystem();
            JAXBElement<CodeFinalGuidanceType> theField;
            theField = this.getGuidanceSystem();
            strategy.appendField(locator, this, "guidanceSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingSystemCategory();
            JAXBElement<CodeApproachGuidanceType> theField;
            theField = this.getLandingSystemCategory();
            strategy.appendField(locator, this, "landingSystemCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumBaroVnavTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getMinimumBaroVnavTemperature();
            strategy.appendField(locator, this, "minimumBaroVnavTemperature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRnpDMEAuthorized();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRnpDMEAuthorized();
            strategy.appendField(locator, this, "rnpDMEAuthorized", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseOffsetAngle();
            JAXBElement<ValBearingType> theField;
            theField = this.getCourseOffsetAngle();
            strategy.appendField(locator, this, "courseOffsetAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseOffsetSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getCourseOffsetSide();
            strategy.appendField(locator, this, "courseOffsetSide", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseCentrelineDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getCourseCentrelineDistance();
            strategy.appendField(locator, this, "courseCentrelineDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseOffsetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getCourseOffsetDistance();
            strategy.appendField(locator, this, "courseOffsetDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseCentrelineIntersect();
            JAXBElement<CodeRelativePositionType> theField;
            theField = this.getCourseCentrelineIntersect();
            strategy.appendField(locator, this, "courseCentrelineIntersect", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            List<ApproachConditionPropertyType> theField;
            theField = (this.isSetCondition()?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getFinalPathAlignmentPointFixDesignatedPoint();
            strategy.appendField(locator, this, "finalPathAlignmentPointFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getFinalPathAlignmentPointNavaidSystem();
            strategy.appendField(locator, this, "finalPathAlignmentPointNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getFinalPathAlignmentPointPosition();
            strategy.appendField(locator, this, "finalPathAlignmentPointPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getFinalPathAlignmentPointRunwayPoint();
            strategy.appendField(locator, this, "finalPathAlignmentPointRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getFinalPathAlignmentPointAimingPoint();
            strategy.appendField(locator, this, "finalPathAlignmentPointAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalPathAlignmentPointAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getFinalPathAlignmentPointAirportReferencePoint();
            strategy.appendField(locator, this, "finalPathAlignmentPointAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisualDescentPoint();
            JAXBElement<TerminalSegmentPointPropertyType> theField;
            theField = this.getVisualDescentPoint();
            strategy.appendField(locator, this, "visualDescentPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFASData();
            JAXBElement<FASDataBlockPropertyType> theField;
            theField = this.getFASData();
            strategy.appendField(locator, this, "fasData", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalLegExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
