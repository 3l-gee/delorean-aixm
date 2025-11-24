
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
 * <p>Java class for SectorDesignType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SectorDesignType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}SectorDesignPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSectorDesignExtension"/>
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
@XmlType(name = "SectorDesignType", propOrder = {
    "turnDirection",
    "designGradient",
    "terminationAltitude",
    "turnPermitted",
    "annotation",
    "extension"
})
@Entity(name = "SectorDesignType")
@Table(name = "sectordesign", schema = "procedure")
public class SectorDesignType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "designGradient", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> designGradient;
    @XmlElementRef(name = "terminationAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> terminationAltitude;
    @XmlElementRef(name = "turnPermitted", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> turnPermitted;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SectorDesignTypeExtensionType> extension;

    /**
     * Gets the value of the turnDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionTurnType> getTurnDirection() {
        return turnDirection;
    }

    /**
     * Sets the value of the turnDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

    @Transient
    public boolean isSetTurnDirection() {
        return (this.turnDirection!= null);
    }

    /**
     * Gets the value of the designGradient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValSlopeType> getDesignGradient() {
        return designGradient;
    }

    /**
     * Sets the value of the designGradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setDesignGradient(JAXBElement<ValSlopeType> value) {
        this.designGradient = value;
    }

    @Transient
    public boolean isSetDesignGradient() {
        return (this.designGradient!= null);
    }

    /**
     * Gets the value of the terminationAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getTerminationAltitude() {
        return terminationAltitude;
    }

    /**
     * Sets the value of the terminationAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setTerminationAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.terminationAltitude = value;
    }

    @Transient
    public boolean isSetTerminationAltitude() {
        return (this.terminationAltitude!= null);
    }

    /**
     * Gets the value of the turnPermitted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getTurnPermitted() {
        return turnPermitted;
    }

    /**
     * Sets the value of the turnPermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setTurnPermitted(JAXBElement<CodeYesNoType> value) {
        this.turnPermitted = value;
    }

    @Transient
    public boolean isSetTurnPermitted() {
        return (this.turnPermitted!= null);
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
    @JoinTable(name = "annotation_sectordesign_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "sectordesignpropertygroup", referencedColumnName = "hjid")
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
     * {@link SectorDesignTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = SectorDesignTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<SectorDesignTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<SectorDesignTypeExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "turndirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turndirection_nilreason"))
    })
    public CodeDirectionTurnType getTurnDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getTurnDirection());
    }

    public void setTurnDirectionItem(CodeDirectionTurnType target) {
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnDirection"), SectorDesignType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designgradient")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designgradient_nilreason"))
    })
    public ValSlopeType getDesignGradientItem() {
        return XmlAdapterUtils.unmarshallSource(ValSlopeType.class, this.getDesignGradient());
    }

    public void setDesignGradientItem(ValSlopeType target) {
        setDesignGradient(XmlAdapterUtils.marshallJAXBElement(ValSlopeType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designGradient"), SectorDesignType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "terminationaltitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "terminationaltitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "terminationaltitude_nilreason"))
    })
    public ValDistanceVerticalType getTerminationAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getTerminationAltitude());
    }

    public void setTerminationAltitudeItem(ValDistanceVerticalType target) {
        setTerminationAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "terminationAltitude"), SectorDesignType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "turnpermitted")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turnpermitted_nilreason"))
    })
    public CodeYesNoType getTurnPermittedItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getTurnPermitted());
    }

    public void setTurnPermittedItem(CodeYesNoType target) {
        setTurnPermitted(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnPermitted"), SectorDesignType.class, target));
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
        final SectorDesignType that = ((SectorDesignType) object);
        {
            boolean lhsFieldIsSet = this.isSetTurnDirection();
            boolean rhsFieldIsSet = that.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> lhsField;
            lhsField = this.getTurnDirection();
            JAXBElement<CodeDirectionTurnType> rhsField;
            rhsField = that.getTurnDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turnDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turnDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignGradient();
            boolean rhsFieldIsSet = that.isSetDesignGradient();
            JAXBElement<ValSlopeType> lhsField;
            lhsField = this.getDesignGradient();
            JAXBElement<ValSlopeType> rhsField;
            rhsField = that.getDesignGradient();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designGradient", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designGradient", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<SectorDesignTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<SectorDesignTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTurnPermitted();
            boolean rhsFieldIsSet = that.isSetTurnPermitted();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getTurnPermitted();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getTurnPermitted();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turnPermitted", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turnPermitted", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTerminationAltitude();
            boolean rhsFieldIsSet = that.isSetTerminationAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getTerminationAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getTerminationAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "terminationAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "terminationAltitude", rhsField);
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
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turnDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignGradient();
            JAXBElement<ValSlopeType> theField;
            theField = this.getDesignGradient();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designGradient", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTerminationAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getTerminationAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "terminationAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnPermitted();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getTurnPermitted();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turnPermitted", theField);
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
            List<SectorDesignTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            strategy.appendField(locator, this, "turnDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignGradient();
            JAXBElement<ValSlopeType> theField;
            theField = this.getDesignGradient();
            strategy.appendField(locator, this, "designGradient", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTerminationAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getTerminationAltitude();
            strategy.appendField(locator, this, "terminationAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnPermitted();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getTurnPermitted();
            strategy.appendField(locator, this, "turnPermitted", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<SectorDesignTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
