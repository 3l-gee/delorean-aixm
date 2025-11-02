
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for DMSAngleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DMSAngleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}degrees"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://www.opengis.net/gml/3.2}decimalMinutes"/>
 *           <sequence>
 *             <element ref="{http://www.opengis.net/gml/3.2}minutes"/>
 *             <element ref="{http://www.opengis.net/gml/3.2}seconds" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMSAngleType", propOrder = {
    "degrees",
    "decimalMinutes",
    "minutes",
    "seconds"
})
public class DMSAngleType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected DegreesType degrees;
    protected BigDecimal decimalMinutes;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer minutes;
    protected BigDecimal seconds;

    /**
     * Gets the value of the degrees property.
     * 
     * @return
     *     possible object is
     *     {@link DegreesType }
     *     
     */
    public DegreesType getDegrees() {
        return degrees;
    }

    /**
     * Sets the value of the degrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreesType }
     *     
     */
    public void setDegrees(DegreesType value) {
        this.degrees = value;
    }

    public boolean isSetDegrees() {
        return (this.degrees!= null);
    }

    /**
     * Gets the value of the decimalMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalMinutes() {
        return decimalMinutes;
    }

    /**
     * Sets the value of the decimalMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalMinutes(BigDecimal value) {
        this.decimalMinutes = value;
    }

    public boolean isSetDecimalMinutes() {
        return (this.decimalMinutes!= null);
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    public boolean isSetMinutes() {
        return (this.minutes!= null);
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeconds(BigDecimal value) {
        this.seconds = value;
    }

    public boolean isSetSeconds() {
        return (this.seconds!= null);
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
        final DMSAngleType that = ((DMSAngleType) object);
        {
            boolean lhsFieldIsSet = this.isSetDecimalMinutes();
            boolean rhsFieldIsSet = that.isSetDecimalMinutes();
            BigDecimal lhsField;
            lhsField = this.getDecimalMinutes();
            BigDecimal rhsField;
            rhsField = that.getDecimalMinutes();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "decimalMinutes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "decimalMinutes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDegrees();
            boolean rhsFieldIsSet = that.isSetDegrees();
            DegreesType lhsField;
            lhsField = this.getDegrees();
            DegreesType rhsField;
            rhsField = that.getDegrees();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "degrees", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "degrees", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinutes();
            boolean rhsFieldIsSet = that.isSetMinutes();
            Integer lhsField;
            lhsField = this.getMinutes();
            Integer rhsField;
            rhsField = that.getMinutes();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minutes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minutes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSeconds();
            boolean rhsFieldIsSet = that.isSetSeconds();
            BigDecimal lhsField;
            lhsField = this.getSeconds();
            BigDecimal rhsField;
            rhsField = that.getSeconds();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "seconds", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "seconds", rhsField);
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
            boolean theFieldIsSet = this.isSetDegrees();
            DegreesType theField;
            theField = this.getDegrees();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "degrees", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDecimalMinutes();
            BigDecimal theField;
            theField = this.getDecimalMinutes();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "decimalMinutes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinutes();
            Integer theField;
            theField = this.getMinutes();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minutes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeconds();
            BigDecimal theField;
            theField = this.getSeconds();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "seconds", theField);
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
            boolean theFieldIsSet = this.isSetDegrees();
            DegreesType theField;
            theField = this.getDegrees();
            strategy.appendField(locator, this, "degrees", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDecimalMinutes();
            BigDecimal theField;
            theField = this.getDecimalMinutes();
            strategy.appendField(locator, this, "decimalMinutes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinutes();
            Integer theField;
            theField = this.getMinutes();
            strategy.appendField(locator, this, "minutes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeconds();
            BigDecimal theField;
            theField = this.getSeconds();
            strategy.appendField(locator, this, "seconds", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
