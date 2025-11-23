
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
 * <p>Java class for TelephoneContactPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TelephoneContactPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}TelephoneContact"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneContactPropertyType", propOrder = {
    "telephoneContact"
})
@Entity(name = "TelephoneContactPropertyType")
@Table(name = "telephonecontact_pt", schema = "shared")
public class TelephoneContactPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "TelephoneContact", required = true)
    protected TelephoneContactType telephoneContact;

    /**
     * Gets the value of the telephoneContact property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneContactType }
     *     
     */
    @OneToOne(targetEntity = TelephoneContactType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "telephonecontact_id", referencedColumnName = "hjid")
    public TelephoneContactType getTelephoneContact() {
        return telephoneContact;
    }

    /**
     * Sets the value of the telephoneContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneContactType }
     *     
     */
    public void setTelephoneContact(TelephoneContactType value) {
        this.telephoneContact = value;
    }

    @Transient
    public boolean isSetTelephoneContact() {
        return (this.telephoneContact!= null);
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
        final TelephoneContactPropertyType that = ((TelephoneContactPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetTelephoneContact();
            boolean rhsFieldIsSet = that.isSetTelephoneContact();
            TelephoneContactType lhsField;
            lhsField = this.getTelephoneContact();
            TelephoneContactType rhsField;
            rhsField = that.getTelephoneContact();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "telephoneContact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "telephoneContact", rhsField);
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
            boolean theFieldIsSet = this.isSetTelephoneContact();
            TelephoneContactType theField;
            theField = this.getTelephoneContact();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "telephoneContact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTelephoneContact();
            TelephoneContactType theField;
            theField = this.getTelephoneContact();
            strategy.appendField(locator, this, "telephoneContact", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
