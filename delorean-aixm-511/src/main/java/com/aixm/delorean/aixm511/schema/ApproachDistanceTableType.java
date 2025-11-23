
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
 * <p>Java class for ApproachDistanceTableType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApproachDistanceTableType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ApproachDistanceTablePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractApproachDistanceTableExtension"/>
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
@XmlType(name = "ApproachDistanceTableType", propOrder = {
    "startingMeasurementPoint",
    "valueHAT",
    "endingMeasurementPoint",
    "distance",
    "annotation",
    "extension"
})
@Entity(name = "ApproachDistanceTableType")
@Table(name = "approachdistancetable", schema = "procedure")
public class ApproachDistanceTableType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "startingMeasurementPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureDistanceType> startingMeasurementPoint;
    @XmlElementRef(name = "valueHAT", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> valueHAT;
    @XmlElementRef(name = "endingMeasurementPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureDistanceType> endingMeasurementPoint;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> distance;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ApproachDistanceTableTypeExtensionType> extension;

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
     * Gets the value of the valueHAT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getValueHAT() {
        return valueHAT;
    }

    /**
     * Sets the value of the valueHAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setValueHAT(JAXBElement<ValDistanceVerticalType> value) {
        this.valueHAT = value;
    }

    @Transient
    public boolean isSetValueHAT() {
        return (this.valueHAT!= null);
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
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setDistance(JAXBElement<ValDistanceType> value) {
        this.distance = value;
    }

    @Transient
    public boolean isSetDistance() {
        return (this.distance!= null);
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
    @JoinTable(name = "annotation_approachdistancetable_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "approachdistancetablepropertygroup", referencedColumnName = "hjid")
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
     * {@link ApproachDistanceTableTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ApproachDistanceTableTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_APPROACH_DISTANCE__0")
    public List<ApproachDistanceTableTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ApproachDistanceTableTypeExtensionType> extension) {
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
        setStartingMeasurementPoint(XmlAdapterUtils.marshallJAXBElement(CodeProcedureDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "startingMeasurementPoint"), ApproachDistanceTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "valuehat")),
        @AttributeOverride(name = "uom", column = @Column(name = "valuehat_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "valuehat_nilreason"))
    })
    public ValDistanceVerticalType getValueHATItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getValueHAT());
    }

    public void setValueHATItem(ValDistanceVerticalType target) {
        setValueHAT(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "valueHAT"), ApproachDistanceTableType.class, target));
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
        setEndingMeasurementPoint(XmlAdapterUtils.marshallJAXBElement(CodeProcedureDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "endingMeasurementPoint"), ApproachDistanceTableType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "distance")),
        @AttributeOverride(name = "uom", column = @Column(name = "distance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "distance_nilreason"))
    })
    public ValDistanceType getDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getDistance());
    }

    public void setDistanceItem(ValDistanceType target) {
        setDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "distance"), ApproachDistanceTableType.class, target));
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
        final ApproachDistanceTableType that = ((ApproachDistanceTableType) object);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ApproachDistanceTableTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ApproachDistanceTableTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValueHAT();
            boolean rhsFieldIsSet = that.isSetValueHAT();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getValueHAT();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getValueHAT();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueHAT", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueHAT", rhsField);
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
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
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
            boolean theFieldIsSet = this.isSetValueHAT();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getValueHAT();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueHAT", theField);
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
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
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
            List<ApproachDistanceTableTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetValueHAT();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getValueHAT();
            strategy.appendField(locator, this, "valueHAT", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEndingMeasurementPoint();
            JAXBElement<CodeProcedureDistanceType> theField;
            theField = this.getEndingMeasurementPoint();
            strategy.appendField(locator, this, "endingMeasurementPoint", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ApproachDistanceTableTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
