
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
 * <p>Java class for EquipmentUnavailableAdjustmentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EquipmentUnavailableAdjustmentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}EquipmentUnavailableAdjustment"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentUnavailableAdjustmentPropertyType", propOrder = {
    "equipmentUnavailableAdjustment"
})
@Entity(name = "EquipmentUnavailableAdjustmentPropertyType")
@Table(name = "equipmentunavailableadjustment_pt", schema = "procedure")
public class EquipmentUnavailableAdjustmentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "EquipmentUnavailableAdjustment", required = true)
    protected EquipmentUnavailableAdjustmentType equipmentUnavailableAdjustment;

    /**
     * Gets the value of the equipmentUnavailableAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentUnavailableAdjustmentType }
     *     
     */
    @OneToOne(targetEntity = EquipmentUnavailableAdjustmentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "equipmentunavailableadjustment_id", referencedColumnName = "hjid")
    public EquipmentUnavailableAdjustmentType getEquipmentUnavailableAdjustment() {
        return equipmentUnavailableAdjustment;
    }

    /**
     * Sets the value of the equipmentUnavailableAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentUnavailableAdjustmentType }
     *     
     */
    public void setEquipmentUnavailableAdjustment(EquipmentUnavailableAdjustmentType value) {
        this.equipmentUnavailableAdjustment = value;
    }

    @Transient
    public boolean isSetEquipmentUnavailableAdjustment() {
        return (this.equipmentUnavailableAdjustment!= null);
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
        final EquipmentUnavailableAdjustmentPropertyType that = ((EquipmentUnavailableAdjustmentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetEquipmentUnavailableAdjustment();
            boolean rhsFieldIsSet = that.isSetEquipmentUnavailableAdjustment();
            EquipmentUnavailableAdjustmentType lhsField;
            lhsField = this.getEquipmentUnavailableAdjustment();
            EquipmentUnavailableAdjustmentType rhsField;
            rhsField = that.getEquipmentUnavailableAdjustment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "equipmentUnavailableAdjustment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "equipmentUnavailableAdjustment", rhsField);
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
            boolean theFieldIsSet = this.isSetEquipmentUnavailableAdjustment();
            EquipmentUnavailableAdjustmentType theField;
            theField = this.getEquipmentUnavailableAdjustment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "equipmentUnavailableAdjustment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetEquipmentUnavailableAdjustment();
            EquipmentUnavailableAdjustmentType theField;
            theField = this.getEquipmentUnavailableAdjustment();
            strategy.appendField(locator, this, "equipmentUnavailableAdjustment", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
