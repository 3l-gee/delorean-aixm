
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
 * <p>Java class for NoteType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NoteType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}NotePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNoteExtension"/>
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
@XmlType(name = "NoteType", propOrder = {
    "propertyName",
    "purpose",
    "translatedNote",
    "extension"
})
@Entity(name = "NoteType")
@Table(name = "note", schema = "note")
public class NoteType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "propertyName", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextPropertyNameType> propertyName;
    @XmlElementRef(name = "purpose", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNotePurposeType> purpose;
    @XmlElement(nillable = true)
    protected List<LinguisticNotePropertyType> translatedNote;
    protected List<NoteTypeExtensionType> extension;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextPropertyNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextPropertyNameType> getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextPropertyNameType }{@code >}
     *     
     */
    public void setPropertyName(JAXBElement<TextPropertyNameType> value) {
        this.propertyName = value;
    }

    @Transient
    public boolean isSetPropertyName() {
        return (this.propertyName!= null);
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNotePurposeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNotePurposeType> getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNotePurposeType }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<CodeNotePurposeType> value) {
        this.purpose = value;
    }

    @Transient
    public boolean isSetPurpose() {
        return (this.purpose!= null);
    }

    /**
     * Gets the value of the translatedNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translatedNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslatedNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinguisticNotePropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = LinguisticNotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "translatednote_id", referencedColumnName = "hjid")
    public List<LinguisticNotePropertyType> getTranslatedNote() {
        if (translatedNote == null) {
            translatedNote = new ArrayList<>();
        }
        return this.translatedNote;
    }

    /**
     * 
     * 
     */
    public void setTranslatedNote(List<LinguisticNotePropertyType> translatedNote) {
        this.translatedNote = translatedNote;
    }

    @Transient
    public boolean isSetTranslatedNote() {
        return ((this.translatedNote!= null)&&(!this.translatedNote.isEmpty()));
    }

    public void unsetTranslatedNote() {
        this.translatedNote = null;
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
     * {@link NoteTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = NoteTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_NOTE_TYPE_HJID")
    public List<NoteTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<NoteTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "propertyname")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "propertyname_nilreason"))
    })
    public TextPropertyNameType getPropertyNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextPropertyNameType.class, this.getPropertyName());
    }

    public void setPropertyNameItem(TextPropertyNameType target) {
        setPropertyName(XmlAdapterUtils.marshallJAXBElement(TextPropertyNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "propertyName"), NoteType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "purpose")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "purpose_nilreason"))
    })
    public CodeNotePurposeType getPurposeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNotePurposeType.class, this.getPurpose());
    }

    public void setPurposeItem(CodeNotePurposeType target) {
        setPurpose(XmlAdapterUtils.marshallJAXBElement(CodeNotePurposeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "purpose"), NoteType.class, target));
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
        final NoteType that = ((NoteType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<NoteTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<NoteTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPurpose();
            boolean rhsFieldIsSet = that.isSetPurpose();
            JAXBElement<CodeNotePurposeType> lhsField;
            lhsField = this.getPurpose();
            JAXBElement<CodeNotePurposeType> rhsField;
            rhsField = that.getPurpose();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "purpose", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "purpose", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTranslatedNote();
            boolean rhsFieldIsSet = that.isSetTranslatedNote();
            List<LinguisticNotePropertyType> lhsField;
            lhsField = (this.isSetTranslatedNote()?this.getTranslatedNote():null);
            List<LinguisticNotePropertyType> rhsField;
            rhsField = (that.isSetTranslatedNote()?that.getTranslatedNote():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "translatedNote", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "translatedNote", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPropertyName();
            boolean rhsFieldIsSet = that.isSetPropertyName();
            JAXBElement<TextPropertyNameType> lhsField;
            lhsField = this.getPropertyName();
            JAXBElement<TextPropertyNameType> rhsField;
            rhsField = that.getPropertyName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "propertyName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "propertyName", rhsField);
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
            boolean theFieldIsSet = this.isSetPropertyName();
            JAXBElement<TextPropertyNameType> theField;
            theField = this.getPropertyName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "propertyName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPurpose();
            JAXBElement<CodeNotePurposeType> theField;
            theField = this.getPurpose();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "purpose", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTranslatedNote();
            List<LinguisticNotePropertyType> theField;
            theField = (this.isSetTranslatedNote()?this.getTranslatedNote():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "translatedNote", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NoteTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetPropertyName();
            JAXBElement<TextPropertyNameType> theField;
            theField = this.getPropertyName();
            strategy.appendField(locator, this, "propertyName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPurpose();
            JAXBElement<CodeNotePurposeType> theField;
            theField = this.getPurpose();
            strategy.appendField(locator, this, "purpose", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTranslatedNote();
            List<LinguisticNotePropertyType> theField;
            theField = (this.isSetTranslatedNote()?this.getTranslatedNote():null);
            strategy.appendField(locator, this, "translatedNote", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NoteTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
