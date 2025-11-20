
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
 * <p>Java class for TaxiHoldingPositionTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxiHoldingPositionTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}TaxiHoldingPositionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTaxiHoldingPositionExtension"/>
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
@XmlType(name = "TaxiHoldingPositionTimeSliceType", propOrder = {
    "landingCategory",
    "status",
    "associatedGuidanceLine",
    "protectedRunway",
    "location",
    "annotation",
    "extension"
})
@Entity(name = "TaxiHoldingPositionTimeSliceType")
@Table(name = "taxiholdingposition_ts", schema = "airport_heliport")
public class TaxiHoldingPositionTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "landingCategory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHoldingCategoryType> landingCategory;
    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusOperationsType> status;
    @XmlElementRef(name = "associatedGuidanceLine", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<GuidanceLinePropertyType> associatedGuidanceLine;
    @XmlElement(nillable = true)
    protected List<RunwayPropertyType> protectedRunway;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TaxiHoldingPositionExtensionType> extension;

    /**
     * Gets the value of the landingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingCategoryType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeHoldingCategoryType> getLandingCategory() {
        return landingCategory;
    }

    /**
     * Sets the value of the landingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingCategoryType }{@code >}
     *     
     */
    public void setLandingCategory(JAXBElement<CodeHoldingCategoryType> value) {
        this.landingCategory = value;
    }

    @Transient
    public boolean isSetLandingCategory() {
        return (this.landingCategory!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusOperationsType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeStatusOperationsType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusOperationsType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<CodeStatusOperationsType> value) {
        this.status = value;
    }

    @Transient
    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the associatedGuidanceLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GuidanceLinePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<GuidanceLinePropertyType> getAssociatedGuidanceLine() {
        return associatedGuidanceLine;
    }

    /**
     * Sets the value of the associatedGuidanceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GuidanceLinePropertyType }{@code >}
     *     
     */
    public void setAssociatedGuidanceLine(JAXBElement<GuidanceLinePropertyType> value) {
        this.associatedGuidanceLine = value;
    }

    @Transient
    public boolean isSetAssociatedGuidanceLine() {
        return (this.associatedGuidanceLine!= null);
    }

    /**
     * Gets the value of the protectedRunway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectedRunway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectedRunway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RunwayPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "protectedrunway_taxiholdingposition_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "protectedrunway", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "taxiholdingpositionpropertygroup", referencedColumnName = "hjid")
    })
    public List<RunwayPropertyType> getProtectedRunway() {
        if (protectedRunway == null) {
            protectedRunway = new ArrayList<>();
        }
        return this.protectedRunway;
    }

    /**
     * 
     * 
     */
    public void setProtectedRunway(List<RunwayPropertyType> protectedRunway) {
        this.protectedRunway = protectedRunway;
    }

    @Transient
    public boolean isSetProtectedRunway() {
        return ((this.protectedRunway!= null)&&(!this.protectedRunway.isEmpty()));
    }

    public void unsetProtectedRunway() {
        this.protectedRunway = null;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location!= null);
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
    @JoinTable(name = "annotation_taxiholdingposition_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "taxiholdingpositionpropertygroup", referencedColumnName = "hjid")
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
     * {@link TaxiHoldingPositionExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = TaxiHoldingPositionExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_TAXI_HOLDING_POSIT_2")
    public List<TaxiHoldingPositionExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<TaxiHoldingPositionExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "landingcategory")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "landingcategory_nilreason"))
    })
    public CodeHoldingCategoryType getLandingCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeHoldingCategoryType.class, this.getLandingCategory());
    }

    public void setLandingCategoryItem(CodeHoldingCategoryType target) {
        setLandingCategory(XmlAdapterUtils.marshallJAXBElement(CodeHoldingCategoryType.class, new QName("http://www.aixm.aero/schema/5.1.1", "landingCategory"), TaxiHoldingPositionTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "status")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "status_nilreason"))
    })
    public CodeStatusOperationsType getStatusItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStatusOperationsType.class, this.getStatus());
    }

    public void setStatusItem(CodeStatusOperationsType target) {
        setStatus(XmlAdapterUtils.marshallJAXBElement(CodeStatusOperationsType.class, new QName("http://www.aixm.aero/schema/5.1.1", "status"), TaxiHoldingPositionTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = GuidanceLinePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "associatedguidanceline_id", referencedColumnName = "hjid")
    public GuidanceLinePropertyType getAssociatedGuidanceLineItem() {
        return XmlAdapterUtils.unmarshallSource(GuidanceLinePropertyType.class, this.getAssociatedGuidanceLine());
    }

    public void setAssociatedGuidanceLineItem(GuidanceLinePropertyType target) {
        setAssociatedGuidanceLine(XmlAdapterUtils.marshallJAXBElement(GuidanceLinePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "associatedGuidanceLine"), TaxiHoldingPositionTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), TaxiHoldingPositionTimeSliceType.class, target));
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
        final TaxiHoldingPositionTimeSliceType that = ((TaxiHoldingPositionTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<TaxiHoldingPositionExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<TaxiHoldingPositionExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAssociatedGuidanceLine();
            boolean rhsFieldIsSet = that.isSetAssociatedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> lhsField;
            lhsField = this.getAssociatedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> rhsField;
            rhsField = that.getAssociatedGuidanceLine();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedGuidanceLine", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedGuidanceLine", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocation();
            boolean rhsFieldIsSet = that.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getLocation();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getLocation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "location", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "location", rhsField);
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
            boolean lhsFieldIsSet = this.isSetProtectedRunway();
            boolean rhsFieldIsSet = that.isSetProtectedRunway();
            List<RunwayPropertyType> lhsField;
            lhsField = (this.isSetProtectedRunway()?this.getProtectedRunway():null);
            List<RunwayPropertyType> rhsField;
            rhsField = (that.isSetProtectedRunway()?that.getProtectedRunway():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "protectedRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "protectedRunway", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLandingCategory();
            boolean rhsFieldIsSet = that.isSetLandingCategory();
            JAXBElement<CodeHoldingCategoryType> lhsField;
            lhsField = this.getLandingCategory();
            JAXBElement<CodeHoldingCategoryType> rhsField;
            rhsField = that.getLandingCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "landingCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "landingCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStatus();
            boolean rhsFieldIsSet = that.isSetStatus();
            JAXBElement<CodeStatusOperationsType> lhsField;
            lhsField = this.getStatus();
            JAXBElement<CodeStatusOperationsType> rhsField;
            rhsField = that.getStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "status", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "status", rhsField);
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
            boolean theFieldIsSet = this.isSetLandingCategory();
            JAXBElement<CodeHoldingCategoryType> theField;
            theField = this.getLandingCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "landingCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeStatusOperationsType> theField;
            theField = this.getStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "status", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> theField;
            theField = this.getAssociatedGuidanceLine();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedGuidanceLine", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtectedRunway();
            List<RunwayPropertyType> theField;
            theField = (this.isSetProtectedRunway()?this.getProtectedRunway():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "protectedRunway", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
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
            List<TaxiHoldingPositionExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetLandingCategory();
            JAXBElement<CodeHoldingCategoryType> theField;
            theField = this.getLandingCategory();
            strategy.appendField(locator, this, "landingCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStatus();
            JAXBElement<CodeStatusOperationsType> theField;
            theField = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> theField;
            theField = this.getAssociatedGuidanceLine();
            strategy.appendField(locator, this, "associatedGuidanceLine", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtectedRunway();
            List<RunwayPropertyType> theField;
            theField = (this.isSetProtectedRunway()?this.getProtectedRunway():null);
            strategy.appendField(locator, this, "protectedRunway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
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
            List<TaxiHoldingPositionExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
