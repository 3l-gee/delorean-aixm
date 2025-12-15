
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
 * <p>Java class for AirspaceLayerClassPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceLayerClassPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceLayerClass"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceLayerClassPropertyType", propOrder = {
    "airspaceLayerClass"
})
@Entity(name = "AirspaceLayerClassPropertyType")
@Table(name = "airspacelayerclass_pt", schema = "airspace")
public class AirspaceLayerClassPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirspaceLayerClass", required = true)
    protected AirspaceLayerClassType airspaceLayerClass;

    /**
     * Gets the value of the airspaceLayerClass property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceLayerClassType }
     *     
     */
    @OneToOne(targetEntity = AirspaceLayerClassType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airspacelayerclass_id", referencedColumnName = "hjid")
    public AirspaceLayerClassType getAirspaceLayerClass() {
        return airspaceLayerClass;
    }

    /**
     * Sets the value of the airspaceLayerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceLayerClassType }
     *     
     */
    public void setAirspaceLayerClass(AirspaceLayerClassType value) {
        this.airspaceLayerClass = value;
    }

    @Transient
    public boolean isSetAirspaceLayerClass() {
        return (this.airspaceLayerClass!= null);
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
        final AirspaceLayerClassPropertyType that = ((AirspaceLayerClassPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirspaceLayerClass();
            boolean rhsFieldIsSet = that.isSetAirspaceLayerClass();
            AirspaceLayerClassType lhsField;
            lhsField = this.getAirspaceLayerClass();
            AirspaceLayerClassType rhsField;
            rhsField = that.getAirspaceLayerClass();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airspaceLayerClass", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airspaceLayerClass", rhsField);
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
            boolean theFieldIsSet = this.isSetAirspaceLayerClass();
            AirspaceLayerClassType theField;
            theField = this.getAirspaceLayerClass();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airspaceLayerClass", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirspaceLayerClass();
            AirspaceLayerClassType theField;
            theField = this.getAirspaceLayerClass();
            strategy.appendField(locator, this, "airspaceLayerClass", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
