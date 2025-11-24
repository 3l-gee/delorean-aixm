
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for OnlineContactPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OnlineContactPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}OnlineContact"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineContactPropertyType", propOrder = {
    "onlineContact"
})
@Entity(name = "OnlineContactPropertyType")
@Table(name = "onlinecontact_pt", schema = "shared")
public class OnlineContactPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "OnlineContact", required = true)
    protected OnlineContactType onlineContact;

    /**
     * Gets the value of the onlineContact property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineContactType }
     *     
     */
    @OneToOne(targetEntity = OnlineContactType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "onlinecontact_id", referencedColumnName = "hjid")
    public OnlineContactType getOnlineContact() {
        return onlineContact;
    }

    /**
     * Sets the value of the onlineContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineContactType }
     *     
     */
    public void setOnlineContact(OnlineContactType value) {
        this.onlineContact = value;
    }

    @Transient
    public boolean isSetOnlineContact() {
        return (this.onlineContact!= null);
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
        final OnlineContactPropertyType that = ((OnlineContactPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetOnlineContact();
            boolean rhsFieldIsSet = that.isSetOnlineContact();
            OnlineContactType lhsField;
            lhsField = this.getOnlineContact();
            OnlineContactType rhsField;
            rhsField = that.getOnlineContact();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "onlineContact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "onlineContact", rhsField);
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
            boolean theFieldIsSet = this.isSetOnlineContact();
            OnlineContactType theField;
            theField = this.getOnlineContact();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "onlineContact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetOnlineContact();
            OnlineContactType theField;
            theField = this.getOnlineContact();
            strategy.appendField(locator, this, "onlineContact", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
