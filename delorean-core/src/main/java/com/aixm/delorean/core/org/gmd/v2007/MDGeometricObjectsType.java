
package com.aixm.delorean.core.org.gmd.v2007;

import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.IntegerPropertyType;
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
 * <p>Java class for MD_GeometricObjects_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_GeometricObjects_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="geometricObjectType" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjectTypeCode_PropertyType"/>
 *         <element name="geometricObjectCount" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GeometricObjects_Type", propOrder = {
    "geometricObjectType",
    "geometricObjectCount"
})
public class MDGeometricObjectsType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDGeometricObjectTypeCodePropertyType geometricObjectType;
    protected IntegerPropertyType geometricObjectCount;

    /**
     * Gets the value of the geometricObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public MDGeometricObjectTypeCodePropertyType getGeometricObjectType() {
        return geometricObjectType;
    }

    /**
     * Sets the value of the geometricObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType value) {
        this.geometricObjectType = value;
    }

    /**
     * Gets the value of the geometricObjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getGeometricObjectCount() {
        return geometricObjectCount;
    }

    /**
     * Sets the value of the geometricObjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setGeometricObjectCount(IntegerPropertyType value) {
        this.geometricObjectCount = value;
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
        final MDGeometricObjectsType that = ((MDGeometricObjectsType) object);
        {
            boolean lhsFieldIsSet = (this.geometricObjectCount!= null);
            boolean rhsFieldIsSet = (that.geometricObjectCount!= null);
            IntegerPropertyType lhsField;
            lhsField = this.getGeometricObjectCount();
            IntegerPropertyType rhsField;
            rhsField = that.getGeometricObjectCount();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometricObjectCount", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometricObjectCount", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.geometricObjectType!= null);
            boolean rhsFieldIsSet = (that.geometricObjectType!= null);
            MDGeometricObjectTypeCodePropertyType lhsField;
            lhsField = this.getGeometricObjectType();
            MDGeometricObjectTypeCodePropertyType rhsField;
            rhsField = that.getGeometricObjectType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometricObjectType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometricObjectType", rhsField);
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
            boolean theFieldIsSet = (this.geometricObjectType!= null);
            MDGeometricObjectTypeCodePropertyType theField;
            theField = this.getGeometricObjectType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometricObjectType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.geometricObjectCount!= null);
            IntegerPropertyType theField;
            theField = this.getGeometricObjectCount();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometricObjectCount", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.geometricObjectType!= null);
            MDGeometricObjectTypeCodePropertyType theField;
            theField = this.getGeometricObjectType();
            strategy.appendField(locator, this, "geometricObjectType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.geometricObjectCount!= null);
            IntegerPropertyType theField;
            theField = this.getGeometricObjectCount();
            strategy.appendField(locator, this, "geometricObjectCount", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
