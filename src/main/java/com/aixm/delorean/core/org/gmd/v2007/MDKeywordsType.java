
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
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
 * Keywords, their type and reference source
 * 
 * <p>Java class for MD_Keywords_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Keywords_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="keyword" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         <element name="type" type="{http://www.isotc211.org/2005/gmd}MD_KeywordTypeCode_PropertyType" minOccurs="0"/>
 *         <element name="thesaurusName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Keywords_Type", propOrder = {
    "keyword",
    "type",
    "thesaurusName"
})
public class MDKeywordsType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> keyword;
    protected MDKeywordTypeCodePropertyType type;
    protected CICitationPropertyType thesaurusName;

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<>();
        }
        return this.keyword;
    }

    /**
     * 
     * 
     */
    public void setKeyword(List<CharacterStringPropertyType> keyword) {
        this.keyword = keyword;
    }

    public boolean isSetKeyword() {
        return ((this.keyword!= null)&&(!this.keyword.isEmpty()));
    }

    public void unsetKeyword() {
        this.keyword = null;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public MDKeywordTypeCodePropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public void setType(MDKeywordTypeCodePropertyType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the thesaurusName property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getThesaurusName() {
        return thesaurusName;
    }

    /**
     * Sets the value of the thesaurusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setThesaurusName(CICitationPropertyType value) {
        this.thesaurusName = value;
    }

    public boolean isSetThesaurusName() {
        return (this.thesaurusName!= null);
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
        final MDKeywordsType that = ((MDKeywordsType) object);
        {
            boolean lhsFieldIsSet = this.isSetThesaurusName();
            boolean rhsFieldIsSet = that.isSetThesaurusName();
            CICitationPropertyType lhsField;
            lhsField = this.getThesaurusName();
            CICitationPropertyType rhsField;
            rhsField = that.getThesaurusName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "thesaurusName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "thesaurusName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetType();
            boolean rhsFieldIsSet = that.isSetType();
            MDKeywordTypeCodePropertyType lhsField;
            lhsField = this.getType();
            MDKeywordTypeCodePropertyType rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetKeyword();
            boolean rhsFieldIsSet = that.isSetKeyword();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetKeyword()?this.getKeyword():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetKeyword()?that.getKeyword():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "keyword", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "keyword", rhsField);
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
            boolean theFieldIsSet = this.isSetKeyword();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetKeyword()?this.getKeyword():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "keyword", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            MDKeywordTypeCodePropertyType theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThesaurusName();
            CICitationPropertyType theField;
            theField = this.getThesaurusName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "thesaurusName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetKeyword();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetKeyword()?this.getKeyword():null);
            strategy.appendField(locator, this, "keyword", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetType();
            MDKeywordTypeCodePropertyType theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetThesaurusName();
            CICitationPropertyType theField;
            theField = this.getThesaurusName();
            strategy.appendField(locator, this, "thesaurusName", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
