
package com.aixm.delorean.core.org.gco.v2007;

import java.io.Serializable;
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
 * A MemberName is a LocalName that references either an attribute slot in a record or  recordType or an attribute, operation, or association role in an object instance or  type description in some form of schema. The stored value "aName" is the returned value for the "aName()" operation.
 * 
 * <p>Java class for MemberName_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MemberName_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="attributeType" type="{http://www.isotc211.org/2005/gco}TypeName_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberName_Type", propOrder = {
    "aName",
    "attributeType"
})
public class MemberNameType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected CharacterStringPropertyType aName;
    @XmlElement(required = true)
    protected TypeNamePropertyType attributeType;

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

    public boolean isSetAName() {
        return (this.aName!= null);
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNamePropertyType }
     *     
     */
    public TypeNamePropertyType getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNamePropertyType }
     *     
     */
    public void setAttributeType(TypeNamePropertyType value) {
        this.attributeType = value;
    }

    public boolean isSetAttributeType() {
        return (this.attributeType!= null);
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
        final MemberNameType that = ((MemberNameType) object);
        {
            boolean lhsFieldIsSet = this.isSetAttributeType();
            boolean rhsFieldIsSet = that.isSetAttributeType();
            TypeNamePropertyType lhsField;
            lhsField = this.getAttributeType();
            TypeNamePropertyType rhsField;
            rhsField = that.getAttributeType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "attributeType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "attributeType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAName();
            boolean rhsFieldIsSet = that.isSetAName();
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
            boolean theFieldIsSet = this.isSetAName();
            CharacterStringPropertyType theField;
            theField = this.getAName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAttributeType();
            TypeNamePropertyType theField;
            theField = this.getAttributeType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "attributeType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAName();
            CharacterStringPropertyType theField;
            theField = this.getAName();
            strategy.appendField(locator, this, "aName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAttributeType();
            TypeNamePropertyType theField;
            theField = this.getAttributeType();
            strategy.appendField(locator, this, "attributeType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
