
package com.aixm.delorean.aixm511.schema;

import java.io.Serializable;
import com.aixm.delorean.core.org.gml.v_3_2.AbstractGMLType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.ObjectLocator;


/**
 * Base type for AIXM complex types that are NOT features. For example, City, ContactInformation, AirspaceVolume, etc. It derives from AbstractGMLType so that AIXM objects are recognised as GML objects, thus ensuring that GML-aware applications recognise them properly. Retains only the mandatory gml:id attribute.
 * 
 * <p>Java class for AbstractAIXMObjectType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractAIXMObjectType">
 *   <complexContent>
 *     <restriction base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <sequence>
 *         </sequence>
 *       </sequence>
 *       <attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMObjectType")
@XmlSeeAlso({
    AbstractExtensionType.class,
    AerialRefuellingAnchorType.class,
    AerialRefuellingTrackType.class,
    AuthorityForAerialRefuellingType.class,
    CityType.class,
    SurfaceCharacteristicsType.class,
    LightActivationType.class,
    MarkingElementType.class,
    AbstractUsageConditionType.class,
    NavaidEquipmentDistanceType.class,
    RunwayDeclaredDistanceType.class,
    RidgeType.class,
    SurfaceContaminationLayerType.class,
    AbstractSurfaceContaminationType.class,
    AirspaceGeometryComponentType.class,
    AirspaceVolumeType.class,
    AirspaceVolumeDependencyType.class,
    HoldingPatternDistanceType.class,
    HoldingPatternDurationType.class,
    AuthorityForNavaidEquipmentType.class,
    AuthorityForSpecialNavigationStationType.class,
    AuthorityForSpecialNavigationSystemType.class,
    NavaidComponentType.class,
    AngleUseType.class,
    PointReferenceType.class,
    AbstractSegmentPointType.class,
    LinguisticNoteType.class,
    NoteType.class,
    OrganisationAuthorityAssociationType.class,
    UnitDependencyType.class,
    ApproachAltitudeTableType.class,
    ApproachConditionType.class,
    ApproachDistanceTableType.class,
    ApproachTimingTableType.class,
    FinalProfileType.class,
    MissedApproachGroupType.class,
    TerminalArrivalAreaSectorType.class,
    FASDataBlockType.class,
    EquipmentUnavailableAdjustmentType.class,
    EquipmentUnavailableAdjustmentColumnType.class,
    MinimaType.class,
    DepartureArrivalConditionType.class,
    NavigationAreaSectorType.class,
    SectorDesignType.class,
    SafeAltitudeAreaSectorType.class,
    HoldingUseType.class,
    LandingTakeoffAreaCollectionType.class,
    ProcedureTransitionType.class,
    ProcedureTransitionLegType.class,
    RoutePortionType.class,
    AbstractDirectFlightType.class,
    FlightConditionCircumstanceType.class,
    FlightConditionElementType.class,
    FlightRestrictionLevelType.class,
    FlightRestrictionRouteType.class,
    FlightRoutingElementType.class,
    CallsignDetailType.class,
    FuelType.class,
    NitrogenType.class,
    OilType.class,
    OxygenType.class,
    ContactInformationType.class,
    AircraftCharacteristicType.class,
    FlightCharacteristicType.class,
    AirspaceLayerType.class,
    CircleSectorType.class,
    LightElementType.class,
    AbstractPropertiesWithScheduleType.class,
    MeteorologyType.class,
    TimesheetType.class,
    StandardLevelType.class,
    AltitudeAdjustmentType.class,
    ObstacleAssessmentAreaType.class,
    ObstaclePlacementType.class,
    ObstructionType.class,
    RadarComponentType.class,
    ReflectorType.class,
    SurveillanceGroundStationType.class
})
@Entity(name = "AbstractAIXMObjectType")
@Table(name = "aixm_object", schema = "aixm")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractAIXMObjectType
    extends AbstractGMLType
    implements Serializable
{

    private static final long serialVersionUID = 20251104L;

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
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

}
