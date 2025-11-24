
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
 * <p>Java class for FuelPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FuelPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Fuel"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelPropertyType", propOrder = {
    "fuel"
})
@Entity(name = "FuelPropertyType")
@Table(name = "fuel_pt", schema = "service")
public class FuelPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Fuel", required = true)
    protected FuelType fuel;

    /**
     * Gets the value of the fuel property.
     * 
     * @return
     *     possible object is
     *     {@link FuelType }
     *     
     */
    @OneToOne(targetEntity = FuelType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "fuel_id", referencedColumnName = "hjid")
    public FuelType getFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelType }
     *     
     */
    public void setFuel(FuelType value) {
        this.fuel = value;
    }

    @Transient
    public boolean isSetFuel() {
        return (this.fuel!= null);
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
        final FuelPropertyType that = ((FuelPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetFuel();
            boolean rhsFieldIsSet = that.isSetFuel();
            FuelType lhsField;
            lhsField = this.getFuel();
            FuelType rhsField;
            rhsField = that.getFuel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fuel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fuel", rhsField);
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
            boolean theFieldIsSet = this.isSetFuel();
            FuelType theField;
            theField = this.getFuel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fuel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetFuel();
            FuelType theField;
            theField = this.getFuel();
            strategy.appendField(locator, this, "fuel", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
