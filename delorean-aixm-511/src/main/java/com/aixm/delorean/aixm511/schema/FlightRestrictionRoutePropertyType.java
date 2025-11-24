
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
 * <p>Java class for FlightRestrictionRoutePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRestrictionRoutePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FlightRestrictionRoute"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRestrictionRoutePropertyType", propOrder = {
    "flightRestrictionRoute"
})
@Entity(name = "FlightRestrictionRoutePropertyType")
@Table(name = "flightrestrictionroute_pt", schema = "route")
public class FlightRestrictionRoutePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightRestrictionRoute", required = true)
    protected FlightRestrictionRouteType flightRestrictionRoute;

    /**
     * Gets the value of the flightRestrictionRoute property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionRouteType }
     *     
     */
    @OneToOne(targetEntity = FlightRestrictionRouteType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightrestrictionroute_id", referencedColumnName = "hjid")
    public FlightRestrictionRouteType getFlightRestrictionRoute() {
        return flightRestrictionRoute;
    }

    /**
     * Sets the value of the flightRestrictionRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionRouteType }
     *     
     */
    public void setFlightRestrictionRoute(FlightRestrictionRouteType value) {
        this.flightRestrictionRoute = value;
    }

    @Transient
    public boolean isSetFlightRestrictionRoute() {
        return (this.flightRestrictionRoute!= null);
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
        final FlightRestrictionRoutePropertyType that = ((FlightRestrictionRoutePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightRestrictionRoute();
            boolean rhsFieldIsSet = that.isSetFlightRestrictionRoute();
            FlightRestrictionRouteType lhsField;
            lhsField = this.getFlightRestrictionRoute();
            FlightRestrictionRouteType rhsField;
            rhsField = that.getFlightRestrictionRoute();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightRestrictionRoute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightRestrictionRoute", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightRestrictionRoute();
            FlightRestrictionRouteType theField;
            theField = this.getFlightRestrictionRoute();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightRestrictionRoute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightRestrictionRoute();
            FlightRestrictionRouteType theField;
            theField = this.getFlightRestrictionRoute();
            strategy.appendField(locator, this, "flightRestrictionRoute", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
