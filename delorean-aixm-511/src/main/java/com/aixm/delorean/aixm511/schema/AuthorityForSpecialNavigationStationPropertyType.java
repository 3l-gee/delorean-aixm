
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
 * <p>Java class for AuthorityForSpecialNavigationStationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuthorityForSpecialNavigationStationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AuthorityForSpecialNavigationStation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForSpecialNavigationStationPropertyType", propOrder = {
    "authorityForSpecialNavigationStation"
})
@Entity(name = "AuthorityForSpecialNavigationStationPropertyType")
@Table(name = "authorityforspecialnavigationstation_pt", schema = "navaids_point")
public class AuthorityForSpecialNavigationStationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AuthorityForSpecialNavigationStation", required = true)
    protected AuthorityForSpecialNavigationStationType authorityForSpecialNavigationStation;

    /**
     * Gets the value of the authorityForSpecialNavigationStation property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForSpecialNavigationStationType }
     *     
     */
    @OneToOne(targetEntity = AuthorityForSpecialNavigationStationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "authorityforspecialnavigationstation_id", referencedColumnName = "hjid")
    public AuthorityForSpecialNavigationStationType getAuthorityForSpecialNavigationStation() {
        return authorityForSpecialNavigationStation;
    }

    /**
     * Sets the value of the authorityForSpecialNavigationStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForSpecialNavigationStationType }
     *     
     */
    public void setAuthorityForSpecialNavigationStation(AuthorityForSpecialNavigationStationType value) {
        this.authorityForSpecialNavigationStation = value;
    }

    @Transient
    public boolean isSetAuthorityForSpecialNavigationStation() {
        return (this.authorityForSpecialNavigationStation!= null);
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
        final AuthorityForSpecialNavigationStationPropertyType that = ((AuthorityForSpecialNavigationStationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAuthorityForSpecialNavigationStation();
            boolean rhsFieldIsSet = that.isSetAuthorityForSpecialNavigationStation();
            AuthorityForSpecialNavigationStationType lhsField;
            lhsField = this.getAuthorityForSpecialNavigationStation();
            AuthorityForSpecialNavigationStationType rhsField;
            rhsField = that.getAuthorityForSpecialNavigationStation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authorityForSpecialNavigationStation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authorityForSpecialNavigationStation", rhsField);
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
            boolean theFieldIsSet = this.isSetAuthorityForSpecialNavigationStation();
            AuthorityForSpecialNavigationStationType theField;
            theField = this.getAuthorityForSpecialNavigationStation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authorityForSpecialNavigationStation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAuthorityForSpecialNavigationStation();
            AuthorityForSpecialNavigationStationType theField;
            theField = this.getAuthorityForSpecialNavigationStation();
            strategy.appendField(locator, this, "authorityForSpecialNavigationStation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
