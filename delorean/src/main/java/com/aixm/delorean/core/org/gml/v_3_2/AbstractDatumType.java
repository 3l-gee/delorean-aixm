
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractDatumType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractDatumType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}anchorDefinition" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}realizationEpoch" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumType", propOrder = {
    "domainOfValidity",
    "scope",
    "anchorDefinition",
    "realizationEpoch"
})
@XmlSeeAlso({
    GeodeticDatumType.class,
    EngineeringDatumType.class,
    ImageDatumType.class,
    VerticalDatumType.class,
    TemporalDatumBaseType.class
})
public abstract class AbstractDatumType
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
     * gml:anchorDefinition is a description, possibly including coordinates, of the definition used to anchor the datum to the Earth. Also known as the "origin", especially for engineering and image datums. The codeSpace attribute may be used to reference a source of more detailed on this point or surface, or on a set of such descriptions.
     * -	For a geodetic datum, this point is also known as the fundamental point, which is traditionally the point where the relationship between geoid and ellipsoid is defined. In some cases, the "fundamental point" may consist of a number of points. In those cases, the parameters defining the geoid/ellipsoid relationship have been averaged for these points, and the averages adopted as the datum definition.
     * -	For an engineering datum, the anchor definition may be a physical point, or it may be a point with defined coordinates in another CRS.may
     * -	For an image datum, the anchor definition is usually either the centre of the image or the corner of the image.
     * -	For a temporal datum, this attribute is not defined. Instead of the anchor definition, a temporal datum carries a separate time origin of type DateTime.
     * 
     */
    @XmlElementRef(name = "anchorDefinition", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeType> anchorDefinition;
    /**
     * gml:realizationEpoch is the time after which this datum definition is valid. See ISO 19111 Table 32 for details.
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realizationEpoch;

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
     * gml:anchorDefinition is a description, possibly including coordinates, of the definition used to anchor the datum to the Earth. Also known as the "origin", especially for engineering and image datums. The codeSpace attribute may be used to reference a source of more detailed on this point or surface, or on a set of such descriptions.
     * -	For a geodetic datum, this point is also known as the fundamental point, which is traditionally the point where the relationship between geoid and ellipsoid is defined. In some cases, the "fundamental point" may consist of a number of points. In those cases, the parameters defining the geoid/ellipsoid relationship have been averaged for these points, and the averages adopted as the datum definition.
     * -	For an engineering datum, the anchor definition may be a physical point, or it may be a point with defined coordinates in another CRS.may
     * -	For an image datum, the anchor definition is usually either the centre of the image or the corner of the image.
     * -	For a temporal datum, this attribute is not defined. Instead of the anchor definition, a temporal datum carries a separate time origin of type DateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getAnchorDefinition() {
        return anchorDefinition;
    }

    /**
     * Sets the value of the anchorDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     * @see #getAnchorDefinition()
     */
    public void setAnchorDefinition(JAXBElement<CodeType> value) {
        this.anchorDefinition = value;
    }

    public boolean isSetAnchorDefinition() {
        return (this.anchorDefinition!= null);
    }

    /**
     * gml:realizationEpoch is the time after which this datum definition is valid. See ISO 19111 Table 32 for details.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealizationEpoch() {
        return realizationEpoch;
    }

    /**
     * Sets the value of the realizationEpoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getRealizationEpoch()
     */
    public void setRealizationEpoch(XMLGregorianCalendar value) {
        this.realizationEpoch = value;
    }

    public boolean isSetRealizationEpoch() {
        return (this.realizationEpoch!= null);
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
        final AbstractDatumType that = ((AbstractDatumType) object);
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
            boolean lhsFieldIsSet = this.isSetAnchorDefinition();
            boolean rhsFieldIsSet = that.isSetAnchorDefinition();
            JAXBElement<CodeType> lhsField;
            lhsField = this.getAnchorDefinition();
            JAXBElement<CodeType> rhsField;
            rhsField = that.getAnchorDefinition();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "anchorDefinition", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "anchorDefinition", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRealizationEpoch();
            boolean rhsFieldIsSet = that.isSetRealizationEpoch();
            XMLGregorianCalendar lhsField;
            lhsField = this.getRealizationEpoch();
            XMLGregorianCalendar rhsField;
            rhsField = that.getRealizationEpoch();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "realizationEpoch", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "realizationEpoch", rhsField);
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
            boolean theFieldIsSet = this.isSetAnchorDefinition();
            JAXBElement<CodeType> theField;
            theField = this.getAnchorDefinition();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "anchorDefinition", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRealizationEpoch();
            XMLGregorianCalendar theField;
            theField = this.getRealizationEpoch();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "realizationEpoch", theField);
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
            boolean theFieldIsSet = this.isSetAnchorDefinition();
            JAXBElement<CodeType> theField;
            theField = this.getAnchorDefinition();
            strategy.appendField(locator, this, "anchorDefinition", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRealizationEpoch();
            XMLGregorianCalendar theField;
            theField = this.getRealizationEpoch();
            strategy.appendField(locator, this, "realizationEpoch", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
