
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
 * <p>Java class for AirportHeliportAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirportHeliportAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AirportHeliportAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportAvailabilityPropertyType", propOrder = {
    "airportHeliportAvailability"
})
@Entity(name = "AirportHeliportAvailabilityPropertyType")
@Table(name = "airportheliportavailability_pt", schema = "airport_heliport")
public class AirportHeliportAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirportHeliportAvailability", required = true)
    protected AirportHeliportAvailabilityType airportHeliportAvailability;

    /**
     * Gets the value of the airportHeliportAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = AirportHeliportAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airportheliportavailability_id", referencedColumnName = "hjid")
    public AirportHeliportAvailabilityType getAirportHeliportAvailability() {
        return airportHeliportAvailability;
    }

    /**
     * Sets the value of the airportHeliportAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportAvailabilityType }
     *     
     */
    public void setAirportHeliportAvailability(AirportHeliportAvailabilityType value) {
        this.airportHeliportAvailability = value;
    }

    @Transient
    public boolean isSetAirportHeliportAvailability() {
        return (this.airportHeliportAvailability!= null);
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
        final AirportHeliportAvailabilityPropertyType that = ((AirportHeliportAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirportHeliportAvailability();
            boolean rhsFieldIsSet = that.isSetAirportHeliportAvailability();
            AirportHeliportAvailabilityType lhsField;
            lhsField = this.getAirportHeliportAvailability();
            AirportHeliportAvailabilityType rhsField;
            rhsField = that.getAirportHeliportAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportHeliportAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportHeliportAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetAirportHeliportAvailability();
            AirportHeliportAvailabilityType theField;
            theField = this.getAirportHeliportAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliportAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirportHeliportAvailability();
            AirportHeliportAvailabilityType theField;
            theField = this.getAirportHeliportAvailability();
            strategy.appendField(locator, this, "airportHeliportAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
