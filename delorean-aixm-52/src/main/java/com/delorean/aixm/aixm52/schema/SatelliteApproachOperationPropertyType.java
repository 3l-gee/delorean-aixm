
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for SatelliteApproachOperationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SatelliteApproachOperationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}SatelliteApproachOperation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SatelliteApproachOperationPropertyType", propOrder = {
    "satelliteApproachOperation"
})
@Entity(name = "SatelliteApproachOperationPropertyType")
@Table(name = "satelliteapproachoperationpropertytype", schema = "navaids_point")
public class SatelliteApproachOperationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SatelliteApproachOperation", required = true)
    protected SatelliteApproachOperationType satelliteApproachOperation;

    /**
     * Gets the value of the satelliteApproachOperation property.
     * 
     * @return
     *     possible object is
     *     {@link SatelliteApproachOperationType }
     *     
     */
    @OneToOne(targetEntity = SatelliteApproachOperationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "satelliteapproachoperation_hjid", referencedColumnName = "hjid")
    public SatelliteApproachOperationType getSatelliteApproachOperation() {
        return satelliteApproachOperation;
    }

    /**
     * Sets the value of the satelliteApproachOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SatelliteApproachOperationType }
     *     
     */
    public void setSatelliteApproachOperation(SatelliteApproachOperationType value) {
        this.satelliteApproachOperation = value;
    }

    @Transient
    public boolean isSetSatelliteApproachOperation() {
        return (this.satelliteApproachOperation!= null);
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
        final SatelliteApproachOperationPropertyType that = ((SatelliteApproachOperationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSatelliteApproachOperation();
            boolean rhsFieldIsSet = that.isSetSatelliteApproachOperation();
            SatelliteApproachOperationType lhsField;
            lhsField = this.getSatelliteApproachOperation();
            SatelliteApproachOperationType rhsField;
            rhsField = that.getSatelliteApproachOperation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "satelliteApproachOperation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "satelliteApproachOperation", rhsField);
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
            boolean theFieldIsSet = this.isSetSatelliteApproachOperation();
            SatelliteApproachOperationType theField;
            theField = this.getSatelliteApproachOperation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "satelliteApproachOperation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSatelliteApproachOperation();
            SatelliteApproachOperationType theField;
            theField = this.getSatelliteApproachOperation();
            strategy.appendField(locator, this, "satelliteApproachOperation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
