
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
 * <p>Java class for GuidanceLineLightSystemTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuidanceLineLightSystemTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}GuidanceLineLightSystemPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractGuidanceLineLightSystemExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractGroundLightSystemExtension"/>
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
@XmlType(name = "GuidanceLineLightSystemTimeSliceType", propOrder = {
    "emergencyLighting",
    "intensityLevel",
    "colour",
    "element",
    "availability",
    "annotation",
    "lightedGuidanceLine",
    "extension"
})
@Entity(name = "GuidanceLineLightSystemTimeSliceType")
@Table(name = "guidancelinelightsystem_ts", schema = "airport_heliport")
public class GuidanceLineLightSystemTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "emergencyLighting", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> emergencyLighting;
    @XmlElementRef(name = "intensityLevel", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightIntensityType> intensityLevel;
    @XmlElementRef(name = "colour", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> colour;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<GroundLightingAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "lightedGuidanceLine", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<GuidanceLinePropertyType> lightedGuidanceLine;
    protected List<GuidanceLineLightSystemExtensionType> extension;

    /**
     * Gets the value of the emergencyLighting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getEmergencyLighting() {
        return emergencyLighting;
    }

    /**
     * Sets the value of the emergencyLighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setEmergencyLighting(JAXBElement<CodeYesNoType> value) {
        this.emergencyLighting = value;
    }

    @Transient
    public boolean isSetEmergencyLighting() {
        return (this.emergencyLighting!= null);
    }

    /**
     * Gets the value of the intensityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLightIntensityType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeLightIntensityType> getIntensityLevel() {
        return intensityLevel;
    }

    /**
     * Sets the value of the intensityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLightIntensityType }{@code >}
     *     
     */
    public void setIntensityLevel(JAXBElement<CodeLightIntensityType> value) {
        this.intensityLevel = value;
    }

    @Transient
    public boolean isSetIntensityLevel() {
        return (this.intensityLevel!= null);
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeColourType> getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setColour(JAXBElement<CodeColourType> value) {
        this.colour = value;
    }

    @Transient
    public boolean isSetColour() {
        return (this.colour!= null);
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
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
    @JoinTable(name = "element_guidancelinelightsystem_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "element", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "guidancelinelightsystempropertygroup", referencedColumnName = "hjid")
    })
    public List<LightElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return this.element;
    }

    /**
     * 
     * 
     */
    public void setElement(List<LightElementPropertyType> element) {
        this.element = element;
    }

    @Transient
    public boolean isSetElement() {
        return ((this.element!= null)&&(!this.element.isEmpty()));
    }

    public void unsetElement() {
        this.element = null;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightingAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = GroundLightingAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_guidancelinelightsystem_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "guidancelinelightsystempropertygroup", referencedColumnName = "hjid")
    })
    public List<GroundLightingAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<GroundLightingAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
    @JoinTable(name = "annotation_guidancelinelightsystem_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "guidancelinelightsystempropertygroup", referencedColumnName = "hjid")
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
     * Gets the value of the lightedGuidanceLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GuidanceLinePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<GuidanceLinePropertyType> getLightedGuidanceLine() {
        return lightedGuidanceLine;
    }

    /**
     * Sets the value of the lightedGuidanceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GuidanceLinePropertyType }{@code >}
     *     
     */
    public void setLightedGuidanceLine(JAXBElement<GuidanceLinePropertyType> value) {
        this.lightedGuidanceLine = value;
    }

    @Transient
    public boolean isSetLightedGuidanceLine() {
        return (this.lightedGuidanceLine!= null);
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
     * {@link GuidanceLineLightSystemExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = GuidanceLineLightSystemExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<GuidanceLineLightSystemExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<GuidanceLineLightSystemExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "emergencylighting")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "emergencylighting_nilreason"))
    })
    public CodeYesNoType getEmergencyLightingItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getEmergencyLighting());
    }

    public void setEmergencyLightingItem(CodeYesNoType target) {
        setEmergencyLighting(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "emergencyLighting"), GuidanceLineLightSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "intensitylevel")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "intensitylevel_nilreason"))
    })
    public CodeLightIntensityType getIntensityLevelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightIntensityType.class, this.getIntensityLevel());
    }

    public void setIntensityLevelItem(CodeLightIntensityType target) {
        setIntensityLevel(XmlAdapterUtils.marshallJAXBElement(CodeLightIntensityType.class, new QName("http://www.aixm.aero/schema/5.1.1", "intensityLevel"), GuidanceLineLightSystemTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "colour")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "colour_nilreason"))
    })
    public CodeColourType getColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getColour());
    }

    public void setColourItem(CodeColourType target) {
        setColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class, new QName("http://www.aixm.aero/schema/5.1.1", "colour"), GuidanceLineLightSystemTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = GuidanceLinePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "lightedguidanceline_id", referencedColumnName = "hjid")
    public GuidanceLinePropertyType getLightedGuidanceLineItem() {
        return XmlAdapterUtils.unmarshallSource(GuidanceLinePropertyType.class, this.getLightedGuidanceLine());
    }

    public void setLightedGuidanceLineItem(GuidanceLinePropertyType target) {
        setLightedGuidanceLine(XmlAdapterUtils.marshallJAXBElement(GuidanceLinePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lightedGuidanceLine"), GuidanceLineLightSystemTimeSliceType.class, target));
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
        final GuidanceLineLightSystemTimeSliceType that = ((GuidanceLineLightSystemTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetElement();
            boolean rhsFieldIsSet = that.isSetElement();
            List<LightElementPropertyType> lhsField;
            lhsField = (this.isSetElement()?this.getElement():null);
            List<LightElementPropertyType> rhsField;
            rhsField = (that.isSetElement()?that.getElement():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "element", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "element", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetIntensityLevel();
            boolean rhsFieldIsSet = that.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> lhsField;
            lhsField = this.getIntensityLevel();
            JAXBElement<CodeLightIntensityType> rhsField;
            rhsField = that.getIntensityLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "intensityLevel", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "intensityLevel", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<GuidanceLineLightSystemExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<GuidanceLineLightSystemExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLightedGuidanceLine();
            boolean rhsFieldIsSet = that.isSetLightedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> lhsField;
            lhsField = this.getLightedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> rhsField;
            rhsField = that.getLightedGuidanceLine();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lightedGuidanceLine", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lightedGuidanceLine", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetColour();
            boolean rhsFieldIsSet = that.isSetColour();
            JAXBElement<CodeColourType> lhsField;
            lhsField = this.getColour();
            JAXBElement<CodeColourType> rhsField;
            rhsField = that.getColour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "colour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "colour", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<GroundLightingAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
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
            boolean lhsFieldIsSet = this.isSetEmergencyLighting();
            boolean rhsFieldIsSet = that.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getEmergencyLighting();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getEmergencyLighting();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "emergencyLighting", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "emergencyLighting", rhsField);
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
            boolean theFieldIsSet = this.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEmergencyLighting();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "emergencyLighting", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "intensityLevel", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "colour", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement()?this.getElement():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "element", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            boolean theFieldIsSet = this.isSetLightedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> theField;
            theField = this.getLightedGuidanceLine();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lightedGuidanceLine", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GuidanceLineLightSystemExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetEmergencyLighting();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getEmergencyLighting();
            strategy.appendField(locator, this, "emergencyLighting", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIntensityLevel();
            JAXBElement<CodeLightIntensityType> theField;
            theField = this.getIntensityLevel();
            strategy.appendField(locator, this, "intensityLevel", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            strategy.appendField(locator, this, "colour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement()?this.getElement():null);
            strategy.appendField(locator, this, "element", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<GroundLightingAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLightedGuidanceLine();
            JAXBElement<GuidanceLinePropertyType> theField;
            theField = this.getLightedGuidanceLine();
            strategy.appendField(locator, this, "lightedGuidanceLine", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GuidanceLineLightSystemExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
