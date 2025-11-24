
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for UnitTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnitTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}UnitPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractUnitExtension"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
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
@XmlType(name = "UnitTimeSliceType", propOrder = {
    "aixmName",
    "type",
    "compliantICAO",
    "designator",
    "military",
    "position",
    "airportLocation",
    "ownerOrganisation",
    "contact",
    "relatedUnit",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "UnitTimeSliceType")
@Table(name = "unit_ts", schema = "organisation")
public class UnitTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUnitType> type;
    @XmlElementRef(name = "compliantICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> compliantICAO;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeOrganisationDesignatorType> designator;
    @XmlElementRef(name = "military", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryOperationsType> military;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> position;
    @XmlElementRef(name = "airportLocation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> airportLocation;
    @XmlElementRef(name = "ownerOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> ownerOrganisation;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElement(nillable = true)
    protected List<UnitDependencyPropertyType> relatedUnit;
    @XmlElement(nillable = true)
    protected List<UnitAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<UnitExtensionType> extension;

    /**
     * Gets the value of the aixmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getAixmName() {
        return aixmName;
    }

    /**
     * Sets the value of the aixmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUnitType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeUnitType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUnitType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeUnitType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the compliantICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getCompliantICAO() {
        return compliantICAO;
    }

    /**
     * Sets the value of the compliantICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCompliantICAO(JAXBElement<CodeYesNoType> value) {
        this.compliantICAO = value;
    }

    @Transient
    public boolean isSetCompliantICAO() {
        return (this.compliantICAO!= null);
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeOrganisationDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeOrganisationDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeOrganisationDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeOrganisationDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the military property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMilitaryOperationsType> getMilitary() {
        return military;
    }

    /**
     * Sets the value of the military property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public void setMilitary(JAXBElement<CodeMilitaryOperationsType> value) {
        this.military = value;
    }

    @Transient
    public boolean isSetMilitary() {
        return (this.military!= null);
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setPosition(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.position = value;
    }

    @Transient
    public boolean isSetPosition() {
        return (this.position!= null);
    }

    /**
     * Gets the value of the airportLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getAirportLocation() {
        return airportLocation;
    }

    /**
     * Sets the value of the airportLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAirportLocation(JAXBElement<AirportHeliportPropertyType> value) {
        this.airportLocation = value;
    }

    @Transient
    public boolean isSetAirportLocation() {
        return (this.airportLocation!= null);
    }

    /**
     * Gets the value of the ownerOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getOwnerOrganisation() {
        return ownerOrganisation;
    }

    /**
     * Sets the value of the ownerOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setOwnerOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.ownerOrganisation = value;
    }

    @Transient
    public boolean isSetOwnerOrganisation() {
        return (this.ownerOrganisation!= null);
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ContactInformationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "contact_unit_link", schema = "organisation", joinColumns = {
        @JoinColumn(name = "contact", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unitpropertygroup", referencedColumnName = "hjid")
    })
    public List<ContactInformationPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
    }

    /**
     * 
     * 
     */
    public void setContact(List<ContactInformationPropertyType> contact) {
        this.contact = contact;
    }

    @Transient
    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
    }

    /**
     * Gets the value of the relatedUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitDependencyPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = UnitDependencyPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "relatedunit_unit_link", schema = "organisation", joinColumns = {
        @JoinColumn(name = "relatedunit", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unitpropertygroup", referencedColumnName = "hjid")
    })
    public List<UnitDependencyPropertyType> getRelatedUnit() {
        if (relatedUnit == null) {
            relatedUnit = new ArrayList<>();
        }
        return this.relatedUnit;
    }

    /**
     * 
     * 
     */
    public void setRelatedUnit(List<UnitDependencyPropertyType> relatedUnit) {
        this.relatedUnit = relatedUnit;
    }

    @Transient
    public boolean isSetRelatedUnit() {
        return ((this.relatedUnit!= null)&&(!this.relatedUnit.isEmpty()));
    }

    public void unsetRelatedUnit() {
        this.relatedUnit = null;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = UnitAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_unit_link", schema = "organisation", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unitpropertygroup", referencedColumnName = "hjid")
    })
    public List<UnitAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<UnitAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_unit_link", schema = "organisation", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unitpropertygroup", referencedColumnName = "hjid")
    })
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
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = UnitExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<UnitExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<UnitExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), UnitTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeUnitType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeUnitType.class, this.getType());
    }

    public void setTypeItem(CodeUnitType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeUnitType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), UnitTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "complianticao")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "complianticao_nilreason"))
    })
    public CodeYesNoType getCompliantICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getCompliantICAO());
    }

    public void setCompliantICAOItem(CodeYesNoType target) {
        setCompliantICAO(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "compliantICAO"), UnitTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public CodeOrganisationDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeOrganisationDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(CodeOrganisationDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeOrganisationDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), UnitTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "military")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "military_nilreason"))
    })
    public CodeMilitaryOperationsType getMilitaryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMilitaryOperationsType.class, this.getMilitary());
    }

    public void setMilitaryItem(CodeMilitaryOperationsType target) {
        setMilitary(XmlAdapterUtils.marshallJAXBElement(CodeMilitaryOperationsType.class, new QName("http://www.aixm.aero/schema/5.1.1", "military"), UnitTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getPosition());
    }

    public void setPositionItem(AIXMElevatedPointPropertyType target) {
        setPosition(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "position"), UnitTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "airportlocation_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getAirportLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAirportLocation());
    }

    public void setAirportLocationItem(AirportHeliportPropertyType target) {
        setAirportLocation(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "airportLocation"), UnitTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ownerorganisation_id", referencedColumnName = "hjid")
    public OrganisationAuthorityPropertyType getOwnerOrganisationItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getOwnerOrganisation());
    }

    public void setOwnerOrganisationItem(OrganisationAuthorityPropertyType target) {
        setOwnerOrganisation(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "ownerOrganisation"), UnitTimeSliceType.class, target));
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
        final UnitTimeSliceType that = ((UnitTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAirportLocation();
            boolean rhsFieldIsSet = that.isSetAirportLocation();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getAirportLocation();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getAirportLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelatedUnit();
            boolean rhsFieldIsSet = that.isSetRelatedUnit();
            List<UnitDependencyPropertyType> lhsField;
            lhsField = (this.isSetRelatedUnit()?this.getRelatedUnit():null);
            List<UnitDependencyPropertyType> rhsField;
            rhsField = (that.isSetRelatedUnit()?that.getRelatedUnit():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relatedUnit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relatedUnit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCompliantICAO();
            boolean rhsFieldIsSet = that.isSetCompliantICAO();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getCompliantICAO();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getCompliantICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "compliantICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "compliantICAO", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContact();
            boolean rhsFieldIsSet = that.isSetContact();
            List<ContactInformationPropertyType> lhsField;
            lhsField = (this.isSetContact()?this.getContact():null);
            List<ContactInformationPropertyType> rhsField;
            rhsField = (that.isSetContact()?that.getContact():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contact", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contact", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPosition();
            boolean rhsFieldIsSet = that.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getPosition();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOwnerOrganisation();
            boolean rhsFieldIsSet = that.isSetOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getOwnerOrganisation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ownerOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ownerOrganisation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAixmName();
            boolean rhsFieldIsSet = that.isSetAixmName();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getAixmName();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getAixmName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aixmName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aixmName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitary();
            boolean rhsFieldIsSet = that.isSetMilitary();
            JAXBElement<CodeMilitaryOperationsType> lhsField;
            lhsField = this.getMilitary();
            JAXBElement<CodeMilitaryOperationsType> rhsField;
            rhsField = that.getMilitary();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "military", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "military", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeUnitType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeUnitType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<CodeOrganisationDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<CodeOrganisationDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<UnitAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<UnitAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<UnitExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<UnitExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
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
            lhsField = (this.isSetAnnotation()?this.getAnnotation():null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation()?that.getAnnotation():null);
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeUnitType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCompliantICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCompliantICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "compliantICAO", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeOrganisationDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitary();
            JAXBElement<CodeMilitaryOperationsType> theField;
            theField = this.getMilitary();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "military", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportLocation();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAirportLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getOwnerOrganisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ownerOrganisation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contact", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelatedUnit();
            List<UnitDependencyPropertyType> theField;
            theField = (this.isSetRelatedUnit()?this.getRelatedUnit():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relatedUnit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<UnitAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<UnitExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeUnitType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCompliantICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCompliantICAO();
            strategy.appendField(locator, this, "compliantICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeOrganisationDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitary();
            JAXBElement<CodeMilitaryOperationsType> theField;
            theField = this.getMilitary();
            strategy.appendField(locator, this, "military", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportLocation();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAirportLocation();
            strategy.appendField(locator, this, "airportLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getOwnerOrganisation();
            strategy.appendField(locator, this, "ownerOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContact();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetContact()?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelatedUnit();
            List<UnitDependencyPropertyType> theField;
            theField = (this.isSetRelatedUnit()?this.getRelatedUnit():null);
            strategy.appendField(locator, this, "relatedUnit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<UnitAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<UnitExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
