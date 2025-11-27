
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
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
 * Handling restrictions imposed on the dataset because of national security, privacy, or other concerns
 * 
 * <p>Java class for MD_SecurityConstraints_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MD_SecurityConstraints_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type">
 *       <sequence>
 *         <element name="classification" type="{http://www.isotc211.org/2005/gmd}MD_ClassificationCode_PropertyType"/>
 *         <element name="userNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="classificationSystem" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="handlingDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_SecurityConstraints_Type", propOrder = {
    "classification",
    "userNote",
    "classificationSystem",
    "handlingDescription"
})
public class MDSecurityConstraintsType
    extends MDConstraintsType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected MDClassificationCodePropertyType classification;
    protected CharacterStringPropertyType userNote;
    protected CharacterStringPropertyType classificationSystem;
    protected CharacterStringPropertyType handlingDescription;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public MDClassificationCodePropertyType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public void setClassification(MDClassificationCodePropertyType value) {
        this.classification = value;
    }

    public boolean isSetClassification() {
        return (this.classification!= null);
    }

    /**
     * Gets the value of the userNote property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserNote() {
        return userNote;
    }

    /**
     * Sets the value of the userNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserNote(CharacterStringPropertyType value) {
        this.userNote = value;
    }

    public boolean isSetUserNote() {
        return (this.userNote!= null);
    }

    /**
     * Gets the value of the classificationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getClassificationSystem() {
        return classificationSystem;
    }

    /**
     * Sets the value of the classificationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setClassificationSystem(CharacterStringPropertyType value) {
        this.classificationSystem = value;
    }

    public boolean isSetClassificationSystem() {
        return (this.classificationSystem!= null);
    }

    /**
     * Gets the value of the handlingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHandlingDescription() {
        return handlingDescription;
    }

    /**
     * Sets the value of the handlingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHandlingDescription(CharacterStringPropertyType value) {
        this.handlingDescription = value;
    }

    public boolean isSetHandlingDescription() {
        return (this.handlingDescription!= null);
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
        final MDSecurityConstraintsType that = ((MDSecurityConstraintsType) object);
        {
            boolean lhsFieldIsSet = this.isSetUserNote();
            boolean rhsFieldIsSet = that.isSetUserNote();
            CharacterStringPropertyType lhsField;
            lhsField = this.getUserNote();
            CharacterStringPropertyType rhsField;
            rhsField = that.getUserNote();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "userNote", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "userNote", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClassification();
            boolean rhsFieldIsSet = that.isSetClassification();
            MDClassificationCodePropertyType lhsField;
            lhsField = this.getClassification();
            MDClassificationCodePropertyType rhsField;
            rhsField = that.getClassification();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classification", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classification", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetHandlingDescription();
            boolean rhsFieldIsSet = that.isSetHandlingDescription();
            CharacterStringPropertyType lhsField;
            lhsField = this.getHandlingDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getHandlingDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "handlingDescription", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "handlingDescription", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetClassificationSystem();
            boolean rhsFieldIsSet = that.isSetClassificationSystem();
            CharacterStringPropertyType lhsField;
            lhsField = this.getClassificationSystem();
            CharacterStringPropertyType rhsField;
            rhsField = that.getClassificationSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "classificationSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "classificationSystem", rhsField);
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
            boolean theFieldIsSet = this.isSetClassification();
            MDClassificationCodePropertyType theField;
            theField = this.getClassification();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classification", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserNote();
            CharacterStringPropertyType theField;
            theField = this.getUserNote();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "userNote", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassificationSystem();
            CharacterStringPropertyType theField;
            theField = this.getClassificationSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "classificationSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHandlingDescription();
            CharacterStringPropertyType theField;
            theField = this.getHandlingDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "handlingDescription", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetClassification();
            MDClassificationCodePropertyType theField;
            theField = this.getClassification();
            strategy.appendField(locator, this, "classification", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUserNote();
            CharacterStringPropertyType theField;
            theField = this.getUserNote();
            strategy.appendField(locator, this, "userNote", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetClassificationSystem();
            CharacterStringPropertyType theField;
            theField = this.getClassificationSystem();
            strategy.appendField(locator, this, "classificationSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetHandlingDescription();
            CharacterStringPropertyType theField;
            theField = this.getHandlingDescription();
            strategy.appendField(locator, this, "handlingDescription", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
