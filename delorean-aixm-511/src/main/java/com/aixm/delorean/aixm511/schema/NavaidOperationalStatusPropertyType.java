
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
 * <p>Java class for NavaidOperationalStatusPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavaidOperationalStatusPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}NavaidOperationalStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidOperationalStatusPropertyType", propOrder = {
    "navaidOperationalStatus"
})
@Entity(name = "NavaidOperationalStatusPropertyType")
@Table(name = "navaidoperationalstatus_pt", schema = "navaids_point")
public class NavaidOperationalStatusPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "NavaidOperationalStatus", required = true)
    protected NavaidOperationalStatusType navaidOperationalStatus;

    /**
     * Gets the value of the navaidOperationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidOperationalStatusType }
     *     
     */
    @OneToOne(targetEntity = NavaidOperationalStatusType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "navaidoperationalstatus_id", referencedColumnName = "hjid")
    public NavaidOperationalStatusType getNavaidOperationalStatus() {
        return navaidOperationalStatus;
    }

    /**
     * Sets the value of the navaidOperationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidOperationalStatusType }
     *     
     */
    public void setNavaidOperationalStatus(NavaidOperationalStatusType value) {
        this.navaidOperationalStatus = value;
    }

    @Transient
    public boolean isSetNavaidOperationalStatus() {
        return (this.navaidOperationalStatus!= null);
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
        final NavaidOperationalStatusPropertyType that = ((NavaidOperationalStatusPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetNavaidOperationalStatus();
            boolean rhsFieldIsSet = that.isSetNavaidOperationalStatus();
            NavaidOperationalStatusType lhsField;
            lhsField = this.getNavaidOperationalStatus();
            NavaidOperationalStatusType rhsField;
            rhsField = that.getNavaidOperationalStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidOperationalStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidOperationalStatus", rhsField);
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
            boolean theFieldIsSet = this.isSetNavaidOperationalStatus();
            NavaidOperationalStatusType theField;
            theField = this.getNavaidOperationalStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidOperationalStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNavaidOperationalStatus();
            NavaidOperationalStatusType theField;
            theField = this.getNavaidOperationalStatus();
            strategy.appendField(locator, this, "navaidOperationalStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
