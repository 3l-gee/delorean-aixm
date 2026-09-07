
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
 * <p>Java class for AirspaceBorderCrossingPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceBorderCrossingPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}AirspaceBorderCrossing"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceBorderCrossingPropertyType", propOrder = {
    "airspaceBorderCrossing"
})
@Entity(name = "AirspaceBorderCrossingPropertyType")
@Table(name = "airspacebordercrossing_p", schema = "route")
public class AirspaceBorderCrossingPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirspaceBorderCrossing", required = true)
    protected AirspaceBorderCrossingType airspaceBorderCrossing;

    /**
     * Gets the value of the airspaceBorderCrossing property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceBorderCrossingType }
     *     
     */
    @OneToOne(targetEntity = AirspaceBorderCrossingType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airspacebordercrossing_hjid", referencedColumnName = "hjid")
    public AirspaceBorderCrossingType getAirspaceBorderCrossing() {
        return airspaceBorderCrossing;
    }

    /**
     * Sets the value of the airspaceBorderCrossing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceBorderCrossingType }
     *     
     */
    public void setAirspaceBorderCrossing(AirspaceBorderCrossingType value) {
        this.airspaceBorderCrossing = value;
    }

    @Transient
    public boolean isSetAirspaceBorderCrossing() {
        return (this.airspaceBorderCrossing!= null);
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
        final AirspaceBorderCrossingPropertyType that = ((AirspaceBorderCrossingPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirspaceBorderCrossing();
            boolean rhsFieldIsSet = that.isSetAirspaceBorderCrossing();
            AirspaceBorderCrossingType lhsField;
            lhsField = this.getAirspaceBorderCrossing();
            AirspaceBorderCrossingType rhsField;
            rhsField = that.getAirspaceBorderCrossing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airspaceBorderCrossing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airspaceBorderCrossing", rhsField);
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
            boolean theFieldIsSet = this.isSetAirspaceBorderCrossing();
            AirspaceBorderCrossingType theField;
            theField = this.getAirspaceBorderCrossing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airspaceBorderCrossing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirspaceBorderCrossing();
            AirspaceBorderCrossingType theField;
            theField = this.getAirspaceBorderCrossing();
            strategy.appendField(locator, this, "airspaceBorderCrossing", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
