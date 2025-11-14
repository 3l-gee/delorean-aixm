import xml.etree.ElementTree as ET

from .orm_handler import OrmHandler
from .annotation import Tag, Jaxb, Xpath
from .content import Content

class FieldHandler: 
    @staticmethod
    def field_writer(type, parent_xpath):
        node = []
        
        # Process sequence
        node.extend(FieldHandler.process_sequence(type, parent_xpath))
        
        # Process complexContent
        node.extend(FieldHandler.process_complex_content(type, parent_xpath))
        
        return node
    
    @staticmethod
    def process_sequence(parent, parent_xpath):
        """Process the sequence flow."""
        node = []
        sequence_list = parent.findall(Tag.sequence) or []
        for sequence in sequence_list:

            element_list = sequence.findall(".//" + Tag.element, Tag.namespaces) or []
            attribute_list = sequence.findall(".//" + Tag.attribute, Tag.namespaces) or []

            for element in element_list :
                node.extend(FieldHandler.handle_sequence_element(element, parent, parent_xpath))

            for attribute in attribute_list :
                node.extend(FieldHandler.handle_sequence_attribute(attribute, parent, parent_xpath))
        
        return node

    @staticmethod
    def process_complex_content(parent, parent_xpath) :
        """Process the complexContent flow."""
        node = []
        complex_content = parent.find(Tag.complex_content)
        if complex_content is not None:
            extension = complex_content.find(Tag.extension)
            restriction = complex_content.find(Tag.restriction)

            attribute_list = []
            element_list = []

            if extension is not None:
                attribute_list.extend(extension.findall(".//" + Tag.attribute))
                element_list.extend(extension.findall(".//" + Tag.element)) 

            if restriction is not None:
                attribute_list.extend(restriction.findall(".//" + Tag.attribute))
                element_list.extend(restriction.findall(".//" + Tag.element)) 

            for attribute in attribute_list:
                node.extend(FieldHandler.handle_complex_attribute(attribute, parent, parent_xpath))

            for element in element_list:
                node.extend(FieldHandler.handle_complex_element(element, parent, parent_xpath))
        
        return node

    @staticmethod
    def handle_sequence_element(element, parent, parent_xpath):
        """Handle elements in a sequence."""
        node = []

        # generate xpath to xsd element
        if str(parent.attrib.get("name","") + "." + element.attrib.get("name","")) in Content.get_ignore():
            return node
            
        elif element.attrib.get("ref") is not None and element.attrib.get("name") is None :
            node.append(Jaxb.element(element.attrib.get("ref"),parent=parent_xpath, xpath=Xpath.GLOBAL.value ,at="ref"))

        elif element.attrib.get("name") is not None:
            node.append(Jaxb.element(element.attrib.get("name"), parent=parent_xpath, xpath=Xpath.GLOBAL.value))

        else :
            raise Exception("Element has no name or ref attribute : " + ET.tostring(element, encoding='unicode', method='xml'))
        
        # spacial cases name must be renamed to aixmName
        if element.attrib.get("name") == "name":
            node.append(Jaxb.property.name_element("aixmName"))

        # special case extension must point to specific class
        if element.attrib.get("name") == "extension":
            node[-1] = node[-1].replace('">', '/xs:complexType">')
            Content.append_entity(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType"))
            node.append(Jaxb.property.nameClass(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType")))
            return node

        type_element = element.attrib.get("type", None)
        if type_element is not None:
            type_element = type_element.replace("aixm:", "")
        embeded = Content().embed.get(type_element, None)
        ref = element.attrib.get("ref")

        # element defines an inline complexType
        if element.find("{http://www.w3.org/2001/XMLSchema}complexType") is not None:
            node.extend(OrmHandler.inline_complex_type(parent))
            node.append(Jaxb.end)
            return node

        # element links to a embedable type as embedded (embeddable)
        elif type_element is not None and embeded is not None:
            node.extend(OrmHandler.embeded_types(type_element, parent, element))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc)
        elif type_element is not None and embeded is None:
            node.extend(OrmHandler.referenced_types(type_element, parent, element))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc) but as a ref in the xsd
        elif ref is not None:
            node.extend(OrmHandler.referenced_refs(ref, parent, element))
            node.append(Jaxb.end)
            return node
        
        else:
            raise Exception("Element has no type or ref element : " + ET.tostring(element, encoding='unicode', method='xml'))

    @staticmethod
    def handle_sequence_attribute(attribute, parent, parent_xpath):
        """Handle restrictions in content."""
        node = []

        # generate xpath to xsd attribute
        if str(parent.attrib.get("name","") + "." + attribute.parent.attrib.get("name","")) in Content.get_ignore():
            return node
        
        elif attribute.attrib.get("ref") is not None and attribute.attrib.get("name") is None :
            node.append(Jaxb.attribute(attribute.attrib.get("ref"), parent=parent_xpath, xpath=Xpath.GLOBAL.value, at="ref"))
            
        elif attribute.attrib.get("name") is not None:
            node.append(Jaxb.attribute(attribute.attrib.get("name"), parent=parent_xpath, xpath=Xpath.GLOBAL.value))

        else :
            raise Exception("Attribute has no name or ref attribute : " + ET.tostring(attribute, encoding='unicode', method='xml'))
            
        # spacial cases name must be renamed to aixmName
        if attribute.attrib.get("name") == "name":
            node.append(Jaxb.property.name("aixmName"))

        # special case extension must point to specific class
        if attribute.attrib.get("name") == "extension":
            node[-1] = node[-1].replace('">', '/xs:complexType">')
            Content.append_entity(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType"))
            node.append(Jaxb.property.nameClass(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType")))

        type_element = attribute.attrib.get("type", None)
        if type_element is not None:
            type_element = type_element.replace("aixm:", "")
        embeded = Content().embed.get(type_element, None)
        ref = attribute.attrib.get("ref")

        # element defines an inline complexType
        if attribute.find("{http://www.w3.org/2001/XMLSchema}complexType") is not None:
            node.extend(OrmHandler.inline_complex_type(parent))
            node.append(Jaxb.end)
            return node
        
        # element links to a embedable type as embedded (embeddable)
        if type_element is not None and embeded is not None:
            node.extend(OrmHandler.embeded_types(type_element, parent, attribute))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc)
        elif type_element is not None and embeded is None:
            node.extend(OrmHandler.referenced_types(type_element, parent, attribute))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc) but as a ref in the xsd
        elif ref is not None:
            node.extend(OrmHandler.referenced_refs(ref, parent, attribute))
            node.append(Jaxb.end)
            return node

        else:
            raise Exception("Element has no type or ref attribute : " + ET.tostring(attribute, encoding='unicode', method='xml'))

    @staticmethod
    def handle_complex_element(element, parent, parent_xpath):
        """Handle attributes in a sequence."""
        node = []

        # generate xpath to xsd element
        if str(parent.attrib.get("name","") + "." + element.attrib.get("name","")) in Content.get_ignore():
            return node
    
        elif element.attrib.get("ref") is not None and element.attrib.get("name") is None :
            node.append(Jaxb.element(element.attrib.get("ref"), parent=parent_xpath, xpath=Xpath.GLOBAL.value, at="ref"))

        elif element.attrib.get("name") is not None:
            node.append(Jaxb.element(element.attrib.get("name"), parent=parent_xpath, xpath=Xpath.GLOBAL.value))

        else :
            raise Exception("Element has no name or ref attribute : " + ET.tostring(element, encoding='unicode', method='xml'))

        # spacial cases name must be renamed to aixmName
        if element.attrib.get("name") == "name":
            node.append(Jaxb.property.name_element("aixmName"))

        # special case extension must point to specific class
        if element.attrib.get("name") == "extension":
            node[-1] = node[-1].replace('">','/xs:complexType">')
            Content.append_entity(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType"))
            node.append(Jaxb.property.nameClass(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType")))

        type_element = element.attrib.get("type", None)
        if type_element is not None:
            type_element = type_element.replace("aixm:", "")
        embeded = Content().embed.get(type_element, None)
        ref = element.attrib.get("ref")

        # element defines an inline complexType
        if element.find("{http://www.w3.org/2001/XMLSchema}complexType") is not None:
            node.extend(OrmHandler.inline_complex_type(parent))
            node.append(Jaxb.end)
            return node

        # element links to a embedable type as embedded (embeddable)
        elif type_element is not None and embeded is not None:
            node.extend(OrmHandler.embeded_types(type_element, parent, element))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc)
        elif type_element is not None and embeded is None:
            node.extend(OrmHandler.referenced_types(type_element, parent, element))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc) but as a ref in the xsd
        elif ref is not None:
            node.extend(OrmHandler.referenced_refs(ref, parent, element))
            node.append(Jaxb.end)
            return node

        else:
            raise Exception("Element has no type or ref element : " + ET.tostring(element, encoding='unicode', method='xml'))

    @staticmethod
    def handle_complex_attribute(attribute, parent, parent_xpath):
        """Handle elements in a sequence."""
        node = []

        # generate xpath to xsd attribute
        if str(parent.attrib.get("name","") + "." + attribute.attrib.get("name","")) in Content.get_ignore():
            return node

        if attribute.attrib.get("ref") is not None and attribute.attrib.get("name") is None :
            node.append(Jaxb.attribute(attribute.attrib.get("ref"), parent=parent_xpath, xpath=Xpath.GLOBAL.value, at="ref"))
            
        elif attribute.attrib.get("name") is not None:
            node.append(Jaxb.attribute(attribute.attrib.get("name"), parent=parent_xpath, xpath=Xpath.GLOBAL.value))

        else :
            raise Exception("Attribute has no name or ref attribute : " + ET.tostring(attribute, encoding='unicode', method='xml'))
            
        # spacial cases name must be renamed to aixmName
        if attribute.attrib.get("name") == "name":
            node.append(Jaxb.property.name("aixmName"))

        # special case extension must point to specific class
        if attribute.attrib.get("name") == "extension":
            node[-1] = node[-1].replace('">','/xs:complexType">')
            Content.append_entity(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType"))
            node.append(Jaxb.property.nameClass(str(parent.attrib.get("name").removesuffix("TimeSliceType") + "ExtensionType")))

        type_element = attribute.attrib.get("type", None)
        if type_element is not None:
            type_element = type_element.replace("aixm:", "")
        embeded = Content().embed.get(type_element, None)
        ref = attribute.attrib.get("ref")

        # element defines an inline complexType
        if attribute.find("{http://www.w3.org/2001/XMLSchema}complexType") is not None:
            node.extend(OrmHandler.inline_complex_type(parent))
            node.append(Jaxb.end)
            return node

        # element links to a embedable type as embedded (embeddable)
        elif type_element is not None and embeded is not None:
            node.extend(OrmHandler.embeded_types(type_element, parent, attribute))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc)
        elif type_element is not None and embeded is None:
            node.extend(OrmHandler.referenced_types(type_element, parent, attribute))
            node.append(Jaxb.end)
            return node

        # element links to a entity type as reference (one to one, one to many, many to one, etc) but as a ref in the xsd
        elif ref is not None:
            node.extend(OrmHandler.referenced_refs(ref, parent, attribute))
            node.append(Jaxb.end)
            return node

        else:
            raise Exception("Element has no type or ref attribute : " + ET.tostring(attribute, encoding='unicode', method='xml'))