
package com.delorean.aixm.aixm52.schema;

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
 * Java class for LightElementType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="LightElementType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="colour" type=
"{http://www.aixm.aero/schema/5.2}CodeColourType" minOccurs="0"/>
 *         <element name="intensityLevel" type=
"{http://www.aixm.aero/schema/5.2}CodeLightIntensityType" minOccurs="0"/>
 *         <element name="intensity" type=
"{http://www.aixm.aero/schema/5.2}ValLightIntensityType" minOccurs="0"/>
 *         <element name="type" type=
"{http://www.aixm.aero/schema/5.2}CodeLightSourceType" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}LightElementStatusPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="direction" type=
"{http://www.aixm.aero/schema/5.2}CodeLightDirectionType" minOccurs="0"/>
 *         <element name="lightingTechnology" type=
"{http://www.aixm.aero/schema/5.2}CodeLightingTechnologyType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractLightElementExtension"/>
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
@XmlType(name = "LightElementType", propOrder = {"colour", "intensityLevel", "intensity", "type", "location",
        "annotation", "availability", "direction", "lightingTechnology", "extension"})
@Entity(name = "LightElementType")
@Table(name = "lightelement_o", schema = "shared")
public class LightElementType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "colour", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> colour;
    @XmlElementRef(name = "intensityLevel", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightIntensityType> intensityLevel;
    @XmlElementRef(name = "intensity", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValLightIntensityType> intensity;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightSourceType> type;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<LightElementStatusPropertyType> availability;
    @XmlElementRef(name = "direction", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightDirectionType> direction;
    @XmlElementRef(name = "lightingTechnology", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightingTechnologyType> lightingTechnology;
    protected List<LightElementExtensionType> extension;

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
     * Gets the value of the intensity property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValLightIntensityType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValLightIntensityType> getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValLightIntensityType }{@code >}
     *
     */
    public void setIntensity(JAXBElement<ValLightIntensityType> value) {
        this.intensity = value;
    }

    @Transient
    public boolean isSetIntensity() {
        return (this.intensity != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeLightSourceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeLightSourceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeLightSourceType }{@code >}
     *
     */
    public void setType(JAXBElement<CodeLightSourceType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type != null);
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
    @JoinTable(name = "lghtelmnttp_annttn_link", schema = "shared", joinColumns = {
            @JoinColumn(name = "lightelement_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link LightElementStatusPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = LightElementStatusPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "lghtelmnttp_avlblt_link", schema = "shared", joinColumns = {
            @JoinColumn(name = "lightelement_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
    public List<LightElementStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     *
     *
     */
    public void setAvailability(List<LightElementStatusPropertyType> availability) {
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
     * Gets the value of the direction property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeLightDirectionType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeLightDirectionType> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeLightDirectionType }{@code >}
     *
     */
    public void setDirection(JAXBElement<CodeLightDirectionType> value) {
        this.direction = value;
    }

    @Transient
    public boolean isSetDirection() {
        return (this.direction != null);
    }

    /**
     * Gets the value of the lightingTechnology property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeLightingTechnologyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeLightingTechnologyType> getLightingTechnology() {
        return lightingTechnology;
    }

    /**
     * Sets the value of the lightingTechnology property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeLightingTechnologyType }{@code >}
     *
     */
    public void setLightingTechnology(JAXBElement<CodeLightingTechnologyType> value) {
        this.lightingTechnology = value;
    }

    @Transient
    public boolean isSetLightingTechnology() {
        return (this.lightingTechnology != null);
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
     * {@link LightElementExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = LightElementExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "lightelement_oe_hjid", referencedColumnName = "hjid")
    public List<LightElementExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<LightElementExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "colour")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "colournilreason"))})
    public CodeColourType getColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getColour());
    }

    public void setColourItem(CodeColourType target) {
        setColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class,
                new QName("http://www.aixm.aero/schema/5.2", "colour"), LightElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "intensitylevel")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "intensitylevelnilreason"))})
    public CodeLightIntensityType getIntensityLevelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightIntensityType.class, this.getIntensityLevel());
    }

    public void setIntensityLevelItem(CodeLightIntensityType target) {
        setIntensityLevel(XmlAdapterUtils.marshallJAXBElement(CodeLightIntensityType.class,
                new QName("http://www.aixm.aero/schema/5.2", "intensityLevel"), LightElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "intensity", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "intensityuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "intensitynilreason"))})
    public ValLightIntensityType getIntensityItem() {
        return XmlAdapterUtils.unmarshallSource(ValLightIntensityType.class, this.getIntensity());
    }

    public void setIntensityItem(ValLightIntensityType target) {
        setIntensity(XmlAdapterUtils.marshallJAXBElement(ValLightIntensityType.class,
                new QName("http://www.aixm.aero/schema/5.2", "intensity"), LightElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "type")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason"))})
    public CodeLightSourceType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightSourceType.class, this.getType());
    }

    public void setTypeItem(CodeLightSourceType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeLightSourceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "type"), LightElementType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "lghtelmnttp_lctn_link", schema = "shared", joinColumns = {
            @JoinColumn(name = "lightelement_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), LightElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "direction")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "directionnilreason"))})
    public CodeLightDirectionType getDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightDirectionType.class, this.getDirection());
    }

    public void setDirectionItem(CodeLightDirectionType target) {
        setDirection(XmlAdapterUtils.marshallJAXBElement(CodeLightDirectionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "direction"), LightElementType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "lightingtechnology")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "lightingtechnologynilreason"))})
    public CodeLightingTechnologyType getLightingTechnologyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightingTechnologyType.class, this.getLightingTechnology());
    }

    public void setLightingTechnologyItem(CodeLightingTechnologyType target) {
        setLightingTechnology(XmlAdapterUtils.marshallJAXBElement(CodeLightingTechnologyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "lightingTechnology"), LightElementType.class, target));
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
        final LightElementType that = ((LightElementType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<LightElementExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<LightElementExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeLightSourceType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeLightSourceType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLightingTechnology();
            boolean rhsFieldIsSet = that.isSetLightingTechnology();
            JAXBElement<CodeLightingTechnologyType> lhsField;
            lhsField = this.getLightingTechnology();
            JAXBElement<CodeLightingTechnologyType> rhsField;
            rhsField = that.getLightingTechnology();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lightingTechnology", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lightingTechnology", rhsField);
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
        {
            boolean lhsFieldIsSet = this.isSetDirection();
            boolean rhsFieldIsSet = that.isSetDirection();
            JAXBElement<CodeLightDirectionType> lhsField;
            lhsField = this.getDirection();
            JAXBElement<CodeLightDirectionType> rhsField;
            rhsField = that.getDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "direction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "direction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntensity();
            boolean rhsFieldIsSet = that.isSetIntensity();
            JAXBElement<ValLightIntensityType> lhsField;
            lhsField = this.getIntensity();
            JAXBElement<ValLightIntensityType> rhsField;
            rhsField = that.getIntensity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intensity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intensity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<LightElementStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<LightElementStatusPropertyType> rhsField;
            rhsField = (that.isSetAvailability() ? that.getAvailability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "colour", theField);
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
            boolean theFieldIsSet = this.isSetIntensity();
            JAXBElement<ValLightIntensityType> theField;
            theField = this.getIntensity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intensity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeLightSourceType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<LightElementStatusPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeLightDirectionType> theField;
            theField = this.getDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "direction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLightingTechnology();
            JAXBElement<CodeLightingTechnologyType> theField;
            theField = this.getLightingTechnology();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lightingTechnology", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<LightElementExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            strategy.appendField(locator, this, "colour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            strategy.appendField(locator, this, "intensityLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensity();
            JAXBElement<ValLightIntensityType> theField;
            theField = this.getIntensity();
            strategy.appendField(locator, this, "intensity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeLightSourceType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<LightElementStatusPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeLightDirectionType> theField;
            theField = this.getDirection();
            strategy.appendField(locator, this, "direction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLightingTechnology();
            JAXBElement<CodeLightingTechnologyType> theField;
            theField = this.getLightingTechnology();
            strategy.appendField(locator, this, "lightingTechnology", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<LightElementExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
