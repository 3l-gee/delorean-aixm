
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for MultiPointType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultiPointType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}pointMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}pointMembers" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointType", propOrder = {
    "pointMember",
    "pointMembers"
})
public class MultiPointType
    extends AbstractGeometricAggregateType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<PointPropertyType> pointMember;
    /**
     * This property element contains a list of points. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    protected PointArrayPropertyType pointMembers;

    /**
     * This property element either references a Point via the XLink-attributes or contains the Point element.Gets the value of the pointMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<PointPropertyType> getPointMember() {
        if (pointMember == null) {
            pointMember = new ArrayList<>();
        }
        return this.pointMember;
    }

    /**
     * This property element either references a Point via the XLink-attributes or contains the Point element.
     * 
     */
    public void setPointMember(List<PointPropertyType> pointMember) {
        this.pointMember = pointMember;
    }

    public boolean isSetPointMember() {
        return ((this.pointMember!= null)&&(!this.pointMember.isEmpty()));
    }

    public void unsetPointMember() {
        this.pointMember = null;
    }

    /**
     * This property element contains a list of points. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public PointArrayPropertyType getPointMembers() {
        return pointMembers;
    }

    /**
     * Sets the value of the pointMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointArrayPropertyType }
     *     
     * @see #getPointMembers()
     */
    public void setPointMembers(PointArrayPropertyType value) {
        this.pointMembers = value;
    }

    public boolean isSetPointMembers() {
        return (this.pointMembers!= null);
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
        final MultiPointType that = ((MultiPointType) object);
        {
            boolean lhsFieldIsSet = this.isSetPointMember();
            boolean rhsFieldIsSet = that.isSetPointMember();
            List<PointPropertyType> lhsField;
            lhsField = (this.isSetPointMember()?this.getPointMember():null);
            List<PointPropertyType> rhsField;
            rhsField = (that.isSetPointMember()?that.getPointMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointMember", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointMembers();
            boolean rhsFieldIsSet = that.isSetPointMembers();
            PointArrayPropertyType lhsField;
            lhsField = this.getPointMembers();
            PointArrayPropertyType rhsField;
            rhsField = that.getPointMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointMembers", rhsField);
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
            boolean theFieldIsSet = this.isSetPointMember();
            List<PointPropertyType> theField;
            theField = (this.isSetPointMember()?this.getPointMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointMembers();
            PointArrayPropertyType theField;
            theField = this.getPointMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetPointMember();
            List<PointPropertyType> theField;
            theField = (this.isSetPointMember()?this.getPointMember():null);
            strategy.appendField(locator, this, "pointMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointMembers();
            PointArrayPropertyType theField;
            theField = this.getPointMembers();
            strategy.appendField(locator, this, "pointMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
