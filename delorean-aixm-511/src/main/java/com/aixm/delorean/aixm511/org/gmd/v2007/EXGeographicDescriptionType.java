
package com.aixm.delorean.core.org.gmd.v2007;

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
 * <p>Java class for EX_GeographicDescription_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EX_GeographicDescription_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       <sequence>
 *         <element name="geographicIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicDescription_Type", propOrder = {
    "geographicIdentifier"
})
public class EXGeographicDescriptionType
    extends AbstractEXGeographicExtentType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected MDIdentifierPropertyType geographicIdentifier;

    /**
     * Gets the value of the geographicIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getGeographicIdentifier() {
        return geographicIdentifier;
    }

    /**
     * Sets the value of the geographicIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setGeographicIdentifier(MDIdentifierPropertyType value) {
        this.geographicIdentifier = value;
    }

    public boolean isSetGeographicIdentifier() {
        return (this.geographicIdentifier!= null);
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
        final EXGeographicDescriptionType that = ((EXGeographicDescriptionType) object);
        {
            boolean lhsFieldIsSet = this.isSetGeographicIdentifier();
            boolean rhsFieldIsSet = that.isSetGeographicIdentifier();
            MDIdentifierPropertyType lhsField;
            lhsField = this.getGeographicIdentifier();
            MDIdentifierPropertyType rhsField;
            rhsField = that.getGeographicIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geographicIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geographicIdentifier", rhsField);
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
            boolean theFieldIsSet = this.isSetGeographicIdentifier();
            MDIdentifierPropertyType theField;
            theField = this.getGeographicIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geographicIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetGeographicIdentifier();
            MDIdentifierPropertyType theField;
            theField = this.getGeographicIdentifier();
            strategy.appendField(locator, this, "geographicIdentifier", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
