
package com.aixm.delorean.aixm511.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.aixm511.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.aixm511.org.gco.v2007.BooleanPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Geographic area of the dataset
 * 
 * <p>Java class for AbstractEX_GeographicExtent_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractEX_GeographicExtent_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="extentTypeCode" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEX_GeographicExtent_Type", propOrder = {
    "extentTypeCode"
})
@XmlSeeAlso({
    EXBoundingPolygonType.class,
    EXGeographicBoundingBoxType.class,
    EXGeographicDescriptionType.class
})
public abstract class AbstractEXGeographicExtentType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected BooleanPropertyType extentTypeCode;

    /**
     * Gets the value of the extentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getExtentTypeCode() {
        return extentTypeCode;
    }

    /**
     * Sets the value of the extentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setExtentTypeCode(BooleanPropertyType value) {
        this.extentTypeCode = value;
    }

    public boolean isSetExtentTypeCode() {
        return (this.extentTypeCode!= null);
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
        final AbstractEXGeographicExtentType that = ((AbstractEXGeographicExtentType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtentTypeCode();
            boolean rhsFieldIsSet = that.isSetExtentTypeCode();
            BooleanPropertyType lhsField;
            lhsField = this.getExtentTypeCode();
            BooleanPropertyType rhsField;
            rhsField = that.getExtentTypeCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extentTypeCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extentTypeCode", rhsField);
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
            boolean theFieldIsSet = this.isSetExtentTypeCode();
            BooleanPropertyType theField;
            theField = this.getExtentTypeCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extentTypeCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetExtentTypeCode();
            BooleanPropertyType theField;
            theField = this.getExtentTypeCode();
            strategy.appendField(locator, this, "extentTypeCode", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
