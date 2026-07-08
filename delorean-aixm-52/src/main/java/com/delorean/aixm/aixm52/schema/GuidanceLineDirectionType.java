
package com.delorean.aixm.aixm52.schema;

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
 * Java class for GuidanceLineDirectionType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="GuidanceLineDirectionType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="direction" type=
"{http://www.aixm.aero/schema/5.2}CodeDirectionType" minOccurs="0"/>
 *         <element name="cardinalDirection" type=
"{http://www.aixm.aero/schema/5.2}CodeCardinalDirectionType" minOccurs="0"/>
 *         <element name="theManoeuvringAreaAvailability" type=
"{http://www.aixm.aero/schema/5.2}ManoeuvringAreaAvailabilityPropertyType" minOccurs
="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractGuidanceLineDirectionExtension"/>
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
@XmlType(name = "GuidanceLineDirectionType", propOrder = {"direction", "cardinalDirection",
        "theManoeuvringAreaAvailability", "annotation", "extension"})
@Entity(name = "GuidanceLineDirectionType")
@Table(name = "guidancelinedirection_o", schema = "airport_heliport")
public class GuidanceLineDirectionType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "direction", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionType> direction;
    @XmlElementRef(name = "cardinalDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> cardinalDirection;
    @XmlElementRef(name = "theManoeuvringAreaAvailability", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ManoeuvringAreaAvailabilityPropertyType> theManoeuvringAreaAvailability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<GuidanceLineDirectionExtensionType> extension;

    /**
     * Gets the value of the direction property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeDirectionType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeDirectionType> getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeDirectionType }{@code >}
     *
     */
    public void setDirection(JAXBElement<CodeDirectionType> value) {
        this.direction = value;
    }

    @Transient
    public boolean isSetDirection() {
        return (this.direction != null);
    }

    /**
     * Gets the value of the cardinalDirection property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeCardinalDirectionType }{@code >}
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
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *
     */
    public void setCardinalDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.cardinalDirection = value;
    }

    @Transient
    public boolean isSetCardinalDirection() {
        return (this.cardinalDirection != null);
    }

    /**
     * Gets the value of the theManoeuvringAreaAvailability property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link ManoeuvringAreaAvailabilityPropertyType }{@code >}
     *
     */
    @Transient
    public JAXBElement<ManoeuvringAreaAvailabilityPropertyType> getTheManoeuvringAreaAvailability() {
        return theManoeuvringAreaAvailability;
    }

    /**
     * Sets the value of the theManoeuvringAreaAvailability property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ManoeuvringAreaAvailabilityPropertyType
     *            }{@code >}
     *
     */
    public void setTheManoeuvringAreaAvailability(JAXBElement<ManoeuvringAreaAvailabilityPropertyType> value) {
        this.theManoeuvringAreaAvailability = value;
    }

    @Transient
    public boolean isSetTheManoeuvringAreaAvailability() {
        return (this.theManoeuvringAreaAvailability != null);
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
    @JoinTable(name = "gdnclndrctntp_annttn_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidancelinedirection_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link GuidanceLineDirectionExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = GuidanceLineDirectionExtensionType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "guidancelinedirection_oe_hjid", referencedColumnName = "hjid")
    public List<GuidanceLineDirectionExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<GuidanceLineDirectionExtensionType> extension) {
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
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "direction")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "directionnilreason"))})
    public CodeDirectionType getDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionType.class, this.getDirection());
    }

    public void setDirectionItem(CodeDirectionType target) {
        setDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "direction"), GuidanceLineDirectionType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "cardinaldirection")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "cardinaldirectionnilreason"))})
    public CodeCardinalDirectionType getCardinalDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCardinalDirectionType.class, this.getCardinalDirection());
    }

    public void setCardinalDirectionItem(CodeCardinalDirectionType target) {
        setCardinalDirection(XmlAdapterUtils.marshallJAXBElement(CodeCardinalDirectionType.class,
                new QName("http://www.aixm.aero/schema/5.2", "cardinalDirection"), GuidanceLineDirectionType.class,
                target));
    }

    @OneToOne(targetEntity = ManoeuvringAreaAvailabilityPropertyType.class, cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "gdnclndrctntp_thmnvrngaravlblt_link", schema = "airport_heliport", joinColumns = {
            @JoinColumn(name = "guidancelinedirection_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
                    @JoinColumn(name = "themanoeuvringareaavailability_hjid", referencedColumnName = "hjid")})
    public ManoeuvringAreaAvailabilityPropertyType getTheManoeuvringAreaAvailabilityItem() {
        return XmlAdapterUtils.unmarshallSource(ManoeuvringAreaAvailabilityPropertyType.class,
                this.getTheManoeuvringAreaAvailability());
    }

    public void setTheManoeuvringAreaAvailabilityItem(ManoeuvringAreaAvailabilityPropertyType target) {
        setTheManoeuvringAreaAvailability(
                XmlAdapterUtils.marshallJAXBElement(ManoeuvringAreaAvailabilityPropertyType.class,
                        new QName("http://www.aixm.aero/schema/5.2", "theManoeuvringAreaAvailability"),
                        GuidanceLineDirectionType.class, target));
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
        final GuidanceLineDirectionType that = ((GuidanceLineDirectionType) object);
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
            boolean lhsFieldIsSet = this.isSetDirection();
            boolean rhsFieldIsSet = that.isSetDirection();
            JAXBElement<CodeDirectionType> lhsField;
            lhsField = this.getDirection();
            JAXBElement<CodeDirectionType> rhsField;
            rhsField = that.getDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "direction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "direction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<GuidanceLineDirectionExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<GuidanceLineDirectionExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTheManoeuvringAreaAvailability();
            boolean rhsFieldIsSet = that.isSetTheManoeuvringAreaAvailability();
            JAXBElement<ManoeuvringAreaAvailabilityPropertyType> lhsField;
            lhsField = this.getTheManoeuvringAreaAvailability();
            JAXBElement<ManoeuvringAreaAvailabilityPropertyType> rhsField;
            rhsField = that.getTheManoeuvringAreaAvailability();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "theManoeuvringAreaAvailability",
                    lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "theManoeuvringAreaAvailability",
                    rhsField);
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
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeDirectionType> theField;
            theField = this.getDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "direction", theField);
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
            boolean theFieldIsSet = this.isSetTheManoeuvringAreaAvailability();
            JAXBElement<ManoeuvringAreaAvailabilityPropertyType> theField;
            theField = this.getTheManoeuvringAreaAvailability();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "theManoeuvringAreaAvailability", theField);
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
            List<GuidanceLineDirectionExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetDirection();
            JAXBElement<CodeDirectionType> theField;
            theField = this.getDirection();
            strategy.appendField(locator, this, "direction", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCardinalDirection();
            JAXBElement<CodeCardinalDirectionType> theField;
            theField = this.getCardinalDirection();
            strategy.appendField(locator, this, "cardinalDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTheManoeuvringAreaAvailability();
            JAXBElement<ManoeuvringAreaAvailabilityPropertyType> theField;
            theField = this.getTheManoeuvringAreaAvailability();
            strategy.appendField(locator, this, "theManoeuvringAreaAvailability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<GuidanceLineDirectionExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
