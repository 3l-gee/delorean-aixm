from dataclasses import dataclass, field
from typing import List, Dict, Optional
import xml.etree.ElementTree as ET
from .annotation import Tag
from .struct import SchemaSection, Strategy



class Xsd: 
    def __init__(self, section: SchemaSection):
        self.name: str = section.name
        self.package: Optional[str] = section.package
        self.path: str = section.path
        self.strategy: Strategy = Strategy[section.strategy.lower()]
        self.manual: Optional[str] = section.manual
        
        self.root = ET.parse(self.path).getroot()
        self.namespaces = self.get_namespaces()

        self.elements = self.root.findall(Tag.element, self.namespaces) or []
        self.groups = self.root.findall(Tag.group, self.namespaces) or []
        self.attributes = self.root.findall(Tag.attribute, self.namespaces) or []
        self.extension = self.root.findall(Tag.extension, self.namespaces) or []
        self.simple_type = self.root.findall(Tag.simple_type, self.namespaces) or []
        self.complex_type = self.root.findall(Tag.complex_type, self.namespaces) or []

        self._inline_group_refs()

    def get_elements(self)-> List[ET.Element]:
        return self.elements
    
    def get_groups(self) -> List[ET.Element]:
        return self.groups
        
    def get_attributes(self) -> List[ET.Element]:
        return self.attributes

    def get_extension(self) -> List[ET.Element]:
        return self.extension
    
    def get_simple_type(self) -> List[ET.Element]:
        return self.simple_type
        
    def get_complex_type(self) -> List[ET.Element]:
        return self.complex_type
    
    def get_namespaces(self) -> Dict[str, str]:
        namespaces = dict([
            node for _, node in ET.iterparse(self.path, events=['start-ns'])
        ])
        return namespaces
    
    def _build_group_map(self) -> Dict[str, ET.Element]:
        group_map = {}

        for group in self.groups:
            name = group.attrib.get("name")
            if not name:
                continue

            # A group may contain sequence, choice, or all
            for child in list(group):
                tag = child.tag.split("}")[-1]
                if tag in ("sequence", "choice", "all"):
                    group_map[name] = child
                    break

        return group_map
    
    def _inline_group_refs(self):
        group_map = self._build_group_map()
        changed = True

        while changed:  # loop handles nested groups
            changed = False

            for parent in self.root.iter():
                children = list(parent)

                for i, child in enumerate(children):
                    tag = child.tag.split("}")[-1]
                    if tag != "group":
                        continue

                    ref = child.attrib.get("ref")
                    if not ref:
                        continue

                    ref_name = ref.split(":")[-1]
                    group_def = group_map.get(ref_name)
                    if group_def is None:
                        continue

                    # Insert copies of group children
                    insert_pos = i
                    for sub in list(group_def):
                        parent.insert(insert_pos, ET.fromstring(ET.tostring(sub)))
                        insert_pos += 1

                    parent.remove(child)
                    changed = True
                    break  # restart scan because tree changed

                if changed:
                    break