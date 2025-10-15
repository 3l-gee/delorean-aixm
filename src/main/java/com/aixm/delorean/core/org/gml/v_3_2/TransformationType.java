
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
 * <p>Java class for TransformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TransformationType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralTransformationType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}method"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}parameterValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformationType", propOrder = {
    "method",
    "parameterValue"
})
public class TransformationType
    extends AbstractGeneralTransformationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:method is an association role to the operation method used by a coordinate operation.
     * 
     */
    @XmlElementRef(name = "method", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationMethodPropertyType> method;
    @XmlElementRef(name = "parameterValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralParameterValuePropertyType>> parameterValue;

    /**
     * gml:method is an association role to the operation method used by a coordinate operation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationMethodPropertyType> getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}
     *     
     * @see #getMethod()
     */
    public void setMethod(JAXBElement<OperationMethodPropertyType> value) {
        this.method = value;
    }

    public boolean isSetMethod() {
        return (this.method!= null);
    }

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
        final TransformationType that = ((TransformationType) object);
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
        {
            boolean lhsFieldIsSet = this.isSetMethod();
            boolean rhsFieldIsSet = that.isSetMethod();
            JAXBElement<OperationMethodPropertyType> lhsField;
            lhsField = this.getMethod();
            JAXBElement<OperationMethodPropertyType> rhsField;
            rhsField = that.getMethod();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "method", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "method", rhsField);
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
            boolean theFieldIsSet = this.isSetMethod();
            JAXBElement<OperationMethodPropertyType> theField;
            theField = this.getMethod();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "method", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theField;
            theField = (this.isSetParameterValue()?this.getParameterValue():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parameterValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMethod();
            JAXBElement<OperationMethodPropertyType> theField;
            theField = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetParameterValue();
            List<JAXBElement<AbstractGeneralParameterValuePropertyType>> theField;
            theField = (this.isSetParameterValue()?this.getParameterValue():null);
            strategy.appendField(locator, this, "parameterValue", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
