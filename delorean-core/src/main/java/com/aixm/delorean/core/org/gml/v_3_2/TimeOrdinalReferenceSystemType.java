
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for TimeOrdinalReferenceSystemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeOrdinalReferenceSystemType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       <sequence>
 *         <element name="component" type="{http://www.opengis.net/gml/3.2}TimeOrdinalEraPropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalReferenceSystemType", propOrder = {
    "component"
})
public class TimeOrdinalReferenceSystemType
    extends TimeReferenceSystemType
{

    @XmlElement(required = true)
    protected List<TimeOrdinalEraPropertyType> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
     * 
     * 
     */
    public List<TimeOrdinalEraPropertyType> getComponent() {
        if (component == null) {
            component = new ArrayList<>();
        }
        return this.component;
    }

    /**
     * 
     * 
     */
    public void setComponent(List<TimeOrdinalEraPropertyType> component) {
        this.component = component;
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
        final TimeOrdinalReferenceSystemType that = ((TimeOrdinalReferenceSystemType) object);
        {
            boolean lhsFieldIsSet = ((this.component!= null)&&(!this.component.isEmpty()));
            boolean rhsFieldIsSet = ((that.component!= null)&&(!that.component.isEmpty()));
            List<TimeOrdinalEraPropertyType> lhsField;
            lhsField = (((this.component!= null)&&(!this.component.isEmpty()))?this.getComponent():null);
            List<TimeOrdinalEraPropertyType> rhsField;
            rhsField = (((that.component!= null)&&(!that.component.isEmpty()))?that.getComponent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "component", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "component", rhsField);
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
            boolean theFieldIsSet = ((this.component!= null)&&(!this.component.isEmpty()));
            List<TimeOrdinalEraPropertyType> theField;
            theField = (((this.component!= null)&&(!this.component.isEmpty()))?this.getComponent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "component", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.component!= null)&&(!this.component.isEmpty()));
            List<TimeOrdinalEraPropertyType> theField;
            theField = (((this.component!= null)&&(!this.component.isEmpty()))?this.getComponent():null);
            strategy.appendField(locator, this, "component", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
