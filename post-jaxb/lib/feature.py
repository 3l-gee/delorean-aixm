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

    def __init__(self, type, schema, aixm):
        self.layer_type = "feature"
        self.dependecy = set()
        self.name = HeleperFunction.remove_suffix(type)
        self.schema = schema
        self.aixm = aixm
        self.full_sql = ""
        self.attributes = {
            "view": self.generate_view(self.name, schema),
            "materialized": self.generate_materialized_view(self.name, schema),
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
            "index" : [
                f"create unique index if not exists {self.schema}_{self.name}_hjid on {self.schema}.{self.name}_view (message_hjid, hjid, timeslice_hjid)",
                f"create index if not exists {self.schema}_{self.name}_hjid on {self.schema}.{self.name}_view (hjid)"
                       ]
        }


    def generate_view(self, name, schema) :
        return [
            f"create or replace view {schema}.{name}_view as"
            ]

    def generate_materialized_view(self, name, schema) :
        return [
            f"drop materialized view if exists {schema}.{name}_view cascade;",
            f"create materialized view {schema}.{name}_view as"
            ]

    def generate_select(self, name, schema) :
        return [f"select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)"]
   
    def generate_attributes(self, name, schema) : 
        res = [
            "uuid_generate_v5 ('6ba7b810-9dad-11d1-80b4-00c04fd430c8'::uuid, aixm.aixm_feature.hjid::text || '_' || aixm.aixm_timeslice.hjid::text) row",
            "aixm.aixm_message.hjid as message_hjid",
            "aixm.aixm_message.id as message_id",
            "aixm.aixm_message.identifier as message_tidentifier",
            "aixm.aixm_feature.hjid",
            "aixm.aixm_feature.id as feature_id",
            "aixm.aixm_feature.identifier",
            "aixm.aixm_timeslice.id as timeslice_id",
            "aixm.aixm_timeslice.hjid as timeslice_hjid",
            "aixm.aixm_timeslice.interpretation",
            "aixm.aixm_timeslice.sequence_number",
            "aixm.aixm_timeslice.correction_number",
            "aixm.aixm_timeslice.feature_lifetime_begin",
            "aixm.aixm_timeslice.feature_lifetime_end",
            "aixm.aixm_timeslice.valid_time_begin",
            "COALESCE(aixm.aixm_timeslice.valid_time_end, '2100-01-01T00:00:00Z') AS valid_time_end"
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
        return []
        # return [
        #     f"aixm.aixm_feature.lifecycle_status = 'APPROVED'",
        #     f"aixm.aixm_timeslice.lifecycle_status = 'APPROVED'"
        # ]
    
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

    def add_attributes_two(self, type, role, value, nil) :
        self.attributes["attributes"]["feature"].append(f"-- embedded {type} for {role}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{value}::text")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{nil}::text") 
        self.add_group(str(self.name + "_t"), value, self.schema)
        self.add_group(str(self.name + "_t"), nil, self.schema)
        
    def add_attributes_three(self, type, role, value, uom, nil) :
        self.attributes["attributes"]["feature"].append(f"-- embedded {type} for {role}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{value}::text")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{uom}::text")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{nil}::text") 
        self.add_group(str(self.name + "_t"), value, self.schema)
        self.add_group(str(self.name + "_t"), uom, self.schema)
        self.add_group(str(self.name + "_t"), nil, self.schema)

    def add_attributes_four(self, type, role, value, uom, accuracy, nil) :
        self.attributes["attributes"]["feature"].append(f"-- embedded {type} for {role}")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{value}::text")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{uom}::text")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{accuracy}::text")
        self.attributes["attributes"]["feature"].append(f"{self.schema}.{self.name}_t.{nil}::text") 
        self.add_group(str(self.name + "_t"), value, self.schema)
        self.add_group(str(self.name + "_t"), uom, self.schema)
        self.add_group(str(self.name + "_t"), accuracy, self.schema)
        self.add_group(str(self.name + "_t"), nil, self.schema)

    def add_association_feature_one(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):
        join_hash = self.generate_letter_hash(join_table_schema)
        target_hash = self.generate_letter_hash(target_table)
        
        self.attributes["attributes"].setdefault(role, []).extend([
            f"-- composed {type} for {role}",
            f"jsonb_build_object('href', {target_hash}.href",
            f"'nilreason', {target_hash}.nil_reason",
            f"'title', {target_hash}.simple_link_title) AS {role}"
        ])
        
        self.attributes["left"].extend([
            f"-- composed {type} for {role}",
            f"left join {join_table_schema}.{join_table_table} {join_hash} on {self.schema}.{self.name}_t.hjid = {join_hash}.{join_table_column}",
            f"left join {target_schema}.{target_table}_p {target_hash} on {join_hash}.{join_table_revcolumn} = {target_hash}.hjid"
        ])

    def add_association_object_one(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):
        join_hash = self.generate_letter_hash(join_table_schema)
        aixm_property_hash = self.generate_letter_hash("aixm_property")

        self.attributes["attributes"].setdefault(role, []).extend([
            f"-- composed {type} for {role}",
            f"jsonb_build_object('hjid', {aixm_property_hash}.hjid",
            f"'nilreason', {aixm_property_hash}.nil_reason) AS {role}"
        ])

        self.attributes["left"].extend([
            f"-- composed {type} for {role}",
            f"left join {join_table_schema}.{join_table_table} {join_hash} on {self.schema}.{self.name}_t.hjid = {join_hash}.{join_table_column}",
            f"left join aixm.aixm_property {aixm_property_hash} on {join_hash}.{join_table_revcolumn} = {aixm_property_hash}.hjid"
        ])

    def add_association_geometry_one(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, geometry_schema, geometry_table):
        join_hash = self.generate_letter_hash(join_table_schema)
        geometry_hash = self.generate_letter_hash(geometry_table)

        if self.aixm == "aixm 5.2":
            self.attributes["attributes"]["feature"].extend([
                f"-- composed geometry {type} for {role}",
                f"{geometry_hash}.geom as {role}_geom",
                f"jsonb_build_object('hjid', {geometry_hash}.hjid",
                f"'id', {geometry_hash}.id",
                f"'horizontalaccuracy', {geometry_hash}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_hash}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_accuracy', {geometry_hash}.horizontalaccuracy_accuracy",
                f"'horizontalaccuracy_nilreason', {geometry_hash}.horizontalaccuracy_nilreason) AS {role}"
            ])
        else :
            self.attributes["attributes"]["feature"].extend([
                f"-- composed geometry {type} for {role}",
                f"{geometry_hash}.geom as {role}_geom",
                f"jsonb_build_object('hjid', {geometry_hash}.hjid",
                f"'id', {geometry_hash}.id",
                f"'horizontalaccuracy', {geometry_hash}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_hash}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_nilreason', {geometry_hash}.horizontalaccuracy_nilreason) AS {role}"
            ])

        self.attributes["left"].extend([
            f"-- composed {type} for {role}",
            f"left join {join_table_schema}.{join_table_table} {join_hash} on {self.schema}.{self.name}_t.hjid = {join_hash}.{join_table_column}",
            f"left join {geometry_schema}.{geometry_table} {geometry_hash} on {join_hash}.{join_table_revcolumn} = {geometry_hash}.hjid"
        ])

        self.attributes["index"].append(f"create index if not exists {self.schema}_{self.name}_{role}_geom on {self.schema}.{self.name}_view  using gist ({role}_geom)")

    def add_association_elevated_geometry_one(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, geometry_schema, geometry_table):
        join_hash = self.generate_letter_hash(join_table_schema)
        geometry_hash = self.generate_letter_hash(geometry_table)

        if self.aixm == "aixm 5.2":
            self.attributes["attributes"]["feature"].extend([
                f"-- composed geometry {type} for {role}",
                f"{geometry_hash}.geom as {role}_geom",
                f"jsonb_build_object('hjid', {geometry_hash}.hjid",
                f"'id', {geometry_hash}.id",
                f"'horizontalaccuracy', {geometry_hash}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_hash}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_accuracy', {geometry_hash}.horizontalaccuracy_accuracy",
                f"'horizontalaccuracy_nilreason', {geometry_hash}.horizontalaccuracy_nilreason",
                f"'geoidundulation', {geometry_hash}.geoidundulation",
                f"'geoidundulation_accuracy', {geometry_hash}.geoidundulation_accuracy",
                f"'geoidundulation_nilreason', {geometry_hash}.geoidundulation_nilreason",
                f"'elevation', {geometry_hash}.elevation",
                f"'elevation_uom', {geometry_hash}.elevation_uom",
                f"'elevation_accuracy', {geometry_hash}.elevation_accuracy",
                f"'elevation_nilreason', {geometry_hash}.elevation_nilreason) AS {role}"
            ])
        else :
            self.attributes["attributes"]["feature"].extend([
                f"-- composed geometry {type} for {role}",
                f"{geometry_hash}.geom as {role}_geom",
                f"jsonb_build_object('hjid', {geometry_hash}.hjid",
                f"'id', {geometry_hash}.id",
                f"'horizontalaccuracy', {geometry_hash}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_hash}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_nilreason', {geometry_hash}.horizontalaccuracy_nilreason",
                f"'geoidundulation', {geometry_hash}.geoidundulation",
                f"'geoidundulation_uom', {geometry_hash}.geoidundulation_uom",
                f"'geoidundulation_nilreason', {geometry_hash}.geoidundulation_nilreason",
                f"'verticalaccuracy', {geometry_hash}.verticalaccuracy",
                f"'verticalaccuracy_uom', {geometry_hash}.verticalaccuracy_uom",
                f"'verticalaccuracy_nilreason', {geometry_hash}.verticalaccuracy_nilreason",
                f"'elevation', {geometry_hash}.elevation",
                f"'elevation_uom', {geometry_hash}.elevation_uom",
                f"'elevation_nilreason', {geometry_hash}.elevation_nilreason) AS {role}"            
            ])
        
        self.attributes["left"].extend([
            f"-- composed {type} for {role}",
            f"left join {join_table_schema}.{join_table_table} {join_hash} on {self.schema}.{self.name}_t.hjid = {join_hash}.{join_table_column}",
            f"left join {geometry_schema}.{geometry_table} {geometry_hash} on {join_hash}.{join_table_revcolumn} = {geometry_hash}.hjid"
        ])

        self.attributes["index"].append(f"create index if not exists {self.schema}_{self.name}_{role}_geom on {self.schema}.{self.name}_view  using gist ({role}_geom)")

    def add_association_feature_many(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):
        
        self.attributes["attributes"].setdefault(role, []).extend([
            f"-- composed {type} for {role}",
            f"(select coalesce(jsonb_agg(jsonb_build_object('href', {target_schema}.{target_table}_p.href",
            f"'nilreason', {target_schema}.{target_table}_p.nil_reason",
            f"'title', {target_schema}.{target_table}_p.simple_link_title)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join {target_schema}.{target_table}_p on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {target_schema}.{target_table}_p.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
        ])
        
    def add_association_object_many(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, target_schema, target_table):

        self.attributes["attributes"].setdefault(role, []).extend([
            f"-- composed {type} for {role}",
            f"(select coalesce(jsonb_agg(jsonb_build_object('hjid', aixm.aixm_property.hjid",
            f"'nilreason', aixm.aixm_property.nil_reason)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join aixm.aixm_property on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = aixm.aixm_property.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
        ])

    def add_association_geometry_many(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, geometry_schema, geometry_table):

        self.attributes["attributes"].setdefault(role, []).extend([
            f"-- composed geometry {type} for {role}",
            f"(select st_union({geometry_schema}.{geometry_table}.GEOM) as {role}_geom from {join_table_schema}.{join_table_table} join {geometry_schema}.{geometry_table} on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {geometry_schema}.{geometry_table}.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}_geom"
        ])

        if self.aixm == "aixm 5.2":
            self.attributes["attributes"].setdefault(role, []).extend([
                f"(select coalesce(jsonb_agg(jsonb_build_object('hjid', {geometry_schema}.{geometry_table}.hjid",
                f"'id', {geometry_schema}.{geometry_table}.id",
                f"'horizontalaccuracy', {geometry_schema}.{geometry_table}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_schema}.{geometry_table}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_accuracy', {geometry_schema}.{geometry_table}.horizontalaccuracy_accuracy",
                f"'horizontalaccuracy_nilreason', {geometry_schema}.{geometry_table}.horizontalaccuracy_nilreason)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join {geometry_schema}.{geometry_table} on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {geometry_schema}.{geometry_table}.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
            ])
        else :
            self.attributes["attributes"].setdefault(role, []).extend([
                f"(select coalesce(jsonb_agg(jsonb_build_object('hjid', {geometry_schema}.{geometry_table}.hjid",
                f"'id', {geometry_schema}.{geometry_table}.id",
                f"'horizontalaccuracy', {geometry_schema}.{geometry_table}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_schema}.{geometry_table}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_nilreason', {geometry_schema}.{geometry_table}.horizontalaccuracy_nilreason)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join {geometry_schema}.{geometry_table} on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {geometry_schema}.{geometry_table}.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
            ])

        self.attributes["index"].append(f"create index if not exists {self.schema}_{self.name}_{role}_geom on {self.schema}.{self.name}_view  using gist ({role}_geom)")

    def add_association_elevated_geometry_many(self, type, role, join_table_schema, join_table_table, join_table_column, join_table_revcolumn, geometry_schema, geometry_table):

        self.attributes["attributes"].setdefault(role, []).extend([
            f"-- composed geometry {type} for {role}",
            f"(select st_union({geometry_schema}.{geometry_table}.GEOM) as {role}_geom from {join_table_schema}.{join_table_table} join {geometry_schema}.{geometry_table} on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {geometry_schema}.{geometry_table}.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}_geom"
        ])

        if self.aixm == "aixm 5.2":
            self.attributes["attributes"].setdefault(role, []).extend([
                f"(select coalesce(jsonb_agg(jsonb_build_object('hjid', {geometry_schema}.{geometry_table}.hjid",
                f"'id', {geometry_schema}.{geometry_table}.id",
                f"'horizontalaccuracy', {geometry_schema}.{geometry_table}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_schema}.{geometry_table}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_accuracy', {geometry_schema}.{geometry_table}.horizontalaccuracy_accuracy",
                f"'horizontalaccuracy_nilreason', {geometry_schema}.{geometry_table}.horizontalaccuracy_nilreason",
                f"'geoidundulation', {geometry_schema}.{geometry_table}.geoidundulation",
                f"'geoidundulation_uom', {geometry_schema}.{geometry_table}.geoidundulation_uom",
                f"'geoidundulation_accuracy', {geometry_schema}.{geometry_table}.geoidundulation_accuracy",
                f"'geoidundulation_nilreason', {geometry_schema}.{geometry_table}.geoidundulation_nilreason",
                f"'elevation', {geometry_schema}.{geometry_table}.elevation",
                f"'elevation_uom', {geometry_schema}.{geometry_table}.elevation_uom",
                f"'elevation_accuracy', {geometry_schema}.{geometry_table}.elevation_accuracy",
                f"'elevation_nilreason', {geometry_schema}.{geometry_table}.elevation_nilreason)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join {geometry_schema}.{geometry_table} on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {geometry_schema}.{geometry_table}.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
            ])
        else:
            self.attributes["attributes"].setdefault(role, []).extend([
                f"(select coalesce(jsonb_agg(jsonb_build_object('hjid', {geometry_schema}.{geometry_table}.hjid",
                f"'id', {geometry_schema}.{geometry_table}.id",
                f"'horizontalaccuracy', {geometry_schema}.{geometry_table}.horizontalaccuracy",
                f"'horizontalaccuracy_uom', {geometry_schema}.{geometry_table}.horizontalaccuracy_uom",
                f"'horizontalaccuracy_nilreason', {geometry_schema}.{geometry_table}.horizontalaccuracy_nilreason",
                f"'geoidundulation', {geometry_schema}.{geometry_table}.geoidundulation",
                f"'geoidundulation_uom', {geometry_schema}.{geometry_table}.geoidundulation_uom",
                f"'geoidundulation_nilreason', {geometry_schema}.{geometry_table}.geoidundulation_nilreason",
                f"'verticalaccuracy', {geometry_schema}.{geometry_table}.verticalaccuracy",
                f"'verticalaccuracy_uom', {geometry_schema}.{geometry_table}.verticalaccuracy_uom",
                f"'verticalaccuracy_nilreason', {geometry_schema}.{geometry_table}.verticalaccuracy_nilreason",
                f"'elevation', {geometry_schema}.{geometry_table}.elevation",
                f"'elevation_uom', {geometry_schema}.{geometry_table}.elevation_uom",
                f"'elevation_nilreason', {geometry_schema}.{geometry_table}.elevation_nilreason)),'[]'::jsonb) from {join_table_schema}.{join_table_table} join {geometry_schema}.{geometry_table} on {join_table_schema}.{join_table_table}.{join_table_revcolumn} = {geometry_schema}.{geometry_table}.hjid where {self.schema}.{self.name}_t.hjid = {join_table_schema}.{join_table_table}.{join_table_column} ) as {role}"
            ])

        self.attributes["index"].append(f"create index if not exists {self.schema}_{self.name}_{role}_geom on {self.schema}.{self.name}_view  using gist ({role}_geom)")


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