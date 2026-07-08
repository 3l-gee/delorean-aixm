
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
 * Java class for CourseGroupType complex type
 * </p>
 * .
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 *
 * <pre>{@code
 * <complexType name="CourseGroupType">
 *   <complexContent>
 *     <extension base=
"{http://www.aixm.aero/schema/5.2}AbstractAIXMObjectType">
 *       <sequence>
 *         <element name="course" type=
"{http://www.aixm.aero/schema/5.2}ValBearingType" minOccurs="0"/>
 *         <element name="courseType" type=
"{http://www.aixm.aero/schema/5.2}CodeCourseType" minOccurs="0"/>
 *         <element name="courseDirection" type=
"{http://www.aixm.aero/schema/5.2}CodeDirectionReferenceType" minOccurs="0"/>
 *         <element name="annotation" type=
"{http://www.aixm.aero/schema/5.2}NotePropertyType" maxOccurs=
"unbounded" minOccurs="0"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref=
"{http://www.aixm.aero/schema/5.2}AbstractCourseGroupExtension"/>
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
@XmlType(name = "CourseGroupType", propOrder = {"course", "courseType", "courseDirection", "annotation", "extension"})
@Entity(name = "CourseGroupType")
@Table(name = "coursegroup_o", schema = "procedure")
public class CourseGroupType extends AbstractAIXMObjectType implements Serializable {

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "course", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> course;
    @XmlElementRef(name = "courseType", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> courseType;
    @XmlElementRef(name = "courseDirection", namespace = "http://www.aixm.aero/schema/5.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionReferenceType> courseDirection;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<CourseGroupExtensionType> extension;

    /**
     * Gets the value of the course property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ValBearingType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<ValBearingType> getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link ValBearingType }{@code >}
     *
     */
    public void setCourse(JAXBElement<ValBearingType> value) {
        this.course = value;
    }

    @Transient
    public boolean isSetCourse() {
        return (this.course != null);
    }

    /**
     * Gets the value of the courseType property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link CodeCourseType
     *         }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeCourseType> getCourseType() {
        return courseType;
    }

    /**
     * Sets the value of the courseType property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeCourseType }{@code >}
     *
     */
    public void setCourseType(JAXBElement<CodeCourseType> value) {
        this.courseType = value;
    }

    @Transient
    public boolean isSetCourseType() {
        return (this.courseType != null);
    }

    /**
     * Gets the value of the courseDirection property.
     *
     * @return possible object is {@link JAXBElement
     *         }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *
     */
    @Transient
    public JAXBElement<CodeDirectionReferenceType> getCourseDirection() {
        return courseDirection;
    }

    /**
     * Sets the value of the courseDirection property.
     *
     * @param value
     *            allowed object is {@link JAXBElement
     *            }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *
     */
    public void setCourseDirection(JAXBElement<CodeDirectionReferenceType> value) {
        this.courseDirection = value;
    }

    @Transient
    public boolean isSetCourseDirection() {
        return (this.courseDirection != null);
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
    @JoinTable(name = "crsgrptp_annttn_link", schema = "procedure", joinColumns = {
            @JoinColumn(name = "coursegroup_o_hjid", referencedColumnName = "hjid")}, inverseJoinColumns = {
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
     * {@link CourseGroupExtensionType }
     *
     *
     */
    @OneToMany(targetEntity = CourseGroupExtensionType.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "coursegroup_oe_hjid", referencedColumnName = "hjid")
    public List<CourseGroupExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     *
     *
     */
    public void setExtension(List<CourseGroupExtensionType> extension) {
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
            @AttributeOverride(name = "value", column = @Column(name = "course", columnDefinition = "NUMERIC")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "coursenilreason")),
            @AttributeOverride(name = "accuracy", column = @Column(name = "courseaccuracy"))})
    public ValBearingType getCourseItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getCourse());
    }

    public void setCourseItem(ValBearingType target) {
        setCourse(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class,
                new QName("http://www.aixm.aero/schema/5.2", "course"), CourseGroupType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "coursetype")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "coursetypenilreason"))})
    public CodeCourseType getCourseTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeCourseType.class, this.getCourseType());
    }

    public void setCourseTypeItem(CodeCourseType target) {
        setCourseType(XmlAdapterUtils.marshallJAXBElement(CodeCourseType.class,
                new QName("http://www.aixm.aero/schema/5.2", "courseType"), CourseGroupType.class, target));
    }

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "value", column = @Column(name = "coursedirection")),
            @AttributeOverride(name = "nilReason", column = @Column(name = "coursedirectionnilreason"))})
    public CodeDirectionReferenceType getCourseDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionReferenceType.class, this.getCourseDirection());
    }

    public void setCourseDirectionItem(CodeDirectionReferenceType target) {
        setCourseDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionReferenceType.class,
                new QName("http://www.aixm.aero/schema/5.2", "courseDirection"), CourseGroupType.class, target));
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
        final CourseGroupType that = ((CourseGroupType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<CourseGroupExtensionType> lhsField;
            lhsField = (this.isSetExtension() ? this.getExtension() : null);
            List<CourseGroupExtensionType> rhsField;
            rhsField = (that.isSetExtension() ? that.getExtension() : null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourseDirection();
            boolean rhsFieldIsSet = that.isSetCourseDirection();
            JAXBElement<CodeDirectionReferenceType> lhsField;
            lhsField = this.getCourseDirection();
            JAXBElement<CodeDirectionReferenceType> rhsField;
            rhsField = that.getCourseDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseDirection", rhsField);
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
            boolean lhsFieldIsSet = this.isSetCourseType();
            boolean rhsFieldIsSet = that.isSetCourseType();
            JAXBElement<CodeCourseType> lhsField;
            lhsField = this.getCourseType();
            JAXBElement<CodeCourseType> rhsField;
            rhsField = that.getCourseType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "courseType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "courseType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCourse();
            boolean rhsFieldIsSet = that.isSetCourse();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getCourse();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getCourse();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "course", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "course", rhsField);
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
            boolean theFieldIsSet = this.isSetCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getCourse();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "course", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getCourseType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseDirection();
            JAXBElement<CodeDirectionReferenceType> theField;
            theField = this.getCourseDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "courseDirection", theField);
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
            List<CourseGroupExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetCourse();
            JAXBElement<ValBearingType> theField;
            theField = this.getCourse();
            strategy.appendField(locator, this, "course", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseType();
            JAXBElement<CodeCourseType> theField;
            theField = this.getCourseType();
            strategy.appendField(locator, this, "courseType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCourseDirection();
            JAXBElement<CodeDirectionReferenceType> theField;
            theField = this.getCourseDirection();
            strategy.appendField(locator, this, "courseDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation() ? this.getAnnotation() : null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<CourseGroupExtensionType> theField;
            theField = (this.isSetExtension() ? this.getExtension() : null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
