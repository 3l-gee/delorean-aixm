
package com.aixm.delorean.aixm511.org.gml.v_3_2;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * The base type for coverages is gml:AbstractCoverageType. The basic elements of a coverage can be seen in this content model: the coverage contains gml:domainSet and gml:rangeSet properties. The gml:domainSet property describes the domain of the coverage and the gml:rangeSet property describes the range of the coverage.
 * 
 * <p>Java class for AbstractCoverageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractCoverageType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}domainSet"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}rangeSet"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoverageType", propOrder = {
    "domainSet",
    "rangeSet"
})
@XmlSeeAlso({
    DiscreteCoverageType.class,
    AbstractContinuousCoverageType.class
})
public abstract class AbstractCoverageType
    extends AbstractFeatureType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    /**
     * The gml:domainSet property element describes the spatio-temporal region of interest, within which the coverage is defined. Its content model is given by gml:DomainSetType.
     * The value of the domain is thus a choice between a gml:AbstractGeometry and a gml:AbstractTimeObject.  In the instance these abstract elements will normally be substituted by a geometry complex or temporal complex, to represent spatial coverages and time-series, respectively.  
     * The presence of the gml:AssociationAttributeGroup means that domainSet follows the usual GML property model and may use the xlink:href attribute to point to the domain, as an alternative to describing the domain inline. Ownership semantics may be provided using the gml:OwnershipAttributeGroup.
     * 
     */
    @XmlElementRef(name = "domainSet", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<DomainSetType> domainSet;
    /**
     * The gml:rangeSet property element contains the values of the coverage (sometimes called the attribute values).  Its content model is given by gml:RangeSetType.
     * This content model supports a structural description of the range.  The semantic information describing the range set is embedded using a uniform method, as part of the explicit values, or as a template value accompanying the representation using gml:DataBlock and gml:File.
     * The values from each component (or "band") in the range may be encoded within a gml:ValueArray element or a concrete member of the gml:AbstractScalarValueList substitution group . Use of these elements satisfies the value-type homogeneity requirement.
     * 
     */
    @XmlElement(required = true)
    protected RangeSetType rangeSet;

    /**
     * The gml:domainSet property element describes the spatio-temporal region of interest, within which the coverage is defined. Its content model is given by gml:DomainSetType.
     * The value of the domain is thus a choice between a gml:AbstractGeometry and a gml:AbstractTimeObject.  In the instance these abstract elements will normally be substituted by a geometry complex or temporal complex, to represent spatial coverages and time-series, respectively.  
     * The presence of the gml:AssociationAttributeGroup means that domainSet follows the usual GML property model and may use the xlink:href attribute to point to the domain, as an alternative to describing the domain inline. Ownership semantics may be provided using the gml:OwnershipAttributeGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     
     */
    public JAXBElement<DomainSetType> getDomainSet() {
        return domainSet;
    }

    /**
     * Sets the value of the domainSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     
     * @see #getDomainSet()
     */
    public void setDomainSet(JAXBElement<DomainSetType> value) {
        this.domainSet = value;
    }

    public boolean isSetDomainSet() {
        return (this.domainSet!= null);
    }

    /**
     * The gml:rangeSet property element contains the values of the coverage (sometimes called the attribute values).  Its content model is given by gml:RangeSetType.
     * This content model supports a structural description of the range.  The semantic information describing the range set is embedded using a uniform method, as part of the explicit values, or as a template value accompanying the representation using gml:DataBlock and gml:File.
     * The values from each component (or "band") in the range may be encoded within a gml:ValueArray element or a concrete member of the gml:AbstractScalarValueList substitution group . Use of these elements satisfies the value-type homogeneity requirement.
     * 
     * @return
     *     possible object is
     *     {@link RangeSetType }
     *     
     */
    public RangeSetType getRangeSet() {
        return rangeSet;
    }

    /**
     * Sets the value of the rangeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeSetType }
     *     
     * @see #getRangeSet()
     */
    public void setRangeSet(RangeSetType value) {
        this.rangeSet = value;
    }

    public boolean isSetRangeSet() {
        return (this.rangeSet!= null);
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
        final AbstractCoverageType that = ((AbstractCoverageType) object);
        {
            boolean lhsFieldIsSet = this.isSetRangeSet();
            boolean rhsFieldIsSet = that.isSetRangeSet();
            RangeSetType lhsField;
            lhsField = this.getRangeSet();
            RangeSetType rhsField;
            rhsField = that.getRangeSet();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rangeSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rangeSet", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDomainSet();
            boolean rhsFieldIsSet = that.isSetDomainSet();
            JAXBElement<DomainSetType> lhsField;
            lhsField = this.getDomainSet();
            JAXBElement<DomainSetType> rhsField;
            rhsField = that.getDomainSet();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainSet", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainSet", rhsField);
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
            boolean theFieldIsSet = this.isSetDomainSet();
            JAXBElement<DomainSetType> theField;
            theField = this.getDomainSet();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "domainSet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRangeSet();
            RangeSetType theField;
            theField = this.getRangeSet();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rangeSet", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDomainSet();
            JAXBElement<DomainSetType> theField;
            theField = this.getDomainSet();
            strategy.appendField(locator, this, "domainSet", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRangeSet();
            RangeSetType theField;
            theField = this.getRangeSet();
            strategy.appendField(locator, this, "rangeSet", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
