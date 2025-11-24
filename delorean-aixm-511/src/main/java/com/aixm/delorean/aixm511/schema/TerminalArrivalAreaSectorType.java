
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
 * <p>Java class for TerminalArrivalAreaSectorType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminalArrivalAreaSectorType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}TerminalArrivalAreaSectorPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTerminalArrivalAreaSectorExtension"/>
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
@XmlType(name = "TerminalArrivalAreaSectorType", propOrder = {
    "flyByCode",
    "procedureTurnRequired",
    "altitudeDescription",
    "sectorDefinition",
    "extent",
    "significantObstacle",
    "annotation",
    "extension"
})
@Entity(name = "TerminalArrivalAreaSectorType")
@Table(name = "terminalarrivalareasector", schema = "procedure")
public class TerminalArrivalAreaSectorType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "flyByCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flyByCode;
    @XmlElementRef(name = "procedureTurnRequired", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> procedureTurnRequired;
    @XmlElementRef(name = "altitudeDescription", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> altitudeDescription;
    @XmlElementRef(name = "sectorDefinition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CircleSectorPropertyType> sectorDefinition;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<ObstructionPropertyType> significantObstacle;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TerminalArrivalAreaSectorTypeExtensionType> extension;

    /**
     * Gets the value of the flyByCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getFlyByCode() {
        return flyByCode;
    }

    /**
     * Sets the value of the flyByCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlyByCode(JAXBElement<CodeYesNoType> value) {
        this.flyByCode = value;
    }

    @Transient
    public boolean isSetFlyByCode() {
        return (this.flyByCode!= null);
    }

    /**
     * Gets the value of the procedureTurnRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getProcedureTurnRequired() {
        return procedureTurnRequired;
    }

    /**
     * Sets the value of the procedureTurnRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setProcedureTurnRequired(JAXBElement<CodeYesNoType> value) {
        this.procedureTurnRequired = value;
    }

    @Transient
    public boolean isSetProcedureTurnRequired() {
        return (this.procedureTurnRequired!= null);
    }

    /**
     * Gets the value of the altitudeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAltitudeUseType> getAltitudeDescription() {
        return altitudeDescription;
    }

    /**
     * Sets the value of the altitudeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public void setAltitudeDescription(JAXBElement<CodeAltitudeUseType> value) {
        this.altitudeDescription = value;
    }

    @Transient
    public boolean isSetAltitudeDescription() {
        return (this.altitudeDescription!= null);
    }

    /**
     * Gets the value of the sectorDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CircleSectorPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CircleSectorPropertyType> getSectorDefinition() {
        return sectorDefinition;
    }

    /**
     * Sets the value of the sectorDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CircleSectorPropertyType }{@code >}
     *     
     */
    public void setSectorDefinition(JAXBElement<CircleSectorPropertyType> value) {
        this.sectorDefinition = value;
    }

    @Transient
    public boolean isSetSectorDefinition() {
        return (this.sectorDefinition!= null);
    }

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
     * Gets the value of the significantObstacle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significantObstacle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificantObstacle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ObstructionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "significantobstacle_terminalarrivalareasector_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "significantobstacle", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "terminalarrivalareasectorpropertygroup", referencedColumnName = "hjid")
    })
    public List<ObstructionPropertyType> getSignificantObstacle() {
        if (significantObstacle == null) {
            significantObstacle = new ArrayList<>();
        }
        return this.significantObstacle;
    }

    /**
     * 
     * 
     */
    public void setSignificantObstacle(List<ObstructionPropertyType> significantObstacle) {
        this.significantObstacle = significantObstacle;
    }

    @Transient
    public boolean isSetSignificantObstacle() {
        return ((this.significantObstacle!= null)&&(!this.significantObstacle.isEmpty()));
    }

    public void unsetSignificantObstacle() {
        this.significantObstacle = null;
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
    @JoinTable(name = "annotation_terminalarrivalareasector_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "terminalarrivalareasectorpropertygroup", referencedColumnName = "hjid")
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
     * {@link TerminalArrivalAreaSectorTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = TerminalArrivalAreaSectorTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<TerminalArrivalAreaSectorTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<TerminalArrivalAreaSectorTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "flybycode")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flybycode_nilreason"))
    })
    public CodeYesNoType getFlyByCodeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getFlyByCode());
    }

    public void setFlyByCodeItem(CodeYesNoType target) {
        setFlyByCode(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flyByCode"), TerminalArrivalAreaSectorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "procedureturnrequired")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "procedureturnrequired_nilreason"))
    })
    public CodeYesNoType getProcedureTurnRequiredItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getProcedureTurnRequired());
    }

    public void setProcedureTurnRequiredItem(CodeYesNoType target) {
        setProcedureTurnRequired(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "procedureTurnRequired"), TerminalArrivalAreaSectorType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "altitudedescription")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "altitudedescription_nilreason"))
    })
    public CodeAltitudeUseType getAltitudeDescriptionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAltitudeUseType.class, this.getAltitudeDescription());
    }

    public void setAltitudeDescriptionItem(CodeAltitudeUseType target) {
        setAltitudeDescription(XmlAdapterUtils.marshallJAXBElement(CodeAltitudeUseType.class, new QName("http://www.aixm.aero/schema/5.1.1", "altitudeDescription"), TerminalArrivalAreaSectorType.class, target));
    }

    @ManyToOne(targetEntity = CircleSectorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "sectordefinition_id", referencedColumnName = "hjid")
    public CircleSectorPropertyType getSectorDefinitionItem() {
        return XmlAdapterUtils.unmarshallSource(CircleSectorPropertyType.class, this.getSectorDefinition());
    }

    public void setSectorDefinitionItem(CircleSectorPropertyType target) {
        setSectorDefinition(XmlAdapterUtils.marshallJAXBElement(CircleSectorPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "sectorDefinition"), TerminalArrivalAreaSectorType.class, target));
    }

    @ManyToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "extent_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getExtent());
    }

    public void setExtentItem(AIXMSurfacePropertyType target) {
        setExtent(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "extent"), TerminalArrivalAreaSectorType.class, target));
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
        final TerminalArrivalAreaSectorType that = ((TerminalArrivalAreaSectorType) object);
        {
            boolean lhsFieldIsSet = this.isSetSignificantObstacle();
            boolean rhsFieldIsSet = that.isSetSignificantObstacle();
            List<ObstructionPropertyType> lhsField;
            lhsField = (this.isSetSignificantObstacle()?this.getSignificantObstacle():null);
            List<ObstructionPropertyType> rhsField;
            rhsField = (that.isSetSignificantObstacle()?that.getSignificantObstacle():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "significantObstacle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "significantObstacle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFlyByCode();
            boolean rhsFieldIsSet = that.isSetFlyByCode();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getFlyByCode();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getFlyByCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flyByCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flyByCode", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSectorDefinition();
            boolean rhsFieldIsSet = that.isSetSectorDefinition();
            JAXBElement<CircleSectorPropertyType> lhsField;
            lhsField = this.getSectorDefinition();
            JAXBElement<CircleSectorPropertyType> rhsField;
            rhsField = that.getSectorDefinition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sectorDefinition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sectorDefinition", rhsField);
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
            boolean lhsFieldIsSet = this.isSetProcedureTurnRequired();
            boolean rhsFieldIsSet = that.isSetProcedureTurnRequired();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getProcedureTurnRequired();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getProcedureTurnRequired();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "procedureTurnRequired", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "procedureTurnRequired", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<TerminalArrivalAreaSectorTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<TerminalArrivalAreaSectorTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAltitudeDescription();
            boolean rhsFieldIsSet = that.isSetAltitudeDescription();
            JAXBElement<CodeAltitudeUseType> lhsField;
            lhsField = this.getAltitudeDescription();
            JAXBElement<CodeAltitudeUseType> rhsField;
            rhsField = that.getAltitudeDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitudeDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitudeDescription", rhsField);
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
            boolean theFieldIsSet = this.isSetFlyByCode();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlyByCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flyByCode", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcedureTurnRequired();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getProcedureTurnRequired();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "procedureTurnRequired", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeDescription();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getAltitudeDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitudeDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSectorDefinition();
            JAXBElement<CircleSectorPropertyType> theField;
            theField = this.getSectorDefinition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sectorDefinition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantObstacle();
            List<ObstructionPropertyType> theField;
            theField = (this.isSetSignificantObstacle()?this.getSignificantObstacle():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "significantObstacle", theField);
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
            List<TerminalArrivalAreaSectorTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFlyByCode();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getFlyByCode();
            strategy.appendField(locator, this, "flyByCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcedureTurnRequired();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getProcedureTurnRequired();
            strategy.appendField(locator, this, "procedureTurnRequired", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAltitudeDescription();
            JAXBElement<CodeAltitudeUseType> theField;
            theField = this.getAltitudeDescription();
            strategy.appendField(locator, this, "altitudeDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSectorDefinition();
            JAXBElement<CircleSectorPropertyType> theField;
            theField = this.getSectorDefinition();
            strategy.appendField(locator, this, "sectorDefinition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignificantObstacle();
            List<ObstructionPropertyType> theField;
            theField = (this.isSetSignificantObstacle()?this.getSignificantObstacle():null);
            strategy.appendField(locator, this, "significantObstacle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TerminalArrivalAreaSectorTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
