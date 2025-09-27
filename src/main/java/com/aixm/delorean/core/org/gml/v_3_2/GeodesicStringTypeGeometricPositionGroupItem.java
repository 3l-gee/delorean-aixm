
package com.aixm.delorean.core.org.gml.v_3_2;

import java.io.Serializable;
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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlTransient;
import org.jvnet.hyperjaxb.item.Item;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "GeodesicStringTypeGeometricPositionGroupItem")
@Table(name = "GEODESIC_STRING_TYPE_GEOMETR_0")
public class GeodesicStringTypeGeometricPositionGroupItem
    implements Serializable, Item<Object>
{

    private static final long serialVersionUID = 20250910L;
    @XmlElements({
        @XmlElement(name = "pos", type = DirectPositionType.class),
        @XmlElement(name = "pointProperty", type = PointPropertyType.class)
    })
    protected Object item;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     {@link PointPropertyType }
     *     
     */
    @Transient
    public Object getItem() {
        return item;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     {@link PointPropertyType }
     *     
     */
    public void setItem(Object value) {
        this.item = value;
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
        if (this.getItem() instanceof DirectPositionType) {
            return ((DirectPositionType) this.getItem());
        } else {
            return null;
        }
    }

    public void setItemPos(DirectPositionType target) {
        if (target!= null) {
            setItem(target);
        }
    }

    @ManyToOne(targetEntity = PointPropertyType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_POINT_PROPERTY_GEODESIC_0", nullable = true)
    public PointPropertyType getItemPointProperty() {
        if (this.getItem() instanceof PointPropertyType) {
            return ((PointPropertyType) this.getItem());
        } else {
            return null;
        }
    }

    public void setItemPointProperty(PointPropertyType target) {
        if (target!= null) {
            setItem(target);
        }
    }

}
