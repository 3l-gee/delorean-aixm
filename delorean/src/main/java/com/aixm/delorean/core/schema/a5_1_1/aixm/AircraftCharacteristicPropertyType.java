
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
 * <p>Java class for AircraftCharacteristicPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AircraftCharacteristicPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AircraftCharacteristic"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCharacteristicPropertyType", propOrder = {
    "aircraftCharacteristic"
})
@Entity(name = "AircraftCharacteristicPropertyType")
@Table(name = "aircraftcharacteristic_pt", schema = "shared")
public class AircraftCharacteristicPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AircraftCharacteristic", required = true)
    protected AircraftCharacteristicType aircraftCharacteristic;

    /**
     * Gets the value of the aircraftCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftCharacteristicType }
     *     
     */
    @OneToOne(targetEntity = AircraftCharacteristicType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraftcharacteristic_id", referencedColumnName = "hjid")
    public AircraftCharacteristicType getAircraftCharacteristic() {
        return aircraftCharacteristic;
    }

    /**
     * Sets the value of the aircraftCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftCharacteristicType }
     *     
     */
    public void setAircraftCharacteristic(AircraftCharacteristicType value) {
        this.aircraftCharacteristic = value;
    }

    @Transient
    public boolean isSetAircraftCharacteristic() {
        return (this.aircraftCharacteristic!= null);
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
        final AircraftCharacteristicPropertyType that = ((AircraftCharacteristicPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAircraftCharacteristic();
            boolean rhsFieldIsSet = that.isSetAircraftCharacteristic();
            AircraftCharacteristicType lhsField;
            lhsField = this.getAircraftCharacteristic();
            AircraftCharacteristicType rhsField;
            rhsField = that.getAircraftCharacteristic();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCharacteristic", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCharacteristic", rhsField);
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
            boolean theFieldIsSet = this.isSetAircraftCharacteristic();
            AircraftCharacteristicType theField;
            theField = this.getAircraftCharacteristic();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCharacteristic", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAircraftCharacteristic();
            AircraftCharacteristicType theField;
            theField = this.getAircraftCharacteristic();
            strategy.appendField(locator, this, "aircraftCharacteristic", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
