
package com.aixm.delorean.aixm511.org.gml.v_3_2;

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
 * <p>Java class for ProjectedCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProjectedCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}baseGeodeticCRS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}baseGeographicCRS"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedCRSType", propOrder = {
    "baseGeodeticCRS",
    "baseGeographicCRS",
    "cartesianCS"
})
public class ProjectedCRSType
    extends AbstractGeneralDerivedCRSType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * gml:baseGeodeticCRS is an association role to the geodetic coordinate reference system used by this projected CRS.
     * 
     */
    protected GeodeticCRSPropertyType baseGeodeticCRS;
    protected GeographicCRSPropertyType baseGeographicCRS;
    /**
     * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;

    /**
     * gml:baseGeodeticCRS is an association role to the geodetic coordinate reference system used by this projected CRS.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticCRSPropertyType }
     *     
     */
    public GeodeticCRSPropertyType getBaseGeodeticCRS() {
        return baseGeodeticCRS;
    }

    /**
     * Sets the value of the baseGeodeticCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticCRSPropertyType }
     *     
     * @see #getBaseGeodeticCRS()
     */
    public void setBaseGeodeticCRS(GeodeticCRSPropertyType value) {
        this.baseGeodeticCRS = value;
    }

    public boolean isSetBaseGeodeticCRS() {
        return (this.baseGeodeticCRS!= null);
    }

    /**
     * Gets the value of the baseGeographicCRS property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCRSPropertyType }
     *     
     */
    public GeographicCRSPropertyType getBaseGeographicCRS() {
        return baseGeographicCRS;
    }

    /**
     * Sets the value of the baseGeographicCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCRSPropertyType }
     *     
     */
    public void setBaseGeographicCRS(GeographicCRSPropertyType value) {
        this.baseGeographicCRS = value;
    }

    public boolean isSetBaseGeographicCRS() {
        return (this.baseGeographicCRS!= null);
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
        final ProjectedCRSType that = ((ProjectedCRSType) object);
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
            boolean lhsFieldIsSet = this.isSetBaseGeodeticCRS();
            boolean rhsFieldIsSet = that.isSetBaseGeodeticCRS();
            GeodeticCRSPropertyType lhsField;
            lhsField = this.getBaseGeodeticCRS();
            GeodeticCRSPropertyType rhsField;
            rhsField = that.getBaseGeodeticCRS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "baseGeodeticCRS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "baseGeodeticCRS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBaseGeographicCRS();
            boolean rhsFieldIsSet = that.isSetBaseGeographicCRS();
            GeographicCRSPropertyType lhsField;
            lhsField = this.getBaseGeographicCRS();
            GeographicCRSPropertyType rhsField;
            rhsField = that.getBaseGeographicCRS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "baseGeographicCRS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "baseGeographicCRS", rhsField);
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
            boolean theFieldIsSet = this.isSetBaseGeodeticCRS();
            GeodeticCRSPropertyType theField;
            theField = this.getBaseGeodeticCRS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "baseGeodeticCRS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBaseGeographicCRS();
            GeographicCRSPropertyType theField;
            theField = this.getBaseGeographicCRS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "baseGeographicCRS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cartesianCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetBaseGeodeticCRS();
            GeodeticCRSPropertyType theField;
            theField = this.getBaseGeodeticCRS();
            strategy.appendField(locator, this, "baseGeodeticCRS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBaseGeographicCRS();
            GeographicCRSPropertyType theField;
            theField = this.getBaseGeographicCRS();
            strategy.appendField(locator, this, "baseGeographicCRS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
