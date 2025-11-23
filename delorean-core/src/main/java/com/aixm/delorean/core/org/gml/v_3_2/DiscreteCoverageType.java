
package com.aixm.delorean.core.org.gml.v_3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for DiscreteCoverageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiscreteCoverageType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCoverageType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}coverageFunction" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscreteCoverageType", propOrder = {
    "coverageFunction"
})
public class DiscreteCoverageType
    extends AbstractCoverageType
{

    /**
     * The gml:coverageFunction property describes the mapping function from the domain to the range of the coverage.
     * The value of the CoverageFunction is one of gml:CoverageMappingRule and gml:GridFunction.
     * If the gml:coverageFunction property is omitted for a gridded coverage (including rectified gridded coverages) the gml:startPoint is assumed to be the value of the gml:low property in the gml:Grid geometry, and the gml:sequenceRule is assumed to be linear and the gml:axisOrder property is assumed to be "+1 +2".
     * 
     */
    protected CoverageFunctionType coverageFunction;

    /**
     * The gml:coverageFunction property describes the mapping function from the domain to the range of the coverage.
     * The value of the CoverageFunction is one of gml:CoverageMappingRule and gml:GridFunction.
     * If the gml:coverageFunction property is omitted for a gridded coverage (including rectified gridded coverages) the gml:startPoint is assumed to be the value of the gml:low property in the gml:Grid geometry, and the gml:sequenceRule is assumed to be linear and the gml:axisOrder property is assumed to be "+1 +2".
     * 
     * @return
     *     possible object is
     *     {@link CoverageFunctionType }
     *     
     */
    public CoverageFunctionType getCoverageFunction() {
        return coverageFunction;
    }

    /**
     * Sets the value of the coverageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageFunctionType }
     *     
     * @see #getCoverageFunction()
     */
    public void setCoverageFunction(CoverageFunctionType value) {
        this.coverageFunction = value;
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
        final DiscreteCoverageType that = ((DiscreteCoverageType) object);
        {
            boolean lhsFieldIsSet = (this.coverageFunction!= null);
            boolean rhsFieldIsSet = (that.coverageFunction!= null);
            CoverageFunctionType lhsField;
            lhsField = this.getCoverageFunction();
            CoverageFunctionType rhsField;
            rhsField = that.getCoverageFunction();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coverageFunction", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coverageFunction", rhsField);
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
            boolean theFieldIsSet = (this.coverageFunction!= null);
            CoverageFunctionType theField;
            theField = this.getCoverageFunction();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coverageFunction", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.coverageFunction!= null);
            CoverageFunctionType theField;
            theField = this.getCoverageFunction();
            strategy.appendField(locator, this, "coverageFunction", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
