
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
 * <p>Java class for ManoeuvringAreaUsagePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManoeuvringAreaUsagePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ManoeuvringAreaUsage"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManoeuvringAreaUsagePropertyType", propOrder = {
    "manoeuvringAreaUsage"
})
@Entity(name = "ManoeuvringAreaUsagePropertyType")
@Table(name = "manoeuvringareausage_pt", schema = "airport_heliport")
public class ManoeuvringAreaUsagePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ManoeuvringAreaUsage", required = true)
    protected ManoeuvringAreaUsageType manoeuvringAreaUsage;

    /**
     * Gets the value of the manoeuvringAreaUsage property.
     * 
     * @return
     *     possible object is
     *     {@link ManoeuvringAreaUsageType }
     *     
     */
    @OneToOne(targetEntity = ManoeuvringAreaUsageType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "manoeuvringareausage_id", referencedColumnName = "hjid")
    public ManoeuvringAreaUsageType getManoeuvringAreaUsage() {
        return manoeuvringAreaUsage;
    }

    /**
     * Sets the value of the manoeuvringAreaUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManoeuvringAreaUsageType }
     *     
     */
    public void setManoeuvringAreaUsage(ManoeuvringAreaUsageType value) {
        this.manoeuvringAreaUsage = value;
    }

    @Transient
    public boolean isSetManoeuvringAreaUsage() {
        return (this.manoeuvringAreaUsage!= null);
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
        final ManoeuvringAreaUsagePropertyType that = ((ManoeuvringAreaUsagePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetManoeuvringAreaUsage();
            boolean rhsFieldIsSet = that.isSetManoeuvringAreaUsage();
            ManoeuvringAreaUsageType lhsField;
            lhsField = this.getManoeuvringAreaUsage();
            ManoeuvringAreaUsageType rhsField;
            rhsField = that.getManoeuvringAreaUsage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "manoeuvringAreaUsage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "manoeuvringAreaUsage", rhsField);
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
            boolean theFieldIsSet = this.isSetManoeuvringAreaUsage();
            ManoeuvringAreaUsageType theField;
            theField = this.getManoeuvringAreaUsage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "manoeuvringAreaUsage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetManoeuvringAreaUsage();
            ManoeuvringAreaUsageType theField;
            theField = this.getManoeuvringAreaUsage();
            strategy.appendField(locator, this, "manoeuvringAreaUsage", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
