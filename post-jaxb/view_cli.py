from lib.interaction_machinery import InteractionMachinery
import argparse

# Default regex parsing configuration
PARSING_CONFIG = {
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
    "embedded_four": {
        "method": r'@AttributeOverrides\({\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*@Column\(name = \"([A-Z|a-z|0-9|_]+)\".*\n.*\n.*public ([A-Z|a-z|0-9|_]+) ([A-Z|a-z|0-9|_]+)',
        "ignore": [],
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

def main():
    parser = argparse.ArgumentParser(description="Run InteractionMachinery SQL view generation.")
    
    parser.add_argument(
        "--config",
        required=True, 
        help="Path to pre-jaxb YAML configuration file"
    )
    parser.add_argument(
        "--output_view_sql", 
        required=True, 
        help="Output path for generated View SQL file"
    )

    parser.add_argument(
        "--output_materialized_sql",
        required=True, 
        help="Output path for generated Materialized SQL file"
    )

    parser.add_argument(
        "--directory",
        required=True, 
        help="Directory containing generated JAXB Java schema sources"
    )

    args = parser.parse_args()

    InteractionMachinery(
        PARSING_CONFIG,
        args.config,
        args.output_view_sql,
        args.output_materialized_sql,
        args.directory
    )

if __name__ == "__main__":
    main()

# InteractionMachinery(
#     PARSING_CONFIG,
#     "delorean-aixm-51/src/main/pre-jaxb/pre-jaxb-config_a51.yaml", 
#     "delorean-aixm-51/src/main/resources/sql/delorean-aixm-view.sql",
#     "delorean-aixm-51/src/main/resources/sql/delorean-aixm-materialized.sql",
#     "delorean-aixm-51/src/main/java/com/delorean/aixm/aixm51/schema")

# InteractionMachinery(
#     PARSING_CONFIG,
#     "delorean-aixm-511/src/main/pre-jaxb/pre-jaxb-config_a511.yaml", 
#     "delorean-aixm-511/src/main/resources/sql/delorean-aixm-view.sql", 
#     "delorean-aixm-511/src/main/resources/sql/delorean-aixm-materialized.sql", 
#     "delorean-aixm-511/src/main/java/com/delorean/aixm/aixm511/schema")

# InteractionMachinery(
#     PARSING_CONFIG,
#     "delorean-aixm-52/src/main/pre-jaxb/pre-jaxb-config_a52.yaml", 
#     "delorean-aixm-52/src/main/resources/sql/delorean-aixm-view.sql", 
#     "delorean-aixm-52/src/main/resources/sql/delorean-aixm-materialized.sql", 
#     "delorean-aixm-52/src/main/java/com/delorean/aixm/aixm52/schema")

# InteractionMachinery("a5_1", parsing,"viewgen/version/a5_1","delorean-aixm-51/src/main/resources/a5_1", "delorean-aixm-51/src/main/java/com/aixm/delorean/aixm51/schema")