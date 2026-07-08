
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
 * Java class for AltimeterSourceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="AltimeterSourceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="rank" type=
"{http://www.aixm.aero/schema/5.2}CodeFacilityRankingType" minOccurs="0"/>
 *         <element name="relativeLocation" type=
"{http://www.aixm.aero/schema/5.2}CodeRelativeLocationType" minOccurs="0"/>
 *         <element name="distance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="altimeterData" type=
"{http://www.aixm.aero/schema/5.2}WeatherSourcePropertyType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractAltimeterSourceExtension"/>
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
@XmlType(name = "AltimeterSourceType", propOrder = {"annotation", "rank", "relativeLocation", "distance",
        "altimeterData", "extension"})
@Entity(name = "AltimeterSourceType")
@Table(name = "altimetersource_o", schema = "airport_heliport")
public class AltimeterSourceType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFacilityRankingType> rank;
    @XmlElementRef(name = "relativeLocation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRelativeLocationType> relativeLocation;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElementRef(name = "altimeterData", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<WeatherSourcePropertyType> altimeterData;
    protected List<AltimeterSourceExtensionType> extension;

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
    @JoinTable(name = "altmtrsrctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "altimetersource_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the rank property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeFacilityRankingType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeFacilityRankingType> getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeFacilityRankingType }{@code >}
     *
     */
    public void setRank(JAXBElement<CodeFacilityRankingType> value) {
        this.rank = value;
    }

    @Transient
    public boolean isSetRank() {
        return (this.rank != null);
    }

    /**
     * Gets the value of the relativeLocation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeRelativeLocationType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeRelativeLocationType> getRelativeLocation() {
        return relativeLocation;
    }

    /**
     * Sets the value of the relativeLocation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeRelativeLocationType }{@code >}
     *
     */
    public void setRelativeLocation(JAXBElement<CodeRelativeLocationType> value) {
        this.relativeLocation = value;
    }

    @Transient
    public boolean isSetRelativeLocation() {
        return (this.relativeLocation != null);
    }

    /**
     * Gets the value of the distance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setDistance(JAXBElement<ValDistanceType> value) {
        this.distance = value;
    }

    @Transient
    public boolean isSetDistance() {
        return (this.distance != null);
    }

    /**
     * Gets the value of the altimeterData property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link WeatherSourcePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<WeatherSourcePropertyType> getAltimeterData() {
        return altimeterData;
    }

    /**
     * Sets the value of the altimeterData property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link WeatherSourcePropertyType }{@code >}
     *
     */
    public void setAltimeterData(JAXBElement<WeatherSourcePropertyType> value) {
        this.altimeterData = value;
    }

    @Transient
    public boolean isSetAltimeterData() {
        return (this.altimeterData != null);
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
     * {@link AltimeterSourceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = AltimeterSourceExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "altimetersource_oe_hjid", referencedColumnName = "hjid")
    public List<AltimeterSourceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<AltimeterSourceExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "rank")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "ranknilreason"))})
    public CodeFacilityRankingType getRankItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFacilityRankingType.class, this.getRank());
    }

    public void setRankItem(CodeFacilityRankingType target) {
        setRank(XmlAdapterUtils.marshallJAXBElement(CodeFacilityRankingType.class,
                new QName("http://www.aixm.aero/schema/5.2", "rank"), AltimeterSourceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "relativelocation")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "relativelocationnilreason"))})
    public CodeRelativeLocationType getRelativeLocationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRelativeLocationType.class, this.getRelativeLocation());
    }

    public void setRelativeLocationItem(CodeRelativeLocationType target) {
        setRelativeLocation(XmlAdapterUtils.marshallJAXBElement(CodeRelativeLocationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeLocation"), AltimeterSourceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "distance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "distanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "distanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "distancenilreason"))})
    public ValDistanceType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getDistance());
    }

    public void setDistanceItem(ValDistanceType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "distance"), AltimeterSourceType.class, target));
    }

    @OneToOne(targetEntity = WeatherSourcePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "altmtrsrctp_altmtrdt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "altimetersource_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "altimeterdata_hjid", referencedColumnName = "hjid")})
    public WeatherSourcePropertyType getAltimeterDataItem() {
        return XmlAdapterUtils.unmarshallSource(WeatherSourcePropertyType.class, this.getAltimeterData());
    }

    public void setAltimeterDataItem(WeatherSourcePropertyType target) {
        setAltimeterData(XmlAdapterUtils.marshallJAXBElement(WeatherSourcePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "altimeterData"), AltimeterSourceType.class, target));
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
        final AltimeterSourceType that = ((AltimeterSourceType) object);
        {
            boolean lhsFieldIsSet = this.isSetRelativeLocation();
            boolean rhsFieldIsSet = that.isSetRelativeLocation();
            JAXBElement<CodeRelativeLocationType> lhsField;
            lhsField = this.getRelativeLocation();
            JAXBElement<CodeRelativeLocationType> rhsField;
            rhsField = that.getRelativeLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltimeterData();
            boolean rhsFieldIsSet = that.isSetAltimeterData();
            JAXBElement<WeatherSourcePropertyType> lhsField;
            lhsField = this.getAltimeterData();
            JAXBElement<WeatherSourcePropertyType> rhsField;
            rhsField = that.getAltimeterData();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altimeterData", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altimeterData", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRank();
            boolean rhsFieldIsSet = that.isSetRank();
            JAXBElement<CodeFacilityRankingType> lhsField;
            lhsField = this.getRank();
            JAXBElement<CodeFacilityRankingType> rhsField;
            rhsField = that.getRank();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rank", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rank", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AltimeterSourceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<AltimeterSourceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRank();
            JAXBElement<CodeFacilityRankingType> theField;
            theField = this.getRank();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rank", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeLocation();
            JAXBElement<CodeRelativeLocationType> theField;
            theField = this.getRelativeLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeterData();
            JAXBElement<WeatherSourcePropertyType> theField;
            theField = this.getAltimeterData();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altimeterData", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AltimeterSourceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRank();
            JAXBElement<CodeFacilityRankingType> theField;
            theField = this.getRank();
            strategy.appendField(locator, this, "rank", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeLocation();
            JAXBElement<CodeRelativeLocationType> theField;
            theField = this.getRelativeLocation();
            strategy.appendField(locator, this, "relativeLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeterData();
            JAXBElement<WeatherSourcePropertyType> theField;
            theField = this.getAltimeterData();
            strategy.appendField(locator, this, "altimeterData", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AltimeterSourceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
