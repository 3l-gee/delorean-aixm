
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
 * <p>Java class for AircraftStandContaminationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AircraftStandContaminationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AircraftStandContamination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftStandContaminationPropertyType", propOrder = {
    "aircraftStandContamination"
})
@Entity(name = "AircraftStandContaminationPropertyType")
@Table(name = "aircraftstandcontamination_pt", schema = "airport_heliport")
public class AircraftStandContaminationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AircraftStandContamination", required = true)
    protected AircraftStandContaminationType aircraftStandContamination;

    /**
     * Gets the value of the aircraftStandContamination property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    @OneToOne(targetEntity = AircraftStandContaminationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraftstandcontamination_id", referencedColumnName = "hjid")
    public AircraftStandContaminationType getAircraftStandContamination() {
        return aircraftStandContamination;
    }

    /**
     * Sets the value of the aircraftStandContamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public void setAircraftStandContamination(AircraftStandContaminationType value) {
        this.aircraftStandContamination = value;
    }

    @Transient
    public boolean isSetAircraftStandContamination() {
        return (this.aircraftStandContamination!= null);
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
        final AircraftStandContaminationPropertyType that = ((AircraftStandContaminationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAircraftStandContamination();
            boolean rhsFieldIsSet = that.isSetAircraftStandContamination();
            AircraftStandContaminationType lhsField;
            lhsField = this.getAircraftStandContamination();
            AircraftStandContaminationType rhsField;
            rhsField = that.getAircraftStandContamination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftStandContamination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftStandContamination", rhsField);
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
            boolean theFieldIsSet = this.isSetAircraftStandContamination();
            AircraftStandContaminationType theField;
            theField = this.getAircraftStandContamination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftStandContamination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAircraftStandContamination();
            AircraftStandContaminationType theField;
            theField = this.getAircraftStandContamination();
            strategy.appendField(locator, this, "aircraftStandContamination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
