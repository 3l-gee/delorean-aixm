
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
 * <p>Java class for DepartureArrivalConditionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DepartureArrivalConditionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}DepartureArrivalCondition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureArrivalConditionPropertyType", propOrder = {
    "departureArrivalCondition"
})
@Entity(name = "DepartureArrivalConditionPropertyType")
@Table(name = "departurearrivalcondition_pt", schema = "procedure")
public class DepartureArrivalConditionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "DepartureArrivalCondition", required = true)
    protected DepartureArrivalConditionType departureArrivalCondition;

    /**
     * Gets the value of the departureArrivalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureArrivalConditionType }
     *     
     */
    @OneToOne(targetEntity = DepartureArrivalConditionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "departurearrivalcondition_id", referencedColumnName = "hjid")
    public DepartureArrivalConditionType getDepartureArrivalCondition() {
        return departureArrivalCondition;
    }

    /**
     * Sets the value of the departureArrivalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureArrivalConditionType }
     *     
     */
    public void setDepartureArrivalCondition(DepartureArrivalConditionType value) {
        this.departureArrivalCondition = value;
    }

    @Transient
    public boolean isSetDepartureArrivalCondition() {
        return (this.departureArrivalCondition!= null);
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
        final DepartureArrivalConditionPropertyType that = ((DepartureArrivalConditionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetDepartureArrivalCondition();
            boolean rhsFieldIsSet = that.isSetDepartureArrivalCondition();
            DepartureArrivalConditionType lhsField;
            lhsField = this.getDepartureArrivalCondition();
            DepartureArrivalConditionType rhsField;
            rhsField = that.getDepartureArrivalCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "departureArrivalCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "departureArrivalCondition", rhsField);
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
            boolean theFieldIsSet = this.isSetDepartureArrivalCondition();
            DepartureArrivalConditionType theField;
            theField = this.getDepartureArrivalCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "departureArrivalCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDepartureArrivalCondition();
            DepartureArrivalConditionType theField;
            theField = this.getDepartureArrivalCondition();
            strategy.appendField(locator, this, "departureArrivalCondition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
