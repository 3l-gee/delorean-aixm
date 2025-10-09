
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
import com.aixm.delorean.core.org.gco.v2007.MeasurePropertyType;
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
 * <p>Java class for MD_Dimension_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Dimension_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="dimensionName" type="{http://www.isotc211.org/2005/gmd}MD_DimensionNameTypeCode_PropertyType"/>
 *         <element name="dimensionSize" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *         <element name="resolution" type="{http://www.isotc211.org/2005/gco}Measure_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Dimension_Type", propOrder = {
    "dimensionName",
    "dimensionSize",
    "resolution"
})
public class MDDimensionType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected MDDimensionNameTypeCodePropertyType dimensionName;
    @XmlElement(required = true)
    protected IntegerPropertyType dimensionSize;
    protected MeasurePropertyType resolution;

    /**
     * Gets the value of the dimensionName property.
     * 
     * @return
     *     possible object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public MDDimensionNameTypeCodePropertyType getDimensionName() {
        return dimensionName;
    }

    /**
     * Sets the value of the dimensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public void setDimensionName(MDDimensionNameTypeCodePropertyType value) {
        this.dimensionName = value;
    }

    public boolean isSetDimensionName() {
        return (this.dimensionName!= null);
    }

    /**
     * Gets the value of the dimensionSize property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDimensionSize() {
        return dimensionSize;
    }

    /**
     * Sets the value of the dimensionSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDimensionSize(IntegerPropertyType value) {
        this.dimensionSize = value;
    }

    public boolean isSetDimensionSize() {
        return (this.dimensionSize!= null);
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurePropertyType }
     *     
     */
    public MeasurePropertyType getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurePropertyType }
     *     
     */
    public void setResolution(MeasurePropertyType value) {
        this.resolution = value;
    }

    public boolean isSetResolution() {
        return (this.resolution!= null);
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
        final MDDimensionType that = ((MDDimensionType) object);
        {
            boolean lhsFieldIsSet = this.isSetDimensionSize();
            boolean rhsFieldIsSet = that.isSetDimensionSize();
            IntegerPropertyType lhsField;
            lhsField = this.getDimensionSize();
            IntegerPropertyType rhsField;
            rhsField = that.getDimensionSize();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dimensionSize", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dimensionSize", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDimensionName();
            boolean rhsFieldIsSet = that.isSetDimensionName();
            MDDimensionNameTypeCodePropertyType lhsField;
            lhsField = this.getDimensionName();
            MDDimensionNameTypeCodePropertyType rhsField;
            rhsField = that.getDimensionName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dimensionName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dimensionName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetResolution();
            boolean rhsFieldIsSet = that.isSetResolution();
            MeasurePropertyType lhsField;
            lhsField = this.getResolution();
            MeasurePropertyType rhsField;
            rhsField = that.getResolution();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "resolution", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "resolution", rhsField);
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
            boolean theFieldIsSet = this.isSetDimensionName();
            MDDimensionNameTypeCodePropertyType theField;
            theField = this.getDimensionName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dimensionName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDimensionSize();
            IntegerPropertyType theField;
            theField = this.getDimensionSize();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dimensionSize", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResolution();
            MeasurePropertyType theField;
            theField = this.getResolution();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "resolution", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDimensionName();
            MDDimensionNameTypeCodePropertyType theField;
            theField = this.getDimensionName();
            strategy.appendField(locator, this, "dimensionName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDimensionSize();
            IntegerPropertyType theField;
            theField = this.getDimensionSize();
            strategy.appendField(locator, this, "dimensionSize", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResolution();
            MeasurePropertyType theField;
            theField = this.getResolution();
            strategy.appendField(locator, this, "resolution", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
