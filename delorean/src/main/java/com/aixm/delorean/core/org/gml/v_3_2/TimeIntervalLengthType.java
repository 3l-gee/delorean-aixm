
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 * <p>Java class for TimeIntervalLengthType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeIntervalLengthType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attribute name="unit" use="required" type="{http://www.opengis.net/gml/3.2}TimeUnitType" />
 *       <attribute name="radix" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       <attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIntervalLengthType", propOrder = {
    "value"
})
public class TimeIntervalLengthType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unit", required = true)
    protected String unit;
    @XmlAttribute(name = "radix")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger radix;
    @XmlAttribute(name = "factor")
    protected BigInteger factor;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    public boolean isSetUnit() {
        return (this.unit!= null);
    }

    /**
     * Gets the value of the radix property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadix() {
        return radix;
    }

    /**
     * Sets the value of the radix property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadix(BigInteger value) {
        this.radix = value;
    }

    public boolean isSetRadix() {
        return (this.radix!= null);
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactor(BigInteger value) {
        this.factor = value;
    }

    public boolean isSetFactor() {
        return (this.factor!= null);
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
        final TimeIntervalLengthType that = ((TimeIntervalLengthType) object);
        {
            boolean lhsFieldIsSet = this.isSetFactor();
            boolean rhsFieldIsSet = that.isSetFactor();
            BigInteger lhsField;
            lhsField = this.getFactor();
            BigInteger rhsField;
            rhsField = that.getFactor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "factor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "factor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValue();
            boolean rhsFieldIsSet = that.isSetValue();
            BigDecimal lhsField;
            lhsField = this.getValue();
            BigDecimal rhsField;
            rhsField = that.getValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadix();
            boolean rhsFieldIsSet = that.isSetRadix();
            BigInteger lhsField;
            lhsField = this.getRadix();
            BigInteger rhsField;
            rhsField = that.getRadix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUnit();
            boolean rhsFieldIsSet = that.isSetUnit();
            String lhsField;
            lhsField = this.getUnit();
            String rhsField;
            rhsField = that.getUnit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unit", rhsField);
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
            boolean theFieldIsSet = this.isSetValue();
            BigDecimal theField;
            theField = this.getValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnit();
            String theField;
            theField = this.getUnit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadix();
            BigInteger theField;
            theField = this.getRadix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFactor();
            BigInteger theField;
            theField = this.getFactor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "factor", theField);
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
            boolean theFieldIsSet = this.isSetValue();
            BigDecimal theField;
            theField = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnit();
            String theField;
            theField = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadix();
            BigInteger theField;
            theField = this.getRadix();
            strategy.appendField(locator, this, "radix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFactor();
            BigInteger theField;
            theField = this.getFactor();
            strategy.appendField(locator, this, "factor", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
