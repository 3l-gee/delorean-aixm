
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for BaseUnitType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseUnitType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}UnitDefinitionType">
 *       <sequence>
 *         <element name="unitsSystem" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseUnitType", propOrder = {
    "unitsSystem"
})
public class BaseUnitType
    extends UnitDefinitionType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected ReferenceType unitsSystem;

    /**
     * Gets the value of the unitsSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUnitsSystem() {
        return unitsSystem;
    }

    /**
     * Sets the value of the unitsSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUnitsSystem(ReferenceType value) {
        this.unitsSystem = value;
    }

    public boolean isSetUnitsSystem() {
        return (this.unitsSystem!= null);
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
        final BaseUnitType that = ((BaseUnitType) object);
        {
            boolean lhsFieldIsSet = this.isSetUnitsSystem();
            boolean rhsFieldIsSet = that.isSetUnitsSystem();
            ReferenceType lhsField;
            lhsField = this.getUnitsSystem();
            ReferenceType rhsField;
            rhsField = that.getUnitsSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unitsSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unitsSystem", rhsField);
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
            boolean theFieldIsSet = this.isSetUnitsSystem();
            ReferenceType theField;
            theField = this.getUnitsSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unitsSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetUnitsSystem();
            ReferenceType theField;
            theField = this.getUnitsSystem();
            strategy.appendField(locator, this, "unitsSystem", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
