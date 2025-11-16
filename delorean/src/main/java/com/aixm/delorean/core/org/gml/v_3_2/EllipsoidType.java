
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for EllipsoidType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EllipsoidType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}semiMajorAxis"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}SecondDefiningParameterPropertyElement"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EllipsoidType", propOrder = {
    "semiMajorAxis",
    "secondDefiningParameterPropertyElement"
})
public class EllipsoidType
    extends IdentifiedObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:semiMajorAxis specifies the length of the semi-major axis of the ellipsoid, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a length, such as metres or feet.
     * 
     */
    @XmlElement(required = true)
    protected MeasureType semiMajorAxis;
    /**
     * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
     * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
     * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
     * 
     */
    @XmlElement(name = "SecondDefiningParameterPropertyElement", required = true)
    protected SecondDefiningParameterPropertyElement secondDefiningParameterPropertyElement;

    /**
     * gml:semiMajorAxis specifies the length of the semi-major axis of the ellipsoid, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a length, such as metres or feet.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * Sets the value of the semiMajorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getSemiMajorAxis()
     */
    public void setSemiMajorAxis(MeasureType value) {
        this.semiMajorAxis = value;
    }

    public boolean isSetSemiMajorAxis() {
        return (this.semiMajorAxis!= null);
    }

    /**
     * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
     * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
     * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameterPropertyElement }
     *     
     */
    public SecondDefiningParameterPropertyElement getSecondDefiningParameterPropertyElement() {
        return secondDefiningParameterPropertyElement;
    }

    /**
     * Sets the value of the secondDefiningParameterPropertyElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameterPropertyElement }
     *     
     * @see #getSecondDefiningParameterPropertyElement()
     */
    public void setSecondDefiningParameterPropertyElement(SecondDefiningParameterPropertyElement value) {
        this.secondDefiningParameterPropertyElement = value;
    }

    public boolean isSetSecondDefiningParameterPropertyElement() {
        return (this.secondDefiningParameterPropertyElement!= null);
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
        final EllipsoidType that = ((EllipsoidType) object);
        {
            boolean lhsFieldIsSet = this.isSetSecondDefiningParameterPropertyElement();
            boolean rhsFieldIsSet = that.isSetSecondDefiningParameterPropertyElement();
            SecondDefiningParameterPropertyElement lhsField;
            lhsField = this.getSecondDefiningParameterPropertyElement();
            SecondDefiningParameterPropertyElement rhsField;
            rhsField = that.getSecondDefiningParameterPropertyElement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "secondDefiningParameterPropertyElement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "secondDefiningParameterPropertyElement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSemiMajorAxis();
            boolean rhsFieldIsSet = that.isSetSemiMajorAxis();
            MeasureType lhsField;
            lhsField = this.getSemiMajorAxis();
            MeasureType rhsField;
            rhsField = that.getSemiMajorAxis();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "semiMajorAxis", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "semiMajorAxis", rhsField);
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
            boolean theFieldIsSet = this.isSetSemiMajorAxis();
            MeasureType theField;
            theField = this.getSemiMajorAxis();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "semiMajorAxis", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSecondDefiningParameterPropertyElement();
            SecondDefiningParameterPropertyElement theField;
            theField = this.getSecondDefiningParameterPropertyElement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "secondDefiningParameterPropertyElement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSemiMajorAxis();
            MeasureType theField;
            theField = this.getSemiMajorAxis();
            strategy.appendField(locator, this, "semiMajorAxis", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSecondDefiningParameterPropertyElement();
            SecondDefiningParameterPropertyElement theField;
            theField = this.getSecondDefiningParameterPropertyElement();
            strategy.appendField(locator, this, "secondDefiningParameterPropertyElement", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
