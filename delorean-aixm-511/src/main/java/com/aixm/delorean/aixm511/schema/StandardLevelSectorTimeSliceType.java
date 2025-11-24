
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
 * <p>Java class for StandardLevelSectorTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StandardLevelSectorTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}StandardLevelSectorPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractStandardLevelSectorExtension"/>
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
@XmlType(name = "StandardLevelSectorTimeSliceType", propOrder = {
    "flightRule",
    "fromTrack",
    "toTrack",
    "angleType",
    "applicableAirspace",
    "applicableLevelColumn",
    "annotation",
    "extension"
})
@Entity(name = "StandardLevelSectorTimeSliceType")
@Table(name = "standardlevelsector_ts", schema = "shared")
public class StandardLevelSectorTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "flightRule", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightRuleType> flightRule;
    @XmlElementRef(name = "fromTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> fromTrack;
    @XmlElementRef(name = "toTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> toTrack;
    @XmlElementRef(name = "angleType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNorthReferenceType> angleType;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> applicableAirspace;
    @XmlElementRef(name = "applicableLevelColumn", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardLevelColumnPropertyType> applicableLevelColumn;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<StandardLevelSectorExtensionType> extension;

    /**
     * Gets the value of the flightRule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightRuleType> getFlightRule() {
        return flightRule;
    }

    /**
     * Sets the value of the flightRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public void setFlightRule(JAXBElement<CodeFlightRuleType> value) {
        this.flightRule = value;
    }

    @Transient
    public boolean isSetFlightRule() {
        return (this.flightRule!= null);
    }

    /**
     * Gets the value of the fromTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getFromTrack() {
        return fromTrack;
    }

    /**
     * Sets the value of the fromTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setFromTrack(JAXBElement<ValBearingType> value) {
        this.fromTrack = value;
    }

    @Transient
    public boolean isSetFromTrack() {
        return (this.fromTrack!= null);
    }

    /**
     * Gets the value of the toTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getToTrack() {
        return toTrack;
    }

    /**
     * Sets the value of the toTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setToTrack(JAXBElement<ValBearingType> value) {
        this.toTrack = value;
    }

    @Transient
    public boolean isSetToTrack() {
        return (this.toTrack!= null);
    }

    /**
     * Gets the value of the angleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNorthReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNorthReferenceType> getAngleType() {
        return angleType;
    }

    /**
     * Sets the value of the angleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNorthReferenceType }{@code >}
     *     
     */
    public void setAngleType(JAXBElement<CodeNorthReferenceType> value) {
        this.angleType = value;
    }

    @Transient
    public boolean isSetAngleType() {
        return (this.angleType!= null);
    }

    /**
     * Gets the value of the applicableAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableAirspace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "applicableairspace_standardlevelsector_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "applicableairspace", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardlevelsectorpropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspacePropertyType> getApplicableAirspace() {
        if (applicableAirspace == null) {
            applicableAirspace = new ArrayList<>();
        }
        return this.applicableAirspace;
    }

    /**
     * 
     * 
     */
    public void setApplicableAirspace(List<AirspacePropertyType> applicableAirspace) {
        this.applicableAirspace = applicableAirspace;
    }

    @Transient
    public boolean isSetApplicableAirspace() {
        return ((this.applicableAirspace!= null)&&(!this.applicableAirspace.isEmpty()));
    }

    public void unsetApplicableAirspace() {
        this.applicableAirspace = null;
    }

    /**
     * Gets the value of the applicableLevelColumn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardLevelColumnPropertyType> getApplicableLevelColumn() {
        return applicableLevelColumn;
    }

    /**
     * Sets the value of the applicableLevelColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnPropertyType }{@code >}
     *     
     */
    public void setApplicableLevelColumn(JAXBElement<StandardLevelColumnPropertyType> value) {
        this.applicableLevelColumn = value;
    }

    @Transient
    public boolean isSetApplicableLevelColumn() {
        return (this.applicableLevelColumn!= null);
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
    @JoinTable(name = "annotation_standardlevelsector_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardlevelsectorpropertygroup", referencedColumnName = "hjid")
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
     * {@link StandardLevelSectorExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = StandardLevelSectorExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<StandardLevelSectorExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<StandardLevelSectorExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "flightrule")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flightrule_nilreason"))
    })
    public CodeFlightRuleType getFlightRuleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightRuleType.class, this.getFlightRule());
    }

    public void setFlightRuleItem(CodeFlightRuleType target) {
        setFlightRule(XmlAdapterUtils.marshallJAXBElement(CodeFlightRuleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightRule"), StandardLevelSectorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "fromtrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "fromtrack_nilreason"))
    })
    public ValBearingType getFromTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getFromTrack());
    }

    public void setFromTrackItem(ValBearingType target) {
        setFromTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "fromTrack"), StandardLevelSectorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "totrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "totrack_nilreason"))
    })
    public ValBearingType getToTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getToTrack());
    }

    public void setToTrackItem(ValBearingType target) {
        setToTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "toTrack"), StandardLevelSectorTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "angletype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "angletype_nilreason"))
    })
    public CodeNorthReferenceType getAngleTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNorthReferenceType.class, this.getAngleType());
    }

    public void setAngleTypeItem(CodeNorthReferenceType target) {
        setAngleType(XmlAdapterUtils.marshallJAXBElement(CodeNorthReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "angleType"), StandardLevelSectorTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = StandardLevelColumnPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "applicablelevelcolumn_id", referencedColumnName = "hjid")
    public StandardLevelColumnPropertyType getApplicableLevelColumnItem() {
        return XmlAdapterUtils.unmarshallSource(StandardLevelColumnPropertyType.class, this.getApplicableLevelColumn());
    }

    public void setApplicableLevelColumnItem(StandardLevelColumnPropertyType target) {
        setApplicableLevelColumn(XmlAdapterUtils.marshallJAXBElement(StandardLevelColumnPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "applicableLevelColumn"), StandardLevelSectorTimeSliceType.class, target));
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
        final StandardLevelSectorTimeSliceType that = ((StandardLevelSectorTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetToTrack();
            boolean rhsFieldIsSet = that.isSetToTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getToTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getToTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "toTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "toTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApplicableAirspace();
            boolean rhsFieldIsSet = that.isSetApplicableAirspace();
            List<AirspacePropertyType> lhsField;
            lhsField = (this.isSetApplicableAirspace()?this.getApplicableAirspace():null);
            List<AirspacePropertyType> rhsField;
            rhsField = (that.isSetApplicableAirspace()?that.getApplicableAirspace():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "applicableAirspace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "applicableAirspace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlightRule();
            boolean rhsFieldIsSet = that.isSetFlightRule();
            JAXBElement<CodeFlightRuleType> lhsField;
            lhsField = this.getFlightRule();
            JAXBElement<CodeFlightRuleType> rhsField;
            rhsField = that.getFlightRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightRule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightRule", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAngleType();
            boolean rhsFieldIsSet = that.isSetAngleType();
            JAXBElement<CodeNorthReferenceType> lhsField;
            lhsField = this.getAngleType();
            JAXBElement<CodeNorthReferenceType> rhsField;
            rhsField = that.getAngleType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<StandardLevelSectorExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<StandardLevelSectorExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFromTrack();
            boolean rhsFieldIsSet = that.isSetFromTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getFromTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getFromTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fromTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fromTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApplicableLevelColumn();
            boolean rhsFieldIsSet = that.isSetApplicableLevelColumn();
            JAXBElement<StandardLevelColumnPropertyType> lhsField;
            lhsField = this.getApplicableLevelColumn();
            JAXBElement<StandardLevelColumnPropertyType> rhsField;
            rhsField = that.getApplicableLevelColumn();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "applicableLevelColumn", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "applicableLevelColumn", rhsField);
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
            boolean theFieldIsSet = this.isSetFlightRule();
            JAXBElement<CodeFlightRuleType> theField;
            theField = this.getFlightRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightRule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFromTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getFromTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fromTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetToTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getToTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "toTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleType();
            JAXBElement<CodeNorthReferenceType> theField;
            theField = this.getAngleType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetApplicableAirspace()?this.getApplicableAirspace():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "applicableAirspace", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableLevelColumn();
            JAXBElement<StandardLevelColumnPropertyType> theField;
            theField = this.getApplicableLevelColumn();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "applicableLevelColumn", theField);
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
            List<StandardLevelSectorExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFlightRule();
            JAXBElement<CodeFlightRuleType> theField;
            theField = this.getFlightRule();
            strategy.appendField(locator, this, "flightRule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFromTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getFromTrack();
            strategy.appendField(locator, this, "fromTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetToTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getToTrack();
            strategy.appendField(locator, this, "toTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleType();
            JAXBElement<CodeNorthReferenceType> theField;
            theField = this.getAngleType();
            strategy.appendField(locator, this, "angleType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableAirspace();
            List<AirspacePropertyType> theField;
            theField = (this.isSetApplicableAirspace()?this.getApplicableAirspace():null);
            strategy.appendField(locator, this, "applicableAirspace", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableLevelColumn();
            JAXBElement<StandardLevelColumnPropertyType> theField;
            theField = this.getApplicableLevelColumn();
            strategy.appendField(locator, this, "applicableLevelColumn", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<StandardLevelSectorExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
