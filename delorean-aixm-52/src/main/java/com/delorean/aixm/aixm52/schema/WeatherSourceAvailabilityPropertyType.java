
package com.delorean.aixm.aixm52.schema;

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
 * Java class for WeatherSourceAvailabilityPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="WeatherSourceAvailabilityPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}WeatherSourceAvailability"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherSourceAvailabilityPropertyType", propOrder = {"weatherSourceAvailability"})
@Entity(name = "WeatherSourceAvailabilityPropertyType")
@Table(name = "weathersourceavailabilitypropertytype", schema = "airport_heliport")
public class WeatherSourceAvailabilityPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "WeatherSourceAvailability", required = true)
    protected WeatherSourceAvailabilityType weatherSourceAvailability;

    /**
     * Gets the value of the weatherSourceAvailability property.
     *
     * @return possible object is {@link WeatherSourceAvailabilityType }
     *
     */
    @OneToOne(targetEntity = WeatherSourceAvailabilityType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "weathersourceavailability_hjid", referencedColumnName = "hjid")
    public WeatherSourceAvailabilityType getWeatherSourceAvailability() {
        return weatherSourceAvailability;
    }

    /**
     * Sets the value of the weatherSourceAvailability property.
     *
     * @param value
     *            allowed object is {@link WeatherSourceAvailabilityType }
     *
     */
    public void setWeatherSourceAvailability(WeatherSourceAvailabilityType value) {
        this.weatherSourceAvailability = value;
    }

    @Transient
    public boolean isSetWeatherSourceAvailability() {
        return (this.weatherSourceAvailability != null);
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
        final WeatherSourceAvailabilityPropertyType that = ((WeatherSourceAvailabilityPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetWeatherSourceAvailability();
            boolean rhsFieldIsSet = that.isSetWeatherSourceAvailability();
            WeatherSourceAvailabilityType lhsField;
            lhsField = this.getWeatherSourceAvailability();
            WeatherSourceAvailabilityType rhsField;
            rhsField = that.getWeatherSourceAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "weatherSourceAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "weatherSourceAvailability", rhsField);
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
            boolean theFieldIsSet = this.isSetWeatherSourceAvailability();
            WeatherSourceAvailabilityType theField;
            theField = this.getWeatherSourceAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "weatherSourceAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetWeatherSourceAvailability();
            WeatherSourceAvailabilityType theField;
            theField = this.getWeatherSourceAvailability();
            strategy.appendField(locator, this, "weatherSourceAvailability", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
