
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
 * <p>Java class for SurfaceCharacteristicsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurfaceCharacteristicsType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}SurfaceCharacteristicsPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurfaceCharacteristicsExtension"/>
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
@XmlType(name = "SurfaceCharacteristicsType", propOrder = {
    "composition",
    "preparation",
    "surfaceCondition",
    "classPCN",
    "pavementTypePCN",
    "pavementSubgradePCN",
    "maxTyrePressurePCN",
    "evaluationMethodPCN",
    "classLCN",
    "weightSIWL",
    "tyrePressureSIWL",
    "weightAUW",
    "annotation",
    "extension"
})
@Entity(name = "SurfaceCharacteristicsType")
@Table(name = "surfacecharacteristics", schema = "airport_heliport")
public class SurfaceCharacteristicsType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "composition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfaceCompositionType> composition;
    @XmlElementRef(name = "preparation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfacePreparationType> preparation;
    @XmlElementRef(name = "surfaceCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfaceConditionType> surfaceCondition;
    @XmlElementRef(name = "classPCN", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPCNType> classPCN;
    @XmlElementRef(name = "pavementTypePCN", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNPavementType> pavementTypePCN;
    @XmlElementRef(name = "pavementSubgradePCN", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNSubgradeType> pavementSubgradePCN;
    @XmlElementRef(name = "maxTyrePressurePCN", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNTyrePressureType> maxTyrePressurePCN;
    @XmlElementRef(name = "evaluationMethodPCN", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNMethodType> evaluationMethodPCN;
    @XmlElementRef(name = "classLCN", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValLCNType> classLCN;
    @XmlElementRef(name = "weightSIWL", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weightSIWL;
    @XmlElementRef(name = "tyrePressureSIWL", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPressureType> tyrePressureSIWL;
    @XmlElementRef(name = "weightAUW", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weightAUW;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SurfaceCharacteristicsTypeExtensionType> extension;

    /**
     * Gets the value of the composition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceCompositionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSurfaceCompositionType> getComposition() {
        return composition;
    }

    /**
     * Sets the value of the composition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceCompositionType }{@code >}
     *     
     */
    public void setComposition(JAXBElement<CodeSurfaceCompositionType> value) {
        this.composition = value;
    }

    @Transient
    public boolean isSetComposition() {
        return (this.composition!= null);
    }

    /**
     * Gets the value of the preparation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfacePreparationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSurfacePreparationType> getPreparation() {
        return preparation;
    }

    /**
     * Sets the value of the preparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfacePreparationType }{@code >}
     *     
     */
    public void setPreparation(JAXBElement<CodeSurfacePreparationType> value) {
        this.preparation = value;
    }

    @Transient
    public boolean isSetPreparation() {
        return (this.preparation!= null);
    }

    /**
     * Gets the value of the surfaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceConditionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSurfaceConditionType> getSurfaceCondition() {
        return surfaceCondition;
    }

    /**
     * Sets the value of the surfaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceConditionType }{@code >}
     *     
     */
    public void setSurfaceCondition(JAXBElement<CodeSurfaceConditionType> value) {
        this.surfaceCondition = value;
    }

    @Transient
    public boolean isSetSurfaceCondition() {
        return (this.surfaceCondition!= null);
    }

    /**
     * Gets the value of the classPCN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPCNType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValPCNType> getClassPCN() {
        return classPCN;
    }

    /**
     * Sets the value of the classPCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPCNType }{@code >}
     *     
     */
    public void setClassPCN(JAXBElement<ValPCNType> value) {
        this.classPCN = value;
    }

    @Transient
    public boolean isSetClassPCN() {
        return (this.classPCN!= null);
    }

    /**
     * Gets the value of the pavementTypePCN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNPavementType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePCNPavementType> getPavementTypePCN() {
        return pavementTypePCN;
    }

    /**
     * Sets the value of the pavementTypePCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNPavementType }{@code >}
     *     
     */
    public void setPavementTypePCN(JAXBElement<CodePCNPavementType> value) {
        this.pavementTypePCN = value;
    }

    @Transient
    public boolean isSetPavementTypePCN() {
        return (this.pavementTypePCN!= null);
    }

    /**
     * Gets the value of the pavementSubgradePCN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNSubgradeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePCNSubgradeType> getPavementSubgradePCN() {
        return pavementSubgradePCN;
    }

    /**
     * Sets the value of the pavementSubgradePCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNSubgradeType }{@code >}
     *     
     */
    public void setPavementSubgradePCN(JAXBElement<CodePCNSubgradeType> value) {
        this.pavementSubgradePCN = value;
    }

    @Transient
    public boolean isSetPavementSubgradePCN() {
        return (this.pavementSubgradePCN!= null);
    }

    /**
     * Gets the value of the maxTyrePressurePCN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNTyrePressureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePCNTyrePressureType> getMaxTyrePressurePCN() {
        return maxTyrePressurePCN;
    }

    /**
     * Sets the value of the maxTyrePressurePCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNTyrePressureType }{@code >}
     *     
     */
    public void setMaxTyrePressurePCN(JAXBElement<CodePCNTyrePressureType> value) {
        this.maxTyrePressurePCN = value;
    }

    @Transient
    public boolean isSetMaxTyrePressurePCN() {
        return (this.maxTyrePressurePCN!= null);
    }

    /**
     * Gets the value of the evaluationMethodPCN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNMethodType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePCNMethodType> getEvaluationMethodPCN() {
        return evaluationMethodPCN;
    }

    /**
     * Sets the value of the evaluationMethodPCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNMethodType }{@code >}
     *     
     */
    public void setEvaluationMethodPCN(JAXBElement<CodePCNMethodType> value) {
        this.evaluationMethodPCN = value;
    }

    @Transient
    public boolean isSetEvaluationMethodPCN() {
        return (this.evaluationMethodPCN!= null);
    }

    /**
     * Gets the value of the classLCN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValLCNType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValLCNType> getClassLCN() {
        return classLCN;
    }

    /**
     * Sets the value of the classLCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValLCNType }{@code >}
     *     
     */
    public void setClassLCN(JAXBElement<ValLCNType> value) {
        this.classLCN = value;
    }

    @Transient
    public boolean isSetClassLCN() {
        return (this.classLCN!= null);
    }

    /**
     * Gets the value of the weightSIWL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValWeightType> getWeightSIWL() {
        return weightSIWL;
    }

    /**
     * Sets the value of the weightSIWL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeightSIWL(JAXBElement<ValWeightType> value) {
        this.weightSIWL = value;
    }

    @Transient
    public boolean isSetWeightSIWL() {
        return (this.weightSIWL!= null);
    }

    /**
     * Gets the value of the tyrePressureSIWL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPressureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValPressureType> getTyrePressureSIWL() {
        return tyrePressureSIWL;
    }

    /**
     * Sets the value of the tyrePressureSIWL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPressureType }{@code >}
     *     
     */
    public void setTyrePressureSIWL(JAXBElement<ValPressureType> value) {
        this.tyrePressureSIWL = value;
    }

    @Transient
    public boolean isSetTyrePressureSIWL() {
        return (this.tyrePressureSIWL!= null);
    }

    /**
     * Gets the value of the weightAUW property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValWeightType> getWeightAUW() {
        return weightAUW;
    }

    /**
     * Sets the value of the weightAUW property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeightAUW(JAXBElement<ValWeightType> value) {
        this.weightAUW = value;
    }

    @Transient
    public boolean isSetWeightAUW() {
        return (this.weightAUW!= null);
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
    @JoinTable(name = "annotation_surfacecharacteristics_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "surfacecharacteristicspropertygroup", referencedColumnName = "hjid")
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
     * {@link SurfaceCharacteristicsTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = SurfaceCharacteristicsTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<SurfaceCharacteristicsTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<SurfaceCharacteristicsTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "composition")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "composition_nilreason"))
    })
    public CodeSurfaceCompositionType getCompositionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSurfaceCompositionType.class, this.getComposition());
    }

    public void setCompositionItem(CodeSurfaceCompositionType target) {
        setComposition(XmlAdapterUtils.marshallJAXBElement(CodeSurfaceCompositionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "composition"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "preparation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "preparation_nilreason"))
    })
    public CodeSurfacePreparationType getPreparationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSurfacePreparationType.class, this.getPreparation());
    }

    public void setPreparationItem(CodeSurfacePreparationType target) {
        setPreparation(XmlAdapterUtils.marshallJAXBElement(CodeSurfacePreparationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "preparation"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "surfacecondition")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "surfacecondition_nilreason"))
    })
    public CodeSurfaceConditionType getSurfaceConditionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSurfaceConditionType.class, this.getSurfaceCondition());
    }

    public void setSurfaceConditionItem(CodeSurfaceConditionType target) {
        setSurfaceCondition(XmlAdapterUtils.marshallJAXBElement(CodeSurfaceConditionType.class, new QName("http://www.aixm.aero/schema/5.1.1", "surfaceCondition"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "classpcn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "classpcn_nilreason"))
    })
    public ValPCNType getClassPCNItem() {
        return XmlAdapterUtils.unmarshallSource(ValPCNType.class, this.getClassPCN());
    }

    public void setClassPCNItem(ValPCNType target) {
        setClassPCN(XmlAdapterUtils.marshallJAXBElement(ValPCNType.class, new QName("http://www.aixm.aero/schema/5.1.1", "classPCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "pavementtypepcn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "pavementtypepcn_nilreason"))
    })
    public CodePCNPavementType getPavementTypePCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePCNPavementType.class, this.getPavementTypePCN());
    }

    public void setPavementTypePCNItem(CodePCNPavementType target) {
        setPavementTypePCN(XmlAdapterUtils.marshallJAXBElement(CodePCNPavementType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pavementTypePCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "pavementsubgradepcn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "pavementsubgradepcn_nilreason"))
    })
    public CodePCNSubgradeType getPavementSubgradePCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePCNSubgradeType.class, this.getPavementSubgradePCN());
    }

    public void setPavementSubgradePCNItem(CodePCNSubgradeType target) {
        setPavementSubgradePCN(XmlAdapterUtils.marshallJAXBElement(CodePCNSubgradeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pavementSubgradePCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "maxtyrepressurepcn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "maxtyrepressurepcn_nilreason"))
    })
    public CodePCNTyrePressureType getMaxTyrePressurePCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePCNTyrePressureType.class, this.getMaxTyrePressurePCN());
    }

    public void setMaxTyrePressurePCNItem(CodePCNTyrePressureType target) {
        setMaxTyrePressurePCN(XmlAdapterUtils.marshallJAXBElement(CodePCNTyrePressureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "maxTyrePressurePCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "evaluationmethodpcn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "evaluationmethodpcn_nilreason"))
    })
    public CodePCNMethodType getEvaluationMethodPCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePCNMethodType.class, this.getEvaluationMethodPCN());
    }

    public void setEvaluationMethodPCNItem(CodePCNMethodType target) {
        setEvaluationMethodPCN(XmlAdapterUtils.marshallJAXBElement(CodePCNMethodType.class, new QName("http://www.aixm.aero/schema/5.1.1", "evaluationMethodPCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "classlcn")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "classlcn_nilreason"))
    })
    public ValLCNType getClassLCNItem() {
        return XmlAdapterUtils.unmarshallSource(ValLCNType.class, this.getClassLCN());
    }

    public void setClassLCNItem(ValLCNType target) {
        setClassLCN(XmlAdapterUtils.marshallJAXBElement(ValLCNType.class, new QName("http://www.aixm.aero/schema/5.1.1", "classLCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "weightsiwl")),
        @AttributeOverride(name = "uom", column = @Column(name = "weightsiwl_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "weightsiwl_nilreason"))
    })
    public ValWeightType getWeightSIWLItem() {
        return XmlAdapterUtils.unmarshallSource(ValWeightType.class, this.getWeightSIWL());
    }

    public void setWeightSIWLItem(ValWeightType target) {
        setWeightSIWL(XmlAdapterUtils.marshallJAXBElement(ValWeightType.class, new QName("http://www.aixm.aero/schema/5.1.1", "weightSIWL"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "tyrepressuresiwl")),
        @AttributeOverride(name = "uom", column = @Column(name = "tyrepressuresiwl_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "tyrepressuresiwl_nilreason"))
    })
    public ValPressureType getTyrePressureSIWLItem() {
        return XmlAdapterUtils.unmarshallSource(ValPressureType.class, this.getTyrePressureSIWL());
    }

    public void setTyrePressureSIWLItem(ValPressureType target) {
        setTyrePressureSIWL(XmlAdapterUtils.marshallJAXBElement(ValPressureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "tyrePressureSIWL"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "weightauw")),
        @AttributeOverride(name = "uom", column = @Column(name = "weightauw_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "weightauw_nilreason"))
    })
    public ValWeightType getWeightAUWItem() {
        return XmlAdapterUtils.unmarshallSource(ValWeightType.class, this.getWeightAUW());
    }

    public void setWeightAUWItem(ValWeightType target) {
        setWeightAUW(XmlAdapterUtils.marshallJAXBElement(ValWeightType.class, new QName("http://www.aixm.aero/schema/5.1.1", "weightAUW"), SurfaceCharacteristicsType.class, target));
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
        final SurfaceCharacteristicsType that = ((SurfaceCharacteristicsType) object);
        {
            boolean lhsFieldIsSet = this.isSetComposition();
            boolean rhsFieldIsSet = that.isSetComposition();
            JAXBElement<CodeSurfaceCompositionType> lhsField;
            lhsField = this.getComposition();
            JAXBElement<CodeSurfaceCompositionType> rhsField;
            rhsField = that.getComposition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "composition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "composition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationMethodPCN();
            boolean rhsFieldIsSet = that.isSetEvaluationMethodPCN();
            JAXBElement<CodePCNMethodType> lhsField;
            lhsField = this.getEvaluationMethodPCN();
            JAXBElement<CodePCNMethodType> rhsField;
            rhsField = that.getEvaluationMethodPCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationMethodPCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationMethodPCN", rhsField);
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
            boolean lhsFieldIsSet = this.isSetClassLCN();
            boolean rhsFieldIsSet = that.isSetClassLCN();
            JAXBElement<ValLCNType> lhsField;
            lhsField = this.getClassLCN();
            JAXBElement<ValLCNType> rhsField;
            rhsField = that.getClassLCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classLCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classLCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWeightSIWL();
            boolean rhsFieldIsSet = that.isSetWeightSIWL();
            JAXBElement<ValWeightType> lhsField;
            lhsField = this.getWeightSIWL();
            JAXBElement<ValWeightType> rhsField;
            rhsField = that.getWeightSIWL();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "weightSIWL", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "weightSIWL", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPreparation();
            boolean rhsFieldIsSet = that.isSetPreparation();
            JAXBElement<CodeSurfacePreparationType> lhsField;
            lhsField = this.getPreparation();
            JAXBElement<CodeSurfacePreparationType> rhsField;
            rhsField = that.getPreparation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "preparation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "preparation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPavementSubgradePCN();
            boolean rhsFieldIsSet = that.isSetPavementSubgradePCN();
            JAXBElement<CodePCNSubgradeType> lhsField;
            lhsField = this.getPavementSubgradePCN();
            JAXBElement<CodePCNSubgradeType> rhsField;
            rhsField = that.getPavementSubgradePCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pavementSubgradePCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pavementSubgradePCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaxTyrePressurePCN();
            boolean rhsFieldIsSet = that.isSetMaxTyrePressurePCN();
            JAXBElement<CodePCNTyrePressureType> lhsField;
            lhsField = this.getMaxTyrePressurePCN();
            JAXBElement<CodePCNTyrePressureType> rhsField;
            rhsField = that.getMaxTyrePressurePCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maxTyrePressurePCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maxTyrePressurePCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClassPCN();
            boolean rhsFieldIsSet = that.isSetClassPCN();
            JAXBElement<ValPCNType> lhsField;
            lhsField = this.getClassPCN();
            JAXBElement<ValPCNType> rhsField;
            rhsField = that.getClassPCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classPCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classPCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SurfaceCharacteristicsTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<SurfaceCharacteristicsTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTyrePressureSIWL();
            boolean rhsFieldIsSet = that.isSetTyrePressureSIWL();
            JAXBElement<ValPressureType> lhsField;
            lhsField = this.getTyrePressureSIWL();
            JAXBElement<ValPressureType> rhsField;
            rhsField = that.getTyrePressureSIWL();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "tyrePressureSIWL", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "tyrePressureSIWL", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSurfaceCondition();
            boolean rhsFieldIsSet = that.isSetSurfaceCondition();
            JAXBElement<CodeSurfaceConditionType> lhsField;
            lhsField = this.getSurfaceCondition();
            JAXBElement<CodeSurfaceConditionType> rhsField;
            rhsField = that.getSurfaceCondition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "surfaceCondition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "surfaceCondition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWeightAUW();
            boolean rhsFieldIsSet = that.isSetWeightAUW();
            JAXBElement<ValWeightType> lhsField;
            lhsField = this.getWeightAUW();
            JAXBElement<ValWeightType> rhsField;
            rhsField = that.getWeightAUW();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "weightAUW", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "weightAUW", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPavementTypePCN();
            boolean rhsFieldIsSet = that.isSetPavementTypePCN();
            JAXBElement<CodePCNPavementType> lhsField;
            lhsField = this.getPavementTypePCN();
            JAXBElement<CodePCNPavementType> rhsField;
            rhsField = that.getPavementTypePCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pavementTypePCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pavementTypePCN", rhsField);
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
            boolean theFieldIsSet = this.isSetComposition();
            JAXBElement<CodeSurfaceCompositionType> theField;
            theField = this.getComposition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "composition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPreparation();
            JAXBElement<CodeSurfacePreparationType> theField;
            theField = this.getPreparation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "preparation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceCondition();
            JAXBElement<CodeSurfaceConditionType> theField;
            theField = this.getSurfaceCondition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "surfaceCondition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassPCN();
            JAXBElement<ValPCNType> theField;
            theField = this.getClassPCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classPCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementTypePCN();
            JAXBElement<CodePCNPavementType> theField;
            theField = this.getPavementTypePCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pavementTypePCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementSubgradePCN();
            JAXBElement<CodePCNSubgradeType> theField;
            theField = this.getPavementSubgradePCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pavementSubgradePCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxTyrePressurePCN();
            JAXBElement<CodePCNTyrePressureType> theField;
            theField = this.getMaxTyrePressurePCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxTyrePressurePCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodPCN();
            JAXBElement<CodePCNMethodType> theField;
            theField = this.getEvaluationMethodPCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "evaluationMethodPCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassLCN();
            JAXBElement<ValLCNType> theField;
            theField = this.getClassLCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classLCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeightSIWL();
            JAXBElement<ValWeightType> theField;
            theField = this.getWeightSIWL();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "weightSIWL", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTyrePressureSIWL();
            JAXBElement<ValPressureType> theField;
            theField = this.getTyrePressureSIWL();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "tyrePressureSIWL", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeightAUW();
            JAXBElement<ValWeightType> theField;
            theField = this.getWeightAUW();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "weightAUW", theField);
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
            List<SurfaceCharacteristicsTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetComposition();
            JAXBElement<CodeSurfaceCompositionType> theField;
            theField = this.getComposition();
            strategy.appendField(locator, this, "composition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPreparation();
            JAXBElement<CodeSurfacePreparationType> theField;
            theField = this.getPreparation();
            strategy.appendField(locator, this, "preparation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSurfaceCondition();
            JAXBElement<CodeSurfaceConditionType> theField;
            theField = this.getSurfaceCondition();
            strategy.appendField(locator, this, "surfaceCondition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassPCN();
            JAXBElement<ValPCNType> theField;
            theField = this.getClassPCN();
            strategy.appendField(locator, this, "classPCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementTypePCN();
            JAXBElement<CodePCNPavementType> theField;
            theField = this.getPavementTypePCN();
            strategy.appendField(locator, this, "pavementTypePCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementSubgradePCN();
            JAXBElement<CodePCNSubgradeType> theField;
            theField = this.getPavementSubgradePCN();
            strategy.appendField(locator, this, "pavementSubgradePCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxTyrePressurePCN();
            JAXBElement<CodePCNTyrePressureType> theField;
            theField = this.getMaxTyrePressurePCN();
            strategy.appendField(locator, this, "maxTyrePressurePCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodPCN();
            JAXBElement<CodePCNMethodType> theField;
            theField = this.getEvaluationMethodPCN();
            strategy.appendField(locator, this, "evaluationMethodPCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassLCN();
            JAXBElement<ValLCNType> theField;
            theField = this.getClassLCN();
            strategy.appendField(locator, this, "classLCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeightSIWL();
            JAXBElement<ValWeightType> theField;
            theField = this.getWeightSIWL();
            strategy.appendField(locator, this, "weightSIWL", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTyrePressureSIWL();
            JAXBElement<ValPressureType> theField;
            theField = this.getTyrePressureSIWL();
            strategy.appendField(locator, this, "tyrePressureSIWL", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWeightAUW();
            JAXBElement<ValWeightType> theField;
            theField = this.getWeightAUW();
            strategy.appendField(locator, this, "weightAUW", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SurfaceCharacteristicsTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
