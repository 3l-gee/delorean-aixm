
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.RealPropertyType;
import com.aixm.delorean.core.org.gsr.v2007.SCCRSPropertyType;
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
 * Vertical domain of dataset
 * 
 * <p>Java class for EX_VerticalExtent_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EX_VerticalExtent_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="minimumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/>
 *         <element name="maximumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/>
 *         <element name="verticalCRS" type="{http://www.isotc211.org/2005/gsr}SC_CRS_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_VerticalExtent_Type", propOrder = {
    "minimumValue",
    "maximumValue",
    "verticalCRS"
})
public class EXVerticalExtentType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected RealPropertyType minimumValue;
    @XmlElement(required = true)
    protected RealPropertyType maximumValue;
    @XmlElement(required = true)
    protected SCCRSPropertyType verticalCRS;

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinimumValue(RealPropertyType value) {
        this.minimumValue = value;
    }

    public boolean isSetMinimumValue() {
        return (this.minimumValue!= null);
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaximumValue(RealPropertyType value) {
        this.maximumValue = value;
    }

    public boolean isSetMaximumValue() {
        return (this.maximumValue!= null);
    }

    /**
     * Gets the value of the verticalCRS property.
     * 
     * @return
     *     possible object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public SCCRSPropertyType getVerticalCRS() {
        return verticalCRS;
    }

    /**
     * Sets the value of the verticalCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public void setVerticalCRS(SCCRSPropertyType value) {
        this.verticalCRS = value;
    }

    public boolean isSetVerticalCRS() {
        return (this.verticalCRS!= null);
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
        final EXVerticalExtentType that = ((EXVerticalExtentType) object);
        {
            boolean lhsFieldIsSet = this.isSetMinimumValue();
            boolean rhsFieldIsSet = that.isSetMinimumValue();
            RealPropertyType lhsField;
            lhsField = this.getMinimumValue();
            RealPropertyType rhsField;
            rhsField = that.getMinimumValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumValue", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalCRS();
            boolean rhsFieldIsSet = that.isSetVerticalCRS();
            SCCRSPropertyType lhsField;
            lhsField = this.getVerticalCRS();
            SCCRSPropertyType rhsField;
            rhsField = that.getVerticalCRS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalCRS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalCRS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumValue();
            boolean rhsFieldIsSet = that.isSetMaximumValue();
            RealPropertyType lhsField;
            lhsField = this.getMaximumValue();
            RealPropertyType rhsField;
            rhsField = that.getMaximumValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumValue", rhsField);
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
            boolean theFieldIsSet = this.isSetMinimumValue();
            RealPropertyType theField;
            theField = this.getMinimumValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumValue();
            RealPropertyType theField;
            theField = this.getMaximumValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCRS();
            SCCRSPropertyType theField;
            theField = this.getVerticalCRS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalCRS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetMinimumValue();
            RealPropertyType theField;
            theField = this.getMinimumValue();
            strategy.appendField(locator, this, "minimumValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumValue();
            RealPropertyType theField;
            theField = this.getMaximumValue();
            strategy.appendField(locator, this, "maximumValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalCRS();
            SCCRSPropertyType theField;
            theField = this.getVerticalCRS();
            strategy.appendField(locator, this, "verticalCRS", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
