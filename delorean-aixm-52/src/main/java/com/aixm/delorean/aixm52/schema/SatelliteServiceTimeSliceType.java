
package com.aixm.delorean.aixm52.schema;

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
 * Java class for SatelliteServiceTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="SatelliteServiceTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="serviceType" type=
"{http://www.aixm.aero/schema/5.2}CodeSatelliteNavigationServiceType" minOccurs=
"0"/>
 *         <element name="satelliteSystem" type=
"{http://www.aixm.aero/schema/5.2}SatelliteSystemPropertyType" minOccurs="0"/>
 *         <element name="serviceArea" type=
"{http://www.aixm.aero/schema/5.2}SatelliteServiceAreaPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="approachLocation" type=
"{http://www.aixm.aero/schema/5.2}SatelliteApproachOperationPropertyType" maxOccurs
="unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractSatelliteServiceExtension"/>
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
@XmlType(name = "SatelliteServiceTimeSliceType", propOrder = {"serviceType", "satelliteSystem", "serviceArea",
        "approachLocation", "annotation", "extension"})
@Entity(name = "SatelliteServiceTimeSliceType")
@Table(name = "satelliteservice_t", schema = "navaids_point")
public class SatelliteServiceTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "serviceType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSatelliteNavigationServiceType> serviceType;
    @XmlElementRef(name = "satelliteSystem", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SatelliteSystemPropertyType> satelliteSystem;
    @XmlElement(nillable = true)
    protected List<SatelliteServiceAreaPropertyType> serviceArea;
    @XmlElement(nillable = true)
    protected List<SatelliteApproachOperationPropertyType> approachLocation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SatelliteServiceExtensionType> extension;

    /**
     * Gets the value of the serviceType property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeSatelliteNavigationServiceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeSatelliteNavigationServiceType> getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeSatelliteNavigationServiceType }{@code >}
     *
     */
    public void setServiceType(JAXBElement<CodeSatelliteNavigationServiceType> value) {
        this.serviceType = value;
    }

    @Transient
    public boolean isSetServiceType() {
        return (this.serviceType != null);
    }

    /**
     * Gets the value of the satelliteSystem property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link SatelliteSystemPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<SatelliteSystemPropertyType> getSatelliteSystem() {
        return satelliteSystem;
    }

    /**
     * Sets the value of the satelliteSystem property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link SatelliteSystemPropertyType }{@code >}
     *
     */
    public void setSatelliteSystem(JAXBElement<SatelliteSystemPropertyType> value) {
        this.satelliteSystem = value;
    }

    @Transient
    public boolean isSetSatelliteSystem() {
        return (this.satelliteSystem != null);
    }

    /**
     * Gets the value of the serviceArea property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the serviceArea property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getServiceArea().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SatelliteServiceAreaPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteServiceAreaPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvctmslctp_srvcar_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "servicearea_hjid", referencedColumnName = "hjid")})
    public List<SatelliteServiceAreaPropertyType> getServiceArea() {
        if (serviceArea == null) {
            serviceArea = new ArrayList<>();
        }
        return this.serviceArea;
    }

    /**
     *
     *
     */
    public void setServiceArea(List<SatelliteServiceAreaPropertyType> serviceArea) {
        this.serviceArea = serviceArea;
    }

    @Transient
    public boolean isSetServiceArea() {
        return ((this.serviceArea != null) && (!this.serviceArea.isEmpty()));
    }

    public void unsetServiceArea() {
        this.serviceArea = null;
    }

    /**
     * Gets the value of the approachLocation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the approachLocation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getApproachLocation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SatelliteApproachOperationPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteApproachOperationPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvctmslctp_apprchlctn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "approachlocation_hjid", referencedColumnName = "hjid")})
    public List<SatelliteApproachOperationPropertyType> getApproachLocation() {
        if (approachLocation == null) {
            approachLocation = new ArrayList<>();
        }
        return this.approachLocation;
    }

    /**
     *
     *
     */
    public void setApproachLocation(List<SatelliteApproachOperationPropertyType> approachLocation) {
        this.approachLocation = approachLocation;
    }

    @Transient
    public boolean isSetApproachLocation() {
        return ((this.approachLocation != null) && (!this.approachLocation.isEmpty()));
    }

    public void unsetApproachLocation() {
        this.approachLocation = null;
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
    @JoinTable(name = "stlltsrvctmslctp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link SatelliteServiceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteServiceExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "satelliteservicee_hjid", referencedColumnName = "hjid")
    public List<SatelliteServiceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<SatelliteServiceExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "servicetype")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "servicetypenilreason"))})
    public CodeSatelliteNavigationServiceType getServiceTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSatelliteNavigationServiceType.class, this.getServiceType());
    }

    public void setServiceTypeItem(CodeSatelliteNavigationServiceType target) {
        setServiceType(XmlAdapterUtils.marshallJAXBElement(CodeSatelliteNavigationServiceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "serviceType"), SatelliteServiceTimeSliceType.class,
                target));
    }

    @OneToOne(targetEntity = SatelliteSystemPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvctmslctp_stlltsstm_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservice_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "satellitesystem_hjid", referencedColumnName = "hjid")})
    public SatelliteSystemPropertyType getSatelliteSystemItem() {
        return XmlAdapterUtils.unmarshallSource(SatelliteSystemPropertyType.class, this.getSatelliteSystem());
    }

    public void setSatelliteSystemItem(SatelliteSystemPropertyType target) {
        setSatelliteSystem(XmlAdapterUtils.marshallJAXBElement(SatelliteSystemPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "satelliteSystem"), SatelliteServiceTimeSliceType.class,
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
        final SatelliteServiceTimeSliceType that = ((SatelliteServiceTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SatelliteServiceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<SatelliteServiceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServiceType();
            boolean rhsFieldIsSet = that.isSetServiceType();
            JAXBElement<CodeSatelliteNavigationServiceType> lhsField;
            lhsField = this.getServiceType();
            JAXBElement<CodeSatelliteNavigationServiceType> rhsField;
            rhsField = that.getServiceType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serviceType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serviceType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetApproachLocation();
            boolean rhsFieldIsSet = that.isSetApproachLocation();
            List<SatelliteApproachOperationPropertyType> lhsField;
            lhsField = (this.isSetApproachLocation() ? this.getApproachLocation() : null);
            List<SatelliteApproachOperationPropertyType> rhsField;
            rhsField = (that.isSetApproachLocation() ? that.getApproachLocation() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "approachLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "approachLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSatelliteSystem();
            boolean rhsFieldIsSet = that.isSetSatelliteSystem();
            JAXBElement<SatelliteSystemPropertyType> lhsField;
            lhsField = this.getSatelliteSystem();
            JAXBElement<SatelliteSystemPropertyType> rhsField;
            rhsField = that.getSatelliteSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "satelliteSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "satelliteSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetServiceArea();
            boolean rhsFieldIsSet = that.isSetServiceArea();
            List<SatelliteServiceAreaPropertyType> lhsField;
            lhsField = (this.isSetServiceArea() ? this.getServiceArea() : null);
            List<SatelliteServiceAreaPropertyType> rhsField;
            rhsField = (that.isSetServiceArea() ? that.getServiceArea() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "serviceArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "serviceArea", rhsField);
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
            boolean theFieldIsSet = this.isSetServiceType();
            JAXBElement<CodeSatelliteNavigationServiceType> theField;
            theField = this.getServiceType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serviceType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSatelliteSystem();
            JAXBElement<SatelliteSystemPropertyType> theField;
            theField = this.getSatelliteSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "satelliteSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceArea();
            List<SatelliteServiceAreaPropertyType> theField;
            theField = (this.isSetServiceArea() ? this.getServiceArea() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "serviceArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachLocation();
            List<SatelliteApproachOperationPropertyType> theField;
            theField = (this.isSetApproachLocation() ? this.getApproachLocation() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "approachLocation", theField);
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
            boolean theFieldIsSet = this.isSetExtension();
            List<SatelliteServiceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetServiceType();
            JAXBElement<CodeSatelliteNavigationServiceType> theField;
            theField = this.getServiceType();
            strategy.appendField(locator, this, "serviceType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSatelliteSystem();
            JAXBElement<SatelliteSystemPropertyType> theField;
            theField = this.getSatelliteSystem();
            strategy.appendField(locator, this, "satelliteSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetServiceArea();
            List<SatelliteServiceAreaPropertyType> theField;
            theField = (this.isSetServiceArea() ? this.getServiceArea() : null);
            strategy.appendField(locator, this, "serviceArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApproachLocation();
            List<SatelliteApproachOperationPropertyType> theField;
            theField = (this.isSetApproachLocation() ? this.getApproachLocation() : null);
            strategy.appendField(locator, this, "approachLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SatelliteServiceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
