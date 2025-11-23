
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for OperationMethodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OperationMethodType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}formulaCitation"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}formula"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}sourceDimensions" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}targetDimensions" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMethodType", propOrder = {
    "formulaCitation",
    "formula",
    "sourceDimensions",
    "targetDimensions",
    "parameter"
})
public class OperationMethodType
    extends IdentifiedObjectType
{

    /**
     * gml:formulaCitation provides a reference to a publication giving the formula(s) or procedure used by an coordinate operation method.
     * 
     */
    protected FormulaCitation formulaCitation;
    /**
     * gml:formula Formula(s) or procedure used by an operation method. The use of the codespace attribite has been deprecated. The property value shall be a character string.
     * 
     */
    @XmlElementRef(name = "formula", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeType> formula;
    /**
     * gml:sourceDimensions is the number of dimensions in the source CRS of this operation method.
     * 
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceDimensions;
    /**
     * gml:targetDimensions is the number of dimensions in the target CRS of this operation method.
     * 
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetDimensions;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * gml:formulaCitation provides a reference to a publication giving the formula(s) or procedure used by an coordinate operation method.
     * 
     * @return
     *     possible object is
     *     {@link FormulaCitation }
     *     
     */
    public FormulaCitation getFormulaCitation() {
        return formulaCitation;
    }

    /**
     * Sets the value of the formulaCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaCitation }
     *     
     * @see #getFormulaCitation()
     */
    public void setFormulaCitation(FormulaCitation value) {
        this.formulaCitation = value;
    }

    /**
     * gml:formula Formula(s) or procedure used by an operation method. The use of the codespace attribite has been deprecated. The property value shall be a character string.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     * @see #getFormula()
     */
    public void setFormula(JAXBElement<CodeType> value) {
        this.formula = value;
    }

    /**
     * gml:sourceDimensions is the number of dimensions in the source CRS of this operation method.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDimensions() {
        return sourceDimensions;
    }

    /**
     * Sets the value of the sourceDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSourceDimensions()
     */
    public void setSourceDimensions(BigInteger value) {
        this.sourceDimensions = value;
    }

    /**
     * gml:targetDimensions is the number of dimensions in the target CRS of this operation method.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetDimensions() {
        return targetDimensions;
    }

    /**
     * Sets the value of the targetDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTargetDimensions()
     */
    public void setTargetDimensions(BigInteger value) {
        this.targetDimensions = value;
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
        final OperationMethodType that = ((OperationMethodType) object);
        {
            boolean lhsFieldIsSet = (this.formula!= null);
            boolean rhsFieldIsSet = (that.formula!= null);
            JAXBElement<CodeType> lhsField;
            lhsField = this.getFormula();
            JAXBElement<CodeType> rhsField;
            rhsField = that.getFormula();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "formula", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "formula", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.formulaCitation!= null);
            boolean rhsFieldIsSet = (that.formulaCitation!= null);
            FormulaCitation lhsField;
            lhsField = this.getFormulaCitation();
            FormulaCitation rhsField;
            rhsField = that.getFormulaCitation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "formulaCitation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "formulaCitation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.parameter!= null)&&(!this.parameter.isEmpty()));
            boolean rhsFieldIsSet = ((that.parameter!= null)&&(!that.parameter.isEmpty()));
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> lhsField;
            lhsField = (((this.parameter!= null)&&(!this.parameter.isEmpty()))?this.getParameter():null);
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> rhsField;
            rhsField = (((that.parameter!= null)&&(!that.parameter.isEmpty()))?that.getParameter():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parameter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parameter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.sourceDimensions!= null);
            boolean rhsFieldIsSet = (that.sourceDimensions!= null);
            BigInteger lhsField;
            lhsField = this.getSourceDimensions();
            BigInteger rhsField;
            rhsField = that.getSourceDimensions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sourceDimensions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sourceDimensions", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.targetDimensions!= null);
            boolean rhsFieldIsSet = (that.targetDimensions!= null);
            BigInteger lhsField;
            lhsField = this.getTargetDimensions();
            BigInteger rhsField;
            rhsField = that.getTargetDimensions();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "targetDimensions", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "targetDimensions", rhsField);
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
            boolean theFieldIsSet = (this.formulaCitation!= null);
            FormulaCitation theField;
            theField = this.getFormulaCitation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "formulaCitation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.formula!= null);
            JAXBElement<CodeType> theField;
            theField = this.getFormula();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "formula", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.sourceDimensions!= null);
            BigInteger theField;
            theField = this.getSourceDimensions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sourceDimensions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.targetDimensions!= null);
            BigInteger theField;
            theField = this.getTargetDimensions();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "targetDimensions", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.parameter!= null)&&(!this.parameter.isEmpty()));
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theField;
            theField = (((this.parameter!= null)&&(!this.parameter.isEmpty()))?this.getParameter():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parameter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.formulaCitation!= null);
            FormulaCitation theField;
            theField = this.getFormulaCitation();
            strategy.appendField(locator, this, "formulaCitation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.formula!= null);
            JAXBElement<CodeType> theField;
            theField = this.getFormula();
            strategy.appendField(locator, this, "formula", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.sourceDimensions!= null);
            BigInteger theField;
            theField = this.getSourceDimensions();
            strategy.appendField(locator, this, "sourceDimensions", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.targetDimensions!= null);
            BigInteger theField;
            theField = this.getTargetDimensions();
            strategy.appendField(locator, this, "targetDimensions", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.parameter!= null)&&(!this.parameter.isEmpty()));
            List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> theField;
            theField = (((this.parameter!= null)&&(!this.parameter.isEmpty()))?this.getParameter():null);
            strategy.appendField(locator, this, "parameter", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
