
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
 * <p>Java class for AirspaceGeometryComponentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceGeometryComponentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceGeometryComponent"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceGeometryComponentPropertyType", propOrder = {
    "airspaceGeometryComponent"
})
@Entity(name = "AirspaceGeometryComponentPropertyType")
@Table(name = "airspacegeometrycomponent_pt", schema = "airspace")
public class AirspaceGeometryComponentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AirspaceGeometryComponent", required = true)
    protected AirspaceGeometryComponentType airspaceGeometryComponent;

    /**
     * Gets the value of the airspaceGeometryComponent property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceGeometryComponentType }
     *     
     */
    @OneToOne(targetEntity = AirspaceGeometryComponentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airspacegeometrycomponent_id", referencedColumnName = "hjid")
    public AirspaceGeometryComponentType getAirspaceGeometryComponent() {
        return airspaceGeometryComponent;
    }

    /**
     * Sets the value of the airspaceGeometryComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceGeometryComponentType }
     *     
     */
    public void setAirspaceGeometryComponent(AirspaceGeometryComponentType value) {
        this.airspaceGeometryComponent = value;
    }

    @Transient
    public boolean isSetAirspaceGeometryComponent() {
        return (this.airspaceGeometryComponent!= null);
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
        final AirspaceGeometryComponentPropertyType that = ((AirspaceGeometryComponentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirspaceGeometryComponent();
            boolean rhsFieldIsSet = that.isSetAirspaceGeometryComponent();
            AirspaceGeometryComponentType lhsField;
            lhsField = this.getAirspaceGeometryComponent();
            AirspaceGeometryComponentType rhsField;
            rhsField = that.getAirspaceGeometryComponent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airspaceGeometryComponent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airspaceGeometryComponent", rhsField);
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
            boolean theFieldIsSet = this.isSetAirspaceGeometryComponent();
            AirspaceGeometryComponentType theField;
            theField = this.getAirspaceGeometryComponent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airspaceGeometryComponent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAirspaceGeometryComponent();
            AirspaceGeometryComponentType theField;
            theField = this.getAirspaceGeometryComponent();
            strategy.appendField(locator, this, "airspaceGeometryComponent", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
