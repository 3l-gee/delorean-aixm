
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
 * <p>Java class for ApproachConditionPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachConditionPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ApproachCondition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachConditionPropertyType", propOrder = {
    "approachCondition"
})
@Entity(name = "ApproachConditionPropertyType")
@Table(name = "approachcondition_pt", schema = "procedure")
public class ApproachConditionPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ApproachCondition", required = true)
    protected ApproachConditionType approachCondition;

    /**
     * Gets the value of the approachCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ApproachConditionType }
     *     
     */
    @OneToOne(targetEntity = ApproachConditionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approachcondition_id", referencedColumnName = "hjid")
    public ApproachConditionType getApproachCondition() {
        return approachCondition;
    }

    /**
     * Sets the value of the approachCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachConditionType }
     *     
     */
    public void setApproachCondition(ApproachConditionType value) {
        this.approachCondition = value;
    }

    @Transient
    public boolean isSetApproachCondition() {
        return (this.approachCondition!= null);
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
        final ApproachConditionPropertyType that = ((ApproachConditionPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetApproachCondition();
            boolean rhsFieldIsSet = that.isSetApproachCondition();
            ApproachConditionType lhsField;
            lhsField = this.getApproachCondition();
            ApproachConditionType rhsField;
            rhsField = that.getApproachCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachCondition", rhsField);
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
            boolean theFieldIsSet = this.isSetApproachCondition();
            ApproachConditionType theField;
            theField = this.getApproachCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetApproachCondition();
            ApproachConditionType theField;
            theField = this.getApproachCondition();
            strategy.appendField(locator, this, "approachCondition", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
