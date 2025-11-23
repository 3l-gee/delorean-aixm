
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
 * <p>Java class for AngleUsePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AngleUsePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AngleUse"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngleUsePropertyType", propOrder = {
    "angleUse"
})
@Entity(name = "AngleUsePropertyType")
@Table(name = "angleuse_pt", schema = "navaids_point")
public class AngleUsePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AngleUse", required = true)
    protected AngleUseType angleUse;

    /**
     * Gets the value of the angleUse property.
     * 
     * @return
     *     possible object is
     *     {@link AngleUseType }
     *     
     */
    @OneToOne(targetEntity = AngleUseType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "angleuse_id", referencedColumnName = "hjid")
    public AngleUseType getAngleUse() {
        return angleUse;
    }

    /**
     * Sets the value of the angleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleUseType }
     *     
     */
    public void setAngleUse(AngleUseType value) {
        this.angleUse = value;
    }

    @Transient
    public boolean isSetAngleUse() {
        return (this.angleUse!= null);
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
        final AngleUsePropertyType that = ((AngleUsePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAngleUse();
            boolean rhsFieldIsSet = that.isSetAngleUse();
            AngleUseType lhsField;
            lhsField = this.getAngleUse();
            AngleUseType rhsField;
            rhsField = that.getAngleUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleUse", rhsField);
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
            boolean theFieldIsSet = this.isSetAngleUse();
            AngleUseType theField;
            theField = this.getAngleUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAngleUse();
            AngleUseType theField;
            theField = this.getAngleUse();
            strategy.appendField(locator, this, "angleUse", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
