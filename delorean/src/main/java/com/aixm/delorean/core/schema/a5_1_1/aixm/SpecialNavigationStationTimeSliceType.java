
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for SpecialNavigationStationTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecialNavigationStationTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}SpecialNavigationStationPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSpecialNavigationStationExtension"/>
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
@XmlType(name = "SpecialNavigationStationTimeSliceType", propOrder = {
    "aixmName",
    "type",
    "frequency",
    "emission",
    "systemChain",
    "responsibleOrganisation",
    "position",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "SpecialNavigationStationTimeSliceType")
@Table(name = "specialnavigationstation_ts", schema = "navaids_point")
public class SpecialNavigationStationTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpecialNavigationStationType> type;
    @XmlElementRef(name = "frequency", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequency;
    @XmlElementRef(name = "emission", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioEmissionType> emission;
    @XmlElementRef(name = "systemChain", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationSystemPropertyType> systemChain;
    @XmlElementRef(name = "responsibleOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthorityForSpecialNavigationStationPropertyType> responsibleOrganisation;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> position;
    @XmlElement(nillable = true)
    protected List<SpecialNavigationStationStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SpecialNavigationStationExtensionType> extension;

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
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationStationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSpecialNavigationStationType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationStationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeSpecialNavigationStationType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFrequencyType> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<ValFrequencyType> value) {
        this.frequency = value;
    }

    @Transient
    public boolean isSetFrequency() {
        return (this.frequency!= null);
    }

    /**
     * Gets the value of the emission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRadioEmissionType> getEmission() {
        return emission;
    }

    /**
     * Sets the value of the emission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public void setEmission(JAXBElement<CodeRadioEmissionType> value) {
        this.emission = value;
    }

    @Transient
    public boolean isSetEmission() {
        return (this.emission!= null);
    }

    /**
     * Gets the value of the systemChain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SpecialNavigationSystemPropertyType> getSystemChain() {
        return systemChain;
    }

    /**
     * Sets the value of the systemChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public void setSystemChain(JAXBElement<SpecialNavigationSystemPropertyType> value) {
        this.systemChain = value;
    }

    @Transient
    public boolean isSetSystemChain() {
        return (this.systemChain!= null);
    }

    /**
     * Gets the value of the responsibleOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityForSpecialNavigationStationPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AuthorityForSpecialNavigationStationPropertyType> getResponsibleOrganisation() {
        return responsibleOrganisation;
    }

    /**
     * Sets the value of the responsibleOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityForSpecialNavigationStationPropertyType }{@code >}
     *     
     */
    public void setResponsibleOrganisation(JAXBElement<AuthorityForSpecialNavigationStationPropertyType> value) {
        this.responsibleOrganisation = value;
    }

    @Transient
    public boolean isSetResponsibleOrganisation() {
        return (this.responsibleOrganisation!= null);
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
     * {@link SpecialNavigationStationStatusPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = SpecialNavigationStationStatusPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_specialnavigationstation_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "specialnavigationstationpropertygroup", referencedColumnName = "hjid")
    })
    public List<SpecialNavigationStationStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<SpecialNavigationStationStatusPropertyType> availability) {
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
    @JoinTable(name = "annotation_specialnavigationstation_link", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "specialnavigationstationpropertygroup", referencedColumnName = "hjid")
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
     * {@link SpecialNavigationStationExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = SpecialNavigationStationExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_SPECIAL_NAVIGATION_0")
    public List<SpecialNavigationStationExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<SpecialNavigationStationExtensionType> extension) {
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), SpecialNavigationStationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeSpecialNavigationStationType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSpecialNavigationStationType.class, this.getType());
    }

    public void setTypeItem(CodeSpecialNavigationStationType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeSpecialNavigationStationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), SpecialNavigationStationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frequency")),
        @AttributeOverride(name = "uom", column = @Column(name = "frequency_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frequency_nilreason"))
    })
    public ValFrequencyType getFrequencyItem() {
        return XmlAdapterUtils.unmarshallSource(ValFrequencyType.class, this.getFrequency());
    }

    public void setFrequencyItem(ValFrequencyType target) {
        setFrequency(XmlAdapterUtils.marshallJAXBElement(ValFrequencyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frequency"), SpecialNavigationStationTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "emission")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "emission_nilreason"))
    })
    public CodeRadioEmissionType getEmissionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRadioEmissionType.class, this.getEmission());
    }

    public void setEmissionItem(CodeRadioEmissionType target) {
        setEmission(XmlAdapterUtils.marshallJAXBElement(CodeRadioEmissionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "emission"), SpecialNavigationStationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SpecialNavigationSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "systemchain_id", referencedColumnName = "hjid")
    public SpecialNavigationSystemPropertyType getSystemChainItem() {
        return XmlAdapterUtils.unmarshallSource(SpecialNavigationSystemPropertyType.class, this.getSystemChain());
    }

    public void setSystemChainItem(SpecialNavigationSystemPropertyType target) {
        setSystemChain(XmlAdapterUtils.marshallJAXBElement(SpecialNavigationSystemPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "systemChain"), SpecialNavigationStationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AuthorityForSpecialNavigationStationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "responsibleorganisation_id", referencedColumnName = "hjid")
    public AuthorityForSpecialNavigationStationPropertyType getResponsibleOrganisationItem() {
        return XmlAdapterUtils.unmarshallSource(AuthorityForSpecialNavigationStationPropertyType.class, this.getResponsibleOrganisation());
    }

    public void setResponsibleOrganisationItem(AuthorityForSpecialNavigationStationPropertyType target) {
        setResponsibleOrganisation(XmlAdapterUtils.marshallJAXBElement(AuthorityForSpecialNavigationStationPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "responsibleOrganisation"), SpecialNavigationStationTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getPosition());
    }

    public void setPositionItem(AIXMElevatedPointPropertyType target) {
        setPosition(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "position"), SpecialNavigationStationTimeSliceType.class, target));
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
        final SpecialNavigationStationTimeSliceType that = ((SpecialNavigationStationTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeSpecialNavigationStationType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeSpecialNavigationStationType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmission();
            boolean rhsFieldIsSet = that.isSetEmission();
            JAXBElement<CodeRadioEmissionType> lhsField;
            lhsField = this.getEmission();
            JAXBElement<CodeRadioEmissionType> rhsField;
            rhsField = that.getEmission();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emission", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emission", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrequency();
            boolean rhsFieldIsSet = that.isSetFrequency();
            JAXBElement<ValFrequencyType> lhsField;
            lhsField = this.getFrequency();
            JAXBElement<ValFrequencyType> rhsField;
            rhsField = that.getFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frequency", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetResponsibleOrganisation();
            boolean rhsFieldIsSet = that.isSetResponsibleOrganisation();
            JAXBElement<AuthorityForSpecialNavigationStationPropertyType> lhsField;
            lhsField = this.getResponsibleOrganisation();
            JAXBElement<AuthorityForSpecialNavigationStationPropertyType> rhsField;
            rhsField = that.getResponsibleOrganisation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "responsibleOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "responsibleOrganisation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SpecialNavigationStationExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<SpecialNavigationStationExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSystemChain();
            boolean rhsFieldIsSet = that.isSetSystemChain();
            JAXBElement<SpecialNavigationSystemPropertyType> lhsField;
            lhsField = this.getSystemChain();
            JAXBElement<SpecialNavigationSystemPropertyType> rhsField;
            rhsField = that.getSystemChain();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "systemChain", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "systemChain", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<SpecialNavigationStationStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<SpecialNavigationStationStatusPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
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
            JAXBElement<CodeSpecialNavigationStationType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrequency();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmission();
            JAXBElement<CodeRadioEmissionType> theField;
            theField = this.getEmission();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emission", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSystemChain();
            JAXBElement<SpecialNavigationSystemPropertyType> theField;
            theField = this.getSystemChain();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "systemChain", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResponsibleOrganisation();
            JAXBElement<AuthorityForSpecialNavigationStationPropertyType> theField;
            theField = this.getResponsibleOrganisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "responsibleOrganisation", theField);
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
            boolean theFieldIsSet = this.isSetAvailability();
            List<SpecialNavigationStationStatusPropertyType> theField;
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
            List<SpecialNavigationStationExtensionType> theField;
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
            JAXBElement<CodeSpecialNavigationStationType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrequency();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequency();
            strategy.appendField(locator, this, "frequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmission();
            JAXBElement<CodeRadioEmissionType> theField;
            theField = this.getEmission();
            strategy.appendField(locator, this, "emission", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSystemChain();
            JAXBElement<SpecialNavigationSystemPropertyType> theField;
            theField = this.getSystemChain();
            strategy.appendField(locator, this, "systemChain", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetResponsibleOrganisation();
            JAXBElement<AuthorityForSpecialNavigationStationPropertyType> theField;
            theField = this.getResponsibleOrganisation();
            strategy.appendField(locator, this, "responsibleOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<SpecialNavigationStationStatusPropertyType> theField;
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
            List<SpecialNavigationStationExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
