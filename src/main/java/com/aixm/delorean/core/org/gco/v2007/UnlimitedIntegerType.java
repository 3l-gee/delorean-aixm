
package com.aixm.delorean.core.org.gco.v2007;

import java.io.Serializable;
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
 * <p>Java class for UnlimitedInteger_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnlimitedInteger_Type">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *       <attribute name="isInfinite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnlimitedInteger_Type", propOrder = {
    "value"
})
public class UnlimitedIntegerType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlValue
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger value;
    @XmlAttribute(name = "isInfinite")
    protected Boolean isInfinite;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the isInfinite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getIsInfinite() {
        return isInfinite;
    }

    /**
     * Sets the value of the isInfinite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInfinite(boolean value) {
        this.isInfinite = value;
    }

    public boolean isSetIsInfinite() {
        return (this.isInfinite!= null);
    }

    public void unsetIsInfinite() {
        this.isInfinite = null;
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
        final UnlimitedIntegerType that = ((UnlimitedIntegerType) object);
        {
            boolean lhsFieldIsSet = this.isSetIsInfinite();
            boolean rhsFieldIsSet = that.isSetIsInfinite();
            boolean lhsField;
            lhsField = (this.isSetIsInfinite()?this.getIsInfinite():false);
            boolean rhsField;
            rhsField = (that.isSetIsInfinite()?that.getIsInfinite():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isInfinite", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isInfinite", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValue();
            boolean rhsFieldIsSet = that.isSetValue();
            BigInteger lhsField;
            lhsField = this.getValue();
            BigInteger rhsField;
            rhsField = that.getValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
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
            BigInteger theField;
            theField = this.getValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIsInfinite();
            boolean theField;
            theField = (this.isSetIsInfinite()?this.getIsInfinite():false);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isInfinite", theField);
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
            BigInteger theField;
            theField = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIsInfinite();
            boolean theField;
            theField = (this.isSetIsInfinite()?this.getIsInfinite():false);
            strategy.appendField(locator, this, "isInfinite", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
