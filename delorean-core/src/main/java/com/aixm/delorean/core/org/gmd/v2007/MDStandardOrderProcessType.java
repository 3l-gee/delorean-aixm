
package com.aixm.delorean.core.org.gmd.v2007;

import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DateTimePropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Common ways in which the dataset may be obtained or received, and related instructions and fee information
 * 
 * <p>Java class for MD_StandardOrderProcess_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_StandardOrderProcess_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="fees" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="plannedAvailableDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/>
 *         <element name="orderingInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="turnaround" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_StandardOrderProcess_Type", propOrder = {
    "fees",
    "plannedAvailableDateTime",
    "orderingInstructions",
    "turnaround"
})
public class MDStandardOrderProcessType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fees;
    protected DateTimePropertyType plannedAvailableDateTime;
    protected CharacterStringPropertyType orderingInstructions;
    protected CharacterStringPropertyType turnaround;

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFees(CharacterStringPropertyType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the plannedAvailableDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getPlannedAvailableDateTime() {
        return plannedAvailableDateTime;
    }

    /**
     * Sets the value of the plannedAvailableDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setPlannedAvailableDateTime(DateTimePropertyType value) {
        this.plannedAvailableDateTime = value;
    }

    /**
     * Gets the value of the orderingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrderingInstructions() {
        return orderingInstructions;
    }

    /**
     * Sets the value of the orderingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrderingInstructions(CharacterStringPropertyType value) {
        this.orderingInstructions = value;
    }

    /**
     * Gets the value of the turnaround property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTurnaround() {
        return turnaround;
    }

    /**
     * Sets the value of the turnaround property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTurnaround(CharacterStringPropertyType value) {
        this.turnaround = value;
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
        final MDStandardOrderProcessType that = ((MDStandardOrderProcessType) object);
        {
            boolean lhsFieldIsSet = (this.fees!= null);
            boolean rhsFieldIsSet = (that.fees!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getFees();
            CharacterStringPropertyType rhsField;
            rhsField = that.getFees();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fees", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fees", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.orderingInstructions!= null);
            boolean rhsFieldIsSet = (that.orderingInstructions!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getOrderingInstructions();
            CharacterStringPropertyType rhsField;
            rhsField = that.getOrderingInstructions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "orderingInstructions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "orderingInstructions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.plannedAvailableDateTime!= null);
            boolean rhsFieldIsSet = (that.plannedAvailableDateTime!= null);
            DateTimePropertyType lhsField;
            lhsField = this.getPlannedAvailableDateTime();
            DateTimePropertyType rhsField;
            rhsField = that.getPlannedAvailableDateTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "plannedAvailableDateTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "plannedAvailableDateTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.turnaround!= null);
            boolean rhsFieldIsSet = (that.turnaround!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getTurnaround();
            CharacterStringPropertyType rhsField;
            rhsField = that.getTurnaround();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turnaround", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turnaround", rhsField);
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
            boolean theFieldIsSet = (this.fees!= null);
            CharacterStringPropertyType theField;
            theField = this.getFees();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fees", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.plannedAvailableDateTime!= null);
            DateTimePropertyType theField;
            theField = this.getPlannedAvailableDateTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "plannedAvailableDateTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.orderingInstructions!= null);
            CharacterStringPropertyType theField;
            theField = this.getOrderingInstructions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "orderingInstructions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.turnaround!= null);
            CharacterStringPropertyType theField;
            theField = this.getTurnaround();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turnaround", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.fees!= null);
            CharacterStringPropertyType theField;
            theField = this.getFees();
            strategy.appendField(locator, this, "fees", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.plannedAvailableDateTime!= null);
            DateTimePropertyType theField;
            theField = this.getPlannedAvailableDateTime();
            strategy.appendField(locator, this, "plannedAvailableDateTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.orderingInstructions!= null);
            CharacterStringPropertyType theField;
            theField = this.getOrderingInstructions();
            strategy.appendField(locator, this, "orderingInstructions", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.turnaround!= null);
            CharacterStringPropertyType theField;
            theField = this.getTurnaround();
            strategy.appendField(locator, this, "turnaround", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
