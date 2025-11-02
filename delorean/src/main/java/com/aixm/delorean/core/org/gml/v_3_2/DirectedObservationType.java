
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DirectedObservationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectedObservationType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}ObservationType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}direction"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectedObservationType", propOrder = {
    "direction"
})
@XmlSeeAlso({
    DirectedObservationAtDistanceType.class
})
public class DirectedObservationType
    extends ObservationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * The property gml:direction is intended as a pre-defined property expressing a direction to be assigned to features defined in a GML application schema.
     * 
     */
    @XmlElement(required = true)
    protected DirectionPropertyType direction;

    /**
     * The property gml:direction is intended as a pre-defined property expressing a direction to be assigned to features defined in a GML application schema.
     * 
     * @return
     *     possible object is
     *     {@link DirectionPropertyType }
     *     
     */
    public DirectionPropertyType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionPropertyType }
     *     
     * @see #getDirection()
     */
    public void setDirection(DirectionPropertyType value) {
        this.direction = value;
    }

    public boolean isSetDirection() {
        return (this.direction!= null);
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
        final DirectedObservationType that = ((DirectedObservationType) object);
        {
            boolean lhsFieldIsSet = this.isSetDirection();
            boolean rhsFieldIsSet = that.isSetDirection();
            DirectionPropertyType lhsField;
            lhsField = this.getDirection();
            DirectionPropertyType rhsField;
            rhsField = that.getDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "direction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "direction", rhsField);
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
            boolean theFieldIsSet = this.isSetDirection();
            DirectionPropertyType theField;
            theField = this.getDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "direction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDirection();
            DirectionPropertyType theField;
            theField = this.getDirection();
            strategy.appendField(locator, this, "direction", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
