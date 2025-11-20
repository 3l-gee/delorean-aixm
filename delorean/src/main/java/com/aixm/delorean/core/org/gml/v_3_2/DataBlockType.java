
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for DataBlockType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataBlockType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}rangeParameters"/>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}tupleList"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}doubleOrNilReasonTupleList"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataBlockType", propOrder = {
    "rangeParameters",
    "tupleList",
    "doubleOrNilReasonTupleList"
})
public class DataBlockType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected AssociationRoleType rangeParameters;
    /**
     * gml:CoordinatesType consists of a list of coordinate tuples, with each coordinate tuple separated by the ts or tuple separator (whitespace), and each coordinate in the tuple by the cs or coordinate separator (comma).
     * The gml:tupleList encoding is effectively "band-interleaved".
     * 
     */
    protected CoordinatesType tupleList;
    @XmlList
    protected List<String> doubleOrNilReasonTupleList;

    /**
     * Gets the value of the rangeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getRangeParameters() {
        return rangeParameters;
    }

    /**
     * Sets the value of the rangeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setRangeParameters(AssociationRoleType value) {
        this.rangeParameters = value;
    }

    public boolean isSetRangeParameters() {
        return (this.rangeParameters!= null);
    }

    /**
     * gml:CoordinatesType consists of a list of coordinate tuples, with each coordinate tuple separated by the ts or tuple separator (whitespace), and each coordinate in the tuple by the cs or coordinate separator (comma).
     * The gml:tupleList encoding is effectively "band-interleaved".
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getTupleList() {
        return tupleList;
    }

    /**
     * Sets the value of the tupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     * @see #getTupleList()
     */
    public void setTupleList(CoordinatesType value) {
        this.tupleList = value;
    }

    public boolean isSetTupleList() {
        return (this.tupleList!= null);
    }

    /**
     * gml:doubleOrNilReasonList consists of a list of gml:doubleOrNilReason values, each separated by a whitespace. The gml:doubleOrNilReason values are grouped into tuples where the dimension of each tuple in the list is equal to the number of range parameters.Gets the value of the doubleOrNilReasonTupleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doubleOrNilReasonTupleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoubleOrNilReasonTupleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDoubleOrNilReasonTupleList() {
        if (doubleOrNilReasonTupleList == null) {
            doubleOrNilReasonTupleList = new ArrayList<>();
        }
        return this.doubleOrNilReasonTupleList;
    }

    /**
     * gml:doubleOrNilReasonList consists of a list of gml:doubleOrNilReason values, each separated by a whitespace. The gml:doubleOrNilReason values are grouped into tuples where the dimension of each tuple in the list is equal to the number of range parameters.
     * 
     */
    public void setDoubleOrNilReasonTupleList(List<String> doubleOrNilReasonTupleList) {
        this.doubleOrNilReasonTupleList = doubleOrNilReasonTupleList;
    }

    public boolean isSetDoubleOrNilReasonTupleList() {
        return ((this.doubleOrNilReasonTupleList!= null)&&(!this.doubleOrNilReasonTupleList.isEmpty()));
    }

    public void unsetDoubleOrNilReasonTupleList() {
        this.doubleOrNilReasonTupleList = null;
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
        final DataBlockType that = ((DataBlockType) object);
        {
            boolean lhsFieldIsSet = this.isSetRangeParameters();
            boolean rhsFieldIsSet = that.isSetRangeParameters();
            AssociationRoleType lhsField;
            lhsField = this.getRangeParameters();
            AssociationRoleType rhsField;
            rhsField = that.getRangeParameters();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rangeParameters", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rangeParameters", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTupleList();
            boolean rhsFieldIsSet = that.isSetTupleList();
            CoordinatesType lhsField;
            lhsField = this.getTupleList();
            CoordinatesType rhsField;
            rhsField = that.getTupleList();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "tupleList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "tupleList", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDoubleOrNilReasonTupleList();
            boolean rhsFieldIsSet = that.isSetDoubleOrNilReasonTupleList();
            List<String> lhsField;
            lhsField = (this.isSetDoubleOrNilReasonTupleList()?this.getDoubleOrNilReasonTupleList():null);
            List<String> rhsField;
            rhsField = (that.isSetDoubleOrNilReasonTupleList()?that.getDoubleOrNilReasonTupleList():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "doubleOrNilReasonTupleList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "doubleOrNilReasonTupleList", rhsField);
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
            boolean theFieldIsSet = this.isSetRangeParameters();
            AssociationRoleType theField;
            theField = this.getRangeParameters();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rangeParameters", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTupleList();
            CoordinatesType theField;
            theField = this.getTupleList();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "tupleList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDoubleOrNilReasonTupleList();
            List<String> theField;
            theField = (this.isSetDoubleOrNilReasonTupleList()?this.getDoubleOrNilReasonTupleList():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "doubleOrNilReasonTupleList", theField);
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
            boolean theFieldIsSet = this.isSetRangeParameters();
            AssociationRoleType theField;
            theField = this.getRangeParameters();
            strategy.appendField(locator, this, "rangeParameters", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTupleList();
            CoordinatesType theField;
            theField = this.getTupleList();
            strategy.appendField(locator, this, "tupleList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDoubleOrNilReasonTupleList();
            List<String> theField;
            theField = (this.isSetDoubleOrNilReasonTupleList()?this.getDoubleOrNilReasonTupleList():null);
            strategy.appendField(locator, this, "doubleOrNilReasonTupleList", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
