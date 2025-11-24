
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
 * <p>Java class for OrganisationAuthorityAssociationPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganisationAuthorityAssociationPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}OrganisationAuthorityAssociation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationAuthorityAssociationPropertyType", propOrder = {
    "organisationAuthorityAssociation"
})
@Entity(name = "OrganisationAuthorityAssociationPropertyType")
@Table(name = "organisationauthorityassociation_pt", schema = "organisation")
public class OrganisationAuthorityAssociationPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "OrganisationAuthorityAssociation", required = true)
    protected OrganisationAuthorityAssociationType organisationAuthorityAssociation;

    /**
     * Gets the value of the organisationAuthorityAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationAuthorityAssociationType }
     *     
     */
    @OneToOne(targetEntity = OrganisationAuthorityAssociationType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "organisationauthorityassociation_id", referencedColumnName = "hjid")
    public OrganisationAuthorityAssociationType getOrganisationAuthorityAssociation() {
        return organisationAuthorityAssociation;
    }

    /**
     * Sets the value of the organisationAuthorityAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationAuthorityAssociationType }
     *     
     */
    public void setOrganisationAuthorityAssociation(OrganisationAuthorityAssociationType value) {
        this.organisationAuthorityAssociation = value;
    }

    @Transient
    public boolean isSetOrganisationAuthorityAssociation() {
        return (this.organisationAuthorityAssociation!= null);
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
        final OrganisationAuthorityAssociationPropertyType that = ((OrganisationAuthorityAssociationPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetOrganisationAuthorityAssociation();
            boolean rhsFieldIsSet = that.isSetOrganisationAuthorityAssociation();
            OrganisationAuthorityAssociationType lhsField;
            lhsField = this.getOrganisationAuthorityAssociation();
            OrganisationAuthorityAssociationType rhsField;
            rhsField = that.getOrganisationAuthorityAssociation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "organisationAuthorityAssociation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "organisationAuthorityAssociation", rhsField);
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
            boolean theFieldIsSet = this.isSetOrganisationAuthorityAssociation();
            OrganisationAuthorityAssociationType theField;
            theField = this.getOrganisationAuthorityAssociation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "organisationAuthorityAssociation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetOrganisationAuthorityAssociation();
            OrganisationAuthorityAssociationType theField;
            theField = this.getOrganisationAuthorityAssociation();
            strategy.appendField(locator, this, "organisationAuthorityAssociation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
