
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
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
 * <p>Java class for LI_Lineage_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LI_Lineage_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="statement" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         <element name="processStep" type="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LI_Lineage_Type", propOrder = {
    "statement",
    "processStep",
    "source"
})
public class LILineageType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected CharacterStringPropertyType statement;
    protected List<LIProcessStepPropertyType> processStep;
    protected List<LISourcePropertyType> source;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setStatement(CharacterStringPropertyType value) {
        this.statement = value;
    }

    public boolean isSetStatement() {
        return (this.statement!= null);
    }

    /**
     * Gets the value of the processStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIProcessStepPropertyType }
     * 
     * 
     */
    public List<LIProcessStepPropertyType> getProcessStep() {
        if (processStep == null) {
            processStep = new ArrayList<>();
        }
        return this.processStep;
    }

    /**
     * 
     * 
     */
    public void setProcessStep(List<LIProcessStepPropertyType> processStep) {
        this.processStep = processStep;
    }

    public boolean isSetProcessStep() {
        return ((this.processStep!= null)&&(!this.processStep.isEmpty()));
    }

    public void unsetProcessStep() {
        this.processStep = null;
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

    public boolean isSetSource() {
        return ((this.source!= null)&&(!this.source.isEmpty()));
    }

    public void unsetSource() {
        this.source = null;
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
        final LILineageType that = ((LILineageType) object);
        {
            boolean lhsFieldIsSet = this.isSetSource();
            boolean rhsFieldIsSet = that.isSetSource();
            List<LISourcePropertyType> lhsField;
            lhsField = (this.isSetSource()?this.getSource():null);
            List<LISourcePropertyType> rhsField;
            rhsField = (that.isSetSource()?that.getSource():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "source", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "source", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetStatement();
            boolean rhsFieldIsSet = that.isSetStatement();
            CharacterStringPropertyType lhsField;
            lhsField = this.getStatement();
            CharacterStringPropertyType rhsField;
            rhsField = that.getStatement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "statement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "statement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetProcessStep();
            boolean rhsFieldIsSet = that.isSetProcessStep();
            List<LIProcessStepPropertyType> lhsField;
            lhsField = (this.isSetProcessStep()?this.getProcessStep():null);
            List<LIProcessStepPropertyType> rhsField;
            rhsField = (that.isSetProcessStep()?that.getProcessStep():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "processStep", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "processStep", rhsField);
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
            boolean theFieldIsSet = this.isSetStatement();
            CharacterStringPropertyType theField;
            theField = this.getStatement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "statement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcessStep();
            List<LIProcessStepPropertyType> theField;
            theField = (this.isSetProcessStep()?this.getProcessStep():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "processStep", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSource();
            List<LISourcePropertyType> theField;
            theField = (this.isSetSource()?this.getSource():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "source", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetStatement();
            CharacterStringPropertyType theField;
            theField = this.getStatement();
            strategy.appendField(locator, this, "statement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetProcessStep();
            List<LIProcessStepPropertyType> theField;
            theField = (this.isSetProcessStep()?this.getProcessStep():null);
            strategy.appendField(locator, this, "processStep", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSource();
            List<LISourcePropertyType> theField;
            theField = (this.isSetSource()?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
