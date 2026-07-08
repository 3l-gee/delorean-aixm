
package com.delorean.aixm.aixm52.schema;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

/**
 * <p>
 * Java class for SurfaceCharacteristicsType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="SurfaceCharacteristicsType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="composition" type=
"{http://www.aixm.aero/schema/5.2}CodeSurfaceCompositionType" minOccurs="0"/>
 *         <element name="preparation" type=
"{http://www.aixm.aero/schema/5.2}CodeSurfacePreparationType" minOccurs="0"/>
 *         <element name="surfaceCondition" type=
"{http://www.aixm.aero/schema/5.2}CodeSurfaceConditionType" minOccurs="0"/>
 *         <element name="classPCN" type=
"{http://www.aixm.aero/schema/5.2}ValPavementStrengthType" minOccurs="0"/>
 *         <element name="pavementTypePCN" type=
"{http://www.aixm.aero/schema/5.2}CodePavementBehaviourType" minOccurs="0"/>
 *         <element name="pavementSubgradePCN" type=
"{http://www.aixm.aero/schema/5.2}CodePavementSubgradeType" minOccurs="0"/>
 *         <element name="maxTyrePressurePCN" type=
"{http://www.aixm.aero/schema/5.2}CodeTyrePressureType" minOccurs="0"/>
 *         <element name="evaluationMethodPCN" type=
"{http://www.aixm.aero/schema/5.2}CodePavementStrengthMethodType" minOccurs=
"0"/>
 *         <element name="classLCN" type=
"{http://www.aixm.aero/schema/5.2}ValLCNType" minOccurs="0"/>
 *         <element name="weightSIWL" type=
"{http://www.aixm.aero/schema/5.2}ValWeightType" minOccurs="0"/>
 *         <element name="tyrePressureSIWL" type=
"{http://www.aixm.aero/schema/5.2}ValPressureType" minOccurs="0"/>
 *         <element name="weightAUW" type=
"{http://www.aixm.aero/schema/5.2}ValWeightType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="classPCR" type=
"{http://www.aixm.aero/schema/5.2}ValPavementStrengthType" minOccurs="0"/>
 *         <element name="pavementTypePCR" type=
"{http://www.aixm.aero/schema/5.2}CodePavementBehaviourType" minOccurs="0"/>
 *         <element name="pavementSubgradePCR" type=
"{http://www.aixm.aero/schema/5.2}CodePavementSubgradeType" minOccurs="0"/>
 *         <element name="maxTyrePressurePCR" type=
"{http://www.aixm.aero/schema/5.2}CodeTyrePressureType" minOccurs="0"/>
 *         <element name="evaluationMethodPCR" type=
"{http://www.aixm.aero/schema/5.2}CodePavementStrengthMethodType" minOccurs=
"0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractSurfaceCharacteristicsExtension"/>
 *                 </choice>
 *                 <attGroup ref=
"{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
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
@XmlType(name = "SurfaceCharacteristicsType", propOrder = {"composition", "preparation", "surfaceCondition", "classPCN",
        "pavementTypePCN", "pavementSubgradePCN", "maxTyrePressurePCN", "evaluationMethodPCN", "classLCN", "weightSIWL",
        "tyrePressureSIWL", "weightAUW", "annotation", "classPCR", "pavementTypePCR", "pavementSubgradePCR",
        "maxTyrePressurePCR", "evaluationMethodPCR", "extension"})
@Entity(name = "SurfaceCharacteristicsType")
@Table(name = "surfacecharacteristics_o", schema = "airport_heliport")
public class SurfaceCharacteristicsType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "composition", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfaceCompositionType> composition;
    @XmlElementRef(name = "preparation", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfacePreparationType> preparation;
    @XmlElementRef(name = "surfaceCondition", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfaceConditionType> surfaceCondition;
    @XmlElementRef(name = "classPCN", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPavementStrengthType> classPCN;
    @XmlElementRef(name = "pavementTypePCN", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePavementBehaviourType> pavementTypePCN;
    @XmlElementRef(name = "pavementSubgradePCN", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePavementSubgradeType> pavementSubgradePCN;
    @XmlElementRef(name = "maxTyrePressurePCN", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTyrePressureType> maxTyrePressurePCN;
    @XmlElementRef(name = "evaluationMethodPCN", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePavementStrengthMethodType> evaluationMethodPCN;
    @XmlElementRef(name = "classLCN", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValLCNType> classLCN;
    @XmlElementRef(name = "weightSIWL", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weightSIWL;
    @XmlElementRef(name = "tyrePressureSIWL", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPressureType> tyrePressureSIWL;
    @XmlElementRef(name = "weightAUW", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weightAUW;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "classPCR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPavementStrengthType> classPCR;
    @XmlElementRef(name = "pavementTypePCR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePavementBehaviourType> pavementTypePCR;
    @XmlElementRef(name = "pavementSubgradePCR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePavementSubgradeType> pavementSubgradePCR;
    @XmlElementRef(name = "maxTyrePressurePCR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTyrePressureType> maxTyrePressurePCR;
    @XmlElementRef(name = "evaluationMethodPCR", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePavementStrengthMethodType> evaluationMethodPCR;
    protected List<SurfaceCharacteristicsExtensionType> extension;

    /**
     * Gets the value of the composition property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSurfaceCompositionType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSurfaceCompositionType }{@code >}
     *
     */
    public void setComposition(JAXBElement<CodeSurfaceCompositionType> value) {
        this.composition = value;
    }

    @Transient
    public boolean isSetComposition() {
        return (this.composition != null);
    }

    /**
     * Gets the value of the preparation property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSurfacePreparationType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSurfacePreparationType }{@code >}
     *
     */
    public void setPreparation(JAXBElement<CodeSurfacePreparationType> value) {
        this.preparation = value;
    }

    @Transient
    public boolean isSetPreparation() {
        return (this.preparation != null);
    }

    /**
     * Gets the value of the surfaceCondition property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSurfaceConditionType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSurfaceConditionType }{@code >}
     *
     */
    public void setSurfaceCondition(JAXBElement<CodeSurfaceConditionType> value) {
        this.surfaceCondition = value;
    }

    @Transient
    public boolean isSetSurfaceCondition() {
        return (this.surfaceCondition != null);
    }

    /**
     * Gets the value of the classPCN property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValPavementStrengthType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValPavementStrengthType> getClassPCN() {
        return classPCN;
    }

    /**
     * Sets the value of the classPCN property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValPavementStrengthType }{@code >}
     *
     */
    public void setClassPCN(JAXBElement<ValPavementStrengthType> value) {
        this.classPCN = value;
    }

    @Transient
    public boolean isSetClassPCN() {
        return (this.classPCN != null);
    }

    /**
     * Gets the value of the pavementTypePCN property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePavementBehaviourType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePavementBehaviourType> getPavementTypePCN() {
        return pavementTypePCN;
    }

    /**
     * Sets the value of the pavementTypePCN property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePavementBehaviourType }{@code >}
     *
     */
    public void setPavementTypePCN(JAXBElement<CodePavementBehaviourType> value) {
        this.pavementTypePCN = value;
    }

    @Transient
    public boolean isSetPavementTypePCN() {
        return (this.pavementTypePCN != null);
    }

    /**
     * Gets the value of the pavementSubgradePCN property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePavementSubgradeType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePavementSubgradeType> getPavementSubgradePCN() {
        return pavementSubgradePCN;
    }

    /**
     * Sets the value of the pavementSubgradePCN property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePavementSubgradeType }{@code >}
     *
     */
    public void setPavementSubgradePCN(JAXBElement<CodePavementSubgradeType> value) {
        this.pavementSubgradePCN = value;
    }

    @Transient
    public boolean isSetPavementSubgradePCN() {
        return (this.pavementSubgradePCN != null);
    }

    /**
     * Gets the value of the maxTyrePressurePCN property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeTyrePressureType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeTyrePressureType> getMaxTyrePressurePCN() {
        return maxTyrePressurePCN;
    }

    /**
     * Sets the value of the maxTyrePressurePCN property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeTyrePressureType }{@code >}
     *
     */
    public void setMaxTyrePressurePCN(JAXBElement<CodeTyrePressureType> value) {
        this.maxTyrePressurePCN = value;
    }

    @Transient
    public boolean isSetMaxTyrePressurePCN() {
        return (this.maxTyrePressurePCN != null);
    }

    /**
     * Gets the value of the evaluationMethodPCN property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePavementStrengthMethodType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePavementStrengthMethodType> getEvaluationMethodPCN() {
        return evaluationMethodPCN;
    }

    /**
     * Sets the value of the evaluationMethodPCN property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePavementStrengthMethodType }{@code >}
     *
     */
    public void setEvaluationMethodPCN(JAXBElement<CodePavementStrengthMethodType> value) {
        this.evaluationMethodPCN = value;
    }

    @Transient
    public boolean isSetEvaluationMethodPCN() {
        return (this.evaluationMethodPCN != null);
    }

    /**
     * Gets the value of the classLCN property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValLCNType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement }{@code <}{@link ValLCNType
     *            }{@code >}
     *
     */
    public void setClassLCN(JAXBElement<ValLCNType> value) {
        this.classLCN = value;
    }

    @Transient
    public boolean isSetClassLCN() {
        return (this.classLCN != null);
    }

    /**
     * Gets the value of the weightSIWL property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValWeightType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValWeightType }{@code >}
     *
     */
    public void setWeightSIWL(JAXBElement<ValWeightType> value) {
        this.weightSIWL = value;
    }

    @Transient
    public boolean isSetWeightSIWL() {
        return (this.weightSIWL != null);
    }

    /**
     * Gets the value of the tyrePressureSIWL property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValPressureType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValPressureType }{@code >}
     *
     */
    public void setTyrePressureSIWL(JAXBElement<ValPressureType> value) {
        this.tyrePressureSIWL = value;
    }

    @Transient
    public boolean isSetTyrePressureSIWL() {
        return (this.tyrePressureSIWL != null);
    }

    /**
     * Gets the value of the weightAUW property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValWeightType
     *         }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValWeightType }{@code >}
     *
     */
    public void setWeightAUW(JAXBElement<ValWeightType> value) {
        this.weightAUW = value;
    }

    @Transient
    public boolean isSetWeightAUW() {
        return (this.weightAUW != null);
    }

    /**
     * Gets the value of the annotation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the annotation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAnnotation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "srfcchrctrstcstp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "surfacecharacteristics_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")})
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
        return ((this.annotation != null) && (!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the classPCR property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValPavementStrengthType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValPavementStrengthType> getClassPCR() {
        return classPCR;
    }

    /**
     * Sets the value of the classPCR property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValPavementStrengthType }{@code >}
     *
     */
    public void setClassPCR(JAXBElement<ValPavementStrengthType> value) {
        this.classPCR = value;
    }

    @Transient
    public boolean isSetClassPCR() {
        return (this.classPCR != null);
    }

    /**
     * Gets the value of the pavementTypePCR property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePavementBehaviourType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePavementBehaviourType> getPavementTypePCR() {
        return pavementTypePCR;
    }

    /**
     * Sets the value of the pavementTypePCR property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePavementBehaviourType }{@code >}
     *
     */
    public void setPavementTypePCR(JAXBElement<CodePavementBehaviourType> value) {
        this.pavementTypePCR = value;
    }

    @Transient
    public boolean isSetPavementTypePCR() {
        return (this.pavementTypePCR != null);
    }

    /**
     * Gets the value of the pavementSubgradePCR property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePavementSubgradeType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePavementSubgradeType> getPavementSubgradePCR() {
        return pavementSubgradePCR;
    }

    /**
     * Sets the value of the pavementSubgradePCR property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePavementSubgradeType }{@code >}
     *
     */
    public void setPavementSubgradePCR(JAXBElement<CodePavementSubgradeType> value) {
        this.pavementSubgradePCR = value;
    }

    @Transient
    public boolean isSetPavementSubgradePCR() {
        return (this.pavementSubgradePCR != null);
    }

    /**
     * Gets the value of the maxTyrePressurePCR property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeTyrePressureType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeTyrePressureType> getMaxTyrePressurePCR() {
        return maxTyrePressurePCR;
    }

    /**
     * Sets the value of the maxTyrePressurePCR property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeTyrePressureType }{@code >}
     *
     */
    public void setMaxTyrePressurePCR(JAXBElement<CodeTyrePressureType> value) {
        this.maxTyrePressurePCR = value;
    }

    @Transient
    public boolean isSetMaxTyrePressurePCR() {
        return (this.maxTyrePressurePCR != null);
    }

    /**
     * Gets the value of the evaluationMethodPCR property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodePavementStrengthMethodType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodePavementStrengthMethodType> getEvaluationMethodPCR() {
        return evaluationMethodPCR;
    }

    /**
     * Sets the value of the evaluationMethodPCR property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodePavementStrengthMethodType }{@code >}
     *
     */
    public void setEvaluationMethodPCR(JAXBElement<CodePavementStrengthMethodType> value) {
        this.evaluationMethodPCR = value;
    }

    @Transient
    public boolean isSetEvaluationMethodPCR() {
        return (this.evaluationMethodPCR != null);
    }

    /**
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfaceCharacteristicsExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = SurfaceCharacteristicsExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "surfacecharacteristics_oe_hjid", referencedColumnName = "hjid")
    public List<SurfaceCharacteristicsExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<SurfaceCharacteristicsExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension != null) && (!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "composition")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "compositionnilreason"))})
    public CodeSurfaceCompositionType getCompositionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSurfaceCompositionType.class, this.getComposition());
    }

    public void setCompositionItem(CodeSurfaceCompositionType target) {
        setComposition(XmlAdapterUtils.marshallJAXBElement(CodeSurfaceCompositionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "composition"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "preparation")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "preparationnilreason"))})
    public CodeSurfacePreparationType getPreparationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSurfacePreparationType.class, this.getPreparation());
    }

    public void setPreparationItem(CodeSurfacePreparationType target) {
        setPreparation(XmlAdapterUtils.marshallJAXBElement(CodeSurfacePreparationType.class,
                new QName("http://www.aixm.aero/schema/5.2", "preparation"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "surfacecondition")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "surfaceconditionnilreason"))})
    public CodeSurfaceConditionType getSurfaceConditionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSurfaceConditionType.class, this.getSurfaceCondition());
    }

    public void setSurfaceConditionItem(CodeSurfaceConditionType target) {
        setSurfaceCondition(XmlAdapterUtils.marshallJAXBElement(CodeSurfaceConditionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "surfaceCondition"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "classpcn", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "classpcnnilreason"))})
    public ValPavementStrengthType getClassPCNItem() {
        return XmlAdapterUtils.unmarshallSource(ValPavementStrengthType.class, this.getClassPCN());
    }

    public void setClassPCNItem(ValPavementStrengthType target) {
        setClassPCN(XmlAdapterUtils.marshallJAXBElement(ValPavementStrengthType.class,
                new QName("http://www.aixm.aero/schema/5.2", "classPCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "pavementtypepcn")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "pavementtypepcnnilreason"))})
    public CodePavementBehaviourType getPavementTypePCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePavementBehaviourType.class, this.getPavementTypePCN());
    }

    public void setPavementTypePCNItem(CodePavementBehaviourType target) {
        setPavementTypePCN(XmlAdapterUtils.marshallJAXBElement(CodePavementBehaviourType.class,
                new QName("http://www.aixm.aero/schema/5.2", "pavementTypePCN"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "pavementsubgradepcn")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "pavementsubgradepcnnilreason"))})
    public CodePavementSubgradeType getPavementSubgradePCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePavementSubgradeType.class, this.getPavementSubgradePCN());
    }

    public void setPavementSubgradePCNItem(CodePavementSubgradeType target) {
        setPavementSubgradePCN(XmlAdapterUtils.marshallJAXBElement(CodePavementSubgradeType.class,
                new QName("http://www.aixm.aero/schema/5.2", "pavementSubgradePCN"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "maxtyrepressurepcn")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maxtyrepressurepcnnilreason"))})
    public CodeTyrePressureType getMaxTyrePressurePCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTyrePressureType.class, this.getMaxTyrePressurePCN());
    }

    public void setMaxTyrePressurePCNItem(CodeTyrePressureType target) {
        setMaxTyrePressurePCN(XmlAdapterUtils.marshallJAXBElement(CodeTyrePressureType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maxTyrePressurePCN"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "evaluationmethodpcn")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "evaluationmethodpcnnilreason"))})
    public CodePavementStrengthMethodType getEvaluationMethodPCNItem() {
        return XmlAdapterUtils.unmarshallSource(CodePavementStrengthMethodType.class, this.getEvaluationMethodPCN());
    }

    public void setEvaluationMethodPCNItem(CodePavementStrengthMethodType target) {
        setEvaluationMethodPCN(XmlAdapterUtils.marshallJAXBElement(CodePavementStrengthMethodType.class,
                new QName("http://www.aixm.aero/schema/5.2", "evaluationMethodPCN"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "classlcn", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "classlcnnilreason"))})
    public ValLCNType getClassLCNItem() {
        return XmlAdapterUtils.unmarshallSource(ValLCNType.class, this.getClassLCN());
    }

    public void setClassLCNItem(ValLCNType target) {
        setClassLCN(XmlAdapterUtils.marshallJAXBElement(ValLCNType.class,
                new QName("http://www.aixm.aero/schema/5.2", "classLCN"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "weightsiwl", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "weightsiwluom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "weightsiwlnilreason"))})
    public ValWeightType getWeightSIWLItem() {
        return XmlAdapterUtils.unmarshallSource(ValWeightType.class, this.getWeightSIWL());
    }

    public void setWeightSIWLItem(ValWeightType target) {
        setWeightSIWL(XmlAdapterUtils.marshallJAXBElement(ValWeightType.class,
                new QName("http://www.aixm.aero/schema/5.2", "weightSIWL"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "tyrepressuresiwl", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "tyrepressuresiwluom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "tyrepressuresiwlnilreason"))})
    public ValPressureType getTyrePressureSIWLItem() {
        return XmlAdapterUtils.unmarshallSource(ValPressureType.class, this.getTyrePressureSIWL());
    }

    public void setTyrePressureSIWLItem(ValPressureType target) {
        setTyrePressureSIWL(XmlAdapterUtils.marshallJAXBElement(ValPressureType.class,
                new QName("http://www.aixm.aero/schema/5.2", "tyrePressureSIWL"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "weightauw", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "weightauwuom")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "weightauwnilreason"))})
    public ValWeightType getWeightAUWItem() {
        return XmlAdapterUtils.unmarshallSource(ValWeightType.class, this.getWeightAUW());
    }

    public void setWeightAUWItem(ValWeightType target) {
        setWeightAUW(XmlAdapterUtils.marshallJAXBElement(ValWeightType.class,
                new QName("http://www.aixm.aero/schema/5.2", "weightAUW"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "classpcr", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "classpcrnilreason"))})
    public ValPavementStrengthType getClassPCRItem() {
        return XmlAdapterUtils.unmarshallSource(ValPavementStrengthType.class, this.getClassPCR());
    }

    public void setClassPCRItem(ValPavementStrengthType target) {
        setClassPCR(XmlAdapterUtils.marshallJAXBElement(ValPavementStrengthType.class,
                new QName("http://www.aixm.aero/schema/5.2", "classPCR"), SurfaceCharacteristicsType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "pavementtypepcr")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "pavementtypepcrnilreason"))})
    public CodePavementBehaviourType getPavementTypePCRItem() {
        return XmlAdapterUtils.unmarshallSource(CodePavementBehaviourType.class, this.getPavementTypePCR());
    }

    public void setPavementTypePCRItem(CodePavementBehaviourType target) {
        setPavementTypePCR(XmlAdapterUtils.marshallJAXBElement(CodePavementBehaviourType.class,
                new QName("http://www.aixm.aero/schema/5.2", "pavementTypePCR"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "pavementsubgradepcr")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "pavementsubgradepcrnilreason"))})
    public CodePavementSubgradeType getPavementSubgradePCRItem() {
        return XmlAdapterUtils.unmarshallSource(CodePavementSubgradeType.class, this.getPavementSubgradePCR());
    }

    public void setPavementSubgradePCRItem(CodePavementSubgradeType target) {
        setPavementSubgradePCR(XmlAdapterUtils.marshallJAXBElement(CodePavementSubgradeType.class,
                new QName("http://www.aixm.aero/schema/5.2", "pavementSubgradePCR"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "maxtyrepressurepcr")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maxtyrepressurepcrnilreason"))})
    public CodeTyrePressureType getMaxTyrePressurePCRItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTyrePressureType.class, this.getMaxTyrePressurePCR());
    }

    public void setMaxTyrePressurePCRItem(CodeTyrePressureType target) {
        setMaxTyrePressurePCR(XmlAdapterUtils.marshallJAXBElement(CodeTyrePressureType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maxTyrePressurePCR"), SurfaceCharacteristicsType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "evaluationmethodpcr")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "evaluationmethodpcrnilreason"))})
    public CodePavementStrengthMethodType getEvaluationMethodPCRItem() {
        return XmlAdapterUtils.unmarshallSource(CodePavementStrengthMethodType.class, this.getEvaluationMethodPCR());
    }

    public void setEvaluationMethodPCRItem(CodePavementStrengthMethodType target) {
        setEvaluationMethodPCR(XmlAdapterUtils.marshallJAXBElement(CodePavementStrengthMethodType.class,
                new QName("http://www.aixm.aero/schema/5.2", "evaluationMethodPCR"), SurfaceCharacteristicsType.class,
                target));
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
            EqualsStrategy strategy) {
        if ((object == null) || (this.getClass() != object.getClass())) {
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
            boolean lhsFieldIsSet = this.isSetClassPCN();
            boolean rhsFieldIsSet = that.isSetClassPCN();
            JAXBElement<ValPavementStrengthType> lhsField;
            lhsField = this.getClassPCN();
            JAXBElement<ValPavementStrengthType> rhsField;
            rhsField = that.getClassPCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classPCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classPCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationMethodPCN();
            boolean rhsFieldIsSet = that.isSetEvaluationMethodPCN();
            JAXBElement<CodePavementStrengthMethodType> lhsField;
            lhsField = this.getEvaluationMethodPCN();
            JAXBElement<CodePavementStrengthMethodType> rhsField;
            rhsField = that.getEvaluationMethodPCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationMethodPCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationMethodPCN", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPavementSubgradePCN();
            boolean rhsFieldIsSet = that.isSetPavementSubgradePCN();
            JAXBElement<CodePavementSubgradeType> lhsField;
            lhsField = this.getPavementSubgradePCN();
            JAXBElement<CodePavementSubgradeType> rhsField;
            rhsField = that.getPavementSubgradePCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pavementSubgradePCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pavementSubgradePCN", rhsField);
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
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation() ? that.getAnnotation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SurfaceCharacteristicsExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<SurfaceCharacteristicsExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
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
            boolean lhsFieldIsSet = this.isSetPavementTypePCN();
            boolean rhsFieldIsSet = that.isSetPavementTypePCN();
            JAXBElement<CodePavementBehaviourType> lhsField;
            lhsField = this.getPavementTypePCN();
            JAXBElement<CodePavementBehaviourType> rhsField;
            rhsField = that.getPavementTypePCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pavementTypePCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pavementTypePCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaxTyrePressurePCN();
            boolean rhsFieldIsSet = that.isSetMaxTyrePressurePCN();
            JAXBElement<CodeTyrePressureType> lhsField;
            lhsField = this.getMaxTyrePressurePCN();
            JAXBElement<CodeTyrePressureType> rhsField;
            rhsField = that.getMaxTyrePressurePCN();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maxTyrePressurePCN", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maxTyrePressurePCN", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationMethodPCR();
            boolean rhsFieldIsSet = that.isSetEvaluationMethodPCR();
            JAXBElement<CodePavementStrengthMethodType> lhsField;
            lhsField = this.getEvaluationMethodPCR();
            JAXBElement<CodePavementStrengthMethodType> rhsField;
            rhsField = that.getEvaluationMethodPCR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationMethodPCR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationMethodPCR", rhsField);
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
            boolean lhsFieldIsSet = this.isSetMaxTyrePressurePCR();
            boolean rhsFieldIsSet = that.isSetMaxTyrePressurePCR();
            JAXBElement<CodeTyrePressureType> lhsField;
            lhsField = this.getMaxTyrePressurePCR();
            JAXBElement<CodeTyrePressureType> rhsField;
            rhsField = that.getMaxTyrePressurePCR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maxTyrePressurePCR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maxTyrePressurePCR", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClassPCR();
            boolean rhsFieldIsSet = that.isSetClassPCR();
            JAXBElement<ValPavementStrengthType> lhsField;
            lhsField = this.getClassPCR();
            JAXBElement<ValPavementStrengthType> rhsField;
            rhsField = that.getClassPCR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classPCR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classPCR", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPavementSubgradePCR();
            boolean rhsFieldIsSet = that.isSetPavementSubgradePCR();
            JAXBElement<CodePavementSubgradeType> lhsField;
            lhsField = this.getPavementSubgradePCR();
            JAXBElement<CodePavementSubgradeType> rhsField;
            rhsField = that.getPavementSubgradePCR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pavementSubgradePCR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pavementSubgradePCR", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPavementTypePCR();
            boolean rhsFieldIsSet = that.isSetPavementTypePCR();
            JAXBElement<CodePavementBehaviourType> lhsField;
            lhsField = this.getPavementTypePCR();
            JAXBElement<CodePavementBehaviourType> rhsField;
            rhsField = that.getPavementTypePCR();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pavementTypePCR", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pavementTypePCR", rhsField);
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
            JAXBElement<ValPavementStrengthType> theField;
            theField = this.getClassPCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classPCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementTypePCN();
            JAXBElement<CodePavementBehaviourType> theField;
            theField = this.getPavementTypePCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pavementTypePCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementSubgradePCN();
            JAXBElement<CodePavementSubgradeType> theField;
            theField = this.getPavementSubgradePCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pavementSubgradePCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxTyrePressurePCN();
            JAXBElement<CodeTyrePressureType> theField;
            theField = this.getMaxTyrePressurePCN();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxTyrePressurePCN", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodPCN();
            JAXBElement<CodePavementStrengthMethodType> theField;
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
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassPCR();
            JAXBElement<ValPavementStrengthType> theField;
            theField = this.getClassPCR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classPCR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementTypePCR();
            JAXBElement<CodePavementBehaviourType> theField;
            theField = this.getPavementTypePCR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pavementTypePCR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementSubgradePCR();
            JAXBElement<CodePavementSubgradeType> theField;
            theField = this.getPavementSubgradePCR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pavementSubgradePCR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxTyrePressurePCR();
            JAXBElement<CodeTyrePressureType> theField;
            theField = this.getMaxTyrePressurePCR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maxTyrePressurePCR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodPCR();
            JAXBElement<CodePavementStrengthMethodType> theField;
            theField = this.getEvaluationMethodPCR();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "evaluationMethodPCR", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SurfaceCharacteristicsExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
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
            JAXBElement<ValPavementStrengthType> theField;
            theField = this.getClassPCN();
            strategy.appendField(locator, this, "classPCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementTypePCN();
            JAXBElement<CodePavementBehaviourType> theField;
            theField = this.getPavementTypePCN();
            strategy.appendField(locator, this, "pavementTypePCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementSubgradePCN();
            JAXBElement<CodePavementSubgradeType> theField;
            theField = this.getPavementSubgradePCN();
            strategy.appendField(locator, this, "pavementSubgradePCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxTyrePressurePCN();
            JAXBElement<CodeTyrePressureType> theField;
            theField = this.getMaxTyrePressurePCN();
            strategy.appendField(locator, this, "maxTyrePressurePCN", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodPCN();
            JAXBElement<CodePavementStrengthMethodType> theField;
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
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassPCR();
            JAXBElement<ValPavementStrengthType> theField;
            theField = this.getClassPCR();
            strategy.appendField(locator, this, "classPCR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementTypePCR();
            JAXBElement<CodePavementBehaviourType> theField;
            theField = this.getPavementTypePCR();
            strategy.appendField(locator, this, "pavementTypePCR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPavementSubgradePCR();
            JAXBElement<CodePavementSubgradeType> theField;
            theField = this.getPavementSubgradePCR();
            strategy.appendField(locator, this, "pavementSubgradePCR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaxTyrePressurePCR();
            JAXBElement<CodeTyrePressureType> theField;
            theField = this.getMaxTyrePressurePCR();
            strategy.appendField(locator, this, "maxTyrePressurePCR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationMethodPCR();
            JAXBElement<CodePavementStrengthMethodType> theField;
            theField = this.getEvaluationMethodPCR();
            strategy.appendField(locator, this, "evaluationMethodPCR", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SurfaceCharacteristicsExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
