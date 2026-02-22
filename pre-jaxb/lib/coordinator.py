from enum import Enum
import xml.etree.ElementTree as ET
from lxml import etree
from typing import List
import os
import json

from .content import Content
from .simple_type import SimpleType
from .complex_type import ComplexType
from .group_type import GroupType
from .annotation import Jaxb
from .xsd import Xsd
from .schema import Schema
from .config import Config

class Coordinator:
    def __init__(self, schema_path: str, config_path: str, content_path: str, verbose: bool = False): 
        
        Schema(schema_path, verbose=verbose)
        Config(config_path, verbose=verbose)
        Content(content_path, verbose=verbose)
        self.xsds = []
        self.xjb = {}

    def export_file(self, file_path, content) -> None:
        with open(file_path, 'w') as f:
            f.write(json.dumps(content, indent=4))
        
    def generate_xjb(self, verbose: bool = False) -> None:
        for key, value in Content.get_content().items() :
            self.xjb[key]["auto"]["default"].extend(
                SimpleType.generate_simple_types(value["simple_type"]["type"], value["simple_type"]["graph"]))
                        
        for key, value in Content.get_content().items() :
            self.xjb[key]["auto"]["default"].extend(
                ComplexType.generate_complex_types(value["complex_type"]["type"]))
                        
        for key, value in Content.get_content().items() :
            self.xjb[key]["auto"]["default"].extend(
                GroupType.generate_groupe_types(value["group"]["type"]))

    def initialize_xjb(self, verbose: bool = False) -> None:
        print("[INFO] Initializing XJB structure")
        res = {}
        for key, xsd in Content().get_xsd().items():
            start_annotations = [
                Jaxb.schema(xsd.name + ".xsd")
            ]
            if xsd.package is not None:
                start_annotations += [
                    Jaxb.binding_start,
                    Jaxb.package(xsd.package),
                    Jaxb.binding_end,
                ]
            
            res[xsd.name] = {
                "start": start_annotations,
                "manual": {"default": self._init_manual(xsd.manual)},
                "auto": {"default": []},
                "end": [Jaxb.end]
            }

        print("[INFO] XJB structure initialized : ", list(res.keys()))
        self.xjb = res
    
    def _init_manual(self, file_path) -> List[str]:
        main = etree.XMLParser(remove_blank_text=True, huge_tree=True)
        tree = etree.parse(file_path, main)
        root = tree.getroot()
        bindings = root.findall(".//jaxb:bindings", namespaces=root.nsmap)
        binding_names = [f"'{binding.get('node')}'" for binding in bindings]

        isContent = False
        bindingsCounter = 0
        res = []
        with open(file_path, 'r') as file :
            for line in file :
                if isContent:
                    res.append(line.replace("\n", ""))

                if '<jaxb:bindings node="manual">' in line:
                    isContent = True

                if '<jaxb:bindings' in line:
                    bindingsCounter += 1

                if '</jaxb:bindings' in line:
                    bindingsCounter -= 1
                    if isContent and bindingsCounter == 2:
                        return res[:-1]
        return res[:-1]

    def export_xjb(self, verbose: bool = False) -> None:
        os.makedirs(os.path.dirname(Config().get_output_path()), exist_ok=True)
        with open(Config().get_output_path(), 'w') as f:
            f.write(Jaxb.start)
            for xjb in self.xjb:
                for annotation in self.xjb[xjb]["start"]:
                    f.write(annotation + "\n")

                f.write("<!-- section : manual -->" + "\n")

                for key, value in self.xjb[xjb]["manual"].items():
                    f.write("<!-- part : " + key  + " -->"  + "\n")
                    for annotation in value:
                        f.write(annotation  + "\n")

                f.write("<!-- section : auto -->" + "\n")

                for key, value in self.xjb[xjb]["auto"].items():
                    f.write("<!-- part : " + key + " -->"  + "\n")
                    for annotation in value:
                        f.write(annotation + "\n")

                for annotation in self.xjb[xjb]["end"]:
                    f.write(annotation + "\n")

            f.write(Jaxb.end)

        self.format_xml(Config().get_output_path())

    def format_xml(self, file_path) -> None:
        main = etree.XMLParser(remove_blank_text=True, huge_tree=True)
        tree = etree.parse(file_path, main)

        tree.write(file_path, pretty_print=True, encoding='utf-8', xml_declaration=True)

    def save_entity_class(self) -> None:
        sorted_entities = sorted(
            Content().entity,
            key=lambda x: (not x.startswith("Message"), not x.startswith("Abstract"), x)
        )
        filename = f"{Config().version}_entities.txt"
        with open(filename, "w", encoding="utf-8") as f:
            for entity in sorted_entities:
                f.write(f"com.aixm.delorean.XXXX.schema.{entity}.class,\n")

        print("[INFO] Entities exported : " + filename)
