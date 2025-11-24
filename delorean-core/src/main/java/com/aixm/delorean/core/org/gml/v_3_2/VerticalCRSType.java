
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for VerticalCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VerticalCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}verticalCS"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}verticalDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCRSType", propOrder = {
    "verticalCS",
    "verticalDatum"
})
public class VerticalCRSType
    extends AbstractCRSType
{

    /**
     * gml:verticalCS is an association role to the vertical coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "verticalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<VerticalCSPropertyType> verticalCS;
    /**
     * gml:verticalDatum is an association role to the vertical datum used by this CRS.
     * 
     */
    @XmlElementRef(name = "verticalDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<VerticalDatumPropertyType> verticalDatum;

    /**
     * gml:verticalCS is an association role to the vertical coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalCSPropertyType> getVerticalCS() {
        return verticalCS;
    }

    /**
     * Sets the value of the verticalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     
     * @see #getVerticalCS()
     */
    public void setVerticalCS(JAXBElement<VerticalCSPropertyType> value) {
        this.verticalCS = value;
    }

    /**
     * gml:verticalDatum is an association role to the vertical datum used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalDatumPropertyType> getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     
     * @see #getVerticalDatum()
     */
    public void setVerticalDatum(JAXBElement<VerticalDatumPropertyType> value) {
        this.verticalDatum = value;
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
        final VerticalCRSType that = ((VerticalCRSType) object);
        {
            boolean lhsFieldIsSet = (this.verticalDatum!= null);
            boolean rhsFieldIsSet = (that.verticalDatum!= null);
            JAXBElement<VerticalDatumPropertyType> lhsField;
            lhsField = this.getVerticalDatum();
            JAXBElement<VerticalDatumPropertyType> rhsField;
            rhsField = that.getVerticalDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalDatum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.verticalCS!= null);
            boolean rhsFieldIsSet = (that.verticalCS!= null);
            JAXBElement<VerticalCSPropertyType> lhsField;
            lhsField = this.getVerticalCS();
            JAXBElement<VerticalCSPropertyType> rhsField;
            rhsField = that.getVerticalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalCS", rhsField);
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
            boolean theFieldIsSet = (this.verticalCS!= null);
            JAXBElement<VerticalCSPropertyType> theField;
            theField = this.getVerticalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.verticalDatum!= null);
            JAXBElement<VerticalDatumPropertyType> theField;
            theField = this.getVerticalDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.verticalCS!= null);
            JAXBElement<VerticalCSPropertyType> theField;
            theField = this.getVerticalCS();
            strategy.appendField(locator, this, "verticalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.verticalDatum!= null);
            JAXBElement<VerticalDatumPropertyType> theField;
            theField = this.getVerticalDatum();
            strategy.appendField(locator, this, "verticalDatum", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
