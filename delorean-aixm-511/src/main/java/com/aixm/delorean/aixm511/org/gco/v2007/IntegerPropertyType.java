
package com.aixm.delorean.core.org.gco.v2007;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for Integer_PropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Integer_PropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.isotc211.org/2005/gco}Integer"/>
 *       </sequence>
 *       <attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Integer_PropertyType", propOrder = {
    "integer"
})
public class IntegerPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Integer")
    protected BigInteger integer;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected String nilReason;

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInteger(BigInteger value) {
        this.integer = value;
    }

    public boolean isSetInteger() {
        return (this.integer!= null);
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Sets the value of the nilReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

    public boolean isSetNilReason() {
        return (this.nilReason!= null);
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
        final IntegerPropertyType that = ((IntegerPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetInteger();
            boolean rhsFieldIsSet = that.isSetInteger();
            BigInteger lhsField;
            lhsField = this.getInteger();
            BigInteger rhsField;
            rhsField = that.getInteger();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "integer", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "integer", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNilReason();
            boolean rhsFieldIsSet = that.isSetNilReason();
            String lhsField;
            lhsField = this.getNilReason();
            String rhsField;
            rhsField = that.getNilReason();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nilReason", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nilReason", rhsField);
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
            boolean theFieldIsSet = this.isSetInteger();
            BigInteger theField;
            theField = this.getInteger();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "integer", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nilReason", theField);
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
            boolean theFieldIsSet = this.isSetInteger();
            BigInteger theField;
            theField = this.getInteger();
            strategy.appendField(locator, this, "integer", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
