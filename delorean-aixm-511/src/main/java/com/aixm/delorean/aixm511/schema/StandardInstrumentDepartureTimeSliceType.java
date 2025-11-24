
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
 * <p>Java class for StandardInstrumentDepartureTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StandardInstrumentDepartureTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}StandardInstrumentDeparturePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractStandardInstrumentDepartureExtension"/>
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
@XmlType(name = "StandardInstrumentDepartureTimeSliceType", propOrder = {
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
    "designator",
    "contingencyRoute",
    "takeoff",
    "extension"
})
@Entity(name = "StandardInstrumentDepartureTimeSliceType")
@Table(name = "standardinstrumentdeparture_ts", schema = "procedure")
public class StandardInstrumentDepartureTimeSliceType
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
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextSIDSTARDesignatorType> designator;
    @XmlElementRef(name = "contingencyRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> contingencyRoute;
    @XmlElementRef(name = "takeoff", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> takeoff;
    protected List<StandardInstrumentDepartureExtensionType> extension;

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
    @JoinTable(name = "availability_standardinstrumentdeparture_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardinstrumentdeparturepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "airportheliport_standardinstrumentdeparture_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "airportheliport", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardinstrumentdeparturepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "aircraftcharacteristic_standardinstrumentdeparture_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "aircraftcharacteristic", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardinstrumentdeparturepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "flighttransition_standardinstrumentdeparture_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "flighttransition", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardinstrumentdeparturepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "annotation_standardinstrumentdeparture_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardinstrumentdeparturepropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextSIDSTARDesignatorType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextSIDSTARDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextSIDSTARDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the contingencyRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setContingencyRoute(JAXBElement<CodeYesNoType> value) {
        this.contingencyRoute = value;
    }

    @Transient
    public boolean isSetContingencyRoute() {
        return (this.contingencyRoute!= null);
    }

    /**
     * Gets the value of the takeoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public void setTakeoff(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.takeoff = value;
    }

    @Transient
    public boolean isSetTakeoff() {
        return (this.takeoff!= null);
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
     * {@link StandardInstrumentDepartureExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = StandardInstrumentDepartureExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<StandardInstrumentDepartureExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<StandardInstrumentDepartureExtensionType> extension) {
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
        setCommunicationFailureInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "communicationFailureInstruction"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        setInstruction(XmlAdapterUtils.marshallJAXBElement(TextInstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "instruction"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        setDesignCriteria(XmlAdapterUtils.marshallJAXBElement(CodeDesignStandardType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designCriteria"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        setCodingStandard(XmlAdapterUtils.marshallJAXBElement(CodeProcedureCodingStandardType.class, new QName("http://www.aixm.aero/schema/5.1.1", "codingStandard"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightChecked"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        setRNAV(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "RNAV"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SpecialNavigationSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancefacility_specialnavigationsystem_id", referencedColumnName = "hjid")
    public SpecialNavigationSystemPropertyType getGuidanceFacilitySpecialNavigationSystemItem() {
        return XmlAdapterUtils.unmarshallSource(SpecialNavigationSystemPropertyType.class, this.getGuidanceFacilitySpecialNavigationSystem());
    }

    public void setGuidanceFacilitySpecialNavigationSystemItem(SpecialNavigationSystemPropertyType target) {
        setGuidanceFacilitySpecialNavigationSystem(XmlAdapterUtils.marshallJAXBElement(SpecialNavigationSystemPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceFacility_specialNavigationSystem"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RadarSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancefacility_radar_id", referencedColumnName = "hjid")
    public RadarSystemPropertyType getGuidanceFacilityRadarItem() {
        return XmlAdapterUtils.unmarshallSource(RadarSystemPropertyType.class, this.getGuidanceFacilityRadar());
    }

    public void setGuidanceFacilityRadarItem(RadarSystemPropertyType target) {
        setGuidanceFacilityRadar(XmlAdapterUtils.marshallJAXBElement(RadarSystemPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceFacility_radar"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancefacility_navaid_id", referencedColumnName = "hjid")
    public NavaidPropertyType getGuidanceFacilityNavaidItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getGuidanceFacilityNavaid());
    }

    public void setGuidanceFacilityNavaidItem(NavaidPropertyType target) {
        setGuidanceFacilityNavaid(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "guidanceFacility_navaid"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SafeAltitudeAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "safealtitude_id", referencedColumnName = "hjid")
    public SafeAltitudeAreaPropertyType getSafeAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(SafeAltitudeAreaPropertyType.class, this.getSafeAltitude());
    }

    public void setSafeAltitudeItem(SafeAltitudeAreaPropertyType target) {
        setSafeAltitude(XmlAdapterUtils.marshallJAXBElement(SafeAltitudeAreaPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "safeAltitude"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public TextSIDSTARDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextSIDSTARDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextSIDSTARDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextSIDSTARDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "contingencyroute")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "contingencyroute_nilreason"))
    })
    public CodeYesNoType getContingencyRouteItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getContingencyRoute());
    }

    public void setContingencyRouteItem(CodeYesNoType target) {
        setContingencyRoute(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "contingencyRoute"), StandardInstrumentDepartureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = LandingTakeoffAreaCollectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "takeoff_id", referencedColumnName = "hjid")
    public LandingTakeoffAreaCollectionPropertyType getTakeoffItem() {
        return XmlAdapterUtils.unmarshallSource(LandingTakeoffAreaCollectionPropertyType.class, this.getTakeoff());
    }

    public void setTakeoffItem(LandingTakeoffAreaCollectionPropertyType target) {
        setTakeoff(XmlAdapterUtils.marshallJAXBElement(LandingTakeoffAreaCollectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "takeoff"), StandardInstrumentDepartureTimeSliceType.class, target));
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
        final StandardInstrumentDepartureTimeSliceType that = ((StandardInstrumentDepartureTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<StandardInstrumentDepartureExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<StandardInstrumentDepartureExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            List<StandardInstrumentDepartureExtensionType> theField;
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
            List<StandardInstrumentDepartureExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
