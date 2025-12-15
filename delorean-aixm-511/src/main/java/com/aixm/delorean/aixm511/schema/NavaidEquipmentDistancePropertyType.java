
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
 * <p>Java class for NavaidEquipmentDistancePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavaidEquipmentDistancePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}NavaidEquipmentDistance"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidEquipmentDistancePropertyType", propOrder = {
    "navaidEquipmentDistance"
})
@Entity(name = "NavaidEquipmentDistancePropertyType")
@Table(name = "navaidequipmentdistance_pt", schema = "airport_heliport")
public class NavaidEquipmentDistancePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "NavaidEquipmentDistance", required = true)
    protected NavaidEquipmentDistanceType navaidEquipmentDistance;

    /**
     * Gets the value of the navaidEquipmentDistance property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentDistanceType }
     *     
     */
    @OneToOne(targetEntity = NavaidEquipmentDistanceType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "navaidequipmentdistance_id", referencedColumnName = "hjid")
    public NavaidEquipmentDistanceType getNavaidEquipmentDistance() {
        return navaidEquipmentDistance;
    }

    /**
     * Sets the value of the navaidEquipmentDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentDistanceType }
     *     
     */
    public void setNavaidEquipmentDistance(NavaidEquipmentDistanceType value) {
        this.navaidEquipmentDistance = value;
    }

    @Transient
    public boolean isSetNavaidEquipmentDistance() {
        return (this.navaidEquipmentDistance!= null);
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
        final NavaidEquipmentDistancePropertyType that = ((NavaidEquipmentDistancePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNavaidEquipmentDistance();
            boolean rhsFieldIsSet = that.isSetNavaidEquipmentDistance();
            NavaidEquipmentDistanceType lhsField;
            lhsField = this.getNavaidEquipmentDistance();
            NavaidEquipmentDistanceType rhsField;
            rhsField = that.getNavaidEquipmentDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidEquipmentDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidEquipmentDistance", rhsField);
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
            boolean theFieldIsSet = this.isSetNavaidEquipmentDistance();
            NavaidEquipmentDistanceType theField;
            theField = this.getNavaidEquipmentDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidEquipmentDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNavaidEquipmentDistance();
            NavaidEquipmentDistanceType theField;
            theField = this.getNavaidEquipmentDistance();
            strategy.appendField(locator, this, "navaidEquipmentDistance", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
