
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DateTimePropertyType;
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
 * Brief description of ways in which the dataset is currently used.
 * 
 * <p>Java class for MD_Usage_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Usage_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="specificUsage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="usageDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/>
 *         <element name="userDeterminedLimitations" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="userContactInfo" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Usage_Type", propOrder = {
    "specificUsage",
    "usageDateTime",
    "userDeterminedLimitations",
    "userContactInfo"
})
public class MDUsageType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType specificUsage;
    protected DateTimePropertyType usageDateTime;
    protected CharacterStringPropertyType userDeterminedLimitations;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> userContactInfo;

    /**
     * Gets the value of the specificUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecificUsage() {
        return specificUsage;
    }

    /**
     * Sets the value of the specificUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecificUsage(CharacterStringPropertyType value) {
        this.specificUsage = value;
    }

    /**
     * Gets the value of the usageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getUsageDateTime() {
        return usageDateTime;
    }

    /**
     * Sets the value of the usageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setUsageDateTime(DateTimePropertyType value) {
        this.usageDateTime = value;
    }

    /**
     * Gets the value of the userDeterminedLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserDeterminedLimitations() {
        return userDeterminedLimitations;
    }

    /**
     * Sets the value of the userDeterminedLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserDeterminedLimitations(CharacterStringPropertyType value) {
        this.userDeterminedLimitations = value;
    }

    /**
     * Gets the value of the userContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getUserContactInfo() {
        if (userContactInfo == null) {
            userContactInfo = new ArrayList<>();
        }
        return this.userContactInfo;
    }

    /**
     * 
     * 
     */
    public void setUserContactInfo(List<CIResponsiblePartyPropertyType> userContactInfo) {
        this.userContactInfo = userContactInfo;
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
        final MDUsageType that = ((MDUsageType) object);
        {
            boolean lhsFieldIsSet = (this.userDeterminedLimitations!= null);
            boolean rhsFieldIsSet = (that.userDeterminedLimitations!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getUserDeterminedLimitations();
            CharacterStringPropertyType rhsField;
            rhsField = that.getUserDeterminedLimitations();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "userDeterminedLimitations", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "userDeterminedLimitations", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.specificUsage!= null);
            boolean rhsFieldIsSet = (that.specificUsage!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getSpecificUsage();
            CharacterStringPropertyType rhsField;
            rhsField = that.getSpecificUsage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specificUsage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specificUsage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.usageDateTime!= null);
            boolean rhsFieldIsSet = (that.usageDateTime!= null);
            DateTimePropertyType lhsField;
            lhsField = this.getUsageDateTime();
            DateTimePropertyType rhsField;
            rhsField = that.getUsageDateTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usageDateTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usageDateTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()));
            boolean rhsFieldIsSet = ((that.userContactInfo!= null)&&(!that.userContactInfo.isEmpty()));
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (((that.userContactInfo!= null)&&(!that.userContactInfo.isEmpty()))?that.getUserContactInfo():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "userContactInfo", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "userContactInfo", rhsField);
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
            boolean theFieldIsSet = (this.specificUsage!= null);
            CharacterStringPropertyType theField;
            theField = this.getSpecificUsage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specificUsage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.usageDateTime!= null);
            DateTimePropertyType theField;
            theField = this.getUsageDateTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usageDateTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.userDeterminedLimitations!= null);
            CharacterStringPropertyType theField;
            theField = this.getUserDeterminedLimitations();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "userDeterminedLimitations", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "userContactInfo", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.specificUsage!= null);
            CharacterStringPropertyType theField;
            theField = this.getSpecificUsage();
            strategy.appendField(locator, this, "specificUsage", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.usageDateTime!= null);
            DateTimePropertyType theField;
            theField = this.getUsageDateTime();
            strategy.appendField(locator, this, "usageDateTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.userDeterminedLimitations!= null);
            CharacterStringPropertyType theField;
            theField = this.getUserDeterminedLimitations();
            strategy.appendField(locator, this, "userDeterminedLimitations", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
            strategy.appendField(locator, this, "userContactInfo", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
