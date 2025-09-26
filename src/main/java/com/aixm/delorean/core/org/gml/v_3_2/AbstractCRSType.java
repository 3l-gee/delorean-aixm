
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
 * <p>Java class for AbstractCRSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCRSType", propOrder = {
    "domainOfValidity",
    "scope"
})
@XmlSeeAlso({
    CompoundCRSType.class,
    GeodeticCRSType.class,
    VerticalCRSType.class,
    AbstractGeneralDerivedCRSType.class,
    EngineeringCRSType.class,
    ImageCRSType.class,
    TemporalCRSType.class,
    GeographicCRSType.class,
    GeocentricCRSType.class
})
public abstract class AbstractCRSType
    extends IdentifiedObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    protected List<DomainOfValidity> domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;

    /**
     * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.Gets the value of the domainOfValidity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainOfValidity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainOfValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainOfValidity }
     * 
     * 
     */
    public List<DomainOfValidity> getDomainOfValidity() {
        if (domainOfValidity == null) {
            domainOfValidity = new ArrayList<>();
        }
        return this.domainOfValidity;
    }

    /**
     * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
     * 
     */
    public void setDomainOfValidity(List<DomainOfValidity> domainOfValidity) {
        this.domainOfValidity = domainOfValidity;
    }

    public boolean isSetDomainOfValidity() {
        return ((this.domainOfValidity!= null)&&(!this.domainOfValidity.isEmpty()));
    }

    public void unsetDomainOfValidity() {
        this.domainOfValidity = null;
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
        final AbstractCRSType that = ((AbstractCRSType) object);
        {
            boolean lhsFieldIsSet = this.isSetDomainOfValidity();
            boolean rhsFieldIsSet = that.isSetDomainOfValidity();
            List<DomainOfValidity> lhsField;
            lhsField = (this.isSetDomainOfValidity()?this.getDomainOfValidity():null);
            List<DomainOfValidity> rhsField;
            rhsField = (that.isSetDomainOfValidity()?that.getDomainOfValidity():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainOfValidity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainOfValidity", rhsField);
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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            List<DomainOfValidity> theField;
            theField = (this.isSetDomainOfValidity()?this.getDomainOfValidity():null);
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
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            List<DomainOfValidity> theField;
            theField = (this.isSetDomainOfValidity()?this.getDomainOfValidity():null);
            strategy.appendField(locator, this, "domainOfValidity", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetScope();
            List<String> theField;
            theField = (this.isSetScope()?this.getScope():null);
            strategy.appendField(locator, this, "scope", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
