
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
 * <p>Java class for GeographicCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeographicCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}usesEllipsoidalCS"/>
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
@XmlType(name = "GeographicCRSType", propOrder = {
    "usesEllipsoidalCS",
    "usesGeodeticDatum"
})
public class GeographicCRSType
    extends AbstractCRSType
{

    @XmlElement(required = true)
    protected EllipsoidalCSPropertyType usesEllipsoidalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType usesGeodeticDatum;

    /**
     * Gets the value of the usesEllipsoidalCS property.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public EllipsoidalCSPropertyType getUsesEllipsoidalCS() {
        return usesEllipsoidalCS;
    }

    /**
     * Sets the value of the usesEllipsoidalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public void setUsesEllipsoidalCS(EllipsoidalCSPropertyType value) {
        this.usesEllipsoidalCS = value;
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
        final GeographicCRSType that = ((GeographicCRSType) object);
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
        {
            boolean lhsFieldIsSet = (this.usesEllipsoidalCS!= null);
            boolean rhsFieldIsSet = (that.usesEllipsoidalCS!= null);
            EllipsoidalCSPropertyType lhsField;
            lhsField = this.getUsesEllipsoidalCS();
            EllipsoidalCSPropertyType rhsField;
            rhsField = that.getUsesEllipsoidalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usesEllipsoidalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usesEllipsoidalCS", rhsField);
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
            boolean theFieldIsSet = (this.usesEllipsoidalCS!= null);
            EllipsoidalCSPropertyType theField;
            theField = this.getUsesEllipsoidalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usesEllipsoidalCS", theField);
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
            boolean theFieldIsSet = (this.usesEllipsoidalCS!= null);
            EllipsoidalCSPropertyType theField;
            theField = this.getUsesEllipsoidalCS();
            strategy.appendField(locator, this, "usesEllipsoidalCS", buffer, theField, theFieldIsSet);
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
