
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
 * <p>Java class for HoldingUsePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HoldingUsePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}HoldingUse"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingUsePropertyType", propOrder = {
    "holdingUse"
})
@Entity(name = "HoldingUsePropertyType")
@Table(name = "holdinguse_pt", schema = "procedure")
public class HoldingUsePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "HoldingUse", required = true)
    protected HoldingUseType holdingUse;

    /**
     * Gets the value of the holdingUse property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingUseType }
     *     
     */
    @OneToOne(targetEntity = HoldingUseType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdinguse_id", referencedColumnName = "hjid")
    public HoldingUseType getHoldingUse() {
        return holdingUse;
    }

    /**
     * Sets the value of the holdingUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingUseType }
     *     
     */
    public void setHoldingUse(HoldingUseType value) {
        this.holdingUse = value;
    }

    @Transient
    public boolean isSetHoldingUse() {
        return (this.holdingUse!= null);
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
        final HoldingUsePropertyType that = ((HoldingUsePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetHoldingUse();
            boolean rhsFieldIsSet = that.isSetHoldingUse();
            HoldingUseType lhsField;
            lhsField = this.getHoldingUse();
            HoldingUseType rhsField;
            rhsField = that.getHoldingUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holdingUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holdingUse", rhsField);
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
            boolean theFieldIsSet = this.isSetHoldingUse();
            HoldingUseType theField;
            theField = this.getHoldingUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holdingUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetHoldingUse();
            HoldingUseType theField;
            theField = this.getHoldingUse();
            strategy.appendField(locator, this, "holdingUse", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
