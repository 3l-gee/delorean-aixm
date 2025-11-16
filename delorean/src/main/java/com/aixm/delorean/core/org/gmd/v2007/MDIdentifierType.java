
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MD_Identifier_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Identifier_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="authority" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         <element name="code" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Identifier_Type", propOrder = {
    "authority",
    "code"
})
@XmlSeeAlso({
    RSIdentifierType.class
})
public class MDIdentifierType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CICitationPropertyType authority;
    @XmlElement(required = true)
    protected CharacterStringPropertyType code;

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setAuthority(CICitationPropertyType value) {
        this.authority = value;
    }

    public boolean isSetAuthority() {
        return (this.authority!= null);
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCode(CharacterStringPropertyType value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code!= null);
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
        final MDIdentifierType that = ((MDIdentifierType) object);
        {
            boolean lhsFieldIsSet = this.isSetCode();
            boolean rhsFieldIsSet = that.isSetCode();
            CharacterStringPropertyType lhsField;
            lhsField = this.getCode();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "code", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "code", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAuthority();
            boolean rhsFieldIsSet = that.isSetAuthority();
            CICitationPropertyType lhsField;
            lhsField = this.getAuthority();
            CICitationPropertyType rhsField;
            rhsField = that.getAuthority();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authority", rhsField);
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
            boolean theFieldIsSet = this.isSetAuthority();
            CICitationPropertyType theField;
            theField = this.getAuthority();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCode();
            CharacterStringPropertyType theField;
            theField = this.getCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "code", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAuthority();
            CICitationPropertyType theField;
            theField = this.getAuthority();
            strategy.appendField(locator, this, "authority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCode();
            CharacterStringPropertyType theField;
            theField = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
