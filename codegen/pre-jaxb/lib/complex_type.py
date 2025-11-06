from .validation import Validation
from .annotation import Annox, Jpa, Tag, Jaxb, Xml, HyperJAXB
from .view import View
from .content import Content
from .field_handler import FieldHandler


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

        if element.attrib["name"] in Content.get_ignore():
            return node

        schema = View.get_schema(element.attrib.get("name"))
        suffix = View.get_suffix(element.attrib.get("name"))

        node.append(Jaxb.complex(element.attrib["name"]))
        node.extend(ComplexType.class_writer(element, schema, suffix))
        node.append('''<jaxb:bindings/>''')
        node.append(Jaxb.end)

        parent_xpath = Jaxb.complex_xpath(element.attrib.get("name"))
        node.extend(FieldHandler.field_writer(element, parent_xpath))
            
        return node
    
    @staticmethod
    def class_writer(element, schema, suffix):
        node = []

        # Abstract types are entity and have a inheritance strategy
        if element.attrib.get("name") in Content.get_abstract().keys() :
            Content.append_entity(element.attrib["name"])
            node.append(HyperJAXB.hj_entity_start())
            node.append(HyperJAXB.table(element.attrib["name"],schema,suffix))
            node.append(HyperJAXB.inhertiance())
            node.append(HyperJAXB.hj_entity_end())
            return node

        # Types that are embeddable 
        if element.attrib.get("name") in Content.get_embed().keys():
            node.append(HyperJAXB.embeddable())
            return node
        
        Content.append_entity(element.attrib["name"])
        node.append(HyperJAXB.hj_entity_start())
        node.append(HyperJAXB.table(element.attrib["name"],schema, None, suffix))
        node.append(HyperJAXB.hj_entity_end())
        return node