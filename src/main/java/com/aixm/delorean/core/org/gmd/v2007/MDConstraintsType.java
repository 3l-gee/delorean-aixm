
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
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
 * Restrictions on the access and use of a dataset or metadata
 * 
 * <p>Java class for MD_Constraints_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_Constraints_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="useLimitation" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Constraints_Type", propOrder = {
    "useLimitation"
})
@XmlSeeAlso({
    MDLegalConstraintsType.class,
    MDSecurityConstraintsType.class
})
public class MDConstraintsType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<CharacterStringPropertyType> useLimitation;

    /**
     * Gets the value of the useLimitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useLimitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseLimitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getUseLimitation() {
        if (useLimitation == null) {
            useLimitation = new ArrayList<>();
        }
        return this.useLimitation;
    }

    /**
     * 
     * 
     */
    public void setUseLimitation(List<CharacterStringPropertyType> useLimitation) {
        this.useLimitation = useLimitation;
    }

    public boolean isSetUseLimitation() {
        return ((this.useLimitation!= null)&&(!this.useLimitation.isEmpty()));
    }

    public void unsetUseLimitation() {
        this.useLimitation = null;
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
        final MDConstraintsType that = ((MDConstraintsType) object);
        {
            boolean lhsFieldIsSet = this.isSetUseLimitation();
            boolean rhsFieldIsSet = that.isSetUseLimitation();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetUseLimitation()?this.getUseLimitation():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetUseLimitation()?that.getUseLimitation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "useLimitation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "useLimitation", rhsField);
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
            boolean theFieldIsSet = this.isSetUseLimitation();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetUseLimitation()?this.getUseLimitation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "useLimitation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetUseLimitation();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetUseLimitation()?this.getUseLimitation():null);
            strategy.appendField(locator, this, "useLimitation", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
