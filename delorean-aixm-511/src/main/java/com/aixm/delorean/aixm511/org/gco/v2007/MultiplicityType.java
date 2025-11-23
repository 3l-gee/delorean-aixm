
package com.aixm.delorean.aixm511.org.gco.v2007;

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
 * Use to represent the possible cardinality of a relation. Represented by a set of simple multiplicity ranges.
 * 
 * <p>Java class for Multiplicity_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Multiplicity_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="range" type="{http://www.isotc211.org/2005/gco}MultiplicityRange_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Multiplicity_Type", propOrder = {
    "range"
})
public class MultiplicityType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected List<MultiplicityRangePropertyType> range;

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiplicityRangePropertyType }
     * 
     * 
     */
    public List<MultiplicityRangePropertyType> getRange() {
        if (range == null) {
            range = new ArrayList<>();
        }
        return this.range;
    }

    /**
     * 
     * 
     */
    public void setRange(List<MultiplicityRangePropertyType> range) {
        this.range = range;
    }

    public boolean isSetRange() {
        return ((this.range!= null)&&(!this.range.isEmpty()));
    }

    public void unsetRange() {
        this.range = null;
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
        final MultiplicityType that = ((MultiplicityType) object);
        {
            boolean lhsFieldIsSet = this.isSetRange();
            boolean rhsFieldIsSet = that.isSetRange();
            List<MultiplicityRangePropertyType> lhsField;
            lhsField = (this.isSetRange()?this.getRange():null);
            List<MultiplicityRangePropertyType> rhsField;
            rhsField = (that.isSetRange()?that.getRange():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "range", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "range", rhsField);
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
            boolean theFieldIsSet = this.isSetRange();
            List<MultiplicityRangePropertyType> theField;
            theField = (this.isSetRange()?this.getRange():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "range", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetRange();
            List<MultiplicityRangePropertyType> theField;
            theField = (this.isSetRange()?this.getRange():null);
            strategy.appendField(locator, this, "range", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
