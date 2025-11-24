
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for MultiCurveType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultiCurveType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}curveMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}curveMembers" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCurveType", propOrder = {
    "curveMember",
    "curveMembers"
})
public class MultiCurveType
    extends AbstractGeometricAggregateType
{

    protected List<CurvePropertyType> curveMember;
    /**
     * This property element contains a list of curves. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    protected CurveArrayPropertyType curveMembers;

    /**
     * Gets the value of the curveMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curveMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurveMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurvePropertyType }
     * 
     * 
     */
    public List<CurvePropertyType> getCurveMember() {
        if (curveMember == null) {
            curveMember = new ArrayList<>();
        }
        return this.curveMember;
    }

    /**
     * 
     * 
     */
    public void setCurveMember(List<CurvePropertyType> curveMember) {
        this.curveMember = curveMember;
    }

    /**
     * This property element contains a list of curves. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link CurveArrayPropertyType }
     *     
     */
    public CurveArrayPropertyType getCurveMembers() {
        return curveMembers;
    }

    /**
     * Sets the value of the curveMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveArrayPropertyType }
     *     
     * @see #getCurveMembers()
     */
    public void setCurveMembers(CurveArrayPropertyType value) {
        this.curveMembers = value;
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
        final MultiCurveType that = ((MultiCurveType) object);
        {
            boolean lhsFieldIsSet = (this.curveMembers!= null);
            boolean rhsFieldIsSet = (that.curveMembers!= null);
            CurveArrayPropertyType lhsField;
            lhsField = this.getCurveMembers();
            CurveArrayPropertyType rhsField;
            rhsField = that.getCurveMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "curveMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "curveMembers", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.curveMember!= null)&&(!this.curveMember.isEmpty()));
            boolean rhsFieldIsSet = ((that.curveMember!= null)&&(!that.curveMember.isEmpty()));
            List<CurvePropertyType> lhsField;
            lhsField = (((this.curveMember!= null)&&(!this.curveMember.isEmpty()))?this.getCurveMember():null);
            List<CurvePropertyType> rhsField;
            rhsField = (((that.curveMember!= null)&&(!that.curveMember.isEmpty()))?that.getCurveMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "curveMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "curveMember", rhsField);
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
            boolean theFieldIsSet = ((this.curveMember!= null)&&(!this.curveMember.isEmpty()));
            List<CurvePropertyType> theField;
            theField = (((this.curveMember!= null)&&(!this.curveMember.isEmpty()))?this.getCurveMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "curveMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.curveMembers!= null);
            CurveArrayPropertyType theField;
            theField = this.getCurveMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "curveMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.curveMember!= null)&&(!this.curveMember.isEmpty()));
            List<CurvePropertyType> theField;
            theField = (((this.curveMember!= null)&&(!this.curveMember.isEmpty()))?this.getCurveMember():null);
            strategy.appendField(locator, this, "curveMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.curveMembers!= null);
            CurveArrayPropertyType theField;
            theField = this.getCurveMembers();
            strategy.appendField(locator, this, "curveMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
