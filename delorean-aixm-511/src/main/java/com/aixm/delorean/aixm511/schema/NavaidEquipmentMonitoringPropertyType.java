
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
 * <p>Java class for NavaidEquipmentMonitoringPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavaidEquipmentMonitoringPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}NavaidEquipmentMonitoring"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidEquipmentMonitoringPropertyType", propOrder = {
    "navaidEquipmentMonitoring"
})
@Entity(name = "NavaidEquipmentMonitoringPropertyType")
@Table(name = "navaidequipmentmonitoring_pt", schema = "navaids_point")
public class NavaidEquipmentMonitoringPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "NavaidEquipmentMonitoring", required = true)
    protected NavaidEquipmentMonitoringType navaidEquipmentMonitoring;

    /**
     * Gets the value of the navaidEquipmentMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentMonitoringType }
     *     
     */
    @OneToOne(targetEntity = NavaidEquipmentMonitoringType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "navaidequipmentmonitoring_id", referencedColumnName = "hjid")
    public NavaidEquipmentMonitoringType getNavaidEquipmentMonitoring() {
        return navaidEquipmentMonitoring;
    }

    /**
     * Sets the value of the navaidEquipmentMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentMonitoringType }
     *     
     */
    public void setNavaidEquipmentMonitoring(NavaidEquipmentMonitoringType value) {
        this.navaidEquipmentMonitoring = value;
    }

    @Transient
    public boolean isSetNavaidEquipmentMonitoring() {
        return (this.navaidEquipmentMonitoring!= null);
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
        final NavaidEquipmentMonitoringPropertyType that = ((NavaidEquipmentMonitoringPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNavaidEquipmentMonitoring();
            boolean rhsFieldIsSet = that.isSetNavaidEquipmentMonitoring();
            NavaidEquipmentMonitoringType lhsField;
            lhsField = this.getNavaidEquipmentMonitoring();
            NavaidEquipmentMonitoringType rhsField;
            rhsField = that.getNavaidEquipmentMonitoring();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidEquipmentMonitoring", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidEquipmentMonitoring", rhsField);
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
            boolean theFieldIsSet = this.isSetNavaidEquipmentMonitoring();
            NavaidEquipmentMonitoringType theField;
            theField = this.getNavaidEquipmentMonitoring();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidEquipmentMonitoring", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNavaidEquipmentMonitoring();
            NavaidEquipmentMonitoringType theField;
            theField = this.getNavaidEquipmentMonitoring();
            strategy.appendField(locator, this, "navaidEquipmentMonitoring", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
