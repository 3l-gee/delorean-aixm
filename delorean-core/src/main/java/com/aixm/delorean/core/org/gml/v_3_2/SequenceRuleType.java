
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * The gml:SequenceRuleType is derived from the gml:SequenceRuleEnumeration through the addition of an axisOrder attribute.  The gml:SequenceRuleEnumeration is an enumerated type. The rule names are defined in ISO 19123. If no rule name is specified the default is "Linear".
 * 
 * <p>Java class for SequenceRuleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SequenceRuleType">
 *   <simpleContent>
 *     <extension base="<http://www.opengis.net/gml/3.2>SequenceRuleEnumeration">
 *       <attribute name="order" type="{http://www.opengis.net/gml/3.2}IncrementOrder" />
 *       <attribute name="axisOrder" type="{http://www.opengis.net/gml/3.2}AxisDirectionList" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRuleType", propOrder = {
    "value"
})
public class SequenceRuleType implements Equals, HashCode, ToString
{

    @XmlValue
    protected SequenceRuleEnumeration value;
    @XmlAttribute(name = "order")
    protected String order;
    @XmlAttribute
    protected List<String> axisOrder;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleEnumeration }
     *     
     */
    public SequenceRuleEnumeration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleEnumeration }
     *     
     */
    public void setValue(SequenceRuleEnumeration value) {
        this.value = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the axisOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisOrder() {
        if (axisOrder == null) {
            axisOrder = new ArrayList<>();
        }
        return this.axisOrder;
    }

    /**
     * 
     * 
     */
    public void setAxisOrder(List<String> axisOrder) {
        this.axisOrder = axisOrder;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SequenceRuleType that = ((SequenceRuleType) object);
        {
            boolean lhsFieldIsSet = (this.value!= null);
            boolean rhsFieldIsSet = (that.value!= null);
            SequenceRuleEnumeration lhsField;
            lhsField = this.getValue();
            SequenceRuleEnumeration rhsField;
            rhsField = that.getValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.order!= null);
            boolean rhsFieldIsSet = (that.order!= null);
            String lhsField;
            lhsField = this.getOrder();
            String rhsField;
            rhsField = that.getOrder();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "order", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "order", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()));
            boolean rhsFieldIsSet = ((that.axisOrder!= null)&&(!that.axisOrder.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()))?this.getAxisOrder():null);
            List<String> rhsField;
            rhsField = (((that.axisOrder!= null)&&(!that.axisOrder.isEmpty()))?that.getAxisOrder():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisOrder", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisOrder", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = (this.value!= null);
            SequenceRuleEnumeration theField;
            theField = this.getValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.order!= null);
            String theField;
            theField = this.getOrder();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "order", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()));
            List<String> theField;
            theField = (((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()))?this.getAxisOrder():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisOrder", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = (this.value!= null);
            SequenceRuleEnumeration theField;
            theField = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.order!= null);
            String theField;
            theField = this.getOrder();
            strategy.appendField(locator, this, "order", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()));
            List<String> theField;
            theField = (((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()))?this.getAxisOrder():null);
            strategy.appendField(locator, this, "axisOrder", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
