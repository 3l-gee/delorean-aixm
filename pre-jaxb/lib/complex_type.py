from .annotation import Jaxb, HyperJAXB, Annox
from .schema import Schema
from .content import Content
from .config import Config
from .field_handler import FieldHandler
from .annotation import Tag
from .orm_handler import OrmHandler


class ComplexType: 
    @staticmethod
    def generate_complex_types(type):
        res = []
        for element in type:
            result = ComplexType.runner(element)
            if result:
                res.extend(result)
        return res 
    
    @staticmethod
    def runner(element) :
        node = []
        if element is None :    
            return node

        if element.attrib["name"] in Config().get_ignore():
            return node

        schema = Schema.get_schema(element.attrib.get("name"))
        suffix = Schema.get_suffix(element.attrib.get("name"))

        node.append(Jaxb.complex(element.attrib["name"]))
        node.extend(ComplexType.class_writer(element, schema, suffix))
        node.append(Jaxb.end)

        parent_xpath = Jaxb.complex_xpath(element.attrib.get("name"))
        node.extend(FieldHandler.field_writer(element, parent_xpath))
            
        return node
    
    @staticmethod
    def class_writer(element, schema, suffix):
        node = []

        # Abstract types are entity and have a inheritance strategy
        if element.attrib.get("name") in Config().get_abstract() :
            Content().append_entity(element.attrib["name"])
            node.append(HyperJAXB.hj_entity_start())
            node.append(HyperJAXB.table(element.attrib["name"],schema,suffix))
            node.append(HyperJAXB.inhertiance())
            node.append(HyperJAXB.hj_entity_end())
            return node

        # Types that are embeddable 
        if element.attrib.get("name") in Config().get_embedded().keys():
            node.append(HyperJAXB.embeddabl_start())
            if not element.find(Tag.simple_content) :
                node.append(HyperJAXB.embeddable_end())
                return node
        
            simple_content = element.find(Tag.simple_content)

            if simple_content.find(Tag.restriction): 
                extension_or_restriction = simple_content.find(Tag.restriction).attrib["base"]
            elif simple_content.find(Tag.extension) : 
                extension_or_restriction = simple_content.find(Tag.extension).attrib["base"]
            else : 
                raise Exception("Embeded compley type must extend or restrict a SimpleContent")
            
            extension_or_restriction = extension_or_restriction.split(":")[1]

            constraint = Content.get_transposition(extension_or_restriction)
            node.append(HyperJAXB.hj_basic_start())
            node.extend(OrmHandler.constraint_generator_column(constraint))
            node.append(HyperJAXB.hj_basic_end())
            node.append(HyperJAXB.embeddable_end())
            return node
        
        if "TimeSlicePropertyType" in element.attrib.get("name"):
            node.append(Annox.class_add(HyperJAXB.orm_tsp_filter_def()))
            node.append(Annox.class_add(HyperJAXB.orm_tsp_filter()))

        Content.append_entity(element.attrib["name"])
        node.append(HyperJAXB.hj_entity_start())
        node.append(HyperJAXB.table(element.attrib["name"],schema, None, suffix))
        node.append(HyperJAXB.hj_entity_end())
        return node