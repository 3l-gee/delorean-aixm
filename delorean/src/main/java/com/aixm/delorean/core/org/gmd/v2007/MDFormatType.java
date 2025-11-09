
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
 * Description of the form of the data to be distributed
 * 
 * <p>Java class for MD_Format_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Format_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="version" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="amendmentNumber" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="specification" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="fileDecompressionTechnique" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="formatDistributor" type="{http://www.isotc211.org/2005/gmd}MD_Distributor_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Format_Type", propOrder = {
    "name",
    "version",
    "amendmentNumber",
    "specification",
    "fileDecompressionTechnique",
    "formatDistributor"
})
public class MDFormatType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    @XmlElement(required = true)
    protected CharacterStringPropertyType version;
    protected CharacterStringPropertyType amendmentNumber;
    protected CharacterStringPropertyType specification;
    protected CharacterStringPropertyType fileDecompressionTechnique;
    protected List<MDDistributorPropertyType> formatDistributor;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setVersion(CharacterStringPropertyType value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    /**
     * Gets the value of the amendmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAmendmentNumber() {
        return amendmentNumber;
    }

    /**
     * Sets the value of the amendmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAmendmentNumber(CharacterStringPropertyType value) {
        this.amendmentNumber = value;
    }

    public boolean isSetAmendmentNumber() {
        return (this.amendmentNumber!= null);
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecification(CharacterStringPropertyType value) {
        this.specification = value;
    }

    public boolean isSetSpecification() {
        return (this.specification!= null);
    }

    /**
     * Gets the value of the fileDecompressionTechnique property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileDecompressionTechnique() {
        return fileDecompressionTechnique;
    }

    /**
     * Sets the value of the fileDecompressionTechnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileDecompressionTechnique(CharacterStringPropertyType value) {
        this.fileDecompressionTechnique = value;
    }

    public boolean isSetFileDecompressionTechnique() {
        return (this.fileDecompressionTechnique!= null);
    }

    /**
     * Gets the value of the formatDistributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatDistributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatDistributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDistributorPropertyType }
     * 
     * 
     */
    public List<MDDistributorPropertyType> getFormatDistributor() {
        if (formatDistributor == null) {
            formatDistributor = new ArrayList<>();
        }
        return this.formatDistributor;
    }

    /**
     * 
     * 
     */
    public void setFormatDistributor(List<MDDistributorPropertyType> formatDistributor) {
        this.formatDistributor = formatDistributor;
    }

    public boolean isSetFormatDistributor() {
        return ((this.formatDistributor!= null)&&(!this.formatDistributor.isEmpty()));
    }

    public void unsetFormatDistributor() {
        this.formatDistributor = null;
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
        final MDFormatType that = ((MDFormatType) object);
        {
            boolean lhsFieldIsSet = this.isSetFileDecompressionTechnique();
            boolean rhsFieldIsSet = that.isSetFileDecompressionTechnique();
            CharacterStringPropertyType lhsField;
            lhsField = this.getFileDecompressionTechnique();
            CharacterStringPropertyType rhsField;
            rhsField = that.getFileDecompressionTechnique();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileDecompressionTechnique", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileDecompressionTechnique", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFormatDistributor();
            boolean rhsFieldIsSet = that.isSetFormatDistributor();
            List<MDDistributorPropertyType> lhsField;
            lhsField = (this.isSetFormatDistributor()?this.getFormatDistributor():null);
            List<MDDistributorPropertyType> rhsField;
            rhsField = (that.isSetFormatDistributor()?that.getFormatDistributor():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "formatDistributor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "formatDistributor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetName();
            boolean rhsFieldIsSet = that.isSetName();
            CharacterStringPropertyType lhsField;
            lhsField = this.getName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetVersion();
            boolean rhsFieldIsSet = that.isSetVersion();
            CharacterStringPropertyType lhsField;
            lhsField = this.getVersion();
            CharacterStringPropertyType rhsField;
            rhsField = that.getVersion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "version", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "version", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSpecification();
            boolean rhsFieldIsSet = that.isSetSpecification();
            CharacterStringPropertyType lhsField;
            lhsField = this.getSpecification();
            CharacterStringPropertyType rhsField;
            rhsField = that.getSpecification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "specification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "specification", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAmendmentNumber();
            boolean rhsFieldIsSet = that.isSetAmendmentNumber();
            CharacterStringPropertyType lhsField;
            lhsField = this.getAmendmentNumber();
            CharacterStringPropertyType rhsField;
            rhsField = that.getAmendmentNumber();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "amendmentNumber", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "amendmentNumber", rhsField);
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
            boolean theFieldIsSet = this.isSetName();
            CharacterStringPropertyType theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVersion();
            CharacterStringPropertyType theField;
            theField = this.getVersion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "version", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAmendmentNumber();
            CharacterStringPropertyType theField;
            theField = this.getAmendmentNumber();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "amendmentNumber", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecification();
            CharacterStringPropertyType theField;
            theField = this.getSpecification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "specification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileDecompressionTechnique();
            CharacterStringPropertyType theField;
            theField = this.getFileDecompressionTechnique();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileDecompressionTechnique", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFormatDistributor();
            List<MDDistributorPropertyType> theField;
            theField = (this.isSetFormatDistributor()?this.getFormatDistributor():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "formatDistributor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetName();
            CharacterStringPropertyType theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetVersion();
            CharacterStringPropertyType theField;
            theField = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAmendmentNumber();
            CharacterStringPropertyType theField;
            theField = this.getAmendmentNumber();
            strategy.appendField(locator, this, "amendmentNumber", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSpecification();
            CharacterStringPropertyType theField;
            theField = this.getSpecification();
            strategy.appendField(locator, this, "specification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileDecompressionTechnique();
            CharacterStringPropertyType theField;
            theField = this.getFileDecompressionTechnique();
            strategy.appendField(locator, this, "fileDecompressionTechnique", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFormatDistributor();
            List<MDDistributorPropertyType> theField;
            theField = (this.isSetFormatDistributor()?this.getFormatDistributor():null);
            strategy.appendField(locator, this, "formatDistributor", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
