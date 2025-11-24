
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for GeodeticDatumType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeodeticDatumType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}primeMeridian"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}ellipsoid"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
{

    /**
     * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
     * 
     */
    @XmlElementRef(name = "primeMeridian", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<PrimeMeridianPropertyType> primeMeridian;
    /**
     * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
     * 
     */
    @XmlElementRef(name = "ellipsoid", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EllipsoidPropertyType> ellipsoid;

    /**
     * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public JAXBElement<PrimeMeridianPropertyType> getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * Sets the value of the primeMeridian property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     * @see #getPrimeMeridian()
     */
    public void setPrimeMeridian(JAXBElement<PrimeMeridianPropertyType> value) {
        this.primeMeridian = value;
    }

    /**
     * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public JAXBElement<EllipsoidPropertyType> getEllipsoid() {
        return ellipsoid;
    }

    /**
     * Sets the value of the ellipsoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     * @see #getEllipsoid()
     */
    public void setEllipsoid(JAXBElement<EllipsoidPropertyType> value) {
        this.ellipsoid = value;
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
        final GeodeticDatumType that = ((GeodeticDatumType) object);
        {
            boolean lhsFieldIsSet = (this.ellipsoid!= null);
            boolean rhsFieldIsSet = (that.ellipsoid!= null);
            JAXBElement<EllipsoidPropertyType> lhsField;
            lhsField = this.getEllipsoid();
            JAXBElement<EllipsoidPropertyType> rhsField;
            rhsField = that.getEllipsoid();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ellipsoid", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ellipsoid", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.primeMeridian!= null);
            boolean rhsFieldIsSet = (that.primeMeridian!= null);
            JAXBElement<PrimeMeridianPropertyType> lhsField;
            lhsField = this.getPrimeMeridian();
            JAXBElement<PrimeMeridianPropertyType> rhsField;
            rhsField = that.getPrimeMeridian();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "primeMeridian", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "primeMeridian", rhsField);
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
            boolean theFieldIsSet = (this.primeMeridian!= null);
            JAXBElement<PrimeMeridianPropertyType> theField;
            theField = this.getPrimeMeridian();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "primeMeridian", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.ellipsoid!= null);
            JAXBElement<EllipsoidPropertyType> theField;
            theField = this.getEllipsoid();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ellipsoid", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.primeMeridian!= null);
            JAXBElement<PrimeMeridianPropertyType> theField;
            theField = this.getPrimeMeridian();
            strategy.appendField(locator, this, "primeMeridian", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.ellipsoid!= null);
            JAXBElement<EllipsoidPropertyType> theField;
            theField = this.getEllipsoid();
            strategy.appendField(locator, this, "ellipsoid", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
