
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
 * <p>Java class for UnplannedHoldingTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnplannedHoldingTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}UnplannedHoldingPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractUnplannedHoldingExtension"/>
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
@XmlType(name = "UnplannedHoldingTimeSliceType", propOrder = {
    "unplannedHolding",
    "authorizedAltitude",
    "altitudeReference",
    "controlledAirspace",
    "holdingPoint",
    "annotation",
    "extension"
})
@Entity(name = "UnplannedHoldingTimeSliceType")
@Table(name = "unplannedholding_ts", schema = "holding")
public class UnplannedHoldingTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "unplannedHolding", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApprovalType> unplannedHolding;
    @XmlElementRef(name = "authorizedAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> authorizedAltitude;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElementRef(name = "controlledAirspace", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> controlledAirspace;
    @XmlElementRef(name = "holdingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> holdingPoint;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<UnplannedHoldingExtensionType> extension;

    /**
     * Gets the value of the unplannedHolding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApprovalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeApprovalType> getUnplannedHolding() {
        return unplannedHolding;
    }

    /**
     * Sets the value of the unplannedHolding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApprovalType }{@code >}
     *     
     */
    public void setUnplannedHolding(JAXBElement<CodeApprovalType> value) {
        this.unplannedHolding = value;
    }

    @Transient
    public boolean isSetUnplannedHolding() {
        return (this.unplannedHolding!= null);
    }

    /**
     * Gets the value of the authorizedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getAuthorizedAltitude() {
        return authorizedAltitude;
    }

    /**
     * Sets the value of the authorizedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAuthorizedAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.authorizedAltitude = value;
    }

    @Transient
    public boolean isSetAuthorizedAltitude() {
        return (this.authorizedAltitude!= null);
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
     * Gets the value of the controlledAirspace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getControlledAirspace() {
        return controlledAirspace;
    }

    /**
     * Sets the value of the controlledAirspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setControlledAirspace(JAXBElement<CodeYesNoType> value) {
        this.controlledAirspace = value;
    }

    @Transient
    public boolean isSetControlledAirspace() {
        return (this.controlledAirspace!= null);
    }

    /**
     * Gets the value of the holdingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<SegmentPointPropertyType> getHoldingPoint() {
        return holdingPoint;
    }

    /**
     * Sets the value of the holdingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public void setHoldingPoint(JAXBElement<SegmentPointPropertyType> value) {
        this.holdingPoint = value;
    }

    @Transient
    public boolean isSetHoldingPoint() {
        return (this.holdingPoint!= null);
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
    @JoinTable(name = "annotation_unplannedholding_link", schema = "holding", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "unplannedholdingpropertygroup", referencedColumnName = "hjid")
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
     * {@link UnplannedHoldingExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = UnplannedHoldingExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<UnplannedHoldingExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<UnplannedHoldingExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "unplannedholding")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "unplannedholding_nilreason"))
    })
    public CodeApprovalType getUnplannedHoldingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeApprovalType.class, this.getUnplannedHolding());
    }

    public void setUnplannedHoldingItem(CodeApprovalType target) {
        setUnplannedHolding(XmlAdapterUtils.marshallJAXBElement(CodeApprovalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "unplannedHolding"), UnplannedHoldingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "authorizedaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "authorizedaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "authorizedaltitude_nilreason"))
    })
    public ValDistanceVerticalType getAuthorizedAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getAuthorizedAltitude());
    }

    public void setAuthorizedAltitudeItem(ValDistanceVerticalType target) {
        setAuthorizedAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "authorizedAltitude"), UnplannedHoldingTimeSliceType.class, target));
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
        setAltitudeReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeReference"), UnplannedHoldingTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "controlledairspace")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "controlledairspace_nilreason"))
    })
    public CodeYesNoType getControlledAirspaceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getControlledAirspace());
    }

    public void setControlledAirspaceItem(CodeYesNoType target) {
        setControlledAirspace(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "controlledAirspace"), UnplannedHoldingTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = SegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "holdingpoint_id", referencedColumnName = "hjid")
    public SegmentPointPropertyType getHoldingPointItem() {
        return XmlAdapterUtils.unmarshallSource(SegmentPointPropertyType.class, this.getHoldingPoint());
    }

    public void setHoldingPointItem(SegmentPointPropertyType target) {
        setHoldingPoint(XmlAdapterUtils.marshallJAXBElement(SegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "holdingPoint"), UnplannedHoldingTimeSliceType.class, target));
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
        final UnplannedHoldingTimeSliceType that = ((UnplannedHoldingTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetControlledAirspace();
            boolean rhsFieldIsSet = that.isSetControlledAirspace();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getControlledAirspace();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getControlledAirspace();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlledAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlledAirspace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<UnplannedHoldingExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<UnplannedHoldingExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetUnplannedHolding();
            boolean rhsFieldIsSet = that.isSetUnplannedHolding();
            JAXBElement<CodeApprovalType> lhsField;
            lhsField = this.getUnplannedHolding();
            JAXBElement<CodeApprovalType> rhsField;
            rhsField = that.getUnplannedHolding();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unplannedHolding", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unplannedHolding", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAuthorizedAltitude();
            boolean rhsFieldIsSet = that.isSetAuthorizedAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getAuthorizedAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getAuthorizedAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "authorizedAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "authorizedAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHoldingPoint();
            boolean rhsFieldIsSet = that.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> lhsField;
            lhsField = this.getHoldingPoint();
            JAXBElement<SegmentPointPropertyType> rhsField;
            rhsField = that.getHoldingPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "holdingPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "holdingPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetUnplannedHolding();
            JAXBElement<CodeApprovalType> theField;
            theField = this.getUnplannedHolding();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unplannedHolding", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAuthorizedAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAuthorizedAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "authorizedAltitude", theField);
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
            boolean theFieldIsSet = this.isSetControlledAirspace();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getControlledAirspace();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlledAirspace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getHoldingPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "holdingPoint", theField);
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
            List<UnplannedHoldingExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetUnplannedHolding();
            JAXBElement<CodeApprovalType> theField;
            theField = this.getUnplannedHolding();
            strategy.appendField(locator, this, "unplannedHolding", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAuthorizedAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getAuthorizedAltitude();
            strategy.appendField(locator, this, "authorizedAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getAltitudeReference();
            strategy.appendField(locator, this, "altitudeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlledAirspace();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getControlledAirspace();
            strategy.appendField(locator, this, "controlledAirspace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHoldingPoint();
            JAXBElement<SegmentPointPropertyType> theField;
            theField = this.getHoldingPoint();
            strategy.appendField(locator, this, "holdingPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<UnplannedHoldingExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
