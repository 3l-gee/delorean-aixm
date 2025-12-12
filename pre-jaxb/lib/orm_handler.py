from platform import node
import re
import xml.etree.ElementTree as ET

from .view import View
from .annotation import HyperJAXB, Jaxb
from .content import Content

class OrmHandler: 

    def constraint_generator_column(constraints) -> dict:
        POSTGRES_VARCHAR_LIMIT = 4000

        if constraints is None:
            return []
        
        node = ["<!-- Embedable + orm -->"]

        if constraints["uber"] == "string":
            if constraints.get("length") is None and constraints.get("maxLength") is None :
                length = 256
            elif constraints.get("length") is not None and constraints.get("maxLength") is None :
                length = constraints.get("length")
            elif constraints.get("length") is None and constraints.get("maxLength") is not None :
                length = constraints.get("maxLength")
            elif constraints.get("length") is not None and constraints.get("maxLength") is not None :
                length = max(constraints.get("maxLength"), constraints.get("length"))

            if int(length) <= POSTGRES_VARCHAR_LIMIT:
                # Map to VARCHAR
                node.append(f'''<orm:column column-definition="VARCHAR" length="{length}" />''')
                return node
            else:
                # Map to TEXT
                node.append(f'''<orm:column column-definition="TEXT" length="{length}" />''')
                return node
            
        if constraints["uber"] == "unsignedInt":
            return []
        
        if constraints["uber"] == "token":
            return []

        if constraints["uber"] == "decimal":
            if constraints.get("fractionDigits") is None and constraints.get("totalDigits") is None:
                node.append(f'''<orm:column column-definition="NUMERIC" />''')
                return node
            
            if constraints.get("fractionDigits") is not None and constraints.get("totalDigits") is None:
                node.append(f'''<orm:column column-definition="NUMERIC" scale="{constraints.get("fractionDigits")}" />''')
                return node
            
            if constraints.get("fractionDigits") is None and constraints.get("totalDigits") is not None:
                node.append(f'''<orm:column column-definition="NUMERIC" precision="{constraints.get("totalDigits")}" />''')
                return node
            
            if constraints.get("fractionDigits") is not None and constraints.get("totalDigits") is not None:
                node.append(f'''<orm:column column-definition="NUMERIC" scale="{constraints.get("fractionDigits")}" precision="{constraints.get("totalDigits")}" />''')
                return node
        
        return []

    def constraint_generator_attribute_override(type) -> dict:
        POSTGRES_VARCHAR_LIMIT = 4000

        constraints = Content.get_transposition(type)

        if constraints is None:
            return None

        if constraints["uber"] == "string":
            if constraints.get("length") is None and constraints.get("maxLength") is None :
                length = 256
            elif constraints.get("length") is not None and constraints.get("maxLength") is None :
                length = constraints.get("length")
            elif constraints.get("length") is None and constraints.get("maxLength") is not None :
                length = constraints.get("maxLength")
            elif constraints.get("length") is not None and constraints.get("maxLength") is not None :
                length = max(constraints.get("maxLength"), constraints.get("length"))

            if int(length) <= POSTGRES_VARCHAR_LIMIT:
                # Map to VARCHAR
                return f'''column-definition="VARCHAR" length="{length}"'''
            else:
                # Map to TEXT
                return f'''column-definition="TEXT" length="{length}"'''
            
        if constraints["uber"] == "unsignedInt":
             return None
        
        if constraints["uber"] == "token":
             return None

        if constraints["uber"] == "decimal":
            if constraints.get("fractionDigits") is None and constraints.get("totalDigits") is None:
                return f'''column-definition="NUMERIC"'''
            
            if constraints.get("fractionDigits") is not None and constraints.get("totalDigits") is None:
                return f'''column-definition="NUMERIC" scale="{constraints.get("fractionDigits")}" '''
            
            if constraints.get("fractionDigits") is None and constraints.get("totalDigits") is not None:
                return f'''column-definition="NUMERIC" precision="{constraints.get("totalDigits")}" '''
            
            if constraints.get("fractionDigits") is not None and constraints.get("totalDigits") is not None:
                return f'''column-definition="NUMERIC" scale="{constraints.get("fractionDigits")}" precision="{constraints.get("totalDigits")}" '''

        
        return None


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

        embeded_fields = Content().get_embed_by_type(type)
        base_type = type.replace("Type","BaseType")
        constraints = OrmHandler.constraint_generator_attribute_override(base_type)

        res.append(HyperJAXB.hj_embedded_start())

        for key, value in embeded_fields.items():
            if key == "value" : 
                res.append(HyperJAXB.attribute_override(key, str(name), constraints))
            else:
                res.append(HyperJAXB.attribute_override(key, str(name +  "_" + key)))
            
        res.append(HyperJAXB.hj_embedded_end())

        return res

    @staticmethod
    def referenced_types(type, parent, element) -> dict:
        res = ["<!-- Types -->"]
        if "name" not in element.attrib:
            raise KeyError("Element must have a name attribute", ET.tostring(element, encoding='unicode', method='xml'))
        name = element.attrib["name"]
        parent_name = parent.attrib.get("name","")

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            maxOccurs = "unbounded"
        else:
            maxOccurs = int(maxOccurs)

        if maxOccurs == "unbounded":
            if parent_name == "":
                raise KeyError("Parent element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
            schema = View.get_schema(parent_name)
            res.append(HyperJAXB.hj_many_to_many_start())
            res.append(HyperJAXB.orm_join_table(schema, name, parent_name))
            res.append(HyperJAXB.hj_many_to_many_end())
            # res.append(HyperJAXB.hj_one_to_many_start())
            # res.append(HyperJAXB.orm_join_column(name))
            # res.append(HyperJAXB.hj_one_to_many_end())


        if maxOccurs == 1:
            res.append(HyperJAXB.hj_many_to_one_start())
            res.append(HyperJAXB.orm_join_column(name))
            res.append(HyperJAXB.hj_many_to_one_end())
            # res.append(HyperJAXB.hj_one_to_one_start())
            # res.append(HyperJAXB.orm_join_column(name))
            # res.append(HyperJAXB.hj_one_to_one_end())

        return res
    
    def referenced_refs(ref, parent, element) -> dict:
        res = ["<!-- Refs -->"]

        if "ref" not in element.attrib:
            raise KeyError("Element must have a name reference attribute", ET.tostring(element, encoding='unicode', method='xml'))
        ref = element.attrib["ref"]

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            maxOccurs = "unbounded"
        else:
            maxOccurs = int(maxOccurs)

        if maxOccurs == "unbounded":
            if "TimeSlicePropertyType" in ref:
                res.append(HyperJAXB.hj_one_to_many_start())
                res.append(HyperJAXB.orm_join_column("tsp"))
                res.append(HyperJAXB.hj_one_to_many_end())

            elif "TimeSlice" in ref:
                res.append(HyperJAXB.hj_one_to_many_start())
                res.append(HyperJAXB.orm_join_column("extension"))
                res.append(HyperJAXB.hj_one_to_many_end())

            else:
                raise KeyError("Unknown reference for collection type", ET.tostring(element, encoding='unicode', method='xml'))

        if maxOccurs == 1:
            if "TimeSlice" in ref:
                res.append(HyperJAXB.hj_one_to_one_start())
                res.append(HyperJAXB.orm_join_column("ts"))
                res.append(HyperJAXB.hj_one_to_one_end())

            elif "PropertyType" in parent.attrib.get("name","") and "Abstract" in element.attrib.get("ref",""):
                pass

            else :
                res.append(HyperJAXB.hj_one_to_one_start())
                res.append(HyperJAXB.orm_join_column(element.get("ref").replace("aixm:", "")))
                res.append(HyperJAXB.hj_one_to_one_end())
                
        return res
    
    @staticmethod
    def inline_complex_type(parent):
        res = ["<!-- Complex-->"]

        if "name" not in parent.attrib:
            raise KeyError("Element must have a name attribute", ET.tostring(parent, encoding='unicode', method='xml'))
        name = parent.attrib["name"]

        schema = View.get_schema(name)
        suffix = View.get_suffix(name)

        if "TimeSliceType" in name:
            extension_name = name.replace("TimeSliceType", "Extension")
            res.append(HyperJAXB.hj_entity_start())
            res.append(HyperJAXB.table(extension_name,schema,suffix))
            res.append(HyperJAXB.hj_entity_end())
            return res

        elif "Type" in name:
            extension_name = name.replace("Type", "Extension")
            res.append(HyperJAXB.hj_entity_start())
            res.append(HyperJAXB.table(extension_name,schema,suffix))
            res.append(HyperJAXB.hj_entity_end())
            return res

        else:
            raise KeyError("Unknown inline complex type", ET.tostring(parent, encoding='unicode', method='xml'))