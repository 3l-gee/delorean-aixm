
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
 * <p>Java class for VerticalStructureTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VerticalStructureTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}VerticalStructurePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractVerticalStructureExtension"/>
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
@XmlType(name = "VerticalStructureTimeSliceType", propOrder = {
    "aixmName",
    "type",
    "lighted",
    "markingICAOStandard",
    "group",
    "length",
    "width",
    "radius",
    "lightingICAOStandard",
    "synchronisedLighting",
    "marker",
    "part",
    "hostedPassengerService",
    "supportedGroundLight",
    "hostedNavaidEquipment",
    "hostedSpecialNavStation",
    "hostedUnit",
    "hostedOrganisation",
    "supportedService",
    "annotation",
    "lightingAvailability",
    "extension"
})
@Entity(name = "VerticalStructureTimeSliceType")
@Table(name = "verticalstructure_ts", schema = "obstacle")
public class VerticalStructureTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureType> type;
    @XmlElementRef(name = "lighted", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> lighted;
    @XmlElementRef(name = "markingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> markingICAOStandard;
    @XmlElementRef(name = "group", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> group;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "radius", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> radius;
    @XmlElementRef(name = "lightingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> lightingICAOStandard;
    @XmlElementRef(name = "synchronisedLighting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> synchronisedLighting;
    @XmlElementRef(name = "marker", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MarkerBeaconPropertyType> marker;
    @XmlElement(nillable = true)
    protected List<VerticalStructurePartPropertyType> part;
    @XmlElement(nillable = true)
    protected List<PassengerServicePropertyType> hostedPassengerService;
    @XmlElement(nillable = true)
    protected List<GroundLightSystemPropertyType> supportedGroundLight;
    @XmlElement(nillable = true)
    protected List<NavaidEquipmentPropertyType> hostedNavaidEquipment;
    @XmlElement(nillable = true)
    protected List<SpecialNavigationStationPropertyType> hostedSpecialNavStation;
    @XmlElement(nillable = true)
    protected List<UnitPropertyType> hostedUnit;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> hostedOrganisation;
    @XmlElement(nillable = true)
    protected List<ServicePropertyType> supportedService;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<VerticalStructureLightingStatusPropertyType> lightingAvailability;
    protected List<VerticalStructureExtensionType> extension;

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
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalStructureType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeVerticalStructureType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the lighted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getLighted() {
        return lighted;
    }

    /**
     * Sets the value of the lighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLighted(JAXBElement<CodeYesNoType> value) {
        this.lighted = value;
    }

    @Transient
    public boolean isSetLighted() {
        return (this.lighted!= null);
    }

    /**
     * Gets the value of the markingICAOStandard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMarkingICAOStandard() {
        return markingICAOStandard;
    }

    /**
     * Sets the value of the markingICAOStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMarkingICAOStandard(JAXBElement<CodeYesNoType> value) {
        this.markingICAOStandard = value;
    }

    @Transient
    public boolean isSetMarkingICAOStandard() {
        return (this.markingICAOStandard!= null);
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setGroup(JAXBElement<CodeYesNoType> value) {
        this.group = value;
    }

    @Transient
    public boolean isSetGroup() {
        return (this.group!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    @Transient
    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidth(JAXBElement<ValDistanceType> value) {
        this.width = value;
    }

    @Transient
    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRadius(JAXBElement<ValDistanceType> value) {
        this.radius = value;
    }

    @Transient
    public boolean isSetRadius() {
        return (this.radius!= null);
    }

    /**
     * Gets the value of the lightingICAOStandard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getLightingICAOStandard() {
        return lightingICAOStandard;
    }

    /**
     * Sets the value of the lightingICAOStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLightingICAOStandard(JAXBElement<CodeYesNoType> value) {
        this.lightingICAOStandard = value;
    }

    @Transient
    public boolean isSetLightingICAOStandard() {
        return (this.lightingICAOStandard!= null);
    }

    /**
     * Gets the value of the synchronisedLighting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSynchronisedLighting() {
        return synchronisedLighting;
    }

    /**
     * Sets the value of the synchronisedLighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSynchronisedLighting(JAXBElement<CodeYesNoType> value) {
        this.synchronisedLighting = value;
    }

    @Transient
    public boolean isSetSynchronisedLighting() {
        return (this.synchronisedLighting!= null);
    }

    /**
     * Gets the value of the marker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<MarkerBeaconPropertyType> getMarker() {
        return marker;
    }

    /**
     * Sets the value of the marker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconPropertyType }{@code >}
     *     
     */
    public void setMarker(JAXBElement<MarkerBeaconPropertyType> value) {
        this.marker = value;
    }

    @Transient
    public boolean isSetMarker() {
        return (this.marker!= null);
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerticalStructurePartPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = VerticalStructurePartPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "part_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "part", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<VerticalStructurePartPropertyType> getPart() {
        if (part == null) {
            part = new ArrayList<>();
        }
        return this.part;
    }

    /**
     * 
     * 
     */
    public void setPart(List<VerticalStructurePartPropertyType> part) {
        this.part = part;
    }

    @Transient
    public boolean isSetPart() {
        return ((this.part!= null)&&(!this.part.isEmpty()));
    }

    public void unsetPart() {
        this.part = null;
    }

    /**
     * Gets the value of the hostedPassengerService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedPassengerService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedPassengerService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerServicePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = PassengerServicePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hostedpassengerservice_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "hostedpassengerservice", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<PassengerServicePropertyType> getHostedPassengerService() {
        if (hostedPassengerService == null) {
            hostedPassengerService = new ArrayList<>();
        }
        return this.hostedPassengerService;
    }

    /**
     * 
     * 
     */
    public void setHostedPassengerService(List<PassengerServicePropertyType> hostedPassengerService) {
        this.hostedPassengerService = hostedPassengerService;
    }

    @Transient
    public boolean isSetHostedPassengerService() {
        return ((this.hostedPassengerService!= null)&&(!this.hostedPassengerService.isEmpty()));
    }

    public void unsetHostedPassengerService() {
        this.hostedPassengerService = null;
    }

    /**
     * Gets the value of the supportedGroundLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedGroundLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedGroundLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightSystemPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = GroundLightSystemPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "supportedgroundlight_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "supportedgroundlight", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<GroundLightSystemPropertyType> getSupportedGroundLight() {
        if (supportedGroundLight == null) {
            supportedGroundLight = new ArrayList<>();
        }
        return this.supportedGroundLight;
    }

    /**
     * 
     * 
     */
    public void setSupportedGroundLight(List<GroundLightSystemPropertyType> supportedGroundLight) {
        this.supportedGroundLight = supportedGroundLight;
    }

    @Transient
    public boolean isSetSupportedGroundLight() {
        return ((this.supportedGroundLight!= null)&&(!this.supportedGroundLight.isEmpty()));
    }

    public void unsetSupportedGroundLight() {
        this.supportedGroundLight = null;
    }

    /**
     * Gets the value of the hostedNavaidEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedNavaidEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedNavaidEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidEquipmentPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NavaidEquipmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hostednavaidequipment_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "hostednavaidequipment", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<NavaidEquipmentPropertyType> getHostedNavaidEquipment() {
        if (hostedNavaidEquipment == null) {
            hostedNavaidEquipment = new ArrayList<>();
        }
        return this.hostedNavaidEquipment;
    }

    /**
     * 
     * 
     */
    public void setHostedNavaidEquipment(List<NavaidEquipmentPropertyType> hostedNavaidEquipment) {
        this.hostedNavaidEquipment = hostedNavaidEquipment;
    }

    @Transient
    public boolean isSetHostedNavaidEquipment() {
        return ((this.hostedNavaidEquipment!= null)&&(!this.hostedNavaidEquipment.isEmpty()));
    }

    public void unsetHostedNavaidEquipment() {
        this.hostedNavaidEquipment = null;
    }

    /**
     * Gets the value of the hostedSpecialNavStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedSpecialNavStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedSpecialNavStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialNavigationStationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = SpecialNavigationStationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hostedspecialnavstation_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "hostedspecialnavstation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<SpecialNavigationStationPropertyType> getHostedSpecialNavStation() {
        if (hostedSpecialNavStation == null) {
            hostedSpecialNavStation = new ArrayList<>();
        }
        return this.hostedSpecialNavStation;
    }

    /**
     * 
     * 
     */
    public void setHostedSpecialNavStation(List<SpecialNavigationStationPropertyType> hostedSpecialNavStation) {
        this.hostedSpecialNavStation = hostedSpecialNavStation;
    }

    @Transient
    public boolean isSetHostedSpecialNavStation() {
        return ((this.hostedSpecialNavStation!= null)&&(!this.hostedSpecialNavStation.isEmpty()));
    }

    public void unsetHostedSpecialNavStation() {
        this.hostedSpecialNavStation = null;
    }

    /**
     * Gets the value of the hostedUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = UnitPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hostedunit_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "hostedunit", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<UnitPropertyType> getHostedUnit() {
        if (hostedUnit == null) {
            hostedUnit = new ArrayList<>();
        }
        return this.hostedUnit;
    }

    /**
     * 
     * 
     */
    public void setHostedUnit(List<UnitPropertyType> hostedUnit) {
        this.hostedUnit = hostedUnit;
    }

    @Transient
    public boolean isSetHostedUnit() {
        return ((this.hostedUnit!= null)&&(!this.hostedUnit.isEmpty()));
    }

    public void unsetHostedUnit() {
        this.hostedUnit = null;
    }

    /**
     * Gets the value of the hostedOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "hostedorganisation_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "hostedorganisation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<OrganisationAuthorityPropertyType> getHostedOrganisation() {
        if (hostedOrganisation == null) {
            hostedOrganisation = new ArrayList<>();
        }
        return this.hostedOrganisation;
    }

    /**
     * 
     * 
     */
    public void setHostedOrganisation(List<OrganisationAuthorityPropertyType> hostedOrganisation) {
        this.hostedOrganisation = hostedOrganisation;
    }

    @Transient
    public boolean isSetHostedOrganisation() {
        return ((this.hostedOrganisation!= null)&&(!this.hostedOrganisation.isEmpty()));
    }

    public void unsetHostedOrganisation() {
        this.hostedOrganisation = null;
    }

    /**
     * Gets the value of the supportedService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ServicePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "supportedservice_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "supportedservice", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<ServicePropertyType> getSupportedService() {
        if (supportedService == null) {
            supportedService = new ArrayList<>();
        }
        return this.supportedService;
    }

    /**
     * 
     * 
     */
    public void setSupportedService(List<ServicePropertyType> supportedService) {
        this.supportedService = supportedService;
    }

    @Transient
    public boolean isSetSupportedService() {
        return ((this.supportedService!= null)&&(!this.supportedService.isEmpty()));
    }

    public void unsetSupportedService() {
        this.supportedService = null;
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
    @JoinTable(name = "annotation_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the lightingAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightingAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightingAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerticalStructureLightingStatusPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = VerticalStructureLightingStatusPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "lightingavailability_verticalstructure_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "lightingavailability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepropertygroup", referencedColumnName = "hjid")
    })
    public List<VerticalStructureLightingStatusPropertyType> getLightingAvailability() {
        if (lightingAvailability == null) {
            lightingAvailability = new ArrayList<>();
        }
        return this.lightingAvailability;
    }

    /**
     * 
     * 
     */
    public void setLightingAvailability(List<VerticalStructureLightingStatusPropertyType> lightingAvailability) {
        this.lightingAvailability = lightingAvailability;
    }

    @Transient
    public boolean isSetLightingAvailability() {
        return ((this.lightingAvailability!= null)&&(!this.lightingAvailability.isEmpty()));
    }

    public void unsetLightingAvailability() {
        this.lightingAvailability = null;
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
     * {@link VerticalStructureExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = VerticalStructureExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<VerticalStructureExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<VerticalStructureExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeVerticalStructureType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalStructureType.class, this.getType());
    }

    public void setTypeItem(CodeVerticalStructureType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeVerticalStructureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lighted")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lighted_nilreason"))
    })
    public CodeYesNoType getLightedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getLighted());
    }

    public void setLightedItem(CodeYesNoType target) {
        setLighted(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lighted"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "markingicaostandard")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markingicaostandard_nilreason"))
    })
    public CodeYesNoType getMarkingICAOStandardItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMarkingICAOStandard());
    }

    public void setMarkingICAOStandardItem(CodeYesNoType target) {
        setMarkingICAOStandard(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markingICAOStandard"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "group_")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "group_nilreason"))
    })
    public CodeYesNoType getGroupItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getGroup());
    }

    public void setGroupItem(CodeYesNoType target) {
        setGroup(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "group"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "length")),
        @AttributeOverride(name = "uom", column = @Column(name = "length_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "length_nilreason"))
    })
    public ValDistanceType getLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLength());
    }

    public void setLengthItem(ValDistanceType target) {
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "length"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "width")),
        @AttributeOverride(name = "uom", column = @Column(name = "width_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "width_nilreason"))
    })
    public ValDistanceType getWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidth());
    }

    public void setWidthItem(ValDistanceType target) {
        setWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "width"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "radius")),
        @AttributeOverride(name = "uom", column = @Column(name = "radius_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "radius_nilreason"))
    })
    public ValDistanceType getRadiusItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRadius());
    }

    public void setRadiusItem(ValDistanceType target) {
        setRadius(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "radius"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lightingicaostandard")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lightingicaostandard_nilreason"))
    })
    public CodeYesNoType getLightingICAOStandardItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getLightingICAOStandard());
    }

    public void setLightingICAOStandardItem(CodeYesNoType target) {
        setLightingICAOStandard(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lightingICAOStandard"), VerticalStructureTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "synchronisedlighting")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "synchronisedlighting_nilreason"))
    })
    public CodeYesNoType getSynchronisedLightingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSynchronisedLighting());
    }

    public void setSynchronisedLightingItem(CodeYesNoType target) {
        setSynchronisedLighting(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "synchronisedLighting"), VerticalStructureTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = MarkerBeaconPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "marker_id", referencedColumnName = "hjid")
    public MarkerBeaconPropertyType getMarkerItem() {
        return XmlAdapterUtils.unmarshallSource(MarkerBeaconPropertyType.class, this.getMarker());
    }

    public void setMarkerItem(MarkerBeaconPropertyType target) {
        setMarker(XmlAdapterUtils.marshallJAXBElement(MarkerBeaconPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "marker"), VerticalStructureTimeSliceType.class, target));
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
        final VerticalStructureTimeSliceType that = ((VerticalStructureTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetHostedSpecialNavStation();
            boolean rhsFieldIsSet = that.isSetHostedSpecialNavStation();
            List<SpecialNavigationStationPropertyType> lhsField;
            lhsField = (this.isSetHostedSpecialNavStation()?this.getHostedSpecialNavStation():null);
            List<SpecialNavigationStationPropertyType> rhsField;
            rhsField = (that.isSetHostedSpecialNavStation()?that.getHostedSpecialNavStation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hostedSpecialNavStation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hostedSpecialNavStation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLighted();
            boolean rhsFieldIsSet = that.isSetLighted();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getLighted();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getLighted();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lighted", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lighted", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSupportedGroundLight();
            boolean rhsFieldIsSet = that.isSetSupportedGroundLight();
            List<GroundLightSystemPropertyType> lhsField;
            lhsField = (this.isSetSupportedGroundLight()?this.getSupportedGroundLight():null);
            List<GroundLightSystemPropertyType> rhsField;
            rhsField = (that.isSetSupportedGroundLight()?that.getSupportedGroundLight():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "supportedGroundLight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "supportedGroundLight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSupportedService();
            boolean rhsFieldIsSet = that.isSetSupportedService();
            List<ServicePropertyType> lhsField;
            lhsField = (this.isSetSupportedService()?this.getSupportedService():null);
            List<ServicePropertyType> rhsField;
            rhsField = (that.isSetSupportedService()?that.getSupportedService():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "supportedService", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "supportedService", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHostedPassengerService();
            boolean rhsFieldIsSet = that.isSetHostedPassengerService();
            List<PassengerServicePropertyType> lhsField;
            lhsField = (this.isSetHostedPassengerService()?this.getHostedPassengerService():null);
            List<PassengerServicePropertyType> rhsField;
            rhsField = (that.isSetHostedPassengerService()?that.getHostedPassengerService():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hostedPassengerService", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hostedPassengerService", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMarkingICAOStandard();
            boolean rhsFieldIsSet = that.isSetMarkingICAOStandard();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMarkingICAOStandard();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMarkingICAOStandard();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingICAOStandard", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingICAOStandard", rhsField);
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
            boolean lhsFieldIsSet = this.isSetWidth();
            boolean rhsFieldIsSet = that.isSetWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "width", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "width", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPart();
            boolean rhsFieldIsSet = that.isSetPart();
            List<VerticalStructurePartPropertyType> lhsField;
            lhsField = (this.isSetPart()?this.getPart():null);
            List<VerticalStructurePartPropertyType> rhsField;
            rhsField = (that.isSetPart()?that.getPart():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "part", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "part", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLength();
            boolean rhsFieldIsSet = that.isSetLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "length", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "length", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLightingAvailability();
            boolean rhsFieldIsSet = that.isSetLightingAvailability();
            List<VerticalStructureLightingStatusPropertyType> lhsField;
            lhsField = (this.isSetLightingAvailability()?this.getLightingAvailability():null);
            List<VerticalStructureLightingStatusPropertyType> rhsField;
            rhsField = (that.isSetLightingAvailability()?that.getLightingAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lightingAvailability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lightingAvailability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGroup();
            boolean rhsFieldIsSet = that.isSetGroup();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getGroup();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getGroup();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "group", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "group", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLightingICAOStandard();
            boolean rhsFieldIsSet = that.isSetLightingICAOStandard();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getLightingICAOStandard();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getLightingICAOStandard();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lightingICAOStandard", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lightingICAOStandard", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<VerticalStructureExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<VerticalStructureExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
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
            boolean lhsFieldIsSet = this.isSetSynchronisedLighting();
            boolean rhsFieldIsSet = that.isSetSynchronisedLighting();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSynchronisedLighting();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSynchronisedLighting();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "synchronisedLighting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "synchronisedLighting", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHostedNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetHostedNavaidEquipment();
            List<NavaidEquipmentPropertyType> lhsField;
            lhsField = (this.isSetHostedNavaidEquipment()?this.getHostedNavaidEquipment():null);
            List<NavaidEquipmentPropertyType> rhsField;
            rhsField = (that.isSetHostedNavaidEquipment()?that.getHostedNavaidEquipment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hostedNavaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hostedNavaidEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMarker();
            boolean rhsFieldIsSet = that.isSetMarker();
            JAXBElement<MarkerBeaconPropertyType> lhsField;
            lhsField = this.getMarker();
            JAXBElement<MarkerBeaconPropertyType> rhsField;
            rhsField = that.getMarker();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "marker", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "marker", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadius();
            boolean rhsFieldIsSet = that.isSetRadius();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRadius();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRadius();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radius", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radius", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeVerticalStructureType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeVerticalStructureType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHostedUnit();
            boolean rhsFieldIsSet = that.isSetHostedUnit();
            List<UnitPropertyType> lhsField;
            lhsField = (this.isSetHostedUnit()?this.getHostedUnit():null);
            List<UnitPropertyType> rhsField;
            rhsField = (that.isSetHostedUnit()?that.getHostedUnit():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hostedUnit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hostedUnit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHostedOrganisation();
            boolean rhsFieldIsSet = that.isSetHostedOrganisation();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetHostedOrganisation()?this.getHostedOrganisation():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetHostedOrganisation()?that.getHostedOrganisation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "hostedOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "hostedOrganisation", rhsField);
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeVerticalStructureType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLighted();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLighted();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lighted", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingICAOStandard();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMarkingICAOStandard();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingICAOStandard", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getGroup();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "group", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "length", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "width", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadius();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRadius();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radius", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLightingICAOStandard();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLightingICAOStandard();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lightingICAOStandard", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSynchronisedLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSynchronisedLighting();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "synchronisedLighting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarker();
            JAXBElement<MarkerBeaconPropertyType> theField;
            theField = this.getMarker();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "marker", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPart();
            List<VerticalStructurePartPropertyType> theField;
            theField = (this.isSetPart()?this.getPart():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "part", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedPassengerService();
            List<PassengerServicePropertyType> theField;
            theField = (this.isSetHostedPassengerService()?this.getHostedPassengerService():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hostedPassengerService", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSupportedGroundLight();
            List<GroundLightSystemPropertyType> theField;
            theField = (this.isSetSupportedGroundLight()?this.getSupportedGroundLight():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "supportedGroundLight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedNavaidEquipment();
            List<NavaidEquipmentPropertyType> theField;
            theField = (this.isSetHostedNavaidEquipment()?this.getHostedNavaidEquipment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hostedNavaidEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedSpecialNavStation();
            List<SpecialNavigationStationPropertyType> theField;
            theField = (this.isSetHostedSpecialNavStation()?this.getHostedSpecialNavStation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hostedSpecialNavStation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedUnit();
            List<UnitPropertyType> theField;
            theField = (this.isSetHostedUnit()?this.getHostedUnit():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hostedUnit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedOrganisation();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetHostedOrganisation()?this.getHostedOrganisation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "hostedOrganisation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSupportedService();
            List<ServicePropertyType> theField;
            theField = (this.isSetSupportedService()?this.getSupportedService():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "supportedService", theField);
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
            boolean theFieldIsSet = this.isSetLightingAvailability();
            List<VerticalStructureLightingStatusPropertyType> theField;
            theField = (this.isSetLightingAvailability()?this.getLightingAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lightingAvailability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<VerticalStructureExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeVerticalStructureType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLighted();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLighted();
            strategy.appendField(locator, this, "lighted", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingICAOStandard();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMarkingICAOStandard();
            strategy.appendField(locator, this, "markingICAOStandard", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGroup();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadius();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRadius();
            strategy.appendField(locator, this, "radius", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLightingICAOStandard();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getLightingICAOStandard();
            strategy.appendField(locator, this, "lightingICAOStandard", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSynchronisedLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSynchronisedLighting();
            strategy.appendField(locator, this, "synchronisedLighting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarker();
            JAXBElement<MarkerBeaconPropertyType> theField;
            theField = this.getMarker();
            strategy.appendField(locator, this, "marker", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPart();
            List<VerticalStructurePartPropertyType> theField;
            theField = (this.isSetPart()?this.getPart():null);
            strategy.appendField(locator, this, "part", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedPassengerService();
            List<PassengerServicePropertyType> theField;
            theField = (this.isSetHostedPassengerService()?this.getHostedPassengerService():null);
            strategy.appendField(locator, this, "hostedPassengerService", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSupportedGroundLight();
            List<GroundLightSystemPropertyType> theField;
            theField = (this.isSetSupportedGroundLight()?this.getSupportedGroundLight():null);
            strategy.appendField(locator, this, "supportedGroundLight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedNavaidEquipment();
            List<NavaidEquipmentPropertyType> theField;
            theField = (this.isSetHostedNavaidEquipment()?this.getHostedNavaidEquipment():null);
            strategy.appendField(locator, this, "hostedNavaidEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedSpecialNavStation();
            List<SpecialNavigationStationPropertyType> theField;
            theField = (this.isSetHostedSpecialNavStation()?this.getHostedSpecialNavStation():null);
            strategy.appendField(locator, this, "hostedSpecialNavStation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedUnit();
            List<UnitPropertyType> theField;
            theField = (this.isSetHostedUnit()?this.getHostedUnit():null);
            strategy.appendField(locator, this, "hostedUnit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHostedOrganisation();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetHostedOrganisation()?this.getHostedOrganisation():null);
            strategy.appendField(locator, this, "hostedOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSupportedService();
            List<ServicePropertyType> theField;
            theField = (this.isSetSupportedService()?this.getSupportedService():null);
            strategy.appendField(locator, this, "supportedService", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLightingAvailability();
            List<VerticalStructureLightingStatusPropertyType> theField;
            theField = (this.isSetLightingAvailability()?this.getLightingAvailability():null);
            strategy.appendField(locator, this, "lightingAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<VerticalStructureExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
