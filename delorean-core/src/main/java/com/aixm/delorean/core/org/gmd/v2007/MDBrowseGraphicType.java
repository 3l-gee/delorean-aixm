
package com.aixm.delorean.core.org.gmd.v2007;

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
 * Graphic that provides an illustration of the dataset (should include a legend for the graphic)
 * 
 * <p>Java class for MD_BrowseGraphic_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_BrowseGraphic_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="fileName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="fileDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="fileType" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_BrowseGraphic_Type", propOrder = {
    "fileName",
    "fileDescription",
    "fileType"
})
public class MDBrowseGraphicType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType fileName;
    protected CharacterStringPropertyType fileDescription;
    protected CharacterStringPropertyType fileType;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileName(CharacterStringPropertyType value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileDescription(CharacterStringPropertyType value) {
        this.fileDescription = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileType(CharacterStringPropertyType value) {
        this.fileType = value;
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
        final MDBrowseGraphicType that = ((MDBrowseGraphicType) object);
        {
            boolean lhsFieldIsSet = (this.fileName!= null);
            boolean rhsFieldIsSet = (that.fileName!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getFileName();
            CharacterStringPropertyType rhsField;
            rhsField = that.getFileName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.fileType!= null);
            boolean rhsFieldIsSet = (that.fileType!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getFileType();
            CharacterStringPropertyType rhsField;
            rhsField = that.getFileType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.fileDescription!= null);
            boolean rhsFieldIsSet = (that.fileDescription!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getFileDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getFileDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileDescription", rhsField);
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
            boolean theFieldIsSet = (this.fileName!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.fileDescription!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.fileType!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.fileName!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.fileDescription!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileDescription();
            strategy.appendField(locator, this, "fileDescription", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.fileType!= null);
            CharacterStringPropertyType theField;
            theField = this.getFileType();
            strategy.appendField(locator, this, "fileType", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
