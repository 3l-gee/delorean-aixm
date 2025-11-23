
package com.aixm.delorean.aixm511.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.aixm511.org.gco.v2007.CharacterStringPropertyType;
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
 * <p>Java class for PT_FreeText_PropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PT_FreeText_PropertyType">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.isotc211.org/2005/gmd}PT_FreeText"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_FreeText_PropertyType", propOrder = {
    "ptFreeText"
})
public class PTFreeTextPropertyType
    extends CharacterStringPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "PT_FreeText")
    protected PTFreeTextType ptFreeText;

    /**
     * Gets the value of the ptFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link PTFreeTextType }
     *     
     */
    public PTFreeTextType getPTFreeText() {
        return ptFreeText;
    }

    /**
     * Sets the value of the ptFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTFreeTextType }
     *     
     */
    public void setPTFreeText(PTFreeTextType value) {
        this.ptFreeText = value;
    }

    public boolean isSetPTFreeText() {
        return (this.ptFreeText!= null);
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
        final PTFreeTextPropertyType that = ((PTFreeTextPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetPTFreeText();
            boolean rhsFieldIsSet = that.isSetPTFreeText();
            PTFreeTextType lhsField;
            lhsField = this.getPTFreeText();
            PTFreeTextType rhsField;
            rhsField = that.getPTFreeText();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ptFreeText", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ptFreeText", rhsField);
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
            boolean theFieldIsSet = this.isSetPTFreeText();
            PTFreeTextType theField;
            theField = this.getPTFreeText();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ptFreeText", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPTFreeText();
            PTFreeTextType theField;
            theField = this.getPTFreeText();
            strategy.appendField(locator, this, "ptFreeText", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
