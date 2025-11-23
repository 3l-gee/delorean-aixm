
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
 * <p>Java class for UnitDependencyPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnitDependencyPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}UnitDependency"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDependencyPropertyType", propOrder = {
    "unitDependency"
})
@Entity(name = "UnitDependencyPropertyType")
@Table(name = "unitdependency_pt", schema = "organisation")
public class UnitDependencyPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "UnitDependency", required = true)
    protected UnitDependencyType unitDependency;

    /**
     * Gets the value of the unitDependency property.
     * 
     * @return
     *     possible object is
     *     {@link UnitDependencyType }
     *     
     */
    @OneToOne(targetEntity = UnitDependencyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "unitdependency_id", referencedColumnName = "hjid")
    public UnitDependencyType getUnitDependency() {
        return unitDependency;
    }

    /**
     * Sets the value of the unitDependency property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitDependencyType }
     *     
     */
    public void setUnitDependency(UnitDependencyType value) {
        this.unitDependency = value;
    }

    @Transient
    public boolean isSetUnitDependency() {
        return (this.unitDependency!= null);
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
        final UnitDependencyPropertyType that = ((UnitDependencyPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetUnitDependency();
            boolean rhsFieldIsSet = that.isSetUnitDependency();
            UnitDependencyType lhsField;
            lhsField = this.getUnitDependency();
            UnitDependencyType rhsField;
            rhsField = that.getUnitDependency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unitDependency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unitDependency", rhsField);
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
            boolean theFieldIsSet = this.isSetUnitDependency();
            UnitDependencyType theField;
            theField = this.getUnitDependency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unitDependency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetUnitDependency();
            UnitDependencyType theField;
            theField = this.getUnitDependency();
            strategy.appendField(locator, this, "unitDependency", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
