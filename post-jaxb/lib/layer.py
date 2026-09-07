import random
import string
from lxml import etree
import os
import uuid
import copy
from lib.helper_function import HeleperFunction

class View:

    def __init__(self, input_path, type, schema, aixm, snowflake=False):
        self.layer_type = None
        self.dependecy = set()
        self.type = type
        self.input_path = input_path
        self.name = HeleperFunction.remove_suffix(self.type)
        self.schema = schema
        self.snowflake = snowflake
        self.aixm = aixm
        self.view_sql = ""
        self.materialized_sql = ""
        self.publish = {
            }
        
        self.attributes = {
            "attributes": {
                "feature": self.generate_attributes(self.name, schema)
            },
            "view": self.generate_view(self.name, schema),
            "select": self.generate_select(self.name, schema),
            "inner": self.generate_inner(self.name, schema),
            "left": self.generate_left(self.name, schema),
            "lateral" : [],
            "where": self.generate_where(self.name, schema),
            "group": self.generate_group(self.name, schema),
            "order": self.generate_order(self.name, schema),
            "index" : [f"create index if not exists {self.schema}_{self.name}_hjid on {self.schema}.{self.name}_view (hjid)"]
        }

    def get_view(self):
        return f"{self.schema}.{self.name}_view"

    def get_schema(self):
        return repr(self.schema).strip("'\"")

    def get_name(self):
        return repr(self.name).strip("'\"")
    
    def get_view_sql(self):
        return self.view_sql

    def get_materialized_sql(self):
        return self.materialized_sql
    
    def get_dependecy(self): 
        return list(self.dependecy)
    
    def get_type(self):
        return self.type

    def get_layer_type(self):
        return self.layer_type
    
    def get_attributes(self):
        return self.attributes
    
    def generate_view_sql(self):
        # Combine attributes from all attribute types
        attributes = []
        for attr_list in self.attributes["attributes"].values():
            attributes.extend(attr_list)

        # Join SQL fragments with appropriate formatting
        view_sql = "\n".join(self.attributes["view"])
        select_sql = "\n".join(self.attributes["select"])
        attributes_sql = ",\n    ".join(attributes)
        inner_sql = "\n".join(self.attributes["inner"])
        left_sql = "\n".join(self.attributes["left"])
        lateral_sql = "\n".join(self.attributes["lateral"])
        where_clause = "where " + "\n  and ".join(self.attributes["where"]) if self.attributes["where"] else ""
        group_clause = "group by\n    " + ",\n    ".join(self.attributes["group"]) if self.attributes["group"] else ""
        order_clause = ", ".join(self.attributes["order"]) + ";"

        # Assemble final SQL
        sql_parts = [
            view_sql,
            select_sql,
            f"    {attributes_sql}" if attributes_sql else "",
            inner_sql,
            left_sql,
            lateral_sql,
            where_clause,
            # group_clause,
            order_clause
        ]
        self.view_sql = "\n".join(part for part in sql_parts if part.strip()) + ";"
    
    def generate_materialized_sql(self):
        # Combine attributes from all attribute types
        attributes = []
        for attr_list in self.attributes["attributes"].values():
            attributes.extend(attr_list)

        # Join SQL fragments with appropriate formatting
        materialized_sql = "\n".join(self.attributes["materialized"])
        select_sql = "\n".join(self.attributes["select"])
        attributes_sql = ",\n    ".join(attributes)
        inner_sql = "\n".join(self.attributes["inner"])
        left_sql = "\n".join(self.attributes["left"])
        lateral_sql = "\n".join(self.attributes["lateral"])
        where_clause = "where " + "\n  and ".join(self.attributes["where"]) if self.attributes["where"] else ""
        group_clause = "group by\n    " + ",\n    ".join(self.attributes["group"]) if self.attributes["group"] else ""
        order_clause = ", ".join(self.attributes["order"]) + ";"
        index_clause = ";\n".join(self.attributes["index"])

        # Assemble final SQL
        sql_parts = [
            materialized_sql,
            select_sql,
            f"    {attributes_sql}" if attributes_sql else "",
            inner_sql,
            left_sql,
            lateral_sql,
            where_clause,
            # group_clause,
            order_clause,
            index_clause
        ]
        self.materialized_sql = "\n".join(part for part in sql_parts if part.strip()) + ";"

    def load_sql(self, path):
        file_path = os.path.join(self.input_path, path)

        if not os.path.exists(file_path):
            raise FileNotFoundError(f"'{path}' not found at: {file_path}")

        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                raw_html = f.read()
            self.full_sql = raw_html
        except Exception as e:
            raise ValueError(f"Error loading HTML '{path}': {e}")

    def load_template(self, path):
        try:
            tree = ET.parse(path)
            root = tree.getroot()
            return root
        except ET.ParseError as e:
            print(f"[ERROR] XML parsing failed: {e}")
            return None
        except FileNotFoundError:
            print(f"[ERROR] File not found: {path}")
            return None

    def load_dependecy(self, list):
        self.dependecy.update(list)

    def generate_view(self, name, schema) : return []
    def generate_select(self, name, schema) : return []
    def generate_letter_hash(self, prefix, length=6):
        return prefix + '_' + ''.join(random.choices(string.ascii_lowercase, k=length))

    def generate_attributes(self, name, schema) : return []
    def generate_inner(self, name, schema) : return []
    def generate_left(self, name, schema) : return []
    def generate_where(self, name, schema) : return []
    def generate_order(self, name, schema) : return []
    def generate_group(self, name, schema) : return []
    def add_group(self, name, column, group=None):
        if group:
            self.attributes["group"].append(f"{group}.{name}.{column}")
        else:
            self.attributes["group"].append(f"{name}.{column}")

    def add_attributes_three(self,type, value, uom, nil) : pass
    def add_attributes_two(self, type, value, nil) : pass
    def add_association_feature_one(self, schema, name, role, col) : pass
    def add_association_object_one(self, schema, name, role, type) : pass
    def add_association_feature_many(self, schema, name, role, type) : pass
    def add_association_object_many(self, schema, name, role, type) : pass
    def add_association_snowflake_one(self, schema, name, role, type) : pass
    def add_association_snowflake_many(self, schema, name, role, type) : pass
    def publish_handler(self, schema, name, role, full_name, publish_param):
        if publish_param.get("geometrytype"):
            self.publish["geometry"].append({
                "geometrytype" : publish_param.get("geometrytype")[0], # TODO why did i make them a list ?
                "role" : role,
                "fullname" : full_name,
            })

            self.attributes["index"].append(f"create index if not exists {self.schema}_{self.name}_{role}_gist on {self.schema}.{self.name}_view using GIST ({role}_geom)")