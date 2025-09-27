
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about online sources from which the dataset, specification, or community profile name and extended metadata elements can be obtained.
 * 
 * <p>Java class for CI_OnlineResource_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_OnlineResource_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="linkage" type="{http://www.isotc211.org/2005/gmd}URL_PropertyType"/>
 *         <element name="protocol" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="applicationProfile" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="function" type="{http://www.isotc211.org/2005/gmd}CI_OnLineFunctionCode_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_OnlineResource_Type", propOrder = {
    "linkage",
    "protocol",
    "applicationProfile",
    "name",
    "description",
    "function"
})
public class CIOnlineResourceType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected URLPropertyType linkage;
    protected CharacterStringPropertyType protocol;
    protected CharacterStringPropertyType applicationProfile;
    protected CharacterStringPropertyType name;
    protected CharacterStringPropertyType description;
    protected CIOnLineFunctionCodePropertyType function;

    /**
     * Gets the value of the linkage property.
     * 
     * @return
     *     possible object is
     *     {@link URLPropertyType }
     *     
     */
    public URLPropertyType getLinkage() {
        return linkage;
    }

    /**
     * Sets the value of the linkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLPropertyType }
     *     
     */
    public void setLinkage(URLPropertyType value) {
        this.linkage = value;
    }

    public boolean isSetLinkage() {
        return (this.linkage!= null);
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setProtocol(CharacterStringPropertyType value) {
        this.protocol = value;
    }

    public boolean isSetProtocol() {
        return (this.protocol!= null);
    }

    /**
     * Gets the value of the applicationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getApplicationProfile() {
        return applicationProfile;
    }

    /**
     * Sets the value of the applicationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setApplicationProfile(CharacterStringPropertyType value) {
        this.applicationProfile = value;
    }

    public boolean isSetApplicationProfile() {
        return (this.applicationProfile!= null);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnLineFunctionCodePropertyType }
     *     
     */
    public CIOnLineFunctionCodePropertyType getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnLineFunctionCodePropertyType }
     *     
     */
    public void setFunction(CIOnLineFunctionCodePropertyType value) {
        this.function = value;
    }

    public boolean isSetFunction() {
        return (this.function!= null);
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
        final CIOnlineResourceType that = ((CIOnlineResourceType) object);
        {
            boolean lhsFieldIsSet = this.isSetProtocol();
            boolean rhsFieldIsSet = that.isSetProtocol();
            CharacterStringPropertyType lhsField;
            lhsField = this.getProtocol();
            CharacterStringPropertyType rhsField;
            rhsField = that.getProtocol();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "protocol", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "protocol", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDescription();
            boolean rhsFieldIsSet = that.isSetDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "description", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "description", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFunction();
            boolean rhsFieldIsSet = that.isSetFunction();
            CIOnLineFunctionCodePropertyType lhsField;
            lhsField = this.getFunction();
            CIOnLineFunctionCodePropertyType rhsField;
            rhsField = that.getFunction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "function", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "function", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLinkage();
            boolean rhsFieldIsSet = that.isSetLinkage();
            URLPropertyType lhsField;
            lhsField = this.getLinkage();
            URLPropertyType rhsField;
            rhsField = that.getLinkage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "linkage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "linkage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetName();
            boolean rhsFieldIsSet = that.isSetName();
            CharacterStringPropertyType lhsField;
            lhsField = this.getName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApplicationProfile();
            boolean rhsFieldIsSet = that.isSetApplicationProfile();
            CharacterStringPropertyType lhsField;
            lhsField = this.getApplicationProfile();
            CharacterStringPropertyType rhsField;
            rhsField = that.getApplicationProfile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "applicationProfile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "applicationProfile", rhsField);
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
            boolean theFieldIsSet = this.isSetLinkage();
            URLPropertyType theField;
            theField = this.getLinkage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "linkage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtocol();
            CharacterStringPropertyType theField;
            theField = this.getProtocol();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "protocol", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicationProfile();
            CharacterStringPropertyType theField;
            theField = this.getApplicationProfile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "applicationProfile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetName();
            CharacterStringPropertyType theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDescription();
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "description", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFunction();
            CIOnLineFunctionCodePropertyType theField;
            theField = this.getFunction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "function", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetLinkage();
            URLPropertyType theField;
            theField = this.getLinkage();
            strategy.appendField(locator, this, "linkage", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtocol();
            CharacterStringPropertyType theField;
            theField = this.getProtocol();
            strategy.appendField(locator, this, "protocol", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicationProfile();
            CharacterStringPropertyType theField;
            theField = this.getApplicationProfile();
            strategy.appendField(locator, this, "applicationProfile", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetName();
            CharacterStringPropertyType theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDescription();
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFunction();
            CIOnLineFunctionCodePropertyType theField;
            theField = this.getFunction();
            strategy.appendField(locator, this, "function", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
