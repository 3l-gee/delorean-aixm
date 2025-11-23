
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
 * <p>Java class for ProcedureTransitionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcedureTransitionType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ProcedureTransitionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractProcedureTransitionExtension"/>
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
@XmlType(name = "ProcedureTransitionType", propOrder = {
    "transitionId",
    "type",
    "instruction",
    "vectorHeading",
    "departureRunwayTransition",
    "trajectory",
    "transitionLeg",
    "annotation",
    "extension"
})
@Entity(name = "ProcedureTransitionType")
@Table(name = "proceduretransition", schema = "procedure")
public class ProcedureTransitionType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "transitionId", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesignatedPointDesignatorType> transitionId;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedurePhaseType> type;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "vectorHeading", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> vectorHeading;
    @XmlElementRef(name = "departureRunwayTransition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> departureRunwayTransition;
    @XmlElementRef(name = "trajectory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> trajectory;
    @XmlElement(nillable = true)
    protected List<ProcedureTransitionLegPropertyType> transitionLeg;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ProcedureTransitionTypeExtensionType> extension;

    /**
     * Gets the value of the transitionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignatedPointDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDesignatedPointDesignatorType> getTransitionId() {
        return transitionId;
    }

    /**
     * Sets the value of the transitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignatedPointDesignatorType }{@code >}
     *     
     */
    public void setTransitionId(JAXBElement<CodeDesignatedPointDesignatorType> value) {
        this.transitionId = value;
    }

    @Transient
    public boolean isSetTransitionId() {
        return (this.transitionId!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedurePhaseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeProcedurePhaseType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedurePhaseType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeProcedurePhaseType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
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
     * Gets the value of the vectorHeading property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getVectorHeading() {
        return vectorHeading;
    }

    /**
     * Sets the value of the vectorHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setVectorHeading(JAXBElement<ValBearingType> value) {
        this.vectorHeading = value;
    }

    @Transient
    public boolean isSetVectorHeading() {
        return (this.vectorHeading!= null);
    }

    /**
     * Gets the value of the departureRunwayTransition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<LandingTakeoffAreaCollectionPropertyType> getDepartureRunwayTransition() {
        return departureRunwayTransition;
    }

    /**
     * Sets the value of the departureRunwayTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public void setDepartureRunwayTransition(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.departureRunwayTransition = value;
    }

    @Transient
    public boolean isSetDepartureRunwayTransition() {
        return (this.departureRunwayTransition!= null);
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
     * Gets the value of the transitionLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureTransitionLegPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ProcedureTransitionLegPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "transitionleg_proceduretransition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "transitionleg", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "proceduretransitionpropertygroup", referencedColumnName = "hjid")
    })
    public List<ProcedureTransitionLegPropertyType> getTransitionLeg() {
        if (transitionLeg == null) {
            transitionLeg = new ArrayList<>();
        }
        return this.transitionLeg;
    }

    /**
     * 
     * 
     */
    public void setTransitionLeg(List<ProcedureTransitionLegPropertyType> transitionLeg) {
        this.transitionLeg = transitionLeg;
    }

    @Transient
    public boolean isSetTransitionLeg() {
        return ((this.transitionLeg!= null)&&(!this.transitionLeg.isEmpty()));
    }

    public void unsetTransitionLeg() {
        this.transitionLeg = null;
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
    @JoinTable(name = "annotation_proceduretransition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "proceduretransitionpropertygroup", referencedColumnName = "hjid")
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
     * {@link ProcedureTransitionTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ProcedureTransitionTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_PROCEDURE_TRANSITI_0")
    public List<ProcedureTransitionTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ProcedureTransitionTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "transitionid")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "transitionid_nilreason"))
    })
    public CodeDesignatedPointDesignatorType getTransitionIdItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDesignatedPointDesignatorType.class, this.getTransitionId());
    }

    public void setTransitionIdItem(CodeDesignatedPointDesignatorType target) {
        setTransitionId(XmlAdapterUtils.marshallJAXBElement(CodeDesignatedPointDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "transitionId"), ProcedureTransitionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeProcedurePhaseType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeProcedurePhaseType.class, this.getType());
    }

    public void setTypeItem(CodeProcedurePhaseType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeProcedurePhaseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), ProcedureTransitionType.class, target));
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
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instruction"), ProcedureTransitionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "vectorheading")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "vectorheading_nilreason"))
    })
    public ValBearingType getVectorHeadingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getVectorHeading());
    }

    public void setVectorHeadingItem(ValBearingType target) {
        setVectorHeading(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "vectorHeading"), ProcedureTransitionType.class, target));
    }

    @ManyToOne(targetEntity = LandingTakeoffAreaCollectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "departurerunwaytransition_id", referencedColumnName = "hjid")
    public LandingTakeoffAreaCollectionPropertyType getDepartureRunwayTransitionItem() {
        return XmlAdapterUtils.unmarshallSource(LandingTakeoffAreaCollectionPropertyType.class, this.getDepartureRunwayTransition());
    }

    public void setDepartureRunwayTransitionItem(LandingTakeoffAreaCollectionPropertyType target) {
        setDepartureRunwayTransition(XmlAdapterUtils.marshallJAXBElement(LandingTakeoffAreaCollectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "departureRunwayTransition"), ProcedureTransitionType.class, target));
    }

    @ManyToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "trajectory_id", referencedColumnName = "hjid")
    public AIXMCurvePropertyType getTrajectoryItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getTrajectory());
    }

    public void setTrajectoryItem(AIXMCurvePropertyType target) {
        setTrajectory(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trajectory"), ProcedureTransitionType.class, target));
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
        final ProcedureTransitionType that = ((ProcedureTransitionType) object);
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
            boolean lhsFieldIsSet = this.isSetVectorHeading();
            boolean rhsFieldIsSet = that.isSetVectorHeading();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getVectorHeading();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getVectorHeading();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "vectorHeading", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "vectorHeading", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTransitionLeg();
            boolean rhsFieldIsSet = that.isSetTransitionLeg();
            List<ProcedureTransitionLegPropertyType> lhsField;
            lhsField = (this.isSetTransitionLeg()?this.getTransitionLeg():null);
            List<ProcedureTransitionLegPropertyType> rhsField;
            rhsField = (that.isSetTransitionLeg()?that.getTransitionLeg():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transitionLeg", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transitionLeg", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTransitionId();
            boolean rhsFieldIsSet = that.isSetTransitionId();
            JAXBElement<CodeDesignatedPointDesignatorType> lhsField;
            lhsField = this.getTransitionId();
            JAXBElement<CodeDesignatedPointDesignatorType> rhsField;
            rhsField = that.getTransitionId();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "transitionId", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "transitionId", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDepartureRunwayTransition();
            boolean rhsFieldIsSet = that.isSetDepartureRunwayTransition();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> lhsField;
            lhsField = this.getDepartureRunwayTransition();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> rhsField;
            rhsField = that.getDepartureRunwayTransition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "departureRunwayTransition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "departureRunwayTransition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ProcedureTransitionTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ProcedureTransitionTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeProcedurePhaseType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeProcedurePhaseType> rhsField;
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
            boolean theFieldIsSet = this.isSetTransitionId();
            JAXBElement<CodeDesignatedPointDesignatorType> theField;
            theField = this.getTransitionId();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transitionId", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeProcedurePhaseType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
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
            boolean theFieldIsSet = this.isSetVectorHeading();
            JAXBElement<ValBearingType> theField;
            theField = this.getVectorHeading();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "vectorHeading", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepartureRunwayTransition();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = this.getDepartureRunwayTransition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "departureRunwayTransition", theField);
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
            boolean theFieldIsSet = this.isSetTransitionLeg();
            List<ProcedureTransitionLegPropertyType> theField;
            theField = (this.isSetTransitionLeg()?this.getTransitionLeg():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "transitionLeg", theField);
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
            List<ProcedureTransitionTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTransitionId();
            JAXBElement<CodeDesignatedPointDesignatorType> theField;
            theField = this.getTransitionId();
            strategy.appendField(locator, this, "transitionId", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeProcedurePhaseType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getInstruction();
            strategy.appendField(locator, this, "instruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVectorHeading();
            JAXBElement<ValBearingType> theField;
            theField = this.getVectorHeading();
            strategy.appendField(locator, this, "vectorHeading", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDepartureRunwayTransition();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = this.getDepartureRunwayTransition();
            strategy.appendField(locator, this, "departureRunwayTransition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrajectory();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getTrajectory();
            strategy.appendField(locator, this, "trajectory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTransitionLeg();
            List<ProcedureTransitionLegPropertyType> theField;
            theField = (this.isSetTransitionLeg()?this.getTransitionLeg():null);
            strategy.appendField(locator, this, "transitionLeg", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ProcedureTransitionTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
