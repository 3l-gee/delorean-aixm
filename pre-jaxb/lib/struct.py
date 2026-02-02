from enum import Enum
from dataclasses import dataclass, field
from typing import List, Dict, Optional

class Strategy(Enum):
    abstract = "abstract"
    feature = "feature"
    data_type = "data_type"
    other = "other"
    debug = "debug"

@dataclass
class SchemaSection:
    name: str
    path: str
    strategy: str
    manual: Optional[str] = None
    package: Optional[str] = None

@dataclass
class MappingSection:
    replace: Optional[str]
    prefix: Optional[str]
    xpath: Optional[str]
    list: List[str]

@dataclass
class ConfigModel:
    version: str
    output_path: str

    feature: SchemaSection
    datatype: SchemaSection
    abstract: SchemaSection
    message: SchemaSection

    ignore: List[str] 
    transient: List[str]
    embed: List[str]
    abstractgml: List[str]

    feature: MappingSection
    timesliceproperty: MappingSection
    timeslice: MappingSection
    property: MappingSection
    object: MappingSection
    extension: MappingSection