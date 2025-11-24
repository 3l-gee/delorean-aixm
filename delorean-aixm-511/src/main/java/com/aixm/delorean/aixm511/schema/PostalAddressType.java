
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
 * <p>Java class for PostalAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PostalAddressType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleType">
 *       <sequence>
 *         <element name="timeInterval" type="{http://www.aixm.aero/schema/5.1.1}TimesheetPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="specialDateAuthority" type="{http://www.aixm.aero/schema/5.1.1}OrganisationAuthorityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}PostalAddressPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPostalAddressExtension"/>
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
@XmlType(name = "PostalAddressType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "deliveryPoint",
    "city",
    "administrativeArea",
    "postalCode",
    "country",
    "extension"
})
@Entity(name = "PostalAddressType")
@Table(name = "postaladdress", schema = "shared")
public class PostalAddressType
    extends AbstractPropertiesWithScheduleType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "deliveryPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextAddressType> deliveryPoint;
    @XmlElementRef(name = "city", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> city;
    @XmlElementRef(name = "administrativeArea", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> administrativeArea;
    @XmlElementRef(name = "postalCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> postalCode;
    @XmlElementRef(name = "country", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> country;
    protected List<PostalAddressTypeExtensionType> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = TimesheetPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "timeinterval_postaladdress_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "timeinterval", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "postaladdresstype", referencedColumnName = "hjid")
    })
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<>();
        }
        return this.timeInterval;
    }

    /**
     * 
     * 
     */
    public void setTimeInterval(List<TimesheetPropertyType> timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Transient
    public boolean isSetTimeInterval() {
        return ((this.timeInterval!= null)&&(!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
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
    @JoinTable(name = "annotation_postaladdress_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "postaladdresstype", referencedColumnName = "hjid")
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
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "specialdateauthority_postaladdress_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "specialdateauthority", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "postaladdresstype", referencedColumnName = "hjid")
    })
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<>();
        }
        return this.specialDateAuthority;
    }

    /**
     * 
     * 
     */
    public void setSpecialDateAuthority(List<OrganisationAuthorityPropertyType> specialDateAuthority) {
        this.specialDateAuthority = specialDateAuthority;
    }

    @Transient
    public boolean isSetSpecialDateAuthority() {
        return ((this.specialDateAuthority!= null)&&(!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextAddressType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextAddressType> getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextAddressType }{@code >}
     *     
     */
    public void setDeliveryPoint(JAXBElement<TextAddressType> value) {
        this.deliveryPoint = value;
    }

    @Transient
    public boolean isSetDeliveryPoint() {
        return (this.deliveryPoint!= null);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setCity(JAXBElement<TextNameType> value) {
        this.city = value;
    }

    @Transient
    public boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAdministrativeArea(JAXBElement<TextNameType> value) {
        this.administrativeArea = value;
    }

    @Transient
    public boolean isSetAdministrativeArea() {
        return (this.administrativeArea!= null);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<TextNameType> value) {
        this.postalCode = value;
    }

    @Transient
    public boolean isSetPostalCode() {
        return (this.postalCode!= null);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setCountry(JAXBElement<TextNameType> value) {
        this.country = value;
    }

    @Transient
    public boolean isSetCountry() {
        return (this.country!= null);
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
     * {@link PostalAddressTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = PostalAddressTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<PostalAddressTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<PostalAddressTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "deliverypoint")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "deliverypoint_nilreason"))
    })
    public TextAddressType getDeliveryPointItem() {
        return XmlAdapterUtils.unmarshallSource(TextAddressType.class, this.getDeliveryPoint());
    }

    public void setDeliveryPointItem(TextAddressType target) {
        setDeliveryPoint(XmlAdapterUtils.marshallJAXBElement(TextAddressType.class, new QName("http://www.aixm.aero/schema/5.1.1", "deliveryPoint"), PostalAddressType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "city")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "city_nilreason"))
    })
    public TextNameType getCityItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getCity());
    }

    public void setCityItem(TextNameType target) {
        setCity(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "city"), PostalAddressType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "administrativearea")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "administrativearea_nilreason"))
    })
    public TextNameType getAdministrativeAreaItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAdministrativeArea());
    }

    public void setAdministrativeAreaItem(TextNameType target) {
        setAdministrativeArea(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "administrativeArea"), PostalAddressType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "postalcode")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "postalcode_nilreason"))
    })
    public TextNameType getPostalCodeItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getPostalCode());
    }

    public void setPostalCodeItem(TextNameType target) {
        setPostalCode(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "postalCode"), PostalAddressType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "country")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "country_nilreason"))
    })
    public TextNameType getCountryItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getCountry());
    }

    public void setCountryItem(TextNameType target) {
        setCountry(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "country"), PostalAddressType.class, target));
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
        final PostalAddressType that = ((PostalAddressType) object);
        {
            boolean lhsFieldIsSet = this.isSetAdministrativeArea();
            boolean rhsFieldIsSet = that.isSetAdministrativeArea();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getAdministrativeArea();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getAdministrativeArea();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "administrativeArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "administrativeArea", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PostalAddressTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<PostalAddressTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDeliveryPoint();
            boolean rhsFieldIsSet = that.isSetDeliveryPoint();
            JAXBElement<TextAddressType> lhsField;
            lhsField = this.getDeliveryPoint();
            JAXBElement<TextAddressType> rhsField;
            rhsField = that.getDeliveryPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "deliveryPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "deliveryPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCity();
            boolean rhsFieldIsSet = that.isSetCity();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getCity();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getCity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "city", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "city", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPostalCode();
            boolean rhsFieldIsSet = that.isSetPostalCode();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getPostalCode();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getPostalCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "postalCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "postalCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialDateAuthority();
            boolean rhsFieldIsSet = that.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetSpecialDateAuthority()?that.getSpecialDateAuthority():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialDateAuthority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialDateAuthority", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCountry();
            boolean rhsFieldIsSet = that.isSetCountry();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getCountry();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getCountry();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "country", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "country", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTimeInterval();
            boolean rhsFieldIsSet = that.isSetTimeInterval();
            List<TimesheetPropertyType> lhsField;
            lhsField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            List<TimesheetPropertyType> rhsField;
            rhsField = (that.isSetTimeInterval()?that.getTimeInterval():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeInterval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeInterval", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeInterval", theField);
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
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialDateAuthority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeliveryPoint();
            JAXBElement<TextAddressType> theField;
            theField = this.getDeliveryPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "deliveryPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCity();
            JAXBElement<TextNameType> theField;
            theField = this.getCity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "city", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdministrativeArea();
            JAXBElement<TextNameType> theField;
            theField = this.getAdministrativeArea();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "administrativeArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPostalCode();
            JAXBElement<TextNameType> theField;
            theField = this.getPostalCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "postalCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCountry();
            JAXBElement<TextNameType> theField;
            theField = this.getCountry();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "country", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PostalAddressTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            strategy.appendField(locator, this, "timeInterval", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            strategy.appendField(locator, this, "specialDateAuthority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDeliveryPoint();
            JAXBElement<TextAddressType> theField;
            theField = this.getDeliveryPoint();
            strategy.appendField(locator, this, "deliveryPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCity();
            JAXBElement<TextNameType> theField;
            theField = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdministrativeArea();
            JAXBElement<TextNameType> theField;
            theField = this.getAdministrativeArea();
            strategy.appendField(locator, this, "administrativeArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPostalCode();
            JAXBElement<TextNameType> theField;
            theField = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCountry();
            JAXBElement<TextNameType> theField;
            theField = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PostalAddressTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
