
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for SatelliteServiceAreaPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SatelliteServiceAreaPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}SatelliteServiceArea"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SatelliteServiceAreaPropertyType", propOrder = {
    "satelliteServiceArea"
})
@Entity(name = "SatelliteServiceAreaPropertyType")
@Table(name = "satelliteservicearea_p", schema = "navaids_point")
public class SatelliteServiceAreaPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SatelliteServiceArea", required = true)
    protected SatelliteServiceAreaType satelliteServiceArea;

    /**
     * Gets the value of the satelliteServiceArea property.
     * 
     * @return
     *     possible object is
     *     {@link SatelliteServiceAreaType }
     *     
     */
    @OneToOne(targetEntity = SatelliteServiceAreaType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "satelliteservicearea_hjid", referencedColumnName = "hjid")
    public SatelliteServiceAreaType getSatelliteServiceArea() {
        return satelliteServiceArea;
    }

    /**
     * Sets the value of the satelliteServiceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SatelliteServiceAreaType }
     *     
     */
    public void setSatelliteServiceArea(SatelliteServiceAreaType value) {
        this.satelliteServiceArea = value;
    }

    @Transient
    public boolean isSetSatelliteServiceArea() {
        return (this.satelliteServiceArea!= null);
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
        final SatelliteServiceAreaPropertyType that = ((SatelliteServiceAreaPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSatelliteServiceArea();
            boolean rhsFieldIsSet = that.isSetSatelliteServiceArea();
            SatelliteServiceAreaType lhsField;
            lhsField = this.getSatelliteServiceArea();
            SatelliteServiceAreaType rhsField;
            rhsField = that.getSatelliteServiceArea();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "satelliteServiceArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "satelliteServiceArea", rhsField);
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
            boolean theFieldIsSet = this.isSetSatelliteServiceArea();
            SatelliteServiceAreaType theField;
            theField = this.getSatelliteServiceArea();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "satelliteServiceArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSatelliteServiceArea();
            SatelliteServiceAreaType theField;
            theField = this.getSatelliteServiceArea();
            strategy.appendField(locator, this, "satelliteServiceArea", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
