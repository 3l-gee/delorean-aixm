
package com.aixm.delorean.core.org.gmd.v2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aixm.delorean.core.org.gco.v2007.AbstractObjectType;
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
 * Description of the spatial and temporal reference systems used in the dataset
 * 
 * <p>Java class for AbstractRS_ReferenceSystem_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractRS_ReferenceSystem_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="name" type="{http://www.isotc211.org/2005/gmd}RS_Identifier_PropertyType"/>
 *         <element name="domainOfValidity" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRS_ReferenceSystem_Type", propOrder = {
    "name",
    "domainOfValidity"
})
public abstract class AbstractRSReferenceSystemType
    extends AbstractObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20250910L;
    @XmlElement(required = true)
    protected RSIdentifierPropertyType name;
    protected List<EXExtentPropertyType> domainOfValidity;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public RSIdentifierPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public void setName(RSIdentifierPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the domainOfValidity property.
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
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getDomainOfValidity() {
        if (domainOfValidity == null) {
            domainOfValidity = new ArrayList<>();
        }
        return this.domainOfValidity;
    }

    /**
     * 
     * 
     */
    public void setDomainOfValidity(List<EXExtentPropertyType> domainOfValidity) {
        this.domainOfValidity = domainOfValidity;
    }

    public boolean isSetDomainOfValidity() {
        return ((this.domainOfValidity!= null)&&(!this.domainOfValidity.isEmpty()));
    }

    public void unsetDomainOfValidity() {
        this.domainOfValidity = null;
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
        final AbstractRSReferenceSystemType that = ((AbstractRSReferenceSystemType) object);
        {
            boolean lhsFieldIsSet = this.isSetDomainOfValidity();
            boolean rhsFieldIsSet = that.isSetDomainOfValidity();
            List<EXExtentPropertyType> lhsField;
            lhsField = (this.isSetDomainOfValidity()?this.getDomainOfValidity():null);
            List<EXExtentPropertyType> rhsField;
            rhsField = (that.isSetDomainOfValidity()?that.getDomainOfValidity():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "domainOfValidity", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "domainOfValidity", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetName();
            boolean rhsFieldIsSet = that.isSetName();
            RSIdentifierPropertyType lhsField;
            lhsField = this.getName();
            RSIdentifierPropertyType rhsField;
            rhsField = that.getName();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "name", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "name", rhsField);
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
            boolean theFieldIsSet = this.isSetName();
            RSIdentifierPropertyType theField;
            theField = this.getName();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "name", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            List<EXExtentPropertyType> theField;
            theField = (this.isSetDomainOfValidity()?this.getDomainOfValidity():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "domainOfValidity", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetName();
            RSIdentifierPropertyType theField;
            theField = this.getName();
            strategy.appendField(locator, this, "name", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDomainOfValidity();
            List<EXExtentPropertyType> theField;
            theField = (this.isSetDomainOfValidity()?this.getDomainOfValidity():null);
            strategy.appendField(locator, this, "domainOfValidity", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
