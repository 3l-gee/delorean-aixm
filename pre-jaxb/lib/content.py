from typing import List, Dict, Optional
from dataclasses import dataclass, field
import json
import yaml
import re
import os
from datetime import datetime

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
    postgresql_domain_type_check: Dict[str, str] = {
        "nilreason": """CREATE DOMAIN public.nilreason AS TEXT CHECK (VALUE ~ '^(inapplicable|missing|template|unknown|withheld|other:.+)$');"""
    }

    postgresql_domain_type_checkless: Dict[str, str] = {
        "nilreason": """CREATE DOMAIN public.nilreason AS TEXT;"""
    }

    postgresql_comments: Dict[str, str] = {
        "nilreason" : "COMMENT ON DOMAIN public.nilreason IS 'Generated from XSD : GML 3.2 http://www.opengis.net/gml/3.2:NilReasonEnumeration';"
    }

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
        print("[INFO] Total Postgres Domain Types generated:", len(Content.postgresql_domain_type_check))


    @staticmethod
    def get_content() -> dict:
        return Content().content
    
    @staticmethod
    def get_xsd() -> Dict[str, Xsd]:
        return Content().xsd
    
    @staticmethod
    def get_transposition(type) -> dict:
        if ":" in type:
            type = type.split(":", 1)[-1]

        output = {}
        for key, value in Content().content.items():
            output = output | value["simple_type"]["transposition"]

        return output.get(type)
    
    @staticmethod
    def save_transposition() -> None:
        output = {}
        for key, value in Content().content.items():
            transposition = value.get("simple_type", {}).get("transposition", {})
            output |= transposition
        
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        filename = f"transposition_{timestamp}.json"

        try:
            with open(filename, 'w', encoding='utf-8') as fp:
                json.dump(output, fp, indent=4, sort_keys=True)
            print(f"Successfully exported to: {os.path.abspath(filename)}")
        except IOError as e:
            print(f"Failed to write file: {e}")
    
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

        for original_xsd_name, element in transposition.items() : 
            db_domain_name = Config.generate_database_name(original_xsd_name)
            ddl_sql_check = Content._generate_postgres_type_check(db_domain_name, element)
            Content.postgresql_domain_type_check[db_domain_name] = ddl_sql_check

            ddl_sql_checkless = Content._generate_postgres_type_checkless(db_domain_name, element)
            Content.postgresql_domain_type_checkless[db_domain_name] = ddl_sql_checkless

            Content.postgresql_comments[db_domain_name] = (
                f"COMMENT ON DOMAIN public.{db_domain_name} IS 'Generated from XSD : {original_xsd_name}';"
            )

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

    @staticmethod
    def _generate_postgres_type_checkless(type_name: str, transposition: dict) -> str:
        """
        Generates a PostgreSQL CREATE DOMAIN statement handling both 
        textual and non-textual (numeric, boolean, temporal) XSD simple types without check constraints
        """
        uber = transposition.get("uber") or transposition.get("base", "string")
        enum_values = transposition.get("enum")
        max_len = transposition.get("maxLength")
        min_len = transposition.get("minLength")
        pattern = transposition.get("pattern")
        
        # Numeric restrictions
        min_inclusive = transposition.get("minInclusive")
        max_inclusive = transposition.get("maxInclusive")
        min_exclusive = transposition.get("minExclusive")
        max_exclusive = transposition.get("maxExclusive")

        # 1. Resolve PostgreSQL Base Type
        raw_pg_type = Config().XSD_TO_PG_TYPES.get(uber, "TEXT")
        
        if max_len and raw_pg_type == "TEXT":
            base_pg_type = f"VARCHAR({max_len})"
        else:
            base_pg_type = raw_pg_type

        # 2. Build DDL
        ddl = f"CREATE DOMAIN public.{type_name} AS {base_pg_type};"

        return ddl

    @staticmethod
    def _generate_postgres_type_check(type_name: str, transposition: dict) -> str:
        """
        Generates a PostgreSQL CREATE DOMAIN statement handling both 
        textual and non-textual (numeric, boolean, temporal) XSD simple types with check constraints
        """
        uber = transposition.get("uber") or transposition.get("base", "string")
        enum_values = transposition.get("enum")
        max_len = transposition.get("maxLength")
        min_len = transposition.get("minLength")
        pattern = transposition.get("pattern")
        
        # Numeric restrictions
        min_inclusive = transposition.get("minInclusive")
        max_inclusive = transposition.get("maxInclusive")
        min_exclusive = transposition.get("minExclusive")
        max_exclusive = transposition.get("maxExclusive")

        # 1. Resolve PostgreSQL Base Type
        raw_pg_type = Config().XSD_TO_PG_TYPES.get(uber, "TEXT")
        
        if max_len and raw_pg_type == "TEXT":
            base_pg_type = f"VARCHAR({max_len})"
        else:
            base_pg_type = raw_pg_type

        is_string_type = raw_pg_type in ("TEXT", "VARCHAR")
        constraints = []

        # 2. String Length Constraints
        if is_string_type:
            if min_len is not None:
                constraints.append(f"LENGTH(VALUE) >= {min_len}")
            if max_len is not None and not base_pg_type.startswith("VARCHAR"):
                constraints.append(f"LENGTH(VALUE) <= {max_len}")

        # 3. Numeric Range Constraints
        if min_inclusive is not None:
            constraints.append(f"VALUE >= {min_inclusive}")
        if max_inclusive is not None:
            constraints.append(f"VALUE <= {max_inclusive}")
        if min_exclusive is not None:
            constraints.append(f"VALUE > {min_exclusive}")
        if max_exclusive is not None:
            constraints.append(f"VALUE < {max_exclusive}")

        # Auto-add implicit XSD unsigned constraints if not explicitly provided
        if uber in ("unsignedInt", "nonNegativeInteger") and min_inclusive is None and min_exclusive is None:
            constraints.append("VALUE >= 0")
        elif uber == "positiveInteger" and min_inclusive is None and min_exclusive is None:
            constraints.append("VALUE > 0")

        # 4. Enum OR Pattern Constraints
        if enum_values:
            literals = []
            regexes = None

            for item in enum_values:
                item_str = str(item)
                if item_str.startswith("OTHER(") or item_str.startswith("OTHER:"):
                    if regexes is not None : 
                        raise ValueError("PostgreSQL can only handle one mix of enums and regular expressions. The regular expression should be rewritten to encapsulate both.")
                    regexes = (item_str)
                else:
                    literals.append(item_str)

            enum_parts = []

            if literals:
                if is_string_type:
                    quoted = ", ".join("'{}'".format(lit.replace("'", "''")) for lit in literals)
                    enum_parts.append(f"VALUE IN ({quoted})")
                else:
                    plain = ", ".join(literals)
                    enum_parts.append(f"VALUE IN ({plain})")

            if regexes:
                clean_regex = regexes.replace("\\\\", "\\").replace("'", "''")
                value_expr = "VALUE" if is_string_type else "VALUE::text"
                enum_parts.append(f"{value_expr} ~ '^{clean_regex}$'")

            if enum_parts:
                constraints.append("(" + " OR ".join(enum_parts) + ")")


        elif pattern:
            clean_pattern = pattern.replace("\\\\", "\\").replace("'", "''")
            clean_pattern = clean_pattern.replace(r"\d", "[0-9]")
            clean_pattern = clean_pattern.replace(r"\w", "[A-Za-z0-9_]")
            clean_pattern = clean_pattern.replace(r"\s", " ")
            value_expr = "VALUE" if is_string_type else "VALUE::text"
            
            # 1. Strip existing anchors if present to prevent doubling up (^...$)
            if clean_pattern.startswith("^") and clean_pattern.endswith("$"):
                clean_pattern = clean_pattern[1:-1]
            elif clean_pattern.startswith("^"):
                clean_pattern = clean_pattern[1:]
            elif clean_pattern.endswith("$"):
                clean_pattern = clean_pattern[:-1]

            sql_pattern = clean_pattern.replace("'", "''")
            constraints.append(f"{value_expr} ~ '^({sql_pattern})$'")

        # 5. Build DDL
        ddl = f"CREATE DOMAIN public.{type_name} AS {base_pg_type}"
        if constraints:
            check_clause = " AND ".join(constraints)
            ddl += f" CHECK ({check_clause});"
        else:
            ddl += ";"

        return ddl
    
    