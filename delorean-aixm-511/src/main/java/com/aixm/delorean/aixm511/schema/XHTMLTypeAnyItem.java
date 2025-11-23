
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlTransient;
import org.jvnet.hyperjaxb.item.Item;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.ElementAsString;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name = "XHTMLTypeAnyItem")
@Table(name = "XHTMLTYPE_ANY_ITEM")
public class XHTMLTypeAnyItem
    implements Serializable, Item<Element>
{

    private static final long serialVersionUID = 20251104L;
    @XmlAnyElement
    protected Element item;
    @XmlTransient
    protected Long hjid;
    @XmlTransient
    protected Long hjversion;

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    @Transient
    public Element getItem() {
        return item;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setItem(Element value) {
        this.item = value;
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

    @Basic
    @Column(name = "ITEM_ITEM")
    @Lob
    public String getItemItem() {
        return XmlAdapterUtils.unmarshall(ElementAsString.class, this.getItem());
    }

    public void setItemItem(String target) {
        setItem(XmlAdapterUtils.marshall(ElementAsString.class, target));
    }

}
