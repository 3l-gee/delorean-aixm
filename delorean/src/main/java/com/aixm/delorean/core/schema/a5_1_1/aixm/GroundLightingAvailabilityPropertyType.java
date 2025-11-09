
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
 * <p>Java class for GroundLightingAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GroundLightingAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}GroundLightingAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundLightingAvailabilityPropertyType", propOrder = {
    "groundLightingAvailability"
})
@Entity(name = "GroundLightingAvailabilityPropertyType")
@Table(name = "groundlightingavailability_pt", schema = "airport_heliport")
public class GroundLightingAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "GroundLightingAvailability", required = true)
    protected GroundLightingAvailabilityType groundLightingAvailability;

    /**
     * Gets the value of the groundLightingAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link GroundLightingAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = GroundLightingAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "groundlightingavailability_id", referencedColumnName = "hjid")
    public GroundLightingAvailabilityType getGroundLightingAvailability() {
        return groundLightingAvailability;
    }

    /**
     * Sets the value of the groundLightingAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundLightingAvailabilityType }
     *     
     */
    public void setGroundLightingAvailability(GroundLightingAvailabilityType value) {
        this.groundLightingAvailability = value;
    }

    @Transient
    public boolean isSetGroundLightingAvailability() {
        return (this.groundLightingAvailability!= null);
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
        final GroundLightingAvailabilityPropertyType that = ((GroundLightingAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetGroundLightingAvailability();
            boolean rhsFieldIsSet = that.isSetGroundLightingAvailability();
            GroundLightingAvailabilityType lhsField;
            lhsField = this.getGroundLightingAvailability();
            GroundLightingAvailabilityType rhsField;
            rhsField = that.getGroundLightingAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "groundLightingAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "groundLightingAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetGroundLightingAvailability();
            GroundLightingAvailabilityType theField;
            theField = this.getGroundLightingAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "groundLightingAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetGroundLightingAvailability();
            GroundLightingAvailabilityType theField;
            theField = this.getGroundLightingAvailability();
            strategy.appendField(locator, this, "groundLightingAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
