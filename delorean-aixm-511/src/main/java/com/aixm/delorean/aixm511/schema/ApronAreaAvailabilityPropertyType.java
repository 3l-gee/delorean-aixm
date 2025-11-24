
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
 * <p>Java class for ApronAreaAvailabilityPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApronAreaAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ApronAreaAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApronAreaAvailabilityPropertyType", propOrder = {
    "apronAreaAvailability"
})
@Entity(name = "ApronAreaAvailabilityPropertyType")
@Table(name = "apronareaavailability_pt", schema = "airport_heliport")
public class ApronAreaAvailabilityPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ApronAreaAvailability", required = true)
    protected ApronAreaAvailabilityType apronAreaAvailability;

    /**
     * Gets the value of the apronAreaAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link ApronAreaAvailabilityType }
     *     
     */
    @OneToOne(targetEntity = ApronAreaAvailabilityType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "apronareaavailability_id", referencedColumnName = "hjid")
    public ApronAreaAvailabilityType getApronAreaAvailability() {
        return apronAreaAvailability;
    }

    /**
     * Sets the value of the apronAreaAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApronAreaAvailabilityType }
     *     
     */
    public void setApronAreaAvailability(ApronAreaAvailabilityType value) {
        this.apronAreaAvailability = value;
    }

    @Transient
    public boolean isSetApronAreaAvailability() {
        return (this.apronAreaAvailability!= null);
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
        final ApronAreaAvailabilityPropertyType that = ((ApronAreaAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetApronAreaAvailability();
            boolean rhsFieldIsSet = that.isSetApronAreaAvailability();
            ApronAreaAvailabilityType lhsField;
            lhsField = this.getApronAreaAvailability();
            ApronAreaAvailabilityType rhsField;
            rhsField = that.getApronAreaAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "apronAreaAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "apronAreaAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetApronAreaAvailability();
            ApronAreaAvailabilityType theField;
            theField = this.getApronAreaAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "apronAreaAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetApronAreaAvailability();
            ApronAreaAvailabilityType theField;
            theField = this.getApronAreaAvailability();
            strategy.appendField(locator, this, "apronAreaAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
