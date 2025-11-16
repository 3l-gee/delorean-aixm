
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for OperationParameterGroupType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OperationParameterGroupType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralOperationParameterType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}maximumOccurs" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="2"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterGroupType", propOrder = {
    "maximumOccurs",
    "parameter"
})
public class OperationParameterGroupType
    extends AbstractGeneralOperationParameterType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:maximumOccurs is the maximum number of times that values for this parameter group may be included. If this attribute is omitted, the maximum number shall be one.
     * 
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumOccurs;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * gml:maximumOccurs is the maximum number of times that values for this parameter group may be included. If this attribute is omitted, the maximum number shall be one.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumOccurs() {
        return maximumOccurs;
    }

    /**
     * Sets the value of the maximumOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumOccurs()
     */
    public void setMaximumOccurs(BigInteger value) {
        this.maximumOccurs = value;
    }

    public boolean isSetMaximumOccurs() {
        return (this.maximumOccurs!= null);
    }

    /**
     * gml:parameter is an association to an operation parameter or parameter group.Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<>();
        }
        return this.parameter;
    }

    /**
     * gml:parameter is an association to an operation parameter or parameter group.
     * 
     */
    public void setParameter(List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter) {
        this.parameter = parameter;
    }

    public boolean isSetParameter() {
        return ((this.parameter!= null)&&(!this.parameter.isEmpty()));
    }

    public void unsetParameter() {
        this.parameter = null;
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
        final OperationParameterGroupType that = ((OperationParameterGroupType) object);
        {
            boolean lhsFieldIsSet = this.isSetParameter();
            boolean rhsFieldIsSet = that.isSetParameter();
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> lhsField;
            lhsField = (this.isSetParameter()?this.getParameter():null);
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> rhsField;
            rhsField = (that.isSetParameter()?that.getParameter():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parameter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parameter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumOccurs();
            boolean rhsFieldIsSet = that.isSetMaximumOccurs();
            BigInteger lhsField;
            lhsField = this.getMaximumOccurs();
            BigInteger rhsField;
            rhsField = that.getMaximumOccurs();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumOccurs", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumOccurs", rhsField);
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
            boolean theFieldIsSet = this.isSetMaximumOccurs();
            BigInteger theField;
            theField = this.getMaximumOccurs();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumOccurs", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetParameter();
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theField;
            theField = (this.isSetParameter()?this.getParameter():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parameter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMaximumOccurs();
            BigInteger theField;
            theField = this.getMaximumOccurs();
            strategy.appendField(locator, this, "maximumOccurs", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetParameter();
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theField;
            theField = (this.isSetParameter()?this.getParameter():null);
            strategy.appendField(locator, this, "parameter", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
