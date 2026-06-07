
package com.aixm.delorean.aixm52.schema;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

/**
 * <p>
 * Java class for AuthorityForSpecialNavigationStationType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AuthorityForSpecialNavigationStationType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeAuthorityRoleType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="theOrganisationAuthority" type=
"{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" minOccurs=
"0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractAuthorityForSpecialNavigationStationExtension"/>
 *                 </choice>
 *                 <attGroup ref=
"{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForSpecialNavigationStationType", propOrder = {"type", "annotation",
        "theOrganisationAuthority", "extension"})
@Entity(name = "AuthorityForSpecialNavigationStationType")
@Table(name = "authorityforspecialnavigationstation_o", schema = "navaids_point")
public class AuthorityForSpecialNavigationStationType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAuthorityRoleType> type;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "theOrganisationAuthority", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> theOrganisationAuthority;
    protected List<AuthorityForSpecialNavigationStationExtensionType> extension;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAuthorityRoleType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAuthorityRoleType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAuthorityRoleType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeAuthorityRoleType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the annotation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the annotation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAnnotation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "athrtfrspclnvgtnsttntp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "authorityforspecialnavigationstation_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")})
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    /**
     *
     *
     */
    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation != null) && (!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the theOrganisationAuthority property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getTheOrganisationAuthority() {
        return theOrganisationAuthority;
    }

    /**
     * Sets the value of the theOrganisationAuthority property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *
     */
    public void setTheOrganisationAuthority(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.theOrganisationAuthority = value;
    }

    @Transient
    public boolean isSetTheOrganisationAuthority() {
        return (this.theOrganisationAuthority != null);
    }

    /**
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityForSpecialNavigationStationExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = AuthorityForSpecialNavigationStationExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "authorityforspecialnavigationstation_oe_hjid", referencedColumnName = "hjid")
    public List<AuthorityForSpecialNavigationStationExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<AuthorityForSpecialNavigationStationExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeAuthorityRoleType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAuthorityRoleType.class, this.getType());
    }

    public void setTypeItem(CodeAuthorityRoleType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAuthorityRoleType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), AuthorityForSpecialNavigationStationType.class,
                target));
    }

    @OneToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "athrtfrspclnvgtnsttntp_thorgnstnathrt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "authorityforspecialnavigationstation_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "theorganisationauthority_hjid", referencedColumnName = "hjid")})
    public OrganisationAuthorityPropertyType getTheOrganisationAuthorityItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class,
                this.getTheOrganisationAuthority());
    }

    public void setTheOrganisationAuthorityItem(OrganisationAuthorityPropertyType target) {
        setTheOrganisationAuthority(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "theOrganisationAuthority"),
                AuthorityForSpecialNavigationStationType.class, target));
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AuthorityForSpecialNavigationStationType that = ((AuthorityForSpecialNavigationStationType) object);
        {
            boolean lhsFieldIsSet = this.isSetTheOrganisationAuthority();
            boolean rhsFieldIsSet = that.isSetTheOrganisationAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getTheOrganisationAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getTheOrganisationAuthority();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "theOrganisationAuthority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "theOrganisationAuthority", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAuthorityRoleType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAuthorityRoleType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AuthorityForSpecialNavigationStationExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<AuthorityForSpecialNavigationStationExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation() ? that.getAnnotation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAuthorityRoleType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheOrganisationAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getTheOrganisationAuthority();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "theOrganisationAuthority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AuthorityForSpecialNavigationStationExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAuthorityRoleType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheOrganisationAuthority();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getTheOrganisationAuthority();
            strategy.appendField(locator, this, "theOrganisationAuthority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AuthorityForSpecialNavigationStationExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
