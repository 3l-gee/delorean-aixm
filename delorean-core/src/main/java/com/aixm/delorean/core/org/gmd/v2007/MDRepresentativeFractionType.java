
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
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
 * <p>Java class for MD_RepresentativeFraction_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_RepresentativeFraction_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="denominator" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_RepresentativeFraction_Type", propOrder = {
    "denominator"
})
public class MDRepresentativeFractionType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected IntegerPropertyType denominator;

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDenominator(IntegerPropertyType value) {
        this.denominator = value;
    }

    public boolean isSetDenominator() {
        return (this.denominator!= null);
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
        final MDRepresentativeFractionType that = ((MDRepresentativeFractionType) object);
        {
            boolean lhsFieldIsSet = this.isSetDenominator();
            boolean rhsFieldIsSet = that.isSetDenominator();
            IntegerPropertyType lhsField;
            lhsField = this.getDenominator();
            IntegerPropertyType rhsField;
            rhsField = that.getDenominator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "denominator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "denominator", rhsField);
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
            boolean theFieldIsSet = this.isSetDenominator();
            IntegerPropertyType theField;
            theField = this.getDenominator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "denominator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDenominator();
            IntegerPropertyType theField;
            theField = this.getDenominator();
            strategy.appendField(locator, this, "denominator", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
