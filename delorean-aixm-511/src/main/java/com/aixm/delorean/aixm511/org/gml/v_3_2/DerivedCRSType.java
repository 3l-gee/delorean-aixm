
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DerivedCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DerivedCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}baseCRS"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}derivedCRSType"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
    "baseCRS",
    "derivedCRSType",
    "coordinateSystem"
})
public class DerivedCRSType
    extends AbstractGeneralDerivedCRSType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * gml:baseCRS is an association role to the coordinate reference system used by this derived CRS.
     * 
     */
    @XmlElement(required = true)
    protected SingleCRSPropertyType baseCRS;
    /**
     * The gml:derivedCRSType property describes the type of a derived coordinate reference system. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     */
    @XmlElement(required = true)
    protected CodeWithAuthorityType derivedCRSType;
    /**
     * An association role to the coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;

    /**
     * gml:baseCRS is an association role to the coordinate reference system used by this derived CRS.
     * 
     * @return
     *     possible object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public SingleCRSPropertyType getBaseCRS() {
        return baseCRS;
    }

    /**
     * Sets the value of the baseCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleCRSPropertyType }
     *     
     * @see #getBaseCRS()
     */
    public void setBaseCRS(SingleCRSPropertyType value) {
        this.baseCRS = value;
    }

    public boolean isSetBaseCRS() {
        return (this.baseCRS!= null);
    }

    /**
     * The gml:derivedCRSType property describes the type of a derived coordinate reference system. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getDerivedCRSType() {
        return derivedCRSType;
    }

    /**
     * Sets the value of the derivedCRSType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     * @see #getDerivedCRSType()
     */
    public void setDerivedCRSType(CodeWithAuthorityType value) {
        this.derivedCRSType = value;
    }

    public boolean isSetDerivedCRSType() {
        return (this.derivedCRSType!= null);
    }

    /**
     * An association role to the coordinate system used by this CRS.
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
     * @see #getCoordinateSystem()
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

    public boolean isSetCoordinateSystem() {
        return (this.coordinateSystem!= null);
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
        final DerivedCRSType that = ((DerivedCRSType) object);
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
            boolean lhsFieldIsSet = this.isSetBaseCRS();
            boolean rhsFieldIsSet = that.isSetBaseCRS();
            SingleCRSPropertyType lhsField;
            lhsField = this.getBaseCRS();
            SingleCRSPropertyType rhsField;
            rhsField = that.getBaseCRS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "baseCRS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "baseCRS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDerivedCRSType();
            boolean rhsFieldIsSet = that.isSetDerivedCRSType();
            CodeWithAuthorityType lhsField;
            lhsField = this.getDerivedCRSType();
            CodeWithAuthorityType rhsField;
            rhsField = that.getDerivedCRSType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "derivedCRSType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "derivedCRSType", rhsField);
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
            boolean theFieldIsSet = this.isSetBaseCRS();
            SingleCRSPropertyType theField;
            theField = this.getBaseCRS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "baseCRS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDerivedCRSType();
            CodeWithAuthorityType theField;
            theField = this.getDerivedCRSType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "derivedCRSType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> theField;
            theField = this.getCoordinateSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordinateSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetBaseCRS();
            SingleCRSPropertyType theField;
            theField = this.getBaseCRS();
            strategy.appendField(locator, this, "baseCRS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDerivedCRSType();
            CodeWithAuthorityType theField;
            theField = this.getDerivedCRSType();
            strategy.appendField(locator, this, "derivedCRSType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinateSystem();
            JAXBElement<CoordinateSystemPropertyType> theField;
            theField = this.getCoordinateSystem();
            strategy.appendField(locator, this, "coordinateSystem", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
