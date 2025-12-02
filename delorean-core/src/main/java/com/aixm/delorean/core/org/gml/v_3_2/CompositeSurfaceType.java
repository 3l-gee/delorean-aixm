
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
 * <p>Java class for CompositeSurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CompositeSurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}surfaceMember" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeSurfaceType", propOrder = {
    "surfaceMember"
})
public class CompositeSurfaceType
    extends AbstractSurfaceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<SurfacePropertyType> surfaceMember;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

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

    public boolean isSetSurfaceMember() {
        return ((this.surfaceMember!= null)&&(!this.surfaceMember.isEmpty()));
    }

    public void unsetSurfaceMember() {
        this.surfaceMember = null;
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
        final CompositeSurfaceType that = ((CompositeSurfaceType) object);
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
            boolean lhsFieldIsSet = this.isSetSurfaceMember();
            boolean rhsFieldIsSet = that.isSetSurfaceMember();
            List<SurfacePropertyType> lhsField;
            lhsField = (this.isSetSurfaceMember()?this.getSurfaceMember():null);
            List<SurfacePropertyType> rhsField;
            rhsField = (that.isSetSurfaceMember()?that.getSurfaceMember():null);
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
            boolean theFieldIsSet = this.isSetSurfaceMember();
            List<SurfacePropertyType> theField;
            theField = (this.isSetSurfaceMember()?this.getSurfaceMember():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceMember", theField);
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
            boolean theFieldIsSet = this.isSetSurfaceMember();
            List<SurfacePropertyType> theField;
            theField = (this.isSetSurfaceMember()?this.getSurfaceMember():null);
            strategy.appendField(locator, this, "surfaceMember", buffer, theField, theFieldIsSet);
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
