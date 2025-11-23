
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
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
 * <p>Java class for SolidType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SolidType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractSolidType">
 *       <sequence>
 *         <element name="exterior" type="{http://www.opengis.net/gml/3.2}ShellPropertyType" minOccurs="0"/>
 *         <element name="interior" type="{http://www.opengis.net/gml/3.2}ShellPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidType", propOrder = {
    "exterior",
    "interior"
})
public class SolidType
    extends AbstractSolidType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected ShellPropertyType exterior;
    protected List<ShellPropertyType> interior;

    /**
     * Gets the value of the exterior property.
     * 
     * @return
     *     possible object is
     *     {@link ShellPropertyType }
     *     
     */
    public ShellPropertyType getExterior() {
        return exterior;
    }

    /**
     * Sets the value of the exterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellPropertyType }
     *     
     */
    public void setExterior(ShellPropertyType value) {
        this.exterior = value;
    }

    public boolean isSetExterior() {
        return (this.exterior!= null);
    }

    /**
     * Gets the value of the interior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShellPropertyType }
     * 
     * 
     */
    public List<ShellPropertyType> getInterior() {
        if (interior == null) {
            interior = new ArrayList<>();
        }
        return this.interior;
    }

    /**
     * 
     * 
     */
    public void setInterior(List<ShellPropertyType> interior) {
        this.interior = interior;
    }

    public boolean isSetInterior() {
        return ((this.interior!= null)&&(!this.interior.isEmpty()));
    }

    public void unsetInterior() {
        this.interior = null;
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
        final SolidType that = ((SolidType) object);
        {
            boolean lhsFieldIsSet = this.isSetInterior();
            boolean rhsFieldIsSet = that.isSetInterior();
            List<ShellPropertyType> lhsField;
            lhsField = (this.isSetInterior()?this.getInterior():null);
            List<ShellPropertyType> rhsField;
            rhsField = (that.isSetInterior()?that.getInterior():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "interior", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "interior", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExterior();
            boolean rhsFieldIsSet = that.isSetExterior();
            ShellPropertyType lhsField;
            lhsField = this.getExterior();
            ShellPropertyType rhsField;
            rhsField = that.getExterior();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "exterior", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "exterior", rhsField);
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
            boolean theFieldIsSet = this.isSetExterior();
            ShellPropertyType theField;
            theField = this.getExterior();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "exterior", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInterior();
            List<ShellPropertyType> theField;
            theField = (this.isSetInterior()?this.getInterior():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "interior", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetExterior();
            ShellPropertyType theField;
            theField = this.getExterior();
            strategy.appendField(locator, this, "exterior", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetInterior();
            List<ShellPropertyType> theField;
            theField = (this.isSetInterior()?this.getInterior():null);
            strategy.appendField(locator, this, "interior", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
