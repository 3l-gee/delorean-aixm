
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RecordPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RecordTypePropertyType;
import com.aixm.delorean.core.org.gco.v2007.UnitOfMeasurePropertyType;
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
 * Quantitative_conformance_measure from Quality Procedures.  -  - Renamed to remove implied use limitation -  - OCL - -- result is type specified by valueDomain - result.tupleType = valueDomain
 * 
 * <p>Java class for DQ_QuantitativeResult_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DQ_QuantitativeResult_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Result_Type">
 *       <sequence>
 *         <element name="valueType" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType" minOccurs="0"/>
 *         <element name="valueUnit" type="{http://www.isotc211.org/2005/gco}UnitOfMeasure_PropertyType"/>
 *         <element name="errorStatistic" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="value" type="{http://www.isotc211.org/2005/gco}Record_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_QuantitativeResult_Type", propOrder = {
    "valueType",
    "valueUnit",
    "errorStatistic",
    "value"
})
public class DQQuantitativeResultType
    extends AbstractDQResultType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected RecordTypePropertyType valueType;
    @XmlElement(required = true)
    protected UnitOfMeasurePropertyType valueUnit;
    protected CharacterStringPropertyType errorStatistic;
    @XmlElement(required = true)
    protected List<RecordPropertyType> value;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setValueType(RecordTypePropertyType value) {
        this.valueType = value;
    }

    public boolean isSetValueType() {
        return (this.valueType!= null);
    }

    /**
     * Gets the value of the valueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurePropertyType }
     *     
     */
    public UnitOfMeasurePropertyType getValueUnit() {
        return valueUnit;
    }

    /**
     * Sets the value of the valueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurePropertyType }
     *     
     */
    public void setValueUnit(UnitOfMeasurePropertyType value) {
        this.valueUnit = value;
    }

    public boolean isSetValueUnit() {
        return (this.valueUnit!= null);
    }

    /**
     * Gets the value of the errorStatistic property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getErrorStatistic() {
        return errorStatistic;
    }

    /**
     * Sets the value of the errorStatistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setErrorStatistic(CharacterStringPropertyType value) {
        this.errorStatistic = value;
    }

    public boolean isSetErrorStatistic() {
        return (this.errorStatistic!= null);
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordPropertyType }
     * 
     * 
     */
    public List<RecordPropertyType> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

    /**
     * 
     * 
     */
    public void setValue(List<RecordPropertyType> value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
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
        final DQQuantitativeResultType that = ((DQQuantitativeResultType) object);
        {
            boolean lhsFieldIsSet = this.isSetErrorStatistic();
            boolean rhsFieldIsSet = that.isSetErrorStatistic();
            CharacterStringPropertyType lhsField;
            lhsField = this.getErrorStatistic();
            CharacterStringPropertyType rhsField;
            rhsField = that.getErrorStatistic();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "errorStatistic", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "errorStatistic", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValueUnit();
            boolean rhsFieldIsSet = that.isSetValueUnit();
            UnitOfMeasurePropertyType lhsField;
            lhsField = this.getValueUnit();
            UnitOfMeasurePropertyType rhsField;
            rhsField = that.getValueUnit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueUnit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueUnit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValue();
            boolean rhsFieldIsSet = that.isSetValue();
            List<RecordPropertyType> lhsField;
            lhsField = (this.isSetValue()?this.getValue():null);
            List<RecordPropertyType> rhsField;
            rhsField = (that.isSetValue()?that.getValue():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValueType();
            boolean rhsFieldIsSet = that.isSetValueType();
            RecordTypePropertyType lhsField;
            lhsField = this.getValueType();
            RecordTypePropertyType rhsField;
            rhsField = that.getValueType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueType", rhsField);
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
            boolean theFieldIsSet = this.isSetValueType();
            RecordTypePropertyType theField;
            theField = this.getValueType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetValueUnit();
            UnitOfMeasurePropertyType theField;
            theField = this.getValueUnit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueUnit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetErrorStatistic();
            CharacterStringPropertyType theField;
            theField = this.getErrorStatistic();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "errorStatistic", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetValue();
            List<RecordPropertyType> theField;
            theField = (this.isSetValue()?this.getValue():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetValueType();
            RecordTypePropertyType theField;
            theField = this.getValueType();
            strategy.appendField(locator, this, "valueType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetValueUnit();
            UnitOfMeasurePropertyType theField;
            theField = this.getValueUnit();
            strategy.appendField(locator, this, "valueUnit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetErrorStatistic();
            CharacterStringPropertyType theField;
            theField = this.getErrorStatistic();
            strategy.appendField(locator, this, "errorStatistic", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetValue();
            List<RecordPropertyType> theField;
            theField = (this.isSetValue()?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
