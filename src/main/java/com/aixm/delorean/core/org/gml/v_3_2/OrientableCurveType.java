
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for OrientableCurveType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrientableCurveType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCurveType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}baseCurve"/>
 *       </sequence>
 *       <attribute name="orientation" type="{http://www.opengis.net/gml/3.2}SignType" default="+" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientableCurveType", propOrder = {
    "baseCurve"
})
public class OrientableCurveType
    extends AbstractCurveType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * The property baseCurve references or contains the base curve, i.e. it either references the base curve via the XLink-attributes or contains the curve element. A curve element is any element which is substitutable for AbstractCurve. The base curve has positive orientation.
     * 
     */
    @XmlElement(required = true)
    protected CurvePropertyType baseCurve;
    @XmlAttribute(name = "orientation")
    protected SignType orientation;

    /**
     * The property baseCurve references or contains the base curve, i.e. it either references the base curve via the XLink-attributes or contains the curve element. A curve element is any element which is substitutable for AbstractCurve. The base curve has positive orientation.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getBaseCurve() {
        return baseCurve;
    }

    /**
     * Sets the value of the baseCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     * @see #getBaseCurve()
     */
    public void setBaseCurve(CurvePropertyType value) {
        this.baseCurve = value;
    }

    public boolean isSetBaseCurve() {
        return (this.baseCurve!= null);
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link SignType }
     *     
     */
    public SignType getOrientation() {
        if (orientation == null) {
            return SignType.VALUE_2;
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignType }
     *     
     */
    public void setOrientation(SignType value) {
        this.orientation = value;
    }

    public boolean isSetOrientation() {
        return (this.orientation!= null);
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
        final OrientableCurveType that = ((OrientableCurveType) object);
        {
            boolean lhsFieldIsSet = this.isSetBaseCurve();
            boolean rhsFieldIsSet = that.isSetBaseCurve();
            CurvePropertyType lhsField;
            lhsField = this.getBaseCurve();
            CurvePropertyType rhsField;
            rhsField = that.getBaseCurve();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "baseCurve", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "baseCurve", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOrientation();
            boolean rhsFieldIsSet = that.isSetOrientation();
            SignType lhsField;
            lhsField = this.getOrientation();
            SignType rhsField;
            rhsField = that.getOrientation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "orientation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "orientation", rhsField);
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
            boolean theFieldIsSet = this.isSetBaseCurve();
            CurvePropertyType theField;
            theField = this.getBaseCurve();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "baseCurve", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrientation();
            SignType theField;
            theField = this.getOrientation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "orientation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetBaseCurve();
            CurvePropertyType theField;
            theField = this.getBaseCurve();
            strategy.appendField(locator, this, "baseCurve", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOrientation();
            SignType theField;
            theField = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
