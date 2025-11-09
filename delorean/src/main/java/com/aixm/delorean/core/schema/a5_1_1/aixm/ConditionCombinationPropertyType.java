
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
 * <p>Java class for ConditionCombinationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConditionCombinationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ConditionCombination"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionCombinationPropertyType", propOrder = {
    "conditionCombination"
})
@Entity(name = "ConditionCombinationPropertyType")
@Table(name = "conditioncombination_pt", schema = "airport_heliport")
public class ConditionCombinationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ConditionCombination", required = true)
    protected ConditionCombinationType conditionCombination;

    /**
     * Gets the value of the conditionCombination property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionCombinationType }
     *     
     */
    @OneToOne(targetEntity = ConditionCombinationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "conditioncombination_id", referencedColumnName = "hjid")
    public ConditionCombinationType getConditionCombination() {
        return conditionCombination;
    }

    /**
     * Sets the value of the conditionCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionCombinationType }
     *     
     */
    public void setConditionCombination(ConditionCombinationType value) {
        this.conditionCombination = value;
    }

    @Transient
    public boolean isSetConditionCombination() {
        return (this.conditionCombination!= null);
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
        final ConditionCombinationPropertyType that = ((ConditionCombinationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetConditionCombination();
            boolean rhsFieldIsSet = that.isSetConditionCombination();
            ConditionCombinationType lhsField;
            lhsField = this.getConditionCombination();
            ConditionCombinationType rhsField;
            rhsField = that.getConditionCombination();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "conditionCombination", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "conditionCombination", rhsField);
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
            boolean theFieldIsSet = this.isSetConditionCombination();
            ConditionCombinationType theField;
            theField = this.getConditionCombination();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "conditionCombination", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetConditionCombination();
            ConditionCombinationType theField;
            theField = this.getConditionCombination();
            strategy.appendField(locator, this, "conditionCombination", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
