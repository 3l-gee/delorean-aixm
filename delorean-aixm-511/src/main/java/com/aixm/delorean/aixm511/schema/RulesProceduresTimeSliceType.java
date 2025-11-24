
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AssociationOverride;
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
 * <p>Java class for RulesProceduresTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RulesProceduresTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RulesProceduresPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRulesProceduresExtension"/>
 *                 </sequence>
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
@XmlType(name = "RulesProceduresTimeSliceType", propOrder = {
    "category",
    "title",
    "content",
    "affectedLocation",
    "affectedArea",
    "annotation",
    "extension"
})
@Entity(name = "RulesProceduresTimeSliceType")
@Table(name = "rulesprocedures_ts", schema = "rules_procedure")
public class RulesProceduresTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "category", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRuleProcedureType> category;
    @XmlElementRef(name = "title", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRuleProcedureTitleType> title;
    @XmlElementRef(name = "content", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<XHTMLType> content;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> affectedLocation;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> affectedArea;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RulesProceduresExtensionType> extension;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRuleProcedureType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRuleProcedureType> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRuleProcedureType }{@code >}
     *     
     */
    public void setCategory(JAXBElement<CodeRuleProcedureType> value) {
        this.category = value;
    }

    @Transient
    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRuleProcedureTitleType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRuleProcedureTitleType> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRuleProcedureTitleType }{@code >}
     *     
     */
    public void setTitle(JAXBElement<CodeRuleProcedureTitleType> value) {
        this.title = value;
    }

    @Transient
    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<XHTMLType> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}
     *     
     */
    public void setContent(JAXBElement<XHTMLType> value) {
        this.content = value;
    }

    @Transient
    public boolean isSetContent() {
        return (this.content!= null);
    }

    /**
     * Gets the value of the affectedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirportHeliportPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "affectedlocation_rulesprocedures_link", schema = "rules_procedure", joinColumns = {
        @JoinColumn(name = "affectedlocation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "rulesprocedurespropertygroup", referencedColumnName = "hjid")
    })
    public List<AirportHeliportPropertyType> getAffectedLocation() {
        if (affectedLocation == null) {
            affectedLocation = new ArrayList<>();
        }
        return this.affectedLocation;
    }

    /**
     * 
     * 
     */
    public void setAffectedLocation(List<AirportHeliportPropertyType> affectedLocation) {
        this.affectedLocation = affectedLocation;
    }

    @Transient
    public boolean isSetAffectedLocation() {
        return ((this.affectedLocation!= null)&&(!this.affectedLocation.isEmpty()));
    }

    public void unsetAffectedLocation() {
        this.affectedLocation = null;
    }

    /**
     * Gets the value of the affectedArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = AirspacePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "affectedarea_rulesprocedures_link", schema = "rules_procedure", joinColumns = {
        @JoinColumn(name = "affectedarea", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "rulesprocedurespropertygroup", referencedColumnName = "hjid")
    })
    public List<AirspacePropertyType> getAffectedArea() {
        if (affectedArea == null) {
            affectedArea = new ArrayList<>();
        }
        return this.affectedArea;
    }

    /**
     * 
     * 
     */
    public void setAffectedArea(List<AirspacePropertyType> affectedArea) {
        this.affectedArea = affectedArea;
    }

    @Transient
    public boolean isSetAffectedArea() {
        return ((this.affectedArea!= null)&&(!this.affectedArea.isEmpty()));
    }

    public void unsetAffectedArea() {
        this.affectedArea = null;
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
    @JoinTable(name = "annotation_rulesprocedures_link", schema = "rules_procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "rulesprocedurespropertygroup", referencedColumnName = "hjid")
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
     * {@link RulesProceduresExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RulesProceduresExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RulesProceduresExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RulesProceduresExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "category")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "category_nilreason"))
    })
    public CodeRuleProcedureType getCategoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRuleProcedureType.class, this.getCategory());
    }

    public void setCategoryItem(CodeRuleProcedureType target) {
        setCategory(XmlAdapterUtils.marshallJAXBElement(CodeRuleProcedureType.class, new QName("http://www.aixm.aero/schema/5.1.1", "category"), RulesProceduresTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "title")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "title_nilreason"))
    })
    public CodeRuleProcedureTitleType getTitleItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRuleProcedureTitleType.class, this.getTitle());
    }

    public void setTitleItem(CodeRuleProcedureTitleType target) {
        setTitle(XmlAdapterUtils.marshallJAXBElement(CodeRuleProcedureTitleType.class, new QName("http://www.aixm.aero/schema/5.1.1", "title"), RulesProceduresTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverride(name = "nilReason", column = @Column(name = "CONTENT_ITEM_NIL_REASON"))
    @AssociationOverride(name = "anyItems")
    public XHTMLType getContentItem() {
        return XmlAdapterUtils.unmarshallSource(XHTMLType.class, this.getContent());
    }

    public void setContentItem(XHTMLType target) {
        setContent(XmlAdapterUtils.marshallJAXBElement(XHTMLType.class, new QName("http://www.aixm.aero/schema/5.1.1", "content"), RulesProceduresTimeSliceType.class, target));
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
        final RulesProceduresTimeSliceType that = ((RulesProceduresTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetCategory();
            boolean rhsFieldIsSet = that.isSetCategory();
            JAXBElement<CodeRuleProcedureType> lhsField;
            lhsField = this.getCategory();
            JAXBElement<CodeRuleProcedureType> rhsField;
            rhsField = that.getCategory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "category", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "category", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RulesProceduresExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RulesProceduresExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContent();
            boolean rhsFieldIsSet = that.isSetContent();
            JAXBElement<XHTMLType> lhsField;
            lhsField = this.getContent();
            JAXBElement<XHTMLType> rhsField;
            rhsField = that.getContent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "content", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "content", rhsField);
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
            boolean lhsFieldIsSet = this.isSetTitle();
            boolean rhsFieldIsSet = that.isSetTitle();
            JAXBElement<CodeRuleProcedureTitleType> lhsField;
            lhsField = this.getTitle();
            JAXBElement<CodeRuleProcedureTitleType> rhsField;
            rhsField = that.getTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "title", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "title", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAffectedLocation();
            boolean rhsFieldIsSet = that.isSetAffectedLocation();
            List<AirportHeliportPropertyType> lhsField;
            lhsField = (this.isSetAffectedLocation()?this.getAffectedLocation():null);
            List<AirportHeliportPropertyType> rhsField;
            rhsField = (that.isSetAffectedLocation()?that.getAffectedLocation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "affectedLocation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "affectedLocation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAffectedArea();
            boolean rhsFieldIsSet = that.isSetAffectedArea();
            List<AirspacePropertyType> lhsField;
            lhsField = (this.isSetAffectedArea()?this.getAffectedArea():null);
            List<AirspacePropertyType> rhsField;
            rhsField = (that.isSetAffectedArea()?that.getAffectedArea():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "affectedArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "affectedArea", rhsField);
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
            boolean theFieldIsSet = this.isSetCategory();
            JAXBElement<CodeRuleProcedureType> theField;
            theField = this.getCategory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "category", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTitle();
            JAXBElement<CodeRuleProcedureTitleType> theField;
            theField = this.getTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "title", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContent();
            JAXBElement<XHTMLType> theField;
            theField = this.getContent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "content", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAffectedLocation();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAffectedLocation()?this.getAffectedLocation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "affectedLocation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAffectedArea();
            List<AirspacePropertyType> theField;
            theField = (this.isSetAffectedArea()?this.getAffectedArea():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "affectedArea", theField);
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
            List<RulesProceduresExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetCategory();
            JAXBElement<CodeRuleProcedureType> theField;
            theField = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTitle();
            JAXBElement<CodeRuleProcedureTitleType> theField;
            theField = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContent();
            JAXBElement<XHTMLType> theField;
            theField = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAffectedLocation();
            List<AirportHeliportPropertyType> theField;
            theField = (this.isSetAffectedLocation()?this.getAffectedLocation():null);
            strategy.appendField(locator, this, "affectedLocation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAffectedArea();
            List<AirspacePropertyType> theField;
            theField = (this.isSetAffectedArea()?this.getAffectedArea():null);
            strategy.appendField(locator, this, "affectedArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RulesProceduresExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
