
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
 * <p>Java class for AuthorityForAerialRefuellingPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuthorityForAerialRefuellingPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AuthorityForAerialRefuelling"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForAerialRefuellingPropertyType", propOrder = {
    "authorityForAerialRefuelling"
})
@Entity(name = "AuthorityForAerialRefuellingPropertyType")
@Table(name = "authorityforaerialrefuelling_pt", schema = "aerial_refuelling")
public class AuthorityForAerialRefuellingPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AuthorityForAerialRefuelling", required = true)
    protected AuthorityForAerialRefuellingType authorityForAerialRefuelling;

    /**
     * Gets the value of the authorityForAerialRefuelling property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForAerialRefuellingType }
     *     
     */
    @OneToOne(targetEntity = AuthorityForAerialRefuellingType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "authorityforaerialrefuelling_id", referencedColumnName = "hjid")
    public AuthorityForAerialRefuellingType getAuthorityForAerialRefuelling() {
        return authorityForAerialRefuelling;
    }

    /**
     * Sets the value of the authorityForAerialRefuelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForAerialRefuellingType }
     *     
     */
    public void setAuthorityForAerialRefuelling(AuthorityForAerialRefuellingType value) {
        this.authorityForAerialRefuelling = value;
    }

    @Transient
    public boolean isSetAuthorityForAerialRefuelling() {
        return (this.authorityForAerialRefuelling!= null);
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
        final AuthorityForAerialRefuellingPropertyType that = ((AuthorityForAerialRefuellingPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAuthorityForAerialRefuelling();
            boolean rhsFieldIsSet = that.isSetAuthorityForAerialRefuelling();
            AuthorityForAerialRefuellingType lhsField;
            lhsField = this.getAuthorityForAerialRefuelling();
            AuthorityForAerialRefuellingType rhsField;
            rhsField = that.getAuthorityForAerialRefuelling();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authorityForAerialRefuelling", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authorityForAerialRefuelling", rhsField);
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
            boolean theFieldIsSet = this.isSetAuthorityForAerialRefuelling();
            AuthorityForAerialRefuellingType theField;
            theField = this.getAuthorityForAerialRefuelling();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authorityForAerialRefuelling", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAuthorityForAerialRefuelling();
            AuthorityForAerialRefuellingType theField;
            theField = this.getAuthorityForAerialRefuelling();
            strategy.appendField(locator, this, "authorityForAerialRefuelling", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
