
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for FileType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}rangeParameters"/>
 *         <choice>
 *           <element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           <element name="fileReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         </choice>
 *         <element name="fileStructure" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         <element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="compression" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileType", propOrder = {
    "rangeParameters",
    "fileName",
    "fileReference",
    "fileStructure",
    "mimeType",
    "compression"
})
public class FileType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected AssociationRoleType rangeParameters;
    @XmlSchemaType(name = "anyURI")
    protected String fileName;
    @XmlSchemaType(name = "anyURI")
    protected String fileReference;
    @XmlElement(required = true)
    protected CodeType fileStructure;
    @XmlSchemaType(name = "anyURI")
    protected String mimeType;
    @XmlSchemaType(name = "anyURI")
    protected String compression;

    /**
     * Gets the value of the rangeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getRangeParameters() {
        return rangeParameters;
    }

    /**
     * Sets the value of the rangeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setRangeParameters(AssociationRoleType value) {
        this.rangeParameters = value;
    }

    public boolean isSetRangeParameters() {
        return (this.rangeParameters!= null);
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    public boolean isSetFileName() {
        return (this.fileName!= null);
    }

    /**
     * Gets the value of the fileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReference() {
        return fileReference;
    }

    /**
     * Sets the value of the fileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReference(String value) {
        this.fileReference = value;
    }

    public boolean isSetFileReference() {
        return (this.fileReference!= null);
    }

    /**
     * Gets the value of the fileStructure property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFileStructure() {
        return fileStructure;
    }

    /**
     * Sets the value of the fileStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFileStructure(CodeType value) {
        this.fileStructure = value;
    }

    public boolean isSetFileStructure() {
        return (this.fileStructure!= null);
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    public boolean isSetMimeType() {
        return (this.mimeType!= null);
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    public boolean isSetCompression() {
        return (this.compression!= null);
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
        final FileType that = ((FileType) object);
        {
            boolean lhsFieldIsSet = this.isSetFileName();
            boolean rhsFieldIsSet = that.isSetFileName();
            String lhsField;
            lhsField = this.getFileName();
            String rhsField;
            rhsField = that.getFileName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileName", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileName", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMimeType();
            boolean rhsFieldIsSet = that.isSetMimeType();
            String lhsField;
            lhsField = this.getMimeType();
            String rhsField;
            rhsField = that.getMimeType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mimeType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mimeType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFileStructure();
            boolean rhsFieldIsSet = that.isSetFileStructure();
            CodeType lhsField;
            lhsField = this.getFileStructure();
            CodeType rhsField;
            rhsField = that.getFileStructure();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileStructure", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileStructure", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCompression();
            boolean rhsFieldIsSet = that.isSetCompression();
            String lhsField;
            lhsField = this.getCompression();
            String rhsField;
            rhsField = that.getCompression();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "compression", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "compression", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRangeParameters();
            boolean rhsFieldIsSet = that.isSetRangeParameters();
            AssociationRoleType lhsField;
            lhsField = this.getRangeParameters();
            AssociationRoleType rhsField;
            rhsField = that.getRangeParameters();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rangeParameters", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rangeParameters", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFileReference();
            boolean rhsFieldIsSet = that.isSetFileReference();
            String lhsField;
            lhsField = this.getFileReference();
            String rhsField;
            rhsField = that.getFileReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "fileReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "fileReference", rhsField);
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
            boolean theFieldIsSet = this.isSetRangeParameters();
            AssociationRoleType theField;
            theField = this.getRangeParameters();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rangeParameters", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileName();
            String theField;
            theField = this.getFileName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileName", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileReference();
            String theField;
            theField = this.getFileReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileStructure();
            CodeType theField;
            theField = this.getFileStructure();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "fileStructure", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMimeType();
            String theField;
            theField = this.getMimeType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mimeType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCompression();
            String theField;
            theField = this.getCompression();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "compression", theField);
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
            boolean theFieldIsSet = this.isSetRangeParameters();
            AssociationRoleType theField;
            theField = this.getRangeParameters();
            strategy.appendField(locator, this, "rangeParameters", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileName();
            String theField;
            theField = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileReference();
            String theField;
            theField = this.getFileReference();
            strategy.appendField(locator, this, "fileReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFileStructure();
            CodeType theField;
            theField = this.getFileStructure();
            strategy.appendField(locator, this, "fileStructure", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMimeType();
            String theField;
            theField = this.getMimeType();
            strategy.appendField(locator, this, "mimeType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCompression();
            String theField;
            theField = this.getCompression();
            strategy.appendField(locator, this, "compression", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
