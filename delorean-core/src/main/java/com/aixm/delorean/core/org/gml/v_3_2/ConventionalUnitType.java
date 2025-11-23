
package com.aixm.delorean.core.org.gml.v_3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for ConventionalUnitType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConventionalUnitType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}UnitDefinitionType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}conversionToPreferredUnit"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}roughConversionToPreferredUnit"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}derivationUnitTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConventionalUnitType", propOrder = {
    "conversionToPreferredUnit",
    "roughConversionToPreferredUnit",
    "derivationUnitTerm"
})
public class ConventionalUnitType
    extends UnitDefinitionType
{

    /**
     * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
     * 
     */
    protected ConversionToPreferredUnitType conversionToPreferredUnit;
    /**
     * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
     * 
     */
    protected ConversionToPreferredUnitType roughConversionToPreferredUnit;
    protected List<DerivationUnitTermType> derivationUnitTerm;

    /**
     * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
     * 
     * @return
     *     possible object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public ConversionToPreferredUnitType getConversionToPreferredUnit() {
        return conversionToPreferredUnit;
    }

    /**
     * Sets the value of the conversionToPreferredUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionToPreferredUnitType }
     *     
     * @see #getConversionToPreferredUnit()
     */
    public void setConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        this.conversionToPreferredUnit = value;
    }

    /**
     * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
     * 
     * @return
     *     possible object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public ConversionToPreferredUnitType getRoughConversionToPreferredUnit() {
        return roughConversionToPreferredUnit;
    }

    /**
     * Sets the value of the roughConversionToPreferredUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionToPreferredUnitType }
     *     
     * @see #getRoughConversionToPreferredUnit()
     */
    public void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        this.roughConversionToPreferredUnit = value;
    }

    /**
     * A set of gml:derivationUnitTerm elements describes a derived unit of measure.  Each element carries an integer exponent.  The terms are combined by raising each referenced unit to the power of its exponent and forming the product.
     * This unit term references another unit of measure (uom) and provides an integer exponent applied to that unit in defining the compound unit. The exponent may be positive or negative, but not zero.Gets the value of the derivationUnitTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivationUnitTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivationUnitTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivationUnitTermType }
     * 
     * 
     */
    public List<DerivationUnitTermType> getDerivationUnitTerm() {
        if (derivationUnitTerm == null) {
            derivationUnitTerm = new ArrayList<>();
        }
        return this.derivationUnitTerm;
    }

    /**
     * A set of gml:derivationUnitTerm elements describes a derived unit of measure.  Each element carries an integer exponent.  The terms are combined by raising each referenced unit to the power of its exponent and forming the product.
     * This unit term references another unit of measure (uom) and provides an integer exponent applied to that unit in defining the compound unit. The exponent may be positive or negative, but not zero.
     * 
     */
    public void setDerivationUnitTerm(List<DerivationUnitTermType> derivationUnitTerm) {
        this.derivationUnitTerm = derivationUnitTerm;
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
        final ConventionalUnitType that = ((ConventionalUnitType) object);
        {
            boolean lhsFieldIsSet = (this.roughConversionToPreferredUnit!= null);
            boolean rhsFieldIsSet = (that.roughConversionToPreferredUnit!= null);
            ConversionToPreferredUnitType lhsField;
            lhsField = this.getRoughConversionToPreferredUnit();
            ConversionToPreferredUnitType rhsField;
            rhsField = that.getRoughConversionToPreferredUnit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "roughConversionToPreferredUnit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "roughConversionToPreferredUnit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()));
            boolean rhsFieldIsSet = ((that.derivationUnitTerm!= null)&&(!that.derivationUnitTerm.isEmpty()));
            List<DerivationUnitTermType> lhsField;
            lhsField = (((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()))?this.getDerivationUnitTerm():null);
            List<DerivationUnitTermType> rhsField;
            rhsField = (((that.derivationUnitTerm!= null)&&(!that.derivationUnitTerm.isEmpty()))?that.getDerivationUnitTerm():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "derivationUnitTerm", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "derivationUnitTerm", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.conversionToPreferredUnit!= null);
            boolean rhsFieldIsSet = (that.conversionToPreferredUnit!= null);
            ConversionToPreferredUnitType lhsField;
            lhsField = this.getConversionToPreferredUnit();
            ConversionToPreferredUnitType rhsField;
            rhsField = that.getConversionToPreferredUnit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "conversionToPreferredUnit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "conversionToPreferredUnit", rhsField);
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
            boolean theFieldIsSet = (this.conversionToPreferredUnit!= null);
            ConversionToPreferredUnitType theField;
            theField = this.getConversionToPreferredUnit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "conversionToPreferredUnit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.roughConversionToPreferredUnit!= null);
            ConversionToPreferredUnitType theField;
            theField = this.getRoughConversionToPreferredUnit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "roughConversionToPreferredUnit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()));
            List<DerivationUnitTermType> theField;
            theField = (((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()))?this.getDerivationUnitTerm():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "derivationUnitTerm", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.conversionToPreferredUnit!= null);
            ConversionToPreferredUnitType theField;
            theField = this.getConversionToPreferredUnit();
            strategy.appendField(locator, this, "conversionToPreferredUnit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.roughConversionToPreferredUnit!= null);
            ConversionToPreferredUnitType theField;
            theField = this.getRoughConversionToPreferredUnit();
            strategy.appendField(locator, this, "roughConversionToPreferredUnit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()));
            List<DerivationUnitTermType> theField;
            theField = (((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()))?this.getDerivationUnitTerm():null);
            strategy.appendField(locator, this, "derivationUnitTerm", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
