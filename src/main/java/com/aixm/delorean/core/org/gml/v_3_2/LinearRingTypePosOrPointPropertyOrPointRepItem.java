
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlTransient;
import org.jvnet.hyperjaxb.item.Item;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "LinearRingTypePosOrPointPropertyOrPointRepItem")
@Table(name = "LINEAR_RING_TYPE_POS_OR_POIN_0")
public class LinearRingTypePosOrPointPropertyOrPointRepItem
    implements Serializable, Item<JAXBElement<?>>
{

    private static final long serialVersionUID = 20250910L;
    @XmlElementRefs({
        @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class),
        @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    })
    protected JAXBElement<?> item;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<?> getItem() {
        return item;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setItem(JAXBElement<?> value) {
        this.item = ((JAXBElement<?> ) value);
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

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "srsName", column = @Column(name = "ITEM_POS_SRS_NAME")),
        @AttributeOverride(name = "srsDimension", column = @Column(name = "ITEM_POS_SRS_DIMENSION", precision = 20, scale = 0))
    })
    @AssociationOverride(name = "value", joinTable = @JoinTable(name = "DIRECT_POSITION_TYPE_ITEM_PO_0", joinColumns = {
        @JoinColumn(name = "ITEM_POS_HJID")
    }))
    public DirectPositionType getItemPos() {
        if (XmlAdapterUtils.isJAXBElement(DirectPositionType.class, new QName("http://www.opengis.net/gml/3.2", "pos"), JAXBElement.GlobalScope.class, this.getItem())) {
            return XmlAdapterUtils.unmarshallSource(DirectPositionType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemPos(DirectPositionType target) {
        if (target!= null) {
            setItem(XmlAdapterUtils.marshallJAXBElement(DirectPositionType.class, new QName("http://www.opengis.net/gml/3.2", "pos"), JAXBElement.GlobalScope.class, target));
        }
    }

    @ManyToOne(targetEntity = PointPropertyType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_POINT_PROPERTY_LINEAR_R_0", nullable = true)
    public PointPropertyType getItemPointProperty() {
        if (XmlAdapterUtils.isJAXBElement(PointPropertyType.class, new QName("http://www.opengis.net/gml/3.2", "pointProperty"), JAXBElement.GlobalScope.class, this.getItem())) {
            return XmlAdapterUtils.unmarshallSource(PointPropertyType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemPointProperty(PointPropertyType target) {
        if (target!= null) {
            setItem(XmlAdapterUtils.marshallJAXBElement(PointPropertyType.class, new QName("http://www.opengis.net/gml/3.2", "pointProperty"), JAXBElement.GlobalScope.class, target));
        }
    }

    @ManyToOne(targetEntity = PointPropertyType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_POINT_REP_LINEAR_RING_T_0", nullable = true)
    public PointPropertyType getItemPointRep() {
        if (XmlAdapterUtils.isJAXBElement(PointPropertyType.class, new QName("http://www.opengis.net/gml/3.2", "pointRep"), JAXBElement.GlobalScope.class, this.getItem())) {
            return XmlAdapterUtils.unmarshallSource(PointPropertyType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemPointRep(PointPropertyType target) {
        if (target!= null) {
            setItem(XmlAdapterUtils.marshallJAXBElement(PointPropertyType.class, new QName("http://www.opengis.net/gml/3.2", "pointRep"), JAXBElement.GlobalScope.class, target));
        }
    }

}
