
package com.aixm.delorean.core.schema.a5_1_1.aixm;

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
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFireFightingServiceExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirportGroundServiceExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractServiceExtension"/>
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
    "abstractFireFightingServiceExtension",
    "abstractAirportGroundServiceExtension",
    "abstractServiceExtension"
})
@Entity(name = "FireFightingServiceExtensionType")
@Table(name = "firefightingservice_ext", schema = "service")
public class FireFightingServiceExtensionType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AbstractFireFightingServiceExtension")
    protected AbstractExtensionType abstractFireFightingServiceExtension;
    @XmlElement(name = "AbstractAirportGroundServiceExtension")
    protected AbstractExtensionType abstractAirportGroundServiceExtension;
    @XmlElement(name = "AbstractServiceExtension")
    protected AbstractExtensionType abstractServiceExtension;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlTransient
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the abstractFireFightingServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractfirefightingserviceextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractFireFightingServiceExtension() {
        return abstractFireFightingServiceExtension;
    }

    /**
     * Sets the value of the abstractFireFightingServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractFireFightingServiceExtension(AbstractExtensionType value) {
        this.abstractFireFightingServiceExtension = value;
    }

    @Transient
    public boolean isSetAbstractFireFightingServiceExtension() {
        return (this.abstractFireFightingServiceExtension!= null);
    }

    /**
     * Gets the value of the abstractAirportGroundServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractairportgroundserviceextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractAirportGroundServiceExtension() {
        return abstractAirportGroundServiceExtension;
    }

    /**
     * Sets the value of the abstractAirportGroundServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractAirportGroundServiceExtension(AbstractExtensionType value) {
        this.abstractAirportGroundServiceExtension = value;
    }

    @Transient
    public boolean isSetAbstractAirportGroundServiceExtension() {
        return (this.abstractAirportGroundServiceExtension!= null);
    }

    /**
     * Gets the value of the abstractServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractserviceextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractServiceExtension() {
        return abstractServiceExtension;
    }

    /**
     * Sets the value of the abstractServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractServiceExtension(AbstractExtensionType value) {
        this.abstractServiceExtension = value;
    }

    @Transient
    public boolean isSetAbstractServiceExtension() {
        return (this.abstractServiceExtension!= null);
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
        final FireFightingServiceExtensionType that = ((FireFightingServiceExtensionType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractFireFightingServiceExtension();
            boolean rhsFieldIsSet = that.isSetAbstractFireFightingServiceExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractFireFightingServiceExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractFireFightingServiceExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractFireFightingServiceExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractFireFightingServiceExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractServiceExtension();
            boolean rhsFieldIsSet = that.isSetAbstractServiceExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractServiceExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractServiceExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractServiceExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractServiceExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractAirportGroundServiceExtension();
            boolean rhsFieldIsSet = that.isSetAbstractAirportGroundServiceExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractAirportGroundServiceExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractAirportGroundServiceExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractAirportGroundServiceExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractAirportGroundServiceExtension", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractFireFightingServiceExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractFireFightingServiceExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractFireFightingServiceExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractAirportGroundServiceExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractAirportGroundServiceExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractAirportGroundServiceExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractServiceExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractServiceExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractServiceExtension", theField);
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
            boolean theFieldIsSet = this.isSetAbstractFireFightingServiceExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractFireFightingServiceExtension();
            strategy.appendField(locator, this, "abstractFireFightingServiceExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractAirportGroundServiceExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractAirportGroundServiceExtension();
            strategy.appendField(locator, this, "abstractAirportGroundServiceExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractServiceExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractServiceExtension();
            strategy.appendField(locator, this, "abstractServiceExtension", buffer, theField, theFieldIsSet);
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
