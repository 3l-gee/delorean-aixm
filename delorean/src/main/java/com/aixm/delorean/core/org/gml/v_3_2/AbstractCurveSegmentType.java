
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for AbstractCurveSegmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractCurveSegmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="numDerivativesAtStart" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       <attribute name="numDerivativesAtEnd" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       <attribute name="numDerivativeInterior" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCurveSegmentType")
@XmlSeeAlso({
    LineStringSegmentType.class,
    ArcStringType.class,
    ArcStringByBulgeType.class,
    ArcByCenterPointType.class,
    CubicSplineType.class,
    BSplineType.class,
    OffsetCurveType.class,
    ClothoidType.class,
    GeodesicStringType.class
})
public abstract class AbstractCurveSegmentType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlAttribute(name = "numDerivativesAtStart")
    protected BigInteger numDerivativesAtStart;
    @XmlAttribute(name = "numDerivativesAtEnd")
    protected BigInteger numDerivativesAtEnd;
    @XmlAttribute(name = "numDerivativeInterior")
    protected BigInteger numDerivativeInterior;

    /**
     * Gets the value of the numDerivativesAtStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtStart() {
        if (numDerivativesAtStart == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtStart;
        }
    }

    /**
     * Sets the value of the numDerivativesAtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtStart(BigInteger value) {
        this.numDerivativesAtStart = value;
    }

    public boolean isSetNumDerivativesAtStart() {
        return (this.numDerivativesAtStart!= null);
    }

    /**
     * Gets the value of the numDerivativesAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtEnd() {
        if (numDerivativesAtEnd == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtEnd;
        }
    }

    /**
     * Sets the value of the numDerivativesAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtEnd(BigInteger value) {
        this.numDerivativesAtEnd = value;
    }

    public boolean isSetNumDerivativesAtEnd() {
        return (this.numDerivativesAtEnd!= null);
    }

    /**
     * Gets the value of the numDerivativeInterior property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativeInterior() {
        if (numDerivativeInterior == null) {
            return new BigInteger("0");
        } else {
            return numDerivativeInterior;
        }
    }

    /**
     * Sets the value of the numDerivativeInterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativeInterior(BigInteger value) {
        this.numDerivativeInterior = value;
    }

    public boolean isSetNumDerivativeInterior() {
        return (this.numDerivativeInterior!= null);
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
        final AbstractCurveSegmentType that = ((AbstractCurveSegmentType) object);
        {
            boolean lhsFieldIsSet = this.isSetNumDerivativesAtStart();
            boolean rhsFieldIsSet = that.isSetNumDerivativesAtStart();
            BigInteger lhsField;
            lhsField = this.getNumDerivativesAtStart();
            BigInteger rhsField;
            rhsField = that.getNumDerivativesAtStart();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numDerivativesAtStart", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numDerivativesAtStart", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNumDerivativesAtEnd();
            boolean rhsFieldIsSet = that.isSetNumDerivativesAtEnd();
            BigInteger lhsField;
            lhsField = this.getNumDerivativesAtEnd();
            BigInteger rhsField;
            rhsField = that.getNumDerivativesAtEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numDerivativesAtEnd", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numDerivativesAtEnd", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNumDerivativeInterior();
            boolean rhsFieldIsSet = that.isSetNumDerivativeInterior();
            BigInteger lhsField;
            lhsField = this.getNumDerivativeInterior();
            BigInteger rhsField;
            rhsField = that.getNumDerivativeInterior();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numDerivativeInterior", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numDerivativeInterior", rhsField);
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
            boolean theFieldIsSet = this.isSetNumDerivativesAtStart();
            BigInteger theField;
            theField = this.getNumDerivativesAtStart();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numDerivativesAtStart", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumDerivativesAtEnd();
            BigInteger theField;
            theField = this.getNumDerivativesAtEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numDerivativesAtEnd", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumDerivativeInterior();
            BigInteger theField;
            theField = this.getNumDerivativeInterior();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numDerivativeInterior", theField);
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
            boolean theFieldIsSet = this.isSetNumDerivativesAtStart();
            BigInteger theField;
            theField = this.getNumDerivativesAtStart();
            strategy.appendField(locator, this, "numDerivativesAtStart", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumDerivativesAtEnd();
            BigInteger theField;
            theField = this.getNumDerivativesAtEnd();
            strategy.appendField(locator, this, "numDerivativesAtEnd", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumDerivativeInterior();
            BigInteger theField;
            theField = this.getNumDerivativeInterior();
            strategy.appendField(locator, this, "numDerivativeInterior", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
