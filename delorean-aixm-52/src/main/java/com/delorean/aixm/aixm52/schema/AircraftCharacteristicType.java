
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for AircraftCharacteristicType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AircraftCharacteristicType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="engine" type="{http://www.aixm.aero/schema/5.2}CodeAircraftEngineType" minOccurs="0"/>
 *         <element name="numberEngine" type="{http://www.aixm.aero/schema/5.2}CodeAircraftEngineNumberType" minOccurs="0"/>
 *         <element name="typeAircraftICAO" type="{http://www.aixm.aero/schema/5.2}CodeAircraftICAOType" minOccurs="0"/>
 *         <element name="aircraftLandingCategory" type="{http://www.aixm.aero/schema/5.2}CodeAircraftLandingCategoryType" minOccurs="0"/>
 *         <element name="wingSpan" type="{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="wingSpanInterpretation" type="{http://www.aixm.aero/schema/5.2}CodeValueInterpretationType" minOccurs="0"/>
 *         <element name="classWingSpan" type="{http://www.aixm.aero/schema/5.2}CodeAircraftWingspanClassType" minOccurs="0"/>
 *         <element name="weight" type="{http://www.aixm.aero/schema/5.2}ValWeightType" minOccurs="0"/>
 *         <element name="weightInterpretation" type="{http://www.aixm.aero/schema/5.2}CodeValueInterpretationType" minOccurs="0"/>
 *         <element name="passengers" type="{http://www.aixm.aero/schema/5.2}NoNumberType" minOccurs="0"/>
 *         <element name="passengersInterpretation" type="{http://www.aixm.aero/schema/5.2}CodeValueInterpretationType" minOccurs="0"/>
 *         <element name="speed" type="{http://www.aixm.aero/schema/5.2}ValSpeedType" minOccurs="0"/>
 *         <element name="speedInterpretation" type="{http://www.aixm.aero/schema/5.2}CodeValueInterpretationType" minOccurs="0"/>
 *         <element name="wakeTurbulence" type="{http://www.aixm.aero/schema/5.2}CodeWakeTurbulenceType" minOccurs="0"/>
 *         <element name="navigationSpecification" type="{http://www.aixm.aero/schema/5.2}CodeNavigationSpecificationType" minOccurs="0"/>
 *         <element name="verticalSeparationCapability" type="{http://www.aixm.aero/schema/5.2}CodeRVSMType" minOccurs="0"/>
 *         <element name="antiCollisionAndSeparationEquipment" type="{http://www.aixm.aero/schema/5.2}CodeEquipmentAntiCollisionType" minOccurs="0"/>
 *         <element name="communicationEquipment" type="{http://www.aixm.aero/schema/5.2}CodeCommunicationModeType" minOccurs="0"/>
 *         <element name="surveillanceEquipment" type="{http://www.aixm.aero/schema/5.2}CodeTransponderType" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="category" type="{http://www.aixm.aero/schema/5.2}CodeAircraftCategoryType" minOccurs="0"/>
 *         <element name="navigationType" type="{http://www.aixm.aero/schema/5.2}CodeNavigationType" minOccurs="0"/>
 *         <element name="navigationAccuracy" type="{http://www.aixm.aero/schema/5.2}ValNavigationAccuracyType" minOccurs="0"/>
 *         <element name="dualFrequency" type="{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="helicopterPerformanceClass" type="{http://www.aixm.aero/schema/5.2}CodeHelicopterPerformanceClassType" minOccurs="0"/>
 *         <element name="radioNavigationEquipment" type="{http://www.aixm.aero/schema/5.2}AircraftNavigationEquipmentPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractAircraftCharacteristicExtension"/>
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
@XmlType(name = "AircraftCharacteristicType", propOrder = {
    "engine",
    "numberEngine",
    "typeAircraftICAO",
    "aircraftLandingCategory",
    "wingSpan",
    "wingSpanInterpretation",
    "classWingSpan",
    "weight",
    "weightInterpretation",
    "passengers",
    "passengersInterpretation",
    "speed",
    "speedInterpretation",
    "wakeTurbulence",
    "navigationSpecification",
    "verticalSeparationCapability",
    "antiCollisionAndSeparationEquipment",
    "communicationEquipment",
    "surveillanceEquipment",
    "annotation",
    "category",
    "navigationType",
    "navigationAccuracy",
    "dualFrequency",
    "helicopterPerformanceClass",
    "radioNavigationEquipment",
    "extension"
})
@Entity(name = "AircraftCharacteristicType")
@Table(name = "aircraftcharacteristic_o", schema = "shared")
public class AircraftCharacteristicType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "engine", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftEngineType> engine;
    @XmlElementRef(name = "numberEngine", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftEngineNumberType> numberEngine;
    @XmlElementRef(name = "typeAircraftICAO", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftICAOType> typeAircraftICAO;
    @XmlElementRef(name = "aircraftLandingCategory", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftLandingCategoryType> aircraftLandingCategory;
    @XmlElementRef(name = "wingSpan", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> wingSpan;
    @XmlElementRef(name = "wingSpanInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> wingSpanInterpretation;
    @XmlElementRef(name = "classWingSpan", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftWingspanClassType> classWingSpan;
    @XmlElementRef(name = "weight", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weight;
    @XmlElementRef(name = "weightInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> weightInterpretation;
    @XmlElementRef(name = "passengers", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> passengers;
    @XmlElementRef(name = "passengersInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> passengersInterpretation;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedInterpretation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> speedInterpretation;
    @XmlElementRef(name = "wakeTurbulence", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeWakeTurbulenceType> wakeTurbulence;
    @XmlElementRef(name = "navigationSpecification", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationSpecificationType> navigationSpecification;
    @XmlElementRef(name = "verticalSeparationCapability", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRVSMType> verticalSeparationCapability;
    @XmlElementRef(name = "antiCollisionAndSeparationEquipment", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeEquipmentAntiCollisionType> antiCollisionAndSeparationEquipment;
    @XmlElementRef(name = "communicationEquipment", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationModeType> communicationEquipment;
    @XmlElementRef(name = "surveillanceEquipment", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTransponderType> surveillanceEquipment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "category", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftCategoryType> category;
    @XmlElementRef(name = "navigationType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationType> navigationType;
    @XmlElementRef(name = "navigationAccuracy", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValNavigationAccuracyType> navigationAccuracy;
    @XmlElementRef(name = "dualFrequency", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dualFrequency;
    @XmlElementRef(name = "helicopterPerformanceClass", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHelicopterPerformanceClassType> helicopterPerformanceClass;
    @XmlElement(nillable = true)
    protected List<AircraftNavigationEquipmentPropertyType> radioNavigationEquipment;
    protected List<AircraftCharacteristicExtensionType> extension;

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftEngineType> getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineType }{@code >}
     *     
     */
    public void setEngine(JAXBElement<CodeAircraftEngineType> value) {
        this.engine = value;
    }

    @Transient
    public boolean isSetEngine() {
        return (this.engine!= null);
    }

    /**
     * Gets the value of the numberEngine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftEngineNumberType> getNumberEngine() {
        return numberEngine;
    }

    /**
     * Sets the value of the numberEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineNumberType }{@code >}
     *     
     */
    public void setNumberEngine(JAXBElement<CodeAircraftEngineNumberType> value) {
        this.numberEngine = value;
    }

    @Transient
    public boolean isSetNumberEngine() {
        return (this.numberEngine!= null);
    }

    /**
     * Gets the value of the typeAircraftICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftICAOType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftICAOType> getTypeAircraftICAO() {
        return typeAircraftICAO;
    }

    /**
     * Sets the value of the typeAircraftICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftICAOType }{@code >}
     *     
     */
    public void setTypeAircraftICAO(JAXBElement<CodeAircraftICAOType> value) {
        this.typeAircraftICAO = value;
    }

    @Transient
    public boolean isSetTypeAircraftICAO() {
        return (this.typeAircraftICAO!= null);
    }

    /**
     * Gets the value of the aircraftLandingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftLandingCategoryType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftLandingCategoryType> getAircraftLandingCategory() {
        return aircraftLandingCategory;
    }

    /**
     * Sets the value of the aircraftLandingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftLandingCategoryType }{@code >}
     *     
     */
    public void setAircraftLandingCategory(JAXBElement<CodeAircraftLandingCategoryType> value) {
        this.aircraftLandingCategory = value;
    }

    @Transient
    public boolean isSetAircraftLandingCategory() {
        return (this.aircraftLandingCategory!= null);
    }

    /**
     * Gets the value of the wingSpan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWingSpan() {
        return wingSpan;
    }

    /**
     * Sets the value of the wingSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWingSpan(JAXBElement<ValDistanceType> value) {
        this.wingSpan = value;
    }

    @Transient
    public boolean isSetWingSpan() {
        return (this.wingSpan!= null);
    }

    /**
     * Gets the value of the wingSpanInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeValueInterpretationType> getWingSpanInterpretation() {
        return wingSpanInterpretation;
    }

    /**
     * Sets the value of the wingSpanInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setWingSpanInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.wingSpanInterpretation = value;
    }

    @Transient
    public boolean isSetWingSpanInterpretation() {
        return (this.wingSpanInterpretation!= null);
    }

    /**
     * Gets the value of the classWingSpan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftWingspanClassType> getClassWingSpan() {
        return classWingSpan;
    }

    /**
     * Sets the value of the classWingSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    public void setClassWingSpan(JAXBElement<CodeAircraftWingspanClassType> value) {
        this.classWingSpan = value;
    }

    @Transient
    public boolean isSetClassWingSpan() {
        return (this.classWingSpan!= null);
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValWeightType> getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeight(JAXBElement<ValWeightType> value) {
        this.weight = value;
    }

    @Transient
    public boolean isSetWeight() {
        return (this.weight!= null);
    }

    /**
     * Gets the value of the weightInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeValueInterpretationType> getWeightInterpretation() {
        return weightInterpretation;
    }

    /**
     * Sets the value of the weightInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setWeightInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.weightInterpretation = value;
    }

    @Transient
    public boolean isSetWeightInterpretation() {
        return (this.weightInterpretation!= null);
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<NoNumberType> value) {
        this.passengers = value;
    }

    @Transient
    public boolean isSetPassengers() {
        return (this.passengers!= null);
    }

    /**
     * Gets the value of the passengersInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeValueInterpretationType> getPassengersInterpretation() {
        return passengersInterpretation;
    }

    /**
     * Sets the value of the passengersInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setPassengersInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.passengersInterpretation = value;
    }

    @Transient
    public boolean isSetPassengersInterpretation() {
        return (this.passengersInterpretation!= null);
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    @Transient
    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    /**
     * Gets the value of the speedInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeValueInterpretationType> getSpeedInterpretation() {
        return speedInterpretation;
    }

    /**
     * Sets the value of the speedInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setSpeedInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.speedInterpretation = value;
    }

    @Transient
    public boolean isSetSpeedInterpretation() {
        return (this.speedInterpretation!= null);
    }

    /**
     * Gets the value of the wakeTurbulence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeWakeTurbulenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeWakeTurbulenceType> getWakeTurbulence() {
        return wakeTurbulence;
    }

    /**
     * Sets the value of the wakeTurbulence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeWakeTurbulenceType }{@code >}
     *     
     */
    public void setWakeTurbulence(JAXBElement<CodeWakeTurbulenceType> value) {
        this.wakeTurbulence = value;
    }

    @Transient
    public boolean isSetWakeTurbulence() {
        return (this.wakeTurbulence!= null);
    }

    /**
     * Gets the value of the navigationSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationSpecificationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavigationSpecificationType> getNavigationSpecification() {
        return navigationSpecification;
    }

    /**
     * Sets the value of the navigationSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationSpecificationType }{@code >}
     *     
     */
    public void setNavigationSpecification(JAXBElement<CodeNavigationSpecificationType> value) {
        this.navigationSpecification = value;
    }

    @Transient
    public boolean isSetNavigationSpecification() {
        return (this.navigationSpecification!= null);
    }

    /**
     * Gets the value of the verticalSeparationCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRVSMType> getVerticalSeparationCapability() {
        return verticalSeparationCapability;
    }

    /**
     * Sets the value of the verticalSeparationCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public void setVerticalSeparationCapability(JAXBElement<CodeRVSMType> value) {
        this.verticalSeparationCapability = value;
    }

    @Transient
    public boolean isSetVerticalSeparationCapability() {
        return (this.verticalSeparationCapability!= null);
    }

    /**
     * Gets the value of the antiCollisionAndSeparationEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentAntiCollisionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeEquipmentAntiCollisionType> getAntiCollisionAndSeparationEquipment() {
        return antiCollisionAndSeparationEquipment;
    }

    /**
     * Sets the value of the antiCollisionAndSeparationEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentAntiCollisionType }{@code >}
     *     
     */
    public void setAntiCollisionAndSeparationEquipment(JAXBElement<CodeEquipmentAntiCollisionType> value) {
        this.antiCollisionAndSeparationEquipment = value;
    }

    @Transient
    public boolean isSetAntiCollisionAndSeparationEquipment() {
        return (this.antiCollisionAndSeparationEquipment!= null);
    }

    /**
     * Gets the value of the communicationEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCommunicationModeType> getCommunicationEquipment() {
        return communicationEquipment;
    }

    /**
     * Sets the value of the communicationEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public void setCommunicationEquipment(JAXBElement<CodeCommunicationModeType> value) {
        this.communicationEquipment = value;
    }

    @Transient
    public boolean isSetCommunicationEquipment() {
        return (this.communicationEquipment!= null);
    }

    /**
     * Gets the value of the surveillanceEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTransponderType> getSurveillanceEquipment() {
        return surveillanceEquipment;
    }

    /**
     * Sets the value of the surveillanceEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public void setSurveillanceEquipment(JAXBElement<CodeTransponderType> value) {
        this.surveillanceEquipment = value;
    }

    @Transient
    public boolean isSetSurveillanceEquipment() {
        return (this.surveillanceEquipment!= null);
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
    @JoinTable(name = "arcrftchrctrstctp_annttn_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "aircraftcharacteristic_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftCategoryType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAircraftCategoryType> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftCategoryType }{@code >}
     *     
     */
    public void setCategory(JAXBElement<CodeAircraftCategoryType> value) {
        this.category = value;
    }

    @Transient
    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the navigationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavigationType> getNavigationType() {
        return navigationType;
    }

    /**
     * Sets the value of the navigationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationType }{@code >}
     *     
     */
    public void setNavigationType(JAXBElement<CodeNavigationType> value) {
        this.navigationType = value;
    }

    @Transient
    public boolean isSetNavigationType() {
        return (this.navigationType!= null);
    }

    /**
     * Gets the value of the navigationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValNavigationAccuracyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValNavigationAccuracyType> getNavigationAccuracy() {
        return navigationAccuracy;
    }

    /**
     * Sets the value of the navigationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValNavigationAccuracyType }{@code >}
     *     
     */
    public void setNavigationAccuracy(JAXBElement<ValNavigationAccuracyType> value) {
        this.navigationAccuracy = value;
    }

    @Transient
    public boolean isSetNavigationAccuracy() {
        return (this.navigationAccuracy!= null);
    }

    /**
     * Gets the value of the dualFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getDualFrequency() {
        return dualFrequency;
    }

    /**
     * Sets the value of the dualFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDualFrequency(JAXBElement<CodeYesNoType> value) {
        this.dualFrequency = value;
    }

    @Transient
    public boolean isSetDualFrequency() {
        return (this.dualFrequency!= null);
    }

    /**
     * Gets the value of the helicopterPerformanceClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHelicopterPerformanceClassType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeHelicopterPerformanceClassType> getHelicopterPerformanceClass() {
        return helicopterPerformanceClass;
    }

    /**
     * Sets the value of the helicopterPerformanceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHelicopterPerformanceClassType }{@code >}
     *     
     */
    public void setHelicopterPerformanceClass(JAXBElement<CodeHelicopterPerformanceClassType> value) {
        this.helicopterPerformanceClass = value;
    }

    @Transient
    public boolean isSetHelicopterPerformanceClass() {
        return (this.helicopterPerformanceClass!= null);
    }

    /**
     * Gets the value of the radioNavigationEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioNavigationEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioNavigationEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftNavigationEquipmentPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = AircraftNavigationEquipmentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "arcrftchrctrstctp_rdnvgtneqpmnt_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "aircraftcharacteristic_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "radionavigationequipment_hjid", referencedColumnName = "hjid")
    })
    public List<AircraftNavigationEquipmentPropertyType> getRadioNavigationEquipment() {
        if (radioNavigationEquipment == null) {
            radioNavigationEquipment = new ArrayList<>();
        }
        return this.radioNavigationEquipment;
    }

    /**
     * 
     * 
     */
    public void setRadioNavigationEquipment(List<AircraftNavigationEquipmentPropertyType> radioNavigationEquipment) {
        this.radioNavigationEquipment = radioNavigationEquipment;
    }

    @Transient
    public boolean isSetRadioNavigationEquipment() {
        return ((this.radioNavigationEquipment!= null)&&(!this.radioNavigationEquipment.isEmpty()));
    }

    public void unsetRadioNavigationEquipment() {
        this.radioNavigationEquipment = null;
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
     * {@link AircraftCharacteristicExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AircraftCharacteristicExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraftcharacteristic_oe_hjid", referencedColumnName = "hjid")
    public List<AircraftCharacteristicExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AircraftCharacteristicExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "engine", columnDefinition = "codeaircraftenginebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "enginenilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftEngineType getEngineItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftEngineType.class, this.getEngine());
    }

    public void setEngineItem(CodeAircraftEngineType target) {
        setEngine(XmlAdapterUtils.marshallJAXBElement(CodeAircraftEngineType.class, new QName("http://www.aixm.aero/schema/5.2", "engine"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "numberengine", columnDefinition = "codeaircraftenginenumberbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "numberenginenilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftEngineNumberType getNumberEngineItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftEngineNumberType.class, this.getNumberEngine());
    }

    public void setNumberEngineItem(CodeAircraftEngineNumberType target) {
        setNumberEngine(XmlAdapterUtils.marshallJAXBElement(CodeAircraftEngineNumberType.class, new QName("http://www.aixm.aero/schema/5.2", "numberEngine"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "typeaircrafticao", columnDefinition = "alphanumeric")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "typeaircrafticaonilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftICAOType getTypeAircraftICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftICAOType.class, this.getTypeAircraftICAO());
    }

    public void setTypeAircraftICAOItem(CodeAircraftICAOType target) {
        setTypeAircraftICAO(XmlAdapterUtils.marshallJAXBElement(CodeAircraftICAOType.class, new QName("http://www.aixm.aero/schema/5.2", "typeAircraftICAO"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "aircraftlandingcategory", columnDefinition = "codeaircraftlandingcategorybase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "aircraftlandingcategorynilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftLandingCategoryType getAircraftLandingCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftLandingCategoryType.class, this.getAircraftLandingCategory());
    }

    public void setAircraftLandingCategoryItem(CodeAircraftLandingCategoryType target) {
        setAircraftLandingCategory(XmlAdapterUtils.marshallJAXBElement(CodeAircraftLandingCategoryType.class, new QName("http://www.aixm.aero/schema/5.2", "aircraftLandingCategory"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "wingspan", columnDefinition = "valdistancebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "wingspanuom", columnDefinition = "uomdistance")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "wingspanaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "wingspannilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceType getWingSpanItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWingSpan());
    }

    public void setWingSpanItem(ValDistanceType target) {
        setWingSpan(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.2", "wingSpan"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "wingspaninterpretation", columnDefinition = "codevalueinterpretationbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "wingspaninterpretationnilreason", columnDefinition = "nilreason"))
    })
    public CodeValueInterpretationType getWingSpanInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeValueInterpretationType.class, this.getWingSpanInterpretation());
    }

    public void setWingSpanInterpretationItem(CodeValueInterpretationType target) {
        setWingSpanInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeValueInterpretationType.class, new QName("http://www.aixm.aero/schema/5.2", "wingSpanInterpretation"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "classwingspan", columnDefinition = "codeaircraftwingspanclassbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "classwingspannilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftWingspanClassType getClassWingSpanItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftWingspanClassType.class, this.getClassWingSpan());
    }

    public void setClassWingSpanItem(CodeAircraftWingspanClassType target) {
        setClassWingSpan(XmlAdapterUtils.marshallJAXBElement(CodeAircraftWingspanClassType.class, new QName("http://www.aixm.aero/schema/5.2", "classWingSpan"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "weight", columnDefinition = "valweightbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "weightuom", columnDefinition = "uomweight")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "weightnilreason", columnDefinition = "nilreason"))
    })
    public ValWeightType getWeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValWeightType.class, this.getWeight());
    }

    public void setWeightItem(ValWeightType target) {
        setWeight(XmlAdapterUtils.marshallJAXBElement(ValWeightType.class, new QName("http://www.aixm.aero/schema/5.2", "weight"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "weightinterpretation", columnDefinition = "codevalueinterpretationbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "weightinterpretationnilreason", columnDefinition = "nilreason"))
    })
    public CodeValueInterpretationType getWeightInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeValueInterpretationType.class, this.getWeightInterpretation());
    }

    public void setWeightInterpretationItem(CodeValueInterpretationType target) {
        setWeightInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeValueInterpretationType.class, new QName("http://www.aixm.aero/schema/5.2", "weightInterpretation"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "passengers", columnDefinition = "nonumberbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "passengersnilreason", columnDefinition = "nilreason"))
    })
    public NoNumberType getPassengersItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getPassengers());
    }

    public void setPassengersItem(NoNumberType target) {
        setPassengers(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.2", "passengers"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "passengersinterpretation", columnDefinition = "codevalueinterpretationbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "passengersinterpretationnilreason", columnDefinition = "nilreason"))
    })
    public CodeValueInterpretationType getPassengersInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeValueInterpretationType.class, this.getPassengersInterpretation());
    }

    public void setPassengersInterpretationItem(CodeValueInterpretationType target) {
        setPassengersInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeValueInterpretationType.class, new QName("http://www.aixm.aero/schema/5.2", "passengersInterpretation"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speed", columnDefinition = "valspeedbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "speeduom", columnDefinition = "uomspeed")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speednilreason", columnDefinition = "nilreason"))
    })
    public ValSpeedType getSpeedItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeed());
    }

    public void setSpeedItem(ValSpeedType target) {
        setSpeed(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.2", "speed"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speedinterpretation", columnDefinition = "codevalueinterpretationbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speedinterpretationnilreason", columnDefinition = "nilreason"))
    })
    public CodeValueInterpretationType getSpeedInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeValueInterpretationType.class, this.getSpeedInterpretation());
    }

    public void setSpeedInterpretationItem(CodeValueInterpretationType target) {
        setSpeedInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeValueInterpretationType.class, new QName("http://www.aixm.aero/schema/5.2", "speedInterpretation"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "waketurbulence", columnDefinition = "codewaketurbulencebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "waketurbulencenilreason", columnDefinition = "nilreason"))
    })
    public CodeWakeTurbulenceType getWakeTurbulenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeWakeTurbulenceType.class, this.getWakeTurbulence());
    }

    public void setWakeTurbulenceItem(CodeWakeTurbulenceType target) {
        setWakeTurbulence(XmlAdapterUtils.marshallJAXBElement(CodeWakeTurbulenceType.class, new QName("http://www.aixm.aero/schema/5.2", "wakeTurbulence"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "navigationspecification", columnDefinition = "codenavigationspecificationbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "navigationspecificationnilreason", columnDefinition = "nilreason"))
    })
    public CodeNavigationSpecificationType getNavigationSpecificationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavigationSpecificationType.class, this.getNavigationSpecification());
    }

    public void setNavigationSpecificationItem(CodeNavigationSpecificationType target) {
        setNavigationSpecification(XmlAdapterUtils.marshallJAXBElement(CodeNavigationSpecificationType.class, new QName("http://www.aixm.aero/schema/5.2", "navigationSpecification"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticalseparationcapability", columnDefinition = "codervsmbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalseparationcapabilitynilreason", columnDefinition = "nilreason"))
    })
    public CodeRVSMType getVerticalSeparationCapabilityItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRVSMType.class, this.getVerticalSeparationCapability());
    }

    public void setVerticalSeparationCapabilityItem(CodeRVSMType target) {
        setVerticalSeparationCapability(XmlAdapterUtils.marshallJAXBElement(CodeRVSMType.class, new QName("http://www.aixm.aero/schema/5.2", "verticalSeparationCapability"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "anticollisionandseparationequipment", columnDefinition = "codeequipmentanticollisionbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "anticollisionandseparationequipmentnilreason", columnDefinition = "nilreason"))
    })
    public CodeEquipmentAntiCollisionType getAntiCollisionAndSeparationEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeEquipmentAntiCollisionType.class, this.getAntiCollisionAndSeparationEquipment());
    }

    public void setAntiCollisionAndSeparationEquipmentItem(CodeEquipmentAntiCollisionType target) {
        setAntiCollisionAndSeparationEquipment(XmlAdapterUtils.marshallJAXBElement(CodeEquipmentAntiCollisionType.class, new QName("http://www.aixm.aero/schema/5.2", "antiCollisionAndSeparationEquipment"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "communicationequipment", columnDefinition = "codecommunicationmodebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "communicationequipmentnilreason", columnDefinition = "nilreason"))
    })
    public CodeCommunicationModeType getCommunicationEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCommunicationModeType.class, this.getCommunicationEquipment());
    }

    public void setCommunicationEquipmentItem(CodeCommunicationModeType target) {
        setCommunicationEquipment(XmlAdapterUtils.marshallJAXBElement(CodeCommunicationModeType.class, new QName("http://www.aixm.aero/schema/5.2", "communicationEquipment"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "surveillanceequipment", columnDefinition = "codetransponderbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "surveillanceequipmentnilreason", columnDefinition = "nilreason"))
    })
    public CodeTransponderType getSurveillanceEquipmentItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTransponderType.class, this.getSurveillanceEquipment());
    }

    public void setSurveillanceEquipmentItem(CodeTransponderType target) {
        setSurveillanceEquipment(XmlAdapterUtils.marshallJAXBElement(CodeTransponderType.class, new QName("http://www.aixm.aero/schema/5.2", "surveillanceEquipment"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "category", columnDefinition = "codeaircraftcategorybase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "categorynilreason", columnDefinition = "nilreason"))
    })
    public CodeAircraftCategoryType getCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAircraftCategoryType.class, this.getCategory());
    }

    public void setCategoryItem(CodeAircraftCategoryType target) {
        setCategory(XmlAdapterUtils.marshallJAXBElement(CodeAircraftCategoryType.class, new QName("http://www.aixm.aero/schema/5.2", "category"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "navigationtype", columnDefinition = "codenavigationbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "navigationtypenilreason", columnDefinition = "nilreason"))
    })
    public CodeNavigationType getNavigationTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavigationType.class, this.getNavigationType());
    }

    public void setNavigationTypeItem(CodeNavigationType target) {
        setNavigationType(XmlAdapterUtils.marshallJAXBElement(CodeNavigationType.class, new QName("http://www.aixm.aero/schema/5.2", "navigationType"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "navigationaccuracy", columnDefinition = "valnavigationaccuracybase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "navigationaccuracynilreason", columnDefinition = "nilreason"))
    })
    public ValNavigationAccuracyType getNavigationAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValNavigationAccuracyType.class, this.getNavigationAccuracy());
    }

    public void setNavigationAccuracyItem(ValNavigationAccuracyType target) {
        setNavigationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValNavigationAccuracyType.class, new QName("http://www.aixm.aero/schema/5.2", "navigationAccuracy"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "dualfrequency", columnDefinition = "codeyesnobase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "dualfrequencynilreason", columnDefinition = "nilreason"))
    })
    public CodeYesNoType getDualFrequencyItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDualFrequency());
    }

    public void setDualFrequencyItem(CodeYesNoType target) {
        setDualFrequency(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.2", "dualFrequency"), AircraftCharacteristicType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "helicopterperformanceclass", columnDefinition = "codehelicopterperformanceclassbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "helicopterperformanceclassnilreason", columnDefinition = "nilreason"))
    })
    public CodeHelicopterPerformanceClassType getHelicopterPerformanceClassItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHelicopterPerformanceClassType.class, this.getHelicopterPerformanceClass());
    }

    public void setHelicopterPerformanceClassItem(CodeHelicopterPerformanceClassType target) {
        setHelicopterPerformanceClass(XmlAdapterUtils.marshallJAXBElement(CodeHelicopterPerformanceClassType.class, new QName("http://www.aixm.aero/schema/5.2", "helicopterPerformanceClass"), AircraftCharacteristicType.class, target));
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
        final AircraftCharacteristicType that = ((AircraftCharacteristicType) object);
        {
            boolean lhsFieldIsSet = this.isSetTypeAircraftICAO();
            boolean rhsFieldIsSet = that.isSetTypeAircraftICAO();
            JAXBElement<CodeAircraftICAOType> lhsField;
            lhsField = this.getTypeAircraftICAO();
            JAXBElement<CodeAircraftICAOType> rhsField;
            rhsField = that.getTypeAircraftICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "typeAircraftICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "typeAircraftICAO", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeedInterpretation();
            boolean rhsFieldIsSet = that.isSetSpeedInterpretation();
            JAXBElement<CodeValueInterpretationType> lhsField;
            lhsField = this.getSpeedInterpretation();
            JAXBElement<CodeValueInterpretationType> rhsField;
            rhsField = that.getSpeedInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speedInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speedInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCommunicationEquipment();
            boolean rhsFieldIsSet = that.isSetCommunicationEquipment();
            JAXBElement<CodeCommunicationModeType> lhsField;
            lhsField = this.getCommunicationEquipment();
            JAXBElement<CodeCommunicationModeType> rhsField;
            rhsField = that.getCommunicationEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "communicationEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "communicationEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHelicopterPerformanceClass();
            boolean rhsFieldIsSet = that.isSetHelicopterPerformanceClass();
            JAXBElement<CodeHelicopterPerformanceClassType> lhsField;
            lhsField = this.getHelicopterPerformanceClass();
            JAXBElement<CodeHelicopterPerformanceClassType> rhsField;
            rhsField = that.getHelicopterPerformanceClass();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "helicopterPerformanceClass", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "helicopterPerformanceClass", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNumberEngine();
            boolean rhsFieldIsSet = that.isSetNumberEngine();
            JAXBElement<CodeAircraftEngineNumberType> lhsField;
            lhsField = this.getNumberEngine();
            JAXBElement<CodeAircraftEngineNumberType> rhsField;
            rhsField = that.getNumberEngine();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "numberEngine", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "numberEngine", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCategory();
            boolean rhsFieldIsSet = that.isSetCategory();
            JAXBElement<CodeAircraftCategoryType> lhsField;
            lhsField = this.getCategory();
            JAXBElement<CodeAircraftCategoryType> rhsField;
            rhsField = that.getCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "category", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "category", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftLandingCategory();
            boolean rhsFieldIsSet = that.isSetAircraftLandingCategory();
            JAXBElement<CodeAircraftLandingCategoryType> lhsField;
            lhsField = this.getAircraftLandingCategory();
            JAXBElement<CodeAircraftLandingCategoryType> rhsField;
            rhsField = that.getAircraftLandingCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftLandingCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftLandingCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavigationType();
            boolean rhsFieldIsSet = that.isSetNavigationType();
            JAXBElement<CodeNavigationType> lhsField;
            lhsField = this.getNavigationType();
            JAXBElement<CodeNavigationType> rhsField;
            rhsField = that.getNavigationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navigationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navigationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWingSpan();
            boolean rhsFieldIsSet = that.isSetWingSpan();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWingSpan();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWingSpan();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "wingSpan", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "wingSpan", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRadioNavigationEquipment();
            boolean rhsFieldIsSet = that.isSetRadioNavigationEquipment();
            List<AircraftNavigationEquipmentPropertyType> lhsField;
            lhsField = (this.isSetRadioNavigationEquipment()?this.getRadioNavigationEquipment():null);
            List<AircraftNavigationEquipmentPropertyType> rhsField;
            rhsField = (that.isSetRadioNavigationEquipment()?that.getRadioNavigationEquipment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "radioNavigationEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "radioNavigationEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalSeparationCapability();
            boolean rhsFieldIsSet = that.isSetVerticalSeparationCapability();
            JAXBElement<CodeRVSMType> lhsField;
            lhsField = this.getVerticalSeparationCapability();
            JAXBElement<CodeRVSMType> rhsField;
            rhsField = that.getVerticalSeparationCapability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalSeparationCapability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalSeparationCapability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWeight();
            boolean rhsFieldIsSet = that.isSetWeight();
            JAXBElement<ValWeightType> lhsField;
            lhsField = this.getWeight();
            JAXBElement<ValWeightType> rhsField;
            rhsField = that.getWeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "weight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "weight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurveillanceEquipment();
            boolean rhsFieldIsSet = that.isSetSurveillanceEquipment();
            JAXBElement<CodeTransponderType> lhsField;
            lhsField = this.getSurveillanceEquipment();
            JAXBElement<CodeTransponderType> rhsField;
            rhsField = that.getSurveillanceEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surveillanceEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surveillanceEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWingSpanInterpretation();
            boolean rhsFieldIsSet = that.isSetWingSpanInterpretation();
            JAXBElement<CodeValueInterpretationType> lhsField;
            lhsField = this.getWingSpanInterpretation();
            JAXBElement<CodeValueInterpretationType> rhsField;
            rhsField = that.getWingSpanInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "wingSpanInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "wingSpanInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpeed();
            boolean rhsFieldIsSet = that.isSetSpeed();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getSpeed();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getSpeed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWakeTurbulence();
            boolean rhsFieldIsSet = that.isSetWakeTurbulence();
            JAXBElement<CodeWakeTurbulenceType> lhsField;
            lhsField = this.getWakeTurbulence();
            JAXBElement<CodeWakeTurbulenceType> rhsField;
            rhsField = that.getWakeTurbulence();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "wakeTurbulence", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "wakeTurbulence", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAntiCollisionAndSeparationEquipment();
            boolean rhsFieldIsSet = that.isSetAntiCollisionAndSeparationEquipment();
            JAXBElement<CodeEquipmentAntiCollisionType> lhsField;
            lhsField = this.getAntiCollisionAndSeparationEquipment();
            JAXBElement<CodeEquipmentAntiCollisionType> rhsField;
            rhsField = that.getAntiCollisionAndSeparationEquipment();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "antiCollisionAndSeparationEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "antiCollisionAndSeparationEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPassengers();
            boolean rhsFieldIsSet = that.isSetPassengers();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getPassengers();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getPassengers();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "passengers", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "passengers", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEngine();
            boolean rhsFieldIsSet = that.isSetEngine();
            JAXBElement<CodeAircraftEngineType> lhsField;
            lhsField = this.getEngine();
            JAXBElement<CodeAircraftEngineType> rhsField;
            rhsField = that.getEngine();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "engine", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "engine", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPassengersInterpretation();
            boolean rhsFieldIsSet = that.isSetPassengersInterpretation();
            JAXBElement<CodeValueInterpretationType> lhsField;
            lhsField = this.getPassengersInterpretation();
            JAXBElement<CodeValueInterpretationType> rhsField;
            rhsField = that.getPassengersInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "passengersInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "passengersInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AircraftCharacteristicExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AircraftCharacteristicExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWeightInterpretation();
            boolean rhsFieldIsSet = that.isSetWeightInterpretation();
            JAXBElement<CodeValueInterpretationType> lhsField;
            lhsField = this.getWeightInterpretation();
            JAXBElement<CodeValueInterpretationType> rhsField;
            rhsField = that.getWeightInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "weightInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "weightInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClassWingSpan();
            boolean rhsFieldIsSet = that.isSetClassWingSpan();
            JAXBElement<CodeAircraftWingspanClassType> lhsField;
            lhsField = this.getClassWingSpan();
            JAXBElement<CodeAircraftWingspanClassType> rhsField;
            rhsField = that.getClassWingSpan();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classWingSpan", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classWingSpan", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDualFrequency();
            boolean rhsFieldIsSet = that.isSetDualFrequency();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getDualFrequency();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getDualFrequency();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dualFrequency", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dualFrequency", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavigationAccuracy();
            boolean rhsFieldIsSet = that.isSetNavigationAccuracy();
            JAXBElement<ValNavigationAccuracyType> lhsField;
            lhsField = this.getNavigationAccuracy();
            JAXBElement<ValNavigationAccuracyType> rhsField;
            rhsField = that.getNavigationAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navigationAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navigationAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavigationSpecification();
            boolean rhsFieldIsSet = that.isSetNavigationSpecification();
            JAXBElement<CodeNavigationSpecificationType> lhsField;
            lhsField = this.getNavigationSpecification();
            JAXBElement<CodeNavigationSpecificationType> rhsField;
            rhsField = that.getNavigationSpecification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navigationSpecification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navigationSpecification", rhsField);
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
            boolean theFieldIsSet = this.isSetEngine();
            JAXBElement<CodeAircraftEngineType> theField;
            theField = this.getEngine();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "engine", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumberEngine();
            JAXBElement<CodeAircraftEngineNumberType> theField;
            theField = this.getNumberEngine();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "numberEngine", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTypeAircraftICAO();
            JAXBElement<CodeAircraftICAOType> theField;
            theField = this.getTypeAircraftICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "typeAircraftICAO", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftLandingCategory();
            JAXBElement<CodeAircraftLandingCategoryType> theField;
            theField = this.getAircraftLandingCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftLandingCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWingSpan();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWingSpan();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "wingSpan", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWingSpanInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getWingSpanInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "wingSpanInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassWingSpan();
            JAXBElement<CodeAircraftWingspanClassType> theField;
            theField = this.getClassWingSpan();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classWingSpan", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeight();
            JAXBElement<ValWeightType> theField;
            theField = this.getWeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "weight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeightInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getWeightInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "weightInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPassengers();
            JAXBElement<NoNumberType> theField;
            theField = this.getPassengers();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "passengers", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPassengersInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getPassengersInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "passengersInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speed", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getSpeedInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speedInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWakeTurbulence();
            JAXBElement<CodeWakeTurbulenceType> theField;
            theField = this.getWakeTurbulence();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "wakeTurbulence", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationSpecification();
            JAXBElement<CodeNavigationSpecificationType> theField;
            theField = this.getNavigationSpecification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationSpecification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalSeparationCapability();
            JAXBElement<CodeRVSMType> theField;
            theField = this.getVerticalSeparationCapability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalSeparationCapability", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAntiCollisionAndSeparationEquipment();
            JAXBElement<CodeEquipmentAntiCollisionType> theField;
            theField = this.getAntiCollisionAndSeparationEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "antiCollisionAndSeparationEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCommunicationEquipment();
            JAXBElement<CodeCommunicationModeType> theField;
            theField = this.getCommunicationEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "communicationEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurveillanceEquipment();
            JAXBElement<CodeTransponderType> theField;
            theField = this.getSurveillanceEquipment();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surveillanceEquipment", theField);
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
            boolean theFieldIsSet = this.isSetCategory();
            JAXBElement<CodeAircraftCategoryType> theField;
            theField = this.getCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "category", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationType();
            JAXBElement<CodeNavigationType> theField;
            theField = this.getNavigationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationAccuracy();
            JAXBElement<ValNavigationAccuracyType> theField;
            theField = this.getNavigationAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDualFrequency();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDualFrequency();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dualFrequency", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHelicopterPerformanceClass();
            JAXBElement<CodeHelicopterPerformanceClassType> theField;
            theField = this.getHelicopterPerformanceClass();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "helicopterPerformanceClass", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioNavigationEquipment();
            List<AircraftNavigationEquipmentPropertyType> theField;
            theField = (this.isSetRadioNavigationEquipment()?this.getRadioNavigationEquipment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "radioNavigationEquipment", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AircraftCharacteristicExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetEngine();
            JAXBElement<CodeAircraftEngineType> theField;
            theField = this.getEngine();
            strategy.appendField(locator, this, "engine", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNumberEngine();
            JAXBElement<CodeAircraftEngineNumberType> theField;
            theField = this.getNumberEngine();
            strategy.appendField(locator, this, "numberEngine", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTypeAircraftICAO();
            JAXBElement<CodeAircraftICAOType> theField;
            theField = this.getTypeAircraftICAO();
            strategy.appendField(locator, this, "typeAircraftICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftLandingCategory();
            JAXBElement<CodeAircraftLandingCategoryType> theField;
            theField = this.getAircraftLandingCategory();
            strategy.appendField(locator, this, "aircraftLandingCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWingSpan();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWingSpan();
            strategy.appendField(locator, this, "wingSpan", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWingSpanInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getWingSpanInterpretation();
            strategy.appendField(locator, this, "wingSpanInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassWingSpan();
            JAXBElement<CodeAircraftWingspanClassType> theField;
            theField = this.getClassWingSpan();
            strategy.appendField(locator, this, "classWingSpan", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeight();
            JAXBElement<ValWeightType> theField;
            theField = this.getWeight();
            strategy.appendField(locator, this, "weight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeightInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getWeightInterpretation();
            strategy.appendField(locator, this, "weightInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPassengers();
            JAXBElement<NoNumberType> theField;
            theField = this.getPassengers();
            strategy.appendField(locator, this, "passengers", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPassengersInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getPassengersInterpretation();
            strategy.appendField(locator, this, "passengersInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeedInterpretation();
            JAXBElement<CodeValueInterpretationType> theField;
            theField = this.getSpeedInterpretation();
            strategy.appendField(locator, this, "speedInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWakeTurbulence();
            JAXBElement<CodeWakeTurbulenceType> theField;
            theField = this.getWakeTurbulence();
            strategy.appendField(locator, this, "wakeTurbulence", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationSpecification();
            JAXBElement<CodeNavigationSpecificationType> theField;
            theField = this.getNavigationSpecification();
            strategy.appendField(locator, this, "navigationSpecification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalSeparationCapability();
            JAXBElement<CodeRVSMType> theField;
            theField = this.getVerticalSeparationCapability();
            strategy.appendField(locator, this, "verticalSeparationCapability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAntiCollisionAndSeparationEquipment();
            JAXBElement<CodeEquipmentAntiCollisionType> theField;
            theField = this.getAntiCollisionAndSeparationEquipment();
            strategy.appendField(locator, this, "antiCollisionAndSeparationEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCommunicationEquipment();
            JAXBElement<CodeCommunicationModeType> theField;
            theField = this.getCommunicationEquipment();
            strategy.appendField(locator, this, "communicationEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurveillanceEquipment();
            JAXBElement<CodeTransponderType> theField;
            theField = this.getSurveillanceEquipment();
            strategy.appendField(locator, this, "surveillanceEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCategory();
            JAXBElement<CodeAircraftCategoryType> theField;
            theField = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationType();
            JAXBElement<CodeNavigationType> theField;
            theField = this.getNavigationType();
            strategy.appendField(locator, this, "navigationType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationAccuracy();
            JAXBElement<ValNavigationAccuracyType> theField;
            theField = this.getNavigationAccuracy();
            strategy.appendField(locator, this, "navigationAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDualFrequency();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDualFrequency();
            strategy.appendField(locator, this, "dualFrequency", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHelicopterPerformanceClass();
            JAXBElement<CodeHelicopterPerformanceClassType> theField;
            theField = this.getHelicopterPerformanceClass();
            strategy.appendField(locator, this, "helicopterPerformanceClass", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRadioNavigationEquipment();
            List<AircraftNavigationEquipmentPropertyType> theField;
            theField = (this.isSetRadioNavigationEquipment()?this.getRadioNavigationEquipment():null);
            strategy.appendField(locator, this, "radioNavigationEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AircraftCharacteristicExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
