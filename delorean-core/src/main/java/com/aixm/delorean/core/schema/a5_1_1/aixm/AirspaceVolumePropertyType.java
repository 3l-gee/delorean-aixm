
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
 * <p>Java class for AirspaceVolumePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceVolumePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceVolume"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceVolumePropertyType", propOrder = {
    "airspaceVolume"
})
@Entity(name = "AirspaceVolumePropertyType")
@Table(name = "airspacevolume_pt", schema = "airspace")
public class AirspaceVolumePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirspaceVolume", required = true)
    protected AirspaceVolumeType airspaceVolume;

    /**
     * Gets the value of the airspaceVolume property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumeType }
     *     
     */
    @OneToOne(targetEntity = AirspaceVolumeType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airspacevolume_id", referencedColumnName = "hjid")
    public AirspaceVolumeType getAirspaceVolume() {
        return airspaceVolume;
    }

    /**
     * Sets the value of the airspaceVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public void setAirspaceVolume(AirspaceVolumeType value) {
        this.airspaceVolume = value;
    }

    @Transient
    public boolean isSetAirspaceVolume() {
        return (this.airspaceVolume!= null);
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
        final AirspaceVolumePropertyType that = ((AirspaceVolumePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirspaceVolume();
            boolean rhsFieldIsSet = that.isSetAirspaceVolume();
            AirspaceVolumeType lhsField;
            lhsField = this.getAirspaceVolume();
            AirspaceVolumeType rhsField;
            rhsField = that.getAirspaceVolume();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airspaceVolume", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airspaceVolume", rhsField);
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
            boolean theFieldIsSet = this.isSetAirspaceVolume();
            AirspaceVolumeType theField;
            theField = this.getAirspaceVolume();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airspaceVolume", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirspaceVolume();
            AirspaceVolumeType theField;
            theField = this.getAirspaceVolume();
            strategy.appendField(locator, this, "airspaceVolume", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
