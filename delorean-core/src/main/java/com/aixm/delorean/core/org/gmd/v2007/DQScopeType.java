
package com.aixm.delorean.core.org.gmd.v2007;

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
 * <p>Java class for DQ_Scope_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DQ_Scope_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="level" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType"/>
 *         <element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" minOccurs="0"/>
 *         <element name="levelDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Scope_Type", propOrder = {
    "level",
    "extent",
    "levelDescription"
})
public class DQScopeType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDScopeCodePropertyType level;
    protected EXExtentPropertyType extent;
    protected List<MDScopeDescriptionPropertyType> levelDescription;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public MDScopeCodePropertyType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public void setLevel(MDScopeCodePropertyType value) {
        this.level = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public EXExtentPropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public void setExtent(EXExtentPropertyType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the levelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getLevelDescription() {
        if (levelDescription == null) {
            levelDescription = new ArrayList<>();
        }
        return this.levelDescription;
    }

    /**
     * 
     * 
     */
    public void setLevelDescription(List<MDScopeDescriptionPropertyType> levelDescription) {
        this.levelDescription = levelDescription;
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
        final DQScopeType that = ((DQScopeType) object);
        {
            boolean lhsFieldIsSet = (this.level!= null);
            boolean rhsFieldIsSet = (that.level!= null);
            MDScopeCodePropertyType lhsField;
            lhsField = this.getLevel();
            MDScopeCodePropertyType rhsField;
            rhsField = that.getLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "level", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "level", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()));
            boolean rhsFieldIsSet = ((that.levelDescription!= null)&&(!that.levelDescription.isEmpty()));
            List<MDScopeDescriptionPropertyType> lhsField;
            lhsField = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
            List<MDScopeDescriptionPropertyType> rhsField;
            rhsField = (((that.levelDescription!= null)&&(!that.levelDescription.isEmpty()))?that.getLevelDescription():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "levelDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "levelDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.extent!= null);
            boolean rhsFieldIsSet = (that.extent!= null);
            EXExtentPropertyType lhsField;
            lhsField = this.getExtent();
            EXExtentPropertyType rhsField;
            rhsField = that.getExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extent", rhsField);
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
            boolean theFieldIsSet = (this.level!= null);
            MDScopeCodePropertyType theField;
            theField = this.getLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "level", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.extent!= null);
            EXExtentPropertyType theField;
            theField = this.getExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()));
            List<MDScopeDescriptionPropertyType> theField;
            theField = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "levelDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.level!= null);
            MDScopeCodePropertyType theField;
            theField = this.getLevel();
            strategy.appendField(locator, this, "level", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.extent!= null);
            EXExtentPropertyType theField;
            theField = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()));
            List<MDScopeDescriptionPropertyType> theField;
            theField = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
            strategy.appendField(locator, this, "levelDescription", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
