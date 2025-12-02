
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ParameterValueGroupType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ParameterValueGroupType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralParameterValueType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}parameterValue" maxOccurs="unbounded" minOccurs="2"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}group"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueGroupType", propOrder = {
    "parameterValue",
    "group"
})
public class ParameterValueGroupType
    extends AbstractGeneralParameterValueType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "parameterValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralParameterValuePropertyType>> parameterValue;
    /**
     * gml:group is an association role to the operation parameter group for which this element provides parameter values.
     * 
     */
    @XmlElementRef(name = "group", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationParameterGroupPropertyType> group;

    /**
     * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.Gets the value of the parameterValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralParameterValuePropertyType>> getParameterValue() {
        if (parameterValue == null) {
            parameterValue = new ArrayList<>();
        }
        return this.parameterValue;
    }

    /**
     * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
     * 
     */
    public void setParameterValue(List<JAXBElement<AbstractGeneralParameterValuePropertyType>> parameterValue) {
        this.parameterValue = parameterValue;
    }

    public boolean isSetParameterValue() {
        return ((this.parameterValue!= null)&&(!this.parameterValue.isEmpty()));
    }

    public void unsetParameterValue() {
        this.parameterValue = null;
    }

    /**
     * gml:group is an association role to the operation parameter group for which this element provides parameter values.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationParameterGroupPropertyType> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     
     * @see #getGroup()
     */
    public void setGroup(JAXBElement<OperationParameterGroupPropertyType> value) {
        this.group = value;
    }

    public boolean isSetGroup() {
        return (this.group!= null);
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
        final ParameterValueGroupType that = ((ParameterValueGroupType) object);
        {
            boolean lhsFieldIsSet = this.isSetGroup();
            boolean rhsFieldIsSet = that.isSetGroup();
            JAXBElement<OperationParameterGroupPropertyType> lhsField;
            lhsField = this.getGroup();
            JAXBElement<OperationParameterGroupPropertyType> rhsField;
            rhsField = that.getGroup();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "group", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "group", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetParameterValue();
            boolean rhsFieldIsSet = that.isSetParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> lhsField;
            lhsField = (this.isSetParameterValue()?this.getParameterValue():null);
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> rhsField;
            rhsField = (that.isSetParameterValue()?that.getParameterValue():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parameterValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parameterValue", rhsField);
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
            boolean theFieldIsSet = this.isSetParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theField;
            theField = (this.isSetParameterValue()?this.getParameterValue():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parameterValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            JAXBElement<OperationParameterGroupPropertyType> theField;
            theField = this.getGroup();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "group", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theField;
            theField = (this.isSetParameterValue()?this.getParameterValue():null);
            strategy.appendField(locator, this, "parameterValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            JAXBElement<OperationParameterGroupPropertyType> theField;
            theField = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
