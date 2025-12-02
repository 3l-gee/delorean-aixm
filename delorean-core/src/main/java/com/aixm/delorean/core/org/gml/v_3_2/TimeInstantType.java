
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
 * <p>Java class for TimeInstantType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeInstantType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTimeGeometricPrimitiveType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}timePosition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstantType", propOrder = {
    "timePosition"
})
public class TimeInstantType
    extends AbstractTimeGeometricPrimitiveType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * This element is used directly as a property of gml:TimeInstant (see 15.2.2.3), and may also be used in application schemas.
     * 
     */
    @XmlElement(required = true)
    protected TimePositionType timePosition;

    /**
     * This element is used directly as a property of gml:TimeInstant (see 15.2.2.3), and may also be used in application schemas.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getTimePosition() {
        return timePosition;
    }

    /**
     * Sets the value of the timePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     * @see #getTimePosition()
     */
    public void setTimePosition(TimePositionType value) {
        this.timePosition = value;
    }

    public boolean isSetTimePosition() {
        return (this.timePosition!= null);
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
        final TimeInstantType that = ((TimeInstantType) object);
        {
            boolean lhsFieldIsSet = this.isSetTimePosition();
            boolean rhsFieldIsSet = that.isSetTimePosition();
            TimePositionType lhsField;
            lhsField = this.getTimePosition();
            TimePositionType rhsField;
            rhsField = that.getTimePosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timePosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timePosition", rhsField);
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
            boolean theFieldIsSet = this.isSetTimePosition();
            TimePositionType theField;
            theField = this.getTimePosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timePosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTimePosition();
            TimePositionType theField;
            theField = this.getTimePosition();
            strategy.appendField(locator, this, "timePosition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
