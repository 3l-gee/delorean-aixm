
package com.aixm.delorean.core.org.gco.v2007;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 * <p>Java class for CodeListValue_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CodeListValue_Type">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="codeList" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="codeListValue" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="codeSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListValue_Type", propOrder = {
    "value"
})
public class CodeListValueType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeList", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String codeList;
    @XmlAttribute(name = "codeListValue", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String codeListValue;
    @XmlAttribute(name = "codeSpace")
    @XmlSchemaType(name = "anyURI")
    protected String codeSpace;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the codeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeList() {
        return codeList;
    }

    /**
     * Sets the value of the codeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeList(String value) {
        this.codeList = value;
    }

    public boolean isSetCodeList() {
        return (this.codeList!= null);
    }

    /**
     * Gets the value of the codeListValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListValue() {
        return codeListValue;
    }

    /**
     * Sets the value of the codeListValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListValue(String value) {
        this.codeListValue = value;
    }

    public boolean isSetCodeListValue() {
        return (this.codeListValue!= null);
    }

    /**
     * Gets the value of the codeSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSpace() {
        return codeSpace;
    }

    /**
     * Sets the value of the codeSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSpace(String value) {
        this.codeSpace = value;
    }

    public boolean isSetCodeSpace() {
        return (this.codeSpace!= null);
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
        final CodeListValueType that = ((CodeListValueType) object);
        {
            boolean lhsFieldIsSet = this.isSetValue();
            boolean rhsFieldIsSet = that.isSetValue();
            String lhsField;
            lhsField = this.getValue();
            String rhsField;
            rhsField = that.getValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "value", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "value", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodeList();
            boolean rhsFieldIsSet = that.isSetCodeList();
            String lhsField;
            lhsField = this.getCodeList();
            String rhsField;
            rhsField = that.getCodeList();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeList", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeList", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodeSpace();
            boolean rhsFieldIsSet = that.isSetCodeSpace();
            String lhsField;
            lhsField = this.getCodeSpace();
            String rhsField;
            rhsField = that.getCodeSpace();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeSpace", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeSpace", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCodeListValue();
            boolean rhsFieldIsSet = that.isSetCodeListValue();
            String lhsField;
            lhsField = this.getCodeListValue();
            String rhsField;
            rhsField = that.getCodeListValue();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "codeListValue", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "codeListValue", rhsField);
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
            boolean theFieldIsSet = this.isSetValue();
            String theField;
            theField = this.getValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "value", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeList();
            String theField;
            theField = this.getCodeList();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeList", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeListValue();
            String theField;
            theField = this.getCodeListValue();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeListValue", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeSpace();
            String theField;
            theField = this.getCodeSpace();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "codeSpace", theField);
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
            boolean theFieldIsSet = this.isSetValue();
            String theField;
            theField = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeList();
            String theField;
            theField = this.getCodeList();
            strategy.appendField(locator, this, "codeList", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeListValue();
            String theField;
            theField = this.getCodeListValue();
            strategy.appendField(locator, this, "codeListValue", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCodeSpace();
            String theField;
            theField = this.getCodeSpace();
            strategy.appendField(locator, this, "codeSpace", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
