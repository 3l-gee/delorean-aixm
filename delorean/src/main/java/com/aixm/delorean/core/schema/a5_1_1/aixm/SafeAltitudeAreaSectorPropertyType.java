
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
 * <p>Java class for SafeAltitudeAreaSectorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SafeAltitudeAreaSectorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}SafeAltitudeAreaSector"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeAltitudeAreaSectorPropertyType", propOrder = {
    "safeAltitudeAreaSector"
})
@Entity(name = "SafeAltitudeAreaSectorPropertyType")
@Table(name = "safealtitudeareasector_pt", schema = "procedure")
public class SafeAltitudeAreaSectorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "SafeAltitudeAreaSector", required = true)
    protected SafeAltitudeAreaSectorType safeAltitudeAreaSector;

    /**
     * Gets the value of the safeAltitudeAreaSector property.
     * 
     * @return
     *     possible object is
     *     {@link SafeAltitudeAreaSectorType }
     *     
     */
    @OneToOne(targetEntity = SafeAltitudeAreaSectorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "safealtitudeareasector_id", referencedColumnName = "hjid")
    public SafeAltitudeAreaSectorType getSafeAltitudeAreaSector() {
        return safeAltitudeAreaSector;
    }

    /**
     * Sets the value of the safeAltitudeAreaSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeAltitudeAreaSectorType }
     *     
     */
    public void setSafeAltitudeAreaSector(SafeAltitudeAreaSectorType value) {
        this.safeAltitudeAreaSector = value;
    }

    @Transient
    public boolean isSetSafeAltitudeAreaSector() {
        return (this.safeAltitudeAreaSector!= null);
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
        final SafeAltitudeAreaSectorPropertyType that = ((SafeAltitudeAreaSectorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetSafeAltitudeAreaSector();
            boolean rhsFieldIsSet = that.isSetSafeAltitudeAreaSector();
            SafeAltitudeAreaSectorType lhsField;
            lhsField = this.getSafeAltitudeAreaSector();
            SafeAltitudeAreaSectorType rhsField;
            rhsField = that.getSafeAltitudeAreaSector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "safeAltitudeAreaSector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "safeAltitudeAreaSector", rhsField);
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
            boolean theFieldIsSet = this.isSetSafeAltitudeAreaSector();
            SafeAltitudeAreaSectorType theField;
            theField = this.getSafeAltitudeAreaSector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "safeAltitudeAreaSector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSafeAltitudeAreaSector();
            SafeAltitudeAreaSectorType theField;
            theField = this.getSafeAltitudeAreaSector();
            strategy.appendField(locator, this, "safeAltitudeAreaSector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
