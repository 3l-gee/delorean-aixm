
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
 * <p>Java class for DirectedObservationAtDistanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectedObservationAtDistanceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DirectedObservationType">
 *       <sequence>
 *         <element name="distance" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectedObservationAtDistanceType", propOrder = {
    "distance"
})
public class DirectedObservationAtDistanceType
    extends DirectedObservationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected MeasureType distance;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDistance(MeasureType value) {
        this.distance = value;
    }

    public boolean isSetDistance() {
        return (this.distance!= null);
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
        final DirectedObservationAtDistanceType that = ((DirectedObservationAtDistanceType) object);
        {
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            MeasureType lhsField;
            lhsField = this.getDistance();
            MeasureType rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
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
            boolean theFieldIsSet = this.isSetDistance();
            MeasureType theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDistance();
            MeasureType theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
