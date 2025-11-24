
package com.aixm.delorean.core.org.gmd.v2007;

import com.aixm.delorean.core.org.gco.v2007.ObjectReferencePropertyType;
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
 * <p>Java class for LocalisedCharacterString_PropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LocalisedCharacterString_PropertyType">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalisedCharacterString_PropertyType", propOrder = {
    "localisedCharacterString"
})
public class LocalisedCharacterStringPropertyType
    extends ObjectReferencePropertyType
{

    @XmlElement(name = "LocalisedCharacterString")
    protected LocalisedCharacterStringType localisedCharacterString;

    /**
     * Gets the value of the localisedCharacterString property.
     * 
     * @return
     *     possible object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public LocalisedCharacterStringType getLocalisedCharacterString() {
        return localisedCharacterString;
    }

    /**
     * Sets the value of the localisedCharacterString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public void setLocalisedCharacterString(LocalisedCharacterStringType value) {
        this.localisedCharacterString = value;
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
        final LocalisedCharacterStringPropertyType that = ((LocalisedCharacterStringPropertyType) object);
        {
            boolean lhsFieldIsSet = (this.localisedCharacterString!= null);
            boolean rhsFieldIsSet = (that.localisedCharacterString!= null);
            LocalisedCharacterStringType lhsField;
            lhsField = this.getLocalisedCharacterString();
            LocalisedCharacterStringType rhsField;
            rhsField = that.getLocalisedCharacterString();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "localisedCharacterString", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "localisedCharacterString", rhsField);
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
            boolean theFieldIsSet = (this.localisedCharacterString!= null);
            LocalisedCharacterStringType theField;
            theField = this.getLocalisedCharacterString();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "localisedCharacterString", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.localisedCharacterString!= null);
            LocalisedCharacterStringType theField;
            theField = this.getLocalisedCharacterString();
            strategy.appendField(locator, this, "localisedCharacterString", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
