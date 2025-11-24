
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
 * <p>Java class for RunwayCentrelinePointTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RunwayCentrelinePointTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RunwayCentrelinePointPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayCentrelinePointExtension"/>
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
@XmlType(name = "RunwayCentrelinePointTimeSliceType", propOrder = {
    "role",
    "designator",
    "location",
    "onRunway",
    "associatedDeclaredDistance",
    "navaidEquipment",
    "annotation",
    "extension"
})
@Entity(name = "RunwayCentrelinePointTimeSliceType")
@Table(name = "runwaycentrelinepoint_ts", schema = "airport_heliport")
public class RunwayCentrelinePointTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayPointRoleType> role;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> location;
    @XmlElementRef(name = "onRunway", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> onRunway;
    @XmlElement(nillable = true)
    protected List<RunwayDeclaredDistancePropertyType> associatedDeclaredDistance;
    @XmlElement(nillable = true)
    protected List<NavaidEquipmentDistancePropertyType> navaidEquipment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RunwayCentrelinePointExtensionType> extension;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayPointRoleType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayPointRoleType }{@code >}
     *     
     */
    public void setRole(JAXBElement<CodeRunwayPointRoleType> value) {
        this.role = value;
    }

    @Transient
    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
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
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
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
     * Gets the value of the onRunway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RunwayDirectionPropertyType> getOnRunway() {
        return onRunway;
    }

    /**
     * Sets the value of the onRunway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setOnRunway(JAXBElement<RunwayDirectionPropertyType> value) {
        this.onRunway = value;
    }

    @Transient
    public boolean isSetOnRunway() {
        return (this.onRunway!= null);
    }

    /**
     * Gets the value of the associatedDeclaredDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedDeclaredDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedDeclaredDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDeclaredDistancePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RunwayDeclaredDistancePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "associateddeclareddistance_runwaycentrelinepoint_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "associateddeclareddistance", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaycentrelinepointpropertygroup", referencedColumnName = "hjid")
    })
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
        return ((this.associatedDeclaredDistance!= null)&&(!this.associatedDeclaredDistance.isEmpty()));
    }

    public void unsetAssociatedDeclaredDistance() {
        this.associatedDeclaredDistance = null;
    }

    /**
     * Gets the value of the navaidEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidEquipmentDistancePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NavaidEquipmentDistancePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "navaidequipment_runwaycentrelinepoint_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "navaidequipment", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaycentrelinepointpropertygroup", referencedColumnName = "hjid")
    })
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
        return ((this.navaidEquipment!= null)&&(!this.navaidEquipment.isEmpty()));
    }

    public void unsetNavaidEquipment() {
        this.navaidEquipment = null;
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
    @JoinTable(name = "annotation_runwaycentrelinepoint_link", schema = "airport_heliport", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "runwaycentrelinepointpropertygroup", referencedColumnName = "hjid")
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
     * {@link RunwayCentrelinePointExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RunwayCentrelinePointExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RunwayCentrelinePointExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RunwayCentrelinePointExtensionType> extension) {
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
    public CodeRunwayPointRoleType getRoleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRunwayPointRoleType.class, this.getRole());
    }

    public void setRoleItem(CodeRunwayPointRoleType target) {
        setRole(XmlAdapterUtils.marshallJAXBElement(CodeRunwayPointRoleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "role"), RunwayCentrelinePointTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), RunwayCentrelinePointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "hjid")
    public AIXMElevatedPointPropertyType getLocationItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getLocation());
    }

    public void setLocationItem(AIXMElevatedPointPropertyType target) {
        setLocation(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "location"), RunwayCentrelinePointTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RunwayDirectionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "onrunway_id", referencedColumnName = "hjid")
    public RunwayDirectionPropertyType getOnRunwayItem() {
        return XmlAdapterUtils.unmarshallSource(RunwayDirectionPropertyType.class, this.getOnRunway());
    }

    public void setOnRunwayItem(RunwayDirectionPropertyType target) {
        setOnRunway(XmlAdapterUtils.marshallJAXBElement(RunwayDirectionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "onRunway"), RunwayCentrelinePointTimeSliceType.class, target));
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
        final RunwayCentrelinePointTimeSliceType that = ((RunwayCentrelinePointTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetNavaidEquipment();
            boolean rhsFieldIsSet = that.isSetNavaidEquipment();
            List<NavaidEquipmentDistancePropertyType> lhsField;
            lhsField = (this.isSetNavaidEquipment()?this.getNavaidEquipment():null);
            List<NavaidEquipmentDistancePropertyType> rhsField;
            rhsField = (that.isSetNavaidEquipment()?that.getNavaidEquipment():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navaidEquipment", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navaidEquipment", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RunwayCentrelinePointExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RunwayCentrelinePointExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAssociatedDeclaredDistance();
            boolean rhsFieldIsSet = that.isSetAssociatedDeclaredDistance();
            List<RunwayDeclaredDistancePropertyType> lhsField;
            lhsField = (this.isSetAssociatedDeclaredDistance()?this.getAssociatedDeclaredDistance():null);
            List<RunwayDeclaredDistancePropertyType> rhsField;
            rhsField = (that.isSetAssociatedDeclaredDistance()?that.getAssociatedDeclaredDistance():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "associatedDeclaredDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "associatedDeclaredDistance", rhsField);
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
            boolean lhsFieldIsSet = this.isSetOnRunway();
            boolean rhsFieldIsSet = that.isSetOnRunway();
            JAXBElement<RunwayDirectionPropertyType> lhsField;
            lhsField = this.getOnRunway();
            JAXBElement<RunwayDirectionPropertyType> rhsField;
            rhsField = that.getOnRunway();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "onRunway", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "onRunway", rhsField);
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
            boolean theFieldIsSet = this.isSetOnRunway();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getOnRunway();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "onRunway", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedDeclaredDistance();
            List<RunwayDeclaredDistancePropertyType> theField;
            theField = (this.isSetAssociatedDeclaredDistance()?this.getAssociatedDeclaredDistance():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "associatedDeclaredDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidEquipment();
            List<NavaidEquipmentDistancePropertyType> theField;
            theField = (this.isSetNavaidEquipment()?this.getNavaidEquipment():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navaidEquipment", theField);
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
            List<RunwayCentrelinePointExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetOnRunway();
            JAXBElement<RunwayDirectionPropertyType> theField;
            theField = this.getOnRunway();
            strategy.appendField(locator, this, "onRunway", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAssociatedDeclaredDistance();
            List<RunwayDeclaredDistancePropertyType> theField;
            theField = (this.isSetAssociatedDeclaredDistance()?this.getAssociatedDeclaredDistance():null);
            strategy.appendField(locator, this, "associatedDeclaredDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavaidEquipment();
            List<NavaidEquipmentDistancePropertyType> theField;
            theField = (this.isSetNavaidEquipment()?this.getNavaidEquipment():null);
            strategy.appendField(locator, this, "navaidEquipment", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RunwayCentrelinePointExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
