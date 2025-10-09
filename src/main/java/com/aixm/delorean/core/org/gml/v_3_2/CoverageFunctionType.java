
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for CoverageFunctionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CoverageFunctionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}MappingRule"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}CoverageMappingRule"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}GridFunction"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageFunctionType", propOrder = {
    "mappingRule",
    "coverageMappingRule",
    "gridFunction"
})
public class CoverageFunctionType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(name = "MappingRule")
    protected StringOrRefType mappingRule;
    /**
     * gml:CoverageMappingRule provides a formal or informal description of the coverage function.
     * The mapping rule may be defined as an in-line string (gml:ruleDefinition) or via a remote reference through xlink:href (gml:ruleReference).  
     * If no rule name is specified, the default is 'Linear' with respect to members of the domain in document order.
     * 
     */
    @XmlElement(name = "CoverageMappingRule")
    protected MappingRuleType coverageMappingRule;
    /**
     * gml:GridFunction provides an explicit mapping rule for grid geometries, i.e. the domain shall be a geometry of type grid.  It describes the mapping of grid posts (discrete point grid coverage) or grid cells (discrete surface coverage) to the values in the range set.
     * The gml:startPoint is the index position of a point in the grid that is mapped to the first point in the range set (this is also the index position of the first grid post).  If the gml:startPoint property is omitted the gml:startPoint is assumed to be equal to the value of gml:low in the gml:Grid geometry. Subsequent points in the mapping are determined by the value of the gml:sequenceRule.
     * 
     */
    @XmlElement(name = "GridFunction")
    protected GridFunctionType gridFunction;

    /**
     * Gets the value of the mappingRule property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getMappingRule() {
        return mappingRule;
    }

    /**
     * Sets the value of the mappingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setMappingRule(StringOrRefType value) {
        this.mappingRule = value;
    }

    public boolean isSetMappingRule() {
        return (this.mappingRule!= null);
    }

    /**
     * gml:CoverageMappingRule provides a formal or informal description of the coverage function.
     * The mapping rule may be defined as an in-line string (gml:ruleDefinition) or via a remote reference through xlink:href (gml:ruleReference).  
     * If no rule name is specified, the default is 'Linear' with respect to members of the domain in document order.
     * 
     * @return
     *     possible object is
     *     {@link MappingRuleType }
     *     
     */
    public MappingRuleType getCoverageMappingRule() {
        return coverageMappingRule;
    }

    /**
     * Sets the value of the coverageMappingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingRuleType }
     *     
     * @see #getCoverageMappingRule()
     */
    public void setCoverageMappingRule(MappingRuleType value) {
        this.coverageMappingRule = value;
    }

    public boolean isSetCoverageMappingRule() {
        return (this.coverageMappingRule!= null);
    }

    /**
     * gml:GridFunction provides an explicit mapping rule for grid geometries, i.e. the domain shall be a geometry of type grid.  It describes the mapping of grid posts (discrete point grid coverage) or grid cells (discrete surface coverage) to the values in the range set.
     * The gml:startPoint is the index position of a point in the grid that is mapped to the first point in the range set (this is also the index position of the first grid post).  If the gml:startPoint property is omitted the gml:startPoint is assumed to be equal to the value of gml:low in the gml:Grid geometry. Subsequent points in the mapping are determined by the value of the gml:sequenceRule.
     * 
     * @return
     *     possible object is
     *     {@link GridFunctionType }
     *     
     */
    public GridFunctionType getGridFunction() {
        return gridFunction;
    }

    /**
     * Sets the value of the gridFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridFunctionType }
     *     
     * @see #getGridFunction()
     */
    public void setGridFunction(GridFunctionType value) {
        this.gridFunction = value;
    }

    public boolean isSetGridFunction() {
        return (this.gridFunction!= null);
    }

    @Override
    public boolean equals(Object object) {
        ObjectLocator thisLocator = null;
        ObjectLocator thatLocator = null;
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            thisLocator = new DefaultRootObjectLocator(this);
            thatLocator = new DefaultRootObjectLocator(object);
        }
        return equals(thisLocator, thatLocator, object, strategy);
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CoverageFunctionType that = ((CoverageFunctionType) object);
        {
            boolean lhsFieldIsSet = this.isSetGridFunction();
            boolean rhsFieldIsSet = that.isSetGridFunction();
            GridFunctionType lhsField;
            lhsField = this.getGridFunction();
            GridFunctionType rhsField;
            rhsField = that.getGridFunction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "gridFunction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "gridFunction", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMappingRule();
            boolean rhsFieldIsSet = that.isSetMappingRule();
            StringOrRefType lhsField;
            lhsField = this.getMappingRule();
            StringOrRefType rhsField;
            rhsField = that.getMappingRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "mappingRule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "mappingRule", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCoverageMappingRule();
            boolean rhsFieldIsSet = that.isSetCoverageMappingRule();
            MappingRuleType lhsField;
            lhsField = this.getCoverageMappingRule();
            MappingRuleType rhsField;
            rhsField = that.getCoverageMappingRule();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coverageMappingRule", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coverageMappingRule", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        ObjectLocator theLocator = null;
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
        if (strategy.isDebugEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        return this.hashCode(theLocator, strategy);
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theFieldIsSet = this.isSetMappingRule();
            StringOrRefType theField;
            theField = this.getMappingRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "mappingRule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoverageMappingRule();
            MappingRuleType theField;
            theField = this.getCoverageMappingRule();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coverageMappingRule", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGridFunction();
            GridFunctionType theField;
            theField = this.getGridFunction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "gridFunction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        ObjectLocator theLocator = null;
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        if (strategy.isTraceEnabled()) {
            theLocator = new DefaultRootObjectLocator(this);
        }
        final StringBuilder buffer = new StringBuilder();
        append(theLocator, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theFieldIsSet = this.isSetMappingRule();
            StringOrRefType theField;
            theField = this.getMappingRule();
            strategy.appendField(locator, this, "mappingRule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoverageMappingRule();
            MappingRuleType theField;
            theField = this.getCoverageMappingRule();
            strategy.appendField(locator, this, "coverageMappingRule", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGridFunction();
            GridFunctionType theField;
            theField = this.getGridFunction();
            strategy.appendField(locator, this, "gridFunction", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
