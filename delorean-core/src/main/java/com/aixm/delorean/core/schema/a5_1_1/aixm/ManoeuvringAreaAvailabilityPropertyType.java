
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
 * <p>Java class for ManoeuvringAreaAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManoeuvringAreaAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ManoeuvringAreaAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManoeuvringAreaAvailabilityPropertyType", propOrder = {
    "manoeuvringAreaAvailability"
})
@Entity(name = "ManoeuvringAreaAvailabilityPropertyType")
@Table(name = "manoeuvringareaavailability_pt", schema = "airport_heliport")
public class ManoeuvringAreaAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ManoeuvringAreaAvailability", required = true)
    protected ManoeuvringAreaAvailabilityType manoeuvringAreaAvailability;

    /**
     * Gets the value of the manoeuvringAreaAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link ManoeuvringAreaAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = ManoeuvringAreaAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "manoeuvringareaavailability_id", referencedColumnName = "hjid")
    public ManoeuvringAreaAvailabilityType getManoeuvringAreaAvailability() {
        return manoeuvringAreaAvailability;
    }

    /**
     * Sets the value of the manoeuvringAreaAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManoeuvringAreaAvailabilityType }
     *     
     */
    public void setManoeuvringAreaAvailability(ManoeuvringAreaAvailabilityType value) {
        this.manoeuvringAreaAvailability = value;
    }

    @Transient
    public boolean isSetManoeuvringAreaAvailability() {
        return (this.manoeuvringAreaAvailability!= null);
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
        final ManoeuvringAreaAvailabilityPropertyType that = ((ManoeuvringAreaAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetManoeuvringAreaAvailability();
            boolean rhsFieldIsSet = that.isSetManoeuvringAreaAvailability();
            ManoeuvringAreaAvailabilityType lhsField;
            lhsField = this.getManoeuvringAreaAvailability();
            ManoeuvringAreaAvailabilityType rhsField;
            rhsField = that.getManoeuvringAreaAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "manoeuvringAreaAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "manoeuvringAreaAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetManoeuvringAreaAvailability();
            ManoeuvringAreaAvailabilityType theField;
            theField = this.getManoeuvringAreaAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "manoeuvringAreaAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetManoeuvringAreaAvailability();
            ManoeuvringAreaAvailabilityType theField;
            theField = this.getManoeuvringAreaAvailability();
            strategy.appendField(locator, this, "manoeuvringAreaAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
