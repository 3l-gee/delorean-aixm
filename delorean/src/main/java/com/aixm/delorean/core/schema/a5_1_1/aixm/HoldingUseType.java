
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
 * <p>Java class for HoldingUseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingUseType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}HoldingUsePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractHoldingUseExtension"/>
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
@XmlType(name = "HoldingUseType", propOrder = {
    "holdingUse",
    "instruction",
    "instructedAltitude",
    "instructionAltitudeReference",
    "annotation",
    "theHoldingPattern",
    "extension"
})
@Entity(name = "HoldingUseType")
@Table(name = "holdinguse", schema = "procedure")
public class HoldingUseType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "holdingUse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHoldingUseType> holdingUse;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "instructedAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> instructedAltitude;
    @XmlElementRef(name = "instructionAltitudeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> instructionAltitudeReference;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected HoldingPatternPropertyType theHoldingPattern;
    protected List<HoldingUseTypeExtensionType> extension;

    /**
     * Gets the value of the holdingUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeHoldingUseType> getHoldingUse() {
        return holdingUse;
    }

    /**
     * Sets the value of the holdingUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUseType }{@code >}
     *     
     */
    public void setHoldingUse(JAXBElement<CodeHoldingUseType> value) {
        this.holdingUse = value;
    }

    @Transient
    public boolean isSetHoldingUse() {
        return (this.holdingUse!= null);
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
     * Gets the value of the instructedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getInstructedAltitude() {
        return instructedAltitude;
    }

    /**
     * Sets the value of the instructedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setInstructedAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.instructedAltitude = value;
    }

    @Transient
    public boolean isSetInstructedAltitude() {
        return (this.instructedAltitude!= null);
    }

    /**
     * Gets the value of the instructionAltitudeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getInstructionAltitudeReference() {
        return instructionAltitudeReference;
    }

    /**
     * Sets the value of the instructionAltitudeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setInstructionAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.instructionAltitudeReference = value;
    }

    @Transient
    public boolean isSetInstructionAltitudeReference() {
        return (this.instructionAltitudeReference!= null);
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
    @JoinTable(name = "annotation_holdinguse_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "holdingusepropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the theHoldingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingPatternPropertyType }
     *     
     */
    @ManyToOne(targetEntity = HoldingPatternPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "theholdingpattern_id", referencedColumnName = "hjid")
    public HoldingPatternPropertyType getTheHoldingPattern() {
        return theHoldingPattern;
    }

    /**
     * Sets the value of the theHoldingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingPatternPropertyType }
     *     
     */
    public void setTheHoldingPattern(HoldingPatternPropertyType value) {
        this.theHoldingPattern = value;
    }

    @Transient
    public boolean isSetTheHoldingPattern() {
        return (this.theHoldingPattern!= null);
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
     * {@link HoldingUseTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = HoldingUseTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_HOLDING_USE_TYPE_H_0")
    public List<HoldingUseTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<HoldingUseTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "holdinguse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "holdinguse_nilreason"))
    })
    public CodeHoldingUseType getHoldingUseItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHoldingUseType.class, this.getHoldingUse());
    }

    public void setHoldingUseItem(CodeHoldingUseType target) {
        setHoldingUse(XmlAdapterUtils.marshallJAXBElement(CodeHoldingUseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "holdingUse"), HoldingUseType.class, target));
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
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instruction"), HoldingUseType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "instructedaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "instructedaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "instructedaltitude_nilreason"))
    })
    public ValDistanceVerticalType getInstructedAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getInstructedAltitude());
    }

    public void setInstructedAltitudeItem(ValDistanceVerticalType target) {
        setInstructedAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instructedAltitude"), HoldingUseType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "instructionaltitudereference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "instructionaltitudereference_nilreason"))
    })
    public CodeVerticalReferenceType getInstructionAltitudeReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getInstructionAltitudeReference());
    }

    public void setInstructionAltitudeReferenceItem(CodeVerticalReferenceType target) {
        setInstructionAltitudeReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instructionAltitudeReference"), HoldingUseType.class, target));
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
        final HoldingUseType that = ((HoldingUseType) object);
        {
            boolean lhsFieldIsSet = this.isSetHoldingUse();
            boolean rhsFieldIsSet = that.isSetHoldingUse();
            JAXBElement<CodeHoldingUseType> lhsField;
            lhsField = this.getHoldingUse();
            JAXBElement<CodeHoldingUseType> rhsField;
            rhsField = that.getHoldingUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holdingUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holdingUse", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<HoldingUseTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<HoldingUseTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInstructionAltitudeReference();
            boolean rhsFieldIsSet = that.isSetInstructionAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getInstructionAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getInstructionAltitudeReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "instructionAltitudeReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "instructionAltitudeReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTheHoldingPattern();
            boolean rhsFieldIsSet = that.isSetTheHoldingPattern();
            HoldingPatternPropertyType lhsField;
            lhsField = this.getTheHoldingPattern();
            HoldingPatternPropertyType rhsField;
            rhsField = that.getTheHoldingPattern();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "theHoldingPattern", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "theHoldingPattern", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInstructedAltitude();
            boolean rhsFieldIsSet = that.isSetInstructedAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getInstructedAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getInstructedAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "instructedAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "instructedAltitude", rhsField);
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
            boolean theFieldIsSet = this.isSetHoldingUse();
            JAXBElement<CodeHoldingUseType> theField;
            theField = this.getHoldingUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holdingUse", theField);
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
            boolean theFieldIsSet = this.isSetInstructedAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getInstructedAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "instructedAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstructionAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getInstructionAltitudeReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "instructionAltitudeReference", theField);
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
            boolean theFieldIsSet = this.isSetTheHoldingPattern();
            HoldingPatternPropertyType theField;
            theField = this.getTheHoldingPattern();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "theHoldingPattern", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<HoldingUseTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetHoldingUse();
            JAXBElement<CodeHoldingUseType> theField;
            theField = this.getHoldingUse();
            strategy.appendField(locator, this, "holdingUse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getInstruction();
            strategy.appendField(locator, this, "instruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstructedAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getInstructedAltitude();
            strategy.appendField(locator, this, "instructedAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstructionAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getInstructionAltitudeReference();
            strategy.appendField(locator, this, "instructionAltitudeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheHoldingPattern();
            HoldingPatternPropertyType theField;
            theField = this.getTheHoldingPattern();
            strategy.appendField(locator, this, "theHoldingPattern", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<HoldingUseTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
