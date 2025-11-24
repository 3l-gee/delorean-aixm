
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for TimeEdgeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeEdgeType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimeTopologyPrimitiveType">
 *       <sequence>
 *         <element name="start" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType"/>
 *         <element name="end" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType"/>
 *         <element name="extent" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEdgeType", propOrder = {
    "start",
    "end",
    "extent"
})
public class TimeEdgeType
    extends AbstractTimeTopologyPrimitiveType
{

    @XmlElement(required = true)
    protected TimeNodePropertyType start;
    @XmlElement(required = true)
    protected TimeNodePropertyType end;
    protected TimePeriodPropertyType extent;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setStart(TimeNodePropertyType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setEnd(TimeNodePropertyType value) {
        this.end = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setExtent(TimePeriodPropertyType value) {
        this.extent = value;
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
        final TimeEdgeType that = ((TimeEdgeType) object);
        {
            boolean lhsFieldIsSet = (this.end!= null);
            boolean rhsFieldIsSet = (that.end!= null);
            TimeNodePropertyType lhsField;
            lhsField = this.getEnd();
            TimeNodePropertyType rhsField;
            rhsField = that.getEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "end", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "end", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.extent!= null);
            boolean rhsFieldIsSet = (that.extent!= null);
            TimePeriodPropertyType lhsField;
            lhsField = this.getExtent();
            TimePeriodPropertyType rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.start!= null);
            boolean rhsFieldIsSet = (that.start!= null);
            TimeNodePropertyType lhsField;
            lhsField = this.getStart();
            TimeNodePropertyType rhsField;
            rhsField = that.getStart();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "start", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "start", rhsField);
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
            boolean theFieldIsSet = (this.start!= null);
            TimeNodePropertyType theField;
            theField = this.getStart();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "start", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.end!= null);
            TimeNodePropertyType theField;
            theField = this.getEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "end", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.extent!= null);
            TimePeriodPropertyType theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.start!= null);
            TimeNodePropertyType theField;
            theField = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.end!= null);
            TimeNodePropertyType theField;
            theField = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.extent!= null);
            TimePeriodPropertyType theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
