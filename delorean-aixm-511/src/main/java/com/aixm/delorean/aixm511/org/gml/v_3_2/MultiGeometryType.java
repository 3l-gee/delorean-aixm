
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MultiGeometryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultiGeometryType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}geometryMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}geometryMembers" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiGeometryType", propOrder = {
    "geometryMember",
    "geometryMembers"
})
public class MultiGeometryType
    extends AbstractGeometricAggregateType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected List<GeometryPropertyType> geometryMember;
    /**
     * This property element contains a list of geometry elements. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    protected GeometryArrayPropertyType geometryMembers;

    /**
     * This property element either references a geometry element via the XLink-attributes or contains the geometry element.Gets the value of the geometryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeometryPropertyType }
     * 
     * 
     */
    public List<GeometryPropertyType> getGeometryMember() {
        if (geometryMember == null) {
            geometryMember = new ArrayList<>();
        }
        return this.geometryMember;
    }

    /**
     * This property element either references a geometry element via the XLink-attributes or contains the geometry element.
     * 
     */
    public void setGeometryMember(List<GeometryPropertyType> geometryMember) {
        this.geometryMember = geometryMember;
    }

    public boolean isSetGeometryMember() {
        return ((this.geometryMember!= null)&&(!this.geometryMember.isEmpty()));
    }

    public void unsetGeometryMember() {
        this.geometryMember = null;
    }

    /**
     * This property element contains a list of geometry elements. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public GeometryArrayPropertyType getGeometryMembers() {
        return geometryMembers;
    }

    /**
     * Sets the value of the geometryMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryArrayPropertyType }
     *     
     * @see #getGeometryMembers()
     */
    public void setGeometryMembers(GeometryArrayPropertyType value) {
        this.geometryMembers = value;
    }

    public boolean isSetGeometryMembers() {
        return (this.geometryMembers!= null);
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
        final MultiGeometryType that = ((MultiGeometryType) object);
        {
            boolean lhsFieldIsSet = this.isSetGeometryMembers();
            boolean rhsFieldIsSet = that.isSetGeometryMembers();
            GeometryArrayPropertyType lhsField;
            lhsField = this.getGeometryMembers();
            GeometryArrayPropertyType rhsField;
            rhsField = that.getGeometryMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometryMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometryMembers", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGeometryMember();
            boolean rhsFieldIsSet = that.isSetGeometryMember();
            List<GeometryPropertyType> lhsField;
            lhsField = (this.isSetGeometryMember()?this.getGeometryMember():null);
            List<GeometryPropertyType> rhsField;
            rhsField = (that.isSetGeometryMember()?that.getGeometryMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometryMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometryMember", rhsField);
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
            boolean theFieldIsSet = this.isSetGeometryMember();
            List<GeometryPropertyType> theField;
            theField = (this.isSetGeometryMember()?this.getGeometryMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometryMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeometryMembers();
            GeometryArrayPropertyType theField;
            theField = this.getGeometryMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometryMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetGeometryMember();
            List<GeometryPropertyType> theField;
            theField = (this.isSetGeometryMember()?this.getGeometryMember():null);
            strategy.appendField(locator, this, "geometryMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeometryMembers();
            GeometryArrayPropertyType theField;
            theField = this.getGeometryMembers();
            strategy.appendField(locator, this, "geometryMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
