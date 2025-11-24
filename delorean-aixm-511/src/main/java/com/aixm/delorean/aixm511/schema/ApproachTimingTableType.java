
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
 * <p>Java class for ApproachTimingTableType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachTimingTableType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ApproachTimingTablePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractApproachTimingTableExtension"/>
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
@XmlType(name = "ApproachTimingTableType", propOrder = {
    "startingMeasurementPoint",
    "endingMeasurementPoint",
    "time",
    "speed",
    "annotation",
    "extension"
})
@Entity(name = "ApproachTimingTableType")
@Table(name = "approachtimingtable", schema = "procedure")
public class ApproachTimingTableType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "startingMeasurementPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureDistanceType> startingMeasurementPoint;
    @XmlElementRef(name = "endingMeasurementPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureDistanceType> endingMeasurementPoint;
    @XmlElementRef(name = "time", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> time;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ApproachTimingTableTypeExtensionType> extension;

    /**
     * Gets the value of the startingMeasurementPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeProcedureDistanceType> getStartingMeasurementPoint() {
        return startingMeasurementPoint;
    }

    /**
     * Sets the value of the startingMeasurementPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureDistanceType }{@code >}
     *     
     */
    public void setStartingMeasurementPoint(JAXBElement<CodeProcedureDistanceType> value) {
        this.startingMeasurementPoint = value;
    }

    @Transient
    public boolean isSetStartingMeasurementPoint() {
        return (this.startingMeasurementPoint!= null);
    }

    /**
     * Gets the value of the endingMeasurementPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeProcedureDistanceType> getEndingMeasurementPoint() {
        return endingMeasurementPoint;
    }

    /**
     * Sets the value of the endingMeasurementPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureDistanceType }{@code >}
     *     
     */
    public void setEndingMeasurementPoint(JAXBElement<CodeProcedureDistanceType> value) {
        this.endingMeasurementPoint = value;
    }

    @Transient
    public boolean isSetEndingMeasurementPoint() {
        return (this.endingMeasurementPoint!= null);
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDurationType> getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setTime(JAXBElement<ValDurationType> value) {
        this.time = value;
    }

    @Transient
    public boolean isSetTime() {
        return (this.time!= null);
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    @Transient
    public boolean isSetSpeed() {
        return (this.speed!= null);
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
    @JoinTable(name = "annotation_approachtimingtable_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachtimingtablepropertygroup", referencedColumnName = "hjid")
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
     * {@link ApproachTimingTableTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ApproachTimingTableTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<ApproachTimingTableTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ApproachTimingTableTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "startingmeasurementpoint")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "startingmeasurementpoint_nilreason"))
    })
    public CodeProcedureDistanceType getStartingMeasurementPointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeProcedureDistanceType.class, this.getStartingMeasurementPoint());
    }

    public void setStartingMeasurementPointItem(CodeProcedureDistanceType target) {
        setStartingMeasurementPoint(XmlAdapterUtils.marshallJAXBElement(CodeProcedureDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startingMeasurementPoint"), ApproachTimingTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "endingmeasurementpoint")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "endingmeasurementpoint_nilreason"))
    })
    public CodeProcedureDistanceType getEndingMeasurementPointItem() {
        return XmlAdapterUtils.unmarshallSource(CodeProcedureDistanceType.class, this.getEndingMeasurementPoint());
    }

    public void setEndingMeasurementPointItem(CodeProcedureDistanceType target) {
        setEndingMeasurementPoint(XmlAdapterUtils.marshallJAXBElement(CodeProcedureDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endingMeasurementPoint"), ApproachTimingTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "time")),
        @AttributeOverride(name = "uom", column = @Column(name = "time_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "time_nilreason"))
    })
    public ValDurationType getTimeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDurationType.class, this.getTime());
    }

    public void setTimeItem(ValDurationType target) {
        setTime(XmlAdapterUtils.marshallJAXBElement(ValDurationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "time"), ApproachTimingTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "speed")),
        @AttributeOverride(name = "uom", column = @Column(name = "speed_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "speed_nilreason"))
    })
    public ValSpeedType getSpeedItem() {
        return XmlAdapterUtils.unmarshallSource(ValSpeedType.class, this.getSpeed());
    }

    public void setSpeedItem(ValSpeedType target) {
        setSpeed(XmlAdapterUtils.marshallJAXBElement(ValSpeedType.class, new QName("http://www.aixm.aero/schema/5.1.1", "speed"), ApproachTimingTableType.class, target));
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
        final ApproachTimingTableType that = ((ApproachTimingTableType) object);
        {
            boolean lhsFieldIsSet = this.isSetSpeed();
            boolean rhsFieldIsSet = that.isSetSpeed();
            JAXBElement<ValSpeedType> lhsField;
            lhsField = this.getSpeed();
            JAXBElement<ValSpeedType> rhsField;
            rhsField = that.getSpeed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "speed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "speed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStartingMeasurementPoint();
            boolean rhsFieldIsSet = that.isSetStartingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> lhsField;
            lhsField = this.getStartingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> rhsField;
            rhsField = that.getStartingMeasurementPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "startingMeasurementPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "startingMeasurementPoint", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEndingMeasurementPoint();
            boolean rhsFieldIsSet = that.isSetEndingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> lhsField;
            lhsField = this.getEndingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> rhsField;
            rhsField = that.getEndingMeasurementPoint();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "endingMeasurementPoint", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "endingMeasurementPoint", rhsField);
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
            List<ApproachTimingTableTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ApproachTimingTableTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTime();
            boolean rhsFieldIsSet = that.isSetTime();
            JAXBElement<ValDurationType> lhsField;
            lhsField = this.getTime();
            JAXBElement<ValDurationType> rhsField;
            rhsField = that.getTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "time", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "time", rhsField);
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
            boolean theFieldIsSet = this.isSetStartingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getStartingMeasurementPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "startingMeasurementPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getEndingMeasurementPoint();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "endingMeasurementPoint", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTime();
            JAXBElement<ValDurationType> theField;
            theField = this.getTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "time", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "speed", theField);
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
            List<ApproachTimingTableTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetStartingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getStartingMeasurementPoint();
            strategy.appendField(locator, this, "startingMeasurementPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getEndingMeasurementPoint();
            strategy.appendField(locator, this, "endingMeasurementPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTime();
            JAXBElement<ValDurationType> theField;
            theField = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpeed();
            JAXBElement<ValSpeedType> theField;
            theField = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachTimingTableTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
