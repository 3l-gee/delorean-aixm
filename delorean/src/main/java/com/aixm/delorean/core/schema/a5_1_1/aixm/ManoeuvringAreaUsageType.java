
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
 * <p>Java class for ManoeuvringAreaUsageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManoeuvringAreaUsageType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractUsageConditionType">
 *       <sequence>
 *         <element name="type" type="{http://www.aixm.aero/schema/5.1.1}CodeUsageLimitationType" minOccurs="0"/>
 *         <element name="priorPermission" type="{http://www.aixm.aero/schema/5.1.1}ValDurationType" minOccurs="0"/>
 *         <element name="contact" type="{http://www.aixm.aero/schema/5.1.1}ContactInformationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="selection" type="{http://www.aixm.aero/schema/5.1.1}ConditionCombinationPropertyType" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ManoeuvringAreaUsagePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractUsageConditionExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractManoeuvringAreaUsageExtension"/>
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
@XmlType(name = "ManoeuvringAreaUsageType", propOrder = {
    "type",
    "priorPermission",
    "contact",
    "selection",
    "annotation",
    "operation",
    "extension"
})
@Entity(name = "ManoeuvringAreaUsageType")
@Table(name = "manoeuvringareausage", schema = "airport_heliport")
public class ManoeuvringAreaUsageType
    extends AbstractUsageConditionType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUsageLimitationType> type;
    @XmlElementRef(name = "priorPermission", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> priorPermission;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElementRef(name = "selection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionCombinationPropertyType> selection;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "operation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeOperationManoeuvringAreaType> operation;
    protected List<ManoeuvringAreaUsageTypeExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUsageLimitationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeUsageLimitationType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUsageLimitationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeUsageLimitationType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the priorPermission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDurationType> getPriorPermission() {
        return priorPermission;
    }

    /**
     * Sets the value of the priorPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setPriorPermission(JAXBElement<ValDurationType> value) {
        this.priorPermission = value;
    }

    @Transient
    public boolean isSetPriorPermission() {
        return (this.priorPermission!= null);
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ContactInformationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "contact_manoeuvringareausage_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "contact", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "manoeuvringareausagetype", referencedColumnName = "hjid")
    })
    public List<ContactInformationPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
    }

    /**
     * 
     * 
     */
    public void setContact(List<ContactInformationPropertyType> contact) {
        this.contact = contact;
    }

    @Transient
    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ConditionCombinationPropertyType> getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationPropertyType }{@code >}
     *     
     */
    public void setSelection(JAXBElement<ConditionCombinationPropertyType> value) {
        this.selection = value;
    }

    @Transient
    public boolean isSetSelection() {
        return (this.selection!= null);
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
    @JoinTable(name = "annotation_manoeuvringareausage_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "manoeuvringareausagetype", referencedColumnName = "hjid")
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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeOperationManoeuvringAreaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeOperationManoeuvringAreaType> getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeOperationManoeuvringAreaType }{@code >}
     *     
     */
    public void setOperation(JAXBElement<CodeOperationManoeuvringAreaType> value) {
        this.operation = value;
    }

    @Transient
    public boolean isSetOperation() {
        return (this.operation!= null);
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
     * {@link ManoeuvringAreaUsageTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ManoeuvringAreaUsageTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_MANOEUVRING_AREA_U_0")
    public List<ManoeuvringAreaUsageTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ManoeuvringAreaUsageTypeExtensionType> extension) {
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
    public CodeUsageLimitationType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeUsageLimitationType.class, this.getType());
    }

    public void setTypeItem(CodeUsageLimitationType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeUsageLimitationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), ManoeuvringAreaUsageType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "priorpermission")),
        @AttributeOverride(name = "uom", column = @Column(name = "priorpermission_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "priorpermission_nilreason"))
    })
    public ValDurationType getPriorPermissionItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getPriorPermission());
    }

    public void setPriorPermissionItem(ValDurationType target) {
        setPriorPermission(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "priorPermission"), ManoeuvringAreaUsageType.class, target));
    }

    @ManyToOne(targetEntity = ConditionCombinationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "selection_id", referencedColumnName = "hjid")
    public ConditionCombinationPropertyType getSelectionItem() {
        return XmlAdapterUtils.unmarshallSource(ConditionCombinationPropertyType.class, this.getSelection());
    }

    public void setSelectionItem(ConditionCombinationPropertyType target) {
        setSelection(XmlAdapterUtils.marshallJAXBElement(ConditionCombinationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "selection"), ManoeuvringAreaUsageType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "operation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "operation_nilreason"))
    })
    public CodeOperationManoeuvringAreaType getOperationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeOperationManoeuvringAreaType.class, this.getOperation());
    }

    public void setOperationItem(CodeOperationManoeuvringAreaType target) {
        setOperation(XmlAdapterUtils.marshallJAXBElement(CodeOperationManoeuvringAreaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "operation"), ManoeuvringAreaUsageType.class, target));
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
        final ManoeuvringAreaUsageType that = ((ManoeuvringAreaUsageType) object);
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
            boolean lhsFieldIsSet = this.isSetContact();
            boolean rhsFieldIsSet = that.isSetContact();
            List<ContactInformationPropertyType> lhsField;
            lhsField = (this.isSetContact()?this.getContact():null);
            List<ContactInformationPropertyType> rhsField;
            rhsField = (that.isSetContact()?that.getContact():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPriorPermission();
            boolean rhsFieldIsSet = that.isSetPriorPermission();
            JAXBElement<ValDurationType> lhsField;
            lhsField = this.getPriorPermission();
            JAXBElement<ValDurationType> rhsField;
            rhsField = that.getPriorPermission();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "priorPermission", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "priorPermission", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ManoeuvringAreaUsageTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ManoeuvringAreaUsageTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeUsageLimitationType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeUsageLimitationType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperation();
            boolean rhsFieldIsSet = that.isSetOperation();
            JAXBElement<CodeOperationManoeuvringAreaType> lhsField;
            lhsField = this.getOperation();
            JAXBElement<CodeOperationManoeuvringAreaType> rhsField;
            rhsField = that.getOperation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSelection();
            boolean rhsFieldIsSet = that.isSetSelection();
            JAXBElement<ConditionCombinationPropertyType> lhsField;
            lhsField = this.getSelection();
            JAXBElement<ConditionCombinationPropertyType> rhsField;
            rhsField = that.getSelection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "selection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "selection", rhsField);
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
            JAXBElement<CodeUsageLimitationType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPriorPermission();
            JAXBElement<ValDurationType> theField;
            theField = this.getPriorPermission();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "priorPermission", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSelection();
            JAXBElement<ConditionCombinationPropertyType> theField;
            theField = this.getSelection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "selection", theField);
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
            boolean theFieldIsSet = this.isSetOperation();
            JAXBElement<CodeOperationManoeuvringAreaType> theField;
            theField = this.getOperation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ManoeuvringAreaUsageTypeExtensionType> theField;
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
            JAXBElement<CodeUsageLimitationType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPriorPermission();
            JAXBElement<ValDurationType> theField;
            theField = this.getPriorPermission();
            strategy.appendField(locator, this, "priorPermission", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSelection();
            JAXBElement<ConditionCombinationPropertyType> theField;
            theField = this.getSelection();
            strategy.appendField(locator, this, "selection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperation();
            JAXBElement<CodeOperationManoeuvringAreaType> theField;
            theField = this.getOperation();
            strategy.appendField(locator, this, "operation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ManoeuvringAreaUsageTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
