
package com.aixm.delorean.aixm511.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.aixm511.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * Restrictions and legal prerequisites for accessing and using the dataset.
 * 
 * <p>Java class for MD_LegalConstraints_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_LegalConstraints_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type">
 *       <sequence>
 *         <element name="accessConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="useConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="otherConstraints" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_LegalConstraints_Type", propOrder = {
    "accessConstraints",
    "useConstraints",
    "otherConstraints"
})
public class MDLegalConstraintsType
    extends MDConstraintsType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    protected List<MDRestrictionCodePropertyType> accessConstraints;
    protected List<MDRestrictionCodePropertyType> useConstraints;
    protected List<CharacterStringPropertyType> otherConstraints;

    /**
     * Gets the value of the accessConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getAccessConstraints() {
        if (accessConstraints == null) {
            accessConstraints = new ArrayList<>();
        }
        return this.accessConstraints;
    }

    /**
     * 
     * 
     */
    public void setAccessConstraints(List<MDRestrictionCodePropertyType> accessConstraints) {
        this.accessConstraints = accessConstraints;
    }

    public boolean isSetAccessConstraints() {
        return ((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()));
    }

    public void unsetAccessConstraints() {
        this.accessConstraints = null;
    }

    /**
     * Gets the value of the useConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getUseConstraints() {
        if (useConstraints == null) {
            useConstraints = new ArrayList<>();
        }
        return this.useConstraints;
    }

    /**
     * 
     * 
     */
    public void setUseConstraints(List<MDRestrictionCodePropertyType> useConstraints) {
        this.useConstraints = useConstraints;
    }

    public boolean isSetUseConstraints() {
        return ((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()));
    }

    public void unsetUseConstraints() {
        this.useConstraints = null;
    }

    /**
     * Gets the value of the otherConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getOtherConstraints() {
        if (otherConstraints == null) {
            otherConstraints = new ArrayList<>();
        }
        return this.otherConstraints;
    }

    /**
     * 
     * 
     */
    public void setOtherConstraints(List<CharacterStringPropertyType> otherConstraints) {
        this.otherConstraints = otherConstraints;
    }

    public boolean isSetOtherConstraints() {
        return ((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()));
    }

    public void unsetOtherConstraints() {
        this.otherConstraints = null;
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
        final MDLegalConstraintsType that = ((MDLegalConstraintsType) object);
        {
            boolean lhsFieldIsSet = this.isSetAccessConstraints();
            boolean rhsFieldIsSet = that.isSetAccessConstraints();
            List<MDRestrictionCodePropertyType> lhsField;
            lhsField = (this.isSetAccessConstraints()?this.getAccessConstraints():null);
            List<MDRestrictionCodePropertyType> rhsField;
            rhsField = (that.isSetAccessConstraints()?that.getAccessConstraints():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "accessConstraints", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "accessConstraints", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUseConstraints();
            boolean rhsFieldIsSet = that.isSetUseConstraints();
            List<MDRestrictionCodePropertyType> lhsField;
            lhsField = (this.isSetUseConstraints()?this.getUseConstraints():null);
            List<MDRestrictionCodePropertyType> rhsField;
            rhsField = (that.isSetUseConstraints()?that.getUseConstraints():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "useConstraints", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "useConstraints", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOtherConstraints();
            boolean rhsFieldIsSet = that.isSetOtherConstraints();
            List<CharacterStringPropertyType> lhsField;
            lhsField = (this.isSetOtherConstraints()?this.getOtherConstraints():null);
            List<CharacterStringPropertyType> rhsField;
            rhsField = (that.isSetOtherConstraints()?that.getOtherConstraints():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "otherConstraints", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "otherConstraints", rhsField);
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
            boolean theFieldIsSet = this.isSetAccessConstraints();
            List<MDRestrictionCodePropertyType> theField;
            theField = (this.isSetAccessConstraints()?this.getAccessConstraints():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "accessConstraints", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUseConstraints();
            List<MDRestrictionCodePropertyType> theField;
            theField = (this.isSetUseConstraints()?this.getUseConstraints():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "useConstraints", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOtherConstraints();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetOtherConstraints()?this.getOtherConstraints():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "otherConstraints", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetAccessConstraints();
            List<MDRestrictionCodePropertyType> theField;
            theField = (this.isSetAccessConstraints()?this.getAccessConstraints():null);
            strategy.appendField(locator, this, "accessConstraints", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUseConstraints();
            List<MDRestrictionCodePropertyType> theField;
            theField = (this.isSetUseConstraints()?this.getUseConstraints():null);
            strategy.appendField(locator, this, "useConstraints", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOtherConstraints();
            List<CharacterStringPropertyType> theField;
            theField = (this.isSetOtherConstraints()?this.getOtherConstraints():null);
            strategy.appendField(locator, this, "otherConstraints", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
