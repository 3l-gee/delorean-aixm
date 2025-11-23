
package com.aixm.delorean.aixm511.org.gml.v_3_2;

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
 * <p>Java class for OrientableSurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrientableSurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}baseSurface"/>
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
@XmlType(name = "OrientableSurfaceType", propOrder = {
    "baseSurface"
})
public class OrientableSurfaceType
    extends AbstractSurfaceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * The property baseSurface references or contains the base surface. The property baseSurface either references the base surface via the XLink-attributes or contains the surface element. A surface element is any element which is substitutable for gml:AbstractSurface. The base surface has positive orientation.
     * 
     */
    @XmlElement(required = true)
    protected SurfacePropertyType baseSurface;
    @XmlAttribute(name = "orientation")
    protected SignType orientation;

    /**
     * The property baseSurface references or contains the base surface. The property baseSurface either references the base surface via the XLink-attributes or contains the surface element. A surface element is any element which is substitutable for gml:AbstractSurface. The base surface has positive orientation.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getBaseSurface() {
        return baseSurface;
    }

    /**
     * Sets the value of the baseSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     * @see #getBaseSurface()
     */
    public void setBaseSurface(SurfacePropertyType value) {
        this.baseSurface = value;
    }

    public boolean isSetBaseSurface() {
        return (this.baseSurface!= null);
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
        final OrientableSurfaceType that = ((OrientableSurfaceType) object);
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
        {
            boolean lhsFieldIsSet = this.isSetBaseSurface();
            boolean rhsFieldIsSet = that.isSetBaseSurface();
            SurfacePropertyType lhsField;
            lhsField = this.getBaseSurface();
            SurfacePropertyType rhsField;
            rhsField = that.getBaseSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "baseSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "baseSurface", rhsField);
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
            boolean theFieldIsSet = this.isSetBaseSurface();
            SurfacePropertyType theField;
            theField = this.getBaseSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "baseSurface", theField);
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
            boolean theFieldIsSet = this.isSetBaseSurface();
            SurfacePropertyType theField;
            theField = this.getBaseSurface();
            strategy.appendField(locator, this, "baseSurface", buffer, theField, theFieldIsSet);
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
