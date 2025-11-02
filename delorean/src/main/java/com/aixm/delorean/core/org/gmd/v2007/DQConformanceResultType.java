
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.BooleanPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
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
 * quantitative_result from Quality Procedures -  - renamed to remove implied use limitiation.
 * 
 * <p>Java class for DQ_ConformanceResult_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DQ_ConformanceResult_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Result_Type">
 *       <sequence>
 *         <element name="specification" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/>
 *         <element name="explanation" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="pass" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_ConformanceResult_Type", propOrder = {
    "specification",
    "explanation",
    "pass"
})
public class DQConformanceResultType
    extends AbstractDQResultType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected CICitationPropertyType specification;
    @XmlElement(required = true)
    protected CharacterStringPropertyType explanation;
    @XmlElement(required = true)
    protected BooleanPropertyType pass;

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setSpecification(CICitationPropertyType value) {
        this.specification = value;
    }

    public boolean isSetSpecification() {
        return (this.specification!= null);
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setExplanation(CharacterStringPropertyType value) {
        this.explanation = value;
    }

    public boolean isSetExplanation() {
        return (this.explanation!= null);
    }

    /**
     * Gets the value of the pass property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setPass(BooleanPropertyType value) {
        this.pass = value;
    }

    public boolean isSetPass() {
        return (this.pass!= null);
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
        final DQConformanceResultType that = ((DQConformanceResultType) object);
        {
            boolean lhsFieldIsSet = this.isSetPass();
            boolean rhsFieldIsSet = that.isSetPass();
            BooleanPropertyType lhsField;
            lhsField = this.getPass();
            BooleanPropertyType rhsField;
            rhsField = that.getPass();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pass", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pass", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecification();
            boolean rhsFieldIsSet = that.isSetSpecification();
            CICitationPropertyType lhsField;
            lhsField = this.getSpecification();
            CICitationPropertyType rhsField;
            rhsField = that.getSpecification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specification", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExplanation();
            boolean rhsFieldIsSet = that.isSetExplanation();
            CharacterStringPropertyType lhsField;
            lhsField = this.getExplanation();
            CharacterStringPropertyType rhsField;
            rhsField = that.getExplanation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "explanation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "explanation", rhsField);
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
            boolean theFieldIsSet = this.isSetSpecification();
            CICitationPropertyType theField;
            theField = this.getSpecification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExplanation();
            CharacterStringPropertyType theField;
            theField = this.getExplanation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "explanation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPass();
            BooleanPropertyType theField;
            theField = this.getPass();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pass", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSpecification();
            CICitationPropertyType theField;
            theField = this.getSpecification();
            strategy.appendField(locator, this, "specification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExplanation();
            CharacterStringPropertyType theField;
            theField = this.getExplanation();
            strategy.appendField(locator, this, "explanation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPass();
            BooleanPropertyType theField;
            theField = this.getPass();
            strategy.appendField(locator, this, "pass", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
