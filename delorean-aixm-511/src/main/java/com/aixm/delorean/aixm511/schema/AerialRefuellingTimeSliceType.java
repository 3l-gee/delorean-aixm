
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
 * <p>Java class for AerialRefuellingTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AerialRefuellingTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AerialRefuellingPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAerialRefuellingExtension"/>
 *                 </sequence>
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
@XmlType(name = "AerialRefuellingTimeSliceType", propOrder = {
    "designatorPrefix",
    "designatorNumber",
    "designatorSuffix",
    "designatorDirection",
    "aixmName",
    "type",
    "radarBeaconSetting",
    "xbandRadarSetting",
    "tankerChannel",
    "receiverChannel",
    "helicopterRoute",
    "specialRefuelling",
    "bidirectionalUse",
    "reverseDirectionTurn",
    "availability",
    "protectingAirspace",
    "track",
    "anchor",
    "oppositeTrack",
    "managingOrganisation",
    "annotation",
    "extension"
})
@Entity(name = "AerialRefuellingTimeSliceType")
@Table(name = "aerialrefuelling_ts", schema = "aerial_refuelling")
public class AerialRefuellingTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designatorPrefix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAerialRefuellingPrefixType> designatorPrefix;
    @XmlElementRef(name = "designatorNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> designatorNumber;
    @XmlElementRef(name = "designatorSuffix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designatorSuffix;
    @XmlElementRef(name = "designatorDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> designatorDirection;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAerialRefuellingType> type;
    @XmlElementRef(name = "radarBeaconSetting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> radarBeaconSetting;
    @XmlElementRef(name = "xbandRadarSetting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> xbandRadarSetting;
    @XmlElementRef(name = "tankerChannel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTACANChannelType> tankerChannel;
    @XmlElementRef(name = "receiverChannel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTACANChannelType> receiverChannel;
    @XmlElementRef(name = "helicopterRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> helicopterRoute;
    @XmlElementRef(name = "specialRefuelling", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialRefuelling;
    @XmlElementRef(name = "bidirectionalUse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> bidirectionalUse;
    @XmlElementRef(name = "reverseDirectionTurn", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> reverseDirectionTurn;
    @XmlElement(nillable = true)
    protected List<RouteAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> protectingAirspace;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingTrackPropertyType> track;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingAnchorPropertyType> anchor;
    @XmlElementRef(name = "oppositeTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> oppositeTrack;
    @XmlElement(nillable = true)
    protected List<AuthorityForAerialRefuellingPropertyType> managingOrganisation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AerialRefuellingExtensionType> extension;

    /**
     * Gets the value of the designatorPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPrefixType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAerialRefuellingPrefixType> getDesignatorPrefix() {
        return designatorPrefix;
    }

    /**
     * Sets the value of the designatorPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingPrefixType }{@code >}
     *     
     */
    public void setDesignatorPrefix(JAXBElement<CodeAerialRefuellingPrefixType> value) {
        this.designatorPrefix = value;
    }

    @Transient
    public boolean isSetDesignatorPrefix() {
        return (this.designatorPrefix!= null);
    }

    /**
     * Gets the value of the designatorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getDesignatorNumber() {
        return designatorNumber;
    }

    /**
     * Sets the value of the designatorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setDesignatorNumber(JAXBElement<NoNumberType> value) {
        this.designatorNumber = value;
    }

    @Transient
    public boolean isSetDesignatorNumber() {
        return (this.designatorNumber!= null);
    }

    /**
     * Gets the value of the designatorSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getDesignatorSuffix() {
        return designatorSuffix;
    }

    /**
     * Sets the value of the designatorSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignatorSuffix(JAXBElement<TextDesignatorType> value) {
        this.designatorSuffix = value;
    }

    @Transient
    public boolean isSetDesignatorSuffix() {
        return (this.designatorSuffix!= null);
    }

    /**
     * Gets the value of the designatorDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCardinalDirectionType> getDesignatorDirection() {
        return designatorDirection;
    }

    /**
     * Sets the value of the designatorDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setDesignatorDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.designatorDirection = value;
    }

    @Transient
    public boolean isSetDesignatorDirection() {
        return (this.designatorDirection!= null);
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAerialRefuellingType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAerialRefuellingType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAerialRefuellingType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the radarBeaconSetting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getRadarBeaconSetting() {
        return radarBeaconSetting;
    }

    /**
     * Sets the value of the radarBeaconSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setRadarBeaconSetting(JAXBElement<NoNumberType> value) {
        this.radarBeaconSetting = value;
    }

    @Transient
    public boolean isSetRadarBeaconSetting() {
        return (this.radarBeaconSetting!= null);
    }

    /**
     * Gets the value of the xbandRadarSetting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getXbandRadarSetting() {
        return xbandRadarSetting;
    }

    /**
     * Sets the value of the xbandRadarSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setXbandRadarSetting(JAXBElement<NoNumberType> value) {
        this.xbandRadarSetting = value;
    }

    @Transient
    public boolean isSetXbandRadarSetting() {
        return (this.xbandRadarSetting!= null);
    }

    /**
     * Gets the value of the tankerChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTACANChannelType> getTankerChannel() {
        return tankerChannel;
    }

    /**
     * Sets the value of the tankerChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    public void setTankerChannel(JAXBElement<CodeTACANChannelType> value) {
        this.tankerChannel = value;
    }

    @Transient
    public boolean isSetTankerChannel() {
        return (this.tankerChannel!= null);
    }

    /**
     * Gets the value of the receiverChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTACANChannelType> getReceiverChannel() {
        return receiverChannel;
    }

    /**
     * Sets the value of the receiverChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTACANChannelType }{@code >}
     *     
     */
    public void setReceiverChannel(JAXBElement<CodeTACANChannelType> value) {
        this.receiverChannel = value;
    }

    @Transient
    public boolean isSetReceiverChannel() {
        return (this.receiverChannel!= null);
    }

    /**
     * Gets the value of the helicopterRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getHelicopterRoute() {
        return helicopterRoute;
    }

    /**
     * Sets the value of the helicopterRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setHelicopterRoute(JAXBElement<CodeYesNoType> value) {
        this.helicopterRoute = value;
    }

    @Transient
    public boolean isSetHelicopterRoute() {
        return (this.helicopterRoute!= null);
    }

    /**
     * Gets the value of the specialRefuelling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSpecialRefuelling() {
        return specialRefuelling;
    }

    /**
     * Sets the value of the specialRefuelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialRefuelling(JAXBElement<CodeYesNoType> value) {
        this.specialRefuelling = value;
    }

    @Transient
    public boolean isSetSpecialRefuelling() {
        return (this.specialRefuelling!= null);
    }

    /**
     * Gets the value of the bidirectionalUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getBidirectionalUse() {
        return bidirectionalUse;
    }

    /**
     * Sets the value of the bidirectionalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setBidirectionalUse(JAXBElement<CodeYesNoType> value) {
        this.bidirectionalUse = value;
    }

    @Transient
    public boolean isSetBidirectionalUse() {
        return (this.bidirectionalUse!= null);
    }

    /**
     * Gets the value of the reverseDirectionTurn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionTurnType> getReverseDirectionTurn() {
        return reverseDirectionTurn;
    }

    /**
     * Sets the value of the reverseDirectionTurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setReverseDirectionTurn(JAXBElement<CodeDirectionTurnType> value) {
        this.reverseDirectionTurn = value;
    }

    @Transient
    public boolean isSetReverseDirectionTurn() {
        return (this.reverseDirectionTurn!= null);
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
     * {@link RouteAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RouteAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpropertygroup", referencedColumnName = "hjid")
    })
    public List<RouteAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<RouteAvailabilityPropertyType> availability) {
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
     * Gets the value of the protectingAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectingAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectingAirspace().add(newItem);
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
    @JoinTable(name = "protectingairspace_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "protectingairspace", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspacePropertyType> getProtectingAirspace() {
        if (protectingAirspace == null) {
            protectingAirspace = new ArrayList<>();
        }
        return this.protectingAirspace;
    }

    /**
     * 
     * 
     */
    public void setProtectingAirspace(List<AirspacePropertyType> protectingAirspace) {
        this.protectingAirspace = protectingAirspace;
    }

    @Transient
    public boolean isSetProtectingAirspace() {
        return ((this.protectingAirspace!= null)&&(!this.protectingAirspace.isEmpty()));
    }

    public void unsetProtectingAirspace() {
        this.protectingAirspace = null;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingTrackPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AerialRefuellingTrackPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "track_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "track", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpropertygroup", referencedColumnName = "hjid")
    })
    public List<AerialRefuellingTrackPropertyType> getTrack() {
        if (track == null) {
            track = new ArrayList<>();
        }
        return this.track;
    }

    /**
     * 
     * 
     */
    public void setTrack(List<AerialRefuellingTrackPropertyType> track) {
        this.track = track;
    }

    @Transient
    public boolean isSetTrack() {
        return ((this.track!= null)&&(!this.track.isEmpty()));
    }

    public void unsetTrack() {
        this.track = null;
    }

    /**
     * Gets the value of the anchor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnchor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingAnchorPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AerialRefuellingAnchorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "anchor_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "anchor", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpropertygroup", referencedColumnName = "hjid")
    })
    public List<AerialRefuellingAnchorPropertyType> getAnchor() {
        if (anchor == null) {
            anchor = new ArrayList<>();
        }
        return this.anchor;
    }

    /**
     * 
     * 
     */
    public void setAnchor(List<AerialRefuellingAnchorPropertyType> anchor) {
        this.anchor = anchor;
    }

    @Transient
    public boolean isSetAnchor() {
        return ((this.anchor!= null)&&(!this.anchor.isEmpty()));
    }

    public void unsetAnchor() {
        this.anchor = null;
    }

    /**
     * Gets the value of the oppositeTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AerialRefuellingPropertyType> getOppositeTrack() {
        return oppositeTrack;
    }

    /**
     * Sets the value of the oppositeTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setOppositeTrack(JAXBElement<AerialRefuellingPropertyType> value) {
        this.oppositeTrack = value;
    }

    @Transient
    public boolean isSetOppositeTrack() {
        return (this.oppositeTrack!= null);
    }

    /**
     * Gets the value of the managingOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managingOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagingOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityForAerialRefuellingPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AuthorityForAerialRefuellingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "managingorganisation_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "managingorganisation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpropertygroup", referencedColumnName = "hjid")
    })
    public List<AuthorityForAerialRefuellingPropertyType> getManagingOrganisation() {
        if (managingOrganisation == null) {
            managingOrganisation = new ArrayList<>();
        }
        return this.managingOrganisation;
    }

    /**
     * 
     * 
     */
    public void setManagingOrganisation(List<AuthorityForAerialRefuellingPropertyType> managingOrganisation) {
        this.managingOrganisation = managingOrganisation;
    }

    @Transient
    public boolean isSetManagingOrganisation() {
        return ((this.managingOrganisation!= null)&&(!this.managingOrganisation.isEmpty()));
    }

    public void unsetManagingOrganisation() {
        this.managingOrganisation = null;
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
    @JoinTable(name = "annotation_aerialrefuelling_link", schema = "aerial_refuelling", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "aerialrefuellingpropertygroup", referencedColumnName = "hjid")
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
     * {@link AerialRefuellingExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AerialRefuellingExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<AerialRefuellingExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AerialRefuellingExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designatorprefix")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatorprefix_nilreason"))
    })
    public CodeAerialRefuellingPrefixType getDesignatorPrefixItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAerialRefuellingPrefixType.class, this.getDesignatorPrefix());
    }

    public void setDesignatorPrefixItem(CodeAerialRefuellingPrefixType target) {
        setDesignatorPrefix(XmlAdapterUtils.marshallJAXBElement(CodeAerialRefuellingPrefixType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorPrefix"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatornumber")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatornumber_nilreason"))
    })
    public NoNumberType getDesignatorNumberItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getDesignatorNumber());
    }

    public void setDesignatorNumberItem(NoNumberType target) {
        setDesignatorNumber(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorNumber"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatorsuffix")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatorsuffix_nilreason"))
    })
    public TextDesignatorType getDesignatorSuffixItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignatorSuffix());
    }

    public void setDesignatorSuffixItem(TextDesignatorType target) {
        setDesignatorSuffix(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorSuffix"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatordirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatordirection_nilreason"))
    })
    public CodeCardinalDirectionType getDesignatorDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCardinalDirectionType.class, this.getDesignatorDirection());
    }

    public void setDesignatorDirectionItem(CodeCardinalDirectionType target) {
        setDesignatorDirection(XmlAdapterUtils.marshallJAXBElement(CodeCardinalDirectionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorDirection"), AerialRefuellingTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeAerialRefuellingType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAerialRefuellingType.class, this.getType());
    }

    public void setTypeItem(CodeAerialRefuellingType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAerialRefuellingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "radarbeaconsetting")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "radarbeaconsetting_nilreason"))
    })
    public NoNumberType getRadarBeaconSettingItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getRadarBeaconSetting());
    }

    public void setRadarBeaconSettingItem(NoNumberType target) {
        setRadarBeaconSetting(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "radarBeaconSetting"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "xbandradarsetting")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "xbandradarsetting_nilreason"))
    })
    public NoNumberType getXbandRadarSettingItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getXbandRadarSetting());
    }

    public void setXbandRadarSettingItem(NoNumberType target) {
        setXbandRadarSetting(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "xbandRadarSetting"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "tankerchannel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "tankerchannel_nilreason"))
    })
    public CodeTACANChannelType getTankerChannelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTACANChannelType.class, this.getTankerChannel());
    }

    public void setTankerChannelItem(CodeTACANChannelType target) {
        setTankerChannel(XmlAdapterUtils.marshallJAXBElement(CodeTACANChannelType.class, new QName("http://www.aixm.aero/schema/5.1.1", "tankerChannel"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "receiverchannel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "receiverchannel_nilreason"))
    })
    public CodeTACANChannelType getReceiverChannelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTACANChannelType.class, this.getReceiverChannel());
    }

    public void setReceiverChannelItem(CodeTACANChannelType target) {
        setReceiverChannel(XmlAdapterUtils.marshallJAXBElement(CodeTACANChannelType.class, new QName("http://www.aixm.aero/schema/5.1.1", "receiverChannel"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "helicopterroute")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "helicopterroute_nilreason"))
    })
    public CodeYesNoType getHelicopterRouteItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getHelicopterRoute());
    }

    public void setHelicopterRouteItem(CodeYesNoType target) {
        setHelicopterRoute(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "helicopterRoute"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "specialrefuelling")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "specialrefuelling_nilreason"))
    })
    public CodeYesNoType getSpecialRefuellingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialRefuelling());
    }

    public void setSpecialRefuellingItem(CodeYesNoType target) {
        setSpecialRefuelling(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "specialRefuelling"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "bidirectionaluse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "bidirectionaluse_nilreason"))
    })
    public CodeYesNoType getBidirectionalUseItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getBidirectionalUse());
    }

    public void setBidirectionalUseItem(CodeYesNoType target) {
        setBidirectionalUse(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "bidirectionalUse"), AerialRefuellingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "reversedirectionturn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "reversedirectionturn_nilreason"))
    })
    public CodeDirectionTurnType getReverseDirectionTurnItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getReverseDirectionTurn());
    }

    public void setReverseDirectionTurnItem(CodeDirectionTurnType target) {
        setReverseDirectionTurn(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reverseDirectionTurn"), AerialRefuellingTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AerialRefuellingPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "oppositetrack_id", referencedColumnName = "hjid")
    public AerialRefuellingPropertyType getOppositeTrackItem() {
        return XmlAdapterUtils.unmarshallSource(AerialRefuellingPropertyType.class, this.getOppositeTrack());
    }

    public void setOppositeTrackItem(AerialRefuellingPropertyType target) {
        setOppositeTrack(XmlAdapterUtils.marshallJAXBElement(AerialRefuellingPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "oppositeTrack"), AerialRefuellingTimeSliceType.class, target));
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
        final AerialRefuellingTimeSliceType that = ((AerialRefuellingTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetDesignatorPrefix();
            boolean rhsFieldIsSet = that.isSetDesignatorPrefix();
            JAXBElement<CodeAerialRefuellingPrefixType> lhsField;
            lhsField = this.getDesignatorPrefix();
            JAXBElement<CodeAerialRefuellingPrefixType> rhsField;
            rhsField = that.getDesignatorPrefix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorPrefix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorPrefix", rhsField);
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
            boolean lhsFieldIsSet = this.isSetHelicopterRoute();
            boolean rhsFieldIsSet = that.isSetHelicopterRoute();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getHelicopterRoute();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getHelicopterRoute();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "helicopterRoute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "helicopterRoute", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetProtectingAirspace();
            boolean rhsFieldIsSet = that.isSetProtectingAirspace();
            List<AirspacePropertyType> lhsField;
            lhsField = (this.isSetProtectingAirspace()?this.getProtectingAirspace():null);
            List<AirspacePropertyType> rhsField;
            rhsField = (that.isSetProtectingAirspace()?that.getProtectingAirspace():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "protectingAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "protectingAirspace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTankerChannel();
            boolean rhsFieldIsSet = that.isSetTankerChannel();
            JAXBElement<CodeTACANChannelType> lhsField;
            lhsField = this.getTankerChannel();
            JAXBElement<CodeTACANChannelType> rhsField;
            rhsField = that.getTankerChannel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "tankerChannel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "tankerChannel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetXbandRadarSetting();
            boolean rhsFieldIsSet = that.isSetXbandRadarSetting();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getXbandRadarSetting();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getXbandRadarSetting();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "xbandRadarSetting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "xbandRadarSetting", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<RouteAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<RouteAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAerialRefuellingType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAerialRefuellingType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AerialRefuellingExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AerialRefuellingExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadarBeaconSetting();
            boolean rhsFieldIsSet = that.isSetRadarBeaconSetting();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getRadarBeaconSetting();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getRadarBeaconSetting();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radarBeaconSetting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radarBeaconSetting", rhsField);
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
            boolean lhsFieldIsSet = this.isSetReverseDirectionTurn();
            boolean rhsFieldIsSet = that.isSetReverseDirectionTurn();
            JAXBElement<CodeDirectionTurnType> lhsField;
            lhsField = this.getReverseDirectionTurn();
            JAXBElement<CodeDirectionTurnType> rhsField;
            rhsField = that.getReverseDirectionTurn();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reverseDirectionTurn", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reverseDirectionTurn", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOppositeTrack();
            boolean rhsFieldIsSet = that.isSetOppositeTrack();
            JAXBElement<AerialRefuellingPropertyType> lhsField;
            lhsField = this.getOppositeTrack();
            JAXBElement<AerialRefuellingPropertyType> rhsField;
            rhsField = that.getOppositeTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "oppositeTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "oppositeTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReceiverChannel();
            boolean rhsFieldIsSet = that.isSetReceiverChannel();
            JAXBElement<CodeTACANChannelType> lhsField;
            lhsField = this.getReceiverChannel();
            JAXBElement<CodeTACANChannelType> rhsField;
            rhsField = that.getReceiverChannel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "receiverChannel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "receiverChannel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialRefuelling();
            boolean rhsFieldIsSet = that.isSetSpecialRefuelling();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSpecialRefuelling();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSpecialRefuelling();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialRefuelling", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialRefuelling", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorSuffix();
            boolean rhsFieldIsSet = that.isSetDesignatorSuffix();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getDesignatorSuffix();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getDesignatorSuffix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorSuffix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorSuffix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnchor();
            boolean rhsFieldIsSet = that.isSetAnchor();
            List<AerialRefuellingAnchorPropertyType> lhsField;
            lhsField = (this.isSetAnchor()?this.getAnchor():null);
            List<AerialRefuellingAnchorPropertyType> rhsField;
            rhsField = (that.isSetAnchor()?that.getAnchor():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "anchor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "anchor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBidirectionalUse();
            boolean rhsFieldIsSet = that.isSetBidirectionalUse();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getBidirectionalUse();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getBidirectionalUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "bidirectionalUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "bidirectionalUse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrack();
            boolean rhsFieldIsSet = that.isSetTrack();
            List<AerialRefuellingTrackPropertyType> lhsField;
            lhsField = (this.isSetTrack()?this.getTrack():null);
            List<AerialRefuellingTrackPropertyType> rhsField;
            rhsField = (that.isSetTrack()?that.getTrack():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "track", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "track", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetManagingOrganisation();
            boolean rhsFieldIsSet = that.isSetManagingOrganisation();
            List<AuthorityForAerialRefuellingPropertyType> lhsField;
            lhsField = (this.isSetManagingOrganisation()?this.getManagingOrganisation():null);
            List<AuthorityForAerialRefuellingPropertyType> rhsField;
            rhsField = (that.isSetManagingOrganisation()?that.getManagingOrganisation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "managingOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "managingOrganisation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorDirection();
            boolean rhsFieldIsSet = that.isSetDesignatorDirection();
            JAXBElement<CodeCardinalDirectionType> lhsField;
            lhsField = this.getDesignatorDirection();
            JAXBElement<CodeCardinalDirectionType> rhsField;
            rhsField = that.getDesignatorDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorNumber();
            boolean rhsFieldIsSet = that.isSetDesignatorNumber();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getDesignatorNumber();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getDesignatorNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorNumber", rhsField);
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
            boolean theFieldIsSet = this.isSetDesignatorPrefix();
            JAXBElement<CodeAerialRefuellingPrefixType> theField;
            theField = this.getDesignatorPrefix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorPrefix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorNumber();
            JAXBElement<NoNumberType> theField;
            theField = this.getDesignatorNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorSuffix();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignatorSuffix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorSuffix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getDesignatorDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorDirection", theField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAerialRefuellingType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadarBeaconSetting();
            JAXBElement<NoNumberType> theField;
            theField = this.getRadarBeaconSetting();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radarBeaconSetting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetXbandRadarSetting();
            JAXBElement<NoNumberType> theField;
            theField = this.getXbandRadarSetting();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "xbandRadarSetting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTankerChannel();
            JAXBElement<CodeTACANChannelType> theField;
            theField = this.getTankerChannel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "tankerChannel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReceiverChannel();
            JAXBElement<CodeTACANChannelType> theField;
            theField = this.getReceiverChannel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "receiverChannel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHelicopterRoute();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getHelicopterRoute();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "helicopterRoute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialRefuelling();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialRefuelling();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialRefuelling", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBidirectionalUse();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getBidirectionalUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "bidirectionalUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReverseDirectionTurn();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getReverseDirectionTurn();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reverseDirectionTurn", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<RouteAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtectingAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetProtectingAirspace()?this.getProtectingAirspace():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "protectingAirspace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrack();
            List<AerialRefuellingTrackPropertyType> theField;
            theField = (this.isSetTrack()?this.getTrack():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "track", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnchor();
            List<AerialRefuellingAnchorPropertyType> theField;
            theField = (this.isSetAnchor()?this.getAnchor():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "anchor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOppositeTrack();
            JAXBElement<AerialRefuellingPropertyType> theField;
            theField = this.getOppositeTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "oppositeTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetManagingOrganisation();
            List<AuthorityForAerialRefuellingPropertyType> theField;
            theField = (this.isSetManagingOrganisation()?this.getManagingOrganisation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "managingOrganisation", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<AerialRefuellingExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignatorPrefix();
            JAXBElement<CodeAerialRefuellingPrefixType> theField;
            theField = this.getDesignatorPrefix();
            strategy.appendField(locator, this, "designatorPrefix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorNumber();
            JAXBElement<NoNumberType> theField;
            theField = this.getDesignatorNumber();
            strategy.appendField(locator, this, "designatorNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorSuffix();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignatorSuffix();
            strategy.appendField(locator, this, "designatorSuffix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getDesignatorDirection();
            strategy.appendField(locator, this, "designatorDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeAerialRefuellingType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadarBeaconSetting();
            JAXBElement<NoNumberType> theField;
            theField = this.getRadarBeaconSetting();
            strategy.appendField(locator, this, "radarBeaconSetting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetXbandRadarSetting();
            JAXBElement<NoNumberType> theField;
            theField = this.getXbandRadarSetting();
            strategy.appendField(locator, this, "xbandRadarSetting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTankerChannel();
            JAXBElement<CodeTACANChannelType> theField;
            theField = this.getTankerChannel();
            strategy.appendField(locator, this, "tankerChannel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReceiverChannel();
            JAXBElement<CodeTACANChannelType> theField;
            theField = this.getReceiverChannel();
            strategy.appendField(locator, this, "receiverChannel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHelicopterRoute();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getHelicopterRoute();
            strategy.appendField(locator, this, "helicopterRoute", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialRefuelling();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialRefuelling();
            strategy.appendField(locator, this, "specialRefuelling", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBidirectionalUse();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getBidirectionalUse();
            strategy.appendField(locator, this, "bidirectionalUse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReverseDirectionTurn();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getReverseDirectionTurn();
            strategy.appendField(locator, this, "reverseDirectionTurn", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<RouteAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtectingAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetProtectingAirspace()?this.getProtectingAirspace():null);
            strategy.appendField(locator, this, "protectingAirspace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrack();
            List<AerialRefuellingTrackPropertyType> theField;
            theField = (this.isSetTrack()?this.getTrack():null);
            strategy.appendField(locator, this, "track", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnchor();
            List<AerialRefuellingAnchorPropertyType> theField;
            theField = (this.isSetAnchor()?this.getAnchor():null);
            strategy.appendField(locator, this, "anchor", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOppositeTrack();
            JAXBElement<AerialRefuellingPropertyType> theField;
            theField = this.getOppositeTrack();
            strategy.appendField(locator, this, "oppositeTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetManagingOrganisation();
            List<AuthorityForAerialRefuellingPropertyType> theField;
            theField = (this.isSetManagingOrganisation()?this.getManagingOrganisation():null);
            strategy.appendField(locator, this, "managingOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AerialRefuellingExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
