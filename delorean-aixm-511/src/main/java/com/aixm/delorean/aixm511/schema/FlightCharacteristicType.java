
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
 * <p>Java class for FlightCharacteristicType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightCharacteristicType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FlightCharacteristicPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightCharacteristicExtension"/>
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
@XmlType(name = "FlightCharacteristicType", propOrder = {
    "type",
    "rule",
    "status",
    "military",
    "origin",
    "purpose",
    "annotation",
    "extension"
})
@Entity(name = "FlightCharacteristicType")
@Table(name = "flightcharacteristic", schema = "shared")
public class FlightCharacteristicType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightType> type;
    @XmlElementRef(name = "rule", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightRuleType> rule;
    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightStatusType> status;
    @XmlElementRef(name = "military", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryStatusType> military;
    @XmlElementRef(name = "origin", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightOriginType> origin;
    @XmlElementRef(name = "purpose", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightPurposeType> purpose;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightCharacteristicTypeExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeFlightType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightRuleType> getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public void setRule(JAXBElement<CodeFlightRuleType> value) {
        this.rule = value;
    }

    @Transient
    public boolean isSetRule() {
        return (this.rule!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightStatusType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightStatusType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightStatusType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<CodeFlightStatusType> value) {
        this.status = value;
    }

    @Transient
    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the military property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMilitaryStatusType> getMilitary() {
        return military;
    }

    /**
     * Sets the value of the military property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    public void setMilitary(JAXBElement<CodeMilitaryStatusType> value) {
        this.military = value;
    }

    @Transient
    public boolean isSetMilitary() {
        return (this.military!= null);
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightOriginType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightOriginType> getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightOriginType }{@code >}
     *     
     */
    public void setOrigin(JAXBElement<CodeFlightOriginType> value) {
        this.origin = value;
    }

    @Transient
    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightPurposeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightPurposeType> getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightPurposeType }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<CodeFlightPurposeType> value) {
        this.purpose = value;
    }

    @Transient
    public boolean isSetPurpose() {
        return (this.purpose!= null);
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
    @JoinTable(name = "annotation_flightcharacteristic_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "flightcharacteristicpropertygroup", referencedColumnName = "hjid")
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
     * {@link FlightCharacteristicTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FlightCharacteristicTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<FlightCharacteristicTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FlightCharacteristicTypeExtensionType> extension) {
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
    public CodeFlightType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightType.class, this.getType());
    }

    public void setTypeItem(CodeFlightType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeFlightType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), FlightCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "rule")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "rule_nilreason"))
    })
    public CodeFlightRuleType getRuleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightRuleType.class, this.getRule());
    }

    public void setRuleItem(CodeFlightRuleType target) {
        setRule(XmlAdapterUtils.marshallJAXBElement(CodeFlightRuleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "rule"), FlightCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "status")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "status_nilreason"))
    })
    public CodeFlightStatusType getStatusItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightStatusType.class, this.getStatus());
    }

    public void setStatusItem(CodeFlightStatusType target) {
        setStatus(XmlAdapterUtils.marshallJAXBElement(CodeFlightStatusType.class, new QName("http://www.aixm.aero/schema/5.1.1", "status"), FlightCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "military")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "military_nilreason"))
    })
    public CodeMilitaryStatusType getMilitaryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMilitaryStatusType.class, this.getMilitary());
    }

    public void setMilitaryItem(CodeMilitaryStatusType target) {
        setMilitary(XmlAdapterUtils.marshallJAXBElement(CodeMilitaryStatusType.class, new QName("http://www.aixm.aero/schema/5.1.1", "military"), FlightCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "origin")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "origin_nilreason"))
    })
    public CodeFlightOriginType getOriginItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightOriginType.class, this.getOrigin());
    }

    public void setOriginItem(CodeFlightOriginType target) {
        setOrigin(XmlAdapterUtils.marshallJAXBElement(CodeFlightOriginType.class, new QName("http://www.aixm.aero/schema/5.1.1", "origin"), FlightCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "purpose")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "purpose_nilreason"))
    })
    public CodeFlightPurposeType getPurposeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightPurposeType.class, this.getPurpose());
    }

    public void setPurposeItem(CodeFlightPurposeType target) {
        setPurpose(XmlAdapterUtils.marshallJAXBElement(CodeFlightPurposeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "purpose"), FlightCharacteristicType.class, target));
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
        final FlightCharacteristicType that = ((FlightCharacteristicType) object);
        {
            boolean lhsFieldIsSet = this.isSetStatus();
            boolean rhsFieldIsSet = that.isSetStatus();
            JAXBElement<CodeFlightStatusType> lhsField;
            lhsField = this.getStatus();
            JAXBElement<CodeFlightStatusType> rhsField;
            rhsField = that.getStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "status", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "status", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOrigin();
            boolean rhsFieldIsSet = that.isSetOrigin();
            JAXBElement<CodeFlightOriginType> lhsField;
            lhsField = this.getOrigin();
            JAXBElement<CodeFlightOriginType> rhsField;
            rhsField = that.getOrigin();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "origin", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "origin", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPurpose();
            boolean rhsFieldIsSet = that.isSetPurpose();
            JAXBElement<CodeFlightPurposeType> lhsField;
            lhsField = this.getPurpose();
            JAXBElement<CodeFlightPurposeType> rhsField;
            rhsField = that.getPurpose();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "purpose", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "purpose", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRule();
            boolean rhsFieldIsSet = that.isSetRule();
            JAXBElement<CodeFlightRuleType> lhsField;
            lhsField = this.getRule();
            JAXBElement<CodeFlightRuleType> rhsField;
            rhsField = that.getRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rule", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitary();
            boolean rhsFieldIsSet = that.isSetMilitary();
            JAXBElement<CodeMilitaryStatusType> lhsField;
            lhsField = this.getMilitary();
            JAXBElement<CodeMilitaryStatusType> rhsField;
            rhsField = that.getMilitary();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "military", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "military", rhsField);
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
            JAXBElement<CodeFlightType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeFlightType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FlightCharacteristicTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FlightCharacteristicTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            JAXBElement<CodeFlightType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRule();
            JAXBElement<CodeFlightRuleType> theField;
            theField = this.getRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeFlightStatusType> theField;
            theField = this.getStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "status", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitary();
            JAXBElement<CodeMilitaryStatusType> theField;
            theField = this.getMilitary();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "military", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrigin();
            JAXBElement<CodeFlightOriginType> theField;
            theField = this.getOrigin();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "origin", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPurpose();
            JAXBElement<CodeFlightPurposeType> theField;
            theField = this.getPurpose();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "purpose", theField);
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
            List<FlightCharacteristicTypeExtensionType> theField;
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
            JAXBElement<CodeFlightType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRule();
            JAXBElement<CodeFlightRuleType> theField;
            theField = this.getRule();
            strategy.appendField(locator, this, "rule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeFlightStatusType> theField;
            theField = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitary();
            JAXBElement<CodeMilitaryStatusType> theField;
            theField = this.getMilitary();
            strategy.appendField(locator, this, "military", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrigin();
            JAXBElement<CodeFlightOriginType> theField;
            theField = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPurpose();
            JAXBElement<CodeFlightPurposeType> theField;
            theField = this.getPurpose();
            strategy.appendField(locator, this, "purpose", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightCharacteristicTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
