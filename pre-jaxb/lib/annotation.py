import re
from enum import Enum
from unicodedata import name
from .config import Config

TABLE = []

class Xpath(Enum):
    RELATIVE= "/xs:"
    ABSOLUTE= "xs:"
    GLOBAL =  "//xs:"

class Util:

    @staticmethod
    def snake_case_table(name, name_type=str):
        if isinstance(name, list):
            name = [x for x in name if x is not None]

        if type(name) is list : 
            names = []
            for n in name :
                joined_name = Util.snake_case_table(n, name_type)
                names.append(joined_name)

            return "_".join(names)
        else : 
            return Config().generate_database_name(name)

    @staticmethod
    def snake_case_column(name, name_type=str):
        if type(name) is list :
            names = [Util.snake_case_column(n, list) for n in name]
            return "_".join(names)
        else :
            return Config().generate_database_name(name)
    
    @staticmethod
    def bool_str(value):
        return str(value).lower()
    
    @staticmethod
    def generate_constraints(element) :

        res = {"type" : element.attrib["name"]}
        union = element.find(Tag.union)

        if union is not None:
            enum = []
            simple_types = union.findall(Tag.simple_type)
            for simple_type in simple_types:
                restriction = simple_type.find(Tag.restriction)
                pattern = restriction.find(Tag.pattern)
                enumerations = restriction.findall(Tag.enumeration)
                for enumeration in enumerations:
                    enum.append(enumeration.attrib["value"])
                
                if pattern is not None:
                    enum.append(pattern.attrib["value"])
            res["enum"] = enum
            res["uber"] = "enum"
            return res

        restriction = element.find(Tag.restriction)
        if restriction is None:
            return res
    
        if restriction.attrib["base"]:
            res["base"] = restriction.attrib["base"]
            if restriction.attrib["base"] == "string" or restriction.attrib["base"] == "xsd:string":
                res["uber"] = "string"
            elif restriction.attrib["base"] == "unsignedInt" or restriction.attrib["base"] == "xsd:unsignedInt":
                res["uber"] = "unsignedInt"
            elif restriction.attrib["base"] == "decimal" or restriction.attrib["base"] == "xsd:decimal":
                res["uber"] = "decimal" 
            elif restriction.attrib["base"] == "boolean" or restriction.attrib["base"] == "xsd:boolean":
                res["uber"] = "boolean"
            elif restriction.attrib["base"] == "date" or restriction.attrib["base"] == "xsd:date":
                res["uber"] = "date"
            elif restriction.attrib["base"] == "dateTime" or restriction.attrib["base"] == "xsd:dateTime":
                res["uber"] = "dateTime"
            elif restriction.attrib["base"] == "token" or restriction.attrib["base"] == "xsd:token":
                res["uber"] = "token"
            elif restriction.attrib["base"] == "time" or restriction.attrib["base"] == "xsd:time":
                res["uber"] = "time"

        if restriction.find(Tag.fractionDigits) is not None:
            res["fractionDigits"] = restriction.find(Tag.fractionDigits).attrib["value"]
        
        if restriction.find(Tag.length) is not None:
            res["length"] = restriction.find(Tag.length).attrib["value"]

        if restriction.find(Tag.maxExclusive) is not None:
            res["maxExclusive"] = restriction.find(Tag.maxExclusive).attrib["value"]

        if restriction.find(Tag.minExclusive) is not None:
            res["minExclusive"] = restriction.find(Tag.minExclusive).attrib["value"]
        
        if restriction.find(Tag.maxInclusive) is not None:
            res["maxInclusive"] = restriction.find(Tag.maxInclusive).attrib["value"]

        if restriction.find(Tag.minInclusive) is not None:
            res["minInclusive"] = restriction.find(Tag.minInclusive).attrib["value"]
        
        if restriction.find(Tag.maxLength) is not None:
            res["maxLength"] = restriction.find(Tag.maxLength).attrib["value"]

        if restriction.find(Tag.minLength) is not None:
            res["minLength"] = restriction.find(Tag.minLength).attrib["value"]

        if restriction.find(Tag.pattern) is not None:
            res["pattern"] = restriction.find(Tag.pattern).attrib["value"]

        if restriction.find(Tag.totalDigits) is not None:
            res["totalDigits"] = restriction.find(Tag.totalDigits).attrib["value"]
        
        if restriction.find(Tag.whiteSpace) is not None:
            res["whiteSpace"] = restriction.find(Tag.whiteSpace).attrib["value"]
            
        return res

    

class Property:
    @staticmethod
    def name(name):
        return f'<jaxb:property name="{name}"/>'
    
    element = ''

    @staticmethod
    def name_element(name):
        return f'<jaxb:property name="{name}"/>'
    
    @staticmethod
    def nameClass(name):
        return f'<jaxb:class  name="{name}"/>'
    


class Jaxb:

    @staticmethod
    def java_type(name, type=None):
        if type:
            return f'''<jaxb:javaType name="{name}" xmlType="{type}" />'''
        
        return f'''<jaxb:javaType name="{name}" />'''
    
    @staticmethod
    def schema(value):
        return f'''<jaxb:bindings schemaLocation="{value}" node="/xs:schema">'''
    
    @staticmethod
    def package(value):
        return f'''<jaxb:package name="{value}" />'''
    
    @staticmethod
    def bindings(xpath):
        return f'''<jaxb:bindings node="{xpath}">'''

    @staticmethod
    def simple(value, xpath = Xpath.GLOBAL.value, at="name", ):
        return f'''<jaxb:bindings node="{xpath}simpleType[@{at}='{value}']">'''
    
    @staticmethod
    def complex(value, xpath = Xpath.GLOBAL.value, at="name"):
        return f'''<jaxb:bindings node="{xpath}complexType[@{at}='{value}']">'''
    
    @staticmethod
    def complex_xpath(value, xpath = Xpath.GLOBAL.value, at="name"):
        return f'''{xpath}complexType[@{at}='{value}']'''

    @staticmethod
    def group(value, xpath = Xpath.GLOBAL.value, at="name"):
        return f'''<jaxb:bindings node="{xpath}group[@{at}='{value}']">'''
    
    @staticmethod
    def group_xpath(value, xpath = Xpath.GLOBAL.value, at="name"):
        return f'''{xpath}group[@{at}='{value}']'''
    
    @staticmethod
    def element(value, parent="", xpath = Xpath.GLOBAL.value, at="name"):
        return f'''<jaxb:bindings node="{parent}{xpath}element[@{at}='{value}']">'''

    @staticmethod
    def attribute(value, parent="", xpath = Xpath.GLOBAL.value, at="name"):
        return f'''<jaxb:bindings node="{parent}{xpath}attribute[@{at}='{value}']">'''

    @staticmethod
    def enum_start(value):
        return f'''<jaxb:typesafeEnumClass name="{value}">'''

    @staticmethod
    def enum_member(name, value):
        return f'''<jaxb:typesafeEnumMember name="{name}" value="{value}"/>'''
    
    start ="""
<jaxb:bindings 
    xmlns:jaxb="https://jakarta.ee/xml/ns/jaxb" 
    xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" 
    xmlns:xs="http://www.w3.org/2001/XMLSchema" 
    xmlns:xlink="http://www.w3.org/1999/xlink" 
    xmlns:annox="http://jvnet.org/basicjaxb/xjc/annox" 
    xmlns:hj="http://jvnet.org/hyperjaxb/jpa" 
    xmlns:orm="https://jakarta.ee/xml/ns/persistence/orm" 
    xmlns:ci="http://jaxb.dev.java.net/plugin/code-injector"
    version="3.0"
    jaxb:extensionBindingPrefixes="xjc annox hj orm ci">
"""
    enum_end = '</jaxb:typesafeEnumClass>'
    end = '</jaxb:bindings>'
    binding_start = '<jaxb:schemaBindings>'
    binding_end = '</jaxb:schemaBindings>'

    property = Property 

class Annox:
    @staticmethod
    def class_add(annotation):
        return f'''<annox:annotate target="class">{annotation}</annox:annotate>'''

    @staticmethod
    def class_remove(annotation):
        return f'''<annox:removeAnnotation target="class">{annotation}</annox:annotate>'''

    @staticmethod
    def field_add(annotation):
        return f'''<annox:annotate target="field">{annotation}</annox:annotate>'''

    @staticmethod
    def field_remove(annotation):
        return f'''<annox:removeAnnotation target="field">{annotation}</annox:annotate>'''
    
    @staticmethod
    def getter_add(annotation):
        return f'''<annox:annotate target="getter">{annotation}</annox:annotate>'''

    @staticmethod
    def getter_remove(annotation):
        return f'''<annox:removeAnnotation target="getter">{annotation}</annox:annotate>'''
    
class HyperJAXB:
    
    @staticmethod
    def orm_tsp_filter():
        return f'''@org.hibernate.annotations.Filter(name = "TPHjidFilter", condition = "hjid = ANY(:ids)")'''
    
    @staticmethod
    def orm_tsp_filter_def():
        return f'''@org.hibernate.annotations.FilterDef(name = "TPHjidFilter", parameters = @org.hibernate.annotations.ParamDef(name = "ids", type = long[].class))'''
    
    @staticmethod
    def orm_table(annotation):
        return f'''<orm:table {annotation} />'''

    @staticmethod
    def orm_inheritance(annotation):
        return f'''<orm:inheritance {annotation} />'''
    
    @staticmethod
    def orm_join_column(name):
        join_column_name = Util.snake_case_column(str(name)).replace('"', '')

        return f'''<orm:join-column name="{join_column_name}_hjid" referenced-column-name="hjid" />'''
    
    @staticmethod 
    def orm_join_table(schema, owning_table, target_table):
        owning_table_acronym = Config().generate_phonetic_acronym(owning_table)
        target_table_acronym = Config().generate_phonetic_acronym(target_table)
        join_table_name = Util.snake_case_table([owning_table_acronym, target_table_acronym, "link"]).replace('"', '')
        owning_table = Util.snake_case_column(str(owning_table)).replace('"', '')
        target_table = Util.snake_case_column(str(target_table)).replace('"', '')

        if len(join_table_name) > 63:
            print(f"Warning: The generated table name '{join_table_name}' exceeds the maximum length of 63 characters")

        return f'''<orm:join-table name="{join_table_name}" schema="{schema}"><orm:join-column name="{owning_table}_hjid" referenced-column-name="hjid" /><orm:inverse-join-column name="{target_table}_hjid" referenced-column-name="hjid" /></orm:join-table>'''
    
    @staticmethod
    def hj_embedded_start():
        return f'''<hj:embedded>'''
    
    @staticmethod
    def hj_embedded_end():
        return f'''</hj:embedded>'''
    
    @staticmethod
    def attribute_override(name, column, constraints=None):
        column = Util.snake_case_column(column)
        column = column.replace('"', '')

        if constraints is None :
            return f'''<orm:attribute-override name="{str(name)}"><orm:column name="{str(column)}" /></orm:attribute-override>'''
        return f'''<orm:attribute-override name="{str(name)}"><orm:column name="{str(column)}" {constraints} /></orm:attribute-override>'''
    
    @staticmethod
    def embeddabl_start():
        return f'''<hj:embeddable>'''
    
    @staticmethod
    def embeddable_end():
        return f'''</hj:embeddable>'''
    
    @staticmethod
    def hj_entity_start():
        return f'''<hj:entity>'''
    
    @staticmethod
    def hj_entity_end():
        return f'''</hj:entity>'''
    
    @staticmethod
    def hj_basic_start():
        return f'''<hj:basic>'''

    @staticmethod
    def hj_basic_end():
        return f'''</hj:basic>'''

    @staticmethod
    def hj_mapped_start():
        return f'''<hj:mapped-superclass>'''
    
    @staticmethod
    def hj_mapped_end():
        return f'''</hj:mapped-superclass>'''
    
    @staticmethod
    def persistence_start():
        return f'<hj:persistence>'
    
    @staticmethod
    def persistence_end():
        return f'</hj:persistence>'
    
    @staticmethod
    def inhertiance(strategy="JOINED"):
        return f'<orm:inheritance strategy="{strategy}" />'
    
    @staticmethod
    def mapped_superclass():
        return f'<hj:mapped-superclass/>'
    
    @staticmethod
    def table(name, schema, prefix=None, suffix=None):
        join_table_name = Util.snake_case_table([prefix, name, suffix]).replace('"', '')
        if len(join_table_name) > 63:
            print(f"Warning: The generated table name '{join_table_name}' exceeds the maximum length of 63 characters")
        
        return f'<orm:table name = "{join_table_name}" schema = "{schema}" />'
    
    @staticmethod
    def hj_many_to_one_start():
        return f'<hj:many-to-one>'

    @staticmethod
    def hj_many_to_one_end():
        return f'</hj:many-to-one>'

    @staticmethod
    def hj_one_to_one_start():
        return f'<hj:one-to-one>'

    @staticmethod
    def hj_one_to_one_end():
        return f'</hj:one-to-one>'
    
    @staticmethod
    def hj_one_to_many_start():
        return f'<hj:one-to-many>'

    @staticmethod
    def hj_one_to_many_end():
        return f'</hj:one-to-many>'
    
    @staticmethod
    def hj_many_to_many_start():
        return f'<hj:many-to-many>'
    
    @staticmethod
    def hj_many_to_many_end():
        return f'</hj:many-to-many>'

    
class Tag:
    _xs_namespace = "{http://www.w3.org/2001/XMLSchema}"
    namespaces = {'xs': 'http://www.w3.org/2001/XMLSchema'}
    
    import_ = _xs_namespace + "import"
    annotation = _xs_namespace + "annotation"
    include = _xs_namespace + "include"
    element = _xs_namespace + "element"
    attribute = _xs_namespace + "attribute"
    complex_type = _xs_namespace + "complexType"
    simple_type = _xs_namespace + "simpleType"
    simple_content = _xs_namespace + "simpleContent"
    group = _xs_namespace + "group"
    all = _xs_namespace + "all"
    any = _xs_namespace + "any"
    any_attribute = _xs_namespace + "anyAttribute"
    choice = _xs_namespace + "choice"
    sequence = _xs_namespace + "sequence"
    restriction = _xs_namespace + "restriction"
    extension = _xs_namespace + "extension"
    key = _xs_namespace + "key"
    keyref = _xs_namespace + "keyref"
    unique = _xs_namespace + "unique"
    union = _xs_namespace + "union"
    attribute_group = _xs_namespace + "attributeGroup"
    complex_content = _xs_namespace + "complexContent"
    simple_content = _xs_namespace + "simpleContent"
    notation = _xs_namespace + "notation"
    documentation = _xs_namespace + "documentation"
    appinfo = _xs_namespace + "appinfo"
   
    #restriction 
    enumeration = _xs_namespace + "enumeration"
    fractionDigits = _xs_namespace + "fractionDigits"
    length = _xs_namespace + "length"
    maxExclusive = _xs_namespace + "maxExclusive"
    maxInclusive = _xs_namespace + "maxInclusive"
    maxLength = _xs_namespace + "maxLength"
    minExclusive = _xs_namespace + "minExclusive"
    minInclusive = _xs_namespace + "minInclusive"
    minLength  = _xs_namespace + "minLength"
    pattern = _xs_namespace + "pattern"
    totalDigits = _xs_namespace + "totalDigits"
    whiteSpace = _xs_namespace + "whiteSpace"

class Xml:
    tag = Tag
    transient = '@jakarta.xml.bind.annotation.XmlTransient'
    
    @staticmethod
    def type(name, propOrder=None):
        if propOrder is None:
            return f'@jakarta.xml.bind.annotation.XmlType(name = "{name}", propOrder = {{}})'
        else :
            return f'@jakarta.xml.bind.annotation.XmlType(name = "{name}", propOrder = {{"{propOrder}"}})'
    
    @staticmethod
    def element(name, type, required=True):
        return f'@jakarta.xml.bind.annotation.XmlElement(name = "{name}", required = {Util.bool_str(required)}, type = {type})'
    
    @staticmethod
    def adapter(name):
        return f'@jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter({name})'

class Constraint: 

    def fraction_digits(value):
        pass

    @staticmethod
    def size(min, max):
        if min is None :
            return f'@jakarta.validation.constraints.Size(max={max})'

        elif max is None :
            return f'@jakarta.validation.constraints.Size(min={min})'
        
        else :
            return f'@jakarta.validation.constraints.Size(min={min}, max={max})'
        
    @staticmethod
    def pattern(value, message=""):
        """
        Escapes special characters in the provided value and returns a formatted Jakarta Persistence Pattern annotation.
        
        Args:
            value (str): The regular expression value to escape and embed in the annotation.
            message (str, optional): The validation message for the annotation. Default is an empty string.
            
        Returns:
            str: The formatted annotation string with escaped values.
        """
        if not value:
            raise ValueError("The 'value' parameter cannot be empty or None.")

        # Escape special characters for XML and Java
        escaped_value = (
            value.replace("\\", "\\\\")  # Escape backslashes for Java
                 .replace('"', '&quot;')  # Escape double quotes for XML
                 .replace('&', '&amp;')   # Escape ampersands for XML
                 .replace('<', '&lt;')    # Escape less-than symbols for XML
                 .replace('>', '&gt;')    # Escape greater-than symbols for XML
        )
        
        # Format the annotation string using f-strings
        return f'@jakarta.validation.constraints.Pattern(regexp = "{escaped_value}", message = "{message + " : " + escaped_value}")'
    
class Jpa:
    # relation = Relation
    constraint = Constraint
    entity = '''<hj:entity/>'''
    super = '''<hj:mapped-superclass/>'''
    id = '@jakarta.persistence.Id'
    transient = '@jakarta.persistence.Transient'
    embeddable = '''<hj:embeddable/>'''
    embedded = '@jakarta.persistence.Embedded'

    # @staticmethod
    # def column(name, length=255, nullable=True, unique=False):
    #     print("\n--- Util.column called by: ---")
    #     for line in traceback.format_stack()[:-1]:
    #         if "Util.column" not in line:
    #             print(line.strip())
    #     return f'@jakarta.persistence.Column(name = "{Util.snake_case_column(name)}", length = {length}, nullable = {Util.bool_str(nullable)}, unique = {Util.bool_str(unique)})'

    # @staticmethod
    # def column_with_definition(name, columnDefinition, length=255, nullable=True, unique=False):
    #     return f'@jakarta.persistence.Column(name = "{Util.snake_case_column(name)}", length = {length}, columnDefinition = "{columnDefinition}", nullable = {Util.bool_str(nullable)}, unique = {Util.bool_str(unique)})'
        
    @staticmethod
    def table(name, schema, prefix=None):
        if prefix is None:
            
            return f'<orm:table name = "{Util.snake_case(name)}" schema = "{schema}" />'
        else:
            return f'<orm:table name = "{Util.snake_case([prefix,name])}" schema = "{schema}" />'

    @staticmethod
    def enumerated(value="STRING"):
        return f'@jakarta.persistence.Enumerated(jakarta.persistence.EnumType.{value})'
    
    @staticmethod
    def generated_value(generator, strategy="jakarta.persistence.GenerationType.SEQUENCE"):
        return f'@jakarta.persistence.GeneratedValue(strategy = {strategy}, generator = "{generator}")'
    
    @staticmethod
    def sequence_generator(name):
        return f'@jakarta.persistence.SequenceGenerator(name = "{name}", sequenceName = "{name}", allocationSize = 1)'
    
    @staticmethod
    def attribute_sub_override(attrib_name, column):
        return f'@jakarta.persistence.AttributeOverride(name = "{attrib_name}", column = {column})'

    @staticmethod
    def attribute_main_override(value):
        return f'@jakarta.persistence.AttributeOverrides({{{", ".join([str(v) for v in value])}}})'
    
    @staticmethod
    def filter_sub_annotation(name, condition):
        return f'@org.hibernate.annotations.Filter(name = "{name}", condition = "{condition}")'
    
    @staticmethod
    def filter_main_annotation(value):
        return f'@org.hibernate.annotations.Filters({{{", ".join([str(v) for v in value])}}})'

class AixmEncoding : 
    FIELD = ["Code", "Val", "Date", "Time", "NoNumber", "NoSequence", "Text"]
    CLASS = ["BaseType", "PropertyType", "TimeSlicePropertyType", "TimeSlice" ]
