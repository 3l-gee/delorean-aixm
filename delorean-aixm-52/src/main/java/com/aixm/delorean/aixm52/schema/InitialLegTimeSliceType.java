
package com.aixm.delorean.aixm52.schema;

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

/**
 * <p>
 * Java class for InitialLegTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="InitialLegTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="endConditionDesignator" type=
"{http://www.aixm.aero/schema/5.2}CodeSegmentTerminationType" minOccurs="0"/>
 *         <element name="legPath" type=
"{http://www.aixm.aero/schema/5.2}CodeTrajectoryType" minOccurs="0"/>
 *         <element name="legTypeARINC" type=
"{http://www.aixm.aero/schema/5.2}CodeSegmentPathType" minOccurs="0"/>
 *         <element name="turnDirection" type=
"{http://www.aixm.aero/schema/5.2}CodeDirectionTurnType" minOccurs="0"/>
 *         <element name="speedLimit" type=
"{http://www.aixm.aero/schema/5.2}ValSpeedType" minOccurs="0"/>
 *         <element name="speedReference" type=
"{http://www.aixm.aero/schema/5.2}CodeSpeedReferenceType" minOccurs="0"/>
 *         <element name="speedInterpretation" type=
"{http://www.aixm.aero/schema/5.2}CodeSpeedInterpretationUseType" minOccurs=
"0"/>
 *         <element name="bankAngle" type=
"{http://www.aixm.aero/schema/5.2}ValAngleType" minOccurs="0"/>
 *         <element name="length" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="duration" type=
"{http://www.aixm.aero/schema/5.2}ValDurationType" minOccurs="0"/>
 *         <element name="procedureTurnRequired" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="upperLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="lowerLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="altitudeOverrideATC" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="altitudeOverrideReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="verticalAngle" type=
"{http://www.aixm.aero/schema/5.2}ValAngleType" minOccurs="0"/>
 *         <element name="startPoint" type=
"{http://www.aixm.aero/schema/5.2}TerminalSegmentPointPropertyType" minOccurs=
"0"/>
 *         <element name="endPoint" type=
"{http://www.aixm.aero/schema/5.2}TerminalSegmentPointPropertyType" minOccurs=
"0"/>
 *         <element name="trajectory" type=
"{http://www.aixm.aero/schema/5.2}CurvePropertyType" minOccurs="0"/>
 *         <element name="arcCentre" type=
"{http://www.aixm.aero/schema/5.2}TerminalSegmentPointPropertyType" minOccurs=
"0"/>
 *         <element name="holding" type=
"{http://www.aixm.aero/schema/5.2}HoldingUsePropertyType" minOccurs="0"/>
 *         <element name="designSurface" type=
"{http://www.aixm.aero/schema/5.2}ObstacleAssessmentSurfacePropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="upperLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="lowerLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="verticalLimitsInterpretation" type=
"{http://www.aixm.aero/schema/5.2}CodeAltitudeUseType" minOccurs="0"/>
 *         <element name="radius" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="additionalEquipment" type=
"{http://www.aixm.aero/schema/5.2}CodeAdditionalEquipmentType" minOccurs="0"/>
 *         <element name="minimumObstacleClearanceAltitude" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="minimumObstacleClearanceHeight" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="aircraftCapability" type=
"{http://www.aixm.aero/schema/5.2}AircraftCharacteristicPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="segmentCourse" type=
"{http://www.aixm.aero/schema/5.2}CourseGroupPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="altitudeCondition" type=
"{http://www.aixm.aero/schema/5.2}SegmentLegAltitudeConditionPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="limitingDistance" type=
"{http://www.aixm.aero/schema/5.2}DistancePropertyType" minOccurs="0"/>
 *         <element name="limitingAngle" type=
"{http://www.aixm.aero/schema/5.2}AnglePropertyType" minOccurs="0"/>
 *         <element name="approach" type=
"{http://www.aixm.aero/schema/5.2}InstrumentApproachProcedurePropertyType" minOccurs
="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractInitialLegExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractApproachLegExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractSegmentLegExtension"/>
 *                 </choice>
 *                 <attGroup ref=
"{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
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
@XmlType(name = "InitialLegTimeSliceType", propOrder = {"endConditionDesignator", "legPath", "legTypeARINC",
        "turnDirection", "speedLimit", "speedReference", "speedInterpretation", "bankAngle", "length", "duration",
        "procedureTurnRequired", "upperLimitReference", "lowerLimitReference", "altitudeOverrideATC",
        "altitudeOverrideReference", "verticalAngle", "startPoint", "endPoint", "trajectory", "arcCentre", "holding",
        "designSurface", "annotation", "upperLimit", "lowerLimit", "verticalLimitsInterpretation", "radius",
        "additionalEquipment", "minimumObstacleClearanceAltitude", "minimumObstacleClearanceHeight",
        "aircraftCapability", "segmentCourse", "altitudeCondition", "limitingDistance", "limitingAngle", "approach",
        "extension"})
@Entity(name = "InitialLegTimeSliceType")
@Table(name = "initialleg_t", schema = "procedure")
public class InitialLegTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "endConditionDesignator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSegmentTerminationType> endConditionDesignator;
    @XmlElementRef(name = "legPath", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTrajectoryType> legPath;
    @XmlElementRef(name = "legTypeARINC", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSegmentPathType> legTypeARINC;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "speedInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedInterpretationUseType> speedInterpretation;
    @XmlElementRef(name = "bankAngle", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> bankAngle;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "duration", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> duration;
    @XmlElementRef(name = "procedureTurnRequired", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> procedureTurnRequired;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "altitudeOverrideATC", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitudeOverrideATC;
    @XmlElementRef(name = "altitudeOverrideReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeOverrideReference;
    @XmlElementRef(name = "verticalAngle", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> verticalAngle;
    @XmlElementRef(name = "startPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> startPoint;
    @XmlElementRef(name = "endPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> endPoint;
    @XmlElementRef(name = "trajectory", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> trajectory;
    @XmlElementRef(name = "arcCentre", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> arcCentre;
    @XmlElementRef(name = "holding", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingUsePropertyType> holding;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentSurfacePropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "verticalLimitsInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> verticalLimitsInterpretation;
    @XmlElementRef(name = "radius", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> radius;
    @XmlElementRef(name = "additionalEquipment", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAdditionalEquipmentType> additionalEquipment;
    @XmlElementRef(name = "minimumObstacleClearanceAltitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumObstacleClearanceAltitude;
    @XmlElementRef(name = "minimumObstacleClearanceHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumObstacleClearanceHeight;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCapability;
    @XmlElement(nillable = true)
    protected List<CourseGroupPropertyType> segmentCourse;
    @XmlElement(nillable = true)
    protected List<SegmentLegAltitudeConditionPropertyType> altitudeCondition;
    @XmlElementRef(name = "limitingDistance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<DistancePropertyType> limitingDistance;
    @XmlElementRef(name = "limitingAngle", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AnglePropertyType> limitingAngle;
    @XmlElementRef(name = "approach", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<InstrumentApproachProcedurePropertyType> approach;
    protected List<InitialLegExtensionType> extension;

    /**
     * Gets the value of the endConditionDesignator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSegmentTerminationType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSegmentTerminationType }{@code >}
     *
     */
    public void setEndConditionDesignator(JAXBElement<CodeSegmentTerminationType> value) {
        this.endConditionDesignator = value;
    }

    @Transient
    public boolean isSetEndConditionDesignator() {
        return (this.endConditionDesignator != null);
    }

    /**
     * Gets the value of the legPath property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeTrajectoryType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeTrajectoryType }{@code >}
     *
     */
    public void setLegPath(JAXBElement<CodeTrajectoryType> value) {
        this.legPath = value;
    }

    @Transient
    public boolean isSetLegPath() {
        return (this.legPath != null);
    }

    /**
     * Gets the value of the legTypeARINC property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSegmentPathType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSegmentPathType }{@code >}
     *
     */
    public void setLegTypeARINC(JAXBElement<CodeSegmentPathType> value) {
        this.legTypeARINC = value;
    }

    @Transient
    public boolean isSetLegTypeARINC() {
        return (this.legTypeARINC != null);
    }

    /**
     * Gets the value of the turnDirection property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeDirectionTurnType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeDirectionTurnType }{@code >}
     *
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

    @Transient
    public boolean isSetTurnDirection() {
        return (this.turnDirection != null);
    }

    /**
     * Gets the value of the speedLimit property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValSpeedType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link ValSpeedType
     *            }{@code >}
     *
     */
    public void setSpeedLimit(JAXBElement<ValSpeedType> value) {
        this.speedLimit = value;
    }

    @Transient
    public boolean isSetSpeedLimit() {
        return (this.speedLimit != null);
    }

    /**
     * Gets the value of the speedReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSpeedReferenceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    @Transient
    public boolean isSetSpeedReference() {
        return (this.speedReference != null);
    }

    /**
     * Gets the value of the speedInterpretation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSpeedInterpretationUseType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeSpeedInterpretationUseType> getSpeedInterpretation() {
        return speedInterpretation;
    }

    /**
     * Sets the value of the speedInterpretation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSpeedInterpretationUseType }{@code >}
     *
     */
    public void setSpeedInterpretation(JAXBElement<CodeSpeedInterpretationUseType> value) {
        this.speedInterpretation = value;
    }

    @Transient
    public boolean isSetSpeedInterpretation() {
        return (this.speedInterpretation != null);
    }

    /**
     * Gets the value of the bankAngle property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValAngleType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link ValAngleType
     *            }{@code >}
     *
     */
    public void setBankAngle(JAXBElement<ValAngleType> value) {
        this.bankAngle = value;
    }

    @Transient
    public boolean isSetBankAngle() {
        return (this.bankAngle != null);
    }

    /**
     * Gets the value of the length property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    @Transient
    public boolean isSetLength() {
        return (this.length != null);
    }

    /**
     * Gets the value of the duration property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDurationType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDurationType }{@code >}
     *
     */
    public void setDuration(JAXBElement<ValDurationType> value) {
        this.duration = value;
    }

    @Transient
    public boolean isSetDuration() {
        return (this.duration != null);
    }

    /**
     * Gets the value of the procedureTurnRequired property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setProcedureTurnRequired(JAXBElement<CodeYesNoType> value) {
        this.procedureTurnRequired = value;
    }

    @Transient
    public boolean isSetProcedureTurnRequired() {
        return (this.procedureTurnRequired != null);
    }

    /**
     * Gets the value of the upperLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    @Transient
    public boolean isSetUpperLimitReference() {
        return (this.upperLimitReference != null);
    }

    /**
     * Gets the value of the lowerLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    @Transient
    public boolean isSetLowerLimitReference() {
        return (this.lowerLimitReference != null);
    }

    /**
     * Gets the value of the altitudeOverrideATC property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setAltitudeOverrideATC(JAXBElement<ValDistanceVerticalType> value) {
        this.altitudeOverrideATC = value;
    }

    @Transient
    public boolean isSetAltitudeOverrideATC() {
        return (this.altitudeOverrideATC != null);
    }

    /**
     * Gets the value of the altitudeOverrideReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setAltitudeOverrideReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeOverrideReference = value;
    }

    @Transient
    public boolean isSetAltitudeOverrideReference() {
        return (this.altitudeOverrideReference != null);
    }

    /**
     * Gets the value of the verticalAngle property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValAngleType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link ValAngleType
     *            }{@code >}
     *
     */
    public void setVerticalAngle(JAXBElement<ValAngleType> value) {
        this.verticalAngle = value;
    }

    @Transient
    public boolean isSetVerticalAngle() {
        return (this.verticalAngle != null);
    }

    /**
     * Gets the value of the startPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *
     */
    public void setStartPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.startPoint = value;
    }

    @Transient
    public boolean isSetStartPoint() {
        return (this.startPoint != null);
    }

    /**
     * Gets the value of the endPoint property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *
     */
    public void setEndPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.endPoint = value;
    }

    @Transient
    public boolean isSetEndPoint() {
        return (this.endPoint != null);
    }

    /**
     * Gets the value of the trajectory property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMCurvePropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *
     */
    public void setTrajectory(JAXBElement<AIXMCurvePropertyType> value) {
        this.trajectory = value;
    }

    @Transient
    public boolean isSetTrajectory() {
        return (this.trajectory != null);
    }

    /**
     * Gets the value of the arcCentre property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *
     */
    public void setArcCentre(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.arcCentre = value;
    }

    @Transient
    public boolean isSetArcCentre() {
        return (this.arcCentre != null);
    }

    /**
     * Gets the value of the holding property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link HoldingUsePropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link HoldingUsePropertyType }{@code >}
     *
     */
    public void setHolding(JAXBElement<HoldingUsePropertyType> value) {
        this.holding = value;
    }

    @Transient
    public boolean isSetHolding() {
        return (this.holding != null);
    }

    /**
     * Gets the value of the designSurface property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the designSurface property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDesignSurface().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentSurfacePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = ObstacleAssessmentSurfacePropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_dsgnsrfc_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "designsurface_hjid", referencedColumnName = "hjid")})
    public List<ObstacleAssessmentSurfacePropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<>();
        }
        return this.designSurface;
    }

    /**
     *
     *
     */
    public void setDesignSurface(List<ObstacleAssessmentSurfacePropertyType> designSurface) {
        this.designSurface = designSurface;
    }

    @Transient
    public boolean isSetDesignSurface() {
        return ((this.designSurface != null) && (!this.designSurface.isEmpty()));
    }

    public void unsetDesignSurface() {
        this.designSurface = null;
    }

    /**
     * Gets the value of the annotation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the annotation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAnnotation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")})
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
        return ((this.annotation != null) && (!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the upperLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    @Transient
    public boolean isSetUpperLimit() {
        return (this.upperLimit != null);
    }

    /**
     * Gets the value of the lowerLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    @Transient
    public boolean isSetLowerLimit() {
        return (this.lowerLimit != null);
    }

    /**
     * Gets the value of the verticalLimitsInterpretation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAltitudeUseType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAltitudeUseType> getVerticalLimitsInterpretation() {
        return verticalLimitsInterpretation;
    }

    /**
     * Sets the value of the verticalLimitsInterpretation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAltitudeUseType }{@code >}
     *
     */
    public void setVerticalLimitsInterpretation(JAXBElement<CodeAltitudeUseType> value) {
        this.verticalLimitsInterpretation = value;
    }

    @Transient
    public boolean isSetVerticalLimitsInterpretation() {
        return (this.verticalLimitsInterpretation != null);
    }

    /**
     * Gets the value of the radius property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setRadius(JAXBElement<ValDistanceType> value) {
        this.radius = value;
    }

    @Transient
    public boolean isSetRadius() {
        return (this.radius != null);
    }

    /**
     * Gets the value of the additionalEquipment property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAdditionalEquipmentType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAdditionalEquipmentType> getAdditionalEquipment() {
        return additionalEquipment;
    }

    /**
     * Sets the value of the additionalEquipment property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAdditionalEquipmentType }{@code >}
     *
     */
    public void setAdditionalEquipment(JAXBElement<CodeAdditionalEquipmentType> value) {
        this.additionalEquipment = value;
    }

    @Transient
    public boolean isSetAdditionalEquipment() {
        return (this.additionalEquipment != null);
    }

    /**
     * Gets the value of the minimumObstacleClearanceAltitude property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumObstacleClearanceAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumObstacleClearanceAltitude = value;
    }

    @Transient
    public boolean isSetMinimumObstacleClearanceAltitude() {
        return (this.minimumObstacleClearanceAltitude != null);
    }

    /**
     * Gets the value of the minimumObstacleClearanceHeight property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumObstacleClearanceHeight() {
        return minimumObstacleClearanceHeight;
    }

    /**
     * Sets the value of the minimumObstacleClearanceHeight property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumObstacleClearanceHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumObstacleClearanceHeight = value;
    }

    @Transient
    public boolean isSetMinimumObstacleClearanceHeight() {
        return (this.minimumObstacleClearanceHeight != null);
    }

    /**
     * Gets the value of the aircraftCapability property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the aircraftCapability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAircraftCapability().add(newItem);
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
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_arcrftcpblt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "aircraftcapability_hjid", referencedColumnName = "hjid")})
    public List<AircraftCharacteristicPropertyType> getAircraftCapability() {
        if (aircraftCapability == null) {
            aircraftCapability = new ArrayList<>();
        }
        return this.aircraftCapability;
    }

    /**
     *
     *
     */
    public void setAircraftCapability(List<AircraftCharacteristicPropertyType> aircraftCapability) {
        this.aircraftCapability = aircraftCapability;
    }

    @Transient
    public boolean isSetAircraftCapability() {
        return ((this.aircraftCapability != null) && (!this.aircraftCapability.isEmpty()));
    }

    public void unsetAircraftCapability() {
        this.aircraftCapability = null;
    }

    /**
     * Gets the value of the segmentCourse property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the segmentCourse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSegmentCourse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseGroupPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = CourseGroupPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_sgmntcrs_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "segmentcourse_hjid", referencedColumnName = "hjid")})
    public List<CourseGroupPropertyType> getSegmentCourse() {
        if (segmentCourse == null) {
            segmentCourse = new ArrayList<>();
        }
        return this.segmentCourse;
    }

    /**
     *
     *
     */
    public void setSegmentCourse(List<CourseGroupPropertyType> segmentCourse) {
        this.segmentCourse = segmentCourse;
    }

    @Transient
    public boolean isSetSegmentCourse() {
        return ((this.segmentCourse != null) && (!this.segmentCourse.isEmpty()));
    }

    public void unsetSegmentCourse() {
        this.segmentCourse = null;
    }

    /**
     * Gets the value of the altitudeCondition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the altitudeCondition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAltitudeCondition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentLegAltitudeConditionPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = SegmentLegAltitudeConditionPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_alttdcndtn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "altitudecondition_hjid", referencedColumnName = "hjid")})
    public List<SegmentLegAltitudeConditionPropertyType> getAltitudeCondition() {
        if (altitudeCondition == null) {
            altitudeCondition = new ArrayList<>();
        }
        return this.altitudeCondition;
    }

    /**
     *
     *
     */
    public void setAltitudeCondition(List<SegmentLegAltitudeConditionPropertyType> altitudeCondition) {
        this.altitudeCondition = altitudeCondition;
    }

    @Transient
    public boolean isSetAltitudeCondition() {
        return ((this.altitudeCondition != null) && (!this.altitudeCondition.isEmpty()));
    }

    public void unsetAltitudeCondition() {
        this.altitudeCondition = null;
    }

    /**
     * Gets the value of the limitingDistance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link DistancePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<DistancePropertyType> getLimitingDistance() {
        return limitingDistance;
    }

    /**
     * Sets the value of the limitingDistance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link DistancePropertyType }{@code >}
     *
     */
    public void setLimitingDistance(JAXBElement<DistancePropertyType> value) {
        this.limitingDistance = value;
    }

    @Transient
    public boolean isSetLimitingDistance() {
        return (this.limitingDistance != null);
    }

    /**
     * Gets the value of the limitingAngle property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AnglePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AnglePropertyType> getLimitingAngle() {
        return limitingAngle;
    }

    /**
     * Sets the value of the limitingAngle property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AnglePropertyType }{@code >}
     *
     */
    public void setLimitingAngle(JAXBElement<AnglePropertyType> value) {
        this.limitingAngle = value;
    }

    @Transient
    public boolean isSetLimitingAngle() {
        return (this.limitingAngle != null);
    }

    /**
     * Gets the value of the approach property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link InstrumentApproachProcedurePropertyType
     *            }{@code >}
     *
     */
    public void setApproach(JAXBElement<InstrumentApproachProcedurePropertyType> value) {
        this.approach = value;
    }

    @Transient
    public boolean isSetApproach() {
        return (this.approach != null);
    }

    /**
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitialLegExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = InitialLegExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "initiallege_hjid", referencedColumnName = "hjid")
    public List<InitialLegExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<InitialLegExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "endconditiondesignator")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "endconditiondesignatornilreason"))})
    public CodeSegmentTerminationType getEndConditionDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSegmentTerminationType.class, this.getEndConditionDesignator());
    }

    public void setEndConditionDesignatorItem(CodeSegmentTerminationType target) {
        setEndConditionDesignator(XmlAdapterUtils.marshallJAXBElement(CodeSegmentTerminationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "endConditionDesignator"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "legpath")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "legpathnilreason"))})
    public CodeTrajectoryType getLegPathItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTrajectoryType.class, this.getLegPath());
    }

    public void setLegPathItem(CodeTrajectoryType target) {
        setLegPath(XmlAdapterUtils.marshallJAXBElement(CodeTrajectoryType.class,
                new QName("http://www.aixm.aero/schema/5.2", "legPath"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "legtypearinc")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "legtypearincnilreason"))})
    public CodeSegmentPathType getLegTypeARINCItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSegmentPathType.class, this.getLegTypeARINC());
    }

    public void setLegTypeARINCItem(CodeSegmentPathType target) {
        setLegTypeARINC(XmlAdapterUtils.marshallJAXBElement(CodeSegmentPathType.class,
                new QName("http://www.aixm.aero/schema/5.2", "legTypeARINC"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "turndirection")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "turndirectionnilreason"))})
    public CodeDirectionTurnType getTurnDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getTurnDirection());
    }

    public void setTurnDirectionItem(CodeDirectionTurnType target) {
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class,
                new QName("http://www.aixm.aero/schema/5.2", "turnDirection"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "speedlimit", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "speedlimituom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "speedlimitnilreason"))})
    public ValSpeedType getSpeedLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeedLimit());
    }

    public void setSpeedLimitItem(ValSpeedType target) {
        setSpeedLimit(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class,
                new QName("http://www.aixm.aero/schema/5.2", "speedLimit"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "speedreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "speedreferencenilreason"))})
    public CodeSpeedReferenceType getSpeedReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpeedReferenceType.class, this.getSpeedReference());
    }

    public void setSpeedReferenceItem(CodeSpeedReferenceType target) {
        setSpeedReference(XmlAdapterUtils.marshallJAXBElement(CodeSpeedReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "speedReference"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "speedinterpretation")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "speedinterpretationnilreason"))})
    public CodeSpeedInterpretationUseType getSpeedInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpeedInterpretationUseType.class, this.getSpeedInterpretation());
    }

    public void setSpeedInterpretationItem(CodeSpeedInterpretationUseType target) {
        setSpeedInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeSpeedInterpretationUseType.class,
                new QName("http://www.aixm.aero/schema/5.2", "speedInterpretation"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "bankangle", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "bankanglenilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "bankangleaccuracy"))})
    public ValAngleType getBankAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getBankAngle());
    }

    public void setBankAngleItem(ValAngleType target) {
        setBankAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class,
                new QName("http://www.aixm.aero/schema/5.2", "bankAngle"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "length", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "lengthuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "lengthaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lengthnilreason"))})
    public ValDistanceType getLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLength());
    }

    public void setLengthItem(ValDistanceType target) {
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "length"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "duration", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "durationuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "durationnilreason"))})
    public ValDurationType getDurationItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getDuration());
    }

    public void setDurationItem(ValDurationType target) {
        setDuration(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "duration"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "procedureturnrequired")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "procedureturnrequirednilreason"))})
    public CodeYesNoType getProcedureTurnRequiredItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getProcedureTurnRequired());
    }

    public void setProcedureTurnRequiredItem(CodeYesNoType target) {
        setProcedureTurnRequired(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "procedureTurnRequired"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "upperlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitreferencenilreason"))})
    public CodeVerticalReferenceType getUpperLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLimitReference());
    }

    public void setUpperLimitReferenceItem(CodeVerticalReferenceType target) {
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "upperLimitReference"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "lowerlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitreferencenilreason"))})
    public CodeVerticalReferenceType getLowerLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLimitReference());
    }

    public void setLowerLimitReferenceItem(CodeVerticalReferenceType target) {
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowerLimitReference"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "altitudeoverrideatc", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "altitudeoverrideatcuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "altitudeoverrideatcaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeoverrideatcnilreason"))})
    public ValDistanceVerticalType getAltitudeOverrideATCItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAltitudeOverrideATC());
    }

    public void setAltitudeOverrideATCItem(ValDistanceVerticalType target) {
        setAltitudeOverrideATC(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "altitudeOverrideATC"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "altitudeoverridereference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeoverridereferencenilreason"))})
    public CodeVerticalReferenceType getAltitudeOverrideReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getAltitudeOverrideReference());
    }

    public void setAltitudeOverrideReferenceItem(CodeVerticalReferenceType target) {
        setAltitudeOverrideReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "altitudeOverrideReference"),
                InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "verticalangle", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "verticalanglenilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "verticalangleaccuracy"))})
    public ValAngleType getVerticalAngleItem() {
        return XmlAdapterUtils.unmarshallSource(ValAngleType.class, this.getVerticalAngle());
    }

    public void setVerticalAngleItem(ValAngleType target) {
        setVerticalAngle(XmlAdapterUtils.marshallJAXBElement(ValAngleType.class,
                new QName("http://www.aixm.aero/schema/5.2", "verticalAngle"), InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_strtpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "startpoint_hjid", referencedColumnName = "hjid")})
    public TerminalSegmentPointPropertyType getStartPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getStartPoint());
    }

    public void setStartPointItem(TerminalSegmentPointPropertyType target) {
        setStartPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "startPoint"), InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_endpnt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "endpoint_hjid", referencedColumnName = "hjid")})
    public TerminalSegmentPointPropertyType getEndPointItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getEndPoint());
    }

    public void setEndPointItem(TerminalSegmentPointPropertyType target) {
        setEndPoint(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "endPoint"), InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_trjctr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "trajectory_hjid", referencedColumnName = "hjid")})
    public AIXMCurvePropertyType getTrajectoryItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getTrajectory());
    }

    public void setTrajectoryItem(AIXMCurvePropertyType target) {
        setTrajectory(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "trajectory"), InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_arccntr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "arccentre_hjid", referencedColumnName = "hjid")})
    public TerminalSegmentPointPropertyType getArcCentreItem() {
        return XmlAdapterUtils.unmarshallSource(TerminalSegmentPointPropertyType.class, this.getArcCentre());
    }

    public void setArcCentreItem(TerminalSegmentPointPropertyType target) {
        setArcCentre(XmlAdapterUtils.marshallJAXBElement(TerminalSegmentPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "arcCentre"), InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = HoldingUsePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_hldng_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "holding_hjid", referencedColumnName = "hjid")})
    public HoldingUsePropertyType getHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(HoldingUsePropertyType.class, this.getHolding());
    }

    public void setHoldingItem(HoldingUsePropertyType target) {
        setHolding(XmlAdapterUtils.marshallJAXBElement(HoldingUsePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "holding"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "upperlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "upperlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "upperlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitnilreason"))})
    public ValDistanceVerticalType getUpperLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimit());
    }

    public void setUpperLimitItem(ValDistanceVerticalType target) {
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "upperLimit"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "lowerlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "lowerlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "lowerlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitnilreason"))})
    public ValDistanceVerticalType getLowerLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimit());
    }

    public void setLowerLimitItem(ValDistanceVerticalType target) {
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lowerLimit"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "verticallimitsinterpretation")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "verticallimitsinterpretationnilreason"))})
    public CodeAltitudeUseType getVerticalLimitsInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAltitudeUseType.class, this.getVerticalLimitsInterpretation());
    }

    public void setVerticalLimitsInterpretationItem(CodeAltitudeUseType target) {
        setVerticalLimitsInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class,
                new QName("http://www.aixm.aero/schema/5.2", "verticalLimitsInterpretation"),
                InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "radius", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "radiusuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "radiusaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "radiusnilreason"))})
    public ValDistanceType getRadiusItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRadius());
    }

    public void setRadiusItem(ValDistanceType target) {
        setRadius(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "radius"), InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "additionalequipment")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "additionalequipmentnilreason"))})
    public CodeAdditionalEquipmentType getAdditionalEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAdditionalEquipmentType.class, this.getAdditionalEquipment());
    }

    public void setAdditionalEquipmentItem(CodeAdditionalEquipmentType target) {
        setAdditionalEquipment(XmlAdapterUtils.marshallJAXBElement(CodeAdditionalEquipmentType.class,
                new QName("http://www.aixm.aero/schema/5.2", "additionalEquipment"), InitialLegTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumobstacleclearancealtitude", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumobstacleclearancealtitudeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumobstacleclearancealtitudeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumobstacleclearancealtitudenilreason"))})
    public ValDistanceVerticalType getMinimumObstacleClearanceAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class,
                this.getMinimumObstacleClearanceAltitude());
    }

    public void setMinimumObstacleClearanceAltitudeItem(ValDistanceVerticalType target) {
        setMinimumObstacleClearanceAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumObstacleClearanceAltitude"),
                InitialLegTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumobstacleclearanceheight", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumobstacleclearanceheightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumobstacleclearanceheightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumobstacleclearanceheightnilreason"))})
    public ValDistanceVerticalType getMinimumObstacleClearanceHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class,
                this.getMinimumObstacleClearanceHeight());
    }

    public void setMinimumObstacleClearanceHeightItem(ValDistanceVerticalType target) {
        setMinimumObstacleClearanceHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumObstacleClearanceHeight"),
                InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = DistancePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_lmtngdstnc_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "limitingdistance_hjid", referencedColumnName = "hjid")})
    public DistancePropertyType getLimitingDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(DistancePropertyType.class, this.getLimitingDistance());
    }

    public void setLimitingDistanceItem(DistancePropertyType target) {
        setLimitingDistance(XmlAdapterUtils.marshallJAXBElement(DistancePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "limitingDistance"), InitialLegTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AnglePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_lmtngangl_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "limitingangle_hjid", referencedColumnName = "hjid")})
    public AnglePropertyType getLimitingAngleItem() {
        return XmlAdapterUtils.unmarshallSource(AnglePropertyType.class, this.getLimitingAngle());
    }

    public void setLimitingAngleItem(AnglePropertyType target) {
        setLimitingAngle(XmlAdapterUtils.marshallJAXBElement(AnglePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "limitingAngle"), InitialLegTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = InstrumentApproachProcedurePropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "intllgtmslctp_apprch_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "initialleg_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "approach_hjid", referencedColumnName = "hjid")})
    public InstrumentApproachProcedurePropertyType getApproachItem() {
        return XmlAdapterUtils.unmarshallSource(InstrumentApproachProcedurePropertyType.class, this.getApproach());
    }

    public void setApproachItem(InstrumentApproachProcedurePropertyType target) {
        setApproach(XmlAdapterUtils.marshallJAXBElement(InstrumentApproachProcedurePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "approach"), InitialLegTimeSliceType.class, target));
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final InitialLegTimeSliceType that = ((InitialLegTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetSpeedInterpretation();
            boolean rhsFieldIsSet = that.isSetSpeedInterpretation();
            JAXBElement<CodeSpeedInterpretationUseType> lhsField;
            lhsField = this.getSpeedInterpretation();
            JAXBElement<CodeSpeedInterpretationUseType> rhsField;
            rhsField = that.getSpeedInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedInterpretation", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAltitudeCondition();
            boolean rhsFieldIsSet = that.isSetAltitudeCondition();
            List<SegmentLegAltitudeConditionPropertyType> lhsField;
            lhsField = (this.isSetAltitudeCondition() ? this.getAltitudeCondition() : null);
            List<SegmentLegAltitudeConditionPropertyType> rhsField;
            rhsField = (that.isSetAltitudeCondition() ? that.getAltitudeCondition() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeCondition", rhsField);
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
            List<InitialLegExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<InitialLegExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
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
            boolean lhsFieldIsSet = this.isSetDesignSurface();
            boolean rhsFieldIsSet = that.isSetDesignSurface();
            List<ObstacleAssessmentSurfacePropertyType> lhsField;
            lhsField = (this.isSetDesignSurface() ? this.getDesignSurface() : null);
            List<ObstacleAssessmentSurfacePropertyType> rhsField;
            rhsField = (that.isSetDesignSurface() ? that.getDesignSurface() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designSurface", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMinimumObstacleClearanceHeight();
            boolean rhsFieldIsSet = that.isSetMinimumObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumObstacleClearanceHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumObstacleClearanceHeight",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumObstacleClearanceHeight",
                    rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCapability();
            boolean rhsFieldIsSet = that.isSetAircraftCapability();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCapability() ? this.getAircraftCapability() : null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCapability() ? that.getAircraftCapability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCapability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCapability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalLimitsInterpretation();
            boolean rhsFieldIsSet = that.isSetVerticalLimitsInterpretation();
            JAXBElement<CodeAltitudeUseType> lhsField;
            lhsField = this.getVerticalLimitsInterpretation();
            JAXBElement<CodeAltitudeUseType> rhsField;
            rhsField = that.getVerticalLimitsInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalLimitsInterpretation",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalLimitsInterpretation",
                    rhsField);
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
            boolean lhsFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumObstacleClearanceAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumObstacleClearanceAltitude",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumObstacleClearanceAltitude",
                    rhsField);
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
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation() ? that.getAnnotation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
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
            boolean lhsFieldIsSet = this.isSetSegmentCourse();
            boolean rhsFieldIsSet = that.isSetSegmentCourse();
            List<CourseGroupPropertyType> lhsField;
            lhsField = (this.isSetSegmentCourse() ? this.getSegmentCourse() : null);
            List<CourseGroupPropertyType> rhsField;
            rhsField = (that.isSetSegmentCourse() ? that.getSegmentCourse() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "segmentCourse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "segmentCourse", rhsField);
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
            boolean lhsFieldIsSet = this.isSetLimitingDistance();
            boolean rhsFieldIsSet = that.isSetLimitingDistance();
            JAXBElement<DistancePropertyType> lhsField;
            lhsField = this.getLimitingDistance();
            JAXBElement<DistancePropertyType> rhsField;
            rhsField = that.getLimitingDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "limitingDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "limitingDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLimitingAngle();
            boolean rhsFieldIsSet = that.isSetLimitingAngle();
            JAXBElement<AnglePropertyType> lhsField;
            lhsField = this.getLimitingAngle();
            JAXBElement<AnglePropertyType> rhsField;
            rhsField = that.getLimitingAngle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "limitingAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "limitingAngle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdditionalEquipment();
            boolean rhsFieldIsSet = that.isSetAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> lhsField;
            lhsField = this.getAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> rhsField;
            rhsField = that.getAdditionalEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "additionalEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "additionalEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadius();
            boolean rhsFieldIsSet = that.isSetRadius();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRadius();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRadius();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radius", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radius", rhsField);
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
            JAXBElement<CodeSpeedInterpretationUseType> theField;
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
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimitReference", theField);
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
            boolean theFieldIsSet = this.isSetHolding();
            JAXBElement<HoldingUsePropertyType> theField;
            theField = this.getHolding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentSurfacePropertyType> theField;
            theField = (this.isSetDesignSurface() ? this.getDesignSurface() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designSurface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
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
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalLimitsInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getVerticalLimitsInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalLimitsInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadius();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRadius();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radius", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> theField;
            theField = this.getAdditionalEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "additionalEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumObstacleClearanceAltitude",
                    theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumObstacleClearanceHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCapability();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCapability() ? this.getAircraftCapability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCapability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSegmentCourse();
            List<CourseGroupPropertyType> theField;
            theField = (this.isSetSegmentCourse() ? this.getSegmentCourse() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "segmentCourse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeCondition();
            List<SegmentLegAltitudeConditionPropertyType> theField;
            theField = (this.isSetAltitudeCondition() ? this.getAltitudeCondition() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLimitingDistance();
            JAXBElement<DistancePropertyType> theField;
            theField = this.getLimitingDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "limitingDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLimitingAngle();
            JAXBElement<AnglePropertyType> theField;
            theField = this.getLimitingAngle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "limitingAngle", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<InitialLegExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
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
            JAXBElement<CodeSpeedInterpretationUseType> theField;
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
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            strategy.appendField(locator, this, "upperLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            strategy.appendField(locator, this, "lowerLimitReference", buffer, theField, theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetHolding();
            JAXBElement<HoldingUsePropertyType> theField;
            theField = this.getHolding();
            strategy.appendField(locator, this, "holding", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentSurfacePropertyType> theField;
            theField = (this.isSetDesignSurface() ? this.getDesignSurface() : null);
            strategy.appendField(locator, this, "designSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            strategy.appendField(locator, this, "upperLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            strategy.appendField(locator, this, "lowerLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalLimitsInterpretation();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getVerticalLimitsInterpretation();
            strategy.appendField(locator, this, "verticalLimitsInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadius();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRadius();
            strategy.appendField(locator, this, "radius", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> theField;
            theField = this.getAdditionalEquipment();
            strategy.appendField(locator, this, "additionalEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceAltitude();
            strategy.appendField(locator, this, "minimumObstacleClearanceAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceHeight();
            strategy.appendField(locator, this, "minimumObstacleClearanceHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCapability();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCapability() ? this.getAircraftCapability() : null);
            strategy.appendField(locator, this, "aircraftCapability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSegmentCourse();
            List<CourseGroupPropertyType> theField;
            theField = (this.isSetSegmentCourse() ? this.getSegmentCourse() : null);
            strategy.appendField(locator, this, "segmentCourse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeCondition();
            List<SegmentLegAltitudeConditionPropertyType> theField;
            theField = (this.isSetAltitudeCondition() ? this.getAltitudeCondition() : null);
            strategy.appendField(locator, this, "altitudeCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLimitingDistance();
            JAXBElement<DistancePropertyType> theField;
            theField = this.getLimitingDistance();
            strategy.appendField(locator, this, "limitingDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLimitingAngle();
            JAXBElement<AnglePropertyType> theField;
            theField = this.getLimitingAngle();
            strategy.appendField(locator, this, "limitingAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproach();
            strategy.appendField(locator, this, "approach", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<InitialLegExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
