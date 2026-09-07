
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
 * <p>Java class for FinalApproachControlAltitudeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinalApproachControlAltitudeType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="altitude" type="{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="altitudeReference" type="{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="height" type="{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="heightReference" type="{http://www.aixm.aero/schema/5.2}CodeHeightReferenceType" minOccurs="0"/>
 *         <element name="measurementPoint" type="{http://www.aixm.aero/schema/5.2}CodeFinalSegmentPointType" minOccurs="0"/>
 *         <element name="location" type="{http://www.aixm.aero/schema/5.2}FinalApproachControlPositionPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractFinalApproachControlAltitudeExtension"/>
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
@XmlType(name = "FinalApproachControlAltitudeType", propOrder = {
    "altitude",
    "altitudeReference",
    "height",
    "heightReference",
    "measurementPoint",
    "location",
    "annotation",
    "extension"
})
@Entity(name = "FinalApproachControlAltitudeType")
@Table(name = "finalapproachcontrolaltitude_o", schema = "procedure")
public class FinalApproachControlAltitudeType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "altitude", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitude;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElementRef(name = "height", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> height;
    @XmlElementRef(name = "heightReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHeightReferenceType> heightReference;
    @XmlElementRef(name = "measurementPoint", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFinalSegmentPointType> measurementPoint;
    @XmlElement(nillable = true)
    protected List<FinalApproachControlPositionPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FinalApproachControlAltitudeExtensionType> extension;

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.altitude = value;
    }

    @Transient
    public boolean isSetAltitude() {
        return (this.altitude!= null);
    }

    /**
     * Gets the value of the altitudeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getAltitudeReference() {
        return altitudeReference;
    }

    /**
     * Sets the value of the altitudeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeReference = value;
    }

    @Transient
    public boolean isSetAltitudeReference() {
        return (this.altitudeReference!= null);
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.height = value;
    }

    @Transient
    public boolean isSetHeight() {
        return (this.height!= null);
    }

    /**
     * Gets the value of the heightReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeHeightReferenceType> getHeightReference() {
        return heightReference;
    }

    /**
     * Sets the value of the heightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    public void setHeightReference(JAXBElement<CodeHeightReferenceType> value) {
        this.heightReference = value;
    }

    @Transient
    public boolean isSetHeightReference() {
        return (this.heightReference!= null);
    }

    /**
     * Gets the value of the measurementPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFinalSegmentPointType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFinalSegmentPointType> getMeasurementPoint() {
        return measurementPoint;
    }

    /**
     * Sets the value of the measurementPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFinalSegmentPointType }{@code >}
     *     
     */
    public void setMeasurementPoint(JAXBElement<CodeFinalSegmentPointType> value) {
        this.measurementPoint = value;
    }

    @Transient
    public boolean isSetMeasurementPoint() {
        return (this.measurementPoint!= null);
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
     * {@link FinalApproachControlPositionPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = FinalApproachControlPositionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "fnlapprchcntrlalttdtp_lctn_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "finalapproachcontrolaltitude_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")
    })
    public List<FinalApproachControlPositionPropertyType> getLocation() {
        if (location == null) {
            location = new ArrayList<>();
        }
        return this.location;
    }

    /**
     * 
     * 
     */
    public void setLocation(List<FinalApproachControlPositionPropertyType> location) {
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
    @JoinTable(name = "fnlapprchcntrlalttdtp_annttn_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "finalapproachcontrolaltitude_o_hjid", referencedColumnName = "hjid")
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
     * {@link FinalApproachControlAltitudeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FinalApproachControlAltitudeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "finalapproachcontrolaltitude_oe_hjid", referencedColumnName = "hjid")
    public List<FinalApproachControlAltitudeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FinalApproachControlAltitudeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "altitude", columnDefinition = "valdistanceverticalbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "altitudeuom", columnDefinition = "uomdistancevertical")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "altitudeaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudenilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceVerticalType getAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAltitude());
    }

    public void setAltitudeItem(ValDistanceVerticalType target) {
        setAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.2", "altitude"), FinalApproachControlAltitudeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudereference", columnDefinition = "codeverticalreferencebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudereferencenilreason", columnDefinition = "nilreason"))
    })
    public CodeVerticalReferenceType getAltitudeReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getAltitudeReference());
    }

    public void setAltitudeReferenceItem(CodeVerticalReferenceType target) {
        setAltitudeReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.2", "altitudeReference"), FinalApproachControlAltitudeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "height", columnDefinition = "valdistanceverticalbase")),
        @AttributeOverride(name = "uom", column = @Column(name = "heightuom", columnDefinition = "uomdistancevertical")),
        @AttributeOverride(name = "accuracy", column = @Column(name = "heightaccuracy", columnDefinition = "numericalwithnilreason")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "heightnilreason", columnDefinition = "nilreason"))
    })
    public ValDistanceVerticalType getHeightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getHeight());
    }

    public void setHeightItem(ValDistanceVerticalType target) {
        setHeight(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.2", "height"), FinalApproachControlAltitudeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "heightreference", columnDefinition = "codeheightreferencebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "heightreferencenilreason", columnDefinition = "nilreason"))
    })
    public CodeHeightReferenceType getHeightReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHeightReferenceType.class, this.getHeightReference());
    }

    public void setHeightReferenceItem(CodeHeightReferenceType target) {
        setHeightReference(XmlAdapterUtils.marshallJAXBElement(CodeHeightReferenceType.class, new QName("http://www.aixm.aero/schema/5.2", "heightReference"), FinalApproachControlAltitudeType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "measurementpoint", columnDefinition = "codefinalsegmentpointbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "measurementpointnilreason", columnDefinition = "nilreason"))
    })
    public CodeFinalSegmentPointType getMeasurementPointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFinalSegmentPointType.class, this.getMeasurementPoint());
    }

    public void setMeasurementPointItem(CodeFinalSegmentPointType target) {
        setMeasurementPoint(XmlAdapterUtils.marshallJAXBElement(CodeFinalSegmentPointType.class, new QName("http://www.aixm.aero/schema/5.2", "measurementPoint"), FinalApproachControlAltitudeType.class, target));
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
        final FinalApproachControlAltitudeType that = ((FinalApproachControlAltitudeType) object);
        {
            boolean lhsFieldIsSet = this.isSetAltitudeReference();
            boolean rhsFieldIsSet = that.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getAltitudeReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMeasurementPoint();
            boolean rhsFieldIsSet = that.isSetMeasurementPoint();
            JAXBElement<CodeFinalSegmentPointType> lhsField;
            lhsField = this.getMeasurementPoint();
            JAXBElement<CodeFinalSegmentPointType> rhsField;
            rhsField = that.getMeasurementPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "measurementPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "measurementPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHeight();
            boolean rhsFieldIsSet = that.isSetHeight();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getHeight();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getHeight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "height", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "height", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            List<FinalApproachControlPositionPropertyType> lhsField;
            lhsField = (this.isSetLocation()?this.getLocation():null);
            List<FinalApproachControlPositionPropertyType> rhsField;
            rhsField = (that.isSetLocation()?that.getLocation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHeightReference();
            boolean rhsFieldIsSet = that.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> lhsField;
            lhsField = this.getHeightReference();
            JAXBElement<CodeHeightReferenceType> rhsField;
            rhsField = that.getHeightReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "heightReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "heightReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FinalApproachControlAltitudeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FinalApproachControlAltitudeExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetAltitude();
            boolean rhsFieldIsSet = that.isSetAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitude", rhsField);
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
            boolean theFieldIsSet = this.isSetAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getHeight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "height", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> theField;
            theField = this.getHeightReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "heightReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMeasurementPoint();
            JAXBElement<CodeFinalSegmentPointType> theField;
            theField = this.getMeasurementPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "measurementPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            List<FinalApproachControlPositionPropertyType> theField;
            theField = (this.isSetLocation()?this.getLocation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "location", theField);
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
            List<FinalApproachControlAltitudeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAltitude();
            strategy.appendField(locator, this, "altitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            strategy.appendField(locator, this, "altitudeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeight();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHeightReference();
            JAXBElement<CodeHeightReferenceType> theField;
            theField = this.getHeightReference();
            strategy.appendField(locator, this, "heightReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMeasurementPoint();
            JAXBElement<CodeFinalSegmentPointType> theField;
            theField = this.getMeasurementPoint();
            strategy.appendField(locator, this, "measurementPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            List<FinalApproachControlPositionPropertyType> theField;
            theField = (this.isSetLocation()?this.getLocation():null);
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalApproachControlAltitudeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
