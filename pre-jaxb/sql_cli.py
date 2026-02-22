# -*- coding: utf-8 -*-
"""
Generate a UNION ALL SQL query for all tables linking to AIXM_FEATURE
Read tables from YAML configuration
"""

import argparse
from html import parser
import os
import yaml

def open_yaml(file_path : str) -> dict:
    with open(file_path, "r", encoding="utf-8") as f:
        return yaml.safe_load(f)

def generate_inline_schema_feature_list(config) -> list:
    inline_schema_feature_list = []
    for group_name, group_data in config.items():
        schema = group_data.get("schema")
        entity_list = group_data.get("list", [])

        # Skip groups without entities
        if not schema or not entity_list:
            continue

        for entity in entity_list:

            inline_schema_feature_list.append(f"{schema.lower()}.{entity.lower()}")

    return inline_schema_feature_list


def generate_union_sql(config) -> str:
    union_queries = []

    for group_name, group_data in config.items():
        schema = group_data.get("schema")
        entity_list = group_data.get("list", [])

        # Skip groups without entities
        if not schema or not entity_list:
            continue

        for entity in entity_list:

            timesliceproperty = entity.lower() + "_tp"
            timesliceproperty_ref_col = entity.lower() + "timeslice_hjid"

            query = f"""
            SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            {schema}.{timesliceproperty}.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN {schema}.{timesliceproperty} ON aixm.aixm_feature.hjid = {schema}.{timesliceproperty}.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON {schema}.{timesliceproperty}.{timesliceproperty_ref_col} = aixm.aixm_timeslice.hjid
            """
            union_queries.append(query.strip())

    final_sql = "\nUNION ALL\n".join(union_queries)
    return final_sql

def generate_basic_message_member_ids_sql(union_sql : str) -> str:
    start = f"""
/*
This query retrieves the distinct m_hjid (BasicMessageMemberAIXMPropertyType) values timeslices associated with AIXM features. 
It combines (via UNION ALL) timeslices joins them to their corresponding features and timeslices, 
and filters for currently valid timeslices (valid_time_end > :time or NULL). Among duplicates, 
it selects the latest correction (correction_number DESC) for each feature identifier and sequence number.
*/

WITH union_query AS (
    """

    end = f"""
) 
SELECT DISTINCT ON (identifier, sequence_number)
    m_hjid
    FROM union_query
WHERE valid_time_end > :time or valid_time_end is NULL 
ORDER BY identifier, sequence_number,correction_number DESC;
    """

    return str(start + union_sql + end)

def generate_time_slice_property_ids_sql(union_sql : str) -> str:
    start = f"""
/*
This query retrieves the distinct tsp_hjid ([Feature]TimeSlicePropertyType) values timeslices associated with AIXM features. 
It combines (via UNION ALL) timeslices joins them to their corresponding features and timeslices, 
and filters for currently valid timeslices (valid_time_end > :time or NULL). Among duplicates, 
it selects the latest correction (correction_number DESC) for each feature identifier and sequence number.
*/

WITH union_query AS (

    """

    end = f"""
)
SELECT DISTINCT ON (identifier, sequence_number)
    tp_hjid
    FROM union_query
WHERE valid_time_end > :time or valid_time_end is NULL 
ORDER BY identifier, sequence_number,correction_number DESC;
    """

    return str(start + union_sql + end)


def main():
    parser = argparse.ArgumentParser(
        description="Generate UNION ALL SQL from AIXM YAML configuration"
    )

    parser.add_argument(
        "--config",
        required=True,
        help="Path to input YAML configuration file"
    )

    parser.add_argument(
        "--path_to_bmm",
        required=True,
        help="Path to output basic message member IDs SQL file"
    )

    parser.add_argument(
        "--path_to_tsp",
        required=True,
        help="Path to output time slice property IDs SQL file"
    )

    parser.add_argument(
        "--path_to_sfl",
        required=True,
        help="Path to output schema feature list file"
    )

    args = parser.parse_args()

    config = open_yaml(args.config)
    inline_schema_feature_list = generate_inline_schema_feature_list(config)
    union_sql = generate_union_sql(config)
    basic_message_member_ids_sql = generate_basic_message_member_ids_sql(union_sql)
    time_slice_property_ids_sql = generate_time_slice_property_ids_sql(union_sql)
    inline_schema_feature_list = generate_inline_schema_feature_list(config)

    with open(args.path_to_bmm, "w", encoding="utf-8") as f:
        f.write(basic_message_member_ids_sql)

    with open(args.path_to_tsp, "w", encoding="utf-8") as f:
        f.write(time_slice_property_ids_sql)

    with open(args.path_to_sfl, "w", encoding="utf-8") as f:
        f.write("\n".join(inline_schema_feature_list))

if __name__ == "__main__":
    main()