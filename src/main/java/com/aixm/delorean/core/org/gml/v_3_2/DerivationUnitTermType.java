
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DerivationUnitTermType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DerivationUnitTermType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}UnitOfMeasureType">
 *       <attribute name="exponent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivationUnitTermType")
public class DerivationUnitTermType
    extends UnitOfMeasureType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlAttribute(name = "exponent")
    protected BigInteger exponent;

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExponent(BigInteger value) {
        this.exponent = value;
    }

    public boolean isSetExponent() {
        return (this.exponent!= null);
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
        final DerivationUnitTermType that = ((DerivationUnitTermType) object);
        {
            boolean lhsFieldIsSet = this.isSetExponent();
            boolean rhsFieldIsSet = that.isSetExponent();
            BigInteger lhsField;
            lhsField = this.getExponent();
            BigInteger rhsField;
            rhsField = that.getExponent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "exponent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "exponent", rhsField);
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
            boolean theFieldIsSet = this.isSetExponent();
            BigInteger theField;
            theField = this.getExponent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "exponent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetExponent();
            BigInteger theField;
            theField = this.getExponent();
            strategy.appendField(locator, this, "exponent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
