
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
 * <p>Java class for ServiceOperationalStatusPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceOperationalStatusPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ServiceOperationalStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOperationalStatusPropertyType", propOrder = {
    "serviceOperationalStatus"
})
@Entity(name = "ServiceOperationalStatusPropertyType")
@Table(name = "serviceoperationalstatus_pt", schema = "service")
public class ServiceOperationalStatusPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ServiceOperationalStatus", required = true)
    protected ServiceOperationalStatusType serviceOperationalStatus;

    /**
     * Gets the value of the serviceOperationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOperationalStatusType }
     *     
     */
    @OneToOne(targetEntity = ServiceOperationalStatusType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "serviceoperationalstatus_id", referencedColumnName = "hjid")
    public ServiceOperationalStatusType getServiceOperationalStatus() {
        return serviceOperationalStatus;
    }

    /**
     * Sets the value of the serviceOperationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOperationalStatusType }
     *     
     */
    public void setServiceOperationalStatus(ServiceOperationalStatusType value) {
        this.serviceOperationalStatus = value;
    }

    @Transient
    public boolean isSetServiceOperationalStatus() {
        return (this.serviceOperationalStatus!= null);
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
        final ServiceOperationalStatusPropertyType that = ((ServiceOperationalStatusPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetServiceOperationalStatus();
            boolean rhsFieldIsSet = that.isSetServiceOperationalStatus();
            ServiceOperationalStatusType lhsField;
            lhsField = this.getServiceOperationalStatus();
            ServiceOperationalStatusType rhsField;
            rhsField = that.getServiceOperationalStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serviceOperationalStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serviceOperationalStatus", rhsField);
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
            boolean theFieldIsSet = this.isSetServiceOperationalStatus();
            ServiceOperationalStatusType theField;
            theField = this.getServiceOperationalStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serviceOperationalStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetServiceOperationalStatus();
            ServiceOperationalStatusType theField;
            theField = this.getServiceOperationalStatus();
            strategy.appendField(locator, this, "serviceOperationalStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
