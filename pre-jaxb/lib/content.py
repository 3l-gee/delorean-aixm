from typing import List, Dict, Optional
from dataclasses import dataclass, field
import json
import yaml
import re

from .struct import SchemaSection, Strategy
from .xsd import Xsd
from .annotation import Tag, Util
from .config import Config

class SingletonMeta(type):
    _instances = {}

    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwargs)
            cls._instances[cls] = instance
        return cls._instances[cls]
    
    def reset_instance(cls):
        if cls in cls._instances:
            del cls._instances[cls]
    
class Content(metaclass=SingletonMeta): 
    def __init__(self, path: str, verbose: bool = False): 
        self.content: dict = {}
        self.entity: dict = {}

        with open(path, "r", encoding="utf-8") as f:
            data = yaml.safe_load(f)
            
        self.xsd: Dict[str, Xsd] = {}
        for section_key, section_values in data.get("xsd", {}).items():
            self.xsd[section_key] = Xsd(SchemaSection(**section_values))

        for title, xsd in self.xsd.items():
            simple_type_content = xsd.get_simple_type()
            inherit_graph = Content._build_inheritance_graph(simple_type_content)
            attrib_graph = Content._build_attribute_graph(xsd.get_complex_type())
            transposition = Content._build_transposition(simple_type_content, inherit_graph)
            if xsd.strategy == Strategy.data_type:
                Config().embedded = {**Config().embedded, **Content._extract_embedded(xsd.root, transposition)}

            self.content[xsd.name] = {
                "strategy" : xsd.strategy,
                "simple_type" : {
                    "type" : simple_type_content,
                    "graph" : {
                        "inheritance" : inherit_graph,
                        "attribute" : attrib_graph
                        },
                    "transposition" : transposition
                    },
                "complex_type" : {
                    "type" : xsd.get_complex_type(),
                    },
                "group" : {
                    "type" : xsd.get_groups(),
                }
            }
        
        print("[INFO] Content initialized, XSDs:", len(self.xsd.keys()))


    @staticmethod
    def get_content() -> dict:
        return Content().content
    
    @staticmethod
    def get_xsd() -> Dict[str, Xsd]:
        return Content().xsd
    
    @staticmethod
    def get_transposition(type) -> dict:
        output = {}
        for key, value in Content().content.items():
            output = output | value["simple_type"]["transposition"]

        return output.get(type)
    
    @staticmethod
    def save_transposition() -> None:
        output = {}
        for key, value in Content().content.items():
            output = output | value["simple_type"]["transposition"]

        with open('transposition.json.log', 'w') as fp:
            json.dump(output, fp, indent=4)
    
    @staticmethod
    def get_entity() -> dict:
        return Content().entity
    
    @classmethod
    def append_entity(cls, new_entity) -> None:
        cls().entity[new_entity] = {}

    @staticmethod
    def _build_inheritance_graph(xml_type_list: list) -> dict:
        res = {}
        for element in xml_type_list:
            base = element.findall(Tag.extension) or element.findall(Tag.restriction) or []
            if base != []:
                name = base[0].attrib["base"]
                try : 
                    name = name.split(":")[-1]
                except:
                    pass
                if name not in res : 
                    res[name] = [element.attrib["name"]]
                else :
                    res[name].append(element.attrib["name"])

        return res
    
    @staticmethod
    def _build_attribute_graph(xml_type_list: list) -> dict:
        res = {}
        for element in xml_type_list:
            attributes = element.findall(".//"+ Tag.attribute) or []
            if attributes != []:
                for attribute in attributes:
                    name = attribute.attrib.get("type", attribute.attrib.get("ref"))
                    try : 
                        name = name.split(":")[-1]
                    except:
                        pass
                    if name not in res : 
                        res[name] = [element.attrib["name"]]
                    else :
                        res[name].append(element.attrib["name"])

        return res

    @staticmethod
    def _build_transposition(type: list,  graph) -> dict:
        transposition = {}
        dict = {}
        for element in type:
            name = element.attrib["name"]
            constraints = Util.generate_constraints(element)
            transposition[name] = constraints

        for element in type:
            name = element.attrib["name"]
            constraints = transposition[name]
            if name in graph.keys():
                for sub_name in graph[name]:
                    transposition[sub_name] = {**transposition[sub_name], **transposition[name]}
    
        return transposition
    
    @staticmethod
    def _graph_traversal(element, name, graph, dict=None) -> dict:
        if dict is None:
            dict = {}

        if name in graph.keys():
           
            deep_dict = {}
            for item in graph[name]:
                deep_dict.update({item : Util.generate_constraints(element)})
                deep_dict.update(Content._graph_traversal(element, item, graph))
                
                dict.update(deep_dict)
        return dict
    
    @staticmethod
    def _export_file(file_path, content) -> None:
        with open(file_path, 'w') as f:
            f.write(json.dumps(content, indent=4))
    
    @staticmethod
    def _extract_embedded(root, transposition) -> dict:
        res = {}
        complexType = root.findall(Tag.complex_type) or []
        for element in complexType:
            name = element.attrib["name"]
            simple_content = element.find(Tag.simple_content)

            if simple_content is None:
                res[name] = {}
                continue

            base = simple_content.find(Tag.extension)
            base_name = base.attrib["base"]
            try : 
                base_name = base_name.split(":")[-1]
            except:
                pass
            res[name] = {"value" : transposition[base_name],}

            attributes = base.findall(Tag.attribute) or []
            for attribute in attributes:
                type = attribute.attrib.get("type", attribute.attrib.get("ref"))
                try : 
                    type = type.split(":")[-1]
                except:
                    pass
                res[name][attribute.attrib["name"]] = transposition.get(type, {})
            
        return res
    
    