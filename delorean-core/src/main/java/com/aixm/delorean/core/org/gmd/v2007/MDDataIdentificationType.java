
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for MD_DataIdentification_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_DataIdentification_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_Identification_Type">
 *       <sequence>
 *         <element name="spatialRepresentationType" type="{http://www.isotc211.org/2005/gmd}MD_SpatialRepresentationTypeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="spatialResolution" type="{http://www.isotc211.org/2005/gmd}MD_Resolution_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         <element name="characterSet" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="topicCategory" type="{http://www.isotc211.org/2005/gmd}MD_TopicCategoryCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="environmentDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="supplementalInformation" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DataIdentification_Type", propOrder = {
    "spatialRepresentationType",
    "spatialResolution",
    "language",
    "characterSet",
    "topicCategory",
    "environmentDescription",
    "extent",
    "supplementalInformation"
})
public class MDDataIdentificationType
    extends AbstractMDIdentificationType
{

    protected List<MDSpatialRepresentationTypeCodePropertyType> spatialRepresentationType;
    protected List<MDResolutionPropertyType> spatialResolution;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> language;
    protected List<MDCharacterSetCodePropertyType> characterSet;
    protected List<MDTopicCategoryCodePropertyType> topicCategory;
    protected CharacterStringPropertyType environmentDescription;
    protected List<EXExtentPropertyType> extent;
    protected CharacterStringPropertyType supplementalInformation;

    /**
     * Gets the value of the spatialRepresentationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationTypeCodePropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationTypeCodePropertyType> getSpatialRepresentationType() {
        if (spatialRepresentationType == null) {
            spatialRepresentationType = new ArrayList<>();
        }
        return this.spatialRepresentationType;
    }

    /**
     * 
     * 
     */
    public void setSpatialRepresentationType(List<MDSpatialRepresentationTypeCodePropertyType> spatialRepresentationType) {
        this.spatialRepresentationType = spatialRepresentationType;
    }

    /**
     * Gets the value of the spatialResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDResolutionPropertyType }
     * 
     * 
     */
    public List<MDResolutionPropertyType> getSpatialResolution() {
        if (spatialResolution == null) {
            spatialResolution = new ArrayList<>();
        }
        return this.spatialResolution;
    }

    /**
     * 
     * 
     */
    public void setSpatialResolution(List<MDResolutionPropertyType> spatialResolution) {
        this.spatialResolution = spatialResolution;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getLanguage() {
        if (language == null) {
            language = new ArrayList<>();
        }
        return this.language;
    }

    /**
     * 
     * 
     */
    public void setLanguage(List<CharacterStringPropertyType> language) {
        this.language = language;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characterSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacterSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDCharacterSetCodePropertyType }
     * 
     * 
     */
    public List<MDCharacterSetCodePropertyType> getCharacterSet() {
        if (characterSet == null) {
            characterSet = new ArrayList<>();
        }
        return this.characterSet;
    }

    /**
     * 
     * 
     */
    public void setCharacterSet(List<MDCharacterSetCodePropertyType> characterSet) {
        this.characterSet = characterSet;
    }

    /**
     * Gets the value of the topicCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDTopicCategoryCodePropertyType }
     * 
     * 
     */
    public List<MDTopicCategoryCodePropertyType> getTopicCategory() {
        if (topicCategory == null) {
            topicCategory = new ArrayList<>();
        }
        return this.topicCategory;
    }

    /**
     * 
     * 
     */
    public void setTopicCategory(List<MDTopicCategoryCodePropertyType> topicCategory) {
        this.topicCategory = topicCategory;
    }

    /**
     * Gets the value of the environmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEnvironmentDescription() {
        return environmentDescription;
    }

    /**
     * Sets the value of the environmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEnvironmentDescription(CharacterStringPropertyType value) {
        this.environmentDescription = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<>();
        }
        return this.extent;
    }

    /**
     * 
     * 
     */
    public void setExtent(List<EXExtentPropertyType> extent) {
        this.extent = extent;
    }

    /**
     * Gets the value of the supplementalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSupplementalInformation() {
        return supplementalInformation;
    }

    /**
     * Sets the value of the supplementalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSupplementalInformation(CharacterStringPropertyType value) {
        this.supplementalInformation = value;
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
        final MDDataIdentificationType that = ((MDDataIdentificationType) object);
        {
            boolean lhsFieldIsSet = (this.supplementalInformation!= null);
            boolean rhsFieldIsSet = (that.supplementalInformation!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getSupplementalInformation();
            CharacterStringPropertyType rhsField;
            rhsField = that.getSupplementalInformation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "supplementalInformation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "supplementalInformation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()));
            boolean rhsFieldIsSet = ((that.spatialRepresentationType!= null)&&(!that.spatialRepresentationType.isEmpty()));
            List<MDSpatialRepresentationTypeCodePropertyType> lhsField;
            lhsField = (((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()))?this.getSpatialRepresentationType():null);
            List<MDSpatialRepresentationTypeCodePropertyType> rhsField;
            rhsField = (((that.spatialRepresentationType!= null)&&(!that.spatialRepresentationType.isEmpty()))?that.getSpatialRepresentationType():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spatialRepresentationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spatialRepresentationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()));
            boolean rhsFieldIsSet = ((that.spatialResolution!= null)&&(!that.spatialResolution.isEmpty()));
            List<MDResolutionPropertyType> lhsField;
            lhsField = (((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()))?this.getSpatialResolution():null);
            List<MDResolutionPropertyType> rhsField;
            rhsField = (((that.spatialResolution!= null)&&(!that.spatialResolution.isEmpty()))?that.getSpatialResolution():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spatialResolution", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spatialResolution", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.environmentDescription!= null);
            boolean rhsFieldIsSet = (that.environmentDescription!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getEnvironmentDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getEnvironmentDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "environmentDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "environmentDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()));
            boolean rhsFieldIsSet = ((that.topicCategory!= null)&&(!that.topicCategory.isEmpty()));
            List<MDTopicCategoryCodePropertyType> lhsField;
            lhsField = (((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()))?this.getTopicCategory():null);
            List<MDTopicCategoryCodePropertyType> rhsField;
            rhsField = (((that.topicCategory!= null)&&(!that.topicCategory.isEmpty()))?that.getTopicCategory():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "topicCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "topicCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.language!= null)&&(!this.language.isEmpty()));
            boolean rhsFieldIsSet = ((that.language!= null)&&(!that.language.isEmpty()));
            List<CharacterStringPropertyType> lhsField;
            lhsField = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (((that.language!= null)&&(!that.language.isEmpty()))?that.getLanguage():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "language", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "language", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.characterSet!= null)&&(!this.characterSet.isEmpty()));
            boolean rhsFieldIsSet = ((that.characterSet!= null)&&(!that.characterSet.isEmpty()));
            List<MDCharacterSetCodePropertyType> lhsField;
            lhsField = (((this.characterSet!= null)&&(!this.characterSet.isEmpty()))?this.getCharacterSet():null);
            List<MDCharacterSetCodePropertyType> rhsField;
            rhsField = (((that.characterSet!= null)&&(!that.characterSet.isEmpty()))?that.getCharacterSet():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "characterSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "characterSet", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.extent!= null)&&(!this.extent.isEmpty()));
            boolean rhsFieldIsSet = ((that.extent!= null)&&(!that.extent.isEmpty()));
            List<EXExtentPropertyType> lhsField;
            lhsField = (((this.extent!= null)&&(!this.extent.isEmpty()))?this.getExtent():null);
            List<EXExtentPropertyType> rhsField;
            rhsField = (((that.extent!= null)&&(!that.extent.isEmpty()))?that.getExtent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
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
            boolean theFieldIsSet = ((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()));
            List<MDSpatialRepresentationTypeCodePropertyType> theField;
            theField = (((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()))?this.getSpatialRepresentationType():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spatialRepresentationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()));
            List<MDResolutionPropertyType> theField;
            theField = (((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()))?this.getSpatialResolution():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spatialResolution", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.language!= null)&&(!this.language.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "language", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.characterSet!= null)&&(!this.characterSet.isEmpty()));
            List<MDCharacterSetCodePropertyType> theField;
            theField = (((this.characterSet!= null)&&(!this.characterSet.isEmpty()))?this.getCharacterSet():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "characterSet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()));
            List<MDTopicCategoryCodePropertyType> theField;
            theField = (((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()))?this.getTopicCategory():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "topicCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.environmentDescription!= null);
            CharacterStringPropertyType theField;
            theField = this.getEnvironmentDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "environmentDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.extent!= null)&&(!this.extent.isEmpty()));
            List<EXExtentPropertyType> theField;
            theField = (((this.extent!= null)&&(!this.extent.isEmpty()))?this.getExtent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.supplementalInformation!= null);
            CharacterStringPropertyType theField;
            theField = this.getSupplementalInformation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "supplementalInformation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = ((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()));
            List<MDSpatialRepresentationTypeCodePropertyType> theField;
            theField = (((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()))?this.getSpatialRepresentationType():null);
            strategy.appendField(locator, this, "spatialRepresentationType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()));
            List<MDResolutionPropertyType> theField;
            theField = (((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()))?this.getSpatialResolution():null);
            strategy.appendField(locator, this, "spatialResolution", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.language!= null)&&(!this.language.isEmpty()));
            List<CharacterStringPropertyType> theField;
            theField = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            strategy.appendField(locator, this, "language", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.characterSet!= null)&&(!this.characterSet.isEmpty()));
            List<MDCharacterSetCodePropertyType> theField;
            theField = (((this.characterSet!= null)&&(!this.characterSet.isEmpty()))?this.getCharacterSet():null);
            strategy.appendField(locator, this, "characterSet", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()));
            List<MDTopicCategoryCodePropertyType> theField;
            theField = (((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()))?this.getTopicCategory():null);
            strategy.appendField(locator, this, "topicCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.environmentDescription!= null);
            CharacterStringPropertyType theField;
            theField = this.getEnvironmentDescription();
            strategy.appendField(locator, this, "environmentDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.extent!= null)&&(!this.extent.isEmpty()));
            List<EXExtentPropertyType> theField;
            theField = (((this.extent!= null)&&(!this.extent.isEmpty()))?this.getExtent():null);
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.supplementalInformation!= null);
            CharacterStringPropertyType theField;
            theField = this.getSupplementalInformation();
            strategy.appendField(locator, this, "supplementalInformation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
