
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 * gml:MeasureOrNilReasonListType provides for a list of quantities. An instance element may also include embedded values from NilReasonType. It is intended to be used in situations where a value is expected, but the value may be absent for some reason.
 * 
 * <p>Java class for MeasureOrNilReasonListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeasureOrNilReasonListType">
 *   <simpleContent>
 *     <extension base="<http://www.opengis.net/gml/3.2>doubleOrNilReasonList">
 *       <attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureOrNilReasonListType", propOrder = {
    "value"
})
@XmlSeeAlso({
    QuantityExtentType.class
})
public class MeasureOrNilReasonListType implements Equals, HashCode, ToString
{

    @XmlValue
    protected List<String> value;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * A type for a list of values of the respective simple type.Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

    /**
     * A type for a list of values of the respective simple type.
     * 
     */
    public void setValue(List<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
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
        final MeasureOrNilReasonListType that = ((MeasureOrNilReasonListType) object);
        {
            boolean lhsFieldIsSet = ((this.value!= null)&&(!this.value.isEmpty()));
            boolean rhsFieldIsSet = ((that.value!= null)&&(!that.value.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            List<String> rhsField;
            rhsField = (((that.value!= null)&&(!that.value.isEmpty()))?that.getValue():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.uom!= null);
            boolean rhsFieldIsSet = (that.uom!= null);
            String lhsField;
            lhsField = this.getUom();
            String rhsField;
            rhsField = that.getUom();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uom", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uom", rhsField);
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
            boolean theFieldIsSet = ((this.value!= null)&&(!this.value.isEmpty()));
            List<String> theField;
            theField = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.uom!= null);
            String theField;
            theField = this.getUom();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uom", theField);
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
            boolean theFieldIsSet = ((this.value!= null)&&(!this.value.isEmpty()));
            List<String> theField;
            theField = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.uom!= null);
            String theField;
            theField = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
