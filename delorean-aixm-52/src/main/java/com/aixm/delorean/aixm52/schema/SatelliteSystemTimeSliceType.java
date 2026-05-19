
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
 * Java class for SatelliteSystemTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="SatelliteSystemTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeSatelliteSystemType" minOccurs="0"/>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="augmentedSystem" type=
"{http://www.aixm.aero/schema/5.2}SatelliteSystemPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="operator" type=
"{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" minOccurs=
"0"/>
 *         <element name="emission" type=
"{http://www.aixm.aero/schema/5.2}RadioFrequencyPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractSatelliteSystemExtension"/>
 *                 </sequence>
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
@XmlType(name = "SatelliteSystemTimeSliceType", propOrder = {"type", "aixmName", "designator", "augmentedSystem",
        "operator", "emission", "annotation", "extension"})
@Entity(name = "SatelliteSystemTimeSliceType")
@Table(name = "satellitesystem_t", schema = "navaids_point")
public class SatelliteSystemTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSatelliteSystemType> type;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElement(nillable = true)
    protected List<SatelliteSystemPropertyType> augmentedSystem;
    @XmlElementRef(name = "operator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> operator;
    @XmlElement(nillable = true)
    protected List<RadioFrequencyPropertyType> emission;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SatelliteSystemExtensionType> extension;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSatelliteSystemType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeSatelliteSystemType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSatelliteSystemType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeSatelliteSystemType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the aixmName property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link TextNameType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link TextNameType
     *            }{@code >}
     *
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName != null);
    }

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator != null);
    }

    /**
     * Gets the value of the augmentedSystem property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the augmentedSystem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAugmentedSystem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SatelliteSystemPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteSystemPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsstmtmslctp_agmntdsstm_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satellitesystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "augmentedsystem_hjid", referencedColumnName = "hjid")})
    public List<SatelliteSystemPropertyType> getAugmentedSystem() {
        if (augmentedSystem == null) {
            augmentedSystem = new ArrayList<>();
        }
        return this.augmentedSystem;
    }

    /**
     *
     *
     */
    public void setAugmentedSystem(List<SatelliteSystemPropertyType> augmentedSystem) {
        this.augmentedSystem = augmentedSystem;
    }

    @Transient
    public boolean isSetAugmentedSystem() {
        return ((this.augmentedSystem != null) && (!this.augmentedSystem.isEmpty()));
    }

    public void unsetAugmentedSystem() {
        this.augmentedSystem = null;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *
     */
    public void setOperator(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.operator = value;
    }

    @Transient
    public boolean isSetOperator() {
        return (this.operator != null);
    }

    /**
     * Gets the value of the emission property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the emission property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getEmission().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadioFrequencyPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = RadioFrequencyPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsstmtmslctp_emssn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satellitesystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "emission_hjid", referencedColumnName = "hjid")})
    public List<RadioFrequencyPropertyType> getEmission() {
        if (emission == null) {
            emission = new ArrayList<>();
        }
        return this.emission;
    }

    /**
     *
     *
     */
    public void setEmission(List<RadioFrequencyPropertyType> emission) {
        this.emission = emission;
    }

    @Transient
    public boolean isSetEmission() {
        return ((this.emission != null) && (!this.emission.isEmpty()));
    }

    public void unsetEmission() {
        this.emission = null;
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
    @JoinTable(name = "stlltsstmtmslctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satellitesystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link SatelliteSystemExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteSystemExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "satellitesysteme_hjid", referencedColumnName = "hjid")
    public List<SatelliteSystemExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<SatelliteSystemExtensionType> extension) {
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
    public CodeSatelliteSystemType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSatelliteSystemType.class, this.getType());
    }

    public void setTypeItem(CodeSatelliteSystemType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeSatelliteSystemType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), SatelliteSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "name", columnDefinition = "VARCHAR", length = 60)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "namenilreason"))})
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class,
                new QName("http://www.aixm.aero/schema/5.2", "name"), SatelliteSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 16)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"), SatelliteSystemTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsstmtmslctp_oprtr_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satellitesystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "operator_hjid", referencedColumnName = "hjid")})
    public OrganisationAuthorityPropertyType getOperatorItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getOperator());
    }

    public void setOperatorItem(OrganisationAuthorityPropertyType target) {
        setOperator(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "operator"), SatelliteSystemTimeSliceType.class, target));
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
        final SatelliteSystemTimeSliceType that = ((SatelliteSystemTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAugmentedSystem();
            boolean rhsFieldIsSet = that.isSetAugmentedSystem();
            List<SatelliteSystemPropertyType> lhsField;
            lhsField = (this.isSetAugmentedSystem() ? this.getAugmentedSystem() : null);
            List<SatelliteSystemPropertyType> rhsField;
            rhsField = (that.isSetAugmentedSystem() ? that.getAugmentedSystem() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "augmentedSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "augmentedSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperator();
            boolean rhsFieldIsSet = that.isSetOperator();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getOperator();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getOperator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmission();
            boolean rhsFieldIsSet = that.isSetEmission();
            List<RadioFrequencyPropertyType> lhsField;
            lhsField = (this.isSetEmission() ? this.getEmission() : null);
            List<RadioFrequencyPropertyType> rhsField;
            rhsField = (that.isSetEmission() ? that.getEmission() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emission", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emission", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeSatelliteSystemType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeSatelliteSystemType> rhsField;
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
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SatelliteSystemExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<SatelliteSystemExtensionType> rhsField;
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeSatelliteSystemType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAugmentedSystem();
            List<SatelliteSystemPropertyType> theField;
            theField = (this.isSetAugmentedSystem() ? this.getAugmentedSystem() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "augmentedSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperator();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getOperator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmission();
            List<RadioFrequencyPropertyType> theField;
            theField = (this.isSetEmission() ? this.getEmission() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emission", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<SatelliteSystemExtensionType> theField;
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
            JAXBElement<CodeSatelliteSystemType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAugmentedSystem();
            List<SatelliteSystemPropertyType> theField;
            theField = (this.isSetAugmentedSystem() ? this.getAugmentedSystem() : null);
            strategy.appendField(locator, this, "augmentedSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperator();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getOperator();
            strategy.appendField(locator, this, "operator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmission();
            List<RadioFrequencyPropertyType> theField;
            theField = (this.isSetEmission() ? this.getEmission() : null);
            strategy.appendField(locator, this, "emission", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SatelliteSystemExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
