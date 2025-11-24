
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="inverseFlattening" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         <element name="semiMinorAxis" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         <element name="isSphere" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inverseFlattening",
    "semiMinorAxis",
    "isSphere"
})
@XmlRootElement(name = "SecondDefiningParameter")
public class SecondDefiningParameter implements Equals, HashCode, ToString
{

    protected MeasureType inverseFlattening;
    protected LengthType semiMinorAxis;
    @XmlElement(defaultValue = "true")
    protected java.lang.Boolean isSphere;

    /**
     * Gets the value of the inverseFlattening property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInverseFlattening() {
        return inverseFlattening;
    }

    /**
     * Sets the value of the inverseFlattening property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInverseFlattening(MeasureType value) {
        this.inverseFlattening = value;
    }

    /**
     * Gets the value of the semiMinorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSemiMinorAxis() {
        return semiMinorAxis;
    }

    /**
     * Sets the value of the semiMinorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSemiMinorAxis(LengthType value) {
        this.semiMinorAxis = value;
    }

    /**
     * Gets the value of the isSphere property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getIsSphere() {
        return isSphere;
    }

    /**
     * Sets the value of the isSphere property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsSphere(java.lang.Boolean value) {
        this.isSphere = value;
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
        final SecondDefiningParameter that = ((SecondDefiningParameter) object);
        {
            boolean lhsFieldIsSet = (this.isSphere!= null);
            boolean rhsFieldIsSet = (that.isSphere!= null);
            java.lang.Boolean lhsField;
            lhsField = this.getIsSphere();
            java.lang.Boolean rhsField;
            rhsField = that.getIsSphere();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isSphere", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isSphere", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.inverseFlattening!= null);
            boolean rhsFieldIsSet = (that.inverseFlattening!= null);
            MeasureType lhsField;
            lhsField = this.getInverseFlattening();
            MeasureType rhsField;
            rhsField = that.getInverseFlattening();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "inverseFlattening", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "inverseFlattening", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.semiMinorAxis!= null);
            boolean rhsFieldIsSet = (that.semiMinorAxis!= null);
            LengthType lhsField;
            lhsField = this.getSemiMinorAxis();
            LengthType rhsField;
            rhsField = that.getSemiMinorAxis();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "semiMinorAxis", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "semiMinorAxis", rhsField);
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
            boolean theFieldIsSet = (this.inverseFlattening!= null);
            MeasureType theField;
            theField = this.getInverseFlattening();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "inverseFlattening", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.semiMinorAxis!= null);
            LengthType theField;
            theField = this.getSemiMinorAxis();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "semiMinorAxis", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.isSphere!= null);
            java.lang.Boolean theField;
            theField = this.getIsSphere();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isSphere", theField);
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
            boolean theFieldIsSet = (this.inverseFlattening!= null);
            MeasureType theField;
            theField = this.getInverseFlattening();
            strategy.appendField(locator, this, "inverseFlattening", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.semiMinorAxis!= null);
            LengthType theField;
            theField = this.getSemiMinorAxis();
            strategy.appendField(locator, this, "semiMinorAxis", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.isSphere!= null);
            java.lang.Boolean theField;
            theField = this.getIsSphere();
            strategy.appendField(locator, this, "isSphere", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
