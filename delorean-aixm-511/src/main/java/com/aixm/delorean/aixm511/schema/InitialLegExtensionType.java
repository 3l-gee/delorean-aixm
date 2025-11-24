
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
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractInitialLegExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractApproachLegExtension"/>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSegmentLegExtension"/>
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
    "abstractInitialLegExtension",
    "abstractApproachLegExtension",
    "abstractSegmentLegExtension"
})
@Entity(name = "InitialLegExtensionType")
@Table(name = "initialleg_ext", schema = "procedure")
public class InitialLegExtensionType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "AbstractInitialLegExtension")
    protected AbstractExtensionType abstractInitialLegExtension;
    @XmlElement(name = "AbstractApproachLegExtension")
    protected AbstractExtensionType abstractApproachLegExtension;
    @XmlElement(name = "AbstractSegmentLegExtension")
    protected AbstractExtensionType abstractSegmentLegExtension;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlTransient
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Gets the value of the abstractInitialLegExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractinitiallegextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractInitialLegExtension() {
        return abstractInitialLegExtension;
    }

    /**
     * Sets the value of the abstractInitialLegExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractInitialLegExtension(AbstractExtensionType value) {
        this.abstractInitialLegExtension = value;
    }

    @Transient
    public boolean isSetAbstractInitialLegExtension() {
        return (this.abstractInitialLegExtension!= null);
    }

    /**
     * Gets the value of the abstractApproachLegExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractapproachlegextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractApproachLegExtension() {
        return abstractApproachLegExtension;
    }

    /**
     * Sets the value of the abstractApproachLegExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractApproachLegExtension(AbstractExtensionType value) {
        this.abstractApproachLegExtension = value;
    }

    @Transient
    public boolean isSetAbstractApproachLegExtension() {
        return (this.abstractApproachLegExtension!= null);
    }

    /**
     * Gets the value of the abstractSegmentLegExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExtensionType }
     *     
     */
    @OneToOne(targetEntity = AbstractExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "abstractsegmentlegextension_id", referencedColumnName = "hjid")
    public AbstractExtensionType getAbstractSegmentLegExtension() {
        return abstractSegmentLegExtension;
    }

    /**
     * Sets the value of the abstractSegmentLegExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExtensionType }
     *     
     */
    public void setAbstractSegmentLegExtension(AbstractExtensionType value) {
        this.abstractSegmentLegExtension = value;
    }

    @Transient
    public boolean isSetAbstractSegmentLegExtension() {
        return (this.abstractSegmentLegExtension!= null);
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
        final InitialLegExtensionType that = ((InitialLegExtensionType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractInitialLegExtension();
            boolean rhsFieldIsSet = that.isSetAbstractInitialLegExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractInitialLegExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractInitialLegExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractInitialLegExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractInitialLegExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractApproachLegExtension();
            boolean rhsFieldIsSet = that.isSetAbstractApproachLegExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractApproachLegExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractApproachLegExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractApproachLegExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractApproachLegExtension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAbstractSegmentLegExtension();
            boolean rhsFieldIsSet = that.isSetAbstractSegmentLegExtension();
            AbstractExtensionType lhsField;
            lhsField = this.getAbstractSegmentLegExtension();
            AbstractExtensionType rhsField;
            rhsField = that.getAbstractSegmentLegExtension();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractSegmentLegExtension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractSegmentLegExtension", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractInitialLegExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractInitialLegExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractInitialLegExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractApproachLegExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractApproachLegExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractApproachLegExtension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractSegmentLegExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSegmentLegExtension();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractSegmentLegExtension", theField);
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
            boolean theFieldIsSet = this.isSetAbstractInitialLegExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractInitialLegExtension();
            strategy.appendField(locator, this, "abstractInitialLegExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractApproachLegExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractApproachLegExtension();
            strategy.appendField(locator, this, "abstractApproachLegExtension", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAbstractSegmentLegExtension();
            AbstractExtensionType theField;
            theField = this.getAbstractSegmentLegExtension();
            strategy.appendField(locator, this, "abstractSegmentLegExtension", buffer, theField, theFieldIsSet);
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
