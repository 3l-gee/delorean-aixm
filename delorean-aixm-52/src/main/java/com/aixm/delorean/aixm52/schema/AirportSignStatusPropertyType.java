
package com.aixm.delorean.aixm52.schema;

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
import java.io.Serializable;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for AirportSignStatusPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AirportSignStatusPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}AirportSignStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportSignStatusPropertyType", propOrder = {"airportSignStatus"})
@Entity(name = "AirportSignStatusPropertyType")
@Table(name = "airportsignstatuspropertytype", schema = "airport_heliport")
public class AirportSignStatusPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirportSignStatus", required = true)
    protected AirportSignStatusType airportSignStatus;

    /**
     * Gets the value of the airportSignStatus property.
     *
     * @return possible object is {@link AirportSignStatusType }
     *
     */
    @OneToOne(targetEntity = AirportSignStatusType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "airportsignstatus_hjid", referencedColumnName = "hjid")
    public AirportSignStatusType getAirportSignStatus() {
        return airportSignStatus;
    }

    /**
     * Sets the value of the airportSignStatus property.
     *
     * @param value
     *            allowed object is {@link AirportSignStatusType }
     *
     */
    public void setAirportSignStatus(AirportSignStatusType value) {
        this.airportSignStatus = value;
    }

    @Transient
    public boolean isSetAirportSignStatus() {
        return (this.airportSignStatus != null);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AirportSignStatusPropertyType that = ((AirportSignStatusPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirportSignStatus();
            boolean rhsFieldIsSet = that.isSetAirportSignStatus();
            AirportSignStatusType lhsField;
            lhsField = this.getAirportSignStatus();
            AirportSignStatusType rhsField;
            rhsField = that.getAirportSignStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportSignStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportSignStatus", rhsField);
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
            boolean theFieldIsSet = this.isSetAirportSignStatus();
            AirportSignStatusType theField;
            theField = this.getAirportSignStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportSignStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirportSignStatus();
            AirportSignStatusType theField;
            theField = this.getAirportSignStatus();
            strategy.appendField(locator, this, "airportSignStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
