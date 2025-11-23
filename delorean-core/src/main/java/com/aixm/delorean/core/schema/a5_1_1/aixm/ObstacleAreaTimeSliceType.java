
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
 * <p>Java class for ObstacleAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstacleAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ObstacleAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractObstacleAreaExtension"/>
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
@XmlType(name = "ObstacleAreaTimeSliceType", propOrder = {
    "type",
    "obstructionIdSurfaceCondition",
    "referenceOwnerOrganisation",
    "referenceOwnerRunway",
    "referenceOwnerAirport",
    "surfaceExtent",
    "obstacle",
    "annotation",
    "extension"
})
@Entity(name = "ObstacleAreaTimeSliceType")
@Table(name = "obstaclearea_ts", schema = "obstacle")
public class ObstacleAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAreaType> type;
    @XmlElementRef(name = "obstructionIdSurfaceCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAssessmentSurfaceType> obstructionIdSurfaceCondition;
    @XmlElementRef(name = "reference_ownerOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> referenceOwnerOrganisation;
    @XmlElementRef(name = "reference_ownerRunway", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> referenceOwnerRunway;
    @XmlElementRef(name = "reference_ownerAirport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> referenceOwnerAirport;
    @XmlElementRef(name = "surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> surfaceExtent;
    @XmlElement(nillable = true)
    protected List<VerticalStructurePropertyType> obstacle;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstacleAreaExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAreaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeObstacleAreaType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAreaType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeObstacleAreaType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the obstructionIdSurfaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeObstacleAssessmentSurfaceType> getObstructionIdSurfaceCondition() {
        return obstructionIdSurfaceCondition;
    }

    /**
     * Sets the value of the obstructionIdSurfaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    public void setObstructionIdSurfaceCondition(JAXBElement<CodeObstacleAssessmentSurfaceType> value) {
        this.obstructionIdSurfaceCondition = value;
    }

    @Transient
    public boolean isSetObstructionIdSurfaceCondition() {
        return (this.obstructionIdSurfaceCondition!= null);
    }

    /**
     * Gets the value of the referenceOwnerOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getReferenceOwnerOrganisation() {
        return referenceOwnerOrganisation;
    }

    /**
     * Sets the value of the referenceOwnerOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.referenceOwnerOrganisation = value;
    }

    @Transient
    public boolean isSetReferenceOwnerOrganisation() {
        return (this.referenceOwnerOrganisation!= null);
    }

    /**
     * Gets the value of the referenceOwnerRunway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayDirectionPropertyType> getReferenceOwnerRunway() {
        return referenceOwnerRunway;
    }

    /**
     * Sets the value of the referenceOwnerRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerRunway(JAXBElement<RunwayDirectionPropertyType> value) {
        this.referenceOwnerRunway = value;
    }

    @Transient
    public boolean isSetReferenceOwnerRunway() {
        return (this.referenceOwnerRunway!= null);
    }

    /**
     * Gets the value of the referenceOwnerAirport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getReferenceOwnerAirport() {
        return referenceOwnerAirport;
    }

    /**
     * Sets the value of the referenceOwnerAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerAirport(JAXBElement<AirportHeliportPropertyType> value) {
        this.referenceOwnerAirport = value;
    }

    @Transient
    public boolean isSetReferenceOwnerAirport() {
        return (this.referenceOwnerAirport!= null);
    }

    /**
     * Gets the value of the surfaceExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getSurfaceExtent() {
        return surfaceExtent;
    }

    /**
     * Sets the value of the surfaceExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    public void setSurfaceExtent(JAXBElement<AIXMSurfacePropertyType> value) {
        this.surfaceExtent = value;
    }

    @Transient
    public boolean isSetSurfaceExtent() {
        return (this.surfaceExtent!= null);
    }

    /**
     * Gets the value of the obstacle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstacle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstacle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerticalStructurePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = VerticalStructurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstacle_obstaclearea_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstacle", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "obstacleareapropertygroup", referencedColumnName = "hjid")
    })
    public List<VerticalStructurePropertyType> getObstacle() {
        if (obstacle == null) {
            obstacle = new ArrayList<>();
        }
        return this.obstacle;
    }

    /**
     * 
     * 
     */
    public void setObstacle(List<VerticalStructurePropertyType> obstacle) {
        this.obstacle = obstacle;
    }

    @Transient
    public boolean isSetObstacle() {
        return ((this.obstacle!= null)&&(!this.obstacle.isEmpty()));
    }

    public void unsetObstacle() {
        this.obstacle = null;
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
    @JoinTable(name = "annotation_obstaclearea_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "obstacleareapropertygroup", referencedColumnName = "hjid")
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
     * {@link ObstacleAreaExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstacleAreaExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_OBSTACLE_AREA_TIME_0")
    public List<ObstacleAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ObstacleAreaExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeObstacleAreaType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeObstacleAreaType.class, this.getType());
    }

    public void setTypeItem(CodeObstacleAreaType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeObstacleAreaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), ObstacleAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "obstructionidsurfacecondition")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "obstructionidsurfacecondition_nilreason"))
    })
    public CodeObstacleAssessmentSurfaceType getObstructionIdSurfaceConditionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeObstacleAssessmentSurfaceType.class, this.getObstructionIdSurfaceCondition());
    }

    public void setObstructionIdSurfaceConditionItem(CodeObstacleAssessmentSurfaceType target) {
        setObstructionIdSurfaceCondition(XmlAdapterUtils.marshallJAXBElement(CodeObstacleAssessmentSurfaceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "obstructionIdSurfaceCondition"), ObstacleAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "reference_ownerorganisation_id", referencedColumnName = "hjid")
    public OrganisationAuthorityPropertyType getReferenceOwnerOrganisationItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getReferenceOwnerOrganisation());
    }

    public void setReferenceOwnerOrganisationItem(OrganisationAuthorityPropertyType target) {
        setReferenceOwnerOrganisation(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reference_ownerOrganisation"), ObstacleAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayDirectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "reference_ownerrunway_id", referencedColumnName = "hjid")
    public RunwayDirectionPropertyType getReferenceOwnerRunwayItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayDirectionPropertyType.class, this.getReferenceOwnerRunway());
    }

    public void setReferenceOwnerRunwayItem(RunwayDirectionPropertyType target) {
        setReferenceOwnerRunway(XmlAdapterUtils.marshallJAXBElement(RunwayDirectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reference_ownerRunway"), ObstacleAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "reference_ownerairport_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getReferenceOwnerAirportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getReferenceOwnerAirport());
    }

    public void setReferenceOwnerAirportItem(AirportHeliportPropertyType target) {
        setReferenceOwnerAirport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reference_ownerAirport"), ObstacleAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "surfaceextent_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getSurfaceExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getSurfaceExtent());
    }

    public void setSurfaceExtentItem(AIXMSurfacePropertyType target) {
        setSurfaceExtent(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surfaceExtent"), ObstacleAreaTimeSliceType.class, target));
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
        final ObstacleAreaTimeSliceType that = ((ObstacleAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeObstacleAreaType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeObstacleAreaType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurfaceExtent();
            boolean rhsFieldIsSet = that.isSetSurfaceExtent();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getSurfaceExtent();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getSurfaceExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceOwnerRunway();
            boolean rhsFieldIsSet = that.isSetReferenceOwnerRunway();
            JAXBElement<RunwayDirectionPropertyType> lhsField;
            lhsField = this.getReferenceOwnerRunway();
            JAXBElement<RunwayDirectionPropertyType> rhsField;
            rhsField = that.getReferenceOwnerRunway();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceOwnerRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceOwnerRunway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceOwnerAirport();
            boolean rhsFieldIsSet = that.isSetReferenceOwnerAirport();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getReferenceOwnerAirport();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getReferenceOwnerAirport();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceOwnerAirport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceOwnerAirport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ObstacleAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ObstacleAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObstacle();
            boolean rhsFieldIsSet = that.isSetObstacle();
            List<VerticalStructurePropertyType> lhsField;
            lhsField = (this.isSetObstacle()?this.getObstacle():null);
            List<VerticalStructurePropertyType> rhsField;
            rhsField = (that.isSetObstacle()?that.getObstacle():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferenceOwnerOrganisation();
            boolean rhsFieldIsSet = that.isSetReferenceOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getReferenceOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getReferenceOwnerOrganisation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceOwnerOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceOwnerOrganisation", rhsField);
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
            boolean lhsFieldIsSet = this.isSetObstructionIdSurfaceCondition();
            boolean rhsFieldIsSet = that.isSetObstructionIdSurfaceCondition();
            JAXBElement<CodeObstacleAssessmentSurfaceType> lhsField;
            lhsField = this.getObstructionIdSurfaceCondition();
            JAXBElement<CodeObstacleAssessmentSurfaceType> rhsField;
            rhsField = that.getObstructionIdSurfaceCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstructionIdSurfaceCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstructionIdSurfaceCondition", rhsField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeObstacleAreaType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstructionIdSurfaceCondition();
            JAXBElement<CodeObstacleAssessmentSurfaceType> theField;
            theField = this.getObstructionIdSurfaceCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstructionIdSurfaceCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getReferenceOwnerOrganisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceOwnerOrganisation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerRunway();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getReferenceOwnerRunway();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceOwnerRunway", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerAirport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getReferenceOwnerAirport();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceOwnerAirport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getSurfaceExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacle();
            List<VerticalStructurePropertyType> theField;
            theField = (this.isSetObstacle()?this.getObstacle():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacle", theField);
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
            List<ObstacleAreaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeObstacleAreaType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstructionIdSurfaceCondition();
            JAXBElement<CodeObstacleAssessmentSurfaceType> theField;
            theField = this.getObstructionIdSurfaceCondition();
            strategy.appendField(locator, this, "obstructionIdSurfaceCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getReferenceOwnerOrganisation();
            strategy.appendField(locator, this, "referenceOwnerOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerRunway();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getReferenceOwnerRunway();
            strategy.appendField(locator, this, "referenceOwnerRunway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerAirport();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getReferenceOwnerAirport();
            strategy.appendField(locator, this, "referenceOwnerAirport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getSurfaceExtent();
            strategy.appendField(locator, this, "surfaceExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacle();
            List<VerticalStructurePropertyType> theField;
            theField = (this.isSetObstacle()?this.getObstacle():null);
            strategy.appendField(locator, this, "obstacle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ObstacleAreaExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
