
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
 * <p>Java class for ContactInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContactInformationType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ContactInformationPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractContactInformationExtension"/>
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
@XmlType(name = "ContactInformationType", propOrder = {
    "aixmName",
    "title",
    "address",
    "networkNode",
    "phoneFax",
    "annotation",
    "extension"
})
@Entity(name = "ContactInformationType")
@Table(name = "contactinformation", schema = "shared")
public class ContactInformationType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "title", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> title;
    @XmlElement(nillable = true)
    protected List<PostalAddressPropertyType> address;
    @XmlElement(nillable = true)
    protected List<OnlineContactPropertyType> networkNode;
    @XmlElement(nillable = true)
    protected List<TelephoneContactPropertyType> phoneFax;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ContactInformationTypeExtensionType> extension;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setTitle(JAXBElement<TextNameType> value) {
        this.title = value;
    }

    @Transient
    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = PostalAddressPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "address_contactinformation_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "address", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "contactinformationpropertygroup", referencedColumnName = "hjid")
    })
    public List<PostalAddressPropertyType> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * 
     * 
     */
    public void setAddress(List<PostalAddressPropertyType> address) {
        this.address = address;
    }

    @Transient
    public boolean isSetAddress() {
        return ((this.address!= null)&&(!this.address.isEmpty()));
    }

    public void unsetAddress() {
        this.address = null;
    }

    /**
     * Gets the value of the networkNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnlineContactPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OnlineContactPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "networknode_contactinformation_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "networknode", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "contactinformationpropertygroup", referencedColumnName = "hjid")
    })
    public List<OnlineContactPropertyType> getNetworkNode() {
        if (networkNode == null) {
            networkNode = new ArrayList<>();
        }
        return this.networkNode;
    }

    /**
     * 
     * 
     */
    public void setNetworkNode(List<OnlineContactPropertyType> networkNode) {
        this.networkNode = networkNode;
    }

    @Transient
    public boolean isSetNetworkNode() {
        return ((this.networkNode!= null)&&(!this.networkNode.isEmpty()));
    }

    public void unsetNetworkNode() {
        this.networkNode = null;
    }

    /**
     * Gets the value of the phoneFax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneFax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneContactPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = TelephoneContactPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "phonefax_contactinformation_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "phonefax", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "contactinformationpropertygroup", referencedColumnName = "hjid")
    })
    public List<TelephoneContactPropertyType> getPhoneFax() {
        if (phoneFax == null) {
            phoneFax = new ArrayList<>();
        }
        return this.phoneFax;
    }

    /**
     * 
     * 
     */
    public void setPhoneFax(List<TelephoneContactPropertyType> phoneFax) {
        this.phoneFax = phoneFax;
    }

    @Transient
    public boolean isSetPhoneFax() {
        return ((this.phoneFax!= null)&&(!this.phoneFax.isEmpty()));
    }

    public void unsetPhoneFax() {
        this.phoneFax = null;
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
    @JoinTable(name = "annotation_contactinformation_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "contactinformationpropertygroup", referencedColumnName = "hjid")
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
     * {@link ContactInformationTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ContactInformationTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<ContactInformationTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ContactInformationTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), ContactInformationType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "title")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "title_nilreason"))
    })
    public TextNameType getTitleItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getTitle());
    }

    public void setTitleItem(TextNameType target) {
        setTitle(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "title"), ContactInformationType.class, target));
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
        final ContactInformationType that = ((ContactInformationType) object);
        {
            boolean lhsFieldIsSet = this.isSetTitle();
            boolean rhsFieldIsSet = that.isSetTitle();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getTitle();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "title", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "title", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAddress();
            boolean rhsFieldIsSet = that.isSetAddress();
            List<PostalAddressPropertyType> lhsField;
            lhsField = (this.isSetAddress()?this.getAddress():null);
            List<PostalAddressPropertyType> rhsField;
            rhsField = (that.isSetAddress()?that.getAddress():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "address", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "address", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPhoneFax();
            boolean rhsFieldIsSet = that.isSetPhoneFax();
            List<TelephoneContactPropertyType> lhsField;
            lhsField = (this.isSetPhoneFax()?this.getPhoneFax():null);
            List<TelephoneContactPropertyType> rhsField;
            rhsField = (that.isSetPhoneFax()?that.getPhoneFax():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "phoneFax", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "phoneFax", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ContactInformationTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ContactInformationTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNetworkNode();
            boolean rhsFieldIsSet = that.isSetNetworkNode();
            List<OnlineContactPropertyType> lhsField;
            lhsField = (this.isSetNetworkNode()?this.getNetworkNode():null);
            List<OnlineContactPropertyType> rhsField;
            rhsField = (that.isSetNetworkNode()?that.getNetworkNode():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "networkNode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "networkNode", rhsField);
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTitle();
            JAXBElement<TextNameType> theField;
            theField = this.getTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "title", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAddress();
            List<PostalAddressPropertyType> theField;
            theField = (this.isSetAddress()?this.getAddress():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "address", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNetworkNode();
            List<OnlineContactPropertyType> theField;
            theField = (this.isSetNetworkNode()?this.getNetworkNode():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "networkNode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPhoneFax();
            List<TelephoneContactPropertyType> theField;
            theField = (this.isSetPhoneFax()?this.getPhoneFax():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "phoneFax", theField);
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
            List<ContactInformationTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTitle();
            JAXBElement<TextNameType> theField;
            theField = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAddress();
            List<PostalAddressPropertyType> theField;
            theField = (this.isSetAddress()?this.getAddress():null);
            strategy.appendField(locator, this, "address", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNetworkNode();
            List<OnlineContactPropertyType> theField;
            theField = (this.isSetNetworkNode()?this.getNetworkNode():null);
            strategy.appendField(locator, this, "networkNode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPhoneFax();
            List<TelephoneContactPropertyType> theField;
            theField = (this.isSetPhoneFax()?this.getPhoneFax():null);
            strategy.appendField(locator, this, "phoneFax", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ContactInformationTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
