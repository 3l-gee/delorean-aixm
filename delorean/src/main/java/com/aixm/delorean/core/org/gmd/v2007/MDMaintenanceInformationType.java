
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DatePropertyType;
import com.aixm.delorean.core.org.gts.v2007.TMPeriodDurationPropertyType;
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
 * Information about the scope and frequency of updating
 * 
 * <p>Java class for MD_MaintenanceInformation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_MaintenanceInformation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="maintenanceAndUpdateFrequency" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceFrequencyCode_PropertyType"/>
 *         <element name="dateOfNextUpdate" type="{http://www.isotc211.org/2005/gco}Date_PropertyType" minOccurs="0"/>
 *         <element name="userDefinedMaintenanceFrequency" type="{http://www.isotc211.org/2005/gts}TM_PeriodDuration_PropertyType" minOccurs="0"/>
 *         <element name="updateScope" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="updateScopeDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maintenanceNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MaintenanceInformation_Type", propOrder = {
    "maintenanceAndUpdateFrequency",
    "dateOfNextUpdate",
    "userDefinedMaintenanceFrequency",
    "updateScope",
    "updateScopeDescription",
    "maintenanceNote",
    "contact"
})
public class MDMaintenanceInformationType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency;
    protected DatePropertyType dateOfNextUpdate;
    protected TMPeriodDurationPropertyType userDefinedMaintenanceFrequency;
    protected List<MDScopeCodePropertyType> updateScope;
    protected List<MDScopeDescriptionPropertyType> updateScopeDescription;
    protected List<CharacterStringPropertyType> maintenanceNote;
    protected List<CIResponsiblePartyPropertyType> contact;

    /**
     * Gets the value of the maintenanceAndUpdateFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency() {
        return maintenanceAndUpdateFrequency;
    }

    /**
     * Sets the value of the maintenanceAndUpdateFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public void setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType value) {
        this.maintenanceAndUpdateFrequency = value;
    }

    public boolean isSetMaintenanceAndUpdateFrequency() {
        return (this.maintenanceAndUpdateFrequency!= null);
    }

    /**
     * Gets the value of the dateOfNextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateOfNextUpdate() {
        return dateOfNextUpdate;
    }

    /**
     * Sets the value of the dateOfNextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateOfNextUpdate(DatePropertyType value) {
        this.dateOfNextUpdate = value;
    }

    public boolean isSetDateOfNextUpdate() {
        return (this.dateOfNextUpdate!= null);
    }

    /**
     * Gets the value of the userDefinedMaintenanceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency() {
        return userDefinedMaintenanceFrequency;
    }

    /**
     * Sets the value of the userDefinedMaintenanceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public void setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType value) {
        this.userDefinedMaintenanceFrequency = value;
    }

    public boolean isSetUserDefinedMaintenanceFrequency() {
        return (this.userDefinedMaintenanceFrequency!= null);
    }

    /**
     * Gets the value of the updateScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getUpdateScope() {
        if (updateScope == null) {
            updateScope = new ArrayList<>();
        }
        return this.updateScope;
    }

    /**
     * 
     * 
     */
    public void setUpdateScope(List<MDScopeCodePropertyType> updateScope) {
        this.updateScope = updateScope;
    }

    public boolean isSetUpdateScope() {
        return ((this.updateScope!= null)&&(!this.updateScope.isEmpty()));
    }

    public void unsetUpdateScope() {
        this.updateScope = null;
    }

    /**
     * Gets the value of the updateScopeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScopeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScopeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getUpdateScopeDescription() {
        if (updateScopeDescription == null) {
            updateScopeDescription = new ArrayList<>();
        }
        return this.updateScopeDescription;
    }

    /**
     * 
     * 
     */
    public void setUpdateScopeDescription(List<MDScopeDescriptionPropertyType> updateScopeDescription) {
        this.updateScopeDescription = updateScopeDescription;
    }

    public boolean isSetUpdateScopeDescription() {
        return ((this.updateScopeDescription!= null)&&(!this.updateScopeDescription.isEmpty()));
    }

    public void unsetUpdateScopeDescription() {
        this.updateScopeDescription = null;
    }

    /**
     * Gets the value of the maintenanceNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getMaintenanceNote() {
        if (maintenanceNote == null) {
            maintenanceNote = new ArrayList<>();
        }
        return this.maintenanceNote;
    }

    /**
     * 
     * 
     */
    public void setMaintenanceNote(List<CharacterStringPropertyType> maintenanceNote) {
        this.maintenanceNote = maintenanceNote;
    }

    public boolean isSetMaintenanceNote() {
        return ((this.maintenanceNote!= null)&&(!this.maintenanceNote.isEmpty()));
    }

    public void unsetMaintenanceNote() {
        this.maintenanceNote = null;
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
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
    }

    /**
     * 
     * 
     */
    public void setContact(List<CIResponsiblePartyPropertyType> contact) {
        this.contact = contact;
    }

    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
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
        final MDMaintenanceInformationType that = ((MDMaintenanceInformationType) object);
        {
            boolean lhsFieldIsSet = this.isSetUpdateScope();
            boolean rhsFieldIsSet = that.isSetUpdateScope();
            List<MDScopeCodePropertyType> lhsField;
            lhsField = (this.isSetUpdateScope()?this.getUpdateScope():null);
            List<MDScopeCodePropertyType> rhsField;
            rhsField = (that.isSetUpdateScope()?that.getUpdateScope():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "updateScope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "updateScope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUserDefinedMaintenanceFrequency();
            boolean rhsFieldIsSet = that.isSetUserDefinedMaintenanceFrequency();
            TMPeriodDurationPropertyType lhsField;
            lhsField = this.getUserDefinedMaintenanceFrequency();
            TMPeriodDurationPropertyType rhsField;
            rhsField = that.getUserDefinedMaintenanceFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "userDefinedMaintenanceFrequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "userDefinedMaintenanceFrequency", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDateOfNextUpdate();
            boolean rhsFieldIsSet = that.isSetDateOfNextUpdate();
            DatePropertyType lhsField;
            lhsField = this.getDateOfNextUpdate();
            DatePropertyType rhsField;
            rhsField = that.getDateOfNextUpdate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateOfNextUpdate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateOfNextUpdate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContact();
            boolean rhsFieldIsSet = that.isSetContact();
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (this.isSetContact()?this.getContact():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (that.isSetContact()?that.getContact():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpdateScopeDescription();
            boolean rhsFieldIsSet = that.isSetUpdateScopeDescription();
            List<MDScopeDescriptionPropertyType> lhsField;
            lhsField = (this.isSetUpdateScopeDescription()?this.getUpdateScopeDescription():null);
            List<MDScopeDescriptionPropertyType> rhsField;
            rhsField = (that.isSetUpdateScopeDescription()?that.getUpdateScopeDescription():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "updateScopeDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "updateScopeDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaintenanceAndUpdateFrequency();
            boolean rhsFieldIsSet = that.isSetMaintenanceAndUpdateFrequency();
            MDMaintenanceFrequencyCodePropertyType lhsField;
            lhsField = this.getMaintenanceAndUpdateFrequency();
            MDMaintenanceFrequencyCodePropertyType rhsField;
            rhsField = that.getMaintenanceAndUpdateFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maintenanceAndUpdateFrequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maintenanceAndUpdateFrequency", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaintenanceNote();
            boolean rhsFieldIsSet = that.isSetMaintenanceNote();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetMaintenanceNote()?this.getMaintenanceNote():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetMaintenanceNote()?that.getMaintenanceNote():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maintenanceNote", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maintenanceNote", rhsField);
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
            boolean theFieldIsSet = this.isSetMaintenanceAndUpdateFrequency();
            MDMaintenanceFrequencyCodePropertyType theField;
            theField = this.getMaintenanceAndUpdateFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maintenanceAndUpdateFrequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateOfNextUpdate();
            DatePropertyType theField;
            theField = this.getDateOfNextUpdate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateOfNextUpdate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserDefinedMaintenanceFrequency();
            TMPeriodDurationPropertyType theField;
            theField = this.getUserDefinedMaintenanceFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "userDefinedMaintenanceFrequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpdateScope();
            List<MDScopeCodePropertyType> theField;
            theField = (this.isSetUpdateScope()?this.getUpdateScope():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "updateScope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpdateScopeDescription();
            List<MDScopeDescriptionPropertyType> theField;
            theField = (this.isSetUpdateScopeDescription()?this.getUpdateScopeDescription():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "updateScopeDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaintenanceNote();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetMaintenanceNote()?this.getMaintenanceNote():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maintenanceNote", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<CIResponsiblePartyPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMaintenanceAndUpdateFrequency();
            MDMaintenanceFrequencyCodePropertyType theField;
            theField = this.getMaintenanceAndUpdateFrequency();
            strategy.appendField(locator, this, "maintenanceAndUpdateFrequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateOfNextUpdate();
            DatePropertyType theField;
            theField = this.getDateOfNextUpdate();
            strategy.appendField(locator, this, "dateOfNextUpdate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserDefinedMaintenanceFrequency();
            TMPeriodDurationPropertyType theField;
            theField = this.getUserDefinedMaintenanceFrequency();
            strategy.appendField(locator, this, "userDefinedMaintenanceFrequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpdateScope();
            List<MDScopeCodePropertyType> theField;
            theField = (this.isSetUpdateScope()?this.getUpdateScope():null);
            strategy.appendField(locator, this, "updateScope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpdateScopeDescription();
            List<MDScopeDescriptionPropertyType> theField;
            theField = (this.isSetUpdateScopeDescription()?this.getUpdateScopeDescription():null);
            strategy.appendField(locator, this, "updateScopeDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaintenanceNote();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetMaintenanceNote()?this.getMaintenanceNote():null);
            strategy.appendField(locator, this, "maintenanceNote", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<CIResponsiblePartyPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
