
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@Embeddable
public class DirectPositionListType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    /**
     * A type for a list of values of the respective simple type.
     * 
     */
    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected String value;
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
     * A type for a list of values of the respective simple type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VALUE_")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Transient
    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "COUNT_", precision = 20, scale = 0)
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

    @Transient
    public boolean isSetCount() {
        return (this.count!= null);
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SRS_NAME")
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

    @Transient
    public boolean isSetSrsName() {
        return (this.srsName!= null);
    }

    /**
     * Gets the value of the srsDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "SRS_DIMENSION", precision = 20, scale = 0)
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

    @Transient
    public boolean isSetSrsDimension() {
        return (this.srsDimension!= null);
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
    @Transient
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

    @Transient
    public boolean isSetAxisLabels() {
        return ((this.axisLabels!= null)&&(!this.axisLabels.isEmpty()));
    }

    public void unsetAxisLabels() {
        this.axisLabels = null;
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
    @Transient
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

    @Transient
    public boolean isSetUomLabels() {
        return ((this.uomLabels!= null)&&(!this.uomLabels.isEmpty()));
    }

    public void unsetUomLabels() {
        this.uomLabels = null;
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
            boolean lhsFieldIsSet = this.isSetCount();
            boolean rhsFieldIsSet = that.isSetCount();
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
            boolean lhsFieldIsSet = this.isSetValue();
            boolean rhsFieldIsSet = that.isSetValue();
            String lhsField;
            lhsField = this.getValue();
            String rhsField;
            rhsField = that.getValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAxisLabels();
            boolean rhsFieldIsSet = that.isSetAxisLabels();
            List<String> lhsField;
            lhsField = (this.isSetAxisLabels()?this.getAxisLabels():null);
            List<String> rhsField;
            rhsField = (that.isSetAxisLabels()?that.getAxisLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisLabels", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSrsDimension();
            boolean rhsFieldIsSet = that.isSetSrsDimension();
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
            boolean lhsFieldIsSet = this.isSetSrsName();
            boolean rhsFieldIsSet = that.isSetSrsName();
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
            boolean lhsFieldIsSet = this.isSetUomLabels();
            boolean rhsFieldIsSet = that.isSetUomLabels();
            List<String> lhsField;
            lhsField = (this.isSetUomLabels()?this.getUomLabels():null);
            List<String> rhsField;
            rhsField = (that.isSetUomLabels()?that.getUomLabels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uomLabels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uomLabels", rhsField);
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
            boolean theFieldIsSet = this.isSetValue();
            String theField;
            theField = this.getValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCount();
            BigInteger theField;
            theField = this.getCount();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "count", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSrsName();
            String theField;
            theField = this.getSrsName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSrsDimension();
            BigInteger theField;
            theField = this.getSrsDimension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "srsDimension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAxisLabels();
            List<String> theField;
            theField = (this.isSetAxisLabels()?this.getAxisLabels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisLabels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUomLabels();
            List<String> theField;
            theField = (this.isSetUomLabels()?this.getUomLabels():null);
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
            boolean theFieldIsSet = this.isSetValue();
            String theField;
            theField = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCount();
            BigInteger theField;
            theField = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSrsName();
            String theField;
            theField = this.getSrsName();
            strategy.appendField(locator, this, "srsName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSrsDimension();
            BigInteger theField;
            theField = this.getSrsDimension();
            strategy.appendField(locator, this, "srsDimension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAxisLabels();
            List<String> theField;
            theField = (this.isSetAxisLabels()?this.getAxisLabels():null);
            strategy.appendField(locator, this, "axisLabels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUomLabels();
            List<String> theField;
            theField = (this.isSetUomLabels()?this.getUomLabels():null);
            strategy.appendField(locator, this, "uomLabels", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
