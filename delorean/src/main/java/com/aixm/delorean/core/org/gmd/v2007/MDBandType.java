
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
import com.aixm.delorean.core.org.gco.v2007.RealPropertyType;
import com.aixm.delorean.core.org.gco.v2007.UomLengthPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MD_Band_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Band_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_Type">
 *       <sequence>
 *         <element name="maxValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="minValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="units" type="{http://www.isotc211.org/2005/gco}UomLength_PropertyType" minOccurs="0"/>
 *         <element name="peakResponse" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="bitsPerValue" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         <element name="toneGradation" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         <element name="scaleFactor" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         <element name="offset" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Band_Type", propOrder = {
    "maxValue",
    "minValue",
    "units",
    "peakResponse",
    "bitsPerValue",
    "toneGradation",
    "scaleFactor",
    "offset"
})
public class MDBandType
    extends MDRangeDimensionType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected RealPropertyType maxValue;
    protected RealPropertyType minValue;
    protected UomLengthPropertyType units;
    protected RealPropertyType peakResponse;
    protected IntegerPropertyType bitsPerValue;
    protected IntegerPropertyType toneGradation;
    protected RealPropertyType scaleFactor;
    protected RealPropertyType offset;

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaxValue(RealPropertyType value) {
        this.maxValue = value;
    }

    public boolean isSetMaxValue() {
        return (this.maxValue!= null);
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinValue(RealPropertyType value) {
        this.minValue = value;
    }

    public boolean isSetMinValue() {
        return (this.minValue!= null);
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public UomLengthPropertyType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public void setUnits(UomLengthPropertyType value) {
        this.units = value;
    }

    public boolean isSetUnits() {
        return (this.units!= null);
    }

    /**
     * Gets the value of the peakResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getPeakResponse() {
        return peakResponse;
    }

    /**
     * Sets the value of the peakResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setPeakResponse(RealPropertyType value) {
        this.peakResponse = value;
    }

    public boolean isSetPeakResponse() {
        return (this.peakResponse!= null);
    }

    /**
     * Gets the value of the bitsPerValue property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getBitsPerValue() {
        return bitsPerValue;
    }

    /**
     * Sets the value of the bitsPerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setBitsPerValue(IntegerPropertyType value) {
        this.bitsPerValue = value;
    }

    public boolean isSetBitsPerValue() {
        return (this.bitsPerValue!= null);
    }

    /**
     * Gets the value of the toneGradation property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getToneGradation() {
        return toneGradation;
    }

    /**
     * Sets the value of the toneGradation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setToneGradation(IntegerPropertyType value) {
        this.toneGradation = value;
    }

    public boolean isSetToneGradation() {
        return (this.toneGradation!= null);
    }

    /**
     * Gets the value of the scaleFactor property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Sets the value of the scaleFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setScaleFactor(RealPropertyType value) {
        this.scaleFactor = value;
    }

    public boolean isSetScaleFactor() {
        return (this.scaleFactor!= null);
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setOffset(RealPropertyType value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
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
        final MDBandType that = ((MDBandType) object);
        {
            boolean lhsFieldIsSet = this.isSetPeakResponse();
            boolean rhsFieldIsSet = that.isSetPeakResponse();
            RealPropertyType lhsField;
            lhsField = this.getPeakResponse();
            RealPropertyType rhsField;
            rhsField = that.getPeakResponse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "peakResponse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "peakResponse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinValue();
            boolean rhsFieldIsSet = that.isSetMinValue();
            RealPropertyType lhsField;
            lhsField = this.getMinValue();
            RealPropertyType rhsField;
            rhsField = that.getMinValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetToneGradation();
            boolean rhsFieldIsSet = that.isSetToneGradation();
            IntegerPropertyType lhsField;
            lhsField = this.getToneGradation();
            IntegerPropertyType rhsField;
            rhsField = that.getToneGradation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "toneGradation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "toneGradation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaxValue();
            boolean rhsFieldIsSet = that.isSetMaxValue();
            RealPropertyType lhsField;
            lhsField = this.getMaxValue();
            RealPropertyType rhsField;
            rhsField = that.getMaxValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maxValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maxValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetScaleFactor();
            boolean rhsFieldIsSet = that.isSetScaleFactor();
            RealPropertyType lhsField;
            lhsField = this.getScaleFactor();
            RealPropertyType rhsField;
            rhsField = that.getScaleFactor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "scaleFactor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "scaleFactor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOffset();
            boolean rhsFieldIsSet = that.isSetOffset();
            RealPropertyType lhsField;
            lhsField = this.getOffset();
            RealPropertyType rhsField;
            rhsField = that.getOffset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "offset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "offset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUnits();
            boolean rhsFieldIsSet = that.isSetUnits();
            UomLengthPropertyType lhsField;
            lhsField = this.getUnits();
            UomLengthPropertyType rhsField;
            rhsField = that.getUnits();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "units", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "units", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBitsPerValue();
            boolean rhsFieldIsSet = that.isSetBitsPerValue();
            IntegerPropertyType lhsField;
            lhsField = this.getBitsPerValue();
            IntegerPropertyType rhsField;
            rhsField = that.getBitsPerValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "bitsPerValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "bitsPerValue", rhsField);
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
            boolean theFieldIsSet = this.isSetMaxValue();
            RealPropertyType theField;
            theField = this.getMaxValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinValue();
            RealPropertyType theField;
            theField = this.getMinValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnits();
            UomLengthPropertyType theField;
            theField = this.getUnits();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "units", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPeakResponse();
            RealPropertyType theField;
            theField = this.getPeakResponse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "peakResponse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBitsPerValue();
            IntegerPropertyType theField;
            theField = this.getBitsPerValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "bitsPerValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetToneGradation();
            IntegerPropertyType theField;
            theField = this.getToneGradation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "toneGradation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScaleFactor();
            RealPropertyType theField;
            theField = this.getScaleFactor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "scaleFactor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffset();
            RealPropertyType theField;
            theField = this.getOffset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "offset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMaxValue();
            RealPropertyType theField;
            theField = this.getMaxValue();
            strategy.appendField(locator, this, "maxValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinValue();
            RealPropertyType theField;
            theField = this.getMinValue();
            strategy.appendField(locator, this, "minValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnits();
            UomLengthPropertyType theField;
            theField = this.getUnits();
            strategy.appendField(locator, this, "units", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPeakResponse();
            RealPropertyType theField;
            theField = this.getPeakResponse();
            strategy.appendField(locator, this, "peakResponse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBitsPerValue();
            IntegerPropertyType theField;
            theField = this.getBitsPerValue();
            strategy.appendField(locator, this, "bitsPerValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetToneGradation();
            IntegerPropertyType theField;
            theField = this.getToneGradation();
            strategy.appendField(locator, this, "toneGradation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScaleFactor();
            RealPropertyType theField;
            theField = this.getScaleFactor();
            strategy.appendField(locator, this, "scaleFactor", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOffset();
            RealPropertyType theField;
            theField = this.getOffset();
            strategy.appendField(locator, this, "offset", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
