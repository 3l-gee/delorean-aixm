from lib.coordinator import Coordinator
from lib.annotation import Tag, Strategy
from lib.view import View
from lib.content import Content



View(yaml_path="codegen/pre-jaxb/view.yaml")

config = {
    "ignore": [
        # TODO solve this
        "StandardLevelColumnPropertyGroup.unitOfMeasurement",

        # Core
        "AIXMBasicMessageType",
        "AIXMBasicMessagePropertyGroup",
        "BasicMessageMemberAIXMPropertyType",
        "MessageMetadataPropertyType",
        "FeatureMetadataPropertyType",
        "FeatureTimeSliceMetadataPropertyType",
        "MessageMetadataPropertyType,",
        
        # Core Abstract
        "AbstractAIXMMessageBaseType",
        "AbstractAIXMMessageType",
        "AbstractAIXMFeatureBaseType",
        "AbstractAIXMFeatureType",
        "AbstractAIXMTimeSliceBaseType",
        "AbstractAIXMTimeSliceType",
        "AbstractAIXMPropertyType",
        "AbstractAIXMObjectBaseType",
        "AbstractAIXMObjectType",
        "AbstractExtensionType",

        # Gis
        "PointType",
        "ElevatedPointType",
        "CurveType",
        "ElevatedCurveType",
        "SurfaceType",
        "ElevatedSurfaceType",
        "PointPropertyType",
        "CurvePropertyType",
        "SurfacePropertyType",
        "ElevatedPointPropertyType",
        "ElevatedCurvePropertyType",
        "ElevatedSurfacePropertyType",
    ],
    "transient" : [       
        # TODO solve this         
        "extension",

        # Core
        # "aixm:AIXMBasicMessageType",
        # "aixm:AIXMBasicMessagePropertyGroup",
        # "aixm:BasicMessageMemberAIXMPropertyType",
        # "aixm:MessageMetadataPropertyType",
        # "aixm:FeatureMetadataPropertyType",
        # "aixm:FeatureTimeSliceMetadataPropertyType",
        # "aixm:MessageMetadataPropertyType,",
        

        # Abstract
        "aixm:AbstractDirectFlight",
        "aixm:AbstractPropertiesWithSchedule",
        "aixm:AbstractUsageConditio",
        "aixm:AbstractSurfaceContamination",
        "aixm:AbstractSegmentPoint",
        "aixm:AbstractUsageCondition",
        "aixm:AbstractAIXMMessageBaseType",
        "aixm:AbstractAIXMMessageType",
        "aixm:AbstractAIXMFeatureBaseType",
        "aixm:AbstractAIXMFeatureType",
        "aixm:AbstractAIXMTimeSliceBaseType",
        "aixm:AbstractAIXMTimeSliceType",
        "aixm:AbstractAIXMPropertyType",
        "aixm:AbstractAIXMObjectBaseType",
        "aixm:AbstractAIXMObjectType"
    ],
    "embed": [
    ],
    "abstract": [
        "AbstractMarkingType",
        "AbstractAirportHeliportProtectionAreaType",
        "AbstractGroundLightSystemType",
        "AbstractNavigationSystemCheckpointType",
        "AbstractNavaidEquipmentType",
        "AbstractProcedureType",
        "AbstractSegmentLegType",
        "AbstractApproachLegType",
        "AbstractServiceType",
        "AbstractTrafficSeparationServiceType",
        "AbstractAirportGroundServiceType",
        "AbstractRadarEquipmentType",
        "AbstractUsageConditionType",
        "AbstractSurfaceContaminationType",
        "AbstractSegmentPointType",
        "AbstractDirectFlightType",
        "AbstractPropertiesWithScheduleType",
    ],
    "output_path": "schema/aixm5_1_1/binding/aixm.xjb",
    "version" : "a5_1_1",
}

feature = {
    "name" : "../aixm/AIXM_Features",
    "path" : "schema/aixm5_1_1/aixm/AIXM_Features.xsd",
    "strategy" : Strategy.feature,
    "package" : "com.aixm.delorean.core.schema.a5_1_1.aixm",
    "manual" : "codegen/pre-jaxb/manual/a5_1_1/AIXM_Features.xjb"
}

data_types = {
    "name" : "../aixm/AIXM_DataTypes",
    "path" : "schema/aixm5_1_1/aixm/AIXM_DataTypes.xsd",
    "strategy" : Strategy.data_type,
    "manual" : "codegen/pre-jaxb/manual/a5_1_1/AIXM_DataTypes.xjb"
}

abstract = {
    "name" : "../aixm/AIXM_AbstractGML_ObjectTypes",
    "path" : "schema/aixm5_1_1/aixm/AIXM_AbstractGML_ObjectTypes.xsd",
    "strategy" : Strategy.abstract,
    "manual" : "codegen/pre-jaxb/manual/a5_1_1/AIXM_AbstractGML_ObjectTypes.xjb"
}

message = {
    "name" : "../aixm/message/AIXM_BasicMessage",
    "path" : "schema/aixm5_1_1/aixm/message/AIXM_BasicMessage.xsd",
    "strategy" : Strategy.other,
    "package" : "com.aixm.delorean.core.schema.a5_1_1.aixm.message",
    "manual" : "codegen/pre-jaxb/manual/a5_1_1/AIXM_BasicMessage.xjb"
}



out = Coordinator(config, [data_types, feature, abstract, message])

config = {
    "ignore": [
        # TODO solve this  
        "StandardLevelColumnPropertyGroup.unitOfMeasurement",
        "XHTMLType",

        # Adapter
        "DateType",
        "DateTimeType",

        # Core
        "AIXMBasicMessageType",
        "AIXMBasicMessagePropertyGroup",
        "BasicMessageMemberAIXMPropertyType",
        "MessageMetadataPropertyType",
        "FeatureMetadataPropertyType",
        "FeatureTimeSliceMetadataPropertyType",
        "MessageMetadataPropertyType,",

        # Gis
        "PointPropertyType",
        "CurvePropertyType",
        "SurfacePropertyType",
        "ElevatedPointPropertyType",
        "ElevatedCurvePropertyType",
        "ElevatedSurfacePropertyType",

        # Core Abstract
        "AbstractAIXMMessageBaseType",
        "AbstractAIXMMessageType",
        "AbstractAIXMFeatureBaseType",
        "AbstractAIXMFeatureType",
        "AbstractAIXMTimeSliceBaseType",
        "AbstractAIXMTimeSliceType",
        "AbstractAIXMPropertyType",
        "AbstractAIXMObjectBaseType",
        "AbstractAIXMObjectType",
    ],
    "transient" : [
        # TODO solve this    
        "extension",
        "aixm:XHTMLType",

        # Core
        "aixm:AIXMBasicMessageType",
        "aixm:AIXMBasicMessagePropertyGroup",
        "aixm:BasicMessageMemberAIXMPropertyType",
        "aixm:MessageMetadataPropertyType",
        "aixm:FeatureMetadataPropertyType",
        "aixm:FeatureTimeSliceMetadataPropertyType",
        "aixm:MessageMetadataPropertyType,",

        # Feature Abstract
        "aixm:AbstractDirectFlight",
        "aixm:AbstractPropertiesWithSchedule",
        "aixm:AbstractUsageConditio",
        "aixm:AbstractSurfaceContamination",
        "aixm:AbstractSegmentPoint",
        "aixm:AbstractUsageCondition",
        "aixm:AbstractAIXMMessageBaseType",
        "aixm:AbstractAIXMMessageType",
        "aixm:AbstractAIXMFeatureBaseType",
        "aixm:AbstractAIXMFeatureType",
        "aixm:AbstractAIXMTimeSliceBaseType",
        "aixm:AbstractAIXMTimeSliceType",
        "aixm:AbstractAIXMPropertyType",
        "aixm:AbstractAIXMObjectBaseType",
        "aixm:AbstractAIXMObjectType",
    ],
    "embed": [
        "PointType",
        "ElevatedPointType",
        "CurveType",
        "ElevatedCurveType",
        "SurfaceType",
        "ElevatedSurfaceType",
        "DateTimeType",
        "DateType"
    ],
    "abstract": [
        "AbstractMarkingType",
        "AbstractAirportHeliportProtectionAreaType",
        "AbstractGroundLightSystemType",
        "AbstractNavigationSystemCheckpointType",
        "AbstractNavaidEquipmentType",
        "AbstractProcedureType",
        "AbstractSegmentLegType",
        "AbstractApproachLegType",
        "AbstractServiceType",
        "AbstractTrafficSeparationServiceType",
        "AbstractAirportGroundServiceType",
        "AbstractRadarEquipmentType",
        "AbstractExtensionType",
        "AbstractUsageConditionType",
        "AbstractSurfaceContaminationType",
        "AbstractSegmentPointType",
        "AbstractDirectFlightType",
        "AbstractPropertiesWithScheduleType",
    ],
    "output_path": "schema/aixm5_1/binding/aixm.xjb",
    "version" : "a5_1",
}


feature = {
    "name" : "../aixm/AIXM_Features",
    "path" : "schema/aixm5_1/aixm/AIXM_Features.xsd",
    "strategy" : Strategy.feature,
    "package" : "com.aixm.delorean.core.schema.a5_1.aixm",
    "manual" : "codegen/pre-jaxb/manual/a5_1/AIXM_Features.xjb"
}

data_types = {
    "name" : "../aixm/AIXM_DataTypes",
    "path" : "schema/aixm5_1/aixm/AIXM_DataTypes.xsd",
    "strategy" : Strategy.data_type,
    "manual" : "codegen/pre-jaxb/manual/a5_1/AIXM_DataTypes.xjb"
}

abstract = {
    "name" : "../aixm/AIXM_AbstractGML_ObjectTypes",
    "path" : "schema/aixm5_1/aixm/AIXM_AbstractGML_ObjectTypes.xsd",
    "strategy" : Strategy.abstract,
    "manual" : "codegen/pre-jaxb/manual/a5_1/AIXM_AbstractGML_ObjectTypes.xjb"
}

message = {
    "name" : "../aixm/message/AIXM_BasicMessage",
    "path" : "schema/aixm5_1/aixm/message/AIXM_BasicMessage.xsd",
    "strategy" : Strategy.other,
    "package" : "com.aixm.delorean.core.schema.a5_1.aixm.message",
    "manual" : "codegen/pre-jaxb/manual/a5_1/AIXM_BasicMessage.xjb"
}

# out = Machinery(config, [data_types, feature, abstract, message])

config = {
    "ignore": [
        "AngleType",

        # Core
        "AIXMBasicMessageType",
        "AIXMBasicMessagePropertyGroup",
        "BasicMessageMemberAIXMPropertyType",
        "MessageMetadataPropertyType",
        "FeatureMetadataPropertyType",
        "FeatureTimeSliceMetadataPropertyType",
        "MessageMetadataPropertyType,",
        
        # Core Abstract
        "AbstractAIXMMessageBaseType",
        "AbstractAIXMMessageType",
        "AbstractAIXMFeatureBaseType",
        "AbstractAIXMFeatureType",
        "AbstractAIXMTimeSliceBaseType",
        "AbstractAIXMTimeSliceType",
        "AbstractAIXMPropertyType",
        "AbstractAIXMObjectBaseType",
        "AbstractAIXMObjectType",

        # Gis
        "PointType",
        "ElevatedPointType",
        "CurveType",
        "ElevatedCurveType",
        "SurfaceType",
        "ElevatedSurfaceType",
        "PointPropertyType",
        "CurvePropertyType",
        "SurfacePropertyType",
        "ElevatedPointPropertyType",
        "ElevatedCurvePropertyType",
        "ElevatedSurfacePropertyType",
    ],
    "transient" : [
        "aixm:XHTMLType",

        # Core
        "aixm:AIXMBasicMessageType",
        "aixm:AIXMBasicMessagePropertyGroup",
        "aixm:BasicMessageMemberAIXMPropertyType",
        "aixm:MessageMetadataPropertyType",
        "aixm:FeatureMetadataPropertyType",
        "aixm:FeatureTimeSliceMetadataPropertyType",
        "aixm:MessageMetadataPropertyType,",

        # Feature Abstract
        "aixm:AbstractDirectFlight",
        "aixm:AbstractPropertiesWithSchedule",
        "aixm:AbstractUsageConditio",
        "aixm:AbstractSurfaceContamination",
        "aixm:AbstractSegmentPoint",
        "aixm:AbstractUsageCondition",
        "aixm:AbstractAIXMMessageBaseType",
        "aixm:AbstractAIXMMessageType",
        "aixm:AbstractAIXMFeatureBaseType",
        "aixm:AbstractAIXMFeatureType",
        "aixm:AbstractAIXMTimeSliceBaseType",
        "aixm:AbstractAIXMTimeSliceType",
        "aixm:AbstractAIXMPropertyType",
        "aixm:AbstractAIXMObjectBaseType",
        "aixm:AbstractAIXMObjectType",
        "aixm:AbstractSurveillanceRadarType"
    ],
    "embed": [
    ],
    "abstract": [
        "AbstractMarkingType",
        "AbstractAirportHeliportProtectionAreaType",
        "AbstractGroundLightSystemType",
        "AbstractNavigationSystemCheckpointType",
        "AbstractNavaidEquipmentType",
        "AbstractProcedureType",
        "AbstractSegmentLegType",
        "AbstractApproachLegType",
        "AbstractServiceType",
        "AbstractTrafficSeparationServiceType",
        "AbstractAirportGroundServiceType",
        "AbstractRadarEquipmentType",
        "AbstractExtensionType",
        "AbstractUsageConditionType",
        "AbstractSurfaceContaminationType",
        "AbstractSegmentPointType",
        "AbstractDirectFlightType",
        "AbstractPropertiesWithScheduleType",
        "AbstractSurveillanceRadarType"
    ],
    "output_path": "schema/aixm5_2/binding/aixm.xjb",
    "version" : "a5_2",
}


feature = {
    "name" : "../aixm/AIXM_Features",
    "path" : "schema/aixm5_2/aixm/AIXM_Features.xsd",
    "strategy" : Strategy.feature,
    "package" : "com.aixm.delorean.core.schema.a5_2.aixm",
    "manual" : "codegen/pre-jaxb/lib/manual/a5_2/AIXM_Features.xjb"
}

data_types = {
    "name" : "../aixm/AIXM_DataTypes",
    "path" : "schema/aixm5_2/aixm/AIXM_DataTypes.xsd",
    "strategy" : Strategy.data_type,
    "manual" : "codegen/pre-jaxb/lib/manual/a5_2/AIXM_DataTypes.xjb"
}

abstract = {
    "name" : "../aixm/AIXM_AbstractGML_ObjectTypes",
    "path" : "schema/aixm5_2/aixm/AIXM_AbstractGML_ObjectTypes.xsd",
    "strategy" : Strategy.abstract,
    "manual" : "codegen/pre-jaxb/lib/manual/a5_2/AIXM_AbstractGML_ObjectTypes.xjb"
}

message = {
    "name" : "../aixm/message/AIXM_BasicMessage",
    "path" : "schema/aixm5_2/aixm/message/AIXM_BasicMessage.xsd",
    "strategy" : Strategy.other,
    "package" : "com.aixm.delorean.core.schema.a5_2.aixm.message",
    "manual" : "codegen/pre-jaxb/lib/manual/a5_2/AIXM_BasicMessage.xjb"
}

# out = Machinery(config, [data_types, feature, abstract, message])
