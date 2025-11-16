
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for TemporalCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TemporalCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}timeCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}usesTemporalCS"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}temporalDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalCRSType", propOrder = {
    "timeCS",
    "usesTemporalCS",
    "temporalDatum"
})
public class TemporalCRSType
    extends AbstractCRSType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * gml:timeCS is an association role to the time coordinate system used by this CRS.
     * 
     */
    @XmlElementRef(name = "timeCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeCSPropertyType> timeCS;
    protected TemporalCSPropertyType usesTemporalCS;
    /**
     * gml:temporalDatum is an association role to the temporal datum used by this CRS.
     * 
     */
    @XmlElementRef(name = "temporalDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<TemporalDatumPropertyType> temporalDatum;

    /**
     * gml:timeCS is an association role to the time coordinate system used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<TimeCSPropertyType> getTimeCS() {
        return timeCS;
    }

    /**
     * Sets the value of the timeCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}
     *     
     * @see #getTimeCS()
     */
    public void setTimeCS(JAXBElement<TimeCSPropertyType> value) {
        this.timeCS = value;
    }

    public boolean isSetTimeCS() {
        return (this.timeCS!= null);
    }

    /**
     * Gets the value of the usesTemporalCS property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCSPropertyType }
     *     
     */
    public TemporalCSPropertyType getUsesTemporalCS() {
        return usesTemporalCS;
    }

    /**
     * Sets the value of the usesTemporalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCSPropertyType }
     *     
     */
    public void setUsesTemporalCS(TemporalCSPropertyType value) {
        this.usesTemporalCS = value;
    }

    public boolean isSetUsesTemporalCS() {
        return (this.usesTemporalCS!= null);
    }

    /**
     * gml:temporalDatum is an association role to the temporal datum used by this CRS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<TemporalDatumPropertyType> getTemporalDatum() {
        return temporalDatum;
    }

    /**
     * Sets the value of the temporalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}
     *     
     * @see #getTemporalDatum()
     */
    public void setTemporalDatum(JAXBElement<TemporalDatumPropertyType> value) {
        this.temporalDatum = value;
    }

    public boolean isSetTemporalDatum() {
        return (this.temporalDatum!= null);
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
        final TemporalCRSType that = ((TemporalCRSType) object);
        {
            boolean lhsFieldIsSet = this.isSetTemporalDatum();
            boolean rhsFieldIsSet = that.isSetTemporalDatum();
            JAXBElement<TemporalDatumPropertyType> lhsField;
            lhsField = this.getTemporalDatum();
            JAXBElement<TemporalDatumPropertyType> rhsField;
            rhsField = that.getTemporalDatum();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "temporalDatum", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "temporalDatum", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUsesTemporalCS();
            boolean rhsFieldIsSet = that.isSetUsesTemporalCS();
            TemporalCSPropertyType lhsField;
            lhsField = this.getUsesTemporalCS();
            TemporalCSPropertyType rhsField;
            rhsField = that.getUsesTemporalCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "usesTemporalCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "usesTemporalCS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTimeCS();
            boolean rhsFieldIsSet = that.isSetTimeCS();
            JAXBElement<TimeCSPropertyType> lhsField;
            lhsField = this.getTimeCS();
            JAXBElement<TimeCSPropertyType> rhsField;
            rhsField = that.getTimeCS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeCS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeCS", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeCS();
            JAXBElement<TimeCSPropertyType> theField;
            theField = this.getTimeCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsesTemporalCS();
            TemporalCSPropertyType theField;
            theField = this.getUsesTemporalCS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "usesTemporalCS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTemporalDatum();
            JAXBElement<TemporalDatumPropertyType> theField;
            theField = this.getTemporalDatum();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "temporalDatum", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTimeCS();
            JAXBElement<TimeCSPropertyType> theField;
            theField = this.getTimeCS();
            strategy.appendField(locator, this, "timeCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUsesTemporalCS();
            TemporalCSPropertyType theField;
            theField = this.getUsesTemporalCS();
            strategy.appendField(locator, this, "usesTemporalCS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTemporalDatum();
            JAXBElement<TemporalDatumPropertyType> theField;
            theField = this.getTemporalDatum();
            strategy.appendField(locator, this, "temporalDatum", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
