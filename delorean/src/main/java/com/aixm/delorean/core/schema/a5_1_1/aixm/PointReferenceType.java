
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
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for PointReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PointReferenceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}PointReferencePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPointReferenceExtension"/>
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
@XmlType(name = "PointReferenceType", propOrder = {
    "role",
    "priorFixTolerance",
    "postFixTolerance",
    "point",
    "facilityAngle",
    "facilityDistance",
    "fixToleranceArea",
    "annotation",
    "extension"
})
@Entity(name = "PointReferenceType")
@Table(name = "pointreference", schema = "navaids_point")
public class PointReferenceType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeReferenceRoleType> role;
    @XmlElementRef(name = "priorFixTolerance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> priorFixTolerance;
    @XmlElementRef(name = "postFixTolerance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> postFixTolerance;
    @XmlElementRef(name = "point", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> point;
    @XmlElement(nillable = true)
    protected List<AngleUsePropertyType> facilityAngle;
    @XmlElement(nillable = true)
    protected List<DistanceIndicationPropertyType> facilityDistance;
    @XmlElementRef(name = "fixToleranceArea", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMSurfacePropertyType> fixToleranceArea;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<PointReferenceTypeExtensionType> extension;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeReferenceRoleType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeReferenceRoleType }{@code >}
     *     
     */
    public void setRole(JAXBElement<CodeReferenceRoleType> value) {
        this.role = value;
    }

    @Transient
    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the priorFixTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setPriorFixTolerance(JAXBElement<ValDistanceSignedType> value) {
        this.priorFixTolerance = value;
    }

    @Transient
    public boolean isSetPriorFixTolerance() {
        return (this.priorFixTolerance!= null);
    }

    /**
     * Gets the value of the postFixTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setPostFixTolerance(JAXBElement<ValDistanceSignedType> value) {
        this.postFixTolerance = value;
    }

    @Transient
    public boolean isSetPostFixTolerance() {
        return (this.postFixTolerance!= null);
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DesignatedPointPropertyType> getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.point = value;
    }

    @Transient
    public boolean isSetPoint() {
        return (this.point!= null);
    }

    /**
     * Gets the value of the facilityAngle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAngle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAngle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AngleUsePropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = AngleUsePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "facilityangle_id", referencedColumnName = "hjid")
    public List<AngleUsePropertyType> getFacilityAngle() {
        if (facilityAngle == null) {
            facilityAngle = new ArrayList<>();
        }
        return this.facilityAngle;
    }

    /**
     * 
     * 
     */
    public void setFacilityAngle(List<AngleUsePropertyType> facilityAngle) {
        this.facilityAngle = facilityAngle;
    }

    @Transient
    public boolean isSetFacilityAngle() {
        return ((this.facilityAngle!= null)&&(!this.facilityAngle.isEmpty()));
    }

    public void unsetFacilityAngle() {
        this.facilityAngle = null;
    }

    /**
     * Gets the value of the facilityDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistanceIndicationPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = DistanceIndicationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "facilitydistance_id", referencedColumnName = "hjid")
    public List<DistanceIndicationPropertyType> getFacilityDistance() {
        if (facilityDistance == null) {
            facilityDistance = new ArrayList<>();
        }
        return this.facilityDistance;
    }

    /**
     * 
     * 
     */
    public void setFacilityDistance(List<DistanceIndicationPropertyType> facilityDistance) {
        this.facilityDistance = facilityDistance;
    }

    @Transient
    public boolean isSetFacilityDistance() {
        return ((this.facilityDistance!= null)&&(!this.facilityDistance.isEmpty()));
    }

    public void unsetFacilityDistance() {
        this.facilityDistance = null;
    }

    /**
     * Gets the value of the fixToleranceArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMSurfacePropertyType }{@code >}
     *     
     */
    public void setFixToleranceArea(JAXBElement<AIXMSurfacePropertyType> value) {
        this.fixToleranceArea = value;
    }

    @Transient
    public boolean isSetFixToleranceArea() {
        return (this.fixToleranceArea!= null);
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
    @OneToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
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
     * {@link PointReferenceTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = PointReferenceTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_POINT_REFERENCE_TY_0")
    public List<PointReferenceTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<PointReferenceTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "role")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "role_nilreason"))
    })
    public CodeReferenceRoleType getRoleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeReferenceRoleType.class, this.getRole());
    }

    public void setRoleItem(CodeReferenceRoleType target) {
        setRole(XmlAdapterUtils.marshallJAXBElement(CodeReferenceRoleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "role"), PointReferenceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "priorfixtolerance")),
        @AttributeOverride(name = "uom", column = @Column(name = "priorfixtolerance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "priorfixtolerance_nilreason"))
    })
    public ValDistanceSignedType getPriorFixToleranceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getPriorFixTolerance());
    }

    public void setPriorFixToleranceItem(ValDistanceSignedType target) {
        setPriorFixTolerance(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "priorFixTolerance"), PointReferenceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "postfixtolerance")),
        @AttributeOverride(name = "uom", column = @Column(name = "postfixtolerance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "postfixtolerance_nilreason"))
    })
    public ValDistanceSignedType getPostFixToleranceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceSignedType.class, this.getPostFixTolerance());
    }

    public void setPostFixToleranceItem(ValDistanceSignedType target) {
        setPostFixTolerance(XmlAdapterUtils.marshallJAXBElement(ValDistanceSignedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "postFixTolerance"), PointReferenceType.class, target));
    }

    @OneToOne(targetEntity = DesignatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "point_id", referencedColumnName = "hjid")
    public DesignatedPointPropertyType getPointItem() {
        return XmlAdapterUtils.unmarshallSource(DesignatedPointPropertyType.class, this.getPoint());
    }

    public void setPointItem(DesignatedPointPropertyType target) {
        setPoint(XmlAdapterUtils.marshallJAXBElement(DesignatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "point"), PointReferenceType.class, target));
    }

    @OneToOne(targetEntity = AIXMSurfacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "fixtolerancearea_id", referencedColumnName = "hjid")
    public AIXMSurfacePropertyType getFixToleranceAreaItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMSurfacePropertyType.class, this.getFixToleranceArea());
    }

    public void setFixToleranceAreaItem(AIXMSurfacePropertyType target) {
        setFixToleranceArea(XmlAdapterUtils.marshallJAXBElement(AIXMSurfacePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "fixToleranceArea"), PointReferenceType.class, target));
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
        final PointReferenceType that = ((PointReferenceType) object);
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
            boolean lhsFieldIsSet = this.isSetFacilityDistance();
            boolean rhsFieldIsSet = that.isSetFacilityDistance();
            List<DistanceIndicationPropertyType> lhsField;
            lhsField = (this.isSetFacilityDistance()?this.getFacilityDistance():null);
            List<DistanceIndicationPropertyType> rhsField;
            rhsField = (that.isSetFacilityDistance()?that.getFacilityDistance():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "facilityDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "facilityDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFacilityAngle();
            boolean rhsFieldIsSet = that.isSetFacilityAngle();
            List<AngleUsePropertyType> lhsField;
            lhsField = (this.isSetFacilityAngle()?this.getFacilityAngle():null);
            List<AngleUsePropertyType> rhsField;
            rhsField = (that.isSetFacilityAngle()?that.getFacilityAngle():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "facilityAngle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "facilityAngle", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PointReferenceTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<PointReferenceTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetPoint();
            boolean rhsFieldIsSet = that.isSetPoint();
            JAXBElement<DesignatedPointPropertyType> lhsField;
            lhsField = this.getPoint();
            JAXBElement<DesignatedPointPropertyType> rhsField;
            rhsField = that.getPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "point", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "point", rhsField);
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
            boolean theFieldIsSet = this.isSetPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "point", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacilityAngle();
            List<AngleUsePropertyType> theField;
            theField = (this.isSetFacilityAngle()?this.getFacilityAngle():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "facilityAngle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacilityDistance();
            List<DistanceIndicationPropertyType> theField;
            theField = (this.isSetFacilityDistance()?this.getFacilityDistance():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "facilityDistance", theField);
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
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PointReferenceTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetPoint();
            JAXBElement<DesignatedPointPropertyType> theField;
            theField = this.getPoint();
            strategy.appendField(locator, this, "point", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacilityAngle();
            List<AngleUsePropertyType> theField;
            theField = (this.isSetFacilityAngle()?this.getFacilityAngle():null);
            strategy.appendField(locator, this, "facilityAngle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFacilityDistance();
            List<DistanceIndicationPropertyType> theField;
            theField = (this.isSetFacilityDistance()?this.getFacilityDistance():null);
            strategy.appendField(locator, this, "facilityDistance", buffer, theField, theFieldIsSet);
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
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PointReferenceTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
