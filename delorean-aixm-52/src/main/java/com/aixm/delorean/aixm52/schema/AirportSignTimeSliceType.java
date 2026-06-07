
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
 * Java class for AirportSignTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AirportSignTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeAirportSignType" minOccurs="0"/>
 *         <element name="frontMessageText" type=
"{http://www.aixm.aero/schema/5.2}TextNoteType" minOccurs="0"/>
 *         <element name="backMessageText" type=
"{http://www.aixm.aero/schema/5.2}TextNoteType" minOccurs="0"/>
 *         <element name="frontSignBearing" type=
"{http://www.aixm.aero/schema/5.2}ValBearingType" minOccurs="0"/>
 *         <element name="height" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="lighted" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="direction" type=
"{http://www.aixm.aero/schema/5.2}CodeCardinalDirectionType" minOccurs="0"/>
 *         <element name="side" type=
"{http://www.aixm.aero/schema/5.2}CodeSideType" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="signStatus" type=
"{http://www.aixm.aero/schema/5.2}AirportSignStatusPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="associatedAirport" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractAirportSignExtension"/>
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
@XmlType(name = "AirportSignTimeSliceType", propOrder = {"type", "frontMessageText", "backMessageText",
        "frontSignBearing", "height", "lighted", "direction", "side", "location", "signStatus", "associatedAirport",
        "annotation", "extension"})
@Entity(name = "AirportSignTimeSliceType")
@Table(name = "airportsign_t", schema = "airport_heliport")
public class AirportSignTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportSignType> type;
    @XmlElementRef(name = "frontMessageText", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNoteType> frontMessageText;
    @XmlElementRef(name = "backMessageText", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNoteType> backMessageText;
    @XmlElementRef(name = "frontSignBearing", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> frontSignBearing;
    @XmlElementRef(name = "height", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> height;
    @XmlElementRef(name = "lighted", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> lighted;
    @XmlElementRef(name = "direction", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> direction;
    @XmlElementRef(name = "side", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> side;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<AirportSignStatusPropertyType> signStatus;
    @XmlElementRef(name = "associatedAirport", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirport;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AirportSignTimeSliceExtensionType> extension;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAirportSignType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAirportSignType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAirportSignType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeAirportSignType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the frontMessageText property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link TextNoteType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextNoteType> getFrontMessageText() {
        return frontMessageText;
    }

    /**
     * Sets the value of the frontMessageText property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link TextNoteType
     *            }{@code >}
     *
     */
    public void setFrontMessageText(JAXBElement<TextNoteType> value) {
        this.frontMessageText = value;
    }

    @Transient
    public boolean isSetFrontMessageText() {
        return (this.frontMessageText != null);
    }

    /**
     * Gets the value of the backMessageText property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link TextNoteType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextNoteType> getBackMessageText() {
        return backMessageText;
    }

    /**
     * Sets the value of the backMessageText property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link TextNoteType
     *            }{@code >}
     *
     */
    public void setBackMessageText(JAXBElement<TextNoteType> value) {
        this.backMessageText = value;
    }

    @Transient
    public boolean isSetBackMessageText() {
        return (this.backMessageText != null);
    }

    /**
     * Gets the value of the frontSignBearing property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValBearingType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValBearingType> getFrontSignBearing() {
        return frontSignBearing;
    }

    /**
     * Sets the value of the frontSignBearing property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValBearingType }{@code >}
     *
     */
    public void setFrontSignBearing(JAXBElement<ValBearingType> value) {
        this.frontSignBearing = value;
    }

    @Transient
    public boolean isSetFrontSignBearing() {
        return (this.frontSignBearing != null);
    }

    /**
     * Gets the value of the height property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setHeight(JAXBElement<ValDistanceType> value) {
        this.height = value;
    }

    @Transient
    public boolean isSetHeight() {
        return (this.height != null);
    }

    /**
     * Gets the value of the lighted property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getLighted() {
        return lighted;
    }

    /**
     * Sets the value of the lighted property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setLighted(JAXBElement<CodeYesNoType> value) {
        this.lighted = value;
    }

    @Transient
    public boolean isSetLighted() {
        return (this.lighted != null);
    }

    /**
     * Gets the value of the direction property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeCardinalDirectionType> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *
     */
    public void setDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.direction = value;
    }

    @Transient
    public boolean isSetDirection() {
        return (this.direction != null);
    }

    /**
     * Gets the value of the side property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeSideType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeSideType> getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link CodeSideType
     *            }{@code >}
     *
     */
    public void setSide(JAXBElement<CodeSideType> value) {
        this.side = value;
    }

    @Transient
    public boolean isSetSide() {
        return (this.side != null);
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location != null);
    }

    /**
     * Gets the value of the signStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the signStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSignStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportSignStatusPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AirportSignStatusPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arprtsgntmslctp_sgnstts_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "airportsign_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "signstatus_hjid", referencedColumnName = "hjid")})
    public List<AirportSignStatusPropertyType> getSignStatus() {
        if (signStatus == null) {
            signStatus = new ArrayList<>();
        }
        return this.signStatus;
    }

    /**
     *
     *
     */
    public void setSignStatus(List<AirportSignStatusPropertyType> signStatus) {
        this.signStatus = signStatus;
    }

    @Transient
    public boolean isSetSignStatus() {
        return ((this.signStatus != null) && (!this.signStatus.isEmpty()));
    }

    public void unsetSignStatus() {
        this.signStatus = null;
    }

    /**
     * Gets the value of the associatedAirport property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getAssociatedAirport() {
        return associatedAirport;
    }

    /**
     * Sets the value of the associatedAirport property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *
     */
    public void setAssociatedAirport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirport = value;
    }

    @Transient
    public boolean isSetAssociatedAirport() {
        return (this.associatedAirport != null);
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
    @JoinTable(name = "arprtsgntmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "airportsign_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link AirportSignTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = AirportSignTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "airportsign_te_hjid", referencedColumnName = "hjid")
    public List<AirportSignTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<AirportSignTimeSliceExtensionType> extension) {
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
    public CodeAirportSignType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirportSignType.class, this.getType());
    }

    public void setTypeItem(CodeAirportSignType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAirportSignType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), AirportSignTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "frontmessagetext", columnDefinition = "TEXT", length = 10000)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "frontmessagetextnilreason")),
            @AttributeOverride(name = "lang", column = @Column(name = "frontmessagetextlang"))})
    public TextNoteType getFrontMessageTextItem() {
        return XmlAdapterUtils.unmarshallSource(TextNoteType.class, this.getFrontMessageText());
    }

    public void setFrontMessageTextItem(TextNoteType target) {
        setFrontMessageText(XmlAdapterUtils.marshallJAXBElement(TextNoteType.class,
                new QName("http://www.aixm.aero/schema/5.2", "frontMessageText"), AirportSignTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "backmessagetext", columnDefinition = "TEXT", length = 10000)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "backmessagetextnilreason")),
            @AttributeOverride(name = "lang", column = @Column(name = "backmessagetextlang"))})
    public TextNoteType getBackMessageTextItem() {
        return XmlAdapterUtils.unmarshallSource(TextNoteType.class, this.getBackMessageText());
    }

    public void setBackMessageTextItem(TextNoteType target) {
        setBackMessageText(XmlAdapterUtils.marshallJAXBElement(TextNoteType.class,
                new QName("http://www.aixm.aero/schema/5.2", "backMessageText"), AirportSignTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "frontsignbearing", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "frontsignbearingnilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "frontsignbearingaccuracy"))})
    public ValBearingType getFrontSignBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getFrontSignBearing());
    }

    public void setFrontSignBearingItem(ValBearingType target) {
        setFrontSignBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class,
                new QName("http://www.aixm.aero/schema/5.2", "frontSignBearing"), AirportSignTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "height", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "heightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "heightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "heightnilreason"))})
    public ValDistanceType getHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getHeight());
    }

    public void setHeightItem(ValDistanceType target) {
        setHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "height"), AirportSignTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "lighted")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lightednilreason"))})
    public CodeYesNoType getLightedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getLighted());
    }

    public void setLightedItem(CodeYesNoType target) {
        setLighted(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lighted"), AirportSignTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "direction")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "directionnilreason"))})
    public CodeCardinalDirectionType getDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCardinalDirectionType.class, this.getDirection());
    }

    public void setDirectionItem(CodeCardinalDirectionType target) {
        setDirection(XmlAdapterUtils.marshallJAXBElement(CodeCardinalDirectionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "direction"), AirportSignTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "side")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "sidenilreason"))})
    public CodeSideType getSideItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getSide());
    }

    public void setSideItem(CodeSideType target) {
        setSide(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class,
                new QName("http://www.aixm.aero/schema/5.2", "side"), AirportSignTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arprtsgntmslctp_lctn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "airportsign_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), AirportSignTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "arprtsgntmslctp_assctdarprt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "airportsign_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "associatedairport_hjid", referencedColumnName = "hjid")})
    public AirportHeliportPropertyType getAssociatedAirportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getAssociatedAirport());
    }

    public void setAssociatedAirportItem(AirportHeliportPropertyType target) {
        setAssociatedAirport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "associatedAirport"), AirportSignTimeSliceType.class,
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
        final AirportSignTimeSliceType that = ((AirportSignTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetHeight();
            boolean rhsFieldIsSet = that.isSetHeight();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getHeight();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "height", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "height", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDirection();
            boolean rhsFieldIsSet = that.isSetDirection();
            JAXBElement<CodeCardinalDirectionType> lhsField;
            lhsField = this.getDirection();
            JAXBElement<CodeCardinalDirectionType> rhsField;
            rhsField = that.getDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "direction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "direction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSide();
            boolean rhsFieldIsSet = that.isSetSide();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getSide();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getSide();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "side", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "side", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AirportSignTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<AirportSignTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBackMessageText();
            boolean rhsFieldIsSet = that.isSetBackMessageText();
            JAXBElement<TextNoteType> lhsField;
            lhsField = this.getBackMessageText();
            JAXBElement<TextNoteType> rhsField;
            rhsField = that.getBackMessageText();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "backMessageText", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "backMessageText", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrontMessageText();
            boolean rhsFieldIsSet = that.isSetFrontMessageText();
            JAXBElement<TextNoteType> lhsField;
            lhsField = this.getFrontMessageText();
            JAXBElement<TextNoteType> rhsField;
            rhsField = that.getFrontMessageText();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frontMessageText", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frontMessageText", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAirportSignType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAirportSignType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrontSignBearing();
            boolean rhsFieldIsSet = that.isSetFrontSignBearing();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getFrontSignBearing();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getFrontSignBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frontSignBearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frontSignBearing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLighted();
            boolean rhsFieldIsSet = that.isSetLighted();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getLighted();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getLighted();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lighted", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lighted", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignStatus();
            boolean rhsFieldIsSet = that.isSetSignStatus();
            List<AirportSignStatusPropertyType> lhsField;
            lhsField = (this.isSetSignStatus() ? this.getSignStatus() : null);
            List<AirportSignStatusPropertyType> rhsField;
            rhsField = (that.isSetSignStatus() ? that.getSignStatus() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "signStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "signStatus", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAssociatedAirport();
            boolean rhsFieldIsSet = that.isSetAssociatedAirport();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getAssociatedAirport();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getAssociatedAirport();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedAirport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedAirport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
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
            JAXBElement<CodeAirportSignType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrontMessageText();
            JAXBElement<TextNoteType> theField;
            theField = this.getFrontMessageText();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frontMessageText", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBackMessageText();
            JAXBElement<TextNoteType> theField;
            theField = this.getBackMessageText();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "backMessageText", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrontSignBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getFrontSignBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frontSignBearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeight();
            JAXBElement<ValDistanceType> theField;
            theField = this.getHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "height", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLighted();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLighted();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lighted", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "direction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getSide();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "side", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignStatus();
            List<AirportSignStatusPropertyType> theField;
            theField = (this.isSetSignStatus() ? this.getSignStatus() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "signStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedAirport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAssociatedAirport();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedAirport", theField);
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
            List<AirportSignTimeSliceExtensionType> theField;
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
            JAXBElement<CodeAirportSignType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrontMessageText();
            JAXBElement<TextNoteType> theField;
            theField = this.getFrontMessageText();
            strategy.appendField(locator, this, "frontMessageText", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBackMessageText();
            JAXBElement<TextNoteType> theField;
            theField = this.getBackMessageText();
            strategy.appendField(locator, this, "backMessageText", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrontSignBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getFrontSignBearing();
            strategy.appendField(locator, this, "frontSignBearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeight();
            JAXBElement<ValDistanceType> theField;
            theField = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLighted();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLighted();
            strategy.appendField(locator, this, "lighted", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getDirection();
            strategy.appendField(locator, this, "direction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSide();
            JAXBElement<CodeSideType> theField;
            theField = this.getSide();
            strategy.appendField(locator, this, "side", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignStatus();
            List<AirportSignStatusPropertyType> theField;
            theField = (this.isSetSignStatus() ? this.getSignStatus() : null);
            strategy.appendField(locator, this, "signStatus", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedAirport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getAssociatedAirport();
            strategy.appendField(locator, this, "associatedAirport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirportSignTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
