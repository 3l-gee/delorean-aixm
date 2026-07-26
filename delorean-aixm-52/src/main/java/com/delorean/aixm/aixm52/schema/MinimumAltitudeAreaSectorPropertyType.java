
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
 * <p>Java class for MinimumAltitudeAreaSectorPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MinimumAltitudeAreaSectorPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}MinimumAltitudeAreaSector"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumAltitudeAreaSectorPropertyType", propOrder = {
    "minimumAltitudeAreaSector"
})
@Entity(name = "MinimumAltitudeAreaSectorPropertyType")
@Table(name = "minimumaltitudeareasectorpropertytype", schema = "procedure")
public class MinimumAltitudeAreaSectorPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "MinimumAltitudeAreaSector", required = true)
    protected MinimumAltitudeAreaSectorType minimumAltitudeAreaSector;

    /**
     * Gets the value of the minimumAltitudeAreaSector property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAltitudeAreaSectorType }
     *     
     */
    @OneToOne(targetEntity = MinimumAltitudeAreaSectorType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "minimumaltitudeareasector_hjid", referencedColumnName = "hjid")
    public MinimumAltitudeAreaSectorType getMinimumAltitudeAreaSector() {
        return minimumAltitudeAreaSector;
    }

    /**
     * Sets the value of the minimumAltitudeAreaSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAltitudeAreaSectorType }
     *     
     */
    public void setMinimumAltitudeAreaSector(MinimumAltitudeAreaSectorType value) {
        this.minimumAltitudeAreaSector = value;
    }

    @Transient
    public boolean isSetMinimumAltitudeAreaSector() {
        return (this.minimumAltitudeAreaSector!= null);
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
        final MinimumAltitudeAreaSectorPropertyType that = ((MinimumAltitudeAreaSectorPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetMinimumAltitudeAreaSector();
            boolean rhsFieldIsSet = that.isSetMinimumAltitudeAreaSector();
            MinimumAltitudeAreaSectorType lhsField;
            lhsField = this.getMinimumAltitudeAreaSector();
            MinimumAltitudeAreaSectorType rhsField;
            rhsField = that.getMinimumAltitudeAreaSector();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumAltitudeAreaSector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumAltitudeAreaSector", rhsField);
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
            boolean theFieldIsSet = this.isSetMinimumAltitudeAreaSector();
            MinimumAltitudeAreaSectorType theField;
            theField = this.getMinimumAltitudeAreaSector();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumAltitudeAreaSector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMinimumAltitudeAreaSector();
            MinimumAltitudeAreaSectorType theField;
            theField = this.getMinimumAltitudeAreaSector();
            strategy.appendField(locator, this, "minimumAltitudeAreaSector", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
