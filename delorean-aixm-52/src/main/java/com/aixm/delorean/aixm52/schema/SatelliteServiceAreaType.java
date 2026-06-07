
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
 * Java class for SatelliteServiceAreaType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="SatelliteServiceAreaType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractPropertiesWithScheduleType">
 *       <sequence>
 *         <element name="timeInterval" type=
"{http://www.aixm.aero/schema/5.2}TimesheetPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="specialDateAuthority" type=
"{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="operationalStatus" type=
"{http://www.aixm.aero/schema/5.2}CodeStatusNavaidType" minOccurs="0"/>
 *         <element name="country" type=
"{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="area" type=
"{http://www.aixm.aero/schema/5.2}SurfacePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractPropertiesWithScheduleExtension"/>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractSatelliteServiceAreaExtension"/>
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
@XmlType(name = "SatelliteServiceAreaType", propOrder = {"timeInterval", "annotation", "specialDateAuthority",
        "operationalStatus", "country", "area", "extension"})
@Entity(name = "SatelliteServiceAreaType")
@Table(name = "satelliteservicearea_o", schema = "navaids_point")
public class SatelliteServiceAreaType extends AbstractPropertiesWithScheduleType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "operationalStatus", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusNavaidType> operationalStatus;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> country;
    @XmlElement(nillable = true)
    protected List<AIXMSurfacePropertyType> area;
    protected List<SatelliteServiceAreaExtensionType> extension;

    /**
     * Gets the value of the timeInterval property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the timeInterval property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getTimeInterval().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = TimesheetPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvcartp_tmintrvl_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservicearea_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "timeinterval_hjid", referencedColumnName = "hjid")})
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<>();
        }
        return this.timeInterval;
    }

    /**
     *
     *
     */
    public void setTimeInterval(List<TimesheetPropertyType> timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Transient
    public boolean isSetTimeInterval() {
        return ((this.timeInterval != null) && (!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
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
    @JoinTable(name = "stlltsrvcartp_annttn_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservicearea_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * Gets the value of the specialDateAuthority property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the specialDateAuthority property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSpecialDateAuthority().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvcartp_spcldtathrt_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservicearea_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "specialdateauthority_hjid", referencedColumnName = "hjid")})
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<>();
        }
        return this.specialDateAuthority;
    }

    /**
     *
     *
     */
    public void setSpecialDateAuthority(List<OrganisationAuthorityPropertyType> specialDateAuthority) {
        this.specialDateAuthority = specialDateAuthority;
    }

    @Transient
    public boolean isSetSpecialDateAuthority() {
        return ((this.specialDateAuthority != null) && (!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the operationalStatus property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeStatusNavaidType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeStatusNavaidType> getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeStatusNavaidType }{@code >}
     *
     */
    public void setOperationalStatus(JAXBElement<CodeStatusNavaidType> value) {
        this.operationalStatus = value;
    }

    @Transient
    public boolean isSetOperationalStatus() {
        return (this.operationalStatus != null);
    }

    /**
     * Gets the value of the country property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the country property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getCountry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = OrganisationAuthorityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvcartp_cntr_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservicearea_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "country_hjid", referencedColumnName = "hjid")})
    public List<OrganisationAuthorityPropertyType> getCountry() {
        if (country == null) {
            country = new ArrayList<>();
        }
        return this.country;
    }

    /**
     *
     *
     */
    public void setCountry(List<OrganisationAuthorityPropertyType> country) {
        this.country = country;
    }

    @Transient
    public boolean isSetCountry() {
        return ((this.country != null) && (!this.country.isEmpty()));
    }

    public void unsetCountry() {
        this.country = null;
    }

    /**
     * Gets the value of the area property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the area property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getArea().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIXMSurfacePropertyType }
     *
     *
     */
    @OneToMany(targetEntity = AIXMSurfacePropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "stlltsrvcartp_ar_link", schema = "navaids_point", joinColumns = {
            @JoinColumn(name = "satelliteservicearea_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "area_hjid", referencedColumnName = "hjid")})
    public List<AIXMSurfacePropertyType> getArea() {
        if (area == null) {
            area = new ArrayList<>();
        }
        return this.area;
    }

    /**
     *
     *
     */
    public void setArea(List<AIXMSurfacePropertyType> area) {
        this.area = area;
    }

    @Transient
    public boolean isSetArea() {
        return ((this.area != null) && (!this.area.isEmpty()));
    }

    public void unsetArea() {
        this.area = null;
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
     * {@link SatelliteServiceAreaExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = SatelliteServiceAreaExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "satelliteservicearea_oe_hjid", referencedColumnName = "hjid")
    public List<SatelliteServiceAreaExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<SatelliteServiceAreaExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "operationalstatus")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "operationalstatusnilreason"))})
    public CodeStatusNavaidType getOperationalStatusItem() {
        return XmlAdapterUtils.unmarshallSource(CodeStatusNavaidType.class, this.getOperationalStatus());
    }

    public void setOperationalStatusItem(CodeStatusNavaidType target) {
        setOperationalStatus(XmlAdapterUtils.marshallJAXBElement(CodeStatusNavaidType.class,
                new QName("http://www.aixm.aero/schema/5.2", "operationalStatus"), SatelliteServiceAreaType.class,
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
        final SatelliteServiceAreaType that = ((SatelliteServiceAreaType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SatelliteServiceAreaExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<SatelliteServiceAreaExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetArea();
            boolean rhsFieldIsSet = that.isSetArea();
            List<AIXMSurfacePropertyType> lhsField;
            lhsField = (this.isSetArea() ? this.getArea() : null);
            List<AIXMSurfacePropertyType> rhsField;
            rhsField = (that.isSetArea() ? that.getArea() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "area", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "area", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCountry();
            boolean rhsFieldIsSet = that.isSetCountry();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetCountry() ? this.getCountry() : null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetCountry() ? that.getCountry() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "country", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "country", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOperationalStatus();
            boolean rhsFieldIsSet = that.isSetOperationalStatus();
            JAXBElement<CodeStatusNavaidType> lhsField;
            lhsField = this.getOperationalStatus();
            JAXBElement<CodeStatusNavaidType> rhsField;
            rhsField = that.getOperationalStatus();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operationalStatus", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operationalStatus", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTimeInterval();
            boolean rhsFieldIsSet = that.isSetTimeInterval();
            List<TimesheetPropertyType> lhsField;
            lhsField = (this.isSetTimeInterval() ? this.getTimeInterval() : null);
            List<TimesheetPropertyType> rhsField;
            rhsField = (that.isSetTimeInterval() ? that.getTimeInterval() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeInterval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeInterval", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialDateAuthority();
            boolean rhsFieldIsSet = that.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetSpecialDateAuthority() ? this.getSpecialDateAuthority() : null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetSpecialDateAuthority() ? that.getSpecialDateAuthority() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specialDateAuthority", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specialDateAuthority", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval() ? this.getTimeInterval() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeInterval", theField);
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
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority() ? this.getSpecialDateAuthority() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialDateAuthority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationalStatus();
            JAXBElement<CodeStatusNavaidType> theField;
            theField = this.getOperationalStatus();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operationalStatus", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCountry();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetCountry() ? this.getCountry() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "country", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArea();
            List<AIXMSurfacePropertyType> theField;
            theField = (this.isSetArea() ? this.getArea() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "area", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SatelliteServiceAreaExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval() ? this.getTimeInterval() : null);
            strategy.appendField(locator, this, "timeInterval", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority() ? this.getSpecialDateAuthority() : null);
            strategy.appendField(locator, this, "specialDateAuthority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationalStatus();
            JAXBElement<CodeStatusNavaidType> theField;
            theField = this.getOperationalStatus();
            strategy.appendField(locator, this, "operationalStatus", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCountry();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetCountry() ? this.getCountry() : null);
            strategy.appendField(locator, this, "country", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetArea();
            List<AIXMSurfacePropertyType> theField;
            theField = (this.isSetArea() ? this.getArea() : null);
            strategy.appendField(locator, this, "area", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SatelliteServiceAreaExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
