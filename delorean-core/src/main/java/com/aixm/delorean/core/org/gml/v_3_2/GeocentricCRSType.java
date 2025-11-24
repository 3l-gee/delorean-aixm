
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for GeocentricCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeocentricCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}usesCartesianCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}usesSphericalCS"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}usesGeodeticDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocentricCRSType", propOrder = {
    "usesCartesianCS",
    "usesSphericalCS",
    "usesGeodeticDatum"
})
public class GeocentricCRSType
    extends AbstractCRSType
{

    protected CartesianCSPropertyType usesCartesianCS;
    protected SphericalCSPropertyType usesSphericalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType usesGeodeticDatum;

    /**
     * Gets the value of the usesCartesianCS property.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public CartesianCSPropertyType getUsesCartesianCS() {
        return usesCartesianCS;
    }

    /**
     * Sets the value of the usesCartesianCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public void setUsesCartesianCS(CartesianCSPropertyType value) {
        this.usesCartesianCS = value;
    }

    /**
     * Gets the value of the usesSphericalCS property.
     * 
     * @return
     *     possible object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public SphericalCSPropertyType getUsesSphericalCS() {
        return usesSphericalCS;
    }

    /**
     * Sets the value of the usesSphericalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public void setUsesSphericalCS(SphericalCSPropertyType value) {
        this.usesSphericalCS = value;
    }

    /**
     * Gets the value of the usesGeodeticDatum property.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public GeodeticDatumPropertyType getUsesGeodeticDatum() {
        return usesGeodeticDatum;
    }

    /**
     * Sets the value of the usesGeodeticDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public void setUsesGeodeticDatum(GeodeticDatumPropertyType value) {
        this.usesGeodeticDatum = value;
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
        final GeocentricCRSType that = ((GeocentricCRSType) object);
        {
            boolean lhsFieldIsSet = (this.usesCartesianCS!= null);
            boolean rhsFieldIsSet = (that.usesCartesianCS!= null);
            CartesianCSPropertyType lhsField;
            lhsField = this.getUsesCartesianCS();
            CartesianCSPropertyType rhsField;
            rhsField = that.getUsesCartesianCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usesCartesianCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usesCartesianCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.usesSphericalCS!= null);
            boolean rhsFieldIsSet = (that.usesSphericalCS!= null);
            SphericalCSPropertyType lhsField;
            lhsField = this.getUsesSphericalCS();
            SphericalCSPropertyType rhsField;
            rhsField = that.getUsesSphericalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usesSphericalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usesSphericalCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.usesGeodeticDatum!= null);
            boolean rhsFieldIsSet = (that.usesGeodeticDatum!= null);
            GeodeticDatumPropertyType lhsField;
            lhsField = this.getUsesGeodeticDatum();
            GeodeticDatumPropertyType rhsField;
            rhsField = that.getUsesGeodeticDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usesGeodeticDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usesGeodeticDatum", rhsField);
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
            boolean theFieldIsSet = (this.usesCartesianCS!= null);
            CartesianCSPropertyType theField;
            theField = this.getUsesCartesianCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usesCartesianCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.usesSphericalCS!= null);
            SphericalCSPropertyType theField;
            theField = this.getUsesSphericalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usesSphericalCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.usesGeodeticDatum!= null);
            GeodeticDatumPropertyType theField;
            theField = this.getUsesGeodeticDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usesGeodeticDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.usesCartesianCS!= null);
            CartesianCSPropertyType theField;
            theField = this.getUsesCartesianCS();
            strategy.appendField(locator, this, "usesCartesianCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.usesSphericalCS!= null);
            SphericalCSPropertyType theField;
            theField = this.getUsesSphericalCS();
            strategy.appendField(locator, this, "usesSphericalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.usesGeodeticDatum!= null);
            GeodeticDatumPropertyType theField;
            theField = this.getUsesGeodeticDatum();
            strategy.appendField(locator, this, "usesGeodeticDatum", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
