
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
 * <p>Java class for FlightRestrictionLevelPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRestrictionLevelPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}FlightRestrictionLevel"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRestrictionLevelPropertyType", propOrder = {
    "flightRestrictionLevel"
})
@Entity(name = "FlightRestrictionLevelPropertyType")
@Table(name = "flightrestrictionlevel_pt", schema = "route")
public class FlightRestrictionLevelPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "FlightRestrictionLevel", required = true)
    protected FlightRestrictionLevelType flightRestrictionLevel;

    /**
     * Gets the value of the flightRestrictionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionLevelType }
     *     
     */
    @OneToOne(targetEntity = FlightRestrictionLevelType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "flightrestrictionlevel_id", referencedColumnName = "hjid")
    public FlightRestrictionLevelType getFlightRestrictionLevel() {
        return flightRestrictionLevel;
    }

    /**
     * Sets the value of the flightRestrictionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionLevelType }
     *     
     */
    public void setFlightRestrictionLevel(FlightRestrictionLevelType value) {
        this.flightRestrictionLevel = value;
    }

    @Transient
    public boolean isSetFlightRestrictionLevel() {
        return (this.flightRestrictionLevel!= null);
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
        final FlightRestrictionLevelPropertyType that = ((FlightRestrictionLevelPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightRestrictionLevel();
            boolean rhsFieldIsSet = that.isSetFlightRestrictionLevel();
            FlightRestrictionLevelType lhsField;
            lhsField = this.getFlightRestrictionLevel();
            FlightRestrictionLevelType rhsField;
            rhsField = that.getFlightRestrictionLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightRestrictionLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightRestrictionLevel", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightRestrictionLevel();
            FlightRestrictionLevelType theField;
            theField = this.getFlightRestrictionLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightRestrictionLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFlightRestrictionLevel();
            FlightRestrictionLevelType theField;
            theField = this.getFlightRestrictionLevel();
            strategy.appendField(locator, this, "flightRestrictionLevel", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
