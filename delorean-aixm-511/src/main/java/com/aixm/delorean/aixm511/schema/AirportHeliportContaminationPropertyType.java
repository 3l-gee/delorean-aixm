
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
 * <p>Java class for AirportHeliportContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirportHeliportContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AirportHeliportContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportContaminationPropertyType", propOrder = {
    "airportHeliportContamination"
})
@Entity(name = "AirportHeliportContaminationPropertyType")
@Table(name = "airportheliportcontamination_pt", schema = "airport_heliport")
public class AirportHeliportContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirportHeliportContamination", required = true)
    protected AirportHeliportContaminationType airportHeliportContamination;

    /**
     * Gets the value of the airportHeliportContamination property.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportContaminationType }
     *     
     */
    @OneToOne(targetEntity = AirportHeliportContaminationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airportheliportcontamination_id", referencedColumnName = "hjid")
    public AirportHeliportContaminationType getAirportHeliportContamination() {
        return airportHeliportContamination;
    }

    /**
     * Sets the value of the airportHeliportContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportContaminationType }
     *     
     */
    public void setAirportHeliportContamination(AirportHeliportContaminationType value) {
        this.airportHeliportContamination = value;
    }

    @Transient
    public boolean isSetAirportHeliportContamination() {
        return (this.airportHeliportContamination!= null);
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
        final AirportHeliportContaminationPropertyType that = ((AirportHeliportContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirportHeliportContamination();
            boolean rhsFieldIsSet = that.isSetAirportHeliportContamination();
            AirportHeliportContaminationType lhsField;
            lhsField = this.getAirportHeliportContamination();
            AirportHeliportContaminationType rhsField;
            rhsField = that.getAirportHeliportContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportHeliportContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportHeliportContamination", rhsField);
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
            boolean theFieldIsSet = this.isSetAirportHeliportContamination();
            AirportHeliportContaminationType theField;
            theField = this.getAirportHeliportContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliportContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirportHeliportContamination();
            AirportHeliportContaminationType theField;
            theField = this.getAirportHeliportContamination();
            strategy.appendField(locator, this, "airportHeliportContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
