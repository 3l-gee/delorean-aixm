
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
 * <p>Java class for ApproachAltitudeTableType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachAltitudeTableType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ApproachAltitudeTablePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractApproachAltitudeTableExtension"/>
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
@XmlType(name = "ApproachAltitudeTableType", propOrder = {
    "measurementPoint",
    "altitude",
    "altitudeReference",
    "annotation",
    "extension"
})
@Entity(name = "ApproachAltitudeTableType")
@Table(name = "approachaltitudetable", schema = "procedure")
public class ApproachAltitudeTableType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "measurementPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureDistanceType> measurementPoint;
    @XmlElementRef(name = "altitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitude;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ApproachAltitudeTableTypeExtensionType> extension;

    /**
     * Gets the value of the measurementPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeProcedureDistanceType> getMeasurementPoint() {
        return measurementPoint;
    }

    /**
     * Sets the value of the measurementPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureDistanceType }{@code >}
     *     
     */
    public void setMeasurementPoint(JAXBElement<CodeProcedureDistanceType> value) {
        this.measurementPoint = value;
    }

    @Transient
    public boolean isSetMeasurementPoint() {
        return (this.measurementPoint!= null);
    }

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
    @JoinTable(name = "annotation_approachaltitudetable_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachaltitudetablepropertygroup", referencedColumnName = "hjid")
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
     * {@link ApproachAltitudeTableTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ApproachAltitudeTableTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_APPROACH_ALTITUDE__0")
    public List<ApproachAltitudeTableTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ApproachAltitudeTableTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "measurementpoint")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "measurementpoint_nilreason"))
    })
    public CodeProcedureDistanceType getMeasurementPointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeProcedureDistanceType.class, this.getMeasurementPoint());
    }

    public void setMeasurementPointItem(CodeProcedureDistanceType target) {
        setMeasurementPoint(XmlAdapterUtils.marshallJAXBElement(CodeProcedureDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "measurementPoint"), ApproachAltitudeTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "altitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitude_nilreason"))
    })
    public ValDistanceVerticalType getAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAltitude());
    }

    public void setAltitudeItem(ValDistanceVerticalType target) {
        setAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitude"), ApproachAltitudeTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudereference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudereference_nilreason"))
    })
    public CodeVerticalReferenceType getAltitudeReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getAltitudeReference());
    }

    public void setAltitudeReferenceItem(CodeVerticalReferenceType target) {
        setAltitudeReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeReference"), ApproachAltitudeTableType.class, target));
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
        final ApproachAltitudeTableType that = ((ApproachAltitudeTableType) object);
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
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ApproachAltitudeTableTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ApproachAltitudeTableTypeExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetMeasurementPoint();
            boolean rhsFieldIsSet = that.isSetMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> lhsField;
            lhsField = this.getMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> rhsField;
            rhsField = that.getMeasurementPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "measurementPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "measurementPoint", rhsField);
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
            boolean theFieldIsSet = this.isSetMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getMeasurementPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "measurementPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachAltitudeTableTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getMeasurementPoint();
            strategy.appendField(locator, this, "measurementPoint", buffer, theField, theFieldIsSet);
        }
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachAltitudeTableTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
