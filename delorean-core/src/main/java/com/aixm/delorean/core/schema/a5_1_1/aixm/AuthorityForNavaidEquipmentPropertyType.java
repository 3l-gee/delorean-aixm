
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
 * <p>Java class for AuthorityForNavaidEquipmentPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuthorityForNavaidEquipmentPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AuthorityForNavaidEquipment"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForNavaidEquipmentPropertyType", propOrder = {
    "authorityForNavaidEquipment"
})
@Entity(name = "AuthorityForNavaidEquipmentPropertyType")
@Table(name = "authorityfornavaidequipment_pt", schema = "navaids_point")
public class AuthorityForNavaidEquipmentPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AuthorityForNavaidEquipment", required = true)
    protected AuthorityForNavaidEquipmentType authorityForNavaidEquipment;

    /**
     * Gets the value of the authorityForNavaidEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForNavaidEquipmentType }
     *     
     */
    @OneToOne(targetEntity = AuthorityForNavaidEquipmentType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "authorityfornavaidequipment_id", referencedColumnName = "hjid")
    public AuthorityForNavaidEquipmentType getAuthorityForNavaidEquipment() {
        return authorityForNavaidEquipment;
    }

    /**
     * Sets the value of the authorityForNavaidEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForNavaidEquipmentType }
     *     
     */
    public void setAuthorityForNavaidEquipment(AuthorityForNavaidEquipmentType value) {
        this.authorityForNavaidEquipment = value;
    }

    @Transient
    public boolean isSetAuthorityForNavaidEquipment() {
        return (this.authorityForNavaidEquipment!= null);
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
        final AuthorityForNavaidEquipmentPropertyType that = ((AuthorityForNavaidEquipmentPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAuthorityForNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetAuthorityForNavaidEquipment();
            AuthorityForNavaidEquipmentType lhsField;
            lhsField = this.getAuthorityForNavaidEquipment();
            AuthorityForNavaidEquipmentType rhsField;
            rhsField = that.getAuthorityForNavaidEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authorityForNavaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authorityForNavaidEquipment", rhsField);
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
            boolean theFieldIsSet = this.isSetAuthorityForNavaidEquipment();
            AuthorityForNavaidEquipmentType theField;
            theField = this.getAuthorityForNavaidEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authorityForNavaidEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAuthorityForNavaidEquipment();
            AuthorityForNavaidEquipmentType theField;
            theField = this.getAuthorityForNavaidEquipment();
            strategy.appendField(locator, this, "authorityForNavaidEquipment", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
