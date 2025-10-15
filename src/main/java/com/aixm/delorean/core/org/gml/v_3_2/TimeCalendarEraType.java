
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * <p>Java class for TimeCalendarEraType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeCalendarEraType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       <sequence>
 *         <element name="referenceEvent" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/>
 *         <element name="referenceDate" type="{http://www.opengis.net/gml/3.2}CalDate"/>
 *         <element name="julianReference" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="epochOfUse" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarEraType", propOrder = {
    "referenceEvent",
    "referenceDate",
    "julianReference",
    "epochOfUse"
})
public class TimeCalendarEraType
    extends DefinitionType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(required = true)
    protected String referenceDate;
    @XmlElement(required = true)
    protected BigDecimal julianReference;
    @XmlElement(required = true)
    protected TimePeriodPropertyType epochOfUse;

    /**
     * Gets the value of the referenceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReferenceEvent() {
        return referenceEvent;
    }

    /**
     * Sets the value of the referenceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReferenceEvent(StringOrRefType value) {
        this.referenceEvent = value;
    }

    public boolean isSetReferenceEvent() {
        return (this.referenceEvent!= null);
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

    public boolean isSetReferenceDate() {
        return (this.referenceDate!= null);
    }

    /**
     * Gets the value of the julianReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJulianReference() {
        return julianReference;
    }

    /**
     * Sets the value of the julianReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJulianReference(BigDecimal value) {
        this.julianReference = value;
    }

    public boolean isSetJulianReference() {
        return (this.julianReference!= null);
    }

    /**
     * Gets the value of the epochOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getEpochOfUse() {
        return epochOfUse;
    }

    /**
     * Sets the value of the epochOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setEpochOfUse(TimePeriodPropertyType value) {
        this.epochOfUse = value;
    }

    public boolean isSetEpochOfUse() {
        return (this.epochOfUse!= null);
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
        final TimeCalendarEraType that = ((TimeCalendarEraType) object);
        {
            boolean lhsFieldIsSet = this.isSetEpochOfUse();
            boolean rhsFieldIsSet = that.isSetEpochOfUse();
            TimePeriodPropertyType lhsField;
            lhsField = this.getEpochOfUse();
            TimePeriodPropertyType rhsField;
            rhsField = that.getEpochOfUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "epochOfUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "epochOfUse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceDate();
            boolean rhsFieldIsSet = that.isSetReferenceDate();
            String lhsField;
            lhsField = this.getReferenceDate();
            String rhsField;
            rhsField = that.getReferenceDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceDate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceDate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceEvent();
            boolean rhsFieldIsSet = that.isSetReferenceEvent();
            StringOrRefType lhsField;
            lhsField = this.getReferenceEvent();
            StringOrRefType rhsField;
            rhsField = that.getReferenceEvent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceEvent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceEvent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetJulianReference();
            boolean rhsFieldIsSet = that.isSetJulianReference();
            BigDecimal lhsField;
            lhsField = this.getJulianReference();
            BigDecimal rhsField;
            rhsField = that.getJulianReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "julianReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "julianReference", rhsField);
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
            boolean theFieldIsSet = this.isSetReferenceEvent();
            StringOrRefType theField;
            theField = this.getReferenceEvent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceEvent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceDate();
            String theField;
            theField = this.getReferenceDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceDate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetJulianReference();
            BigDecimal theField;
            theField = this.getJulianReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "julianReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEpochOfUse();
            TimePeriodPropertyType theField;
            theField = this.getEpochOfUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "epochOfUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetReferenceEvent();
            StringOrRefType theField;
            theField = this.getReferenceEvent();
            strategy.appendField(locator, this, "referenceEvent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceDate();
            String theField;
            theField = this.getReferenceDate();
            strategy.appendField(locator, this, "referenceDate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetJulianReference();
            BigDecimal theField;
            theField = this.getJulianReference();
            strategy.appendField(locator, this, "julianReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEpochOfUse();
            TimePeriodPropertyType theField;
            theField = this.getEpochOfUse();
            strategy.appendField(locator, this, "epochOfUse", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
