
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
 * Java class for RunwayCentrelinePointTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="RunwayCentrelinePointTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="role" type=
"{http://www.aixm.aero/schema/5.2}CodeRunwayPointRoleType" minOccurs="0"/>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="location" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="associatedDeclaredDistance" type=
"{http://www.aixm.aero/schema/5.2}RunwayDeclaredDistancePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="navaidEquipment" type=
"{http://www.aixm.aero/schema/5.2}NavaidEquipmentDistancePropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="relativeDistance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="onRunwayDirection" type=
"{http://www.aixm.aero/schema/5.2}RunwayDirectionPropertyType" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractRunwayCentrelinePointExtension"/>
 *                 </sequence>
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
@XmlType(name = "RunwayCentrelinePointTimeSliceType", propOrder = {"role", "designator", "location",
        "associatedDeclaredDistance", "navaidEquipment", "annotation", "relativeDistance", "onRunwayDirection",
        "extension"})
@Entity(name = "RunwayCentrelinePointTimeSliceType")
@Table(name = "runwaycentrelinepoint_t", schema = "airport_heliport")
public class RunwayCentrelinePointTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayPointRoleType> role;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<RunwayDeclaredDistancePropertyType> associatedDeclaredDistance;
    @XmlElement(nillable = true)
    protected List<NavaidEquipmentDistancePropertyType> navaidEquipment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "relativeDistance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> relativeDistance;
    @XmlElementRef(name = "onRunwayDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> onRunwayDirection;
    protected List<RunwayCentrelinePointTimeSliceExtensionType> extension;

    /**
     * Gets the value of the role property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeRunwayPointRoleType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeRunwayPointRoleType> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeRunwayPointRoleType }{@code >}
     *
     */
    public void setRole(JAXBElement<CodeRunwayPointRoleType> value) {
        this.role = value;
    }

    @Transient
    public boolean isSetRole() {
        return (this.role != null);
    }

    /**
     * Gets the value of the designator property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    @Transient
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator != null);
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setLocation(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.location = value;
    }

    @Transient
    public boolean isSetLocation() {
        return (this.location != null);
    }

    /**
     * Gets the value of the associatedDeclaredDistance property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the associatedDeclaredDistance property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAssociatedDeclaredDistance().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDeclaredDistancePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayDeclaredDistancePropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwcntrlnpnttmslctp_assctddclrddstnc_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaycentrelinepoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "associateddeclareddistance_hjid", referencedColumnName = "hjid")})
    public List<RunwayDeclaredDistancePropertyType> getAssociatedDeclaredDistance() {
        if (associatedDeclaredDistance == null) {
            associatedDeclaredDistance = new ArrayList<>();
        }
        return this.associatedDeclaredDistance;
    }

    /**
     *
     *
     */
    public void setAssociatedDeclaredDistance(List<RunwayDeclaredDistancePropertyType> associatedDeclaredDistance) {
        this.associatedDeclaredDistance = associatedDeclaredDistance;
    }

    @Transient
    public boolean isSetAssociatedDeclaredDistance() {
        return ((this.associatedDeclaredDistance != null) && (!this.associatedDeclaredDistance.isEmpty()));
    }

    public void unsetAssociatedDeclaredDistance() {
        this.associatedDeclaredDistance = null;
    }

    /**
     * Gets the value of the navaidEquipment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the navaidEquipment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getNavaidEquipment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidEquipmentDistancePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = NavaidEquipmentDistancePropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwcntrlnpnttmslctp_nvdeqpmnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaycentrelinepoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "navaidequipment_hjid", referencedColumnName = "hjid")})
    public List<NavaidEquipmentDistancePropertyType> getNavaidEquipment() {
        if (navaidEquipment == null) {
            navaidEquipment = new ArrayList<>();
        }
        return this.navaidEquipment;
    }

    /**
     *
     *
     */
    public void setNavaidEquipment(List<NavaidEquipmentDistancePropertyType> navaidEquipment) {
        this.navaidEquipment = navaidEquipment;
    }

    @Transient
    public boolean isSetNavaidEquipment() {
        return ((this.navaidEquipment != null) && (!this.navaidEquipment.isEmpty()));
    }

    public void unsetNavaidEquipment() {
        this.navaidEquipment = null;
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
    @JoinTable(name = "rnwcntrlnpnttmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaycentrelinepoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the relativeDistance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getRelativeDistance() {
        return relativeDistance;
    }

    /**
     * Sets the value of the relativeDistance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setRelativeDistance(JAXBElement<ValDistanceType> value) {
        this.relativeDistance = value;
    }

    @Transient
    public boolean isSetRelativeDistance() {
        return (this.relativeDistance != null);
    }

    /**
     * Gets the value of the onRunwayDirection property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<RunwayDirectionPropertyType> getOnRunwayDirection() {
        return onRunwayDirection;
    }

    /**
     * Sets the value of the onRunwayDirection property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *
     */
    public void setOnRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.onRunwayDirection = value;
    }

    @Transient
    public boolean isSetOnRunwayDirection() {
        return (this.onRunwayDirection != null);
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
     * {@link RunwayCentrelinePointTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = RunwayCentrelinePointTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "runwaycentrelinepoint_te_hjid", referencedColumnName = "hjid")
    public List<RunwayCentrelinePointTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<RunwayCentrelinePointTimeSliceExtensionType> extension) {
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
    public CodeRunwayPointRoleType getRoleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayPointRoleType.class, this.getRole());
    }

    public void setRoleItem(CodeRunwayPointRoleType target) {
        setRole(XmlAdapterUtils.marshallJAXBElement(CodeRunwayPointRoleType.class,
                new QName("http://www.aixm.aero/schema/5.2", "role"), RunwayCentrelinePointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 16)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"), RunwayCentrelinePointTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwcntrlnpnttmslctp_lctn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaycentrelinepoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "location_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "location"), RunwayCentrelinePointTimeSliceType.class,
                target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "relativedistance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "relativedistanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "relativedistanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "relativedistancenilreason"))})
    public ValDistanceType getRelativeDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getRelativeDistance());
    }

    public void setRelativeDistanceItem(ValDistanceType target) {
        setRelativeDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "relativeDistance"),
                RunwayCentrelinePointTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = RunwayDirectionPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "rnwcntrlnpnttmslctp_onrnwdrctn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "runwaycentrelinepoint_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "onrunwaydirection_hjid", referencedColumnName = "hjid")})
    public RunwayDirectionPropertyType getOnRunwayDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayDirectionPropertyType.class, this.getOnRunwayDirection());
    }

    public void setOnRunwayDirectionItem(RunwayDirectionPropertyType target) {
        setOnRunwayDirection(XmlAdapterUtils.marshallJAXBElement(RunwayDirectionPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "onRunwayDirection"),
                RunwayCentrelinePointTimeSliceType.class, target));
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
        final RunwayCentrelinePointTimeSliceType that = ((RunwayCentrelinePointTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetOnRunwayDirection();
            boolean rhsFieldIsSet = that.isSetOnRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> lhsField;
            lhsField = this.getOnRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> rhsField;
            rhsField = that.getOnRunwayDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "onRunwayDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "onRunwayDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayCentrelinePointTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<RunwayCentrelinePointTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRole();
            boolean rhsFieldIsSet = that.isSetRole();
            JAXBElement<CodeRunwayPointRoleType> lhsField;
            lhsField = this.getRole();
            JAXBElement<CodeRunwayPointRoleType> rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAssociatedDeclaredDistance();
            boolean rhsFieldIsSet = that.isSetAssociatedDeclaredDistance();
            List<RunwayDeclaredDistancePropertyType> lhsField;
            lhsField = (this.isSetAssociatedDeclaredDistance() ? this.getAssociatedDeclaredDistance() : null);
            List<RunwayDeclaredDistancePropertyType> rhsField;
            rhsField = (that.isSetAssociatedDeclaredDistance() ? that.getAssociatedDeclaredDistance() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedDeclaredDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedDeclaredDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetNavaidEquipment();
            List<NavaidEquipmentDistancePropertyType> lhsField;
            lhsField = (this.isSetNavaidEquipment() ? this.getNavaidEquipment() : null);
            List<NavaidEquipmentDistancePropertyType> rhsField;
            rhsField = (that.isSetNavaidEquipment() ? that.getNavaidEquipment() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRelativeDistance();
            boolean rhsFieldIsSet = that.isSetRelativeDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getRelativeDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getRelativeDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "relativeDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "relativeDistance", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetRole();
            JAXBElement<CodeRunwayPointRoleType> theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
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
            boolean theFieldIsSet = this.isSetAssociatedDeclaredDistance();
            List<RunwayDeclaredDistancePropertyType> theField;
            theField = (this.isSetAssociatedDeclaredDistance() ? this.getAssociatedDeclaredDistance() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedDeclaredDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidEquipment();
            List<NavaidEquipmentDistancePropertyType> theField;
            theField = (this.isSetNavaidEquipment() ? this.getNavaidEquipment() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidEquipment", theField);
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
            boolean theFieldIsSet = this.isSetRelativeDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRelativeDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "relativeDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOnRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getOnRunwayDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "onRunwayDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayCentrelinePointTimeSliceExtensionType> theField;
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
            JAXBElement<CodeRunwayPointRoleType> theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocation();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedDeclaredDistance();
            List<RunwayDeclaredDistancePropertyType> theField;
            theField = (this.isSetAssociatedDeclaredDistance() ? this.getAssociatedDeclaredDistance() : null);
            strategy.appendField(locator, this, "associatedDeclaredDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidEquipment();
            List<NavaidEquipmentDistancePropertyType> theField;
            theField = (this.isSetNavaidEquipment() ? this.getNavaidEquipment() : null);
            strategy.appendField(locator, this, "navaidEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRelativeDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getRelativeDistance();
            strategy.appendField(locator, this, "relativeDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOnRunwayDirection();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getOnRunwayDirection();
            strategy.appendField(locator, this, "onRunwayDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayCentrelinePointTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
