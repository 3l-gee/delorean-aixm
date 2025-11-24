
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractGMLType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractGMLType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <group ref="{http://www.opengis.net/gml/3.2}StandardObjectProperties"/>
 *       </sequence>
 *       <attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGMLType", propOrder = {
    "metaDataProperty",
    "description",
    "descriptionReference",
    "identifier",
    "name"
})
@XmlSeeAlso({
    AbstractTopologyType.class,
    CompositeValueType.class,
    AbstractGeometryType.class,
    AbstractTimeObjectType.class,
    BagType.class,
    ArrayType.class,
    AbstractTimeSliceType.class,
    DefinitionBaseType.class,
    AbstractFeatureType.class
})
@MappedSuperclass
public abstract class AbstractGMLType implements Equals, HashCode, ToString
{

    protected List<MetaDataPropertyType> metaDataProperty;
    protected StringOrRefType description;
    protected ReferenceType descriptionReference;
    protected CodeWithAuthorityType identifier;
    protected List<CodeType> name;
    /**
     * The attribute gml:id supports provision of a handle for the XML element representing a GML Object. Its use is mandatory for all GML objects. It is of XML type ID, so is constrained to be unique in the XML document within which it occurs.
     * 
     */
    @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the metaDataProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataPropertyType }
     * 
     * 
     */
    @Transient
    public List<MetaDataPropertyType> getMetaDataProperty() {
        if (metaDataProperty == null) {
            metaDataProperty = new ArrayList<>();
        }
        return this.metaDataProperty;
    }

    /**
     * 
     * 
     */
    public void setMetaDataProperty(List<MetaDataPropertyType> metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    @Embedded
    @jakarta.persistence.AttributeOverrides({ @jakarta.persistence.AttributeOverride(name = "value", column = @jakarta.persistence.Column(name = "description")), @jakarta.persistence.AttributeOverride(name = "nilReason", column = @jakarta.persistence.Column(name = "description_nilReason")), @jakarta.persistence.AttributeOverride(name = "href", column = @jakarta.persistence.Column(name = "description_href")) })
    public StringOrRefType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDescription(StringOrRefType value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    @Transient
    public ReferenceType getDescriptionReference() {
        return descriptionReference;
    }

    /**
     * Sets the value of the descriptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDescriptionReference(ReferenceType value) {
        this.descriptionReference = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    @Embedded
    public CodeWithAuthorityType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setIdentifier(CodeWithAuthorityType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    @Transient
    public List<CodeType> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * 
     * 
     */
    public void setName(List<CodeType> name) {
        this.name = name;
    }

    /**
     * The attribute gml:id supports provision of a handle for the XML element representing a GML Object. Its use is mandatory for all GML objects. It is of XML type ID, so is constrained to be unique in the XML document within which it occurs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ID", length = 255)
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AbstractGMLType that = ((AbstractGMLType) object);
        {
            boolean lhsFieldIsSet = (this.id!= null);
            boolean rhsFieldIsSet = (that.id!= null);
            String lhsField;
            lhsField = this.getId();
            String rhsField;
            rhsField = that.getId();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "id", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "id", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.name!= null)&&(!this.name.isEmpty()));
            boolean rhsFieldIsSet = ((that.name!= null)&&(!that.name.isEmpty()));
            List<CodeType> lhsField;
            lhsField = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            List<CodeType> rhsField;
            rhsField = (((that.name!= null)&&(!that.name.isEmpty()))?that.getName():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.description!= null);
            boolean rhsFieldIsSet = (that.description!= null);
            StringOrRefType lhsField;
            lhsField = this.getDescription();
            StringOrRefType rhsField;
            rhsField = that.getDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "description", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "description", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.identifier!= null);
            boolean rhsFieldIsSet = (that.identifier!= null);
            CodeWithAuthorityType lhsField;
            lhsField = this.getIdentifier();
            CodeWithAuthorityType rhsField;
            rhsField = that.getIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "identifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "identifier", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.metaDataProperty!= null)&&(!this.metaDataProperty.isEmpty()));
            boolean rhsFieldIsSet = ((that.metaDataProperty!= null)&&(!that.metaDataProperty.isEmpty()));
            List<MetaDataPropertyType> lhsField;
            lhsField = (((this.metaDataProperty!= null)&&(!this.metaDataProperty.isEmpty()))?this.getMetaDataProperty():null);
            List<MetaDataPropertyType> rhsField;
            rhsField = (((that.metaDataProperty!= null)&&(!that.metaDataProperty.isEmpty()))?that.getMetaDataProperty():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "metaDataProperty", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "metaDataProperty", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.descriptionReference!= null);
            boolean rhsFieldIsSet = (that.descriptionReference!= null);
            ReferenceType lhsField;
            lhsField = this.getDescriptionReference();
            ReferenceType rhsField;
            rhsField = that.getDescriptionReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "descriptionReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "descriptionReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = ((this.metaDataProperty!= null)&&(!this.metaDataProperty.isEmpty()));
            List<MetaDataPropertyType> theField;
            theField = (((this.metaDataProperty!= null)&&(!this.metaDataProperty.isEmpty()))?this.getMetaDataProperty():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "metaDataProperty", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.description!= null);
            StringOrRefType theField;
            theField = this.getDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "description", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.descriptionReference!= null);
            ReferenceType theField;
            theField = this.getDescriptionReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "descriptionReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.identifier!= null);
            CodeWithAuthorityType theField;
            theField = this.getIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "identifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.name!= null)&&(!this.name.isEmpty()));
            List<CodeType> theField;
            theField = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.id!= null);
            String theField;
            theField = this.getId();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "id", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = ((this.metaDataProperty!= null)&&(!this.metaDataProperty.isEmpty()));
            List<MetaDataPropertyType> theField;
            theField = (((this.metaDataProperty!= null)&&(!this.metaDataProperty.isEmpty()))?this.getMetaDataProperty():null);
            strategy.appendField(locator, this, "metaDataProperty", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.description!= null);
            StringOrRefType theField;
            theField = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.descriptionReference!= null);
            ReferenceType theField;
            theField = this.getDescriptionReference();
            strategy.appendField(locator, this, "descriptionReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.identifier!= null);
            CodeWithAuthorityType theField;
            theField = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.name!= null)&&(!this.name.isEmpty()));
            List<CodeType> theField;
            theField = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.id!= null);
            String theField;
            theField = this.getId();
            strategy.appendField(locator, this, "id", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
