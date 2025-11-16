
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
 * <p>Java class for EngineeringCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EngineeringCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}cylindricalCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}linearCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}polarCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}userDefinedCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}engineeringDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "affineCS",
    "cartesianCS",
    "cylindricalCS",
    "linearCS",
    "polarCS",
    "sphericalCS",
    "userDefinedCS",
    "coordinateSystem",
    "engineeringDatum"
})
public class EngineeringCRSType
    extends AbstractCRSType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:affineCS is an association role to the affine coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    /**
     * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    /**
     * gml:cylindricalCS is an association role to the cylindrical coordinate system used by this CRS.
     * 
     */
    protected CylindricalCSPropertyType cylindricalCS;
    /**
     * gml:linearCS is an association role to the linear coordinate system used by this CRS.
     * 
     */
    protected LinearCSPropertyType linearCS;
    /**
     * gml:polarCS is an association role to the polar coordinate system used by this CRS.
     * 
     */
    protected PolarCSPropertyType polarCS;
    /**
     * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    /**
     * gml:userDefinedCS is an association role to the user defined coordinate system used by this CRS.
     * 
     */
    protected UserDefinedCSPropertyType userDefinedCS;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;
    /**
     * gml:engineeringDatum is an association role to the engineering datum used by this CRS.
     * 
     */
    @XmlElementRef(name = "engineeringDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EngineeringDatumPropertyType> engineeringDatum;

    /**
     * gml:affineCS is an association role to the affine coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<AffineCSPropertyType> getAffineCS() {
        return affineCS;
    }

    /**
     * Sets the value of the affineCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     * @see #getAffineCS()
     */
    public void setAffineCS(JAXBElement<AffineCSPropertyType> value) {
        this.affineCS = value;
    }

    public boolean isSetAffineCS() {
        return (this.affineCS!= null);
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
     * gml:cylindricalCS is an association role to the cylindrical coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public CylindricalCSPropertyType getCylindricalCS() {
        return cylindricalCS;
    }

    /**
     * Sets the value of the cylindricalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CylindricalCSPropertyType }
     *     
     * @see #getCylindricalCS()
     */
    public void setCylindricalCS(CylindricalCSPropertyType value) {
        this.cylindricalCS = value;
    }

    public boolean isSetCylindricalCS() {
        return (this.cylindricalCS!= null);
    }

    /**
     * gml:linearCS is an association role to the linear coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public LinearCSPropertyType getLinearCS() {
        return linearCS;
    }

    /**
     * Sets the value of the linearCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearCSPropertyType }
     *     
     * @see #getLinearCS()
     */
    public void setLinearCS(LinearCSPropertyType value) {
        this.linearCS = value;
    }

    public boolean isSetLinearCS() {
        return (this.linearCS!= null);
    }

    /**
     * gml:polarCS is an association role to the polar coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public PolarCSPropertyType getPolarCS() {
        return polarCS;
    }

    /**
     * Sets the value of the polarCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarCSPropertyType }
     *     
     * @see #getPolarCS()
     */
    public void setPolarCS(PolarCSPropertyType value) {
        this.polarCS = value;
    }

    public boolean isSetPolarCS() {
        return (this.polarCS!= null);
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
     * gml:userDefinedCS is an association role to the user defined coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public UserDefinedCSPropertyType getUserDefinedCS() {
        return userDefinedCS;
    }

    /**
     * Sets the value of the userDefinedCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedCSPropertyType }
     *     
     * @see #getUserDefinedCS()
     */
    public void setUserDefinedCS(UserDefinedCSPropertyType value) {
        this.userDefinedCS = value;
    }

    public boolean isSetUserDefinedCS() {
        return (this.userDefinedCS!= null);
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateSystemPropertyType> getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

    public boolean isSetCoordinateSystem() {
        return (this.coordinateSystem!= null);
    }

    /**
     * gml:engineeringDatum is an association role to the engineering datum used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<EngineeringDatumPropertyType> getEngineeringDatum() {
        return engineeringDatum;
    }

    /**
     * Sets the value of the engineeringDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     * @see #getEngineeringDatum()
     */
    public void setEngineeringDatum(JAXBElement<EngineeringDatumPropertyType> value) {
        this.engineeringDatum = value;
    }

    public boolean isSetEngineeringDatum() {
        return (this.engineeringDatum!= null);
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
        final EngineeringCRSType that = ((EngineeringCRSType) object);
        {
            boolean lhsFieldIsSet = this.isSetCoordinateSystem();
            boolean rhsFieldIsSet = that.isSetCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> lhsField;
            lhsField = this.getCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> rhsField;
            rhsField = that.getCoordinateSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coordinateSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coordinateSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEngineeringDatum();
            boolean rhsFieldIsSet = that.isSetEngineeringDatum();
            JAXBElement<EngineeringDatumPropertyType> lhsField;
            lhsField = this.getEngineeringDatum();
            JAXBElement<EngineeringDatumPropertyType> rhsField;
            rhsField = that.getEngineeringDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "engineeringDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "engineeringDatum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAffineCS();
            boolean rhsFieldIsSet = that.isSetAffineCS();
            JAXBElement<AffineCSPropertyType> lhsField;
            lhsField = this.getAffineCS();
            JAXBElement<AffineCSPropertyType> rhsField;
            rhsField = that.getAffineCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "affineCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "affineCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCylindricalCS();
            boolean rhsFieldIsSet = that.isSetCylindricalCS();
            CylindricalCSPropertyType lhsField;
            lhsField = this.getCylindricalCS();
            CylindricalCSPropertyType rhsField;
            rhsField = that.getCylindricalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cylindricalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cylindricalCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLinearCS();
            boolean rhsFieldIsSet = that.isSetLinearCS();
            LinearCSPropertyType lhsField;
            lhsField = this.getLinearCS();
            LinearCSPropertyType rhsField;
            rhsField = that.getLinearCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "linearCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "linearCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUserDefinedCS();
            boolean rhsFieldIsSet = that.isSetUserDefinedCS();
            UserDefinedCSPropertyType lhsField;
            lhsField = this.getUserDefinedCS();
            UserDefinedCSPropertyType rhsField;
            rhsField = that.getUserDefinedCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "userDefinedCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "userDefinedCS", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPolarCS();
            boolean rhsFieldIsSet = that.isSetPolarCS();
            PolarCSPropertyType lhsField;
            lhsField = this.getPolarCS();
            PolarCSPropertyType rhsField;
            rhsField = that.getPolarCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "polarCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "polarCS", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetAffineCS();
            JAXBElement<AffineCSPropertyType> theField;
            theField = this.getAffineCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "affineCS", theField);
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
            boolean theFieldIsSet = this.isSetCylindricalCS();
            CylindricalCSPropertyType theField;
            theField = this.getCylindricalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cylindricalCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLinearCS();
            LinearCSPropertyType theField;
            theField = this.getLinearCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "linearCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPolarCS();
            PolarCSPropertyType theField;
            theField = this.getPolarCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "polarCS", theField);
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
            boolean theFieldIsSet = this.isSetUserDefinedCS();
            UserDefinedCSPropertyType theField;
            theField = this.getUserDefinedCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "userDefinedCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> theField;
            theField = this.getCoordinateSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordinateSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEngineeringDatum();
            JAXBElement<EngineeringDatumPropertyType> theField;
            theField = this.getEngineeringDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "engineeringDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAffineCS();
            JAXBElement<AffineCSPropertyType> theField;
            theField = this.getAffineCS();
            strategy.appendField(locator, this, "affineCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCylindricalCS();
            CylindricalCSPropertyType theField;
            theField = this.getCylindricalCS();
            strategy.appendField(locator, this, "cylindricalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLinearCS();
            LinearCSPropertyType theField;
            theField = this.getLinearCS();
            strategy.appendField(locator, this, "linearCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPolarCS();
            PolarCSPropertyType theField;
            theField = this.getPolarCS();
            strategy.appendField(locator, this, "polarCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSphericalCS();
            JAXBElement<SphericalCSPropertyType> theField;
            theField = this.getSphericalCS();
            strategy.appendField(locator, this, "sphericalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserDefinedCS();
            UserDefinedCSPropertyType theField;
            theField = this.getUserDefinedCS();
            strategy.appendField(locator, this, "userDefinedCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> theField;
            theField = this.getCoordinateSystem();
            strategy.appendField(locator, this, "coordinateSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEngineeringDatum();
            JAXBElement<EngineeringDatumPropertyType> theField;
            theField = this.getEngineeringDatum();
            strategy.appendField(locator, this, "engineeringDatum", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
