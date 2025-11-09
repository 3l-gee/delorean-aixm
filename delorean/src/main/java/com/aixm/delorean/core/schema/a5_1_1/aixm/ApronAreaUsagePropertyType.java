
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
 * <p>Java class for ApronAreaUsagePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApronAreaUsagePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ApronAreaUsage"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApronAreaUsagePropertyType", propOrder = {
    "apronAreaUsage"
})
@Entity(name = "ApronAreaUsagePropertyType")
@Table(name = "apronareausage_pt", schema = "airport_heliport")
public class ApronAreaUsagePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ApronAreaUsage", required = true)
    protected ApronAreaUsageType apronAreaUsage;

    /**
     * Gets the value of the apronAreaUsage property.
     * 
     * @return
     *     possible object is
     *     {@link ApronAreaUsageType }
     *     
     */
    @OneToOne(targetEntity = ApronAreaUsageType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "apronareausage_id", referencedColumnName = "hjid")
    public ApronAreaUsageType getApronAreaUsage() {
        return apronAreaUsage;
    }

    /**
     * Sets the value of the apronAreaUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApronAreaUsageType }
     *     
     */
    public void setApronAreaUsage(ApronAreaUsageType value) {
        this.apronAreaUsage = value;
    }

    @Transient
    public boolean isSetApronAreaUsage() {
        return (this.apronAreaUsage!= null);
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
        final ApronAreaUsagePropertyType that = ((ApronAreaUsagePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetApronAreaUsage();
            boolean rhsFieldIsSet = that.isSetApronAreaUsage();
            ApronAreaUsageType lhsField;
            lhsField = this.getApronAreaUsage();
            ApronAreaUsageType rhsField;
            rhsField = that.getApronAreaUsage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "apronAreaUsage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "apronAreaUsage", rhsField);
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
            boolean theFieldIsSet = this.isSetApronAreaUsage();
            ApronAreaUsageType theField;
            theField = this.getApronAreaUsage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "apronAreaUsage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetApronAreaUsage();
            ApronAreaUsageType theField;
            theField = this.getApronAreaUsage();
            strategy.appendField(locator, this, "apronAreaUsage", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
