
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for CompositeValueType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CompositeValueType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}valueComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}valueComponents" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeValueType", propOrder = {
    "valueComponent",
    "valueComponents"
})
@XmlSeeAlso({
    ValueArrayType.class
})
public class CompositeValueType
    extends AbstractGMLType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<ValuePropertyType> valueComponent;
    /**
     * Property that contains Values.
     * 
     */
    protected ValueArrayPropertyType valueComponents;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Property that refers to, or contains, a Value.Gets the value of the valueComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuePropertyType }
     * 
     * 
     */
    public List<ValuePropertyType> getValueComponent() {
        if (valueComponent == null) {
            valueComponent = new ArrayList<>();
        }
        return this.valueComponent;
    }

    /**
     * Property that refers to, or contains, a Value.
     * 
     */
    public void setValueComponent(List<ValuePropertyType> valueComponent) {
        this.valueComponent = valueComponent;
    }

    public boolean isSetValueComponent() {
        return ((this.valueComponent!= null)&&(!this.valueComponent.isEmpty()));
    }

    public void unsetValueComponent() {
        this.valueComponent = null;
    }

    /**
     * Property that contains Values.
     * 
     * @return
     *     possible object is
     *     {@link ValueArrayPropertyType }
     *     
     */
    public ValueArrayPropertyType getValueComponents() {
        return valueComponents;
    }

    /**
     * Sets the value of the valueComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueArrayPropertyType }
     *     
     * @see #getValueComponents()
     */
    public void setValueComponents(ValueArrayPropertyType value) {
        this.valueComponents = value;
    }

    public boolean isSetValueComponents() {
        return (this.valueComponents!= null);
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
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
        final CompositeValueType that = ((CompositeValueType) object);
        {
            boolean lhsFieldIsSet = this.isSetValueComponent();
            boolean rhsFieldIsSet = that.isSetValueComponent();
            List<ValuePropertyType> lhsField;
            lhsField = (this.isSetValueComponent()?this.getValueComponent():null);
            List<ValuePropertyType> rhsField;
            rhsField = (that.isSetValueComponent()?that.getValueComponent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueComponent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueComponent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAggregationType();
            boolean rhsFieldIsSet = that.isSetAggregationType();
            AggregationType lhsField;
            lhsField = this.getAggregationType();
            AggregationType rhsField;
            rhsField = that.getAggregationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aggregationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aggregationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValueComponents();
            boolean rhsFieldIsSet = that.isSetValueComponents();
            ValueArrayPropertyType lhsField;
            lhsField = this.getValueComponents();
            ValueArrayPropertyType rhsField;
            rhsField = that.getValueComponents();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueComponents", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueComponents", rhsField);
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
            boolean theFieldIsSet = this.isSetValueComponent();
            List<ValuePropertyType> theField;
            theField = (this.isSetValueComponent()?this.getValueComponent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueComponent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetValueComponents();
            ValueArrayPropertyType theField;
            theField = this.getValueComponents();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueComponents", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAggregationType();
            AggregationType theField;
            theField = this.getAggregationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aggregationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetValueComponent();
            List<ValuePropertyType> theField;
            theField = (this.isSetValueComponent()?this.getValueComponent():null);
            strategy.appendField(locator, this, "valueComponent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetValueComponents();
            ValueArrayPropertyType theField;
            theField = this.getValueComponents();
            strategy.appendField(locator, this, "valueComponents", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAggregationType();
            AggregationType theField;
            theField = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
