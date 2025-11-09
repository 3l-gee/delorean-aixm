
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
 * <p>Java class for SpecialNavigationStationStatusPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecialNavigationStationStatusPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}SpecialNavigationStationStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialNavigationStationStatusPropertyType", propOrder = {
    "specialNavigationStationStatus"
})
@Entity(name = "SpecialNavigationStationStatusPropertyType")
@Table(name = "specialnavigationstationstatus_pt", schema = "navaids_point")
public class SpecialNavigationStationStatusPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SpecialNavigationStationStatus", required = true)
    protected SpecialNavigationStationStatusType specialNavigationStationStatus;

    /**
     * Gets the value of the specialNavigationStationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNavigationStationStatusType }
     *     
     */
    @OneToOne(targetEntity = SpecialNavigationStationStatusType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "specialnavigationstationstatus_id", referencedColumnName = "hjid")
    public SpecialNavigationStationStatusType getSpecialNavigationStationStatus() {
        return specialNavigationStationStatus;
    }

    /**
     * Sets the value of the specialNavigationStationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNavigationStationStatusType }
     *     
     */
    public void setSpecialNavigationStationStatus(SpecialNavigationStationStatusType value) {
        this.specialNavigationStationStatus = value;
    }

    @Transient
    public boolean isSetSpecialNavigationStationStatus() {
        return (this.specialNavigationStationStatus!= null);
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
        final SpecialNavigationStationStatusPropertyType that = ((SpecialNavigationStationStatusPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSpecialNavigationStationStatus();
            boolean rhsFieldIsSet = that.isSetSpecialNavigationStationStatus();
            SpecialNavigationStationStatusType lhsField;
            lhsField = this.getSpecialNavigationStationStatus();
            SpecialNavigationStationStatusType rhsField;
            rhsField = that.getSpecialNavigationStationStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialNavigationStationStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialNavigationStationStatus", rhsField);
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
            boolean theFieldIsSet = this.isSetSpecialNavigationStationStatus();
            SpecialNavigationStationStatusType theField;
            theField = this.getSpecialNavigationStationStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialNavigationStationStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSpecialNavigationStationStatus();
            SpecialNavigationStationStatusType theField;
            theField = this.getSpecialNavigationStationStatus();
            strategy.appendField(locator, this, "specialNavigationStationStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
