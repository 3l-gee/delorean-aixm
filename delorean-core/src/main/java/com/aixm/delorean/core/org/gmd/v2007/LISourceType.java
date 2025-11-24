
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for LI_Source_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LI_Source_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="scaleDenominator" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType" minOccurs="0"/>
 *         <element name="sourceReferenceSystem" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" minOccurs="0"/>
 *         <element name="sourceCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         <element name="sourceExtent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sourceStep" type="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_Source_Type", propOrder = {
    "description",
    "scaleDenominator",
    "sourceReferenceSystem",
    "sourceCitation",
    "sourceExtent",
    "sourceStep"
})
public class LISourceType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType description;
    protected MDRepresentativeFractionPropertyType scaleDenominator;
    protected MDReferenceSystemPropertyType sourceReferenceSystem;
    protected CICitationPropertyType sourceCitation;
    protected List<EXExtentPropertyType> sourceExtent;
    protected List<LIProcessStepPropertyType> sourceStep;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * Gets the value of the scaleDenominator property.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getScaleDenominator() {
        return scaleDenominator;
    }

    /**
     * Sets the value of the scaleDenominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setScaleDenominator(MDRepresentativeFractionPropertyType value) {
        this.scaleDenominator = value;
    }

    /**
     * Gets the value of the sourceReferenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public MDReferenceSystemPropertyType getSourceReferenceSystem() {
        return sourceReferenceSystem;
    }

    /**
     * Sets the value of the sourceReferenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public void setSourceReferenceSystem(MDReferenceSystemPropertyType value) {
        this.sourceReferenceSystem = value;
    }

    /**
     * Gets the value of the sourceCitation property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getSourceCitation() {
        return sourceCitation;
    }

    /**
     * Sets the value of the sourceCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setSourceCitation(CICitationPropertyType value) {
        this.sourceCitation = value;
    }

    /**
     * Gets the value of the sourceExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getSourceExtent() {
        if (sourceExtent == null) {
            sourceExtent = new ArrayList<>();
        }
        return this.sourceExtent;
    }

    /**
     * 
     * 
     */
    public void setSourceExtent(List<EXExtentPropertyType> sourceExtent) {
        this.sourceExtent = sourceExtent;
    }

    /**
     * Gets the value of the sourceStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIProcessStepPropertyType }
     * 
     * 
     */
    public List<LIProcessStepPropertyType> getSourceStep() {
        if (sourceStep == null) {
            sourceStep = new ArrayList<>();
        }
        return this.sourceStep;
    }

    /**
     * 
     * 
     */
    public void setSourceStep(List<LIProcessStepPropertyType> sourceStep) {
        this.sourceStep = sourceStep;
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
        final LISourceType that = ((LISourceType) object);
        {
            boolean lhsFieldIsSet = ((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()));
            boolean rhsFieldIsSet = ((that.sourceStep!= null)&&(!that.sourceStep.isEmpty()));
            List<LIProcessStepPropertyType> lhsField;
            lhsField = (((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()))?this.getSourceStep():null);
            List<LIProcessStepPropertyType> rhsField;
            rhsField = (((that.sourceStep!= null)&&(!that.sourceStep.isEmpty()))?that.getSourceStep():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sourceStep", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sourceStep", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.description!= null);
            boolean rhsFieldIsSet = (that.description!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getDescription();
            CharacterStringPropertyType rhsField;
            rhsField = that.getDescription();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "description", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "description", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.sourceReferenceSystem!= null);
            boolean rhsFieldIsSet = (that.sourceReferenceSystem!= null);
            MDReferenceSystemPropertyType lhsField;
            lhsField = this.getSourceReferenceSystem();
            MDReferenceSystemPropertyType rhsField;
            rhsField = that.getSourceReferenceSystem();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sourceReferenceSystem", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sourceReferenceSystem", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.sourceCitation!= null);
            boolean rhsFieldIsSet = (that.sourceCitation!= null);
            CICitationPropertyType lhsField;
            lhsField = this.getSourceCitation();
            CICitationPropertyType rhsField;
            rhsField = that.getSourceCitation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sourceCitation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sourceCitation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()));
            boolean rhsFieldIsSet = ((that.sourceExtent!= null)&&(!that.sourceExtent.isEmpty()));
            List<EXExtentPropertyType> lhsField;
            lhsField = (((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()))?this.getSourceExtent():null);
            List<EXExtentPropertyType> rhsField;
            rhsField = (((that.sourceExtent!= null)&&(!that.sourceExtent.isEmpty()))?that.getSourceExtent():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sourceExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sourceExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.scaleDenominator!= null);
            boolean rhsFieldIsSet = (that.scaleDenominator!= null);
            MDRepresentativeFractionPropertyType lhsField;
            lhsField = this.getScaleDenominator();
            MDRepresentativeFractionPropertyType rhsField;
            rhsField = that.getScaleDenominator();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "scaleDenominator", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "scaleDenominator", rhsField);
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
            boolean theFieldIsSet = (this.description!= null);
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "description", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.scaleDenominator!= null);
            MDRepresentativeFractionPropertyType theField;
            theField = this.getScaleDenominator();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "scaleDenominator", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.sourceReferenceSystem!= null);
            MDReferenceSystemPropertyType theField;
            theField = this.getSourceReferenceSystem();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sourceReferenceSystem", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.sourceCitation!= null);
            CICitationPropertyType theField;
            theField = this.getSourceCitation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sourceCitation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()));
            List<EXExtentPropertyType> theField;
            theField = (((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()))?this.getSourceExtent():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sourceExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()));
            List<LIProcessStepPropertyType> theField;
            theField = (((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()))?this.getSourceStep():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sourceStep", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.description!= null);
            CharacterStringPropertyType theField;
            theField = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.scaleDenominator!= null);
            MDRepresentativeFractionPropertyType theField;
            theField = this.getScaleDenominator();
            strategy.appendField(locator, this, "scaleDenominator", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.sourceReferenceSystem!= null);
            MDReferenceSystemPropertyType theField;
            theField = this.getSourceReferenceSystem();
            strategy.appendField(locator, this, "sourceReferenceSystem", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.sourceCitation!= null);
            CICitationPropertyType theField;
            theField = this.getSourceCitation();
            strategy.appendField(locator, this, "sourceCitation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()));
            List<EXExtentPropertyType> theField;
            theField = (((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()))?this.getSourceExtent():null);
            strategy.appendField(locator, this, "sourceExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()));
            List<LIProcessStepPropertyType> theField;
            theField = (((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()))?this.getSourceStep():null);
            strategy.appendField(locator, this, "sourceStep", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
