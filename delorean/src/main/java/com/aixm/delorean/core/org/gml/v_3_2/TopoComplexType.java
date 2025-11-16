
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for TopoComplexType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TopoComplexType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}maximalComplex"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}superComplex" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}subComplex" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMembers" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *       <attribute name="isMaximal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoComplexType", propOrder = {
    "maximalComplex",
    "superComplex",
    "subComplex",
    "topoPrimitiveMember",
    "topoPrimitiveMembers"
})
public class TopoComplexType
    extends AbstractTopologyType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
     * 
     */
    @XmlElement(required = true)
    protected TopoComplexPropertyType maximalComplex;
    protected List<TopoComplexPropertyType> superComplex;
    protected List<TopoComplexPropertyType> subComplex;
    protected List<TopoPrimitiveMemberType> topoPrimitiveMember;
    /**
     * The gml:topoPrimitiveMembers property element encodes the relationship between a topology complex and an arbitrary number of topology primitives.
     * 
     */
    protected TopoPrimitiveArrayAssociationType topoPrimitiveMembers;
    @XmlAttribute(name = "isMaximal")
    protected java.lang.Boolean isMaximal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
     * 
     * @return
     *     possible object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public TopoComplexPropertyType getMaximalComplex() {
        return maximalComplex;
    }

    /**
     * Sets the value of the maximalComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoComplexPropertyType }
     *     
     * @see #getMaximalComplex()
     */
    public void setMaximalComplex(TopoComplexPropertyType value) {
        this.maximalComplex = value;
    }

    public boolean isSetMaximalComplex() {
        return (this.maximalComplex!= null);
    }

    /**
     * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.Gets the value of the superComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSuperComplex() {
        if (superComplex == null) {
            superComplex = new ArrayList<>();
        }
        return this.superComplex;
    }

    /**
     * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
     * 
     */
    public void setSuperComplex(List<TopoComplexPropertyType> superComplex) {
        this.superComplex = superComplex;
    }

    public boolean isSetSuperComplex() {
        return ((this.superComplex!= null)&&(!this.superComplex.isEmpty()));
    }

    public void unsetSuperComplex() {
        this.superComplex = null;
    }

    /**
     * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.Gets the value of the subComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSubComplex() {
        if (subComplex == null) {
            subComplex = new ArrayList<>();
        }
        return this.subComplex;
    }

    /**
     * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
     * 
     */
    public void setSubComplex(List<TopoComplexPropertyType> subComplex) {
        this.subComplex = subComplex;
    }

    public boolean isSetSubComplex() {
        return ((this.subComplex!= null)&&(!this.subComplex.isEmpty()));
    }

    public void unsetSubComplex() {
        this.subComplex = null;
    }

    /**
     * The gml:topoPrimitiveMember property element encodes for the relationship between a topology complex and a single topology primitive.Gets the value of the topoPrimitiveMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topoPrimitiveMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoPrimitiveMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoPrimitiveMemberType }
     * 
     * 
     */
    public List<TopoPrimitiveMemberType> getTopoPrimitiveMember() {
        if (topoPrimitiveMember == null) {
            topoPrimitiveMember = new ArrayList<>();
        }
        return this.topoPrimitiveMember;
    }

    /**
     * The gml:topoPrimitiveMember property element encodes for the relationship between a topology complex and a single topology primitive.
     * 
     */
    public void setTopoPrimitiveMember(List<TopoPrimitiveMemberType> topoPrimitiveMember) {
        this.topoPrimitiveMember = topoPrimitiveMember;
    }

    public boolean isSetTopoPrimitiveMember() {
        return ((this.topoPrimitiveMember!= null)&&(!this.topoPrimitiveMember.isEmpty()));
    }

    public void unsetTopoPrimitiveMember() {
        this.topoPrimitiveMember = null;
    }

    /**
     * The gml:topoPrimitiveMembers property element encodes the relationship between a topology complex and an arbitrary number of topology primitives.
     * 
     * @return
     *     possible object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
        return topoPrimitiveMembers;
    }

    /**
     * Sets the value of the topoPrimitiveMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     * @see #getTopoPrimitiveMembers()
     */
    public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value) {
        this.topoPrimitiveMembers = value;
    }

    public boolean isSetTopoPrimitiveMembers() {
        return (this.topoPrimitiveMembers!= null);
    }

    /**
     * Gets the value of the isMaximal property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean getIsMaximal() {
        if (isMaximal == null) {
            return false;
        } else {
            return isMaximal;
        }
    }

    /**
     * Sets the value of the isMaximal property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsMaximal(boolean value) {
        this.isMaximal = value;
    }

    public boolean isSetIsMaximal() {
        return (this.isMaximal!= null);
    }

    public void unsetIsMaximal() {
        this.isMaximal = null;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
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
        final TopoComplexType that = ((TopoComplexType) object);
        {
            boolean lhsFieldIsSet = this.isSetSubComplex();
            boolean rhsFieldIsSet = that.isSetSubComplex();
            List<TopoComplexPropertyType> lhsField;
            lhsField = (this.isSetSubComplex()?this.getSubComplex():null);
            List<TopoComplexPropertyType> rhsField;
            rhsField = (that.isSetSubComplex()?that.getSubComplex():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "subComplex", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "subComplex", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximalComplex();
            boolean rhsFieldIsSet = that.isSetMaximalComplex();
            TopoComplexPropertyType lhsField;
            lhsField = this.getMaximalComplex();
            TopoComplexPropertyType rhsField;
            rhsField = that.getMaximalComplex();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximalComplex", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximalComplex", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSuperComplex();
            boolean rhsFieldIsSet = that.isSetSuperComplex();
            List<TopoComplexPropertyType> lhsField;
            lhsField = (this.isSetSuperComplex()?this.getSuperComplex():null);
            List<TopoComplexPropertyType> rhsField;
            rhsField = (that.isSetSuperComplex()?that.getSuperComplex():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "superComplex", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "superComplex", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIsMaximal();
            boolean rhsFieldIsSet = that.isSetIsMaximal();
            boolean lhsField;
            lhsField = (this.isSetIsMaximal()?this.getIsMaximal():false);
            boolean rhsField;
            rhsField = (that.isSetIsMaximal()?that.getIsMaximal():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "isMaximal", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "isMaximal", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTopoPrimitiveMembers();
            boolean rhsFieldIsSet = that.isSetTopoPrimitiveMembers();
            TopoPrimitiveArrayAssociationType lhsField;
            lhsField = this.getTopoPrimitiveMembers();
            TopoPrimitiveArrayAssociationType rhsField;
            rhsField = that.getTopoPrimitiveMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "topoPrimitiveMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "topoPrimitiveMembers", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAggregationType();
            boolean rhsFieldIsSet = that.isSetAggregationType();
            AggregationType lhsField;
            lhsField = this.getAggregationType();
            AggregationType rhsField;
            rhsField = that.getAggregationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aggregationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aggregationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTopoPrimitiveMember();
            boolean rhsFieldIsSet = that.isSetTopoPrimitiveMember();
            List<TopoPrimitiveMemberType> lhsField;
            lhsField = (this.isSetTopoPrimitiveMember()?this.getTopoPrimitiveMember():null);
            List<TopoPrimitiveMemberType> rhsField;
            rhsField = (that.isSetTopoPrimitiveMember()?that.getTopoPrimitiveMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "topoPrimitiveMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "topoPrimitiveMember", rhsField);
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
            boolean theFieldIsSet = this.isSetMaximalComplex();
            TopoComplexPropertyType theField;
            theField = this.getMaximalComplex();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximalComplex", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSuperComplex();
            List<TopoComplexPropertyType> theField;
            theField = (this.isSetSuperComplex()?this.getSuperComplex():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "superComplex", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSubComplex();
            List<TopoComplexPropertyType> theField;
            theField = (this.isSetSubComplex()?this.getSubComplex():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "subComplex", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTopoPrimitiveMember();
            List<TopoPrimitiveMemberType> theField;
            theField = (this.isSetTopoPrimitiveMember()?this.getTopoPrimitiveMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "topoPrimitiveMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTopoPrimitiveMembers();
            TopoPrimitiveArrayAssociationType theField;
            theField = this.getTopoPrimitiveMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "topoPrimitiveMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIsMaximal();
            boolean theField;
            theField = (this.isSetIsMaximal()?this.getIsMaximal():false);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "isMaximal", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAggregationType();
            AggregationType theField;
            theField = this.getAggregationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aggregationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMaximalComplex();
            TopoComplexPropertyType theField;
            theField = this.getMaximalComplex();
            strategy.appendField(locator, this, "maximalComplex", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSuperComplex();
            List<TopoComplexPropertyType> theField;
            theField = (this.isSetSuperComplex()?this.getSuperComplex():null);
            strategy.appendField(locator, this, "superComplex", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSubComplex();
            List<TopoComplexPropertyType> theField;
            theField = (this.isSetSubComplex()?this.getSubComplex():null);
            strategy.appendField(locator, this, "subComplex", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTopoPrimitiveMember();
            List<TopoPrimitiveMemberType> theField;
            theField = (this.isSetTopoPrimitiveMember()?this.getTopoPrimitiveMember():null);
            strategy.appendField(locator, this, "topoPrimitiveMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTopoPrimitiveMembers();
            TopoPrimitiveArrayAssociationType theField;
            theField = this.getTopoPrimitiveMembers();
            strategy.appendField(locator, this, "topoPrimitiveMembers", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIsMaximal();
            boolean theField;
            theField = (this.isSetIsMaximal()?this.getIsMaximal():false);
            strategy.appendField(locator, this, "isMaximal", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAggregationType();
            AggregationType theField;
            theField = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
