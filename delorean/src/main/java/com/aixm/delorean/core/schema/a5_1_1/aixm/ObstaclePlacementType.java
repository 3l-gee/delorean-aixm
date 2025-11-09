
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 * <p>Java class for ObstaclePlacementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstaclePlacementType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}ObstaclePlacementPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractObstaclePlacementExtension"/>
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
@XmlType(name = "ObstaclePlacementType", propOrder = {
    "obstacleBearing",
    "obstacleDistance",
    "pointType",
    "obstaclePlacement",
    "annotation",
    "extension"
})
@Entity(name = "ObstaclePlacementType")
@Table(name = "obstacleplacement", schema = "shared")
public class ObstaclePlacementType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "obstacleBearing", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> obstacleBearing;
    @XmlElementRef(name = "obstacleDistance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> obstacleDistance;
    @XmlElementRef(name = "pointType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> pointType;
    @XmlElementRef(name = "obstaclePlacement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> obstaclePlacement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstaclePlacementTypeExtensionType> extension;

    /**
     * Gets the value of the obstacleBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getObstacleBearing() {
        return obstacleBearing;
    }

    /**
     * Sets the value of the obstacleBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setObstacleBearing(JAXBElement<ValBearingType> value) {
        this.obstacleBearing = value;
    }

    @Transient
    public boolean isSetObstacleBearing() {
        return (this.obstacleBearing!= null);
    }

    /**
     * Gets the value of the obstacleDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getObstacleDistance() {
        return obstacleDistance;
    }

    /**
     * Sets the value of the obstacleDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setObstacleDistance(JAXBElement<ValDistanceType> value) {
        this.obstacleDistance = value;
    }

    @Transient
    public boolean isSetObstacleDistance() {
        return (this.obstacleDistance!= null);
    }

    /**
     * Gets the value of the pointType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<TextNameType> getPointType() {
        return pointType;
    }

    /**
     * Sets the value of the pointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setPointType(JAXBElement<TextNameType> value) {
        this.pointType = value;
    }

    @Transient
    public boolean isSetPointType() {
        return (this.pointType!= null);
    }

    /**
     * Gets the value of the obstaclePlacement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeSideType> getObstaclePlacement() {
        return obstaclePlacement;
    }

    /**
     * Sets the value of the obstaclePlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setObstaclePlacement(JAXBElement<CodeSideType> value) {
        this.obstaclePlacement = value;
    }

    @Transient
    public boolean isSetObstaclePlacement() {
        return (this.obstaclePlacement!= null);
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
    @JoinColumn(name = "annotation_id", referencedColumnName = "hjid")
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
     * {@link ObstaclePlacementTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = ObstaclePlacementTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_OBSTACLE_PLACEMENT_0")
    public List<ObstaclePlacementTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<ObstaclePlacementTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "obstaclebearing")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "obstaclebearing_nilreason"))
    })
    public ValBearingType getObstacleBearingItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getObstacleBearing());
    }

    public void setObstacleBearingItem(ValBearingType target) {
        setObstacleBearing(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "obstacleBearing"), ObstaclePlacementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "obstacledistance")),
        @AttributeOverride(name = "uom", column = @Column(name = "obstacledistance_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "obstacledistance_nilreason"))
    })
    public ValDistanceType getObstacleDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getObstacleDistance());
    }

    public void setObstacleDistanceItem(ValDistanceType target) {
        setObstacleDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "obstacleDistance"), ObstaclePlacementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "pointtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "pointtype_nilreason"))
    })
    public TextNameType getPointTypeItem() {
        return XmlAdapterUtils.unmarshallSource(TextNameType.class, this.getPointType());
    }

    public void setPointTypeItem(TextNameType target) {
        setPointType(XmlAdapterUtils.marshallJAXBElement(TextNameType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pointType"), ObstaclePlacementType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "obstacleplacement")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "obstacleplacement_nilreason"))
    })
    public CodeSideType getObstaclePlacementItem() {
        return XmlAdapterUtils.unmarshallSource(CodeSideType.class, this.getObstaclePlacement());
    }

    public void setObstaclePlacementItem(CodeSideType target) {
        setObstaclePlacement(XmlAdapterUtils.marshallJAXBElement(CodeSideType.class, new QName("http://www.aixm.aero/schema/5.1.1", "obstaclePlacement"), ObstaclePlacementType.class, target));
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
        final ObstaclePlacementType that = ((ObstaclePlacementType) object);
        {
            boolean lhsFieldIsSet = this.isSetObstacleDistance();
            boolean rhsFieldIsSet = that.isSetObstacleDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getObstacleDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getObstacleDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetObstaclePlacement();
            boolean rhsFieldIsSet = that.isSetObstaclePlacement();
            JAXBElement<CodeSideType> lhsField;
            lhsField = this.getObstaclePlacement();
            JAXBElement<CodeSideType> rhsField;
            rhsField = that.getObstaclePlacement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstaclePlacement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstaclePlacement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<ObstaclePlacementTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<ObstaclePlacementTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPointType();
            boolean rhsFieldIsSet = that.isSetPointType();
            JAXBElement<TextNameType> lhsField;
            lhsField = this.getPointType();
            JAXBElement<TextNameType> rhsField;
            rhsField = that.getPointType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointType", rhsField);
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
            boolean lhsFieldIsSet = this.isSetObstacleBearing();
            boolean rhsFieldIsSet = that.isSetObstacleBearing();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getObstacleBearing();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getObstacleBearing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleBearing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleBearing", rhsField);
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
            boolean theFieldIsSet = this.isSetObstacleBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getObstacleBearing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleBearing", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getObstacleDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointType();
            JAXBElement<TextNameType> theField;
            theField = this.getPointType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstaclePlacement();
            JAXBElement<CodeSideType> theField;
            theField = this.getObstaclePlacement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstaclePlacement", theField);
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
            List<ObstaclePlacementTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetObstacleBearing();
            JAXBElement<ValBearingType> theField;
            theField = this.getObstacleBearing();
            strategy.appendField(locator, this, "obstacleBearing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstacleDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getObstacleDistance();
            strategy.appendField(locator, this, "obstacleDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPointType();
            JAXBElement<TextNameType> theField;
            theField = this.getPointType();
            strategy.appendField(locator, this, "pointType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetObstaclePlacement();
            JAXBElement<CodeSideType> theField;
            theField = this.getObstaclePlacement();
            strategy.appendField(locator, this, "obstaclePlacement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<ObstaclePlacementTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
