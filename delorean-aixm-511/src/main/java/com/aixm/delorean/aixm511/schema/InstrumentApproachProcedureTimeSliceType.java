
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
 * <p>Java class for InstrumentApproachProcedureTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InstrumentApproachProcedureTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}InstrumentApproachProcedurePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractInstrumentApproachProcedureExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractProcedureExtension"/>
 *                 </choice>
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
@XmlType(name = "InstrumentApproachProcedureTimeSliceType", propOrder = {
    "communicationFailureInstruction",
    "instruction",
    "designCriteria",
    "codingStandard",
    "flightChecked",
    "aixmName",
    "rnav",
    "availability",
    "airportHeliport",
    "aircraftCharacteristic",
    "flightTransition",
    "guidanceFacilitySpecialNavigationSystem",
    "guidanceFacilityRadar",
    "guidanceFacilityNavaid",
    "annotation",
    "safeAltitude",
    "approachPrefix",
    "approachType",
    "multipleIdentification",
    "copterTrack",
    "circlingIdentification",
    "courseReversalInstruction",
    "additionalEquipment",
    "channelGNSS",
    "waasReliable",
    "landing",
    "missedInstruction",
    "finalProfile",
    "extension"
})
@Entity(name = "InstrumentApproachProcedureTimeSliceType")
@Table(name = "instrumentapproachprocedure_ts", schema = "procedure")
public class InstrumentApproachProcedureTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "communicationFailureInstruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> communicationFailureInstruction;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "designCriteria", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesignStandardType> designCriteria;
    @XmlElementRef(name = "codingStandard", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureCodingStandardType> codingStandard;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "RNAV", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> rnav;
    @XmlElement(nillable = true)
    protected List<ProcedureAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCharacteristic;
    @XmlElement(nillable = true)
    protected List<ProcedureTransitionPropertyType> flightTransition;
    @XmlElementRef(name = "guidanceFacility_specialNavigationSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationSystemPropertyType> guidanceFacilitySpecialNavigationSystem;
    @XmlElementRef(name = "guidanceFacility_radar", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadarSystemPropertyType> guidanceFacilityRadar;
    @XmlElementRef(name = "guidanceFacility_navaid", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> guidanceFacilityNavaid;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "safeAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SafeAltitudeAreaPropertyType> safeAltitude;
    @XmlElementRef(name = "approachPrefix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachPrefixType> approachPrefix;
    @XmlElementRef(name = "approachType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachType> approachType;
    @XmlElementRef(name = "multipleIdentification", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> multipleIdentification;
    @XmlElementRef(name = "copterTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> copterTrack;
    @XmlElementRef(name = "circlingIdentification", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> circlingIdentification;
    @XmlElementRef(name = "courseReversalInstruction", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> courseReversalInstruction;
    @XmlElementRef(name = "additionalEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachEquipmentAdditionalType> additionalEquipment;
    @XmlElementRef(name = "channelGNSS", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValChannelNumberType> channelGNSS;
    @XmlElementRef(name = "WAASReliable", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> waasReliable;
    @XmlElementRef(name = "landing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> landing;
    @XmlElement(nillable = true)
    protected List<MissedApproachGroupPropertyType> missedInstruction;
    @XmlElementRef(name = "finalProfile", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FinalProfilePropertyType> finalProfile;
    protected List<InstrumentApproachProcedureExtensionType> extension;

    /**
     * Gets the value of the communicationFailureInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextInstructionType> getCommunicationFailureInstruction() {
        return communicationFailureInstruction;
    }

    /**
     * Sets the value of the communicationFailureInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setCommunicationFailureInstruction(JAXBElement<TextInstructionType> value) {
        this.communicationFailureInstruction = value;
    }

    @Transient
    public boolean isSetCommunicationFailureInstruction() {
        return (this.communicationFailureInstruction!= null);
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextInstructionType> getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    @Transient
    public boolean isSetInstruction() {
        return (this.instruction!= null);
    }

    /**
     * Gets the value of the designCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignStandardType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDesignStandardType> getDesignCriteria() {
        return designCriteria;
    }

    /**
     * Sets the value of the designCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignStandardType }{@code >}
     *     
     */
    public void setDesignCriteria(JAXBElement<CodeDesignStandardType> value) {
        this.designCriteria = value;
    }

    @Transient
    public boolean isSetDesignCriteria() {
        return (this.designCriteria!= null);
    }

    /**
     * Gets the value of the codingStandard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeProcedureCodingStandardType> getCodingStandard() {
        return codingStandard;
    }

    /**
     * Sets the value of the codingStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *     
     */
    public void setCodingStandard(JAXBElement<CodeProcedureCodingStandardType> value) {
        this.codingStandard = value;
    }

    @Transient
    public boolean isSetCodingStandard() {
        return (this.codingStandard!= null);
    }

    /**
     * Gets the value of the flightChecked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFlightChecked() {
        return flightChecked;
    }

    /**
     * Sets the value of the flightChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

    @Transient
    public boolean isSetFlightChecked() {
        return (this.flightChecked!= null);
    }

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
     * Gets the value of the rnav property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getRNAV() {
        return rnav;
    }

    /**
     * Sets the value of the rnav property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRNAV(JAXBElement<CodeYesNoType> value) {
        this.rnav = value;
    }

    @Transient
    public boolean isSetRNAV() {
        return (this.rnav!= null);
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
     * {@link ProcedureAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ProcedureAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_instrumentapproachprocedure_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "instrumentapproachprocedurepropertygroup", referencedColumnName = "hjid")
    })
    public List<ProcedureAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<ProcedureAvailabilityPropertyType> availability) {
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
     * Gets the value of the airportHeliport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportHeliport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportHeliport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "airportheliport_instrumentapproachprocedure_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "airportheliport", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "instrumentapproachprocedurepropertygroup", referencedColumnName = "hjid")
    })
    public List<AirportHeliportPropertyType> getAirportHeliport() {
        if (airportHeliport == null) {
            airportHeliport = new ArrayList<>();
        }
        return this.airportHeliport;
    }

    /**
     * 
     * 
     */
    public void setAirportHeliport(List<AirportHeliportPropertyType> airportHeliport) {
        this.airportHeliport = airportHeliport;
    }

    @Transient
    public boolean isSetAirportHeliport() {
        return ((this.airportHeliport!= null)&&(!this.airportHeliport.isEmpty()));
    }

    public void unsetAirportHeliport() {
        this.airportHeliport = null;
    }

    /**
     * Gets the value of the aircraftCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "aircraftcharacteristic_instrumentapproachprocedure_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "aircraftcharacteristic", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "instrumentapproachprocedurepropertygroup", referencedColumnName = "hjid")
    })
    public List<AircraftCharacteristicPropertyType> getAircraftCharacteristic() {
        if (aircraftCharacteristic == null) {
            aircraftCharacteristic = new ArrayList<>();
        }
        return this.aircraftCharacteristic;
    }

    /**
     * 
     * 
     */
    public void setAircraftCharacteristic(List<AircraftCharacteristicPropertyType> aircraftCharacteristic) {
        this.aircraftCharacteristic = aircraftCharacteristic;
    }

    @Transient
    public boolean isSetAircraftCharacteristic() {
        return ((this.aircraftCharacteristic!= null)&&(!this.aircraftCharacteristic.isEmpty()));
    }

    public void unsetAircraftCharacteristic() {
        this.aircraftCharacteristic = null;
    }

    /**
     * Gets the value of the flightTransition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTransition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureTransitionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ProcedureTransitionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "flighttransition_instrumentapproachprocedure_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "flighttransition", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "instrumentapproachprocedurepropertygroup", referencedColumnName = "hjid")
    })
    public List<ProcedureTransitionPropertyType> getFlightTransition() {
        if (flightTransition == null) {
            flightTransition = new ArrayList<>();
        }
        return this.flightTransition;
    }

    /**
     * 
     * 
     */
    public void setFlightTransition(List<ProcedureTransitionPropertyType> flightTransition) {
        this.flightTransition = flightTransition;
    }

    @Transient
    public boolean isSetFlightTransition() {
        return ((this.flightTransition!= null)&&(!this.flightTransition.isEmpty()));
    }

    public void unsetFlightTransition() {
        this.flightTransition = null;
    }

    /**
     * Gets the value of the guidanceFacilitySpecialNavigationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SpecialNavigationSystemPropertyType> getGuidanceFacilitySpecialNavigationSystem() {
        return guidanceFacilitySpecialNavigationSystem;
    }

    /**
     * Sets the value of the guidanceFacilitySpecialNavigationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilitySpecialNavigationSystem(JAXBElement<SpecialNavigationSystemPropertyType> value) {
        this.guidanceFacilitySpecialNavigationSystem = value;
    }

    @Transient
    public boolean isSetGuidanceFacilitySpecialNavigationSystem() {
        return (this.guidanceFacilitySpecialNavigationSystem!= null);
    }

    /**
     * Gets the value of the guidanceFacilityRadar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadarSystemPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RadarSystemPropertyType> getGuidanceFacilityRadar() {
        return guidanceFacilityRadar;
    }

    /**
     * Sets the value of the guidanceFacilityRadar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadarSystemPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilityRadar(JAXBElement<RadarSystemPropertyType> value) {
        this.guidanceFacilityRadar = value;
    }

    @Transient
    public boolean isSetGuidanceFacilityRadar() {
        return (this.guidanceFacilityRadar!= null);
    }

    /**
     * Gets the value of the guidanceFacilityNavaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getGuidanceFacilityNavaid() {
        return guidanceFacilityNavaid;
    }

    /**
     * Sets the value of the guidanceFacilityNavaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilityNavaid(JAXBElement<NavaidPropertyType> value) {
        this.guidanceFacilityNavaid = value;
    }

    @Transient
    public boolean isSetGuidanceFacilityNavaid() {
        return (this.guidanceFacilityNavaid!= null);
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
    @JoinTable(name = "annotation_instrumentapproachprocedure_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "instrumentapproachprocedurepropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the safeAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SafeAltitudeAreaPropertyType> getSafeAltitude() {
        return safeAltitude;
    }

    /**
     * Sets the value of the safeAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaPropertyType }{@code >}
     *     
     */
    public void setSafeAltitude(JAXBElement<SafeAltitudeAreaPropertyType> value) {
        this.safeAltitude = value;
    }

    @Transient
    public boolean isSetSafeAltitude() {
        return (this.safeAltitude!= null);
    }

    /**
     * Gets the value of the approachPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrefixType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachPrefixType> getApproachPrefix() {
        return approachPrefix;
    }

    /**
     * Sets the value of the approachPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrefixType }{@code >}
     *     
     */
    public void setApproachPrefix(JAXBElement<CodeApproachPrefixType> value) {
        this.approachPrefix = value;
    }

    @Transient
    public boolean isSetApproachPrefix() {
        return (this.approachPrefix!= null);
    }

    /**
     * Gets the value of the approachType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachType> getApproachType() {
        return approachType;
    }

    /**
     * Sets the value of the approachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public void setApproachType(JAXBElement<CodeApproachType> value) {
        this.approachType = value;
    }

    @Transient
    public boolean isSetApproachType() {
        return (this.approachType!= null);
    }

    /**
     * Gets the value of the multipleIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeUpperAlphaType> getMultipleIdentification() {
        return multipleIdentification;
    }

    /**
     * Sets the value of the multipleIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setMultipleIdentification(JAXBElement<CodeUpperAlphaType> value) {
        this.multipleIdentification = value;
    }

    @Transient
    public boolean isSetMultipleIdentification() {
        return (this.multipleIdentification!= null);
    }

    /**
     * Gets the value of the copterTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getCopterTrack() {
        return copterTrack;
    }

    /**
     * Sets the value of the copterTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCopterTrack(JAXBElement<ValBearingType> value) {
        this.copterTrack = value;
    }

    @Transient
    public boolean isSetCopterTrack() {
        return (this.copterTrack!= null);
    }

    /**
     * Gets the value of the circlingIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeUpperAlphaType> getCirclingIdentification() {
        return circlingIdentification;
    }

    /**
     * Sets the value of the circlingIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setCirclingIdentification(JAXBElement<CodeUpperAlphaType> value) {
        this.circlingIdentification = value;
    }

    @Transient
    public boolean isSetCirclingIdentification() {
        return (this.circlingIdentification!= null);
    }

    /**
     * Gets the value of the courseReversalInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextInstructionType> getCourseReversalInstruction() {
        return courseReversalInstruction;
    }

    /**
     * Sets the value of the courseReversalInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setCourseReversalInstruction(JAXBElement<TextInstructionType> value) {
        this.courseReversalInstruction = value;
    }

    @Transient
    public boolean isSetCourseReversalInstruction() {
        return (this.courseReversalInstruction!= null);
    }

    /**
     * Gets the value of the additionalEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachEquipmentAdditionalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachEquipmentAdditionalType> getAdditionalEquipment() {
        return additionalEquipment;
    }

    /**
     * Sets the value of the additionalEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachEquipmentAdditionalType }{@code >}
     *     
     */
    public void setAdditionalEquipment(JAXBElement<CodeApproachEquipmentAdditionalType> value) {
        this.additionalEquipment = value;
    }

    @Transient
    public boolean isSetAdditionalEquipment() {
        return (this.additionalEquipment!= null);
    }

    /**
     * Gets the value of the channelGNSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValChannelNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValChannelNumberType> getChannelGNSS() {
        return channelGNSS;
    }

    /**
     * Sets the value of the channelGNSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValChannelNumberType }{@code >}
     *     
     */
    public void setChannelGNSS(JAXBElement<ValChannelNumberType> value) {
        this.channelGNSS = value;
    }

    @Transient
    public boolean isSetChannelGNSS() {
        return (this.channelGNSS!= null);
    }

    /**
     * Gets the value of the waasReliable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getWAASReliable() {
        return waasReliable;
    }

    /**
     * Sets the value of the waasReliable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWAASReliable(JAXBElement<CodeYesNoType> value) {
        this.waasReliable = value;
    }

    @Transient
    public boolean isSetWAASReliable() {
        return (this.waasReliable!= null);
    }

    /**
     * Gets the value of the landing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<LandingTakeoffAreaCollectionPropertyType> getLanding() {
        return landing;
    }

    /**
     * Sets the value of the landing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public void setLanding(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.landing = value;
    }

    @Transient
    public boolean isSetLanding() {
        return (this.landing!= null);
    }

    /**
     * Gets the value of the missedInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missedInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissedInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissedApproachGroupPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = MissedApproachGroupPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "missedinstruction_instrumentapproachprocedure_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "missedinstruction", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "instrumentapproachprocedurepropertygroup", referencedColumnName = "hjid")
    })
    public List<MissedApproachGroupPropertyType> getMissedInstruction() {
        if (missedInstruction == null) {
            missedInstruction = new ArrayList<>();
        }
        return this.missedInstruction;
    }

    /**
     * 
     * 
     */
    public void setMissedInstruction(List<MissedApproachGroupPropertyType> missedInstruction) {
        this.missedInstruction = missedInstruction;
    }

    @Transient
    public boolean isSetMissedInstruction() {
        return ((this.missedInstruction!= null)&&(!this.missedInstruction.isEmpty()));
    }

    public void unsetMissedInstruction() {
        this.missedInstruction = null;
    }

    /**
     * Gets the value of the finalProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinalProfilePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<FinalProfilePropertyType> getFinalProfile() {
        return finalProfile;
    }

    /**
     * Sets the value of the finalProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinalProfilePropertyType }{@code >}
     *     
     */
    public void setFinalProfile(JAXBElement<FinalProfilePropertyType> value) {
        this.finalProfile = value;
    }

    @Transient
    public boolean isSetFinalProfile() {
        return (this.finalProfile!= null);
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
     * {@link InstrumentApproachProcedureExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = InstrumentApproachProcedureExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<InstrumentApproachProcedureExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<InstrumentApproachProcedureExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "communicationfailureinstruction")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "communicationfailureinstruction_nilreason"))
    })
    public TextInstructionType getCommunicationFailureInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getCommunicationFailureInstruction());
    }

    public void setCommunicationFailureInstructionItem(TextInstructionType target) {
        setCommunicationFailureInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "communicationFailureInstruction"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "instruction")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "instruction_nilreason"))
    })
    public TextInstructionType getInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getInstruction());
    }

    public void setInstructionItem(TextInstructionType target) {
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instruction"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designcriteria")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designcriteria_nilreason"))
    })
    public CodeDesignStandardType getDesignCriteriaItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDesignStandardType.class, this.getDesignCriteria());
    }

    public void setDesignCriteriaItem(CodeDesignStandardType target) {
        setDesignCriteria(XmlAdapterUtils.marshallJAXBElement(CodeDesignStandardType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designCriteria"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "codingstandard")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "codingstandard_nilreason"))
    })
    public CodeProcedureCodingStandardType getCodingStandardItem() {
        return XmlAdapterUtils.unmarshallSource(CodeProcedureCodingStandardType.class, this.getCodingStandard());
    }

    public void setCodingStandardItem(CodeProcedureCodingStandardType target) {
        setCodingStandard(XmlAdapterUtils.marshallJAXBElement(CodeProcedureCodingStandardType.class, new QName("http://www.aixm.aero/schema/5.1.1", "codingStandard"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "flightchecked")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flightchecked_nilreason"))
    })
    public CodeYesNoType getFlightCheckedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFlightChecked());
    }

    public void setFlightCheckedItem(CodeYesNoType target) {
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightChecked"), InstrumentApproachProcedureTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "rnav")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "rnav_nilreason"))
    })
    public CodeYesNoType getRNAVItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getRNAV());
    }

    public void setRNAVItem(CodeYesNoType target) {
        setRNAV(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "RNAV"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SpecialNavigationSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancefacility_specialnavigationsystem_id", referencedColumnName = "hjid")
    public SpecialNavigationSystemPropertyType getGuidanceFacilitySpecialNavigationSystemItem() {
        return XmlAdapterUtils.unmarshallSource(SpecialNavigationSystemPropertyType.class, this.getGuidanceFacilitySpecialNavigationSystem());
    }

    public void setGuidanceFacilitySpecialNavigationSystemItem(SpecialNavigationSystemPropertyType target) {
        setGuidanceFacilitySpecialNavigationSystem(XmlAdapterUtils.marshallJAXBElement(SpecialNavigationSystemPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceFacility_specialNavigationSystem"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RadarSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancefacility_radar_id", referencedColumnName = "hjid")
    public RadarSystemPropertyType getGuidanceFacilityRadarItem() {
        return XmlAdapterUtils.unmarshallSource(RadarSystemPropertyType.class, this.getGuidanceFacilityRadar());
    }

    public void setGuidanceFacilityRadarItem(RadarSystemPropertyType target) {
        setGuidanceFacilityRadar(XmlAdapterUtils.marshallJAXBElement(RadarSystemPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceFacility_radar"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancefacility_navaid_id", referencedColumnName = "hjid")
    public NavaidPropertyType getGuidanceFacilityNavaidItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getGuidanceFacilityNavaid());
    }

    public void setGuidanceFacilityNavaidItem(NavaidPropertyType target) {
        setGuidanceFacilityNavaid(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceFacility_navaid"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SafeAltitudeAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "safealtitude_id", referencedColumnName = "hjid")
    public SafeAltitudeAreaPropertyType getSafeAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(SafeAltitudeAreaPropertyType.class, this.getSafeAltitude());
    }

    public void setSafeAltitudeItem(SafeAltitudeAreaPropertyType target) {
        setSafeAltitude(XmlAdapterUtils.marshallJAXBElement(SafeAltitudeAreaPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "safeAltitude"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachprefix")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachprefix_nilreason"))
    })
    public CodeApproachPrefixType getApproachPrefixItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachPrefixType.class, this.getApproachPrefix());
    }

    public void setApproachPrefixItem(CodeApproachPrefixType target) {
        setApproachPrefix(XmlAdapterUtils.marshallJAXBElement(CodeApproachPrefixType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachPrefix"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "approachtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "approachtype_nilreason"))
    })
    public CodeApproachType getApproachTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachType.class, this.getApproachType());
    }

    public void setApproachTypeItem(CodeApproachType target) {
        setApproachType(XmlAdapterUtils.marshallJAXBElement(CodeApproachType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachType"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "multipleidentification")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "multipleidentification_nilreason"))
    })
    public CodeUpperAlphaType getMultipleIdentificationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeUpperAlphaType.class, this.getMultipleIdentification());
    }

    public void setMultipleIdentificationItem(CodeUpperAlphaType target) {
        setMultipleIdentification(XmlAdapterUtils.marshallJAXBElement(CodeUpperAlphaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "multipleIdentification"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coptertrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coptertrack_nilreason"))
    })
    public ValBearingType getCopterTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getCopterTrack());
    }

    public void setCopterTrackItem(ValBearingType target) {
        setCopterTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "copterTrack"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "circlingidentification")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "circlingidentification_nilreason"))
    })
    public CodeUpperAlphaType getCirclingIdentificationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeUpperAlphaType.class, this.getCirclingIdentification());
    }

    public void setCirclingIdentificationItem(CodeUpperAlphaType target) {
        setCirclingIdentification(XmlAdapterUtils.marshallJAXBElement(CodeUpperAlphaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "circlingIdentification"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "coursereversalinstruction")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "coursereversalinstruction_nilreason"))
    })
    public TextInstructionType getCourseReversalInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getCourseReversalInstruction());
    }

    public void setCourseReversalInstructionItem(TextInstructionType target) {
        setCourseReversalInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "courseReversalInstruction"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "additionalequipment")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "additionalequipment_nilreason"))
    })
    public CodeApproachEquipmentAdditionalType getAdditionalEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachEquipmentAdditionalType.class, this.getAdditionalEquipment());
    }

    public void setAdditionalEquipmentItem(CodeApproachEquipmentAdditionalType target) {
        setAdditionalEquipment(XmlAdapterUtils.marshallJAXBElement(CodeApproachEquipmentAdditionalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "additionalEquipment"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "channelgnss")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "channelgnss_nilreason"))
    })
    public ValChannelNumberType getChannelGNSSItem() {
        return XmlAdapterUtils.unmarshallSource(ValChannelNumberType.class, this.getChannelGNSS());
    }

    public void setChannelGNSSItem(ValChannelNumberType target) {
        setChannelGNSS(XmlAdapterUtils.marshallJAXBElement(ValChannelNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "channelGNSS"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "waasreliable")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "waasreliable_nilreason"))
    })
    public CodeYesNoType getWAASReliableItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getWAASReliable());
    }

    public void setWAASReliableItem(CodeYesNoType target) {
        setWAASReliable(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "WAASReliable"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = LandingTakeoffAreaCollectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "landing_id", referencedColumnName = "hjid")
    public LandingTakeoffAreaCollectionPropertyType getLandingItem() {
        return XmlAdapterUtils.unmarshallSource(LandingTakeoffAreaCollectionPropertyType.class, this.getLanding());
    }

    public void setLandingItem(LandingTakeoffAreaCollectionPropertyType target) {
        setLanding(XmlAdapterUtils.marshallJAXBElement(LandingTakeoffAreaCollectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "landing"), InstrumentApproachProcedureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = FinalProfilePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalprofile_id", referencedColumnName = "hjid")
    public FinalProfilePropertyType getFinalProfileItem() {
        return XmlAdapterUtils.unmarshallSource(FinalProfilePropertyType.class, this.getFinalProfile());
    }

    public void setFinalProfileItem(FinalProfilePropertyType target) {
        setFinalProfile(XmlAdapterUtils.marshallJAXBElement(FinalProfilePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalProfile"), InstrumentApproachProcedureTimeSliceType.class, target));
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
        final InstrumentApproachProcedureTimeSliceType that = ((InstrumentApproachProcedureTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetMultipleIdentification();
            boolean rhsFieldIsSet = that.isSetMultipleIdentification();
            JAXBElement<CodeUpperAlphaType> lhsField;
            lhsField = this.getMultipleIdentification();
            JAXBElement<CodeUpperAlphaType> rhsField;
            rhsField = that.getMultipleIdentification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "multipleIdentification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "multipleIdentification", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightTransition();
            boolean rhsFieldIsSet = that.isSetFlightTransition();
            List<ProcedureTransitionPropertyType> lhsField;
            lhsField = (this.isSetFlightTransition()?this.getFlightTransition():null);
            List<ProcedureTransitionPropertyType> rhsField;
            rhsField = (that.isSetFlightTransition()?that.getFlightTransition():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightTransition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightTransition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFinalProfile();
            boolean rhsFieldIsSet = that.isSetFinalProfile();
            JAXBElement<FinalProfilePropertyType> lhsField;
            lhsField = this.getFinalProfile();
            JAXBElement<FinalProfilePropertyType> rhsField;
            rhsField = that.getFinalProfile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalProfile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalProfile", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourseReversalInstruction();
            boolean rhsFieldIsSet = that.isSetCourseReversalInstruction();
            JAXBElement<TextInstructionType> lhsField;
            lhsField = this.getCourseReversalInstruction();
            JAXBElement<TextInstructionType> rhsField;
            rhsField = that.getCourseReversalInstruction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseReversalInstruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseReversalInstruction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMissedInstruction();
            boolean rhsFieldIsSet = that.isSetMissedInstruction();
            List<MissedApproachGroupPropertyType> lhsField;
            lhsField = (this.isSetMissedInstruction()?this.getMissedInstruction():null);
            List<MissedApproachGroupPropertyType> rhsField;
            rhsField = (that.isSetMissedInstruction()?that.getMissedInstruction():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "missedInstruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "missedInstruction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGuidanceFacilityNavaid();
            boolean rhsFieldIsSet = that.isSetGuidanceFacilityNavaid();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getGuidanceFacilityNavaid();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getGuidanceFacilityNavaid();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceFacilityNavaid", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceFacilityNavaid", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachPrefix();
            boolean rhsFieldIsSet = that.isSetApproachPrefix();
            JAXBElement<CodeApproachPrefixType> lhsField;
            lhsField = this.getApproachPrefix();
            JAXBElement<CodeApproachPrefixType> rhsField;
            rhsField = that.getApproachPrefix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachPrefix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachPrefix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGuidanceFacilitySpecialNavigationSystem();
            boolean rhsFieldIsSet = that.isSetGuidanceFacilitySpecialNavigationSystem();
            JAXBElement<SpecialNavigationSystemPropertyType> lhsField;
            lhsField = this.getGuidanceFacilitySpecialNavigationSystem();
            JAXBElement<SpecialNavigationSystemPropertyType> rhsField;
            rhsField = that.getGuidanceFacilitySpecialNavigationSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceFacilitySpecialNavigationSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceFacilitySpecialNavigationSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<ProcedureAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<ProcedureAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachType();
            boolean rhsFieldIsSet = that.isSetApproachType();
            JAXBElement<CodeApproachType> lhsField;
            lhsField = this.getApproachType();
            JAXBElement<CodeApproachType> rhsField;
            rhsField = that.getApproachType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetChannelGNSS();
            boolean rhsFieldIsSet = that.isSetChannelGNSS();
            JAXBElement<ValChannelNumberType> lhsField;
            lhsField = this.getChannelGNSS();
            JAXBElement<ValChannelNumberType> rhsField;
            rhsField = that.getChannelGNSS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "channelGNSS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "channelGNSS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRNAV();
            boolean rhsFieldIsSet = that.isSetRNAV();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getRNAV();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getRNAV();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rnav", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rnav", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<InstrumentApproachProcedureExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<InstrumentApproachProcedureExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGuidanceFacilityRadar();
            boolean rhsFieldIsSet = that.isSetGuidanceFacilityRadar();
            JAXBElement<RadarSystemPropertyType> lhsField;
            lhsField = this.getGuidanceFacilityRadar();
            JAXBElement<RadarSystemPropertyType> rhsField;
            rhsField = that.getGuidanceFacilityRadar();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceFacilityRadar", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceFacilityRadar", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCharacteristic();
            boolean rhsFieldIsSet = that.isSetAircraftCharacteristic();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCharacteristic()?this.getAircraftCharacteristic():null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCharacteristic()?that.getAircraftCharacteristic():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCharacteristic", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCharacteristic", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCopterTrack();
            boolean rhsFieldIsSet = that.isSetCopterTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getCopterTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getCopterTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "copterTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "copterTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInstruction();
            boolean rhsFieldIsSet = that.isSetInstruction();
            JAXBElement<TextInstructionType> lhsField;
            lhsField = this.getInstruction();
            JAXBElement<TextInstructionType> rhsField;
            rhsField = that.getInstruction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "instruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "instruction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightChecked();
            boolean rhsFieldIsSet = that.isSetFlightChecked();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFlightChecked();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFlightChecked();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightChecked", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightChecked", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLanding();
            boolean rhsFieldIsSet = that.isSetLanding();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> lhsField;
            lhsField = this.getLanding();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> rhsField;
            rhsField = that.getLanding();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landing", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSafeAltitude();
            boolean rhsFieldIsSet = that.isSetSafeAltitude();
            JAXBElement<SafeAltitudeAreaPropertyType> lhsField;
            lhsField = this.getSafeAltitude();
            JAXBElement<SafeAltitudeAreaPropertyType> rhsField;
            rhsField = that.getSafeAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "safeAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "safeAltitude", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAirportHeliport();
            boolean rhsFieldIsSet = that.isSetAirportHeliport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetAirportHeliport()?this.getAirportHeliport():null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetAirportHeliport()?that.getAirportHeliport():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportHeliport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignCriteria();
            boolean rhsFieldIsSet = that.isSetDesignCriteria();
            JAXBElement<CodeDesignStandardType> lhsField;
            lhsField = this.getDesignCriteria();
            JAXBElement<CodeDesignStandardType> rhsField;
            rhsField = that.getDesignCriteria();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designCriteria", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designCriteria", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodingStandard();
            boolean rhsFieldIsSet = that.isSetCodingStandard();
            JAXBElement<CodeProcedureCodingStandardType> lhsField;
            lhsField = this.getCodingStandard();
            JAXBElement<CodeProcedureCodingStandardType> rhsField;
            rhsField = that.getCodingStandard();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codingStandard", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codingStandard", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCirclingIdentification();
            boolean rhsFieldIsSet = that.isSetCirclingIdentification();
            JAXBElement<CodeUpperAlphaType> lhsField;
            lhsField = this.getCirclingIdentification();
            JAXBElement<CodeUpperAlphaType> rhsField;
            rhsField = that.getCirclingIdentification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "circlingIdentification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "circlingIdentification", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWAASReliable();
            boolean rhsFieldIsSet = that.isSetWAASReliable();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getWAASReliable();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getWAASReliable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "waasReliable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "waasReliable", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCommunicationFailureInstruction();
            boolean rhsFieldIsSet = that.isSetCommunicationFailureInstruction();
            JAXBElement<TextInstructionType> lhsField;
            lhsField = this.getCommunicationFailureInstruction();
            JAXBElement<TextInstructionType> rhsField;
            rhsField = that.getCommunicationFailureInstruction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "communicationFailureInstruction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "communicationFailureInstruction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdditionalEquipment();
            boolean rhsFieldIsSet = that.isSetAdditionalEquipment();
            JAXBElement<CodeApproachEquipmentAdditionalType> lhsField;
            lhsField = this.getAdditionalEquipment();
            JAXBElement<CodeApproachEquipmentAdditionalType> rhsField;
            rhsField = that.getAdditionalEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "additionalEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "additionalEquipment", rhsField);
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
            boolean theFieldIsSet = this.isSetCommunicationFailureInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getCommunicationFailureInstruction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "communicationFailureInstruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getInstruction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "instruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignCriteria();
            JAXBElement<CodeDesignStandardType> theField;
            theField = this.getDesignCriteria();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designCriteria", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodingStandard();
            JAXBElement<CodeProcedureCodingStandardType> theField;
            theField = this.getCodingStandard();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codingStandard", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightChecked", theField);
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
            boolean theFieldIsSet = this.isSetRNAV();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRNAV();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rnav", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ProcedureAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport()?this.getAirportHeliport():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCharacteristic();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCharacteristic()?this.getAircraftCharacteristic():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCharacteristic", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightTransition();
            List<ProcedureTransitionPropertyType> theField;
            theField = (this.isSetFlightTransition()?this.getFlightTransition():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightTransition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilitySpecialNavigationSystem();
            JAXBElement<SpecialNavigationSystemPropertyType> theField;
            theField = this.getGuidanceFacilitySpecialNavigationSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceFacilitySpecialNavigationSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilityRadar();
            JAXBElement<RadarSystemPropertyType> theField;
            theField = this.getGuidanceFacilityRadar();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceFacilityRadar", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilityNavaid();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getGuidanceFacilityNavaid();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceFacilityNavaid", theField);
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
            boolean theFieldIsSet = this.isSetSafeAltitude();
            JAXBElement<SafeAltitudeAreaPropertyType> theField;
            theField = this.getSafeAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "safeAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachPrefix();
            JAXBElement<CodeApproachPrefixType> theField;
            theField = this.getApproachPrefix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachPrefix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachType();
            JAXBElement<CodeApproachType> theField;
            theField = this.getApproachType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMultipleIdentification();
            JAXBElement<CodeUpperAlphaType> theField;
            theField = this.getMultipleIdentification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "multipleIdentification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCopterTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getCopterTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "copterTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCirclingIdentification();
            JAXBElement<CodeUpperAlphaType> theField;
            theField = this.getCirclingIdentification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "circlingIdentification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseReversalInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getCourseReversalInstruction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseReversalInstruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdditionalEquipment();
            JAXBElement<CodeApproachEquipmentAdditionalType> theField;
            theField = this.getAdditionalEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "additionalEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannelGNSS();
            JAXBElement<ValChannelNumberType> theField;
            theField = this.getChannelGNSS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "channelGNSS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWAASReliable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getWAASReliable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "waasReliable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLanding();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = this.getLanding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMissedInstruction();
            List<MissedApproachGroupPropertyType> theField;
            theField = (this.isSetMissedInstruction()?this.getMissedInstruction():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "missedInstruction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalProfile();
            JAXBElement<FinalProfilePropertyType> theField;
            theField = this.getFinalProfile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalProfile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<InstrumentApproachProcedureExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetCommunicationFailureInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getCommunicationFailureInstruction();
            strategy.appendField(locator, this, "communicationFailureInstruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getInstruction();
            strategy.appendField(locator, this, "instruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignCriteria();
            JAXBElement<CodeDesignStandardType> theField;
            theField = this.getDesignCriteria();
            strategy.appendField(locator, this, "designCriteria", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodingStandard();
            JAXBElement<CodeProcedureCodingStandardType> theField;
            theField = this.getCodingStandard();
            strategy.appendField(locator, this, "codingStandard", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            strategy.appendField(locator, this, "flightChecked", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRNAV();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRNAV();
            strategy.appendField(locator, this, "rnav", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ProcedureAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport()?this.getAirportHeliport():null);
            strategy.appendField(locator, this, "airportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCharacteristic();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCharacteristic()?this.getAircraftCharacteristic():null);
            strategy.appendField(locator, this, "aircraftCharacteristic", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightTransition();
            List<ProcedureTransitionPropertyType> theField;
            theField = (this.isSetFlightTransition()?this.getFlightTransition():null);
            strategy.appendField(locator, this, "flightTransition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilitySpecialNavigationSystem();
            JAXBElement<SpecialNavigationSystemPropertyType> theField;
            theField = this.getGuidanceFacilitySpecialNavigationSystem();
            strategy.appendField(locator, this, "guidanceFacilitySpecialNavigationSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilityRadar();
            JAXBElement<RadarSystemPropertyType> theField;
            theField = this.getGuidanceFacilityRadar();
            strategy.appendField(locator, this, "guidanceFacilityRadar", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilityNavaid();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getGuidanceFacilityNavaid();
            strategy.appendField(locator, this, "guidanceFacilityNavaid", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSafeAltitude();
            JAXBElement<SafeAltitudeAreaPropertyType> theField;
            theField = this.getSafeAltitude();
            strategy.appendField(locator, this, "safeAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachPrefix();
            JAXBElement<CodeApproachPrefixType> theField;
            theField = this.getApproachPrefix();
            strategy.appendField(locator, this, "approachPrefix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachType();
            JAXBElement<CodeApproachType> theField;
            theField = this.getApproachType();
            strategy.appendField(locator, this, "approachType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMultipleIdentification();
            JAXBElement<CodeUpperAlphaType> theField;
            theField = this.getMultipleIdentification();
            strategy.appendField(locator, this, "multipleIdentification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCopterTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getCopterTrack();
            strategy.appendField(locator, this, "copterTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCirclingIdentification();
            JAXBElement<CodeUpperAlphaType> theField;
            theField = this.getCirclingIdentification();
            strategy.appendField(locator, this, "circlingIdentification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseReversalInstruction();
            JAXBElement<TextInstructionType> theField;
            theField = this.getCourseReversalInstruction();
            strategy.appendField(locator, this, "courseReversalInstruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdditionalEquipment();
            JAXBElement<CodeApproachEquipmentAdditionalType> theField;
            theField = this.getAdditionalEquipment();
            strategy.appendField(locator, this, "additionalEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannelGNSS();
            JAXBElement<ValChannelNumberType> theField;
            theField = this.getChannelGNSS();
            strategy.appendField(locator, this, "channelGNSS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWAASReliable();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getWAASReliable();
            strategy.appendField(locator, this, "waasReliable", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLanding();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = this.getLanding();
            strategy.appendField(locator, this, "landing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMissedInstruction();
            List<MissedApproachGroupPropertyType> theField;
            theField = (this.isSetMissedInstruction()?this.getMissedInstruction():null);
            strategy.appendField(locator, this, "missedInstruction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFinalProfile();
            JAXBElement<FinalProfilePropertyType> theField;
            theField = this.getFinalProfile();
            strategy.appendField(locator, this, "finalProfile", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<InstrumentApproachProcedureExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
