
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
 * <p>Java class for RadioCommunicationChannelTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RadioCommunicationChannelTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RadioCommunicationChannelPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadioCommunicationChannelExtension"/>
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
@XmlType(name = "RadioCommunicationChannelTimeSliceType", propOrder = {
    "mode",
    "rank",
    "frequencyTransmission",
    "frequencyReception",
    "channel",
    "logon",
    "emissionType",
    "selectiveCall",
    "flightChecked",
    "trafficDirection",
    "location",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "RadioCommunicationChannelTimeSliceType")
@Table(name = "radiocommunicationchannel_ts", schema = "service")
public class RadioCommunicationChannelTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "mode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationModeType> mode;
    @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFacilityRankingType> rank;
    @XmlElementRef(name = "frequencyTransmission", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequencyTransmission;
    @XmlElementRef(name = "frequencyReception", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequencyReception;
    @XmlElementRef(name = "channel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationChannelType> channel;
    @XmlElementRef(name = "logon", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> logon;
    @XmlElementRef(name = "emissionType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioEmissionType> emissionType;
    @XmlElementRef(name = "selectiveCall", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> selectiveCall;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "trafficDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationDirectionType> trafficDirection;
    @XmlElement(nillable = true)
    protected List<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<RadioCommunicationOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RadioCommunicationChannelExtensionType> extension;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCommunicationModeType> getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public void setMode(JAXBElement<CodeCommunicationModeType> value) {
        this.mode = value;
    }

    @Transient
    public boolean isSetMode() {
        return (this.mode!= null);
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
     * Gets the value of the frequencyTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFrequencyType> getFrequencyTransmission() {
        return frequencyTransmission;
    }

    /**
     * Sets the value of the frequencyTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setFrequencyTransmission(JAXBElement<ValFrequencyType> value) {
        this.frequencyTransmission = value;
    }

    @Transient
    public boolean isSetFrequencyTransmission() {
        return (this.frequencyTransmission!= null);
    }

    /**
     * Gets the value of the frequencyReception property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFrequencyType> getFrequencyReception() {
        return frequencyReception;
    }

    /**
     * Sets the value of the frequencyReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setFrequencyReception(JAXBElement<ValFrequencyType> value) {
        this.frequencyReception = value;
    }

    @Transient
    public boolean isSetFrequencyReception() {
        return (this.frequencyReception!= null);
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationChannelType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCommunicationChannelType> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationChannelType }{@code >}
     *     
     */
    public void setChannel(JAXBElement<CodeCommunicationChannelType> value) {
        this.channel = value;
    }

    @Transient
    public boolean isSetChannel() {
        return (this.channel!= null);
    }

    /**
     * Gets the value of the logon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getLogon() {
        return logon;
    }

    /**
     * Sets the value of the logon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setLogon(JAXBElement<TextDesignatorType> value) {
        this.logon = value;
    }

    @Transient
    public boolean isSetLogon() {
        return (this.logon!= null);
    }

    /**
     * Gets the value of the emissionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRadioEmissionType> getEmissionType() {
        return emissionType;
    }

    /**
     * Sets the value of the emissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public void setEmissionType(JAXBElement<CodeRadioEmissionType> value) {
        this.emissionType = value;
    }

    @Transient
    public boolean isSetEmissionType() {
        return (this.emissionType!= null);
    }

    /**
     * Gets the value of the selectiveCall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSelectiveCall() {
        return selectiveCall;
    }

    /**
     * Sets the value of the selectiveCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSelectiveCall(JAXBElement<CodeYesNoType> value) {
        this.selectiveCall = value;
    }

    @Transient
    public boolean isSetSelectiveCall() {
        return (this.selectiveCall!= null);
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
     * Gets the value of the trafficDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationDirectionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCommunicationDirectionType> getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * Sets the value of the trafficDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationDirectionType }{@code >}
     *     
     */
    public void setTrafficDirection(JAXBElement<CodeCommunicationDirectionType> value) {
        this.trafficDirection = value;
    }

    @Transient
    public boolean isSetTrafficDirection() {
        return (this.trafficDirection!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIXMElevatedPointPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public List<AIXMElevatedPointPropertyType> getLocation() {
        if (location == null) {
            location = new ArrayList<>();
        }
        return this.location;
    }

    /**
     * 
     * 
     */
    public void setLocation(List<AIXMElevatedPointPropertyType> location) {
        this.location = location;
    }

    @Transient
    public boolean isSetLocation() {
        return ((this.location!= null)&&(!this.location.isEmpty()));
    }

    public void unsetLocation() {
        this.location = null;
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
     * {@link RadioCommunicationOperationalStatusPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = RadioCommunicationOperationalStatusPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "availability_id", referencedColumnName = "hjid")
    public List<RadioCommunicationOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<RadioCommunicationOperationalStatusPropertyType> availability) {
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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
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
     * {@link RadioCommunicationChannelExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RadioCommunicationChannelExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_RADIO_COMMUNICATIO_0")
    public List<RadioCommunicationChannelExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RadioCommunicationChannelExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "mode")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "mode_nilreason"))
    })
    public CodeCommunicationModeType getModeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCommunicationModeType.class, this.getMode());
    }

    public void setModeItem(CodeCommunicationModeType target) {
        setMode(XmlAdapterUtils.marshallJAXBElement(CodeCommunicationModeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "mode"), RadioCommunicationChannelTimeSliceType.class, target));
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
        setRank(XmlAdapterUtils.marshallJAXBElement(CodeFacilityRankingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "rank"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frequencytransmission")),
        @AttributeOverride(name = "uom", column = @Column(name = "frequencytransmission_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frequencytransmission_nilreason"))
    })
    public ValFrequencyType getFrequencyTransmissionItem() {
        return XmlAdapterUtils.unmarshallSource(ValFrequencyType.class, this.getFrequencyTransmission());
    }

    public void setFrequencyTransmissionItem(ValFrequencyType target) {
        setFrequencyTransmission(XmlAdapterUtils.marshallJAXBElement(ValFrequencyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frequencyTransmission"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frequencyreception")),
        @AttributeOverride(name = "uom", column = @Column(name = "frequencyreception_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frequencyreception_nilreason"))
    })
    public ValFrequencyType getFrequencyReceptionItem() {
        return XmlAdapterUtils.unmarshallSource(ValFrequencyType.class, this.getFrequencyReception());
    }

    public void setFrequencyReceptionItem(ValFrequencyType target) {
        setFrequencyReception(XmlAdapterUtils.marshallJAXBElement(ValFrequencyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frequencyReception"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "channel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "channel_nilreason"))
    })
    public CodeCommunicationChannelType getChannelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCommunicationChannelType.class, this.getChannel());
    }

    public void setChannelItem(CodeCommunicationChannelType target) {
        setChannel(XmlAdapterUtils.marshallJAXBElement(CodeCommunicationChannelType.class, new QName("http://www.aixm.aero/schema/5.1.1", "channel"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "logon")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "logon_nilreason"))
    })
    public TextDesignatorType getLogonItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getLogon());
    }

    public void setLogonItem(TextDesignatorType target) {
        setLogon(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "logon"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "emissiontype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "emissiontype_nilreason"))
    })
    public CodeRadioEmissionType getEmissionTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRadioEmissionType.class, this.getEmissionType());
    }

    public void setEmissionTypeItem(CodeRadioEmissionType target) {
        setEmissionType(XmlAdapterUtils.marshallJAXBElement(CodeRadioEmissionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "emissionType"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "selectivecall")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "selectivecall_nilreason"))
    })
    public CodeYesNoType getSelectiveCallItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSelectiveCall());
    }

    public void setSelectiveCallItem(CodeYesNoType target) {
        setSelectiveCall(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "selectiveCall"), RadioCommunicationChannelTimeSliceType.class, target));
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
        setFlightChecked(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightChecked"), RadioCommunicationChannelTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "trafficdirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "trafficdirection_nilreason"))
    })
    public CodeCommunicationDirectionType getTrafficDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCommunicationDirectionType.class, this.getTrafficDirection());
    }

    public void setTrafficDirectionItem(CodeCommunicationDirectionType target) {
        setTrafficDirection(XmlAdapterUtils.marshallJAXBElement(CodeCommunicationDirectionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trafficDirection"), RadioCommunicationChannelTimeSliceType.class, target));
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
        final RadioCommunicationChannelTimeSliceType that = ((RadioCommunicationChannelTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetChannel();
            boolean rhsFieldIsSet = that.isSetChannel();
            JAXBElement<CodeCommunicationChannelType> lhsField;
            lhsField = this.getChannel();
            JAXBElement<CodeCommunicationChannelType> rhsField;
            rhsField = that.getChannel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "channel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "channel", rhsField);
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
            List<RadioCommunicationChannelExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RadioCommunicationChannelExtensionType> rhsField;
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
            List<RadioCommunicationOperationalStatusPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<RadioCommunicationOperationalStatusPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTrafficDirection();
            boolean rhsFieldIsSet = that.isSetTrafficDirection();
            JAXBElement<CodeCommunicationDirectionType> lhsField;
            lhsField = this.getTrafficDirection();
            JAXBElement<CodeCommunicationDirectionType> rhsField;
            rhsField = that.getTrafficDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trafficDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trafficDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEmissionType();
            boolean rhsFieldIsSet = that.isSetEmissionType();
            JAXBElement<CodeRadioEmissionType> lhsField;
            lhsField = this.getEmissionType();
            JAXBElement<CodeRadioEmissionType> rhsField;
            rhsField = that.getEmissionType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emissionType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emissionType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSelectiveCall();
            boolean rhsFieldIsSet = that.isSetSelectiveCall();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSelectiveCall();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSelectiveCall();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "selectiveCall", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "selectiveCall", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrequencyReception();
            boolean rhsFieldIsSet = that.isSetFrequencyReception();
            JAXBElement<ValFrequencyType> lhsField;
            lhsField = this.getFrequencyReception();
            JAXBElement<ValFrequencyType> rhsField;
            rhsField = that.getFrequencyReception();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frequencyReception", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frequencyReception", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrequencyTransmission();
            boolean rhsFieldIsSet = that.isSetFrequencyTransmission();
            JAXBElement<ValFrequencyType> lhsField;
            lhsField = this.getFrequencyTransmission();
            JAXBElement<ValFrequencyType> rhsField;
            rhsField = that.getFrequencyTransmission();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frequencyTransmission", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frequencyTransmission", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMode();
            boolean rhsFieldIsSet = that.isSetMode();
            JAXBElement<CodeCommunicationModeType> lhsField;
            lhsField = this.getMode();
            JAXBElement<CodeCommunicationModeType> rhsField;
            rhsField = that.getMode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            List<AIXMElevatedPointPropertyType> lhsField;
            lhsField = (this.isSetLocation()?this.getLocation():null);
            List<AIXMElevatedPointPropertyType> rhsField;
            rhsField = (that.isSetLocation()?that.getLocation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLogon();
            boolean rhsFieldIsSet = that.isSetLogon();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getLogon();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getLogon();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "logon", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "logon", rhsField);
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
            boolean theFieldIsSet = this.isSetMode();
            JAXBElement<CodeCommunicationModeType> theField;
            theField = this.getMode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mode", theField);
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
            boolean theFieldIsSet = this.isSetFrequencyTransmission();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequencyTransmission();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frequencyTransmission", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrequencyReception();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequencyReception();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frequencyReception", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannel();
            JAXBElement<CodeCommunicationChannelType> theField;
            theField = this.getChannel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "channel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLogon();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getLogon();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "logon", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmissionType();
            JAXBElement<CodeRadioEmissionType> theField;
            theField = this.getEmissionType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emissionType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSelectiveCall();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSelectiveCall();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "selectiveCall", theField);
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
            boolean theFieldIsSet = this.isSetTrafficDirection();
            JAXBElement<CodeCommunicationDirectionType> theField;
            theField = this.getTrafficDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trafficDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            List<AIXMElevatedPointPropertyType> theField;
            theField = (this.isSetLocation()?this.getLocation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<RadioCommunicationOperationalStatusPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetExtension();
            List<RadioCommunicationChannelExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetMode();
            JAXBElement<CodeCommunicationModeType> theField;
            theField = this.getMode();
            strategy.appendField(locator, this, "mode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRank();
            JAXBElement<CodeFacilityRankingType> theField;
            theField = this.getRank();
            strategy.appendField(locator, this, "rank", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrequencyTransmission();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequencyTransmission();
            strategy.appendField(locator, this, "frequencyTransmission", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrequencyReception();
            JAXBElement<ValFrequencyType> theField;
            theField = this.getFrequencyReception();
            strategy.appendField(locator, this, "frequencyReception", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetChannel();
            JAXBElement<CodeCommunicationChannelType> theField;
            theField = this.getChannel();
            strategy.appendField(locator, this, "channel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLogon();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getLogon();
            strategy.appendField(locator, this, "logon", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEmissionType();
            JAXBElement<CodeRadioEmissionType> theField;
            theField = this.getEmissionType();
            strategy.appendField(locator, this, "emissionType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSelectiveCall();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSelectiveCall();
            strategy.appendField(locator, this, "selectiveCall", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightChecked();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlightChecked();
            strategy.appendField(locator, this, "flightChecked", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrafficDirection();
            JAXBElement<CodeCommunicationDirectionType> theField;
            theField = this.getTrafficDirection();
            strategy.appendField(locator, this, "trafficDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            List<AIXMElevatedPointPropertyType> theField;
            theField = (this.isSetLocation()?this.getLocation():null);
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<RadioCommunicationOperationalStatusPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetExtension();
            List<RadioCommunicationChannelExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
