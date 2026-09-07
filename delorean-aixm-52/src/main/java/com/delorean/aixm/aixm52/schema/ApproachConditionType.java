
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
import jakarta.persistence.OneToOne;
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
 * <p>Java class for ApproachConditionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachConditionType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="finalApproachPath" type="{http://www.aixm.aero/schema/5.2}CodeMinimaFinalApproachPathType" minOccurs="0"/>
 *         <element name="climbGradient" type="{http://www.aixm.aero/schema/5.2}ValSlopeType" minOccurs="0"/>
 *         <element name="minimumSet" type="{http://www.aixm.aero/schema/5.2}MinimaPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="circlingRestriction" type="{http://www.aixm.aero/schema/5.2}CirclingRestrictionPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="landingArea" type="{http://www.aixm.aero/schema/5.2}LandingTakeoffAreaCollectionPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="altimeter" type="{http://www.aixm.aero/schema/5.2}AltimeterSourcePropertyType" minOccurs="0"/>
 *         <element name="designSurface" type="{http://www.aixm.aero/schema/5.2}ObstacleAssessmentSurfacePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="navigationAccuracy" type="{http://www.aixm.aero/schema/5.2}ValNavigationAccuracyType" minOccurs="0"/>
 *         <element name="landingPrecisionCategory" type="{http://www.aixm.aero/schema/5.2}CodeApproachPrecisionCategoryType" minOccurs="0"/>
 *         <element name="satelliteApproachType" type="{http://www.aixm.aero/schema/5.2}CodeSatelliteApproachType" minOccurs="0"/>
 *         <element name="specialAuthorisation" type="{http://www.aixm.aero/schema/5.2}CodeYesNoType" minOccurs="0"/>
 *         <element name="minBaroVNAVTemperature" type="{http://www.aixm.aero/schema/5.2}ValTemperatureType" minOccurs="0"/>
 *         <element name="maxBaroVNAVTemperature" type="{http://www.aixm.aero/schema/5.2}ValTemperatureType" minOccurs="0"/>
 *         <element name="stepdownFix" type="{http://www.aixm.aero/schema/5.2}TerminalSegmentPointPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractApproachConditionExtension"/>
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
@XmlType(name = "ApproachConditionType", propOrder = {
    "finalApproachPath",
    "climbGradient",
    "minimumSet",
    "circlingRestriction",
    "landingArea",
    "altimeter",
    "designSurface",
    "annotation",
    "navigationAccuracy",
    "landingPrecisionCategory",
    "satelliteApproachType",
    "specialAuthorisation",
    "minBaroVNAVTemperature",
    "maxBaroVNAVTemperature",
    "stepdownFix",
    "extension"
})
@Entity(name = "ApproachConditionType")
@Table(name = "approachcondition_o", schema = "procedure")
public class ApproachConditionType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "finalApproachPath", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimaFinalApproachPathType> finalApproachPath;
    @XmlElementRef(name = "climbGradient", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> climbGradient;
    @XmlElement(nillable = true)
    protected List<MinimaPropertyType> minimumSet;
    @XmlElement(nillable = true)
    protected List<CirclingRestrictionPropertyType> circlingRestriction;
    @XmlElement(nillable = true)
    protected List<LandingTakeoffAreaCollectionPropertyType> landingArea;
    @XmlElementRef(name = "altimeter", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AltimeterSourcePropertyType> altimeter;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentSurfacePropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "navigationAccuracy", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValNavigationAccuracyType> navigationAccuracy;
    @XmlElementRef(name = "landingPrecisionCategory", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachPrecisionCategoryType> landingPrecisionCategory;
    @XmlElementRef(name = "satelliteApproachType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSatelliteApproachType> satelliteApproachType;
    @XmlElementRef(name = "specialAuthorisation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialAuthorisation;
    @XmlElementRef(name = "minBaroVNAVTemperature", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> minBaroVNAVTemperature;
    @XmlElementRef(name = "maxBaroVNAVTemperature", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> maxBaroVNAVTemperature;
    @XmlElement(nillable = true)
    protected List<TerminalSegmentPointPropertyType> stepdownFix;
    protected List<ApproachConditionExtensionType> extension;

    /**
     * Gets the value of the finalApproachPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimaFinalApproachPathType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMinimaFinalApproachPathType> getFinalApproachPath() {
        return finalApproachPath;
    }

    /**
     * Sets the value of the finalApproachPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimaFinalApproachPathType }{@code >}
     *     
     */
    public void setFinalApproachPath(JAXBElement<CodeMinimaFinalApproachPathType> value) {
        this.finalApproachPath = value;
    }

    @Transient
    public boolean isSetFinalApproachPath() {
        return (this.finalApproachPath!= null);
    }

    /**
     * Gets the value of the climbGradient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSlopeType> getClimbGradient() {
        return climbGradient;
    }

    /**
     * Sets the value of the climbGradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setClimbGradient(JAXBElement<ValSlopeType> value) {
        this.climbGradient = value;
    }

    @Transient
    public boolean isSetClimbGradient() {
        return (this.climbGradient!= null);
    }

    /**
     * Gets the value of the minimumSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinimaPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = MinimaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "apprchcndtntp_mnmmst_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "minimumset_hjid", referencedColumnName = "hjid")
    })
    public List<MinimaPropertyType> getMinimumSet() {
        if (minimumSet == null) {
            minimumSet = new ArrayList<>();
        }
        return this.minimumSet;
    }

    /**
     * 
     * 
     */
    public void setMinimumSet(List<MinimaPropertyType> minimumSet) {
        this.minimumSet = minimumSet;
    }

    @Transient
    public boolean isSetMinimumSet() {
        return ((this.minimumSet!= null)&&(!this.minimumSet.isEmpty()));
    }

    public void unsetMinimumSet() {
        this.minimumSet = null;
    }

    /**
     * Gets the value of the circlingRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circlingRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCirclingRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CirclingRestrictionPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = CirclingRestrictionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "apprchcndtntp_crclngrstrctn_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "circlingrestriction_hjid", referencedColumnName = "hjid")
    })
    public List<CirclingRestrictionPropertyType> getCirclingRestriction() {
        if (circlingRestriction == null) {
            circlingRestriction = new ArrayList<>();
        }
        return this.circlingRestriction;
    }

    /**
     * 
     * 
     */
    public void setCirclingRestriction(List<CirclingRestrictionPropertyType> circlingRestriction) {
        this.circlingRestriction = circlingRestriction;
    }

    @Transient
    public boolean isSetCirclingRestriction() {
        return ((this.circlingRestriction!= null)&&(!this.circlingRestriction.isEmpty()));
    }

    public void unsetCirclingRestriction() {
        this.circlingRestriction = null;
    }

    /**
     * Gets the value of the landingArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landingArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandingArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandingTakeoffAreaCollectionPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = LandingTakeoffAreaCollectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "apprchcndtntp_lndngar_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "landingarea_hjid", referencedColumnName = "hjid")
    })
    public List<LandingTakeoffAreaCollectionPropertyType> getLandingArea() {
        if (landingArea == null) {
            landingArea = new ArrayList<>();
        }
        return this.landingArea;
    }

    /**
     * 
     * 
     */
    public void setLandingArea(List<LandingTakeoffAreaCollectionPropertyType> landingArea) {
        this.landingArea = landingArea;
    }

    @Transient
    public boolean isSetLandingArea() {
        return ((this.landingArea!= null)&&(!this.landingArea.isEmpty()));
    }

    public void unsetLandingArea() {
        this.landingArea = null;
    }

    /**
     * Gets the value of the altimeter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AltimeterSourcePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AltimeterSourcePropertyType> getAltimeter() {
        return altimeter;
    }

    /**
     * Sets the value of the altimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AltimeterSourcePropertyType }{@code >}
     *     
     */
    public void setAltimeter(JAXBElement<AltimeterSourcePropertyType> value) {
        this.altimeter = value;
    }

    @Transient
    public boolean isSetAltimeter() {
        return (this.altimeter!= null);
    }

    /**
     * Gets the value of the designSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentSurfacePropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstacleAssessmentSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "apprchcndtntp_dsgnsrfc_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "designsurface_hjid", referencedColumnName = "hjid")
    })
    public List<ObstacleAssessmentSurfacePropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<>();
        }
        return this.designSurface;
    }

    /**
     * 
     * 
     */
    public void setDesignSurface(List<ObstacleAssessmentSurfacePropertyType> designSurface) {
        this.designSurface = designSurface;
    }

    @Transient
    public boolean isSetDesignSurface() {
        return ((this.designSurface!= null)&&(!this.designSurface.isEmpty()));
    }

    public void unsetDesignSurface() {
        this.designSurface = null;
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
    @JoinTable(name = "apprchcndtntp_annttn_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
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
     * Gets the value of the landingPrecisionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrecisionCategoryType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApproachPrecisionCategoryType> getLandingPrecisionCategory() {
        return landingPrecisionCategory;
    }

    /**
     * Sets the value of the landingPrecisionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrecisionCategoryType }{@code >}
     *     
     */
    public void setLandingPrecisionCategory(JAXBElement<CodeApproachPrecisionCategoryType> value) {
        this.landingPrecisionCategory = value;
    }

    @Transient
    public boolean isSetLandingPrecisionCategory() {
        return (this.landingPrecisionCategory!= null);
    }

    /**
     * Gets the value of the satelliteApproachType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSatelliteApproachType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSatelliteApproachType> getSatelliteApproachType() {
        return satelliteApproachType;
    }

    /**
     * Sets the value of the satelliteApproachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSatelliteApproachType }{@code >}
     *     
     */
    public void setSatelliteApproachType(JAXBElement<CodeSatelliteApproachType> value) {
        this.satelliteApproachType = value;
    }

    @Transient
    public boolean isSetSatelliteApproachType() {
        return (this.satelliteApproachType!= null);
    }

    /**
     * Gets the value of the specialAuthorisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialAuthorisation(JAXBElement<CodeYesNoType> value) {
        this.specialAuthorisation = value;
    }

    @Transient
    public boolean isSetSpecialAuthorisation() {
        return (this.specialAuthorisation!= null);
    }

    /**
     * Gets the value of the minBaroVNAVTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValTemperatureType> getMinBaroVNAVTemperature() {
        return minBaroVNAVTemperature;
    }

    /**
     * Sets the value of the minBaroVNAVTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setMinBaroVNAVTemperature(JAXBElement<ValTemperatureType> value) {
        this.minBaroVNAVTemperature = value;
    }

    @Transient
    public boolean isSetMinBaroVNAVTemperature() {
        return (this.minBaroVNAVTemperature!= null);
    }

    /**
     * Gets the value of the maxBaroVNAVTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValTemperatureType> getMaxBaroVNAVTemperature() {
        return maxBaroVNAVTemperature;
    }

    /**
     * Sets the value of the maxBaroVNAVTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setMaxBaroVNAVTemperature(JAXBElement<ValTemperatureType> value) {
        this.maxBaroVNAVTemperature = value;
    }

    @Transient
    public boolean isSetMaxBaroVNAVTemperature() {
        return (this.maxBaroVNAVTemperature!= null);
    }

    /**
     * Gets the value of the stepdownFix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepdownFix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepdownFix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalSegmentPointPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = TerminalSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "apprchcndtntp_stpdwnfx_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "stepdownfix_hjid", referencedColumnName = "hjid")
    })
    public List<TerminalSegmentPointPropertyType> getStepdownFix() {
        if (stepdownFix == null) {
            stepdownFix = new ArrayList<>();
        }
        return this.stepdownFix;
    }

    /**
     * 
     * 
     */
    public void setStepdownFix(List<TerminalSegmentPointPropertyType> stepdownFix) {
        this.stepdownFix = stepdownFix;
    }

    @Transient
    public boolean isSetStepdownFix() {
        return ((this.stepdownFix!= null)&&(!this.stepdownFix.isEmpty()));
    }

    public void unsetStepdownFix() {
        this.stepdownFix = null;
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
     * {@link ApproachConditionExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ApproachConditionExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approachcondition_oe_hjid", referencedColumnName = "hjid")
    public List<ApproachConditionExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ApproachConditionExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "finalapproachpath", columnDefinition = "codeminimafinalapproachpathbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "finalapproachpathnilreason", columnDefinition = "nilreason"))
    })
    public CodeMinimaFinalApproachPathType getFinalApproachPathItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMinimaFinalApproachPathType.class, this.getFinalApproachPath());
    }

    public void setFinalApproachPathItem(CodeMinimaFinalApproachPathType target) {
        setFinalApproachPath(XmlAdapterUtils.marshallJAXBElement(CodeMinimaFinalApproachPathType.class, new QName("http://www.aixm.aero/schema/5.2", "finalApproachPath"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "climbgradient", columnDefinition = "valslopebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "climbgradientnilreason", columnDefinition = "nilreason")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "climbgradientaccuracy", columnDefinition = "numericalwithnilreason"))
    })
    public ValSlopeType getClimbGradientItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getClimbGradient());
    }

    public void setClimbGradientItem(ValSlopeType target) {
        setClimbGradient(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.2", "climbGradient"), ApproachConditionType.class, target));
    }

    @OneToOne(targetEntity = AltimeterSourcePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "apprchcndtntp_altmtr_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "approachcondition_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "altimeter_hjid", referencedColumnName = "hjid")
    })
    public AltimeterSourcePropertyType getAltimeterItem() {
        return XmlAdapterUtils.unmarshallSource(AltimeterSourcePropertyType.class, this.getAltimeter());
    }

    public void setAltimeterItem(AltimeterSourcePropertyType target) {
        setAltimeter(XmlAdapterUtils.marshallJAXBElement(AltimeterSourcePropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "altimeter"), ApproachConditionType.class, target));
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
        setNavigationAccuracy(XmlAdapterUtils.marshallJAXBElement(ValNavigationAccuracyType.class, new QName("http://www.aixm.aero/schema/5.2", "navigationAccuracy"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "landingprecisioncategory", columnDefinition = "codeapproachprecisioncategorybase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "landingprecisioncategorynilreason", columnDefinition = "nilreason"))
    })
    public CodeApproachPrecisionCategoryType getLandingPrecisionCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApproachPrecisionCategoryType.class, this.getLandingPrecisionCategory());
    }

    public void setLandingPrecisionCategoryItem(CodeApproachPrecisionCategoryType target) {
        setLandingPrecisionCategory(XmlAdapterUtils.marshallJAXBElement(CodeApproachPrecisionCategoryType.class, new QName("http://www.aixm.aero/schema/5.2", "landingPrecisionCategory"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "satelliteapproachtype", columnDefinition = "codesatelliteapproachbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "satelliteapproachtypenilreason", columnDefinition = "nilreason"))
    })
    public CodeSatelliteApproachType getSatelliteApproachTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSatelliteApproachType.class, this.getSatelliteApproachType());
    }

    public void setSatelliteApproachTypeItem(CodeSatelliteApproachType target) {
        setSatelliteApproachType(XmlAdapterUtils.marshallJAXBElement(CodeSatelliteApproachType.class, new QName("http://www.aixm.aero/schema/5.2", "satelliteApproachType"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "specialauthorisation", columnDefinition = "codeyesnobase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "specialauthorisationnilreason", columnDefinition = "nilreason"))
    })
    public CodeYesNoType getSpecialAuthorisationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSpecialAuthorisation());
    }

    public void setSpecialAuthorisationItem(CodeYesNoType target) {
        setSpecialAuthorisation(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.2", "specialAuthorisation"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minbarovnavtemperature", columnDefinition = "valtemperaturebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "minbarovnavtemperatureuom", columnDefinition = "uomtemperature")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "minbarovnavtemperatureaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minbarovnavtemperaturenilreason", columnDefinition = "nilreason"))
    })
    public ValTemperatureType getMinBaroVNAVTemperatureItem() {
        return XmlAdapterUtils.unmarshallSource(ValTemperatureType.class, this.getMinBaroVNAVTemperature());
    }

    public void setMinBaroVNAVTemperatureItem(ValTemperatureType target) {
        setMinBaroVNAVTemperature(XmlAdapterUtils.marshallJAXBElement(ValTemperatureType.class, new QName("http://www.aixm.aero/schema/5.2", "minBaroVNAVTemperature"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "maxbarovnavtemperature", columnDefinition = "valtemperaturebase")),
        @AttributeOverride(name = "uom", column = @Column(name = "maxbarovnavtemperatureuom", columnDefinition = "uomtemperature")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "maxbarovnavtemperatureaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "maxbarovnavtemperaturenilreason", columnDefinition = "nilreason"))
    })
    public ValTemperatureType getMaxBaroVNAVTemperatureItem() {
        return XmlAdapterUtils.unmarshallSource(ValTemperatureType.class, this.getMaxBaroVNAVTemperature());
    }

    public void setMaxBaroVNAVTemperatureItem(ValTemperatureType target) {
        setMaxBaroVNAVTemperature(XmlAdapterUtils.marshallJAXBElement(ValTemperatureType.class, new QName("http://www.aixm.aero/schema/5.2", "maxBaroVNAVTemperature"), ApproachConditionType.class, target));
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
        final ApproachConditionType that = ((ApproachConditionType) object);
        {
            boolean lhsFieldIsSet = this.isSetDesignSurface();
            boolean rhsFieldIsSet = that.isSetDesignSurface();
            List<ObstacleAssessmentSurfacePropertyType> lhsField;
            lhsField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            List<ObstacleAssessmentSurfacePropertyType> rhsField;
            rhsField = (that.isSetDesignSurface()?that.getDesignSurface():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designSurface", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCirclingRestriction();
            boolean rhsFieldIsSet = that.isSetCirclingRestriction();
            List<CirclingRestrictionPropertyType> lhsField;
            lhsField = (this.isSetCirclingRestriction()?this.getCirclingRestriction():null);
            List<CirclingRestrictionPropertyType> rhsField;
            rhsField = (that.isSetCirclingRestriction()?that.getCirclingRestriction():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "circlingRestriction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "circlingRestriction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinBaroVNAVTemperature();
            boolean rhsFieldIsSet = that.isSetMinBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> lhsField;
            lhsField = this.getMinBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> rhsField;
            rhsField = that.getMinBaroVNAVTemperature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minBaroVNAVTemperature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minBaroVNAVTemperature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltimeter();
            boolean rhsFieldIsSet = that.isSetAltimeter();
            JAXBElement<AltimeterSourcePropertyType> lhsField;
            lhsField = this.getAltimeter();
            JAXBElement<AltimeterSourcePropertyType> rhsField;
            rhsField = that.getAltimeter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altimeter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altimeter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClimbGradient();
            boolean rhsFieldIsSet = that.isSetClimbGradient();
            JAXBElement<ValSlopeType> lhsField;
            lhsField = this.getClimbGradient();
            JAXBElement<ValSlopeType> rhsField;
            rhsField = that.getClimbGradient();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "climbGradient", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "climbGradient", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSatelliteApproachType();
            boolean rhsFieldIsSet = that.isSetSatelliteApproachType();
            JAXBElement<CodeSatelliteApproachType> lhsField;
            lhsField = this.getSatelliteApproachType();
            JAXBElement<CodeSatelliteApproachType> rhsField;
            rhsField = that.getSatelliteApproachType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "satelliteApproachType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "satelliteApproachType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStepdownFix();
            boolean rhsFieldIsSet = that.isSetStepdownFix();
            List<TerminalSegmentPointPropertyType> lhsField;
            lhsField = (this.isSetStepdownFix()?this.getStepdownFix():null);
            List<TerminalSegmentPointPropertyType> rhsField;
            rhsField = (that.isSetStepdownFix()?that.getStepdownFix():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "stepdownFix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "stepdownFix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLandingPrecisionCategory();
            boolean rhsFieldIsSet = that.isSetLandingPrecisionCategory();
            JAXBElement<CodeApproachPrecisionCategoryType> lhsField;
            lhsField = this.getLandingPrecisionCategory();
            JAXBElement<CodeApproachPrecisionCategoryType> rhsField;
            rhsField = that.getLandingPrecisionCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingPrecisionCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingPrecisionCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumSet();
            boolean rhsFieldIsSet = that.isSetMinimumSet();
            List<MinimaPropertyType> lhsField;
            lhsField = (this.isSetMinimumSet()?this.getMinimumSet():null);
            List<MinimaPropertyType> rhsField;
            rhsField = (that.isSetMinimumSet()?that.getMinimumSet():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumSet", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFinalApproachPath();
            boolean rhsFieldIsSet = that.isSetFinalApproachPath();
            JAXBElement<CodeMinimaFinalApproachPathType> lhsField;
            lhsField = this.getFinalApproachPath();
            JAXBElement<CodeMinimaFinalApproachPathType> rhsField;
            rhsField = that.getFinalApproachPath();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "finalApproachPath", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "finalApproachPath", rhsField);
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
            boolean lhsFieldIsSet = this.isSetLandingArea();
            boolean rhsFieldIsSet = that.isSetLandingArea();
            List<LandingTakeoffAreaCollectionPropertyType> lhsField;
            lhsField = (this.isSetLandingArea()?this.getLandingArea():null);
            List<LandingTakeoffAreaCollectionPropertyType> rhsField;
            rhsField = (that.isSetLandingArea()?that.getLandingArea():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingArea", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaxBaroVNAVTemperature();
            boolean rhsFieldIsSet = that.isSetMaxBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> lhsField;
            lhsField = this.getMaxBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> rhsField;
            rhsField = that.getMaxBaroVNAVTemperature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maxBaroVNAVTemperature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maxBaroVNAVTemperature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ApproachConditionExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ApproachConditionExtensionType> rhsField;
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetFinalApproachPath();
            JAXBElement<CodeMinimaFinalApproachPathType> theField;
            theField = this.getFinalApproachPath();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "finalApproachPath", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClimbGradient();
            JAXBElement<ValSlopeType> theField;
            theField = this.getClimbGradient();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "climbGradient", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumSet();
            List<MinimaPropertyType> theField;
            theField = (this.isSetMinimumSet()?this.getMinimumSet():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumSet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCirclingRestriction();
            List<CirclingRestrictionPropertyType> theField;
            theField = (this.isSetCirclingRestriction()?this.getCirclingRestriction():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "circlingRestriction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingArea();
            List<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = (this.isSetLandingArea()?this.getLandingArea():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeter();
            JAXBElement<AltimeterSourcePropertyType> theField;
            theField = this.getAltimeter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altimeter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentSurfacePropertyType> theField;
            theField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designSurface", theField);
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
            boolean theFieldIsSet = this.isSetNavigationAccuracy();
            JAXBElement<ValNavigationAccuracyType> theField;
            theField = this.getNavigationAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingPrecisionCategory();
            JAXBElement<CodeApproachPrecisionCategoryType> theField;
            theField = this.getLandingPrecisionCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingPrecisionCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSatelliteApproachType();
            JAXBElement<CodeSatelliteApproachType> theField;
            theField = this.getSatelliteApproachType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "satelliteApproachType", theField);
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
            boolean theFieldIsSet = this.isSetMinBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getMinBaroVNAVTemperature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minBaroVNAVTemperature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getMaxBaroVNAVTemperature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxBaroVNAVTemperature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStepdownFix();
            List<TerminalSegmentPointPropertyType> theField;
            theField = (this.isSetStepdownFix()?this.getStepdownFix():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "stepdownFix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachConditionExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFinalApproachPath();
            JAXBElement<CodeMinimaFinalApproachPathType> theField;
            theField = this.getFinalApproachPath();
            strategy.appendField(locator, this, "finalApproachPath", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClimbGradient();
            JAXBElement<ValSlopeType> theField;
            theField = this.getClimbGradient();
            strategy.appendField(locator, this, "climbGradient", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumSet();
            List<MinimaPropertyType> theField;
            theField = (this.isSetMinimumSet()?this.getMinimumSet():null);
            strategy.appendField(locator, this, "minimumSet", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCirclingRestriction();
            List<CirclingRestrictionPropertyType> theField;
            theField = (this.isSetCirclingRestriction()?this.getCirclingRestriction():null);
            strategy.appendField(locator, this, "circlingRestriction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingArea();
            List<LandingTakeoffAreaCollectionPropertyType> theField;
            theField = (this.isSetLandingArea()?this.getLandingArea():null);
            strategy.appendField(locator, this, "landingArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltimeter();
            JAXBElement<AltimeterSourcePropertyType> theField;
            theField = this.getAltimeter();
            strategy.appendField(locator, this, "altimeter", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentSurfacePropertyType> theField;
            theField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            strategy.appendField(locator, this, "designSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationAccuracy();
            JAXBElement<ValNavigationAccuracyType> theField;
            theField = this.getNavigationAccuracy();
            strategy.appendField(locator, this, "navigationAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLandingPrecisionCategory();
            JAXBElement<CodeApproachPrecisionCategoryType> theField;
            theField = this.getLandingPrecisionCategory();
            strategy.appendField(locator, this, "landingPrecisionCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSatelliteApproachType();
            JAXBElement<CodeSatelliteApproachType> theField;
            theField = this.getSatelliteApproachType();
            strategy.appendField(locator, this, "satelliteApproachType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialAuthorisation();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSpecialAuthorisation();
            strategy.appendField(locator, this, "specialAuthorisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getMinBaroVNAVTemperature();
            strategy.appendField(locator, this, "minBaroVNAVTemperature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxBaroVNAVTemperature();
            JAXBElement<ValTemperatureType> theField;
            theField = this.getMaxBaroVNAVTemperature();
            strategy.appendField(locator, this, "maxBaroVNAVTemperature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStepdownFix();
            List<TerminalSegmentPointPropertyType> theField;
            theField = (this.isSetStepdownFix()?this.getStepdownFix():null);
            strategy.appendField(locator, this, "stepdownFix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachConditionExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
