
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
 * <p>Java class for AltimeterSourceTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AltimeterSourceTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AltimeterSourcePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAltimeterSourceExtension"/>
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
@XmlType(name = "AltimeterSourceTimeSliceType", propOrder = {
    "isRemote",
    "isPrimary",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "AltimeterSourceTimeSliceType")
@Table(name = "altimetersource_ts", schema = "airport_heliport")
public class AltimeterSourceTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "isRemote", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> isRemote;
    @XmlElementRef(name = "isPrimary", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> isPrimary;
    @XmlElement(nillable = true)
    protected List<AltimeterSourceStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AltimeterSourceExtensionType> extension;

    /**
     * Gets the value of the isRemote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getIsRemote() {
        return isRemote;
    }

    /**
     * Sets the value of the isRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setIsRemote(JAXBElement<CodeYesNoType> value) {
        this.isRemote = value;
    }

    @Transient
    public boolean isSetIsRemote() {
        return (this.isRemote!= null);
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setIsPrimary(JAXBElement<CodeYesNoType> value) {
        this.isPrimary = value;
    }

    @Transient
    public boolean isSetIsPrimary() {
        return (this.isPrimary!= null);
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltimeterSourceStatusPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AltimeterSourceStatusPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_altimetersource_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "altimetersourcepropertygroup", referencedColumnName = "hjid")
    })
    public List<AltimeterSourceStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<AltimeterSourceStatusPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
    @JoinTable(name = "annotation_altimetersource_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "altimetersourcepropertygroup", referencedColumnName = "hjid")
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
     * {@link AltimeterSourceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AltimeterSourceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<AltimeterSourceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AltimeterSourceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "isremote")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "isremote_nilreason"))
    })
    public CodeYesNoType getIsRemoteItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getIsRemote());
    }

    public void setIsRemoteItem(CodeYesNoType target) {
        setIsRemote(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "isRemote"), AltimeterSourceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "isprimary")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "isprimary_nilreason"))
    })
    public CodeYesNoType getIsPrimaryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getIsPrimary());
    }

    public void setIsPrimaryItem(CodeYesNoType target) {
        setIsPrimary(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "isPrimary"), AltimeterSourceTimeSliceType.class, target));
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
        final AltimeterSourceTimeSliceType that = ((AltimeterSourceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetIsPrimary();
            boolean rhsFieldIsSet = that.isSetIsPrimary();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getIsPrimary();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getIsPrimary();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isPrimary", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isPrimary", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<AltimeterSourceStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<AltimeterSourceStatusPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIsRemote();
            boolean rhsFieldIsSet = that.isSetIsRemote();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getIsRemote();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getIsRemote();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isRemote", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isRemote", rhsField);
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
            List<AltimeterSourceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AltimeterSourceExtensionType> rhsField;
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
            boolean theFieldIsSet = this.isSetIsRemote();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getIsRemote();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isRemote", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIsPrimary();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getIsPrimary();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isPrimary", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<AltimeterSourceStatusPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            List<AltimeterSourceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetIsRemote();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getIsRemote();
            strategy.appendField(locator, this, "isRemote", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIsPrimary();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getIsPrimary();
            strategy.appendField(locator, this, "isPrimary", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<AltimeterSourceStatusPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AltimeterSourceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
