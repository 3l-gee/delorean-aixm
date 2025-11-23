
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
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
 * <p>Java class for FormulaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FormulaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="c" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="d" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormulaType", propOrder = {
    "a",
    "b",
    "c",
    "d"
})
public class FormulaType implements Equals, HashCode, ToString
{

    protected Double a;
    protected double b;
    protected double c;
    protected Double d;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setA(Double value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

    /**
     * Gets the value of the c property.
     * 
     */
    public double getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     */
    public void setC(double value) {
        this.c = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setD(Double value) {
        this.d = value;
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
        final FormulaType that = ((FormulaType) object);
        {
            boolean lhsFieldIsSet = (this.a!= null);
            boolean rhsFieldIsSet = (that.a!= null);
            Double lhsField;
            lhsField = this.getA();
            Double rhsField;
            rhsField = that.getA();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "a", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "a", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            double lhsField;
            lhsField = this.getC();
            double rhsField;
            rhsField = that.getC();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "c", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "c", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.d!= null);
            boolean rhsFieldIsSet = (that.d!= null);
            Double lhsField;
            lhsField = this.getD();
            Double rhsField;
            rhsField = that.getD();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "d", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "d", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = true;
            boolean rhsFieldIsSet = true;
            double lhsField;
            lhsField = this.getB();
            double rhsField;
            rhsField = that.getB();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "b", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "b", rhsField);
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
            boolean theFieldIsSet = (this.a!= null);
            Double theField;
            theField = this.getA();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "a", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getB();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "b", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getC();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "c", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.d!= null);
            Double theField;
            theField = this.getD();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "d", theField);
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
            boolean theFieldIsSet = (this.a!= null);
            Double theField;
            theField = this.getA();
            strategy.appendField(locator, this, "a", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getB();
            strategy.appendField(locator, this, "b", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = true;
            double theField;
            theField = this.getC();
            strategy.appendField(locator, this, "c", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.d!= null);
            Double theField;
            theField = this.getD();
            strategy.appendField(locator, this, "d", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
