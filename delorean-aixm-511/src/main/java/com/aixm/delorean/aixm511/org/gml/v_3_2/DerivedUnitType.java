
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for DerivedUnitType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DerivedUnitType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}UnitDefinitionType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}derivationUnitTerm" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedUnitType", propOrder = {
    "derivationUnitTerm"
})
public class DerivedUnitType
    extends UnitDefinitionType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<DerivationUnitTermType> derivationUnitTerm;

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

    public boolean isSetDerivationUnitTerm() {
        return ((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()));
    }

    public void unsetDerivationUnitTerm() {
        this.derivationUnitTerm = null;
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
        final DerivedUnitType that = ((DerivedUnitType) object);
        {
            boolean lhsFieldIsSet = this.isSetDerivationUnitTerm();
            boolean rhsFieldIsSet = that.isSetDerivationUnitTerm();
            List<DerivationUnitTermType> lhsField;
            lhsField = (this.isSetDerivationUnitTerm()?this.getDerivationUnitTerm():null);
            List<DerivationUnitTermType> rhsField;
            rhsField = (that.isSetDerivationUnitTerm()?that.getDerivationUnitTerm():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "derivationUnitTerm", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "derivationUnitTerm", rhsField);
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
            boolean theFieldIsSet = this.isSetDerivationUnitTerm();
            List<DerivationUnitTermType> theField;
            theField = (this.isSetDerivationUnitTerm()?this.getDerivationUnitTerm():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "derivationUnitTerm", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDerivationUnitTerm();
            List<DerivationUnitTermType> theField;
            theField = (this.isSetDerivationUnitTerm()?this.getDerivationUnitTerm():null);
            strategy.appendField(locator, this, "derivationUnitTerm", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
