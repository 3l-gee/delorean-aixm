
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
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
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
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

    public boolean isSetSpatialRepresentationType() {
        return ((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()));
    }

    public void unsetSpatialRepresentationType() {
        this.spatialRepresentationType = null;
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

    public boolean isSetSpatialResolution() {
        return ((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()));
    }

    public void unsetSpatialResolution() {
        this.spatialResolution = null;
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

    public boolean isSetLanguage() {
        return ((this.language!= null)&&(!this.language.isEmpty()));
    }

    public void unsetLanguage() {
        this.language = null;
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

    public boolean isSetCharacterSet() {
        return ((this.characterSet!= null)&&(!this.characterSet.isEmpty()));
    }

    public void unsetCharacterSet() {
        this.characterSet = null;
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

    public boolean isSetTopicCategory() {
        return ((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()));
    }

    public void unsetTopicCategory() {
        this.topicCategory = null;
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

    public boolean isSetEnvironmentDescription() {
        return (this.environmentDescription!= null);
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

    public boolean isSetExtent() {
        return ((this.extent!= null)&&(!this.extent.isEmpty()));
    }

    public void unsetExtent() {
        this.extent = null;
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

    public boolean isSetSupplementalInformation() {
        return (this.supplementalInformation!= null);
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
            boolean lhsFieldIsSet = this.isSetExtent();
            boolean rhsFieldIsSet = that.isSetExtent();
            List<EXExtentPropertyType> lhsField;
            lhsField = (this.isSetExtent()?this.getExtent():null);
            List<EXExtentPropertyType> rhsField;
            rhsField = (that.isSetExtent()?that.getExtent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpatialResolution();
            boolean rhsFieldIsSet = that.isSetSpatialResolution();
            List<MDResolutionPropertyType> lhsField;
            lhsField = (this.isSetSpatialResolution()?this.getSpatialResolution():null);
            List<MDResolutionPropertyType> rhsField;
            rhsField = (that.isSetSpatialResolution()?that.getSpatialResolution():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spatialResolution", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spatialResolution", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEnvironmentDescription();
            boolean rhsFieldIsSet = that.isSetEnvironmentDescription();
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
            boolean lhsFieldIsSet = this.isSetCharacterSet();
            boolean rhsFieldIsSet = that.isSetCharacterSet();
            List<MDCharacterSetCodePropertyType> lhsField;
            lhsField = (this.isSetCharacterSet()?this.getCharacterSet():null);
            List<MDCharacterSetCodePropertyType> rhsField;
            rhsField = (that.isSetCharacterSet()?that.getCharacterSet():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "characterSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "characterSet", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTopicCategory();
            boolean rhsFieldIsSet = that.isSetTopicCategory();
            List<MDTopicCategoryCodePropertyType> lhsField;
            lhsField = (this.isSetTopicCategory()?this.getTopicCategory():null);
            List<MDTopicCategoryCodePropertyType> rhsField;
            rhsField = (that.isSetTopicCategory()?that.getTopicCategory():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "topicCategory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "topicCategory", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSupplementalInformation();
            boolean rhsFieldIsSet = that.isSetSupplementalInformation();
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
            boolean lhsFieldIsSet = this.isSetLanguage();
            boolean rhsFieldIsSet = that.isSetLanguage();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetLanguage()?this.getLanguage():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetLanguage()?that.getLanguage():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "language", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "language", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpatialRepresentationType();
            boolean rhsFieldIsSet = that.isSetSpatialRepresentationType();
            List<MDSpatialRepresentationTypeCodePropertyType> lhsField;
            lhsField = (this.isSetSpatialRepresentationType()?this.getSpatialRepresentationType():null);
            List<MDSpatialRepresentationTypeCodePropertyType> rhsField;
            rhsField = (that.isSetSpatialRepresentationType()?that.getSpatialRepresentationType():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "spatialRepresentationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "spatialRepresentationType", rhsField);
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
            boolean theFieldIsSet = this.isSetSpatialRepresentationType();
            List<MDSpatialRepresentationTypeCodePropertyType> theField;
            theField = (this.isSetSpatialRepresentationType()?this.getSpatialRepresentationType():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spatialRepresentationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpatialResolution();
            List<MDResolutionPropertyType> theField;
            theField = (this.isSetSpatialResolution()?this.getSpatialResolution():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "spatialResolution", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLanguage();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetLanguage()?this.getLanguage():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "language", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCharacterSet();
            List<MDCharacterSetCodePropertyType> theField;
            theField = (this.isSetCharacterSet()?this.getCharacterSet():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "characterSet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTopicCategory();
            List<MDTopicCategoryCodePropertyType> theField;
            theField = (this.isSetTopicCategory()?this.getTopicCategory():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "topicCategory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnvironmentDescription();
            CharacterStringPropertyType theField;
            theField = this.getEnvironmentDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "environmentDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            List<EXExtentPropertyType> theField;
            theField = (this.isSetExtent()?this.getExtent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSupplementalInformation();
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
            boolean theFieldIsSet = this.isSetSpatialRepresentationType();
            List<MDSpatialRepresentationTypeCodePropertyType> theField;
            theField = (this.isSetSpatialRepresentationType()?this.getSpatialRepresentationType():null);
            strategy.appendField(locator, this, "spatialRepresentationType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpatialResolution();
            List<MDResolutionPropertyType> theField;
            theField = (this.isSetSpatialResolution()?this.getSpatialResolution():null);
            strategy.appendField(locator, this, "spatialResolution", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLanguage();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetLanguage()?this.getLanguage():null);
            strategy.appendField(locator, this, "language", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCharacterSet();
            List<MDCharacterSetCodePropertyType> theField;
            theField = (this.isSetCharacterSet()?this.getCharacterSet():null);
            strategy.appendField(locator, this, "characterSet", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTopicCategory();
            List<MDTopicCategoryCodePropertyType> theField;
            theField = (this.isSetTopicCategory()?this.getTopicCategory():null);
            strategy.appendField(locator, this, "topicCategory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnvironmentDescription();
            CharacterStringPropertyType theField;
            theField = this.getEnvironmentDescription();
            strategy.appendField(locator, this, "environmentDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtent();
            List<EXExtentPropertyType> theField;
            theField = (this.isSetExtent()?this.getExtent():null);
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSupplementalInformation();
            CharacterStringPropertyType theField;
            theField = this.getSupplementalInformation();
            strategy.appendField(locator, this, "supplementalInformation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
