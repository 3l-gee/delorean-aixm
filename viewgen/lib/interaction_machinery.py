import os
from os import path
import re
import yaml
from lib.parsing_utility import ParsingUtility
from lib.helper_function import HeleperFunction
from lib.feature import Feature
from lib.property import Property
from lib.helper_function import HeleperFunction
import copy


class InteractionMachinery:
    JAXB_IGNORE_FILES = {
        "package-info.java",
        "ObjectFactory.java"
    }

    def __init__(self, parsing_path: str, config_path: str, output_path: str, directory_path: str):
        config = HeleperFunction.load_yaml(config_path)
        self.parsing = HeleperFunction.load_yaml(parsing_path)
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
        self.files = HeleperFunction.get_file_path(directory_path, ".java", self.JAXB_IGNORE_FILES)
        self.views = {"feature": {}, "object": {}, "property": {}}

        for file in self.files:
            content = HeleperFunction.load_java(file)
            core = ParsingUtility.extract_core(self.parsing, content)

            if core.get("class") in self.feature_set:
                self.views["feature"][core.get("class")] = Feature(core.get("class"), core.get("schema"))
                continue

            elif core.get("class").replace("PropertyType", "Type") in self.feature_set:
                self.views["feature"][core.get("class")] = Feature(core.get("class"), core.get("schema"))
                continue

            elif core.get("class") in self.property_set or core.get("parent") in self.property_set:
                # self.views["property"][core.get("class")] = Property(core.get("class"), core.get("schema"))
                # self.property[class_name] = Property(self.input_path, class_name, schema_name, True)  
                # self.property[class_name].load_sql(self.formated_sql[class_name].get("path"))
                # self.property[class_name].load_dependecy(self.formated_sql[class_name].get("dependency"))ontinue
                continue


            elif core.get("class") in self.object_set or core.get("parent") in self.object_set:
                continue

            elif core.get("class").replace("ExtensionType", "Type") in self.object_set:
                continue

            elif core.get("class") in self.timesliceproperty_set:
                continue

            elif core.get("class") in self.timeslice_set:
                continue

            elif core.get("class") in self.timeslice_extension_set:
                continue

            elif core.get("class") in self.object_extension_set:
                continue

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


        for file in self.files:
            content = HeleperFunction.load_java(file)
            core = ParsingUtility.extract_core(self.parsing, content)
            if core.get("class") in self.feature_set:
                continue

            elif core.get("class").replace("PropertyType", "Type") in self.feature_set:
                continue

            elif core.get("class") in self.property_set or core.get("parent") in self.property_set:
                continue

            elif core.get("parent") in self.property_set:
                continue

            elif core.get("class") in self.object_set or core.get("parent") in self.object_set:
                continue

            elif core.get("parent") in self.object_set:
                continue

            elif core.get("class").replace("ExtensionType", "Type") in self.object_set:
                continue

            elif core.get("class") in self.timesliceproperty_set:
                continue

            elif core.get("class") in self.timeslice_set:
                continue

            elif core.get("class") in self.extension_set or core.get("parent") in self.extension_set:
                continue

            elif core.get("parent") in self.extension_set:
                continue

            elif core.get("class") in self.basetype_set:
                continue

            elif core.get("class") in self.type_set:
                continue

            elif core.get("class") in self.ignore_set:
                continue

            elif core.get("parent") in self.ignore_set:
                continue

            elif core.get("class") in self.abstract_set:
                continue

            elif core.get("parent") in self.abstract_set:
                continue
        
            else :
                print(f"Class {core.get('class')} {core.get('parent')} not classified")

        for feature in self.views["feature"].values():
            feature.generate_sql()

        for feature in self.views["feature"].values() :
            print(feature.get_sql())

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

            
    def export_sql(self, output_path, name):
        file_path = os.path.join(output_path, name)

        res = ""
        for layer, deps in self.layers.values():
            res += f"-- {layer.get_type()}\n" + f"-- {deps}\n" + layer.get_sql() + "\n"
        
        with open(file_path, "w", encoding="utf-8") as f:
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
