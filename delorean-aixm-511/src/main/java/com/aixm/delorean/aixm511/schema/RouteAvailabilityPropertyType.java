
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
 * <p>Java class for RouteAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}RouteAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteAvailabilityPropertyType", propOrder = {
    "routeAvailability"
})
@Entity(name = "RouteAvailabilityPropertyType")
@Table(name = "routeavailability_pt", schema = "route")
public class RouteAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "RouteAvailability", required = true)
    protected RouteAvailabilityType routeAvailability;

    /**
     * Gets the value of the routeAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link RouteAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = RouteAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "routeavailability_id", referencedColumnName = "hjid")
    public RouteAvailabilityType getRouteAvailability() {
        return routeAvailability;
    }

    /**
     * Sets the value of the routeAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteAvailabilityType }
     *     
     */
    public void setRouteAvailability(RouteAvailabilityType value) {
        this.routeAvailability = value;
    }

    @Transient
    public boolean isSetRouteAvailability() {
        return (this.routeAvailability!= null);
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
        final RouteAvailabilityPropertyType that = ((RouteAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetRouteAvailability();
            boolean rhsFieldIsSet = that.isSetRouteAvailability();
            RouteAvailabilityType lhsField;
            lhsField = this.getRouteAvailability();
            RouteAvailabilityType rhsField;
            rhsField = that.getRouteAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "routeAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "routeAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetRouteAvailability();
            RouteAvailabilityType theField;
            theField = this.getRouteAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "routeAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRouteAvailability();
            RouteAvailabilityType theField;
            theField = this.getRouteAvailability();
            strategy.appendField(locator, this, "routeAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
