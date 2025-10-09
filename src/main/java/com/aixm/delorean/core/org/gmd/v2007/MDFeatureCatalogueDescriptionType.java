
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.BooleanPropertyType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.GenericNamePropertyType;
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
 * Information identifing the feature catalogue
 * 
 * <p>Java class for MD_FeatureCatalogueDescription_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_FeatureCatalogueDescription_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_ContentInformation_Type">
 *       <sequence>
 *         <element name="complianceCode" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         <element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="includedWithDataset" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         <element name="featureTypes" type="{http://www.isotc211.org/2005/gco}GenericName_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureCatalogueCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_FeatureCatalogueDescription_Type", propOrder = {
    "complianceCode",
    "language",
    "includedWithDataset",
    "featureTypes",
    "featureCatalogueCitation"
})
public class MDFeatureCatalogueDescriptionType
    extends AbstractMDContentInformationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected BooleanPropertyType complianceCode;
    protected List<CharacterStringPropertyType> language;
    @XmlElement(required = true)
    protected BooleanPropertyType includedWithDataset;
    protected List<GenericNamePropertyType> featureTypes;
    @XmlElement(required = true)
    protected List<CICitationPropertyType> featureCatalogueCitation;

    /**
     * Gets the value of the complianceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getComplianceCode() {
        return complianceCode;
    }

    /**
     * Sets the value of the complianceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setComplianceCode(BooleanPropertyType value) {
        this.complianceCode = value;
    }

    public boolean isSetComplianceCode() {
        return (this.complianceCode!= null);
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
     * Gets the value of the includedWithDataset property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getIncludedWithDataset() {
        return includedWithDataset;
    }

    /**
     * Sets the value of the includedWithDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setIncludedWithDataset(BooleanPropertyType value) {
        this.includedWithDataset = value;
    }

    public boolean isSetIncludedWithDataset() {
        return (this.includedWithDataset!= null);
    }

    /**
     * Gets the value of the featureTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericNamePropertyType }
     * 
     * 
     */
    public List<GenericNamePropertyType> getFeatureTypes() {
        if (featureTypes == null) {
            featureTypes = new ArrayList<>();
        }
        return this.featureTypes;
    }

    /**
     * 
     * 
     */
    public void setFeatureTypes(List<GenericNamePropertyType> featureTypes) {
        this.featureTypes = featureTypes;
    }

    public boolean isSetFeatureTypes() {
        return ((this.featureTypes!= null)&&(!this.featureTypes.isEmpty()));
    }

    public void unsetFeatureTypes() {
        this.featureTypes = null;
    }

    /**
     * Gets the value of the featureCatalogueCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureCatalogueCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureCatalogueCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getFeatureCatalogueCitation() {
        if (featureCatalogueCitation == null) {
            featureCatalogueCitation = new ArrayList<>();
        }
        return this.featureCatalogueCitation;
    }

    /**
     * 
     * 
     */
    public void setFeatureCatalogueCitation(List<CICitationPropertyType> featureCatalogueCitation) {
        this.featureCatalogueCitation = featureCatalogueCitation;
    }

    public boolean isSetFeatureCatalogueCitation() {
        return ((this.featureCatalogueCitation!= null)&&(!this.featureCatalogueCitation.isEmpty()));
    }

    public void unsetFeatureCatalogueCitation() {
        this.featureCatalogueCitation = null;
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
        final MDFeatureCatalogueDescriptionType that = ((MDFeatureCatalogueDescriptionType) object);
        {
            boolean lhsFieldIsSet = this.isSetComplianceCode();
            boolean rhsFieldIsSet = that.isSetComplianceCode();
            BooleanPropertyType lhsField;
            lhsField = this.getComplianceCode();
            BooleanPropertyType rhsField;
            rhsField = that.getComplianceCode();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "complianceCode", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "complianceCode", rhsField);
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
            boolean lhsFieldIsSet = this.isSetIncludedWithDataset();
            boolean rhsFieldIsSet = that.isSetIncludedWithDataset();
            BooleanPropertyType lhsField;
            lhsField = this.getIncludedWithDataset();
            BooleanPropertyType rhsField;
            rhsField = that.getIncludedWithDataset();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "includedWithDataset", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "includedWithDataset", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFeatureCatalogueCitation();
            boolean rhsFieldIsSet = that.isSetFeatureCatalogueCitation();
            List<CICitationPropertyType> lhsField;
            lhsField = (this.isSetFeatureCatalogueCitation()?this.getFeatureCatalogueCitation():null);
            List<CICitationPropertyType> rhsField;
            rhsField = (that.isSetFeatureCatalogueCitation()?that.getFeatureCatalogueCitation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureCatalogueCitation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureCatalogueCitation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFeatureTypes();
            boolean rhsFieldIsSet = that.isSetFeatureTypes();
            List<GenericNamePropertyType> lhsField;
            lhsField = (this.isSetFeatureTypes()?this.getFeatureTypes():null);
            List<GenericNamePropertyType> rhsField;
            rhsField = (that.isSetFeatureTypes()?that.getFeatureTypes():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "featureTypes", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "featureTypes", rhsField);
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
            boolean theFieldIsSet = this.isSetComplianceCode();
            BooleanPropertyType theField;
            theField = this.getComplianceCode();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "complianceCode", theField);
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
            boolean theFieldIsSet = this.isSetIncludedWithDataset();
            BooleanPropertyType theField;
            theField = this.getIncludedWithDataset();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "includedWithDataset", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureTypes();
            List<GenericNamePropertyType> theField;
            theField = (this.isSetFeatureTypes()?this.getFeatureTypes():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureTypes", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureCatalogueCitation();
            List<CICitationPropertyType> theField;
            theField = (this.isSetFeatureCatalogueCitation()?this.getFeatureCatalogueCitation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "featureCatalogueCitation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetComplianceCode();
            BooleanPropertyType theField;
            theField = this.getComplianceCode();
            strategy.appendField(locator, this, "complianceCode", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLanguage();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetLanguage()?this.getLanguage():null);
            strategy.appendField(locator, this, "language", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetIncludedWithDataset();
            BooleanPropertyType theField;
            theField = this.getIncludedWithDataset();
            strategy.appendField(locator, this, "includedWithDataset", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureTypes();
            List<GenericNamePropertyType> theField;
            theField = (this.isSetFeatureTypes()?this.getFeatureTypes():null);
            strategy.appendField(locator, this, "featureTypes", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFeatureCatalogueCitation();
            List<CICitationPropertyType> theField;
            theField = (this.isSetFeatureCatalogueCitation()?this.getFeatureCatalogueCitation():null);
            strategy.appendField(locator, this, "featureCatalogueCitation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
