
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
import org.jvnet.hyperjaxb.item.Item;
import org.jvnet.hyperjaxb.xml.bind.JAXBElementUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "CurveSegmentArrayPropertyTypeAbstractCurveSegmentItem")
@Table(name = "CURVE_SEGMENT_ARRAY_PROPERTY_0")
public class CurveSegmentArrayPropertyTypeAbstractCurveSegmentItem
    implements Serializable, Item<JAXBElement<? extends AbstractCurveSegmentType>>
{

    private static final long serialVersionUID = 20250910L;
    @XmlElementRef(name = "AbstractCurveSegment", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractCurveSegmentType> item;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractCurveSegmentType> getItem() {
        return item;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     *     
     */
    public void setItem(JAXBElement<? extends AbstractCurveSegmentType> value) {
        this.item = ((JAXBElement<? extends AbstractCurveSegmentType> ) value);
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
    @Column(name = "ITEM_NAME")
    public String getItemName() {
        if (this.getItem() instanceof JAXBElement) {
            return JAXBElementUtils.getName(AbstractCurveSegmentType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemName(String target) {
        if (target!= null) {
            setItem(JAXBElementUtils.wrap(this.getItem(), target, AbstractCurveSegmentType.class));
        }
    }

    @ManyToOne(targetEntity = AbstractCurveSegmentType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH,
        CascadeType.DETACH
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_VALUE_CURVE_SEGMENT_ARR_0", nullable = true)
    public AbstractCurveSegmentType getItemValue() {
        if (this.getItem() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractCurveSegmentType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemValue(AbstractCurveSegmentType target) {
        if (target!= null) {
            setItem(JAXBElementUtils.wrap(this.getItem(), target));
        }
    }

}
