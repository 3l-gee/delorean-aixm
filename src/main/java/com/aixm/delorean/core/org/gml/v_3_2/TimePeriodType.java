
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for TimePeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimePeriodType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimeGeometricPrimitiveType">
 *       <sequence>
 *         <choice>
 *           <element name="beginPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           <element name="begin" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         </choice>
 *         <choice>
 *           <element name="endPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           <element name="end" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         </choice>
 *         <group ref="{http://www.opengis.net/gml/3.2}timeLength" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodType", propOrder = {
    "beginPosition",
    "begin",
    "endPosition",
    "end",
    "duration",
    "timeInterval"
})
public class TimePeriodType
    extends AbstractTimeGeometricPrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected TimePositionType beginPosition;
    protected TimeInstantPropertyType begin;
    protected TimePositionType endPosition;
    protected TimeInstantPropertyType end;
    /**
     * gml:duration conforms to the ISO 8601 syntax for temporal length as implemented by the XML Schema duration type.
     * 
     */
    protected Duration duration;
    /**
     * gml:timeInterval conforms to ISO 11404 which is based on floating point values for temporal length.
     * ISO 11404 syntax specifies the use of a positiveInteger together with appropriate values for radix and factor. The resolution of the time interval is to one radix ^(-factor) of the specified time unit.
     * The value of the unit is either selected from the units for time intervals from ISO 31-1:1992, or is another suitable unit.  The encoding is defined for GML in gml:TimeUnitType. The second component of this union type provides a method for indicating time units other than the six standard units given in the enumeration.
     * 
     */
    protected TimeIntervalLengthType timeInterval;

    /**
     * Gets the value of the beginPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getBeginPosition() {
        return beginPosition;
    }

    /**
     * Sets the value of the beginPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setBeginPosition(TimePositionType value) {
        this.beginPosition = value;
    }

    public boolean isSetBeginPosition() {
        return (this.beginPosition!= null);
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setBegin(TimeInstantPropertyType value) {
        this.begin = value;
    }

    public boolean isSetBegin() {
        return (this.begin!= null);
    }

    /**
     * Gets the value of the endPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setEndPosition(TimePositionType value) {
        this.endPosition = value;
    }

    public boolean isSetEndPosition() {
        return (this.endPosition!= null);
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setEnd(TimeInstantPropertyType value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * gml:duration conforms to the ISO 8601 syntax for temporal length as implemented by the XML Schema duration type.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getDuration()
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    /**
     * gml:timeInterval conforms to ISO 11404 which is based on floating point values for temporal length.
     * ISO 11404 syntax specifies the use of a positiveInteger together with appropriate values for radix and factor. The resolution of the time interval is to one radix ^(-factor) of the specified time unit.
     * The value of the unit is either selected from the units for time intervals from ISO 31-1:1992, or is another suitable unit.  The encoding is defined for GML in gml:TimeUnitType. The second component of this union type provides a method for indicating time units other than the six standard units given in the enumeration.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     * @see #getTimeInterval()
     */
    public void setTimeInterval(TimeIntervalLengthType value) {
        this.timeInterval = value;
    }

    public boolean isSetTimeInterval() {
        return (this.timeInterval!= null);
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
        final TimePeriodType that = ((TimePeriodType) object);
        {
            boolean lhsFieldIsSet = this.isSetEndPosition();
            boolean rhsFieldIsSet = that.isSetEndPosition();
            TimePositionType lhsField;
            lhsField = this.getEndPosition();
            TimePositionType rhsField;
            rhsField = that.getEndPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDuration();
            boolean rhsFieldIsSet = that.isSetDuration();
            Duration lhsField;
            lhsField = this.getDuration();
            Duration rhsField;
            rhsField = that.getDuration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "duration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "duration", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEnd();
            boolean rhsFieldIsSet = that.isSetEnd();
            TimeInstantPropertyType lhsField;
            lhsField = this.getEnd();
            TimeInstantPropertyType rhsField;
            rhsField = that.getEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "end", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "end", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBeginPosition();
            boolean rhsFieldIsSet = that.isSetBeginPosition();
            TimePositionType lhsField;
            lhsField = this.getBeginPosition();
            TimePositionType rhsField;
            rhsField = that.getBeginPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "beginPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "beginPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTimeInterval();
            boolean rhsFieldIsSet = that.isSetTimeInterval();
            TimeIntervalLengthType lhsField;
            lhsField = this.getTimeInterval();
            TimeIntervalLengthType rhsField;
            rhsField = that.getTimeInterval();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeInterval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeInterval", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBegin();
            boolean rhsFieldIsSet = that.isSetBegin();
            TimeInstantPropertyType lhsField;
            lhsField = this.getBegin();
            TimeInstantPropertyType rhsField;
            rhsField = that.getBegin();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "begin", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "begin", rhsField);
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
            boolean theFieldIsSet = this.isSetBeginPosition();
            TimePositionType theField;
            theField = this.getBeginPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "beginPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBegin();
            TimeInstantPropertyType theField;
            theField = this.getBegin();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "begin", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPosition();
            TimePositionType theField;
            theField = this.getEndPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnd();
            TimeInstantPropertyType theField;
            theField = this.getEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "end", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            Duration theField;
            theField = this.getDuration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "duration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTimeInterval();
            TimeIntervalLengthType theField;
            theField = this.getTimeInterval();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeInterval", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetBeginPosition();
            TimePositionType theField;
            theField = this.getBeginPosition();
            strategy.appendField(locator, this, "beginPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBegin();
            TimeInstantPropertyType theField;
            theField = this.getBegin();
            strategy.appendField(locator, this, "begin", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndPosition();
            TimePositionType theField;
            theField = this.getEndPosition();
            strategy.appendField(locator, this, "endPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnd();
            TimeInstantPropertyType theField;
            theField = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDuration();
            Duration theField;
            theField = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTimeInterval();
            TimeIntervalLengthType theField;
            theField = this.getTimeInterval();
            strategy.appendField(locator, this, "timeInterval", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
