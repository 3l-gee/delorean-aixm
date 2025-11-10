
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
 * <p>Java class for SpecialDateTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecialDateTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}SpecialDatePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSpecialDateExtension"/>
 *                 </sequence>
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
@XmlType(name = "SpecialDateTimeSliceType", propOrder = {
    "type",
    "dateDay",
    "dateYear",
    "aixmName",
    "annotation",
    "authority",
    "extension"
})
@Entity(name = "SpecialDateTimeSliceType")
@Table(name = "specialdate_ts", schema = "shared")
public class SpecialDateTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpecialDateType> type;
    @XmlElementRef(name = "dateDay", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> dateDay;
    @XmlElementRef(name = "dateYear", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateYear;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "authority", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> authority;
    protected List<SpecialDateExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialDateType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSpecialDateType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialDateType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeSpecialDateType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the dateDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateMonthDayType> getDateDay() {
        return dateDay;
    }

    /**
     * Sets the value of the dateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setDateDay(JAXBElement<DateMonthDayType> value) {
        this.dateDay = value;
    }

    @Transient
    public boolean isSetDateDay() {
        return (this.dateDay!= null);
    }

    /**
     * Gets the value of the dateYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateYearType> getDateYear() {
        return dateYear;
    }

    /**
     * Sets the value of the dateYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setDateYear(JAXBElement<DateYearType> value) {
        this.dateYear = value;
    }

    @Transient
    public boolean isSetDateYear() {
        return (this.dateYear!= null);
    }

    /**
     * Gets the value of the aixmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getAixmName() {
        return aixmName;
    }

    /**
     * Sets the value of the aixmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName!= null);
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
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setAuthority(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.authority = value;
    }

    @Transient
    public boolean isSetAuthority() {
        return (this.authority!= null);
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
     * {@link SpecialDateExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = SpecialDateExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_SPECIAL_DATE_TIME__0")
    public List<SpecialDateExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<SpecialDateExtensionType> extension) {
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
    public CodeSpecialDateType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpecialDateType.class, this.getType());
    }

    public void setTypeItem(CodeSpecialDateType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeSpecialDateType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), SpecialDateTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "dateday")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "dateday_nilreason"))
    })
    public DateMonthDayType getDateDayItem() {
        return XmlAdapterUtils.unmarshallSource(DateMonthDayType.class, this.getDateDay());
    }

    public void setDateDayItem(DateMonthDayType target) {
        setDateDay(XmlAdapterUtils.marshallJAXBElement(DateMonthDayType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dateDay"), SpecialDateTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "dateyear")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "dateyear_nilreason"))
    })
    public DateYearType getDateYearItem() {
        return XmlAdapterUtils.unmarshallSource(DateYearType.class, this.getDateYear());
    }

    public void setDateYearItem(DateYearType target) {
        setDateYear(XmlAdapterUtils.marshallJAXBElement(DateYearType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dateYear"), SpecialDateTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), SpecialDateTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "authority_id", referencedColumnName = "hjid")
    public OrganisationAuthorityPropertyType getAuthorityItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getAuthority());
    }

    public void setAuthorityItem(OrganisationAuthorityPropertyType target) {
        setAuthority(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "authority"), SpecialDateTimeSliceType.class, target));
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
        final SpecialDateTimeSliceType that = ((SpecialDateTimeSliceType) object);
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
            JAXBElement<CodeSpecialDateType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeSpecialDateType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDateDay();
            boolean rhsFieldIsSet = that.isSetDateDay();
            JAXBElement<DateMonthDayType> lhsField;
            lhsField = this.getDateDay();
            JAXBElement<DateMonthDayType> rhsField;
            rhsField = that.getDateDay();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateDay", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateDay", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDateYear();
            boolean rhsFieldIsSet = that.isSetDateYear();
            JAXBElement<DateYearType> lhsField;
            lhsField = this.getDateYear();
            JAXBElement<DateYearType> rhsField;
            rhsField = that.getDateYear();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateYear", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateYear", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAixmName();
            boolean rhsFieldIsSet = that.isSetAixmName();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getAixmName();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getAixmName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aixmName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aixmName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAuthority();
            boolean rhsFieldIsSet = that.isSetAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getAuthority();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authority", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SpecialDateExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<SpecialDateExtensionType> rhsField;
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
            JAXBElement<CodeSpecialDateType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateDay();
            JAXBElement<DateMonthDayType> theField;
            theField = this.getDateDay();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateDay", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateYear();
            JAXBElement<DateYearType> theField;
            theField = this.getDateYear();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateYear", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
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
            boolean theFieldIsSet = this.isSetAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getAuthority();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SpecialDateExtensionType> theField;
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
            JAXBElement<CodeSpecialDateType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateDay();
            JAXBElement<DateMonthDayType> theField;
            theField = this.getDateDay();
            strategy.appendField(locator, this, "dateDay", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateYear();
            JAXBElement<DateYearType> theField;
            theField = this.getDateYear();
            strategy.appendField(locator, this, "dateYear", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getAuthority();
            strategy.appendField(locator, this, "authority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SpecialDateExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
