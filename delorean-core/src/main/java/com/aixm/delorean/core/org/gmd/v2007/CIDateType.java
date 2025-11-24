
package com.aixm.delorean.core.org.gmd.v2007;

import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.DatePropertyType;
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
 * <p>Java class for CI_Date_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CI_Date_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="date" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/>
 *         <element name="dateType" type="{http://www.isotc211.org/2005/gmd}CI_DateTypeCode_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Date_Type", propOrder = {
    "date",
    "dateType"
})
public class CIDateType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DatePropertyType date;
    @XmlElement(required = true)
    protected CIDateTypeCodePropertyType dateType;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDate(DatePropertyType value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link CIDateTypeCodePropertyType }
     *     
     */
    public CIDateTypeCodePropertyType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIDateTypeCodePropertyType }
     *     
     */
    public void setDateType(CIDateTypeCodePropertyType value) {
        this.dateType = value;
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
        final CIDateType that = ((CIDateType) object);
        {
            boolean lhsFieldIsSet = (this.date!= null);
            boolean rhsFieldIsSet = (that.date!= null);
            DatePropertyType lhsField;
            lhsField = this.getDate();
            DatePropertyType rhsField;
            rhsField = that.getDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "date", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "date", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.dateType!= null);
            boolean rhsFieldIsSet = (that.dateType!= null);
            CIDateTypeCodePropertyType lhsField;
            lhsField = this.getDateType();
            CIDateTypeCodePropertyType rhsField;
            rhsField = that.getDateType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateType", rhsField);
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
            boolean theFieldIsSet = (this.date!= null);
            DatePropertyType theField;
            theField = this.getDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "date", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dateType!= null);
            CIDateTypeCodePropertyType theField;
            theField = this.getDateType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.date!= null);
            DatePropertyType theField;
            theField = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dateType!= null);
            CIDateTypeCodePropertyType theField;
            theField = this.getDateType();
            strategy.appendField(locator, this, "dateType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
