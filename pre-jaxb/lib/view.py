import yaml

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

class View(metaclass=SingletonMeta):
    def __init__(self, yaml_path: str):
        """Initialize View with a YAML file containing schema definitions."""
        self.schema = self._load_yaml(yaml_path)
        self.feature_to_schema = {}
        self.removable_suffix = {
            "TimeSlicePropertyType": "",
            "PropertyGroup": "",
            "PropertyType": "",
            "TimeSliceType": "",
            "TimeSlice": "",
            "Type": "",
        }
        self.list = set()

        for key, value in self.schema.items():
            for item in value.get("list", []):
                self.feature_to_schema[item] = {
                    "prefix": value.get("prefix"),
                    "schema": value.get("schema"),
                    "suffix": value.get("suffix"),
                }

    @staticmethod
    def _load_yaml(path: str) -> dict:
        """Load YAML schema from file."""
        with open(path, "r", encoding="utf-8") as f:
            return yaml.safe_load(f)

    @staticmethod
    def get_schema(name_ori: str):
        """Return schema name for a given feature."""
        instance = View._instances.get(View)
        if instance is None:
            raise RuntimeError("View instance not initialized. Call View(yaml_path) first.")

        name = name_ori
        for key, value in instance.removable_suffix.items():
            name = name.replace(key, value)

        if name not in instance.feature_to_schema:
            return "public"

        instance.list.add(f"{instance.feature_to_schema[name]}.{name}")
        return instance.feature_to_schema[name]["schema"]
    
    @staticmethod
    def get_suffix(name_ori: str):
        """Return suffix for a given feature."""
        instance = View._instances.get(View)
        if instance is None:
            raise RuntimeError("View instance not initialized. Call View(yaml_path) first.")

        name = name_ori
        for key, value in instance.removable_suffix.items():
            name = name.replace(key, value)

        if name not in instance.feature_to_schema:
            return None

        return instance.feature_to_schema[name]["suffix"]


