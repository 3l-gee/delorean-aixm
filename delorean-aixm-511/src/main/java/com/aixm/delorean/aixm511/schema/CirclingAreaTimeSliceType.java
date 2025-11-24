
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.CascadeType;
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
 * <p>Java class for CirclingAreaTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CirclingAreaTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}CirclingAreaPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractCirclingAreaExtension"/>
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
@XmlType(name = "CirclingAreaTimeSliceType", propOrder = {
    "extent",
    "approach",
    "condition",
    "aircraftCategory",
    "designSurface",
    "annotation",
    "extension"
})
@Entity(name = "CirclingAreaTimeSliceType")
@Table(name = "circlingarea_ts", schema = "procedure")
public class CirclingAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> extent;
    @XmlElementRef(name = "approach", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<InstrumentApproachProcedurePropertyType> approach;
    @XmlElement(nillable = true)
    protected List<ApproachConditionPropertyType> condition;
    @XmlElementRef(name = "aircraftCategory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<CirclingAreaExtensionType> extension;

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<AIXMSurfacePropertyType> value) {
        this.extent = value;
    }

    @Transient
    public boolean isSetExtent() {
        return (this.extent!= null);
    }

    /**
     * Gets the value of the approach property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<InstrumentApproachProcedurePropertyType> getApproach() {
        return approach;
    }

    /**
     * Sets the value of the approach property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public void setApproach(JAXBElement<InstrumentApproachProcedurePropertyType> value) {
        this.approach = value;
    }

    @Transient
    public boolean isSetApproach() {
        return (this.approach!= null);
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproachConditionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ApproachConditionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "condition_circlingarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "condition", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "circlingareapropertygroup", referencedColumnName = "hjid")
    })
    public List<ApproachConditionPropertyType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<>();
        }
        return this.condition;
    }

    /**
     * 
     * 
     */
    public void setCondition(List<ApproachConditionPropertyType> condition) {
        this.condition = condition;
    }

    @Transient
    public boolean isSetCondition() {
        return ((this.condition!= null)&&(!this.condition.isEmpty()));
    }

    public void unsetCondition() {
        this.condition = null;
    }

    /**
     * Gets the value of the aircraftCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AircraftCharacteristicPropertyType> getAircraftCategory() {
        return aircraftCategory;
    }

    /**
     * Sets the value of the aircraftCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setAircraftCategory(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.aircraftCategory = value;
    }

    @Transient
    public boolean isSetAircraftCategory() {
        return (this.aircraftCategory!= null);
    }

    /**
     * Gets the value of the designSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentAreaPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ObstacleAssessmentAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "designsurface_circlingarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "designsurface", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "circlingareapropertygroup", referencedColumnName = "hjid")
    })
    public List<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<>();
        }
        return this.designSurface;
    }

    /**
     * 
     * 
     */
    public void setDesignSurface(List<ObstacleAssessmentAreaPropertyType> designSurface) {
        this.designSurface = designSurface;
    }

    @Transient
    public boolean isSetDesignSurface() {
        return ((this.designSurface!= null)&&(!this.designSurface.isEmpty()));
    }

    public void unsetDesignSurface() {
        this.designSurface = null;
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
    @JoinTable(name = "annotation_circlingarea_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "circlingareapropertygroup", referencedColumnName = "hjid")
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
     * {@link CirclingAreaExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = CirclingAreaExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<CirclingAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<CirclingAreaExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @ManyToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMSurfacePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent"), CirclingAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = InstrumentApproachProcedurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "approach_id", referencedColumnName = "hjid")
    public InstrumentApproachProcedurePropertyType getApproachItem() {
        return XmlAdapterUtils.unmarshallSource(InstrumentApproachProcedurePropertyType.class, this.getApproach());
    }

    public void setApproachItem(InstrumentApproachProcedurePropertyType target) {
        setApproach(XmlAdapterUtils.marshallJAXBElement(InstrumentApproachProcedurePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "approach"), CirclingAreaTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AircraftCharacteristicPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraftcategory_id", referencedColumnName = "hjid")
    public AircraftCharacteristicPropertyType getAircraftCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(AircraftCharacteristicPropertyType.class, this.getAircraftCategory());
    }

    public void setAircraftCategoryItem(AircraftCharacteristicPropertyType target) {
        setAircraftCategory(XmlAdapterUtils.marshallJAXBElement(AircraftCharacteristicPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "aircraftCategory"), CirclingAreaTimeSliceType.class, target));
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
        final CirclingAreaTimeSliceType that = ((CirclingAreaTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getExtent();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCondition();
            boolean rhsFieldIsSet = that.isSetCondition();
            List<ApproachConditionPropertyType> lhsField;
            lhsField = (this.isSetCondition()?this.getCondition():null);
            List<ApproachConditionPropertyType> rhsField;
            rhsField = (that.isSetCondition()?that.getCondition():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "condition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "condition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<CirclingAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<CirclingAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAircraftCategory();
            boolean rhsFieldIsSet = that.isSetAircraftCategory();
            JAXBElement<AircraftCharacteristicPropertyType> lhsField;
            lhsField = this.getAircraftCategory();
            JAXBElement<AircraftCharacteristicPropertyType> rhsField;
            rhsField = that.getAircraftCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aircraftCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aircraftCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproach();
            boolean rhsFieldIsSet = that.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> lhsField;
            lhsField = this.getApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> rhsField;
            rhsField = that.getApproach();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approach", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approach", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignSurface();
            boolean rhsFieldIsSet = that.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> lhsField;
            lhsField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            List<ObstacleAssessmentAreaPropertyType> rhsField;
            rhsField = (that.isSetDesignSurface()?that.getDesignSurface():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designSurface", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproach();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approach", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            List<ApproachConditionPropertyType> theField;
            theField = (this.isSetCondition()?this.getCondition():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "condition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            JAXBElement<AircraftCharacteristicPropertyType> theField;
            theField = this.getAircraftCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aircraftCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> theField;
            theField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designSurface", theField);
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
            List<CirclingAreaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproach();
            JAXBElement<InstrumentApproachProcedurePropertyType> theField;
            theField = this.getApproach();
            strategy.appendField(locator, this, "approach", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCondition();
            List<ApproachConditionPropertyType> theField;
            theField = (this.isSetCondition()?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAircraftCategory();
            JAXBElement<AircraftCharacteristicPropertyType> theField;
            theField = this.getAircraftCategory();
            strategy.appendField(locator, this, "aircraftCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            List<ObstacleAssessmentAreaPropertyType> theField;
            theField = (this.isSetDesignSurface()?this.getDesignSurface():null);
            strategy.appendField(locator, this, "designSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<CirclingAreaExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
