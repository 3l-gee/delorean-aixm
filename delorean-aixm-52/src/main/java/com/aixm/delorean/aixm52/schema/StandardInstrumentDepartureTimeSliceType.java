
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
 * Java class for StandardInstrumentDepartureTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="StandardInstrumentDepartureTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="communicationFailureInstruction" type=
"{http://www.aixm.aero/schema/5.2}TextInstructionType" minOccurs="0"/>
 *         <element name="instruction" type=
"{http://www.aixm.aero/schema/5.2}TextInstructionType" minOccurs="0"/>
 *         <element name="designCriteria" type=
"{http://www.aixm.aero/schema/5.2}DesignStandardPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="codingStandard" type=
"{http://www.aixm.aero/schema/5.2}CodeProcedureCodingStandardType" minOccurs=
"0"/>
 *         <element name="flightChecked" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="name" type=
"{http://www.aixm.aero/schema/5.2}TextNameType" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}ProcedureAvailabilityPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="airportHeliport" type=
"{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="flightTransition" type=
"{http://www.aixm.aero/schema/5.2}ProcedureTransitionPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="guidanceFacility_groundAugmentedGNSS" type=
"{http://www.aixm.aero/schema/5.2}GBASPropertyType" minOccurs="0"/>
 *           <element name="guidanceFacility_specialNavigationSystem" type=
"{http://www.aixm.aero/schema/5.2}SpecialNavigationSystemPropertyType" minOccurs
="0"/>
 *           <element name="guidanceFacility_radar" type=
"{http://www.aixm.aero/schema/5.2}RadarSystemPropertyType" minOccurs="0"/>
 *           <element name="guidanceFacility_navaid" type=
"{http://www.aixm.aero/schema/5.2}NavaidPropertyType" minOccurs="0"/>
 *           <element name="guidanceFacility_satelliteService" type=
"{http://www.aixm.aero/schema/5.2}SatelliteSystemPropertyType" minOccurs="0"/>
 *         </choice>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="safeAltitude" type=
"{http://www.aixm.aero/schema/5.2}MinimumAltitudeAreaPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="magneticVariation" type=
"{http://www.aixm.aero/schema/5.2}ValMagneticVariationType" minOccurs="0"/>
 *         <element name="dateMagneticVariation" type=
"{http://www.aixm.aero/schema/5.2}DateYearType" minOccurs="0"/>
 *         <element name="additionalEquipment" type=
"{http://www.aixm.aero/schema/5.2}CodeAdditionalEquipmentType" minOccurs="0"/>
 *         <element name="specialAuthorisation" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="aircraftCapability" type=
"{http://www.aixm.aero/schema/5.2}AircraftCharacteristicPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}TextSIDSTARDesignatorType" minOccurs="0"/>
 *         <element name="contingencyRoute" type=
"{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="takeoff" type=
"{http://www.aixm.aero/schema/5.2}LandingTakeoffAreaCollectionPropertyType" minOccurs
="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractStandardInstrumentDepartureExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractProcedureExtension"/>
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
@XmlType(name = "StandardInstrumentDepartureTimeSliceType", propOrder = {"communicationFailureInstruction",
        "instruction", "designCriteria", "codingStandard", "flightChecked", "aixmName", "availability",
        "airportHeliport", "flightTransition", "guidanceFacilityGroundAugmentedGNSS",
        "guidanceFacilitySpecialNavigationSystem", "guidanceFacilityRadar", "guidanceFacilityNavaid",
        "guidanceFacilitySatelliteService", "annotation", "safeAltitude", "magneticVariation", "dateMagneticVariation",
        "additionalEquipment", "specialAuthorisation", "aircraftCapability", "designator", "contingencyRoute",
        "takeoff", "extension"})
@Entity(name = "StandardInstrumentDepartureTimeSliceType")
@Table(name = "standardinstrumentdeparture_t", schema = "procedure")
public class StandardInstrumentDepartureTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "communicationFailureInstruction", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> communicationFailureInstruction;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElement(nillable = true)
    protected List<DesignStandardPropertyType> designCriteria;
    @XmlElementRef(name = "codingStandard", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureCodingStandardType> codingStandard;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElement(nillable = true)
    protected List<ProcedureAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(nillable = true)
    protected List<ProcedureTransitionPropertyType> flightTransition;
    @XmlElementRef(name = "guidanceFacility_groundAugmentedGNSS", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<GBASPropertyType> guidanceFacilityGroundAugmentedGNSS;
    @XmlElementRef(name = "guidanceFacility_specialNavigationSystem", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationSystemPropertyType> guidanceFacilitySpecialNavigationSystem;
    @XmlElementRef(name = "guidanceFacility_radar", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RadarSystemPropertyType> guidanceFacilityRadar;
    @XmlElementRef(name = "guidanceFacility_navaid", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> guidanceFacilityNavaid;
    @XmlElementRef(name = "guidanceFacility_satelliteService", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SatelliteSystemPropertyType> guidanceFacilitySatelliteService;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<MinimumAltitudeAreaPropertyType> safeAltitude;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElementRef(name = "additionalEquipment", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAdditionalEquipmentType> additionalEquipment;
    @XmlElementRef(name = "specialAuthorisation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialAuthorisation;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCapability;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextSIDSTARDesignatorType> designator;
    @XmlElementRef(name = "contingencyRoute", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> contingencyRoute;
    @XmlElementRef(name = "takeoff", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> takeoff;
    protected List<StandardInstrumentDepartureTimeSliceExtensionType> extension;

    /**
     * Gets the value of the communicationFailureInstruction property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextInstructionType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextInstructionType }{@code >}
     *
     */
    public void setCommunicationFailureInstruction(JAXBElement<TextInstructionType> value) {
        this.communicationFailureInstruction = value;
    }

    @Transient
    public boolean isSetCommunicationFailureInstruction() {
        return (this.communicationFailureInstruction != null);
    }

    /**
     * Gets the value of the instruction property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextInstructionType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextInstructionType }{@code >}
     *
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    @Transient
    public boolean isSetInstruction() {
        return (this.instruction != null);
    }

    /**
     * Gets the value of the designCriteria property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the designCriteria property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDesignCriteria().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignStandardPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = DesignStandardPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_dsgncrtr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "designcriteria_hjid", referencedColumnName = "hjid")})
    public List<DesignStandardPropertyType> getDesignCriteria() {
        if (designCriteria == null) {
            designCriteria = new ArrayList<>();
        }
        return this.designCriteria;
    }

    /**
     *
     *
     */
    public void setDesignCriteria(List<DesignStandardPropertyType> designCriteria) {
        this.designCriteria = designCriteria;
    }

    @Transient
    public boolean isSetDesignCriteria() {
        return ((this.designCriteria != null) && (!this.designCriteria.isEmpty()));
    }

    public void unsetDesignCriteria() {
        this.designCriteria = null;
    }

    /**
     * Gets the value of the codingStandard property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *
     */
    public void setCodingStandard(JAXBElement<CodeProcedureCodingStandardType> value) {
        this.codingStandard = value;
    }

    @Transient
    public boolean isSetCodingStandard() {
        return (this.codingStandard != null);
    }

    /**
     * Gets the value of the flightChecked property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

    @Transient
    public boolean isSetFlightChecked() {
        return (this.flightChecked != null);
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
     * {@link ProcedureAvailabilityPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = ProcedureAvailabilityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_avlblt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
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
        return ((this.availability != null) && (!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
    }

    /**
     * Gets the value of the airportHeliport property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the airportHeliport property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAirportHeliport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AirportHeliportPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_arprthlprt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "airportheliport_hjid", referencedColumnName = "hjid")})
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
        return ((this.airportHeliport != null) && (!this.airportHeliport.isEmpty()));
    }

    public void unsetAirportHeliport() {
        this.airportHeliport = null;
    }

    /**
     * Gets the value of the flightTransition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the flightTransition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getFlightTransition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureTransitionPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = ProcedureTransitionPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_flghttrnstn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "flighttransition_hjid", referencedColumnName = "hjid")})
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
        return ((this.flightTransition != null) && (!this.flightTransition.isEmpty()));
    }

    public void unsetFlightTransition() {
        this.flightTransition = null;
    }

    /**
     * Gets the value of the guidanceFacilityGroundAugmentedGNSS property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link GBASPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<GBASPropertyType> getGuidanceFacilityGroundAugmentedGNSS() {
        return guidanceFacilityGroundAugmentedGNSS;
    }

    /**
     * Sets the value of the guidanceFacilityGroundAugmentedGNSS property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link GBASPropertyType }{@code >}
     *
     */
    public void setGuidanceFacilityGroundAugmentedGNSS(JAXBElement<GBASPropertyType> value) {
        this.guidanceFacilityGroundAugmentedGNSS = value;
    }

    @Transient
    public boolean isSetGuidanceFacilityGroundAugmentedGNSS() {
        return (this.guidanceFacilityGroundAugmentedGNSS != null);
    }

    /**
     * Gets the value of the guidanceFacilitySpecialNavigationSystem property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *
     */
    public void setGuidanceFacilitySpecialNavigationSystem(JAXBElement<SpecialNavigationSystemPropertyType> value) {
        this.guidanceFacilitySpecialNavigationSystem = value;
    }

    @Transient
    public boolean isSetGuidanceFacilitySpecialNavigationSystem() {
        return (this.guidanceFacilitySpecialNavigationSystem != null);
    }

    /**
     * Gets the value of the guidanceFacilityRadar property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RadarSystemPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RadarSystemPropertyType }{@code >}
     *
     */
    public void setGuidanceFacilityRadar(JAXBElement<RadarSystemPropertyType> value) {
        this.guidanceFacilityRadar = value;
    }

    @Transient
    public boolean isSetGuidanceFacilityRadar() {
        return (this.guidanceFacilityRadar != null);
    }

    /**
     * Gets the value of the guidanceFacilityNavaid property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link NavaidPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link NavaidPropertyType }{@code >}
     *
     */
    public void setGuidanceFacilityNavaid(JAXBElement<NavaidPropertyType> value) {
        this.guidanceFacilityNavaid = value;
    }

    @Transient
    public boolean isSetGuidanceFacilityNavaid() {
        return (this.guidanceFacilityNavaid != null);
    }

    /**
     * Gets the value of the guidanceFacilitySatelliteService property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link SatelliteSystemPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<SatelliteSystemPropertyType> getGuidanceFacilitySatelliteService() {
        return guidanceFacilitySatelliteService;
    }

    /**
     * Sets the value of the guidanceFacilitySatelliteService property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link SatelliteSystemPropertyType }{@code >}
     *
     */
    public void setGuidanceFacilitySatelliteService(JAXBElement<SatelliteSystemPropertyType> value) {
        this.guidanceFacilitySatelliteService = value;
    }

    @Transient
    public boolean isSetGuidanceFacilitySatelliteService() {
        return (this.guidanceFacilitySatelliteService != null);
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
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the safeAltitude property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the safeAltitude property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSafeAltitude().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinimumAltitudeAreaPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = MinimumAltitudeAreaPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_sfalttd_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "safealtitude_hjid", referencedColumnName = "hjid")})
    public List<MinimumAltitudeAreaPropertyType> getSafeAltitude() {
        if (safeAltitude == null) {
            safeAltitude = new ArrayList<>();
        }
        return this.safeAltitude;
    }

    /**
     *
     *
     */
    public void setSafeAltitude(List<MinimumAltitudeAreaPropertyType> safeAltitude) {
        this.safeAltitude = safeAltitude;
    }

    @Transient
    public boolean isSetSafeAltitude() {
        return ((this.safeAltitude != null) && (!this.safeAltitude.isEmpty()));
    }

    public void unsetSafeAltitude() {
        this.safeAltitude = null;
    }

    /**
     * Gets the value of the magneticVariation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValMagneticVariationType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValMagneticVariationType> getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Sets the value of the magneticVariation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValMagneticVariationType }{@code >}
     *
     */
    public void setMagneticVariation(JAXBElement<ValMagneticVariationType> value) {
        this.magneticVariation = value;
    }

    @Transient
    public boolean isSetMagneticVariation() {
        return (this.magneticVariation != null);
    }

    /**
     * Gets the value of the dateMagneticVariation property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link DateYearType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<DateYearType> getDateMagneticVariation() {
        return dateMagneticVariation;
    }

    /**
     * Sets the value of the dateMagneticVariation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link DateYearType
     *            }{@code >}
     *
     */
    public void setDateMagneticVariation(JAXBElement<DateYearType> value) {
        this.dateMagneticVariation = value;
    }

    @Transient
    public boolean isSetDateMagneticVariation() {
        return (this.dateMagneticVariation != null);
    }

    /**
     * Gets the value of the additionalEquipment property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeAdditionalEquipmentType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeAdditionalEquipmentType> getAdditionalEquipment() {
        return additionalEquipment;
    }

    /**
     * Sets the value of the additionalEquipment property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeAdditionalEquipmentType }{@code >}
     *
     */
    public void setAdditionalEquipment(JAXBElement<CodeAdditionalEquipmentType> value) {
        this.additionalEquipment = value;
    }

    @Transient
    public boolean isSetAdditionalEquipment() {
        return (this.additionalEquipment != null);
    }

    /**
     * Gets the value of the specialAuthorisation property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSpecialAuthorisation() {
        return specialAuthorisation;
    }

    /**
     * Sets the value of the specialAuthorisation property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setSpecialAuthorisation(JAXBElement<CodeYesNoType> value) {
        this.specialAuthorisation = value;
    }

    @Transient
    public boolean isSetSpecialAuthorisation() {
        return (this.specialAuthorisation != null);
    }

    /**
     * Gets the value of the aircraftCapability property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the aircraftCapability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAircraftCapability().add(newItem);
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
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_arcrftcpblt_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "aircraftcapability_hjid", referencedColumnName = "hjid")})
    public List<AircraftCharacteristicPropertyType> getAircraftCapability() {
        if (aircraftCapability == null) {
            aircraftCapability = new ArrayList<>();
        }
        return this.aircraftCapability;
    }

    /**
     *
     *
     */
    public void setAircraftCapability(List<AircraftCharacteristicPropertyType> aircraftCapability) {
        this.aircraftCapability = aircraftCapability;
    }

    @Transient
    public boolean isSetAircraftCapability() {
        return ((this.aircraftCapability != null) && (!this.aircraftCapability.isEmpty()));
    }

    public void unsetAircraftCapability() {
        this.aircraftCapability = null;
    }

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextSIDSTARDesignatorType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextSIDSTARDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextSIDSTARDesignatorType }{@code >}
     *
     */
    public void setDesignator(JAXBElement<TextSIDSTARDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator != null);
    }

    /**
     * Gets the value of the contingencyRoute property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeYesNoType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeYesNoType> getContingencyRoute() {
        return contingencyRoute;
    }

    /**
     * Sets the value of the contingencyRoute property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeYesNoType }{@code >}
     *
     */
    public void setContingencyRoute(JAXBElement<CodeYesNoType> value) {
        this.contingencyRoute = value;
    }

    @Transient
    public boolean isSetContingencyRoute() {
        return (this.contingencyRoute != null);
    }

    /**
     * Gets the value of the takeoff property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<LandingTakeoffAreaCollectionPropertyType> getTakeoff() {
        return takeoff;
    }

    /**
     * Sets the value of the takeoff property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link LandingTakeoffAreaCollectionPropertyType
     *            }{@code >}
     *
     */
    public void setTakeoff(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.takeoff = value;
    }

    @Transient
    public boolean isSetTakeoff() {
        return (this.takeoff != null);
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
     * {@link StandardInstrumentDepartureTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = StandardInstrumentDepartureTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "standardinstrumentdeparture_te_hjid", referencedColumnName = "hjid")
    public List<StandardInstrumentDepartureTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<StandardInstrumentDepartureTimeSliceExtensionType> extension) {
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
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "communicationfailureinstruction", columnDefinition = "TEXT", length = 10000)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "communicationfailureinstructionnilreason"))})
    public TextInstructionType getCommunicationFailureInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getCommunicationFailureInstruction());
    }

    public void setCommunicationFailureInstructionItem(TextInstructionType target) {
        setCommunicationFailureInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "communicationFailureInstruction"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "instruction", columnDefinition = "TEXT", length = 10000)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "instructionnilreason"))})
    public TextInstructionType getInstructionItem() {
        return XmlAdapterUtils.unmarshallSource(TextInstructionType.class, this.getInstruction());
    }

    public void setInstructionItem(TextInstructionType target) {
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "instruction"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "codingstandard", columnDefinition = "VARCHAR", length = 58)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "codingstandardnilreason"))})
    public CodeProcedureCodingStandardType getCodingStandardItem() {
        return XmlAdapterUtils.unmarshallSource(CodeProcedureCodingStandardType.class, this.getCodingStandard());
    }

    public void setCodingStandardItem(CodeProcedureCodingStandardType target) {
        setCodingStandard(XmlAdapterUtils.marshallJAXBElement(CodeProcedureCodingStandardType.class,
                new QName("http://www.aixm.aero/schema/5.2", "codingStandard"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "flightchecked")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "flightcheckednilreason"))})
    public CodeYesNoType getFlightCheckedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFlightChecked());
    }

    public void setFlightCheckedItem(CodeYesNoType target) {
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "flightChecked"),
                StandardInstrumentDepartureTimeSliceType.class, target));
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
                new QName("http://www.aixm.aero/schema/5.2", "name"), StandardInstrumentDepartureTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = GBASPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_gdncfcltgrndagmntdgnss_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "guidancefacilitygroundaugmentedgnss_hjid", referencedColumnName = "hjid")})
    public GBASPropertyType getGuidanceFacilityGroundAugmentedGNSSItem() {
        return XmlAdapterUtils.unmarshallSource(GBASPropertyType.class, this.getGuidanceFacilityGroundAugmentedGNSS());
    }

    public void setGuidanceFacilityGroundAugmentedGNSSItem(GBASPropertyType target) {
        setGuidanceFacilityGroundAugmentedGNSS(XmlAdapterUtils.marshallJAXBElement(GBASPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "guidanceFacility_groundAugmentedGNSS"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SpecialNavigationSystemPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_gdncfcltspclnvgtnsstm_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "guidancefacilityspecialnavigationsystem_hjid", referencedColumnName = "hjid")})
    public SpecialNavigationSystemPropertyType getGuidanceFacilitySpecialNavigationSystemItem() {
        return XmlAdapterUtils.unmarshallSource(SpecialNavigationSystemPropertyType.class,
                this.getGuidanceFacilitySpecialNavigationSystem());
    }

    public void setGuidanceFacilitySpecialNavigationSystemItem(SpecialNavigationSystemPropertyType target) {
        setGuidanceFacilitySpecialNavigationSystem(
                XmlAdapterUtils.marshallJAXBElement(SpecialNavigationSystemPropertyType.class,
                        new QName("http://www.aixm.aero/schema/5.2", "guidanceFacility_specialNavigationSystem"),
                        StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RadarSystemPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_gdncfcltrdr_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "guidancefacilityradar_hjid", referencedColumnName = "hjid")})
    public RadarSystemPropertyType getGuidanceFacilityRadarItem() {
        return XmlAdapterUtils.unmarshallSource(RadarSystemPropertyType.class, this.getGuidanceFacilityRadar());
    }

    public void setGuidanceFacilityRadarItem(RadarSystemPropertyType target) {
        setGuidanceFacilityRadar(XmlAdapterUtils.marshallJAXBElement(RadarSystemPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "guidanceFacility_radar"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = NavaidPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_gdncfcltnvd_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "guidancefacilitynavaid_hjid", referencedColumnName = "hjid")})
    public NavaidPropertyType getGuidanceFacilityNavaidItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getGuidanceFacilityNavaid());
    }

    public void setGuidanceFacilityNavaidItem(NavaidPropertyType target) {
        setGuidanceFacilityNavaid(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "guidanceFacility_navaid"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = SatelliteSystemPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_gdncfcltstlltsrvc_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "guidancefacilitysatelliteservice_hjid", referencedColumnName = "hjid")})
    public SatelliteSystemPropertyType getGuidanceFacilitySatelliteServiceItem() {
        return XmlAdapterUtils.unmarshallSource(SatelliteSystemPropertyType.class,
                this.getGuidanceFacilitySatelliteService());
    }

    public void setGuidanceFacilitySatelliteServiceItem(SatelliteSystemPropertyType target) {
        setGuidanceFacilitySatelliteService(XmlAdapterUtils.marshallJAXBElement(SatelliteSystemPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "guidanceFacility_satelliteService"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "magneticvariation", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "magneticvariationnilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "magneticvariationaccuracy"))})
    public ValMagneticVariationType getMagneticVariationItem() {
        return XmlAdapterUtils.unmarshallSource(ValMagneticVariationType.class, this.getMagneticVariation());
    }

    public void setMagneticVariationItem(ValMagneticVariationType target) {
        setMagneticVariation(XmlAdapterUtils.marshallJAXBElement(ValMagneticVariationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "magneticVariation"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "datemagneticvariation", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "datemagneticvariationnilreason"))})
    public DateYearType getDateMagneticVariationItem() {
        return XmlAdapterUtils.unmarshallSource(DateYearType.class, this.getDateMagneticVariation());
    }

    public void setDateMagneticVariationItem(DateYearType target) {
        setDateMagneticVariation(XmlAdapterUtils.marshallJAXBElement(DateYearType.class,
                new QName("http://www.aixm.aero/schema/5.2", "dateMagneticVariation"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "additionalequipment")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "additionalequipmentnilreason"))})
    public CodeAdditionalEquipmentType getAdditionalEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAdditionalEquipmentType.class, this.getAdditionalEquipment());
    }

    public void setAdditionalEquipmentItem(CodeAdditionalEquipmentType target) {
        setAdditionalEquipment(XmlAdapterUtils.marshallJAXBElement(CodeAdditionalEquipmentType.class,
                new QName("http://www.aixm.aero/schema/5.2", "additionalEquipment"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "specialauthorisation")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "specialauthorisationnilreason"))})
    public CodeYesNoType getSpecialAuthorisationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialAuthorisation());
    }

    public void setSpecialAuthorisationItem(CodeYesNoType target) {
        setSpecialAuthorisation(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "specialAuthorisation"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 7)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public TextSIDSTARDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextSIDSTARDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextSIDSTARDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextSIDSTARDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "contingencyroute")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "contingencyroutenilreason"))})
    public CodeYesNoType getContingencyRouteItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getContingencyRoute());
    }

    public void setContingencyRouteItem(CodeYesNoType target) {
        setContingencyRoute(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class,
                new QName("http://www.aixm.aero/schema/5.2", "contingencyRoute"),
                StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = LandingTakeoffAreaCollectionPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stndrdinstrmntdprtrtmslctp_tkff_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "standardinstrumentdeparture_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "takeoff_hjid", referencedColumnName = "hjid")})
    public LandingTakeoffAreaCollectionPropertyType getTakeoffItem() {
        return XmlAdapterUtils.unmarshallSource(LandingTakeoffAreaCollectionPropertyType.class, this.getTakeoff());
    }

    public void setTakeoffItem(LandingTakeoffAreaCollectionPropertyType target) {
        setTakeoff(XmlAdapterUtils.marshallJAXBElement(LandingTakeoffAreaCollectionPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "takeoff"), StandardInstrumentDepartureTimeSliceType.class,
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
        final StandardInstrumentDepartureTimeSliceType that = ((StandardInstrumentDepartureTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<ProcedureAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<ProcedureAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability() ? that.getAvailability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
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
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator,
                    "guidanceFacilitySpecialNavigationSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator,
                    "guidanceFacilitySpecialNavigationSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignCriteria();
            boolean rhsFieldIsSet = that.isSetDesignCriteria();
            List<DesignStandardPropertyType> lhsField;
            lhsField = (this.isSetDesignCriteria() ? this.getDesignCriteria() : null);
            List<DesignStandardPropertyType> rhsField;
            rhsField = (that.isSetDesignCriteria() ? that.getDesignCriteria() : null);
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
            boolean lhsFieldIsSet = this.isSetGuidanceFacilityGroundAugmentedGNSS();
            boolean rhsFieldIsSet = that.isSetGuidanceFacilityGroundAugmentedGNSS();
            JAXBElement<GBASPropertyType> lhsField;
            lhsField = this.getGuidanceFacilityGroundAugmentedGNSS();
            JAXBElement<GBASPropertyType> rhsField;
            rhsField = that.getGuidanceFacilityGroundAugmentedGNSS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceFacilityGroundAugmentedGNSS",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceFacilityGroundAugmentedGNSS",
                    rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightTransition();
            boolean rhsFieldIsSet = that.isSetFlightTransition();
            List<ProcedureTransitionPropertyType> lhsField;
            lhsField = (this.isSetFlightTransition() ? this.getFlightTransition() : null);
            List<ProcedureTransitionPropertyType> rhsField;
            rhsField = (that.isSetFlightTransition() ? that.getFlightTransition() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightTransition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightTransition", rhsField);
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
            boolean lhsFieldIsSet = this.isSetGuidanceFacilitySatelliteService();
            boolean rhsFieldIsSet = that.isSetGuidanceFacilitySatelliteService();
            JAXBElement<SatelliteSystemPropertyType> lhsField;
            lhsField = this.getGuidanceFacilitySatelliteService();
            JAXBElement<SatelliteSystemPropertyType> rhsField;
            rhsField = that.getGuidanceFacilitySatelliteService();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "guidanceFacilitySatelliteService",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "guidanceFacilitySatelliteService",
                    rhsField);
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
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "communicationFailureInstruction",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "communicationFailureInstruction",
                    rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDateMagneticVariation();
            boolean rhsFieldIsSet = that.isSetDateMagneticVariation();
            JAXBElement<DateYearType> lhsField;
            lhsField = this.getDateMagneticVariation();
            JAXBElement<DateYearType> rhsField;
            rhsField = that.getDateMagneticVariation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateMagneticVariation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateMagneticVariation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAdditionalEquipment();
            boolean rhsFieldIsSet = that.isSetAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> lhsField;
            lhsField = this.getAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> rhsField;
            rhsField = that.getAdditionalEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "additionalEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "additionalEquipment", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<StandardInstrumentDepartureTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<StandardInstrumentDepartureTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMagneticVariation();
            boolean rhsFieldIsSet = that.isSetMagneticVariation();
            JAXBElement<ValMagneticVariationType> lhsField;
            lhsField = this.getMagneticVariation();
            JAXBElement<ValMagneticVariationType> rhsField;
            rhsField = that.getMagneticVariation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticVariation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticVariation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAirportHeliport();
            boolean rhsFieldIsSet = that.isSetAirportHeliport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetAirportHeliport() ? this.getAirportHeliport() : null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetAirportHeliport() ? that.getAirportHeliport() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "airportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "airportHeliport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCapability();
            boolean rhsFieldIsSet = that.isSetAircraftCapability();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCapability() ? this.getAircraftCapability() : null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCapability() ? that.getAircraftCapability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCapability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCapability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialAuthorisation();
            boolean rhsFieldIsSet = that.isSetSpecialAuthorisation();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSpecialAuthorisation();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSpecialAuthorisation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialAuthorisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialAuthorisation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSafeAltitude();
            boolean rhsFieldIsSet = that.isSetSafeAltitude();
            List<MinimumAltitudeAreaPropertyType> lhsField;
            lhsField = (this.isSetSafeAltitude() ? this.getSafeAltitude() : null);
            List<MinimumAltitudeAreaPropertyType> rhsField;
            rhsField = (that.isSetSafeAltitude() ? that.getSafeAltitude() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "safeAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "safeAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<TextSIDSTARDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextSIDSTARDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
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
            boolean lhsFieldIsSet = this.isSetContingencyRoute();
            boolean rhsFieldIsSet = that.isSetContingencyRoute();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getContingencyRoute();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getContingencyRoute();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contingencyRoute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contingencyRoute", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTakeoff();
            boolean rhsFieldIsSet = that.isSetTakeoff();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> lhsField;
            lhsField = this.getTakeoff();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> rhsField;
            rhsField = that.getTakeoff();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "takeoff", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "takeoff", rhsField);
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
            List<DesignStandardPropertyType> theField;
            theField = (this.isSetDesignCriteria() ? this.getDesignCriteria() : null);
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
            boolean theFieldIsSet = this.isSetAvailability();
            List<ProcedureAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport() ? this.getAirportHeliport() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightTransition();
            List<ProcedureTransitionPropertyType> theField;
            theField = (this.isSetFlightTransition() ? this.getFlightTransition() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightTransition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilityGroundAugmentedGNSS();
            JAXBElement<GBASPropertyType> theField;
            theField = this.getGuidanceFacilityGroundAugmentedGNSS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceFacilityGroundAugmentedGNSS",
                    theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilitySpecialNavigationSystem();
            JAXBElement<SpecialNavigationSystemPropertyType> theField;
            theField = this.getGuidanceFacilitySpecialNavigationSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceFacilitySpecialNavigationSystem",
                    theField);
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
            boolean theFieldIsSet = this.isSetGuidanceFacilitySatelliteService();
            JAXBElement<SatelliteSystemPropertyType> theField;
            theField = this.getGuidanceFacilitySatelliteService();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "guidanceFacilitySatelliteService",
                    theField);
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
            boolean theFieldIsSet = this.isSetSafeAltitude();
            List<MinimumAltitudeAreaPropertyType> theField;
            theField = (this.isSetSafeAltitude() ? this.getSafeAltitude() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "safeAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariation();
            JAXBElement<ValMagneticVariationType> theField;
            theField = this.getMagneticVariation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticVariation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateMagneticVariation();
            JAXBElement<DateYearType> theField;
            theField = this.getDateMagneticVariation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateMagneticVariation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> theField;
            theField = this.getAdditionalEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "additionalEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialAuthorisation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialAuthorisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialAuthorisation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCapability();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCapability() ? this.getAircraftCapability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCapability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextSIDSTARDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContingencyRoute();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getContingencyRoute();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contingencyRoute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTakeoff();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = this.getTakeoff();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "takeoff", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<StandardInstrumentDepartureTimeSliceExtensionType> theField;
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
            List<DesignStandardPropertyType> theField;
            theField = (this.isSetDesignCriteria() ? this.getDesignCriteria() : null);
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
            boolean theFieldIsSet = this.isSetAvailability();
            List<ProcedureAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport() ? this.getAirportHeliport() : null);
            strategy.appendField(locator, this, "airportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightTransition();
            List<ProcedureTransitionPropertyType> theField;
            theField = (this.isSetFlightTransition() ? this.getFlightTransition() : null);
            strategy.appendField(locator, this, "flightTransition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilityGroundAugmentedGNSS();
            JAXBElement<GBASPropertyType> theField;
            theField = this.getGuidanceFacilityGroundAugmentedGNSS();
            strategy.appendField(locator, this, "guidanceFacilityGroundAugmentedGNSS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGuidanceFacilitySpecialNavigationSystem();
            JAXBElement<SpecialNavigationSystemPropertyType> theField;
            theField = this.getGuidanceFacilitySpecialNavigationSystem();
            strategy.appendField(locator, this, "guidanceFacilitySpecialNavigationSystem", buffer, theField,
                    theFieldIsSet);
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
            boolean theFieldIsSet = this.isSetGuidanceFacilitySatelliteService();
            JAXBElement<SatelliteSystemPropertyType> theField;
            theField = this.getGuidanceFacilitySatelliteService();
            strategy.appendField(locator, this, "guidanceFacilitySatelliteService", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSafeAltitude();
            List<MinimumAltitudeAreaPropertyType> theField;
            theField = (this.isSetSafeAltitude() ? this.getSafeAltitude() : null);
            strategy.appendField(locator, this, "safeAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticVariation();
            JAXBElement<ValMagneticVariationType> theField;
            theField = this.getMagneticVariation();
            strategy.appendField(locator, this, "magneticVariation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDateMagneticVariation();
            JAXBElement<DateYearType> theField;
            theField = this.getDateMagneticVariation();
            strategy.appendField(locator, this, "dateMagneticVariation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAdditionalEquipment();
            JAXBElement<CodeAdditionalEquipmentType> theField;
            theField = this.getAdditionalEquipment();
            strategy.appendField(locator, this, "additionalEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialAuthorisation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialAuthorisation();
            strategy.appendField(locator, this, "specialAuthorisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCapability();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCapability() ? this.getAircraftCapability() : null);
            strategy.appendField(locator, this, "aircraftCapability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextSIDSTARDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContingencyRoute();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getContingencyRoute();
            strategy.appendField(locator, this, "contingencyRoute", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTakeoff();
            JAXBElement<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = this.getTakeoff();
            strategy.appendField(locator, this, "takeoff", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<StandardInstrumentDepartureTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
