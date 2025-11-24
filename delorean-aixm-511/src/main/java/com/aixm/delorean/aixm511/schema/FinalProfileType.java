
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for FinalProfileType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinalProfileType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}FinalProfilePropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFinalProfileExtension"/>
 *                 </choice>
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
@XmlType(name = "FinalProfileType", propOrder = {
    "altitude",
    "distance",
    "timing",
    "annotation",
    "extension"
})
@Entity(name = "FinalProfileType")
@Table(name = "finalprofile", schema = "procedure")
public class FinalProfileType
    extends AbstractAIXMObjectType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(nillable = true)
    protected List<ApproachAltitudeTablePropertyType> altitude;
    @XmlElement(nillable = true)
    protected List<ApproachDistanceTablePropertyType> distance;
    @XmlElement(nillable = true)
    protected List<ApproachTimingTablePropertyType> timing;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FinalProfileTypeExtensionType> extension;

    /**
     * Gets the value of the altitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproachAltitudeTablePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ApproachAltitudeTablePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "altitude_finalprofile_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "altitude", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "finalprofilepropertygroup", referencedColumnName = "hjid")
    })
    public List<ApproachAltitudeTablePropertyType> getAltitude() {
        if (altitude == null) {
            altitude = new ArrayList<>();
        }
        return this.altitude;
    }

    /**
     * 
     * 
     */
    public void setAltitude(List<ApproachAltitudeTablePropertyType> altitude) {
        this.altitude = altitude;
    }

    @Transient
    public boolean isSetAltitude() {
        return ((this.altitude!= null)&&(!this.altitude.isEmpty()));
    }

    public void unsetAltitude() {
        this.altitude = null;
    }

    /**
     * Gets the value of the distance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproachDistanceTablePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ApproachDistanceTablePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "distance_finalprofile_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "distance", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "finalprofilepropertygroup", referencedColumnName = "hjid")
    })
    public List<ApproachDistanceTablePropertyType> getDistance() {
        if (distance == null) {
            distance = new ArrayList<>();
        }
        return this.distance;
    }

    /**
     * 
     * 
     */
    public void setDistance(List<ApproachDistanceTablePropertyType> distance) {
        this.distance = distance;
    }

    @Transient
    public boolean isSetDistance() {
        return ((this.distance!= null)&&(!this.distance.isEmpty()));
    }

    public void unsetDistance() {
        this.distance = null;
    }

    /**
     * Gets the value of the timing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproachTimingTablePropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = ApproachTimingTablePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "timing_finalprofile_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "timing", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "finalprofilepropertygroup", referencedColumnName = "hjid")
    })
    public List<ApproachTimingTablePropertyType> getTiming() {
        if (timing == null) {
            timing = new ArrayList<>();
        }
        return this.timing;
    }

    /**
     * 
     * 
     */
    public void setTiming(List<ApproachTimingTablePropertyType> timing) {
        this.timing = timing;
    }

    @Transient
    public boolean isSetTiming() {
        return ((this.timing!= null)&&(!this.timing.isEmpty()));
    }

    public void unsetTiming() {
        this.timing = null;
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
    @JoinTable(name = "annotation_finalprofile_link", schema = "procedure", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "finalprofilepropertygroup", referencedColumnName = "hjid")
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
     * {@link FinalProfileTypeExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = FinalProfileTypeExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<FinalProfileTypeExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<FinalProfileTypeExtensionType> extension) {
        this.extension = extension;
    }

    @Transient
    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
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
        final FinalProfileType that = ((FinalProfileType) object);
        {
            boolean lhsFieldIsSet = this.isSetAltitude();
            boolean rhsFieldIsSet = that.isSetAltitude();
            List<ApproachAltitudeTablePropertyType> lhsField;
            lhsField = (this.isSetAltitude()?this.getAltitude():null);
            List<ApproachAltitudeTablePropertyType> rhsField;
            rhsField = (that.isSetAltitude()?that.getAltitude():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "altitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "altitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTiming();
            boolean rhsFieldIsSet = that.isSetTiming();
            List<ApproachTimingTablePropertyType> lhsField;
            lhsField = (this.isSetTiming()?this.getTiming():null);
            List<ApproachTimingTablePropertyType> rhsField;
            rhsField = (that.isSetTiming()?that.getTiming():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "timing", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "timing", rhsField);
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
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<FinalProfileTypeExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<FinalProfileTypeExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDistance();
            boolean rhsFieldIsSet = that.isSetDistance();
            List<ApproachDistanceTablePropertyType> lhsField;
            lhsField = (this.isSetDistance()?this.getDistance():null);
            List<ApproachDistanceTablePropertyType> rhsField;
            rhsField = (that.isSetDistance()?that.getDistance():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "distance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "distance", rhsField);
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
            boolean theFieldIsSet = this.isSetAltitude();
            List<ApproachAltitudeTablePropertyType> theField;
            theField = (this.isSetAltitude()?this.getAltitude():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "altitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            List<ApproachDistanceTablePropertyType> theField;
            theField = (this.isSetDistance()?this.getDistance():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "distance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTiming();
            List<ApproachTimingTablePropertyType> theField;
            theField = (this.isSetTiming()?this.getTiming():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "timing", theField);
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
            List<FinalProfileTypeExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetAltitude();
            List<ApproachAltitudeTablePropertyType> theField;
            theField = (this.isSetAltitude()?this.getAltitude():null);
            strategy.appendField(locator, this, "altitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDistance();
            List<ApproachDistanceTablePropertyType> theField;
            theField = (this.isSetDistance()?this.getDistance():null);
            strategy.appendField(locator, this, "distance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTiming();
            List<ApproachTimingTablePropertyType> theField;
            theField = (this.isSetTiming()?this.getTiming():null);
            strategy.appendField(locator, this, "timing", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<FinalProfileTypeExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
