import os
import json
from unicodedata import name
import yaml
import re
from lxml import etree
from lxml import html

class HeleperFunction:

    @staticmethod
    def load_yaml(path):
        if not os.path.exists(path):
            raise FileNotFoundError(f"'{path}' not found")

        with open(path, 'r', encoding='utf-8') as f:
            try:
                data = yaml.safe_load(f)
                return data
            except yaml.YAMLError as e:
                raise ValueError(f"Invalid YAML in '{path}': {e}")
            
    @staticmethod
    def get_file_path(directory, file_extension, files_to_ignore=None):
        if files_to_ignore is None:
            files_to_ignore = set()

        return [
            os.path.join(directory, f)
            for f in os.listdir(directory)
            if f.endswith(file_extension) and f not in files_to_ignore
        ]
    
    @staticmethod
    def load_java(path):
        if not os.path.exists(path):
            raise FileNotFoundError(f"'{path}' not found")
        
        if not path.endswith('.java'):
            raise ValueError(f"'{path}' is not a Java file")

        with open(path, 'r', encoding='utf-8') as file:
            content = file.read()
        return content

    @staticmethod
    def load_json(path, name):
        file_path = os.path.join(path, name)
        
        if not os.path.exists(file_path):
            raise FileNotFoundError(f"'{name}' not found at: {file_path}")
        
        with open(file_path, 'r', encoding='utf-8') as f:
            try:
                data = json.load(f)
                return data
            except json.JSONDecodeError as e:
                raise ValueError(f"Invalid JSON in '{name}': {e}")
            
    @staticmethod
    def load_xml(path, name):
        file_path = os.path.join(path, name)

        if not os.path.exists(file_path):
            raise FileNotFoundError(f"'{name}' not found at: {file_path}")

        try:
            tree = etree.parse(file_path)
            root = tree.getroot()
            return root
        except etree .XMLSyntaxError  as e:
            raise ValueError(f"Invalid XML in '{name}': {e}")
        
    @staticmethod
    def load_txt(path, name):
        file_path = os.path.join(path, name)

        if not os.path.exists(file_path):
            raise FileNotFoundError(f"'{name}' not found at: {file_path}")

        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                raw_html = f.read()
            return raw_html
        except Exception as e:
            raise ValueError(f"Error loading HTML '{name}': {e}")
        
    @staticmethod
    def format_structure(structure, **kwargs):
        """
        Recursively formats all strings in a nested structure using Python's str.format().
        """
        if isinstance(structure, dict):
            return {k: HeleperFunction.format_structure(v, **kwargs) for k, v in structure.items()}
        elif isinstance(structure, list):
            return [HeleperFunction.format_structure(item, **kwargs) for item in structure]
        elif isinstance(structure, str):
            return structure.format(**kwargs)
        else:
            return structure
        
    @staticmethod
    def remove_suffix(name):
        suffixes = [
            "TimeSlicePropertyType",
            "PropertyType",
            "TimeSliceType",
            "TimeSlice",
            "Type",
        ]

        for suffix in suffixes:
            if name.endswith(suffix):
                name = name[: -len(suffix)]
                break

        return name.lower()

    def role_clean_up(s):
        s = s.replace("get", "").replace("Item", "")
        s = re.sub(r'(?<!^)(?=[A-Z])', '_', s).lower()
        return s




