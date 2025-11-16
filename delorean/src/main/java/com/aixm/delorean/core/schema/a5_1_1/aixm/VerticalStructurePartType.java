
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
 * <p>Java class for VerticalStructurePartType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VerticalStructurePartType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleType">
 *       <sequence>
 *         <element name="timeInterval" type="{http://www.aixm.aero/schema/5.1.1}TimesheetPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.1.1}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="specialDateAuthority" type="{http://www.aixm.aero/schema/5.1.1}OrganisationAuthorityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}VerticalStructurePartPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractVerticalStructurePartExtension"/>
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
@XmlType(name = "VerticalStructurePartType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "verticalExtent",
    "verticalExtentAccuracy",
    "type",
    "constructionStatus",
    "markingPattern",
    "markingFirstColour",
    "markingSecondColour",
    "mobile",
    "frangible",
    "visibleMaterial",
    "designator",
    "horizontalProjectionSurfaceExtent",
    "horizontalProjectionLinearExtent",
    "horizontalProjectionLocation",
    "lighting",
    "extension"
})
@Entity(name = "VerticalStructurePartType")
@Table(name = "verticalstructurepart", schema = "obstacle")
public class VerticalStructurePartType
    extends AbstractPropertiesWithScheduleType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "verticalExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalExtent;
    @XmlElementRef(name = "verticalExtentAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalExtentAccuracy;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureType> type;
    @XmlElementRef(name = "constructionStatus", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusConstructionType> constructionStatus;
    @XmlElementRef(name = "markingPattern", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureMarkingType> markingPattern;
    @XmlElementRef(name = "markingFirstColour", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> markingFirstColour;
    @XmlElementRef(name = "markingSecondColour", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> markingSecondColour;
    @XmlElementRef(name = "mobile", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mobile;
    @XmlElementRef(name = "frangible", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> frangible;
    @XmlElementRef(name = "visibleMaterial", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureMaterialType> visibleMaterial;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "horizontalProjection_surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedSurfacePropertyType> horizontalProjectionSurfaceExtent;
    @XmlElementRef(name = "horizontalProjection_linearExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedCurvePropertyType> horizontalProjectionLinearExtent;
    @XmlElementRef(name = "horizontalProjection_location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> horizontalProjectionLocation;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> lighting;
    protected List<VerticalStructurePartTypeExtensionType> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = TimesheetPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "timeinterval_verticalstructurepart_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "timeinterval", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructureparttype", referencedColumnName = "hjid")
    })
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<>();
        }
        return this.timeInterval;
    }

    /**
     * 
     * 
     */
    public void setTimeInterval(List<TimesheetPropertyType> timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Transient
    public boolean isSetTimeInterval() {
        return ((this.timeInterval!= null)&&(!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
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
    @JoinTable(name = "annotation_verticalstructurepart_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructureparttype", referencedColumnName = "hjid")
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
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
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
    @JoinTable(name = "specialdateauthority_verticalstructurepart_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "specialdateauthority", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructureparttype", referencedColumnName = "hjid")
    })
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<>();
        }
        return this.specialDateAuthority;
    }

    /**
     * 
     * 
     */
    public void setSpecialDateAuthority(List<OrganisationAuthorityPropertyType> specialDateAuthority) {
        this.specialDateAuthority = specialDateAuthority;
    }

    @Transient
    public boolean isSetSpecialDateAuthority() {
        return ((this.specialDateAuthority!= null)&&(!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the verticalExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getVerticalExtent() {
        return verticalExtent;
    }

    /**
     * Sets the value of the verticalExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalExtent(JAXBElement<ValDistanceType> value) {
        this.verticalExtent = value;
    }

    @Transient
    public boolean isSetVerticalExtent() {
        return (this.verticalExtent!= null);
    }

    /**
     * Gets the value of the verticalExtentAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getVerticalExtentAccuracy() {
        return verticalExtentAccuracy;
    }

    /**
     * Sets the value of the verticalExtentAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalExtentAccuracy(JAXBElement<ValDistanceType> value) {
        this.verticalExtentAccuracy = value;
    }

    @Transient
    public boolean isSetVerticalExtentAccuracy() {
        return (this.verticalExtentAccuracy!= null);
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
     * Gets the value of the constructionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusConstructionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeStatusConstructionType> getConstructionStatus() {
        return constructionStatus;
    }

    /**
     * Sets the value of the constructionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusConstructionType }{@code >}
     *     
     */
    public void setConstructionStatus(JAXBElement<CodeStatusConstructionType> value) {
        this.constructionStatus = value;
    }

    @Transient
    public boolean isSetConstructionStatus() {
        return (this.constructionStatus!= null);
    }

    /**
     * Gets the value of the markingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMarkingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalStructureMarkingType> getMarkingPattern() {
        return markingPattern;
    }

    /**
     * Sets the value of the markingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMarkingType }{@code >}
     *     
     */
    public void setMarkingPattern(JAXBElement<CodeVerticalStructureMarkingType> value) {
        this.markingPattern = value;
    }

    @Transient
    public boolean isSetMarkingPattern() {
        return (this.markingPattern!= null);
    }

    /**
     * Gets the value of the markingFirstColour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeColourType> getMarkingFirstColour() {
        return markingFirstColour;
    }

    /**
     * Sets the value of the markingFirstColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setMarkingFirstColour(JAXBElement<CodeColourType> value) {
        this.markingFirstColour = value;
    }

    @Transient
    public boolean isSetMarkingFirstColour() {
        return (this.markingFirstColour!= null);
    }

    /**
     * Gets the value of the markingSecondColour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeColourType> getMarkingSecondColour() {
        return markingSecondColour;
    }

    /**
     * Sets the value of the markingSecondColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setMarkingSecondColour(JAXBElement<CodeColourType> value) {
        this.markingSecondColour = value;
    }

    @Transient
    public boolean isSetMarkingSecondColour() {
        return (this.markingSecondColour!= null);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMobile(JAXBElement<CodeYesNoType> value) {
        this.mobile = value;
    }

    @Transient
    public boolean isSetMobile() {
        return (this.mobile!= null);
    }

    /**
     * Gets the value of the frangible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFrangible() {
        return frangible;
    }

    /**
     * Sets the value of the frangible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFrangible(JAXBElement<CodeYesNoType> value) {
        this.frangible = value;
    }

    @Transient
    public boolean isSetFrangible() {
        return (this.frangible!= null);
    }

    /**
     * Gets the value of the visibleMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMaterialType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalStructureMaterialType> getVisibleMaterial() {
        return visibleMaterial;
    }

    /**
     * Sets the value of the visibleMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMaterialType }{@code >}
     *     
     */
    public void setVisibleMaterial(JAXBElement<CodeVerticalStructureMaterialType> value) {
        this.visibleMaterial = value;
    }

    @Transient
    public boolean isSetVisibleMaterial() {
        return (this.visibleMaterial!= null);
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the horizontalProjectionSurfaceExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedSurfacePropertyType> getHorizontalProjectionSurfaceExtent() {
        return horizontalProjectionSurfaceExtent;
    }

    /**
     * Sets the value of the horizontalProjectionSurfaceExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionSurfaceExtent(JAXBElement<AIXMElevatedSurfacePropertyType> value) {
        this.horizontalProjectionSurfaceExtent = value;
    }

    @Transient
    public boolean isSetHorizontalProjectionSurfaceExtent() {
        return (this.horizontalProjectionSurfaceExtent!= null);
    }

    /**
     * Gets the value of the horizontalProjectionLinearExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedCurvePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedCurvePropertyType> getHorizontalProjectionLinearExtent() {
        return horizontalProjectionLinearExtent;
    }

    /**
     * Sets the value of the horizontalProjectionLinearExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedCurvePropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionLinearExtent(JAXBElement<AIXMElevatedCurvePropertyType> value) {
        this.horizontalProjectionLinearExtent = value;
    }

    @Transient
    public boolean isSetHorizontalProjectionLinearExtent() {
        return (this.horizontalProjectionLinearExtent!= null);
    }

    /**
     * Gets the value of the horizontalProjectionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getHorizontalProjectionLocation() {
        return horizontalProjectionLocation;
    }

    /**
     * Sets the value of the horizontalProjectionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.horizontalProjectionLocation = value;
    }

    @Transient
    public boolean isSetHorizontalProjectionLocation() {
        return (this.horizontalProjectionLocation!= null);
    }

    /**
     * Gets the value of the lighting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lighting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLighting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = LightElementPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "lighting_verticalstructurepart_link", schema = "obstacle", joinColumns = {
        @JoinColumn(name = "lighting", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "verticalstructurepartpropertygroup", referencedColumnName = "hjid")
    })
    public List<LightElementPropertyType> getLighting() {
        if (lighting == null) {
            lighting = new ArrayList<>();
        }
        return this.lighting;
    }

    /**
     * 
     * 
     */
    public void setLighting(List<LightElementPropertyType> lighting) {
        this.lighting = lighting;
    }

    @Transient
    public boolean isSetLighting() {
        return ((this.lighting!= null)&&(!this.lighting.isEmpty()));
    }

    public void unsetLighting() {
        this.lighting = null;
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
     * {@link VerticalStructurePartTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = VerticalStructurePartTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_VERTICAL_STRUCTURE_2")
    public List<VerticalStructurePartTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<VerticalStructurePartTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "verticalextent")),
        @AttributeOverride(name = "uom", column = @Column(name = "verticalextent_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalextent_nilreason"))
    })
    public ValDistanceType getVerticalExtentItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getVerticalExtent());
    }

    public void setVerticalExtentItem(ValDistanceType target) {
        setVerticalExtent(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalExtent"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "verticalextentaccuracy")),
        @AttributeOverride(name = "uom", column = @Column(name = "verticalextentaccuracy_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "verticalextentaccuracy_nilreason"))
    })
    public ValDistanceType getVerticalExtentAccuracyItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getVerticalExtentAccuracy());
    }

    public void setVerticalExtentAccuracyItem(ValDistanceType target) {
        setVerticalExtentAccuracy(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "verticalExtentAccuracy"), VerticalStructurePartType.class, target));
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
        setType(XmlAdapterUtils.marshallJAXBElement(CodeVerticalStructureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "constructionstatus")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "constructionstatus_nilreason"))
    })
    public CodeStatusConstructionType getConstructionStatusItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStatusConstructionType.class, this.getConstructionStatus());
    }

    public void setConstructionStatusItem(CodeStatusConstructionType target) {
        setConstructionStatus(XmlAdapterUtils.marshallJAXBElement(CodeStatusConstructionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "constructionStatus"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "markingpattern")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markingpattern_nilreason"))
    })
    public CodeVerticalStructureMarkingType getMarkingPatternItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalStructureMarkingType.class, this.getMarkingPattern());
    }

    public void setMarkingPatternItem(CodeVerticalStructureMarkingType target) {
        setMarkingPattern(XmlAdapterUtils.marshallJAXBElement(CodeVerticalStructureMarkingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markingPattern"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "markingfirstcolour")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markingfirstcolour_nilreason"))
    })
    public CodeColourType getMarkingFirstColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getMarkingFirstColour());
    }

    public void setMarkingFirstColourItem(CodeColourType target) {
        setMarkingFirstColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markingFirstColour"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "markingsecondcolour")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "markingsecondcolour_nilreason"))
    })
    public CodeColourType getMarkingSecondColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getMarkingSecondColour());
    }

    public void setMarkingSecondColourItem(CodeColourType target) {
        setMarkingSecondColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class, new QName("http://www.aixm.aero/schema/5.1.1", "markingSecondColour"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "mobile")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "mobile_nilreason"))
    })
    public CodeYesNoType getMobileItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getMobile());
    }

    public void setMobileItem(CodeYesNoType target) {
        setMobile(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "mobile"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "frangible")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "frangible_nilreason"))
    })
    public CodeYesNoType getFrangibleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFrangible());
    }

    public void setFrangibleItem(CodeYesNoType target) {
        setFrangible(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "frangible"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "visiblematerial")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "visiblematerial_nilreason"))
    })
    public CodeVerticalStructureMaterialType getVisibleMaterialItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalStructureMaterialType.class, this.getVisibleMaterial());
    }

    public void setVisibleMaterialItem(CodeVerticalStructureMaterialType target) {
        setVisibleMaterial(XmlAdapterUtils.marshallJAXBElement(CodeVerticalStructureMaterialType.class, new QName("http://www.aixm.aero/schema/5.1.1", "visibleMaterial"), VerticalStructurePartType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), VerticalStructurePartType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "horizontalprojection_surfaceextent_id", referencedColumnName = "hjid")
    public AIXMElevatedSurfacePropertyType getHorizontalProjectionSurfaceExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedSurfacePropertyType.class, this.getHorizontalProjectionSurfaceExtent());
    }

    public void setHorizontalProjectionSurfaceExtentItem(AIXMElevatedSurfacePropertyType target) {
        setHorizontalProjectionSurfaceExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalProjection_surfaceExtent"), VerticalStructurePartType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "horizontalprojection_linearextent_id", referencedColumnName = "hjid")
    public AIXMElevatedCurvePropertyType getHorizontalProjectionLinearExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedCurvePropertyType.class, this.getHorizontalProjectionLinearExtent());
    }

    public void setHorizontalProjectionLinearExtentItem(AIXMElevatedCurvePropertyType target) {
        setHorizontalProjectionLinearExtent(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalProjection_linearExtent"), VerticalStructurePartType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "horizontalprojection_location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getHorizontalProjectionLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getHorizontalProjectionLocation());
    }

    public void setHorizontalProjectionLocationItem(AIXMElevatedPointPropertyType target) {
        setHorizontalProjectionLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "horizontalProjection_location"), VerticalStructurePartType.class, target));
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
        final VerticalStructurePartType that = ((VerticalStructurePartType) object);
        {
            boolean lhsFieldIsSet = this.isSetMarkingSecondColour();
            boolean rhsFieldIsSet = that.isSetMarkingSecondColour();
            JAXBElement<CodeColourType> lhsField;
            lhsField = this.getMarkingSecondColour();
            JAXBElement<CodeColourType> rhsField;
            rhsField = that.getMarkingSecondColour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingSecondColour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingSecondColour", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalExtentAccuracy();
            boolean rhsFieldIsSet = that.isSetVerticalExtentAccuracy();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getVerticalExtentAccuracy();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getVerticalExtentAccuracy();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalExtentAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalExtentAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialDateAuthority();
            boolean rhsFieldIsSet = that.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetSpecialDateAuthority()?that.getSpecialDateAuthority():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialDateAuthority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialDateAuthority", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMarkingPattern();
            boolean rhsFieldIsSet = that.isSetMarkingPattern();
            JAXBElement<CodeVerticalStructureMarkingType> lhsField;
            lhsField = this.getMarkingPattern();
            JAXBElement<CodeVerticalStructureMarkingType> rhsField;
            rhsField = that.getMarkingPattern();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingPattern", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingPattern", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHorizontalProjectionLinearExtent();
            boolean rhsFieldIsSet = that.isSetHorizontalProjectionLinearExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> lhsField;
            lhsField = this.getHorizontalProjectionLinearExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> rhsField;
            rhsField = that.getHorizontalProjectionLinearExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalProjectionLinearExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalProjectionLinearExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFrangible();
            boolean rhsFieldIsSet = that.isSetFrangible();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFrangible();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFrangible();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "frangible", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "frangible", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHorizontalProjectionLocation();
            boolean rhsFieldIsSet = that.isSetHorizontalProjectionLocation();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getHorizontalProjectionLocation();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getHorizontalProjectionLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalProjectionLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalProjectionLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<VerticalStructurePartTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<VerticalStructurePartTypeExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetConstructionStatus();
            boolean rhsFieldIsSet = that.isSetConstructionStatus();
            JAXBElement<CodeStatusConstructionType> lhsField;
            lhsField = this.getConstructionStatus();
            JAXBElement<CodeStatusConstructionType> rhsField;
            rhsField = that.getConstructionStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "constructionStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "constructionStatus", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMarkingFirstColour();
            boolean rhsFieldIsSet = that.isSetMarkingFirstColour();
            JAXBElement<CodeColourType> lhsField;
            lhsField = this.getMarkingFirstColour();
            JAXBElement<CodeColourType> rhsField;
            rhsField = that.getMarkingFirstColour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "markingFirstColour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "markingFirstColour", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLighting();
            boolean rhsFieldIsSet = that.isSetLighting();
            List<LightElementPropertyType> lhsField;
            lhsField = (this.isSetLighting()?this.getLighting():null);
            List<LightElementPropertyType> rhsField;
            rhsField = (that.isSetLighting()?that.getLighting():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lighting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lighting", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMobile();
            boolean rhsFieldIsSet = that.isSetMobile();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getMobile();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getMobile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mobile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mobile", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTimeInterval();
            boolean rhsFieldIsSet = that.isSetTimeInterval();
            List<TimesheetPropertyType> lhsField;
            lhsField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            List<TimesheetPropertyType> rhsField;
            rhsField = (that.isSetTimeInterval()?that.getTimeInterval():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeInterval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeInterval", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVerticalExtent();
            boolean rhsFieldIsSet = that.isSetVerticalExtent();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getVerticalExtent();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getVerticalExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "verticalExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "verticalExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHorizontalProjectionSurfaceExtent();
            boolean rhsFieldIsSet = that.isSetHorizontalProjectionSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> lhsField;
            lhsField = this.getHorizontalProjectionSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> rhsField;
            rhsField = that.getHorizontalProjectionSurfaceExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "horizontalProjectionSurfaceExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "horizontalProjectionSurfaceExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVisibleMaterial();
            boolean rhsFieldIsSet = that.isSetVisibleMaterial();
            JAXBElement<CodeVerticalStructureMaterialType> lhsField;
            lhsField = this.getVisibleMaterial();
            JAXBElement<CodeVerticalStructureMaterialType> rhsField;
            rhsField = that.getVisibleMaterial();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "visibleMaterial", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "visibleMaterial", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeInterval", theField);
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
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialDateAuthority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalExtent();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalExtentAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalExtentAccuracy();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "verticalExtentAccuracy", theField);
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
            boolean theFieldIsSet = this.isSetConstructionStatus();
            JAXBElement<CodeStatusConstructionType> theField;
            theField = this.getConstructionStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "constructionStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingPattern();
            JAXBElement<CodeVerticalStructureMarkingType> theField;
            theField = this.getMarkingPattern();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingPattern", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingFirstColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getMarkingFirstColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingFirstColour", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingSecondColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getMarkingSecondColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "markingSecondColour", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMobile();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMobile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mobile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrangible();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFrangible();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "frangible", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibleMaterial();
            JAXBElement<CodeVerticalStructureMaterialType> theField;
            theField = this.getVisibleMaterial();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "visibleMaterial", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjectionSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getHorizontalProjectionSurfaceExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalProjectionSurfaceExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjectionLinearExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> theField;
            theField = this.getHorizontalProjectionLinearExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalProjectionLinearExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjectionLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getHorizontalProjectionLocation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "horizontalProjectionLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLighting();
            List<LightElementPropertyType> theField;
            theField = (this.isSetLighting()?this.getLighting():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lighting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<VerticalStructurePartTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            strategy.appendField(locator, this, "timeInterval", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            strategy.appendField(locator, this, "specialDateAuthority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalExtent();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalExtent();
            strategy.appendField(locator, this, "verticalExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVerticalExtentAccuracy();
            JAXBElement<ValDistanceType> theField;
            theField = this.getVerticalExtentAccuracy();
            strategy.appendField(locator, this, "verticalExtentAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeVerticalStructureType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConstructionStatus();
            JAXBElement<CodeStatusConstructionType> theField;
            theField = this.getConstructionStatus();
            strategy.appendField(locator, this, "constructionStatus", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingPattern();
            JAXBElement<CodeVerticalStructureMarkingType> theField;
            theField = this.getMarkingPattern();
            strategy.appendField(locator, this, "markingPattern", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingFirstColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getMarkingFirstColour();
            strategy.appendField(locator, this, "markingFirstColour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMarkingSecondColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getMarkingSecondColour();
            strategy.appendField(locator, this, "markingSecondColour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMobile();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getMobile();
            strategy.appendField(locator, this, "mobile", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFrangible();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFrangible();
            strategy.appendField(locator, this, "frangible", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVisibleMaterial();
            JAXBElement<CodeVerticalStructureMaterialType> theField;
            theField = this.getVisibleMaterial();
            strategy.appendField(locator, this, "visibleMaterial", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjectionSurfaceExtent();
            JAXBElement<AIXMElevatedSurfacePropertyType> theField;
            theField = this.getHorizontalProjectionSurfaceExtent();
            strategy.appendField(locator, this, "horizontalProjectionSurfaceExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjectionLinearExtent();
            JAXBElement<AIXMElevatedCurvePropertyType> theField;
            theField = this.getHorizontalProjectionLinearExtent();
            strategy.appendField(locator, this, "horizontalProjectionLinearExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHorizontalProjectionLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getHorizontalProjectionLocation();
            strategy.appendField(locator, this, "horizontalProjectionLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLighting();
            List<LightElementPropertyType> theField;
            theField = (this.isSetLighting()?this.getLighting():null);
            strategy.appendField(locator, this, "lighting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<VerticalStructurePartTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
