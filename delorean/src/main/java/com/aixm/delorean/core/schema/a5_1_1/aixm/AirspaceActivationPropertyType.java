
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
 * <p>Java class for AirspaceActivationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceActivationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceActivation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceActivationPropertyType", propOrder = {
    "airspaceActivation"
})
@Entity(name = "AirspaceActivationPropertyType")
@Table(name = "airspaceactivation_pt", schema = "airspace")
public class AirspaceActivationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirspaceActivation", required = true)
    protected AirspaceActivationType airspaceActivation;

    /**
     * Gets the value of the airspaceActivation property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceActivationType }
     *     
     */
    @OneToOne(targetEntity = AirspaceActivationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airspaceactivation_id", referencedColumnName = "hjid")
    public AirspaceActivationType getAirspaceActivation() {
        return airspaceActivation;
    }

    /**
     * Sets the value of the airspaceActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceActivationType }
     *     
     */
    public void setAirspaceActivation(AirspaceActivationType value) {
        this.airspaceActivation = value;
    }

    @Transient
    public boolean isSetAirspaceActivation() {
        return (this.airspaceActivation!= null);
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
        final AirspaceActivationPropertyType that = ((AirspaceActivationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirspaceActivation();
            boolean rhsFieldIsSet = that.isSetAirspaceActivation();
            AirspaceActivationType lhsField;
            lhsField = this.getAirspaceActivation();
            AirspaceActivationType rhsField;
            rhsField = that.getAirspaceActivation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airspaceActivation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airspaceActivation", rhsField);
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
            boolean theFieldIsSet = this.isSetAirspaceActivation();
            AirspaceActivationType theField;
            theField = this.getAirspaceActivation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airspaceActivation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirspaceActivation();
            AirspaceActivationType theField;
            theField = this.getAirspaceActivation();
            strategy.appendField(locator, this, "airspaceActivation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
