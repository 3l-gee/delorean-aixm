
package com.aixm.delorean.core.org.gmd.v2007;

import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
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
 * <p>Java class for PT_Locale_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PT_Locale_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="languageCode" type="{http://www.isotc211.org/2005/gmd}LanguageCode_PropertyType"/>
 *         <element name="country" type="{http://www.isotc211.org/2005/gmd}Country_PropertyType" minOccurs="0"/>
 *         <element name="characterEncoding" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_Locale_Type", propOrder = {
    "languageCode",
    "country",
    "characterEncoding"
})
public class PTLocaleType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected LanguageCodePropertyType languageCode;
    protected CountryPropertyType country;
    @XmlElement(required = true)
    protected MDCharacterSetCodePropertyType characterEncoding;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public LanguageCodePropertyType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public void setLanguageCode(LanguageCodePropertyType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPropertyType }
     *     
     */
    public CountryPropertyType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPropertyType }
     *     
     */
    public void setCountry(CountryPropertyType value) {
        this.country = value;
    }

    /**
     * Gets the value of the characterEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterEncoding() {
        return characterEncoding;
    }

    /**
     * Sets the value of the characterEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterEncoding(MDCharacterSetCodePropertyType value) {
        this.characterEncoding = value;
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
        final PTLocaleType that = ((PTLocaleType) object);
        {
            boolean lhsFieldIsSet = (this.country!= null);
            boolean rhsFieldIsSet = (that.country!= null);
            CountryPropertyType lhsField;
            lhsField = this.getCountry();
            CountryPropertyType rhsField;
            rhsField = that.getCountry();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "country", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "country", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.languageCode!= null);
            boolean rhsFieldIsSet = (that.languageCode!= null);
            LanguageCodePropertyType lhsField;
            lhsField = this.getLanguageCode();
            LanguageCodePropertyType rhsField;
            rhsField = that.getLanguageCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "languageCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "languageCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.characterEncoding!= null);
            boolean rhsFieldIsSet = (that.characterEncoding!= null);
            MDCharacterSetCodePropertyType lhsField;
            lhsField = this.getCharacterEncoding();
            MDCharacterSetCodePropertyType rhsField;
            rhsField = that.getCharacterEncoding();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "characterEncoding", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "characterEncoding", rhsField);
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
            boolean theFieldIsSet = (this.languageCode!= null);
            LanguageCodePropertyType theField;
            theField = this.getLanguageCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "languageCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.country!= null);
            CountryPropertyType theField;
            theField = this.getCountry();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "country", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.characterEncoding!= null);
            MDCharacterSetCodePropertyType theField;
            theField = this.getCharacterEncoding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "characterEncoding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.languageCode!= null);
            LanguageCodePropertyType theField;
            theField = this.getLanguageCode();
            strategy.appendField(locator, this, "languageCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.country!= null);
            CountryPropertyType theField;
            theField = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.characterEncoding!= null);
            MDCharacterSetCodePropertyType theField;
            theField = this.getCharacterEncoding();
            strategy.appendField(locator, this, "characterEncoding", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
