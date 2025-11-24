
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
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
 * <p>Java class for RouteSegmentTimeSliceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RouteSegmentTimeSliceType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       <sequence>
 *         <group ref="{http://www.aixm.aero/schema/5.1.1}RouteSegmentPropertyGroup"/>
 *         <element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRouteSegmentExtension"/>
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
@XmlType(name = "RouteSegmentTimeSliceType", propOrder = {
    "level",
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "minimumObstacleClearanceAltitude",
    "pathType",
    "trueTrack",
    "magneticTrack",
    "reverseTrueTrack",
    "reverseMagneticTrack",
    "length",
    "widthLeft",
    "widthRight",
    "turnDirection",
    "signalGap",
    "minimumEnrouteAltitude",
    "minimumCrossingAtEnd",
    "minimumCrossingAtEndReference",
    "maximumCrossingAtEnd",
    "maximumCrossingAtEndReference",
    "navigationType",
    "requiredNavigationPerformance",
    "designatorSuffix",
    "start",
    "routeFormed",
    "evaluationArea",
    "curveExtent",
    "end",
    "availability",
    "annotation",
    "extension"
})
@Entity(name = "RouteSegmentTimeSliceType")
@Table(name = "routesegment_ts", schema = "route")
public class RouteSegmentTimeSliceType
    extends AbstractAIXMTimeSliceType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElementRef(name = "level", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLevelType> level;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "minimumObstacleClearanceAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumObstacleClearanceAltitude;
    @XmlElementRef(name = "pathType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteSegmentPathType> pathType;
    @XmlElementRef(name = "trueTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueTrack;
    @XmlElementRef(name = "magneticTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> magneticTrack;
    @XmlElementRef(name = "reverseTrueTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> reverseTrueTrack;
    @XmlElementRef(name = "reverseMagneticTrack", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> reverseMagneticTrack;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "widthLeft", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthLeft;
    @XmlElementRef(name = "widthRight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthRight;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "signalGap", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> signalGap;
    @XmlElementRef(name = "minimumEnrouteAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEnrouteAltitude;
    @XmlElementRef(name = "minimumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCrossingAtEnd;
    @XmlElementRef(name = "minimumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumCrossingAtEndReference;
    @XmlElementRef(name = "maximumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumCrossingAtEnd;
    @XmlElementRef(name = "maximumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumCrossingAtEndReference;
    @XmlElementRef(name = "navigationType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteNavigationType> navigationType;
    @XmlElementRef(name = "requiredNavigationPerformance", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRNPType> requiredNavigationPerformance;
    @XmlElementRef(name = "designatorSuffix", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorSuffixType> designatorSuffix;
    @XmlElementRef(name = "start", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<EnRouteSegmentPointPropertyType> start;
    @XmlElementRef(name = "routeFormed", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> routeFormed;
    @XmlElementRef(name = "evaluationArea", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ObstacleAssessmentAreaPropertyType> evaluationArea;
    @XmlElementRef(name = "curveExtent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AIXMCurvePropertyType> curveExtent;
    @XmlElementRef(name = "end", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<EnRouteSegmentPointPropertyType> end;
    @XmlElement(nillable = true)
    protected List<RouteAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RouteSegmentExtensionType> extension;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeLevelType> getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelType }{@code >}
     *     
     */
    public void setLevel(JAXBElement<CodeLevelType> value) {
        this.level = value;
    }

    @Transient
    public boolean isSetLevel() {
        return (this.level!= null);
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    @Transient
    public boolean isSetUpperLimit() {
        return (this.upperLimit!= null);
    }

    /**
     * Gets the value of the upperLimitReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Sets the value of the upperLimitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    @Transient
    public boolean isSetUpperLimitReference() {
        return (this.upperLimitReference!= null);
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    @Transient
    public boolean isSetLowerLimit() {
        return (this.lowerLimit!= null);
    }

    /**
     * Gets the value of the lowerLimitReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Sets the value of the lowerLimitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    @Transient
    public boolean isSetLowerLimitReference() {
        return (this.lowerLimitReference!= null);
    }

    /**
     * Gets the value of the minimumObstacleClearanceAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumObstacleClearanceAltitude() {
        return minimumObstacleClearanceAltitude;
    }

    /**
     * Sets the value of the minimumObstacleClearanceAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumObstacleClearanceAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumObstacleClearanceAltitude = value;
    }

    @Transient
    public boolean isSetMinimumObstacleClearanceAltitude() {
        return (this.minimumObstacleClearanceAltitude!= null);
    }

    /**
     * Gets the value of the pathType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteSegmentPathType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteSegmentPathType> getPathType() {
        return pathType;
    }

    /**
     * Sets the value of the pathType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteSegmentPathType }{@code >}
     *     
     */
    public void setPathType(JAXBElement<CodeRouteSegmentPathType> value) {
        this.pathType = value;
    }

    @Transient
    public boolean isSetPathType() {
        return (this.pathType!= null);
    }

    /**
     * Gets the value of the trueTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getTrueTrack() {
        return trueTrack;
    }

    /**
     * Sets the value of the trueTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueTrack(JAXBElement<ValBearingType> value) {
        this.trueTrack = value;
    }

    @Transient
    public boolean isSetTrueTrack() {
        return (this.trueTrack!= null);
    }

    /**
     * Gets the value of the magneticTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getMagneticTrack() {
        return magneticTrack;
    }

    /**
     * Sets the value of the magneticTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setMagneticTrack(JAXBElement<ValBearingType> value) {
        this.magneticTrack = value;
    }

    @Transient
    public boolean isSetMagneticTrack() {
        return (this.magneticTrack!= null);
    }

    /**
     * Gets the value of the reverseTrueTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getReverseTrueTrack() {
        return reverseTrueTrack;
    }

    /**
     * Sets the value of the reverseTrueTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setReverseTrueTrack(JAXBElement<ValBearingType> value) {
        this.reverseTrueTrack = value;
    }

    @Transient
    public boolean isSetReverseTrueTrack() {
        return (this.reverseTrueTrack!= null);
    }

    /**
     * Gets the value of the reverseMagneticTrack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValBearingType> getReverseMagneticTrack() {
        return reverseMagneticTrack;
    }

    /**
     * Sets the value of the reverseMagneticTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setReverseMagneticTrack(JAXBElement<ValBearingType> value) {
        this.reverseMagneticTrack = value;
    }

    @Transient
    public boolean isSetReverseMagneticTrack() {
        return (this.reverseMagneticTrack!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    @Transient
    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the widthLeft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidthLeft() {
        return widthLeft;
    }

    /**
     * Sets the value of the widthLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthLeft(JAXBElement<ValDistanceType> value) {
        this.widthLeft = value;
    }

    @Transient
    public boolean isSetWidthLeft() {
        return (this.widthLeft!= null);
    }

    /**
     * Gets the value of the widthRight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceType> getWidthRight() {
        return widthRight;
    }

    /**
     * Sets the value of the widthRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthRight(JAXBElement<ValDistanceType> value) {
        this.widthRight = value;
    }

    @Transient
    public boolean isSetWidthRight() {
        return (this.widthRight!= null);
    }

    /**
     * Gets the value of the turnDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeDirectionTurnType> getTurnDirection() {
        return turnDirection;
    }

    /**
     * Sets the value of the turnDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

    @Transient
    public boolean isSetTurnDirection() {
        return (this.turnDirection!= null);
    }

    /**
     * Gets the value of the signalGap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeYesNoType> getSignalGap() {
        return signalGap;
    }

    /**
     * Sets the value of the signalGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSignalGap(JAXBElement<CodeYesNoType> value) {
        this.signalGap = value;
    }

    @Transient
    public boolean isSetSignalGap() {
        return (this.signalGap!= null);
    }

    /**
     * Gets the value of the minimumEnrouteAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumEnrouteAltitude() {
        return minimumEnrouteAltitude;
    }

    /**
     * Sets the value of the minimumEnrouteAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEnrouteAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEnrouteAltitude = value;
    }

    @Transient
    public boolean isSetMinimumEnrouteAltitude() {
        return (this.minimumEnrouteAltitude!= null);
    }

    /**
     * Gets the value of the minimumCrossingAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMinimumCrossingAtEnd() {
        return minimumCrossingAtEnd;
    }

    /**
     * Sets the value of the minimumCrossingAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCrossingAtEnd = value;
    }

    @Transient
    public boolean isSetMinimumCrossingAtEnd() {
        return (this.minimumCrossingAtEnd!= null);
    }

    /**
     * Gets the value of the minimumCrossingAtEndReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMinimumCrossingAtEndReference() {
        return minimumCrossingAtEndReference;
    }

    /**
     * Sets the value of the minimumCrossingAtEndReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumCrossingAtEndReference = value;
    }

    @Transient
    public boolean isSetMinimumCrossingAtEndReference() {
        return (this.minimumCrossingAtEndReference!= null);
    }

    /**
     * Gets the value of the maximumCrossingAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ValDistanceVerticalType> getMaximumCrossingAtEnd() {
        return maximumCrossingAtEnd;
    }

    /**
     * Sets the value of the maximumCrossingAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumCrossingAtEnd = value;
    }

    @Transient
    public boolean isSetMaximumCrossingAtEnd() {
        return (this.maximumCrossingAtEnd!= null);
    }

    /**
     * Gets the value of the maximumCrossingAtEndReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeVerticalReferenceType> getMaximumCrossingAtEndReference() {
        return maximumCrossingAtEndReference;
    }

    /**
     * Sets the value of the maximumCrossingAtEndReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumCrossingAtEndReference = value;
    }

    @Transient
    public boolean isSetMaximumCrossingAtEndReference() {
        return (this.maximumCrossingAtEndReference!= null);
    }

    /**
     * Gets the value of the navigationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteNavigationType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteNavigationType> getNavigationType() {
        return navigationType;
    }

    /**
     * Sets the value of the navigationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteNavigationType }{@code >}
     *     
     */
    public void setNavigationType(JAXBElement<CodeRouteNavigationType> value) {
        this.navigationType = value;
    }

    @Transient
    public boolean isSetNavigationType() {
        return (this.navigationType!= null);
    }

    /**
     * Gets the value of the requiredNavigationPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRNPType> getRequiredNavigationPerformance() {
        return requiredNavigationPerformance;
    }

    /**
     * Sets the value of the requiredNavigationPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public void setRequiredNavigationPerformance(JAXBElement<CodeRNPType> value) {
        this.requiredNavigationPerformance = value;
    }

    @Transient
    public boolean isSetRequiredNavigationPerformance() {
        return (this.requiredNavigationPerformance!= null);
    }

    /**
     * Gets the value of the designatorSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorSuffixType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<CodeRouteDesignatorSuffixType> getDesignatorSuffix() {
        return designatorSuffix;
    }

    /**
     * Sets the value of the designatorSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorSuffixType }{@code >}
     *     
     */
    public void setDesignatorSuffix(JAXBElement<CodeRouteDesignatorSuffixType> value) {
        this.designatorSuffix = value;
    }

    @Transient
    public boolean isSetDesignatorSuffix() {
        return (this.designatorSuffix!= null);
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<EnRouteSegmentPointPropertyType> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    public void setStart(JAXBElement<EnRouteSegmentPointPropertyType> value) {
        this.start = value;
    }

    @Transient
    public boolean isSetStart() {
        return (this.start!= null);
    }

    /**
     * Gets the value of the routeFormed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<RoutePropertyType> getRouteFormed() {
        return routeFormed;
    }

    /**
     * Sets the value of the routeFormed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setRouteFormed(JAXBElement<RoutePropertyType> value) {
        this.routeFormed = value;
    }

    @Transient
    public boolean isSetRouteFormed() {
        return (this.routeFormed!= null);
    }

    /**
     * Gets the value of the evaluationArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<ObstacleAssessmentAreaPropertyType> getEvaluationArea() {
        return evaluationArea;
    }

    /**
     * Sets the value of the evaluationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    public void setEvaluationArea(JAXBElement<ObstacleAssessmentAreaPropertyType> value) {
        this.evaluationArea = value;
    }

    @Transient
    public boolean isSetEvaluationArea() {
        return (this.evaluationArea!= null);
    }

    /**
     * Gets the value of the curveExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<AIXMCurvePropertyType> getCurveExtent() {
        return curveExtent;
    }

    /**
     * Sets the value of the curveExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AIXMCurvePropertyType }{@code >}
     *     
     */
    public void setCurveExtent(JAXBElement<AIXMCurvePropertyType> value) {
        this.curveExtent = value;
    }

    @Transient
    public boolean isSetCurveExtent() {
        return (this.curveExtent!= null);
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    @Transient
    public JAXBElement<EnRouteSegmentPointPropertyType> getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    public void setEnd(JAXBElement<EnRouteSegmentPointPropertyType> value) {
        this.end = value;
    }

    @Transient
    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteAvailabilityPropertyType }
     * 
     * 
     */
    @ManyToMany(targetEntity = RouteAvailabilityPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinTable(name = "availability_routesegment_link", schema = "route", joinColumns = {
        @JoinColumn(name = "availability", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "routesegmentpropertygroup", referencedColumnName = "hjid")
    })
    public List<RouteAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<>();
        }
        return this.availability;
    }

    /**
     * 
     * 
     */
    public void setAvailability(List<RouteAvailabilityPropertyType> availability) {
        this.availability = availability;
    }

    @Transient
    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
    @JoinTable(name = "annotation_routesegment_link", schema = "route", joinColumns = {
        @JoinColumn(name = "annotation", referencedColumnName = "hjid")
    }, inverseJoinColumns = {
        @JoinColumn(name = "routesegmentpropertygroup", referencedColumnName = "hjid")
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
     * {@link RouteSegmentExtensionType }
     * 
     * 
     */
    @OneToMany(targetEntity = RouteSegmentExtensionType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn
    public List<RouteSegmentExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<>();
        }
        return this.extension;
    }

    /**
     * 
     * 
     */
    public void setExtension(List<RouteSegmentExtensionType> extension) {
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
        @AttributeOverride(name = "value", column = @Column(name = "level")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "level_nilreason"))
    })
    public CodeLevelType getLevelItem() {
        return XmlAdapterUtils.unmarshallSource(CodeLevelType.class, this.getLevel());
    }

    public void setLevelItem(CodeLevelType target) {
        setLevel(XmlAdapterUtils.marshallJAXBElement(CodeLevelType.class, new QName("http://www.aixm.aero/schema/5.1.1", "level"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlimit")),
        @AttributeOverride(name = "uom", column = @Column(name = "upperlimit_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimit_nilreason"))
    })
    public ValDistanceVerticalType getUpperLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getUpperLimit());
    }

    public void setUpperLimitItem(ValDistanceVerticalType target) {
        setUpperLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimit"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "upperlimitreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "upperlimitreference_nilreason"))
    })
    public CodeVerticalReferenceType getUpperLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getUpperLimitReference());
    }

    public void setUpperLimitReferenceItem(CodeVerticalReferenceType target) {
        setUpperLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitReference"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimit")),
        @AttributeOverride(name = "uom", column = @Column(name = "lowerlimit_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimit_nilreason"))
    })
    public ValDistanceVerticalType getLowerLimitItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getLowerLimit());
    }

    public void setLowerLimitItem(ValDistanceVerticalType target) {
        setLowerLimit(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimit"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "lowerlimitreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "lowerlimitreference_nilreason"))
    })
    public CodeVerticalReferenceType getLowerLimitReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getLowerLimitReference());
    }

    public void setLowerLimitReferenceItem(CodeVerticalReferenceType target) {
        setLowerLimitReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitReference"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumobstacleclearancealtitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumobstacleclearancealtitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumobstacleclearancealtitude_nilreason"))
    })
    public ValDistanceVerticalType getMinimumObstacleClearanceAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumObstacleClearanceAltitude());
    }

    public void setMinimumObstacleClearanceAltitudeItem(ValDistanceVerticalType target) {
        setMinimumObstacleClearanceAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumObstacleClearanceAltitude"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "pathtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "pathtype_nilreason"))
    })
    public CodeRouteSegmentPathType getPathTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteSegmentPathType.class, this.getPathType());
    }

    public void setPathTypeItem(CodeRouteSegmentPathType target) {
        setPathType(XmlAdapterUtils.marshallJAXBElement(CodeRouteSegmentPathType.class, new QName("http://www.aixm.aero/schema/5.1.1", "pathType"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "truetrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "truetrack_nilreason"))
    })
    public ValBearingType getTrueTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getTrueTrack());
    }

    public void setTrueTrackItem(ValBearingType target) {
        setTrueTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "trueTrack"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "magnetictrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "magnetictrack_nilreason"))
    })
    public ValBearingType getMagneticTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getMagneticTrack());
    }

    public void setMagneticTrackItem(ValBearingType target) {
        setMagneticTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "magneticTrack"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "reversetruetrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "reversetruetrack_nilreason"))
    })
    public ValBearingType getReverseTrueTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getReverseTrueTrack());
    }

    public void setReverseTrueTrackItem(ValBearingType target) {
        setReverseTrueTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reverseTrueTrack"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "reversemagnetictrack")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "reversemagnetictrack_nilreason"))
    })
    public ValBearingType getReverseMagneticTrackItem() {
        return XmlAdapterUtils.unmarshallSource(ValBearingType.class, this.getReverseMagneticTrack());
    }

    public void setReverseMagneticTrackItem(ValBearingType target) {
        setReverseMagneticTrack(XmlAdapterUtils.marshallJAXBElement(ValBearingType.class, new QName("http://www.aixm.aero/schema/5.1.1", "reverseMagneticTrack"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "length")),
        @AttributeOverride(name = "uom", column = @Column(name = "length_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "length_nilreason"))
    })
    public ValDistanceType getLengthItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getLength());
    }

    public void setLengthItem(ValDistanceType target) {
        setLength(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "length"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "widthleft")),
        @AttributeOverride(name = "uom", column = @Column(name = "widthleft_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "widthleft_nilreason"))
    })
    public ValDistanceType getWidthLeftItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthLeft());
    }

    public void setWidthLeftItem(ValDistanceType target) {
        setWidthLeft(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "widthLeft"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "widthright")),
        @AttributeOverride(name = "uom", column = @Column(name = "widthright_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "widthright_nilreason"))
    })
    public ValDistanceType getWidthRightItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceType.class, this.getWidthRight());
    }

    public void setWidthRightItem(ValDistanceType target) {
        setWidthRight(XmlAdapterUtils.marshallJAXBElement(ValDistanceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "widthRight"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "turndirection")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "turndirection_nilreason"))
    })
    public CodeDirectionTurnType getTurnDirectionItem() {
        return XmlAdapterUtils.unmarshallSource(CodeDirectionTurnType.class, this.getTurnDirection());
    }

    public void setTurnDirectionItem(CodeDirectionTurnType target) {
        setTurnDirection(XmlAdapterUtils.marshallJAXBElement(CodeDirectionTurnType.class, new QName("http://www.aixm.aero/schema/5.1.1", "turnDirection"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "signalgap")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "signalgap_nilreason"))
    })
    public CodeYesNoType getSignalGapItem() {
        return XmlAdapterUtils.unmarshallSource(CodeYesNoType.class, this.getSignalGap());
    }

    public void setSignalGapItem(CodeYesNoType target) {
        setSignalGap(XmlAdapterUtils.marshallJAXBElement(CodeYesNoType.class, new QName("http://www.aixm.aero/schema/5.1.1", "signalGap"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumenroutealtitude")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumenroutealtitude_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumenroutealtitude_nilreason"))
    })
    public ValDistanceVerticalType getMinimumEnrouteAltitudeItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumEnrouteAltitude());
    }

    public void setMinimumEnrouteAltitudeItem(ValDistanceVerticalType target) {
        setMinimumEnrouteAltitude(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumEnrouteAltitude"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumcrossingatend")),
        @AttributeOverride(name = "uom", column = @Column(name = "minimumcrossingatend_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumcrossingatend_nilreason"))
    })
    public ValDistanceVerticalType getMinimumCrossingAtEndItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMinimumCrossingAtEnd());
    }

    public void setMinimumCrossingAtEndItem(ValDistanceVerticalType target) {
        setMinimumCrossingAtEnd(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumCrossingAtEnd"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "minimumcrossingatendreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "minimumcrossingatendreference_nilreason"))
    })
    public CodeVerticalReferenceType getMinimumCrossingAtEndReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getMinimumCrossingAtEndReference());
    }

    public void setMinimumCrossingAtEndReferenceItem(CodeVerticalReferenceType target) {
        setMinimumCrossingAtEndReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "minimumCrossingAtEndReference"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "maximumcrossingatend")),
        @AttributeOverride(name = "uom", column = @Column(name = "maximumcrossingatend_uom")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "maximumcrossingatend_nilreason"))
    })
    public ValDistanceVerticalType getMaximumCrossingAtEndItem() {
        return XmlAdapterUtils.unmarshallSource(ValDistanceVerticalType.class, this.getMaximumCrossingAtEnd());
    }

    public void setMaximumCrossingAtEndItem(ValDistanceVerticalType target) {
        setMaximumCrossingAtEnd(XmlAdapterUtils.marshallJAXBElement(ValDistanceVerticalType.class, new QName("http://www.aixm.aero/schema/5.1.1", "maximumCrossingAtEnd"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "maximumcrossingatendreference")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "maximumcrossingatendreference_nilreason"))
    })
    public CodeVerticalReferenceType getMaximumCrossingAtEndReferenceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeVerticalReferenceType.class, this.getMaximumCrossingAtEndReference());
    }

    public void setMaximumCrossingAtEndReferenceItem(CodeVerticalReferenceType target) {
        setMaximumCrossingAtEndReference(XmlAdapterUtils.marshallJAXBElement(CodeVerticalReferenceType.class, new QName("http://www.aixm.aero/schema/5.1.1", "maximumCrossingAtEndReference"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "navigationtype")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "navigationtype_nilreason"))
    })
    public CodeRouteNavigationType getNavigationTypeItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteNavigationType.class, this.getNavigationType());
    }

    public void setNavigationTypeItem(CodeRouteNavigationType target) {
        setNavigationType(XmlAdapterUtils.marshallJAXBElement(CodeRouteNavigationType.class, new QName("http://www.aixm.aero/schema/5.1.1", "navigationType"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "requirednavigationperformance")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "requirednavigationperformance_nilreason"))
    })
    public CodeRNPType getRequiredNavigationPerformanceItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRNPType.class, this.getRequiredNavigationPerformance());
    }

    public void setRequiredNavigationPerformanceItem(CodeRNPType target) {
        setRequiredNavigationPerformance(XmlAdapterUtils.marshallJAXBElement(CodeRNPType.class, new QName("http://www.aixm.aero/schema/5.1.1", "requiredNavigationPerformance"), RouteSegmentTimeSliceType.class, target));
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "designatorsuffix")),
        @AttributeOverride(name = "nilReason", column = @Column(name = "designatorsuffix_nilreason"))
    })
    public CodeRouteDesignatorSuffixType getDesignatorSuffixItem() {
        return XmlAdapterUtils.unmarshallSource(CodeRouteDesignatorSuffixType.class, this.getDesignatorSuffix());
    }

    public void setDesignatorSuffixItem(CodeRouteDesignatorSuffixType target) {
        setDesignatorSuffix(XmlAdapterUtils.marshallJAXBElement(CodeRouteDesignatorSuffixType.class, new QName("http://www.aixm.aero/schema/5.1.1", "designatorSuffix"), RouteSegmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = EnRouteSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_id", referencedColumnName = "hjid")
    public EnRouteSegmentPointPropertyType getStartItem() {
        return XmlAdapterUtils.unmarshallSource(EnRouteSegmentPointPropertyType.class, this.getStart());
    }

    public void setStartItem(EnRouteSegmentPointPropertyType target) {
        setStart(XmlAdapterUtils.marshallJAXBElement(EnRouteSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "start"), RouteSegmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = RoutePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "routeformed_id", referencedColumnName = "hjid")
    public RoutePropertyType getRouteFormedItem() {
        return XmlAdapterUtils.unmarshallSource(RoutePropertyType.class, this.getRouteFormed());
    }

    public void setRouteFormedItem(RoutePropertyType target) {
        setRouteFormed(XmlAdapterUtils.marshallJAXBElement(RoutePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "routeFormed"), RouteSegmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = ObstacleAssessmentAreaPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "evaluationarea_id", referencedColumnName = "hjid")
    public ObstacleAssessmentAreaPropertyType getEvaluationAreaItem() {
        return XmlAdapterUtils.unmarshallSource(ObstacleAssessmentAreaPropertyType.class, this.getEvaluationArea());
    }

    public void setEvaluationAreaItem(ObstacleAssessmentAreaPropertyType target) {
        setEvaluationArea(XmlAdapterUtils.marshallJAXBElement(ObstacleAssessmentAreaPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "evaluationArea"), RouteSegmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = AIXMCurvePropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "curveextent_id", referencedColumnName = "hjid")
    public AIXMCurvePropertyType getCurveExtentItem() {
        return XmlAdapterUtils.unmarshallSource(AIXMCurvePropertyType.class, this.getCurveExtent());
    }

    public void setCurveExtentItem(AIXMCurvePropertyType target) {
        setCurveExtent(XmlAdapterUtils.marshallJAXBElement(AIXMCurvePropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "curveExtent"), RouteSegmentTimeSliceType.class, target));
    }

    @ManyToOne(targetEntity = EnRouteSegmentPointPropertyType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "end_id", referencedColumnName = "hjid")
    public EnRouteSegmentPointPropertyType getEndItem() {
        return XmlAdapterUtils.unmarshallSource(EnRouteSegmentPointPropertyType.class, this.getEnd());
    }

    public void setEndItem(EnRouteSegmentPointPropertyType target) {
        setEnd(XmlAdapterUtils.marshallJAXBElement(EnRouteSegmentPointPropertyType.class, new QName("http://www.aixm.aero/schema/5.1.1", "end"), RouteSegmentTimeSliceType.class, target));
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
        final RouteSegmentTimeSliceType that = ((RouteSegmentTimeSliceType) object);
        {
            boolean lhsFieldIsSet = this.isSetNavigationType();
            boolean rhsFieldIsSet = that.isSetNavigationType();
            JAXBElement<CodeRouteNavigationType> lhsField;
            lhsField = this.getNavigationType();
            JAXBElement<CodeRouteNavigationType> rhsField;
            rhsField = that.getNavigationType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "navigationType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "navigationType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetSignalGap();
            boolean rhsFieldIsSet = that.isSetSignalGap();
            JAXBElement<CodeYesNoType> lhsField;
            lhsField = this.getSignalGap();
            JAXBElement<CodeYesNoType> rhsField;
            rhsField = that.getSignalGap();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "signalGap", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "signalGap", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetAvailability();
            boolean rhsFieldIsSet = that.isSetAvailability();
            List<RouteAvailabilityPropertyType> lhsField;
            lhsField = (this.isSetAvailability()?this.getAvailability():null);
            List<RouteAvailabilityPropertyType> rhsField;
            rhsField = (that.isSetAvailability()?that.getAvailability():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "availability", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "availability", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEnd();
            boolean rhsFieldIsSet = that.isSetEnd();
            JAXBElement<EnRouteSegmentPointPropertyType> lhsField;
            lhsField = this.getEnd();
            JAXBElement<EnRouteSegmentPointPropertyType> rhsField;
            rhsField = that.getEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "end", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "end", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumObstacleClearanceAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumObstacleClearanceAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumObstacleClearanceAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWidthRight();
            boolean rhsFieldIsSet = that.isSetWidthRight();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidthRight();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidthRight();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "widthRight", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "widthRight", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetDesignatorSuffix();
            boolean rhsFieldIsSet = that.isSetDesignatorSuffix();
            JAXBElement<CodeRouteDesignatorSuffixType> lhsField;
            lhsField = this.getDesignatorSuffix();
            JAXBElement<CodeRouteDesignatorSuffixType> rhsField;
            rhsField = that.getDesignatorSuffix();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "designatorSuffix", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "designatorSuffix", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTrueTrack();
            boolean rhsFieldIsSet = that.isSetTrueTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getTrueTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getTrueTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "trueTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "trueTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLength();
            boolean rhsFieldIsSet = that.isSetLength();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getLength();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getLength();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "length", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "length", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumEnrouteAltitude();
            boolean rhsFieldIsSet = that.isSetMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumEnrouteAltitude();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumEnrouteAltitude", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumEnrouteAltitude", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMagneticTrack();
            boolean rhsFieldIsSet = that.isSetMagneticTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getMagneticTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getMagneticTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "magneticTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "magneticTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimit();
            boolean rhsFieldIsSet = that.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getLowerLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getLowerLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimit", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumCrossingAtEnd();
            boolean rhsFieldIsSet = that.isSetMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMinimumCrossingAtEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumCrossingAtEnd", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumCrossingAtEnd", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetEvaluationArea();
            boolean rhsFieldIsSet = that.isSetEvaluationArea();
            JAXBElement<ObstacleAssessmentAreaPropertyType> lhsField;
            lhsField = this.getEvaluationArea();
            JAXBElement<ObstacleAssessmentAreaPropertyType> rhsField;
            rhsField = that.getEvaluationArea();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "evaluationArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "evaluationArea", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLevel();
            boolean rhsFieldIsSet = that.isSetLevel();
            JAXBElement<CodeLevelType> lhsField;
            lhsField = this.getLevel();
            JAXBElement<CodeLevelType> rhsField;
            rhsField = that.getLevel();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "level", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "level", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetLowerLimitReference();
            boolean rhsFieldIsSet = that.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getLowerLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "lowerLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "lowerLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMinimumCrossingAtEndReference();
            boolean rhsFieldIsSet = that.isSetMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMinimumCrossingAtEndReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "minimumCrossingAtEndReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "minimumCrossingAtEndReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRouteFormed();
            boolean rhsFieldIsSet = that.isSetRouteFormed();
            JAXBElement<RoutePropertyType> lhsField;
            lhsField = this.getRouteFormed();
            JAXBElement<RoutePropertyType> rhsField;
            rhsField = that.getRouteFormed();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "routeFormed", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "routeFormed", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumCrossingAtEnd();
            boolean rhsFieldIsSet = that.isSetMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getMaximumCrossingAtEnd();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumCrossingAtEnd", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumCrossingAtEnd", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetCurveExtent();
            boolean rhsFieldIsSet = that.isSetCurveExtent();
            JAXBElement<AIXMCurvePropertyType> lhsField;
            lhsField = this.getCurveExtent();
            JAXBElement<AIXMCurvePropertyType> rhsField;
            rhsField = that.getCurveExtent();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "curveExtent", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "curveExtent", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetExtension();
            boolean rhsFieldIsSet = that.isSetExtension();
            List<RouteSegmentExtensionType> lhsField;
            lhsField = (this.isSetExtension()?this.getExtension():null);
            List<RouteSegmentExtensionType> rhsField;
            rhsField = (that.isSetExtension()?that.getExtension():null);
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "extension", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "extension", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReverseTrueTrack();
            boolean rhsFieldIsSet = that.isSetReverseTrueTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getReverseTrueTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getReverseTrueTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reverseTrueTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reverseTrueTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetReverseMagneticTrack();
            boolean rhsFieldIsSet = that.isSetReverseMagneticTrack();
            JAXBElement<ValBearingType> lhsField;
            lhsField = this.getReverseMagneticTrack();
            JAXBElement<ValBearingType> rhsField;
            rhsField = that.getReverseMagneticTrack();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "reverseMagneticTrack", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "reverseMagneticTrack", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetWidthLeft();
            boolean rhsFieldIsSet = that.isSetWidthLeft();
            JAXBElement<ValDistanceType> lhsField;
            lhsField = this.getWidthLeft();
            JAXBElement<ValDistanceType> rhsField;
            rhsField = that.getWidthLeft();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "widthLeft", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "widthLeft", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetPathType();
            boolean rhsFieldIsSet = that.isSetPathType();
            JAXBElement<CodeRouteSegmentPathType> lhsField;
            lhsField = this.getPathType();
            JAXBElement<CodeRouteSegmentPathType> rhsField;
            rhsField = that.getPathType();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pathType", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pathType", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpperLimitReference();
            boolean rhsFieldIsSet = that.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getUpperLimitReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimitReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimitReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetTurnDirection();
            boolean rhsFieldIsSet = that.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> lhsField;
            lhsField = this.getTurnDirection();
            JAXBElement<CodeDirectionTurnType> rhsField;
            rhsField = that.getTurnDirection();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "turnDirection", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "turnDirection", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetMaximumCrossingAtEndReference();
            boolean rhsFieldIsSet = that.isSetMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> lhsField;
            lhsField = this.getMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> rhsField;
            rhsField = that.getMaximumCrossingAtEndReference();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "maximumCrossingAtEndReference", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "maximumCrossingAtEndReference", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetRequiredNavigationPerformance();
            boolean rhsFieldIsSet = that.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> lhsField;
            lhsField = this.getRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> rhsField;
            rhsField = that.getRequiredNavigationPerformance();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "requiredNavigationPerformance", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "requiredNavigationPerformance", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = this.isSetUpperLimit();
            boolean rhsFieldIsSet = that.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> lhsField;
            lhsField = this.getUpperLimit();
            JAXBElement<ValDistanceVerticalType> rhsField;
            rhsField = that.getUpperLimit();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "upperLimit", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "upperLimit", rhsField);
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
            boolean lhsFieldIsSet = this.isSetStart();
            boolean rhsFieldIsSet = that.isSetStart();
            JAXBElement<EnRouteSegmentPointPropertyType> lhsField;
            lhsField = this.getStart();
            JAXBElement<EnRouteSegmentPointPropertyType> rhsField;
            rhsField = that.getStart();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "start", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "start", rhsField);
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
            boolean theFieldIsSet = this.isSetLevel();
            JAXBElement<CodeLevelType> theField;
            theField = this.getLevel();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "level", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "upperLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimit", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "lowerLimitReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumObstacleClearanceAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPathType();
            JAXBElement<CodeRouteSegmentPathType> theField;
            theField = this.getPathType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pathType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "trueTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getMagneticTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "magneticTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReverseTrueTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getReverseTrueTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reverseTrueTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReverseMagneticTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getReverseMagneticTrack();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "reverseMagneticTrack", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "length", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthLeft();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthLeft();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "widthLeft", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthRight();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthRight();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "widthRight", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "turnDirection", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignalGap();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSignalGap();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "signalGap", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumEnrouteAltitude();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumEnrouteAltitude", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumCrossingAtEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumCrossingAtEnd", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumCrossingAtEndReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "minimumCrossingAtEndReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumCrossingAtEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumCrossingAtEnd", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumCrossingAtEndReference();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "maximumCrossingAtEndReference", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationType();
            JAXBElement<CodeRouteNavigationType> theField;
            theField = this.getNavigationType();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "navigationType", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> theField;
            theField = this.getRequiredNavigationPerformance();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "requiredNavigationPerformance", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorSuffix();
            JAXBElement<CodeRouteDesignatorSuffixType> theField;
            theField = this.getDesignatorSuffix();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "designatorSuffix", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStart();
            JAXBElement<EnRouteSegmentPointPropertyType> theField;
            theField = this.getStart();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "start", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRouteFormed();
            JAXBElement<RoutePropertyType> theField;
            theField = this.getRouteFormed();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "routeFormed", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationArea();
            JAXBElement<ObstacleAssessmentAreaPropertyType> theField;
            theField = this.getEvaluationArea();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "evaluationArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCurveExtent();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getCurveExtent();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "curveExtent", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnd();
            JAXBElement<EnRouteSegmentPointPropertyType> theField;
            theField = this.getEnd();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "end", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<RouteAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "availability", theField);
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
            List<RouteSegmentExtensionType> theField;
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
            boolean theFieldIsSet = this.isSetLevel();
            JAXBElement<CodeLevelType> theField;
            theField = this.getLevel();
            strategy.appendField(locator, this, "level", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getUpperLimit();
            strategy.appendField(locator, this, "upperLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetUpperLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getUpperLimitReference();
            strategy.appendField(locator, this, "upperLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimit();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getLowerLimit();
            strategy.appendField(locator, this, "lowerLimit", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLowerLimitReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getLowerLimitReference();
            strategy.appendField(locator, this, "lowerLimitReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumObstacleClearanceAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumObstacleClearanceAltitude();
            strategy.appendField(locator, this, "minimumObstacleClearanceAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetPathType();
            JAXBElement<CodeRouteSegmentPathType> theField;
            theField = this.getPathType();
            strategy.appendField(locator, this, "pathType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTrueTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getTrueTrack();
            strategy.appendField(locator, this, "trueTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMagneticTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getMagneticTrack();
            strategy.appendField(locator, this, "magneticTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReverseTrueTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getReverseTrueTrack();
            strategy.appendField(locator, this, "reverseTrueTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetReverseMagneticTrack();
            JAXBElement<ValBearingType> theField;
            theField = this.getReverseMagneticTrack();
            strategy.appendField(locator, this, "reverseMagneticTrack", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetLength();
            JAXBElement<ValDistanceType> theField;
            theField = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthLeft();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthLeft();
            strategy.appendField(locator, this, "widthLeft", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetWidthRight();
            JAXBElement<ValDistanceType> theField;
            theField = this.getWidthRight();
            strategy.appendField(locator, this, "widthRight", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetTurnDirection();
            JAXBElement<CodeDirectionTurnType> theField;
            theField = this.getTurnDirection();
            strategy.appendField(locator, this, "turnDirection", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetSignalGap();
            JAXBElement<CodeYesNoType> theField;
            theField = this.getSignalGap();
            strategy.appendField(locator, this, "signalGap", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumEnrouteAltitude();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumEnrouteAltitude();
            strategy.appendField(locator, this, "minimumEnrouteAltitude", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMinimumCrossingAtEnd();
            strategy.appendField(locator, this, "minimumCrossingAtEnd", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMinimumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMinimumCrossingAtEndReference();
            strategy.appendField(locator, this, "minimumCrossingAtEndReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEnd();
            JAXBElement<ValDistanceVerticalType> theField;
            theField = this.getMaximumCrossingAtEnd();
            strategy.appendField(locator, this, "maximumCrossingAtEnd", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetMaximumCrossingAtEndReference();
            JAXBElement<CodeVerticalReferenceType> theField;
            theField = this.getMaximumCrossingAtEndReference();
            strategy.appendField(locator, this, "maximumCrossingAtEndReference", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetNavigationType();
            JAXBElement<CodeRouteNavigationType> theField;
            theField = this.getNavigationType();
            strategy.appendField(locator, this, "navigationType", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRequiredNavigationPerformance();
            JAXBElement<CodeRNPType> theField;
            theField = this.getRequiredNavigationPerformance();
            strategy.appendField(locator, this, "requiredNavigationPerformance", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetDesignatorSuffix();
            JAXBElement<CodeRouteDesignatorSuffixType> theField;
            theField = this.getDesignatorSuffix();
            strategy.appendField(locator, this, "designatorSuffix", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetStart();
            JAXBElement<EnRouteSegmentPointPropertyType> theField;
            theField = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetRouteFormed();
            JAXBElement<RoutePropertyType> theField;
            theField = this.getRouteFormed();
            strategy.appendField(locator, this, "routeFormed", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEvaluationArea();
            JAXBElement<ObstacleAssessmentAreaPropertyType> theField;
            theField = this.getEvaluationArea();
            strategy.appendField(locator, this, "evaluationArea", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetCurveExtent();
            JAXBElement<AIXMCurvePropertyType> theField;
            theField = this.getCurveExtent();
            strategy.appendField(locator, this, "curveExtent", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetEnd();
            JAXBElement<EnRouteSegmentPointPropertyType> theField;
            theField = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAvailability();
            List<RouteAvailabilityPropertyType> theField;
            theField = (this.isSetAvailability()?this.getAvailability():null);
            strategy.appendField(locator, this, "availability", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetAnnotation();
            List<NotePropertyType> theField;
            theField = (this.isSetAnnotation()?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = this.isSetExtension();
            List<RouteSegmentExtensionType> theField;
            theField = (this.isSetExtension()?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
