
package com.aixm.delorean.aixm511.schema;

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
 * <p>Java class for ObstacleAssessmentAreaPropertyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObstacleAssessmentAreaPropertyType">
 *   <complexContent>
 *     <extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       <sequence>
 *         <element ref="{http://www.aixm.aero/schema/5.1.1}ObstacleAssessmentArea"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstacleAssessmentAreaPropertyType", propOrder = {
    "obstacleAssessmentArea"
})
@Entity(name = "ObstacleAssessmentAreaPropertyType")
@Table(name = "obstacleassessmentarea_pt", schema = "shared")
public class ObstacleAssessmentAreaPropertyType
    extends AbstractAIXMPropertyType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;
    @XmlElement(name = "ObstacleAssessmentArea", required = true)
    protected ObstacleAssessmentAreaType obstacleAssessmentArea;

    /**
     * Gets the value of the obstacleAssessmentArea property.
     * 
     * @return
     *     possible object is
     *     {@link ObstacleAssessmentAreaType }
     *     
     */
    @OneToOne(targetEntity = ObstacleAssessmentAreaType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "obstacleassessmentarea_id", referencedColumnName = "hjid")
    public ObstacleAssessmentAreaType getObstacleAssessmentArea() {
        return obstacleAssessmentArea;
    }

    /**
     * Sets the value of the obstacleAssessmentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstacleAssessmentAreaType }
     *     
     */
    public void setObstacleAssessmentArea(ObstacleAssessmentAreaType value) {
        this.obstacleAssessmentArea = value;
    }

    @Transient
    public boolean isSetObstacleAssessmentArea() {
        return (this.obstacleAssessmentArea!= null);
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
        final ObstacleAssessmentAreaPropertyType that = ((ObstacleAssessmentAreaPropertyType) object);
        {
            boolean lhsFieldIsSet = this.isSetObstacleAssessmentArea();
            boolean rhsFieldIsSet = that.isSetObstacleAssessmentArea();
            ObstacleAssessmentAreaType lhsField;
            lhsField = this.getObstacleAssessmentArea();
            ObstacleAssessmentAreaType rhsField;
            rhsField = that.getObstacleAssessmentArea();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "obstacleAssessmentArea", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "obstacleAssessmentArea", rhsField);
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
            boolean theFieldIsSet = this.isSetObstacleAssessmentArea();
            ObstacleAssessmentAreaType theField;
            theField = this.getObstacleAssessmentArea();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "obstacleAssessmentArea", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = this.isSetObstacleAssessmentArea();
            ObstacleAssessmentAreaType theField;
            theField = this.getObstacleAssessmentArea();
            strategy.appendField(locator, this, "obstacleAssessmentArea", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }

}
