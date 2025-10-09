
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.DecimalPropertyType;
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
 * Geographic area of the entire dataset referenced to WGS 84
 * 
 * <p>Java class for EX_GeographicBoundingBox_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EX_GeographicBoundingBox_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       <sequence>
 *         <element name="westBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         <element name="eastBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         <element name="southBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         <element name="northBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicBoundingBox_Type", propOrder = {
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
public class EXGeographicBoundingBoxType
    extends AbstractEXGeographicExtentType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected DecimalPropertyType westBoundLongitude;
    @XmlElement(required = true)
    protected DecimalPropertyType eastBoundLongitude;
    @XmlElement(required = true)
    protected DecimalPropertyType southBoundLatitude;
    @XmlElement(required = true)
    protected DecimalPropertyType northBoundLatitude;

    /**
     * Gets the value of the westBoundLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Sets the value of the westBoundLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setWestBoundLongitude(DecimalPropertyType value) {
        this.westBoundLongitude = value;
    }

    public boolean isSetWestBoundLongitude() {
        return (this.westBoundLongitude!= null);
    }

    /**
     * Gets the value of the eastBoundLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Sets the value of the eastBoundLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setEastBoundLongitude(DecimalPropertyType value) {
        this.eastBoundLongitude = value;
    }

    public boolean isSetEastBoundLongitude() {
        return (this.eastBoundLongitude!= null);
    }

    /**
     * Gets the value of the southBoundLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Sets the value of the southBoundLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setSouthBoundLatitude(DecimalPropertyType value) {
        this.southBoundLatitude = value;
    }

    public boolean isSetSouthBoundLatitude() {
        return (this.southBoundLatitude!= null);
    }

    /**
     * Gets the value of the northBoundLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Sets the value of the northBoundLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setNorthBoundLatitude(DecimalPropertyType value) {
        this.northBoundLatitude = value;
    }

    public boolean isSetNorthBoundLatitude() {
        return (this.northBoundLatitude!= null);
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
        final EXGeographicBoundingBoxType that = ((EXGeographicBoundingBoxType) object);
        {
            boolean lhsFieldIsSet = this.isSetSouthBoundLatitude();
            boolean rhsFieldIsSet = that.isSetSouthBoundLatitude();
            DecimalPropertyType lhsField;
            lhsField = this.getSouthBoundLatitude();
            DecimalPropertyType rhsField;
            rhsField = that.getSouthBoundLatitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "southBoundLatitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "southBoundLatitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEastBoundLongitude();
            boolean rhsFieldIsSet = that.isSetEastBoundLongitude();
            DecimalPropertyType lhsField;
            lhsField = this.getEastBoundLongitude();
            DecimalPropertyType rhsField;
            rhsField = that.getEastBoundLongitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "eastBoundLongitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "eastBoundLongitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNorthBoundLatitude();
            boolean rhsFieldIsSet = that.isSetNorthBoundLatitude();
            DecimalPropertyType lhsField;
            lhsField = this.getNorthBoundLatitude();
            DecimalPropertyType rhsField;
            rhsField = that.getNorthBoundLatitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "northBoundLatitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "northBoundLatitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWestBoundLongitude();
            boolean rhsFieldIsSet = that.isSetWestBoundLongitude();
            DecimalPropertyType lhsField;
            lhsField = this.getWestBoundLongitude();
            DecimalPropertyType rhsField;
            rhsField = that.getWestBoundLongitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "westBoundLongitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "westBoundLongitude", rhsField);
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
            boolean theFieldIsSet = this.isSetWestBoundLongitude();
            DecimalPropertyType theField;
            theField = this.getWestBoundLongitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "westBoundLongitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEastBoundLongitude();
            DecimalPropertyType theField;
            theField = this.getEastBoundLongitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "eastBoundLongitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSouthBoundLatitude();
            DecimalPropertyType theField;
            theField = this.getSouthBoundLatitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "southBoundLatitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNorthBoundLatitude();
            DecimalPropertyType theField;
            theField = this.getNorthBoundLatitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "northBoundLatitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetWestBoundLongitude();
            DecimalPropertyType theField;
            theField = this.getWestBoundLongitude();
            strategy.appendField(locator, this, "westBoundLongitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEastBoundLongitude();
            DecimalPropertyType theField;
            theField = this.getEastBoundLongitude();
            strategy.appendField(locator, this, "eastBoundLongitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSouthBoundLatitude();
            DecimalPropertyType theField;
            theField = this.getSouthBoundLatitude();
            strategy.appendField(locator, this, "southBoundLatitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNorthBoundLatitude();
            DecimalPropertyType theField;
            theField = this.getNorthBoundLatitude();
            strategy.appendField(locator, this, "northBoundLatitude", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
