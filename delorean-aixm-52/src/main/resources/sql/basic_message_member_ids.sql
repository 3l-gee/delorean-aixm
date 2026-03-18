
/*
This query retrieves the distinct m_hjid (BasicMessageMemberAIXMPropertyType) values timeslices associated with AIXM features. 
It combines (via UNION ALL) timeslices joins them to their corresponding features and timeslices, 
and filters for currently valid timeslices (valid_time_end > :time or NULL). Among duplicates, 
it selects the latest correction (correction_number DESC) for each feature identifier and sequence number.
*/

WITH union_query AS (
    SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            aerial_refuelling.aerialrefuelling_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN aerial_refuelling.aerialrefuelling_tp ON aixm.aixm_feature.hjid = aerial_refuelling.aerialrefuelling_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON aerial_refuelling.aerialrefuelling_tp.aerialrefuellingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportheliport_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliport_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliport_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliport_tp.airportheliporttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportheliportcollocation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliportcollocation_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliportcollocation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportcollocation_tp.airportheliportcollocationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airporthotspot_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airporthotspot_tp ON aixm.aixm_feature.hjid = airport_heliport.airporthotspot_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airporthotspot_tp.airporthotspottimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.nonmovementarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.nonmovementarea_tp ON aixm.aixm_feature.hjid = airport_heliport.nonmovementarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.nonmovementarea_tp.nonmovementareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.surveycontrolpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.surveycontrolpoint_tp ON aixm.aixm_feature.hjid = airport_heliport.surveycontrolpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.surveycontrolpoint_tp.surveycontrolpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.waterbody_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.waterbody_tp ON aixm.aixm_feature.hjid = airport_heliport.waterbody_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.waterbody_tp.waterbodytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.weathersource_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.weathersource_tp ON aixm.aixm_feature.hjid = airport_heliport.weathersource_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.weathersource_tp.weathersourcetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.workarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.workarea_tp ON aixm.aixm_feature.hjid = airport_heliport.workarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.workarea_tp.workareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.aircraftstand_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.aircraftstand_tp ON aixm.aixm_feature.hjid = airport_heliport.aircraftstand_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.aircraftstand_tp.aircraftstandtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.apron_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.apron_tp ON aixm.aixm_feature.hjid = airport_heliport.apron_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.apron_tp.aprontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.apronelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.apronelement_tp ON aixm.aixm_feature.hjid = airport_heliport.apronelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronelement_tp.apronelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.deicingarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.deicingarea_tp ON aixm.aixm_feature.hjid = airport_heliport.deicingarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.deicingarea_tp.deicingareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.passengerloadingbridge_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.passengerloadingbridge_tp ON aixm.aixm_feature.hjid = airport_heliport.passengerloadingbridge_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.passengerloadingbridge_tp.passengerloadingbridgetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.road_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.road_tp ON aixm.aixm_feature.hjid = airport_heliport.road_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.road_tp.roadtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.touchdownliftoff_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.touchdownliftoff_tp ON aixm.aixm_feature.hjid = airport_heliport.touchdownliftoff_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoff_tp.touchdownliftofftimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.touchdownliftoffsafearea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.touchdownliftoffsafearea_tp ON aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffsafearea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoffsafearea_tp.touchdownliftoffsafeareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.approachlightingsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.approachlightingsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.approachlightingsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.approachlightingsystem_tp.approachlightingsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.apronlightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.apronlightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.apronlightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronlightsystem_tp.apronlightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.guidancelinelightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.guidancelinelightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.guidancelinelightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidancelinelightsystem_tp.guidancelinelightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaydirectionlightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaydirectionlightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaydirectionlightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaydirectionlightsystem_tp.runwaydirectionlightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwayprotectarealightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwayprotectarealightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.runwayprotectarealightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayprotectarealightsystem_tp.runwayprotectarealightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiholdingpositionlightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiholdingpositionlightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiholdingpositionlightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiholdingpositionlightsystem_tp.taxiholdingpositionlightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiwaylightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiwaylightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiwaylightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwaylightsystem_tp.taxiwaylightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.touchdownliftofflightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.touchdownliftofflightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.touchdownliftofflightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftofflightsystem_tp.touchdownliftofflightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportprotectionareamarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportprotectionareamarking_tp ON aixm.aixm_feature.hjid = airport_heliport.airportprotectionareamarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportprotectionareamarking_tp.airportprotectionareamarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.apronmarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.apronmarking_tp ON aixm.aixm_feature.hjid = airport_heliport.apronmarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronmarking_tp.apronmarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.deicingareamarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.deicingareamarking_tp ON aixm.aixm_feature.hjid = airport_heliport.deicingareamarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.deicingareamarking_tp.deicingareamarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.guidancelinemarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.guidancelinemarking_tp ON aixm.aixm_feature.hjid = airport_heliport.guidancelinemarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidancelinemarking_tp.guidancelinemarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaymarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaymarking_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaymarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaymarking_tp.runwaymarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.standmarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.standmarking_tp ON aixm.aixm_feature.hjid = airport_heliport.standmarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.standmarking_tp.standmarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiholdingpositionmarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiholdingpositionmarking_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiholdingpositionmarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiholdingpositionmarking_tp.taxiholdingpositionmarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiwaymarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiwaymarking_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiwaymarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwaymarking_tp.taxiwaymarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.touchdownliftoffmarking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.touchdownliftoffmarking_tp ON aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffmarking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoffmarking_tp.touchdownliftoffmarkingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportsign_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportsign_tp ON aixm.aixm_feature.hjid = airport_heliport.airportsign_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportsign_tp.airportsigntimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.arrestinggear_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.arrestinggear_tp ON aixm.aixm_feature.hjid = airport_heliport.arrestinggear_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.arrestinggear_tp.arrestinggeartimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runway_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runway_tp ON aixm.aixm_feature.hjid = airport_heliport.runway_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runway_tp.runwaytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwayblastpad_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwayblastpad_tp ON aixm.aixm_feature.hjid = airport_heliport.runwayblastpad_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayblastpad_tp.runwayblastpadtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaycentrelinepoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaycentrelinepoint_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaycentrelinepoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaycentrelinepoint_tp.runwaycentrelinepointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaydirection_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaydirection_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaydirection_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaydirection_tp.runwaydirectiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwayelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwayelement_tp ON aixm.aixm_feature.hjid = airport_heliport.runwayelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayelement_tp.runwayelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwayprotectarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwayprotectarea_tp ON aixm.aixm_feature.hjid = airport_heliport.runwayprotectarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayprotectarea_tp.runwayprotectareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwayvisualrangeequipment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwayvisualrangeequipment_tp ON aixm.aixm_feature.hjid = airport_heliport.runwayvisualrangeequipment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayvisualrangeequipment_tp.runwayvisualrangeequipmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.visualglideslopeindicator_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.visualglideslopeindicator_tp ON aixm.aixm_feature.hjid = airport_heliport.visualglideslopeindicator_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.visualglideslopeindicator_tp.visualglideslopeindicatortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.floatingdocksite_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.floatingdocksite_tp ON aixm.aixm_feature.hjid = airport_heliport.floatingdocksite_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.floatingdocksite_tp.floatingdocksitetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.gangway_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.gangway_tp ON aixm.aixm_feature.hjid = airport_heliport.gangway_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.gangway_tp.gangwaytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.markingbuoy_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.markingbuoy_tp ON aixm.aixm_feature.hjid = airport_heliport.markingbuoy_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.markingbuoy_tp.markingbuoytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.seaplanelandingarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.seaplanelandingarea_tp ON aixm.aixm_feature.hjid = airport_heliport.seaplanelandingarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.seaplanelandingarea_tp.seaplanelandingareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.seaplanerampsite_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.seaplanerampsite_tp ON aixm.aixm_feature.hjid = airport_heliport.seaplanerampsite_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.seaplanerampsite_tp.seaplanerampsitetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.guidanceline_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.guidanceline_tp ON aixm.aixm_feature.hjid = airport_heliport.guidanceline_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidanceline_tp.guidancelinetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiholdingposition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiholdingposition_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiholdingposition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiholdingposition_tp.taxiholdingpositiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiway_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiway_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiway_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiway_tp.taxiwaytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiwayelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiwayelement_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiwayelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwayelement_tp.taxiwayelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.airspace_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.airspace_tp ON aixm.aixm_feature.hjid = airspace.airspace_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.airspace_tp.airspacetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.authorityforairspace_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.authorityforairspace_tp ON aixm.aixm_feature.hjid = airspace.authorityforairspace_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.authorityforairspace_tp.authorityforairspacetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.geoborder_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.geoborder_tp ON aixm.aixm_feature.hjid = airspace.geoborder_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.geoborder_tp.geobordertimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            holding.holdingpattern_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN holding.holdingpattern_tp ON aixm.aixm_feature.hjid = holding.holdingpattern_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON holding.holdingpattern_tp.holdingpatterntimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            holding.unplannedholding_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN holding.unplannedholding_tp ON aixm.aixm_feature.hjid = holding.unplannedholding_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON holding.unplannedholding_tp.unplannedholdingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.altimetercheckpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.altimetercheckpoint_tp ON aixm.aixm_feature.hjid = navaids_point.altimetercheckpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.altimetercheckpoint_tp.altimetercheckpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.azimuth_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.azimuth_tp ON aixm.aixm_feature.hjid = navaids_point.azimuth_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.azimuth_tp.azimuthtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.checkpointins_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.checkpointins_tp ON aixm.aixm_feature.hjid = navaids_point.checkpointins_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.checkpointins_tp.checkpointinstimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.checkpointvor_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.checkpointvor_tp ON aixm.aixm_feature.hjid = navaids_point.checkpointvor_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.checkpointvor_tp.checkpointvortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.directionfinder_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.directionfinder_tp ON aixm.aixm_feature.hjid = navaids_point.directionfinder_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.directionfinder_tp.directionfindertimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.dme_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.dme_tp ON aixm.aixm_feature.hjid = navaids_point.dme_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.dme_tp.dmetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.elevation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.elevation_tp ON aixm.aixm_feature.hjid = navaids_point.elevation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.elevation_tp.elevationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.glidepath_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.glidepath_tp ON aixm.aixm_feature.hjid = navaids_point.glidepath_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.glidepath_tp.glidepathtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.localizer_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.localizer_tp ON aixm.aixm_feature.hjid = navaids_point.localizer_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.localizer_tp.localizertimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.markerbeacon_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.markerbeacon_tp ON aixm.aixm_feature.hjid = navaids_point.markerbeacon_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.markerbeacon_tp.markerbeacontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.navaid_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.navaid_tp ON aixm.aixm_feature.hjid = navaids_point.navaid_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.navaid_tp.navaidtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.ndb_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.ndb_tp ON aixm.aixm_feature.hjid = navaids_point.ndb_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.ndb_tp.ndbtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.sdf_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.sdf_tp ON aixm.aixm_feature.hjid = navaids_point.sdf_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.sdf_tp.sdftimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.specialnavigationstation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.specialnavigationstation_tp ON aixm.aixm_feature.hjid = navaids_point.specialnavigationstation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.specialnavigationstation_tp.specialnavigationstationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.specialnavigationsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.specialnavigationsystem_tp ON aixm.aixm_feature.hjid = navaids_point.specialnavigationsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.specialnavigationsystem_tp.specialnavigationsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.tacan_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.tacan_tp ON aixm.aixm_feature.hjid = navaids_point.tacan_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.tacan_tp.tacantimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.vor_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.vor_tp ON aixm.aixm_feature.hjid = navaids_point.vor_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.vor_tp.vortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.designatedpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.designatedpoint_tp ON aixm.aixm_feature.hjid = navaids_point.designatedpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.designatedpoint_tp.designatedpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.significantpointinairspace_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.significantpointinairspace_tp ON aixm.aixm_feature.hjid = navaids_point.significantpointinairspace_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.significantpointinairspace_tp.significantpointinairspacetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.gbas_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.gbas_tp ON aixm.aixm_feature.hjid = navaids_point.gbas_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.gbas_tp.gbastimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.gbasservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.gbasservice_tp ON aixm.aixm_feature.hjid = navaids_point.gbasservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.gbasservice_tp.gbasservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.satelliteservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.satelliteservice_tp ON aixm.aixm_feature.hjid = navaids_point.satelliteservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.satelliteservice_tp.satelliteservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.satellitesystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.satellitesystem_tp ON aixm.aixm_feature.hjid = navaids_point.satellitesystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.satellitesystem_tp.satellitesystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.aeronauticalgroundlight_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.aeronauticalgroundlight_tp ON aixm.aixm_feature.hjid = navaids_point.aeronauticalgroundlight_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.aeronauticalgroundlight_tp.aeronauticalgroundlighttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            obstacle.obstaclearea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN obstacle.obstaclearea_tp ON aixm.aixm_feature.hjid = obstacle.obstaclearea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON obstacle.obstaclearea_tp.obstacleareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            obstacle.verticalstructure_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN obstacle.verticalstructure_tp ON aixm.aixm_feature.hjid = obstacle.verticalstructure_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON obstacle.verticalstructure_tp.verticalstructuretimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            organisation.organisationauthority_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN organisation.organisationauthority_tp ON aixm.aixm_feature.hjid = organisation.organisationauthority_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON organisation.organisationauthority_tp.organisationauthoritytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            organisation.unit_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN organisation.unit_tp ON aixm.aixm_feature.hjid = organisation.unit_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON organisation.unit_tp.unittimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.instrumentapproachprocedure_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.instrumentapproachprocedure_tp ON aixm.aixm_feature.hjid = procedure.instrumentapproachprocedure_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.instrumentapproachprocedure_tp.instrumentapproachproceduretimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.terminalarrivalarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.terminalarrivalarea_tp ON aixm.aixm_feature.hjid = procedure.terminalarrivalarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.terminalarrivalarea_tp.terminalarrivalareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.circlingarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.circlingarea_tp ON aixm.aixm_feature.hjid = procedure.circlingarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.circlingarea_tp.circlingareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.standardinstrumentarrival_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.standardinstrumentarrival_tp ON aixm.aixm_feature.hjid = procedure.standardinstrumentarrival_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.standardinstrumentarrival_tp.standardinstrumentarrivaltimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.navigationarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.navigationarea_tp ON aixm.aixm_feature.hjid = procedure.navigationarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.navigationarea_tp.navigationareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.standardinstrumentdeparture_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.standardinstrumentdeparture_tp ON aixm.aixm_feature.hjid = procedure.standardinstrumentdeparture_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.standardinstrumentdeparture_tp.standardinstrumentdeparturetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.minimumaltitudearea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.minimumaltitudearea_tp ON aixm.aixm_feature.hjid = procedure.minimumaltitudearea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.minimumaltitudearea_tp.minimumaltitudeareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.arrivalfeederleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.arrivalfeederleg_tp ON aixm.aixm_feature.hjid = procedure.arrivalfeederleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.arrivalfeederleg_tp.arrivalfeederlegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.arrivalleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.arrivalleg_tp ON aixm.aixm_feature.hjid = procedure.arrivalleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.arrivalleg_tp.arrivallegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.departureleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.departureleg_tp ON aixm.aixm_feature.hjid = procedure.departureleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.departureleg_tp.departurelegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.finalleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.finalleg_tp ON aixm.aixm_feature.hjid = procedure.finalleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.finalleg_tp.finallegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.initialleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.initialleg_tp ON aixm.aixm_feature.hjid = procedure.initialleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.initialleg_tp.initiallegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.intermediateleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.intermediateleg_tp ON aixm.aixm_feature.hjid = procedure.intermediateleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.intermediateleg_tp.intermediatelegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.missedapproachleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.missedapproachleg_tp ON aixm.aixm_feature.hjid = procedure.missedapproachleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.missedapproachleg_tp.missedapproachlegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.navigationarearestriction_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.navigationarearestriction_tp ON aixm.aixm_feature.hjid = procedure.navigationarearestriction_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.navigationarearestriction_tp.navigationarearestrictiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.proceduredme_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.proceduredme_tp ON aixm.aixm_feature.hjid = procedure.proceduredme_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.proceduredme_tp.proceduredmetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.changeoverpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.changeoverpoint_tp ON aixm.aixm_feature.hjid = route.changeoverpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.changeoverpoint_tp.changeoverpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.route_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.route_tp ON aixm.aixm_feature.hjid = route.route_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.route_tp.routetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.routedme_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.routedme_tp ON aixm.aixm_feature.hjid = route.routedme_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.routedme_tp.routedmetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.routesegment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.routesegment_tp ON aixm.aixm_feature.hjid = route.routesegment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.routesegment_tp.routesegmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightrestriction_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightrestriction_tp ON aixm.aixm_feature.hjid = route.flightrestriction_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightrestriction_tp.flightrestrictiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            rules_procedure.rulesprocedures_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN rules_procedure.rulesprocedures_tp ON aixm.aixm_feature.hjid = rules_procedure.rulesprocedures_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON rules_procedure.rulesprocedures_tp.rulesprocedurestimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.aircraftgroundservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.aircraftgroundservice_tp ON aixm.aixm_feature.hjid = service.aircraftgroundservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.aircraftgroundservice_tp.aircraftgroundservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.airportclearanceservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.airportclearanceservice_tp ON aixm.aixm_feature.hjid = service.airportclearanceservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.airportclearanceservice_tp.airportclearanceservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.airportsuppliesservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.airportsuppliesservice_tp ON aixm.aixm_feature.hjid = service.airportsuppliesservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.airportsuppliesservice_tp.airportsuppliesservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.airtrafficcontrolservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.airtrafficcontrolservice_tp ON aixm.aixm_feature.hjid = service.airtrafficcontrolservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.airtrafficcontrolservice_tp.airtrafficcontrolservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.airtrafficflowmanagementservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.airtrafficflowmanagementservice_tp ON aixm.aixm_feature.hjid = service.airtrafficflowmanagementservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.airtrafficflowmanagementservice_tp.airtrafficflowmanagementservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.firefightingservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.firefightingservice_tp ON aixm.aixm_feature.hjid = service.firefightingservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.firefightingservice_tp.firefightingservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.groundtrafficcontrolservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.groundtrafficcontrolservice_tp ON aixm.aixm_feature.hjid = service.groundtrafficcontrolservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.groundtrafficcontrolservice_tp.groundtrafficcontrolservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.informationservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.informationservice_tp ON aixm.aixm_feature.hjid = service.informationservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.informationservice_tp.informationservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.passengerservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.passengerservice_tp ON aixm.aixm_feature.hjid = service.passengerservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.passengerservice_tp.passengerservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.pilotcontrolledlighting_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.pilotcontrolledlighting_tp ON aixm.aixm_feature.hjid = service.pilotcontrolledlighting_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.pilotcontrolledlighting_tp.pilotcontrolledlightingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.radiocommunicationchannel_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.radiocommunicationchannel_tp ON aixm.aixm_feature.hjid = service.radiocommunicationchannel_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.radiocommunicationchannel_tp.radiocommunicationchanneltimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.searchrescueservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.searchrescueservice_tp ON aixm.aixm_feature.hjid = service.searchrescueservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.searchrescueservice_tp.searchrescueservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.radiofrequencyarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.radiofrequencyarea_tp ON aixm.aixm_feature.hjid = shared.radiofrequencyarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.radiofrequencyarea_tp.radiofrequencyareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.specialdate_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.specialdate_tp ON aixm.aixm_feature.hjid = shared.specialdate_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.specialdate_tp.specialdatetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.standardlevelcolumn_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.standardlevelcolumn_tp ON aixm.aixm_feature.hjid = shared.standardlevelcolumn_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.standardlevelcolumn_tp.standardlevelcolumntimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.standardlevelsector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.standardlevelsector_tp ON aixm.aixm_feature.hjid = shared.standardlevelsector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.standardlevelsector_tp.standardlevelsectortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.standardleveltable_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.standardleveltable_tp ON aixm.aixm_feature.hjid = shared.standardleveltable_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.standardleveltable_tp.standardleveltabletimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.holdingassessment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.holdingassessment_tp ON aixm.aixm_feature.hjid = shared.holdingassessment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.holdingassessment_tp.holdingassessmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.precisionapproachradar_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.precisionapproachradar_tp ON aixm.aixm_feature.hjid = surveillance.precisionapproachradar_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.precisionapproachradar_tp.precisionapproachradartimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.primarysurveillanceradar_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.primarysurveillanceradar_tp ON aixm.aixm_feature.hjid = surveillance.primarysurveillanceradar_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.primarysurveillanceradar_tp.primarysurveillanceradartimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.radarsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.radarsystem_tp ON aixm.aixm_feature.hjid = surveillance.radarsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.radarsystem_tp.radarsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.secondarysurveillanceradar_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.secondarysurveillanceradar_tp ON aixm.aixm_feature.hjid = surveillance.secondarysurveillanceradar_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.secondarysurveillanceradar_tp.secondarysurveillanceradartimeslice_hjid = aixm.aixm_timeslice.hjid
) 
SELECT DISTINCT ON (identifier, sequence_number)
    m_hjid
    FROM union_query
WHERE valid_time_end > :time or valid_time_end is NULL 
ORDER BY identifier, sequence_number,correction_number DESC;
    