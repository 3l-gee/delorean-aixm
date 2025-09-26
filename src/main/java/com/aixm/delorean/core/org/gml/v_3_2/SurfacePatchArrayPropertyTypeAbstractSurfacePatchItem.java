
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
@Entity(name = "SurfacePatchArrayPropertyTypeAbstractSurfacePatchItem")
@Table(name = "SURFACE_PATCH_ARRAY_PROPERTY_0")
public class SurfacePatchArrayPropertyTypeAbstractSurfacePatchItem
    implements Serializable, Item<JAXBElement<? extends AbstractSurfacePatchType>>
{

    private static final long serialVersionUID = 20250910L;
    @XmlElementRef(name = "AbstractSurfacePatch", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSurfacePatchType> item;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PolygonPatchType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TriangleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RectangleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylinderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphereType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGriddedSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractParametricCurveSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurfacePatchType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<? extends AbstractSurfacePatchType> getItem() {
        return item;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PolygonPatchType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TriangleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RectangleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylinderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphereType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGriddedSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractParametricCurveSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurfacePatchType }{@code >}
     *     
     */
    public void setItem(JAXBElement<? extends AbstractSurfacePatchType> value) {
        this.item = ((JAXBElement<? extends AbstractSurfacePatchType> ) value);
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
            return JAXBElementUtils.getName(AbstractSurfacePatchType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemName(String target) {
        if (target!= null) {
            setItem(JAXBElementUtils.wrap(this.getItem(), target, AbstractSurfacePatchType.class));
        }
    }

    @ManyToOne(targetEntity = AbstractSurfacePatchType.class, cascade = {
        CascadeType.MERGE,
        CascadeType.REFRESH,
        CascadeType.DETACH,
        CascadeType.PERSIST
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_VALUE_SURFACE_PATCH_ARR_0", nullable = true)
    public AbstractSurfacePatchType getItemValue() {
        if (this.getItem() instanceof JAXBElement) {
            return JAXBElementUtils.getValue(AbstractSurfacePatchType.class, this.getItem());
        } else {
            return null;
        }
    }

    public void setItemValue(AbstractSurfacePatchType target) {
        if (target!= null) {
            setItem(JAXBElementUtils.wrap(this.getItem(), target));
        }
    }

}
