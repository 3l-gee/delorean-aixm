
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for RangeSetType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RangeSetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}ValueArray" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractScalarValueList" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}DataBlock"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}File"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeSetType", propOrder = {
    "valueArray",
    "abstractScalarValueList",
    "dataBlock",
    "file"
})
public class RangeSetType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "ValueArray")
    protected List<ValueArrayType> valueArray;
    @XmlElementRef(name = "AbstractScalarValueList", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<?>> abstractScalarValueList;
    /**
     * gml:DataBlock describes the Range as a block of text encoded values similar to a Common Separated Value (CSV) representation.
     * The range set parameterization is described by the property gml:rangeParameters.
     * 
     */
    @XmlElement(name = "DataBlock")
    protected DataBlockType dataBlock;
    /**
     * for efficiency reasons, GML also provides a means of encoding the range set in an arbitrary external encoding, such as a binary file.  This encoding may be "well-known" but this is not required. This mode uses the gml:File element.
     * The values of the coverage (attribute values in the range set) are transmitted in a external file that is referenced from the XML structure described by gml:FileType.  The external file is referenced by the gml:fileReference property that is an anyURI (the gml:fileName property has been deprecated).  This means that the external file may be located remotely from the referencing GML instance. 
     * The gml:compression property points to a definition of a compression algorithm through an anyURI.  This may be a retrievable, computable definition or simply a reference to an unambiguous name for the compression method.
     * The gml:mimeType property points to a definition of the file mime type.
     * The gml:fileStructure property is defined by a codelist. Note further that all values shall be enclosed in a single file. Multi-file structures for values are not supported in GML.
     * The semantics of the range set is described as above using the gml:rangeParameters property.
     * Note that if any compression algorithm is applied, the structure above applies only to the pre-compression or post-decompression structure of the file.
     * Note that the fields within a record match the gml:valueComponents of the gml:CompositeValue in document order.
     * 
     */
    @XmlElement(name = "File")
    protected FileType file;

    /**
     * A Value Array is used for homogeneous arrays of primitive and aggregate values.  
     * The member values may be scalars, composites, arrays or lists.
     * ValueArray has the same content model as CompositeValue, but the member values shall be homogeneous.  The element declaration contains a Schematron constraint which expresses this restriction precisely.  Since the members are homogeneous, the gml:referenceSystem (uom, codeSpace) may be specified on the gml:ValueArray itself and inherited by all the members if desired.Gets the value of the valueArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueArrayType }
     * 
     * 
     */
    public List<ValueArrayType> getValueArray() {
        if (valueArray == null) {
            valueArray = new ArrayList<>();
        }
        return this.valueArray;
    }

    /**
     * A Value Array is used for homogeneous arrays of primitive and aggregate values.  
     * The member values may be scalars, composites, arrays or lists.
     * ValueArray has the same content model as CompositeValue, but the member values shall be homogeneous.  The element declaration contains a Schematron constraint which expresses this restriction precisely.  Since the members are homogeneous, the gml:referenceSystem (uom, codeSpace) may be specified on the gml:ValueArray itself and inherited by all the members if desired.
     * 
     */
    public void setValueArray(List<ValueArrayType> valueArray) {
        this.valueArray = valueArray;
    }

    public boolean isSetValueArray() {
        return ((this.valueArray!= null)&&(!this.valueArray.isEmpty()));
    }

    public void unsetValueArray() {
        this.valueArray = null;
    }

    /**
     * gml:AbstractScalarValueList is an abstract element which acts as the head of a substitution group which contains gml:BooleanList, gml:CategoryList, gml:CountList and gml:QuantityList, and (transitively) the elements in their substitution groups.Gets the value of the abstractScalarValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractScalarValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractScalarValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractScalarValueList() {
        if (abstractScalarValueList == null) {
            abstractScalarValueList = new ArrayList<>();
        }
        return this.abstractScalarValueList;
    }

    /**
     * gml:AbstractScalarValueList is an abstract element which acts as the head of a substitution group which contains gml:BooleanList, gml:CategoryList, gml:CountList and gml:QuantityList, and (transitively) the elements in their substitution groups.
     * 
     */
    public void setAbstractScalarValueList(List<JAXBElement<?>> abstractScalarValueList) {
        this.abstractScalarValueList = abstractScalarValueList;
    }

    public boolean isSetAbstractScalarValueList() {
        return ((this.abstractScalarValueList!= null)&&(!this.abstractScalarValueList.isEmpty()));
    }

    public void unsetAbstractScalarValueList() {
        this.abstractScalarValueList = null;
    }

    /**
     * gml:DataBlock describes the Range as a block of text encoded values similar to a Common Separated Value (CSV) representation.
     * The range set parameterization is described by the property gml:rangeParameters.
     * 
     * @return
     *     possible object is
     *     {@link DataBlockType }
     *     
     */
    public DataBlockType getDataBlock() {
        return dataBlock;
    }

    /**
     * Sets the value of the dataBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBlockType }
     *     
     * @see #getDataBlock()
     */
    public void setDataBlock(DataBlockType value) {
        this.dataBlock = value;
    }

    public boolean isSetDataBlock() {
        return (this.dataBlock!= null);
    }

    /**
     * for efficiency reasons, GML also provides a means of encoding the range set in an arbitrary external encoding, such as a binary file.  This encoding may be "well-known" but this is not required. This mode uses the gml:File element.
     * The values of the coverage (attribute values in the range set) are transmitted in a external file that is referenced from the XML structure described by gml:FileType.  The external file is referenced by the gml:fileReference property that is an anyURI (the gml:fileName property has been deprecated).  This means that the external file may be located remotely from the referencing GML instance. 
     * The gml:compression property points to a definition of a compression algorithm through an anyURI.  This may be a retrievable, computable definition or simply a reference to an unambiguous name for the compression method.
     * The gml:mimeType property points to a definition of the file mime type.
     * The gml:fileStructure property is defined by a codelist. Note further that all values shall be enclosed in a single file. Multi-file structures for values are not supported in GML.
     * The semantics of the range set is described as above using the gml:rangeParameters property.
     * Note that if any compression algorithm is applied, the structure above applies only to the pre-compression or post-decompression structure of the file.
     * Note that the fields within a record match the gml:valueComponents of the gml:CompositeValue in document order.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     * @see #getFile()
     */
    public void setFile(FileType value) {
        this.file = value;
    }

    public boolean isSetFile() {
        return (this.file!= null);
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
        final RangeSetType that = ((RangeSetType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractScalarValueList();
            boolean rhsFieldIsSet = that.isSetAbstractScalarValueList();
            List<JAXBElement<?>> lhsField;
            lhsField = (this.isSetAbstractScalarValueList()?this.getAbstractScalarValueList():null);
            List<JAXBElement<?>> rhsField;
            rhsField = (that.isSetAbstractScalarValueList()?that.getAbstractScalarValueList():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractScalarValueList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractScalarValueList", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetValueArray();
            boolean rhsFieldIsSet = that.isSetValueArray();
            List<ValueArrayType> lhsField;
            lhsField = (this.isSetValueArray()?this.getValueArray():null);
            List<ValueArrayType> rhsField;
            rhsField = (that.isSetValueArray()?that.getValueArray():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "valueArray", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "valueArray", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetFile();
            boolean rhsFieldIsSet = that.isSetFile();
            FileType lhsField;
            lhsField = this.getFile();
            FileType rhsField;
            rhsField = that.getFile();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "file", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "file", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDataBlock();
            boolean rhsFieldIsSet = that.isSetDataBlock();
            DataBlockType lhsField;
            lhsField = this.getDataBlock();
            DataBlockType rhsField;
            rhsField = that.getDataBlock();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dataBlock", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dataBlock", rhsField);
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
            boolean theFieldIsSet = this.isSetValueArray();
            List<ValueArrayType> theField;
            theField = (this.isSetValueArray()?this.getValueArray():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "valueArray", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractScalarValueList();
            List<JAXBElement<?>> theField;
            theField = (this.isSetAbstractScalarValueList()?this.getAbstractScalarValueList():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractScalarValueList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataBlock();
            DataBlockType theField;
            theField = this.getDataBlock();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dataBlock", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFile();
            FileType theField;
            theField = this.getFile();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "file", theField);
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
            boolean theFieldIsSet = this.isSetValueArray();
            List<ValueArrayType> theField;
            theField = (this.isSetValueArray()?this.getValueArray():null);
            strategy.appendField(locator, this, "valueArray", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractScalarValueList();
            List<JAXBElement<?>> theField;
            theField = (this.isSetAbstractScalarValueList()?this.getAbstractScalarValueList():null);
            strategy.appendField(locator, this, "abstractScalarValueList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDataBlock();
            DataBlockType theField;
            theField = this.getDataBlock();
            strategy.appendField(locator, this, "dataBlock", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetFile();
            FileType theField;
            theField = this.getFile();
            strategy.appendField(locator, this, "file", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
