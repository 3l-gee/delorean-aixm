
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
 * <p>Java class for PointUsagePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PointUsagePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}PointUsage"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointUsagePropertyType", propOrder = {
    "pointUsage"
})
@Entity(name = "PointUsagePropertyType")
@Table(name = "pointusage_p", schema = "navaids_point")
public class PointUsagePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "PointUsage", required = true)
    protected PointUsageType pointUsage;

    /**
     * Gets the value of the pointUsage property.
     * 
     * @return
     *     possible object is
     *     {@link PointUsageType }
     *     
     */
    @OneToOne(targetEntity = PointUsageType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointusage_hjid", referencedColumnName = "hjid")
    public PointUsageType getPointUsage() {
        return pointUsage;
    }

    /**
     * Sets the value of the pointUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointUsageType }
     *     
     */
    public void setPointUsage(PointUsageType value) {
        this.pointUsage = value;
    }

    @Transient
    public boolean isSetPointUsage() {
        return (this.pointUsage!= null);
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
        final PointUsagePropertyType that = ((PointUsagePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetPointUsage();
            boolean rhsFieldIsSet = that.isSetPointUsage();
            PointUsageType lhsField;
            lhsField = this.getPointUsage();
            PointUsageType rhsField;
            rhsField = that.getPointUsage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointUsage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointUsage", rhsField);
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
            boolean theFieldIsSet = this.isSetPointUsage();
            PointUsageType theField;
            theField = this.getPointUsage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointUsage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPointUsage();
            PointUsageType theField;
            theField = this.getPointUsage();
            strategy.appendField(locator, this, "pointUsage", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
