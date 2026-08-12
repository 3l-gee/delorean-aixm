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

    def __init__(self, parsing: str, config_path: str, output_path: str, directory_path: str):

        # Load configurations
        config = HeleperFunction.load_yaml(config_path)
        ParsingUtility.set_parsing(parsing)
        self.output_path = output_path
        ParsingUtility.set_parsing
        self.formated_sql = {}

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
        self.export_sql(self.output_path)


    def generate_views(self):
        for feature in self.views["feature"].values():
            feature.generate_sql()

        for object in self.views["object"].values():
            object.generate_sql()

        for property in self.views["property"].values():
            property.generate_sql()

    def generate_main_body(self):
        """Classify all Java files into Features, TimeSlices, Objects, etc."""
        for file in self.files:
            content = HeleperFunction.load_java(file)
            core = ParsingUtility.extract_core(content)
            class_name = core.get("class")
            parent_name = core.get("parent")
            schema = core.get("schema")

            # Feature 
            if class_name in self.feature_set:
                self.views["feature"][class_name] = Feature(class_name, schema)
                continue

            if class_name in self.timesliceproperty_set or class_name in self.timeslice_set:
                continue

            # Object
            if class_name in self.object_set or parent_name in self.object_set:
                self.views["object"][class_name] = Object(class_name, schema)
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

            # Feature 
            if core.get("class") in self.feature_set:
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


        # for file in self.files:
        #     content = HeleperFunction.load_java(file)
        #     core = ParsingUtility.extract_core(self.parsing, content)

        #     # Feature 
        #     if core.get("class") in self.feature_set:
        #         self.views["feature"][core.get("class")] = Feature(core.get("class"), core.get("schema"))
        #         continue

        #     elif core.get("class") in self.timesliceproperty_set:
        #         #self.views["feature"][core.get("class")] = Feature(core.get("class"), core.get("schema"))
        #         continue

        #     elif core.get("class") in self.timeslice_set:
        #         continue

 
        #     # Object
        #     elif core.get("class") in self.object_set or core.get("parent") in self.object_set:
        #         continue

        #     elif core.get("class") in self.property_set and core.get("parent") == "AbstractAIXMPropertyType":
        #         continue

        #     # Links
        #     elif core.get("class") in self.property_set or core.get("class").replace("PropertyType", "Type") in self.feature_set and core.get("parent") is None:
        #         continue


        #     # Extension
        #     elif core.get("class") in self.object_set:
        #         continue

        #     elif core.get("class") in self.object_extension_set:
        #         continue

        #     elif core.get("class") in self.timeslice_extension_set:
        #         continue


        #     # Basetype
        #     elif core.get("class") in self.basetype_set:
        #         continue

        #     elif core.get("class") in self.type_set:
        #         continue

        #     elif core.get("class") in self.ignore_set:
        #         continue

        #     elif core.get("class") in self.abstract_set:
        #         continue

        #     elif core.get("parent") in self.abstract_set:
        #         continue
        
        #     else :
        #         print(f"Class {core.get('class')} {core.get('parent')} not classified")


        # for file in self.files:
        #     content = HeleperFunction.load_java(file)
        #     core = ParsingUtility.extract_core(self.parsing, content)

        #     # Feature 
        #     if core.get("class") in self.feature_set:
        #         continue

        #     elif core.get("class") in self.timesliceproperty_set:
        #         continue

        #     elif core.get("class") in self.timeslice_set:
        #         if (self.views["feature"].get(core.get("class").replace("TimeSlice", "")) is not None):
        #             timeslice = self.views["feature"].get(core.get("class").replace("TimeSlice", ""))
        #             self.process_time_slice(timeslice, content)
        #             continue
        #         else:
        #             raise Exception(f"Timeslice {core.get('class')} does not have a corresponding feature class")
                                                
        #     # Object
        #     elif core.get("class") in self.object_set or core.get("parent") in self.object_set:
        #         continue

        #     elif core.get("class") in self.property_set and core.get("parent") == "AbstractAIXMPropertyType":
        #         continue

        #     # Links
        #     elif core.get("class") in self.property_set or core.get("class").replace("PropertyType", "Type") in self.feature_set and core.get("parent") is None:
        #         continue


        #     # Extension
        #     elif core.get("class") in self.object_set:
        #         continue

        #     elif core.get("class") in self.object_extension_set:
        #         continue

        #     elif core.get("class") in self.timeslice_extension_set:
        #         continue


        #     # Basetype
        #     elif core.get("class") in self.basetype_set:
        #         continue

        #     elif core.get("class") in self.type_set:
        #         continue

        #     elif core.get("class") in self.ignore_set:
        #         continue

        #     elif core.get("class") in self.abstract_set:
        #         continue

        #     elif core.get("parent") in self.abstract_set:
        #         continue
        
        #     else :
        #         print(f"Class {core.get('class')} {core.get('parent')} not classified")

        # for feature in self.views["feature"].values():
        #     feature.generate_sql()

        # for feature in self.views["feature"].values() :
        #     if feature.get_name() == "airport_heliport.airportheliport_view":
        #         print(feature.get_sql())

    # def __init__(self, name, parsing, input_path, output_path, directory,):
    #     self.name = name
    #     # Attribute
    #     self.association_attr = GenericHeleperFunction.load_json(input_path, "association.json")
    #     self.qlr_attr = GenericHeleperFunction.load_json(input_path, "qlr.json")
    #     self.inheritance_attr = GenericHeleperFunction.load_json(input_path, "inheritance.json")
    #     self.formated_sql = GenericHeleperFunction.load_json(input_path, "sql.json")
    #     self.ignore_set = set(self.inheritance_attr["ignore"])
    #     self.parsing = Parsing(parsing, self.inheritance_attr, self.formated_sql, self.association_attr, self.qlr_attr,  input_path)
    #     self.files = self.get_file_path(directory)
    #     self.layers = self.get_layers()
    #     self.export_sql(output_path, "postgres/view.sql")
    
    def classify_file(self, path):
        content = HeleperFunction.load_java(path)
        core =  ParsingUtility.extract_core(self.parsing, content)

        # files are either in: 
        # - Feature
        # - Object
            
        if class_name in self.feature_set :
            self.feature[class_name] = Feature(self.input_path, class_name, schema_name)
        
        # elif parent_name in self.property_parent_set:
        #     if class_name in self.formated_sql:
        #         self.property[class_name] = Property(self.input_path, class_name, schema_name, True)  
        #         self.property[class_name].load_sql(self.formated_sql[class_name].get("path"))
        #         self.property[class_name].load_dependecy(self.formated_sql[class_name].get("dependency"))

        #     if class_name not in self.property.keys() : 
        #         self.property[class_name] = Property(self.input_path, class_name, schema_name)

        # else :

        #     self.assosication[class_name] = {
        #         "schema" : schema_name,
        #         "table" : table_name
        #     }

            
    def export_sql(self, output_path):
        res = ""
        for key in self.views.keys():
            res += "--" + key + "\n\n"
            for feature in self.views[key].values():
                res += "--" + feature.get_view() + "\n\n"
                res += feature.get_sql() + "\n\n"
        
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
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    referenced_layer.get_schema(),
                    referenced_layer.get_name(),
                )

            elif prop_type in ["AIXMPointPropertyType", "AIXMElevatedPointPropertyType", "AIXMCurvePropertyType", "AIXMElevatedCurvePropertyType", "AIXMSurfacePropertyType", "AIXMElevatedSurfacePropertyType"]:
                continue

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
                    item.get("role"),
                    item.get("schema"),
                    item.get("join"),
                    item.get("column"),
                    item.get("revcolumn"),
                    referenced_layer.get_schema(),
                    referenced_layer.get_name(),
                )

            elif prop_type in ["AIXMPointPropertyType", "AIXMElevatedPointPropertyType", "AIXMCurvePropertyType", "AIXMElevatedCurvePropertyType", "AIXMSurfacePropertyType", "AIXMElevatedSurfacePropertyType"]:
                continue

            else:
                print("Missing 1:N match:", item)

            
        #     elif type in self.formated_sql:
        #         schema = self.formated_sql[type].get("schema")
        #         attribute = self.formated_sql[type].get("one").get("attribute")
        #         group = self.formated_sql[type].get("one").get("group")
        #         publish = self.qlr_attr[type].get("one")
        #         layer.add_association_snowflake_one(schema, type, publish, attribute, item.get("col"), item.get("role"))
                        
            # elif type in self.property.keys():
            #     schema = self.property[type].get_schema()
            #     layer.add_association_object_one(schema, type, item.get("role"),item.get("col"))
            
        #     elif type.replace("Property","") in self.feature.keys():
        #         renamed_type = type.replace("Property","")
        #         schema = self.feature[renamed_type].get_schema()
        #         layer.add_association_feature_one(schema, type, item.get("role"),item.get("col"))

        #     elif type in self.feature_association_set.keys():
        #         schema = self.assosication[type].get("schema")
        #         ref_types = self.feature_association_set[type].get("type")
        #         layer.add_association_feature_one(schema, type, item.get("role"), item.get("col"), ref_types)
            
        #     else : 
        #         raise ValueError(f"[ERROR] {layer.get_type()} {type} can not be found in property, feature, snowflake, ignore:")

        # for item in ParsingUtility().extract_one_to_many(content):
        #     type = item.get("type")

        #     if type in self.ignore_set:
        #         pass
            
        #     elif type in self.formated_sql:
        #         schema = self.formated_sql[type].get("schema")
        #         argument = self.formated_sql[type].get("many").get("argument")
        #         attribute = self.formated_sql[type].get("many").get("attribute")
        #         publish = self.qlr_attr[type].get("many")
        #         layer.add_association_snowflake_many(schema, type, publish, argument, attribute, item.get("col"), item.get("role"))
                        
        #     elif type in self.property.keys():
        #         schema = self.property[type].get_schema()
        #         layer.add_association_object_many(schema, type, item.get("role"))
            
        #     elif type.replace("Property","") in self.feature.keys():
        #         renamed_type = type.replace("Property","")
        #         schema = self.feature[renamed_type].get_schema()
        #         layer.add_association_feature_many(schema, type, item.get("role"))

        #     elif type in self.feature_association_set.keys():
        #         schema = self.assosication[type].get("schema")
        #         ref_types = self.feature_association_set[type].get("type")
        #         layer.add_association_feature_many(schema, type, item.get("role"), ref_types)
            
        #     else : 
        #         raise ValueError(f"[ERROR] {layer.get_type()} {type} can not be found in property, feature, snowflake, ignore:")