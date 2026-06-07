
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
 * Java class for WeatherSourceTimeSliceType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="WeatherSourceTimeSliceType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <element name="designator" type=
"{http://www.aixm.aero/schema/5.2}TextDesignatorType" minOccurs="0"/>
 *         <element name="sensorType" type=
"{http://www.aixm.aero/schema/5.2}CodeWeatherSourceType" minOccurs="0"/>
 *         <element name="position" type=
"{http://www.aixm.aero/schema/5.2}ElevatedPointPropertyType" minOccurs="0"/>
 *         <element name="availability" type=
"{http://www.aixm.aero/schema/5.2}WeatherSourceAvailabilityPropertyType" maxOccurs
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
"{http://www.aixm.aero/schema/5.2}AbstractWeatherSourceExtension"/>
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
@XmlType(name = "WeatherSourceTimeSliceType", propOrder = {"designator", "sensorType", "position", "availability",
        "annotation", "extension"})
@Entity(name = "WeatherSourceTimeSliceType")
@Table(name = "weathersource_t", schema = "airport_heliport")
public class WeatherSourceTimeSliceType extends AbstractAIXMTimeSliceType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "sensorType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeWeatherSourceType> sensorType;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMElevatedPointPropertyType> position;
    @XmlElement(nillable = true)
    protected List<WeatherSourceAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<WeatherSourceTimeSliceExtensionType> extension;

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
     * Gets the value of the sensorType property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeWeatherSourceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeWeatherSourceType> getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeWeatherSourceType }{@code >}
     *
     */
    public void setSensorType(JAXBElement<CodeWeatherSourceType> value) {
        this.sensorType = value;
    }

    @Transient
    public boolean isSetSensorType() {
        return (this.sensorType != null);
    }

    /**
     * Gets the value of the position property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<AIXMElevatedPointPropertyType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link AIXMElevatedPointPropertyType }{@code >}
     *
     */
    public void setPosition(JAXBElement<AIXMElevatedPointPropertyType> value) {
        this.position = value;
    }

    @Transient
    public boolean isSetPosition() {
        return (this.position != null);
    }

    /**
     * Gets the value of the availability property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the availability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAvailability().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherSourceAvailabilityPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = WeatherSourceAvailabilityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "wthrsrctmslctp_avlblt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "weathersource_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "availability_hjid", referencedColumnName = "hjid")})
    public List<WeatherSourceAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     *
     *
     */
    public void setAvailability(List<WeatherSourceAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability != null) && (!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
    @JoinTable(name = "wthrsrctmslctp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "weathersource_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link WeatherSourceTimeSliceExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = WeatherSourceTimeSliceExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "weathersource_te_hjid", referencedColumnName = "hjid")
    public List<WeatherSourceTimeSliceExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<WeatherSourceTimeSliceExtensionType> extension) {
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
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "designator", columnDefinition = "VARCHAR", length = 16)),
            @AttributeOverride(name = "nilReason", column = @Column(name = "designatornilreason"))})
    public TextDesignatorType getDesignatorItem() {
        return XmlAdapterUtils.unmarshallSource(TextDesignatorType.class, this.getDesignator());
    }

    public void setDesignatorItem(TextDesignatorType target) {
        setDesignator(XmlAdapterUtils.marshallJAXBElement(TextDesignatorType.class,
                new QName("http://www.aixm.aero/schema/5.2", "designator"), WeatherSourceTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "sensortype")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "sensortypenilreason"))})
    public CodeWeatherSourceType getSensorTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeWeatherSourceType.class, this.getSensorType());
    }

    public void setSensorTypeItem(CodeWeatherSourceType target) {
        setSensorType(XmlAdapterUtils.marshallJAXBElement(CodeWeatherSourceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "sensorType"), WeatherSourceTimeSliceType.class, target));
    }

    @OneToOne(targetEntity = AIXMElevatedPointPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "wthrsrctmslctp_pstn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "weathersource_t_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "position_hjid", referencedColumnName = "hjid")})
    public AIXMElevatedPointPropertyType getPositionItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMElevatedPointPropertyType.class, this.getPosition());
    }

    public void setPositionItem(AIXMElevatedPointPropertyType target) {
        setPosition(XmlAdapterUtils.marshallJAXBElement(AIXMElevatedPointPropertyType.class,
                new QName("http://www.aixm.aero/schema/5.2", "position"), WeatherSourceTimeSliceType.class, target));
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
        final WeatherSourceTimeSliceType that = ((WeatherSourceTimeSliceType) object);
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
            boolean lhsFieldIsSet = this.isSetSensorType();
            boolean rhsFieldIsSet = that.isSetSensorType();
            JAXBElement<CodeWeatherSourceType> lhsField;
            lhsField = this.getSensorType();
            JAXBElement<CodeWeatherSourceType> rhsField;
            rhsField = that.getSensorType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sensorType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sensorType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPosition();
            boolean rhsFieldIsSet = that.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> lhsField;
            lhsField = this.getPosition();
            JAXBElement<AIXMElevatedPointPropertyType> rhsField;
            rhsField = that.getPosition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "position", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "position", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<WeatherSourceAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability() ? this.getAvailability() : null);
            List<WeatherSourceAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability() ? that.getAvailability() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<WeatherSourceTimeSliceExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<WeatherSourceTimeSliceExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSensorType();
            JAXBElement<CodeWeatherSourceType> theField;
            theField = this.getSensorType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sensorType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "position", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<WeatherSourceAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            List<WeatherSourceTimeSliceExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDesignator();
            JAXBElement<TextDesignatorType> theField;
            theField = this.getDesignator();
            strategy.appendField(locator, this, "designator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSensorType();
            JAXBElement<CodeWeatherSourceType> theField;
            theField = this.getSensorType();
            strategy.appendField(locator, this, "sensorType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPosition();
            JAXBElement<AIXMElevatedPointPropertyType> theField;
            theField = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<WeatherSourceAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability() ? this.getAvailability() : null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<WeatherSourceTimeSliceExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
