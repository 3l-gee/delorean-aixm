
package com.aixm.delorean.core.schema.a5_1_1.aixm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for RouteDMETimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteDMETimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RouteDMEPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRouteDMEExtension"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDMETimeSliceType", propOrder = {
    "criticalDME",
    "satisfactory",
    "referencedDME",
    "applicableRoutePortion",
    "annotation",
    "extension"
})
@Entity(name = "RouteDMETimeSliceType")
@Table(name = "routedme_ts", schema = "route")
public class RouteDMETimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "criticalDME", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> criticalDME;
    @XmlElementRef(name = "satisfactory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> satisfactory;
    @XmlElementRef(name = "referencedDME", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DMEPropertyType> referencedDME;
    @XmlElementRef(name = "applicableRoutePortion", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> applicableRoutePortion;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RouteDMEExtensionType> extension;

    /**
     * Gets the value of the criticalDME property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getCriticalDME() {
        return criticalDME;
    }

    /**
     * Sets the value of the criticalDME property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCriticalDME(JAXBElement<CodeYesNoType> value) {
        this.criticalDME = value;
    }

    @Transient
    public boolean isSetCriticalDME() {
        return (this.criticalDME!= null);
    }

    /**
     * Gets the value of the satisfactory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSatisfactory() {
        return satisfactory;
    }

    /**
     * Sets the value of the satisfactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSatisfactory(JAXBElement<CodeYesNoType> value) {
        this.satisfactory = value;
    }

    @Transient
    public boolean isSetSatisfactory() {
        return (this.satisfactory!= null);
    }

    /**
     * Gets the value of the referencedDME property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DMEPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<DMEPropertyType> getReferencedDME() {
        return referencedDME;
    }

    /**
     * Sets the value of the referencedDME property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DMEPropertyType }{@code >}
     *     
     */
    public void setReferencedDME(JAXBElement<DMEPropertyType> value) {
        this.referencedDME = value;
    }

    @Transient
    public boolean isSetReferencedDME() {
        return (this.referencedDME!= null);
    }

    /**
     * Gets the value of the applicableRoutePortion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePortionPropertyType> getApplicableRoutePortion() {
        return applicableRoutePortion;
    }

    /**
     * Sets the value of the applicableRoutePortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setApplicableRoutePortion(JAXBElement<RoutePortionPropertyType> value) {
        this.applicableRoutePortion = value;
    }

    @Transient
    public boolean isSetApplicableRoutePortion() {
        return (this.applicableRoutePortion!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_routedme_link", schema = "route", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "routedmepropertygroup", referencedColumnName = "hjid")
    })
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    /**
     * 
     * 
     */
    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteDMEExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RouteDMEExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "EXTENSION_ROUTE_DMETIME_SLIC_0")
    public List<RouteDMEExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RouteDMEExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "criticaldme")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "criticaldme_nilreason"))
    })
    public CodeYesNoType getCriticalDMEItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getCriticalDME());
    }

    public void setCriticalDMEItem(CodeYesNoType target) {
        setCriticalDME(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "criticalDME"), RouteDMETimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "satisfactory")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "satisfactory_nilreason"))
    })
    public CodeYesNoType getSatisfactoryItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSatisfactory());
    }

    public void setSatisfactoryItem(CodeYesNoType target) {
        setSatisfactory(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "satisfactory"), RouteDMETimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = DMEPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "referenceddme_id", referencedColumnName = "hjid")
    public DMEPropertyType getReferencedDMEItem() {
        return XmlAdapterUtils.unmarshallSource(DMEPropertyType.class, this.getReferencedDME());
    }

    public void setReferencedDMEItem(DMEPropertyType target) {
        setReferencedDME(XmlAdapterUtils.marshallJAXBElement(DMEPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "referencedDME"), RouteDMETimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RoutePortionPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "applicablerouteportion_id", referencedColumnName = "hjid")
    public RoutePortionPropertyType getApplicableRoutePortionItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePortionPropertyType.class, this.getApplicableRoutePortion());
    }

    public void setApplicableRoutePortionItem(RoutePortionPropertyType target) {
        setApplicableRoutePortion(XmlAdapterUtils.marshallJAXBElement(RoutePortionPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "applicableRoutePortion"), RouteDMETimeSliceType.class, target));
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
        final RouteDMETimeSliceType that = ((RouteDMETimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetApplicableRoutePortion();
            boolean rhsFieldIsSet = that.isSetApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> lhsField;
            lhsField = this.getApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> rhsField;
            rhsField = that.getApplicableRoutePortion();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "applicableRoutePortion", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "applicableRoutePortion", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RouteDMEExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RouteDMEExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation()?this.getAnnotation():null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation()?that.getAnnotation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCriticalDME();
            boolean rhsFieldIsSet = that.isSetCriticalDME();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getCriticalDME();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getCriticalDME();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "criticalDME", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "criticalDME", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReferencedDME();
            boolean rhsFieldIsSet = that.isSetReferencedDME();
            JAXBElement<DMEPropertyType> lhsField;
            lhsField = this.getReferencedDME();
            JAXBElement<DMEPropertyType> rhsField;
            rhsField = that.getReferencedDME();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "referencedDME", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "referencedDME", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSatisfactory();
            boolean rhsFieldIsSet = that.isSetSatisfactory();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSatisfactory();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSatisfactory();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "satisfactory", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "satisfactory", rhsField);
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
            boolean theFieldIsSet = this.isSetCriticalDME();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCriticalDME();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "criticalDME", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSatisfactory();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSatisfactory();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "satisfactory", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencedDME();
            JAXBElement<DMEPropertyType> theField;
            theField = this.getReferencedDME();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "referencedDME", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getApplicableRoutePortion();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "applicableRoutePortion", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RouteDMEExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetCriticalDME();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getCriticalDME();
            strategy.appendField(locator, this, "criticalDME", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSatisfactory();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSatisfactory();
            strategy.appendField(locator, this, "satisfactory", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReferencedDME();
            JAXBElement<DMEPropertyType> theField;
            theField = this.getReferencedDME();
            strategy.appendField(locator, this, "referencedDME", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetApplicableRoutePortion();
            JAXBElement<RoutePortionPropertyType> theField;
            theField = this.getApplicableRoutePortion();
            strategy.appendField(locator, this, "applicableRoutePortion", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RouteDMEExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
