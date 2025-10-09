
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for UnitDefinitionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnitDefinitionType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}quantityType" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}quantityTypeReference" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}catalogSymbol" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDefinitionType", propOrder = {
    "quantityType",
    "quantityTypeReference",
    "catalogSymbol"
})
@XmlSeeAlso({
    BaseUnitType.class,
    DerivedUnitType.class,
    ConventionalUnitType.class
})
public class UnitDefinitionType
    extends DefinitionType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * The gml:quantityType property indicates the phenomenon to which the units apply. This element contains an informal description of the phenomenon or type of physical quantity that is measured or observed. When the physical quantity is the result of an observation or measurement, this term is known as observable type or measurand.
     * The use of gml:quantityType for references to remote values is deprecated.
     * 
     */
    protected StringOrRefType quantityType;
    /**
     * The gml:quantityTypeReference property indicates the phenomenon to which the units apply. The content is a reference to a remote value.
     * 
     */
    protected ReferenceType quantityTypeReference;
    /**
     * The catalogSymbol is the preferred lexical symbol used for this unit of measure.
     * The codeSpace attribute in gml:CodeType identifies a namespace for the catalog symbol value, and might reference the external catalog. The string value in gml:CodeType contains the value of a symbol that should be unique within this catalog namespace. This symbol often appears explicitly in the catalog, but it could be a combination of symbols using a specified algebra of units.
     * 
     */
    protected CodeType catalogSymbol;

    /**
     * The gml:quantityType property indicates the phenomenon to which the units apply. This element contains an informal description of the phenomenon or type of physical quantity that is measured or observed. When the physical quantity is the result of an observation or measurement, this term is known as observable type or measurand.
     * The use of gml:quantityType for references to remote values is deprecated.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     * @see #getQuantityType()
     */
    public void setQuantityType(StringOrRefType value) {
        this.quantityType = value;
    }

    public boolean isSetQuantityType() {
        return (this.quantityType!= null);
    }

    /**
     * The gml:quantityTypeReference property indicates the phenomenon to which the units apply. The content is a reference to a remote value.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getQuantityTypeReference() {
        return quantityTypeReference;
    }

    /**
     * Sets the value of the quantityTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     * @see #getQuantityTypeReference()
     */
    public void setQuantityTypeReference(ReferenceType value) {
        this.quantityTypeReference = value;
    }

    public boolean isSetQuantityTypeReference() {
        return (this.quantityTypeReference!= null);
    }

    /**
     * The catalogSymbol is the preferred lexical symbol used for this unit of measure.
     * The codeSpace attribute in gml:CodeType identifies a namespace for the catalog symbol value, and might reference the external catalog. The string value in gml:CodeType contains the value of a symbol that should be unique within this catalog namespace. This symbol often appears explicitly in the catalog, but it could be a combination of symbols using a specified algebra of units.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCatalogSymbol() {
        return catalogSymbol;
    }

    /**
     * Sets the value of the catalogSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     * @see #getCatalogSymbol()
     */
    public void setCatalogSymbol(CodeType value) {
        this.catalogSymbol = value;
    }

    public boolean isSetCatalogSymbol() {
        return (this.catalogSymbol!= null);
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
        final UnitDefinitionType that = ((UnitDefinitionType) object);
        {
            boolean lhsFieldIsSet = this.isSetQuantityType();
            boolean rhsFieldIsSet = that.isSetQuantityType();
            StringOrRefType lhsField;
            lhsField = this.getQuantityType();
            StringOrRefType rhsField;
            rhsField = that.getQuantityType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "quantityType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "quantityType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCatalogSymbol();
            boolean rhsFieldIsSet = that.isSetCatalogSymbol();
            CodeType lhsField;
            lhsField = this.getCatalogSymbol();
            CodeType rhsField;
            rhsField = that.getCatalogSymbol();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "catalogSymbol", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "catalogSymbol", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetQuantityTypeReference();
            boolean rhsFieldIsSet = that.isSetQuantityTypeReference();
            ReferenceType lhsField;
            lhsField = this.getQuantityTypeReference();
            ReferenceType rhsField;
            rhsField = that.getQuantityTypeReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "quantityTypeReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "quantityTypeReference", rhsField);
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
            boolean theFieldIsSet = this.isSetQuantityType();
            StringOrRefType theField;
            theField = this.getQuantityType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "quantityType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetQuantityTypeReference();
            ReferenceType theField;
            theField = this.getQuantityTypeReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "quantityTypeReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCatalogSymbol();
            CodeType theField;
            theField = this.getCatalogSymbol();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "catalogSymbol", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetQuantityType();
            StringOrRefType theField;
            theField = this.getQuantityType();
            strategy.appendField(locator, this, "quantityType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetQuantityTypeReference();
            ReferenceType theField;
            theField = this.getQuantityTypeReference();
            strategy.appendField(locator, this, "quantityTypeReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCatalogSymbol();
            CodeType theField;
            theField = this.getCatalogSymbol();
            strategy.appendField(locator, this, "catalogSymbol", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
