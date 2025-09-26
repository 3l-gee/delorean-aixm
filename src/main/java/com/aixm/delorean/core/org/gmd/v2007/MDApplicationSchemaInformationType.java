
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.BinaryPropertyType;
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
 * Information about the application schema used to build the dataset
 * 
 * <p>Java class for MD_ApplicationSchemaInformation_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_ApplicationSchemaInformation_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="name" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/>
 *         <element name="schemaLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="constraintLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="schemaAscii" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="graphicsFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/>
 *         <element name="softwareDevelopmentFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/>
 *         <element name="softwareDevelopmentFileFormat" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ApplicationSchemaInformation_Type", propOrder = {
    "name",
    "schemaLanguage",
    "constraintLanguage",
    "schemaAscii",
    "graphicsFile",
    "softwareDevelopmentFile",
    "softwareDevelopmentFileFormat"
})
public class MDApplicationSchemaInformationType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected CICitationPropertyType name;
    @XmlElement(required = true)
    protected CharacterStringPropertyType schemaLanguage;
    @XmlElement(required = true)
    protected CharacterStringPropertyType constraintLanguage;
    protected CharacterStringPropertyType schemaAscii;
    protected BinaryPropertyType graphicsFile;
    protected BinaryPropertyType softwareDevelopmentFile;
    protected CharacterStringPropertyType softwareDevelopmentFileFormat;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setName(CICitationPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the schemaLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaLanguage() {
        return schemaLanguage;
    }

    /**
     * Sets the value of the schemaLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaLanguage(CharacterStringPropertyType value) {
        this.schemaLanguage = value;
    }

    public boolean isSetSchemaLanguage() {
        return (this.schemaLanguage!= null);
    }

    /**
     * Gets the value of the constraintLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getConstraintLanguage() {
        return constraintLanguage;
    }

    /**
     * Sets the value of the constraintLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setConstraintLanguage(CharacterStringPropertyType value) {
        this.constraintLanguage = value;
    }

    public boolean isSetConstraintLanguage() {
        return (this.constraintLanguage!= null);
    }

    /**
     * Gets the value of the schemaAscii property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaAscii() {
        return schemaAscii;
    }

    /**
     * Sets the value of the schemaAscii property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaAscii(CharacterStringPropertyType value) {
        this.schemaAscii = value;
    }

    public boolean isSetSchemaAscii() {
        return (this.schemaAscii!= null);
    }

    /**
     * Gets the value of the graphicsFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getGraphicsFile() {
        return graphicsFile;
    }

    /**
     * Sets the value of the graphicsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setGraphicsFile(BinaryPropertyType value) {
        this.graphicsFile = value;
    }

    public boolean isSetGraphicsFile() {
        return (this.graphicsFile!= null);
    }

    /**
     * Gets the value of the softwareDevelopmentFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getSoftwareDevelopmentFile() {
        return softwareDevelopmentFile;
    }

    /**
     * Sets the value of the softwareDevelopmentFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFile(BinaryPropertyType value) {
        this.softwareDevelopmentFile = value;
    }

    public boolean isSetSoftwareDevelopmentFile() {
        return (this.softwareDevelopmentFile!= null);
    }

    /**
     * Gets the value of the softwareDevelopmentFileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSoftwareDevelopmentFileFormat() {
        return softwareDevelopmentFileFormat;
    }

    /**
     * Sets the value of the softwareDevelopmentFileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFileFormat(CharacterStringPropertyType value) {
        this.softwareDevelopmentFileFormat = value;
    }

    public boolean isSetSoftwareDevelopmentFileFormat() {
        return (this.softwareDevelopmentFileFormat!= null);
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
        final MDApplicationSchemaInformationType that = ((MDApplicationSchemaInformationType) object);
        {
            boolean lhsFieldIsSet = this.isSetConstraintLanguage();
            boolean rhsFieldIsSet = that.isSetConstraintLanguage();
            CharacterStringPropertyType lhsField;
            lhsField = this.getConstraintLanguage();
            CharacterStringPropertyType rhsField;
            rhsField = that.getConstraintLanguage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "constraintLanguage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "constraintLanguage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetName();
            boolean rhsFieldIsSet = that.isSetName();
            CICitationPropertyType lhsField;
            lhsField = this.getName();
            CICitationPropertyType rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSoftwareDevelopmentFileFormat();
            boolean rhsFieldIsSet = that.isSetSoftwareDevelopmentFileFormat();
            CharacterStringPropertyType lhsField;
            lhsField = this.getSoftwareDevelopmentFileFormat();
            CharacterStringPropertyType rhsField;
            rhsField = that.getSoftwareDevelopmentFileFormat();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "softwareDevelopmentFileFormat", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "softwareDevelopmentFileFormat", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGraphicsFile();
            boolean rhsFieldIsSet = that.isSetGraphicsFile();
            BinaryPropertyType lhsField;
            lhsField = this.getGraphicsFile();
            BinaryPropertyType rhsField;
            rhsField = that.getGraphicsFile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "graphicsFile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "graphicsFile", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSchemaLanguage();
            boolean rhsFieldIsSet = that.isSetSchemaLanguage();
            CharacterStringPropertyType lhsField;
            lhsField = this.getSchemaLanguage();
            CharacterStringPropertyType rhsField;
            rhsField = that.getSchemaLanguage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "schemaLanguage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "schemaLanguage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSchemaAscii();
            boolean rhsFieldIsSet = that.isSetSchemaAscii();
            CharacterStringPropertyType lhsField;
            lhsField = this.getSchemaAscii();
            CharacterStringPropertyType rhsField;
            rhsField = that.getSchemaAscii();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "schemaAscii", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "schemaAscii", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSoftwareDevelopmentFile();
            boolean rhsFieldIsSet = that.isSetSoftwareDevelopmentFile();
            BinaryPropertyType lhsField;
            lhsField = this.getSoftwareDevelopmentFile();
            BinaryPropertyType rhsField;
            rhsField = that.getSoftwareDevelopmentFile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "softwareDevelopmentFile", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "softwareDevelopmentFile", rhsField);
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
            CICitationPropertyType theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSchemaLanguage();
            CharacterStringPropertyType theField;
            theField = this.getSchemaLanguage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "schemaLanguage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConstraintLanguage();
            CharacterStringPropertyType theField;
            theField = this.getConstraintLanguage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "constraintLanguage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSchemaAscii();
            CharacterStringPropertyType theField;
            theField = this.getSchemaAscii();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "schemaAscii", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGraphicsFile();
            BinaryPropertyType theField;
            theField = this.getGraphicsFile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "graphicsFile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSoftwareDevelopmentFile();
            BinaryPropertyType theField;
            theField = this.getSoftwareDevelopmentFile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "softwareDevelopmentFile", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSoftwareDevelopmentFileFormat();
            CharacterStringPropertyType theField;
            theField = this.getSoftwareDevelopmentFileFormat();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "softwareDevelopmentFileFormat", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetName();
            CICitationPropertyType theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSchemaLanguage();
            CharacterStringPropertyType theField;
            theField = this.getSchemaLanguage();
            strategy.appendField(locator, this, "schemaLanguage", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetConstraintLanguage();
            CharacterStringPropertyType theField;
            theField = this.getConstraintLanguage();
            strategy.appendField(locator, this, "constraintLanguage", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSchemaAscii();
            CharacterStringPropertyType theField;
            theField = this.getSchemaAscii();
            strategy.appendField(locator, this, "schemaAscii", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGraphicsFile();
            BinaryPropertyType theField;
            theField = this.getGraphicsFile();
            strategy.appendField(locator, this, "graphicsFile", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSoftwareDevelopmentFile();
            BinaryPropertyType theField;
            theField = this.getSoftwareDevelopmentFile();
            strategy.appendField(locator, this, "softwareDevelopmentFile", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSoftwareDevelopmentFileFormat();
            CharacterStringPropertyType theField;
            theField = this.getSoftwareDevelopmentFileFormat();
            strategy.appendField(locator, this, "softwareDevelopmentFileFormat", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
