
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
 * <p>Java class for VerticalStructureLightingStatusPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VerticalStructureLightingStatusPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}VerticalStructureLightingStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalStructureLightingStatusPropertyType", propOrder = {
    "verticalStructureLightingStatus"
})
@Entity(name = "VerticalStructureLightingStatusPropertyType")
@Table(name = "verticalstructurelightingstatus_pt", schema = "obstacle")
public class VerticalStructureLightingStatusPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "VerticalStructureLightingStatus", required = true)
    protected VerticalStructureLightingStatusType verticalStructureLightingStatus;

    /**
     * Gets the value of the verticalStructureLightingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalStructureLightingStatusType }
     *     
     */
    @OneToOne(targetEntity = VerticalStructureLightingStatusType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "verticalstructurelightingstatus_id", referencedColumnName = "hjid")
    public VerticalStructureLightingStatusType getVerticalStructureLightingStatus() {
        return verticalStructureLightingStatus;
    }

    /**
     * Sets the value of the verticalStructureLightingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalStructureLightingStatusType }
     *     
     */
    public void setVerticalStructureLightingStatus(VerticalStructureLightingStatusType value) {
        this.verticalStructureLightingStatus = value;
    }

    @Transient
    public boolean isSetVerticalStructureLightingStatus() {
        return (this.verticalStructureLightingStatus!= null);
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
        final VerticalStructureLightingStatusPropertyType that = ((VerticalStructureLightingStatusPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetVerticalStructureLightingStatus();
            boolean rhsFieldIsSet = that.isSetVerticalStructureLightingStatus();
            VerticalStructureLightingStatusType lhsField;
            lhsField = this.getVerticalStructureLightingStatus();
            VerticalStructureLightingStatusType rhsField;
            rhsField = that.getVerticalStructureLightingStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalStructureLightingStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalStructureLightingStatus", rhsField);
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
            boolean theFieldIsSet = this.isSetVerticalStructureLightingStatus();
            VerticalStructureLightingStatusType theField;
            theField = this.getVerticalStructureLightingStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalStructureLightingStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetVerticalStructureLightingStatus();
            VerticalStructureLightingStatusType theField;
            theField = this.getVerticalStructureLightingStatus();
            strategy.appendField(locator, this, "verticalStructureLightingStatus", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
