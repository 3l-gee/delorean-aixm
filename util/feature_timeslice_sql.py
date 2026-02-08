# -*- coding: utf-8 -*-
"""
Generate a UNION ALL SQL query for all tables linking to AIXM_FEATURE
"""

# List of tables you provided
table_list = [
    "aerial_refuelling.aerialrefuelling",
    "airport_heliport.aircraftstand",
    "airport_heliport.nonmovementarea",
    "airport_heliport.passengerloadingbridge",
    "airport_heliport.airportheliportcollocation",
    "airport_heliport.airporthotspot",
    "airport_heliport.airportprotectionareamarking",
    "airport_heliport.altimetersource",
    "airport_heliport.approachlightingsystem",
    "airport_heliport.apron",
    "airport_heliport.apronelement",
    "airport_heliport.apronlightsystem",
    "airport_heliport.apronmarking",
    "airport_heliport.arrestinggear",
    "airport_heliport.runway",
    "airport_heliport.deicingarea",
    "airport_heliport.deicingareamarking",
    "airport_heliport.floatingdocksite",
    "airport_heliport.guidanceline",
    "airport_heliport.guidancelinelightsystem",
    "airport_heliport.guidancelinemarking",
    "airport_heliport.markingbuoy",
    "airport_heliport.runwayblastpad",
    "airport_heliport.runwaycentrelinepoint",
    "airport_heliport.runwaydirection",
    "airport_heliport.runwaydirectionlightsystem",
    "airport_heliport.runwayelement",
    "airport_heliport.runwaymarking",
    "airport_heliport.runwayprotectarea",
    "airport_heliport.runwayprotectarealightsystem",
    "airport_heliport.runwayvisualrange",
    "airport_heliport.seaplanelandingarea",
    "airport_heliport.seaplanerampsite",
    "airport_heliport.standmarking",
    "airport_heliport.surveycontrolpoint",
    "airport_heliport.taxiholdingposition",
    "airport_heliport.taxiholdingpositionlightsystem",
    "airport_heliport.taxiholdingpositionmarking",
    "airport_heliport.taxiway",
    "airport_heliport.taxiwayelement",
    "airport_heliport.taxiwaylightsystem",
    "airport_heliport.taxiwaymarking",
    "airport_heliport.touchdownliftoff",
    "airport_heliport.touchdownliftofflightsystem",
    "airport_heliport.workarea",
    "airport_heliport.touchdownliftoffmarking",
    "airport_heliport.touchdownliftoffsafearea",
    "airport_heliport.visualglideslopeindicator",
    "airport_heliport.airportheliport",
    "airport_heliport.road",
    "airspace.airspace",
    "airspace.authorityforairspace",
    "airspace.geoborder",
    "holding.holdingpattern",
    "holding.unplannedholding",
    "navaids_point.aeronauticalgroundlight",
    "navaids_point.angleindication",
    "navaids_point.azimuth",
    "navaids_point.checkpointins",
    "navaids_point.checkpointvor",
    "navaids_point.designatedpoint",
    "navaids_point.directionfinder",
    "navaids_point.distanceindication",
    "navaids_point.dme",
    "navaids_point.elevation",
    "navaids_point.glidepath",
    "navaids_point.localizer",
    "navaids_point.navaid",
    "navaids_point.ndb",
    "navaids_point.sdf",
    "navaids_point.significantpointinairspace",
    "navaids_point.specialnavigationstation",
    "navaids_point.specialnavigationsystem",
    "navaids_point.tacan",
    "navaids_point.markerbeacon",
    "navaids_point.vor",
    "obstacle.obstaclearea",
    "obstacle.verticalstructure",
    "organisation.organisationauthority",
    "organisation.unit",
    "procedure.initialleg",
    "procedure.arrivalfeederleg",
    "procedure.arrivalleg",
    "procedure.circlingarea",
    "procedure.departureleg",
    "procedure.finalleg",
    "procedure.instrumentapproachprocedure",
    "procedure.intermediateleg",
    "procedure.missedapproachleg",
    "procedure.navigationarea",
    "procedure.proceduredme",
    "procedure.safealtitudearea",
    "procedure.standardinstrumentarrival",
    "procedure.standardinstrumentdeparture",
    "procedure.terminalarrivalarea",
    "procedure.navigationarearestriction",
    "route.route",
    "route.routedme",
    "route.routesegment",
    "route.airspacebordercrossing",
    "route.changeoverpoint",
    "route.flightrestriction",
    "rules_procedure.rulesprocedures",
    "service.airportclearanceservice",
    "service.airportsuppliesservice",
    "service.airtrafficcontrolservice",
    "service.airtrafficmanagementservice",
    "service.aircraftgroundservice",
    "service.firefightingservice",
    "service.groundtrafficcontrolservice",
    "service.informationservice",
    "service.passengerservice",
    "service.pilotcontrolledlighting",
    "service.searchrescueservice",
    "service.radiocommunicationchannel",
    "shared.holdingassessment",
    "shared.radiofrequencyarea",
    "shared.specialdate",
    "shared.standardlevelcolumn",
    "shared.standardlevelsector",
    "shared.standardleveltable",
    "surveillance.primarysurveillanceradar",
    "surveillance.precisionapproachradar",
    "surveillance.radarsystem",
    "surveillance.secondarysurveillanceradar"
]

union_queries = []

for querry in table_list:
    schema, table = querry.split(".")

    timesliceproperty = table + "_tp"
    timesliceproperty_ref_col = table + "timeslice_hjid"

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

final_sql = f"""
WITH feature_tsp_ts AS (
"""
final_sql += "\nUNION ALL\n".join(union_queries)

final_sql += f"""
) 
SELECT DISTINCT ON (identifier, sequence_number)
    f_hjid,
    tsp_hjid,
    ts_hjid,
    identifier,
    sequence_number,
    correction_number,
    valid_time_begin,
    valid_time_end
    FROM feature_tsp_ts
ORDER BY identifier, sequence_number,correction_number DESC;
"""

with open("union_all_timeslice.sql", "w", encoding="utf-8") as f:
    f.write(final_sql)
