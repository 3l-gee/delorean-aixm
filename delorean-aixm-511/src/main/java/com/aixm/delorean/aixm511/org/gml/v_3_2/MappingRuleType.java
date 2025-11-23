
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MappingRuleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MappingRuleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ruleDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ruleReference" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingRuleType", propOrder = {
    "ruleDefinition",
    "ruleReference"
})
public class MappingRuleType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    protected String ruleDefinition;
    protected ReferenceType ruleReference;

    /**
     * Gets the value of the ruleDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDefinition() {
        return ruleDefinition;
    }

    /**
     * Sets the value of the ruleDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDefinition(String value) {
        this.ruleDefinition = value;
    }

    public boolean isSetRuleDefinition() {
        return (this.ruleDefinition!= null);
    }

    /**
     * Gets the value of the ruleReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRuleReference() {
        return ruleReference;
    }

    /**
     * Sets the value of the ruleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRuleReference(ReferenceType value) {
        this.ruleReference = value;
    }

    public boolean isSetRuleReference() {
        return (this.ruleReference!= null);
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MappingRuleType that = ((MappingRuleType) object);
        {
            boolean lhsFieldIsSet = this.isSetRuleReference();
            boolean rhsFieldIsSet = that.isSetRuleReference();
            ReferenceType lhsField;
            lhsField = this.getRuleReference();
            ReferenceType rhsField;
            rhsField = that.getRuleReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ruleReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ruleReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRuleDefinition();
            boolean rhsFieldIsSet = that.isSetRuleDefinition();
            String lhsField;
            lhsField = this.getRuleDefinition();
            String rhsField;
            rhsField = that.getRuleDefinition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ruleDefinition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ruleDefinition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = this.isSetRuleDefinition();
            String theField;
            theField = this.getRuleDefinition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ruleDefinition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRuleReference();
            ReferenceType theField;
            theField = this.getRuleReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ruleReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = this.isSetRuleDefinition();
            String theField;
            theField = this.getRuleDefinition();
            strategy.appendField(locator, this, "ruleDefinition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRuleReference();
            ReferenceType theField;
            theField = this.getRuleReference();
            strategy.appendField(locator, this, "ruleReference", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
