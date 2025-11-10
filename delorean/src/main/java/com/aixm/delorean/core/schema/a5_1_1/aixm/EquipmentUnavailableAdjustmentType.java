
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
 * <p>Java class for EquipmentUnavailableAdjustmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EquipmentUnavailableAdjustmentType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}EquipmentUnavailableAdjustmentPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractEquipmentUnavailableAdjustmentExtension"/>
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
@XmlType(name = "EquipmentUnavailableAdjustmentType", propOrder = {
    "type",
    "approachLightingInoperative",
    "adjustmentINOPCol",
    "annotation",
    "extension"
})
@Entity(name = "EquipmentUnavailableAdjustmentType")
@Table(name = "equipmentunavailableadjustment", schema = "procedure")
public class EquipmentUnavailableAdjustmentType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeEquipmentUnavailableType> type;
    @XmlElementRef(name = "approachLightingInoperative", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> approachLightingInoperative;
    @XmlElement(nillable = true)
    protected List<EquipmentUnavailableAdjustmentColumnPropertyType> adjustmentINOPCol;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<EquipmentUnavailableAdjustmentTypeExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentUnavailableType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeEquipmentUnavailableType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentUnavailableType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeEquipmentUnavailableType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the approachLightingInoperative property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getApproachLightingInoperative() {
        return approachLightingInoperative;
    }

    /**
     * Sets the value of the approachLightingInoperative property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setApproachLightingInoperative(JAXBElement<CodeYesNoType> value) {
        this.approachLightingInoperative = value;
    }

    @Transient
    public boolean isSetApproachLightingInoperative() {
        return (this.approachLightingInoperative!= null);
    }

    /**
     * Gets the value of the adjustmentINOPCol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentINOPCol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentINOPCol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentUnavailableAdjustmentColumnPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = EquipmentUnavailableAdjustmentColumnPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "adjustmentinopcol_id", referencedColumnName = "hjid")
    public List<EquipmentUnavailableAdjustmentColumnPropertyType> getAdjustmentINOPCol() {
        if (adjustmentINOPCol == null) {
            adjustmentINOPCol = new ArrayList<>();
        }
        return this.adjustmentINOPCol;
    }

    /**
     * 
     * 
     */
    public void setAdjustmentINOPCol(List<EquipmentUnavailableAdjustmentColumnPropertyType> adjustmentINOPCol) {
        this.adjustmentINOPCol = adjustmentINOPCol;
    }

    @Transient
    public boolean isSetAdjustmentINOPCol() {
        return ((this.adjustmentINOPCol!= null)&&(!this.adjustmentINOPCol.isEmpty()));
    }

    public void unsetAdjustmentINOPCol() {
        this.adjustmentINOPCol = null;
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
     * {@link EquipmentUnavailableAdjustmentTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = EquipmentUnavailableAdjustmentTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_EQUIPMENT_UNAVAILA_0")
    public List<EquipmentUnavailableAdjustmentTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<EquipmentUnavailableAdjustmentTypeExtensionType> extension) {
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
    public CodeEquipmentUnavailableType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeEquipmentUnavailableType.class, this.getType());
    }

    public void setTypeItem(CodeEquipmentUnavailableType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeEquipmentUnavailableType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), EquipmentUnavailableAdjustmentType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachlightinginoperative")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachlightinginoperative_nilreason"))
    })
    public CodeYesNoType getApproachLightingInoperativeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getApproachLightingInoperative());
    }

    public void setApproachLightingInoperativeItem(CodeYesNoType target) {
        setApproachLightingInoperative(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachLightingInoperative"), EquipmentUnavailableAdjustmentType.class, target));
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
        final EquipmentUnavailableAdjustmentType that = ((EquipmentUnavailableAdjustmentType) object);
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeEquipmentUnavailableType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeEquipmentUnavailableType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdjustmentINOPCol();
            boolean rhsFieldIsSet = that.isSetAdjustmentINOPCol();
            List<EquipmentUnavailableAdjustmentColumnPropertyType> lhsField;
            lhsField = (this.isSetAdjustmentINOPCol()?this.getAdjustmentINOPCol():null);
            List<EquipmentUnavailableAdjustmentColumnPropertyType> rhsField;
            rhsField = (that.isSetAdjustmentINOPCol()?that.getAdjustmentINOPCol():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "adjustmentINOPCol", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "adjustmentINOPCol", rhsField);
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
            boolean lhsFieldIsSet = this.isSetApproachLightingInoperative();
            boolean rhsFieldIsSet = that.isSetApproachLightingInoperative();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getApproachLightingInoperative();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getApproachLightingInoperative();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachLightingInoperative", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachLightingInoperative", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<EquipmentUnavailableAdjustmentTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<EquipmentUnavailableAdjustmentTypeExtensionType> rhsField;
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
            JAXBElement<CodeEquipmentUnavailableType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachLightingInoperative();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getApproachLightingInoperative();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachLightingInoperative", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustmentINOPCol();
            List<EquipmentUnavailableAdjustmentColumnPropertyType> theField;
            theField = (this.isSetAdjustmentINOPCol()?this.getAdjustmentINOPCol():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "adjustmentINOPCol", theField);
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
            List<EquipmentUnavailableAdjustmentTypeExtensionType> theField;
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
            JAXBElement<CodeEquipmentUnavailableType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachLightingInoperative();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getApproachLightingInoperative();
            strategy.appendField(locator, this, "approachLightingInoperative", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustmentINOPCol();
            List<EquipmentUnavailableAdjustmentColumnPropertyType> theField;
            theField = (this.isSetAdjustmentINOPCol()?this.getAdjustmentINOPCol():null);
            strategy.appendField(locator, this, "adjustmentINOPCol", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<EquipmentUnavailableAdjustmentTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
