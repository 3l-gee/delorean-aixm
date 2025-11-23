
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
 * <p>Java class for UnitAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnitAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}UnitAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitAvailabilityPropertyType", propOrder = {
    "unitAvailability"
})
@Entity(name = "UnitAvailabilityPropertyType")
@Table(name = "unitavailability_pt", schema = "organisation")
public class UnitAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "UnitAvailability", required = true)
    protected UnitAvailabilityType unitAvailability;

    /**
     * Gets the value of the unitAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link UnitAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = UnitAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "unitavailability_id", referencedColumnName = "hjid")
    public UnitAvailabilityType getUnitAvailability() {
        return unitAvailability;
    }

    /**
     * Sets the value of the unitAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitAvailabilityType }
     *     
     */
    public void setUnitAvailability(UnitAvailabilityType value) {
        this.unitAvailability = value;
    }

    @Transient
    public boolean isSetUnitAvailability() {
        return (this.unitAvailability!= null);
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
        final UnitAvailabilityPropertyType that = ((UnitAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetUnitAvailability();
            boolean rhsFieldIsSet = that.isSetUnitAvailability();
            UnitAvailabilityType lhsField;
            lhsField = this.getUnitAvailability();
            UnitAvailabilityType rhsField;
            rhsField = that.getUnitAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unitAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unitAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetUnitAvailability();
            UnitAvailabilityType theField;
            theField = this.getUnitAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unitAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetUnitAvailability();
            UnitAvailabilityType theField;
            theField = this.getUnitAvailability();
            strategy.appendField(locator, this, "unitAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
