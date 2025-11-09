
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
 * <p>Java class for AltitudeAdjustmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AltitudeAdjustmentType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AltitudeAdjustmentPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAltitudeAdjustmentExtension"/>
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
@XmlType(name = "AltitudeAdjustmentType", propOrder = {
    "altitudeAdjustmentType",
    "primaryAlternateMinimum",
    "altitudeAdjustment",
    "localRemoteCode",
    "annotation",
    "extension"
})
@Entity(name = "AltitudeAdjustmentType")
@Table(name = "altitudeadjustment", schema = "shared")
public class AltitudeAdjustmentType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "altitudeAdjustmentType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeAdjustmentType> altitudeAdjustmentType;
    @XmlElementRef(name = "primaryAlternateMinimum", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> primaryAlternateMinimum;
    @XmlElementRef(name = "altitudeAdjustment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitudeAdjustment;
    @XmlElementRef(name = "localRemoteCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> localRemoteCode;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AltitudeAdjustmentTypeExtensionType> extension;

    /**
     * Gets the value of the altitudeAdjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeAdjustmentType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAltitudeAdjustmentType> getAltitudeAdjustmentType() {
        return altitudeAdjustmentType;
    }

    /**
     * Sets the value of the altitudeAdjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeAdjustmentType }{@code >}
     *     
     */
    public void setAltitudeAdjustmentType(JAXBElement<CodeAltitudeAdjustmentType> value) {
        this.altitudeAdjustmentType = value;
    }

    @Transient
    public boolean isSetAltitudeAdjustmentType() {
        return (this.altitudeAdjustmentType!= null);
    }

    /**
     * Gets the value of the primaryAlternateMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getPrimaryAlternateMinimum() {
        return primaryAlternateMinimum;
    }

    /**
     * Sets the value of the primaryAlternateMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setPrimaryAlternateMinimum(JAXBElement<CodeYesNoType> value) {
        this.primaryAlternateMinimum = value;
    }

    @Transient
    public boolean isSetPrimaryAlternateMinimum() {
        return (this.primaryAlternateMinimum!= null);
    }

    /**
     * Gets the value of the altitudeAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getAltitudeAdjustment() {
        return altitudeAdjustment;
    }

    /**
     * Sets the value of the altitudeAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitudeAdjustment(JAXBElement<ValDistanceVerticalType> value) {
        this.altitudeAdjustment = value;
    }

    @Transient
    public boolean isSetAltitudeAdjustment() {
        return (this.altitudeAdjustment!= null);
    }

    /**
     * Gets the value of the localRemoteCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getLocalRemoteCode() {
        return localRemoteCode;
    }

    /**
     * Sets the value of the localRemoteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLocalRemoteCode(JAXBElement<CodeYesNoType> value) {
        this.localRemoteCode = value;
    }

    @Transient
    public boolean isSetLocalRemoteCode() {
        return (this.localRemoteCode!= null);
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
     * {@link AltitudeAdjustmentTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AltitudeAdjustmentTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_ALTITUDE_ADJUSTMEN_0")
    public List<AltitudeAdjustmentTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AltitudeAdjustmentTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "altitudeadjustmenttype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeadjustmenttype_nilreason"))
    })
    public CodeAltitudeAdjustmentType getAltitudeAdjustmentTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAltitudeAdjustmentType.class, this.getAltitudeAdjustmentType());
    }

    public void setAltitudeAdjustmentTypeItem(CodeAltitudeAdjustmentType target) {
        setAltitudeAdjustmentType(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeAdjustmentType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeAdjustmentType"), AltitudeAdjustmentType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "primaryalternateminimum")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "primaryalternateminimum_nilreason"))
    })
    public CodeYesNoType getPrimaryAlternateMinimumItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getPrimaryAlternateMinimum());
    }

    public void setPrimaryAlternateMinimumItem(CodeYesNoType target) {
        setPrimaryAlternateMinimum(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "primaryAlternateMinimum"), AltitudeAdjustmentType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudeadjustment")),
        @AttributeOverride(name = "uom", column = @Column(name = "altitudeadjustment_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudeadjustment_nilreason"))
    })
    public ValDistanceVerticalType getAltitudeAdjustmentItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAltitudeAdjustment());
    }

    public void setAltitudeAdjustmentItem(ValDistanceVerticalType target) {
        setAltitudeAdjustment(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeAdjustment"), AltitudeAdjustmentType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "localremotecode")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "localremotecode_nilreason"))
    })
    public CodeYesNoType getLocalRemoteCodeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getLocalRemoteCode());
    }

    public void setLocalRemoteCodeItem(CodeYesNoType target) {
        setLocalRemoteCode(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "localRemoteCode"), AltitudeAdjustmentType.class, target));
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
        final AltitudeAdjustmentType that = ((AltitudeAdjustmentType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AltitudeAdjustmentTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AltitudeAdjustmentTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPrimaryAlternateMinimum();
            boolean rhsFieldIsSet = that.isSetPrimaryAlternateMinimum();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getPrimaryAlternateMinimum();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getPrimaryAlternateMinimum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "primaryAlternateMinimum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "primaryAlternateMinimum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocalRemoteCode();
            boolean rhsFieldIsSet = that.isSetLocalRemoteCode();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getLocalRemoteCode();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getLocalRemoteCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "localRemoteCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "localRemoteCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeAdjustment();
            boolean rhsFieldIsSet = that.isSetAltitudeAdjustment();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getAltitudeAdjustment();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getAltitudeAdjustment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeAdjustment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeAdjustment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeAdjustmentType();
            boolean rhsFieldIsSet = that.isSetAltitudeAdjustmentType();
            JAXBElement<CodeAltitudeAdjustmentType> lhsField;
            lhsField = this.getAltitudeAdjustmentType();
            JAXBElement<CodeAltitudeAdjustmentType> rhsField;
            rhsField = that.getAltitudeAdjustmentType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeAdjustmentType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeAdjustmentType", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetAltitudeAdjustmentType();
            JAXBElement<CodeAltitudeAdjustmentType> theField;
            theField = this.getAltitudeAdjustmentType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeAdjustmentType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrimaryAlternateMinimum();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPrimaryAlternateMinimum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "primaryAlternateMinimum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeAdjustment();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitudeAdjustment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeAdjustment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocalRemoteCode();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLocalRemoteCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "localRemoteCode", theField);
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
            List<AltitudeAdjustmentTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAltitudeAdjustmentType();
            JAXBElement<CodeAltitudeAdjustmentType> theField;
            theField = this.getAltitudeAdjustmentType();
            strategy.appendField(locator, this, "altitudeAdjustmentType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPrimaryAlternateMinimum();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPrimaryAlternateMinimum();
            strategy.appendField(locator, this, "primaryAlternateMinimum", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeAdjustment();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitudeAdjustment();
            strategy.appendField(locator, this, "altitudeAdjustment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocalRemoteCode();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLocalRemoteCode();
            strategy.appendField(locator, this, "localRemoteCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AltitudeAdjustmentTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
