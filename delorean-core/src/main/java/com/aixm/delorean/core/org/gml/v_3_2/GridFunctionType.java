
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlList;
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
 * <p>Java class for GridFunctionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GridFunctionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sequenceRule" type="{http://www.opengis.net/gml/3.2}SequenceRuleType" minOccurs="0"/>
 *         <element name="startPoint" type="{http://www.opengis.net/gml/3.2}integerList" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridFunctionType", propOrder = {
    "sequenceRule",
    "startPoint"
})
public class GridFunctionType implements Equals, HashCode, ToString
{

    protected SequenceRuleType sequenceRule;
    @XmlList
    protected List<BigInteger> startPoint;

    /**
     * Gets the value of the sequenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleType }
     *     
     */
    public SequenceRuleType getSequenceRule() {
        return sequenceRule;
    }

    /**
     * Sets the value of the sequenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleType }
     *     
     */
    public void setSequenceRule(SequenceRuleType value) {
        this.sequenceRule = value;
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getStartPoint() {
        if (startPoint == null) {
            startPoint = new ArrayList<>();
        }
        return this.startPoint;
    }

    /**
     * 
     * 
     */
    public void setStartPoint(List<BigInteger> startPoint) {
        this.startPoint = startPoint;
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
        final GridFunctionType that = ((GridFunctionType) object);
        {
            boolean lhsFieldIsSet = (this.sequenceRule!= null);
            boolean rhsFieldIsSet = (that.sequenceRule!= null);
            SequenceRuleType lhsField;
            lhsField = this.getSequenceRule();
            SequenceRuleType rhsField;
            rhsField = that.getSequenceRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sequenceRule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sequenceRule", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.startPoint!= null)&&(!this.startPoint.isEmpty()));
            boolean rhsFieldIsSet = ((that.startPoint!= null)&&(!that.startPoint.isEmpty()));
            List<BigInteger> lhsField;
            lhsField = (((this.startPoint!= null)&&(!this.startPoint.isEmpty()))?this.getStartPoint():null);
            List<BigInteger> rhsField;
            rhsField = (((that.startPoint!= null)&&(!that.startPoint.isEmpty()))?that.getStartPoint():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startPoint", rhsField);
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
            boolean theFieldIsSet = (this.sequenceRule!= null);
            SequenceRuleType theField;
            theField = this.getSequenceRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sequenceRule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.startPoint!= null)&&(!this.startPoint.isEmpty()));
            List<BigInteger> theField;
            theField = (((this.startPoint!= null)&&(!this.startPoint.isEmpty()))?this.getStartPoint():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startPoint", theField);
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
            boolean theFieldIsSet = (this.sequenceRule!= null);
            SequenceRuleType theField;
            theField = this.getSequenceRule();
            strategy.appendField(locator, this, "sequenceRule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.startPoint!= null)&&(!this.startPoint.isEmpty()));
            List<BigInteger> theField;
            theField = (((this.startPoint!= null)&&(!this.startPoint.isEmpty()))?this.getStartPoint():null);
            strategy.appendField(locator, this, "startPoint", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
