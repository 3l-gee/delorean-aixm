
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
 * <p>Java class for AirportSuppliesServiceTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirportSuppliesServiceTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AirportSuppliesServicePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirportSuppliesServiceExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirportGroundServiceExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractServiceExtension"/>
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
@XmlType(name = "AirportSuppliesServiceTimeSliceType", propOrder = {
    "flightOperations",
    "rank",
    "compliantICAO",
    "aixmName",
    "location",
    "serviceProvider",
    "callSign",
    "radioCommunication",
    "groundCommunication",
    "availability",
    "annotation",
    "airportHeliport",
    "fuelSupply",
    "oilSupply",
    "nitrogenSupply",
    "oxygenSupply",
    "extension"
})
@Entity(name = "AirportSuppliesServiceTimeSliceType")
@Table(name = "airportsuppliesservice_ts", schema = "service")
public class AirportSuppliesServiceTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "flightOperations", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightDestinationType> flightOperations;
    @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFacilityRankingType> rank;
    @XmlElementRef(name = "compliantICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> compliantICAO;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElementRef(name = "serviceProvider", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitPropertyType> serviceProvider;
    @XmlElement(name = "call-sign", nillable = true)
    protected List<CallsignDetailPropertyType> callSign;
    @XmlElement(nillable = true)
    protected List<RadioCommunicationChannelPropertyType> radioCommunication;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> groundCommunication;
    @XmlElement(nillable = true)
    protected List<ServiceOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(nillable = true)
    protected List<FuelPropertyType> fuelSupply;
    @XmlElement(nillable = true)
    protected List<OilPropertyType> oilSupply;
    @XmlElement(nillable = true)
    protected List<NitrogenPropertyType> nitrogenSupply;
    @XmlElement(nillable = true)
    protected List<OxygenPropertyType> oxygenSupply;
    protected List<AirportSuppliesServiceExtensionType> extension;

    /**
     * Gets the value of the flightOperations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightDestinationType> getFlightOperations() {
        return flightOperations;
    }

    /**
     * Sets the value of the flightOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     *     
     */
    public void setFlightOperations(JAXBElement<CodeFlightDestinationType> value) {
        this.flightOperations = value;
    }

    @Transient
    public boolean isSetFlightOperations() {
        return (this.flightOperations!= null);
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
     *     
     */
    public void setRank(JAXBElement<CodeFacilityRankingType> value) {
        this.rank = value;
    }

    @Transient
    public boolean isSetRank() {
        return (this.rank!= null);
    }

    /**
     * Gets the value of the compliantICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getCompliantICAO() {
        return compliantICAO;
    }

    /**
     * Sets the value of the compliantICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCompliantICAO(JAXBElement<CodeYesNoType> value) {
        this.compliantICAO = value;
    }

    @Transient
    public boolean isSetCompliantICAO() {
        return (this.compliantICAO!= null);
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<UnitPropertyType> getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public void setServiceProvider(JAXBElement<UnitPropertyType> value) {
        this.serviceProvider = value;
    }

    @Transient
    public boolean isSetServiceProvider() {
        return (this.serviceProvider!= null);
    }

    /**
     * Gets the value of the callSign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callSign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallSign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallsignDetailPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = CallsignDetailPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "call_sign_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "call-sign", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<CallsignDetailPropertyType> getCallSign() {
        if (callSign == null) {
            callSign = new ArrayList<>();
        }
        return this.callSign;
    }

    /**
     * 
     * 
     */
    public void setCallSign(List<CallsignDetailPropertyType> callSign) {
        this.callSign = callSign;
    }

    @Transient
    public boolean isSetCallSign() {
        return ((this.callSign!= null)&&(!this.callSign.isEmpty()));
    }

    public void unsetCallSign() {
        this.callSign = null;
    }

    /**
     * Gets the value of the radioCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadioCommunicationChannelPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RadioCommunicationChannelPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "radiocommunication_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "radiocommunication", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<RadioCommunicationChannelPropertyType> getRadioCommunication() {
        if (radioCommunication == null) {
            radioCommunication = new ArrayList<>();
        }
        return this.radioCommunication;
    }

    /**
     * 
     * 
     */
    public void setRadioCommunication(List<RadioCommunicationChannelPropertyType> radioCommunication) {
        this.radioCommunication = radioCommunication;
    }

    @Transient
    public boolean isSetRadioCommunication() {
        return ((this.radioCommunication!= null)&&(!this.radioCommunication.isEmpty()));
    }

    public void unsetRadioCommunication() {
        this.radioCommunication = null;
    }

    /**
     * Gets the value of the groundCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ContactInformationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "groundcommunication_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "groundcommunication", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<ContactInformationPropertyType> getGroundCommunication() {
        if (groundCommunication == null) {
            groundCommunication = new ArrayList<>();
        }
        return this.groundCommunication;
    }

    /**
     * 
     * 
     */
    public void setGroundCommunication(List<ContactInformationPropertyType> groundCommunication) {
        this.groundCommunication = groundCommunication;
    }

    @Transient
    public boolean isSetGroundCommunication() {
        return ((this.groundCommunication!= null)&&(!this.groundCommunication.isEmpty()));
    }

    public void unsetGroundCommunication() {
        this.groundCommunication = null;
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
     * {@link ServiceOperationalStatusPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ServiceOperationalStatusPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<ServiceOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<ServiceOperationalStatusPropertyType> availability) {
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
    @JoinTable(name = "annotation_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "airportheliport_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "airportheliport", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the fuelSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuelSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = FuelPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "fuelsupply_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "fuelsupply", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<FuelPropertyType> getFuelSupply() {
        if (fuelSupply == null) {
            fuelSupply = new ArrayList<>();
        }
        return this.fuelSupply;
    }

    /**
     * 
     * 
     */
    public void setFuelSupply(List<FuelPropertyType> fuelSupply) {
        this.fuelSupply = fuelSupply;
    }

    @Transient
    public boolean isSetFuelSupply() {
        return ((this.fuelSupply!= null)&&(!this.fuelSupply.isEmpty()));
    }

    public void unsetFuelSupply() {
        this.fuelSupply = null;
    }

    /**
     * Gets the value of the oilSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oilSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOilSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OilPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OilPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "oilsupply_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "oilsupply", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<OilPropertyType> getOilSupply() {
        if (oilSupply == null) {
            oilSupply = new ArrayList<>();
        }
        return this.oilSupply;
    }

    /**
     * 
     * 
     */
    public void setOilSupply(List<OilPropertyType> oilSupply) {
        this.oilSupply = oilSupply;
    }

    @Transient
    public boolean isSetOilSupply() {
        return ((this.oilSupply!= null)&&(!this.oilSupply.isEmpty()));
    }

    public void unsetOilSupply() {
        this.oilSupply = null;
    }

    /**
     * Gets the value of the nitrogenSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nitrogenSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNitrogenSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NitrogenPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NitrogenPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "nitrogensupply_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "nitrogensupply", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<NitrogenPropertyType> getNitrogenSupply() {
        if (nitrogenSupply == null) {
            nitrogenSupply = new ArrayList<>();
        }
        return this.nitrogenSupply;
    }

    /**
     * 
     * 
     */
    public void setNitrogenSupply(List<NitrogenPropertyType> nitrogenSupply) {
        this.nitrogenSupply = nitrogenSupply;
    }

    @Transient
    public boolean isSetNitrogenSupply() {
        return ((this.nitrogenSupply!= null)&&(!this.nitrogenSupply.isEmpty()));
    }

    public void unsetNitrogenSupply() {
        this.nitrogenSupply = null;
    }

    /**
     * Gets the value of the oxygenSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oxygenSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOxygenSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OxygenPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OxygenPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "oxygensupply_airportsuppliesservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "oxygensupply", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airportsuppliesservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<OxygenPropertyType> getOxygenSupply() {
        if (oxygenSupply == null) {
            oxygenSupply = new ArrayList<>();
        }
        return this.oxygenSupply;
    }

    /**
     * 
     * 
     */
    public void setOxygenSupply(List<OxygenPropertyType> oxygenSupply) {
        this.oxygenSupply = oxygenSupply;
    }

    @Transient
    public boolean isSetOxygenSupply() {
        return ((this.oxygenSupply!= null)&&(!this.oxygenSupply.isEmpty()));
    }

    public void unsetOxygenSupply() {
        this.oxygenSupply = null;
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
     * {@link AirportSuppliesServiceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AirportSuppliesServiceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AIRPORT_SUPPLIES_S_0")
    public List<AirportSuppliesServiceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AirportSuppliesServiceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "flightoperations")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flightoperations_nilreason"))
    })
    public CodeFlightDestinationType getFlightOperationsItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightDestinationType.class, this.getFlightOperations());
    }

    public void setFlightOperationsItem(CodeFlightDestinationType target) {
        setFlightOperations(XmlAdapterUtils.marshallJAXBElement(CodeFlightDestinationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightOperations"), AirportSuppliesServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "rank")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "rank_nilreason"))
    })
    public CodeFacilityRankingType getRankItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFacilityRankingType.class, this.getRank());
    }

    public void setRankItem(CodeFacilityRankingType target) {
        setRank(XmlAdapterUtils.marshallJAXBElement(CodeFacilityRankingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "rank"), AirportSuppliesServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "complianticao")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "complianticao_nilreason"))
    })
    public CodeYesNoType getCompliantICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getCompliantICAO());
    }

    public void setCompliantICAOItem(CodeYesNoType target) {
        setCompliantICAO(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "compliantICAO"), AirportSuppliesServiceTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), AirportSuppliesServiceTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), AirportSuppliesServiceTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = UnitPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "serviceprovider_id", referencedColumnName = "hjid")
    public UnitPropertyType getServiceProviderItem() {
        return XmlAdapterUtils.unmarshallSource(UnitPropertyType.class, this.getServiceProvider());
    }

    public void setServiceProviderItem(UnitPropertyType target) {
        setServiceProvider(XmlAdapterUtils.marshallJAXBElement(UnitPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "serviceProvider"), AirportSuppliesServiceTimeSliceType.class, target));
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
        final AirportSuppliesServiceTimeSliceType that = ((AirportSuppliesServiceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetCallSign();
            boolean rhsFieldIsSet = that.isSetCallSign();
            List<CallsignDetailPropertyType> lhsField;
            lhsField = (this.isSetCallSign()?this.getCallSign():null);
            List<CallsignDetailPropertyType> rhsField;
            rhsField = (that.isSetCallSign()?that.getCallSign():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "callSign", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "callSign", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadioCommunication();
            boolean rhsFieldIsSet = that.isSetRadioCommunication();
            List<RadioCommunicationChannelPropertyType> lhsField;
            lhsField = (this.isSetRadioCommunication()?this.getRadioCommunication():null);
            List<RadioCommunicationChannelPropertyType> rhsField;
            rhsField = (that.isSetRadioCommunication()?that.getRadioCommunication():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radioCommunication", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radioCommunication", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFuelSupply();
            boolean rhsFieldIsSet = that.isSetFuelSupply();
            List<FuelPropertyType> lhsField;
            lhsField = (this.isSetFuelSupply()?this.getFuelSupply():null);
            List<FuelPropertyType> rhsField;
            rhsField = (that.isSetFuelSupply()?that.getFuelSupply():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fuelSupply", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fuelSupply", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGroundCommunication();
            boolean rhsFieldIsSet = that.isSetGroundCommunication();
            List<ContactInformationPropertyType> lhsField;
            lhsField = (this.isSetGroundCommunication()?this.getGroundCommunication():null);
            List<ContactInformationPropertyType> rhsField;
            rhsField = (that.isSetGroundCommunication()?that.getGroundCommunication():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "groundCommunication", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "groundCommunication", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNitrogenSupply();
            boolean rhsFieldIsSet = that.isSetNitrogenSupply();
            List<NitrogenPropertyType> lhsField;
            lhsField = (this.isSetNitrogenSupply()?this.getNitrogenSupply():null);
            List<NitrogenPropertyType> rhsField;
            rhsField = (that.isSetNitrogenSupply()?that.getNitrogenSupply():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nitrogenSupply", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nitrogenSupply", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<ServiceOperationalStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<ServiceOperationalStatusPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
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
            boolean lhsFieldIsSet = this.isSetOxygenSupply();
            boolean rhsFieldIsSet = that.isSetOxygenSupply();
            List<OxygenPropertyType> lhsField;
            lhsField = (this.isSetOxygenSupply()?this.getOxygenSupply():null);
            List<OxygenPropertyType> rhsField;
            rhsField = (that.isSetOxygenSupply()?that.getOxygenSupply():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "oxygenSupply", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "oxygenSupply", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCompliantICAO();
            boolean rhsFieldIsSet = that.isSetCompliantICAO();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getCompliantICAO();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getCompliantICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "compliantICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "compliantICAO", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOilSupply();
            boolean rhsFieldIsSet = that.isSetOilSupply();
            List<OilPropertyType> lhsField;
            lhsField = (this.isSetOilSupply()?this.getOilSupply():null);
            List<OilPropertyType> rhsField;
            rhsField = (that.isSetOilSupply()?that.getOilSupply():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "oilSupply", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "oilSupply", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AirportSuppliesServiceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AirportSuppliesServiceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
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
            boolean lhsFieldIsSet = this.isSetServiceProvider();
            boolean rhsFieldIsSet = that.isSetServiceProvider();
            JAXBElement<UnitPropertyType> lhsField;
            lhsField = this.getServiceProvider();
            JAXBElement<UnitPropertyType> rhsField;
            rhsField = that.getServiceProvider();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serviceProvider", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serviceProvider", rhsField);
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
            boolean lhsFieldIsSet = this.isSetFlightOperations();
            boolean rhsFieldIsSet = that.isSetFlightOperations();
            JAXBElement<CodeFlightDestinationType> lhsField;
            lhsField = this.getFlightOperations();
            JAXBElement<CodeFlightDestinationType> rhsField;
            rhsField = that.getFlightOperations();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightOperations", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightOperations", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightOperations();
            JAXBElement<CodeFlightDestinationType> theField;
            theField = this.getFlightOperations();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightOperations", theField);
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
            boolean theFieldIsSet = this.isSetCompliantICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCompliantICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "compliantICAO", theField);
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
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceProvider();
            JAXBElement<UnitPropertyType> theField;
            theField = this.getServiceProvider();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serviceProvider", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCallSign();
            List<CallsignDetailPropertyType> theField;
            theField = (this.isSetCallSign()?this.getCallSign():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "callSign", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioCommunication();
            List<RadioCommunicationChannelPropertyType> theField;
            theField = (this.isSetRadioCommunication()?this.getRadioCommunication():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radioCommunication", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroundCommunication();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetGroundCommunication()?this.getGroundCommunication():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "groundCommunication", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ServiceOperationalStatusPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport()?this.getAirportHeliport():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "airportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFuelSupply();
            List<FuelPropertyType> theField;
            theField = (this.isSetFuelSupply()?this.getFuelSupply():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fuelSupply", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOilSupply();
            List<OilPropertyType> theField;
            theField = (this.isSetOilSupply()?this.getOilSupply():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "oilSupply", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNitrogenSupply();
            List<NitrogenPropertyType> theField;
            theField = (this.isSetNitrogenSupply()?this.getNitrogenSupply():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nitrogenSupply", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOxygenSupply();
            List<OxygenPropertyType> theField;
            theField = (this.isSetOxygenSupply()?this.getOxygenSupply():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "oxygenSupply", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirportSuppliesServiceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFlightOperations();
            JAXBElement<CodeFlightDestinationType> theField;
            theField = this.getFlightOperations();
            strategy.appendField(locator, this, "flightOperations", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRank();
            JAXBElement<CodeFacilityRankingType> theField;
            theField = this.getRank();
            strategy.appendField(locator, this, "rank", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCompliantICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCompliantICAO();
            strategy.appendField(locator, this, "compliantICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceProvider();
            JAXBElement<UnitPropertyType> theField;
            theField = this.getServiceProvider();
            strategy.appendField(locator, this, "serviceProvider", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCallSign();
            List<CallsignDetailPropertyType> theField;
            theField = (this.isSetCallSign()?this.getCallSign():null);
            strategy.appendField(locator, this, "callSign", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioCommunication();
            List<RadioCommunicationChannelPropertyType> theField;
            theField = (this.isSetRadioCommunication()?this.getRadioCommunication():null);
            strategy.appendField(locator, this, "radioCommunication", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroundCommunication();
            List<ContactInformationPropertyType> theField;
            theField = (this.isSetGroundCommunication()?this.getGroundCommunication():null);
            strategy.appendField(locator, this, "groundCommunication", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<ServiceOperationalStatusPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAirportHeliport()?this.getAirportHeliport():null);
            strategy.appendField(locator, this, "airportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFuelSupply();
            List<FuelPropertyType> theField;
            theField = (this.isSetFuelSupply()?this.getFuelSupply():null);
            strategy.appendField(locator, this, "fuelSupply", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOilSupply();
            List<OilPropertyType> theField;
            theField = (this.isSetOilSupply()?this.getOilSupply():null);
            strategy.appendField(locator, this, "oilSupply", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNitrogenSupply();
            List<NitrogenPropertyType> theField;
            theField = (this.isSetNitrogenSupply()?this.getNitrogenSupply():null);
            strategy.appendField(locator, this, "nitrogenSupply", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOxygenSupply();
            List<OxygenPropertyType> theField;
            theField = (this.isSetOxygenSupply()?this.getOxygenSupply():null);
            strategy.appendField(locator, this, "oxygenSupply", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirportSuppliesServiceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
