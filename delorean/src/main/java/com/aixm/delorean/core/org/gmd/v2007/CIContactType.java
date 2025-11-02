
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information required enabling contact with the  responsible person and/or organisation
 * 
 * <p>Java class for CI_Contact_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_Contact_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="phone" type="{http://www.isotc211.org/2005/gmd}CI_Telephone_PropertyType" minOccurs="0"/>
 *         <element name="address" type="{http://www.isotc211.org/2005/gmd}CI_Address_PropertyType" minOccurs="0"/>
 *         <element name="onlineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/>
 *         <element name="hoursOfService" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="contactInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Contact_Type", propOrder = {
    "phone",
    "address",
    "onlineResource",
    "hoursOfService",
    "contactInstructions"
})
public class CIContactType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CITelephonePropertyType phone;
    protected CIAddressPropertyType address;
    protected CIOnlineResourcePropertyType onlineResource;
    protected CharacterStringPropertyType hoursOfService;
    protected CharacterStringPropertyType contactInstructions;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public CITelephonePropertyType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public void setPhone(CITelephonePropertyType value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public CIAddressPropertyType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public void setAddress(CIAddressPropertyType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Sets the value of the onlineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setOnlineResource(CIOnlineResourcePropertyType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * Gets the value of the hoursOfService property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHoursOfService() {
        return hoursOfService;
    }

    /**
     * Sets the value of the hoursOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHoursOfService(CharacterStringPropertyType value) {
        this.hoursOfService = value;
    }

    public boolean isSetHoursOfService() {
        return (this.hoursOfService!= null);
    }

    /**
     * Gets the value of the contactInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getContactInstructions() {
        return contactInstructions;
    }

    /**
     * Sets the value of the contactInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setContactInstructions(CharacterStringPropertyType value) {
        this.contactInstructions = value;
    }

    public boolean isSetContactInstructions() {
        return (this.contactInstructions!= null);
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
        final CIContactType that = ((CIContactType) object);
        {
            boolean lhsFieldIsSet = this.isSetContactInstructions();
            boolean rhsFieldIsSet = that.isSetContactInstructions();
            CharacterStringPropertyType lhsField;
            lhsField = this.getContactInstructions();
            CharacterStringPropertyType rhsField;
            rhsField = that.getContactInstructions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contactInstructions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contactInstructions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHoursOfService();
            boolean rhsFieldIsSet = that.isSetHoursOfService();
            CharacterStringPropertyType lhsField;
            lhsField = this.getHoursOfService();
            CharacterStringPropertyType rhsField;
            rhsField = that.getHoursOfService();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hoursOfService", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hoursOfService", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAddress();
            boolean rhsFieldIsSet = that.isSetAddress();
            CIAddressPropertyType lhsField;
            lhsField = this.getAddress();
            CIAddressPropertyType rhsField;
            rhsField = that.getAddress();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "address", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "address", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPhone();
            boolean rhsFieldIsSet = that.isSetPhone();
            CITelephonePropertyType lhsField;
            lhsField = this.getPhone();
            CITelephonePropertyType rhsField;
            rhsField = that.getPhone();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "phone", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "phone", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOnlineResource();
            boolean rhsFieldIsSet = that.isSetOnlineResource();
            CIOnlineResourcePropertyType lhsField;
            lhsField = this.getOnlineResource();
            CIOnlineResourcePropertyType rhsField;
            rhsField = that.getOnlineResource();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "onlineResource", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "onlineResource", rhsField);
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
            boolean theFieldIsSet = this.isSetPhone();
            CITelephonePropertyType theField;
            theField = this.getPhone();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "phone", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAddress();
            CIAddressPropertyType theField;
            theField = this.getAddress();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "address", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOnlineResource();
            CIOnlineResourcePropertyType theField;
            theField = this.getOnlineResource();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "onlineResource", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoursOfService();
            CharacterStringPropertyType theField;
            theField = this.getHoursOfService();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hoursOfService", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContactInstructions();
            CharacterStringPropertyType theField;
            theField = this.getContactInstructions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contactInstructions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPhone();
            CITelephonePropertyType theField;
            theField = this.getPhone();
            strategy.appendField(locator, this, "phone", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAddress();
            CIAddressPropertyType theField;
            theField = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOnlineResource();
            CIOnlineResourcePropertyType theField;
            theField = this.getOnlineResource();
            strategy.appendField(locator, this, "onlineResource", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoursOfService();
            CharacterStringPropertyType theField;
            theField = this.getHoursOfService();
            strategy.appendField(locator, this, "hoursOfService", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContactInstructions();
            CharacterStringPropertyType theField;
            theField = this.getContactInstructions();
            strategy.appendField(locator, this, "contactInstructions", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
