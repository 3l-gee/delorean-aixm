
package com.aixm.delorean.core.org.gml.v_3_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for TemporalDatumType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TemporalDatumType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}TemporalDatumBaseType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}origin"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalDatumType", propOrder = {
    "origin"
})
public class TemporalDatumType
    extends TemporalDatumBaseType
{

    /**
     * gml:origin is the date and time origin of this temporal datum.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origin;

    /**
     * gml:origin is the date and time origin of this temporal datum.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(XMLGregorianCalendar value) {
        this.origin = value;
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
        final TemporalDatumType that = ((TemporalDatumType) object);
        {
            boolean lhsFieldIsSet = (this.origin!= null);
            boolean rhsFieldIsSet = (that.origin!= null);
            XMLGregorianCalendar lhsField;
            lhsField = this.getOrigin();
            XMLGregorianCalendar rhsField;
            rhsField = that.getOrigin();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "origin", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "origin", rhsField);
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
            boolean theFieldIsSet = (this.origin!= null);
            XMLGregorianCalendar theField;
            theField = this.getOrigin();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "origin", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.origin!= null);
            XMLGregorianCalendar theField;
            theField = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
