
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
            aerial_refuelling.aerialrefuellinganchor_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN aerial_refuelling.aerialrefuellinganchor_tp ON aixm.aixm_feature.hjid = aerial_refuelling.aerialrefuellinganchor_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON aerial_refuelling.aerialrefuellinganchor_tp.aerialrefuellinganchortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            aerial_refuelling.aerialrefuellingpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN aerial_refuelling.aerialrefuellingpoint_tp ON aixm.aixm_feature.hjid = aerial_refuelling.aerialrefuellingpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON aerial_refuelling.aerialrefuellingpoint_tp.aerialrefuellingpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            aerial_refuelling.aerialrefuellingtrack_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN aerial_refuelling.aerialrefuellingtrack_tp ON aixm.aixm_feature.hjid = aerial_refuelling.aerialrefuellingtrack_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON aerial_refuelling.aerialrefuellingtrack_tp.aerialrefuellingtracktimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            aerial_refuelling.authorityforaerialrefuelling_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN aerial_refuelling.authorityforaerialrefuelling_tp ON aixm.aixm_feature.hjid = aerial_refuelling.authorityforaerialrefuelling_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON aerial_refuelling.authorityforaerialrefuelling_tp.authorityforaerialrefuellingtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.airportheliportavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliportavailability_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliportavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportavailability_tp.airportheliportavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.airportheliportprotectionarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliportprotectionarea_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliportprotectionarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportprotectionarea_tp.airportheliportprotectionareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportheliportresponsibilityorganisation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliportresponsibilityorganisation_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliportresponsibilityorganisation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportresponsibilityorganisation_tp.airportheliportresponsibilityorganisationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportheliportusage_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliportusage_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliportusage_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportusage_tp.airportheliportusagetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.altimetersource_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.altimetersource_tp ON aixm.aixm_feature.hjid = airport_heliport.altimetersource_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.altimetersource_tp.altimetersourcetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.altimetersourcestatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.altimetersourcestatus_tp ON aixm.aixm_feature.hjid = airport_heliport.altimetersourcestatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.altimetersourcestatus_tp.altimetersourcestatustimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.city_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.city_tp ON aixm.aixm_feature.hjid = airport_heliport.city_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.city_tp.citytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.conditioncombination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.conditioncombination_tp ON aixm.aixm_feature.hjid = airport_heliport.conditioncombination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.conditioncombination_tp.conditioncombinationtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.surfacecharacteristics_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.surfacecharacteristics_tp ON aixm.aixm_feature.hjid = airport_heliport.surfacecharacteristics_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.surfacecharacteristics_tp.surfacecharacteristicstimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.usagecondition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.usagecondition_tp ON aixm.aixm_feature.hjid = airport_heliport.usagecondition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.usagecondition_tp.usageconditiontimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.workareaactivity_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.workareaactivity_tp ON aixm.aixm_feature.hjid = airport_heliport.workareaactivity_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.workareaactivity_tp.workareaactivitytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.apronareaavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.apronareaavailability_tp ON aixm.aixm_feature.hjid = airport_heliport.apronareaavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronareaavailability_tp.apronareaavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.apronareausage_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.apronareausage_tp ON aixm.aixm_feature.hjid = airport_heliport.apronareausage_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.apronareausage_tp.apronareausagetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.groundlightsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.groundlightsystem_tp ON aixm.aixm_feature.hjid = airport_heliport.groundlightsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.groundlightsystem_tp.groundlightsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.groundlightingavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.groundlightingavailability_tp ON aixm.aixm_feature.hjid = airport_heliport.groundlightingavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.groundlightingavailability_tp.groundlightingavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.lightactivation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.lightactivation_tp ON aixm.aixm_feature.hjid = airport_heliport.lightactivation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.lightactivation_tp.lightactivationtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.marking_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.marking_tp ON aixm.aixm_feature.hjid = airport_heliport.marking_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.marking_tp.markingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.markingelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.markingelement_tp ON aixm.aixm_feature.hjid = airport_heliport.markingelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.markingelement_tp.markingelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.markingextent_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.markingextent_tp ON aixm.aixm_feature.hjid = airport_heliport.markingextent_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.markingextent_tp.markingextenttimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.arrestinggearextent_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.arrestinggearextent_tp ON aixm.aixm_feature.hjid = airport_heliport.arrestinggearextent_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.arrestinggearextent_tp.arrestinggearextenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.manoeuvringareaavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.manoeuvringareaavailability_tp ON aixm.aixm_feature.hjid = airport_heliport.manoeuvringareaavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.manoeuvringareaavailability_tp.manoeuvringareaavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.manoeuvringareausage_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.manoeuvringareausage_tp ON aixm.aixm_feature.hjid = airport_heliport.manoeuvringareausage_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.manoeuvringareausage_tp.manoeuvringareausagetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.navaidequipmentdistance_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.navaidequipmentdistance_tp ON aixm.aixm_feature.hjid = airport_heliport.navaidequipmentdistance_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.navaidequipmentdistance_tp.navaidequipmentdistancetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.runwaydeclareddistance_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaydeclareddistance_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaydeclareddistance_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaydeclareddistance_tp.runwaydeclareddistancetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaydeclareddistancevalue_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaydeclareddistancevalue_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaydeclareddistancevalue_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaydeclareddistancevalue_tp.runwaydeclareddistancevaluetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.runwayvisualrange_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwayvisualrange_tp ON aixm.aixm_feature.hjid = airport_heliport.runwayvisualrange_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwayvisualrange_tp.runwayvisualrangetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.aircraftstandcontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.aircraftstandcontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.aircraftstandcontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.aircraftstandcontamination_tp.aircraftstandcontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.airportheliportcontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportheliportcontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.airportheliportcontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportheliportcontamination_tp.airportheliportcontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.aproncontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.aproncontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.aproncontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.aproncontamination_tp.aproncontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.ridge_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.ridge_tp ON aixm.aixm_feature.hjid = airport_heliport.ridge_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.ridge_tp.ridgetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaycontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaycontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaycontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaycontamination_tp.runwaycontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.runwaysectioncontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.runwaysectioncontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.runwaysectioncontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.runwaysectioncontamination_tp.runwaysectioncontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.surfacecontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.surfacecontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.surfacecontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.surfacecontamination_tp.surfacecontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.surfacecontaminationlayer_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.surfacecontaminationlayer_tp ON aixm.aixm_feature.hjid = airport_heliport.surfacecontaminationlayer_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.surfacecontaminationlayer_tp.surfacecontaminationlayertimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.taxiwaycontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.taxiwaycontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.taxiwaycontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.taxiwaycontamination_tp.taxiwaycontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.touchdownliftoffcontamination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.touchdownliftoffcontamination_tp ON aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffcontamination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.touchdownliftoffcontamination_tp.touchdownliftoffcontaminationtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.weathersourceavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.weathersourceavailability_tp ON aixm.aixm_feature.hjid = airport_heliport.weathersourceavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.weathersourceavailability_tp.weathersourceavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airport_heliport.lightgroup_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.lightgroup_tp ON aixm.aixm_feature.hjid = airport_heliport.lightgroup_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.lightgroup_tp.lightgrouptimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.airportsignstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.airportsignstatus_tp ON aixm.aixm_feature.hjid = airport_heliport.airportsignstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.airportsignstatus_tp.airportsignstatustimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airport_heliport.guidancelinedirection_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airport_heliport.guidancelinedirection_tp ON aixm.aixm_feature.hjid = airport_heliport.guidancelinedirection_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airport_heliport.guidancelinedirection_tp.guidancelinedirectiontimeslice_hjid = aixm.aixm_timeslice.hjid
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
            airspace.airspaceactivation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.airspaceactivation_tp ON aixm.aixm_feature.hjid = airspace.airspaceactivation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.airspaceactivation_tp.airspaceactivationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.airspacegeometrycomponent_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.airspacegeometrycomponent_tp ON aixm.aixm_feature.hjid = airspace.airspacegeometrycomponent_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.airspacegeometrycomponent_tp.airspacegeometrycomponenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.airspacelayerclass_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.airspacelayerclass_tp ON aixm.aixm_feature.hjid = airspace.airspacelayerclass_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.airspacelayerclass_tp.airspacelayerclasstimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.airspacevolume_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.airspacevolume_tp ON aixm.aixm_feature.hjid = airspace.airspacevolume_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.airspacevolume_tp.airspacevolumetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            airspace.airspacevolumedependency_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN airspace.airspacevolumedependency_tp ON aixm.aixm_feature.hjid = airspace.airspacevolumedependency_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON airspace.airspacevolumedependency_tp.airspacevolumedependencytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            gml.pointpropertytype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.pointpropertytype_tp ON aixm.aixm_feature.hjid = gml.pointpropertytype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.pointpropertytype_tp.pointpropertytypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.curvepropertytype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.curvepropertytype_tp ON aixm.aixm_feature.hjid = gml.curvepropertytype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.curvepropertytype_tp.curvepropertytypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.surfacepropertytype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.surfacepropertytype_tp ON aixm.aixm_feature.hjid = gml.surfacepropertytype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.surfacepropertytype_tp.surfacepropertytypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedpointpropertytype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedpointpropertytype_tp ON aixm.aixm_feature.hjid = gml.elevatedpointpropertytype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedpointpropertytype_tp.elevatedpointpropertytypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedcurvepropertytype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedcurvepropertytype_tp ON aixm.aixm_feature.hjid = gml.elevatedcurvepropertytype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedcurvepropertytype_tp.elevatedcurvepropertytypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedsurfacepropertytype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedsurfacepropertytype_tp ON aixm.aixm_feature.hjid = gml.elevatedsurfacepropertytype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedsurfacepropertytype_tp.elevatedsurfacepropertytypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedpoint_tp ON aixm.aixm_feature.hjid = gml.elevatedpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedpoint_tp.elevatedpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedcurve_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedcurve_tp ON aixm.aixm_feature.hjid = gml.elevatedcurve_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedcurve_tp.elevatedcurvetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedsurface_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedsurface_tp ON aixm.aixm_feature.hjid = gml.elevatedsurface_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedsurface_tp.elevatedsurfacetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.point_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.point_tp ON aixm.aixm_feature.hjid = gml.point_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.point_tp.pointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.curve_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.curve_tp ON aixm.aixm_feature.hjid = gml.curve_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.curve_tp.curvetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.surface_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.surface_tp ON aixm.aixm_feature.hjid = gml.surface_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.surface_tp.surfacetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.pointtype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.pointtype_tp ON aixm.aixm_feature.hjid = gml.pointtype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.pointtype_tp.pointtypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.curvetype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.curvetype_tp ON aixm.aixm_feature.hjid = gml.curvetype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.curvetype_tp.curvetypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.surfacetype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.surfacetype_tp ON aixm.aixm_feature.hjid = gml.surfacetype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.surfacetype_tp.surfacetypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedpointtype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedpointtype_tp ON aixm.aixm_feature.hjid = gml.elevatedpointtype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedpointtype_tp.elevatedpointtypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedcurvetype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedcurvetype_tp ON aixm.aixm_feature.hjid = gml.elevatedcurvetype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedcurvetype_tp.elevatedcurvetypetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            gml.elevatedsurfacetype_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN gml.elevatedsurfacetype_tp ON aixm.aixm_feature.hjid = gml.elevatedsurfacetype_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON gml.elevatedsurfacetype_tp.elevatedsurfacetypetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            holding.holdingpatterndistance_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN holding.holdingpatterndistance_tp ON aixm.aixm_feature.hjid = holding.holdingpatterndistance_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON holding.holdingpatterndistance_tp.holdingpatterndistancetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            holding.holdingpatternduration_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN holding.holdingpatternduration_tp ON aixm.aixm_feature.hjid = holding.holdingpatternduration_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON holding.holdingpatternduration_tp.holdingpatterndurationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            holding.holdingpatternlength_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN holding.holdingpatternlength_tp ON aixm.aixm_feature.hjid = holding.holdingpatternlength_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON holding.holdingpatternlength_tp.holdingpatternlengthtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.guidanceservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.guidanceservice_tp ON aixm.aixm_feature.hjid = navaids_point.guidanceservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.guidanceservice_tp.guidanceservicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.authorityfornavaidequipment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.authorityfornavaidequipment_tp ON aixm.aixm_feature.hjid = navaids_point.authorityfornavaidequipment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.authorityfornavaidequipment_tp.authorityfornavaidequipmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.authorityforspecialnavigationstation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.authorityforspecialnavigationstation_tp ON aixm.aixm_feature.hjid = navaids_point.authorityforspecialnavigationstation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.authorityforspecialnavigationstation_tp.authorityforspecialnavigationstationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.authorityforspecialnavigationsystem_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.authorityforspecialnavigationsystem_tp ON aixm.aixm_feature.hjid = navaids_point.authorityforspecialnavigationsystem_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.authorityforspecialnavigationsystem_tp.authorityforspecialnavigationsystemtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.navaidcomponent_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.navaidcomponent_tp ON aixm.aixm_feature.hjid = navaids_point.navaidcomponent_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.navaidcomponent_tp.navaidcomponenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.navaidequipment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.navaidequipment_tp ON aixm.aixm_feature.hjid = navaids_point.navaidequipment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.navaidequipment_tp.navaidequipmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.navaidequipmentmonitoring_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.navaidequipmentmonitoring_tp ON aixm.aixm_feature.hjid = navaids_point.navaidequipmentmonitoring_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.navaidequipmentmonitoring_tp.navaidequipmentmonitoringtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.navaidoperationalstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.navaidoperationalstatus_tp ON aixm.aixm_feature.hjid = navaids_point.navaidoperationalstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.navaidoperationalstatus_tp.navaidoperationalstatustimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.navigationsystemcheckpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.navigationsystemcheckpoint_tp ON aixm.aixm_feature.hjid = navaids_point.navigationsystemcheckpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.navigationsystemcheckpoint_tp.navigationsystemcheckpointtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.specialnavigationstationstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.specialnavigationstationstatus_tp ON aixm.aixm_feature.hjid = navaids_point.specialnavigationstationstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.specialnavigationstationstatus_tp.specialnavigationstationstatustimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.angleindication_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.angleindication_tp ON aixm.aixm_feature.hjid = navaids_point.angleindication_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.angleindication_tp.angleindicationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.angleuse_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.angleuse_tp ON aixm.aixm_feature.hjid = navaids_point.angleuse_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.angleuse_tp.angleusetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.distanceindication_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.distanceindication_tp ON aixm.aixm_feature.hjid = navaids_point.distanceindication_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.distanceindication_tp.distanceindicationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.enroutesegmentpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.enroutesegmentpoint_tp ON aixm.aixm_feature.hjid = navaids_point.enroutesegmentpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.enroutesegmentpoint_tp.enroutesegmentpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.pointreference_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.pointreference_tp ON aixm.aixm_feature.hjid = navaids_point.pointreference_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.pointreference_tp.pointreferencetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.segmentpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.segmentpoint_tp ON aixm.aixm_feature.hjid = navaids_point.segmentpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.segmentpoint_tp.segmentpointtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.terminalsegmentpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.terminalsegmentpoint_tp ON aixm.aixm_feature.hjid = navaids_point.terminalsegmentpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.terminalsegmentpoint_tp.terminalsegmentpointtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.significantpoint_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.significantpoint_tp ON aixm.aixm_feature.hjid = navaids_point.significantpoint_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.significantpoint_tp.significantpointtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.angle_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.angle_tp ON aixm.aixm_feature.hjid = navaids_point.angle_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.angle_tp.angletimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.distance_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.distance_tp ON aixm.aixm_feature.hjid = navaids_point.distance_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.distance_tp.distancetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.pointusage_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.pointusage_tp ON aixm.aixm_feature.hjid = navaids_point.pointusage_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.pointusage_tp.pointusagetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.flightinspectiontrajectory_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.flightinspectiontrajectory_tp ON aixm.aixm_feature.hjid = navaids_point.flightinspectiontrajectory_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.flightinspectiontrajectory_tp.flightinspectiontrajectorytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.radiofrequency_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.radiofrequency_tp ON aixm.aixm_feature.hjid = navaids_point.radiofrequency_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.radiofrequency_tp.radiofrequencytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.satelliteapproachoperation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.satelliteapproachoperation_tp ON aixm.aixm_feature.hjid = navaids_point.satelliteapproachoperation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.satelliteapproachoperation_tp.satelliteapproachoperationtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            navaids_point.satelliteservicearea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.satelliteservicearea_tp ON aixm.aixm_feature.hjid = navaids_point.satelliteservicearea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.satelliteservicearea_tp.satelliteserviceareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            navaids_point.vdbantenna_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN navaids_point.vdbantenna_tp ON aixm.aixm_feature.hjid = navaids_point.vdbantenna_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON navaids_point.vdbantenna_tp.vdbantennatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            note.linguisticnote_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN note.linguisticnote_tp ON aixm.aixm_feature.hjid = note.linguisticnote_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON note.linguisticnote_tp.linguisticnotetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            note.note_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN note.note_tp ON aixm.aixm_feature.hjid = note.note_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON note.note_tp.notetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            obstacle.obstacleareaorigin_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN obstacle.obstacleareaorigin_tp ON aixm.aixm_feature.hjid = obstacle.obstacleareaorigin_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON obstacle.obstacleareaorigin_tp.obstacleareaorigintimeslice_hjid = aixm.aixm_timeslice.hjid
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
            obstacle.verticalstructurelightingstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN obstacle.verticalstructurelightingstatus_tp ON aixm.aixm_feature.hjid = obstacle.verticalstructurelightingstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON obstacle.verticalstructurelightingstatus_tp.verticalstructurelightingstatustimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            obstacle.verticalstructurepart_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN obstacle.verticalstructurepart_tp ON aixm.aixm_feature.hjid = obstacle.verticalstructurepart_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON obstacle.verticalstructurepart_tp.verticalstructureparttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            obstacle.verticalstructurepartgeometry_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN obstacle.verticalstructurepartgeometry_tp ON aixm.aixm_feature.hjid = obstacle.verticalstructurepartgeometry_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON obstacle.verticalstructurepartgeometry_tp.verticalstructurepartgeometrytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            organisation.organisationauthorityassociation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN organisation.organisationauthorityassociation_tp ON aixm.aixm_feature.hjid = organisation.organisationauthorityassociation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON organisation.organisationauthorityassociation_tp.organisationauthorityassociationtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            organisation.unitavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN organisation.unitavailability_tp ON aixm.aixm_feature.hjid = organisation.unitavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON organisation.unitavailability_tp.unitavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            organisation.unitdependency_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN organisation.unitdependency_tp ON aixm.aixm_feature.hjid = organisation.unitdependency_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON organisation.unitdependency_tp.unitdependencytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.approachaltitudetable_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.approachaltitudetable_tp ON aixm.aixm_feature.hjid = procedure.approachaltitudetable_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.approachaltitudetable_tp.approachaltitudetabletimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.approachcondition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.approachcondition_tp ON aixm.aixm_feature.hjid = procedure.approachcondition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.approachcondition_tp.approachconditiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.approachdistancetable_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.approachdistancetable_tp ON aixm.aixm_feature.hjid = procedure.approachdistancetable_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.approachdistancetable_tp.approachdistancetabletimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.approachtimingtable_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.approachtimingtable_tp ON aixm.aixm_feature.hjid = procedure.approachtimingtable_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.approachtimingtable_tp.approachtimingtabletimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.finalprofile_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.finalprofile_tp ON aixm.aixm_feature.hjid = procedure.finalprofile_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.finalprofile_tp.finalprofiletimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.missedapproachgroup_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.missedapproachgroup_tp ON aixm.aixm_feature.hjid = procedure.missedapproachgroup_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.missedapproachgroup_tp.missedapproachgrouptimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.terminalarrivalareasector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.terminalarrivalareasector_tp ON aixm.aixm_feature.hjid = procedure.terminalarrivalareasector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.terminalarrivalareasector_tp.terminalarrivalareasectortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.fasdatablock_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.fasdatablock_tp ON aixm.aixm_feature.hjid = procedure.fasdatablock_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.fasdatablock_tp.fasdatablocktimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.circlingrestriction_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.circlingrestriction_tp ON aixm.aixm_feature.hjid = procedure.circlingrestriction_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.circlingrestriction_tp.circlingrestrictiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.equipmentunavailableadjustment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.equipmentunavailableadjustment_tp ON aixm.aixm_feature.hjid = procedure.equipmentunavailableadjustment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.equipmentunavailableadjustment_tp.equipmentunavailableadjustmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.equipmentunavailableadjustmentcolumn_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.equipmentunavailableadjustmentcolumn_tp ON aixm.aixm_feature.hjid = procedure.equipmentunavailableadjustmentcolumn_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.equipmentunavailableadjustmentcolumn_tp.equipmentunavailableadjustmentcolumntimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.minima_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.minima_tp ON aixm.aixm_feature.hjid = procedure.minima_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.minima_tp.minimatimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.departurearrivalcondition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.departurearrivalcondition_tp ON aixm.aixm_feature.hjid = procedure.departurearrivalcondition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.departurearrivalcondition_tp.departurearrivalconditiontimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.navigationareasector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.navigationareasector_tp ON aixm.aixm_feature.hjid = procedure.navigationareasector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.navigationareasector_tp.navigationareasectortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.sectordesign_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.sectordesign_tp ON aixm.aixm_feature.hjid = procedure.sectordesign_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.sectordesign_tp.sectordesigntimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.safealtitudearea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.safealtitudearea_tp ON aixm.aixm_feature.hjid = procedure.safealtitudearea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.safealtitudearea_tp.safealtitudeareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.safealtitudeareasector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.safealtitudeareasector_tp ON aixm.aixm_feature.hjid = procedure.safealtitudeareasector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.safealtitudeareasector_tp.safealtitudeareasectortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.approachleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.approachleg_tp ON aixm.aixm_feature.hjid = procedure.approachleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.approachleg_tp.approachlegtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.holdinguse_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.holdinguse_tp ON aixm.aixm_feature.hjid = procedure.holdinguse_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.holdinguse_tp.holdingusetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.landingtakeoffareacollection_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.landingtakeoffareacollection_tp ON aixm.aixm_feature.hjid = procedure.landingtakeoffareacollection_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.landingtakeoffareacollection_tp.landingtakeoffareacollectiontimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.procedure_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.procedure_tp ON aixm.aixm_feature.hjid = procedure.procedure_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.procedure_tp.proceduretimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.proceduretransition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.proceduretransition_tp ON aixm.aixm_feature.hjid = procedure.proceduretransition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.proceduretransition_tp.proceduretransitiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.proceduretransitionleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.proceduretransitionleg_tp ON aixm.aixm_feature.hjid = procedure.proceduretransitionleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.proceduretransitionleg_tp.proceduretransitionlegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.segmentleg_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.segmentleg_tp ON aixm.aixm_feature.hjid = procedure.segmentleg_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.segmentleg_tp.segmentlegtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.procedureavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.procedureavailability_tp ON aixm.aixm_feature.hjid = procedure.procedureavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.procedureavailability_tp.procedureavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.finalapproachcontrolaltitude_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.finalapproachcontrolaltitude_tp ON aixm.aixm_feature.hjid = procedure.finalapproachcontrolaltitude_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.finalapproachcontrolaltitude_tp.finalapproachcontrolaltitudetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.finalapproachcontrolposition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.finalapproachcontrolposition_tp ON aixm.aixm_feature.hjid = procedure.finalapproachcontrolposition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.finalapproachcontrolposition_tp.finalapproachcontrolpositiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.finalapproachprofile_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.finalapproachprofile_tp ON aixm.aixm_feature.hjid = procedure.finalapproachprofile_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.finalapproachprofile_tp.finalapproachprofiletimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.finalapproachsegmentdata_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.finalapproachsegmentdata_tp ON aixm.aixm_feature.hjid = procedure.finalapproachsegmentdata_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.finalapproachsegmentdata_tp.finalapproachsegmentdatatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.segmentlegaltitudecondition_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.segmentlegaltitudecondition_tp ON aixm.aixm_feature.hjid = procedure.segmentlegaltitudecondition_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.segmentlegaltitudecondition_tp.segmentlegaltitudeconditiontimeslice_hjid = aixm.aixm_timeslice.hjid
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
            procedure.minimumaltitudeareasector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.minimumaltitudeareasector_tp ON aixm.aixm_feature.hjid = procedure.minimumaltitudeareasector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.minimumaltitudeareasector_tp.minimumaltitudeareasectortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            procedure.coursegroup_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN procedure.coursegroup_tp ON aixm.aixm_feature.hjid = procedure.coursegroup_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON procedure.coursegroup_tp.coursegrouptimeslice_hjid = aixm.aixm_timeslice.hjid
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
            route.routeavailability_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.routeavailability_tp ON aixm.aixm_feature.hjid = route.routeavailability_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.routeavailability_tp.routeavailabilitytimeslice_hjid = aixm.aixm_timeslice.hjid
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
            route.routeportion_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.routeportion_tp ON aixm.aixm_feature.hjid = route.routeportion_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.routeportion_tp.routeportiontimeslice_hjid = aixm.aixm_timeslice.hjid
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
            route.airspacebordercrossing_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.airspacebordercrossing_tp ON aixm.aixm_feature.hjid = route.airspacebordercrossing_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.airspacebordercrossing_tp.airspacebordercrossingtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.directflight_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.directflight_tp ON aixm.aixm_feature.hjid = route.directflight_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.directflight_tp.directflighttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.directflightclass_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.directflightclass_tp ON aixm.aixm_feature.hjid = route.directflightclass_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.directflightclass_tp.directflightclasstimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.directflightsegment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.directflightsegment_tp ON aixm.aixm_feature.hjid = route.directflightsegment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.directflightsegment_tp.directflightsegmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightconditioncircumstance_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightconditioncircumstance_tp ON aixm.aixm_feature.hjid = route.flightconditioncircumstance_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightconditioncircumstance_tp.flightconditioncircumstancetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightconditioncombination_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightconditioncombination_tp ON aixm.aixm_feature.hjid = route.flightconditioncombination_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightconditioncombination_tp.flightconditioncombinationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightconditionelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightconditionelement_tp ON aixm.aixm_feature.hjid = route.flightconditionelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightconditionelement_tp.flightconditionelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightconditionelementchoice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightconditionelementchoice_tp ON aixm.aixm_feature.hjid = route.flightconditionelementchoice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightconditionelementchoice_tp.flightconditionelementchoicetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            route.flightrestrictionlevel_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightrestrictionlevel_tp ON aixm.aixm_feature.hjid = route.flightrestrictionlevel_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightrestrictionlevel_tp.flightrestrictionleveltimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightrestrictionroute_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightrestrictionroute_tp ON aixm.aixm_feature.hjid = route.flightrestrictionroute_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightrestrictionroute_tp.flightrestrictionroutetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightroutingelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightroutingelement_tp ON aixm.aixm_feature.hjid = route.flightroutingelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightroutingelement_tp.flightroutingelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.flightroutingelementchoice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.flightroutingelementchoice_tp ON aixm.aixm_feature.hjid = route.flightroutingelementchoice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.flightroutingelementchoice_tp.flightroutingelementchoicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            route.altitudeindication_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN route.altitudeindication_tp ON aixm.aixm_feature.hjid = route.altitudeindication_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON route.altitudeindication_tp.altitudeindicationtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.airtrafficmanagementservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.airtrafficmanagementservice_tp ON aixm.aixm_feature.hjid = service.airtrafficmanagementservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.airtrafficmanagementservice_tp.airtrafficmanagementservicetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.airportgroundservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.airportgroundservice_tp ON aixm.aixm_feature.hjid = service.airportgroundservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.airportgroundservice_tp.airportgroundservicetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.callsigndetail_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.callsigndetail_tp ON aixm.aixm_feature.hjid = service.callsigndetail_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.callsigndetail_tp.callsigndetailtimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.fuel_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.fuel_tp ON aixm.aixm_feature.hjid = service.fuel_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.fuel_tp.fueltimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.nitrogen_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.nitrogen_tp ON aixm.aixm_feature.hjid = service.nitrogen_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.nitrogen_tp.nitrogentimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.oil_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.oil_tp ON aixm.aixm_feature.hjid = service.oil_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.oil_tp.oiltimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.oxygen_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.oxygen_tp ON aixm.aixm_feature.hjid = service.oxygen_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.oxygen_tp.oxygentimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.radiocommunicationoperationalstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.radiocommunicationoperationalstatus_tp ON aixm.aixm_feature.hjid = service.radiocommunicationoperationalstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.radiocommunicationoperationalstatus_tp.radiocommunicationoperationalstatustimeslice_hjid = aixm.aixm_timeslice.hjid
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
            service.service_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.service_tp ON aixm.aixm_feature.hjid = service.service_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.service_tp.servicetimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.serviceoperationalstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.serviceoperationalstatus_tp ON aixm.aixm_feature.hjid = service.serviceoperationalstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.serviceoperationalstatus_tp.serviceoperationalstatustimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            service.trafficseparationservice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN service.trafficseparationservice_tp ON aixm.aixm_feature.hjid = service.trafficseparationservice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON service.trafficseparationservice_tp.trafficseparationservicetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            shared.contactinformation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.contactinformation_tp ON aixm.aixm_feature.hjid = shared.contactinformation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.contactinformation_tp.contactinformationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.onlinecontact_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.onlinecontact_tp ON aixm.aixm_feature.hjid = shared.onlinecontact_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.onlinecontact_tp.onlinecontacttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.postaladdress_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.postaladdress_tp ON aixm.aixm_feature.hjid = shared.postaladdress_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.postaladdress_tp.postaladdresstimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.telephonecontact_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.telephonecontact_tp ON aixm.aixm_feature.hjid = shared.telephonecontact_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.telephonecontact_tp.telephonecontacttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.aircraftcharacteristic_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.aircraftcharacteristic_tp ON aixm.aixm_feature.hjid = shared.aircraftcharacteristic_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.aircraftcharacteristic_tp.aircraftcharacteristictimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.flightcharacteristic_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.flightcharacteristic_tp ON aixm.aixm_feature.hjid = shared.flightcharacteristic_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.flightcharacteristic_tp.flightcharacteristictimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.airspacelayer_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.airspacelayer_tp ON aixm.aixm_feature.hjid = shared.airspacelayer_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.airspacelayer_tp.airspacelayertimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.circlesector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.circlesector_tp ON aixm.aixm_feature.hjid = shared.circlesector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.circlesector_tp.circlesectortimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.lightelement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.lightelement_tp ON aixm.aixm_feature.hjid = shared.lightelement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.lightelement_tp.lightelementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.lightelementstatus_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.lightelementstatus_tp ON aixm.aixm_feature.hjid = shared.lightelementstatus_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.lightelementstatus_tp.lightelementstatustimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.meteorology_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.meteorology_tp ON aixm.aixm_feature.hjid = shared.meteorology_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.meteorology_tp.meteorologytimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.equipmentchoice_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.equipmentchoice_tp ON aixm.aixm_feature.hjid = shared.equipmentchoice_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.equipmentchoice_tp.equipmentchoicetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            shared.propertieswithschedule_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.propertieswithschedule_tp ON aixm.aixm_feature.hjid = shared.propertieswithschedule_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.propertieswithschedule_tp.propertieswithscheduletimeslice_hjid = aixm.aixm_timeslice.hjid
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
            shared.timesheet_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.timesheet_tp ON aixm.aixm_feature.hjid = shared.timesheet_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.timesheet_tp.timesheettimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.standardlevel_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.standardlevel_tp ON aixm.aixm_feature.hjid = shared.standardlevel_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.standardlevel_tp.standardleveltimeslice_hjid = aixm.aixm_timeslice.hjid
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
            shared.altitudeadjustment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.altitudeadjustment_tp ON aixm.aixm_feature.hjid = shared.altitudeadjustment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.altitudeadjustment_tp.altitudeadjustmenttimeslice_hjid = aixm.aixm_timeslice.hjid
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
            shared.obstacleassessmentarea_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.obstacleassessmentarea_tp ON aixm.aixm_feature.hjid = shared.obstacleassessmentarea_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.obstacleassessmentarea_tp.obstacleassessmentareatimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.obstacleplacement_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.obstacleplacement_tp ON aixm.aixm_feature.hjid = shared.obstacleplacement_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.obstacleplacement_tp.obstacleplacementtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.obstruction_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.obstruction_tp ON aixm.aixm_feature.hjid = shared.obstruction_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.obstruction_tp.obstructiontimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.aircraftnavigationequipment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.aircraftnavigationequipment_tp ON aixm.aixm_feature.hjid = shared.aircraftnavigationequipment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.aircraftnavigationequipment_tp.aircraftnavigationequipmenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.designstandard_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.designstandard_tp ON aixm.aixm_feature.hjid = shared.designstandard_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.designstandard_tp.designstandardtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            shared.obstacleassessmentsurface_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN shared.obstacleassessmentsurface_tp ON aixm.aixm_feature.hjid = shared.obstacleassessmentsurface_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON shared.obstacleassessmentsurface_tp.obstacleassessmentsurfacetimeslice_hjid = aixm.aixm_timeslice.hjid
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
            surveillance.radarcomponent_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.radarcomponent_tp ON aixm.aixm_feature.hjid = surveillance.radarcomponent_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.radarcomponent_tp.radarcomponenttimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.radarequipment_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.radarequipment_tp ON aixm.aixm_feature.hjid = surveillance.radarequipment_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.radarequipment_tp.radarequipmenttimeslice_hjid = aixm.aixm_timeslice.hjid
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
            surveillance.reflector_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.reflector_tp ON aixm.aixm_feature.hjid = surveillance.reflector_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.reflector_tp.reflectortimeslice_hjid = aixm.aixm_timeslice.hjid
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
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.surveillancegroundstation_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.surveillancegroundstation_tp ON aixm.aixm_feature.hjid = surveillance.surveillancegroundstation_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.surveillancegroundstation_tp.surveillancegroundstationtimeslice_hjid = aixm.aixm_timeslice.hjid
UNION ALL
SELECT
            aixm.message_member.hjid as m_hjid,
            aixm.aixm_feature.hjid as f_hjid,
            surveillance.surveillanceradar_tp.hjid as tp_hjid,
            aixm.aixm_timeslice.hjid as t_hjid,
            aixm.aixm_feature.identifier,
            aixm.aixm_timeslice.sequence_number, 
            aixm.aixm_timeslice.correction_number, 
            aixm.aixm_timeslice.valid_time_begin, 
            aixm.aixm_timeslice.valid_time_end
            FROM aixm.aixm_feature
            INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_id
            INNER JOIN surveillance.surveillanceradar_tp ON aixm.aixm_feature.hjid = surveillance.surveillanceradar_tp.timeslice_hjid
            INNER JOIN aixm.aixm_timeslice ON surveillance.surveillanceradar_tp.surveillanceradartimeslice_hjid = aixm.aixm_timeslice.hjid
)
SELECT DISTINCT ON (identifier, sequence_number)
    tp_hjid
    FROM union_query
WHERE valid_time_end > :time or valid_time_end is NULL 
ORDER BY identifier, sequence_number,correction_number DESC;
    