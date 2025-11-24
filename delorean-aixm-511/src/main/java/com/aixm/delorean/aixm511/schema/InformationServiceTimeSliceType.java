
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
 * <p>Java class for InformationServiceTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InformationServiceTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}InformationServicePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractInformationServiceExtension"/>
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
@XmlType(name = "InformationServiceTimeSliceType", propOrder = {
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
    "type",
    "voice",
    "dataLink",
    "recorded",
    "navaidBroadcast",
    "clientAirspace",
    "clientAirport",
    "clientRoute",
    "clientProcedure",
    "clientHolding",
    "clientAerialRefuelling",
    "extension"
})
@Entity(name = "InformationServiceTimeSliceType")
@Table(name = "informationservice_ts", schema = "service")
public class InformationServiceTimeSliceType
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
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeServiceInformationType> type;
    @XmlElementRef(name = "voice", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> voice;
    @XmlElementRef(name = "dataLink", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dataLink;
    @XmlElementRef(name = "recorded", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> recorded;
    @XmlElement(nillable = true)
    protected List<VORPropertyType> navaidBroadcast;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> clientAirspace;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> clientAirport;
    @XmlElement(nillable = true)
    protected List<RoutePortionPropertyType> clientRoute;
    @XmlElement(nillable = true)
    protected List<ProcedurePropertyType> clientProcedure;
    @XmlElement(nillable = true)
    protected List<HoldingPatternPropertyType> clientHolding;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingPropertyType> clientAerialRefuelling;
    protected List<InformationServiceExtensionType> extension;

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
    @JoinTable(name = "call_sign_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "call-sign", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "radiocommunication_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "radiocommunication", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "groundcommunication_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "groundcommunication", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "availability_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
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
    @JoinTable(name = "annotation_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeServiceInformationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeServiceInformationType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeServiceInformationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeServiceInformationType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the voice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getVoice() {
        return voice;
    }

    /**
     * Sets the value of the voice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setVoice(JAXBElement<CodeYesNoType> value) {
        this.voice = value;
    }

    @Transient
    public boolean isSetVoice() {
        return (this.voice!= null);
    }

    /**
     * Gets the value of the dataLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getDataLink() {
        return dataLink;
    }

    /**
     * Sets the value of the dataLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDataLink(JAXBElement<CodeYesNoType> value) {
        this.dataLink = value;
    }

    @Transient
    public boolean isSetDataLink() {
        return (this.dataLink!= null);
    }

    /**
     * Gets the value of the recorded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getRecorded() {
        return recorded;
    }

    /**
     * Sets the value of the recorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRecorded(JAXBElement<CodeYesNoType> value) {
        this.recorded = value;
    }

    @Transient
    public boolean isSetRecorded() {
        return (this.recorded!= null);
    }

    /**
     * Gets the value of the navaidBroadcast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidBroadcast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidBroadcast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VORPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = VORPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "navaidbroadcast_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "navaidbroadcast", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<VORPropertyType> getNavaidBroadcast() {
        if (navaidBroadcast == null) {
            navaidBroadcast = new ArrayList<>();
        }
        return this.navaidBroadcast;
    }

    /**
     * 
     * 
     */
    public void setNavaidBroadcast(List<VORPropertyType> navaidBroadcast) {
        this.navaidBroadcast = navaidBroadcast;
    }

    @Transient
    public boolean isSetNavaidBroadcast() {
        return ((this.navaidBroadcast!= null)&&(!this.navaidBroadcast.isEmpty()));
    }

    public void unsetNavaidBroadcast() {
        this.navaidBroadcast = null;
    }

    /**
     * Gets the value of the clientAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAirspace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "clientairspace_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "clientairspace", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspacePropertyType> getClientAirspace() {
        if (clientAirspace == null) {
            clientAirspace = new ArrayList<>();
        }
        return this.clientAirspace;
    }

    /**
     * 
     * 
     */
    public void setClientAirspace(List<AirspacePropertyType> clientAirspace) {
        this.clientAirspace = clientAirspace;
    }

    @Transient
    public boolean isSetClientAirspace() {
        return ((this.clientAirspace!= null)&&(!this.clientAirspace.isEmpty()));
    }

    public void unsetClientAirspace() {
        this.clientAirspace = null;
    }

    /**
     * Gets the value of the clientAirport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAirport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAirport().add(newItem);
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
    @JoinTable(name = "clientairport_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "clientairport", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<AirportHeliportPropertyType> getClientAirport() {
        if (clientAirport == null) {
            clientAirport = new ArrayList<>();
        }
        return this.clientAirport;
    }

    /**
     * 
     * 
     */
    public void setClientAirport(List<AirportHeliportPropertyType> clientAirport) {
        this.clientAirport = clientAirport;
    }

    @Transient
    public boolean isSetClientAirport() {
        return ((this.clientAirport!= null)&&(!this.clientAirport.isEmpty()));
    }

    public void unsetClientAirport() {
        this.clientAirport = null;
    }

    /**
     * Gets the value of the clientRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePortionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RoutePortionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "clientroute_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "clientroute", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<RoutePortionPropertyType> getClientRoute() {
        if (clientRoute == null) {
            clientRoute = new ArrayList<>();
        }
        return this.clientRoute;
    }

    /**
     * 
     * 
     */
    public void setClientRoute(List<RoutePortionPropertyType> clientRoute) {
        this.clientRoute = clientRoute;
    }

    @Transient
    public boolean isSetClientRoute() {
        return ((this.clientRoute!= null)&&(!this.clientRoute.isEmpty()));
    }

    public void unsetClientRoute() {
        this.clientRoute = null;
    }

    /**
     * Gets the value of the clientProcedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientProcedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ProcedurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "clientprocedure_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "clientprocedure", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<ProcedurePropertyType> getClientProcedure() {
        if (clientProcedure == null) {
            clientProcedure = new ArrayList<>();
        }
        return this.clientProcedure;
    }

    /**
     * 
     * 
     */
    public void setClientProcedure(List<ProcedurePropertyType> clientProcedure) {
        this.clientProcedure = clientProcedure;
    }

    @Transient
    public boolean isSetClientProcedure() {
        return ((this.clientProcedure!= null)&&(!this.clientProcedure.isEmpty()));
    }

    public void unsetClientProcedure() {
        this.clientProcedure = null;
    }

    /**
     * Gets the value of the clientHolding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientHolding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientHolding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingPatternPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = HoldingPatternPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "clientholding_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "clientholding", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<HoldingPatternPropertyType> getClientHolding() {
        if (clientHolding == null) {
            clientHolding = new ArrayList<>();
        }
        return this.clientHolding;
    }

    /**
     * 
     * 
     */
    public void setClientHolding(List<HoldingPatternPropertyType> clientHolding) {
        this.clientHolding = clientHolding;
    }

    @Transient
    public boolean isSetClientHolding() {
        return ((this.clientHolding!= null)&&(!this.clientHolding.isEmpty()));
    }

    public void unsetClientHolding() {
        this.clientHolding = null;
    }

    /**
     * Gets the value of the clientAerialRefuelling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAerialRefuelling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAerialRefuelling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AerialRefuellingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "clientaerialrefuelling_informationservice_link", schema = "service", joinColumns = {
        @JoinColumn(name = "clientaerialrefuelling", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "informationservicepropertygroup", referencedColumnName = "hjid")
    })
    public List<AerialRefuellingPropertyType> getClientAerialRefuelling() {
        if (clientAerialRefuelling == null) {
            clientAerialRefuelling = new ArrayList<>();
        }
        return this.clientAerialRefuelling;
    }

    /**
     * 
     * 
     */
    public void setClientAerialRefuelling(List<AerialRefuellingPropertyType> clientAerialRefuelling) {
        this.clientAerialRefuelling = clientAerialRefuelling;
    }

    @Transient
    public boolean isSetClientAerialRefuelling() {
        return ((this.clientAerialRefuelling!= null)&&(!this.clientAerialRefuelling.isEmpty()));
    }

    public void unsetClientAerialRefuelling() {
        this.clientAerialRefuelling = null;
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
     * {@link InformationServiceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = InformationServiceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<InformationServiceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<InformationServiceExtensionType> extension) {
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
        setFlightOperations(XmlAdapterUtils.marshallJAXBElement(CodeFlightDestinationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightOperations"), InformationServiceTimeSliceType.class, target));
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
        setRank(XmlAdapterUtils.marshallJAXBElement(CodeFacilityRankingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "rank"), InformationServiceTimeSliceType.class, target));
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
        setCompliantICAO(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "compliantICAO"), InformationServiceTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), InformationServiceTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), InformationServiceTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = UnitPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "serviceprovider_id", referencedColumnName = "hjid")
    public UnitPropertyType getServiceProviderItem() {
        return XmlAdapterUtils.unmarshallSource(UnitPropertyType.class, this.getServiceProvider());
    }

    public void setServiceProviderItem(UnitPropertyType target) {
        setServiceProvider(XmlAdapterUtils.marshallJAXBElement(UnitPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "serviceProvider"), InformationServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeServiceInformationType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeServiceInformationType.class, this.getType());
    }

    public void setTypeItem(CodeServiceInformationType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeServiceInformationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), InformationServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "voice")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "voice_nilreason"))
    })
    public CodeYesNoType getVoiceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getVoice());
    }

    public void setVoiceItem(CodeYesNoType target) {
        setVoice(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "voice"), InformationServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "datalink")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "datalink_nilreason"))
    })
    public CodeYesNoType getDataLinkItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDataLink());
    }

    public void setDataLinkItem(CodeYesNoType target) {
        setDataLink(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dataLink"), InformationServiceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "recorded")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "recorded_nilreason"))
    })
    public CodeYesNoType getRecordedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getRecorded());
    }

    public void setRecordedItem(CodeYesNoType target) {
        setRecorded(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "recorded"), InformationServiceTimeSliceType.class, target));
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
        final InformationServiceTimeSliceType that = ((InformationServiceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetClientAirport();
            boolean rhsFieldIsSet = that.isSetClientAirport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetClientAirport()?this.getClientAirport():null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetClientAirport()?that.getClientAirport():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clientAirport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clientAirport", rhsField);
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
            boolean lhsFieldIsSet = this.isSetClientProcedure();
            boolean rhsFieldIsSet = that.isSetClientProcedure();
            List<ProcedurePropertyType> lhsField;
            lhsField = (this.isSetClientProcedure()?this.getClientProcedure():null);
            List<ProcedurePropertyType> rhsField;
            rhsField = (that.isSetClientProcedure()?that.getClientProcedure():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clientProcedure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clientProcedure", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDataLink();
            boolean rhsFieldIsSet = that.isSetDataLink();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getDataLink();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getDataLink();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataLink", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataLink", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<InformationServiceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<InformationServiceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVoice();
            boolean rhsFieldIsSet = that.isSetVoice();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getVoice();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getVoice();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "voice", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "voice", rhsField);
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
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeServiceInformationType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeServiceInformationType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavaidBroadcast();
            boolean rhsFieldIsSet = that.isSetNavaidBroadcast();
            List<VORPropertyType> lhsField;
            lhsField = (this.isSetNavaidBroadcast()?this.getNavaidBroadcast():null);
            List<VORPropertyType> rhsField;
            rhsField = (that.isSetNavaidBroadcast()?that.getNavaidBroadcast():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidBroadcast", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidBroadcast", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetClientAirspace();
            boolean rhsFieldIsSet = that.isSetClientAirspace();
            List<AirspacePropertyType> lhsField;
            lhsField = (this.isSetClientAirspace()?this.getClientAirspace():null);
            List<AirspacePropertyType> rhsField;
            rhsField = (that.isSetClientAirspace()?that.getClientAirspace():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clientAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clientAirspace", rhsField);
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
            boolean lhsFieldIsSet = this.isSetClientHolding();
            boolean rhsFieldIsSet = that.isSetClientHolding();
            List<HoldingPatternPropertyType> lhsField;
            lhsField = (this.isSetClientHolding()?this.getClientHolding():null);
            List<HoldingPatternPropertyType> rhsField;
            rhsField = (that.isSetClientHolding()?that.getClientHolding():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clientHolding", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clientHolding", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRecorded();
            boolean rhsFieldIsSet = that.isSetRecorded();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getRecorded();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getRecorded();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "recorded", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "recorded", rhsField);
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
            boolean lhsFieldIsSet = this.isSetClientAerialRefuelling();
            boolean rhsFieldIsSet = that.isSetClientAerialRefuelling();
            List<AerialRefuellingPropertyType> lhsField;
            lhsField = (this.isSetClientAerialRefuelling()?this.getClientAerialRefuelling():null);
            List<AerialRefuellingPropertyType> rhsField;
            rhsField = (that.isSetClientAerialRefuelling()?that.getClientAerialRefuelling():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clientAerialRefuelling", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clientAerialRefuelling", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClientRoute();
            boolean rhsFieldIsSet = that.isSetClientRoute();
            List<RoutePortionPropertyType> lhsField;
            lhsField = (this.isSetClientRoute()?this.getClientRoute():null);
            List<RoutePortionPropertyType> rhsField;
            rhsField = (that.isSetClientRoute()?that.getClientRoute():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clientRoute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clientRoute", rhsField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeServiceInformationType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVoice();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getVoice();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "voice", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataLink();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDataLink();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataLink", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRecorded();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRecorded();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "recorded", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidBroadcast();
            List<VORPropertyType> theField;
            theField = (this.isSetNavaidBroadcast()?this.getNavaidBroadcast():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidBroadcast", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetClientAirspace()?this.getClientAirspace():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clientAirspace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientAirport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetClientAirport()?this.getClientAirport():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clientAirport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientRoute();
            List<RoutePortionPropertyType> theField;
            theField = (this.isSetClientRoute()?this.getClientRoute():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clientRoute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientProcedure();
            List<ProcedurePropertyType> theField;
            theField = (this.isSetClientProcedure()?this.getClientProcedure():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clientProcedure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientHolding();
            List<HoldingPatternPropertyType> theField;
            theField = (this.isSetClientHolding()?this.getClientHolding():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clientHolding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientAerialRefuelling();
            List<AerialRefuellingPropertyType> theField;
            theField = (this.isSetClientAerialRefuelling()?this.getClientAerialRefuelling():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clientAerialRefuelling", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<InformationServiceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeServiceInformationType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVoice();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getVoice();
            strategy.appendField(locator, this, "voice", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataLink();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDataLink();
            strategy.appendField(locator, this, "dataLink", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRecorded();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getRecorded();
            strategy.appendField(locator, this, "recorded", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidBroadcast();
            List<VORPropertyType> theField;
            theField = (this.isSetNavaidBroadcast()?this.getNavaidBroadcast():null);
            strategy.appendField(locator, this, "navaidBroadcast", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetClientAirspace()?this.getClientAirspace():null);
            strategy.appendField(locator, this, "clientAirspace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientAirport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetClientAirport()?this.getClientAirport():null);
            strategy.appendField(locator, this, "clientAirport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientRoute();
            List<RoutePortionPropertyType> theField;
            theField = (this.isSetClientRoute()?this.getClientRoute():null);
            strategy.appendField(locator, this, "clientRoute", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientProcedure();
            List<ProcedurePropertyType> theField;
            theField = (this.isSetClientProcedure()?this.getClientProcedure():null);
            strategy.appendField(locator, this, "clientProcedure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientHolding();
            List<HoldingPatternPropertyType> theField;
            theField = (this.isSetClientHolding()?this.getClientHolding():null);
            strategy.appendField(locator, this, "clientHolding", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClientAerialRefuelling();
            List<AerialRefuellingPropertyType> theField;
            theField = (this.isSetClientAerialRefuelling()?this.getClientAerialRefuelling():null);
            strategy.appendField(locator, this, "clientAerialRefuelling", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<InformationServiceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
