
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
 * <p>Java class for ImageCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImageCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}usesObliqueCartesianCS"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}imageDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
    "cartesianCS",
    "affineCS",
    "usesObliqueCartesianCS",
    "imageDatum"
})
public class ImageCRSType
    extends AbstractCRSType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    /**
     * gml:affineCS is an association role to the affine coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    protected ObliqueCartesianCSPropertyType usesObliqueCartesianCS;
    /**
     * gml:imageDatum is an association role to the image datum used by this CRS.
     * 
     */
    @XmlElementRef(name = "imageDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<ImageDatumPropertyType> imageDatum;

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
     * Gets the value of the usesObliqueCartesianCS property.
     * 
     * @return
     *     possible object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS() {
        return usesObliqueCartesianCS;
    }

    /**
     * Sets the value of the usesObliqueCartesianCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value) {
        this.usesObliqueCartesianCS = value;
    }

    public boolean isSetUsesObliqueCartesianCS() {
        return (this.usesObliqueCartesianCS!= null);
    }

    /**
     * gml:imageDatum is an association role to the image datum used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<ImageDatumPropertyType> getImageDatum() {
        return imageDatum;
    }

    /**
     * Sets the value of the imageDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     * @see #getImageDatum()
     */
    public void setImageDatum(JAXBElement<ImageDatumPropertyType> value) {
        this.imageDatum = value;
    }

    public boolean isSetImageDatum() {
        return (this.imageDatum!= null);
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
        final ImageCRSType that = ((ImageCRSType) object);
        {
            boolean lhsFieldIsSet = this.isSetImageDatum();
            boolean rhsFieldIsSet = that.isSetImageDatum();
            JAXBElement<ImageDatumPropertyType> lhsField;
            lhsField = this.getImageDatum();
            JAXBElement<ImageDatumPropertyType> rhsField;
            rhsField = that.getImageDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "imageDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "imageDatum", rhsField);
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
            boolean lhsFieldIsSet = this.isSetUsesObliqueCartesianCS();
            boolean rhsFieldIsSet = that.isSetUsesObliqueCartesianCS();
            ObliqueCartesianCSPropertyType lhsField;
            lhsField = this.getUsesObliqueCartesianCS();
            ObliqueCartesianCSPropertyType rhsField;
            rhsField = that.getUsesObliqueCartesianCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usesObliqueCartesianCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usesObliqueCartesianCS", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cartesianCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAffineCS();
            JAXBElement<AffineCSPropertyType> theField;
            theField = this.getAffineCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "affineCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsesObliqueCartesianCS();
            ObliqueCartesianCSPropertyType theField;
            theField = this.getUsesObliqueCartesianCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usesObliqueCartesianCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetImageDatum();
            JAXBElement<ImageDatumPropertyType> theField;
            theField = this.getImageDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "imageDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCartesianCS();
            JAXBElement<CartesianCSPropertyType> theField;
            theField = this.getCartesianCS();
            strategy.appendField(locator, this, "cartesianCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAffineCS();
            JAXBElement<AffineCSPropertyType> theField;
            theField = this.getAffineCS();
            strategy.appendField(locator, this, "affineCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsesObliqueCartesianCS();
            ObliqueCartesianCSPropertyType theField;
            theField = this.getUsesObliqueCartesianCS();
            strategy.appendField(locator, this, "usesObliqueCartesianCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetImageDatum();
            JAXBElement<ImageDatumPropertyType> theField;
            theField = this.getImageDatum();
            strategy.appendField(locator, this, "imageDatum", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
