
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;
import org.jvnet.hyperjaxb.xml.bind.annotation.adapters.XmlAdapterUtils;


/**
 * <p>Java class for StandardLevelColumnTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StandardLevelColumnTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}StandardLevelColumnPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractStandardLevelColumnExtension"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardLevelColumnTimeSliceType", propOrder = {
    "series",
    "unitOfMeasurement",
    "separation",
    "level",
    "levelTable",
    "annotation",
    "extension"
})
@Entity(name = "StandardLevelColumnTimeSliceType")
@Table(name = "standardlevelcolumn_ts", schema = "shared")
public class StandardLevelColumnTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "series", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLevelSeriesType> series;
    @XmlElementRef(name = "unitOfMeasurement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasurement;
    @XmlElementRef(name = "separation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRVSMType> separation;
    @XmlElement(nillable = true)
    protected List<StandardLevelPropertyType> level;
    @XmlElementRef(name = "levelTable", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardLevelTablePropertyType> levelTable;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<StandardLevelColumnExtensionType> extension;

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelSeriesType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeLevelSeriesType> getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelSeriesType }{@code >}
     *     
     */
    public void setSeries(JAXBElement<CodeLevelSeriesType> value) {
        this.series = value;
    }

    @Transient
    public boolean isSetSeries() {
        return (this.series!= null);
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Transient
    public JAXBElement<String> getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasurement(JAXBElement<String> value) {
        this.unitOfMeasurement = value;
    }

    @Transient
    public boolean isSetUnitOfMeasurement() {
        return (this.unitOfMeasurement!= null);
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRVSMType> getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public void setSeparation(JAXBElement<CodeRVSMType> value) {
        this.separation = value;
    }

    @Transient
    public boolean isSetSeparation() {
        return (this.separation!= null);
    }

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardLevelPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = StandardLevelPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "level_standardlevelcolumn_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "level", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardlevelcolumnpropertygroup", referencedColumnName = "hjid")
    })
    public List<StandardLevelPropertyType> getLevel() {
        if (level == null) {
            level = new ArrayList<>();
        }
        return this.level;
    }

    /**
     * 
     * 
     */
    public void setLevel(List<StandardLevelPropertyType> level) {
        this.level = level;
    }

    @Transient
    public boolean isSetLevel() {
        return ((this.level!= null)&&(!this.level.isEmpty()));
    }

    public void unsetLevel() {
        this.level = null;
    }

    /**
     * Gets the value of the levelTable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelTablePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<StandardLevelTablePropertyType> getLevelTable() {
        return levelTable;
    }

    /**
     * Sets the value of the levelTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelTablePropertyType }{@code >}
     *     
     */
    public void setLevelTable(JAXBElement<StandardLevelTablePropertyType> value) {
        this.levelTable = value;
    }

    @Transient
    public boolean isSetLevelTable() {
        return (this.levelTable!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = NotePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "annotation_standardlevelcolumn_link", schema = "shared", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "standardlevelcolumnpropertygroup", referencedColumnName = "hjid")
    })
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return this.annotation;
    }

    /**
     * 
     * 
     */
    public void setAnnotation(List<NotePropertyType> annotation) {
        this.annotation = annotation;
    }

    @Transient
    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardLevelColumnExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = StandardLevelColumnExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<StandardLevelColumnExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<StandardLevelColumnExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "series")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "series_nilreason"))
    })
    public CodeLevelSeriesType getSeriesItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLevelSeriesType.class, this.getSeries());
    }

    public void setSeriesItem(CodeLevelSeriesType target) {
        setSeries(XmlAdapterUtils.marshallJAXBElement(CodeLevelSeriesType.class, new QName("http://www.aixm.aero/schema/5.1.1", "series"), StandardLevelColumnTimeSliceType.class, target));
    }

    @Basic
    @Column(name = "UNIT_OF_MEASUREMENT_ITEM")
    public String getUnitOfMeasurementItem() {
        return XmlAdapterUtils.unmarshallSource(String.class, this.getUnitOfMeasurement());
    }

    public void setUnitOfMeasurementItem(String target) {
        setUnitOfMeasurement(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://www.aixm.aero/schema/5.1.1", "unitOfMeasurement"), StandardLevelColumnTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "separation")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "separation_nilreason"))
    })
    public CodeRVSMType getSeparationItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRVSMType.class, this.getSeparation());
    }

    public void setSeparationItem(CodeRVSMType target) {
        setSeparation(XmlAdapterUtils.marshallJAXBElement(CodeRVSMType.class, new QName("http://www.aixm.aero/schema/5.1.1", "separation"), StandardLevelColumnTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = StandardLevelTablePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "leveltable_id", referencedColumnName = "hjid")
    public StandardLevelTablePropertyType getLevelTableItem() {
        return XmlAdapterUtils.unmarshallSource(StandardLevelTablePropertyType.class, this.getLevelTable());
    }

    public void setLevelTableItem(StandardLevelTablePropertyType target) {
        setLevelTable(XmlAdapterUtils.marshallJAXBElement(StandardLevelTablePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "levelTable"), StandardLevelColumnTimeSliceType.class, target));
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StandardLevelColumnTimeSliceType that = ((StandardLevelColumnTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<StandardLevelColumnExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<StandardLevelColumnExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAnnotation();
            boolean rhsFieldIsSet = that.isSetAnnotation();
            List<NotePropertyType> lhsField;
            lhsField = (this.isSetAnnotation()?this.getAnnotation():null);
            List<NotePropertyType> rhsField;
            rhsField = (that.isSetAnnotation()?that.getAnnotation():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "annotation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "annotation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUnitOfMeasurement();
            boolean rhsFieldIsSet = that.isSetUnitOfMeasurement();
            JAXBElement<String> lhsField;
            lhsField = this.getUnitOfMeasurement();
            JAXBElement<String> rhsField;
            rhsField = that.getUnitOfMeasurement();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "unitOfMeasurement", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "unitOfMeasurement", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSeparation();
            boolean rhsFieldIsSet = that.isSetSeparation();
            JAXBElement<CodeRVSMType> lhsField;
            lhsField = this.getSeparation();
            JAXBElement<CodeRVSMType> rhsField;
            rhsField = that.getSeparation();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "separation", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "separation", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLevelTable();
            boolean rhsFieldIsSet = that.isSetLevelTable();
            JAXBElement<StandardLevelTablePropertyType> lhsField;
            lhsField = this.getLevelTable();
            JAXBElement<StandardLevelTablePropertyType> rhsField;
            rhsField = that.getLevelTable();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "levelTable", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "levelTable", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSeries();
            boolean rhsFieldIsSet = that.isSetSeries();
            JAXBElement<CodeLevelSeriesType> lhsField;
            lhsField = this.getSeries();
            JAXBElement<CodeLevelSeriesType> rhsField;
            rhsField = that.getSeries();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "series", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "series", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLevel();
            boolean rhsFieldIsSet = that.isSetLevel();
            List<StandardLevelPropertyType> lhsField;
            lhsField = (this.isSetLevel()?this.getLevel():null);
            List<StandardLevelPropertyType> rhsField;
            rhsField = (that.isSetLevel()?that.getLevel():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "level", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "level", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = this.isSetSeries();
            JAXBElement<CodeLevelSeriesType> theField;
            theField = this.getSeries();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "series", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnitOfMeasurement();
            JAXBElement<String> theField;
            theField = this.getUnitOfMeasurement();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "unitOfMeasurement", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeparation();
            JAXBElement<CodeRVSMType> theField;
            theField = this.getSeparation();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "separation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevel();
            List<StandardLevelPropertyType> theField;
            theField = (this.isSetLevel()?this.getLevel():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "level", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevelTable();
            JAXBElement<StandardLevelTablePropertyType> theField;
            theField = this.getLevelTable();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "levelTable", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "annotation", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<StandardLevelColumnExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "extension", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetSeries();
            JAXBElement<CodeLevelSeriesType> theField;
            theField = this.getSeries();
            strategy.appendField(locator, this, "series", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUnitOfMeasurement();
            JAXBElement<String> theField;
            theField = this.getUnitOfMeasurement();
            strategy.appendField(locator, this, "unitOfMeasurement", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSeparation();
            JAXBElement<CodeRVSMType> theField;
            theField = this.getSeparation();
            strategy.appendField(locator, this, "separation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevel();
            List<StandardLevelPropertyType> theField;
            theField = (this.isSetLevel()?this.getLevel():null);
            strategy.appendField(locator, this, "level", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLevelTable();
            JAXBElement<StandardLevelTablePropertyType> theField;
            theField = this.getLevelTable();
            strategy.appendField(locator, this, "levelTable", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<StandardLevelColumnExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
