
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ParameterValueType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ParameterValueType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralParameterValueType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}value"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}dmsAngleValue"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}stringValue"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}integerValue"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}booleanValue"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}valueList"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}integerValueList"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}valueFile"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}operationParameter"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueType", propOrder = {
    "value",
    "dmsAngleValue",
    "stringValue",
    "integerValue",
    "booleanValue",
    "valueList",
    "integerValueList",
    "valueFile",
    "operationParameter"
})
public class ParameterValueType
    extends AbstractGeneralParameterValueType
{

    /**
     * gml:value is a numeric value of an operation parameter, with its associated unit of measure.
     * 
     */
    protected MeasureType value;
    protected DMSAngleType dmsAngleValue;
    /**
     * gml:stringValue is a character string value of an operation parameter. A string value does not have an associated unit of measure.
     * 
     */
    protected String stringValue;
    /**
     * gml:integerValue is a positive integer value of an operation parameter, usually used for a count. An integer value does not have an associated unit of measure.
     * 
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger integerValue;
    /**
     * gml:booleanValue is a boolean value of an operation parameter. A Boolean value does not have an associated unit of measure.
     * 
     */
    protected java.lang.Boolean booleanValue;
    /**
     * gml:valueList is an ordered sequence of two or more numeric values of an operation parameter list, where each value has the same associated unit of measure. An element of this type contains a space-separated sequence of double values.
     * 
     */
    protected MeasureListType valueList;
    @XmlList
    protected List<BigInteger> integerValueList;
    /**
     * gml:valueFile is a reference to a file or a part of a file containing one or more parameter values, each numeric value with its associated unit of measure. When referencing a part of a file, that file shall contain multiple identified parts, such as an XML encoded document. Furthermore, the referenced file or part of a file may reference another part of the same or different files, as allowed in XML documents.
     * 
     */
    @XmlSchemaType(name = "anyURI")
    protected String valueFile;
    /**
     * gml:operationParameter is an association role to the operation parameter of which this is a value.
     * 
     */
    @XmlElementRef(name = "operationParameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationParameterPropertyType> operationParameter;

    /**
     * gml:value is a numeric value of an operation parameter, with its associated unit of measure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getValue()
     */
    public void setValue(MeasureType value) {
        this.value = value;
    }

    /**
     * Gets the value of the dmsAngleValue property.
     * 
     * @return
     *     possible object is
     *     {@link DMSAngleType }
     *     
     */
    public DMSAngleType getDmsAngleValue() {
        return dmsAngleValue;
    }

    /**
     * Sets the value of the dmsAngleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSAngleType }
     *     
     */
    public void setDmsAngleValue(DMSAngleType value) {
        this.dmsAngleValue = value;
    }

    /**
     * gml:stringValue is a character string value of an operation parameter. A string value does not have an associated unit of measure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStringValue()
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * gml:integerValue is a positive integer value of an operation parameter, usually used for a count. An integer value does not have an associated unit of measure.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getIntegerValue()
     */
    public void setIntegerValue(BigInteger value) {
        this.integerValue = value;
    }

    /**
     * gml:booleanValue is a boolean value of an operation parameter. A Boolean value does not have an associated unit of measure.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     * @see #getBooleanValue()
     */
    public void setBooleanValue(java.lang.Boolean value) {
        this.booleanValue = value;
    }

    /**
     * gml:valueList is an ordered sequence of two or more numeric values of an operation parameter list, where each value has the same associated unit of measure. An element of this type contains a space-separated sequence of double values.
     * 
     * @return
     *     possible object is
     *     {@link MeasureListType }
     *     
     */
    public MeasureListType getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureListType }
     *     
     * @see #getValueList()
     */
    public void setValueList(MeasureListType value) {
        this.valueList = value;
    }

    /**
     * gml:integerValueList is an ordered sequence of two or more integer values of an operation parameter list, usually used for counts. These integer values do not have an associated unit of measure. An element of this type contains a space-separated sequence of integer values.Gets the value of the integerValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getIntegerValueList() {
        if (integerValueList == null) {
            integerValueList = new ArrayList<>();
        }
        return this.integerValueList;
    }

    /**
     * gml:integerValueList is an ordered sequence of two or more integer values of an operation parameter list, usually used for counts. These integer values do not have an associated unit of measure. An element of this type contains a space-separated sequence of integer values.
     * 
     */
    public void setIntegerValueList(List<BigInteger> integerValueList) {
        this.integerValueList = integerValueList;
    }

    /**
     * gml:valueFile is a reference to a file or a part of a file containing one or more parameter values, each numeric value with its associated unit of measure. When referencing a part of a file, that file shall contain multiple identified parts, such as an XML encoded document. Furthermore, the referenced file or part of a file may reference another part of the same or different files, as allowed in XML documents.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFile() {
        return valueFile;
    }

    /**
     * Sets the value of the valueFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValueFile()
     */
    public void setValueFile(String value) {
        this.valueFile = value;
    }

    /**
     * gml:operationParameter is an association role to the operation parameter of which this is a value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationParameterPropertyType> getOperationParameter() {
        return operationParameter;
    }

    /**
     * Sets the value of the operationParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     
     * @see #getOperationParameter()
     */
    public void setOperationParameter(JAXBElement<OperationParameterPropertyType> value) {
        this.operationParameter = value;
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
        final ParameterValueType that = ((ParameterValueType) object);
        {
            boolean lhsFieldIsSet = (this.dmsAngleValue!= null);
            boolean rhsFieldIsSet = (that.dmsAngleValue!= null);
            DMSAngleType lhsField;
            lhsField = this.getDmsAngleValue();
            DMSAngleType rhsField;
            rhsField = that.getDmsAngleValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dmsAngleValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dmsAngleValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.operationParameter!= null);
            boolean rhsFieldIsSet = (that.operationParameter!= null);
            JAXBElement<OperationParameterPropertyType> lhsField;
            lhsField = this.getOperationParameter();
            JAXBElement<OperationParameterPropertyType> rhsField;
            rhsField = that.getOperationParameter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operationParameter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operationParameter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.valueList!= null);
            boolean rhsFieldIsSet = (that.valueList!= null);
            MeasureListType lhsField;
            lhsField = this.getValueList();
            MeasureListType rhsField;
            rhsField = that.getValueList();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueList", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.booleanValue!= null);
            boolean rhsFieldIsSet = (that.booleanValue!= null);
            java.lang.Boolean lhsField;
            lhsField = this.getBooleanValue();
            java.lang.Boolean rhsField;
            rhsField = that.getBooleanValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "booleanValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "booleanValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()));
            boolean rhsFieldIsSet = ((that.integerValueList!= null)&&(!that.integerValueList.isEmpty()));
            List<BigInteger> lhsField;
            lhsField = (((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()))?this.getIntegerValueList():null);
            List<BigInteger> rhsField;
            rhsField = (((that.integerValueList!= null)&&(!that.integerValueList.isEmpty()))?that.getIntegerValueList():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "integerValueList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "integerValueList", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.valueFile!= null);
            boolean rhsFieldIsSet = (that.valueFile!= null);
            String lhsField;
            lhsField = this.getValueFile();
            String rhsField;
            rhsField = that.getValueFile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueFile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueFile", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.value!= null);
            boolean rhsFieldIsSet = (that.value!= null);
            MeasureType lhsField;
            lhsField = this.getValue();
            MeasureType rhsField;
            rhsField = that.getValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.stringValue!= null);
            boolean rhsFieldIsSet = (that.stringValue!= null);
            String lhsField;
            lhsField = this.getStringValue();
            String rhsField;
            rhsField = that.getStringValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "stringValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "stringValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.integerValue!= null);
            boolean rhsFieldIsSet = (that.integerValue!= null);
            BigInteger lhsField;
            lhsField = this.getIntegerValue();
            BigInteger rhsField;
            rhsField = that.getIntegerValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "integerValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "integerValue", rhsField);
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
            boolean theFieldIsSet = (this.value!= null);
            MeasureType theField;
            theField = this.getValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dmsAngleValue!= null);
            DMSAngleType theField;
            theField = this.getDmsAngleValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dmsAngleValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.stringValue!= null);
            String theField;
            theField = this.getStringValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "stringValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.integerValue!= null);
            BigInteger theField;
            theField = this.getIntegerValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "integerValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.booleanValue!= null);
            java.lang.Boolean theField;
            theField = this.getBooleanValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "booleanValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.valueList!= null);
            MeasureListType theField;
            theField = this.getValueList();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()));
            List<BigInteger> theField;
            theField = (((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()))?this.getIntegerValueList():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "integerValueList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.valueFile!= null);
            String theField;
            theField = this.getValueFile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueFile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.operationParameter!= null);
            JAXBElement<OperationParameterPropertyType> theField;
            theField = this.getOperationParameter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operationParameter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.value!= null);
            MeasureType theField;
            theField = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dmsAngleValue!= null);
            DMSAngleType theField;
            theField = this.getDmsAngleValue();
            strategy.appendField(locator, this, "dmsAngleValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.stringValue!= null);
            String theField;
            theField = this.getStringValue();
            strategy.appendField(locator, this, "stringValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.integerValue!= null);
            BigInteger theField;
            theField = this.getIntegerValue();
            strategy.appendField(locator, this, "integerValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.booleanValue!= null);
            java.lang.Boolean theField;
            theField = this.getBooleanValue();
            strategy.appendField(locator, this, "booleanValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.valueList!= null);
            MeasureListType theField;
            theField = this.getValueList();
            strategy.appendField(locator, this, "valueList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()));
            List<BigInteger> theField;
            theField = (((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()))?this.getIntegerValueList():null);
            strategy.appendField(locator, this, "integerValueList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.valueFile!= null);
            String theField;
            theField = this.getValueFile();
            strategy.appendField(locator, this, "valueFile", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.operationParameter!= null);
            JAXBElement<OperationParameterPropertyType> theField;
            theField = this.getOperationParameter();
            strategy.appendField(locator, this, "operationParameter", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
