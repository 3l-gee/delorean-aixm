from collections import defaultdict
import sys
from copy import deepcopy
from lxml import etree
import argparse
import json


NAMESPACES = {
    "uml": "http://schema.omg.org/spec/UML/2.0",
    "xmi": "http://schema.omg.org/spec/XMI/2.1"
}

def main():
    parser = argparse.ArgumentParser(description="XMI schema and class parser")
    parser.add_argument("--input", required=True, help="Path to input XMI file")
    parser.add_argument("--output", help="Path to output file (optional)")

    args = parser.parse_args()
    result = extract_themes(args.input)

    if args.output:
        with open(args.output, 'w') as f:
            json.dump(result, f, indent=2)
    else:
        print(json.dumps(result, indent=2))

def extract_themes(xmi_path):
    parser = etree.XMLParser(remove_blank_text=True)
    tree = etree.parse(xmi_path, parser)
    root = tree.getroot()

    themes = defaultdict(list)

    # Find "AIXM Features" package
    aixm_features = root.find(
        ".//ownedMember[@name='AIXM Features']",
        NAMESPACES
    )

    if aixm_features is None:
        print("AIXM Features package not found")
        return {}

    # Iterate over sub-packages (themes)
    for theme_pkg in aixm_features.findall(
        "./ownedMember[@xmi:type='uml:Package']",
        NAMESPACES):
        theme_name = theme_pkg.get("name")

        # Find classes inside the theme
        for cls in theme_pkg.xpath(
            ".//ownedMember[@xmi:type='uml:Class' or @xmi:type='uml:AssociationClass']", namespaces=NAMESPACES):
            class_name = cls.get("name")
            if class_name:
                themes[theme_name].append(class_name)

    return dict(themes)

if __name__ == "__main__":
    main()