
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
 * Java class for MinimaType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="MinimaType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="altitudeReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="radioHeight" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="heightReference" type=
"{http://www.aixm.aero/schema/5.2}CodeHeightReferenceType" minOccurs="0"/>
 *         <element name="visibility" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="militaryVisibility" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="adjustmentINOP" type=
"{http://www.aixm.aero/schema/5.2}EquipmentUnavailableAdjustmentPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="obstacleClearanceAltitude" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="decisionAltitude" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="minimumDescentAltitude" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="obstacleClearanceHeight" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="decisionHeight" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="minimumDescentHeight" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="militaryCeiling" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="militaryMinima" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="runwayVisualRange" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="aircraftCategory" type=
"{http://www.aixm.aero/schema/5.2}AircraftCharacteristicPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractMinimaExtension"/>
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
@XmlType(name = "MinimaType", propOrder = {"altitudeReference", "radioHeight", "heightReference", "visibility",
        "militaryVisibility", "adjustmentINOP", "annotation", "obstacleClearanceAltitude", "decisionAltitude",
        "minimumDescentAltitude", "obstacleClearanceHeight", "decisionHeight", "minimumDescentHeight",
        "militaryCeiling", "militaryMinima", "runwayVisualRange", "aircraftCategory", "extension"})
@Entity(name = "MinimaType")
@Table(name = "minima_o", schema = "procedure")
public class MinimaType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElementRef(name = "radioHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> radioHeight;
    @XmlElementRef(name = "heightReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHeightReferenceType> heightReference;
    @XmlElementRef(name = "visibility", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> visibility;
    @XmlElementRef(name = "militaryVisibility", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> militaryVisibility;
    @XmlElement(nillable = true)
    protected List<EquipmentUnavailableAdjustmentPropertyType> adjustmentINOP;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "obstacleClearanceAltitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> obstacleClearanceAltitude;
    @XmlElementRef(name = "decisionAltitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> decisionAltitude;
    @XmlElementRef(name = "minimumDescentAltitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumDescentAltitude;
    @XmlElementRef(name = "obstacleClearanceHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> obstacleClearanceHeight;
    @XmlElementRef(name = "decisionHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> decisionHeight;
    @XmlElementRef(name = "minimumDescentHeight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumDescentHeight;
    @XmlElementRef(name = "militaryCeiling", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> militaryCeiling;
    @XmlElementRef(name = "militaryMinima", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> militaryMinima;
    @XmlElementRef(name = "runwayVisualRange", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> runwayVisualRange;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    protected List<MinimaExtensionType> extension;

    /**
     * Gets the value of the altitudeReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getAltitudeReference() {
        return altitudeReference;
    }

    /**
     * Sets the value of the altitudeReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeReference = value;
    }

    @Transient
    public boolean isSetAltitudeReference() {
        return (this.altitudeReference != null);
    }

    /**
     * Gets the value of the radioHeight property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getRadioHeight() {
        return radioHeight;
    }

    /**
     * Sets the value of the radioHeight property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setRadioHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.radioHeight = value;
    }

    @Transient
    public boolean isSetRadioHeight() {
        return (this.radioHeight != null);
    }

    /**
     * Gets the value of the heightReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeHeightReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeHeightReferenceType> getHeightReference() {
        return heightReference;
    }

    /**
     * Sets the value of the heightReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeHeightReferenceType }{@code >}
     *
     */
    public void setHeightReference(JAXBElement<CodeHeightReferenceType> value) {
        this.heightReference = value;
    }

    @Transient
    public boolean isSetHeightReference() {
        return (this.heightReference != null);
    }

    /**
     * Gets the value of the visibility property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setVisibility(JAXBElement<ValDistanceType> value) {
        this.visibility = value;
    }

    @Transient
    public boolean isSetVisibility() {
        return (this.visibility != null);
    }

    /**
     * Gets the value of the militaryVisibility property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getMilitaryVisibility() {
        return militaryVisibility;
    }

    /**
     * Sets the value of the militaryVisibility property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setMilitaryVisibility(JAXBElement<ValDistanceType> value) {
        this.militaryVisibility = value;
    }

    @Transient
    public boolean isSetMilitaryVisibility() {
        return (this.militaryVisibility != null);
    }

    /**
     * Gets the value of the adjustmentINOP property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the adjustmentINOP property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAdjustmentINOP().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentUnavailableAdjustmentPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = EquipmentUnavailableAdjustmentPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmtp_adjstmntinop_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minima_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "adjustmentinop_hjid", referencedColumnName = "hjid")})
    public List<EquipmentUnavailableAdjustmentPropertyType> getAdjustmentINOP() {
        if (adjustmentINOP == null) {
            adjustmentINOP = new ArrayList<>();
        }
        return this.adjustmentINOP;
    }

    /**
     *
     *
     */
    public void setAdjustmentINOP(List<EquipmentUnavailableAdjustmentPropertyType> adjustmentINOP) {
        this.adjustmentINOP = adjustmentINOP;
    }

    @Transient
    public boolean isSetAdjustmentINOP() {
        return ((this.adjustmentINOP != null) && (!this.adjustmentINOP.isEmpty()));
    }

    public void unsetAdjustmentINOP() {
        this.adjustmentINOP = null;
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
    @JoinTable(name = "mnmtp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minima_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the obstacleClearanceAltitude property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getObstacleClearanceAltitude() {
        return obstacleClearanceAltitude;
    }

    /**
     * Sets the value of the obstacleClearanceAltitude property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setObstacleClearanceAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.obstacleClearanceAltitude = value;
    }

    @Transient
    public boolean isSetObstacleClearanceAltitude() {
        return (this.obstacleClearanceAltitude != null);
    }

    /**
     * Gets the value of the decisionAltitude property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getDecisionAltitude() {
        return decisionAltitude;
    }

    /**
     * Sets the value of the decisionAltitude property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setDecisionAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.decisionAltitude = value;
    }

    @Transient
    public boolean isSetDecisionAltitude() {
        return (this.decisionAltitude != null);
    }

    /**
     * Gets the value of the minimumDescentAltitude property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumDescentAltitude() {
        return minimumDescentAltitude;
    }

    /**
     * Sets the value of the minimumDescentAltitude property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumDescentAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumDescentAltitude = value;
    }

    @Transient
    public boolean isSetMinimumDescentAltitude() {
        return (this.minimumDescentAltitude != null);
    }

    /**
     * Gets the value of the obstacleClearanceHeight property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getObstacleClearanceHeight() {
        return obstacleClearanceHeight;
    }

    /**
     * Sets the value of the obstacleClearanceHeight property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setObstacleClearanceHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.obstacleClearanceHeight = value;
    }

    @Transient
    public boolean isSetObstacleClearanceHeight() {
        return (this.obstacleClearanceHeight != null);
    }

    /**
     * Gets the value of the decisionHeight property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getDecisionHeight() {
        return decisionHeight;
    }

    /**
     * Sets the value of the decisionHeight property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setDecisionHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.decisionHeight = value;
    }

    @Transient
    public boolean isSetDecisionHeight() {
        return (this.decisionHeight != null);
    }

    /**
     * Gets the value of the minimumDescentHeight property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumDescentHeight() {
        return minimumDescentHeight;
    }

    /**
     * Sets the value of the minimumDescentHeight property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumDescentHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumDescentHeight = value;
    }

    @Transient
    public boolean isSetMinimumDescentHeight() {
        return (this.minimumDescentHeight != null);
    }

    /**
     * Gets the value of the militaryCeiling property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMilitaryCeiling() {
        return militaryCeiling;
    }

    /**
     * Sets the value of the militaryCeiling property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMilitaryCeiling(JAXBElement<ValDistanceVerticalType> value) {
        this.militaryCeiling = value;
    }

    @Transient
    public boolean isSetMilitaryCeiling() {
        return (this.militaryCeiling != null);
    }

    /**
     * Gets the value of the militaryMinima property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMilitaryMinima() {
        return militaryMinima;
    }

    /**
     * Sets the value of the militaryMinima property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setMilitaryMinima(JAXBElement<CodeYesNoType> value) {
        this.militaryMinima = value;
    }

    @Transient
    public boolean isSetMilitaryMinima() {
        return (this.militaryMinima != null);
    }

    /**
     * Gets the value of the runwayVisualRange property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getRunwayVisualRange() {
        return runwayVisualRange;
    }

    /**
     * Sets the value of the runwayVisualRange property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setRunwayVisualRange(JAXBElement<ValDistanceType> value) {
        this.runwayVisualRange = value;
    }

    @Transient
    public boolean isSetRunwayVisualRange() {
        return (this.runwayVisualRange != null);
    }

    /**
     * Gets the value of the aircraftCategory property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the aircraftCategory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAircraftCategory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "mnmtp_arcrftctgr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "minima_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "aircraftcategory_hjid", referencedColumnName = "hjid")})
    public List<AircraftCharacteristicPropertyType> getAircraftCategory() {
        if (aircraftCategory == null) {
            aircraftCategory = new ArrayList<>();
        }
        return this.aircraftCategory;
    }

    /**
     *
     *
     */
    public void setAircraftCategory(List<AircraftCharacteristicPropertyType> aircraftCategory) {
        this.aircraftCategory = aircraftCategory;
    }

    @Transient
    public boolean isSetAircraftCategory() {
        return ((this.aircraftCategory != null) && (!this.aircraftCategory.isEmpty()));
    }

    public void unsetAircraftCategory() {
        this.aircraftCategory = null;
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
     * {@link MinimaExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = MinimaExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "minima_oe_hjid", referencedColumnName = "hjid")
    public List<MinimaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<MinimaExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "altitudereference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "altitudereferencenilreason"))})
    public CodeVerticalReferenceType getAltitudeReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getAltitudeReference());
    }

    public void setAltitudeReferenceItem(CodeVerticalReferenceType target) {
        setAltitudeReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "altitudeReference"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "radioheight", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "radioheightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "radioheightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "radioheightnilreason"))})
    public ValDistanceVerticalType getRadioHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getRadioHeight());
    }

    public void setRadioHeightItem(ValDistanceVerticalType target) {
        setRadioHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "radioHeight"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "heightreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "heightreferencenilreason"))})
    public CodeHeightReferenceType getHeightReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHeightReferenceType.class, this.getHeightReference());
    }

    public void setHeightReferenceItem(CodeHeightReferenceType target) {
        setHeightReference(XmlAdapterUtils.marshallJAXBElement(CodeHeightReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "heightReference"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "visibility", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "visibilityuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "visibilityaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "visibilitynilreason"))})
    public ValDistanceType getVisibilityItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getVisibility());
    }

    public void setVisibilityItem(ValDistanceType target) {
        setVisibility(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "visibility"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "militaryvisibility", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "militaryvisibilityuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "militaryvisibilityaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "militaryvisibilitynilreason"))})
    public ValDistanceType getMilitaryVisibilityItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getMilitaryVisibility());
    }

    public void setMilitaryVisibilityItem(ValDistanceType target) {
        setMilitaryVisibility(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "militaryVisibility"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "obstacleclearancealtitude", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "obstacleclearancealtitudeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "obstacleclearancealtitudeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "obstacleclearancealtitudenilreason"))})
    public ValDistanceVerticalType getObstacleClearanceAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getObstacleClearanceAltitude());
    }

    public void setObstacleClearanceAltitudeItem(ValDistanceVerticalType target) {
        setObstacleClearanceAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "obstacleClearanceAltitude"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "decisionaltitude", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "decisionaltitudeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "decisionaltitudeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "decisionaltitudenilreason"))})
    public ValDistanceVerticalType getDecisionAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getDecisionAltitude());
    }

    public void setDecisionAltitudeItem(ValDistanceVerticalType target) {
        setDecisionAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "decisionAltitude"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumdescentaltitude", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumdescentaltitudeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumdescentaltitudeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumdescentaltitudenilreason"))})
    public ValDistanceVerticalType getMinimumDescentAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumDescentAltitude());
    }

    public void setMinimumDescentAltitudeItem(ValDistanceVerticalType target) {
        setMinimumDescentAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumDescentAltitude"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "obstacleclearanceheight", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "obstacleclearanceheightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "obstacleclearanceheightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "obstacleclearanceheightnilreason"))})
    public ValDistanceVerticalType getObstacleClearanceHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getObstacleClearanceHeight());
    }

    public void setObstacleClearanceHeightItem(ValDistanceVerticalType target) {
        setObstacleClearanceHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "obstacleClearanceHeight"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "decisionheight", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "decisionheightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "decisionheightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "decisionheightnilreason"))})
    public ValDistanceVerticalType getDecisionHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getDecisionHeight());
    }

    public void setDecisionHeightItem(ValDistanceVerticalType target) {
        setDecisionHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "decisionHeight"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumdescentheight", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumdescentheightuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumdescentheightaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumdescentheightnilreason"))})
    public ValDistanceVerticalType getMinimumDescentHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumDescentHeight());
    }

    public void setMinimumDescentHeightItem(ValDistanceVerticalType target) {
        setMinimumDescentHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumDescentHeight"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "militaryceiling", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "militaryceilinguom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "militaryceilingaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "militaryceilingnilreason"))})
    public ValDistanceVerticalType getMilitaryCeilingItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMilitaryCeiling());
    }

    public void setMilitaryCeilingItem(ValDistanceVerticalType target) {
        setMilitaryCeiling(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "militaryCeiling"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "militaryminima")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "militaryminimanilreason"))})
    public CodeYesNoType getMilitaryMinimaItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMilitaryMinima());
    }

    public void setMilitaryMinimaItem(CodeYesNoType target) {
        setMilitaryMinima(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "militaryMinima"), MinimaType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "runwayvisualrange", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "runwayvisualrangeuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "runwayvisualrangeaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "runwayvisualrangenilreason"))})
    public ValDistanceType getRunwayVisualRangeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRunwayVisualRange());
    }

    public void setRunwayVisualRangeItem(ValDistanceType target) {
        setRunwayVisualRange(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "runwayVisualRange"), MinimaType.class, target));
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
        final MinimaType that = ((MinimaType) object);
        {
            boolean lhsFieldIsSet = this.isSetMilitaryMinima();
            boolean rhsFieldIsSet = that.isSetMilitaryMinima();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMilitaryMinima();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMilitaryMinima();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryMinima", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryMinima", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDecisionAltitude();
            boolean rhsFieldIsSet = that.isSetDecisionAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getDecisionAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getDecisionAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "decisionAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "decisionAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<MinimaExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<MinimaExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObstacleClearanceHeight();
            boolean rhsFieldIsSet = that.isSetObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getObstacleClearanceHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleClearanceHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleClearanceHeight", rhsField);
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
            boolean lhsFieldIsSet = this.isSetHeightReference();
            boolean rhsFieldIsSet = that.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> lhsField;
            lhsField = this.getHeightReference();
            JAXBElement<CodeHeightReferenceType> rhsField;
            rhsField = that.getHeightReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "heightReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "heightReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObstacleClearanceAltitude();
            boolean rhsFieldIsSet = that.isSetObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getObstacleClearanceAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleClearanceAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleClearanceAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumDescentAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumDescentAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumDescentAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumDescentAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumDescentAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumDescentAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeReference();
            boolean rhsFieldIsSet = that.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getAltitudeReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRunwayVisualRange();
            boolean rhsFieldIsSet = that.isSetRunwayVisualRange();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRunwayVisualRange();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRunwayVisualRange();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "runwayVisualRange", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "runwayVisualRange", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVisibility();
            boolean rhsFieldIsSet = that.isSetVisibility();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getVisibility();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getVisibility();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "visibility", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "visibility", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryCeiling();
            boolean rhsFieldIsSet = that.isSetMilitaryCeiling();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMilitaryCeiling();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMilitaryCeiling();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryCeiling", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryCeiling", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCategory();
            boolean rhsFieldIsSet = that.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCategory() ? this.getAircraftCategory() : null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCategory() ? that.getAircraftCategory() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryVisibility();
            boolean rhsFieldIsSet = that.isSetMilitaryVisibility();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getMilitaryVisibility();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getMilitaryVisibility();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryVisibility", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryVisibility", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadioHeight();
            boolean rhsFieldIsSet = that.isSetRadioHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getRadioHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getRadioHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radioHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radioHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdjustmentINOP();
            boolean rhsFieldIsSet = that.isSetAdjustmentINOP();
            List<EquipmentUnavailableAdjustmentPropertyType> lhsField;
            lhsField = (this.isSetAdjustmentINOP() ? this.getAdjustmentINOP() : null);
            List<EquipmentUnavailableAdjustmentPropertyType> rhsField;
            rhsField = (that.isSetAdjustmentINOP() ? that.getAdjustmentINOP() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "adjustmentINOP", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "adjustmentINOP", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDecisionHeight();
            boolean rhsFieldIsSet = that.isSetDecisionHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getDecisionHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getDecisionHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "decisionHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "decisionHeight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumDescentHeight();
            boolean rhsFieldIsSet = that.isSetMinimumDescentHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumDescentHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumDescentHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumDescentHeight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumDescentHeight", rhsField);
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
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getRadioHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radioHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> theField;
            theField = this.getHeightReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "heightReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVisibility();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "visibility", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMilitaryVisibility();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryVisibility", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustmentINOP();
            List<EquipmentUnavailableAdjustmentPropertyType> theField;
            theField = (this.isSetAdjustmentINOP() ? this.getAdjustmentINOP() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "adjustmentINOP", theField);
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
            boolean theFieldIsSet = this.isSetObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getObstacleClearanceAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleClearanceAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDecisionAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getDecisionAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "decisionAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumDescentAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumDescentAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumDescentAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getObstacleClearanceHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleClearanceHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDecisionHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getDecisionHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "decisionHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumDescentHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumDescentHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumDescentHeight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryCeiling();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMilitaryCeiling();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryCeiling", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryMinima();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMilitaryMinima();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryMinima", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayVisualRange();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRunwayVisualRange();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "runwayVisualRange", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory() ? this.getAircraftCategory() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<MinimaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            strategy.appendField(locator, this, "altitudeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getRadioHeight();
            strategy.appendField(locator, this, "radioHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> theField;
            theField = this.getHeightReference();
            strategy.appendField(locator, this, "heightReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVisibility();
            strategy.appendField(locator, this, "visibility", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryVisibility();
            JAXBElement<ValDistanceType> theField;
            theField = this.getMilitaryVisibility();
            strategy.appendField(locator, this, "militaryVisibility", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdjustmentINOP();
            List<EquipmentUnavailableAdjustmentPropertyType> theField;
            theField = (this.isSetAdjustmentINOP() ? this.getAdjustmentINOP() : null);
            strategy.appendField(locator, this, "adjustmentINOP", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getObstacleClearanceAltitude();
            strategy.appendField(locator, this, "obstacleClearanceAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDecisionAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getDecisionAltitude();
            strategy.appendField(locator, this, "decisionAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumDescentAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumDescentAltitude();
            strategy.appendField(locator, this, "minimumDescentAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleClearanceHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getObstacleClearanceHeight();
            strategy.appendField(locator, this, "obstacleClearanceHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDecisionHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getDecisionHeight();
            strategy.appendField(locator, this, "decisionHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumDescentHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumDescentHeight();
            strategy.appendField(locator, this, "minimumDescentHeight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryCeiling();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMilitaryCeiling();
            strategy.appendField(locator, this, "militaryCeiling", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryMinima();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMilitaryMinima();
            strategy.appendField(locator, this, "militaryMinima", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRunwayVisualRange();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRunwayVisualRange();
            strategy.appendField(locator, this, "runwayVisualRange", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory() ? this.getAircraftCategory() : null);
            strategy.appendField(locator, this, "aircraftCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<MinimaExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
