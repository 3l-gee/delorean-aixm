
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractCoordinateOperationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractCoordinateOperationType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}operationVersion" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}coordinateOperationAccuracy" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}sourceCRS" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}targetCRS" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateOperationType", propOrder = {
    "domainOfValidity",
    "scope",
    "operationVersion",
    "coordinateOperationAccuracy",
    "sourceCRS",
    "targetCRS"
})
@XmlSeeAlso({
    ConcatenatedOperationType.class,
    PassThroughOperationType.class,
    AbstractGeneralConversionType.class,
    AbstractGeneralTransformationType.class
})
public abstract class AbstractCoordinateOperationType
    extends IdentifiedObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    /**
     * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
     * 
     */
    protected DomainOfValidity domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;
    /**
     * gml:operationVersion is the version of the coordinate transformation (i.e., instantiation due to the stochastic nature of the parameters). Mandatory when describing a transformation, and should not be supplied for a conversion.
     * 
     */
    protected String operationVersion;
    protected List<CoordinateOperationAccuracy> coordinateOperationAccuracy;
    /**
     * gml:sourceCRS is an association role to the source CRS (coordinate reference system) of this coordinate operation.
     * 
     */
    protected CRSPropertyType sourceCRS;
    /**
     * gml:targetCRS is an association role to the target CRS (coordinate reference system) of this coordinate operation.
     * 
     */
    protected CRSPropertyType targetCRS;

    /**
     * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
     * 
     * @return
     *     possible object is
     *     {@link DomainOfValidity }
     *     
     */
    public DomainOfValidity getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * Sets the value of the domainOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainOfValidity }
     *     
     * @see #getDomainOfValidity()
     */
    public void setDomainOfValidity(DomainOfValidity value) {
        this.domainOfValidity = value;
    }

    public boolean isSetDomainOfValidity() {
        return (this.domainOfValidity!= null);
    }

    /**
     * The gml:scope property provides a description of the usage, or limitations of usage, for which this CRS-related object is valid. If unknown, enter "not known".Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<>();
        }
        return this.scope;
    }

    /**
     * The gml:scope property provides a description of the usage, or limitations of usage, for which this CRS-related object is valid. If unknown, enter "not known".
     * 
     */
    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public boolean isSetScope() {
        return ((this.scope!= null)&&(!this.scope.isEmpty()));
    }

    public void unsetScope() {
        this.scope = null;
    }

    /**
     * gml:operationVersion is the version of the coordinate transformation (i.e., instantiation due to the stochastic nature of the parameters). Mandatory when describing a transformation, and should not be supplied for a conversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationVersion() {
        return operationVersion;
    }

    /**
     * Sets the value of the operationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperationVersion()
     */
    public void setOperationVersion(String value) {
        this.operationVersion = value;
    }

    public boolean isSetOperationVersion() {
        return (this.operationVersion!= null);
    }

    /**
     * gml:coordinateOperationAccuracy is an association role to a DQ_PositionalAccuracy object as encoded in ISO/TS 19139, either referencing or containing the definition of that positional accuracy. That object contains an estimate of the impact of this coordinate operation on point accuracy. That is, it gives position error estimates for the target coordinates of this coordinate operation, assuming no errors in the source coordinates.Gets the value of the coordinateOperationAccuracy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateOperationAccuracy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateOperationAccuracy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateOperationAccuracy }
     * 
     * 
     */
    public List<CoordinateOperationAccuracy> getCoordinateOperationAccuracy() {
        if (coordinateOperationAccuracy == null) {
            coordinateOperationAccuracy = new ArrayList<>();
        }
        return this.coordinateOperationAccuracy;
    }

    /**
     * gml:coordinateOperationAccuracy is an association role to a DQ_PositionalAccuracy object as encoded in ISO/TS 19139, either referencing or containing the definition of that positional accuracy. That object contains an estimate of the impact of this coordinate operation on point accuracy. That is, it gives position error estimates for the target coordinates of this coordinate operation, assuming no errors in the source coordinates.
     * 
     */
    public void setCoordinateOperationAccuracy(List<CoordinateOperationAccuracy> coordinateOperationAccuracy) {
        this.coordinateOperationAccuracy = coordinateOperationAccuracy;
    }

    public boolean isSetCoordinateOperationAccuracy() {
        return ((this.coordinateOperationAccuracy!= null)&&(!this.coordinateOperationAccuracy.isEmpty()));
    }

    public void unsetCoordinateOperationAccuracy() {
        this.coordinateOperationAccuracy = null;
    }

    /**
     * gml:sourceCRS is an association role to the source CRS (coordinate reference system) of this coordinate operation.
     * 
     * @return
     *     possible object is
     *     {@link CRSPropertyType }
     *     
     */
    public CRSPropertyType getSourceCRS() {
        return sourceCRS;
    }

    /**
     * Sets the value of the sourceCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSPropertyType }
     *     
     * @see #getSourceCRS()
     */
    public void setSourceCRS(CRSPropertyType value) {
        this.sourceCRS = value;
    }

    public boolean isSetSourceCRS() {
        return (this.sourceCRS!= null);
    }

    /**
     * gml:targetCRS is an association role to the target CRS (coordinate reference system) of this coordinate operation.
     * 
     * @return
     *     possible object is
     *     {@link CRSPropertyType }
     *     
     */
    public CRSPropertyType getTargetCRS() {
        return targetCRS;
    }

    /**
     * Sets the value of the targetCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSPropertyType }
     *     
     * @see #getTargetCRS()
     */
    public void setTargetCRS(CRSPropertyType value) {
        this.targetCRS = value;
    }

    public boolean isSetTargetCRS() {
        return (this.targetCRS!= null);
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
        final AbstractCoordinateOperationType that = ((AbstractCoordinateOperationType) object);
        {
            boolean lhsFieldIsSet = this.isSetOperationVersion();
            boolean rhsFieldIsSet = that.isSetOperationVersion();
            String lhsField;
            lhsField = this.getOperationVersion();
            String rhsField;
            rhsField = that.getOperationVersion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "operationVersion", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "operationVersion", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTargetCRS();
            boolean rhsFieldIsSet = that.isSetTargetCRS();
            CRSPropertyType lhsField;
            lhsField = this.getTargetCRS();
            CRSPropertyType rhsField;
            rhsField = that.getTargetCRS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "targetCRS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "targetCRS", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetScope();
            boolean rhsFieldIsSet = that.isSetScope();
            List<String> lhsField;
            lhsField = (this.isSetScope()?this.getScope():null);
            List<String> rhsField;
            rhsField = (that.isSetScope()?that.getScope():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "scope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "scope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCoordinateOperationAccuracy();
            boolean rhsFieldIsSet = that.isSetCoordinateOperationAccuracy();
            List<CoordinateOperationAccuracy> lhsField;
            lhsField = (this.isSetCoordinateOperationAccuracy()?this.getCoordinateOperationAccuracy():null);
            List<CoordinateOperationAccuracy> rhsField;
            rhsField = (that.isSetCoordinateOperationAccuracy()?that.getCoordinateOperationAccuracy():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "coordinateOperationAccuracy", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "coordinateOperationAccuracy", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDomainOfValidity();
            boolean rhsFieldIsSet = that.isSetDomainOfValidity();
            DomainOfValidity lhsField;
            lhsField = this.getDomainOfValidity();
            DomainOfValidity rhsField;
            rhsField = that.getDomainOfValidity();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainOfValidity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainOfValidity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSourceCRS();
            boolean rhsFieldIsSet = that.isSetSourceCRS();
            CRSPropertyType lhsField;
            lhsField = this.getSourceCRS();
            CRSPropertyType rhsField;
            rhsField = that.getSourceCRS();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "sourceCRS", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "sourceCRS", rhsField);
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
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            DomainOfValidity theField;
            theField = this.getDomainOfValidity();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "domainOfValidity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScope();
            List<String> theField;
            theField = (this.isSetScope()?this.getScope():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "scope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationVersion();
            String theField;
            theField = this.getOperationVersion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "operationVersion", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinateOperationAccuracy();
            List<CoordinateOperationAccuracy> theField;
            theField = (this.isSetCoordinateOperationAccuracy()?this.getCoordinateOperationAccuracy():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "coordinateOperationAccuracy", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSourceCRS();
            CRSPropertyType theField;
            theField = this.getSourceCRS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "sourceCRS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTargetCRS();
            CRSPropertyType theField;
            theField = this.getTargetCRS();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "targetCRS", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            DomainOfValidity theField;
            theField = this.getDomainOfValidity();
            strategy.appendField(locator, this, "domainOfValidity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScope();
            List<String> theField;
            theField = (this.isSetScope()?this.getScope():null);
            strategy.appendField(locator, this, "scope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOperationVersion();
            String theField;
            theField = this.getOperationVersion();
            strategy.appendField(locator, this, "operationVersion", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCoordinateOperationAccuracy();
            List<CoordinateOperationAccuracy> theField;
            theField = (this.isSetCoordinateOperationAccuracy()?this.getCoordinateOperationAccuracy():null);
            strategy.appendField(locator, this, "coordinateOperationAccuracy", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSourceCRS();
            CRSPropertyType theField;
            theField = this.getSourceCRS();
            strategy.appendField(locator, this, "sourceCRS", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTargetCRS();
            CRSPropertyType theField;
            theField = this.getTargetCRS();
            strategy.appendField(locator, this, "targetCRS", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
