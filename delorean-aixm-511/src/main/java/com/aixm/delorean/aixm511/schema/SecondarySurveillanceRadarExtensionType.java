
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSecondarySurveillanceRadarExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSurveillanceRadarExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRadarEquipmentExtension"/>
 *       </choice>
 *       <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abstractSecondarySurveillanceRadarExtension",
    "abstractSurveillanceRadarExtension",
    "abstractRadarEquipmentExtension"
})
@Entity(name = "SecondarySurveillanceRadarExtensionType")
@Table(name = "secondarysurveillanceradar_ext", schema = "surveillance")
public class SecondarySurveillanceRadarExtensionType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AbstractSecondarySurveillanceRadarExtension")
    protected AbstractExtensionType abstractSecondarySurveillanceRadarExtension;
    @XmlElement(name = "AbstractSurveillanceRadarExtension")
    protected AbstractExtensionType abstractSurveillanceRadarExtension;
    @XmlElement(name = "AbstractRadarEquipmentExtension")
    protected AbstractExtensionType abstractRadarEquipmentExtension;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlTransient
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the abstractSecondarySurveillanceRadarExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractsecondarysurveillanceradarextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractSecondarySurveillanceRadarExtension() {
        return abstractSecondarySurveillanceRadarExtension;
    }

    /**
     * Sets the value of the abstractSecondarySurveillanceRadarExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractSecondarySurveillanceRadarExtension(AbstractExtensionType value) {
        this.abstractSecondarySurveillanceRadarExtension = value;
    }

    @Transient
    public boolean isSetAbstractSecondarySurveillanceRadarExtension() {
        return (this.abstractSecondarySurveillanceRadarExtension!= null);
    }

    /**
     * Gets the value of the abstractSurveillanceRadarExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractsurveillanceradarextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractSurveillanceRadarExtension() {
        return abstractSurveillanceRadarExtension;
    }

    /**
     * Sets the value of the abstractSurveillanceRadarExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractSurveillanceRadarExtension(AbstractExtensionType value) {
        this.abstractSurveillanceRadarExtension = value;
    }

    @Transient
    public boolean isSetAbstractSurveillanceRadarExtension() {
        return (this.abstractSurveillanceRadarExtension!= null);
    }

    /**
     * Gets the value of the abstractRadarEquipmentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractradarequipmentextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractRadarEquipmentExtension() {
        return abstractRadarEquipmentExtension;
    }

    /**
     * Sets the value of the abstractRadarEquipmentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractRadarEquipmentExtension(AbstractExtensionType value) {
        this.abstractRadarEquipmentExtension = value;
    }

    @Transient
    public boolean isSetAbstractRadarEquipmentExtension() {
        return (this.abstractRadarEquipmentExtension!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "OWNS")
    public boolean getOwns() {
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
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    @Transient
    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(generator = "delorean_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delorean_seq_gen", sequenceName = "delorean_seq_gen", allocationSize = 1)
    public Long gethjid() {
        return hjid;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void sethjid(Long value) {
        this.hjid = value;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Version
    @Column(name = "hjversion")
    public Long gethjversion() {
        return hjversion;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void sethjversion(Long value) {
        this.hjversion = value;
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
        final SecondarySurveillanceRadarExtensionType that = ((SecondarySurveillanceRadarExtensionType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractSurveillanceRadarExtension();
            boolean rhsFieldIsSet = that.isSetAbstractSurveillanceRadarExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractSurveillanceRadarExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractSurveillanceRadarExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSurveillanceRadarExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSurveillanceRadarExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractSecondarySurveillanceRadarExtension();
            boolean rhsFieldIsSet = that.isSetAbstractSecondarySurveillanceRadarExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractSecondarySurveillanceRadarExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractSecondarySurveillanceRadarExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSecondarySurveillanceRadarExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSecondarySurveillanceRadarExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractRadarEquipmentExtension();
            boolean rhsFieldIsSet = that.isSetAbstractRadarEquipmentExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractRadarEquipmentExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractRadarEquipmentExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractRadarEquipmentExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractRadarEquipmentExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetOwns();
            boolean rhsFieldIsSet = that.isSetOwns();
            boolean lhsField;
            lhsField = (this.isSetOwns()?this.getOwns():false);
            boolean rhsField;
            rhsField = (that.isSetOwns()?that.getOwns():false);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "owns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "owns", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractSecondarySurveillanceRadarExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSecondarySurveillanceRadarExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSecondarySurveillanceRadarExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractSurveillanceRadarExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSurveillanceRadarExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSurveillanceRadarExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractRadarEquipmentExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractRadarEquipmentExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractRadarEquipmentExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
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
            boolean theFieldIsSet = this.isSetAbstractSecondarySurveillanceRadarExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSecondarySurveillanceRadarExtension();
            strategy.appendField(locator, this, "abstractSecondarySurveillanceRadarExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractSurveillanceRadarExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSurveillanceRadarExtension();
            strategy.appendField(locator, this, "abstractSurveillanceRadarExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractRadarEquipmentExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractRadarEquipmentExtension();
            strategy.appendField(locator, this, "abstractRadarEquipmentExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetOwns();
            boolean theField;
            theField = (this.isSetOwns()?this.getOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
