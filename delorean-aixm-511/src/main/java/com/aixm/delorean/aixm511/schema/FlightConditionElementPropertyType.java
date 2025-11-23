
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
 * <p>Java class for FlightConditionElementPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightConditionElementPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FlightConditionElement"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightConditionElementPropertyType", propOrder = {
    "flightConditionElement"
})
@Entity(name = "FlightConditionElementPropertyType")
@Table(name = "flightconditionelement_pt", schema = "route")
public class FlightConditionElementPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightConditionElement", required = true)
    protected FlightConditionElementType flightConditionElement;

    /**
     * Gets the value of the flightConditionElement property.
     * 
     * @return
     *     possible object is
     *     {@link FlightConditionElementType }
     *     
     */
    @OneToOne(targetEntity = FlightConditionElementType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightconditionelement_id", referencedColumnName = "hjid")
    public FlightConditionElementType getFlightConditionElement() {
        return flightConditionElement;
    }

    /**
     * Sets the value of the flightConditionElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightConditionElementType }
     *     
     */
    public void setFlightConditionElement(FlightConditionElementType value) {
        this.flightConditionElement = value;
    }

    @Transient
    public boolean isSetFlightConditionElement() {
        return (this.flightConditionElement!= null);
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
        final FlightConditionElementPropertyType that = ((FlightConditionElementPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionElement();
            boolean rhsFieldIsSet = that.isSetFlightConditionElement();
            FlightConditionElementType lhsField;
            lhsField = this.getFlightConditionElement();
            FlightConditionElementType rhsField;
            rhsField = that.getFlightConditionElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionElement", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightConditionElement();
            FlightConditionElementType theField;
            theField = this.getFlightConditionElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightConditionElement();
            FlightConditionElementType theField;
            theField = this.getFlightConditionElement();
            strategy.appendField(locator, this, "flightConditionElement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
