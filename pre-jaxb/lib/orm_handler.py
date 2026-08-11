from platform import node
import re
import xml.etree.ElementTree as ET

from .schema import Schema
from .annotation import HyperJAXB
from .config import Config
from .content import Content

class OrmHandler: 

    def constraint_generator_column(constraints) -> dict:
        POSTGRES_VARCHAR_LIMIT = 4000

        if constraints is None:
            return []
        
        node = ["<!-- Embedable + orm -->"]

        type = Config.generate_database_name(constraints.get("type"))

        node.append(f'''<orm:column column-definition="{type}" />''')
        return node

    def constraint_generator_attribute_override(xsdType) -> dict:
        POSTGRES_VARCHAR_LIMIT = 4000

        constraints = Content().get_transposition(xsdType)
        if not constraints:
            return None
            # raise ValueError(f"No transposition found for XSD type '{xsdType}'")

        base_type = constraints.get("type")
        if not base_type:
            raise ValueError(
                f"Transposition for '{type}' is missing a 'type' entry: {constraints}"
            )

        type = Config.generate_database_name(constraints.get("type"))
        return f'''column-definition="{type}"'''

    @staticmethod
    def embeded_types(type, parent, element) -> dict:
        res = ["<!-- Embedded -->"]
        if "name" not in element.attrib:
            raise KeyError("Element must have a name attribute")
        name = element.attrib["name"]

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            raise KeyError("Embeded types cannot be collections")

        embeded_fields = Config().get_embed_by_type(type)
        base_type = type.replace("Type","BaseType")

        constraints = OrmHandler.constraint_generator_attribute_override(base_type)
        res.append(HyperJAXB.hj_embedded_start())
    
        for key, value in embeded_fields.items():

            if key == "value" : 
                type = value.get("type")
                constraints = OrmHandler.constraint_generator_attribute_override(type)
                res.append(HyperJAXB.attribute_override(key, str(name), constraints))

            elif key == "uom" : 
                type = value.get("type")
                constraints = OrmHandler.constraint_generator_attribute_override(type)
                res.append(HyperJAXB.attribute_override(key, str(name+  "_" + key), constraints))

            elif key == "accuracy" : 
                type = value.get("type")
                constraints = OrmHandler.constraint_generator_attribute_override(type)
                res.append(HyperJAXB.attribute_override(key, str(name+  "_" + key), constraints))

            # Todo : Lang still wonky somehow.
            # elif key == "lang" : 
            #     type = value.get("type")
            #     constraints = OrmHandler.constraint_generator_attribute_override(type)
            #     res.append(HyperJAXB.attribute_override(key, str(name+  "_" + key), constraints))

            elif key == "nilReason" : 
                res.append(HyperJAXB.attribute_override(key, str(name+  "_" + key), 'column-definition="nilreason"'))

            else:
                print(type, key, value)
            
        res.append(HyperJAXB.hj_embedded_end())

        return res

    @staticmethod
    def referenced_types(type, parent, element) -> dict:
        res = ["<!-- Types -->"]
        if "name" not in element.attrib:
            raise KeyError("Element must have a name attribute", ET.tostring(element, encoding='unicode', method='xml'))
        target_table = element.attrib["name"]
        owning_table = parent.attrib.get("name","")
        is_property_type = "PropertyType" in element.attrib.get("type","") and "TimeSlicePropertyType" not in element.attrib.get("type","")

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            maxOccurs = "unbounded"
        else:
            maxOccurs = int(maxOccurs)

        # Property type are used across all aixm feature and must be Isolated
        if maxOccurs == "unbounded" and is_property_type:
            if target_table == "":
                raise KeyError("Parent element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
            schema = Schema.get_schema(owning_table)
            res.append(HyperJAXB.hj_one_to_many_start())
            res.append(HyperJAXB.orm_join_table(schema, owning_table, target_table))
            res.append(HyperJAXB.hj_one_to_many_end())


        elif maxOccurs == "unbounded" and not is_property_type:
            if target_table == "":
                raise KeyError("Parent element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
            res.append(HyperJAXB.hj_one_to_many_start())
            res.append(HyperJAXB.orm_join_column(target_table))
            res.append(HyperJAXB.hj_one_to_many_end())

        # Property type are used across all aixm feature and must be Isolated
        elif maxOccurs == 1 and is_property_type:
            if target_table == "":
                raise KeyError("Parent element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
            schema = Schema.get_schema(owning_table)
            res.append(HyperJAXB.hj_one_to_one_start())
            res.append(HyperJAXB.orm_join_table(schema, owning_table, target_table))
            res.append(HyperJAXB.hj_one_to_one_end())

        elif maxOccurs == 1 and not is_property_type:
            res.append(HyperJAXB.hj_one_to_one_start())
            res.append(HyperJAXB.orm_join_column(target_table))
            res.append(HyperJAXB.hj_one_to_one_end())

        else:
            raise KeyError("Unknown reference type", ET.tostring(element, encoding='unicode', method='xml'))

        return res
    
    def referenced_refs(target_table, parent, element) -> dict:
        res = ["<!-- Refs -->"]

        if "ref" not in element.attrib:
            raise KeyError("Element must have a name reference attribute", ET.tostring(element, encoding='unicode', method='xml'))
        target_table = element.attrib["ref"]

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            maxOccurs = "unbounded"
        else:
            maxOccurs = int(maxOccurs)

        if maxOccurs == "unbounded":
            if "TimeSlicePropertyType" in target_table:
                res.append(HyperJAXB.hj_one_to_many_start())
                res.append(HyperJAXB.orm_join_column(target_table))
                res.append(HyperJAXB.hj_one_to_many_end())

            elif "TimeSlice" in target_table:
                res.append(HyperJAXB.hj_one_to_many_start())
                res.append(HyperJAXB.orm_join_column(target_table))
                res.append(HyperJAXB.hj_one_to_many_end())

            else:
                raise KeyError("Unknown reference for collection type", ET.tostring(element, encoding='unicode', method='xml'))

        elif maxOccurs == 1:
            if "TimeSlice" in target_table:
                res.append(HyperJAXB.hj_one_to_one_start())
                res.append(HyperJAXB.orm_join_column(target_table))
                res.append(HyperJAXB.hj_one_to_one_end())

            elif "PropertyType" in parent.attrib.get("name","") and "Abstract" in element.attrib.get("ref",""):
                pass

            elif "Extension" in target_table:
                res.append(HyperJAXB.hj_one_to_one_start())
                res.append(HyperJAXB.orm_join_column(target_table))
                res.append(HyperJAXB.hj_one_to_one_end())

            else :
                res.append(HyperJAXB.hj_one_to_one_start())
                res.append(HyperJAXB.orm_join_column(target_table))
                res.append(HyperJAXB.hj_one_to_one_end())

        else:
            raise KeyError("Unknown reference type", ET.tostring(element, encoding='unicode', method='xml'))
                
        return res
    
    @staticmethod
    def inline_complex_type(parent, name):
        res = ["<!-- Complex-->"]

        if "name" not in parent.attrib:
            raise KeyError("Element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
        parent_name = parent.attrib["name"]

        schema = Schema.get_schema(parent_name)
        suffix = Schema.get_suffix(parent_name)

        res.append(HyperJAXB.hj_one_to_many_start())
        res.append(HyperJAXB.orm_join_column(name))
        res.append(HyperJAXB.hj_one_to_many_end())
        return res
    
    @staticmethod
    def inline_complex_class(parent, name):
        res = ["<!-- Complex-->"]

        if "name" not in parent.attrib:
            raise KeyError("Element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
        parent_name = parent.attrib["name"]

        schema = Schema.get_schema(parent_name)
        suffix = Schema.get_suffix(parent_name)

        res.append(HyperJAXB.hj_entity_start())
        res.append(HyperJAXB.table(name,schema,suffix))
        res.append(HyperJAXB.hj_entity_end())
        return res