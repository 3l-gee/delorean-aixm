
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
 * <p>Java class for HoldingPatternDistancePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingPatternDistancePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}HoldingPatternDistance"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingPatternDistancePropertyType", propOrder = {
    "holdingPatternDistance"
})
@Entity(name = "HoldingPatternDistancePropertyType")
@Table(name = "holdingpatterndistance_pt", schema = "holding")
public class HoldingPatternDistancePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "HoldingPatternDistance", required = true)
    protected HoldingPatternDistanceType holdingPatternDistance;

    /**
     * Gets the value of the holdingPatternDistance property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingPatternDistanceType }
     *     
     */
    @OneToOne(targetEntity = HoldingPatternDistanceType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdingpatterndistance_id", referencedColumnName = "hjid")
    public HoldingPatternDistanceType getHoldingPatternDistance() {
        return holdingPatternDistance;
    }

    /**
     * Sets the value of the holdingPatternDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingPatternDistanceType }
     *     
     */
    public void setHoldingPatternDistance(HoldingPatternDistanceType value) {
        this.holdingPatternDistance = value;
    }

    @Transient
    public boolean isSetHoldingPatternDistance() {
        return (this.holdingPatternDistance!= null);
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
        final HoldingPatternDistancePropertyType that = ((HoldingPatternDistancePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetHoldingPatternDistance();
            boolean rhsFieldIsSet = that.isSetHoldingPatternDistance();
            HoldingPatternDistanceType lhsField;
            lhsField = this.getHoldingPatternDistance();
            HoldingPatternDistanceType rhsField;
            rhsField = that.getHoldingPatternDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holdingPatternDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holdingPatternDistance", rhsField);
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
            boolean theFieldIsSet = this.isSetHoldingPatternDistance();
            HoldingPatternDistanceType theField;
            theField = this.getHoldingPatternDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holdingPatternDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetHoldingPatternDistance();
            HoldingPatternDistanceType theField;
            theField = this.getHoldingPatternDistance();
            strategy.appendField(locator, this, "holdingPatternDistance", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
