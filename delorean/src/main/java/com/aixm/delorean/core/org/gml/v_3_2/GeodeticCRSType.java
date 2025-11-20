
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * gml:GeodeticCRS is a coordinate reference system based on a geodetic datum.
 * 
 * <p>Java class for GeodeticCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeodeticCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}ellipsoidalCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}geodeticDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticCRSType", propOrder = {
    "ellipsoidalCS",
    "cartesianCS",
    "sphericalCS",
    "geodeticDatum"
})
public class GeodeticCRSType
    extends AbstractCRSType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:ellipsoidalCS is an association role to the ellipsoidal coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "ellipsoidalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<EllipsoidalCSPropertyType> ellipsoidalCS;
    /**
     * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    /**
     * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    /**
     * gml:geodeticDatum is an association role to the geodetic datum used by this CRS.
     * 
     */
    @XmlElementRef(name = "geodeticDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<GeodeticDatumPropertyType> geodeticDatum;

    /**
     * gml:ellipsoidalCS is an association role to the ellipsoidal coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<EllipsoidalCSPropertyType> getEllipsoidalCS() {
        return ellipsoidalCS;
    }

    /**
     * Sets the value of the ellipsoidalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}
     *     
     * @see #getEllipsoidalCS()
     */
    public void setEllipsoidalCS(JAXBElement<EllipsoidalCSPropertyType> value) {
        this.ellipsoidalCS = value;
    }

    public boolean isSetEllipsoidalCS() {
        return (this.ellipsoidalCS!= null);
    }

    /**
     * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<CartesianCSPropertyType> getCartesianCS() {
        return cartesianCS;
    }

    /**
     * Sets the value of the cartesianCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     * @see #getCartesianCS()
     */
    public void setCartesianCS(JAXBElement<CartesianCSPropertyType> value) {
        this.cartesianCS = value;
    }

    public boolean isSetCartesianCS() {
        return (this.cartesianCS!= null);
    }

    /**
     * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<SphericalCSPropertyType> getSphericalCS() {
        return sphericalCS;
    }

    /**
     * Sets the value of the sphericalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     * @see #getSphericalCS()
     */
    public void setSphericalCS(JAXBElement<SphericalCSPropertyType> value) {
        this.sphericalCS = value;
    }

    public boolean isSetSphericalCS() {
        return (this.sphericalCS!= null);
    }

    /**
     * gml:geodeticDatum is an association role to the geodetic datum used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<GeodeticDatumPropertyType> getGeodeticDatum() {
        return geodeticDatum;
    }

    /**
     * Sets the value of the geodeticDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}
     *     
     * @see #getGeodeticDatum()
     */
    public void setGeodeticDatum(JAXBElement<GeodeticDatumPropertyType> value) {
        this.geodeticDatum = value;
    }

    public boolean isSetGeodeticDatum() {
        return (this.geodeticDatum!= null);
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
        final GeodeticCRSType that = ((GeodeticCRSType) object);
        {
            boolean lhsFieldIsSet = this.isSetEllipsoidalCS();
            boolean rhsFieldIsSet = that.isSetEllipsoidalCS();
            JAXBElement<EllipsoidalCSPropertyType> lhsField;
            lhsField = this.getEllipsoidalCS();
            JAXBElement<EllipsoidalCSPropertyType> rhsField;
            rhsField = that.getEllipsoidalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ellipsoidalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ellipsoidalCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCartesianCS();
            boolean rhsFieldIsSet = that.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> lhsField;
            lhsField = this.getCartesianCS();
            JAXBElement<CartesianCSPropertyType> rhsField;
            rhsField = that.getCartesianCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cartesianCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cartesianCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSphericalCS();
            boolean rhsFieldIsSet = that.isSetSphericalCS();
            JAXBElement<SphericalCSPropertyType> lhsField;
            lhsField = this.getSphericalCS();
            JAXBElement<SphericalCSPropertyType> rhsField;
            rhsField = that.getSphericalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sphericalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sphericalCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGeodeticDatum();
            boolean rhsFieldIsSet = that.isSetGeodeticDatum();
            JAXBElement<GeodeticDatumPropertyType> lhsField;
            lhsField = this.getGeodeticDatum();
            JAXBElement<GeodeticDatumPropertyType> rhsField;
            rhsField = that.getGeodeticDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geodeticDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geodeticDatum", rhsField);
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
            boolean theFieldIsSet = this.isSetEllipsoidalCS();
            JAXBElement<EllipsoidalCSPropertyType> theField;
            theField = this.getEllipsoidalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ellipsoidalCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cartesianCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSphericalCS();
            JAXBElement<SphericalCSPropertyType> theField;
            theField = this.getSphericalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sphericalCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeodeticDatum();
            JAXBElement<GeodeticDatumPropertyType> theField;
            theField = this.getGeodeticDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geodeticDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetEllipsoidalCS();
            JAXBElement<EllipsoidalCSPropertyType> theField;
            theField = this.getEllipsoidalCS();
            strategy.appendField(locator, this, "ellipsoidalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSphericalCS();
            JAXBElement<SphericalCSPropertyType> theField;
            theField = this.getSphericalCS();
            strategy.appendField(locator, this, "sphericalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeodeticDatum();
            JAXBElement<GeodeticDatumPropertyType> theField;
            theField = this.getGeodeticDatum();
            strategy.appendField(locator, this, "geodeticDatum", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
