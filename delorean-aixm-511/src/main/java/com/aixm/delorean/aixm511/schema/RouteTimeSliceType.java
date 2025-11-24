
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
 * <p>Java class for RouteTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RoutePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRouteExtension"/>
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
@XmlType(name = "RouteTimeSliceType", propOrder = {
    "designatorPrefix",
    "designatorSecondLetter",
    "designatorNumber",
    "multipleIdentifier",
    "locationDesignator",
    "aixmName",
    "type",
    "flightRule",
    "internationalUse",
    "militaryUse",
    "militaryTrainingType",
    "userOrganisation",
    "annotation",
    "extension"
})
@Entity(name = "RouteTimeSliceType")
@Table(name = "route_ts", schema = "route")
public class RouteTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designatorPrefix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorPrefixType> designatorPrefix;
    @XmlElementRef(name = "designatorSecondLetter", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorLetterType> designatorSecondLetter;
    @XmlElementRef(name = "designatorNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> designatorNumber;
    @XmlElementRef(name = "multipleIdentifier", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> multipleIdentifier;
    @XmlElementRef(name = "locationDesignator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> locationDesignator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteType> type;
    @XmlElementRef(name = "flightRule", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightRuleType> flightRule;
    @XmlElementRef(name = "internationalUse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteOriginType> internationalUse;
    @XmlElementRef(name = "militaryUse", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryStatusType> militaryUse;
    @XmlElementRef(name = "militaryTrainingType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryTrainingType> militaryTrainingType;
    @XmlElementRef(name = "userOrganisation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> userOrganisation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RouteExtensionType> extension;

    /**
     * Gets the value of the designatorPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorPrefixType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteDesignatorPrefixType> getDesignatorPrefix() {
        return designatorPrefix;
    }

    /**
     * Sets the value of the designatorPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorPrefixType }{@code >}
     *     
     */
    public void setDesignatorPrefix(JAXBElement<CodeRouteDesignatorPrefixType> value) {
        this.designatorPrefix = value;
    }

    @Transient
    public boolean isSetDesignatorPrefix() {
        return (this.designatorPrefix!= null);
    }

    /**
     * Gets the value of the designatorSecondLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorLetterType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteDesignatorLetterType> getDesignatorSecondLetter() {
        return designatorSecondLetter;
    }

    /**
     * Sets the value of the designatorSecondLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorLetterType }{@code >}
     *     
     */
    public void setDesignatorSecondLetter(JAXBElement<CodeRouteDesignatorLetterType> value) {
        this.designatorSecondLetter = value;
    }

    @Transient
    public boolean isSetDesignatorSecondLetter() {
        return (this.designatorSecondLetter!= null);
    }

    /**
     * Gets the value of the designatorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<NoNumberType> getDesignatorNumber() {
        return designatorNumber;
    }

    /**
     * Sets the value of the designatorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setDesignatorNumber(JAXBElement<NoNumberType> value) {
        this.designatorNumber = value;
    }

    @Transient
    public boolean isSetDesignatorNumber() {
        return (this.designatorNumber!= null);
    }

    /**
     * Gets the value of the multipleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeUpperAlphaType> getMultipleIdentifier() {
        return multipleIdentifier;
    }

    /**
     * Sets the value of the multipleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setMultipleIdentifier(JAXBElement<CodeUpperAlphaType> value) {
        this.multipleIdentifier = value;
    }

    @Transient
    public boolean isSetMultipleIdentifier() {
        return (this.multipleIdentifier!= null);
    }

    /**
     * Gets the value of the locationDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextDesignatorType> getLocationDesignator() {
        return locationDesignator;
    }

    /**
     * Sets the value of the locationDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setLocationDesignator(JAXBElement<TextDesignatorType> value) {
        this.locationDesignator = value;
    }

    @Transient
    public boolean isSetLocationDesignator() {
        return (this.locationDesignator!= null);
    }

    /**
     * Gets the value of the aixmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getAixmName() {
        return aixmName;
    }

    /**
     * Sets the value of the aixmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAixmName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    @Transient
    public boolean isSetAixmName() {
        return (this.aixmName!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRouteType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the flightRule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeFlightRuleType> getFlightRule() {
        return flightRule;
    }

    /**
     * Sets the value of the flightRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public void setFlightRule(JAXBElement<CodeFlightRuleType> value) {
        this.flightRule = value;
    }

    @Transient
    public boolean isSetFlightRule() {
        return (this.flightRule!= null);
    }

    /**
     * Gets the value of the internationalUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteOriginType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteOriginType> getInternationalUse() {
        return internationalUse;
    }

    /**
     * Sets the value of the internationalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteOriginType }{@code >}
     *     
     */
    public void setInternationalUse(JAXBElement<CodeRouteOriginType> value) {
        this.internationalUse = value;
    }

    @Transient
    public boolean isSetInternationalUse() {
        return (this.internationalUse!= null);
    }

    /**
     * Gets the value of the militaryUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMilitaryStatusType> getMilitaryUse() {
        return militaryUse;
    }

    /**
     * Sets the value of the militaryUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    public void setMilitaryUse(JAXBElement<CodeMilitaryStatusType> value) {
        this.militaryUse = value;
    }

    @Transient
    public boolean isSetMilitaryUse() {
        return (this.militaryUse!= null);
    }

    /**
     * Gets the value of the militaryTrainingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryTrainingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMilitaryTrainingType> getMilitaryTrainingType() {
        return militaryTrainingType;
    }

    /**
     * Sets the value of the militaryTrainingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryTrainingType }{@code >}
     *     
     */
    public void setMilitaryTrainingType(JAXBElement<CodeMilitaryTrainingType> value) {
        this.militaryTrainingType = value;
    }

    @Transient
    public boolean isSetMilitaryTrainingType() {
        return (this.militaryTrainingType!= null);
    }

    /**
     * Gets the value of the userOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<OrganisationAuthorityPropertyType> getUserOrganisation() {
        return userOrganisation;
    }

    /**
     * Sets the value of the userOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setUserOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.userOrganisation = value;
    }

    @Transient
    public boolean isSetUserOrganisation() {
        return (this.userOrganisation!= null);
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
    @JoinTable(name = "annotation_route_link", schema = "route", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "routepropertygroup", referencedColumnName = "hjid")
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
     * {@link RouteExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RouteExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RouteExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RouteExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "designatorprefix")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatorprefix_nilreason"))
    })
    public CodeRouteDesignatorPrefixType getDesignatorPrefixItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteDesignatorPrefixType.class, this.getDesignatorPrefix());
    }

    public void setDesignatorPrefixItem(CodeRouteDesignatorPrefixType target) {
        setDesignatorPrefix(XmlAdapterUtils.marshallJAXBElement(CodeRouteDesignatorPrefixType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorPrefix"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatorsecondletter")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatorsecondletter_nilreason"))
    })
    public CodeRouteDesignatorLetterType getDesignatorSecondLetterItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteDesignatorLetterType.class, this.getDesignatorSecondLetter());
    }

    public void setDesignatorSecondLetterItem(CodeRouteDesignatorLetterType target) {
        setDesignatorSecondLetter(XmlAdapterUtils.marshallJAXBElement(CodeRouteDesignatorLetterType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorSecondLetter"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatornumber")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatornumber_nilreason"))
    })
    public NoNumberType getDesignatorNumberItem() {
        return XmlAdapterUtils.unmarshallSource(NoNumberType.class, this.getDesignatorNumber());
    }

    public void setDesignatorNumberItem(NoNumberType target) {
        setDesignatorNumber(XmlAdapterUtils.marshallJAXBElement(NoNumberType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorNumber"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "multipleidentifier")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "multipleidentifier_nilreason"))
    })
    public CodeUpperAlphaType getMultipleIdentifierItem() {
        return XmlAdapterUtils.unmarshallSource(CodeUpperAlphaType.class, this.getMultipleIdentifier());
    }

    public void setMultipleIdentifierItem(CodeUpperAlphaType target) {
        setMultipleIdentifier(XmlAdapterUtils.marshallJAXBElement(CodeUpperAlphaType.class, new QName("http://www.aixm.aero/schema/5.1.1", "multipleIdentifier"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "locationdesignator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "locationdesignator_nilreason"))
    })
    public TextDesignatorType getLocationDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getLocationDesignator());
    }

    public void setLocationDesignatorItem(TextDesignatorType target) {
        setLocationDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "locationDesignator"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "name")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "name_nilreason"))
    })
    public TextNameType getAixmNameItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getAixmName());
    }

    public void setAixmNameItem(TextNameType target) {
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "type")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "type_nilreason"))
    })
    public CodeRouteType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteType.class, this.getType());
    }

    public void setTypeItem(CodeRouteType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeRouteType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "flightrule")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "flightrule_nilreason"))
    })
    public CodeFlightRuleType getFlightRuleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeFlightRuleType.class, this.getFlightRule());
    }

    public void setFlightRuleItem(CodeFlightRuleType target) {
        setFlightRule(XmlAdapterUtils.marshallJAXBElement(CodeFlightRuleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "flightRule"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "internationaluse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "internationaluse_nilreason"))
    })
    public CodeRouteOriginType getInternationalUseItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteOriginType.class, this.getInternationalUse());
    }

    public void setInternationalUseItem(CodeRouteOriginType target) {
        setInternationalUse(XmlAdapterUtils.marshallJAXBElement(CodeRouteOriginType.class, new QName("http://www.aixm.aero/schema/5.1.1", "internationalUse"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "militaryuse")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "militaryuse_nilreason"))
    })
    public CodeMilitaryStatusType getMilitaryUseItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMilitaryStatusType.class, this.getMilitaryUse());
    }

    public void setMilitaryUseItem(CodeMilitaryStatusType target) {
        setMilitaryUse(XmlAdapterUtils.marshallJAXBElement(CodeMilitaryStatusType.class, new QName("http://www.aixm.aero/schema/5.1.1", "militaryUse"), RouteTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "militarytrainingtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "militarytrainingtype_nilreason"))
    })
    public CodeMilitaryTrainingType getMilitaryTrainingTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMilitaryTrainingType.class, this.getMilitaryTrainingType());
    }

    public void setMilitaryTrainingTypeItem(CodeMilitaryTrainingType target) {
        setMilitaryTrainingType(XmlAdapterUtils.marshallJAXBElement(CodeMilitaryTrainingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "militaryTrainingType"), RouteTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "userorganisation_id", referencedColumnName = "hjid")
    public OrganisationAuthorityPropertyType getUserOrganisationItem() {
        return XmlAdapterUtils.unmarshallSource(OrganisationAuthorityPropertyType.class, this.getUserOrganisation());
    }

    public void setUserOrganisationItem(OrganisationAuthorityPropertyType target) {
        setUserOrganisation(XmlAdapterUtils.marshallJAXBElement(OrganisationAuthorityPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "userOrganisation"), RouteTimeSliceType.class, target));
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
        final RouteTimeSliceType that = ((RouteTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetFlightRule();
            boolean rhsFieldIsSet = that.isSetFlightRule();
            JAXBElement<CodeFlightRuleType> lhsField;
            lhsField = this.getFlightRule();
            JAXBElement<CodeFlightRuleType> rhsField;
            rhsField = that.getFlightRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "flightRule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "flightRule", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RouteExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RouteExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAixmName();
            boolean rhsFieldIsSet = that.isSetAixmName();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getAixmName();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getAixmName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "aixmName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "aixmName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetInternationalUse();
            boolean rhsFieldIsSet = that.isSetInternationalUse();
            JAXBElement<CodeRouteOriginType> lhsField;
            lhsField = this.getInternationalUse();
            JAXBElement<CodeRouteOriginType> rhsField;
            rhsField = that.getInternationalUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "internationalUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "internationalUse", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLocationDesignator();
            boolean rhsFieldIsSet = that.isSetLocationDesignator();
            JAXBElement<TextDesignatorType> lhsField;
            lhsField = this.getLocationDesignator();
            JAXBElement<TextDesignatorType> rhsField;
            rhsField = that.getLocationDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "locationDesignator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "locationDesignator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUserOrganisation();
            boolean rhsFieldIsSet = that.isSetUserOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> lhsField;
            lhsField = this.getUserOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> rhsField;
            rhsField = that.getUserOrganisation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "userOrganisation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "userOrganisation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMultipleIdentifier();
            boolean rhsFieldIsSet = that.isSetMultipleIdentifier();
            JAXBElement<CodeUpperAlphaType> lhsField;
            lhsField = this.getMultipleIdentifier();
            JAXBElement<CodeUpperAlphaType> rhsField;
            rhsField = that.getMultipleIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "multipleIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "multipleIdentifier", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDesignatorPrefix();
            boolean rhsFieldIsSet = that.isSetDesignatorPrefix();
            JAXBElement<CodeRouteDesignatorPrefixType> lhsField;
            lhsField = this.getDesignatorPrefix();
            JAXBElement<CodeRouteDesignatorPrefixType> rhsField;
            rhsField = that.getDesignatorPrefix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorPrefix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorPrefix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorNumber();
            boolean rhsFieldIsSet = that.isSetDesignatorNumber();
            JAXBElement<NoNumberType> lhsField;
            lhsField = this.getDesignatorNumber();
            JAXBElement<NoNumberType> rhsField;
            rhsField = that.getDesignatorNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorNumber", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeRouteType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeRouteType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorSecondLetter();
            boolean rhsFieldIsSet = that.isSetDesignatorSecondLetter();
            JAXBElement<CodeRouteDesignatorLetterType> lhsField;
            lhsField = this.getDesignatorSecondLetter();
            JAXBElement<CodeRouteDesignatorLetterType> rhsField;
            rhsField = that.getDesignatorSecondLetter();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorSecondLetter", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorSecondLetter", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryTrainingType();
            boolean rhsFieldIsSet = that.isSetMilitaryTrainingType();
            JAXBElement<CodeMilitaryTrainingType> lhsField;
            lhsField = this.getMilitaryTrainingType();
            JAXBElement<CodeMilitaryTrainingType> rhsField;
            rhsField = that.getMilitaryTrainingType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryTrainingType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryTrainingType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMilitaryUse();
            boolean rhsFieldIsSet = that.isSetMilitaryUse();
            JAXBElement<CodeMilitaryStatusType> lhsField;
            lhsField = this.getMilitaryUse();
            JAXBElement<CodeMilitaryStatusType> rhsField;
            rhsField = that.getMilitaryUse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "militaryUse", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "militaryUse", rhsField);
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
            boolean theFieldIsSet = this.isSetDesignatorPrefix();
            JAXBElement<CodeRouteDesignatorPrefixType> theField;
            theField = this.getDesignatorPrefix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorPrefix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorSecondLetter();
            JAXBElement<CodeRouteDesignatorLetterType> theField;
            theField = this.getDesignatorSecondLetter();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorSecondLetter", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorNumber();
            JAXBElement<NoNumberType> theField;
            theField = this.getDesignatorNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMultipleIdentifier();
            JAXBElement<CodeUpperAlphaType> theField;
            theField = this.getMultipleIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "multipleIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getLocationDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "locationDesignator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "aixmName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeRouteType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightRule();
            JAXBElement<CodeFlightRuleType> theField;
            theField = this.getFlightRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "flightRule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInternationalUse();
            JAXBElement<CodeRouteOriginType> theField;
            theField = this.getInternationalUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "internationalUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryUse();
            JAXBElement<CodeMilitaryStatusType> theField;
            theField = this.getMilitaryUse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryUse", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryTrainingType();
            JAXBElement<CodeMilitaryTrainingType> theField;
            theField = this.getMilitaryTrainingType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "militaryTrainingType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getUserOrganisation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "userOrganisation", theField);
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
            List<RouteExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignatorPrefix();
            JAXBElement<CodeRouteDesignatorPrefixType> theField;
            theField = this.getDesignatorPrefix();
            strategy.appendField(locator, this, "designatorPrefix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorSecondLetter();
            JAXBElement<CodeRouteDesignatorLetterType> theField;
            theField = this.getDesignatorSecondLetter();
            strategy.appendField(locator, this, "designatorSecondLetter", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorNumber();
            JAXBElement<NoNumberType> theField;
            theField = this.getDesignatorNumber();
            strategy.appendField(locator, this, "designatorNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMultipleIdentifier();
            JAXBElement<CodeUpperAlphaType> theField;
            theField = this.getMultipleIdentifier();
            strategy.appendField(locator, this, "multipleIdentifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocationDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getLocationDesignator();
            strategy.appendField(locator, this, "locationDesignator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            JAXBElement<CodeRouteType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFlightRule();
            JAXBElement<CodeFlightRuleType> theField;
            theField = this.getFlightRule();
            strategy.appendField(locator, this, "flightRule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInternationalUse();
            JAXBElement<CodeRouteOriginType> theField;
            theField = this.getInternationalUse();
            strategy.appendField(locator, this, "internationalUse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryUse();
            JAXBElement<CodeMilitaryStatusType> theField;
            theField = this.getMilitaryUse();
            strategy.appendField(locator, this, "militaryUse", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMilitaryTrainingType();
            JAXBElement<CodeMilitaryTrainingType> theField;
            theField = this.getMilitaryTrainingType();
            strategy.appendField(locator, this, "militaryTrainingType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserOrganisation();
            JAXBElement<OrganisationAuthorityPropertyType> theField;
            theField = this.getUserOrganisation();
            strategy.appendField(locator, this, "userOrganisation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RouteExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
