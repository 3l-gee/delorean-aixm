from lib.layer import View, HeleperFunction


# SELECT distinct on  (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
# aixm.aixm_message.hjid as message_id,
# aixm.aixm_message.id as message_tid,
# aixm.aixm_message.identifier as message_tidentifier,
# aixm.aixm_feature.hjid as feature_id,
# aixm.aixm_feature.id as feature_tid,
# aixm.aixm_feature.identifier,
# aixm.aixm_timeslice.id as timeslice_id,
# aixm.aixm_timeslice.hjid as timeslice_tid,
# aixm.aixm_timeslice.interpretation,
# aixm.aixm_timeslice.sequence_number,
# aixm.aixm_timeslice.correction_number,
# aixm.aixm_timeslice.feature_lifetime_begin,
# aixm.aixm_timeslice.feature_lifetime_end,
# aixm.aixm_timeslice.valid_time_begin,
# aixm.aixm_timeslice.valid_time_end,
# *
# FROM aixm.aixm_feature
# INNER JOIN navaids_point.dme_f ON aixm.aixm_feature.hjid = navaids_point.dme_f.hjid
# INNER JOIN navaids_point.dme_tp ON aixm.aixm_feature.hjid = navaids_point.dme_tp.timeslice_hjid
# INNER JOIN navaids_point.dme_t ON navaids_point.dme_tp.dmetimeslice_hjid = navaids_point.dme_t.hjid
# INNER JOIN aixm.aixm_timeslice ON navaids_point.dme_t.hjid = aixm.aixm_timeslice.hjid
# INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
# INNER JOIN aixm.message_member_link ON aixm.message_member.hjid = aixm.message_member_link.member_hjid
# INNER JOIN aixm.aixm_message ON aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
# -- WHERE aixm.aixm_message.hjid =1
# -- WHERE 
# -- aixm.aixm_feature.lifecycle_status = 'APPROVED' 
# -- AND 
# -- aixm.aixm_timeslice.lifecycle_status = 'APPROVED' 
# ORDER BY aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number DESC, aixm.aixm_timeslice.correction_number DESC;

class Feature(View) :

    def __init__(self, type, schema):
        self.layer_type = "feature"
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
            "where": self.generate_where(),
            "group": self.generate_group(self.name, schema),
            "order": self.generate_order(self.name, schema),
            "index" : [f"create index if not exists {self.schema}_{self.name}_id on {self.schema}.{self.name}_view (id)"]
        }

    def get_name(self):
        return f"{self.schema}.{self.name}_view"

    def generate_view(self, name, schema) :
        return [
            f"drop view if exists {schema}.{name}_view cascade;",
            f"create view {schema}.{name}_view as"
            ]

    def generate_select(self, name, schema) :
        return [f"select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)"]
   
    def generate_attributes(self, name, schema) : 
        res = [
            "(row_number() over ())::integer as row",
            "aixm.aixm_message.hjid as message_id",
            "aixm.aixm_message.id as message_tid",
            "aixm.aixm_message.identifier as message_tidentifier",
            "aixm.aixm_feature.hjid",
            "aixm.aixm_feature.id as feature_tid",
            "aixm.aixm_feature.identifier",
            "aixm.aixm_timeslice.id as timeslice_id",
            "aixm.aixm_timeslice.hjid as timeslice_tid",
            "aixm.aixm_timeslice.interpretation",
            "aixm.aixm_timeslice.sequence_number",
            "aixm.aixm_timeslice.correction_number",
            "aixm.aixm_timeslice.feature_lifetime_begin",
            "aixm.aixm_timeslice.feature_lifetime_end",
            "aixm.aixm_timeslice.valid_time_begin",
            "aixm.aixm_timeslice.valid_time_end"
        ]

        return res
        
    def generate_inner(self, name, schema) : 
        return [
            f"from aixm.aixm_feature",
            f"inner join {schema}.{name}_f on aixm.aixm_feature.hjid = {schema}.{name}_f.hjid",
            f"inner join {schema}.{name}_tp on aixm.aixm_feature.hjid = {schema}.{name}_tp.timeslice_hjid",
            f"inner join {schema}.{name}_t on {schema}.{name}_tp.{name}timeslice_hjid = {schema}.{name}_t.hjid",
            f"inner join aixm.aixm_timeslice on {schema}.{name}_t.hjid = aixm.aixm_timeslice.hjid",
            f"inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid",
            f"inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid",
            f"inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid"
        ]

    def generate_left(self, name, schema) :
        return [
        ]

    def generate_where(self) : 
        return [
            f"aixm.aixm_feature.lifecycle_status = 'APPROVED'",
            f"aixm.aixm_timeslice.lifecycle_status = 'APPROVED'"
        ]
    
    def generate_order(self, name, schema) : 
        return [
            f"order by aixm.aixm_feature.identifier",
            f"aixm.aixm_timeslice.sequence_number desc",
            f"aixm.aixm_timeslice.correction_number desc"
        ]
    
    def generate_group(self, name, schema) :
        res = [f"{schema}.{name}.id"]
        res.append(f"{schema}.{name}_t.id")
        res.append(f"{schema}.{name}_tp.id")
        res.append(f"aixm.aixm_feature.identifier.identifier")
        res.append(f"aixm.aixm_timeslice.interpretation")
        res.append(f"aixm.aixm_timeslice.sequence_number")
        res.append(f"aixm.aixm_timeslice.correction_number")        
        res.append(f"aixm.aixm_timeslice.valid_time_begin")
        res.append(f"aixm.aixm_timeslice.valid_time_end")
        res.append(f"aixm.aixm_timeslice.feature_lifetime_begin")
        res.append(f"aixm.aixm_timeslice.feature_lifetime_end")
        return res 

    def add_attributes_two(self, name, role, value, nil) :
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{value}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{nil}") 
        self.add_group(str(self.name + "_t"), value, self.schema)
        self.add_group(str(self.name + "_t"), nil, self.schema)
        
    def add_attributes_three(self, type, role, value, uom, nil) :
        name = HeleperFunction.remove_suffix(type)
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{value}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{uom}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{nil}") 
        self.add_group(str(self.name + "_t"), value, self.schema)
        self.add_group(str(self.name + "_t"), uom, self.schema)
        self.add_group(str(self.name + "_t"), nil, self.schema)

    def add_association_feature_one(self, schema, type, role, col, ref_types = None):
        if ref_types is None:
            ref_types = []

        ref_types.append(type.replace("Property",""))

        name = HeleperFunction.remove_suffix(type)

        if not self.attributes["attributes"].get(type):
            self.attributes["attributes"][type] = []

        hash = self.generate_letter_hash(str(schema + "_" + name + "_pt"))

        self.attributes["attributes"][type].extend([
            f"coalesce(cast({hash}.title as varchar), '(' || {hash}.nilreason[1] || ')')::text AS {role}",
            f"{hash}.href::text AS {role}_href"
        ])
        
        self.add_group(hash, "title")
        self.add_group(hash, "nilreason[1]")
        self.add_group(hash, "href")

        self.attributes["left"].append(f"left join {schema}.{name}_pt {hash} on {self.schema}.{self.name}_t.{col} = {hash}.id")
    
    def add_association_object_one(self, schema, type, role, col):
        name = HeleperFunction.remove_suffix(type)

        self.dependecy.add(f"{schema}.{name}_view")
        if not self.attributes["attributes"].get(type):
            self.attributes["attributes"][type] = []

        hash = self.generate_letter_hash(str(schema + "_" + name + "_view"))

        self.attributes["attributes"][type].extend([
            f"{hash}.id AS {role}",
            f"{hash}.annotation::jsonb AS {role}_annotation"
        ])

        self.add_group(hash, "id")

        self.attributes["left"].append(f"left join {schema}.{name}_view {hash} on {self.schema}.{self.name}_t.{col} = {hash}.id")

    def add_association_feature_many(self, schema, type, role, ref_types = None):
        if ref_types is None:
            ref_types = []

        ref_types.append(type.replace("Property",""))

        name = HeleperFunction.remove_suffix(type)

        if not self.attributes["attributes"].get(type):
            self.attributes["attributes"][type] = []

        hash_one = self.generate_letter_hash(str("master_join"))
        hash_two = self.generate_letter_hash(str(schema + "_" + name + "_lat"))
        hash_three = self.generate_letter_hash(str(schema + "_" + name + "_pt"))

        self.attributes["lateral"].extend([
            f"left join lateral(",
            f"  select jsonb_agg(DISTINCT jsonb_build_object(",
            f"      'id', {hash_two}.id,",
            f"      'title', coalesce(cast({hash_two}.title AS varchar), '(' || {hash_two}.nilreason[1] || ')'),",
            f"      'href', {hash_two}.href",
            f"  )) as {role}"
            f"  from master_join {hash_one}",
            f"  join {schema}.{name}_pt {hash_two} on {hash_one}.target_id = {hash_two}.id",
            f"  where {hash_one}.source_id = {self.schema}.{self.name}_t.id",
            f") as {hash_three} on TRUE"
        ])

        self.attributes["attributes"][type].extend([
            f"{hash_three}.{role}::jsonb as {role}"
        ])

    def add_association_object_many(self, schema, type, role):
        name = HeleperFunction.remove_suffix(type)

        self.dependecy.add(f"{schema}.{name}_view")
        if not self.attributes["attributes"].get(type):
            self.attributes["attributes"][type] = []

        hash_one = self.generate_letter_hash(str("master_join"))
        hash_two = self.generate_letter_hash(str(schema + "_" + name + "_lat"))
        hash_three = self.generate_letter_hash(str(schema + "_" + name + "_view"))

        self.attributes["lateral"].extend([
            f"left join lateral(",
            f"  select jsonb_agg(DISTINCT {hash_two}.id) as {role}",
            f"  from master_join {hash_one}",
            f"  join {schema}.{name}_view {hash_two} on {hash_one}.target_id = {hash_two}.id",
            f"  where {hash_one}.source_id = {self.schema}.{self.name}_t.id",
            f") as {hash_three} on TRUE"
        ])

        self.attributes["attributes"][type].extend([
            f"{hash_three}.{role}::jsonb as {role}",
        ])

    def add_association_snowflake_one(self, schema, type, publish_param, attribute, col, role):
        name = HeleperFunction.remove_suffix(type)

        self.dependecy.add(f"{schema}.{name}_view")
        if not self.attributes["attributes"].get(type):
            self.attributes["attributes"][type] = []

        hash = self.generate_letter_hash(str(schema + "_" + name + "_view"))

        formatted_attribute = [attr.format(alias=hash, role=role) for attr in attribute]

        self.attributes["attributes"][type].extend(formatted_attribute)

        self.attributes["left"].append(f"left join {schema}.{name}_view {hash} on {self.schema}.{self.name}_t.{col} = {hash}.id")

    def add_association_snowflake_many(self, schema, type, publish_param, argument, attribute, col, role):
        name = HeleperFunction.remove_suffix(type)

        self.dependecy.add(f"{schema}.{name}_view")
        if not self.attributes["attributes"].get(type):
            self.attributes["attributes"][type] = []

        hash_one = self.generate_letter_hash(str("master_join"))
        hash_two = self.generate_letter_hash(str(schema + "_" + name + "_lat"))
        hash_three = self.generate_letter_hash(str(schema + "_" + name + "_view"))

        formatted_attribute = [attr.format(alias=hash_three, name=name, role=role) for attr in attribute]
        formatted_argument = ["    " + arg.format(alias=hash_two, name=name, role=role) for arg in argument]

        self.attributes["attributes"][type].extend(formatted_attribute)

        self.attributes["lateral"].extend([
            f"left join lateral(",
            f"  select"
        ])

        self.attributes["lateral"].extend(formatted_argument)

        self.attributes["lateral"].extend([
            f"  from master_join {hash_one}",
            f"  join {schema}.{name}_view {hash_two} on {hash_one}.target_id = {hash_two}.id",
            f"  where {hash_one}.source_id = {self.schema}.{self.name}_t.id",
            f") as {hash_three} on TRUE"
        ])

        if publish_param.get("geometry") :
            self.attributes["index"].append(f"create index on {self.schema}.{self.name}_view using gist ({hash_three}.geom)")