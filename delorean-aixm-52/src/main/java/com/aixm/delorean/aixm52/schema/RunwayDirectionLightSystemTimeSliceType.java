
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
 * Java class for RunwayDirectionLightSystemTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="RunwayDirectionLightSystemTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="emergencyLighting" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="intensityLevel" type=
"{http://www.aixm.aero/schema/5.2}CodeLightIntensityType" minOccurs="0"/>
 *         <element name="colour" type=
"{http://www.aixm.aero/schema/5.2}CodeColourType" minOccurs="0"/>
 *         <element name="element" type=
"{http://www.aixm.aero/schema/5.2}LightElementPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}GroundLightingAvailabilityPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="position" type=
"{http://www.aixm.aero/schema/5.2}CodeRunwaySectionType" minOccurs="0"/>
 *         <element name="associatedRunwayDirection" type=
"{http://www.aixm.aero/schema/5.2}RunwayDirectionPropertyType" minOccurs="0"/>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeRunwayLightType" minOccurs="0"/>
 *         <element name="length" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="spacing" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="group" type=
"{http://www.aixm.aero/schema/5.2}LightGroupPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractRunwayDirectionLightSystemExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractGroundLightSystemExtension"/>
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
@XmlType(name = "RunwayDirectionLightSystemTimeSliceType", propOrder = {"emergencyLighting", "intensityLevel", "colour",
        "element", "availability", "annotation", "position", "associatedRunwayDirection", "type", "length", "spacing",
        "group", "extension"})
@Entity(name = "RunwayDirectionLightSystemTimeSliceType")
@Table(name = "runwaydirectionlightsystem_t", schema = "airport_heliport")
public class RunwayDirectionLightSystemTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "emergencyLighting", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> emergencyLighting;
    @XmlElementRef(name = "intensityLevel", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightIntensityType> intensityLevel;
    @XmlElementRef(name = "colour", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> colour;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<GroundLightingAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwaySectionType> position;
    @XmlElementRef(name = "associatedRunwayDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> associatedRunwayDirection;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayLightType> type;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "spacing", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> spacing;
    @XmlElement(nillable = true)
    protected List<LightGroupPropertyType> group;
    protected List<RunwayDirectionLightSystemTimeSliceExtensionType> extension;

    /**
     * Gets the value of the emergencyLighting property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getEmergencyLighting() {
        return emergencyLighting;
    }

    /**
     * Sets the value of the emergencyLighting property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setEmergencyLighting(JAXBElement<CodeYesNoType> value) {
        this.emergencyLighting = value;
    }

    @Transient
    public boolean isSetEmergencyLighting() {
        return (this.emergencyLighting != null);
    }

    /**
     * Gets the value of the intensityLevel property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeLightIntensityType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeLightIntensityType> getIntensityLevel() {
        return intensityLevel;
    }

    /**
     * Sets the value of the intensityLevel property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeLightIntensityType }{@code >}
     *
     */
    public void setIntensityLevel(JAXBElement<CodeLightIntensityType> value) {
        this.intensityLevel = value;
    }

    @Transient
    public boolean isSetIntensityLevel() {
        return (this.intensityLevel != null);
    }

    /**
     * Gets the value of the colour property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeColourType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeColourType> getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeColourType }{@code >}
     *
     */
    public void setColour(JAXBElement<CodeColourType> value) {
        this.colour = value;
    }

    @Transient
    public boolean isSetColour() {
        return (this.colour != null);
    }

    /**
     * Gets the value of the element property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the element property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = LightElementPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctnlghtsstmtmslctp_elmnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaydirectionlightsystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "element_hjid", referencedColumnName = "hjid")})
    public List<LightElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return this.element;
    }

    /**
     *
     *
     */
    public void setElement(List<LightElementPropertyType> element) {
        this.element = element;
    }

    @Transient
    public boolean isSetElement() {
        return ((this.element != null) && (!this.element.isEmpty()));
    }

    public void unsetElement() {
        this.element = null;
    }

    /**
     * Gets the value of the availability property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the availability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAvailability().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightingAvailabilityPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = GroundLightingAvailabilityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctnlghtsstmtmslctp_avlblt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaydirectionlightsystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
    public List<GroundLightingAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     *
     *
     */
    public void setAvailability(List<GroundLightingAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability != null) && (!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
    @JoinTable(name = "rnwdrctnlghtsstmtmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaydirectionlightsystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the position property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeRunwaySectionType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeRunwaySectionType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeRunwaySectionType }{@code >}
     *
     */
    public void setPosition(JAXBElement<CodeRunwaySectionType> value) {
        this.position = value;
    }

    @Transient
    public boolean isSetPosition() {
        return (this.position != null);
    }

    /**
     * Gets the value of the associatedRunwayDirection property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<RunwayDirectionPropertyType> getAssociatedRunwayDirection() {
        return associatedRunwayDirection;
    }

    /**
     * Sets the value of the associatedRunwayDirection property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *
     */
    public void setAssociatedRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.associatedRunwayDirection = value;
    }

    @Transient
    public boolean isSetAssociatedRunwayDirection() {
        return (this.associatedRunwayDirection != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeRunwayLightType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeRunwayLightType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeRunwayLightType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeRunwayLightType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the length property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    @Transient
    public boolean isSetLength() {
        return (this.length != null);
    }

    /**
     * Gets the value of the spacing property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getSpacing() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setSpacing(JAXBElement<ValDistanceType> value) {
        this.spacing = value;
    }

    @Transient
    public boolean isSetSpacing() {
        return (this.spacing != null);
    }

    /**
     * Gets the value of the group property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the group property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightGroupPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = LightGroupPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctnlghtsstmtmslctp_grp_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaydirectionlightsystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "group__hjid", referencedColumnName = "hjid")})
    public List<LightGroupPropertyType> getGroup() {
        if (group == null) {
            group = new ArrayList<>();
        }
        return this.group;
    }

    /**
     *
     *
     */
    public void setGroup(List<LightGroupPropertyType> group) {
        this.group = group;
    }

    @Transient
    public boolean isSetGroup() {
        return ((this.group != null) && (!this.group.isEmpty()));
    }

    public void unsetGroup() {
        this.group = null;
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
     * {@link RunwayDirectionLightSystemTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayDirectionLightSystemTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaydirectionlightsystem_te_hjid", referencedColumnName = "hjid")
    public List<RunwayDirectionLightSystemTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<RunwayDirectionLightSystemTimeSliceExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "emergencylighting")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "emergencylightingnilreason"))})
    public CodeYesNoType getEmergencyLightingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getEmergencyLighting());
    }

    public void setEmergencyLightingItem(CodeYesNoType target) {
        setEmergencyLighting(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "emergencyLighting"),
                RunwayDirectionLightSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "intensitylevel")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "intensitylevelnilreason"))})
    public CodeLightIntensityType getIntensityLevelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightIntensityType.class, this.getIntensityLevel());
    }

    public void setIntensityLevelItem(CodeLightIntensityType target) {
        setIntensityLevel(XmlAdapterUtils.marshallJAXBElement(CodeLightIntensityType.class,
                new QName("http://www.aixm.aero/schema/5.2", "intensityLevel"),
                RunwayDirectionLightSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "colour")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "colournilreason"))})
    public CodeColourType getColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getColour());
    }

    public void setColourItem(CodeColourType target) {
        setColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class,
                new QName("http://www.aixm.aero/schema/5.2", "colour"), RunwayDirectionLightSystemTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "position")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "positionnilreason"))})
    public CodeRunwaySectionType getPositionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwaySectionType.class, this.getPosition());
    }

    public void setPositionItem(CodeRunwaySectionType target) {
        setPosition(XmlAdapterUtils.marshallJAXBElement(CodeRunwaySectionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "position"), RunwayDirectionLightSystemTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = RunwayDirectionPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwdrctnlghtsstmtmslctp_assctdrnwdrctn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaydirectionlightsystem_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "associatedrunwaydirection_hjid", referencedColumnName = "hjid")})
    public RunwayDirectionPropertyType getAssociatedRunwayDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayDirectionPropertyType.class, this.getAssociatedRunwayDirection());
    }

    public void setAssociatedRunwayDirectionItem(RunwayDirectionPropertyType target) {
        setAssociatedRunwayDirection(XmlAdapterUtils.marshallJAXBElement(RunwayDirectionPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "associatedRunwayDirection"),
                RunwayDirectionLightSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeRunwayLightType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayLightType.class, this.getType());
    }

    public void setTypeItem(CodeRunwayLightType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeRunwayLightType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), RunwayDirectionLightSystemTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "length", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "lengthuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "lengthaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lengthnilreason"))})
    public ValDistanceType getLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLength());
    }

    public void setLengthItem(ValDistanceType target) {
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "length"), RunwayDirectionLightSystemTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "spacing", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "spacinguom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "spacingaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "spacingnilreason"))})
    public ValDistanceType getSpacingItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getSpacing());
    }

    public void setSpacingItem(ValDistanceType target) {
        setSpacing(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "spacing"), RunwayDirectionLightSystemTimeSliceType.class,
                target));
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
        final RunwayDirectionLightSystemTimeSliceType that = ((RunwayDirectionLightSystemTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetAssociatedRunwayDirection();
            boolean rhsFieldIsSet = that.isSetAssociatedRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> lhsField;
            lhsField = this.getAssociatedRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> rhsField;
            rhsField = that.getAssociatedRunwayDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedRunwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedRunwayDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLength();
            boolean rhsFieldIsSet = that.isSetLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "length", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "length", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayDirectionLightSystemTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<RunwayDirectionLightSystemTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPosition();
            boolean rhsFieldIsSet = that.isSetPosition();
            JAXBElement<CodeRunwaySectionType> lhsField;
            lhsField = this.getPosition();
            JAXBElement<CodeRunwaySectionType> rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetElement();
            boolean rhsFieldIsSet = that.isSetElement();
            List<LightElementPropertyType> lhsField;
            lhsField = (this.isSetElement() ? this.getElement() : null);
            List<LightElementPropertyType> rhsField;
            rhsField = (that.isSetElement() ? that.getElement() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "element", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "element", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<GroundLightingAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability() ? that.getAvailability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpacing();
            boolean rhsFieldIsSet = that.isSetSpacing();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getSpacing();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getSpacing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spacing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spacing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmergencyLighting();
            boolean rhsFieldIsSet = that.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getEmergencyLighting();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getEmergencyLighting();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emergencyLighting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emergencyLighting", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGroup();
            boolean rhsFieldIsSet = that.isSetGroup();
            List<LightGroupPropertyType> lhsField;
            lhsField = (this.isSetGroup() ? this.getGroup() : null);
            List<LightGroupPropertyType> rhsField;
            rhsField = (that.isSetGroup() ? that.getGroup() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "group", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "group", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeRunwayLightType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeRunwayLightType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetColour();
            boolean rhsFieldIsSet = that.isSetColour();
            JAXBElement<CodeColourType> lhsField;
            lhsField = this.getColour();
            JAXBElement<CodeColourType> rhsField;
            rhsField = that.getColour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "colour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "colour", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntensityLevel();
            boolean rhsFieldIsSet = that.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> lhsField;
            lhsField = this.getIntensityLevel();
            JAXBElement<CodeLightIntensityType> rhsField;
            rhsField = that.getIntensityLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intensityLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intensityLevel", rhsField);
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
            boolean theFieldIsSet = this.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEmergencyLighting();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emergencyLighting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intensityLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "colour", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement() ? this.getElement() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "element", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<CodeRunwaySectionType> theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getAssociatedRunwayDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedRunwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeRunwayLightType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "length", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpacing();
            JAXBElement<ValDistanceType> theField;
            theField = this.getSpacing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spacing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            List<LightGroupPropertyType> theField;
            theField = (this.isSetGroup() ? this.getGroup() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "group", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayDirectionLightSystemTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEmergencyLighting();
            strategy.appendField(locator, this, "emergencyLighting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            strategy.appendField(locator, this, "intensityLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            strategy.appendField(locator, this, "colour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement() ? this.getElement() : null);
            strategy.appendField(locator, this, "element", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<CodeRunwaySectionType> theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getAssociatedRunwayDirection();
            strategy.appendField(locator, this, "associatedRunwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeRunwayLightType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpacing();
            JAXBElement<ValDistanceType> theField;
            theField = this.getSpacing();
            strategy.appendField(locator, this, "spacing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            List<LightGroupPropertyType> theField;
            theField = (this.isSetGroup() ? this.getGroup() : null);
            strategy.appendField(locator, this, "group", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayDirectionLightSystemTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
