
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.ObjectReferencePropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
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
 * Description of the class of information covered by the information
 * 
 * <p>Java class for MD_ScopeDescription_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_ScopeDescription_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="attributes" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         <element name="features" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         <element name="featureInstances" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         <element name="attributeInstances" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         <element name="dataset" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="other" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ScopeDescription_Type", propOrder = {
    "attributes",
    "features",
    "featureInstances",
    "attributeInstances",
    "dataset",
    "other"
})
public class MDScopeDescriptionType implements Equals, HashCode, ToString
{

    protected List<ObjectReferencePropertyType> attributes;
    protected List<ObjectReferencePropertyType> features;
    protected List<ObjectReferencePropertyType> featureInstances;
    protected List<ObjectReferencePropertyType> attributeInstances;
    protected CharacterStringPropertyType dataset;
    protected CharacterStringPropertyType other;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return this.attributes;
    }

    /**
     * 
     * 
     */
    public void setAttributes(List<ObjectReferencePropertyType> attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatures() {
        if (features == null) {
            features = new ArrayList<>();
        }
        return this.features;
    }

    /**
     * 
     * 
     */
    public void setFeatures(List<ObjectReferencePropertyType> features) {
        this.features = features;
    }

    /**
     * Gets the value of the featureInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureInstances() {
        if (featureInstances == null) {
            featureInstances = new ArrayList<>();
        }
        return this.featureInstances;
    }

    /**
     * 
     * 
     */
    public void setFeatureInstances(List<ObjectReferencePropertyType> featureInstances) {
        this.featureInstances = featureInstances;
    }

    /**
     * Gets the value of the attributeInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getAttributeInstances() {
        if (attributeInstances == null) {
            attributeInstances = new ArrayList<>();
        }
        return this.attributeInstances;
    }

    /**
     * 
     * 
     */
    public void setAttributeInstances(List<ObjectReferencePropertyType> attributeInstances) {
        this.attributeInstances = attributeInstances;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataset(CharacterStringPropertyType value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOther(CharacterStringPropertyType value) {
        this.other = value;
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
        final MDScopeDescriptionType that = ((MDScopeDescriptionType) object);
        {
            boolean lhsFieldIsSet = ((this.attributes!= null)&&(!this.attributes.isEmpty()));
            boolean rhsFieldIsSet = ((that.attributes!= null)&&(!that.attributes.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.attributes!= null)&&(!this.attributes.isEmpty()))?this.getAttributes():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.attributes!= null)&&(!that.attributes.isEmpty()))?that.getAttributes():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "attributes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "attributes", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()));
            boolean rhsFieldIsSet = ((that.featureInstances!= null)&&(!that.featureInstances.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()))?this.getFeatureInstances():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.featureInstances!= null)&&(!that.featureInstances.isEmpty()))?that.getFeatureInstances():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureInstances", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureInstances", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.dataset!= null);
            boolean rhsFieldIsSet = (that.dataset!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getDataset();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDataset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()));
            boolean rhsFieldIsSet = ((that.attributeInstances!= null)&&(!that.attributeInstances.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()))?this.getAttributeInstances():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.attributeInstances!= null)&&(!that.attributeInstances.isEmpty()))?that.getAttributeInstances():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "attributeInstances", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "attributeInstances", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.other!= null);
            boolean rhsFieldIsSet = (that.other!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getOther();
            CharacterStringPropertyType rhsField;
            rhsField = that.getOther();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "other", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "other", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.features!= null)&&(!this.features.isEmpty()));
            boolean rhsFieldIsSet = ((that.features!= null)&&(!that.features.isEmpty()));
            List<ObjectReferencePropertyType> lhsField;
            lhsField = (((this.features!= null)&&(!this.features.isEmpty()))?this.getFeatures():null);
            List<ObjectReferencePropertyType> rhsField;
            rhsField = (((that.features!= null)&&(!that.features.isEmpty()))?that.getFeatures():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "features", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "features", rhsField);
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
            boolean theFieldIsSet = ((this.attributes!= null)&&(!this.attributes.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.attributes!= null)&&(!this.attributes.isEmpty()))?this.getAttributes():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "attributes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.features!= null)&&(!this.features.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.features!= null)&&(!this.features.isEmpty()))?this.getFeatures():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "features", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()))?this.getFeatureInstances():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureInstances", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()))?this.getAttributeInstances():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "attributeInstances", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataset!= null);
            CharacterStringPropertyType theField;
            theField = this.getDataset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.other!= null);
            CharacterStringPropertyType theField;
            theField = this.getOther();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "other", theField);
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
            boolean theFieldIsSet = ((this.attributes!= null)&&(!this.attributes.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.attributes!= null)&&(!this.attributes.isEmpty()))?this.getAttributes():null);
            strategy.appendField(locator, this, "attributes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.features!= null)&&(!this.features.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.features!= null)&&(!this.features.isEmpty()))?this.getFeatures():null);
            strategy.appendField(locator, this, "features", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()))?this.getFeatureInstances():null);
            strategy.appendField(locator, this, "featureInstances", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()));
            List<ObjectReferencePropertyType> theField;
            theField = (((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()))?this.getAttributeInstances():null);
            strategy.appendField(locator, this, "attributeInstances", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dataset!= null);
            CharacterStringPropertyType theField;
            theField = this.getDataset();
            strategy.appendField(locator, this, "dataset", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.other!= null);
            CharacterStringPropertyType theField;
            theField = this.getOther();
            strategy.appendField(locator, this, "other", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
