
package com.delorean.aixm.aixm52.schema;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
 * <p>Java class for ObstacleAssessmentSurfacePropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstacleAssessmentSurfacePropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.2}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.2}ObstacleAssessmentSurface"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstacleAssessmentSurfacePropertyType", propOrder = {
    "obstacleAssessmentSurface"
})
@Entity(name = "ObstacleAssessmentSurfacePropertyType")
@Table(name = "obstacleassessmentsurface_p", schema = "shared")
public class ObstacleAssessmentSurfacePropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ObstacleAssessmentSurface", required = true)
    protected ObstacleAssessmentSurfaceType obstacleAssessmentSurface;

    /**
     * Gets the value of the obstacleAssessmentSurface property.
     * 
     * @return
     *     possible object is
     *     {@link ObstacleAssessmentSurfaceType }
     *     
     */
    @OneToOne(targetEntity = ObstacleAssessmentSurfaceType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "obstacleassessmentsurface_hjid", referencedColumnName = "hjid")
    public ObstacleAssessmentSurfaceType getObstacleAssessmentSurface() {
        return obstacleAssessmentSurface;
    }

    /**
     * Sets the value of the obstacleAssessmentSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstacleAssessmentSurfaceType }
     *     
     */
    public void setObstacleAssessmentSurface(ObstacleAssessmentSurfaceType value) {
        this.obstacleAssessmentSurface = value;
    }

    @Transient
    public boolean isSetObstacleAssessmentSurface() {
        return (this.obstacleAssessmentSurface!= null);
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
        final ObstacleAssessmentSurfacePropertyType that = ((ObstacleAssessmentSurfacePropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetObstacleAssessmentSurface();
            boolean rhsFieldIsSet = that.isSetObstacleAssessmentSurface();
            ObstacleAssessmentSurfaceType lhsField;
            lhsField = this.getObstacleAssessmentSurface();
            ObstacleAssessmentSurfaceType rhsField;
            rhsField = that.getObstacleAssessmentSurface();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleAssessmentSurface", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleAssessmentSurface", rhsField);
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
            boolean theFieldIsSet = this.isSetObstacleAssessmentSurface();
            ObstacleAssessmentSurfaceType theField;
            theField = this.getObstacleAssessmentSurface();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleAssessmentSurface", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetObstacleAssessmentSurface();
            ObstacleAssessmentSurfaceType theField;
            theField = this.getObstacleAssessmentSurface();
            strategy.appendField(locator, this, "obstacleAssessmentSurface", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
