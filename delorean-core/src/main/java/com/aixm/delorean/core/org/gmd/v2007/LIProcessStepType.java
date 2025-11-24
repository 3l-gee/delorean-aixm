
package com.aixm.delorean.core.org.gmd.v2007;

import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
import com.aixm.delorean.core.org.gco.v2007.CharacterStringPropertyType;
import com.aixm.delorean.core.org.gco.v2007.DateTimePropertyType;
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
 * <p>Java class for LI_ProcessStep_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LI_ProcessStep_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         <element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/>
 *         <element name="processor" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="source" type="{http://www.isotc211.org/2005/gmd}LI_Source_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_ProcessStep_Type", propOrder = {
    "description",
    "rationale",
    "dateTime",
    "processor",
    "source"
})
public class LIProcessStepType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType description;
    protected CharacterStringPropertyType rationale;
    protected DateTimePropertyType dateTime;
    protected List<CIResponsiblePartyPropertyType> processor;
    protected List<LISourcePropertyType> source;

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
     * Gets the value of the rationale property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRationale() {
        return rationale;
    }

    /**
     * Sets the value of the rationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRationale(CharacterStringPropertyType value) {
        this.rationale = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setDateTime(DateTimePropertyType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the processor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getProcessor() {
        if (processor == null) {
            processor = new ArrayList<>();
        }
        return this.processor;
    }

    /**
     * 
     * 
     */
    public void setProcessor(List<CIResponsiblePartyPropertyType> processor) {
        this.processor = processor;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISourcePropertyType }
     * 
     * 
     */
    public List<LISourcePropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<>();
        }
        return this.source;
    }

    /**
     * 
     * 
     */
    public void setSource(List<LISourcePropertyType> source) {
        this.source = source;
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
        final LIProcessStepType that = ((LIProcessStepType) object);
        {
            boolean lhsFieldIsSet = (this.dateTime!= null);
            boolean rhsFieldIsSet = (that.dateTime!= null);
            DateTimePropertyType lhsField;
            lhsField = this.getDateTime();
            DateTimePropertyType rhsField;
            rhsField = that.getDateTime();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "dateTime", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "dateTime", rhsField);
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
            boolean lhsFieldIsSet = (this.rationale!= null);
            boolean rhsFieldIsSet = (that.rationale!= null);
            CharacterStringPropertyType lhsField;
            lhsField = this.getRationale();
            CharacterStringPropertyType rhsField;
            rhsField = that.getRationale();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rationale", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rationale", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.source!= null)&&(!this.source.isEmpty()));
            boolean rhsFieldIsSet = ((that.source!= null)&&(!that.source.isEmpty()));
            List<LISourcePropertyType> lhsField;
            lhsField = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            List<LISourcePropertyType> rhsField;
            rhsField = (((that.source!= null)&&(!that.source.isEmpty()))?that.getSource():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "source", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "source", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = ((this.processor!= null)&&(!this.processor.isEmpty()));
            boolean rhsFieldIsSet = ((that.processor!= null)&&(!that.processor.isEmpty()));
            List<CIResponsiblePartyPropertyType> lhsField;
            lhsField = (((this.processor!= null)&&(!this.processor.isEmpty()))?this.getProcessor():null);
            List<CIResponsiblePartyPropertyType> rhsField;
            rhsField = (((that.processor!= null)&&(!that.processor.isEmpty()))?that.getProcessor():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "processor", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "processor", rhsField);
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
            boolean theFieldIsSet = (this.rationale!= null);
            CharacterStringPropertyType theField;
            theField = this.getRationale();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rationale", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dateTime!= null);
            DateTimePropertyType theField;
            theField = this.getDateTime();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "dateTime", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.processor!= null)&&(!this.processor.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.processor!= null)&&(!this.processor.isEmpty()))?this.getProcessor():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "processor", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.source!= null)&&(!this.source.isEmpty()));
            List<LISourcePropertyType> theField;
            theField = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "source", theField);
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
            boolean theFieldIsSet = (this.rationale!= null);
            CharacterStringPropertyType theField;
            theField = this.getRationale();
            strategy.appendField(locator, this, "rationale", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.dateTime!= null);
            DateTimePropertyType theField;
            theField = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.processor!= null)&&(!this.processor.isEmpty()));
            List<CIResponsiblePartyPropertyType> theField;
            theField = (((this.processor!= null)&&(!this.processor.isEmpty()))?this.getProcessor():null);
            strategy.appendField(locator, this, "processor", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = ((this.source!= null)&&(!this.source.isEmpty()));
            List<LISourcePropertyType> theField;
            theField = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
