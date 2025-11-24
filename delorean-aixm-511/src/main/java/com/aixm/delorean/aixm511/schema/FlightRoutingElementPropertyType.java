
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
 * <p>Java class for FlightRoutingElementPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRoutingElementPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FlightRoutingElement"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRoutingElementPropertyType", propOrder = {
    "flightRoutingElement"
})
@Entity(name = "FlightRoutingElementPropertyType")
@Table(name = "flightroutingelement_pt", schema = "route")
public class FlightRoutingElementPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightRoutingElement", required = true)
    protected FlightRoutingElementType flightRoutingElement;

    /**
     * Gets the value of the flightRoutingElement property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRoutingElementType }
     *     
     */
    @OneToOne(targetEntity = FlightRoutingElementType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightroutingelement_id", referencedColumnName = "hjid")
    public FlightRoutingElementType getFlightRoutingElement() {
        return flightRoutingElement;
    }

    /**
     * Sets the value of the flightRoutingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRoutingElementType }
     *     
     */
    public void setFlightRoutingElement(FlightRoutingElementType value) {
        this.flightRoutingElement = value;
    }

    @Transient
    public boolean isSetFlightRoutingElement() {
        return (this.flightRoutingElement!= null);
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
        final FlightRoutingElementPropertyType that = ((FlightRoutingElementPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightRoutingElement();
            boolean rhsFieldIsSet = that.isSetFlightRoutingElement();
            FlightRoutingElementType lhsField;
            lhsField = this.getFlightRoutingElement();
            FlightRoutingElementType rhsField;
            rhsField = that.getFlightRoutingElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightRoutingElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightRoutingElement", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightRoutingElement();
            FlightRoutingElementType theField;
            theField = this.getFlightRoutingElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightRoutingElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightRoutingElement();
            FlightRoutingElementType theField;
            theField = this.getFlightRoutingElement();
            strategy.appendField(locator, this, "flightRoutingElement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
