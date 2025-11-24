
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
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
 * New metadata element, not found in ISO 19115, which is required to describe geographic data
 * 
 * <p>Java class for MD_ExtendedElementInformation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_ExtendedElementInformation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="shortName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="domainCode" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         <element name="definition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="obligation" type="{http://www.isotc211.org/2005/gmd}MD_ObligationCode_PropertyType" minOccurs="0"/>
 *         <element name="condition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="dataType" type="{http://www.isotc211.org/2005/gmd}MD_DatatypeCode_PropertyType"/>
 *         <element name="maximumOccurrence" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="domainValue" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="parentEntity" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         <element name="rule" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="source" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ExtendedElementInformation_Type", propOrder = {
    "name",
    "shortName",
    "domainCode",
    "definition",
    "obligation",
    "condition",
    "dataType",
    "maximumOccurrence",
    "domainValue",
    "parentEntity",
    "rule",
    "rationale",
    "source"
})
public class MDExtendedElementInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    protected CharacterStringPropertyType shortName;
    protected IntegerPropertyType domainCode;
    @XmlElement(required = true)
    protected CharacterStringPropertyType definition;
    protected MDObligationCodePropertyType obligation;
    protected CharacterStringPropertyType condition;
    @XmlElement(required = true)
    protected MDDatatypeCodePropertyType dataType;
    protected CharacterStringPropertyType maximumOccurrence;
    protected CharacterStringPropertyType domainValue;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> parentEntity;
    @XmlElement(required = true)
    protected CharacterStringPropertyType rule;
    protected List<CharacterStringPropertyType> rationale;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> source;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setShortName(CharacterStringPropertyType value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDomainCode(IntegerPropertyType value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDefinition(CharacterStringPropertyType value) {
        this.definition = value;
    }

    /**
     * Gets the value of the obligation property.
     * 
     * @return
     *     possible object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public MDObligationCodePropertyType getObligation() {
        return obligation;
    }

    /**
     * Sets the value of the obligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public void setObligation(MDObligationCodePropertyType value) {
        this.obligation = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCondition(CharacterStringPropertyType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public MDDatatypeCodePropertyType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public void setDataType(MDDatatypeCodePropertyType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the maximumOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMaximumOccurrence() {
        return maximumOccurrence;
    }

    /**
     * Sets the value of the maximumOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMaximumOccurrence(CharacterStringPropertyType value) {
        this.maximumOccurrence = value;
    }

    /**
     * Gets the value of the domainValue property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDomainValue() {
        return domainValue;
    }

    /**
     * Sets the value of the domainValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDomainValue(CharacterStringPropertyType value) {
        this.domainValue = value;
    }

    /**
     * Gets the value of the parentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getParentEntity() {
        if (parentEntity == null) {
            parentEntity = new ArrayList<>();
        }
        return this.parentEntity;
    }

    /**
     * 
     * 
     */
    public void setParentEntity(List<CharacterStringPropertyType> parentEntity) {
        this.parentEntity = parentEntity;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRule(CharacterStringPropertyType value) {
        this.rule = value;
    }

    /**
     * Gets the value of the rationale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rationale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRationale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getRationale() {
        if (rationale == null) {
            rationale = new ArrayList<>();
        }
        return this.rationale;
    }

    /**
     * 
     * 
     */
    public void setRationale(List<CharacterStringPropertyType> rationale) {
        this.rationale = rationale;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<>();
        }
        return this.source;
    }

    /**
     * 
     * 
     */
    public void setSource(List<CIResponsiblePartyPropertyType> source) {
        this.source = source;
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
        final MDExtendedElementInformationType that = ((MDExtendedElementInformationType) object);
        {
            boolean lhsFieldIsSet = (this.obligation!= null);
            boolean rhsFieldIsSet = (that.obligation!= null);
            MDObligationCodePropertyType lhsField;
            lhsField = this.getObligation();
            MDObligationCodePropertyType rhsField;
            rhsField = that.getObligation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obligation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obligation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.rule!= null);
            boolean rhsFieldIsSet = (that.rule!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getRule();
            CharacterStringPropertyType rhsField;
            rhsField = that.getRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rule", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()));
            boolean rhsFieldIsSet = ((that.parentEntity!= null)&&(!that.parentEntity.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.parentEntity!= null)&&(!that.parentEntity.isEmpty()))?that.getParentEntity():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "parentEntity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "parentEntity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.name!= null);
            boolean rhsFieldIsSet = (that.name!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.domainValue!= null);
            boolean rhsFieldIsSet = (that.domainValue!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getDomainValue();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDomainValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.shortName!= null);
            boolean rhsFieldIsSet = (that.shortName!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getShortName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getShortName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "shortName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "shortName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.definition!= null);
            boolean rhsFieldIsSet = (that.definition!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getDefinition();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDefinition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "definition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "definition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.dataType!= null);
            boolean rhsFieldIsSet = (that.dataType!= null);
            MDDatatypeCodePropertyType lhsField;
            lhsField = this.getDataType();
            MDDatatypeCodePropertyType rhsField;
            rhsField = that.getDataType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.source!= null)&&(!this.source.isEmpty()));
            boolean rhsFieldIsSet = ((that.source!= null)&&(!that.source.isEmpty()));
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (((that.source!= null)&&(!that.source.isEmpty()))?that.getSource():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "source", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "source", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.condition!= null);
            boolean rhsFieldIsSet = (that.condition!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getCondition();
            CharacterStringPropertyType rhsField;
            rhsField = that.getCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "condition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "condition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.domainCode!= null);
            boolean rhsFieldIsSet = (that.domainCode!= null);
            IntegerPropertyType lhsField;
            lhsField = this.getDomainCode();
            IntegerPropertyType rhsField;
            rhsField = that.getDomainCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.maximumOccurrence!= null);
            boolean rhsFieldIsSet = (that.maximumOccurrence!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getMaximumOccurrence();
            CharacterStringPropertyType rhsField;
            rhsField = that.getMaximumOccurrence();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumOccurrence", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumOccurrence", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.rationale!= null)&&(!this.rationale.isEmpty()));
            boolean rhsFieldIsSet = ((that.rationale!= null)&&(!that.rationale.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.rationale!= null)&&(!that.rationale.isEmpty()))?that.getRationale():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rationale", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rationale", rhsField);
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
            boolean theFieldIsSet = (this.name!= null);
            CharacterStringPropertyType theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.shortName!= null);
            CharacterStringPropertyType theField;
            theField = this.getShortName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "shortName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.domainCode!= null);
            IntegerPropertyType theField;
            theField = this.getDomainCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "domainCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.definition!= null);
            CharacterStringPropertyType theField;
            theField = this.getDefinition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "definition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.obligation!= null);
            MDObligationCodePropertyType theField;
            theField = this.getObligation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obligation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.condition!= null);
            CharacterStringPropertyType theField;
            theField = this.getCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "condition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataType!= null);
            MDDatatypeCodePropertyType theField;
            theField = this.getDataType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.maximumOccurrence!= null);
            CharacterStringPropertyType theField;
            theField = this.getMaximumOccurrence();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumOccurrence", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.domainValue!= null);
            CharacterStringPropertyType theField;
            theField = this.getDomainValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "domainValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "parentEntity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.rule!= null);
            CharacterStringPropertyType theField;
            theField = this.getRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.rationale!= null)&&(!this.rationale.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rationale", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.source!= null)&&(!this.source.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "source", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.name!= null);
            CharacterStringPropertyType theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.shortName!= null);
            CharacterStringPropertyType theField;
            theField = this.getShortName();
            strategy.appendField(locator, this, "shortName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.domainCode!= null);
            IntegerPropertyType theField;
            theField = this.getDomainCode();
            strategy.appendField(locator, this, "domainCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.definition!= null);
            CharacterStringPropertyType theField;
            theField = this.getDefinition();
            strategy.appendField(locator, this, "definition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.obligation!= null);
            MDObligationCodePropertyType theField;
            theField = this.getObligation();
            strategy.appendField(locator, this, "obligation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.condition!= null);
            CharacterStringPropertyType theField;
            theField = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataType!= null);
            MDDatatypeCodePropertyType theField;
            theField = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.maximumOccurrence!= null);
            CharacterStringPropertyType theField;
            theField = this.getMaximumOccurrence();
            strategy.appendField(locator, this, "maximumOccurrence", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.domainValue!= null);
            CharacterStringPropertyType theField;
            theField = this.getDomainValue();
            strategy.appendField(locator, this, "domainValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
            strategy.appendField(locator, this, "parentEntity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.rule!= null);
            CharacterStringPropertyType theField;
            theField = this.getRule();
            strategy.appendField(locator, this, "rule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.rationale!= null)&&(!this.rationale.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
            strategy.appendField(locator, this, "rationale", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.source!= null)&&(!this.source.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
