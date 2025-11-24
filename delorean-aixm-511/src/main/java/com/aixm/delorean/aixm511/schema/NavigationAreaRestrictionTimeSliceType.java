
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
 * <p>Java class for NavigationAreaRestrictionTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NavigationAreaRestrictionTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}NavigationAreaRestrictionPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractNavigationAreaRestrictionExtension"/>
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
@XmlType(name = "NavigationAreaRestrictionTimeSliceType", propOrder = {
    "type",
    "procedure",
    "designSurface",
    "sectorDefinition",
    "annotation",
    "extension"
})
@Entity(name = "NavigationAreaRestrictionTimeSliceType")
@Table(name = "navigationarearestriction_ts", schema = "procedure")
public class NavigationAreaRestrictionTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationAreaRestrictionType> type;
    @XmlElement(nillable = true)
    protected List<ProcedurePropertyType> procedure;
    @XmlElementRef(name = "designSurface", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElementRef(name = "sectorDefinition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CircleSectorPropertyType> sectorDefinition;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NavigationAreaRestrictionExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaRestrictionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeNavigationAreaRestrictionType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaRestrictionType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNavigationAreaRestrictionType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the procedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ProcedurePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "procedure_navigationarearestriction_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "procedure", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navigationarearestrictionpropertygroup", referencedColumnName = "hjid")
    })
    public List<ProcedurePropertyType> getProcedure() {
        if (procedure == null) {
            procedure = new ArrayList<>();
        }
        return this.procedure;
    }

    /**
     * 
     * 
     */
    public void setProcedure(List<ProcedurePropertyType> procedure) {
        this.procedure = procedure;
    }

    @Transient
    public boolean isSetProcedure() {
        return ((this.procedure!= null)&&(!this.procedure.isEmpty()));
    }

    public void unsetProcedure() {
        this.procedure = null;
    }

    /**
     * Gets the value of the designSurface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        return designSurface;
    }

    /**
     * Sets the value of the designSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    public void setDesignSurface(JAXBElement<ObstacleAssessmentAreaPropertyType> value) {
        this.designSurface = value;
    }

    @Transient
    public boolean isSetDesignSurface() {
        return (this.designSurface!= null);
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
    @JoinTable(name = "annotation_navigationarearestriction_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "navigationarearestrictionpropertygroup", referencedColumnName = "hjid")
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
     * {@link NavigationAreaRestrictionExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = NavigationAreaRestrictionExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<NavigationAreaRestrictionExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<NavigationAreaRestrictionExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeNavigationAreaRestrictionType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeNavigationAreaRestrictionType.class, this.getType());
    }

    public void setTypeItem(CodeNavigationAreaRestrictionType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeNavigationAreaRestrictionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), NavigationAreaRestrictionTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = ObstacleAssessmentAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "designsurface_id", referencedColumnName = "hjid")
    public ObstacleAssessmentAreaPropertyType getDesignSurfaceItem() {
        return XmlAdapterUtils.unmarshallSource(ObstacleAssessmentAreaPropertyType.class, this.getDesignSurface());
    }

    public void setDesignSurfaceItem(ObstacleAssessmentAreaPropertyType target) {
        setDesignSurface(XmlAdapterUtils.marshallJAXBElement(ObstacleAssessmentAreaPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designSurface"), NavigationAreaRestrictionTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = CircleSectorPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "sectordefinition_id", referencedColumnName = "hjid")
    public CircleSectorPropertyType getSectorDefinitionItem() {
        return XmlAdapterUtils.unmarshallSource(CircleSectorPropertyType.class, this.getSectorDefinition());
    }

    public void setSectorDefinitionItem(CircleSectorPropertyType target) {
        setSectorDefinition(XmlAdapterUtils.marshallJAXBElement(CircleSectorPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "sectorDefinition"), NavigationAreaRestrictionTimeSliceType.class, target));
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
        final NavigationAreaRestrictionTimeSliceType that = ((NavigationAreaRestrictionTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeNavigationAreaRestrictionType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeNavigationAreaRestrictionType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignSurface();
            boolean rhsFieldIsSet = that.isSetDesignSurface();
            JAXBElement<ObstacleAssessmentAreaPropertyType> lhsField;
            lhsField = this.getDesignSurface();
            JAXBElement<ObstacleAssessmentAreaPropertyType> rhsField;
            rhsField = that.getDesignSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designSurface", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<NavigationAreaRestrictionExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<NavigationAreaRestrictionExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetProcedure();
            boolean rhsFieldIsSet = that.isSetProcedure();
            List<ProcedurePropertyType> lhsField;
            lhsField = (this.isSetProcedure()?this.getProcedure():null);
            List<ProcedurePropertyType> rhsField;
            rhsField = (that.isSetProcedure()?that.getProcedure():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "procedure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "procedure", rhsField);
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeNavigationAreaRestrictionType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcedure();
            List<ProcedurePropertyType> theField;
            theField = (this.isSetProcedure()?this.getProcedure():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "procedure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            JAXBElement<ObstacleAssessmentAreaPropertyType> theField;
            theField = this.getDesignSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designSurface", theField);
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
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NavigationAreaRestrictionExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeNavigationAreaRestrictionType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcedure();
            List<ProcedurePropertyType> theField;
            theField = (this.isSetProcedure()?this.getProcedure():null);
            strategy.appendField(locator, this, "procedure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignSurface();
            JAXBElement<ObstacleAssessmentAreaPropertyType> theField;
            theField = this.getDesignSurface();
            strategy.appendField(locator, this, "designSurface", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSectorDefinition();
            JAXBElement<CircleSectorPropertyType> theField;
            theField = this.getSectorDefinition();
            strategy.appendField(locator, this, "sectorDefinition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<NavigationAreaRestrictionExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
