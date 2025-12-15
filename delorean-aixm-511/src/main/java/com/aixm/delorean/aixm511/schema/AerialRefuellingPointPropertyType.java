
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
 * <p>Java class for AerialRefuellingPointPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingPointPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingPoint"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingPointPropertyType", propOrder = {
    "aerialRefuellingPoint"
})
@Entity(name = "AerialRefuellingPointPropertyType")
@Table(name = "aerialrefuellingpoint_pt", schema = "aerial_refuelling")
public class AerialRefuellingPointPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AerialRefuellingPoint", required = true)
    protected AerialRefuellingPointType aerialRefuellingPoint;

    /**
     * Gets the value of the aerialRefuellingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingPointType }
     *     
     */
    @OneToOne(targetEntity = AerialRefuellingPointType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aerialrefuellingpoint_id", referencedColumnName = "hjid")
    public AerialRefuellingPointType getAerialRefuellingPoint() {
        return aerialRefuellingPoint;
    }

    /**
     * Sets the value of the aerialRefuellingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingPointType }
     *     
     */
    public void setAerialRefuellingPoint(AerialRefuellingPointType value) {
        this.aerialRefuellingPoint = value;
    }

    @Transient
    public boolean isSetAerialRefuellingPoint() {
        return (this.aerialRefuellingPoint!= null);
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
        final AerialRefuellingPointPropertyType that = ((AerialRefuellingPointPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAerialRefuellingPoint();
            boolean rhsFieldIsSet = that.isSetAerialRefuellingPoint();
            AerialRefuellingPointType lhsField;
            lhsField = this.getAerialRefuellingPoint();
            AerialRefuellingPointType rhsField;
            rhsField = that.getAerialRefuellingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aerialRefuellingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aerialRefuellingPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetAerialRefuellingPoint();
            AerialRefuellingPointType theField;
            theField = this.getAerialRefuellingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aerialRefuellingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAerialRefuellingPoint();
            AerialRefuellingPointType theField;
            theField = this.getAerialRefuellingPoint();
            strategy.appendField(locator, this, "aerialRefuellingPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
