
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
 * <p>Java class for AuthorityForSpecialNavigationSystemPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuthorityForSpecialNavigationSystemPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AuthorityForSpecialNavigationSystem"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForSpecialNavigationSystemPropertyType", propOrder = {
    "authorityForSpecialNavigationSystem"
})
@Entity(name = "AuthorityForSpecialNavigationSystemPropertyType")
@Table(name = "authorityforspecialnavigationsystem_pt", schema = "navaids_point")
public class AuthorityForSpecialNavigationSystemPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AuthorityForSpecialNavigationSystem", required = true)
    protected AuthorityForSpecialNavigationSystemType authorityForSpecialNavigationSystem;

    /**
     * Gets the value of the authorityForSpecialNavigationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForSpecialNavigationSystemType }
     *     
     */
    @OneToOne(targetEntity = AuthorityForSpecialNavigationSystemType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "authorityforspecialnavigationsystem_id", referencedColumnName = "hjid")
    public AuthorityForSpecialNavigationSystemType getAuthorityForSpecialNavigationSystem() {
        return authorityForSpecialNavigationSystem;
    }

    /**
     * Sets the value of the authorityForSpecialNavigationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForSpecialNavigationSystemType }
     *     
     */
    public void setAuthorityForSpecialNavigationSystem(AuthorityForSpecialNavigationSystemType value) {
        this.authorityForSpecialNavigationSystem = value;
    }

    @Transient
    public boolean isSetAuthorityForSpecialNavigationSystem() {
        return (this.authorityForSpecialNavigationSystem!= null);
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
        final AuthorityForSpecialNavigationSystemPropertyType that = ((AuthorityForSpecialNavigationSystemPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAuthorityForSpecialNavigationSystem();
            boolean rhsFieldIsSet = that.isSetAuthorityForSpecialNavigationSystem();
            AuthorityForSpecialNavigationSystemType lhsField;
            lhsField = this.getAuthorityForSpecialNavigationSystem();
            AuthorityForSpecialNavigationSystemType rhsField;
            rhsField = that.getAuthorityForSpecialNavigationSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authorityForSpecialNavigationSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authorityForSpecialNavigationSystem", rhsField);
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
            boolean theFieldIsSet = this.isSetAuthorityForSpecialNavigationSystem();
            AuthorityForSpecialNavigationSystemType theField;
            theField = this.getAuthorityForSpecialNavigationSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authorityForSpecialNavigationSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAuthorityForSpecialNavigationSystem();
            AuthorityForSpecialNavigationSystemType theField;
            theField = this.getAuthorityForSpecialNavigationSystem();
            strategy.appendField(locator, this, "authorityForSpecialNavigationSystem", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
