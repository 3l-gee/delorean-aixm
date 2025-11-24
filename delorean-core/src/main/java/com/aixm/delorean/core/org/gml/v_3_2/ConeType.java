
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for ConeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConeType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGriddedSurfaceType">
 *       <attribute name="horizontalCurveType" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArc3Points" />
 *       <attribute name="verticalCurveType" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="linear" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConeType")
public class ConeType
    extends AbstractGriddedSurfaceType
{

    @XmlAttribute(name = "horizontalCurveType")
    protected CurveInterpolationType horizontalCurveType;
    @XmlAttribute(name = "verticalCurveType")
    protected CurveInterpolationType verticalCurveType;

    /**
     * Gets the value of the horizontalCurveType property.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getHorizontalCurveType() {
        if (horizontalCurveType == null) {
            return CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
        } else {
            return horizontalCurveType;
        }
    }

    /**
     * Sets the value of the horizontalCurveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setHorizontalCurveType(CurveInterpolationType value) {
        this.horizontalCurveType = value;
    }

    /**
     * Gets the value of the verticalCurveType property.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getVerticalCurveType() {
        if (verticalCurveType == null) {
            return CurveInterpolationType.LINEAR;
        } else {
            return verticalCurveType;
        }
    }

    /**
     * Sets the value of the verticalCurveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setVerticalCurveType(CurveInterpolationType value) {
        this.verticalCurveType = value;
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
        final ConeType that = ((ConeType) object);
        {
            boolean lhsFieldIsSet = (this.verticalCurveType!= null);
            boolean rhsFieldIsSet = (that.verticalCurveType!= null);
            CurveInterpolationType lhsField;
            lhsField = this.getVerticalCurveType();
            CurveInterpolationType rhsField;
            rhsField = that.getVerticalCurveType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalCurveType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalCurveType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.horizontalCurveType!= null);
            boolean rhsFieldIsSet = (that.horizontalCurveType!= null);
            CurveInterpolationType lhsField;
            lhsField = this.getHorizontalCurveType();
            CurveInterpolationType rhsField;
            rhsField = that.getHorizontalCurveType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalCurveType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalCurveType", rhsField);
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
            boolean theFieldIsSet = (this.horizontalCurveType!= null);
            CurveInterpolationType theField;
            theField = this.getHorizontalCurveType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalCurveType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.verticalCurveType!= null);
            CurveInterpolationType theField;
            theField = this.getVerticalCurveType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalCurveType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.horizontalCurveType!= null);
            CurveInterpolationType theField;
            theField = this.getHorizontalCurveType();
            strategy.appendField(locator, this, "horizontalCurveType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.verticalCurveType!= null);
            CurveInterpolationType theField;
            theField = this.getVerticalCurveType();
            strategy.appendField(locator, this, "verticalCurveType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
