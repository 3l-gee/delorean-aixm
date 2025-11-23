
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
 * <p>Java class for DepartureArrivalConditionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DepartureArrivalConditionType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}DepartureArrivalConditionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractDepartureArrivalConditionExtension"/>
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
@XmlType(name = "DepartureArrivalConditionType", propOrder = {
    "minimumEnrouteAltitude",
    "minimumCrossingAtEnd",
    "minimumCrossingAtEndReference",
    "maximumCrossingAtEnd",
    "maximumCrossingAtEndReference",
    "engineType",
    "annotation",
    "extension"
})
@Entity(name = "DepartureArrivalConditionType")
@Table(name = "departurearrivalcondition", schema = "procedure")
public class DepartureArrivalConditionType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "minimumEnrouteAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEnrouteAltitude;
    @XmlElementRef(name = "minimumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCrossingAtEnd;
    @XmlElementRef(name = "minimumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumCrossingAtEndReference;
    @XmlElementRef(name = "maximumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumCrossingAtEnd;
    @XmlElementRef(name = "maximumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumCrossingAtEndReference;
    @XmlElementRef(name = "engineType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> engineType;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<DepartureArrivalConditionTypeExtensionType> extension;

    /**
     * Gets the value of the minimumEnrouteAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumEnrouteAltitude() {
        return minimumEnrouteAltitude;
    }

    /**
     * Sets the value of the minimumEnrouteAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEnrouteAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEnrouteAltitude = value;
    }

    @Transient
    public boolean isSetMinimumEnrouteAltitude() {
        return (this.minimumEnrouteAltitude!= null);
    }

    /**
     * Gets the value of the minimumCrossingAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumCrossingAtEnd() {
        return minimumCrossingAtEnd;
    }

    /**
     * Sets the value of the minimumCrossingAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCrossingAtEnd = value;
    }

    @Transient
    public boolean isSetMinimumCrossingAtEnd() {
        return (this.minimumCrossingAtEnd!= null);
    }

    /**
     * Gets the value of the minimumCrossingAtEndReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMinimumCrossingAtEndReference() {
        return minimumCrossingAtEndReference;
    }

    /**
     * Sets the value of the minimumCrossingAtEndReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumCrossingAtEndReference = value;
    }

    @Transient
    public boolean isSetMinimumCrossingAtEndReference() {
        return (this.minimumCrossingAtEndReference!= null);
    }

    /**
     * Gets the value of the maximumCrossingAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMaximumCrossingAtEnd() {
        return maximumCrossingAtEnd;
    }

    /**
     * Sets the value of the maximumCrossingAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumCrossingAtEnd = value;
    }

    @Transient
    public boolean isSetMaximumCrossingAtEnd() {
        return (this.maximumCrossingAtEnd!= null);
    }

    /**
     * Gets the value of the maximumCrossingAtEndReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMaximumCrossingAtEndReference() {
        return maximumCrossingAtEndReference;
    }

    /**
     * Sets the value of the maximumCrossingAtEndReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumCrossingAtEndReference = value;
    }

    @Transient
    public boolean isSetMaximumCrossingAtEndReference() {
        return (this.maximumCrossingAtEndReference!= null);
    }

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AircraftCharacteristicPropertyType> getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setEngineType(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.engineType = value;
    }

    @Transient
    public boolean isSetEngineType() {
        return (this.engineType!= null);
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
    @JoinTable(name = "annotation_departurearrivalcondition_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "departurearrivalconditionpropertygroup", referencedColumnName = "hjid")
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
     * {@link DepartureArrivalConditionTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = DepartureArrivalConditionTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_DEPARTURE_ARRIVAL__0")
    public List<DepartureArrivalConditionTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<DepartureArrivalConditionTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "minimumenroutealtitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumenroutealtitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumenroutealtitude_nilreason"))
    })
    public ValDistanceVerticalType getMinimumEnrouteAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumEnrouteAltitude());
    }

    public void setMinimumEnrouteAltitudeItem(ValDistanceVerticalType target) {
        setMinimumEnrouteAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumEnrouteAltitude"), DepartureArrivalConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumcrossingatend")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumcrossingatend_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumcrossingatend_nilreason"))
    })
    public ValDistanceVerticalType getMinimumCrossingAtEndItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumCrossingAtEnd());
    }

    public void setMinimumCrossingAtEndItem(ValDistanceVerticalType target) {
        setMinimumCrossingAtEnd(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumCrossingAtEnd"), DepartureArrivalConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumcrossingatendreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumcrossingatendreference_nilreason"))
    })
    public CodeVerticalReferenceType getMinimumCrossingAtEndReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getMinimumCrossingAtEndReference());
    }

    public void setMinimumCrossingAtEndReferenceItem(CodeVerticalReferenceType target) {
        setMinimumCrossingAtEndReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumCrossingAtEndReference"), DepartureArrivalConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "maximumcrossingatend")),
        @AttributeOverride(name = "uom", column = @Column(name = "maximumcrossingatend_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "maximumcrossingatend_nilreason"))
    })
    public ValDistanceVerticalType getMaximumCrossingAtEndItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMaximumCrossingAtEnd());
    }

    public void setMaximumCrossingAtEndItem(ValDistanceVerticalType target) {
        setMaximumCrossingAtEnd(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "maximumCrossingAtEnd"), DepartureArrivalConditionType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "maximumcrossingatendreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "maximumcrossingatendreference_nilreason"))
    })
    public CodeVerticalReferenceType getMaximumCrossingAtEndReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getMaximumCrossingAtEndReference());
    }

    public void setMaximumCrossingAtEndReferenceItem(CodeVerticalReferenceType target) {
        setMaximumCrossingAtEndReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "maximumCrossingAtEndReference"), DepartureArrivalConditionType.class, target));
    }

    @ManyToOne(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "enginetype_id", referencedColumnName = "hjid")
    public AircraftCharacteristicPropertyType getEngineTypeItem() {
        return XmlAdapterUtils.unmarshallSource(AircraftCharacteristicPropertyType.class, this.getEngineType());
    }

    public void setEngineTypeItem(AircraftCharacteristicPropertyType target) {
        setEngineType(XmlAdapterUtils.marshallJAXBElement(AircraftCharacteristicPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "engineType"), DepartureArrivalConditionType.class, target));
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
        final DepartureArrivalConditionType that = ((DepartureArrivalConditionType) object);
        {
            boolean lhsFieldIsSet = this.isSetMinimumCrossingAtEnd();
            boolean rhsFieldIsSet = that.isSetMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumCrossingAtEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumCrossingAtEnd", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumCrossingAtEnd", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumEnrouteAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumEnrouteAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumEnrouteAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumEnrouteAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumCrossingAtEndReference();
            boolean rhsFieldIsSet = that.isSetMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMinimumCrossingAtEndReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumCrossingAtEndReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumCrossingAtEndReference", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<DepartureArrivalConditionTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<DepartureArrivalConditionTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumCrossingAtEndReference();
            boolean rhsFieldIsSet = that.isSetMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMaximumCrossingAtEndReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumCrossingAtEndReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumCrossingAtEndReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumCrossingAtEnd();
            boolean rhsFieldIsSet = that.isSetMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMaximumCrossingAtEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumCrossingAtEnd", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumCrossingAtEnd", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEngineType();
            boolean rhsFieldIsSet = that.isSetEngineType();
            JAXBElement<AircraftCharacteristicPropertyType> lhsField;
            lhsField = this.getEngineType();
            JAXBElement<AircraftCharacteristicPropertyType> rhsField;
            rhsField = that.getEngineType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "engineType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "engineType", rhsField);
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
            boolean theFieldIsSet = this.isSetMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumEnrouteAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumEnrouteAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumCrossingAtEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumCrossingAtEnd", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumCrossingAtEndReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumCrossingAtEndReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumCrossingAtEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumCrossingAtEnd", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumCrossingAtEndReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumCrossingAtEndReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEngineType();
            JAXBElement<AircraftCharacteristicPropertyType> theField;
            theField = this.getEngineType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "engineType", theField);
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
            List<DepartureArrivalConditionTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumEnrouteAltitude();
            strategy.appendField(locator, this, "minimumEnrouteAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumCrossingAtEnd();
            strategy.appendField(locator, this, "minimumCrossingAtEnd", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumCrossingAtEndReference();
            strategy.appendField(locator, this, "minimumCrossingAtEndReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumCrossingAtEnd();
            strategy.appendField(locator, this, "maximumCrossingAtEnd", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumCrossingAtEndReference();
            strategy.appendField(locator, this, "maximumCrossingAtEndReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEngineType();
            JAXBElement<AircraftCharacteristicPropertyType> theField;
            theField = this.getEngineType();
            strategy.appendField(locator, this, "engineType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<DepartureArrivalConditionTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
