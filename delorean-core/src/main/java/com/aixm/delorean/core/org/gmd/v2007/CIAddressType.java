
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
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
 * Location of the responsible individual or organisation
 * 
 * <p>Java class for CI_Address_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_Address_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="deliveryPoint" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="city" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="administrativeArea" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="postalCode" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="country" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="electronicMailAddress" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Address_Type", propOrder = {
    "deliveryPoint",
    "city",
    "administrativeArea",
    "postalCode",
    "country",
    "electronicMailAddress"
})
public class CIAddressType
    extends AbstractObjectType
{

    protected List<CharacterStringPropertyType> deliveryPoint;
    protected CharacterStringPropertyType city;
    protected CharacterStringPropertyType administrativeArea;
    protected CharacterStringPropertyType postalCode;
    protected CharacterStringPropertyType country;
    protected List<CharacterStringPropertyType> electronicMailAddress;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getDeliveryPoint() {
        if (deliveryPoint == null) {
            deliveryPoint = new ArrayList<>();
        }
        return this.deliveryPoint;
    }

    /**
     * 
     * 
     */
    public void setDeliveryPoint(List<CharacterStringPropertyType> deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCity(CharacterStringPropertyType value) {
        this.city = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAdministrativeArea(CharacterStringPropertyType value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPostalCode(CharacterStringPropertyType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCountry(CharacterStringPropertyType value) {
        this.country = value;
    }

    /**
     * Gets the value of the electronicMailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicMailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicMailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getElectronicMailAddress() {
        if (electronicMailAddress == null) {
            electronicMailAddress = new ArrayList<>();
        }
        return this.electronicMailAddress;
    }

    /**
     * 
     * 
     */
    public void setElectronicMailAddress(List<CharacterStringPropertyType> electronicMailAddress) {
        this.electronicMailAddress = electronicMailAddress;
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
        final CIAddressType that = ((CIAddressType) object);
        {
            boolean lhsFieldIsSet = (this.city!= null);
            boolean rhsFieldIsSet = (that.city!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getCity();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "city", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "city", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.electronicMailAddress!= null)&&(!this.electronicMailAddress.isEmpty()));
            boolean rhsFieldIsSet = ((that.electronicMailAddress!= null)&&(!that.electronicMailAddress.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.electronicMailAddress!= null)&&(!this.electronicMailAddress.isEmpty()))?this.getElectronicMailAddress():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.electronicMailAddress!= null)&&(!that.electronicMailAddress.isEmpty()))?that.getElectronicMailAddress():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "electronicMailAddress", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "electronicMailAddress", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.deliveryPoint!= null)&&(!this.deliveryPoint.isEmpty()));
            boolean rhsFieldIsSet = ((that.deliveryPoint!= null)&&(!that.deliveryPoint.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.deliveryPoint!= null)&&(!this.deliveryPoint.isEmpty()))?this.getDeliveryPoint():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.deliveryPoint!= null)&&(!that.deliveryPoint.isEmpty()))?that.getDeliveryPoint():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "deliveryPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "deliveryPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.postalCode!= null);
            boolean rhsFieldIsSet = (that.postalCode!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getPostalCode();
            CharacterStringPropertyType rhsField;
            rhsField = that.getPostalCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "postalCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "postalCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.country!= null);
            boolean rhsFieldIsSet = (that.country!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getCountry();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCountry();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "country", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "country", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.administrativeArea!= null);
            boolean rhsFieldIsSet = (that.administrativeArea!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getAdministrativeArea();
            CharacterStringPropertyType rhsField;
            rhsField = that.getAdministrativeArea();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "administrativeArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "administrativeArea", rhsField);
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
            boolean theFieldIsSet = ((this.deliveryPoint!= null)&&(!this.deliveryPoint.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.deliveryPoint!= null)&&(!this.deliveryPoint.isEmpty()))?this.getDeliveryPoint():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "deliveryPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.city!= null);
            CharacterStringPropertyType theField;
            theField = this.getCity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "city", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.administrativeArea!= null);
            CharacterStringPropertyType theField;
            theField = this.getAdministrativeArea();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "administrativeArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.postalCode!= null);
            CharacterStringPropertyType theField;
            theField = this.getPostalCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "postalCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.country!= null);
            CharacterStringPropertyType theField;
            theField = this.getCountry();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "country", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.electronicMailAddress!= null)&&(!this.electronicMailAddress.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.electronicMailAddress!= null)&&(!this.electronicMailAddress.isEmpty()))?this.getElectronicMailAddress():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "electronicMailAddress", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.deliveryPoint!= null)&&(!this.deliveryPoint.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.deliveryPoint!= null)&&(!this.deliveryPoint.isEmpty()))?this.getDeliveryPoint():null);
            strategy.appendField(locator, this, "deliveryPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.city!= null);
            CharacterStringPropertyType theField;
            theField = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.administrativeArea!= null);
            CharacterStringPropertyType theField;
            theField = this.getAdministrativeArea();
            strategy.appendField(locator, this, "administrativeArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.postalCode!= null);
            CharacterStringPropertyType theField;
            theField = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.country!= null);
            CharacterStringPropertyType theField;
            theField = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.electronicMailAddress!= null)&&(!this.electronicMailAddress.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.electronicMailAddress!= null)&&(!this.electronicMailAddress.isEmpty()))?this.getElectronicMailAddress():null);
            strategy.appendField(locator, this, "electronicMailAddress", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
