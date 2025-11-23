
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
 * <p>Java class for FlightConditionCombinationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightConditionCombinationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FlightConditionCombination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightConditionCombinationPropertyType", propOrder = {
    "flightConditionCombination"
})
@Entity(name = "FlightConditionCombinationPropertyType")
@Table(name = "flightconditioncombination_pt", schema = "route")
public class FlightConditionCombinationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightConditionCombination", required = true)
    protected FlightConditionCombinationType flightConditionCombination;

    /**
     * Gets the value of the flightConditionCombination property.
     * 
     * @return
     *     possible object is
     *     {@link FlightConditionCombinationType }
     *     
     */
    @OneToOne(targetEntity = FlightConditionCombinationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightconditioncombination_id", referencedColumnName = "hjid")
    public FlightConditionCombinationType getFlightConditionCombination() {
        return flightConditionCombination;
    }

    /**
     * Sets the value of the flightConditionCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightConditionCombinationType }
     *     
     */
    public void setFlightConditionCombination(FlightConditionCombinationType value) {
        this.flightConditionCombination = value;
    }

    @Transient
    public boolean isSetFlightConditionCombination() {
        return (this.flightConditionCombination!= null);
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
        final FlightConditionCombinationPropertyType that = ((FlightConditionCombinationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightConditionCombination();
            boolean rhsFieldIsSet = that.isSetFlightConditionCombination();
            FlightConditionCombinationType lhsField;
            lhsField = this.getFlightConditionCombination();
            FlightConditionCombinationType rhsField;
            rhsField = that.getFlightConditionCombination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightConditionCombination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightConditionCombination", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightConditionCombination();
            FlightConditionCombinationType theField;
            theField = this.getFlightConditionCombination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightConditionCombination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightConditionCombination();
            FlightConditionCombinationType theField;
            theField = this.getFlightConditionCombination();
            strategy.appendField(locator, this, "flightConditionCombination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
