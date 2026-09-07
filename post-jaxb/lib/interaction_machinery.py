import os
from os import path
import re
import yaml
from lib.parsing_utility import ParsingUtility
from lib.helper_function import HeleperFunction
from lib.feature import Feature
from lib.object import Object
from lib.helper_function import HeleperFunction
import copy

class InteractionMachinery:
    JAXB_IGNORE_FILES = {
        "package-info.java",
        "ObjectFactory.java"
    }

    def __init__(self, parsing: str, config_path: str, out_view_sql: str, out_materialized_sql: str, directory_path: str):

        # Load configurations
        config = HeleperFunction.load_yaml(config_path)
        ParsingUtility.set_parsing(parsing)
        self.out_view_sql = out_view_sql
        self.out_materialized_sql = out_materialized_sql
        ParsingUtility.set_parsing
        self.formated_sql = {}
        self.aixm = config["aixm"]

        # Initialize sets from config
        self.feature_set = set(config["feature"]["list"])
        self.timesliceproperty_set = set(config["timesliceproperty"]["list"])
        self.timeslice_set = set(config["timeslice"]["list"])
        self.object_set = set(config["object"]["list"])
        self.property_set = set(config["property"]["list"])
        self.timeslice_extension_set = set(config["timeslice_extension"]["list"])
        self.object_extension_set = set(config["object_extension"]["list"])
        self.basetype_set = set(config["basetype"]["list"])
        self.type_set = set(config["type"]["list"])
        self.ignore_set = set(config["ignore"])
        self.abstract_set = set(config["abstract"])

        # File handling
        self.files = HeleperFunction.get_file_path(directory_path, ".java", self.JAXB_IGNORE_FILES)
        self.views = {"feature": {}, "object": {}, "property": {}}
        self.class_info = {}

        # Step 1: Generate Main body
        self.generate_main_body()

        # Step 2: Populate attribute and references
        self.populates_attributes_refs_links()

        # Step 3: Generate SQL views for classified files
        self.generate_views()

        # Step 4: Export the generated SQL to the specified output path
        self.export_sql(self.out_view_sql, materialized = False)
        self.export_sql(self.out_materialized_sql, materialized = True)

        # step 5: summary
        self.print_summary()

    def print_summary(self):
        print(f"=== View generation Summary ({self.aixm}) ===")
        print(f"  • Features           : {len(self.feature_set)}")
        print(f"  • Objects            : {len(self.object_set)}")
        print(f"  • Properties         : {len(self.property_set)}")
        print(f"  • TimeSlices         : {len(self.timeslice_set)}")
        print(f"  • TimeSlice Props    : {len(self.timesliceproperty_set)}")
        print(f"  • TimeSlice Ext      : {len(self.timeslice_extension_set)}")
        print(f"  • Object Ext         : {len(self.object_extension_set)}")
        print(f"  • Types / BaseTypes  : {len(self.type_set)} / {len(self.basetype_set)}")
        print(f"  • Abstract / Ignored : {len(self.abstract_set)} / {len(self.ignore_set)}")
        print(f"  • Java Files Found   : {len(self.files)}")
        print(f"  • Generated Views    : {sum(len(v) for v in self.views.values())}")
        print("=" * 50)

    def generate_views(self):
        for feature in self.views["feature"].values():
            feature.generate_view_sql()
            feature.generate_materialized_sql()

        for object in self.views["object"].values():
            object.generate_view_sql()
            object.generate_materialized_sql()

        for property in self.views["property"].values():
            property.generate_view_sql()
            property.generate_materialized_sql()

    def generate_main_body(self):
        """Classify all Java files into Features, TimeSlices, Objects, etc."""
        for file in self.files:
            content = HeleperFunction.load_java(file)
            core = ParsingUtility.extract_core(content)
            class_name = core.get("class")
            parent_name = core.get("parent")
            schema = core.get("schema")

            if core.get("class") in self.abstract_set or core.get("class") in self.ignore_set:
                continue

            # Feature 
            if class_name in self.feature_set:
                self.views["feature"][class_name] = Feature(class_name, schema, self.aixm)
                continue

            if class_name in self.timesliceproperty_set or class_name in self.timeslice_set:
                continue

            # Object
            if class_name in self.object_set or parent_name in self.object_set:
                self.views["object"][class_name] = Object(class_name, schema, self.aixm)
                continue

            if class_name in self.property_set and parent_name == "AbstractAIXMPropertyType":
                continue

            # Links
            if class_name in self.property_set or (class_name.replace("PropertyType", "Type") in self.feature_set and parent_name is None):
                continue

            # Extension
            if class_name in self.object_set:
                continue

            if  class_name in self.object_extension_set:
                continue

            if  class_name in self.timeslice_extension_set:
                continue

            # Basetype
            elif class_name in self.basetype_set:
                continue

            elif class_name in self.type_set:
                continue

            elif class_name in self.ignore_set:
                continue

            elif class_name in self.abstract_set:
                continue

            elif parent_name in self.abstract_set:
                continue
        
            else :
                print(f"Class {core.get('class')} {core.get('parent')} not classified")

    def populates_attributes_refs_links(self):
        for file in self.files:
            content = HeleperFunction.load_java(file)
            core = ParsingUtility.extract_core(content)
            class_name = core.get("class")
            parent_name = core.get("parent")
            schema = core.get("schema")

            if core.get("class") in self.abstract_set or core.get("class") in self.ignore_set:
                continue

            # Feature 
            elif core.get("class") in self.feature_set:
                continue

            elif core.get("class") in self.timesliceproperty_set:
                continue

            elif core.get("class") in self.timeslice_set:
                base_class_name = class_name.replace("TimeSlice", "")
                if (self.views["feature"].get(base_class_name) is not None):
                    timeslice = self.views["feature"].get(base_class_name)
                    self.process_content(timeslice, content)
                    continue
                else:
                    raise Exception(f"Timeslice {core.get('class')} does not have a corresponding feature class")
                                                
            # Object
            elif core.get("class") in self.object_set or core.get("parent") in self.object_set:
                base_class_name = class_name.replace("PropertyType", "")
                base_class_name = class_name.replace("PropertyType", "")
                if (self.views["object"].get(base_class_name) is not None):
                    object = self.views["object"].get(base_class_name)
                    self.process_content(object, content)
                    continue
                continue

            elif core.get("class") in self.property_set and core.get("parent") == "AbstractAIXMPropertyType":
                continue

            # Links
            elif core.get("class") in self.property_set or core.get("class").replace("PropertyType", "Type") in self.feature_set and core.get("parent") is None:
                continue


            # Extension
            elif core.get("class") in self.object_set:
                continue

            elif core.get("class") in self.object_extension_set:
                continue

            elif core.get("class") in self.timeslice_extension_set:
                continue


            # Basetype
            elif core.get("class") in self.basetype_set:
                continue

            elif core.get("class") in self.type_set:
                continue

            elif core.get("class") in self.ignore_set:
                continue

            elif core.get("class") in self.abstract_set:
                continue

            elif core.get("parent") in self.abstract_set:
                continue
        
            else :
                print(f"Class {core.get('class')} {core.get('parent')} not classified")
    
    def classify_file(self, path):
        content = HeleperFunction.load_java(path)
        core =  ParsingUtility.extract_core(self.parsing, content)

        # files are either in: 
        # - Feature
        # - Object
            
        if class_name in self.feature_set :
            self.feature[class_name] = Feature(self.input_path, class_name, schema_name)
    
            
    def export_sql(self, output_path, materialized):
        test = ""
        for key in self.views.keys():
            test += "--" + key + "\n\n"
            for feature in self.views[key].values():
                test += "EXECUTE 'REFRESH MATERIALIZED VIEW CONCURRENTLY" + feature.get_view() + "';\n"

        with open("text.txt", "w", encoding="utf-8") as f:
            f.write(test)

        res = ""
        for key in self.views.keys():
            res += "--" + key + "\n\n"
            for feature in self.views[key].values():

                if materialized == True :
                    res += "--" + feature.get_view() + "\n\n"
                    res += feature.get_materialized_sql() + "\n\n"

                else:
                    res += "--" + feature.get_view() + "\n\n"
                    res += feature.get_view_sql() + "\n\n"
        
        with open(output_path, "w", encoding="utf-8") as f:
            f.write(res)

    def get_layers(self):
        """Process each Java file and extract relevant information."""
        self.parsing.process(self.files)
        return self.parsing.get_layer()
    
    def populate_qgis_prj(self, prj) :  
        project_layers = prj.find(".//projectlayers")
        layer_tree_group = prj.find(".//layer-tree-group")

        layer_tree_group_dict = {}
        aixm_type_to_layer = {}

        for layer, _ in self.layers.values():
            if layer.get_type() not in self.ignore_set:

                if layer.get_type() not in aixm_type_to_layer : 
                    aixm_type_to_layer[layer.get_type()] = []

                aixm_type_to_layer[layer.get_type()].extend(self.qlr_generator.get_qlr_layer_names(layer))

                # Adds qlr to layer tree group
                if layer.get_schema() not in layer_tree_group_dict:
                    layer_tree_group_schema = copy.deepcopy(self.layer_tree_group)
                    layer_tree_group_schema.set("name", layer.get_schema())
                    layer_tree_group_dict[layer.get_schema()] = layer_tree_group_schema
        
        for layer, _ in self.layers.values():
            if layer.get_type() not in self.ignore_set:

                # generates qlr layer from layer publish information
                list_qlr_bundle = self.qlr_generator.genrate_publish_qlr(layer, aixm_type_to_layer)
                for qlr_bundle in list_qlr_bundle:
                    project_layers.append(qlr_bundle.get("layer"))
                    layer_tree_group_dict[layer.get_schema()].append(qlr_bundle.get("layertree"))
            else : 
                print("Ignored : ", layer.get_type())
        
        for key, group in layer_tree_group_dict.items() :
            layer_tree_group.append(group)

    def process_content(self, layer, content):
        parser = ParsingUtility()
        core = ParsingUtility.extract_core(content)

        # 1. Embedded Columns (2-tuple)
        for item in parser.extract_embedded_columns_two(content):
            layer.add_attributes_two(
                item.get("type"),
                item.get("role"),
                item.get("value"),
                item.get("nil"),
            )

        # 2. Embedded Columns (3-tuple)
        for item in parser.extract_embedded_columns_three(content):
            layer.add_attributes_three(
                item.get("type"),   
                item.get("role"),
                item.get("value"),
                item.get("uom"),
                item.get("nil"),
            )

        # 2. Embedded Columns (4-tuple)
        for item in parser.extract_embedded_columns_four(content):
            layer.add_attributes_four(
                item.get("type"),
                item.get("role"),
                item.get("value"),
                item.get("uom"),
                item.get("accuracy"),
                item.get("nil"),
            )

        # 3. One-to-One Associations
        for item in parser.extract_one_to_one(content):
            prop_type = item.get("type")
            if not prop_type or prop_type in self.ignore_set:
                continue

            target_type = prop_type.replace("PropertyType", "Type")
            renamed_type = prop_type.replace("Property", "")

            # Relates to a Feature
            if prop_type in self.property_set and target_type in self.feature_set:
                referenced_layer = self.views["feature"][renamed_type]
                layer.add_association_feature_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    referenced_layer.get_schema(),
                    referenced_layer.get_name(),
                )

            # Relates to an Object
            elif prop_type in self.property_set and target_type in self.object_set:
                referenced_layer = self.views["object"][renamed_type]
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    referenced_layer.get_schema(),
                    referenced_layer.get_name(),
                )

            elif prop_type == "DirectFlightPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "route",
                    "directflight_p",
                )

            elif prop_type == "SegmentPointPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "navaids_point",
                    "segmentpoint_p",
                )

            elif prop_type == "ProcedurePropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "procedure",
                    "procedure_p",
                )

            elif prop_type == "NavaidEquipmentPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "navaids_point",
                    "navaidequipment_p",
                )

            elif prop_type == "GroundLightSystemPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "airport_heliport",
                    "groundlightsystem_p",
                )

            elif prop_type == "SegmentLegPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "procedure",
                    "segmentleg_p",
                )

            elif prop_type == "RadarEquipmentPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "surveillance",
                    "radarequipment_p",
                )

            elif prop_type == "AirportHeliportProtectionAreaPropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "airport_heliport",
                    "airportheliportprotectionarea_p",
                )

            elif prop_type == "ServicePropertyType":
                layer.add_association_object_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "service",
                    "service_p",
                )

            elif prop_type == "AIXMPointPropertyType":
                layer.add_association_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_point_pt_view",
                )

            elif prop_type == "AIXMElevatedPointPropertyType":
                layer.add_association_elevated_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_point_pt_view",
                )

            elif prop_type == "AIXMCurvePropertyType":
                layer.add_association_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_curve_pt_view",
                )

            elif prop_type == "AIXMElevatedCurvePropertyType":
                layer.add_association_elevated_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_curve_pt_view",
                )

            elif prop_type == "AIXMSurfacePropertyType":
                layer.add_association_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_surface_pt_view",
                )

            elif prop_type == "AIXMElevatedSurfacePropertyType":
                layer.add_association_elevated_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_surface_pt_view",
                )

            elif prop_type == "AirspaceVolumeDependencyPropertyType":
                layer.add_association_elevated_geometry_one(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_surface_pt_view",
                )

            else:
                print("Missing 1:1 match:", item)

        # 4. One-to-Many Associations
        for item in parser.extract_one_to_many(content):
            prop_type = item.get("type")
            if not prop_type or prop_type in self.ignore_set:
                continue

            target_type = prop_type.replace("PropertyType", "Type")
            renamed_type = prop_type.replace("Property", "")

            # Relates to Features
            if prop_type in self.property_set and target_type in self.feature_set:
                referenced_layer = self.views["feature"][renamed_type]
                layer.add_association_feature_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    referenced_layer.get_schema(),
                    referenced_layer.get_name(),
                )

            # Relates to an Object
            elif prop_type in self.property_set and target_type in self.object_set:
                referenced_layer = self.views["object"][renamed_type]
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    referenced_layer.get_schema(),
                    referenced_layer.get_name(),
                )

            elif prop_type == "DirectFlightPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "route",
                    "directflight_p",
                )

            elif prop_type == "SegmentPointPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "navaids_point",
                    "segmentpoint_p",
                )

            elif prop_type == "ProcedurePropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "procedure",
                    "procedure_p",
                )


            elif prop_type == "NavaidEquipmentPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "navaids_point",
                    "navaidequipment_p",
                )

            elif prop_type == "GroundLightSystemPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "airport_heliport",
                    "groundlightsystem_p",
                )

            elif prop_type == "SegmentLegPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "procedure",
                    "segmentleg_p",
                )

            elif prop_type == "RadarEquipmentPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "surveillance",
                    "radarequipment_p",
                )

            elif prop_type == "AirportHeliportProtectionAreaPropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "airport_heliport",
                    "airportheliportprotectionarea_p",
                )

            elif prop_type == "ServicePropertyType":
                layer.add_association_object_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "service",
                    "service_p",
                )
                

            elif prop_type == "AIXMPointPropertyType":
                layer.add_association_geometry_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_point_pt_view",
                )

            elif prop_type == "AIXMElevatedPointPropertyType":
                layer.add_association_elevated_geometry_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_point_pt_view",
                )

            elif prop_type == "AIXMCurvePropertyType":
                layer.add_association_geometry_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_curve_pt_view",
                )

            elif prop_type == "AIXMElevatedCurvePropertyType":
                layer.add_association_elevated_geometry_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_curve_pt_view",
                )

            elif prop_type == "AIXMSurfacePropertyType":
                layer.add_association_geometry_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_surface_pt_view",
                )

            elif prop_type == "AIXMElevatedSurfacePropertyType":
                layer.add_association_elevated_geometry_many(
                    prop_type,
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    "gml",
                    "aixm_elevated_surface_pt_view",
                )

            else:
                print("Missing 1:N match:", item)