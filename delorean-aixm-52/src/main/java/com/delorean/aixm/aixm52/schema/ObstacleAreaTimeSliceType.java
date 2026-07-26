
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
 * <p>Java class for ObstacleAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstacleAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="type" type="{http://www.aixm.aero/schema/5.2}CodeObstacleAreaType" minOccurs="0"/>
 *         <choice>
 *           <element name="reference_ownerOrganisation" type="{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" minOccurs="0"/>
 *           <element name="reference_ownerRunwayDirection" type="{http://www.aixm.aero/schema/5.2}RunwayDirectionPropertyType" minOccurs="0"/>
 *           <element name="reference_ownerRunway" type="{http://www.aixm.aero/schema/5.2}RunwayPropertyType" minOccurs="0"/>
 *           <element name="reference_ownerAirport" type="{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" minOccurs="0"/>
 *         </choice>
 *         <element name="surfaceExtent" type="{http://www.aixm.aero/schema/5.2}SurfacePropertyType" minOccurs="0"/>
 *         <element name="obstacle" type="{http://www.aixm.aero/schema/5.2}VerticalStructurePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractObstacleAreaExtension"/>
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
    "referenceOwnerOrganisation",
    "referenceOwnerRunwayDirection",
    "referenceOwnerRunway",
    "referenceOwnerAirport",
    "surfaceExtent",
    "obstacle",
    "annotation",
    "extension"
})
@Entity(name = "ObstacleAreaTimeSliceType")
@Table(name = "obstaclearea_t", schema = "obstacle")
public class ObstacleAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAreaType> type;
    @XmlElementRef(name = "reference_ownerOrganisation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> referenceOwnerOrganisation;
    @XmlElementRef(name = "reference_ownerRunwayDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> referenceOwnerRunwayDirection;
    @XmlElementRef(name = "reference_ownerRunway", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayPropertyType> referenceOwnerRunway;
    @XmlElementRef(name = "reference_ownerAirport", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> referenceOwnerAirport;
    @XmlElementRef(name = "surfaceExtent", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> surfaceExtent;
    @XmlElement(nillable = true)
    protected List<VerticalStructurePropertyType> obstacle;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstacleAreaTimeSliceExtensionType> extension;

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
     * Gets the value of the referenceOwnerRunwayDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayDirectionPropertyType> getReferenceOwnerRunwayDirection() {
        return referenceOwnerRunwayDirection;
    }

    /**
     * Sets the value of the referenceOwnerRunwayDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.referenceOwnerRunwayDirection = value;
    }

    @Transient
    public boolean isSetReferenceOwnerRunwayDirection() {
        return (this.referenceOwnerRunwayDirection!= null);
    }

    /**
     * Gets the value of the referenceOwnerRunway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayPropertyType> getReferenceOwnerRunway() {
        return referenceOwnerRunway;
    }

    /**
     * Sets the value of the referenceOwnerRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}
     *     
     */
    public void setReferenceOwnerRunway(JAXBElement<RunwayPropertyType> value) {
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
    @OneToMany(targetEntity = VerticalStructurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_obstcl_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "obstacle_hjid", referencedColumnName = "hjid")
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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_annttn_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
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
     * {@link ObstacleAreaTimeSliceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstacleAreaTimeSliceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "obstaclearea_te_hjid", referencedColumnName = "hjid")
    public List<ObstacleAreaTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ObstacleAreaTimeSliceExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type", columnDefinition = "codeobstacleareabase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "typenilreason", columnDefinition = "nilreason"))
    })
    public CodeObstacleAreaType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeObstacleAreaType.class, this.getType());
    }

    public void setTypeItem(CodeObstacleAreaType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeObstacleAreaType.class, new QName("http://www.aixm.aero/schema/5.2", "type"), ObstacleAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_rfrncownrorgnstn_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "referenceownerorganisation_hjid", referencedColumnName = "hjid")
    })
    public OrganisationAuthorityPropertyType getReferenceOwnerOrganisationItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getReferenceOwnerOrganisation());
    }

    public void setReferenceOwnerOrganisationItem(OrganisationAuthorityPropertyType target) {
        setReferenceOwnerOrganisation(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "reference_ownerOrganisation"), ObstacleAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayDirectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_rfrncownrrnwdrctn_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "referenceownerrunwaydirection_hjid", referencedColumnName = "hjid")
    })
    public RunwayDirectionPropertyType getReferenceOwnerRunwayDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayDirectionPropertyType.class, this.getReferenceOwnerRunwayDirection());
    }

    public void setReferenceOwnerRunwayDirectionItem(RunwayDirectionPropertyType target) {
        setReferenceOwnerRunwayDirection(XmlAdapterUtils.marshallJAXBElement(RunwayDirectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "reference_ownerRunwayDirection"), ObstacleAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_rfrncownrrnw_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "referenceownerrunway_hjid", referencedColumnName = "hjid")
    })
    public RunwayPropertyType getReferenceOwnerRunwayItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayPropertyType.class, this.getReferenceOwnerRunway());
    }

    public void setReferenceOwnerRunwayItem(RunwayPropertyType target) {
        setReferenceOwnerRunway(XmlAdapterUtils.marshallJAXBElement(RunwayPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "reference_ownerRunway"), ObstacleAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_rfrncownrarprt_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "referenceownerairport_hjid", referencedColumnName = "hjid")
    })
    public AirportHeliportPropertyType getReferenceOwnerAirportItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getReferenceOwnerAirport());
    }

    public void setReferenceOwnerAirportItem(AirportHeliportPropertyType target) {
        setReferenceOwnerAirport(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "reference_ownerAirport"), ObstacleAreaTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "obstclartmslctp_srfcextnt_l", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "obstaclearea_t_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "surfaceextent_hjid", referencedColumnName = "hjid")
    })
    public AIXMSurfacePropertyType getSurfaceExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getSurfaceExtent());
    }

    public void setSurfaceExtentItem(AIXMSurfacePropertyType target) {
        setSurfaceExtent(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.2", "surfaceExtent"), ObstacleAreaTimeSliceType.class, target));
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
            boolean lhsFieldIsSet = this.isSetReferenceOwnerRunwayDirection();
            boolean rhsFieldIsSet = that.isSetReferenceOwnerRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> lhsField;
            lhsField = this.getReferenceOwnerRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> rhsField;
            rhsField = that.getReferenceOwnerRunwayDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceOwnerRunwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceOwnerRunwayDirection", rhsField);
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
            boolean lhsFieldIsSet = this.isSetReferenceOwnerRunway();
            boolean rhsFieldIsSet = that.isSetReferenceOwnerRunway();
            JAXBElement<RunwayPropertyType> lhsField;
            lhsField = this.getReferenceOwnerRunway();
            JAXBElement<RunwayPropertyType> rhsField;
            rhsField = that.getReferenceOwnerRunway();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceOwnerRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceOwnerRunway", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ObstacleAreaTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ObstacleAreaTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetReferenceOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getReferenceOwnerOrganisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceOwnerOrganisation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getReferenceOwnerRunwayDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceOwnerRunwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerRunway();
            JAXBElement<RunwayPropertyType> theField;
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
            List<ObstacleAreaTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetReferenceOwnerOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getReferenceOwnerOrganisation();
            strategy.appendField(locator, this, "referenceOwnerOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getReferenceOwnerRunwayDirection();
            strategy.appendField(locator, this, "referenceOwnerRunwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceOwnerRunway();
            JAXBElement<RunwayPropertyType> theField;
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
            List<ObstacleAreaTimeSliceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
