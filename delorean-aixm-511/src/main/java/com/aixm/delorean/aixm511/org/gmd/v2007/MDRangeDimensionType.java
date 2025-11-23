
package com.aixm.delorean.aixm511.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.aixm511.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.aixm511.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.aixm511.org.gco.v2007.MemberNamePropertyType;
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
 * Set of adjacent wavelengths in the electro-magnetic spectrum with a common characteristic, such as the visible band
 * 
 * <p>Java class for MD_RangeDimension_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_RangeDimension_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="sequenceIdentifier" type="{http://www.isotc211.org/2005/gco}MemberName_PropertyType" minOccurs="0"/>
 *         <element name="descriptor" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_RangeDimension_Type", propOrder = {
    "sequenceIdentifier",
    "descriptor"
})
@XmlSeeAlso({
    MDBandType.class
})
public class MDRangeDimensionType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected MemberNamePropertyType sequenceIdentifier;
    protected CharacterStringPropertyType descriptor;

    /**
     * Gets the value of the sequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public MemberNamePropertyType getSequenceIdentifier() {
        return sequenceIdentifier;
    }

    /**
     * Sets the value of the sequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public void setSequenceIdentifier(MemberNamePropertyType value) {
        this.sequenceIdentifier = value;
    }

    public boolean isSetSequenceIdentifier() {
        return (this.sequenceIdentifier!= null);
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescriptor(CharacterStringPropertyType value) {
        this.descriptor = value;
    }

    public boolean isSetDescriptor() {
        return (this.descriptor!= null);
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
        final MDRangeDimensionType that = ((MDRangeDimensionType) object);
        {
            boolean lhsFieldIsSet = this.isSetDescriptor();
            boolean rhsFieldIsSet = that.isSetDescriptor();
            CharacterStringPropertyType lhsField;
            lhsField = this.getDescriptor();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDescriptor();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "descriptor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "descriptor", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSequenceIdentifier();
            boolean rhsFieldIsSet = that.isSetSequenceIdentifier();
            MemberNamePropertyType lhsField;
            lhsField = this.getSequenceIdentifier();
            MemberNamePropertyType rhsField;
            rhsField = that.getSequenceIdentifier();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sequenceIdentifier", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sequenceIdentifier", rhsField);
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
            boolean theFieldIsSet = this.isSetSequenceIdentifier();
            MemberNamePropertyType theField;
            theField = this.getSequenceIdentifier();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sequenceIdentifier", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDescriptor();
            CharacterStringPropertyType theField;
            theField = this.getDescriptor();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "descriptor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSequenceIdentifier();
            MemberNamePropertyType theField;
            theField = this.getSequenceIdentifier();
            strategy.appendField(locator, this, "sequenceIdentifier", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDescriptor();
            CharacterStringPropertyType theField;
            theField = this.getDescriptor();
            strategy.appendField(locator, this, "descriptor", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
