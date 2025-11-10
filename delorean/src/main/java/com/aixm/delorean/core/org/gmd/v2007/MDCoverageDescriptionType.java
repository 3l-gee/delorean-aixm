
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.RecordTypePropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information about the domain of the raster cell
 * 
 * <p>Java class for MD_CoverageDescription_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_CoverageDescription_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_ContentInformation_Type">
 *       <sequence>
 *         <element name="attributeDescription" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType"/>
 *         <element name="contentType" type="{http://www.isotc211.org/2005/gmd}MD_CoverageContentTypeCode_PropertyType"/>
 *         <element name="dimension" type="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_CoverageDescription_Type", propOrder = {
    "attributeDescription",
    "contentType",
    "dimension"
})
@XmlSeeAlso({
    MDImageDescriptionType.class
})
public class MDCoverageDescriptionType
    extends AbstractMDContentInformationType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected RecordTypePropertyType attributeDescription;
    @XmlElement(required = true)
    protected MDCoverageContentTypeCodePropertyType contentType;
    protected List<MDRangeDimensionPropertyType> dimension;

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setAttributeDescription(RecordTypePropertyType value) {
        this.attributeDescription = value;
    }

    public boolean isSetAttributeDescription() {
        return (this.attributeDescription!= null);
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public MDCoverageContentTypeCodePropertyType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public void setContentType(MDCoverageContentTypeCodePropertyType value) {
        this.contentType = value;
    }

    public boolean isSetContentType() {
        return (this.contentType!= null);
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRangeDimensionPropertyType }
     * 
     * 
     */
    public List<MDRangeDimensionPropertyType> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<>();
        }
        return this.dimension;
    }

    /**
     * 
     * 
     */
    public void setDimension(List<MDRangeDimensionPropertyType> dimension) {
        this.dimension = dimension;
    }

    public boolean isSetDimension() {
        return ((this.dimension!= null)&&(!this.dimension.isEmpty()));
    }

    public void unsetDimension() {
        this.dimension = null;
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
        final MDCoverageDescriptionType that = ((MDCoverageDescriptionType) object);
        {
            boolean lhsFieldIsSet = this.isSetAttributeDescription();
            boolean rhsFieldIsSet = that.isSetAttributeDescription();
            RecordTypePropertyType lhsField;
            lhsField = this.getAttributeDescription();
            RecordTypePropertyType rhsField;
            rhsField = that.getAttributeDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "attributeDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "attributeDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDimension();
            boolean rhsFieldIsSet = that.isSetDimension();
            List<MDRangeDimensionPropertyType> lhsField;
            lhsField = (this.isSetDimension()?this.getDimension():null);
            List<MDRangeDimensionPropertyType> rhsField;
            rhsField = (that.isSetDimension()?that.getDimension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dimension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dimension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetContentType();
            boolean rhsFieldIsSet = that.isSetContentType();
            MDCoverageContentTypeCodePropertyType lhsField;
            lhsField = this.getContentType();
            MDCoverageContentTypeCodePropertyType rhsField;
            rhsField = that.getContentType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "contentType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "contentType", rhsField);
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
            boolean theFieldIsSet = this.isSetAttributeDescription();
            RecordTypePropertyType theField;
            theField = this.getAttributeDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "attributeDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContentType();
            MDCoverageContentTypeCodePropertyType theField;
            theField = this.getContentType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "contentType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDimension();
            List<MDRangeDimensionPropertyType> theField;
            theField = (this.isSetDimension()?this.getDimension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dimension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAttributeDescription();
            RecordTypePropertyType theField;
            theField = this.getAttributeDescription();
            strategy.appendField(locator, this, "attributeDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetContentType();
            MDCoverageContentTypeCodePropertyType theField;
            theField = this.getContentType();
            strategy.appendField(locator, this, "contentType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDimension();
            List<MDRangeDimensionPropertyType> theField;
            theField = (this.isSetDimension()?this.getDimension():null);
            strategy.appendField(locator, this, "dimension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
