
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
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
 * <p>Java class for PT_FreeText_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PT_FreeText_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="textGroup" type="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString_PropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_FreeText_Type", propOrder = {
    "textGroup"
})
public class PTFreeTextType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected List<LocalisedCharacterStringPropertyType> textGroup;

    /**
     * Gets the value of the textGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalisedCharacterStringPropertyType }
     * 
     * 
     */
    public List<LocalisedCharacterStringPropertyType> getTextGroup() {
        if (textGroup == null) {
            textGroup = new ArrayList<>();
        }
        return this.textGroup;
    }

    /**
     * 
     * 
     */
    public void setTextGroup(List<LocalisedCharacterStringPropertyType> textGroup) {
        this.textGroup = textGroup;
    }

    public boolean isSetTextGroup() {
        return ((this.textGroup!= null)&&(!this.textGroup.isEmpty()));
    }

    public void unsetTextGroup() {
        this.textGroup = null;
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
        final PTFreeTextType that = ((PTFreeTextType) object);
        {
            boolean lhsFieldIsSet = this.isSetTextGroup();
            boolean rhsFieldIsSet = that.isSetTextGroup();
            List<LocalisedCharacterStringPropertyType> lhsField;
            lhsField = (this.isSetTextGroup()?this.getTextGroup():null);
            List<LocalisedCharacterStringPropertyType> rhsField;
            rhsField = (that.isSetTextGroup()?that.getTextGroup():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "textGroup", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "textGroup", rhsField);
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
            boolean theFieldIsSet = this.isSetTextGroup();
            List<LocalisedCharacterStringPropertyType> theField;
            theField = (this.isSetTextGroup()?this.getTextGroup():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "textGroup", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetTextGroup();
            List<LocalisedCharacterStringPropertyType> theField;
            theField = (this.isSetTextGroup()?this.getTextGroup():null);
            strategy.appendField(locator, this, "textGroup", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
