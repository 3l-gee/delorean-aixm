
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for TimeCoordinateSystemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeCoordinateSystemType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       <sequence>
 *         <choice>
 *           <element name="originPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           <element name="origin" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         </choice>
 *         <element name="interval" type="{http://www.opengis.net/gml/3.2}TimeIntervalLengthType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCoordinateSystemType", propOrder = {
    "originPosition",
    "origin",
    "interval"
})
public class TimeCoordinateSystemType
    extends TimeReferenceSystemType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected TimePositionType originPosition;
    protected TimeInstantPropertyType origin;
    @XmlElement(required = true)
    protected TimeIntervalLengthType interval;

    /**
     * Gets the value of the originPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getOriginPosition() {
        return originPosition;
    }

    /**
     * Sets the value of the originPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setOriginPosition(TimePositionType value) {
        this.originPosition = value;
    }

    public boolean isSetOriginPosition() {
        return (this.originPosition!= null);
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setOrigin(TimeInstantPropertyType value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setInterval(TimeIntervalLengthType value) {
        this.interval = value;
    }

    public boolean isSetInterval() {
        return (this.interval!= null);
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
        final TimeCoordinateSystemType that = ((TimeCoordinateSystemType) object);
        {
            boolean lhsFieldIsSet = this.isSetOriginPosition();
            boolean rhsFieldIsSet = that.isSetOriginPosition();
            TimePositionType lhsField;
            lhsField = this.getOriginPosition();
            TimePositionType rhsField;
            rhsField = that.getOriginPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "originPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "originPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInterval();
            boolean rhsFieldIsSet = that.isSetInterval();
            TimeIntervalLengthType lhsField;
            lhsField = this.getInterval();
            TimeIntervalLengthType rhsField;
            rhsField = that.getInterval();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interval", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOrigin();
            boolean rhsFieldIsSet = that.isSetOrigin();
            TimeInstantPropertyType lhsField;
            lhsField = this.getOrigin();
            TimeInstantPropertyType rhsField;
            rhsField = that.getOrigin();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "origin", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "origin", rhsField);
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
            boolean theFieldIsSet = this.isSetOriginPosition();
            TimePositionType theField;
            theField = this.getOriginPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "originPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrigin();
            TimeInstantPropertyType theField;
            theField = this.getOrigin();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "origin", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInterval();
            TimeIntervalLengthType theField;
            theField = this.getInterval();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interval", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetOriginPosition();
            TimePositionType theField;
            theField = this.getOriginPosition();
            strategy.appendField(locator, this, "originPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrigin();
            TimeInstantPropertyType theField;
            theField = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInterval();
            TimeIntervalLengthType theField;
            theField = this.getInterval();
            strategy.appendField(locator, this, "interval", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
