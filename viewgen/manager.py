from lib.interaction_machinery import InteractionMachinery



parsing = {
    "table": {
        "method": r'@Table\(name = "([A-Z|a-z|0-9|_]+)", schema = "([A-Z|a-z|0-9|_]+)',
        "ignore": [],
    },
    "class" : {
        "method" : r'public\s+(?:(?:abstract|static|final|strictfp)\s+)*?(?:class|enum)\s+([A-Za-z0-9_]+)',
        "ignore" : []
    },
    "extends" : {
        "method" : r'extends ([A-Z|a-z|0-9|_]+)',
        "ignore" : []
    },
    "column" : {
        "method" : r'    @Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\)',
        "ignore" : [],
    },
    "embedded_three": {
        "method": r'@AttributeOverrides\({\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*\n.*public ([A-Z|a-z|0-9|_]+) ([A-Z|a-z|0-9|_]+)',
        "ignore": [],
    },
    "embedded_two" : {
        "method" : r'@AttributeOverrides\({\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*\n.*public ([A-Z|a-z|0-9|_]+) ([A-Z|a-z|0-9|_]+)',
        "ignore" : [],
    },
    "one_to_one": {
        "method": r'@JoinTable\(name = \"([A-Z|a-z|0-9|_]+)\", schema = \"([A-Z|a-z|0-9|_]+)\".*\n.*\(name = \"([A-Z|a-z|0-9|_]+).*\n.*\n.*\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*\n.*public ([A-Z|a-z|0-9|_]+) ([A-Z|a-z|0-9|_]+)',
        "ignore": [],
    },
    "one_to_many": {
        "method": r'@JoinTable\(name = \"([A-Z|a-z|0-9|_]+)\", schema = \"([A-Z|a-z|0-9|_]+)\".*\n.*\(name = \"([A-Z|a-z|0-9|_]+).*\n.*\n.*\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*\n.*public List<([A-Z|a-z|0-9|_]+)> ([A-Z|a-z|0-9|_]+)',
        "ignore": [],
    }
}

InteractionMachinery(
    parsing,
    "delorean-aixm-51/src/main/pre-jaxb/pre-jaxb-config_a51.yaml", 
    "delorean-aixm-51/src/main/resources/sql/delorean-aixm-51-view.sql", 
    "delorean-aixm-51/src/main/java/com/delorean/aixm/aixm51/schema")

# InteractionMachinery("a5_1", parsing,"viewgen/version/a5_1","delorean-aixm-51/src/main/resources/a5_1", "delorean-aixm-51/src/main/java/com/aixm/delorean/aixm51/schema")