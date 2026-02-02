from .config import Config
from .annotation import Annox, Jpa, Tag, Jaxb


class SimpleType: 
    @staticmethod
    def generate_simple_types(type, graph):
        res = []
        for element in type:
            result = SimpleType.runner(element, graph)
            if result:
                res.extend(result)
        return res 

    @staticmethod
    def runner(element, graph) :
        node = []

        if element is None :    
            return node
        
        element_name = element.attrib["name"]
        element_restriction = element.find(".//" + Tag.restriction).attrib
        element_base = element_restriction.get("base")
        
        if element_name in graph["attribute"].keys() :
            return node
        
        if element_name in graph["inheritance"].keys() :
            return node
        
        if element_name in Config().get_ignore():
            return node
            
        if element.attrib.get("name") in Config().get_transient() or element.attrib.get("ref") in Config().get_transient() :
            node.append(Jaxb.simple(element.attrib["name"]))
            node.append(Annox.field_add(Jpa.transient))
            node.append(Jaxb.end)
            return node
            
        if element.attrib.get("type") in Config().get_transient():
            node.append(Jaxb.simple(element.attrib["name"]))
            node.append(Annox.field_add(Jpa.transient))
            node.append(Jaxb.end)
            return node
        
        # constraints = {**transposition.get(element.attrib["name"], {}), **Validation.generate_constraints(element)}
        # size = constraints.get("size")
        # pattern = constraints.get("pattern")

        # if size is not None:
        #     node.append(size)
        # if pattern is not None:
        #     node.append(pattern)

    
        # if element_base == "date":
        #     node.append(Jaxb.simple(element.attrib["name"]))
        #     node.append(Jaxb.java_type("java.sql.Timestamp"))
        #     node.append(Annox.field_add(Xml.adapter("com.aixm.delorean.core.adapter.date.XMLGregorianCalendarAdapter.class")))
        #     node.append(Jaxb.end)
        #     return node
        
        # # TODO 
        # if element_base == "dateTime":
        #     node.append(Jaxb.simple(element.attrib["name"]))
        #     node.append(Annox.field_add(Jpa.transient))
        #     node.append(Jaxb.end)
        #     return node



