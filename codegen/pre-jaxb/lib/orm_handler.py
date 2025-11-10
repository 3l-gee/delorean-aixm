from platform import node
import re
import xml.etree.ElementTree as ET

from .view import View
from .annotation import HyperJAXB, Jaxb
from .content import Content

class OrmHandler: 

    @staticmethod
    def embeded_types(type, parent, element) -> dict:
        res = []
        if "name" not in element.attrib:
            raise KeyError("Element must have a name attribute")
        name = element.attrib["name"]

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            raise KeyError("Embeded types cannot be collections")

        constraints = Content().get_embed_by_type(type)

        res.append(HyperJAXB.hj_embedded_start())

        for key, value in constraints.items():
            if key == "value" : 
                res.append(HyperJAXB.attribute_override(key, str(name)))
            else:
                res.append(HyperJAXB.attribute_override(key, str(name +  "_" + key)))

        res.append(HyperJAXB.hj_embedded_end())

        return res

    @staticmethod
    def referenced_types(type, parent, element) -> dict:
        res = []
        if "name" not in element.attrib:
            raise KeyError("Element must have a name attribute", ET.tostring(element, encoding='unicode', method='xml'))
        name = element.attrib["name"]

        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")

        if maxOccurs.lower() == "unbounded":
            maxOccurs = "unbounded"
        else:
            maxOccurs = int(maxOccurs)

        if maxOccurs == "unbounded":
            res.append(HyperJAXB.hj_one_to_many_start())
            res.append(HyperJAXB.orm_join_column(name))
            res.append(HyperJAXB.hj_one_to_many_end())


        if maxOccurs == 1:
            res.append(HyperJAXB.hj_one_to_one_start())
            res.append(HyperJAXB.orm_join_column(name))
            res.append(HyperJAXB.hj_one_to_one_end())

        return res
    
    def referenced_refs(ref, parent, element) -> dict:
        res = []

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
        res = []

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

    
    @staticmethod
    def generate_cardinality(parent, element, embed):

        res = []
        type = element.attrib.get("type", "").replace("aixm:", "")
        annotation = element.find("{http://www.w3.org/2001/XMLSchema}annotation/{http://www.w3.org/2001/XMLSchema}documentation")
        snowflake_text = annotation.text if annotation is not None and annotation.text else ""
        name = element.attrib.get("name","")
        ref = element.attrib.get("ref")
        nillable = element.attrib.get("nillable", "false").lower() == "true"
        minOccurs = int(element.attrib.get("minOccurs", "1"))
        maxOccurs = element.attrib.get("maxOccurs", "1")  # Default is 1
        constraints = embed.get(type)

        if maxOccurs.lower() == "unbounded":
            maxOccurs = "unbounded"
        else:
            maxOccurs = int(maxOccurs)

        # print(type in embed.keys())
        if snowflake_text != "":
            type = snowflake_text.replace("aixm:", "")

        if ref : 
            return res

        if maxOccurs == "unbounded":
            if type in embed.keys():
                res.append(HyperJAXB.hj_embedded_start())
                return res
            else : 
                res.append(HyperJAXB.hj_one_to_many_start())
                return res
            #     res.append(Annox.field_add(Jpa.relation.collection_element()))
            #     res.append(Annox.field_add(Jpa.relation.collection_table(type)))

            #     temp = [Jpa.attribute_sub_override("href", Jpa.column_with_definition(name))]
            #     temp.append(Jpa.attribute_sub_override("nilReason", element.attrib["name"]))
            #     res.append(Annox.field_add(Jpa.attribute_main_override(temp)))
            #     return res 

            # res.append(Annox.field_add(Jpa.relation.one_to_many()))

            # res.append(Annox.field_add(Relation.join_table(
            #     parent.attrib["name"], element.attrib["name"], parent.attrib["name"], element.attrib["type"])))
            # res.append(Annox.field_add(Relation.join_table("master", "join", "source", "target")))
            # join_column_name = element.attrib.get("name") if element.attrib.get("name") else element.attrib.get("ref")
            

        if maxOccurs == 1:
            if type in embed.keys():
                res.append(HyperJAXB.hj_embedded_start())
                return res
            else : 
                res.append(HyperJAXB.hj_one_to_one_start())
                return res
            #     res.append(Annox.field_add(Jpa.embedded))
            #     temp = []
            #     for key, value in embed[type].items():
            #         column_length = value.get("column_length") or 255
            #         column_definition = value.get("column_definition")
            #         if column_definition is not None:
            #             temp.append(Jpa.attribute_sub_override(key, Jpa.column_with_definition(str(name + "_" + key), column_definition, column_length)))
            #         else:
            #             temp.append(Jpa.attribute_sub_override(key, Jpa.column(str(name + "_" + key), column_length)))

                # for attribute in embed[type].findall(".//"+ Tag.attribute) or []:
                #     temp.append(Jpa.attribute_sub_override(attribute.attrib["name"], element.attrib["name"]))
                
                #PropertyType with Ownership and Association
                # if temp == []:
                #     temp.append(Jpa.attribute_sub_override("href", element.attrib["name"]))
                #     temp.append(Jpa.attribute_sub_override("nilReason", element.attrib["name"]))

                # else: 
                #     temp.append(Jpa.attribute_sub_override("value", element.attrib["name"]))

                # res.append(Annox.field_add(Jpa.attribute_main_override(temp)))

        if nillable:
            pass

        return res