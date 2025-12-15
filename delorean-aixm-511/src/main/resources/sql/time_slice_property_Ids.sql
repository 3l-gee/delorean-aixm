
/*
This query retrieves the distinct tsp_hjid ([Feature]TimeSlicePropertyType) values timeslices associated with AIXM features. 
It combines (via UNION ALL) timeslices joins them to their corresponding features and timeslices, 
and filters for currently valid timeslices (valid_time_end > :time or NULL). Among duplicates, 
it selects the latest correction (correction_number DESC) for each feature identifier and sequence number.
*/

WITH union_query AS (
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    aerial_refuelling.aerialrefuelling_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN aerial_refuelling.timeslice_aerialrefuelling_link ON aixm.aixm_feature.hjid = aerial_refuelling.timeslice_aerialrefuelling_link.timeslice
    INNER JOIN aerial_refuelling.aerialrefuelling_tsp ON aerial_refuelling.timeslice_aerialrefuelling_link.aerialrefuellingtype = aerial_refuelling.aerialrefuelling_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON aerial_refuelling.aerialrefuelling_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.aircraftstand_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_aircraftstand_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_aircraftstand_link.timeslice
    INNER JOIN airport_heliport.aircraftstand_tsp ON airport_heliport.timeslice_aircraftstand_link.aircraftstandtype = airport_heliport.aircraftstand_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.aircraftstand_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.nonmovementarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_nonmovementarea_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_nonmovementarea_link.timeslice
    INNER JOIN airport_heliport.nonmovementarea_tsp ON airport_heliport.timeslice_nonmovementarea_link.nonmovementareatype = airport_heliport.nonmovementarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.nonmovementarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.passengerloadingbridge_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_passengerloadingbridge_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_passengerloadingbridge_link.timeslice
    INNER JOIN airport_heliport.passengerloadingbridge_tsp ON airport_heliport.timeslice_passengerloadingbridge_link.passengerloadingbridgetype = airport_heliport.passengerloadingbridge_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.passengerloadingbridge_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.airportheliportcollocation_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_airportheliportcollocation_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_airportheliportcollocation_link.timeslice
    INNER JOIN airport_heliport.airportheliportcollocation_tsp ON airport_heliport.timeslice_airportheliportcollocation_link.airportheliportcollocationtype = airport_heliport.airportheliportcollocation_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportcollocation_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.airporthotspot_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_airporthotspot_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_airporthotspot_link.timeslice
    INNER JOIN airport_heliport.airporthotspot_tsp ON airport_heliport.timeslice_airporthotspot_link.airporthotspottype = airport_heliport.airporthotspot_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.airporthotspot_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.airportprotectionareamarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_airportprotectionareamarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_airportprotectionareamarking_link.timeslice
    INNER JOIN airport_heliport.airportprotectionareamarking_tsp ON airport_heliport.timeslice_airportprotectionareamarking_link.airportprotectionareamarkingtype = airport_heliport.airportprotectionareamarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportprotectionareamarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.altimetersource_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_altimetersource_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_altimetersource_link.timeslice
    INNER JOIN airport_heliport.altimetersource_tsp ON airport_heliport.timeslice_altimetersource_link.altimetersourcetype = airport_heliport.altimetersource_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.altimetersource_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.approachlightingsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_approachlightingsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_approachlightingsystem_link.timeslice
    INNER JOIN airport_heliport.approachlightingsystem_tsp ON airport_heliport.timeslice_approachlightingsystem_link.approachlightingsystemtype = airport_heliport.approachlightingsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.approachlightingsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.apron_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_apron_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_apron_link.timeslice
    INNER JOIN airport_heliport.apron_tsp ON airport_heliport.timeslice_apron_link.aprontype = airport_heliport.apron_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.apron_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.apronelement_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_apronelement_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_apronelement_link.timeslice
    INNER JOIN airport_heliport.apronelement_tsp ON airport_heliport.timeslice_apronelement_link.apronelementtype = airport_heliport.apronelement_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronelement_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.apronlightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_apronlightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_apronlightsystem_link.timeslice
    INNER JOIN airport_heliport.apronlightsystem_tsp ON airport_heliport.timeslice_apronlightsystem_link.apronlightsystemtype = airport_heliport.apronlightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronlightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.apronmarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_apronmarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_apronmarking_link.timeslice
    INNER JOIN airport_heliport.apronmarking_tsp ON airport_heliport.timeslice_apronmarking_link.apronmarkingtype = airport_heliport.apronmarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronmarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.arrestinggear_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_arrestinggear_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_arrestinggear_link.timeslice
    INNER JOIN airport_heliport.arrestinggear_tsp ON airport_heliport.timeslice_arrestinggear_link.arrestinggeartype = airport_heliport.arrestinggear_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.arrestinggear_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runway_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runway_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runway_link.timeslice
    INNER JOIN airport_heliport.runway_tsp ON airport_heliport.timeslice_runway_link.runwaytype = airport_heliport.runway_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runway_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.deicingarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_deicingarea_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_deicingarea_link.timeslice
    INNER JOIN airport_heliport.deicingarea_tsp ON airport_heliport.timeslice_deicingarea_link.deicingareatype = airport_heliport.deicingarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.deicingarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.deicingareamarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_deicingareamarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_deicingareamarking_link.timeslice
    INNER JOIN airport_heliport.deicingareamarking_tsp ON airport_heliport.timeslice_deicingareamarking_link.deicingareamarkingtype = airport_heliport.deicingareamarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.deicingareamarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.floatingdocksite_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_floatingdocksite_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_floatingdocksite_link.timeslice
    INNER JOIN airport_heliport.floatingdocksite_tsp ON airport_heliport.timeslice_floatingdocksite_link.floatingdocksitetype = airport_heliport.floatingdocksite_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.floatingdocksite_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.guidanceline_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_guidanceline_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_guidanceline_link.timeslice
    INNER JOIN airport_heliport.guidanceline_tsp ON airport_heliport.timeslice_guidanceline_link.guidancelinetype = airport_heliport.guidanceline_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidanceline_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.guidancelinelightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_guidancelinelightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_guidancelinelightsystem_link.timeslice
    INNER JOIN airport_heliport.guidancelinelightsystem_tsp ON airport_heliport.timeslice_guidancelinelightsystem_link.guidancelinelightsystemtype = airport_heliport.guidancelinelightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidancelinelightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.guidancelinemarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_guidancelinemarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_guidancelinemarking_link.timeslice
    INNER JOIN airport_heliport.guidancelinemarking_tsp ON airport_heliport.timeslice_guidancelinemarking_link.guidancelinemarkingtype = airport_heliport.guidancelinemarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidancelinemarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.markingbuoy_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_markingbuoy_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_markingbuoy_link.timeslice
    INNER JOIN airport_heliport.markingbuoy_tsp ON airport_heliport.timeslice_markingbuoy_link.markingbuoytype = airport_heliport.markingbuoy_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.markingbuoy_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwayblastpad_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwayblastpad_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwayblastpad_link.timeslice
    INNER JOIN airport_heliport.runwayblastpad_tsp ON airport_heliport.timeslice_runwayblastpad_link.runwayblastpadtype = airport_heliport.runwayblastpad_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayblastpad_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwaycentrelinepoint_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwaycentrelinepoint_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwaycentrelinepoint_link.timeslice
    INNER JOIN airport_heliport.runwaycentrelinepoint_tsp ON airport_heliport.timeslice_runwaycentrelinepoint_link.runwaycentrelinepointtype = airport_heliport.runwaycentrelinepoint_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaycentrelinepoint_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwaydirection_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwaydirection_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwaydirection_link.timeslice
    INNER JOIN airport_heliport.runwaydirection_tsp ON airport_heliport.timeslice_runwaydirection_link.runwaydirectiontype = airport_heliport.runwaydirection_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaydirection_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwaydirectionlightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwaydirectionlightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwaydirectionlightsystem_link.timeslice
    INNER JOIN airport_heliport.runwaydirectionlightsystem_tsp ON airport_heliport.timeslice_runwaydirectionlightsystem_link.runwaydirectionlightsystemtype = airport_heliport.runwaydirectionlightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaydirectionlightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwayelement_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwayelement_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwayelement_link.timeslice
    INNER JOIN airport_heliport.runwayelement_tsp ON airport_heliport.timeslice_runwayelement_link.runwayelementtype = airport_heliport.runwayelement_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayelement_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwaymarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwaymarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwaymarking_link.timeslice
    INNER JOIN airport_heliport.runwaymarking_tsp ON airport_heliport.timeslice_runwaymarking_link.runwaymarkingtype = airport_heliport.runwaymarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaymarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwayprotectarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwayprotectarea_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwayprotectarea_link.timeslice
    INNER JOIN airport_heliport.runwayprotectarea_tsp ON airport_heliport.timeslice_runwayprotectarea_link.runwayprotectareatype = airport_heliport.runwayprotectarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayprotectarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwayprotectarealightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwayprotectarealightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwayprotectarealightsystem_link.timeslice
    INNER JOIN airport_heliport.runwayprotectarealightsystem_tsp ON airport_heliport.timeslice_runwayprotectarealightsystem_link.runwayprotectarealightsystemtype = airport_heliport.runwayprotectarealightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayprotectarealightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.runwayvisualrange_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_runwayvisualrange_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_runwayvisualrange_link.timeslice
    INNER JOIN airport_heliport.runwayvisualrange_tsp ON airport_heliport.timeslice_runwayvisualrange_link.runwayvisualrangetype = airport_heliport.runwayvisualrange_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayvisualrange_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.seaplanelandingarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_seaplanelandingarea_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_seaplanelandingarea_link.timeslice
    INNER JOIN airport_heliport.seaplanelandingarea_tsp ON airport_heliport.timeslice_seaplanelandingarea_link.seaplanelandingareatype = airport_heliport.seaplanelandingarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.seaplanelandingarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.seaplanerampsite_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_seaplanerampsite_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_seaplanerampsite_link.timeslice
    INNER JOIN airport_heliport.seaplanerampsite_tsp ON airport_heliport.timeslice_seaplanerampsite_link.seaplanerampsitetype = airport_heliport.seaplanerampsite_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.seaplanerampsite_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.standmarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_standmarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_standmarking_link.timeslice
    INNER JOIN airport_heliport.standmarking_tsp ON airport_heliport.timeslice_standmarking_link.standmarkingtype = airport_heliport.standmarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.standmarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.surveycontrolpoint_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_surveycontrolpoint_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_surveycontrolpoint_link.timeslice
    INNER JOIN airport_heliport.surveycontrolpoint_tsp ON airport_heliport.timeslice_surveycontrolpoint_link.surveycontrolpointtype = airport_heliport.surveycontrolpoint_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.surveycontrolpoint_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiholdingposition_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiholdingposition_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiholdingposition_link.timeslice
    INNER JOIN airport_heliport.taxiholdingposition_tsp ON airport_heliport.timeslice_taxiholdingposition_link.taxiholdingpositiontype = airport_heliport.taxiholdingposition_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiholdingposition_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiholdingpositionlightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiholdingpositionlightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiholdingpositionlightsystem_link.timeslice
    INNER JOIN airport_heliport.taxiholdingpositionlightsystem_tsp ON airport_heliport.timeslice_taxiholdingpositionlightsystem_link.taxiholdingpositionlightsystemtype = airport_heliport.taxiholdingpositionlightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiholdingpositionlightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiholdingpositionmarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiholdingpositionmarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiholdingpositionmarking_link.timeslice
    INNER JOIN airport_heliport.taxiholdingpositionmarking_tsp ON airport_heliport.timeslice_taxiholdingpositionmarking_link.taxiholdingpositionmarkingtype = airport_heliport.taxiholdingpositionmarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiholdingpositionmarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiway_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiway_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiway_link.timeslice
    INNER JOIN airport_heliport.taxiway_tsp ON airport_heliport.timeslice_taxiway_link.taxiwaytype = airport_heliport.taxiway_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiway_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiwayelement_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiwayelement_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiwayelement_link.timeslice
    INNER JOIN airport_heliport.taxiwayelement_tsp ON airport_heliport.timeslice_taxiwayelement_link.taxiwayelementtype = airport_heliport.taxiwayelement_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwayelement_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiwaylightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiwaylightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiwaylightsystem_link.timeslice
    INNER JOIN airport_heliport.taxiwaylightsystem_tsp ON airport_heliport.timeslice_taxiwaylightsystem_link.taxiwaylightsystemtype = airport_heliport.taxiwaylightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwaylightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.taxiwaymarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_taxiwaymarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_taxiwaymarking_link.timeslice
    INNER JOIN airport_heliport.taxiwaymarking_tsp ON airport_heliport.timeslice_taxiwaymarking_link.taxiwaymarkingtype = airport_heliport.taxiwaymarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwaymarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.touchdownliftoff_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_touchdownliftoff_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_touchdownliftoff_link.timeslice
    INNER JOIN airport_heliport.touchdownliftoff_tsp ON airport_heliport.timeslice_touchdownliftoff_link.touchdownliftofftype = airport_heliport.touchdownliftoff_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoff_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.touchdownliftofflightsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_touchdownliftofflightsystem_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_touchdownliftofflightsystem_link.timeslice
    INNER JOIN airport_heliport.touchdownliftofflightsystem_tsp ON airport_heliport.timeslice_touchdownliftofflightsystem_link.touchdownliftofflightsystemtype = airport_heliport.touchdownliftofflightsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftofflightsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.workarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_workarea_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_workarea_link.timeslice
    INNER JOIN airport_heliport.workarea_tsp ON airport_heliport.timeslice_workarea_link.workareatype = airport_heliport.workarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.workarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.touchdownliftoffmarking_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_touchdownliftoffmarking_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_touchdownliftoffmarking_link.timeslice
    INNER JOIN airport_heliport.touchdownliftoffmarking_tsp ON airport_heliport.timeslice_touchdownliftoffmarking_link.touchdownliftoffmarkingtype = airport_heliport.touchdownliftoffmarking_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoffmarking_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.touchdownliftoffsafearea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_touchdownliftoffsafearea_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_touchdownliftoffsafearea_link.timeslice
    INNER JOIN airport_heliport.touchdownliftoffsafearea_tsp ON airport_heliport.timeslice_touchdownliftoffsafearea_link.touchdownliftoffsafeareatype = airport_heliport.touchdownliftoffsafearea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoffsafearea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.visualglideslopeindicator_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_visualglideslopeindicator_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_visualglideslopeindicator_link.timeslice
    INNER JOIN airport_heliport.visualglideslopeindicator_tsp ON airport_heliport.timeslice_visualglideslopeindicator_link.visualglideslopeindicatortype = airport_heliport.visualglideslopeindicator_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.visualglideslopeindicator_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.airportheliport_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_airportheliport_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_airportheliport_link.timeslice
    INNER JOIN airport_heliport.airportheliport_tsp ON airport_heliport.timeslice_airportheliport_link.airportheliporttype = airport_heliport.airportheliport_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliport_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airport_heliport.road_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airport_heliport.timeslice_road_link ON aixm.aixm_feature.hjid = airport_heliport.timeslice_road_link.timeslice
    INNER JOIN airport_heliport.road_tsp ON airport_heliport.timeslice_road_link.roadtype = airport_heliport.road_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airport_heliport.road_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airspace.airspace_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airspace.timeslice_airspace_link ON aixm.aixm_feature.hjid = airspace.timeslice_airspace_link.timeslice
    INNER JOIN airspace.airspace_tsp ON airspace.timeslice_airspace_link.airspacetype = airspace.airspace_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airspace.airspace_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airspace.authorityforairspace_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airspace.timeslice_authorityforairspace_link ON aixm.aixm_feature.hjid = airspace.timeslice_authorityforairspace_link.timeslice
    INNER JOIN airspace.authorityforairspace_tsp ON airspace.timeslice_authorityforairspace_link.authorityforairspacetype = airspace.authorityforairspace_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airspace.authorityforairspace_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    airspace.geoborder_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN airspace.timeslice_geoborder_link ON aixm.aixm_feature.hjid = airspace.timeslice_geoborder_link.timeslice
    INNER JOIN airspace.geoborder_tsp ON airspace.timeslice_geoborder_link.geobordertype = airspace.geoborder_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON airspace.geoborder_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    holding.holdingpattern_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN holding.timeslice_holdingpattern_link ON aixm.aixm_feature.hjid = holding.timeslice_holdingpattern_link.timeslice
    INNER JOIN holding.holdingpattern_tsp ON holding.timeslice_holdingpattern_link.holdingpatterntype = holding.holdingpattern_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON holding.holdingpattern_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    holding.unplannedholding_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN holding.timeslice_unplannedholding_link ON aixm.aixm_feature.hjid = holding.timeslice_unplannedholding_link.timeslice
    INNER JOIN holding.unplannedholding_tsp ON holding.timeslice_unplannedholding_link.unplannedholdingtype = holding.unplannedholding_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON holding.unplannedholding_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.aeronauticalgroundlight_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_aeronauticalgroundlight_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_aeronauticalgroundlight_link.timeslice
    INNER JOIN navaids_point.aeronauticalgroundlight_tsp ON navaids_point.timeslice_aeronauticalgroundlight_link.aeronauticalgroundlighttype = navaids_point.aeronauticalgroundlight_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.aeronauticalgroundlight_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.angleindication_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_angleindication_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_angleindication_link.timeslice
    INNER JOIN navaids_point.angleindication_tsp ON navaids_point.timeslice_angleindication_link.angleindicationtype = navaids_point.angleindication_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.angleindication_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.azimuth_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_azimuth_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_azimuth_link.timeslice
    INNER JOIN navaids_point.azimuth_tsp ON navaids_point.timeslice_azimuth_link.azimuthtype = navaids_point.azimuth_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.azimuth_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.checkpointins_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_checkpointins_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_checkpointins_link.timeslice
    INNER JOIN navaids_point.checkpointins_tsp ON navaids_point.timeslice_checkpointins_link.checkpointinstype = navaids_point.checkpointins_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.checkpointins_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.checkpointvor_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_checkpointvor_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_checkpointvor_link.timeslice
    INNER JOIN navaids_point.checkpointvor_tsp ON navaids_point.timeslice_checkpointvor_link.checkpointvortype = navaids_point.checkpointvor_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.checkpointvor_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.designatedpoint_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_designatedpoint_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_designatedpoint_link.timeslice
    INNER JOIN navaids_point.designatedpoint_tsp ON navaids_point.timeslice_designatedpoint_link.designatedpointtype = navaids_point.designatedpoint_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.designatedpoint_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.directionfinder_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_directionfinder_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_directionfinder_link.timeslice
    INNER JOIN navaids_point.directionfinder_tsp ON navaids_point.timeslice_directionfinder_link.directionfindertype = navaids_point.directionfinder_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.directionfinder_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.distanceindication_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_distanceindication_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_distanceindication_link.timeslice
    INNER JOIN navaids_point.distanceindication_tsp ON navaids_point.timeslice_distanceindication_link.distanceindicationtype = navaids_point.distanceindication_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.distanceindication_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.dme_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_dme_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_dme_link.timeslice
    INNER JOIN navaids_point.dme_tsp ON navaids_point.timeslice_dme_link.dmetype = navaids_point.dme_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.dme_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.elevation_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_elevation_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_elevation_link.timeslice
    INNER JOIN navaids_point.elevation_tsp ON navaids_point.timeslice_elevation_link.elevationtype = navaids_point.elevation_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.elevation_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.glidepath_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_glidepath_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_glidepath_link.timeslice
    INNER JOIN navaids_point.glidepath_tsp ON navaids_point.timeslice_glidepath_link.glidepathtype = navaids_point.glidepath_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.glidepath_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.localizer_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_localizer_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_localizer_link.timeslice
    INNER JOIN navaids_point.localizer_tsp ON navaids_point.timeslice_localizer_link.localizertype = navaids_point.localizer_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.localizer_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.navaid_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_navaid_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_navaid_link.timeslice
    INNER JOIN navaids_point.navaid_tsp ON navaids_point.timeslice_navaid_link.navaidtype = navaids_point.navaid_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.navaid_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.ndb_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_ndb_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_ndb_link.timeslice
    INNER JOIN navaids_point.ndb_tsp ON navaids_point.timeslice_ndb_link.ndbtype = navaids_point.ndb_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.ndb_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.sdf_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_sdf_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_sdf_link.timeslice
    INNER JOIN navaids_point.sdf_tsp ON navaids_point.timeslice_sdf_link.sdftype = navaids_point.sdf_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.sdf_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.significantpointinairspace_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_significantpointinairspace_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_significantpointinairspace_link.timeslice
    INNER JOIN navaids_point.significantpointinairspace_tsp ON navaids_point.timeslice_significantpointinairspace_link.significantpointinairspacetype = navaids_point.significantpointinairspace_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.significantpointinairspace_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.specialnavigationstation_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_specialnavigationstation_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_specialnavigationstation_link.timeslice
    INNER JOIN navaids_point.specialnavigationstation_tsp ON navaids_point.timeslice_specialnavigationstation_link.specialnavigationstationtype = navaids_point.specialnavigationstation_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.specialnavigationstation_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.specialnavigationsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_specialnavigationsystem_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_specialnavigationsystem_link.timeslice
    INNER JOIN navaids_point.specialnavigationsystem_tsp ON navaids_point.timeslice_specialnavigationsystem_link.specialnavigationsystemtype = navaids_point.specialnavigationsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.specialnavigationsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.tacan_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_tacan_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_tacan_link.timeslice
    INNER JOIN navaids_point.tacan_tsp ON navaids_point.timeslice_tacan_link.tacantype = navaids_point.tacan_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.tacan_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.markerbeacon_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_markerbeacon_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_markerbeacon_link.timeslice
    INNER JOIN navaids_point.markerbeacon_tsp ON navaids_point.timeslice_markerbeacon_link.markerbeacontype = navaids_point.markerbeacon_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.markerbeacon_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    navaids_point.vor_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN navaids_point.timeslice_vor_link ON aixm.aixm_feature.hjid = navaids_point.timeslice_vor_link.timeslice
    INNER JOIN navaids_point.vor_tsp ON navaids_point.timeslice_vor_link.vortype = navaids_point.vor_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON navaids_point.vor_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    obstacle.obstaclearea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN obstacle.timeslice_obstaclearea_link ON aixm.aixm_feature.hjid = obstacle.timeslice_obstaclearea_link.timeslice
    INNER JOIN obstacle.obstaclearea_tsp ON obstacle.timeslice_obstaclearea_link.obstacleareatype = obstacle.obstaclearea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON obstacle.obstaclearea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    obstacle.verticalstructure_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN obstacle.timeslice_verticalstructure_link ON aixm.aixm_feature.hjid = obstacle.timeslice_verticalstructure_link.timeslice
    INNER JOIN obstacle.verticalstructure_tsp ON obstacle.timeslice_verticalstructure_link.verticalstructuretype = obstacle.verticalstructure_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON obstacle.verticalstructure_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    organisation.organisationauthority_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN organisation.timeslice_organisationauthority_link ON aixm.aixm_feature.hjid = organisation.timeslice_organisationauthority_link.timeslice
    INNER JOIN organisation.organisationauthority_tsp ON organisation.timeslice_organisationauthority_link.organisationauthoritytype = organisation.organisationauthority_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON organisation.organisationauthority_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    organisation.unit_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN organisation.timeslice_unit_link ON aixm.aixm_feature.hjid = organisation.timeslice_unit_link.timeslice
    INNER JOIN organisation.unit_tsp ON organisation.timeslice_unit_link.unittype = organisation.unit_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON organisation.unit_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.initialleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_initialleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_initialleg_link.timeslice
    INNER JOIN procedure.initialleg_tsp ON procedure.timeslice_initialleg_link.initiallegtype = procedure.initialleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.initialleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.arrivalfeederleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_arrivalfeederleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_arrivalfeederleg_link.timeslice
    INNER JOIN procedure.arrivalfeederleg_tsp ON procedure.timeslice_arrivalfeederleg_link.arrivalfeederlegtype = procedure.arrivalfeederleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.arrivalfeederleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.arrivalleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_arrivalleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_arrivalleg_link.timeslice
    INNER JOIN procedure.arrivalleg_tsp ON procedure.timeslice_arrivalleg_link.arrivallegtype = procedure.arrivalleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.arrivalleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.circlingarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_circlingarea_link ON aixm.aixm_feature.hjid = procedure.timeslice_circlingarea_link.timeslice
    INNER JOIN procedure.circlingarea_tsp ON procedure.timeslice_circlingarea_link.circlingareatype = procedure.circlingarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.circlingarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.departureleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_departureleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_departureleg_link.timeslice
    INNER JOIN procedure.departureleg_tsp ON procedure.timeslice_departureleg_link.departurelegtype = procedure.departureleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.departureleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.finalleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_finalleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_finalleg_link.timeslice
    INNER JOIN procedure.finalleg_tsp ON procedure.timeslice_finalleg_link.finallegtype = procedure.finalleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.finalleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.instrumentapproachprocedure_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_instrumentapproachprocedure_link ON aixm.aixm_feature.hjid = procedure.timeslice_instrumentapproachprocedure_link.timeslice
    INNER JOIN procedure.instrumentapproachprocedure_tsp ON procedure.timeslice_instrumentapproachprocedure_link.instrumentapproachproceduretype = procedure.instrumentapproachprocedure_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.instrumentapproachprocedure_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.intermediateleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_intermediateleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_intermediateleg_link.timeslice
    INNER JOIN procedure.intermediateleg_tsp ON procedure.timeslice_intermediateleg_link.intermediatelegtype = procedure.intermediateleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.intermediateleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.missedapproachleg_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_missedapproachleg_link ON aixm.aixm_feature.hjid = procedure.timeslice_missedapproachleg_link.timeslice
    INNER JOIN procedure.missedapproachleg_tsp ON procedure.timeslice_missedapproachleg_link.missedapproachlegtype = procedure.missedapproachleg_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.missedapproachleg_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.navigationarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_navigationarea_link ON aixm.aixm_feature.hjid = procedure.timeslice_navigationarea_link.timeslice
    INNER JOIN procedure.navigationarea_tsp ON procedure.timeslice_navigationarea_link.navigationareatype = procedure.navigationarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.navigationarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.proceduredme_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_proceduredme_link ON aixm.aixm_feature.hjid = procedure.timeslice_proceduredme_link.timeslice
    INNER JOIN procedure.proceduredme_tsp ON procedure.timeslice_proceduredme_link.proceduredmetype = procedure.proceduredme_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.proceduredme_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.safealtitudearea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_safealtitudearea_link ON aixm.aixm_feature.hjid = procedure.timeslice_safealtitudearea_link.timeslice
    INNER JOIN procedure.safealtitudearea_tsp ON procedure.timeslice_safealtitudearea_link.safealtitudeareatype = procedure.safealtitudearea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.safealtitudearea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.standardinstrumentarrival_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_standardinstrumentarrival_link ON aixm.aixm_feature.hjid = procedure.timeslice_standardinstrumentarrival_link.timeslice
    INNER JOIN procedure.standardinstrumentarrival_tsp ON procedure.timeslice_standardinstrumentarrival_link.standardinstrumentarrivaltype = procedure.standardinstrumentarrival_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.standardinstrumentarrival_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.standardinstrumentdeparture_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_standardinstrumentdeparture_link ON aixm.aixm_feature.hjid = procedure.timeslice_standardinstrumentdeparture_link.timeslice
    INNER JOIN procedure.standardinstrumentdeparture_tsp ON procedure.timeslice_standardinstrumentdeparture_link.standardinstrumentdeparturetype = procedure.standardinstrumentdeparture_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.standardinstrumentdeparture_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.terminalarrivalarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_terminalarrivalarea_link ON aixm.aixm_feature.hjid = procedure.timeslice_terminalarrivalarea_link.timeslice
    INNER JOIN procedure.terminalarrivalarea_tsp ON procedure.timeslice_terminalarrivalarea_link.terminalarrivalareatype = procedure.terminalarrivalarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.terminalarrivalarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    procedure.navigationarearestriction_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN procedure.timeslice_navigationarearestriction_link ON aixm.aixm_feature.hjid = procedure.timeslice_navigationarearestriction_link.timeslice
    INNER JOIN procedure.navigationarearestriction_tsp ON procedure.timeslice_navigationarearestriction_link.navigationarearestrictiontype = procedure.navigationarearestriction_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON procedure.navigationarearestriction_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    route.route_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN route.timeslice_route_link ON aixm.aixm_feature.hjid = route.timeslice_route_link.timeslice
    INNER JOIN route.route_tsp ON route.timeslice_route_link.routetype = route.route_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON route.route_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    route.routedme_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN route.timeslice_routedme_link ON aixm.aixm_feature.hjid = route.timeslice_routedme_link.timeslice
    INNER JOIN route.routedme_tsp ON route.timeslice_routedme_link.routedmetype = route.routedme_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON route.routedme_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    route.routesegment_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN route.timeslice_routesegment_link ON aixm.aixm_feature.hjid = route.timeslice_routesegment_link.timeslice
    INNER JOIN route.routesegment_tsp ON route.timeslice_routesegment_link.routesegmenttype = route.routesegment_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON route.routesegment_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    route.airspacebordercrossing_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN route.timeslice_airspacebordercrossing_link ON aixm.aixm_feature.hjid = route.timeslice_airspacebordercrossing_link.timeslice
    INNER JOIN route.airspacebordercrossing_tsp ON route.timeslice_airspacebordercrossing_link.airspacebordercrossingtype = route.airspacebordercrossing_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON route.airspacebordercrossing_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    route.changeoverpoint_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN route.timeslice_changeoverpoint_link ON aixm.aixm_feature.hjid = route.timeslice_changeoverpoint_link.timeslice
    INNER JOIN route.changeoverpoint_tsp ON route.timeslice_changeoverpoint_link.changeoverpointtype = route.changeoverpoint_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON route.changeoverpoint_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    route.flightrestriction_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN route.timeslice_flightrestriction_link ON aixm.aixm_feature.hjid = route.timeslice_flightrestriction_link.timeslice
    INNER JOIN route.flightrestriction_tsp ON route.timeslice_flightrestriction_link.flightrestrictiontype = route.flightrestriction_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON route.flightrestriction_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    rules_procedure.rulesprocedures_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN rules_procedure.timeslice_rulesprocedures_link ON aixm.aixm_feature.hjid = rules_procedure.timeslice_rulesprocedures_link.timeslice
    INNER JOIN rules_procedure.rulesprocedures_tsp ON rules_procedure.timeslice_rulesprocedures_link.rulesprocedurestype = rules_procedure.rulesprocedures_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON rules_procedure.rulesprocedures_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.airportclearanceservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_airportclearanceservice_link ON aixm.aixm_feature.hjid = service.timeslice_airportclearanceservice_link.timeslice
    INNER JOIN service.airportclearanceservice_tsp ON service.timeslice_airportclearanceservice_link.airportclearanceservicetype = service.airportclearanceservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.airportclearanceservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.airportsuppliesservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_airportsuppliesservice_link ON aixm.aixm_feature.hjid = service.timeslice_airportsuppliesservice_link.timeslice
    INNER JOIN service.airportsuppliesservice_tsp ON service.timeslice_airportsuppliesservice_link.airportsuppliesservicetype = service.airportsuppliesservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.airportsuppliesservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.airtrafficcontrolservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_airtrafficcontrolservice_link ON aixm.aixm_feature.hjid = service.timeslice_airtrafficcontrolservice_link.timeslice
    INNER JOIN service.airtrafficcontrolservice_tsp ON service.timeslice_airtrafficcontrolservice_link.airtrafficcontrolservicetype = service.airtrafficcontrolservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.airtrafficcontrolservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.airtrafficmanagementservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_airtrafficmanagementservice_link ON aixm.aixm_feature.hjid = service.timeslice_airtrafficmanagementservice_link.timeslice
    INNER JOIN service.airtrafficmanagementservice_tsp ON service.timeslice_airtrafficmanagementservice_link.airtrafficmanagementservicetype = service.airtrafficmanagementservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.airtrafficmanagementservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.aircraftgroundservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_aircraftgroundservice_link ON aixm.aixm_feature.hjid = service.timeslice_aircraftgroundservice_link.timeslice
    INNER JOIN service.aircraftgroundservice_tsp ON service.timeslice_aircraftgroundservice_link.aircraftgroundservicetype = service.aircraftgroundservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.aircraftgroundservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.firefightingservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_firefightingservice_link ON aixm.aixm_feature.hjid = service.timeslice_firefightingservice_link.timeslice
    INNER JOIN service.firefightingservice_tsp ON service.timeslice_firefightingservice_link.firefightingservicetype = service.firefightingservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.firefightingservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.groundtrafficcontrolservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_groundtrafficcontrolservice_link ON aixm.aixm_feature.hjid = service.timeslice_groundtrafficcontrolservice_link.timeslice
    INNER JOIN service.groundtrafficcontrolservice_tsp ON service.timeslice_groundtrafficcontrolservice_link.groundtrafficcontrolservicetype = service.groundtrafficcontrolservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.groundtrafficcontrolservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.informationservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_informationservice_link ON aixm.aixm_feature.hjid = service.timeslice_informationservice_link.timeslice
    INNER JOIN service.informationservice_tsp ON service.timeslice_informationservice_link.informationservicetype = service.informationservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.informationservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.passengerservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_passengerservice_link ON aixm.aixm_feature.hjid = service.timeslice_passengerservice_link.timeslice
    INNER JOIN service.passengerservice_tsp ON service.timeslice_passengerservice_link.passengerservicetype = service.passengerservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.passengerservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.pilotcontrolledlighting_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_pilotcontrolledlighting_link ON aixm.aixm_feature.hjid = service.timeslice_pilotcontrolledlighting_link.timeslice
    INNER JOIN service.pilotcontrolledlighting_tsp ON service.timeslice_pilotcontrolledlighting_link.pilotcontrolledlightingtype = service.pilotcontrolledlighting_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.pilotcontrolledlighting_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.searchrescueservice_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_searchrescueservice_link ON aixm.aixm_feature.hjid = service.timeslice_searchrescueservice_link.timeslice
    INNER JOIN service.searchrescueservice_tsp ON service.timeslice_searchrescueservice_link.searchrescueservicetype = service.searchrescueservice_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.searchrescueservice_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    service.radiocommunicationchannel_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN service.timeslice_radiocommunicationchannel_link ON aixm.aixm_feature.hjid = service.timeslice_radiocommunicationchannel_link.timeslice
    INNER JOIN service.radiocommunicationchannel_tsp ON service.timeslice_radiocommunicationchannel_link.radiocommunicationchanneltype = service.radiocommunicationchannel_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON service.radiocommunicationchannel_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    shared.holdingassessment_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN shared.timeslice_holdingassessment_link ON aixm.aixm_feature.hjid = shared.timeslice_holdingassessment_link.timeslice
    INNER JOIN shared.holdingassessment_tsp ON shared.timeslice_holdingassessment_link.holdingassessmenttype = shared.holdingassessment_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON shared.holdingassessment_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    shared.radiofrequencyarea_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN shared.timeslice_radiofrequencyarea_link ON aixm.aixm_feature.hjid = shared.timeslice_radiofrequencyarea_link.timeslice
    INNER JOIN shared.radiofrequencyarea_tsp ON shared.timeslice_radiofrequencyarea_link.radiofrequencyareatype = shared.radiofrequencyarea_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON shared.radiofrequencyarea_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    shared.specialdate_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN shared.timeslice_specialdate_link ON aixm.aixm_feature.hjid = shared.timeslice_specialdate_link.timeslice
    INNER JOIN shared.specialdate_tsp ON shared.timeslice_specialdate_link.specialdatetype = shared.specialdate_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON shared.specialdate_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    shared.standardlevelcolumn_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN shared.timeslice_standardlevelcolumn_link ON aixm.aixm_feature.hjid = shared.timeslice_standardlevelcolumn_link.timeslice
    INNER JOIN shared.standardlevelcolumn_tsp ON shared.timeslice_standardlevelcolumn_link.standardlevelcolumntype = shared.standardlevelcolumn_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON shared.standardlevelcolumn_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    shared.standardlevelsector_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN shared.timeslice_standardlevelsector_link ON aixm.aixm_feature.hjid = shared.timeslice_standardlevelsector_link.timeslice
    INNER JOIN shared.standardlevelsector_tsp ON shared.timeslice_standardlevelsector_link.standardlevelsectortype = shared.standardlevelsector_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON shared.standardlevelsector_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    shared.standardleveltable_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN shared.timeslice_standardleveltable_link ON aixm.aixm_feature.hjid = shared.timeslice_standardleveltable_link.timeslice
    INNER JOIN shared.standardleveltable_tsp ON shared.timeslice_standardleveltable_link.standardleveltabletype = shared.standardleveltable_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON shared.standardleveltable_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    surveillance.primarysurveillanceradar_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN surveillance.timeslice_primarysurveillanceradar_link ON aixm.aixm_feature.hjid = surveillance.timeslice_primarysurveillanceradar_link.timeslice
    INNER JOIN surveillance.primarysurveillanceradar_tsp ON surveillance.timeslice_primarysurveillanceradar_link.primarysurveillanceradartype = surveillance.primarysurveillanceradar_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON surveillance.primarysurveillanceradar_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    surveillance.precisionapproachradar_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN surveillance.timeslice_precisionapproachradar_link ON aixm.aixm_feature.hjid = surveillance.timeslice_precisionapproachradar_link.timeslice
    INNER JOIN surveillance.precisionapproachradar_tsp ON surveillance.timeslice_precisionapproachradar_link.precisionapproachradartype = surveillance.precisionapproachradar_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON surveillance.precisionapproachradar_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    surveillance.radarsystem_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN surveillance.timeslice_radarsystem_link ON aixm.aixm_feature.hjid = surveillance.timeslice_radarsystem_link.timeslice
    INNER JOIN surveillance.radarsystem_tsp ON surveillance.timeslice_radarsystem_link.radarsystemtype = surveillance.radarsystem_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON surveillance.radarsystem_tsp.ts_id = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
    aixm.message_member.hjid as m_hjid,
    aixm.aixm_feature.hjid as f_hjid,
    surveillance.secondarysurveillanceradar_tsp.hjid as tsp_hjid,
    aixm.aixm_timeslice.hjid as ts_hjid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.sequence_number, 
    aixm.aixm_timeslice.correction_number, 
    aixm.aixm_timeslice.valid_time_begin, 
    aixm.aixm_timeslice.valid_time_end
    FROM aixm.aixm_feature
    INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
    INNER JOIN surveillance.timeslice_secondarysurveillanceradar_link ON aixm.aixm_feature.hjid = surveillance.timeslice_secondarysurveillanceradar_link.timeslice
    INNER JOIN surveillance.secondarysurveillanceradar_tsp ON surveillance.timeslice_secondarysurveillanceradar_link.secondarysurveillanceradartype = surveillance.secondarysurveillanceradar_tsp.hjid
    INNER JOIN aixm.aixm_timeslice ON surveillance.secondarysurveillanceradar_tsp.ts_id = aixm.aixm_timeslice.hjid
)
SELECT DISTINCT ON (identifier, sequence_number)
    tsp_hjid
    FROM union_query
WHERE valid_time_end > :time or valid_time_end is NULL 
ORDER BY identifier, sequence_number,correction_number DESC;
