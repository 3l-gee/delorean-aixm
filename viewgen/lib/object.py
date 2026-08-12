from lib.layer import View, HeleperFunction

class Object(View) :

    def __init__(self, type, schema):
        self.layer_type = "property"
        self.dependecy = set()
        self.name = HeleperFunction.remove_suffix(type)
        self.schema = schema
        self.full_sql = ""
        self.attributes = {
            "view": self.generate_view(self.name, schema),
            "select": self.generate_select(self.name, schema),
            "attributes": {
                "feature": self.generate_attributes(self.name, schema)
            },
            "inner": self.generate_inner(self.name, schema),
            "left": self.generate_left(self.name, schema),
            "lateral" : [],
            "where": [],
            "group": self.generate_group(self.name, schema),
            "order": self.generate_order(self.name, schema),
            "index" : [f"create index if not exists {self.schema}_{self.name}_id on {self.schema}.{self.name}_view (id)"]
        }


    def generate_view(self, type, schema) :
        name = HeleperFunction.remove_suffix(type)
        return [
            f"drop view if exists {schema}.{name}_view cascade;",
            f"create view {schema}.{name}_view as"
            ]

    def generate_select(self, name, schema) :
        return [f"select"]
        
    def generate_attributes(self, type, schema) : 
        name = HeleperFunction.remove_suffix(type)
        return [
            f"{schema}.{name}_p.hjid as hjid",
            f"aixm.aixm_property.nil_reason::text AS nilreason",
            f"aixm.aixm_object.id",
            f"aixm.aixm_object.id as object_hjid"
        ]
        
    def generate_inner(self, type, schema) : 
        name = HeleperFunction.remove_suffix(type)
        return [
            f"from {schema}.{name}_p ",
            f"inner join aixm.aixm_property on {schema}.{name}_p.hjid = aixm.aixm_property.hjid",
            f"inner join {schema}.{name}_o on {schema}.{name}_p.{name}_hjid = {schema}.{name}_o.hjid",
            f"inner join aixm.aixm_object on {schema}.{name}_o.hjid = aixm.aixm_object.hjid",
        ]

    def generate_left(self, type, schema) :
        name = HeleperFunction.remove_suffix(type)
        return []

    def generate_where(self, type, schema) : 
        name = HeleperFunction.remove_suffix(type)
        return []
    
    def genrate_order(self, type, schema) : 
        name = HeleperFunction.remove_suffix(type)
        return []
    
    def generate_group(self, type, schema) :
        name = HeleperFunction.remove_suffix(type)
        return [
            f"{schema}.{name}_pt.id",
            f"{schema}.{name}_pt.nilreason"
        ]
        
    def add_attributes_two(self, type, role, value, nil) :
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_o.{value}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_o.{nil}") 
        self.add_group(str(self.name), value, self.schema)
        self.add_group(str(self.name), nil, self.schema)
    
    def add_attributes_three(self, type, role, value, uom, nil) :
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_o.{value}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_o.{uom}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_o.{nil}") 
        self.add_group(str(self.name), value, self.schema)
        self.add_group(str(self.name), uom, self.schema)
        self.add_group(str(self.name), nil, self.schema)
        
    def add_association_feature_one(self, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):
        join_hash = self.generate_letter_hash(join_table_schema)
        target_hash = self.generate_letter_hash(target_table)
        
        self.attributes["attributes"].setdefault(role, []).extend([
            f"jsonb_build_object('href', {target_hash}.href",
            f"'nilreason', {target_hash}.nil_reason",
            f"'title', {target_hash}.simple_link_title) AS {role}"
        ])
        

        self.attributes["left"].extend([
            f"left join {join_table_schema}.{join_table_table} {join_hash} on {self.schema}.{self.name}_o.hjid = {join_hash}.{join_table_column}",
            f"left join {target_schema}.{target_table}_p {target_hash} on {join_hash}.{join_table_revcolumn} = {target_hash}.hjid"
        ])

    def add_association_object_one(self, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):
        join_hash = self.generate_letter_hash(join_table_schema)
        
        self.attributes["attributes"].setdefault(role, []).extend([
            f"jsonb_build_object('hjid', aixm.aixm_property.hjid",
            f"'nilreason', aixm.aixm_property.nil_reason) AS {role}"
        ])

        self.attributes["left"].extend([
            f"left join {join_table_schema}.{join_table_table} {join_hash} on {self.schema}.{self.name}_o.hjid = {join_hash}.{join_table_column}",
            f"left join aixm.aixm_property on {join_hash}.{join_table_revcolumn} = aixm.aixm_property.hjid"
        ])

    def add_association_object_many(self, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):

        self.attributes["attributes"].setdefault(role, []).extend([
            f"(select coalesce(jsonb_agg(jsonb_build_object('hjid', aixm.aixm_property.hjid",
            f"'nilreason', aixm.aixm_property.nil_reason)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join aixm.aixm_property on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = aixm.aixm_property.hjid where {self.schema}.{self.name}_o.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
        ])


    def add_association_feature_many(self, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):
                
        self.attributes["attributes"].setdefault(role, []).extend([
            f"(select coalesce(jsonb_agg(jsonb_build_object('href', {target_schema}.{target_table}_p.href",
            f"'nilreason', {target_schema}.{target_table}_p.nil_reason",
            f"'title', {target_schema}.{target_table}_p.simple_link_title)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join {target_schema}.{target_table}_p on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {target_schema}.{target_table}_p.hjid where {self.schema}.{self.name}_o.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
        ])

    def add_association_snowflake_one(self, schema, type, publish_param, attribute, col, role):
        name = HeleperFunction.remove_suffix(type)
        self.dependecy.add(f"{schema}.{name}_view")

        if not self.attributes["attributes"].get(name):
            self.attributes["attributes"][name] = []

        hash = self.generate_letter_hash(str(schema + "_" + name + "_view"))

        formatted_attribute = [attr.format(alias=hash, role=role) for attr in attribute]

        self.attributes["attributes"][name].extend(formatted_attribute)

        self.attributes["left"].append(f"left join {schema}.{name}_view {hash} on {self.schema}.{self.name}.{col} = {hash}.id")

        self.publish_handler(name, schema, role, hash, publish_param)

        if not self.publish["form"].get(role) :
            self.publish["form"][role] = []
            
        if publish_param.get("form") :
            self.publish["form"][role].extend(HeleperFunction.format_structure(publish_param.get("form"), role=role))

    def add_association_snowflake_many(self, schema, type, publish_param, argument, attribute, col, role):
        name = HeleperFunction.remove_suffix(type)
        self.dependecy.add(f"{schema}.{name}_view")

        if not self.attributes["attributes"].get(name):
            self.attributes["attributes"][name] = []

        hash_one = self.generate_letter_hash(str("master_join"))
        hash_two = self.generate_letter_hash(str(schema + "_" + name + "_lat"))
        hash_three = self.generate_letter_hash(str(schema + "_" + name + "_view"))

        formatted_attribute = [attr.format(alias=hash_three, name=name, role=role) for attr in attribute]
        formatted_argument = ["    " + arg.format(alias=hash_two, name=name, role=role) for arg in argument]

        self.attributes["attributes"][name].extend(formatted_attribute)

        self.attributes["lateral"].extend([
            f"left join lateral(",
            f"  select"
        ])

        self.attributes["lateral"].extend(formatted_argument)

        self.attributes["lateral"].extend([
            f"  from master_join {hash_one}",
            f"  join {schema}.{name}_view {hash_two} on {hash_one}.target_id = {hash_two}.id",
            f"  where {hash_one}.source_id = {self.schema}.{self.name}.id",
            f") as {hash_three} on TRUE"
        ])

        if publish_param.get("geometry") :
            self.attributes["index"].append(f"create index on {self.schema}.{self.name}_view using gist ({hash_three}.geom)")

        self.publish_handler(name, schema, role, hash_three, publish_param)

        if not self.publish["form"].get(role) :
            self.publish["form"][role] = []
            
        if publish_param.get("form") :
            self.publish["form"][role].extend(HeleperFunction.format_structure(publish_param.get("form"), role=role))

        