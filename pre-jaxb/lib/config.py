from dataclasses import dataclass, field
from typing import List, Dict, Optional
import yaml
import re
from .struct import MappingSection

class SingletonMeta(type):
    _instances = {}

    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwargs)
            cls._instances[cls] = instance
        return cls._instances[cls]

    def reset_instance(cls):
        if cls in cls._instances:
            del cls._instances[cls]

class Config(metaclass=SingletonMeta): 
    def __init__(self, path: str, verbose: bool = False):
        with open(path, "r", encoding="utf-8") as f:
            data = yaml.safe_load(f)

        self.version: str = data["version"]
        self.output_path_xjb: str = data["output_path_xjb"]
        self.output_path_domain_check: str = data["output_path_domain_check"]
        self.output_path_domain_checkless: str = data["output_path_domain_checkless"]
        self.output_path_postgresql_comments: str = data["output_path_postgresql_comments"]

        # Special cases
        self.ignore: List[str] = data.get("ignore", [])
        self.transient: List[str] = data.get("transient", [])
        self.embedded: List[str] = data.get("embedded", [])
        self.abstract: List[str] = data.get("abstract", [])

        # Mapping sections
        type
        self.type: MappingSection = MappingSection(**data["type"])
        self.basetype: MappingSection = MappingSection(**data["basetype"])
        self.feature: MappingSection = MappingSection(**data["feature"])
        self.timesliceproperty: MappingSection = MappingSection(**data["timesliceproperty"])
        self.timeslice: MappingSection = MappingSection(**data["timeslice"])
        self.property: MappingSection = MappingSection(**data["property"])
        self.object: MappingSection = MappingSection(**data["object"])
        self.timeslice_extension: MappingSection = MappingSection(**data["timeslice_extension"])
        self.object_extension: MappingSection = MappingSection(**data["object_extension"])

        self.XSD_TO_PG_TYPES = {
            "string": "TEXT",
            "token": "TEXT",
            "normalizedString": "TEXT",
            "anyURI": "TEXT",
            "decimal": "NUMERIC",
            "float": "REAL",
            "double": "DOUBLE PRECISION",
            "integer": "BIGINT",
            "long": "BIGINT",
            "int": "INTEGER",
            "short": "SMALLINT",
            "unsignedInt": "BIGINT",
            "unsignedLong": "NUMERIC(20,0)",
            "unsignedShort": "INTEGER",
            "positiveInteger": "BIGINT",
            "nonNegativeInteger": "BIGINT",
            "boolean": "BOOLEAN",
            "dateTime": "TIMESTAMPTZ",
            "date": "DATE",
            "time": "TIME",
        }

        self.SQL_NON_RESERVED_KEY_WORD: List[str] = [
            "ABORT",
            "ABSENT",
            "ABSOLUTE",
            "ACCESS",
            "ACTION",
            "ADD",
            "ADMIN",
            "AFTER",
            "AGGREGATE",
            "ALSO",
            "ALTER",
            "ALWAYS",
            "ASENSITIVE",
            "ASSERTION",
            "ASSIGNMENT",
            "AT",
            "ATOMIC",
            "ATTACH",
            "ATTRIBUTE",
            "BACKWARD",
            "BEFORE",
            "BEGIN",
            "BETWEEN",
            "BIGINT",
            "BIT",
            "BOOLEAN",
            "BREADTH",
            "BY",
            "CACHE",
            "CALL",
            "CALLED",
            "CASCADE",
            "CASCADED",
            "CATALOG",
            "CHAIN",
            "CHAR",
            "CHARACTER",
            "CHARACTERISTICS",
            "CHECKPOINT",
            "CLASS",
            "CLOSE",
            "CLUSTER",
            "COALESCE",
            "COLUMNS",
            "COMMENT",
            "COMMENTS",
            "COMMIT",
            "COMMITTED",
            "COMPRESSION",
            "CONDITIONAL",
            "CONFIGURATION",
            "CONFLICT",
            "CONNECTION",
            "CONSTRAINTS",
            "CONTENT",
            "CONTINUE",
            "CONVERSION",
            "COPY",
            "COST",
            "CSV",
            "CUBE",
            "CURRENT",
            "CURSOR",
            "CYCLE",
            "DATA",
            "DATABASE",
            "DAY",
            "DEALLOCATE",
            "DEC",
            "DECIMAL",
            "DECLARE",
            "DEFAULTS",
            "DEFERRED",
            "DEFINER",
            "DELETE",
            "DELIMITER",
            "DELIMITERS",
            "DEPENDS",
            "DEPTH",
            "DETACH",
            "DICTIONARY",
            "DISABLE",
            "DISCARD",
            "DOCUMENT",
            "DOMAIN",
            "DOUBLE",
            "DROP",
            "EACH",
            "EMPTY",
            "ENABLE",
            "ENCODING",
            "ENCRYPTED",
            "ENUM",
            "ERROR",
            "ESCAPE",
            "EVENT",
            "EXCLUDE",
            "EXCLUDING",
            "EXCLUSIVE",
            "EXECUTE",
            "EXISTS",
            "EXPLAIN",
            "EXPRESSION",
            "EXTENSION",
            "EXTERNAL",
            "EXTRACT",
            "FAMILY",
            "FILTER",
            "FINALIZE",
            "FIRST",
            "FLOAT",
            "FOLLOWING",
            "FORCE",
            "FORMAT",
            "FORWARD",
            "FUNCTION",
            "FUNCTIONS",
            "GENERATED",
            "GLOBAL",
            "GRANTED",
            "GREATEST",
            "GROUPING",
            "GROUPS",
            "HANDLER",
            "HEADER",
            "HOLD",
            "HOUR",
            "IDENTITY",
            "IF",
            "IMMEDIATE",
            "IMMUTABLE",
            "IMPLICIT",
            "IMPORT",
            "INCLUDE",
            "INCLUDING",
            "INCREMENT",
            "INDENT",
            "INDEX",
            "INDEXES",
            "INHERIT",
            "INHERITS",
            "INLINE",
            "INOUT",
            "INPUT",
            "INSENSITIVE",
            "INSERT",
            "INSTEAD",
            "INT",
            "INTEGER",
            "INTERVAL",
            "INVOKER",
            "ISOLATION",
            "JSON",
            "JSON_ARRAY",
            "JSON_ARRAYAGG",
            "JSON_EXISTS",
            "JSON_OBJECT",
            "JSON_OBJECTAGG",
            "JSON_QUERY",
            "JSON_SCALAR",
            "JSON_SERIALIZE",
            "JSON_TABLE",
            "JSON_VALUE",
            "KEEP",
            "KEY",
            "KEYS",
            "LABEL",
            "LANGUAGE",
            "LARGE",
            "LAST",
            "LEAKPROOF",
            "LEAST",
            "LEVEL",
            "LISTEN",
            "LOAD",
            "LOCAL",
            "LOCATION",
            "LOCK",
            "LOCKED",
            "LOGGED",
            "MAPPING",
            "MATCH",
            "MATCHED",
            "MATERIALIZED",
            "MAXVALUE",
            "MERGE",
            "MERGE_ACTION",
            "METHOD",
            "MINUTE",
            "MINVALUE",
            "MODE",
            "MONTH",
            "MOVE",
            "NAME",
            "NAMES",
            "NATIONAL",
            "NCHAR",
            "NESTED",
            "NEW",
            "NEXT",
            "NFC",
            "NFD",
            "NFKC",
            "NFKD",
            "NO",
            "NONE",
            "NORMALIZE",
            "NORMALIZED",
            "NOTHING",
            "NOTIFY",
            "NOWAIT",
            "NULLIF",
            "NULLS",
            "NUMERIC",
            "OBJECT",
            "OF",
            "OFF",
            "OIDS",
            "OLD",
            "OMIT",
            "OPERATOR",
            "OPTION",
            "OPTIONS",
            "ORDINALITY",
            "OTHERS",
            "OUT",
            "OVER",
            "OVERLAY",
            "OVERRIDING",
            "OWNED",
            "OWNER",
            "PARALLEL",
            "PARAMETER",
            "PARSER",
            "PARTIAL",
            "PARTITION",
            "PASSING",
            "PASSWORD",
            "PATH",
            "PLAN",
            "PLANS",
            "POLICY",
            "POSITION",
            "PRECEDING",
            "PRECISION",
            "PREPARE",
            "PREPARED",
            "PRESERVE",
            "PRIOR",
            "PRIVILEGES",
            "PROCEDURAL",
            "PROCEDURE",
            "PROCEDURES",
            "PROGRAM",
            "PUBLICATION",
            "QUOTE",
            "QUOTES",
            "RANGE",
            "READ",
            "REAL",
            "REASSIGN",
            "RECHECK",
            "RECURSIVE",
            "REF",
            "REFERENCING",
            "REFRESH",
            "REINDEX",
            "RELATIVE",
            "RELEASE",
            "RENAME",
            "REPEATABLE",
            "REPLACE",
            "REPLICA",
            "RESET",
            "RESTART",
            "RESTRICT",
            "RETURN",
            "RETURNS",
            "REVOKE",
            "ROLE",
            "ROLLBACK",
            "ROLLUP",
            "ROUTINE",
            "ROUTINES",
            "ROW",
            "ROWS",
            "RULE",
            "SAVEPOINT",
            "SCALAR",
            "SCHEMA",
            "SCHEMAS",
            "SCROLL",
            "SEARCH",
            "SECOND",
            "SECURITY",
            "SEQUENCE",
            "SEQUENCES",
            "SERIALIZABLE",
            "SERVER",
            "SESSION",
            "SET",
            "SETOF",
            "SETS",
            "SHARE",
            "SHOW",
            "SIMPLE",
            "SKIP",
            "SMALLINT",
            "SNAPSHOT",
            "SOURCE",
            "SQL",
            "STABLE",
            "STANDALONE",
            "START",
            "STATEMENT",
            "STATISTICS",
            "STDIN",
            "STDOUT",
            "STORAGE",
            "STORED",
            "STRICT",
            "STRING",
            "STRIP",
            "SUBSCRIPTION",
            "SUBSTRING",
            "SUPPORT",
            "SYSID",
            "SYSTEM",
            "TABLES",
            "TABLESPACE",
            "TARGET",
            "TEMP",
            "TEMPLATE",
            "TEMPORARY",
            "TEXT",
            "TIES",
            "TIME",
            "TIMESTAMP",
            "TRANSACTION",
            "TRANSFORM",
            "TREAT",
            "TRIGGER",
            "TRIM",
            "TRUNCATE",
            "TRUSTED",
            "TYPE",
            "TYPES",
            "UESCAPE",
            "UNBOUNDED",
            "UNCOMMITTED",
            "UNCONDITIONAL",
            "UNENCRYPTED",
            "UNKNOWN",
            "UNLISTEN",
            "UNLOGGED",
            "UNTIL",
            "UPDATE",
            "VACUUM",
            "VALID",
            "VALIDATE",
            "VALIDATOR",
            "VALUE",
            "VALUES",
            "VARCHAR",
            "VARYING",
            "VERSION",
            "VIEW",
            "VIEWS",
            "VOLATILE",
            "WHITESPACE",
            "WITHIN",
            "WITHOUT",
            "WORK",
            "WRAPPER",
            "WRITE",
            "XML",
            "XMLATTRIBUTES",
            "XMLCONCAT",
            "XMLELEMENT",
            "XMLEXISTS",
            "XMLFOREST",
            "XMLNAMESPACES",
            "XMLPARSE",
            "XMLPI",
            "XMLROOT",
            "XMLSERIALIZE",
            "XMLTABLE",
            "YEAR",
            "YES",
            "ZONE"
        ]

        self.SQL_RESERVED_KEY_WORD: List[str] = [
            "ALL",
            "ANALYSE",
            "ANALYZE",
            "AND",
            "ANY",
            "ARRAY",
            "AS",
            "ASC",
            "ASYMMETRIC",
            "AUTHORIZATION",
            "BINARY",
            "BOTH",
            "CASE",
            "CAST",
            "CHECK",
            "COLLATE",
            "COLLATION",
            "COLUMN",
            "CONCURRENTLY",
            "CONSTRAINT",
            "CREATE",
            "CROSS",
            "CURRENT_CATALOG",
            "CURRENT_DATE",
            "CURRENT_ROLE",
            "CURRENT_SCHEMA",
            "CURRENT_TIME",
            "CURRENT_TIMESTAMP",
            "CURRENT_USER",
            "DEFAULT",
            "DEFERRABLE",
            "DESC",
            "DISTINCT",
            "DO",
            "ELSE",
            "END",
            "EXCEPT",
            "FALSE",
            "FETCH",
            "FOR",
            "FOREIGN",
            "FREEZE",
            "FROM",
            "FULL",
            "GRANT",
            "GROUP",
            "HAVING",
            "ILIKE",
            "IN",
            "INITIALLY",
            "INNER",
            "INTERSECT",
            "INTO",
            "IS",
            "ISNULL",
            "JOIN",
            "LATERAL",
            "LEADING",
            "LEFT",
            "LIKE",
            "LIMIT",
            "LOCALTIME",
            "LOCALTIMESTAMP",
            "NATURAL",
            "NOT",
            "NOTNULL",
            "NULL",
            "OFFSET",
            "ON",
            "ONLY",
            "OR",
            "ORDER",
            "OUTER",
            "OVERLAPS",
            "PLACING",
            "PRIMARY",
            "REFERENCES",
            "RETURNING",
            "RIGHT",
            "SELECT",
            "SESSION_USER",
            "SIMILAR",
            "SOME",
            "SYMMETRIC",
            "SYSTEM_USER",
            "TABLE",
            "TABLESAMPLE",
            "THEN",
            "TO",
            "TRAILING",
            "TRUE",
            "UNION",
            "UNIQUE",
            "USER",
            "USING",
            "VARIADIC",
            "VERBOSE",
            "WHEN",
            "WHERE",
            "WINDOW",
            "WITH"
        ]

    @staticmethod
    def modify_forbiden_key_word(name: str) -> str:
        if name.upper() in Config().SQL_NON_RESERVED_KEY_WORD:
            name = '\"' + name + '\"'
    
        if name.upper() in Config().SQL_RESERVED_KEY_WORD:
            name += "_"

        return name
    
    @staticmethod
    def simplify_name(name: str) -> str:
        if ":" in name:
            name = name.split(":", 1)[-1]

        # for item in Config().ignore:
        #     name = name.replace(item, "")

        return name
    
    @staticmethod
    def generate_phonetic_acronym(name):
        if not name:
            return ""

        parts = re.split(r'[_ \s]+', name)
        acronym_parts = []
        
        for part in parts:
            if not part: continue
            
            head = part[0].lower()
            tail_consonants = re.findall(r'[^aeiouy]', part[1:])
            word_acronym = head + "".join(tail_consonants)
            acronym_parts.append(word_acronym)
        
        full_acronym = "".join(acronym_parts)
        
        return full_acronym.lower()
    
    @staticmethod
    def get_abstract() -> List[str]:
        return Config().abstract
    
    @staticmethod
    def get_embedded() -> List[str]:
        return Config().embedded
    
    @staticmethod
    def get_ignore() -> List[str]:
        return Config().ignore
    
    @staticmethod
    def get_transient() -> List[str]:
        return Config().transient
        
    @staticmethod
    def get_output_path_xjb() -> str:
        return Config().output_path_xjb

    @staticmethod
    def get_output_path_domain_check() -> str:
        return Config().output_path_domain_check

    @staticmethod
    def get_output_path_domain_checkless() -> str:
        return Config().output_path_domain_checkless

    @staticmethod
    def get_output_path_postgresql_comments() -> str:
        return Config().output_path_postgresql_comments
    
    @staticmethod
    def get_version() -> str:
        return Config().version
    
    @staticmethod
    def get_embed_by_type(type) -> str:
        if type is None:
            raise KeyError(f"Embedable type {type} is None")
        
        type = Config().simplify_name(type)
        if type in Config().embedded:
            return Config().embedded[type]
        else:
            return None

    @staticmethod
    def generate_database_name(xsdname: str) -> str:
        try: 
            xsdname = xsdname.split(':')[-1]
        except:
            pass

        xsdname = xsdname.replace("_","")

        key = []
        value = []
        dbname= []

        if xsdname in Config().type.list:
            key.append(Config().type.replace)
            value.append(Config().type.prefix)
            dbname.append(xsdname)

        if xsdname in Config().basetype.list:
            key.append(Config().basetype.replace)
            value.append(Config().basetype.prefix)
            dbname.append(xsdname)

        if xsdname in Config().feature.list:
            key.append(Config().feature.replace)
            value.append(Config().feature.prefix)
            dbname.append(xsdname)

        if xsdname in Config().timesliceproperty.list:
            key.append(Config().timesliceproperty.replace)
            value.append(Config().timesliceproperty.prefix)
            dbname.append(xsdname)

        if xsdname in Config().timeslice.list:
            key.append(Config().timeslice.replace)
            value.append(Config().timeslice.prefix) 
            dbname.append(xsdname)

        if xsdname in Config().property.list:
            key.append(Config().property.replace)
            value.append(Config().property.prefix)
            dbname.append(xsdname)

        if xsdname in Config().object.list:
            key.append(Config().object.replace)
            value.append(Config().object.prefix)
            dbname.append(xsdname)

        if xsdname in Config().timeslice_extension.list:
            key.append(Config().timeslice_extension.replace)
            value.append(Config().timeslice_extension.prefix)
            dbname.append(xsdname)

        if xsdname in Config().object_extension.list:
            key.append(Config().object_extension.replace)
            value.append(Config().object_extension.prefix)
            dbname.append(xsdname)

        if len(dbname) == 0 or len(key) == 0 or len(value) == 0 :
            return Config().modify_forbiden_key_word(xsdname).lower()
        
        elif len(dbname) > 1 or len(key) > 1 or len(value) > 1 :
            raise Exception("Multiple matches found for: " + xsdname + " as " + str(dbname))
        
        else : 
            # Replace commonn names with abreviations (e.g. Type -> f)
            dbname = dbname[0].replace(key[0], value[0])
            dbname = re.sub('(.)([A-Z][a-z]+)', r'\1\2', dbname)
            dbname = re.sub('([a-z0-9])([A-Z])', r'\1\2', dbname).lower()
            return Config().modify_forbiden_key_word(dbname)

    

