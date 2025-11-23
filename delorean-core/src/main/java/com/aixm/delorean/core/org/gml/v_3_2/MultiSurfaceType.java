
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
 * <p>Java class for MultiSurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultiSurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}surfaceMember" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}surfaceMembers" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSurfaceType", propOrder = {
    "surfaceMember",
    "surfaceMembers"
})
public class MultiSurfaceType
    extends AbstractGeometricAggregateType
{

    protected List<SurfacePropertyType> surfaceMember;
    /**
     * This property element contains a list of surfaces. The order of the elements is significant and shall be preserved when processing the array.
     * 
     */
    protected SurfaceArrayPropertyType surfaceMembers;

    /**
     * This property element either references a surface via the XLink-attributes or contains the surface element. A surface element is any element, which is substitutable for gml:AbstractSurface.Gets the value of the surfaceMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfacePropertyType }
     * 
     * 
     */
    public List<SurfacePropertyType> getSurfaceMember() {
        if (surfaceMember == null) {
            surfaceMember = new ArrayList<>();
        }
        return this.surfaceMember;
    }

    /**
     * This property element either references a surface via the XLink-attributes or contains the surface element. A surface element is any element, which is substitutable for gml:AbstractSurface.
     * 
     */
    public void setSurfaceMember(List<SurfacePropertyType> surfaceMember) {
        this.surfaceMember = surfaceMember;
    }

    /**
     * This property element contains a list of surfaces. The order of the elements is significant and shall be preserved when processing the array.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceArrayPropertyType }
     *     
     */
    public SurfaceArrayPropertyType getSurfaceMembers() {
        return surfaceMembers;
    }

    /**
     * Sets the value of the surfaceMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceArrayPropertyType }
     *     
     * @see #getSurfaceMembers()
     */
    public void setSurfaceMembers(SurfaceArrayPropertyType value) {
        this.surfaceMembers = value;
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
        final MultiSurfaceType that = ((MultiSurfaceType) object);
        {
            boolean lhsFieldIsSet = (this.surfaceMembers!= null);
            boolean rhsFieldIsSet = (that.surfaceMembers!= null);
            SurfaceArrayPropertyType lhsField;
            lhsField = this.getSurfaceMembers();
            SurfaceArrayPropertyType rhsField;
            rhsField = that.getSurfaceMembers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceMembers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceMembers", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()));
            boolean rhsFieldIsSet = ((that.surfaceMember!= null)&&(!that.surfaceMember.isEmpty()));
            List<SurfacePropertyType> lhsField;
            lhsField = (((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()))?this.getSurfaceMember():null);
            List<SurfacePropertyType> rhsField;
            rhsField = (((that.surfaceMember!= null)&&(!that.surfaceMember.isEmpty()))?that.getSurfaceMember():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceMember", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceMember", rhsField);
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
            boolean theFieldIsSet = ((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()));
            List<SurfacePropertyType> theField;
            theField = (((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()))?this.getSurfaceMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceMember", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.surfaceMembers!= null);
            SurfaceArrayPropertyType theField;
            theField = this.getSurfaceMembers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceMembers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()));
            List<SurfacePropertyType> theField;
            theField = (((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()))?this.getSurfaceMember():null);
            strategy.appendField(locator, this, "surfaceMember", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.surfaceMembers!= null);
            SurfaceArrayPropertyType theField;
            theField = this.getSurfaceMembers();
            strategy.appendField(locator, this, "surfaceMembers", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
