
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MD_ReferenceSystem_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_ReferenceSystem_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="referenceSystemIdentifier" type="{http://www.isotc211.org/2005/gmd}RS_Identifier_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ReferenceSystem_Type", propOrder = {
    "referenceSystemIdentifier"
})
public class MDReferenceSystemType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected RSIdentifierPropertyType referenceSystemIdentifier;

    /**
     * Gets the value of the referenceSystemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public RSIdentifierPropertyType getReferenceSystemIdentifier() {
        return referenceSystemIdentifier;
    }

    /**
     * Sets the value of the referenceSystemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public void setReferenceSystemIdentifier(RSIdentifierPropertyType value) {
        this.referenceSystemIdentifier = value;
    }

    public boolean isSetReferenceSystemIdentifier() {
        return (this.referenceSystemIdentifier!= null);
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
        final MDReferenceSystemType that = ((MDReferenceSystemType) object);
        {
            boolean lhsFieldIsSet = this.isSetReferenceSystemIdentifier();
            boolean rhsFieldIsSet = that.isSetReferenceSystemIdentifier();
            RSIdentifierPropertyType lhsField;
            lhsField = this.getReferenceSystemIdentifier();
            RSIdentifierPropertyType rhsField;
            rhsField = that.getReferenceSystemIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceSystemIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceSystemIdentifier", rhsField);
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
            boolean theFieldIsSet = this.isSetReferenceSystemIdentifier();
            RSIdentifierPropertyType theField;
            theField = this.getReferenceSystemIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceSystemIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetReferenceSystemIdentifier();
            RSIdentifierPropertyType theField;
            theField = this.getReferenceSystemIdentifier();
            strategy.appendField(locator, this, "referenceSystemIdentifier", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
