
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for PolygonPatchType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PolygonPatchType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractSurfacePatchType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}exterior" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}interior" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}SurfaceInterpolationType" fixed="planar" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonPatchType", propOrder = {
    "exterior",
    "interior"
})
public class PolygonPatchType
    extends AbstractSurfacePatchType
{

    /**
     * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
     * 
     */
    protected AbstractRingPropertyType exterior;
    protected List<AbstractRingPropertyType> interior;
    @XmlAttribute(name = "interpolation")
    protected SurfaceInterpolationType interpolation;

    /**
     * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
     * 
     * @return
     *     possible object is
     *     {@link AbstractRingPropertyType }
     *     
     */
    public AbstractRingPropertyType getExterior() {
        return exterior;
    }

    /**
     * Sets the value of the exterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractRingPropertyType }
     *     
     * @see #getExterior()
     */
    public void setExterior(AbstractRingPropertyType value) {
        this.exterior = value;
    }

    /**
     * A boundary of a surface consists of a number of rings. The "interior" rings separate the surface / surface patch from the area enclosed by the rings.Gets the value of the interior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractRingPropertyType }
     * 
     * 
     */
    public List<AbstractRingPropertyType> getInterior() {
        if (interior == null) {
            interior = new ArrayList<>();
        }
        return this.interior;
    }

    /**
     * A boundary of a surface consists of a number of rings. The "interior" rings separate the surface / surface patch from the area enclosed by the rings.
     * 
     */
    public void setInterior(List<AbstractRingPropertyType> interior) {
        this.interior = interior;
    }

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceInterpolationType }
     *     
     */
    public SurfaceInterpolationType getInterpolation() {
        if (interpolation == null) {
            return SurfaceInterpolationType.PLANAR;
        } else {
            return interpolation;
        }
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceInterpolationType }
     *     
     */
    public void setInterpolation(SurfaceInterpolationType value) {
        this.interpolation = value;
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
        final PolygonPatchType that = ((PolygonPatchType) object);
        {
            boolean lhsFieldIsSet = (this.exterior!= null);
            boolean rhsFieldIsSet = (that.exterior!= null);
            AbstractRingPropertyType lhsField;
            lhsField = this.getExterior();
            AbstractRingPropertyType rhsField;
            rhsField = that.getExterior();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "exterior", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "exterior", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.interior!= null)&&(!this.interior.isEmpty()));
            boolean rhsFieldIsSet = ((that.interior!= null)&&(!that.interior.isEmpty()));
            List<AbstractRingPropertyType> lhsField;
            lhsField = (((this.interior!= null)&&(!this.interior.isEmpty()))?this.getInterior():null);
            List<AbstractRingPropertyType> rhsField;
            rhsField = (((that.interior!= null)&&(!that.interior.isEmpty()))?that.getInterior():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interior", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interior", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.interpolation!= null);
            boolean rhsFieldIsSet = (that.interpolation!= null);
            SurfaceInterpolationType lhsField;
            lhsField = this.getInterpolation();
            SurfaceInterpolationType rhsField;
            rhsField = that.getInterpolation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interpolation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interpolation", rhsField);
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
            boolean theFieldIsSet = (this.exterior!= null);
            AbstractRingPropertyType theField;
            theField = this.getExterior();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "exterior", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.interior!= null)&&(!this.interior.isEmpty()));
            List<AbstractRingPropertyType> theField;
            theField = (((this.interior!= null)&&(!this.interior.isEmpty()))?this.getInterior():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interior", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            SurfaceInterpolationType theField;
            theField = this.getInterpolation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interpolation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.exterior!= null);
            AbstractRingPropertyType theField;
            theField = this.getExterior();
            strategy.appendField(locator, this, "exterior", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.interior!= null)&&(!this.interior.isEmpty()));
            List<AbstractRingPropertyType> theField;
            theField = (((this.interior!= null)&&(!this.interior.isEmpty()))?this.getInterior():null);
            strategy.appendField(locator, this, "interior", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.interpolation!= null);
            SurfaceInterpolationType theField;
            theField = this.getInterpolation();
            strategy.appendField(locator, this, "interpolation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
