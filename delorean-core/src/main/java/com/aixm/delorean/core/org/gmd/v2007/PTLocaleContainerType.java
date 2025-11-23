
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for PT_LocaleContainer_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PT_LocaleContainer_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="locale" type="{http://www.isotc211.org/2005/gmd}PT_Locale_PropertyType"/>
 *         <element name="date" type="{http://www.isotc211.org/2005/gmd}CI_Date_PropertyType" maxOccurs="unbounded"/>
 *         <element name="responsibleParty" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *         <element name="localisedString" type="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_LocaleContainer_Type", propOrder = {
    "description",
    "locale",
    "date",
    "responsibleParty",
    "localisedString"
})
public class PTLocaleContainerType implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType description;
    @XmlElement(required = true)
    protected PTLocalePropertyType locale;
    @XmlElement(required = true)
    protected List<CIDatePropertyType> date;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> responsibleParty;
    @XmlElement(required = true)
    protected List<LocalisedCharacterStringPropertyType> localisedString;

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

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link PTLocalePropertyType }
     *     
     */
    public PTLocalePropertyType getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTLocalePropertyType }
     *     
     */
    public void setLocale(PTLocalePropertyType value) {
        this.locale = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIDatePropertyType }
     * 
     * 
     */
    public List<CIDatePropertyType> getDate() {
        if (date == null) {
            date = new ArrayList<>();
        }
        return this.date;
    }

    /**
     * 
     * 
     */
    public void setDate(List<CIDatePropertyType> date) {
        this.date = date;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getResponsibleParty() {
        if (responsibleParty == null) {
            responsibleParty = new ArrayList<>();
        }
        return this.responsibleParty;
    }

    /**
     * 
     * 
     */
    public void setResponsibleParty(List<CIResponsiblePartyPropertyType> responsibleParty) {
        this.responsibleParty = responsibleParty;
    }

    /**
     * Gets the value of the localisedString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localisedString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalisedString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalisedCharacterStringPropertyType }
     * 
     * 
     */
    public List<LocalisedCharacterStringPropertyType> getLocalisedString() {
        if (localisedString == null) {
            localisedString = new ArrayList<>();
        }
        return this.localisedString;
    }

    /**
     * 
     * 
     */
    public void setLocalisedString(List<LocalisedCharacterStringPropertyType> localisedString) {
        this.localisedString = localisedString;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PTLocaleContainerType that = ((PTLocaleContainerType) object);
        {
            boolean lhsFieldIsSet = (this.description!= null);
            boolean rhsFieldIsSet = (that.description!= null);
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
            boolean lhsFieldIsSet = ((this.date!= null)&&(!this.date.isEmpty()));
            boolean rhsFieldIsSet = ((that.date!= null)&&(!that.date.isEmpty()));
            List<CIDatePropertyType> lhsField;
            lhsField = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
            List<CIDatePropertyType> rhsField;
            rhsField = (((that.date!= null)&&(!that.date.isEmpty()))?that.getDate():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "date", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "date", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.localisedString!= null)&&(!this.localisedString.isEmpty()));
            boolean rhsFieldIsSet = ((that.localisedString!= null)&&(!that.localisedString.isEmpty()));
            List<LocalisedCharacterStringPropertyType> lhsField;
            lhsField = (((this.localisedString!= null)&&(!this.localisedString.isEmpty()))?this.getLocalisedString():null);
            List<LocalisedCharacterStringPropertyType> rhsField;
            rhsField = (((that.localisedString!= null)&&(!that.localisedString.isEmpty()))?that.getLocalisedString():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "localisedString", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "localisedString", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()));
            boolean rhsFieldIsSet = ((that.responsibleParty!= null)&&(!that.responsibleParty.isEmpty()));
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()))?this.getResponsibleParty():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (((that.responsibleParty!= null)&&(!that.responsibleParty.isEmpty()))?that.getResponsibleParty():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "responsibleParty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "responsibleParty", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.locale!= null);
            boolean rhsFieldIsSet = (that.locale!= null);
            PTLocalePropertyType lhsField;
            lhsField = this.getLocale();
            PTLocalePropertyType rhsField;
            rhsField = that.getLocale();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locale", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locale", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = (this.description!= null);
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "description", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.locale!= null);
            PTLocalePropertyType theField;
            theField = this.getLocale();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locale", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.date!= null)&&(!this.date.isEmpty()));
            List<CIDatePropertyType> theField;
            theField = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "date", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()))?this.getResponsibleParty():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "responsibleParty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.localisedString!= null)&&(!this.localisedString.isEmpty()));
            List<LocalisedCharacterStringPropertyType> theField;
            theField = (((this.localisedString!= null)&&(!this.localisedString.isEmpty()))?this.getLocalisedString():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "localisedString", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = (this.description!= null);
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.locale!= null);
            PTLocalePropertyType theField;
            theField = this.getLocale();
            strategy.appendField(locator, this, "locale", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.date!= null)&&(!this.date.isEmpty()));
            List<CIDatePropertyType> theField;
            theField = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
            strategy.appendField(locator, this, "date", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.responsibleParty!= null)&&(!this.responsibleParty.isEmpty()))?this.getResponsibleParty():null);
            strategy.appendField(locator, this, "responsibleParty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.localisedString!= null)&&(!this.localisedString.isEmpty()));
            List<LocalisedCharacterStringPropertyType> theField;
            theField = (((this.localisedString!= null)&&(!this.localisedString.isEmpty()))?this.getLocalisedString():null);
            strategy.appendField(locator, this, "localisedString", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
