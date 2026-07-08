
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
 * Java class for AircraftNavigationEquipmentPropertyType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AircraftNavigationEquipmentPropertyType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref=
"{http://www.aixm.aero/schema/5.2}AircraftNavigationEquipment"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftNavigationEquipmentPropertyType", propOrder = {"aircraftNavigationEquipment"})
@Entity(name = "AircraftNavigationEquipmentPropertyType")
@Table(name = "aircraftnavigationequipmentpropertytype", schema = "shared")
public class AircraftNavigationEquipmentPropertyType extends AbstractAIXMPropertyType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AircraftNavigationEquipment", required = true)
    protected AircraftNavigationEquipmentType aircraftNavigationEquipment;

    /**
     * Gets the value of the aircraftNavigationEquipment property.
     *
     * @return possible object is {@link AircraftNavigationEquipmentType }
     *
     */
    @OneToOne(targetEntity = AircraftNavigationEquipmentType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraftnavigationequipment_hjid", referencedColumnName = "hjid")
    public AircraftNavigationEquipmentType getAircraftNavigationEquipment() {
        return aircraftNavigationEquipment;
    }

    /**
     * Sets the value of the aircraftNavigationEquipment property.
     *
     * @param value
     *            allowed object is {@link AircraftNavigationEquipmentType }
     *
     */
    public void setAircraftNavigationEquipment(AircraftNavigationEquipmentType value) {
        this.aircraftNavigationEquipment = value;
    }

    @Transient
    public boolean isSetAircraftNavigationEquipment() {
        return (this.aircraftNavigationEquipment != null);
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
        final AircraftNavigationEquipmentPropertyType that = ((AircraftNavigationEquipmentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAircraftNavigationEquipment();
            boolean rhsFieldIsSet = that.isSetAircraftNavigationEquipment();
            AircraftNavigationEquipmentType lhsField;
            lhsField = this.getAircraftNavigationEquipment();
            AircraftNavigationEquipmentType rhsField;
            rhsField = that.getAircraftNavigationEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftNavigationEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftNavigationEquipment", rhsField);
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
            boolean theFieldIsSet = this.isSetAircraftNavigationEquipment();
            AircraftNavigationEquipmentType theField;
            theField = this.getAircraftNavigationEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftNavigationEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAircraftNavigationEquipment();
            AircraftNavigationEquipmentType theField;
            theField = this.getAircraftNavigationEquipment();
            strategy.appendField(locator, this, "aircraftNavigationEquipment", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
