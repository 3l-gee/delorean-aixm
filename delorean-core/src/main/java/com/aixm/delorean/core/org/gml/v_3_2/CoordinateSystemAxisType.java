
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for CoordinateSystemAxisType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CoordinateSystemAxisType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}axisAbbrev"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}axisDirection"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}minimumValue" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}maximumValue" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}rangeMeaning" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
    "axisAbbrev",
    "axisDirection",
    "minimumValue",
    "maximumValue",
    "rangeMeaning"
})
public class CoordinateSystemAxisType
    extends IdentifiedObjectType
{

    /**
     * gml:axisAbbrev is the abbreviation used for this coordinate system axis; this abbreviation is also used to identify the coordinates in the coordinate tuple. The codeSpace attribute may reference a source of more information on a set of standardized abbreviations, or on this abbreviation.
     * 
     */
    @XmlElement(required = true)
    protected CodeType axisAbbrev;
    /**
     * gml:axisDirection is the direction of this coordinate system axis (or in the case of Cartesian projected coordinates, the direction of this coordinate system axis at the origin).
     * Within any set of coordinate system axes, only one of each pair of terms may be used. For earth-fixed CRSs, this direction is often approximate and intended to provide a human interpretable meaning to the axis. When a geodetic datum is used, the precise directions of the axes may therefore vary slightly from this approximate direction.
     * The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     */
    @XmlElement(required = true)
    protected CodeWithAuthorityType axisDirection;
    /**
     * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
     * 
     */
    protected Double minimumValue;
    /**
     * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
     * 
     */
    protected Double maximumValue;
    /**
     * gml:rangeMeaning describes the meaning of axis value range specified by gml:minimumValue and gml:maximumValue. This element shall be omitted when both gml:minimumValue and gml:maximumValue are omitted. This element should be included when gml:minimumValue and/or gml:maximumValue are included. If this element is omitted when the gml:minimumValue and/or gml:maximumValue are included, the meaning is unspecified. The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     */
    protected CodeWithAuthorityType rangeMeaning;
    /**
     * The uom attribute provides an identifier of the unit of measure used for this coordinate system axis. The value of this coordinate in a coordinate tuple shall be recorded using this unit of measure, whenever those coordinates use a coordinate reference system that uses a coordinate system that uses this axis.
     * 
     */
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * gml:axisAbbrev is the abbreviation used for this coordinate system axis; this abbreviation is also used to identify the coordinates in the coordinate tuple. The codeSpace attribute may reference a source of more information on a set of standardized abbreviations, or on this abbreviation.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAxisAbbrev() {
        return axisAbbrev;
    }

    /**
     * Sets the value of the axisAbbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     * @see #getAxisAbbrev()
     */
    public void setAxisAbbrev(CodeType value) {
        this.axisAbbrev = value;
    }

    /**
     * gml:axisDirection is the direction of this coordinate system axis (or in the case of Cartesian projected coordinates, the direction of this coordinate system axis at the origin).
     * Within any set of coordinate system axes, only one of each pair of terms may be used. For earth-fixed CRSs, this direction is often approximate and intended to provide a human interpretable meaning to the axis. When a geodetic datum is used, the precise directions of the axes may therefore vary slightly from this approximate direction.
     * The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getAxisDirection() {
        return axisDirection;
    }

    /**
     * Sets the value of the axisDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     * @see #getAxisDirection()
     */
    public void setAxisDirection(CodeWithAuthorityType value) {
        this.axisDirection = value;
    }

    /**
     * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getMinimumValue()
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    /**
     * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getMaximumValue()
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    /**
     * gml:rangeMeaning describes the meaning of axis value range specified by gml:minimumValue and gml:maximumValue. This element shall be omitted when both gml:minimumValue and gml:maximumValue are omitted. This element should be included when gml:minimumValue and/or gml:maximumValue are included. If this element is omitted when the gml:minimumValue and/or gml:maximumValue are included, the meaning is unspecified. The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getRangeMeaning() {
        return rangeMeaning;
    }

    /**
     * Sets the value of the rangeMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     * @see #getRangeMeaning()
     */
    public void setRangeMeaning(CodeWithAuthorityType value) {
        this.rangeMeaning = value;
    }

    /**
     * The uom attribute provides an identifier of the unit of measure used for this coordinate system axis. The value of this coordinate in a coordinate tuple shall be recorded using this unit of measure, whenever those coordinates use a coordinate reference system that uses a coordinate system that uses this axis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUom()
     */
    public void setUom(String value) {
        this.uom = value;
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
        final CoordinateSystemAxisType that = ((CoordinateSystemAxisType) object);
        {
            boolean lhsFieldIsSet = (this.axisAbbrev!= null);
            boolean rhsFieldIsSet = (that.axisAbbrev!= null);
            CodeType lhsField;
            lhsField = this.getAxisAbbrev();
            CodeType rhsField;
            rhsField = that.getAxisAbbrev();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisAbbrev", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisAbbrev", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.uom!= null);
            boolean rhsFieldIsSet = (that.uom!= null);
            String lhsField;
            lhsField = this.getUom();
            String rhsField;
            rhsField = that.getUom();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "uom", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "uom", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.axisDirection!= null);
            boolean rhsFieldIsSet = (that.axisDirection!= null);
            CodeWithAuthorityType lhsField;
            lhsField = this.getAxisDirection();
            CodeWithAuthorityType rhsField;
            rhsField = that.getAxisDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "axisDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "axisDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.maximumValue!= null);
            boolean rhsFieldIsSet = (that.maximumValue!= null);
            Double lhsField;
            lhsField = this.getMaximumValue();
            Double rhsField;
            rhsField = that.getMaximumValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.minimumValue!= null);
            boolean rhsFieldIsSet = (that.minimumValue!= null);
            Double lhsField;
            lhsField = this.getMinimumValue();
            Double rhsField;
            rhsField = that.getMinimumValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.rangeMeaning!= null);
            boolean rhsFieldIsSet = (that.rangeMeaning!= null);
            CodeWithAuthorityType lhsField;
            lhsField = this.getRangeMeaning();
            CodeWithAuthorityType rhsField;
            rhsField = that.getRangeMeaning();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rangeMeaning", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rangeMeaning", rhsField);
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
            boolean theFieldIsSet = (this.axisAbbrev!= null);
            CodeType theField;
            theField = this.getAxisAbbrev();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisAbbrev", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.axisDirection!= null);
            CodeWithAuthorityType theField;
            theField = this.getAxisDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "axisDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.minimumValue!= null);
            Double theField;
            theField = this.getMinimumValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.maximumValue!= null);
            Double theField;
            theField = this.getMaximumValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.rangeMeaning!= null);
            CodeWithAuthorityType theField;
            theField = this.getRangeMeaning();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rangeMeaning", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.uom!= null);
            String theField;
            theField = this.getUom();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "uom", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.axisAbbrev!= null);
            CodeType theField;
            theField = this.getAxisAbbrev();
            strategy.appendField(locator, this, "axisAbbrev", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.axisDirection!= null);
            CodeWithAuthorityType theField;
            theField = this.getAxisDirection();
            strategy.appendField(locator, this, "axisDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.minimumValue!= null);
            Double theField;
            theField = this.getMinimumValue();
            strategy.appendField(locator, this, "minimumValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.maximumValue!= null);
            Double theField;
            theField = this.getMaximumValue();
            strategy.appendField(locator, this, "maximumValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.rangeMeaning!= null);
            CodeWithAuthorityType theField;
            theField = this.getRangeMeaning();
            strategy.appendField(locator, this, "rangeMeaning", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.uom!= null);
            String theField;
            theField = this.getUom();
            strategy.appendField(locator, this, "uom", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
