
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Information describing metadata extensions.
 * 
 * <p>Java class for MD_MetadataExtensionInformation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_MetadataExtensionInformation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="extensionOnLineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/>
 *         <element name="extendedElementInformation" type="{http://www.isotc211.org/2005/gmd}MD_ExtendedElementInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MetadataExtensionInformation_Type", propOrder = {
    "extensionOnLineResource",
    "extendedElementInformation"
})
public class MDMetadataExtensionInformationType
    extends AbstractObjectType
{

    protected CIOnlineResourcePropertyType extensionOnLineResource;
    protected List<MDExtendedElementInformationPropertyType> extendedElementInformation;

    /**
     * Gets the value of the extensionOnLineResource property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getExtensionOnLineResource() {
        return extensionOnLineResource;
    }

    /**
     * Sets the value of the extensionOnLineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setExtensionOnLineResource(CIOnlineResourcePropertyType value) {
        this.extensionOnLineResource = value;
    }

    /**
     * Gets the value of the extendedElementInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedElementInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedElementInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDExtendedElementInformationPropertyType }
     * 
     * 
     */
    public List<MDExtendedElementInformationPropertyType> getExtendedElementInformation() {
        if (extendedElementInformation == null) {
            extendedElementInformation = new ArrayList<>();
        }
        return this.extendedElementInformation;
    }

    /**
     * 
     * 
     */
    public void setExtendedElementInformation(List<MDExtendedElementInformationPropertyType> extendedElementInformation) {
        this.extendedElementInformation = extendedElementInformation;
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
        final MDMetadataExtensionInformationType that = ((MDMetadataExtensionInformationType) object);
        {
            boolean lhsFieldIsSet = (this.extensionOnLineResource!= null);
            boolean rhsFieldIsSet = (that.extensionOnLineResource!= null);
            CIOnlineResourcePropertyType lhsField;
            lhsField = this.getExtensionOnLineResource();
            CIOnlineResourcePropertyType rhsField;
            rhsField = that.getExtensionOnLineResource();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extensionOnLineResource", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extensionOnLineResource", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()));
            boolean rhsFieldIsSet = ((that.extendedElementInformation!= null)&&(!that.extendedElementInformation.isEmpty()));
            List<MDExtendedElementInformationPropertyType> lhsField;
            lhsField = (((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()))?this.getExtendedElementInformation():null);
            List<MDExtendedElementInformationPropertyType> rhsField;
            rhsField = (((that.extendedElementInformation!= null)&&(!that.extendedElementInformation.isEmpty()))?that.getExtendedElementInformation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extendedElementInformation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extendedElementInformation", rhsField);
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
            boolean theFieldIsSet = (this.extensionOnLineResource!= null);
            CIOnlineResourcePropertyType theField;
            theField = this.getExtensionOnLineResource();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extensionOnLineResource", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()));
            List<MDExtendedElementInformationPropertyType> theField;
            theField = (((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()))?this.getExtendedElementInformation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extendedElementInformation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.extensionOnLineResource!= null);
            CIOnlineResourcePropertyType theField;
            theField = this.getExtensionOnLineResource();
            strategy.appendField(locator, this, "extensionOnLineResource", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()));
            List<MDExtendedElementInformationPropertyType> theField;
            theField = (((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()))?this.getExtendedElementInformation():null);
            strategy.appendField(locator, this, "extendedElementInformation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
