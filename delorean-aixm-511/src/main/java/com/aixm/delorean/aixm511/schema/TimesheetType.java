
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
 * <p>Java class for TimesheetType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimesheetType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}TimesheetPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTimesheetExtension"/>
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
@XmlType(name = "TimesheetType", propOrder = {
    "timeReference",
    "startDate",
    "endDate",
    "day",
    "dayTil",
    "startTime",
    "startEvent",
    "startTimeRelativeEvent",
    "startEventInterpretation",
    "endTime",
    "endEvent",
    "endTimeRelativeEvent",
    "endEventInterpretation",
    "daylightSavingAdjust",
    "excluded",
    "annotation",
    "extension"
})
@Entity(name = "TimesheetType")
@Table(name = "timesheet", schema = "shared")
public class TimesheetType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "timeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeReferenceType> timeReference;
    @XmlElementRef(name = "startDate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> startDate;
    @XmlElementRef(name = "endDate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> endDate;
    @XmlElementRef(name = "day", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDayType> day;
    @XmlElementRef(name = "dayTil", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDayType> dayTil;
    @XmlElementRef(name = "startTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> startTime;
    @XmlElementRef(name = "startEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventType> startEvent;
    @XmlElementRef(name = "startTimeRelativeEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> startTimeRelativeEvent;
    @XmlElementRef(name = "startEventInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventCombinationType> startEventInterpretation;
    @XmlElementRef(name = "endTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> endTime;
    @XmlElementRef(name = "endEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventType> endEvent;
    @XmlElementRef(name = "endTimeRelativeEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> endTimeRelativeEvent;
    @XmlElementRef(name = "endEventInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventCombinationType> endEventInterpretation;
    @XmlElementRef(name = "daylightSavingAdjust", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> daylightSavingAdjust;
    @XmlElementRef(name = "excluded", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> excluded;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TimesheetTypeExtensionType> extension;

    /**
     * Gets the value of the timeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTimeReferenceType> getTimeReference() {
        return timeReference;
    }

    /**
     * Sets the value of the timeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeReferenceType }{@code >}
     *     
     */
    public void setTimeReference(JAXBElement<CodeTimeReferenceType> value) {
        this.timeReference = value;
    }

    @Transient
    public boolean isSetTimeReference() {
        return (this.timeReference!= null);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateMonthDayType> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<DateMonthDayType> value) {
        this.startDate = value;
    }

    @Transient
    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DateMonthDayType> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<DateMonthDayType> value) {
        this.endDate = value;
    }

    @Transient
    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDayType> getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public void setDay(JAXBElement<CodeDayType> value) {
        this.day = value;
    }

    @Transient
    public boolean isSetDay() {
        return (this.day!= null);
    }

    /**
     * Gets the value of the dayTil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDayType> getDayTil() {
        return dayTil;
    }

    /**
     * Sets the value of the dayTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public void setDayTil(JAXBElement<CodeDayType> value) {
        this.dayTil = value;
    }

    @Transient
    public boolean isSetDayTil() {
        return (this.dayTil!= null);
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TimeType> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<TimeType> value) {
        this.startTime = value;
    }

    @Transient
    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Gets the value of the startEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTimeEventType> getStartEvent() {
        return startEvent;
    }

    /**
     * Sets the value of the startEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public void setStartEvent(JAXBElement<CodeTimeEventType> value) {
        this.startEvent = value;
    }

    @Transient
    public boolean isSetStartEvent() {
        return (this.startEvent!= null);
    }

    /**
     * Gets the value of the startTimeRelativeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDurationType> getStartTimeRelativeEvent() {
        return startTimeRelativeEvent;
    }

    /**
     * Sets the value of the startTimeRelativeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setStartTimeRelativeEvent(JAXBElement<ValDurationType> value) {
        this.startTimeRelativeEvent = value;
    }

    @Transient
    public boolean isSetStartTimeRelativeEvent() {
        return (this.startTimeRelativeEvent!= null);
    }

    /**
     * Gets the value of the startEventInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTimeEventCombinationType> getStartEventInterpretation() {
        return startEventInterpretation;
    }

    /**
     * Sets the value of the startEventInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public void setStartEventInterpretation(JAXBElement<CodeTimeEventCombinationType> value) {
        this.startEventInterpretation = value;
    }

    @Transient
    public boolean isSetStartEventInterpretation() {
        return (this.startEventInterpretation!= null);
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TimeType> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<TimeType> value) {
        this.endTime = value;
    }

    @Transient
    public boolean isSetEndTime() {
        return (this.endTime!= null);
    }

    /**
     * Gets the value of the endEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTimeEventType> getEndEvent() {
        return endEvent;
    }

    /**
     * Sets the value of the endEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public void setEndEvent(JAXBElement<CodeTimeEventType> value) {
        this.endEvent = value;
    }

    @Transient
    public boolean isSetEndEvent() {
        return (this.endEvent!= null);
    }

    /**
     * Gets the value of the endTimeRelativeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDurationType> getEndTimeRelativeEvent() {
        return endTimeRelativeEvent;
    }

    /**
     * Sets the value of the endTimeRelativeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setEndTimeRelativeEvent(JAXBElement<ValDurationType> value) {
        this.endTimeRelativeEvent = value;
    }

    @Transient
    public boolean isSetEndTimeRelativeEvent() {
        return (this.endTimeRelativeEvent!= null);
    }

    /**
     * Gets the value of the endEventInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeTimeEventCombinationType> getEndEventInterpretation() {
        return endEventInterpretation;
    }

    /**
     * Sets the value of the endEventInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public void setEndEventInterpretation(JAXBElement<CodeTimeEventCombinationType> value) {
        this.endEventInterpretation = value;
    }

    @Transient
    public boolean isSetEndEventInterpretation() {
        return (this.endEventInterpretation!= null);
    }

    /**
     * Gets the value of the daylightSavingAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getDaylightSavingAdjust() {
        return daylightSavingAdjust;
    }

    /**
     * Sets the value of the daylightSavingAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDaylightSavingAdjust(JAXBElement<CodeYesNoType> value) {
        this.daylightSavingAdjust = value;
    }

    @Transient
    public boolean isSetDaylightSavingAdjust() {
        return (this.daylightSavingAdjust!= null);
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setExcluded(JAXBElement<CodeYesNoType> value) {
        this.excluded = value;
    }

    @Transient
    public boolean isSetExcluded() {
        return (this.excluded!= null);
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
    @JoinTable(name = "annotation_timesheet_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "timesheetpropertygroup", referencedColumnName = "hjid")
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
     * {@link TimesheetTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = TimesheetTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_TIMESHEET_TYPE_HJID")
    public List<TimesheetTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<TimesheetTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "timereference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "timereference_nilreason"))
    })
    public CodeTimeReferenceType getTimeReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTimeReferenceType.class, this.getTimeReference());
    }

    public void setTimeReferenceItem(CodeTimeReferenceType target) {
        setTimeReference(XmlAdapterUtils.marshallJAXBElement(CodeTimeReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "timeReference"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "startdate")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "startdate_nilreason"))
    })
    public DateMonthDayType getStartDateItem() {
        return XmlAdapterUtils.unmarshallSource(DateMonthDayType.class, this.getStartDate());
    }

    public void setStartDateItem(DateMonthDayType target) {
        setStartDate(XmlAdapterUtils.marshallJAXBElement(DateMonthDayType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startDate"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "enddate")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "enddate_nilreason"))
    })
    public DateMonthDayType getEndDateItem() {
        return XmlAdapterUtils.unmarshallSource(DateMonthDayType.class, this.getEndDate());
    }

    public void setEndDateItem(DateMonthDayType target) {
        setEndDate(XmlAdapterUtils.marshallJAXBElement(DateMonthDayType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endDate"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "day")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "day_nilreason"))
    })
    public CodeDayType getDayItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDayType.class, this.getDay());
    }

    public void setDayItem(CodeDayType target) {
        setDay(XmlAdapterUtils.marshallJAXBElement(CodeDayType.class, new QName("http://www.aixm.aero/schema/5.1.1", "day"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "daytil")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "daytil_nilreason"))
    })
    public CodeDayType getDayTilItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDayType.class, this.getDayTil());
    }

    public void setDayTilItem(CodeDayType target) {
        setDayTil(XmlAdapterUtils.marshallJAXBElement(CodeDayType.class, new QName("http://www.aixm.aero/schema/5.1.1", "dayTil"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "starttime")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "starttime_nilreason"))
    })
    public TimeType getStartTimeItem() {
        return XmlAdapterUtils.unmarshallSource(TimeType.class, this.getStartTime());
    }

    public void setStartTimeItem(TimeType target) {
        setStartTime(XmlAdapterUtils.marshallJAXBElement(TimeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startTime"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "startevent")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "startevent_nilreason"))
    })
    public CodeTimeEventType getStartEventItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTimeEventType.class, this.getStartEvent());
    }

    public void setStartEventItem(CodeTimeEventType target) {
        setStartEvent(XmlAdapterUtils.marshallJAXBElement(CodeTimeEventType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startEvent"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "starttimerelativeevent")),
        @AttributeOverride(name = "uom", column = @Column(name = "starttimerelativeevent_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "starttimerelativeevent_nilreason"))
    })
    public ValDurationType getStartTimeRelativeEventItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getStartTimeRelativeEvent());
    }

    public void setStartTimeRelativeEventItem(ValDurationType target) {
        setStartTimeRelativeEvent(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startTimeRelativeEvent"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "starteventinterpretation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "starteventinterpretation_nilreason"))
    })
    public CodeTimeEventCombinationType getStartEventInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTimeEventCombinationType.class, this.getStartEventInterpretation());
    }

    public void setStartEventInterpretationItem(CodeTimeEventCombinationType target) {
        setStartEventInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeTimeEventCombinationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startEventInterpretation"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "endtime")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "endtime_nilreason"))
    })
    public TimeType getEndTimeItem() {
        return XmlAdapterUtils.unmarshallSource(TimeType.class, this.getEndTime());
    }

    public void setEndTimeItem(TimeType target) {
        setEndTime(XmlAdapterUtils.marshallJAXBElement(TimeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endTime"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "endevent")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "endevent_nilreason"))
    })
    public CodeTimeEventType getEndEventItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTimeEventType.class, this.getEndEvent());
    }

    public void setEndEventItem(CodeTimeEventType target) {
        setEndEvent(XmlAdapterUtils.marshallJAXBElement(CodeTimeEventType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endEvent"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "endtimerelativeevent")),
        @AttributeOverride(name = "uom", column = @Column(name = "endtimerelativeevent_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "endtimerelativeevent_nilreason"))
    })
    public ValDurationType getEndTimeRelativeEventItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getEndTimeRelativeEvent());
    }

    public void setEndTimeRelativeEventItem(ValDurationType target) {
        setEndTimeRelativeEvent(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endTimeRelativeEvent"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "endeventinterpretation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "endeventinterpretation_nilreason"))
    })
    public CodeTimeEventCombinationType getEndEventInterpretationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeTimeEventCombinationType.class, this.getEndEventInterpretation());
    }

    public void setEndEventInterpretationItem(CodeTimeEventCombinationType target) {
        setEndEventInterpretation(XmlAdapterUtils.marshallJAXBElement(CodeTimeEventCombinationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endEventInterpretation"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "daylightsavingadjust")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "daylightsavingadjust_nilreason"))
    })
    public CodeYesNoType getDaylightSavingAdjustItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getDaylightSavingAdjust());
    }

    public void setDaylightSavingAdjustItem(CodeYesNoType target) {
        setDaylightSavingAdjust(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "daylightSavingAdjust"), TimesheetType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "excluded")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "excluded_nilreason"))
    })
    public CodeYesNoType getExcludedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getExcluded());
    }

    public void setExcludedItem(CodeYesNoType target) {
        setExcluded(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "excluded"), TimesheetType.class, target));
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
        final TimesheetType that = ((TimesheetType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<TimesheetTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<TimesheetTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartTimeRelativeEvent();
            boolean rhsFieldIsSet = that.isSetStartTimeRelativeEvent();
            JAXBElement<ValDurationType> lhsField;
            lhsField = this.getStartTimeRelativeEvent();
            JAXBElement<ValDurationType> rhsField;
            rhsField = that.getStartTimeRelativeEvent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startTimeRelativeEvent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startTimeRelativeEvent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDayTil();
            boolean rhsFieldIsSet = that.isSetDayTil();
            JAXBElement<CodeDayType> lhsField;
            lhsField = this.getDayTil();
            JAXBElement<CodeDayType> rhsField;
            rhsField = that.getDayTil();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dayTil", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dayTil", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndEvent();
            boolean rhsFieldIsSet = that.isSetEndEvent();
            JAXBElement<CodeTimeEventType> lhsField;
            lhsField = this.getEndEvent();
            JAXBElement<CodeTimeEventType> rhsField;
            rhsField = that.getEndEvent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endEvent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endEvent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartEventInterpretation();
            boolean rhsFieldIsSet = that.isSetStartEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> lhsField;
            lhsField = this.getStartEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> rhsField;
            rhsField = that.getStartEventInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startEventInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startEventInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDay();
            boolean rhsFieldIsSet = that.isSetDay();
            JAXBElement<CodeDayType> lhsField;
            lhsField = this.getDay();
            JAXBElement<CodeDayType> rhsField;
            rhsField = that.getDay();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "day", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "day", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDaylightSavingAdjust();
            boolean rhsFieldIsSet = that.isSetDaylightSavingAdjust();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getDaylightSavingAdjust();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getDaylightSavingAdjust();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "daylightSavingAdjust", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "daylightSavingAdjust", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndTimeRelativeEvent();
            boolean rhsFieldIsSet = that.isSetEndTimeRelativeEvent();
            JAXBElement<ValDurationType> lhsField;
            lhsField = this.getEndTimeRelativeEvent();
            JAXBElement<ValDurationType> rhsField;
            rhsField = that.getEndTimeRelativeEvent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endTimeRelativeEvent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endTimeRelativeEvent", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExcluded();
            boolean rhsFieldIsSet = that.isSetExcluded();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getExcluded();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getExcluded();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "excluded", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "excluded", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndEventInterpretation();
            boolean rhsFieldIsSet = that.isSetEndEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> lhsField;
            lhsField = this.getEndEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> rhsField;
            rhsField = that.getEndEventInterpretation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endEventInterpretation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endEventInterpretation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTimeReference();
            boolean rhsFieldIsSet = that.isSetTimeReference();
            JAXBElement<CodeTimeReferenceType> lhsField;
            lhsField = this.getTimeReference();
            JAXBElement<CodeTimeReferenceType> rhsField;
            rhsField = that.getTimeReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timeReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timeReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndTime();
            boolean rhsFieldIsSet = that.isSetEndTime();
            JAXBElement<TimeType> lhsField;
            lhsField = this.getEndTime();
            JAXBElement<TimeType> rhsField;
            rhsField = that.getEndTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endTime", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartEvent();
            boolean rhsFieldIsSet = that.isSetStartEvent();
            JAXBElement<CodeTimeEventType> lhsField;
            lhsField = this.getStartEvent();
            JAXBElement<CodeTimeEventType> rhsField;
            rhsField = that.getStartEvent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startEvent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startEvent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndDate();
            boolean rhsFieldIsSet = that.isSetEndDate();
            JAXBElement<DateMonthDayType> lhsField;
            lhsField = this.getEndDate();
            JAXBElement<DateMonthDayType> rhsField;
            rhsField = that.getEndDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endDate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endDate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartDate();
            boolean rhsFieldIsSet = that.isSetStartDate();
            JAXBElement<DateMonthDayType> lhsField;
            lhsField = this.getStartDate();
            JAXBElement<DateMonthDayType> rhsField;
            rhsField = that.getStartDate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startDate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startDate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartTime();
            boolean rhsFieldIsSet = that.isSetStartTime();
            JAXBElement<TimeType> lhsField;
            lhsField = this.getStartTime();
            JAXBElement<TimeType> rhsField;
            rhsField = that.getStartTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startTime", rhsField);
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
            boolean theFieldIsSet = this.isSetTimeReference();
            JAXBElement<CodeTimeReferenceType> theField;
            theField = this.getTimeReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timeReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartDate();
            JAXBElement<DateMonthDayType> theField;
            theField = this.getStartDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startDate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndDate();
            JAXBElement<DateMonthDayType> theField;
            theField = this.getEndDate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endDate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDay();
            JAXBElement<CodeDayType> theField;
            theField = this.getDay();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "day", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDayTil();
            JAXBElement<CodeDayType> theField;
            theField = this.getDayTil();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dayTil", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartTime();
            JAXBElement<TimeType> theField;
            theField = this.getStartTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartEvent();
            JAXBElement<CodeTimeEventType> theField;
            theField = this.getStartEvent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startEvent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartTimeRelativeEvent();
            JAXBElement<ValDurationType> theField;
            theField = this.getStartTimeRelativeEvent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startTimeRelativeEvent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> theField;
            theField = this.getStartEventInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startEventInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndTime();
            JAXBElement<TimeType> theField;
            theField = this.getEndTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndEvent();
            JAXBElement<CodeTimeEventType> theField;
            theField = this.getEndEvent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endEvent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndTimeRelativeEvent();
            JAXBElement<ValDurationType> theField;
            theField = this.getEndTimeRelativeEvent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endTimeRelativeEvent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> theField;
            theField = this.getEndEventInterpretation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endEventInterpretation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDaylightSavingAdjust();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDaylightSavingAdjust();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "daylightSavingAdjust", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExcluded();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getExcluded();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "excluded", theField);
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
            List<TimesheetTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTimeReference();
            JAXBElement<CodeTimeReferenceType> theField;
            theField = this.getTimeReference();
            strategy.appendField(locator, this, "timeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartDate();
            JAXBElement<DateMonthDayType> theField;
            theField = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndDate();
            JAXBElement<DateMonthDayType> theField;
            theField = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDay();
            JAXBElement<CodeDayType> theField;
            theField = this.getDay();
            strategy.appendField(locator, this, "day", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDayTil();
            JAXBElement<CodeDayType> theField;
            theField = this.getDayTil();
            strategy.appendField(locator, this, "dayTil", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartTime();
            JAXBElement<TimeType> theField;
            theField = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartEvent();
            JAXBElement<CodeTimeEventType> theField;
            theField = this.getStartEvent();
            strategy.appendField(locator, this, "startEvent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartTimeRelativeEvent();
            JAXBElement<ValDurationType> theField;
            theField = this.getStartTimeRelativeEvent();
            strategy.appendField(locator, this, "startTimeRelativeEvent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStartEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> theField;
            theField = this.getStartEventInterpretation();
            strategy.appendField(locator, this, "startEventInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndTime();
            JAXBElement<TimeType> theField;
            theField = this.getEndTime();
            strategy.appendField(locator, this, "endTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndEvent();
            JAXBElement<CodeTimeEventType> theField;
            theField = this.getEndEvent();
            strategy.appendField(locator, this, "endEvent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndTimeRelativeEvent();
            JAXBElement<ValDurationType> theField;
            theField = this.getEndTimeRelativeEvent();
            strategy.appendField(locator, this, "endTimeRelativeEvent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndEventInterpretation();
            JAXBElement<CodeTimeEventCombinationType> theField;
            theField = this.getEndEventInterpretation();
            strategy.appendField(locator, this, "endEventInterpretation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDaylightSavingAdjust();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getDaylightSavingAdjust();
            strategy.appendField(locator, this, "daylightSavingAdjust", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExcluded();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getExcluded();
            strategy.appendField(locator, this, "excluded", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<TimesheetTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
