from copy import deepcopy
from lxml import etree
import argparse


XSD_NS = "http://www.w3.org/2001/XMLSchema"
NSMAP = {"xs": XSD_NS}

def main():
    parser = argparse.ArgumentParser(description="XSD Inliner")
    parser.add_argument("--input", help="Path to input XSD file")
    parser.add_argument("--output", help="Path to output XSD file with inlined groups")
    args = parser.parse_args()

    input_path = args.input
    output_path = args.output

    parser = etree.XMLParser(remove_blank_text=True)
    tree = etree.parse(input_path, parser)
    root = tree.getroot()

    group_map = build_group_map(root)
    inline_group_refs(root, group_map)
    remove_group_definitions(root)

    tree.write(output_path, pretty_print=True, xml_declaration=True, encoding="UTF-8")

def qname(tag: str) -> str:
    return f"{{{XSD_NS}}}{tag}"

def build_group_map(root):
    """Map group name -> list of elements inside its sequence/choice"""
    group_map = {}

    for group in root.findall("xs:group[@name]", NSMAP):
        name = group.get("name")

        # A group can contain sequence, choice, or all
        container = None
        for tag in ("sequence", "choice", "all"):
            container = group.find(f"xs:{tag}", NSMAP)
            if container is not None:
                break

        if container is None:
            continue

        # Store deep copies of children to reuse safely
        group_map[name] = [deepcopy(child) for child in container]

    return group_map

def inline_group_refs(root, group_map):
    """Replace <group ref="..."> with the group's actual content"""
    for group_ref in root.findall(".//xs:group[@ref]", NSMAP):
        ref_name = group_ref.get("ref").split(":")[-1]

        if ref_name not in group_map:
            print(f"⚠ Group definition not found for ref: {ref_name}")
            continue

        parent = group_ref.getparent()
        index = parent.index(group_ref)

        # Insert group content in the same position
        for element in group_map[ref_name]:
            parent.insert(index, deepcopy(element))
            index += 1

        # Remove the original <group ref>
        parent.remove(group_ref)

def remove_group_definitions(root):
    """Remove <xs:group name="..."> definitions from the root"""
    for group in root.findall("xs:group[@name]", NSMAP):
        parent = group.getparent()
        if parent is not None:
            parent.remove(group)

if __name__ == "__main__":
    main()