
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
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
 * <p>Java class for RS_Identifier_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RS_Identifier_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_Identifier_Type">
 *       <sequence>
 *         <element name="codeSpace" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="version" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_Identifier_Type", propOrder = {
    "codeSpace",
    "version"
})
public class RSIdentifierType
    extends MDIdentifierType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CharacterStringPropertyType codeSpace;
    protected CharacterStringPropertyType version;

    /**
     * Gets the value of the codeSpace property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCodeSpace() {
        return codeSpace;
    }

    /**
     * Sets the value of the codeSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCodeSpace(CharacterStringPropertyType value) {
        this.codeSpace = value;
    }

    public boolean isSetCodeSpace() {
        return (this.codeSpace!= null);
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setVersion(CharacterStringPropertyType value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
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
        final RSIdentifierType that = ((RSIdentifierType) object);
        {
            boolean lhsFieldIsSet = this.isSetCodeSpace();
            boolean rhsFieldIsSet = that.isSetCodeSpace();
            CharacterStringPropertyType lhsField;
            lhsField = this.getCodeSpace();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCodeSpace();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeSpace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeSpace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVersion();
            boolean rhsFieldIsSet = that.isSetVersion();
            CharacterStringPropertyType lhsField;
            lhsField = this.getVersion();
            CharacterStringPropertyType rhsField;
            rhsField = that.getVersion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "version", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "version", rhsField);
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
            boolean theFieldIsSet = this.isSetCodeSpace();
            CharacterStringPropertyType theField;
            theField = this.getCodeSpace();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeSpace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVersion();
            CharacterStringPropertyType theField;
            theField = this.getVersion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "version", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCodeSpace();
            CharacterStringPropertyType theField;
            theField = this.getCodeSpace();
            strategy.appendField(locator, this, "codeSpace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVersion();
            CharacterStringPropertyType theField;
            theField = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
