
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
 * <p>Java class for OxygenPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OxygenPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}Oxygen"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OxygenPropertyType", propOrder = {
    "oxygen"
})
@Entity(name = "OxygenPropertyType")
@Table(name = "oxygen_pt", schema = "service")
public class OxygenPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "Oxygen", required = true)
    protected OxygenType oxygen;

    /**
     * Gets the value of the oxygen property.
     * 
     * @return
     *     possible object is
     *     {@link OxygenType }
     *     
     */
    @OneToOne(targetEntity = OxygenType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "oxygen_id", referencedColumnName = "hjid")
    public OxygenType getOxygen() {
        return oxygen;
    }

    /**
     * Sets the value of the oxygen property.
     * 
     * @param value
     *     allowed object is
     *     {@link OxygenType }
     *     
     */
    public void setOxygen(OxygenType value) {
        this.oxygen = value;
    }

    @Transient
    public boolean isSetOxygen() {
        return (this.oxygen!= null);
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
        final OxygenPropertyType that = ((OxygenPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetOxygen();
            boolean rhsFieldIsSet = that.isSetOxygen();
            OxygenType lhsField;
            lhsField = this.getOxygen();
            OxygenType rhsField;
            rhsField = that.getOxygen();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "oxygen", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "oxygen", rhsField);
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
            boolean theFieldIsSet = this.isSetOxygen();
            OxygenType theField;
            theField = this.getOxygen();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "oxygen", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetOxygen();
            OxygenType theField;
            theField = this.getOxygen();
            strategy.appendField(locator, this, "oxygen", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
