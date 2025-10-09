
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
 * Identification of, and means of communication with, person(s) and organisations associated with the dataset
 * 
 * <p>Java class for CI_ResponsibleParty_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_ResponsibleParty_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="individualName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="organisationName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="positionName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="contactInfo" type="{http://www.isotc211.org/2005/gmd}CI_Contact_PropertyType" minOccurs="0"/>
 *         <element name="role" type="{http://www.isotc211.org/2005/gmd}CI_RoleCode_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_ResponsibleParty_Type", propOrder = {
    "individualName",
    "organisationName",
    "positionName",
    "contactInfo",
    "role"
})
public class CIResponsiblePartyType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CharacterStringPropertyType individualName;
    protected CharacterStringPropertyType organisationName;
    protected CharacterStringPropertyType positionName;
    protected CIContactPropertyType contactInfo;
    @XmlElement(required = true)
    protected CIRoleCodePropertyType role;

    /**
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setIndividualName(CharacterStringPropertyType value) {
        this.individualName = value;
    }

    public boolean isSetIndividualName() {
        return (this.individualName!= null);
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrganisationName(CharacterStringPropertyType value) {
        this.organisationName = value;
    }

    public boolean isSetOrganisationName() {
        return (this.organisationName!= null);
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPositionName(CharacterStringPropertyType value) {
        this.positionName = value;
    }

    public boolean isSetPositionName() {
        return (this.positionName!= null);
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CIContactPropertyType }
     *     
     */
    public CIContactPropertyType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIContactPropertyType }
     *     
     */
    public void setContactInfo(CIContactPropertyType value) {
        this.contactInfo = value;
    }

    public boolean isSetContactInfo() {
        return (this.contactInfo!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public CIRoleCodePropertyType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public void setRole(CIRoleCodePropertyType value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
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
        final CIResponsiblePartyType that = ((CIResponsiblePartyType) object);
        {
            boolean lhsFieldIsSet = this.isSetContactInfo();
            boolean rhsFieldIsSet = that.isSetContactInfo();
            CIContactPropertyType lhsField;
            lhsField = this.getContactInfo();
            CIContactPropertyType rhsField;
            rhsField = that.getContactInfo();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contactInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contactInfo", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOrganisationName();
            boolean rhsFieldIsSet = that.isSetOrganisationName();
            CharacterStringPropertyType lhsField;
            lhsField = this.getOrganisationName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getOrganisationName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "organisationName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "organisationName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPositionName();
            boolean rhsFieldIsSet = that.isSetPositionName();
            CharacterStringPropertyType lhsField;
            lhsField = this.getPositionName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getPositionName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "positionName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "positionName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIndividualName();
            boolean rhsFieldIsSet = that.isSetIndividualName();
            CharacterStringPropertyType lhsField;
            lhsField = this.getIndividualName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getIndividualName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "individualName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "individualName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRole();
            boolean rhsFieldIsSet = that.isSetRole();
            CIRoleCodePropertyType lhsField;
            lhsField = this.getRole();
            CIRoleCodePropertyType rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
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
            boolean theFieldIsSet = this.isSetIndividualName();
            CharacterStringPropertyType theField;
            theField = this.getIndividualName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "individualName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrganisationName();
            CharacterStringPropertyType theField;
            theField = this.getOrganisationName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "organisationName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPositionName();
            CharacterStringPropertyType theField;
            theField = this.getPositionName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "positionName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContactInfo();
            CIContactPropertyType theField;
            theField = this.getContactInfo();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contactInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRole();
            CIRoleCodePropertyType theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetIndividualName();
            CharacterStringPropertyType theField;
            theField = this.getIndividualName();
            strategy.appendField(locator, this, "individualName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrganisationName();
            CharacterStringPropertyType theField;
            theField = this.getOrganisationName();
            strategy.appendField(locator, this, "organisationName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPositionName();
            CharacterStringPropertyType theField;
            theField = this.getPositionName();
            strategy.appendField(locator, this, "positionName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContactInfo();
            CIContactPropertyType theField;
            theField = this.getContactInfo();
            strategy.appendField(locator, this, "contactInfo", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRole();
            CIRoleCodePropertyType theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
