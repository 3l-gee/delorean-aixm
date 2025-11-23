
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
 * <p>Java class for AirspaceTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirspaceTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}AirspacePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirspaceExtension"/>
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
@XmlType(name = "AirspaceTimeSliceType", propOrder = {
    "type",
    "designator",
    "localType",
    "aixmName",
    "designatorICAO",
    "controlType",
    "upperLowerSeparation",
    "clazz",
    "protectedRoute",
    "geometryComponent",
    "activation",
    "annotation",
    "extension"
})
@Entity(name = "AirspaceTimeSliceType")
@Table(name = "airspace_ts", schema = "airspace")
public class AirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceType> type;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceDesignatorType> designator;
    @XmlElementRef(name = "localType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> localType;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "designatorICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> designatorICAO;
    @XmlElementRef(name = "controlType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryOperationsType> controlType;
    @XmlElementRef(name = "upperLowerSeparation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFLType> upperLowerSeparation;
    @XmlElement(name = "class", nillable = true)
    protected List<AirspaceLayerClassPropertyType> clazz;
    @XmlElementRef(name = "protectedRoute", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> protectedRoute;
    @XmlElement(nillable = true)
    protected List<AirspaceGeometryComponentPropertyType> geometryComponent;
    @XmlElement(nillable = true)
    protected List<AirspaceActivationPropertyType> activation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AirspaceExtensionType> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirspaceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirspaceType> value) {
        this.type = value;
    }

    @Transient
    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeAirspaceDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeAirspaceDesignatorType> value) {
        this.designator = value;
    }

    @Transient
    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the localType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getLocalType() {
        return localType;
    }

    /**
     * Sets the value of the localType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setLocalType(JAXBElement<TextNameType> value) {
        this.localType = value;
    }

    @Transient
    public boolean isSetLocalType() {
        return (this.localType!= null);
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
     * Gets the value of the designatorICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getDesignatorICAO() {
        return designatorICAO;
    }

    /**
     * Sets the value of the designatorICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDesignatorICAO(JAXBElement<CodeYesNoType> value) {
        this.designatorICAO = value;
    }

    @Transient
    public boolean isSetDesignatorICAO() {
        return (this.designatorICAO!= null);
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeMilitaryOperationsType> getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public void setControlType(JAXBElement<CodeMilitaryOperationsType> value) {
        this.controlType = value;
    }

    @Transient
    public boolean isSetControlType() {
        return (this.controlType!= null);
    }

    /**
     * Gets the value of the upperLowerSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValFLType> getUpperLowerSeparation() {
        return upperLowerSeparation;
    }

    /**
     * Sets the value of the upperLowerSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public void setUpperLowerSeparation(JAXBElement<ValFLType> value) {
        this.upperLowerSeparation = value;
    }

    @Transient
    public boolean isSetUpperLowerSeparation() {
        return (this.upperLowerSeparation!= null);
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceLayerClassPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspaceLayerClassPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "class_airspace_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "class", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspacepropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspaceLayerClassPropertyType> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<>();
        }
        return this.clazz;
    }

    /**
     * 
     * 
     */
    public void setClazz(List<AirspaceLayerClassPropertyType> clazz) {
        this.clazz = clazz;
    }

    @Transient
    public boolean isSetClazz() {
        return ((this.clazz!= null)&&(!this.clazz.isEmpty()));
    }

    public void unsetClazz() {
        this.clazz = null;
    }

    /**
     * Gets the value of the protectedRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePropertyType> getProtectedRoute() {
        return protectedRoute;
    }

    /**
     * Sets the value of the protectedRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setProtectedRoute(JAXBElement<RoutePropertyType> value) {
        this.protectedRoute = value;
    }

    @Transient
    public boolean isSetProtectedRoute() {
        return (this.protectedRoute!= null);
    }

    /**
     * Gets the value of the geometryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceGeometryComponentPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspaceGeometryComponentPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "geometrycomponent_airspace_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "geometrycomponent", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspacepropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspaceGeometryComponentPropertyType> getGeometryComponent() {
        if (geometryComponent == null) {
            geometryComponent = new ArrayList<>();
        }
        return this.geometryComponent;
    }

    /**
     * 
     * 
     */
    public void setGeometryComponent(List<AirspaceGeometryComponentPropertyType> geometryComponent) {
        this.geometryComponent = geometryComponent;
    }

    @Transient
    public boolean isSetGeometryComponent() {
        return ((this.geometryComponent!= null)&&(!this.geometryComponent.isEmpty()));
    }

    public void unsetGeometryComponent() {
        this.geometryComponent = null;
    }

    /**
     * Gets the value of the activation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceActivationPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspaceActivationPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "activation_airspace_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "activation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspacepropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspaceActivationPropertyType> getActivation() {
        if (activation == null) {
            activation = new ArrayList<>();
        }
        return this.activation;
    }

    /**
     * 
     * 
     */
    public void setActivation(List<AirspaceActivationPropertyType> activation) {
        this.activation = activation;
    }

    @Transient
    public boolean isSetActivation() {
        return ((this.activation!= null)&&(!this.activation.isEmpty()));
    }

    public void unsetActivation() {
        this.activation = null;
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
    @JoinTable(name = "annotation_airspace_link", schema = "airspace", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "airspacepropertygroup", referencedColumnName = "hjid")
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
     * {@link AirspaceExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = AirspaceExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_AIRSPACE_TIME_SLIC_0")
    public List<AirspaceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<AirspaceExtensionType> extension) {
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
    public CodeAirspaceType getTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirspaceType.class, this.getType());
    }

    public void setTypeItem(CodeAirspaceType target) {
        setType(XmlAdapterUtils.marshallJAXBElement(CodeAirspaceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "type"), AirspaceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designator")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designator_nilreason"))
    })
    public CodeAirspaceDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(CodeAirspaceDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(CodeAirspaceDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(CodeAirspaceDesignatorType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designator"), AirspaceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "localtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "localtype_nilreason"))
    })
    public TextNameType getLocalTypeItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getLocalType());
    }

    public void setLocalTypeItem(TextNameType target) {
        setLocalType(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "localType"), AirspaceTimeSliceType.class, target));
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
        setAixmName(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "name"), AirspaceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatoricao")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatoricao_nilreason"))
    })
    public CodeYesNoType getDesignatorICAOItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDesignatorICAO());
    }

    public void setDesignatorICAOItem(CodeYesNoType target) {
        setDesignatorICAO(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorICAO"), AirspaceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "controltype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "controltype_nilreason"))
    })
    public CodeMilitaryOperationsType getControlTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeMilitaryOperationsType.class, this.getControlType());
    }

    public void setControlTypeItem(CodeMilitaryOperationsType target) {
        setControlType(XmlAdapterUtils.marshallJAXBElement(CodeMilitaryOperationsType.class, new QName("http://www.aixm.aero/schema/5.1.1", "controlType"), AirspaceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlowerseparation")),
        @AttributeOverride(name = "uom", column = @Column(name = "upperlowerseparation_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlowerseparation_nilreason"))
    })
    public ValFLType getUpperLowerSeparationItem() {
        return XmlAdapterUtils.unmarshallSource(ValFLType.class, this.getUpperLowerSeparation());
    }

    public void setUpperLowerSeparationItem(ValFLType target) {
        setUpperLowerSeparation(XmlAdapterUtils.marshallJAXBElement(ValFLType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLowerSeparation"), AirspaceTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RoutePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "protectedroute_id", referencedColumnName = "hjid")
    public RoutePropertyType getProtectedRouteItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePropertyType.class, this.getProtectedRoute());
    }

    public void setProtectedRouteItem(RoutePropertyType target) {
        setProtectedRoute(XmlAdapterUtils.marshallJAXBElement(RoutePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "protectedRoute"), AirspaceTimeSliceType.class, target));
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
        final AirspaceTimeSliceType that = ((AirspaceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<AirspaceExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<AirspaceExtensionType> rhsField;
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
            boolean lhsFieldIsSet = this.isSetControlType();
            boolean rhsFieldIsSet = that.isSetControlType();
            JAXBElement<CodeMilitaryOperationsType> lhsField;
            lhsField = this.getControlType();
            JAXBElement<CodeMilitaryOperationsType> rhsField;
            rhsField = that.getControlType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "controlType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "controlType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignator();
            boolean rhsFieldIsSet = that.isSetDesignator();
            JAXBElement<CodeAirspaceDesignatorType> lhsField;
            lhsField = this.getDesignator();
            JAXBElement<CodeAirspaceDesignatorType> rhsField;
            rhsField = that.getDesignator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designator", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetProtectedRoute();
            boolean rhsFieldIsSet = that.isSetProtectedRoute();
            JAXBElement<RoutePropertyType> lhsField;
            lhsField = this.getProtectedRoute();
            JAXBElement<RoutePropertyType> rhsField;
            rhsField = that.getProtectedRoute();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "protectedRoute", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "protectedRoute", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorICAO();
            boolean rhsFieldIsSet = that.isSetDesignatorICAO();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getDesignatorICAO();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getDesignatorICAO();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorICAO", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorICAO", rhsField);
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
            boolean lhsFieldIsSet = this.isSetLocalType();
            boolean rhsFieldIsSet = that.isSetLocalType();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getLocalType();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getLocalType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "localType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "localType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGeometryComponent();
            boolean rhsFieldIsSet = that.isSetGeometryComponent();
            List<AirspaceGeometryComponentPropertyType> lhsField;
            lhsField = (this.isSetGeometryComponent()?this.getGeometryComponent():null);
            List<AirspaceGeometryComponentPropertyType> rhsField;
            rhsField = (that.isSetGeometryComponent()?that.getGeometryComponent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometryComponent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometryComponent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpperLowerSeparation();
            boolean rhsFieldIsSet = that.isSetUpperLowerSeparation();
            JAXBElement<ValFLType> lhsField;
            lhsField = this.getUpperLowerSeparation();
            JAXBElement<ValFLType> rhsField;
            rhsField = that.getUpperLowerSeparation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLowerSeparation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLowerSeparation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClazz();
            boolean rhsFieldIsSet = that.isSetClazz();
            List<AirspaceLayerClassPropertyType> lhsField;
            lhsField = (this.isSetClazz()?this.getClazz():null);
            List<AirspaceLayerClassPropertyType> rhsField;
            rhsField = (that.isSetClazz()?that.getClazz():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "clazz", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "clazz", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            JAXBElement<CodeAirspaceType> lhsField;
            lhsField = this.getType();
            JAXBElement<CodeAirspaceType> rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetActivation();
            boolean rhsFieldIsSet = that.isSetActivation();
            List<AirspaceActivationPropertyType> lhsField;
            lhsField = (this.isSetActivation()?this.getActivation():null);
            List<AirspaceActivationPropertyType> rhsField;
            rhsField = (that.isSetActivation()?that.getActivation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "activation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "activation", rhsField);
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
            JAXBElement<CodeAirspaceType> theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeAirspaceDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocalType();
            JAXBElement<TextNameType> theField;
            theField = this.getLocalType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "localType", theField);
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
            boolean theFieldIsSet = this.isSetDesignatorICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDesignatorICAO();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorICAO", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlType();
            JAXBElement<CodeMilitaryOperationsType> theField;
            theField = this.getControlType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "controlType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLowerSeparation();
            JAXBElement<ValFLType> theField;
            theField = this.getUpperLowerSeparation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLowerSeparation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClazz();
            List<AirspaceLayerClassPropertyType> theField;
            theField = (this.isSetClazz()?this.getClazz():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "clazz", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtectedRoute();
            JAXBElement<RoutePropertyType> theField;
            theField = this.getProtectedRoute();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "protectedRoute", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeometryComponent();
            List<AirspaceGeometryComponentPropertyType> theField;
            theField = (this.isSetGeometryComponent()?this.getGeometryComponent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometryComponent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivation();
            List<AirspaceActivationPropertyType> theField;
            theField = (this.isSetActivation()?this.getActivation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "activation", theField);
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
            List<AirspaceExtensionType> theField;
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
            JAXBElement<CodeAirspaceType> theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<CodeAirspaceDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLocalType();
            JAXBElement<TextNameType> theField;
            theField = this.getLocalType();
            strategy.appendField(locator, this, "localType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAixmName();
            JAXBElement<TextNameType> theField;
            theField = this.getAixmName();
            strategy.appendField(locator, this, "aixmName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorICAO();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDesignatorICAO();
            strategy.appendField(locator, this, "designatorICAO", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetControlType();
            JAXBElement<CodeMilitaryOperationsType> theField;
            theField = this.getControlType();
            strategy.appendField(locator, this, "controlType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLowerSeparation();
            JAXBElement<ValFLType> theField;
            theField = this.getUpperLowerSeparation();
            strategy.appendField(locator, this, "upperLowerSeparation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClazz();
            List<AirspaceLayerClassPropertyType> theField;
            theField = (this.isSetClazz()?this.getClazz():null);
            strategy.appendField(locator, this, "clazz", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProtectedRoute();
            JAXBElement<RoutePropertyType> theField;
            theField = this.getProtectedRoute();
            strategy.appendField(locator, this, "protectedRoute", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGeometryComponent();
            List<AirspaceGeometryComponentPropertyType> theField;
            theField = (this.isSetGeometryComponent()?this.getGeometryComponent():null);
            strategy.appendField(locator, this, "geometryComponent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetActivation();
            List<AirspaceActivationPropertyType> theField;
            theField = (this.isSetActivation()?this.getActivation():null);
            strategy.appendField(locator, this, "activation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<AirspaceExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
