
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DateTimePropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractDQ_Element_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractDQ_Element_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="nameOfMeasure" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="measureIdentification" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         <element name="measureDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="evaluationMethodType" type="{http://www.isotc211.org/2005/gmd}DQ_EvaluationMethodTypeCode_PropertyType" minOccurs="0"/>
 *         <element name="evaluationMethodDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="evaluationProcedure" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         <element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="result" type="{http://www.isotc211.org/2005/gmd}DQ_Result_PropertyType" maxOccurs="2"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDQ_Element_Type", propOrder = {
    "nameOfMeasure",
    "measureIdentification",
    "measureDescription",
    "evaluationMethodType",
    "evaluationMethodDescription",
    "evaluationProcedure",
    "dateTime",
    "result"
})
@XmlSeeAlso({
    AbstractDQTemporalAccuracyType.class,
    AbstractDQThematicAccuracyType.class,
    AbstractDQPositionalAccuracyType.class,
    AbstractDQLogicalConsistencyType.class,
    AbstractDQCompletenessType.class
})
public abstract class AbstractDQElementType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<CharacterStringPropertyType> nameOfMeasure;
    protected MDIdentifierPropertyType measureIdentification;
    protected CharacterStringPropertyType measureDescription;
    protected DQEvaluationMethodTypeCodePropertyType evaluationMethodType;
    protected CharacterStringPropertyType evaluationMethodDescription;
    protected CICitationPropertyType evaluationProcedure;
    protected List<DateTimePropertyType> dateTime;
    @XmlElement(required = true)
    protected List<DQResultPropertyType> result;

    /**
     * Gets the value of the nameOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getNameOfMeasure() {
        if (nameOfMeasure == null) {
            nameOfMeasure = new ArrayList<>();
        }
        return this.nameOfMeasure;
    }

    /**
     * 
     * 
     */
    public void setNameOfMeasure(List<CharacterStringPropertyType> nameOfMeasure) {
        this.nameOfMeasure = nameOfMeasure;
    }

    public boolean isSetNameOfMeasure() {
        return ((this.nameOfMeasure!= null)&&(!this.nameOfMeasure.isEmpty()));
    }

    public void unsetNameOfMeasure() {
        this.nameOfMeasure = null;
    }

    /**
     * Gets the value of the measureIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getMeasureIdentification() {
        return measureIdentification;
    }

    /**
     * Sets the value of the measureIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setMeasureIdentification(MDIdentifierPropertyType value) {
        this.measureIdentification = value;
    }

    public boolean isSetMeasureIdentification() {
        return (this.measureIdentification!= null);
    }

    /**
     * Gets the value of the measureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMeasureDescription() {
        return measureDescription;
    }

    /**
     * Sets the value of the measureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMeasureDescription(CharacterStringPropertyType value) {
        this.measureDescription = value;
    }

    public boolean isSetMeasureDescription() {
        return (this.measureDescription!= null);
    }

    /**
     * Gets the value of the evaluationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType() {
        return evaluationMethodType;
    }

    /**
     * Sets the value of the evaluationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public void setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType value) {
        this.evaluationMethodType = value;
    }

    public boolean isSetEvaluationMethodType() {
        return (this.evaluationMethodType!= null);
    }

    /**
     * Gets the value of the evaluationMethodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEvaluationMethodDescription() {
        return evaluationMethodDescription;
    }

    /**
     * Sets the value of the evaluationMethodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEvaluationMethodDescription(CharacterStringPropertyType value) {
        this.evaluationMethodDescription = value;
    }

    public boolean isSetEvaluationMethodDescription() {
        return (this.evaluationMethodDescription!= null);
    }

    /**
     * Gets the value of the evaluationProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getEvaluationProcedure() {
        return evaluationProcedure;
    }

    /**
     * Sets the value of the evaluationProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setEvaluationProcedure(CICitationPropertyType value) {
        this.evaluationProcedure = value;
    }

    public boolean isSetEvaluationProcedure() {
        return (this.evaluationProcedure!= null);
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePropertyType }
     * 
     * 
     */
    public List<DateTimePropertyType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<>();
        }
        return this.dateTime;
    }

    /**
     * 
     * 
     */
    public void setDateTime(List<DateTimePropertyType> dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isSetDateTime() {
        return ((this.dateTime!= null)&&(!this.dateTime.isEmpty()));
    }

    public void unsetDateTime() {
        this.dateTime = null;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQResultPropertyType }
     * 
     * 
     */
    public List<DQResultPropertyType> getResult() {
        if (result == null) {
            result = new ArrayList<>();
        }
        return this.result;
    }

    /**
     * 
     * 
     */
    public void setResult(List<DQResultPropertyType> result) {
        this.result = result;
    }

    public boolean isSetResult() {
        return ((this.result!= null)&&(!this.result.isEmpty()));
    }

    public void unsetResult() {
        this.result = null;
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
        final AbstractDQElementType that = ((AbstractDQElementType) object);
        {
            boolean lhsFieldIsSet = this.isSetMeasureDescription();
            boolean rhsFieldIsSet = that.isSetMeasureDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getMeasureDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getMeasureDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "measureDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "measureDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationMethodDescription();
            boolean rhsFieldIsSet = that.isSetEvaluationMethodDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getEvaluationMethodDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getEvaluationMethodDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationMethodDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationMethodDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationProcedure();
            boolean rhsFieldIsSet = that.isSetEvaluationProcedure();
            CICitationPropertyType lhsField;
            lhsField = this.getEvaluationProcedure();
            CICitationPropertyType rhsField;
            rhsField = that.getEvaluationProcedure();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationProcedure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationProcedure", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDateTime();
            boolean rhsFieldIsSet = that.isSetDateTime();
            List<DateTimePropertyType> lhsField;
            lhsField = (this.isSetDateTime()?this.getDateTime():null);
            List<DateTimePropertyType> rhsField;
            rhsField = (that.isSetDateTime()?that.getDateTime():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMeasureIdentification();
            boolean rhsFieldIsSet = that.isSetMeasureIdentification();
            MDIdentifierPropertyType lhsField;
            lhsField = this.getMeasureIdentification();
            MDIdentifierPropertyType rhsField;
            rhsField = that.getMeasureIdentification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "measureIdentification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "measureIdentification", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetResult();
            boolean rhsFieldIsSet = that.isSetResult();
            List<DQResultPropertyType> lhsField;
            lhsField = (this.isSetResult()?this.getResult():null);
            List<DQResultPropertyType> rhsField;
            rhsField = (that.isSetResult()?that.getResult():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "result", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "result", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNameOfMeasure();
            boolean rhsFieldIsSet = that.isSetNameOfMeasure();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetNameOfMeasure()?this.getNameOfMeasure():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetNameOfMeasure()?that.getNameOfMeasure():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nameOfMeasure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nameOfMeasure", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationMethodType();
            boolean rhsFieldIsSet = that.isSetEvaluationMethodType();
            DQEvaluationMethodTypeCodePropertyType lhsField;
            lhsField = this.getEvaluationMethodType();
            DQEvaluationMethodTypeCodePropertyType rhsField;
            rhsField = that.getEvaluationMethodType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationMethodType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationMethodType", rhsField);
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
            boolean theFieldIsSet = this.isSetNameOfMeasure();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetNameOfMeasure()?this.getNameOfMeasure():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nameOfMeasure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMeasureIdentification();
            MDIdentifierPropertyType theField;
            theField = this.getMeasureIdentification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "measureIdentification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMeasureDescription();
            CharacterStringPropertyType theField;
            theField = this.getMeasureDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "measureDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodType();
            DQEvaluationMethodTypeCodePropertyType theField;
            theField = this.getEvaluationMethodType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "evaluationMethodType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodDescription();
            CharacterStringPropertyType theField;
            theField = this.getEvaluationMethodDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "evaluationMethodDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationProcedure();
            CICitationPropertyType theField;
            theField = this.getEvaluationProcedure();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "evaluationProcedure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateTime();
            List<DateTimePropertyType> theField;
            theField = (this.isSetDateTime()?this.getDateTime():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResult();
            List<DQResultPropertyType> theField;
            theField = (this.isSetResult()?this.getResult():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "result", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetNameOfMeasure();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetNameOfMeasure()?this.getNameOfMeasure():null);
            strategy.appendField(locator, this, "nameOfMeasure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMeasureIdentification();
            MDIdentifierPropertyType theField;
            theField = this.getMeasureIdentification();
            strategy.appendField(locator, this, "measureIdentification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMeasureDescription();
            CharacterStringPropertyType theField;
            theField = this.getMeasureDescription();
            strategy.appendField(locator, this, "measureDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodType();
            DQEvaluationMethodTypeCodePropertyType theField;
            theField = this.getEvaluationMethodType();
            strategy.appendField(locator, this, "evaluationMethodType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodDescription();
            CharacterStringPropertyType theField;
            theField = this.getEvaluationMethodDescription();
            strategy.appendField(locator, this, "evaluationMethodDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationProcedure();
            CICitationPropertyType theField;
            theField = this.getEvaluationProcedure();
            strategy.appendField(locator, this, "evaluationProcedure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateTime();
            List<DateTimePropertyType> theField;
            theField = (this.isSetDateTime()?this.getDateTime():null);
            strategy.appendField(locator, this, "dateTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResult();
            List<DQResultPropertyType> theField;
            theField = (this.isSetResult()?this.getResult():null);
            strategy.appendField(locator, this, "result", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
