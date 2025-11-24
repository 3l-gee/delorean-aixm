
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
 * <p>Java class for AltitudeAdjustmentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AltitudeAdjustmentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AltitudeAdjustment"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeAdjustmentPropertyType", propOrder = {
    "altitudeAdjustment"
})
@Entity(name = "AltitudeAdjustmentPropertyType")
@Table(name = "altitudeadjustment_pt", schema = "shared")
public class AltitudeAdjustmentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AltitudeAdjustment", required = true)
    protected AltitudeAdjustmentType altitudeAdjustment;

    /**
     * Gets the value of the altitudeAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeAdjustmentType }
     *     
     */
    @OneToOne(targetEntity = AltitudeAdjustmentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "altitudeadjustment_id", referencedColumnName = "hjid")
    public AltitudeAdjustmentType getAltitudeAdjustment() {
        return altitudeAdjustment;
    }

    /**
     * Sets the value of the altitudeAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeAdjustmentType }
     *     
     */
    public void setAltitudeAdjustment(AltitudeAdjustmentType value) {
        this.altitudeAdjustment = value;
    }

    @Transient
    public boolean isSetAltitudeAdjustment() {
        return (this.altitudeAdjustment!= null);
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
        final AltitudeAdjustmentPropertyType that = ((AltitudeAdjustmentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAltitudeAdjustment();
            boolean rhsFieldIsSet = that.isSetAltitudeAdjustment();
            AltitudeAdjustmentType lhsField;
            lhsField = this.getAltitudeAdjustment();
            AltitudeAdjustmentType rhsField;
            rhsField = that.getAltitudeAdjustment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeAdjustment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeAdjustment", rhsField);
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
            boolean theFieldIsSet = this.isSetAltitudeAdjustment();
            AltitudeAdjustmentType theField;
            theField = this.getAltitudeAdjustment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeAdjustment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAltitudeAdjustment();
            AltitudeAdjustmentType theField;
            theField = this.getAltitudeAdjustment();
            strategy.appendField(locator, this, "altitudeAdjustment", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
