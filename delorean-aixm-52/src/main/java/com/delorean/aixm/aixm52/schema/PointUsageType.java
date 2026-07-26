
package com.delorean.aixm.aixm52.schema;

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
 * <p>Java class for PointUsageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PointUsageType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractPropertiesWithScheduleType">
 *       <sequence>
 *         <element name="timeInterval" type="{http://www.aixm.aero/schema/5.2}TimesheetPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="specialDateAuthority" type="{http://www.aixm.aero/schema/5.2}OrganisationAuthorityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="role" type="{http://www.aixm.aero/schema/5.2}CodePointUsageType" minOccurs="0"/>
 *         <element name="reportingATC" type="{http://www.aixm.aero/schema/5.2}CodeATCReportingType" minOccurs="0"/>
 *         <element name="cardinalDirection" type="{http://www.aixm.aero/schema/5.2}CodeCardinalDirectionType" minOccurs="0"/>
 *         <element name="levels" type="{http://www.aixm.aero/schema/5.2}AirspaceLayerPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="referenceAirportHeliport" type="{http://www.aixm.aero/schema/5.2}AirportHeliportPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractPropertiesWithScheduleExtension"/>
 *                   <element ref="{http://www.aixm.aero/schema/5.2}AbstractPointUsageExtension"/>
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
@XmlType(name = "PointUsageType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "role",
    "reportingATC",
    "cardinalDirection",
    "levels",
    "referenceAirportHeliport",
    "extension"
})
@Entity(name = "PointUsageType")
@Table(name = "pointusage_o", schema = "navaids_point")
public class PointUsageType
    extends AbstractPropertiesWithScheduleType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePointUsageType> role;
    @XmlElementRef(name = "reportingATC", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeATCReportingType> reportingATC;
    @XmlElementRef(name = "cardinalDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> cardinalDirection;
    @XmlElement(nillable = true)
    protected List<AirspaceLayerPropertyType> levels;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> referenceAirportHeliport;
    protected List<PointUsageExtensionType> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = TimesheetPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "pntusgtp_tmintrvl_l", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "pointusage_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "timeinterval_hjid", referencedColumnName = "hjid")
    })
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
        return ((this.timeInterval!= null)&&(!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
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
    @JoinTable(name = "pntusgtp_annttn_l", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "pointusage_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "annotation_hjid", referencedColumnName = "hjid")
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
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
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
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "pntusgtp_spcldtathrt_l", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "pointusage_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "specialdateauthority_hjid", referencedColumnName = "hjid")
    })
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
        return ((this.specialDateAuthority!= null)&&(!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePointUsageType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodePointUsageType> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePointUsageType }{@code >}
     *     
     */
    public void setRole(JAXBElement<CodePointUsageType> value) {
        this.role = value;
    }

    @Transient
    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the reportingATC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeATCReportingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeATCReportingType> getReportingATC() {
        return reportingATC;
    }

    /**
     * Sets the value of the reportingATC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeATCReportingType }{@code >}
     *     
     */
    public void setReportingATC(JAXBElement<CodeATCReportingType> value) {
        this.reportingATC = value;
    }

    @Transient
    public boolean isSetReportingATC() {
        return (this.reportingATC!= null);
    }

    /**
     * Gets the value of the cardinalDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeCardinalDirectionType> getCardinalDirection() {
        return cardinalDirection;
    }

    /**
     * Sets the value of the cardinalDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setCardinalDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.cardinalDirection = value;
    }

    @Transient
    public boolean isSetCardinalDirection() {
        return (this.cardinalDirection!= null);
    }

    /**
     * Gets the value of the levels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceLayerPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = AirspaceLayerPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "pntusgtp_lvls_l", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "pointusage_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "levels_hjid", referencedColumnName = "hjid")
    })
    public List<AirspaceLayerPropertyType> getLevels() {
        if (levels == null) {
            levels = new ArrayList<>();
        }
        return this.levels;
    }

    /**
     * 
     * 
     */
    public void setLevels(List<AirspaceLayerPropertyType> levels) {
        this.levels = levels;
    }

    @Transient
    public boolean isSetLevels() {
        return ((this.levels!= null)&&(!this.levels.isEmpty()));
    }

    public void unsetLevels() {
        this.levels = null;
    }

    /**
     * Gets the value of the referenceAirportHeliport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceAirportHeliport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceAirportHeliport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    @OneToMany(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "pntusgtp_rfrncarprthlprt_l", schema = "navaids_point", joinColumns = {
        @JoinColumn(name = "pointusage_o_hjid", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "referenceairportheliport_hjid", referencedColumnName = "hjid")
    })
    public List<AirportHeliportPropertyType> getReferenceAirportHeliport() {
        if (referenceAirportHeliport == null) {
            referenceAirportHeliport = new ArrayList<>();
        }
        return this.referenceAirportHeliport;
    }

    /**
     * 
     * 
     */
    public void setReferenceAirportHeliport(List<AirportHeliportPropertyType> referenceAirportHeliport) {
        this.referenceAirportHeliport = referenceAirportHeliport;
    }

    @Transient
    public boolean isSetReferenceAirportHeliport() {
        return ((this.referenceAirportHeliport!= null)&&(!this.referenceAirportHeliport.isEmpty()));
    }

    public void unsetReferenceAirportHeliport() {
        this.referenceAirportHeliport = null;
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
     * {@link PointUsageExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = PointUsageExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "pointusage_oe_hjid", referencedColumnName = "hjid")
    public List<PointUsageExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<PointUsageExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "role", columnDefinition = "codepointusagebase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "rolenilreason", columnDefinition = "nilreason"))
    })
    public CodePointUsageType getRoleItem() {
        return XmlAdapterUtils.unmarshallSource(CodePointUsageType.class, this.getRole());
    }

    public void setRoleItem(CodePointUsageType target) {
        setRole(XmlAdapterUtils.marshallJAXBElement(CodePointUsageType.class, new QName("http://www.aixm.aero/schema/5.2", "role"), PointUsageType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "reportingatc", columnDefinition = "codeatcreportingbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "reportingatcnilreason", columnDefinition = "nilreason"))
    })
    public CodeATCReportingType getReportingATCItem() {
        return XmlAdapterUtils.unmarshallSource(CodeATCReportingType.class, this.getReportingATC());
    }

    public void setReportingATCItem(CodeATCReportingType target) {
        setReportingATC(XmlAdapterUtils.marshallJAXBElement(CodeATCReportingType.class, new QName("http://www.aixm.aero/schema/5.2", "reportingATC"), PointUsageType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "cardinaldirection", columnDefinition = "codecardinaldirectionbase")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "cardinaldirectionnilreason", columnDefinition = "nilreason"))
    })
    public CodeCardinalDirectionType getCardinalDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCardinalDirectionType.class, this.getCardinalDirection());
    }

    public void setCardinalDirectionItem(CodeCardinalDirectionType target) {
        setCardinalDirection(XmlAdapterUtils.marshallJAXBElement(CodeCardinalDirectionType.class, new QName("http://www.aixm.aero/schema/5.2", "cardinalDirection"), PointUsageType.class, target));
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
        final PointUsageType that = ((PointUsageType) object);
        {
            boolean lhsFieldIsSet = this.isSetTimeInterval();
            boolean rhsFieldIsSet = that.isSetTimeInterval();
            List<TimesheetPropertyType> lhsField;
            lhsField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            List<TimesheetPropertyType> rhsField;
            rhsField = (that.isSetTimeInterval()?that.getTimeInterval():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeInterval", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeInterval", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<PointUsageExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<PointUsageExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRole();
            boolean rhsFieldIsSet = that.isSetRole();
            JAXBElement<CodePointUsageType> lhsField;
            lhsField = this.getRole();
            JAXBElement<CodePointUsageType> rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCardinalDirection();
            boolean rhsFieldIsSet = that.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> lhsField;
            lhsField = this.getCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> rhsField;
            rhsField = that.getCardinalDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "cardinalDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "cardinalDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLevels();
            boolean rhsFieldIsSet = that.isSetLevels();
            List<AirspaceLayerPropertyType> lhsField;
            lhsField = (this.isSetLevels()?this.getLevels():null);
            List<AirspaceLayerPropertyType> rhsField;
            rhsField = (that.isSetLevels()?that.getLevels():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "levels", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "levels", rhsField);
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
            boolean lhsFieldIsSet = this.isSetReferenceAirportHeliport();
            boolean rhsFieldIsSet = that.isSetReferenceAirportHeliport();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetReferenceAirportHeliport()?this.getReferenceAirportHeliport():null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetReferenceAirportHeliport()?that.getReferenceAirportHeliport():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referenceAirportHeliport", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referenceAirportHeliport", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReportingATC();
            boolean rhsFieldIsSet = that.isSetReportingATC();
            JAXBElement<CodeATCReportingType> lhsField;
            lhsField = this.getReportingATC();
            JAXBElement<CodeATCReportingType> rhsField;
            rhsField = that.getReportingATC();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reportingATC", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reportingATC", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecialDateAuthority();
            boolean rhsFieldIsSet = that.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> lhsField;
            lhsField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            List<OrganisationAuthorityPropertyType> rhsField;
            rhsField = (that.isSetSpecialDateAuthority()?that.getSpecialDateAuthority():null);
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
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeInterval", theField);
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
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specialDateAuthority", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRole();
            JAXBElement<CodePointUsageType> theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReportingATC();
            JAXBElement<CodeATCReportingType> theField;
            theField = this.getReportingATC();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reportingATC", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getCardinalDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "cardinalDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevels();
            List<AirspaceLayerPropertyType> theField;
            theField = (this.isSetLevels()?this.getLevels():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "levels", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetReferenceAirportHeliport()?this.getReferenceAirportHeliport():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referenceAirportHeliport", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PointUsageExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTimeInterval();
            List<TimesheetPropertyType> theField;
            theField = (this.isSetTimeInterval()?this.getTimeInterval():null);
            strategy.appendField(locator, this, "timeInterval", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecialDateAuthority();
            List<OrganisationAuthorityPropertyType> theField;
            theField = (this.isSetSpecialDateAuthority()?this.getSpecialDateAuthority():null);
            strategy.appendField(locator, this, "specialDateAuthority", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRole();
            JAXBElement<CodePointUsageType> theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReportingATC();
            JAXBElement<CodeATCReportingType> theField;
            theField = this.getReportingATC();
            strategy.appendField(locator, this, "reportingATC", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getCardinalDirection();
            strategy.appendField(locator, this, "cardinalDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevels();
            List<AirspaceLayerPropertyType> theField;
            theField = (this.isSetLevels()?this.getLevels():null);
            strategy.appendField(locator, this, "levels", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferenceAirportHeliport();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetReferenceAirportHeliport()?this.getReferenceAirportHeliport():null);
            strategy.appendField(locator, this, "referenceAirportHeliport", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<PointUsageExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
