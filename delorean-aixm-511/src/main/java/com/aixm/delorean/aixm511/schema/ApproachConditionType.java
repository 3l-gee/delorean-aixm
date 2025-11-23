
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
 * <p>Java class for ApproachConditionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachConditionType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ApproachConditionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractApproachConditionExtension"/>
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
    "requiredNavigationPerformance",
    "climbGradient",
    "minimumSet",
    "circlingRestriction",
    "aircraftCategory",
    "landingArea",
    "altimeter",
    "designSurface",
    "annotation",
    "extension"
})
@Entity(name = "ApproachConditionType")
@Table(name = "approachcondition", schema = "procedure")
public class ApproachConditionType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "finalApproachPath", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimaFinalApproachPathType> finalApproachPath;
    @XmlElementRef(name = "requiredNavigationPerformance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRNPType> requiredNavigationPerformance;
    @XmlElementRef(name = "climbGradient", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> climbGradient;
    @XmlElementRef(name = "minimumSet", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MinimaPropertyType> minimumSet;
    @XmlElement(nillable = true)
    protected List<CirclingRestrictionPropertyType> circlingRestriction;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElement(nillable = true)
    protected List<LandingTakeoffAreaCollectionPropertyType> landingArea;
    @XmlElementRef(name = "altimeter", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AltimeterSourcePropertyType> altimeter;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ApproachConditionTypeExtensionType> extension;

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
     * Gets the value of the requiredNavigationPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRNPType> getRequiredNavigationPerformance() {
        return requiredNavigationPerformance;
    }

    /**
     * Sets the value of the requiredNavigationPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public void setRequiredNavigationPerformance(JAXBElement<CodeRNPType> value) {
        this.requiredNavigationPerformance = value;
    }

    @Transient
    public boolean isSetRequiredNavigationPerformance() {
        return (this.requiredNavigationPerformance!= null);
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
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinimaPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<MinimaPropertyType> getMinimumSet() {
        return minimumSet;
    }

    /**
     * Sets the value of the minimumSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinimaPropertyType }{@code >}
     *     
     */
    public void setMinimumSet(JAXBElement<MinimaPropertyType> value) {
        this.minimumSet = value;
    }

    @Transient
    public boolean isSetMinimumSet() {
        return (this.minimumSet!= null);
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
    @ManyToMany(targetEntity = CirclingRestrictionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "circlingrestriction_approachcondition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "circlingrestriction", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachconditionpropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the aircraftCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCategory().add(newItem);
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
    @JoinTable(name = "aircraftcategory_approachcondition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "aircraftcategory", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachconditionpropertygroup", referencedColumnName = "hjid")
    })
    public List<AircraftCharacteristicPropertyType> getAircraftCategory() {
        if (aircraftCategory == null) {
            aircraftCategory = new ArrayList<>();
        }
        return this.aircraftCategory;
    }

    /**
     * 
     * 
     */
    public void setAircraftCategory(List<AircraftCharacteristicPropertyType> aircraftCategory) {
        this.aircraftCategory = aircraftCategory;
    }

    @Transient
    public boolean isSetAircraftCategory() {
        return ((this.aircraftCategory!= null)&&(!this.aircraftCategory.isEmpty()));
    }

    public void unsetAircraftCategory() {
        this.aircraftCategory = null;
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
    @ManyToMany(targetEntity = LandingTakeoffAreaCollectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "landingarea_approachcondition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "landingarea", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachconditionpropertygroup", referencedColumnName = "hjid")
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
     * {@link ObstacleAssessmentAreaPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ObstacleAssessmentAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "designsurface_approachcondition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "designsurface", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachconditionpropertygroup", referencedColumnName = "hjid")
    })
    public List<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<>();
        }
        return this.designSurface;
    }

    /**
     * 
     * 
     */
    public void setDesignSurface(List<ObstacleAssessmentAreaPropertyType> designSurface) {
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
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_approachcondition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachconditionpropertygroup", referencedColumnName = "hjid")
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
     * {@link ApproachConditionTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ApproachConditionTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_APPROACH_CONDITION_0")
    public List<ApproachConditionTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ApproachConditionTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "finalapproachpath")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "finalapproachpath_nilreason"))
    })
    public CodeMinimaFinalApproachPathType getFinalApproachPathItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMinimaFinalApproachPathType.class, this.getFinalApproachPath());
    }

    public void setFinalApproachPathItem(CodeMinimaFinalApproachPathType target) {
        setFinalApproachPath(XmlAdapterUtils.marshallJAXBElement(CodeMinimaFinalApproachPathType.class, new QName("http://www.aixm.aero/schema/5.1.1", "finalApproachPath"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "requirednavigationperformance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "requirednavigationperformance_nilreason"))
    })
    public CodeRNPType getRequiredNavigationPerformanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRNPType.class, this.getRequiredNavigationPerformance());
    }

    public void setRequiredNavigationPerformanceItem(CodeRNPType target) {
        setRequiredNavigationPerformance(XmlAdapterUtils.marshallJAXBElement(CodeRNPType.class, new QName("http://www.aixm.aero/schema/5.1.1", "requiredNavigationPerformance"), ApproachConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "climbgradient")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "climbgradient_nilreason"))
    })
    public ValSlopeType getClimbGradientItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getClimbGradient());
    }

    public void setClimbGradientItem(ValSlopeType target) {
        setClimbGradient(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "climbGradient"), ApproachConditionType.class, target));
    }

    @ManyToOne(targetEntity = MinimaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "minimumset_id", referencedColumnName = "hjid")
    public MinimaPropertyType getMinimumSetItem() {
        return XmlAdapterUtils.unmarshallSource(MinimaPropertyType.class, this.getMinimumSet());
    }

    public void setMinimumSetItem(MinimaPropertyType target) {
        setMinimumSet(XmlAdapterUtils.marshallJAXBElement(MinimaPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumSet"), ApproachConditionType.class, target));
    }

    @ManyToOne(targetEntity = AltimeterSourcePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "altimeter_id", referencedColumnName = "hjid")
    public AltimeterSourcePropertyType getAltimeterItem() {
        return XmlAdapterUtils.unmarshallSource(AltimeterSourcePropertyType.class, this.getAltimeter());
    }

    public void setAltimeterItem(AltimeterSourcePropertyType target) {
        setAltimeter(XmlAdapterUtils.marshallJAXBElement(AltimeterSourcePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altimeter"), ApproachConditionType.class, target));
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
            boolean lhsFieldIsSet = this.isSetMinimumSet();
            boolean rhsFieldIsSet = that.isSetMinimumSet();
            JAXBElement<MinimaPropertyType> lhsField;
            lhsField = this.getMinimumSet();
            JAXBElement<MinimaPropertyType> rhsField;
            rhsField = that.getMinimumSet();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumSet", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDesignSurface();
            boolean rhsFieldIsSet = that.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> lhsField;
            lhsField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            List<ObstacleAssessmentAreaPropertyType> rhsField;
            rhsField = (that.isSetDesignSurface()?that.getDesignSurface():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designSurface", rhsField);
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
            boolean lhsFieldIsSet = this.isSetRequiredNavigationPerformance();
            boolean rhsFieldIsSet = that.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> lhsField;
            lhsField = this.getRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> rhsField;
            rhsField = that.getRequiredNavigationPerformance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "requiredNavigationPerformance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "requiredNavigationPerformance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCategory();
            boolean rhsFieldIsSet = that.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> lhsField;
            lhsField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            List<AircraftCharacteristicPropertyType> rhsField;
            rhsField = (that.isSetAircraftCategory()?that.getAircraftCategory():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ApproachConditionTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ApproachConditionTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> theField;
            theField = this.getRequiredNavigationPerformance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "requiredNavigationPerformance", theField);
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
            JAXBElement<MinimaPropertyType> theField;
            theField = this.getMinimumSet();
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
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCategory", theField);
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
            List<ObstacleAssessmentAreaPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachConditionTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> theField;
            theField = this.getRequiredNavigationPerformance();
            strategy.appendField(locator, this, "requiredNavigationPerformance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClimbGradient();
            JAXBElement<ValSlopeType> theField;
            theField = this.getClimbGradient();
            strategy.appendField(locator, this, "climbGradient", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumSet();
            JAXBElement<MinimaPropertyType> theField;
            theField = this.getMinimumSet();
            strategy.appendField(locator, this, "minimumSet", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCirclingRestriction();
            List<CirclingRestrictionPropertyType> theField;
            theField = (this.isSetCirclingRestriction()?this.getCirclingRestriction():null);
            strategy.appendField(locator, this, "circlingRestriction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            List<AircraftCharacteristicPropertyType> theField;
            theField = (this.isSetAircraftCategory()?this.getAircraftCategory():null);
            strategy.appendField(locator, this, "aircraftCategory", buffer, theField, theFieldIsSet);
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
            List<ObstacleAssessmentAreaPropertyType> theField;
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
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachConditionTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
