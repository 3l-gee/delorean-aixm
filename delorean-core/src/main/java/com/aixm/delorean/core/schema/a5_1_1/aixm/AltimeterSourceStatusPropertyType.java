
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
 * <p>Java class for AltimeterSourceStatusPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AltimeterSourceStatusPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AltimeterSourceStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltimeterSourceStatusPropertyType", propOrder = {
    "altimeterSourceStatus"
})
@Entity(name = "AltimeterSourceStatusPropertyType")
@Table(name = "altimetersourcestatus_pt", schema = "airport_heliport")
public class AltimeterSourceStatusPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AltimeterSourceStatus", required = true)
    protected AltimeterSourceStatusType altimeterSourceStatus;

    /**
     * Gets the value of the altimeterSourceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AltimeterSourceStatusType }
     *     
     */
    @OneToOne(targetEntity = AltimeterSourceStatusType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "altimetersourcestatus_id", referencedColumnName = "hjid")
    public AltimeterSourceStatusType getAltimeterSourceStatus() {
        return altimeterSourceStatus;
    }

    /**
     * Sets the value of the altimeterSourceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltimeterSourceStatusType }
     *     
     */
    public void setAltimeterSourceStatus(AltimeterSourceStatusType value) {
        this.altimeterSourceStatus = value;
    }

    @Transient
    public boolean isSetAltimeterSourceStatus() {
        return (this.altimeterSourceStatus!= null);
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
        final AltimeterSourceStatusPropertyType that = ((AltimeterSourceStatusPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAltimeterSourceStatus();
            boolean rhsFieldIsSet = that.isSetAltimeterSourceStatus();
            AltimeterSourceStatusType lhsField;
            lhsField = this.getAltimeterSourceStatus();
            AltimeterSourceStatusType rhsField;
            rhsField = that.getAltimeterSourceStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altimeterSourceStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altimeterSourceStatus", rhsField);
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
            boolean theFieldIsSet = this.isSetAltimeterSourceStatus();
            AltimeterSourceStatusType theField;
            theField = this.getAltimeterSourceStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altimeterSourceStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAltimeterSourceStatus();
            AltimeterSourceStatusType theField;
            theField = this.getAltimeterSourceStatus();
            strategy.appendField(locator, this, "altimeterSourceStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
