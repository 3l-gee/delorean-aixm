
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
 * <p>Java class for HoldingPatternDurationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingPatternDurationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}HoldingPatternDuration"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingPatternDurationPropertyType", propOrder = {
    "holdingPatternDuration"
})
@Entity(name = "HoldingPatternDurationPropertyType")
@Table(name = "holdingpatternduration_pt", schema = "holding")
public class HoldingPatternDurationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "HoldingPatternDuration", required = true)
    protected HoldingPatternDurationType holdingPatternDuration;

    /**
     * Gets the value of the holdingPatternDuration property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingPatternDurationType }
     *     
     */
    @OneToOne(targetEntity = HoldingPatternDurationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdingpatternduration_id", referencedColumnName = "hjid")
    public HoldingPatternDurationType getHoldingPatternDuration() {
        return holdingPatternDuration;
    }

    /**
     * Sets the value of the holdingPatternDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingPatternDurationType }
     *     
     */
    public void setHoldingPatternDuration(HoldingPatternDurationType value) {
        this.holdingPatternDuration = value;
    }

    @Transient
    public boolean isSetHoldingPatternDuration() {
        return (this.holdingPatternDuration!= null);
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
        final HoldingPatternDurationPropertyType that = ((HoldingPatternDurationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetHoldingPatternDuration();
            boolean rhsFieldIsSet = that.isSetHoldingPatternDuration();
            HoldingPatternDurationType lhsField;
            lhsField = this.getHoldingPatternDuration();
            HoldingPatternDurationType rhsField;
            rhsField = that.getHoldingPatternDuration();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holdingPatternDuration", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holdingPatternDuration", rhsField);
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
            boolean theFieldIsSet = this.isSetHoldingPatternDuration();
            HoldingPatternDurationType theField;
            theField = this.getHoldingPatternDuration();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holdingPatternDuration", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetHoldingPatternDuration();
            HoldingPatternDurationType theField;
            theField = this.getHoldingPatternDuration();
            strategy.appendField(locator, this, "holdingPatternDuration", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
