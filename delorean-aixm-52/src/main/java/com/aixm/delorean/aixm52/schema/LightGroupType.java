
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
 * Java class for LightGroupType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="LightGroupType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="fromDistance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="toDistance" type=
"{http://www.aixm.aero/schema/5.2}ValDistanceType" minOccurs="0"/>
 *         <element name="colour" type=
"{http://www.aixm.aero/schema/5.2}CodeColourType" minOccurs="0"/>
 *         <element name="direction" type=
"{http://www.aixm.aero/schema/5.2}CodeLightDirectionType" minOccurs="0"/>
 *         <element name="element" type=
"{http://www.aixm.aero/schema/5.2}LightElementPropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractLightGroupExtension"/>
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
@XmlType(name = "LightGroupType", propOrder = {"fromDistance", "toDistance", "colour", "direction", "element",
        "annotation", "extension"})
@Entity(name = "LightGroupType")
@Table(name = "lightgroup_o", schema = "airport_heliport")
public class LightGroupType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "fromDistance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> fromDistance;
    @XmlElementRef(name = "toDistance", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> toDistance;
    @XmlElementRef(name = "colour", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> colour;
    @XmlElementRef(name = "direction", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightDirectionType> direction;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<LightGroupTypeExtensionType> extension;

    /**
     * Gets the value of the fromDistance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getFromDistance() {
        return fromDistance;
    }

    /**
     * Sets the value of the fromDistance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setFromDistance(JAXBElement<ValDistanceType> value) {
        this.fromDistance = value;
    }

    @Transient
    public boolean isSetFromDistance() {
        return (this.fromDistance != null);
    }

    /**
     * Gets the value of the toDistance property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValDistanceType> getToDistance() {
        return toDistance;
    }

    /**
     * Sets the value of the toDistance property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValDistanceType }{@code >}
     *
     */
    public void setToDistance(JAXBElement<ValDistanceType> value) {
        this.toDistance = value;
    }

    @Transient
    public boolean isSetToDistance() {
        return (this.toDistance != null);
    }

    /**
     * Gets the value of the colour property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeColourType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeColourType> getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeColourType }{@code >}
     *
     */
    public void setColour(JAXBElement<CodeColourType> value) {
        this.colour = value;
    }

    @Transient
    public boolean isSetColour() {
        return (this.colour != null);
    }

    /**
     * Gets the value of the direction property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeLightDirectionType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeLightDirectionType> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeLightDirectionType }{@code >}
     *
     */
    public void setDirection(JAXBElement<CodeLightDirectionType> value) {
        this.direction = value;
    }

    @Transient
    public boolean isSetDirection() {
        return (this.direction != null);
    }

    /**
     * Gets the value of the element property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the element property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     *
     *
     */
    @OneToMany(targetEntity = LightElementPropertyType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "lghtgrptp_elmnt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "lightgroup_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "element_hjid", referencedColumnName = "hjid")})
    public List<LightElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return this.element;
    }

    /**
     *
     *
     */
    public void setElement(List<LightElementPropertyType> element) {
        this.element = element;
    }

    @Transient
    public boolean isSetElement() {
        return ((this.element != null) && (!this.element.isEmpty()));
    }

    public void unsetElement() {
        this.element = null;
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
    @JoinTable(name = "lghtgrptp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "lightgroup_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link LightGroupTypeExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = LightGroupTypeExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "lightgroupe_hjid", referencedColumnName = "hjid")
    public List<LightGroupTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<LightGroupTypeExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "fromdistance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "fromdistanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "fromdistanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "fromdistancenilreason"))})
    public ValDistanceType getFromDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getFromDistance());
    }

    public void setFromDistanceItem(ValDistanceType target) {
        setFromDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "fromDistance"), LightGroupType.class, target));
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "value", column = @Column(name = "todistance", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "uom", column = @Column(name = "todistanceuom")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "todistanceaccuracy")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "todistancenilreason"))})
    public ValDistanceType getToDistanceItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getToDistance());
    }

    public void setToDistanceItem(ValDistanceType target) {
        setToDistance(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "toDistance"), LightGroupType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "colour")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "colournilreason"))})
    public CodeColourType getColourItem() {
        return XmlAdapterUtils.unmarshallSource(CodeColourType.class, this.getColour());
    }

    public void setColourItem(CodeColourType target) {
        setColour(XmlAdapterUtils.marshallJAXBElement(CodeColourType.class,
                new QName("http://www.aixm.aero/schema/5.2", "colour"), LightGroupType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "direction")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "directionnilreason"))})
    public CodeLightDirectionType getDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLightDirectionType.class, this.getDirection());
    }

    public void setDirectionItem(CodeLightDirectionType target) {
        setDirection(XmlAdapterUtils.marshallJAXBElement(CodeLightDirectionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "direction"), LightGroupType.class, target));
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
        final LightGroupType that = ((LightGroupType) object);
        {
            boolean lhsFieldIsSet = this.isSetElement();
            boolean rhsFieldIsSet = that.isSetElement();
            List<LightElementPropertyType> lhsField;
            lhsField = (this.isSetElement() ? this.getElement() : null);
            List<LightElementPropertyType> rhsField;
            rhsField = (that.isSetElement() ? that.getElement() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "element", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "element", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDirection();
            boolean rhsFieldIsSet = that.isSetDirection();
            JAXBElement<CodeLightDirectionType> lhsField;
            lhsField = this.getDirection();
            JAXBElement<CodeLightDirectionType> rhsField;
            rhsField = that.getDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "direction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "direction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFromDistance();
            boolean rhsFieldIsSet = that.isSetFromDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getFromDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getFromDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fromDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fromDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetColour();
            boolean rhsFieldIsSet = that.isSetColour();
            JAXBElement<CodeColourType> lhsField;
            lhsField = this.getColour();
            JAXBElement<CodeColourType> rhsField;
            rhsField = that.getColour();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "colour", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "colour", rhsField);
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
            boolean lhsFieldIsSet = this.isSetToDistance();
            boolean rhsFieldIsSet = that.isSetToDistance();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getToDistance();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getToDistance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "toDistance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "toDistance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<LightGroupTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<LightGroupTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean theFieldIsSet = this.isSetFromDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getFromDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fromDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetToDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getToDistance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "toDistance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "colour", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeLightDirectionType> theField;
            theField = this.getDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "direction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement() ? this.getElement() : null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "element", theField);
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
            List<LightGroupTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetFromDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getFromDistance();
            strategy.appendField(locator, this, "fromDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetToDistance();
            JAXBElement<ValDistanceType> theField;
            theField = this.getToDistance();
            strategy.appendField(locator, this, "toDistance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetColour();
            JAXBElement<CodeColourType> theField;
            theField = this.getColour();
            strategy.appendField(locator, this, "colour", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeLightDirectionType> theField;
            theField = this.getDirection();
            strategy.appendField(locator, this, "direction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetElement();
            List<LightElementPropertyType> theField;
            theField = (this.isSetElement() ? this.getElement() : null);
            strategy.appendField(locator, this, "element", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<LightGroupTypeExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
