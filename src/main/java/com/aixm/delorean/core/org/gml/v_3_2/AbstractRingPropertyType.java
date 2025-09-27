
package com.aixm.delorean.core.org.gml.v_3_2;

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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
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
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;


/**
 * A property with the content model of gml:AbstractRingPropertyType encapsulates a ring to represent the surface boundary property of a surface.
 * 
 * <p>Java class for AbstractRingPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractRingPropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}AbstractRing"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRingPropertyType", propOrder = {
    "abstractRing"
})
@Entity(name = "AbstractRingPropertyType")
@Table(name = "abstract_ring_property", schema = "gml")
public class AbstractRingPropertyType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    /**
     * An abstraction of a ring to support surface boundaries of different complexity.
     * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
     * 
     */
    @XmlElementRef(name = "AbstractRing", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractRingType> abstractRing;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * An abstraction of a ring to support surface boundaries of different complexity.
     * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractRingType> getAbstractRing() {
        return abstractRing;
    }

    /**
     * Sets the value of the abstractRing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingType }{@code >}
     *     
     * @see #getAbstractRing()
     */
    public void setAbstractRing(JAXBElement<? extends AbstractRingType> value) {
        this.abstractRing = value;
    }

    @Transient
    public boolean isSetAbstractRing() {
        return (this.abstractRing!= null);
    }

    /**
     * Gets the value of the hjid property.
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
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
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

    @Basic
    @Column(name = "ABSTRACT_RING_NAME")
    public String getAbstractRingName() {
        if (this.getAbstractRing() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractRingType.class, this.getAbstractRing());
        } else {
            return null;
        }
    }

    public void setAbstractRingName(String target) {
        if (target!= null) {
            setAbstractRing(JAXBElementUtils.wrap(this.getAbstractRing(), target, AbstractRingType.class));
        }
    }

    @ManyToOne(targetEntity = AbstractRingType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ABSTRACT_RING_VALUE_ABSTRACT_0", nullable = true)
    public AbstractRingType getAbstractRingValue() {
        if (this.getAbstractRing() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractRingType.class, this.getAbstractRing());
        } else {
            return null;
        }
    }

    public void setAbstractRingValue(AbstractRingType target) {
        if (target!= null) {
            setAbstractRing(JAXBElementUtils.wrap(this.getAbstractRing(), target));
        }
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
        final AbstractRingPropertyType that = ((AbstractRingPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetAbstractRing();
            boolean rhsFieldIsSet = that.isSetAbstractRing();
            JAXBElement<? extends AbstractRingType> lhsField;
            lhsField = this.getAbstractRing();
            JAXBElement<? extends AbstractRingType> rhsField;
            rhsField = that.getAbstractRing();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "abstractRing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "abstractRing", rhsField);
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
            boolean theFieldIsSet = this.isSetAbstractRing();
            JAXBElement<? extends AbstractRingType> theField;
            theField = this.getAbstractRing();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "abstractRing", theField);
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
            boolean theFieldIsSet = this.isSetAbstractRing();
            JAXBElement<? extends AbstractRingType> theField;
            theField = this.getAbstractRing();
            strategy.appendField(locator, this, "abstractRing", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
