import re
import json
from collections import defaultdict, deque
from lib.feature import Feature
from lib.object import Object
from lib.helper_function import HeleperFunction

class ParsingUtility:

    parsing = {}

    @staticmethod
    def set_parsing(parsing):
        ParsingUtility.parsing = parsing


    @staticmethod
    def extract_core(content):
        class_name = re.findall(ParsingUtility.parsing["class"]["method"].strip(), content) or [None]
        parent_name = re.findall(ParsingUtility.parsing["extends"]["method"].strip(), content) or [None]
        table_name = re.search(ParsingUtility.parsing["table"]["method"].strip(), content) or None
        table_schema = None

        if table_name :
            table_name, table_schema = table_name.groups()
        
        if class_name :
            class_name = class_name[0]

        else : 
            raise ValueError(f"[ERROR] parsing class name: {content}")
        
        if parent_name :
            parent_name = parent_name[0]
        
        res = {
            "class" : class_name,
            "table" : table_name,
            "parent": parent_name,
            "schema": table_schema
        }
        
        return res

    @staticmethod
    def extract_columns(parsing, schema, table, content):
        """Extract simple column definitions."""
        raw_columns = re.findall(parsing["column"]["method"], content) or [None]
        return [f"{schema}.{table}.{column}" for column in raw_columns]
    
    # @staticmethod
    # def extract_parent_columns(schema, table, parent_name):
    #     """Extract inherited columns from parent classes."""
    #     parent_columns = self.attributes["parents_attributes"].get(parent_name[0], [])
    #     return [f"{schema}.{table}.{col}" for col in parent_columns]

    @staticmethod
    def extract_embedded_columns_two(parsing, content):
        """Extract embedded attributes (2 columns)."""
        embedded_columns = []
        raw_embedded_two = re.findall(parsing["embedded_two"]["method"], content)
        for column in raw_embedded_two:
            value, nil, type, role = column[0], column[1], column[2], column[3]
            embedded_columns.append({
                "value" : value,
                "nil" : nil,
                "type" : type,
                "role" : role.lower()
            })

        return embedded_columns
    
    @staticmethod
    def extract_embedded_columns_three(parsing, content):
        """Extract embedded attributes (3 columns)."""
        embedded_columns = []
        raw_embedded_three = re.findall(parsing["embedded_three"]["method"], content)
        for column in raw_embedded_three:
            value, uom, nil, type, role = column[0], column[1], column[2], column[3], column[4]
            embedded_columns.append({
                "value" : value,
                "uom" : uom,
                "nil" : nil,
                "type" : type,
                "role" : role.lower()
            })
 
        return embedded_columns

    @staticmethod
    def extract_embedded_columns_four(parsing, content):
        """Extract embedded attributes (4 columns)."""
        embedded_columns = []
        raw_embedded_three = re.findall(parsing["embedded_four"]["method"], content)
        for column in raw_embedded_three:
            value, uom, accuracy, nil, type, role = column[0], column[1], column[2], column[3], column[4], column[5]
            embedded_columns.append({
                "value" : value,
                "uom" : uom,
                "accuracy": accuracy,
                "nil" : nil,
                "type" : type,
                "role" : role.lower()
            })
 
        return embedded_columns

    @staticmethod
    def extract_one_to_many(parsing, content):
        """Extract one-to-many relationships."""
        res = []
        raw_one_to_one = re.findall(parsing["one_to_one"]["method"], content)
        for column in raw_one_to_one:
            join_table, schema, join_column, invers_join_column, type, role = column[0], column[1], column[2], column[3], column[4], column[5]
            res.append({
                "table" :   f"{schema}.{join_table}",
                "column" :  f"{schema}.{join_table}.{join_column}",
                "invers" :  f"{schema}.{join_table}.{invers_join_column}",
                "type" : type,
                "role" : role.lower()
            })

        return res


    @staticmethod
    def extract_columns(schema, table, content):
        """Extract simple column definitions."""
        raw_columns = re.findall(ParsingUtility.parsing["column"]["method"], content)
        return [f"{schema}.{table}.{col}" for col in raw_columns]

    @staticmethod
    def extract_parent_columns(schema, table, parent_name):
        """Extract inherited columns from parent classes."""
        parent_columns = self.attributes["parents_attributes"].get(parent_name[0], [])
        return [f"{schema}.{table}.{col}" for col in parent_columns]

    def extract_embedded_columns_two(self, content):
        """Extract embedded attributes (2 columns)."""
        embedded_columns = []
        raw_embedded_two = re.findall(ParsingUtility.parsing["embedded_two"]["method"], content)
        for column in raw_embedded_two:
            value, nil, type, role = column[0], column[1], column[2], column[3]
            embedded_columns.append({
                "value" : value,
                "nil" : nil,
                "type" : type,
                "role" : role.lower()
            })

        return embedded_columns
    
    def extract_embedded_columns_three(self, content):
        """Extract embedded attributes (3 columns)."""
        embedded_columns = []
        raw_embedded_three = re.findall(ParsingUtility.parsing["embedded_three"]["method"], content)
        for column in raw_embedded_three:
            value, uom, nil, type, role = column[0], column[1], column[2], column[3], column[4]
            embedded_columns.append({
                "value" : value,
                "uom" : uom,
                "nil" : nil,
                "type" : type,
                "role" : role.lower()
            })
 
        return embedded_columns

    def extract_embedded_columns_four(self, content):
        """Extract embedded attributes (4 columns)."""
        embedded_columns = []
        raw_embedded_three = re.findall(ParsingUtility.parsing["embedded_four"]["method"], content)
        for column in raw_embedded_three:
            value, uom, accuracy, nil, type, role = column[0], column[1], column[2], column[3], column[4], column[5]
            embedded_columns.append({
                "value" : value,
                "uom" : uom,
                "accuracy": accuracy,
                "nil" : nil,
                "type" : type,
                "role" : role.lower()
            })
 
        return embedded_columns

    def extract_one_to_one(self, content):
        """Extract one-to-one relationships."""
        res = []
        raw_one_to_one = re.findall(ParsingUtility.parsing["one_to_one"]["method"], content)
        for column in raw_one_to_one:
            clean = [
                c.strip("{}'\" \t\n") if isinstance(c, str) else c for c in column
            ]

            raw_role = clean[5]
            role_val = raw_role.replace("get", "").replace("Item", "")
            role_val = re.sub(r"([a-z0-9])([A-Z])", r"\1_\2", role_val)
            role_val = re.sub(r"([A-Z]+)([A-Z][a-z])", r"\1_\2", role_val).lower()

            res.append({
                "join":     str(clean[0]),
                "schema":   str(clean[1]),
                "column":   str(clean[2]),
                "revcolumn":str(clean[3]),
                "type":     str(clean[4]),
                "role":     str(role_val),
            })

        return res

    def extract_one_to_many(self, content):
        """Extract one-to-many relationships."""
        res = []
        raw_one_to_one = re.findall(ParsingUtility.parsing["one_to_many"]["method"], content)
        for column in raw_one_to_one:
            clean = [
                c.strip("{}'\" \t\n") if isinstance(c, str) else c for c in column
            ]

            raw_role = clean[5]
            role_val = raw_role.replace("get", "").replace("Item", "")
            role_val = re.sub(r"([a-z0-9])([A-Z])", r"\1_\2", role_val)
            role_val = re.sub(r"([A-Z]+)([A-Z][a-z])", r"\1_\2", role_val).lower()

            res.append({
                "join":     str(clean[0]),
                "schema":   str(clean[1]),
                "column":   str(clean[2]),
                "revcolumn":str(clean[3]),
                "type":     str(clean[4]),
                "role":     str(role_val),
            })
        return res