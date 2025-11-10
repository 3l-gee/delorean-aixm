
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
 * <p>Java class for FlightRestrictionRouteType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRestrictionRouteType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FlightRestrictionRoutePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightRestrictionRouteExtension"/>
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
@XmlType(name = "FlightRestrictionRouteType", propOrder = {
    "priorPermission",
    "routeElement",
    "contact",
    "annotation",
    "extension"
})
@Entity(name = "FlightRestrictionRouteType")
@Table(name = "flightrestrictionroute", schema = "route")
public class FlightRestrictionRouteType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "priorPermission", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> priorPermission;
    @XmlElement(nillable = true)
    protected List<FlightRoutingElementPropertyType> routeElement;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightRestrictionRouteTypeExtensionType> extension;

    /**
     * Gets the value of the priorPermission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getPriorPermission() {
        return priorPermission;
    }

    /**
     * Sets the value of the priorPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setPriorPermission(JAXBElement<CodeYesNoType> value) {
        this.priorPermission = value;
    }

    @Transient
    public boolean isSetPriorPermission() {
        return (this.priorPermission!= null);
    }

    /**
     * Gets the value of the routeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightRoutingElementPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = FlightRoutingElementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "routeelement_id", referencedColumnName = "hjid")
    public List<FlightRoutingElementPropertyType> getRouteElement() {
        if (routeElement == null) {
            routeElement = new ArrayList<>();
        }
        return this.routeElement;
    }

    /**
     * 
     * 
     */
    public void setRouteElement(List<FlightRoutingElementPropertyType> routeElement) {
        this.routeElement = routeElement;
    }

    @Transient
    public boolean isSetRouteElement() {
        return ((this.routeElement!= null)&&(!this.routeElement.isEmpty()));
    }

    public void unsetRouteElement() {
        this.routeElement = null;
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
    @OneToMany(targetEntity = ContactInformationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "contact_id", referencedColumnName = "hjid")
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
     * {@link FlightRestrictionRouteTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FlightRestrictionRouteTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_FLIGHT_RESTRICTION_2")
    public List<FlightRestrictionRouteTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FlightRestrictionRouteTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "priorpermission")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "priorpermission_nilreason"))
    })
    public CodeYesNoType getPriorPermissionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getPriorPermission());
    }

    public void setPriorPermissionItem(CodeYesNoType target) {
        setPriorPermission(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "priorPermission"), FlightRestrictionRouteType.class, target));
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
        final FlightRestrictionRouteType that = ((FlightRestrictionRouteType) object);
        {
            boolean lhsFieldIsSet = this.isSetRouteElement();
            boolean rhsFieldIsSet = that.isSetRouteElement();
            List<FlightRoutingElementPropertyType> lhsField;
            lhsField = (this.isSetRouteElement()?this.getRouteElement():null);
            List<FlightRoutingElementPropertyType> rhsField;
            rhsField = (that.isSetRouteElement()?that.getRouteElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "routeElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "routeElement", rhsField);
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
            List<FlightRestrictionRouteTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FlightRestrictionRouteTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPriorPermission();
            boolean rhsFieldIsSet = that.isSetPriorPermission();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getPriorPermission();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getPriorPermission();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "priorPermission", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "priorPermission", rhsField);
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
            boolean theFieldIsSet = this.isSetPriorPermission();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPriorPermission();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "priorPermission", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRouteElement();
            List<FlightRoutingElementPropertyType> theField;
            theField = (this.isSetRouteElement()?this.getRouteElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "routeElement", theField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightRestrictionRouteTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetPriorPermission();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getPriorPermission();
            strategy.appendField(locator, this, "priorPermission", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRouteElement();
            List<FlightRoutingElementPropertyType> theField;
            theField = (this.isSetRouteElement()?this.getRouteElement():null);
            strategy.appendField(locator, this, "routeElement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FlightRestrictionRouteTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
