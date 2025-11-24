
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * posList instances (and other instances with the content model specified by DirectPositionListType) hold the coordinates for a sequence of direct positions within the same coordinate reference system (CRS).
 * if no srsName attribute is given, the CRS shall be specified as part of the larger context this geometry element is part of, typically a geometric object like a point, curve, etc. 
 * The optional attribute count specifies the number of direct positions in the list. If the attribute count is present then the attribute srsDimension shall be present, too.
 * The number of entries in the list is equal to the product of the dimensionality of the coordinate reference system (i.e. it is a derived value of the coordinate reference system definition) and the number of direct positions.
 * 
 * <p>Java class for DirectPositionListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectPositionListType">
 *   <simpleContent>
 *     <extension base="<http://www.opengis.net/gml/3.2>doubleList">
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/>
 *       <attribute name="count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectPositionListType", propOrder = {
    "value"
})
public class DirectPositionListType implements Equals, HashCode, ToString
{

    @XmlValue
    protected List<Double> value;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger count;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;
    @XmlAttribute
    protected List<String> axisLabels;
    @XmlAttribute
    protected List<String> uomLabels;

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
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

    /**
     * A type for a list of values of the respective simple type.
     * 
     */
    public void setValue(List<Double> value) {
        this.value = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Gets the value of the srsDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Sets the value of the srsDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    /**
     * Gets the value of the axisLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisLabels() {
        if (axisLabels == null) {
            axisLabels = new ArrayList<>();
        }
        return this.axisLabels;
    }

    /**
     * 
     * 
     */
    public void setAxisLabels(List<String> axisLabels) {
        this.axisLabels = axisLabels;
    }

    /**
     * Gets the value of the uomLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uomLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUomLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUomLabels() {
        if (uomLabels == null) {
            uomLabels = new ArrayList<>();
        }
        return this.uomLabels;
    }

    /**
     * 
     * 
     */
    public void setUomLabels(List<String> uomLabels) {
        this.uomLabels = uomLabels;
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
        final DirectPositionListType that = ((DirectPositionListType) object);
        {
            boolean lhsFieldIsSet = ((this.value!= null)&&(!this.value.isEmpty()));
            boolean rhsFieldIsSet = ((that.value!= null)&&(!that.value.isEmpty()));
            List<Double> lhsField;
            lhsField = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            List<Double> rhsField;
            rhsField = (((that.value!= null)&&(!that.value.isEmpty()))?that.getValue():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.srsName!= null);
            boolean rhsFieldIsSet = (that.srsName!= null);
            String lhsField;
            lhsField = this.getSrsName();
            String rhsField;
            rhsField = that.getSrsName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "srsName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "srsName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.uomLabels!= null)&&(!that.uomLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            List<String> rhsField;
            rhsField = (((that.uomLabels!= null)&&(!that.uomLabels.isEmpty()))?that.getUomLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uomLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uomLabels", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.srsDimension!= null);
            boolean rhsFieldIsSet = (that.srsDimension!= null);
            BigInteger lhsField;
            lhsField = this.getSrsDimension();
            BigInteger rhsField;
            rhsField = that.getSrsDimension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "srsDimension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "srsDimension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.count!= null);
            boolean rhsFieldIsSet = (that.count!= null);
            BigInteger lhsField;
            lhsField = this.getCount();
            BigInteger rhsField;
            rhsField = that.getCount();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "count", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "count", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            boolean rhsFieldIsSet = ((that.axisLabels!= null)&&(!that.axisLabels.isEmpty()));
            List<String> lhsField;
            lhsField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            List<String> rhsField;
            rhsField = (((that.axisLabels!= null)&&(!that.axisLabels.isEmpty()))?that.getAxisLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisLabels", rhsField);
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
            List<Double> theField;
            theField = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.count!= null);
            BigInteger theField;
            theField = this.getCount();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "count", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsName!= null);
            String theField;
            theField = this.getSrsName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsDimension!= null);
            BigInteger theField;
            theField = this.getSrsDimension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsDimension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisLabels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            List<String> theField;
            theField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uomLabels", theField);
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
            List<Double> theField;
            theField = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.count!= null);
            BigInteger theField;
            theField = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsName!= null);
            String theField;
            theField = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.srsDimension!= null);
            BigInteger theField;
            theField = this.getSrsDimension();
            strategy.appendField(locator, this, "srsDimension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
            List<String> theField;
            theField = (((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()))?this.getAxisLabels():null);
            strategy.appendField(locator, this, "axisLabels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
            List<String> theField;
            theField = (((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()))?this.getUomLabels():null);
            strategy.appendField(locator, this, "uomLabels", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
