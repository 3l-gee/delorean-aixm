
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
 * <p>Java class for VDBAntennaPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VDBAntennaPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}VDBAntenna"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VDBAntennaPropertyType", propOrder = {
    "vdbAntenna"
})
@Entity(name = "VDBAntennaPropertyType")
@Table(name = "vdbantennapropertytype", schema = "navaids_point")
public class VDBAntennaPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "VDBAntenna", required = true)
    protected VDBAntennaType vdbAntenna;

    /**
     * Gets the value of the vdbAntenna property.
     * 
     * @return
     *     possible object is
     *     {@link VDBAntennaType }
     *     
     */
    @OneToOne(targetEntity = VDBAntennaType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "vdbantenna_hjid", referencedColumnName = "hjid")
    public VDBAntennaType getVDBAntenna() {
        return vdbAntenna;
    }

    /**
     * Sets the value of the vdbAntenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link VDBAntennaType }
     *     
     */
    public void setVDBAntenna(VDBAntennaType value) {
        this.vdbAntenna = value;
    }

    @Transient
    public boolean isSetVDBAntenna() {
        return (this.vdbAntenna!= null);
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
        final VDBAntennaPropertyType that = ((VDBAntennaPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetVDBAntenna();
            boolean rhsFieldIsSet = that.isSetVDBAntenna();
            VDBAntennaType lhsField;
            lhsField = this.getVDBAntenna();
            VDBAntennaType rhsField;
            rhsField = that.getVDBAntenna();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "vdbAntenna", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "vdbAntenna", rhsField);
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
            boolean theFieldIsSet = this.isSetVDBAntenna();
            VDBAntennaType theField;
            theField = this.getVDBAntenna();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "vdbAntenna", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetVDBAntenna();
            VDBAntennaType theField;
            theField = this.getVDBAntenna();
            strategy.appendField(locator, this, "vdbAntenna", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
