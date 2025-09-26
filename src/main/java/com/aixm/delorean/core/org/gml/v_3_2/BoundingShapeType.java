
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for BoundingShapeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BoundingShapeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}Envelope"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}Null"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingShapeType", propOrder = {
    "envelope",
    "gmlNull"
})
@Entity(name = "BoundingShapeType")
@Table(name = "bounding_shape", schema = "gml")
public class BoundingShapeType implements Serializable, Equals, HashCode, ToString
{

    private static final long serialVersionUID = 20250910L;
    /**
     * Envelope defines an extent using a pair of positions defining opposite corners in arbitrary dimensions. The first direct position is the "lower corner" (a coordinate position consisting of all the minimal ordinates for each dimension for all points within the envelope), the second one the "upper corner" (a coordinate position consisting of all the maximal ordinates for each dimension for all points within the envelope).
     * The use of the properties "coordinates" and "pos" has been deprecated. The explicitly named properties "lowerCorner" and "upperCorner" shall be used instead.
     * 
     */
    @XmlElementRef(name = "Envelope", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends EnvelopeType> envelope;
    @XmlElement(name = "Null")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String gmlNull;
    @XmlAttribute(name = "nilReason")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String nilReason;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * Envelope defines an extent using a pair of positions defining opposite corners in arbitrary dimensions. The first direct position is the "lower corner" (a coordinate position consisting of all the minimal ordinates for each dimension for all points within the envelope), the second one the "upper corner" (a coordinate position consisting of all the maximal ordinates for each dimension for all points within the envelope).
     * The use of the properties "coordinates" and "pos" has been deprecated. The explicitly named properties "lowerCorner" and "upperCorner" shall be used instead.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends EnvelopeType> getEnvelope() {
        return envelope;
    }

    /**
     * Sets the value of the envelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
     *     
     * @see #getEnvelope()
     */
    public void setEnvelope(JAXBElement<? extends EnvelopeType> value) {
        this.envelope = value;
    }

    @Transient
    public boolean isSetEnvelope() {
        return (this.envelope!= null);
    }

    /**
     * Gets the value of the gmlNull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GML_NULL")
    public String getGmlNull() {
        return gmlNull;
    }

    /**
     * Sets the value of the gmlNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlNull(String value) {
        this.gmlNull = value;
    }

    @Transient
    public boolean isSetGmlNull() {
        return (this.gmlNull!= null);
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NIL_REASON")
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

    @Transient
    public boolean isSetNilReason() {
        return (this.nilReason!= null);
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
    @Column(name = "ENVELOPE_NAME")
    public String getEnvelopeName() {
        if (this.getEnvelope() instanceof JAXBElement) {
            return JAXBElementUtils.getName(EnvelopeType.class, this.getEnvelope());
        } else {
            return null;
        }
    }

    public void setEnvelopeName(String target) {
        if (target!= null) {
            setEnvelope(JAXBElementUtils.wrap(this.getEnvelope(), target, EnvelopeType.class));
        }
    }

    @ManyToOne(targetEntity = EnvelopeType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ENVELOPE_VALUE_BOUNDING_SHAP_0", nullable = true)
    public EnvelopeType getEnvelopeValue() {
        if (this.getEnvelope() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(EnvelopeType.class, this.getEnvelope());
        } else {
            return null;
        }
    }

    public void setEnvelopeValue(EnvelopeType target) {
        if (target!= null) {
            setEnvelope(JAXBElementUtils.wrap(this.getEnvelope(), target));
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
        final BoundingShapeType that = ((BoundingShapeType) object);
        {
            boolean lhsFieldIsSet = this.isSetNilReason();
            boolean rhsFieldIsSet = that.isSetNilReason();
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
            boolean lhsFieldIsSet = this.isSetEnvelope();
            boolean rhsFieldIsSet = that.isSetEnvelope();
            JAXBElement<? extends EnvelopeType> lhsField;
            lhsField = this.getEnvelope();
            JAXBElement<? extends EnvelopeType> rhsField;
            rhsField = that.getEnvelope();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "envelope", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "envelope", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetGmlNull();
            boolean rhsFieldIsSet = that.isSetGmlNull();
            String lhsField;
            lhsField = this.getGmlNull();
            String rhsField;
            rhsField = that.getGmlNull();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "gmlNull", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "gmlNull", rhsField);
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
            boolean theFieldIsSet = this.isSetEnvelope();
            JAXBElement<? extends EnvelopeType> theField;
            theField = this.getEnvelope();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "envelope", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGmlNull();
            String theField;
            theField = this.getGmlNull();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "gmlNull", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "nilReason", theField);
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
            boolean theFieldIsSet = this.isSetEnvelope();
            JAXBElement<? extends EnvelopeType> theField;
            theField = this.getEnvelope();
            strategy.appendField(locator, this, "envelope", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetGmlNull();
            String theField;
            theField = this.getGmlNull();
            strategy.appendField(locator, this, "gmlNull", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNilReason();
            String theField;
            theField = this.getNilReason();
            strategy.appendField(locator, this, "nilReason", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
