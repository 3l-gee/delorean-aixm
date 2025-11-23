
package com.aixm.delorean.core.org.gml.v_3_2;

import com.aixm.delorean.core.org.w3.xlink.ActuateType;
import com.aixm.delorean.core.org.w3.xlink.ShowType;
import com.aixm.delorean.core.org.w3.xlink.TypeType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ProcedurePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcedurePropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       </sequence>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedurePropertyType", propOrder = {
    "abstractFeature"
})
public class ProcedurePropertyType implements Equals, HashCode, ToString
{

    /**
     * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
     * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
     * 
     */
    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractFeatureType> abstractFeature;
    @XmlAttribute(name = "nilReason")
    protected String nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String simpleLinkTitle;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
     * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
        return abstractFeature;
    }

    /**
     * Sets the value of the abstractFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     
     * @see #getAbstractFeature()
     */
    public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
        this.abstractFeature = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Sets the value of the nilReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the simpleLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleLinkTitle() {
        return simpleLinkTitle;
    }

    /**
     * Sets the value of the simpleLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleLinkTitle(String value) {
        this.simpleLinkTitle = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
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
        final ProcedurePropertyType that = ((ProcedurePropertyType) object);
        {
            boolean lhsFieldIsSet = (this.abstractFeature!= null);
            boolean rhsFieldIsSet = (that.abstractFeature!= null);
            JAXBElement<? extends AbstractFeatureType> lhsField;
            lhsField = this.getAbstractFeature();
            JAXBElement<? extends AbstractFeatureType> rhsField;
            rhsField = that.getAbstractFeature();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractFeature", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractFeature", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.remoteSchema!= null);
            boolean rhsFieldIsSet = (that.remoteSchema!= null);
            String lhsField;
            lhsField = this.getRemoteSchema();
            String rhsField;
            rhsField = that.getRemoteSchema();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "remoteSchema", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "remoteSchema", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.role!= null);
            boolean rhsFieldIsSet = (that.role!= null);
            String lhsField;
            lhsField = this.getRole();
            String rhsField;
            rhsField = that.getRole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "role", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "role", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.nilReason!= null);
            boolean rhsFieldIsSet = (that.nilReason!= null);
            String lhsField;
            lhsField = this.getNilReason();
            String rhsField;
            rhsField = that.getNilReason();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "nilReason", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "nilReason", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.simpleLinkTitle!= null);
            boolean rhsFieldIsSet = (that.simpleLinkTitle!= null);
            String lhsField;
            lhsField = this.getSimpleLinkTitle();
            String rhsField;
            rhsField = that.getSimpleLinkTitle();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "simpleLinkTitle", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "simpleLinkTitle", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.arcrole!= null);
            boolean rhsFieldIsSet = (that.arcrole!= null);
            String lhsField;
            lhsField = this.getArcrole();
            String rhsField;
            rhsField = that.getArcrole();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "arcrole", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "arcrole", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.owns!= null);
            boolean rhsFieldIsSet = (that.owns!= null);
            java.lang.Boolean lhsField;
            lhsField = this.getOwns();
            java.lang.Boolean rhsField;
            rhsField = that.getOwns();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "owns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "owns", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.show!= null);
            boolean rhsFieldIsSet = (that.show!= null);
            ShowType lhsField;
            lhsField = this.getShow();
            ShowType rhsField;
            rhsField = that.getShow();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "show", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "show", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.actuate!= null);
            boolean rhsFieldIsSet = (that.actuate!= null);
            ActuateType lhsField;
            lhsField = this.getActuate();
            ActuateType rhsField;
            rhsField = that.getActuate();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "actuate", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "actuate", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.type!= null);
            boolean rhsFieldIsSet = (that.type!= null);
            TypeType lhsField;
            lhsField = this.getType();
            TypeType rhsField;
            rhsField = that.getType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "type", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "type", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.href!= null);
            boolean rhsFieldIsSet = (that.href!= null);
            String lhsField;
            lhsField = this.getHref();
            String rhsField;
            rhsField = that.getHref();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "href", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "href", rhsField);
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
            boolean theFieldIsSet = (this.abstractFeature!= null);
            JAXBElement<? extends AbstractFeatureType> theField;
            theField = this.getAbstractFeature();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractFeature", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.nilReason!= null);
            String theField;
            theField = this.getNilReason();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nilReason", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.remoteSchema!= null);
            String theField;
            theField = this.getRemoteSchema();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "remoteSchema", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.type!= null);
            TypeType theField;
            theField = this.getType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "type", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.href!= null);
            String theField;
            theField = this.getHref();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "href", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.role!= null);
            String theField;
            theField = this.getRole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "role", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.arcrole!= null);
            String theField;
            theField = this.getArcrole();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "arcrole", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.simpleLinkTitle!= null);
            String theField;
            theField = this.getSimpleLinkTitle();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "simpleLinkTitle", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.show!= null);
            ShowType theField;
            theField = this.getShow();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "show", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.actuate!= null);
            ActuateType theField;
            theField = this.getActuate();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "actuate", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.owns!= null);
            java.lang.Boolean theField;
            theField = this.getOwns();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "owns", theField);
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
            boolean theFieldIsSet = (this.abstractFeature!= null);
            JAXBElement<? extends AbstractFeatureType> theField;
            theField = this.getAbstractFeature();
            strategy.appendField(locator, this, "abstractFeature", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.nilReason!= null);
            String theField;
            theField = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.remoteSchema!= null);
            String theField;
            theField = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.type!= null);
            TypeType theField;
            theField = this.getType();
            strategy.appendField(locator, this, "type", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.href!= null);
            String theField;
            theField = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.role!= null);
            String theField;
            theField = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.arcrole!= null);
            String theField;
            theField = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.simpleLinkTitle!= null);
            String theField;
            theField = this.getSimpleLinkTitle();
            strategy.appendField(locator, this, "simpleLinkTitle", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.show!= null);
            ShowType theField;
            theField = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.actuate!= null);
            ActuateType theField;
            theField = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.owns!= null);
            java.lang.Boolean theField;
            theField = this.getOwns();
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
