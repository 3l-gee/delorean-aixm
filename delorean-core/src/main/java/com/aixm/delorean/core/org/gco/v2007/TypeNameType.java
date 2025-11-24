
package com.aixm.delorean.core.org.gco.v2007;

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
 * A TypeName is a LocalName that references either a recordType or object type in some form of schema. The stored value "aName" is the returned value for the "aName()" operation. This is the types name.  - For parsing from types (or objects) the parsible name normally uses a "." navigation separator, so that it is of the form  [class].[member].[memberOfMember]. ...)
 * 
 * <p>Java class for TypeName_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TypeName_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeName_Type", propOrder = {
    "aName"
})
public class TypeNameType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType aName;

    /**
     * Gets the value of the aName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAName() {
        return aName;
    }

    /**
     * Sets the value of the aName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAName(CharacterStringPropertyType value) {
        this.aName = value;
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
        final TypeNameType that = ((TypeNameType) object);
        {
            boolean lhsFieldIsSet = (this.aName!= null);
            boolean rhsFieldIsSet = (that.aName!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getAName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getAName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aName", rhsField);
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
            boolean theFieldIsSet = (this.aName!= null);
            CharacterStringPropertyType theField;
            theField = this.getAName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.aName!= null);
            CharacterStringPropertyType theField;
            theField = this.getAName();
            strategy.appendField(locator, this, "aName", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
