
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for FlightCharacteristicPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightCharacteristicPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FlightCharacteristic"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicPropertyType", propOrder = {
    "flightCharacteristic"
})
@Entity(name = "FlightCharacteristicPropertyType")
@Table(name = "flightcharacteristic_pt", schema = "shared")
public class FlightCharacteristicPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightCharacteristic", required = true)
    protected FlightCharacteristicType flightCharacteristic;

    /**
     * Gets the value of the flightCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicType }
     *     
     */
    @OneToOne(targetEntity = FlightCharacteristicType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightcharacteristic_id", referencedColumnName = "hjid")
    public FlightCharacteristicType getFlightCharacteristic() {
        return flightCharacteristic;
    }

    /**
     * Sets the value of the flightCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicType }
     *     
     */
    public void setFlightCharacteristic(FlightCharacteristicType value) {
        this.flightCharacteristic = value;
    }

    @Transient
    public boolean isSetFlightCharacteristic() {
        return (this.flightCharacteristic!= null);
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
        final FlightCharacteristicPropertyType that = ((FlightCharacteristicPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightCharacteristic();
            boolean rhsFieldIsSet = that.isSetFlightCharacteristic();
            FlightCharacteristicType lhsField;
            lhsField = this.getFlightCharacteristic();
            FlightCharacteristicType rhsField;
            rhsField = that.getFlightCharacteristic();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightCharacteristic", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightCharacteristic", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightCharacteristic();
            FlightCharacteristicType theField;
            theField = this.getFlightCharacteristic();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightCharacteristic", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightCharacteristic();
            FlightCharacteristicType theField;
            theField = this.getFlightCharacteristic();
            strategy.appendField(locator, this, "flightCharacteristic", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
