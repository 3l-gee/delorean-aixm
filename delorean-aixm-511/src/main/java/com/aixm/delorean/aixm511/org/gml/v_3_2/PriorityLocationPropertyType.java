
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for PriorityLocationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriorityLocationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}LocationPropertyType">
 *       <attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityLocationPropertyType")
public class PriorityLocationPropertyType
    extends LocationPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlAttribute(name = "priority")
    protected String priority;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    public boolean isSetPriority() {
        return (this.priority!= null);
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
        final PriorityLocationPropertyType that = ((PriorityLocationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetPriority();
            boolean rhsFieldIsSet = that.isSetPriority();
            String lhsField;
            lhsField = this.getPriority();
            String rhsField;
            rhsField = that.getPriority();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "priority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "priority", rhsField);
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
            boolean theFieldIsSet = this.isSetPriority();
            String theField;
            theField = this.getPriority();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "priority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPriority();
            String theField;
            theField = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
