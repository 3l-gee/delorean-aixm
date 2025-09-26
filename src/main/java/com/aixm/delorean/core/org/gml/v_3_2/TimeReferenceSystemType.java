
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for TimeReferenceSystemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeReferenceSystemType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       <sequence>
 *         <element name="domainOfValidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeReferenceSystemType", propOrder = {
    "domainOfValidity"
})
@XmlSeeAlso({
    TimeCoordinateSystemType.class,
    TimeCalendarType.class,
    TimeClockType.class,
    TimeOrdinalReferenceSystemType.class
})
public class TimeReferenceSystemType
    extends DefinitionType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected String domainOfValidity;

    /**
     * Gets the value of the domainOfValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * Sets the value of the domainOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainOfValidity(String value) {
        this.domainOfValidity = value;
    }

    public boolean isSetDomainOfValidity() {
        return (this.domainOfValidity!= null);
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
        final TimeReferenceSystemType that = ((TimeReferenceSystemType) object);
        {
            boolean lhsFieldIsSet = this.isSetDomainOfValidity();
            boolean rhsFieldIsSet = that.isSetDomainOfValidity();
            String lhsField;
            lhsField = this.getDomainOfValidity();
            String rhsField;
            rhsField = that.getDomainOfValidity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainOfValidity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainOfValidity", rhsField);
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
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            String theField;
            theField = this.getDomainOfValidity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "domainOfValidity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            String theField;
            theField = this.getDomainOfValidity();
            strategy.appendField(locator, this, "domainOfValidity", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
