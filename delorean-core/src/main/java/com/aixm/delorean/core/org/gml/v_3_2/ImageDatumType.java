
package com.aixm.delorean.core.org.gml.v_3_2;

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
 * <p>Java class for ImageDatumType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImageDatumType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}pixelInCell"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDatumType", propOrder = {
    "pixelInCell"
})
public class ImageDatumType
    extends AbstractDatumType
{

    /**
     * gml:pixelInCell is a specification of the way an image grid is associated with the image data attributes. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     */
    @XmlElement(required = true)
    protected CodeWithAuthorityType pixelInCell;

    /**
     * gml:pixelInCell is a specification of the way an image grid is associated with the image data attributes. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getPixelInCell() {
        return pixelInCell;
    }

    /**
     * Sets the value of the pixelInCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     * @see #getPixelInCell()
     */
    public void setPixelInCell(CodeWithAuthorityType value) {
        this.pixelInCell = value;
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
        final ImageDatumType that = ((ImageDatumType) object);
        {
            boolean lhsFieldIsSet = (this.pixelInCell!= null);
            boolean rhsFieldIsSet = (that.pixelInCell!= null);
            CodeWithAuthorityType lhsField;
            lhsField = this.getPixelInCell();
            CodeWithAuthorityType rhsField;
            rhsField = that.getPixelInCell();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pixelInCell", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pixelInCell", rhsField);
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
            boolean theFieldIsSet = (this.pixelInCell!= null);
            CodeWithAuthorityType theField;
            theField = this.getPixelInCell();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pixelInCell", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.pixelInCell!= null);
            CodeWithAuthorityType theField;
            theField = this.getPixelInCell();
            strategy.appendField(locator, this, "pixelInCell", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
