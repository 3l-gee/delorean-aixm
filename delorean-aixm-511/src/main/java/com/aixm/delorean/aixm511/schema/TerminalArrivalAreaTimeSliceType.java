
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
 * <p>Java class for TerminalArrivalAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminalArrivalAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}TerminalArrivalAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTerminalArrivalAreaExtension"/>
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
@XmlType(name = "TerminalArrivalAreaTimeSliceType", propOrder = {
    "arrivalAreaType",
    "outerBufferWidth",
    "lateralBufferWidth",
    "ifFixDesignatedPoint",
    "ifNavaidSystem",
    "ifPosition",
    "ifRunwayPoint",
    "ifAimingPoint",
    "ifAirportReferencePoint",
    "iafFixDesignatedPoint",
    "iafNavaidSystem",
    "iafPosition",
    "iafRunwayPoint",
    "iafAimingPoint",
    "iafAirportReferencePoint",
    "buffer",
    "sector",
    "approachRNAV",
    "annotation",
    "extension"
})
@Entity(name = "TerminalArrivalAreaTimeSliceType")
@Table(name = "terminalarrivalarea_ts", schema = "procedure")
public class TerminalArrivalAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "arrivalAreaType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTAAType> arrivalAreaType;
    @XmlElementRef(name = "outerBufferWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> outerBufferWidth;
    @XmlElementRef(name = "lateralBufferWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lateralBufferWidth;
    @XmlElementRef(name = "IF_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> ifFixDesignatedPoint;
    @XmlElementRef(name = "IF_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> ifNavaidSystem;
    @XmlElementRef(name = "IF_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> ifPosition;
    @XmlElementRef(name = "IF_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> ifRunwayPoint;
    @XmlElementRef(name = "IF_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> ifAimingPoint;
    @XmlElementRef(name = "IF_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> ifAirportReferencePoint;
    @XmlElementRef(name = "IAF_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> iafFixDesignatedPoint;
    @XmlElementRef(name = "IAF_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> iafNavaidSystem;
    @XmlElementRef(name = "IAF_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMPointPropertyType> iafPosition;
    @XmlElementRef(name = "IAF_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> iafRunwayPoint;
    @XmlElementRef(name = "IAF_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> iafAimingPoint;
    @XmlElementRef(name = "IAF_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> iafAirportReferencePoint;
    @XmlElementRef(name = "buffer", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> buffer;
    @XmlElement(nillable = true)
    protected List<TerminalArrivalAreaSectorPropertyType> sector;
    @XmlElementRef(name = "approachRNAV", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<InstrumentApproachProcedurePropertyType> approachRNAV;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TerminalArrivalAreaExtensionType> extension;

    /**
     * Gets the value of the arrivalAreaType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTAAType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTAAType> getArrivalAreaType() {
        return arrivalAreaType;
    }

    /**
     * Sets the value of the arrivalAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTAAType }{@code >}
     *     
     */
    public void setArrivalAreaType(JAXBElement<CodeTAAType> value) {
        this.arrivalAreaType = value;
    }

    @Transient
    public boolean isSetArrivalAreaType() {
        return (this.arrivalAreaType!= null);
    }

    /**
     * Gets the value of the outerBufferWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getOuterBufferWidth() {
        return outerBufferWidth;
    }

    /**
     * Sets the value of the outerBufferWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setOuterBufferWidth(JAXBElement<ValDistanceType> value) {
        this.outerBufferWidth = value;
    }

    @Transient
    public boolean isSetOuterBufferWidth() {
        return (this.outerBufferWidth!= null);
    }

    /**
     * Gets the value of the lateralBufferWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLateralBufferWidth() {
        return lateralBufferWidth;
    }

    /**
     * Sets the value of the lateralBufferWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLateralBufferWidth(JAXBElement<ValDistanceType> value) {
        this.lateralBufferWidth = value;
    }

    @Transient
    public boolean isSetLateralBufferWidth() {
        return (this.lateralBufferWidth!= null);
    }

    /**
     * Gets the value of the ifFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getIFFixDesignatedPoint() {
        return ifFixDesignatedPoint;
    }

    /**
     * Sets the value of the ifFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIFFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.ifFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetIFFixDesignatedPoint() {
        return (this.ifFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the ifNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getIFNavaidSystem() {
        return ifNavaidSystem;
    }

    /**
     * Sets the value of the ifNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIFNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.ifNavaidSystem = value;
    }

    @Transient
    public boolean isSetIFNavaidSystem() {
        return (this.ifNavaidSystem!= null);
    }

    /**
     * Gets the value of the ifPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getIFPosition() {
        return ifPosition;
    }

    /**
     * Sets the value of the ifPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setIFPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.ifPosition = value;
    }

    @Transient
    public boolean isSetIFPosition() {
        return (this.ifPosition!= null);
    }

    /**
     * Gets the value of the ifRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getIFRunwayPoint() {
        return ifRunwayPoint;
    }

    /**
     * Sets the value of the ifRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIFRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.ifRunwayPoint = value;
    }

    @Transient
    public boolean isSetIFRunwayPoint() {
        return (this.ifRunwayPoint!= null);
    }

    /**
     * Gets the value of the ifAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getIFAimingPoint() {
        return ifAimingPoint;
    }

    /**
     * Sets the value of the ifAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIFAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.ifAimingPoint = value;
    }

    @Transient
    public boolean isSetIFAimingPoint() {
        return (this.ifAimingPoint!= null);
    }

    /**
     * Gets the value of the ifAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getIFAirportReferencePoint() {
        return ifAirportReferencePoint;
    }

    /**
     * Sets the value of the ifAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIFAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.ifAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetIFAirportReferencePoint() {
        return (this.ifAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the iafFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getIAFFixDesignatedPoint() {
        return iafFixDesignatedPoint;
    }

    /**
     * Sets the value of the iafFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIAFFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.iafFixDesignatedPoint = value;
    }

    @Transient
    public boolean isSetIAFFixDesignatedPoint() {
        return (this.iafFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the iafNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NavaidPropertyType> getIAFNavaidSystem() {
        return iafNavaidSystem;
    }

    /**
     * Sets the value of the iafNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIAFNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.iafNavaidSystem = value;
    }

    @Transient
    public boolean isSetIAFNavaidSystem() {
        return (this.iafNavaidSystem!= null);
    }

    /**
     * Gets the value of the iafPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMPointPropertyType> getIAFPosition() {
        return iafPosition;
    }

    /**
     * Sets the value of the iafPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMPointPropertyType }{@code >}
     *     
     */
    public void setIAFPosition(JAXBElement<AIXMPointPropertyType> value) {
        this.iafPosition = value;
    }

    @Transient
    public boolean isSetIAFPosition() {
        return (this.iafPosition!= null);
    }

    /**
     * Gets the value of the iafRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayCentrelinePointPropertyType> getIAFRunwayPoint() {
        return iafRunwayPoint;
    }

    /**
     * Sets the value of the iafRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIAFRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.iafRunwayPoint = value;
    }

    @Transient
    public boolean isSetIAFRunwayPoint() {
        return (this.iafRunwayPoint!= null);
    }

    /**
     * Gets the value of the iafAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TouchDownLiftOffPropertyType> getIAFAimingPoint() {
        return iafAimingPoint;
    }

    /**
     * Sets the value of the iafAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIAFAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.iafAimingPoint = value;
    }

    @Transient
    public boolean isSetIAFAimingPoint() {
        return (this.iafAimingPoint!= null);
    }

    /**
     * Gets the value of the iafAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AirportHeliportPropertyType> getIAFAirportReferencePoint() {
        return iafAirportReferencePoint;
    }

    /**
     * Sets the value of the iafAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIAFAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.iafAirportReferencePoint = value;
    }

    @Transient
    public boolean isSetIAFAirportReferencePoint() {
        return (this.iafAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the buffer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getBuffer() {
        return buffer;
    }

    /**
     * Sets the value of the buffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    public void setBuffer(JAXBElement<AIXMSurfacePropertyType> value) {
        this.buffer = value;
    }

    @Transient
    public boolean isSetBuffer() {
        return (this.buffer!= null);
    }

    /**
     * Gets the value of the sector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalArrivalAreaSectorPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = TerminalArrivalAreaSectorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "sector_terminalarrivalarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "sector", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "terminalarrivalareapropertygroup", referencedColumnName = "hjid")
    })
    public List<TerminalArrivalAreaSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<>();
        }
        return this.sector;
    }

    /**
     * 
     * 
     */
    public void setSector(List<TerminalArrivalAreaSectorPropertyType> sector) {
        this.sector = sector;
    }

    @Transient
    public boolean isSetSector() {
        return ((this.sector!= null)&&(!this.sector.isEmpty()));
    }

    public void unsetSector() {
        this.sector = null;
    }

    /**
     * Gets the value of the approachRNAV property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<InstrumentApproachProcedurePropertyType> getApproachRNAV() {
        return approachRNAV;
    }

    /**
     * Sets the value of the approachRNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public void setApproachRNAV(JAXBElement<InstrumentApproachProcedurePropertyType> value) {
        this.approachRNAV = value;
    }

    @Transient
    public boolean isSetApproachRNAV() {
        return (this.approachRNAV!= null);
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
    @JoinTable(name = "annotation_terminalarrivalarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "terminalarrivalareapropertygroup", referencedColumnName = "hjid")
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
     * {@link TerminalArrivalAreaExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = TerminalArrivalAreaExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<TerminalArrivalAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<TerminalArrivalAreaExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "arrivalareatype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "arrivalareatype_nilreason"))
    })
    public CodeTAAType getArrivalAreaTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTAAType.class, this.getArrivalAreaType());
    }

    public void setArrivalAreaTypeItem(CodeTAAType target) {
        setArrivalAreaType(XmlAdapterUtils.marshallJAXBElement(CodeTAAType.class, new QName("http://www.aixm.aero/schema/5.1.1", "arrivalAreaType"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "outerbufferwidth")),
        @AttributeOverride(name = "uom", column = @Column(name = "outerbufferwidth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "outerbufferwidth_nilreason"))
    })
    public ValDistanceType getOuterBufferWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getOuterBufferWidth());
    }

    public void setOuterBufferWidthItem(ValDistanceType target) {
        setOuterBufferWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "outerBufferWidth"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lateralbufferwidth")),
        @AttributeOverride(name = "uom", column = @Column(name = "lateralbufferwidth_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lateralbufferwidth_nilreason"))
    })
    public ValDistanceType getLateralBufferWidthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLateralBufferWidth());
    }

    public void setLateralBufferWidthItem(ValDistanceType target) {
        setLateralBufferWidth(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lateralBufferWidth"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "if_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getIFFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getIFFixDesignatedPoint());
    }

    public void setIFFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setIFFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IF_fixDesignatedPoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "if_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getIFNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getIFNavaidSystem());
    }

    public void setIFNavaidSystemItem(NavaidPropertyType target) {
        setIFNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IF_navaidSystem"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "if_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getIFPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getIFPosition());
    }

    public void setIFPositionItem(AIXMPointPropertyType target) {
        setIFPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IF_position"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "if_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getIFRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getIFRunwayPoint());
    }

    public void setIFRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setIFRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IF_runwayPoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "if_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getIFAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getIFAimingPoint());
    }

    public void setIFAimingPointItem(TouchDownLiftOffPropertyType target) {
        setIFAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IF_aimingPoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "if_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getIFAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getIFAirportReferencePoint());
    }

    public void setIFAirportReferencePointItem(AirportHeliportPropertyType target) {
        setIFAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IF_airportReferencePoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "iaf_fixdesignatedpoint_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getIAFFixDesignatedPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getIAFFixDesignatedPoint());
    }

    public void setIAFFixDesignatedPointItem(DesignatedPointPropertyType target) {
        setIAFFixDesignatedPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IAF_fixDesignatedPoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = NavaidPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "iaf_navaidsystem_id", referencedColumnName = "hjid")
    public NavaidPropertyType getIAFNavaidSystemItem() {
        return XmlAdapterUtils.unmarshallSource(NavaidPropertyType.class, this.getIAFNavaidSystem());
    }

    public void setIAFNavaidSystemItem(NavaidPropertyType target) {
        setIAFNavaidSystem(XmlAdapterUtils.marshallJAXBElement(NavaidPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IAF_navaidSystem"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "iaf_position_id", referencedColumnName = "hjid")
    public AIXMPointPropertyType getIAFPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMPointPropertyType.class, this.getIAFPosition());
    }

    public void setIAFPositionItem(AIXMPointPropertyType target) {
        setIAFPosition(XmlAdapterUtils.marshallJAXBElement(AIXMPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IAF_position"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayCentrelinePointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "iaf_runwaypoint_id", referencedColumnName = "hjid")
    public RunwayCentrelinePointPropertyType getIAFRunwayPointItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayCentrelinePointPropertyType.class, this.getIAFRunwayPoint());
    }

    public void setIAFRunwayPointItem(RunwayCentrelinePointPropertyType target) {
        setIAFRunwayPoint(XmlAdapterUtils.marshallJAXBElement(RunwayCentrelinePointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IAF_runwayPoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = TouchDownLiftOffPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "iaf_aimingpoint_id", referencedColumnName = "hjid")
    public TouchDownLiftOffPropertyType getIAFAimingPointItem() {
        return XmlAdapterUtils.unmarshallSource(TouchDownLiftOffPropertyType.class, this.getIAFAimingPoint());
    }

    public void setIAFAimingPointItem(TouchDownLiftOffPropertyType target) {
        setIAFAimingPoint(XmlAdapterUtils.marshallJAXBElement(TouchDownLiftOffPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IAF_aimingPoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "iaf_airportreferencepoint_id", referencedColumnName = "hjid")
    public AirportHeliportPropertyType getIAFAirportReferencePointItem() {
        return XmlAdapterUtils.unmarshallSource(AirportHeliportPropertyType.class, this.getIAFAirportReferencePoint());
    }

    public void setIAFAirportReferencePointItem(AirportHeliportPropertyType target) {
        setIAFAirportReferencePoint(XmlAdapterUtils.marshallJAXBElement(AirportHeliportPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "IAF_airportReferencePoint"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "buffer_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getBufferItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getBuffer());
    }

    public void setBufferItem(AIXMSurfacePropertyType target) {
        setBuffer(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "buffer"), TerminalArrivalAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = InstrumentApproachProcedurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approachrnav_id", referencedColumnName = "hjid")
    public InstrumentApproachProcedurePropertyType getApproachRNAVItem() {
        return XmlAdapterUtils.unmarshallSource(InstrumentApproachProcedurePropertyType.class, this.getApproachRNAV());
    }

    public void setApproachRNAVItem(InstrumentApproachProcedurePropertyType target) {
        setApproachRNAV(XmlAdapterUtils.marshallJAXBElement(InstrumentApproachProcedurePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approachRNAV"), TerminalArrivalAreaTimeSliceType.class, target));
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
        final TerminalArrivalAreaTimeSliceType that = ((TerminalArrivalAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetOuterBufferWidth();
            boolean rhsFieldIsSet = that.isSetOuterBufferWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getOuterBufferWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getOuterBufferWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "outerBufferWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "outerBufferWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachRNAV();
            boolean rhsFieldIsSet = that.isSetApproachRNAV();
            JAXBElement<InstrumentApproachProcedurePropertyType> lhsField;
            lhsField = this.getApproachRNAV();
            JAXBElement<InstrumentApproachProcedurePropertyType> rhsField;
            rhsField = that.getApproachRNAV();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachRNAV", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachRNAV", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIFAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetIFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getIFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getIFAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ifAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ifAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIFPosition();
            boolean rhsFieldIsSet = that.isSetIFPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getIFPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getIFPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ifPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ifPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIAFNavaidSystem();
            boolean rhsFieldIsSet = that.isSetIAFNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getIAFNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getIAFNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "iafNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "iafNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIAFRunwayPoint();
            boolean rhsFieldIsSet = that.isSetIAFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getIAFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getIAFRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "iafRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "iafRunwayPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArrivalAreaType();
            boolean rhsFieldIsSet = that.isSetArrivalAreaType();
            JAXBElement<CodeTAAType> lhsField;
            lhsField = this.getArrivalAreaType();
            JAXBElement<CodeTAAType> rhsField;
            rhsField = that.getArrivalAreaType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arrivalAreaType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arrivalAreaType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIFAimingPoint();
            boolean rhsFieldIsSet = that.isSetIFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getIFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getIFAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ifAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ifAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIAFAirportReferencePoint();
            boolean rhsFieldIsSet = that.isSetIAFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> lhsField;
            lhsField = this.getIAFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> rhsField;
            rhsField = that.getIAFAirportReferencePoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "iafAirportReferencePoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "iafAirportReferencePoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIFFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetIFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getIFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getIFFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ifFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ifFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<TerminalArrivalAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<TerminalArrivalAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIAFPosition();
            boolean rhsFieldIsSet = that.isSetIAFPosition();
            JAXBElement<AIXMPointPropertyType> lhsField;
            lhsField = this.getIAFPosition();
            JAXBElement<AIXMPointPropertyType> rhsField;
            rhsField = that.getIAFPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "iafPosition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "iafPosition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetBuffer();
            boolean rhsFieldIsSet = that.isSetBuffer();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getBuffer();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getBuffer();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "buffer", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "buffer", rhsField);
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
            boolean lhsFieldIsSet = this.isSetIAFAimingPoint();
            boolean rhsFieldIsSet = that.isSetIAFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> lhsField;
            lhsField = this.getIAFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> rhsField;
            rhsField = that.getIAFAimingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "iafAimingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "iafAimingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIFNavaidSystem();
            boolean rhsFieldIsSet = that.isSetIFNavaidSystem();
            JAXBElement<NavaidPropertyType> lhsField;
            lhsField = this.getIFNavaidSystem();
            JAXBElement<NavaidPropertyType> rhsField;
            rhsField = that.getIFNavaidSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ifNavaidSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ifNavaidSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSector();
            boolean rhsFieldIsSet = that.isSetSector();
            List<TerminalArrivalAreaSectorPropertyType> lhsField;
            lhsField = (this.isSetSector()?this.getSector():null);
            List<TerminalArrivalAreaSectorPropertyType> rhsField;
            rhsField = (that.isSetSector()?that.getSector():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sector", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sector", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLateralBufferWidth();
            boolean rhsFieldIsSet = that.isSetLateralBufferWidth();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLateralBufferWidth();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLateralBufferWidth();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lateralBufferWidth", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lateralBufferWidth", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIAFFixDesignatedPoint();
            boolean rhsFieldIsSet = that.isSetIAFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getIAFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getIAFFixDesignatedPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "iafFixDesignatedPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "iafFixDesignatedPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIFRunwayPoint();
            boolean rhsFieldIsSet = that.isSetIFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> lhsField;
            lhsField = this.getIFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> rhsField;
            rhsField = that.getIFRunwayPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "ifRunwayPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "ifRunwayPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetArrivalAreaType();
            JAXBElement<CodeTAAType> theField;
            theField = this.getArrivalAreaType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arrivalAreaType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOuterBufferWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getOuterBufferWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "outerBufferWidth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLateralBufferWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLateralBufferWidth();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lateralBufferWidth", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getIFFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ifFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getIFNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ifNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getIFPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ifPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getIFRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ifRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getIFAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ifAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getIFAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "ifAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getIAFFixDesignatedPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "iafFixDesignatedPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getIAFNavaidSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "iafNavaidSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getIAFPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "iafPosition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getIAFRunwayPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "iafRunwayPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getIAFAimingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "iafAimingPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getIAFAirportReferencePoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "iafAirportReferencePoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBuffer();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getBuffer();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "buffer", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<TerminalArrivalAreaSectorPropertyType> theField;
            theField = (this.isSetSector()?this.getSector():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sector", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachRNAV();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproachRNAV();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachRNAV", theField);
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
            List<TerminalArrivalAreaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetArrivalAreaType();
            JAXBElement<CodeTAAType> theField;
            theField = this.getArrivalAreaType();
            strategy.appendField(locator, this, "arrivalAreaType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOuterBufferWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getOuterBufferWidth();
            strategy.appendField(locator, this, "outerBufferWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLateralBufferWidth();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLateralBufferWidth();
            strategy.appendField(locator, this, "lateralBufferWidth", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getIFFixDesignatedPoint();
            strategy.appendField(locator, this, "ifFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getIFNavaidSystem();
            strategy.appendField(locator, this, "ifNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getIFPosition();
            strategy.appendField(locator, this, "ifPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getIFRunwayPoint();
            strategy.appendField(locator, this, "ifRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getIFAimingPoint();
            strategy.appendField(locator, this, "ifAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getIFAirportReferencePoint();
            strategy.appendField(locator, this, "ifAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFFixDesignatedPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getIAFFixDesignatedPoint();
            strategy.appendField(locator, this, "iafFixDesignatedPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFNavaidSystem();
            JAXBElement<NavaidPropertyType> theField;
            theField = this.getIAFNavaidSystem();
            strategy.appendField(locator, this, "iafNavaidSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFPosition();
            JAXBElement<AIXMPointPropertyType> theField;
            theField = this.getIAFPosition();
            strategy.appendField(locator, this, "iafPosition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFRunwayPoint();
            JAXBElement<RunwayCentrelinePointPropertyType> theField;
            theField = this.getIAFRunwayPoint();
            strategy.appendField(locator, this, "iafRunwayPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFAimingPoint();
            JAXBElement<TouchDownLiftOffPropertyType> theField;
            theField = this.getIAFAimingPoint();
            strategy.appendField(locator, this, "iafAimingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIAFAirportReferencePoint();
            JAXBElement<AirportHeliportPropertyType> theField;
            theField = this.getIAFAirportReferencePoint();
            strategy.appendField(locator, this, "iafAirportReferencePoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetBuffer();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getBuffer();
            strategy.appendField(locator, this, "buffer", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSector();
            List<TerminalArrivalAreaSectorPropertyType> theField;
            theField = (this.isSetSector()?this.getSector():null);
            strategy.appendField(locator, this, "sector", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachRNAV();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproachRNAV();
            strategy.appendField(locator, this, "approachRNAV", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TerminalArrivalAreaExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
