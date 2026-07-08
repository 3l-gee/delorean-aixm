
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
import jakarta.persistence.OneToOne;
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
 * Java class for PointReferenceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="PointReferenceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="role" type=
"{http://www.aixm.aero/schema/5.2}CodeReferenceRoleType" minOccurs="0"/>
 *         <element name="priorFixTolerance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceSignedType" minOccurs="0"/>
 *         <element name="postFixTolerance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceSignedType" minOccurs="0"/>
 *         <element name="fixToleranceArea" type=
"{http://www.aixm.aero/schema/5.2}SurfacePropertyType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="minimumReceptionLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="minimumReceptionLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="maximumAuthorisedLimit" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceVerticalType" minOccurs="0"/>
 *         <element name="maximumAuthorisedLimitReference" type=
"{http://www.aixm.aero/schema/5.2}CodeVerticalReferenceType" minOccurs="0"/>
 *         <element name="distanceReference" type=
"{http://www.aixm.aero/schema/5.2}DistancePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="angleReference" type=
"{http://www.aixm.aero/schema/5.2}AngleUsePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractPointReferenceExtension"/>
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
@XmlType(name = "PointReferenceType", propOrder = {"role", "priorFixTolerance", "postFixTolerance", "fixToleranceArea",
        "annotation", "minimumReceptionLimit", "minimumReceptionLimitReference", "maximumAuthorisedLimit",
        "maximumAuthorisedLimitReference", "distanceReference", "angleReference", "extension"})
@Entity(name = "PointReferenceType")
@Table(name = "pointreference_o", schema = "navaids_point")
public class PointReferenceType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeReferenceRoleType> role;
    @XmlElementRef(name = "priorFixTolerance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> priorFixTolerance;
    @XmlElementRef(name = "postFixTolerance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> postFixTolerance;
    @XmlElementRef(name = "fixToleranceArea", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> fixToleranceArea;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "minimumReceptionLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumReceptionLimit;
    @XmlElementRef(name = "minimumReceptionLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumReceptionLimitReference;
    @XmlElementRef(name = "maximumAuthorisedLimit", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumAuthorisedLimit;
    @XmlElementRef(name = "maximumAuthorisedLimitReference", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumAuthorisedLimitReference;
    @XmlElement(nillable = true)
    protected List<DistancePropertyType> distanceReference;
    @XmlElement(nillable = true)
    protected List<AngleUsePropertyType> angleReference;
    protected List<PointReferenceExtensionType> extension;

    /**
     * Gets the value of the role property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeReferenceRoleType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeReferenceRoleType> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeReferenceRoleType }{@code >}
     *
     */
    public void setRole(JAXBElement<CodeReferenceRoleType> value) {
        this.role = value;
    }

    @Transient
    public boolean isSetRole() {
        return (this.role != null);
    }

    /**
     * Gets the value of the priorFixTolerance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceSignedType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceSignedType> getPriorFixTolerance() {
        return priorFixTolerance;
    }

    /**
     * Sets the value of the priorFixTolerance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceSignedType }{@code >}
     *
     */
    public void setPriorFixTolerance(JAXBElement<ValDistanceSignedType> value) {
        this.priorFixTolerance = value;
    }

    @Transient
    public boolean isSetPriorFixTolerance() {
        return (this.priorFixTolerance != null);
    }

    /**
     * Gets the value of the postFixTolerance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceSignedType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceSignedType> getPostFixTolerance() {
        return postFixTolerance;
    }

    /**
     * Sets the value of the postFixTolerance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceSignedType }{@code >}
     *
     */
    public void setPostFixTolerance(JAXBElement<ValDistanceSignedType> value) {
        this.postFixTolerance = value;
    }

    @Transient
    public boolean isSetPostFixTolerance() {
        return (this.postFixTolerance != null);
    }

    /**
     * Gets the value of the fixToleranceArea property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMSurfacePropertyType> getFixToleranceArea() {
        return fixToleranceArea;
    }

    /**
     * Sets the value of the fixToleranceArea property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *
     */
    public void setFixToleranceArea(JAXBElement<AIXMSurfacePropertyType> value) {
        this.fixToleranceArea = value;
    }

    @Transient
    public boolean isSetFixToleranceArea() {
        return (this.fixToleranceArea != null);
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
    @JoinTable(name = "pntrfrnctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "pointreference_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the minimumReceptionLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumReceptionLimit() {
        return minimumReceptionLimit;
    }

    /**
     * Sets the value of the minimumReceptionLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMinimumReceptionLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumReceptionLimit = value;
    }

    @Transient
    public boolean isSetMinimumReceptionLimit() {
        return (this.minimumReceptionLimit != null);
    }

    /**
     * Gets the value of the minimumReceptionLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMinimumReceptionLimitReference() {
        return minimumReceptionLimitReference;
    }

    /**
     * Sets the value of the minimumReceptionLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setMinimumReceptionLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumReceptionLimitReference = value;
    }

    @Transient
    public boolean isSetMinimumReceptionLimitReference() {
        return (this.minimumReceptionLimitReference != null);
    }

    /**
     * Gets the value of the maximumAuthorisedLimit property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMaximumAuthorisedLimit() {
        return maximumAuthorisedLimit;
    }

    /**
     * Sets the value of the maximumAuthorisedLimit property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceVerticalType }{@code >}
     *
     */
    public void setMaximumAuthorisedLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumAuthorisedLimit = value;
    }

    @Transient
    public boolean isSetMaximumAuthorisedLimit() {
        return (this.maximumAuthorisedLimit != null);
    }

    /**
     * Gets the value of the maximumAuthorisedLimitReference property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMaximumAuthorisedLimitReference() {
        return maximumAuthorisedLimitReference;
    }

    /**
     * Sets the value of the maximumAuthorisedLimitReference property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *
     */
    public void setMaximumAuthorisedLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumAuthorisedLimitReference = value;
    }

    @Transient
    public boolean isSetMaximumAuthorisedLimitReference() {
        return (this.maximumAuthorisedLimitReference != null);
    }

    /**
     * Gets the value of the distanceReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the distanceReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDistanceReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistancePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = DistancePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "pntrfrnctp_dstncrfrnc_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "pointreference_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "distancereference_hjid", referencedColumnName = "hjid")})
    public List<DistancePropertyType> getDistanceReference() {
        if (distanceReference == null) {
            distanceReference = new ArrayList<>();
        }
        return this.distanceReference;
    }

    /**
     *
     *
     */
    public void setDistanceReference(List<DistancePropertyType> distanceReference) {
        this.distanceReference = distanceReference;
    }

    @Transient
    public boolean isSetDistanceReference() {
        return ((this.distanceReference != null) && (!this.distanceReference.isEmpty()));
    }

    public void unsetDistanceReference() {
        this.distanceReference = null;
    }

    /**
     * Gets the value of the angleReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the angleReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAngleReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AngleUsePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AngleUsePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "pntrfrnctp_anglrfrnc_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "pointreference_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "anglereference_hjid", referencedColumnName = "hjid")})
    public List<AngleUsePropertyType> getAngleReference() {
        if (angleReference == null) {
            angleReference = new ArrayList<>();
        }
        return this.angleReference;
    }

    /**
     *
     *
     */
    public void setAngleReference(List<AngleUsePropertyType> angleReference) {
        this.angleReference = angleReference;
    }

    @Transient
    public boolean isSetAngleReference() {
        return ((this.angleReference != null) && (!this.angleReference.isEmpty()));
    }

    public void unsetAngleReference() {
        this.angleReference = null;
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
     * {@link PointReferenceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = PointReferenceExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointreference_oe_hjid", referencedColumnName = "hjid")
    public List<PointReferenceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<PointReferenceExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "role")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "rolenilreason"))})
    public CodeReferenceRoleType getRoleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeReferenceRoleType.class, this.getRole());
    }

    public void setRoleItem(CodeReferenceRoleType target) {
        setRole(XmlAdapterUtils.marshallJAXBElement(CodeReferenceRoleType.class,
                new QName("http://www.aixm.aero/schema/5.2", "role"), PointReferenceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "priorfixtolerance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "priorfixtoleranceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "priorfixtoleranceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "priorfixtolerancenilreason"))})
    public ValDistanceSignedType getPriorFixToleranceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getPriorFixTolerance());
    }

    public void setPriorFixToleranceItem(ValDistanceSignedType target) {
        setPriorFixTolerance(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class,
                new QName("http://www.aixm.aero/schema/5.2", "priorFixTolerance"), PointReferenceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "postfixtolerance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "postfixtoleranceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "postfixtoleranceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "postfixtolerancenilreason"))})
    public ValDistanceSignedType getPostFixToleranceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getPostFixTolerance());
    }

    public void setPostFixToleranceItem(ValDistanceSignedType target) {
        setPostFixTolerance(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class,
                new QName("http://www.aixm.aero/schema/5.2", "postFixTolerance"), PointReferenceType.class, target));
    }

    @OneToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "pntrfrnctp_fxtlrncar_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "pointreference_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "fixtolerancearea_hjid", referencedColumnName = "hjid")})
    public AIXMSurfacePropertyType getFixToleranceAreaItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getFixToleranceArea());
    }

    public void setFixToleranceAreaItem(AIXMSurfacePropertyType target) {
        setFixToleranceArea(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "fixToleranceArea"), PointReferenceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "minimumreceptionlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "minimumreceptionlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "minimumreceptionlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumreceptionlimitnilreason"))})
    public ValDistanceVerticalType getMinimumReceptionLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumReceptionLimit());
    }

    public void setMinimumReceptionLimitItem(ValDistanceVerticalType target) {
        setMinimumReceptionLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumReceptionLimit"), PointReferenceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "minimumreceptionlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "minimumreceptionlimitreferencenilreason"))})
    public CodeVerticalReferenceType getMinimumReceptionLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class,
                this.getMinimumReceptionLimitReference());
    }

    public void setMinimumReceptionLimitReferenceItem(CodeVerticalReferenceType target) {
        setMinimumReceptionLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "minimumReceptionLimitReference"),
                PointReferenceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "maximumauthorisedlimit", columnDefinition = "VARCHAR", length = 256)),
            @AttributeOverride(name = "uom", column = @Column(name = "maximumauthorisedlimituom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "maximumauthorisedlimitaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maximumauthorisedlimitnilreason"))})
    public ValDistanceVerticalType getMaximumAuthorisedLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMaximumAuthorisedLimit());
    }

    public void setMaximumAuthorisedLimitItem(ValDistanceVerticalType target) {
        setMaximumAuthorisedLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maximumAuthorisedLimit"), PointReferenceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "maximumauthorisedlimitreference")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "maximumauthorisedlimitreferencenilreason"))})
    public CodeVerticalReferenceType getMaximumAuthorisedLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class,
                this.getMaximumAuthorisedLimitReference());
    }

    public void setMaximumAuthorisedLimitReferenceItem(CodeVerticalReferenceType target) {
        setMaximumAuthorisedLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "maximumAuthorisedLimitReference"),
                PointReferenceType.class, target));
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
        final PointReferenceType that = ((PointReferenceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PointReferenceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<PointReferenceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFixToleranceArea();
            boolean rhsFieldIsSet = that.isSetFixToleranceArea();
            JAXBElement<AIXMSurfacePropertyType> lhsField;
            lhsField = this.getFixToleranceArea();
            JAXBElement<AIXMSurfacePropertyType> rhsField;
            rhsField = that.getFixToleranceArea();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fixToleranceArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fixToleranceArea", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistanceReference();
            boolean rhsFieldIsSet = that.isSetDistanceReference();
            List<DistancePropertyType> lhsField;
            lhsField = (this.isSetDistanceReference() ? this.getDistanceReference() : null);
            List<DistancePropertyType> rhsField;
            rhsField = (that.isSetDistanceReference() ? that.getDistanceReference() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distanceReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distanceReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAngleReference();
            boolean rhsFieldIsSet = that.isSetAngleReference();
            List<AngleUsePropertyType> lhsField;
            lhsField = (this.isSetAngleReference() ? this.getAngleReference() : null);
            List<AngleUsePropertyType> rhsField;
            rhsField = (that.isSetAngleReference() ? that.getAngleReference() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "angleReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "angleReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumReceptionLimit();
            boolean rhsFieldIsSet = that.isSetMinimumReceptionLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumReceptionLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumReceptionLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumReceptionLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumReceptionLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumReceptionLimitReference();
            boolean rhsFieldIsSet = that.isSetMinimumReceptionLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMinimumReceptionLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMinimumReceptionLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumReceptionLimitReference",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumReceptionLimitReference",
                    rhsField);
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
            boolean lhsFieldIsSet = this.isSetPriorFixTolerance();
            boolean rhsFieldIsSet = that.isSetPriorFixTolerance();
            JAXBElement<ValDistanceSignedType> lhsField;
            lhsField = this.getPriorFixTolerance();
            JAXBElement<ValDistanceSignedType> rhsField;
            rhsField = that.getPriorFixTolerance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "priorFixTolerance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "priorFixTolerance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRole();
            boolean rhsFieldIsSet = that.isSetRole();
            JAXBElement<CodeReferenceRoleType> lhsField;
            lhsField = this.getRole();
            JAXBElement<CodeReferenceRoleType> rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPostFixTolerance();
            boolean rhsFieldIsSet = that.isSetPostFixTolerance();
            JAXBElement<ValDistanceSignedType> lhsField;
            lhsField = this.getPostFixTolerance();
            JAXBElement<ValDistanceSignedType> rhsField;
            rhsField = that.getPostFixTolerance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "postFixTolerance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "postFixTolerance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumAuthorisedLimit();
            boolean rhsFieldIsSet = that.isSetMaximumAuthorisedLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMaximumAuthorisedLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMaximumAuthorisedLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumAuthorisedLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumAuthorisedLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumAuthorisedLimitReference();
            boolean rhsFieldIsSet = that.isSetMaximumAuthorisedLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMaximumAuthorisedLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMaximumAuthorisedLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumAuthorisedLimitReference",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumAuthorisedLimitReference",
                    rhsField);
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
            boolean theFieldIsSet = this.isSetRole();
            JAXBElement<CodeReferenceRoleType> theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPriorFixTolerance();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getPriorFixTolerance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "priorFixTolerance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPostFixTolerance();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getPostFixTolerance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "postFixTolerance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFixToleranceArea();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getFixToleranceArea();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fixToleranceArea", theField);
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
            boolean theFieldIsSet = this.isSetMinimumReceptionLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumReceptionLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumReceptionLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumReceptionLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumReceptionLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumReceptionLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumAuthorisedLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumAuthorisedLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumAuthorisedLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumAuthorisedLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumAuthorisedLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumAuthorisedLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistanceReference();
            List<DistancePropertyType> theField;
            theField = (this.isSetDistanceReference() ? this.getDistanceReference() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distanceReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleReference();
            List<AngleUsePropertyType> theField;
            theField = (this.isSetAngleReference() ? this.getAngleReference() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "angleReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PointReferenceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetRole();
            JAXBElement<CodeReferenceRoleType> theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPriorFixTolerance();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getPriorFixTolerance();
            strategy.appendField(locator, this, "priorFixTolerance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPostFixTolerance();
            JAXBElement<ValDistanceSignedType> theField;
            theField = this.getPostFixTolerance();
            strategy.appendField(locator, this, "postFixTolerance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFixToleranceArea();
            JAXBElement<AIXMSurfacePropertyType> theField;
            theField = this.getFixToleranceArea();
            strategy.appendField(locator, this, "fixToleranceArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumReceptionLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumReceptionLimit();
            strategy.appendField(locator, this, "minimumReceptionLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumReceptionLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumReceptionLimitReference();
            strategy.appendField(locator, this, "minimumReceptionLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumAuthorisedLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumAuthorisedLimit();
            strategy.appendField(locator, this, "maximumAuthorisedLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumAuthorisedLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumAuthorisedLimitReference();
            strategy.appendField(locator, this, "maximumAuthorisedLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistanceReference();
            List<DistancePropertyType> theField;
            theField = (this.isSetDistanceReference() ? this.getDistanceReference() : null);
            strategy.appendField(locator, this, "distanceReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAngleReference();
            List<AngleUsePropertyType> theField;
            theField = (this.isSetAngleReference() ? this.getAngleReference() : null);
            strategy.appendField(locator, this, "angleReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PointReferenceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
