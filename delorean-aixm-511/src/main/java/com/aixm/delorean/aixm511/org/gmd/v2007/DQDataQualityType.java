
package com.aixm.delorean.aixm511.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.aixm511.org.gco.v2007.AbstractObjectType;
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
 * <p>Java class for DQ_DataQuality_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DQ_DataQuality_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="scope" type="{http://www.isotc211.org/2005/gmd}DQ_Scope_PropertyType"/>
 *         <element name="report" type="{http://www.isotc211.org/2005/gmd}DQ_Element_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lineage" type="{http://www.isotc211.org/2005/gmd}LI_Lineage_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_DataQuality_Type", propOrder = {
    "scope",
    "report",
    "lineage"
})
public class DQDataQualityType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(required = true)
    protected DQScopePropertyType scope;
    protected List<DQElementPropertyType> report;
    protected LILineagePropertyType lineage;

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link DQScopePropertyType }
     *     
     */
    public DQScopePropertyType getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DQScopePropertyType }
     *     
     */
    public void setScope(DQScopePropertyType value) {
        this.scope = value;
    }

    public boolean isSetScope() {
        return (this.scope!= null);
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQElementPropertyType }
     * 
     * 
     */
    public List<DQElementPropertyType> getReport() {
        if (report == null) {
            report = new ArrayList<>();
        }
        return this.report;
    }

    /**
     * 
     * 
     */
    public void setReport(List<DQElementPropertyType> report) {
        this.report = report;
    }

    public boolean isSetReport() {
        return ((this.report!= null)&&(!this.report.isEmpty()));
    }

    public void unsetReport() {
        this.report = null;
    }

    /**
     * Gets the value of the lineage property.
     * 
     * @return
     *     possible object is
     *     {@link LILineagePropertyType }
     *     
     */
    public LILineagePropertyType getLineage() {
        return lineage;
    }

    /**
     * Sets the value of the lineage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LILineagePropertyType }
     *     
     */
    public void setLineage(LILineagePropertyType value) {
        this.lineage = value;
    }

    public boolean isSetLineage() {
        return (this.lineage!= null);
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
        final DQDataQualityType that = ((DQDataQualityType) object);
        {
            boolean lhsFieldIsSet = this.isSetScope();
            boolean rhsFieldIsSet = that.isSetScope();
            DQScopePropertyType lhsField;
            lhsField = this.getScope();
            DQScopePropertyType rhsField;
            rhsField = that.getScope();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "scope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "scope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLineage();
            boolean rhsFieldIsSet = that.isSetLineage();
            LILineagePropertyType lhsField;
            lhsField = this.getLineage();
            LILineagePropertyType rhsField;
            rhsField = that.getLineage();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lineage", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lineage", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReport();
            boolean rhsFieldIsSet = that.isSetReport();
            List<DQElementPropertyType> lhsField;
            lhsField = (this.isSetReport()?this.getReport():null);
            List<DQElementPropertyType> rhsField;
            rhsField = (that.isSetReport()?that.getReport():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "report", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "report", rhsField);
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
            boolean theFieldIsSet = this.isSetScope();
            DQScopePropertyType theField;
            theField = this.getScope();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "scope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReport();
            List<DQElementPropertyType> theField;
            theField = (this.isSetReport()?this.getReport():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "report", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLineage();
            LILineagePropertyType theField;
            theField = this.getLineage();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lineage", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetScope();
            DQScopePropertyType theField;
            theField = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReport();
            List<DQElementPropertyType> theField;
            theField = (this.isSetReport()?this.getReport():null);
            strategy.appendField(locator, this, "report", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLineage();
            LILineagePropertyType theField;
            theField = this.getLineage();
            strategy.appendField(locator, this, "lineage", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
