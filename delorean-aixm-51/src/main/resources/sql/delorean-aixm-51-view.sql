--feature

--aerial_refuelling.aerialrefuelling_view

drop view if exists aerial_refuelling.aerialrefuelling_view cascade;
create view aerial_refuelling.aerialrefuelling_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    aerial_refuelling.aerialrefuelling_t.designatorprefix,
    aerial_refuelling.aerialrefuelling_t.designatorprefixnilreason,
    aerial_refuelling.aerialrefuelling_t.designatornumber,
    aerial_refuelling.aerialrefuelling_t.designatornumbernilreason,
    aerial_refuelling.aerialrefuelling_t.designatorsuffix,
    aerial_refuelling.aerialrefuelling_t.designatorsuffixnilreason,
    aerial_refuelling.aerialrefuelling_t.designatordirection,
    aerial_refuelling.aerialrefuelling_t.designatordirectionnilreason,
    aerial_refuelling.aerialrefuelling_t.name,
    aerial_refuelling.aerialrefuelling_t.namenilreason,
    aerial_refuelling.aerialrefuelling_t.type,
    aerial_refuelling.aerialrefuelling_t.typenilreason,
    aerial_refuelling.aerialrefuelling_t.radarbeaconsetting,
    aerial_refuelling.aerialrefuelling_t.radarbeaconsettingnilreason,
    aerial_refuelling.aerialrefuelling_t.xbandradarsetting,
    aerial_refuelling.aerialrefuelling_t.xbandradarsettingnilreason,
    aerial_refuelling.aerialrefuelling_t.tankerchannel,
    aerial_refuelling.aerialrefuelling_t.tankerchannelnilreason,
    aerial_refuelling.aerialrefuelling_t.receiverchannel,
    aerial_refuelling.aerialrefuelling_t.receiverchannelnilreason,
    aerial_refuelling.aerialrefuelling_t.helicopterroute,
    aerial_refuelling.aerialrefuelling_t.helicopterroutenilreason,
    aerial_refuelling.aerialrefuelling_t.specialrefuelling,
    aerial_refuelling.aerialrefuelling_t.specialrefuellingnilreason,
    aerial_refuelling.aerialrefuelling_t.bidirectionaluse,
    aerial_refuelling.aerialrefuelling_t.bidirectionalusenilreason,
    aerial_refuelling.aerialrefuelling_t.reversedirectionturn,
    aerial_refuelling.aerialrefuelling_t.reversedirectionturnnilreason
from aixm.aixm_feature
inner join aerial_refuelling.aerialrefuelling_f on aixm.aixm_feature.hjid = aerial_refuelling.aerialrefuelling_f.hjid
inner join aerial_refuelling.aerialrefuelling_tp on aixm.aixm_feature.hjid = aerial_refuelling.aerialrefuelling_tp.timeslice_hjid
inner join aerial_refuelling.aerialrefuelling_t on aerial_refuelling.aerialrefuelling_tp.aerialrefuellingtimeslice_hjid = aerial_refuelling.aerialrefuelling_t.hjid
inner join aixm.aixm_timeslice on aerial_refuelling.aerialrefuelling_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists aerial_refuelling_aerialrefuelling_id on aerial_refuelling.aerialrefuelling_view (id);

--navaids_point.aeronauticalgroundlight_view

drop view if exists navaids_point.aeronauticalgroundlight_view cascade;
create view navaids_point.aeronauticalgroundlight_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.aeronauticalgroundlight_t.name,
    navaids_point.aeronauticalgroundlight_t.namenilreason,
    navaids_point.aeronauticalgroundlight_t.type,
    navaids_point.aeronauticalgroundlight_t.typenilreason,
    navaids_point.aeronauticalgroundlight_t.colour,
    navaids_point.aeronauticalgroundlight_t.colournilreason,
    navaids_point.aeronauticalgroundlight_t.flashing,
    navaids_point.aeronauticalgroundlight_t.flashingnilreason
from aixm.aixm_feature
inner join navaids_point.aeronauticalgroundlight_f on aixm.aixm_feature.hjid = navaids_point.aeronauticalgroundlight_f.hjid
inner join navaids_point.aeronauticalgroundlight_tp on aixm.aixm_feature.hjid = navaids_point.aeronauticalgroundlight_tp.timeslice_hjid
inner join navaids_point.aeronauticalgroundlight_t on navaids_point.aeronauticalgroundlight_tp.aeronauticalgroundlighttimeslice_hjid = navaids_point.aeronauticalgroundlight_t.hjid
inner join aixm.aixm_timeslice on navaids_point.aeronauticalgroundlight_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_aeronauticalgroundlight_id on navaids_point.aeronauticalgroundlight_view (id);

--service.aircraftgroundservice_view

drop view if exists service.aircraftgroundservice_view cascade;
create view service.aircraftgroundservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.aircraftgroundservice_t.flightoperations,
    service.aircraftgroundservice_t.flightoperationsnilreason,
    service.aircraftgroundservice_t.rank,
    service.aircraftgroundservice_t.ranknilreason,
    service.aircraftgroundservice_t.complianticao,
    service.aircraftgroundservice_t.complianticaonilreason,
    service.aircraftgroundservice_t.name,
    service.aircraftgroundservice_t.namenilreason,
    service.aircraftgroundservice_t.type,
    service.aircraftgroundservice_t.typenilreason
from aixm.aixm_feature
inner join service.aircraftgroundservice_f on aixm.aixm_feature.hjid = service.aircraftgroundservice_f.hjid
inner join service.aircraftgroundservice_tp on aixm.aixm_feature.hjid = service.aircraftgroundservice_tp.timeslice_hjid
inner join service.aircraftgroundservice_t on service.aircraftgroundservice_tp.aircraftgroundservicetimeslice_hjid = service.aircraftgroundservice_t.hjid
inner join aixm.aixm_timeslice on service.aircraftgroundservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_aircraftgroundservice_id on service.aircraftgroundservice_view (id);

--airport_heliport.aircraftstand_view

drop view if exists airport_heliport.aircraftstand_view cascade;
create view airport_heliport.aircraftstand_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.aircraftstand_t.designator,
    airport_heliport.aircraftstand_t.designatornilreason,
    airport_heliport.aircraftstand_t.type,
    airport_heliport.aircraftstand_t.typenilreason,
    airport_heliport.aircraftstand_t.visualdockingsystem,
    airport_heliport.aircraftstand_t.visualdockingsystemnilreason
from aixm.aixm_feature
inner join airport_heliport.aircraftstand_f on aixm.aixm_feature.hjid = airport_heliport.aircraftstand_f.hjid
inner join airport_heliport.aircraftstand_tp on aixm.aixm_feature.hjid = airport_heliport.aircraftstand_tp.timeslice_hjid
inner join airport_heliport.aircraftstand_t on airport_heliport.aircraftstand_tp.aircraftstandtimeslice_hjid = airport_heliport.aircraftstand_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.aircraftstand_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_aircraftstand_id on airport_heliport.aircraftstand_view (id);

--service.airportclearanceservice_view

drop view if exists service.airportclearanceservice_view cascade;
create view service.airportclearanceservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.airportclearanceservice_t.flightoperations,
    service.airportclearanceservice_t.flightoperationsnilreason,
    service.airportclearanceservice_t.rank,
    service.airportclearanceservice_t.ranknilreason,
    service.airportclearanceservice_t.complianticao,
    service.airportclearanceservice_t.complianticaonilreason,
    service.airportclearanceservice_t.name,
    service.airportclearanceservice_t.namenilreason,
    service.airportclearanceservice_t.snowplan,
    service.airportclearanceservice_t.snowplannilreason
from aixm.aixm_feature
inner join service.airportclearanceservice_f on aixm.aixm_feature.hjid = service.airportclearanceservice_f.hjid
inner join service.airportclearanceservice_tp on aixm.aixm_feature.hjid = service.airportclearanceservice_tp.timeslice_hjid
inner join service.airportclearanceservice_t on service.airportclearanceservice_tp.airportclearanceservicetimeslice_hjid = service.airportclearanceservice_t.hjid
inner join aixm.aixm_timeslice on service.airportclearanceservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_airportclearanceservice_id on service.airportclearanceservice_view (id);

--airport_heliport.airportheliportcollocation_view

drop view if exists airport_heliport.airportheliportcollocation_view cascade;
create view airport_heliport.airportheliportcollocation_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.airportheliportcollocation_t.type,
    airport_heliport.airportheliportcollocation_t.typenilreason
from aixm.aixm_feature
inner join airport_heliport.airportheliportcollocation_f on aixm.aixm_feature.hjid = airport_heliport.airportheliportcollocation_f.hjid
inner join airport_heliport.airportheliportcollocation_tp on aixm.aixm_feature.hjid = airport_heliport.airportheliportcollocation_tp.timeslice_hjid
inner join airport_heliport.airportheliportcollocation_t on airport_heliport.airportheliportcollocation_tp.airportheliportcollocationtimeslice_hjid = airport_heliport.airportheliportcollocation_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.airportheliportcollocation_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_airportheliportcollocation_id on airport_heliport.airportheliportcollocation_view (id);

--airport_heliport.airportheliport_view

drop view if exists airport_heliport.airportheliport_view cascade;
create view airport_heliport.airportheliport_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.airportheliport_t.designator,
    airport_heliport.airportheliport_t.designatornilreason,
    airport_heliport.airportheliport_t.name,
    airport_heliport.airportheliport_t.namenilreason,
    airport_heliport.airportheliport_t.locationindicatoricao,
    airport_heliport.airportheliport_t.locationindicatoricaonilreason,
    airport_heliport.airportheliport_t.designatoriata,
    airport_heliport.airportheliport_t.designatoriatanilreason,
    airport_heliport.airportheliport_t.type,
    airport_heliport.airportheliport_t.typenilreason,
    airport_heliport.airportheliport_t.certifiedicao,
    airport_heliport.airportheliport_t.certifiedicaonilreason,
    airport_heliport.airportheliport_t.privateuse,
    airport_heliport.airportheliport_t.privateusenilreason,
    airport_heliport.airportheliport_t.controltype,
    airport_heliport.airportheliport_t.controltypenilreason,
    airport_heliport.airportheliport_t.verticaldatum,
    airport_heliport.airportheliport_t.verticaldatumnilreason,
    airport_heliport.airportheliport_t.magneticvariation,
    airport_heliport.airportheliport_t.magneticvariationnilreason,
    airport_heliport.airportheliport_t.magneticvariationaccuracy,
    airport_heliport.airportheliport_t.magneticvariationaccuracynilreason,
    airport_heliport.airportheliport_t.datemagneticvariation,
    airport_heliport.airportheliport_t.datemagneticvariationnilreason,
    airport_heliport.airportheliport_t.magneticvariationchange,
    airport_heliport.airportheliport_t.magneticvariationchangenilreason,
    airport_heliport.airportheliport_t.altimeterchecklocation,
    airport_heliport.airportheliport_t.altimeterchecklocationnilreason,
    airport_heliport.airportheliport_t.secondarypowersupply,
    airport_heliport.airportheliport_t.secondarypowersupplynilreason,
    airport_heliport.airportheliport_t.winddirectionindicator,
    airport_heliport.airportheliport_t.winddirectionindicatornilreason,
    airport_heliport.airportheliport_t.landingdirectionindicator,
    airport_heliport.airportheliport_t.landingdirectionindicatornilreason,
    airport_heliport.airportheliport_t.abandoned,
    airport_heliport.airportheliport_t.abandonednilreason,
    airport_heliport.airportheliport_t.certificationdate,
    airport_heliport.airportheliport_t.certificationdatenilreason,
    airport_heliport.airportheliport_t.certificationexpirationdate,
    airport_heliport.airportheliport_t.certificationexpirationdatenilreason,
    airport_heliport.airportheliport_t.fieldelevation,
    airport_heliport.airportheliport_t.fieldelevationuom,
    airport_heliport.airportheliport_t.fieldelevationnilreason,
    airport_heliport.airportheliport_t.fieldelevationaccuracy,
    airport_heliport.airportheliport_t.fieldelevationaccuracyuom,
    airport_heliport.airportheliport_t.fieldelevationaccuracynilreason,
    airport_heliport.airportheliport_t.referencetemperature,
    airport_heliport.airportheliport_t.referencetemperatureuom,
    airport_heliport.airportheliport_t.referencetemperaturenilreason,
    airport_heliport.airportheliport_t.transitionaltitude,
    airport_heliport.airportheliport_t.transitionaltitudeuom,
    airport_heliport.airportheliport_t.transitionaltitudenilreason,
    airport_heliport.airportheliport_t.transitionlevel,
    airport_heliport.airportheliport_t.transitionleveluom,
    airport_heliport.airportheliport_t.transitionlevelnilreason,
    airport_heliport.airportheliport_t.lowesttemperature,
    airport_heliport.airportheliport_t.lowesttemperatureuom,
    airport_heliport.airportheliport_t.lowesttemperaturenilreason
from aixm.aixm_feature
inner join airport_heliport.airportheliport_f on aixm.aixm_feature.hjid = airport_heliport.airportheliport_f.hjid
inner join airport_heliport.airportheliport_tp on aixm.aixm_feature.hjid = airport_heliport.airportheliport_tp.timeslice_hjid
inner join airport_heliport.airportheliport_t on airport_heliport.airportheliport_tp.airportheliporttimeslice_hjid = airport_heliport.airportheliport_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.airportheliport_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_airportheliport_id on airport_heliport.airportheliport_view (id);

--airport_heliport.airporthotspot_view

drop view if exists airport_heliport.airporthotspot_view cascade;
create view airport_heliport.airporthotspot_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.airporthotspot_t.designator,
    airport_heliport.airporthotspot_t.designatornilreason,
    airport_heliport.airporthotspot_t.instruction,
    airport_heliport.airporthotspot_t.instructionnilreason
from aixm.aixm_feature
inner join airport_heliport.airporthotspot_f on aixm.aixm_feature.hjid = airport_heliport.airporthotspot_f.hjid
inner join airport_heliport.airporthotspot_tp on aixm.aixm_feature.hjid = airport_heliport.airporthotspot_tp.timeslice_hjid
inner join airport_heliport.airporthotspot_t on airport_heliport.airporthotspot_tp.airporthotspottimeslice_hjid = airport_heliport.airporthotspot_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.airporthotspot_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_airporthotspot_id on airport_heliport.airporthotspot_view (id);

--airport_heliport.airportprotectionareamarking_view

drop view if exists airport_heliport.airportprotectionareamarking_view cascade;
create view airport_heliport.airportprotectionareamarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.airportprotectionareamarking_t.markingicaostandard,
    airport_heliport.airportprotectionareamarking_t.markingicaostandardnilreason,
    airport_heliport.airportprotectionareamarking_t.condition,
    airport_heliport.airportprotectionareamarking_t.conditionnilreason,
    airport_heliport.airportprotectionareamarking_t.markinglocation,
    airport_heliport.airportprotectionareamarking_t.markinglocationnilreason
from aixm.aixm_feature
inner join airport_heliport.airportprotectionareamarking_f on aixm.aixm_feature.hjid = airport_heliport.airportprotectionareamarking_f.hjid
inner join airport_heliport.airportprotectionareamarking_tp on aixm.aixm_feature.hjid = airport_heliport.airportprotectionareamarking_tp.timeslice_hjid
inner join airport_heliport.airportprotectionareamarking_t on airport_heliport.airportprotectionareamarking_tp.airportprotectionareamarkingtimeslice_hjid = airport_heliport.airportprotectionareamarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.airportprotectionareamarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_airportprotectionareamarking_id on airport_heliport.airportprotectionareamarking_view (id);

--service.airportsuppliesservice_view

drop view if exists service.airportsuppliesservice_view cascade;
create view service.airportsuppliesservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.airportsuppliesservice_t.flightoperations,
    service.airportsuppliesservice_t.flightoperationsnilreason,
    service.airportsuppliesservice_t.rank,
    service.airportsuppliesservice_t.ranknilreason,
    service.airportsuppliesservice_t.complianticao,
    service.airportsuppliesservice_t.complianticaonilreason,
    service.airportsuppliesservice_t.name,
    service.airportsuppliesservice_t.namenilreason
from aixm.aixm_feature
inner join service.airportsuppliesservice_f on aixm.aixm_feature.hjid = service.airportsuppliesservice_f.hjid
inner join service.airportsuppliesservice_tp on aixm.aixm_feature.hjid = service.airportsuppliesservice_tp.timeslice_hjid
inner join service.airportsuppliesservice_t on service.airportsuppliesservice_tp.airportsuppliesservicetimeslice_hjid = service.airportsuppliesservice_t.hjid
inner join aixm.aixm_timeslice on service.airportsuppliesservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_airportsuppliesservice_id on service.airportsuppliesservice_view (id);

--route.airspacebordercrossing_view

drop view if exists route.airspacebordercrossing_view cascade;
create view route.airspacebordercrossing_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join route.airspacebordercrossing_f on aixm.aixm_feature.hjid = route.airspacebordercrossing_f.hjid
inner join route.airspacebordercrossing_tp on aixm.aixm_feature.hjid = route.airspacebordercrossing_tp.timeslice_hjid
inner join route.airspacebordercrossing_t on route.airspacebordercrossing_tp.airspacebordercrossingtimeslice_hjid = route.airspacebordercrossing_t.hjid
inner join aixm.aixm_timeslice on route.airspacebordercrossing_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists route_airspacebordercrossing_id on route.airspacebordercrossing_view (id);

--airspace.airspace_view

drop view if exists airspace.airspace_view cascade;
create view airspace.airspace_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airspace.airspace_t.type,
    airspace.airspace_t.typenilreason,
    airspace.airspace_t.designator,
    airspace.airspace_t.designatornilreason,
    airspace.airspace_t.localtype,
    airspace.airspace_t.localtypenilreason,
    airspace.airspace_t.name,
    airspace.airspace_t.namenilreason,
    airspace.airspace_t.designatoricao,
    airspace.airspace_t.designatoricaonilreason,
    airspace.airspace_t.controltype,
    airspace.airspace_t.controltypenilreason,
    airspace.airspace_t.upperlowerseparation,
    airspace.airspace_t.upperlowerseparationuom,
    airspace.airspace_t.upperlowerseparationnilreason
from aixm.aixm_feature
inner join airspace.airspace_f on aixm.aixm_feature.hjid = airspace.airspace_f.hjid
inner join airspace.airspace_tp on aixm.aixm_feature.hjid = airspace.airspace_tp.timeslice_hjid
inner join airspace.airspace_t on airspace.airspace_tp.airspacetimeslice_hjid = airspace.airspace_t.hjid
inner join aixm.aixm_timeslice on airspace.airspace_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airspace_airspace_id on airspace.airspace_view (id);

--service.airtrafficcontrolservice_view

drop view if exists service.airtrafficcontrolservice_view cascade;
create view service.airtrafficcontrolservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.airtrafficcontrolservice_t.flightoperations,
    service.airtrafficcontrolservice_t.flightoperationsnilreason,
    service.airtrafficcontrolservice_t.rank,
    service.airtrafficcontrolservice_t.ranknilreason,
    service.airtrafficcontrolservice_t.complianticao,
    service.airtrafficcontrolservice_t.complianticaonilreason,
    service.airtrafficcontrolservice_t.name,
    service.airtrafficcontrolservice_t.namenilreason,
    service.airtrafficcontrolservice_t.radarassisted,
    service.airtrafficcontrolservice_t.radarassistednilreason,
    service.airtrafficcontrolservice_t.datalinkenabled,
    service.airtrafficcontrolservice_t.datalinkenablednilreason,
    service.airtrafficcontrolservice_t.datalinkchannel,
    service.airtrafficcontrolservice_t.datalinkchannelnilreason,
    service.airtrafficcontrolservice_t.type,
    service.airtrafficcontrolservice_t.typenilreason
from aixm.aixm_feature
inner join service.airtrafficcontrolservice_f on aixm.aixm_feature.hjid = service.airtrafficcontrolservice_f.hjid
inner join service.airtrafficcontrolservice_tp on aixm.aixm_feature.hjid = service.airtrafficcontrolservice_tp.timeslice_hjid
inner join service.airtrafficcontrolservice_t on service.airtrafficcontrolservice_tp.airtrafficcontrolservicetimeslice_hjid = service.airtrafficcontrolservice_t.hjid
inner join aixm.aixm_timeslice on service.airtrafficcontrolservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_airtrafficcontrolservice_id on service.airtrafficcontrolservice_view (id);

--service.airtrafficmanagementservice_view

drop view if exists service.airtrafficmanagementservice_view cascade;
create view service.airtrafficmanagementservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.airtrafficmanagementservice_t.flightoperations,
    service.airtrafficmanagementservice_t.flightoperationsnilreason,
    service.airtrafficmanagementservice_t.rank,
    service.airtrafficmanagementservice_t.ranknilreason,
    service.airtrafficmanagementservice_t.complianticao,
    service.airtrafficmanagementservice_t.complianticaonilreason,
    service.airtrafficmanagementservice_t.name,
    service.airtrafficmanagementservice_t.namenilreason,
    service.airtrafficmanagementservice_t.type,
    service.airtrafficmanagementservice_t.typenilreason
from aixm.aixm_feature
inner join service.airtrafficmanagementservice_f on aixm.aixm_feature.hjid = service.airtrafficmanagementservice_f.hjid
inner join service.airtrafficmanagementservice_tp on aixm.aixm_feature.hjid = service.airtrafficmanagementservice_tp.timeslice_hjid
inner join service.airtrafficmanagementservice_t on service.airtrafficmanagementservice_tp.airtrafficmanagementservicetimeslice_hjid = service.airtrafficmanagementservice_t.hjid
inner join aixm.aixm_timeslice on service.airtrafficmanagementservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_airtrafficmanagementservice_id on service.airtrafficmanagementservice_view (id);

--airport_heliport.altimetersource_view

drop view if exists airport_heliport.altimetersource_view cascade;
create view airport_heliport.altimetersource_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.altimetersource_t.isremote,
    airport_heliport.altimetersource_t.isremotenilreason,
    airport_heliport.altimetersource_t.isprimary,
    airport_heliport.altimetersource_t.isprimarynilreason
from aixm.aixm_feature
inner join airport_heliport.altimetersource_f on aixm.aixm_feature.hjid = airport_heliport.altimetersource_f.hjid
inner join airport_heliport.altimetersource_tp on aixm.aixm_feature.hjid = airport_heliport.altimetersource_tp.timeslice_hjid
inner join airport_heliport.altimetersource_t on airport_heliport.altimetersource_tp.altimetersourcetimeslice_hjid = airport_heliport.altimetersource_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.altimetersource_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_altimetersource_id on airport_heliport.altimetersource_view (id);

--navaids_point.angleindication_view

drop view if exists navaids_point.angleindication_view cascade;
create view navaids_point.angleindication_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.angleindication_t.angle,
    navaids_point.angleindication_t.anglenilreason,
    navaids_point.angleindication_t.angletype,
    navaids_point.angleindication_t.angletypenilreason,
    navaids_point.angleindication_t.indicationdirection,
    navaids_point.angleindication_t.indicationdirectionnilreason,
    navaids_point.angleindication_t.trueangle,
    navaids_point.angleindication_t.trueanglenilreason,
    navaids_point.angleindication_t.cardinaldirection,
    navaids_point.angleindication_t.cardinaldirectionnilreason,
    navaids_point.angleindication_t.minimumreceptionaltitude,
    navaids_point.angleindication_t.minimumreceptionaltitudeuom,
    navaids_point.angleindication_t.minimumreceptionaltitudenilreason
from aixm.aixm_feature
inner join navaids_point.angleindication_f on aixm.aixm_feature.hjid = navaids_point.angleindication_f.hjid
inner join navaids_point.angleindication_tp on aixm.aixm_feature.hjid = navaids_point.angleindication_tp.timeslice_hjid
inner join navaids_point.angleindication_t on navaids_point.angleindication_tp.angleindicationtimeslice_hjid = navaids_point.angleindication_t.hjid
inner join aixm.aixm_timeslice on navaids_point.angleindication_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_angleindication_id on navaids_point.angleindication_view (id);

--airport_heliport.approachlightingsystem_view

drop view if exists airport_heliport.approachlightingsystem_view cascade;
create view airport_heliport.approachlightingsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.approachlightingsystem_t.emergencylighting,
    airport_heliport.approachlightingsystem_t.emergencylightingnilreason,
    airport_heliport.approachlightingsystem_t.intensitylevel,
    airport_heliport.approachlightingsystem_t.intensitylevelnilreason,
    airport_heliport.approachlightingsystem_t.colour,
    airport_heliport.approachlightingsystem_t.colournilreason,
    airport_heliport.approachlightingsystem_t.classicao,
    airport_heliport.approachlightingsystem_t.classicaonilreason,
    airport_heliport.approachlightingsystem_t.type,
    airport_heliport.approachlightingsystem_t.typenilreason,
    airport_heliport.approachlightingsystem_t.sequencedflashing,
    airport_heliport.approachlightingsystem_t.sequencedflashingnilreason,
    airport_heliport.approachlightingsystem_t.alignmentindicator,
    airport_heliport.approachlightingsystem_t.alignmentindicatornilreason,
    airport_heliport.approachlightingsystem_t.length,
    airport_heliport.approachlightingsystem_t.lengthuom,
    airport_heliport.approachlightingsystem_t.lengthnilreason
from aixm.aixm_feature
inner join airport_heliport.approachlightingsystem_f on aixm.aixm_feature.hjid = airport_heliport.approachlightingsystem_f.hjid
inner join airport_heliport.approachlightingsystem_tp on aixm.aixm_feature.hjid = airport_heliport.approachlightingsystem_tp.timeslice_hjid
inner join airport_heliport.approachlightingsystem_t on airport_heliport.approachlightingsystem_tp.approachlightingsystemtimeslice_hjid = airport_heliport.approachlightingsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.approachlightingsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_approachlightingsystem_id on airport_heliport.approachlightingsystem_view (id);

--airport_heliport.apronelement_view

drop view if exists airport_heliport.apronelement_view cascade;
create view airport_heliport.apronelement_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.apronelement_t.type,
    airport_heliport.apronelement_t.typenilreason,
    airport_heliport.apronelement_t.jetwayavailability,
    airport_heliport.apronelement_t.jetwayavailabilitynilreason,
    airport_heliport.apronelement_t.towingavailability,
    airport_heliport.apronelement_t.towingavailabilitynilreason,
    airport_heliport.apronelement_t.dockingavailability,
    airport_heliport.apronelement_t.dockingavailabilitynilreason,
    airport_heliport.apronelement_t.groundpoweravailability,
    airport_heliport.apronelement_t.groundpoweravailabilitynilreason,
    airport_heliport.apronelement_t.length,
    airport_heliport.apronelement_t.lengthuom,
    airport_heliport.apronelement_t.lengthnilreason,
    airport_heliport.apronelement_t.width,
    airport_heliport.apronelement_t.widthuom,
    airport_heliport.apronelement_t.widthnilreason
from aixm.aixm_feature
inner join airport_heliport.apronelement_f on aixm.aixm_feature.hjid = airport_heliport.apronelement_f.hjid
inner join airport_heliport.apronelement_tp on aixm.aixm_feature.hjid = airport_heliport.apronelement_tp.timeslice_hjid
inner join airport_heliport.apronelement_t on airport_heliport.apronelement_tp.apronelementtimeslice_hjid = airport_heliport.apronelement_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.apronelement_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_apronelement_id on airport_heliport.apronelement_view (id);

--airport_heliport.apronlightsystem_view

drop view if exists airport_heliport.apronlightsystem_view cascade;
create view airport_heliport.apronlightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.apronlightsystem_t.emergencylighting,
    airport_heliport.apronlightsystem_t.emergencylightingnilreason,
    airport_heliport.apronlightsystem_t.intensitylevel,
    airport_heliport.apronlightsystem_t.intensitylevelnilreason,
    airport_heliport.apronlightsystem_t.colour,
    airport_heliport.apronlightsystem_t.colournilreason,
    airport_heliport.apronlightsystem_t.position,
    airport_heliport.apronlightsystem_t.positionnilreason
from aixm.aixm_feature
inner join airport_heliport.apronlightsystem_f on aixm.aixm_feature.hjid = airport_heliport.apronlightsystem_f.hjid
inner join airport_heliport.apronlightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.apronlightsystem_tp.timeslice_hjid
inner join airport_heliport.apronlightsystem_t on airport_heliport.apronlightsystem_tp.apronlightsystemtimeslice_hjid = airport_heliport.apronlightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.apronlightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_apronlightsystem_id on airport_heliport.apronlightsystem_view (id);

--airport_heliport.apronmarking_view

drop view if exists airport_heliport.apronmarking_view cascade;
create view airport_heliport.apronmarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.apronmarking_t.markingicaostandard,
    airport_heliport.apronmarking_t.markingicaostandardnilreason,
    airport_heliport.apronmarking_t.condition,
    airport_heliport.apronmarking_t.conditionnilreason,
    airport_heliport.apronmarking_t.markinglocation,
    airport_heliport.apronmarking_t.markinglocationnilreason
from aixm.aixm_feature
inner join airport_heliport.apronmarking_f on aixm.aixm_feature.hjid = airport_heliport.apronmarking_f.hjid
inner join airport_heliport.apronmarking_tp on aixm.aixm_feature.hjid = airport_heliport.apronmarking_tp.timeslice_hjid
inner join airport_heliport.apronmarking_t on airport_heliport.apronmarking_tp.apronmarkingtimeslice_hjid = airport_heliport.apronmarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.apronmarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_apronmarking_id on airport_heliport.apronmarking_view (id);

--airport_heliport.apron_view

drop view if exists airport_heliport.apron_view cascade;
create view airport_heliport.apron_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.apron_t.name,
    airport_heliport.apron_t.namenilreason,
    airport_heliport.apron_t.abandoned,
    airport_heliport.apron_t.abandonednilreason
from aixm.aixm_feature
inner join airport_heliport.apron_f on aixm.aixm_feature.hjid = airport_heliport.apron_f.hjid
inner join airport_heliport.apron_tp on aixm.aixm_feature.hjid = airport_heliport.apron_tp.timeslice_hjid
inner join airport_heliport.apron_t on airport_heliport.apron_tp.aprontimeslice_hjid = airport_heliport.apron_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.apron_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_apron_id on airport_heliport.apron_view (id);

--airport_heliport.arrestinggear_view

drop view if exists airport_heliport.arrestinggear_view cascade;
create view airport_heliport.arrestinggear_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.arrestinggear_t.status,
    airport_heliport.arrestinggear_t.statusnilreason,
    airport_heliport.arrestinggear_t.engagedevice,
    airport_heliport.arrestinggear_t.engagedevicenilreason,
    airport_heliport.arrestinggear_t.absorbtype,
    airport_heliport.arrestinggear_t.absorbtypenilreason,
    airport_heliport.arrestinggear_t.bidirectional,
    airport_heliport.arrestinggear_t.bidirectionalnilreason,
    airport_heliport.arrestinggear_t.length,
    airport_heliport.arrestinggear_t.lengthuom,
    airport_heliport.arrestinggear_t.lengthnilreason,
    airport_heliport.arrestinggear_t.width,
    airport_heliport.arrestinggear_t.widthuom,
    airport_heliport.arrestinggear_t.widthnilreason,
    airport_heliport.arrestinggear_t.location,
    airport_heliport.arrestinggear_t.locationuom,
    airport_heliport.arrestinggear_t.locationnilreason
from aixm.aixm_feature
inner join airport_heliport.arrestinggear_f on aixm.aixm_feature.hjid = airport_heliport.arrestinggear_f.hjid
inner join airport_heliport.arrestinggear_tp on aixm.aixm_feature.hjid = airport_heliport.arrestinggear_tp.timeslice_hjid
inner join airport_heliport.arrestinggear_t on airport_heliport.arrestinggear_tp.arrestinggeartimeslice_hjid = airport_heliport.arrestinggear_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.arrestinggear_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_arrestinggear_id on airport_heliport.arrestinggear_view (id);

--procedure.arrivalfeederleg_view

drop view if exists procedure.arrivalfeederleg_view cascade;
create view procedure.arrivalfeederleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.arrivalfeederleg_t.endconditiondesignator,
    procedure.arrivalfeederleg_t.endconditiondesignatornilreason,
    procedure.arrivalfeederleg_t.legpath,
    procedure.arrivalfeederleg_t.legpathnilreason,
    procedure.arrivalfeederleg_t.legtypearinc,
    procedure.arrivalfeederleg_t.legtypearincnilreason,
    procedure.arrivalfeederleg_t.course,
    procedure.arrivalfeederleg_t.coursenilreason,
    procedure.arrivalfeederleg_t.coursetype,
    procedure.arrivalfeederleg_t.coursetypenilreason,
    procedure.arrivalfeederleg_t.coursedirection,
    procedure.arrivalfeederleg_t.coursedirectionnilreason,
    procedure.arrivalfeederleg_t.turndirection,
    procedure.arrivalfeederleg_t.turndirectionnilreason,
    procedure.arrivalfeederleg_t.speedreference,
    procedure.arrivalfeederleg_t.speedreferencenilreason,
    procedure.arrivalfeederleg_t.speedinterpretation,
    procedure.arrivalfeederleg_t.speedinterpretationnilreason,
    procedure.arrivalfeederleg_t.bankangle,
    procedure.arrivalfeederleg_t.bankanglenilreason,
    procedure.arrivalfeederleg_t.procedureturnrequired,
    procedure.arrivalfeederleg_t.procedureturnrequirednilreason,
    procedure.arrivalfeederleg_t.upperlimitreference,
    procedure.arrivalfeederleg_t.upperlimitreferencenilreason,
    procedure.arrivalfeederleg_t.lowerlimitreference,
    procedure.arrivalfeederleg_t.lowerlimitreferencenilreason,
    procedure.arrivalfeederleg_t.altitudeinterpretation,
    procedure.arrivalfeederleg_t.altitudeinterpretationnilreason,
    procedure.arrivalfeederleg_t.altitudeoverridereference,
    procedure.arrivalfeederleg_t.altitudeoverridereferencenilreason,
    procedure.arrivalfeederleg_t.verticalangle,
    procedure.arrivalfeederleg_t.verticalanglenilreason,
    procedure.arrivalfeederleg_t.requirednavigationperformance,
    procedure.arrivalfeederleg_t.requirednavigationperformancenilreason,
    procedure.arrivalfeederleg_t.speedlimit,
    procedure.arrivalfeederleg_t.speedlimituom,
    procedure.arrivalfeederleg_t.speedlimitnilreason,
    procedure.arrivalfeederleg_t.length,
    procedure.arrivalfeederleg_t.lengthuom,
    procedure.arrivalfeederleg_t.lengthnilreason,
    procedure.arrivalfeederleg_t.duration,
    procedure.arrivalfeederleg_t.durationuom,
    procedure.arrivalfeederleg_t.durationnilreason,
    procedure.arrivalfeederleg_t.upperlimitaltitude,
    procedure.arrivalfeederleg_t.upperlimitaltitudeuom,
    procedure.arrivalfeederleg_t.upperlimitaltitudenilreason,
    procedure.arrivalfeederleg_t.lowerlimitaltitude,
    procedure.arrivalfeederleg_t.lowerlimitaltitudeuom,
    procedure.arrivalfeederleg_t.lowerlimitaltitudenilreason,
    procedure.arrivalfeederleg_t.altitudeoverrideatc,
    procedure.arrivalfeederleg_t.altitudeoverrideatcuom,
    procedure.arrivalfeederleg_t.altitudeoverrideatcnilreason
from aixm.aixm_feature
inner join procedure.arrivalfeederleg_f on aixm.aixm_feature.hjid = procedure.arrivalfeederleg_f.hjid
inner join procedure.arrivalfeederleg_tp on aixm.aixm_feature.hjid = procedure.arrivalfeederleg_tp.timeslice_hjid
inner join procedure.arrivalfeederleg_t on procedure.arrivalfeederleg_tp.arrivalfeederlegtimeslice_hjid = procedure.arrivalfeederleg_t.hjid
inner join aixm.aixm_timeslice on procedure.arrivalfeederleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_arrivalfeederleg_id on procedure.arrivalfeederleg_view (id);

--procedure.arrivalleg_view

drop view if exists procedure.arrivalleg_view cascade;
create view procedure.arrivalleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.arrivalleg_t.endconditiondesignator,
    procedure.arrivalleg_t.endconditiondesignatornilreason,
    procedure.arrivalleg_t.legpath,
    procedure.arrivalleg_t.legpathnilreason,
    procedure.arrivalleg_t.legtypearinc,
    procedure.arrivalleg_t.legtypearincnilreason,
    procedure.arrivalleg_t.course,
    procedure.arrivalleg_t.coursenilreason,
    procedure.arrivalleg_t.coursetype,
    procedure.arrivalleg_t.coursetypenilreason,
    procedure.arrivalleg_t.coursedirection,
    procedure.arrivalleg_t.coursedirectionnilreason,
    procedure.arrivalleg_t.turndirection,
    procedure.arrivalleg_t.turndirectionnilreason,
    procedure.arrivalleg_t.speedreference,
    procedure.arrivalleg_t.speedreferencenilreason,
    procedure.arrivalleg_t.speedinterpretation,
    procedure.arrivalleg_t.speedinterpretationnilreason,
    procedure.arrivalleg_t.bankangle,
    procedure.arrivalleg_t.bankanglenilreason,
    procedure.arrivalleg_t.procedureturnrequired,
    procedure.arrivalleg_t.procedureturnrequirednilreason,
    procedure.arrivalleg_t.upperlimitreference,
    procedure.arrivalleg_t.upperlimitreferencenilreason,
    procedure.arrivalleg_t.lowerlimitreference,
    procedure.arrivalleg_t.lowerlimitreferencenilreason,
    procedure.arrivalleg_t.altitudeinterpretation,
    procedure.arrivalleg_t.altitudeinterpretationnilreason,
    procedure.arrivalleg_t.altitudeoverridereference,
    procedure.arrivalleg_t.altitudeoverridereferencenilreason,
    procedure.arrivalleg_t.verticalangle,
    procedure.arrivalleg_t.verticalanglenilreason,
    procedure.arrivalleg_t.requirednavigationperformance,
    procedure.arrivalleg_t.requirednavigationperformancenilreason,
    procedure.arrivalleg_t.speedlimit,
    procedure.arrivalleg_t.speedlimituom,
    procedure.arrivalleg_t.speedlimitnilreason,
    procedure.arrivalleg_t.length,
    procedure.arrivalleg_t.lengthuom,
    procedure.arrivalleg_t.lengthnilreason,
    procedure.arrivalleg_t.duration,
    procedure.arrivalleg_t.durationuom,
    procedure.arrivalleg_t.durationnilreason,
    procedure.arrivalleg_t.upperlimitaltitude,
    procedure.arrivalleg_t.upperlimitaltitudeuom,
    procedure.arrivalleg_t.upperlimitaltitudenilreason,
    procedure.arrivalleg_t.lowerlimitaltitude,
    procedure.arrivalleg_t.lowerlimitaltitudeuom,
    procedure.arrivalleg_t.lowerlimitaltitudenilreason,
    procedure.arrivalleg_t.altitudeoverrideatc,
    procedure.arrivalleg_t.altitudeoverrideatcuom,
    procedure.arrivalleg_t.altitudeoverrideatcnilreason
from aixm.aixm_feature
inner join procedure.arrivalleg_f on aixm.aixm_feature.hjid = procedure.arrivalleg_f.hjid
inner join procedure.arrivalleg_tp on aixm.aixm_feature.hjid = procedure.arrivalleg_tp.timeslice_hjid
inner join procedure.arrivalleg_t on procedure.arrivalleg_tp.arrivallegtimeslice_hjid = procedure.arrivalleg_t.hjid
inner join aixm.aixm_timeslice on procedure.arrivalleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_arrivalleg_id on procedure.arrivalleg_view (id);

--airspace.authorityforairspace_view

drop view if exists airspace.authorityforairspace_view cascade;
create view airspace.authorityforairspace_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airspace.authorityforairspace_t.type,
    airspace.authorityforairspace_t.typenilreason
from aixm.aixm_feature
inner join airspace.authorityforairspace_f on aixm.aixm_feature.hjid = airspace.authorityforairspace_f.hjid
inner join airspace.authorityforairspace_tp on aixm.aixm_feature.hjid = airspace.authorityforairspace_tp.timeslice_hjid
inner join airspace.authorityforairspace_t on airspace.authorityforairspace_tp.authorityforairspacetimeslice_hjid = airspace.authorityforairspace_t.hjid
inner join aixm.aixm_timeslice on airspace.authorityforairspace_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airspace_authorityforairspace_id on airspace.authorityforairspace_view (id);

--navaids_point.azimuth_view

drop view if exists navaids_point.azimuth_view cascade;
create view navaids_point.azimuth_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.azimuth_t.designator,
    navaids_point.azimuth_t.designatornilreason,
    navaids_point.azimuth_t.name,
    navaids_point.azimuth_t.namenilreason,
    navaids_point.azimuth_t.emissionclass,
    navaids_point.azimuth_t.emissionclassnilreason,
    navaids_point.azimuth_t.mobile,
    navaids_point.azimuth_t.mobilenilreason,
    navaids_point.azimuth_t.magneticvariation,
    navaids_point.azimuth_t.magneticvariationnilreason,
    navaids_point.azimuth_t.magneticvariationaccuracy,
    navaids_point.azimuth_t.magneticvariationaccuracynilreason,
    navaids_point.azimuth_t.datemagneticvariation,
    navaids_point.azimuth_t.datemagneticvariationnilreason,
    navaids_point.azimuth_t.flightchecked,
    navaids_point.azimuth_t.flightcheckednilreason,
    navaids_point.azimuth_t.type,
    navaids_point.azimuth_t.typenilreason,
    navaids_point.azimuth_t.truebearing,
    navaids_point.azimuth_t.truebearingnilreason,
    navaids_point.azimuth_t.truebearingaccuracy,
    navaids_point.azimuth_t.truebearingaccuracynilreason,
    navaids_point.azimuth_t.magneticbearing,
    navaids_point.azimuth_t.magneticbearingnilreason,
    navaids_point.azimuth_t.angleproportionalleft,
    navaids_point.azimuth_t.angleproportionalleftnilreason,
    navaids_point.azimuth_t.angleproportionalright,
    navaids_point.azimuth_t.angleproportionalrightnilreason,
    navaids_point.azimuth_t.anglecoverleft,
    navaids_point.azimuth_t.anglecoverleftnilreason,
    navaids_point.azimuth_t.anglecoverright,
    navaids_point.azimuth_t.anglecoverrightnilreason,
    navaids_point.azimuth_t.channel,
    navaids_point.azimuth_t.channelnilreason
from aixm.aixm_feature
inner join navaids_point.azimuth_f on aixm.aixm_feature.hjid = navaids_point.azimuth_f.hjid
inner join navaids_point.azimuth_tp on aixm.aixm_feature.hjid = navaids_point.azimuth_tp.timeslice_hjid
inner join navaids_point.azimuth_t on navaids_point.azimuth_tp.azimuthtimeslice_hjid = navaids_point.azimuth_t.hjid
inner join aixm.aixm_timeslice on navaids_point.azimuth_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_azimuth_id on navaids_point.azimuth_view (id);

--route.changeoverpoint_view

drop view if exists route.changeoverpoint_view cascade;
create view route.changeoverpoint_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    route.changeoverpoint_t.distance,
    route.changeoverpoint_t.distanceuom,
    route.changeoverpoint_t.distancenilreason
from aixm.aixm_feature
inner join route.changeoverpoint_f on aixm.aixm_feature.hjid = route.changeoverpoint_f.hjid
inner join route.changeoverpoint_tp on aixm.aixm_feature.hjid = route.changeoverpoint_tp.timeslice_hjid
inner join route.changeoverpoint_t on route.changeoverpoint_tp.changeoverpointtimeslice_hjid = route.changeoverpoint_t.hjid
inner join aixm.aixm_timeslice on route.changeoverpoint_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists route_changeoverpoint_id on route.changeoverpoint_view (id);

--navaids_point.checkpointins_view

drop view if exists navaids_point.checkpointins_view cascade;
create view navaids_point.checkpointins_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.checkpointins_t.category,
    navaids_point.checkpointins_t.categorynilreason,
    navaids_point.checkpointins_t.upperlimitreference,
    navaids_point.checkpointins_t.upperlimitreferencenilreason,
    navaids_point.checkpointins_t.lowerlimitreference,
    navaids_point.checkpointins_t.lowerlimitreferencenilreason,
    navaids_point.checkpointins_t.altitudeinterpretation,
    navaids_point.checkpointins_t.altitudeinterpretationnilreason,
    navaids_point.checkpointins_t.angle,
    navaids_point.checkpointins_t.anglenilreason,
    navaids_point.checkpointins_t.upperlimit,
    navaids_point.checkpointins_t.upperlimituom,
    navaids_point.checkpointins_t.upperlimitnilreason,
    navaids_point.checkpointins_t.lowerlimit,
    navaids_point.checkpointins_t.lowerlimituom,
    navaids_point.checkpointins_t.lowerlimitnilreason,
    navaids_point.checkpointins_t.distance,
    navaids_point.checkpointins_t.distanceuom,
    navaids_point.checkpointins_t.distancenilreason
from aixm.aixm_feature
inner join navaids_point.checkpointins_f on aixm.aixm_feature.hjid = navaids_point.checkpointins_f.hjid
inner join navaids_point.checkpointins_tp on aixm.aixm_feature.hjid = navaids_point.checkpointins_tp.timeslice_hjid
inner join navaids_point.checkpointins_t on navaids_point.checkpointins_tp.checkpointinstimeslice_hjid = navaids_point.checkpointins_t.hjid
inner join aixm.aixm_timeslice on navaids_point.checkpointins_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_checkpointins_id on navaids_point.checkpointins_view (id);

--navaids_point.checkpointvor_view

drop view if exists navaids_point.checkpointvor_view cascade;
create view navaids_point.checkpointvor_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.checkpointvor_t.category,
    navaids_point.checkpointvor_t.categorynilreason,
    navaids_point.checkpointvor_t.upperlimitreference,
    navaids_point.checkpointvor_t.upperlimitreferencenilreason,
    navaids_point.checkpointvor_t.lowerlimitreference,
    navaids_point.checkpointvor_t.lowerlimitreferencenilreason,
    navaids_point.checkpointvor_t.altitudeinterpretation,
    navaids_point.checkpointvor_t.altitudeinterpretationnilreason,
    navaids_point.checkpointvor_t.angle,
    navaids_point.checkpointvor_t.anglenilreason,
    navaids_point.checkpointvor_t.upperlimit,
    navaids_point.checkpointvor_t.upperlimituom,
    navaids_point.checkpointvor_t.upperlimitnilreason,
    navaids_point.checkpointvor_t.lowerlimit,
    navaids_point.checkpointvor_t.lowerlimituom,
    navaids_point.checkpointvor_t.lowerlimitnilreason,
    navaids_point.checkpointvor_t.distance,
    navaids_point.checkpointvor_t.distanceuom,
    navaids_point.checkpointvor_t.distancenilreason
from aixm.aixm_feature
inner join navaids_point.checkpointvor_f on aixm.aixm_feature.hjid = navaids_point.checkpointvor_f.hjid
inner join navaids_point.checkpointvor_tp on aixm.aixm_feature.hjid = navaids_point.checkpointvor_tp.timeslice_hjid
inner join navaids_point.checkpointvor_t on navaids_point.checkpointvor_tp.checkpointvortimeslice_hjid = navaids_point.checkpointvor_t.hjid
inner join aixm.aixm_timeslice on navaids_point.checkpointvor_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_checkpointvor_id on navaids_point.checkpointvor_view (id);

--procedure.circlingarea_view

drop view if exists procedure.circlingarea_view cascade;
create view procedure.circlingarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join procedure.circlingarea_f on aixm.aixm_feature.hjid = procedure.circlingarea_f.hjid
inner join procedure.circlingarea_tp on aixm.aixm_feature.hjid = procedure.circlingarea_tp.timeslice_hjid
inner join procedure.circlingarea_t on procedure.circlingarea_tp.circlingareatimeslice_hjid = procedure.circlingarea_t.hjid
inner join aixm.aixm_timeslice on procedure.circlingarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_circlingarea_id on procedure.circlingarea_view (id);

--airport_heliport.deicingareamarking_view

drop view if exists airport_heliport.deicingareamarking_view cascade;
create view airport_heliport.deicingareamarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.deicingareamarking_t.markingicaostandard,
    airport_heliport.deicingareamarking_t.markingicaostandardnilreason,
    airport_heliport.deicingareamarking_t.condition,
    airport_heliport.deicingareamarking_t.conditionnilreason
from aixm.aixm_feature
inner join airport_heliport.deicingareamarking_f on aixm.aixm_feature.hjid = airport_heliport.deicingareamarking_f.hjid
inner join airport_heliport.deicingareamarking_tp on aixm.aixm_feature.hjid = airport_heliport.deicingareamarking_tp.timeslice_hjid
inner join airport_heliport.deicingareamarking_t on airport_heliport.deicingareamarking_tp.deicingareamarkingtimeslice_hjid = airport_heliport.deicingareamarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.deicingareamarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_deicingareamarking_id on airport_heliport.deicingareamarking_view (id);

--airport_heliport.deicingarea_view

drop view if exists airport_heliport.deicingarea_view cascade;
create view airport_heliport.deicingarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join airport_heliport.deicingarea_f on aixm.aixm_feature.hjid = airport_heliport.deicingarea_f.hjid
inner join airport_heliport.deicingarea_tp on aixm.aixm_feature.hjid = airport_heliport.deicingarea_tp.timeslice_hjid
inner join airport_heliport.deicingarea_t on airport_heliport.deicingarea_tp.deicingareatimeslice_hjid = airport_heliport.deicingarea_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.deicingarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_deicingarea_id on airport_heliport.deicingarea_view (id);

--procedure.departureleg_view

drop view if exists procedure.departureleg_view cascade;
create view procedure.departureleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.departureleg_t.endconditiondesignator,
    procedure.departureleg_t.endconditiondesignatornilreason,
    procedure.departureleg_t.legpath,
    procedure.departureleg_t.legpathnilreason,
    procedure.departureleg_t.legtypearinc,
    procedure.departureleg_t.legtypearincnilreason,
    procedure.departureleg_t.course,
    procedure.departureleg_t.coursenilreason,
    procedure.departureleg_t.coursetype,
    procedure.departureleg_t.coursetypenilreason,
    procedure.departureleg_t.coursedirection,
    procedure.departureleg_t.coursedirectionnilreason,
    procedure.departureleg_t.turndirection,
    procedure.departureleg_t.turndirectionnilreason,
    procedure.departureleg_t.speedreference,
    procedure.departureleg_t.speedreferencenilreason,
    procedure.departureleg_t.speedinterpretation,
    procedure.departureleg_t.speedinterpretationnilreason,
    procedure.departureleg_t.bankangle,
    procedure.departureleg_t.bankanglenilreason,
    procedure.departureleg_t.procedureturnrequired,
    procedure.departureleg_t.procedureturnrequirednilreason,
    procedure.departureleg_t.upperlimitreference,
    procedure.departureleg_t.upperlimitreferencenilreason,
    procedure.departureleg_t.lowerlimitreference,
    procedure.departureleg_t.lowerlimitreferencenilreason,
    procedure.departureleg_t.altitudeinterpretation,
    procedure.departureleg_t.altitudeinterpretationnilreason,
    procedure.departureleg_t.altitudeoverridereference,
    procedure.departureleg_t.altitudeoverridereferencenilreason,
    procedure.departureleg_t.verticalangle,
    procedure.departureleg_t.verticalanglenilreason,
    procedure.departureleg_t.requirednavigationperformance,
    procedure.departureleg_t.requirednavigationperformancenilreason,
    procedure.departureleg_t.speedlimit,
    procedure.departureleg_t.speedlimituom,
    procedure.departureleg_t.speedlimitnilreason,
    procedure.departureleg_t.length,
    procedure.departureleg_t.lengthuom,
    procedure.departureleg_t.lengthnilreason,
    procedure.departureleg_t.duration,
    procedure.departureleg_t.durationuom,
    procedure.departureleg_t.durationnilreason,
    procedure.departureleg_t.upperlimitaltitude,
    procedure.departureleg_t.upperlimitaltitudeuom,
    procedure.departureleg_t.upperlimitaltitudenilreason,
    procedure.departureleg_t.lowerlimitaltitude,
    procedure.departureleg_t.lowerlimitaltitudeuom,
    procedure.departureleg_t.lowerlimitaltitudenilreason,
    procedure.departureleg_t.altitudeoverrideatc,
    procedure.departureleg_t.altitudeoverrideatcuom,
    procedure.departureleg_t.altitudeoverrideatcnilreason,
    procedure.departureleg_t.minimumobstacleclearancealtitude,
    procedure.departureleg_t.minimumobstacleclearancealtitudeuom,
    procedure.departureleg_t.minimumobstacleclearancealtitudenilreason
from aixm.aixm_feature
inner join procedure.departureleg_f on aixm.aixm_feature.hjid = procedure.departureleg_f.hjid
inner join procedure.departureleg_tp on aixm.aixm_feature.hjid = procedure.departureleg_tp.timeslice_hjid
inner join procedure.departureleg_t on procedure.departureleg_tp.departurelegtimeslice_hjid = procedure.departureleg_t.hjid
inner join aixm.aixm_timeslice on procedure.departureleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_departureleg_id on procedure.departureleg_view (id);

--navaids_point.designatedpoint_view

drop view if exists navaids_point.designatedpoint_view cascade;
create view navaids_point.designatedpoint_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.designatedpoint_t.designator,
    navaids_point.designatedpoint_t.designatornilreason,
    navaids_point.designatedpoint_t.type,
    navaids_point.designatedpoint_t.typenilreason,
    navaids_point.designatedpoint_t.name,
    navaids_point.designatedpoint_t.namenilreason
from aixm.aixm_feature
inner join navaids_point.designatedpoint_f on aixm.aixm_feature.hjid = navaids_point.designatedpoint_f.hjid
inner join navaids_point.designatedpoint_tp on aixm.aixm_feature.hjid = navaids_point.designatedpoint_tp.timeslice_hjid
inner join navaids_point.designatedpoint_t on navaids_point.designatedpoint_tp.designatedpointtimeslice_hjid = navaids_point.designatedpoint_t.hjid
inner join aixm.aixm_timeslice on navaids_point.designatedpoint_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_designatedpoint_id on navaids_point.designatedpoint_view (id);

--navaids_point.directionfinder_view

drop view if exists navaids_point.directionfinder_view cascade;
create view navaids_point.directionfinder_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.directionfinder_t.designator,
    navaids_point.directionfinder_t.designatornilreason,
    navaids_point.directionfinder_t.name,
    navaids_point.directionfinder_t.namenilreason,
    navaids_point.directionfinder_t.emissionclass,
    navaids_point.directionfinder_t.emissionclassnilreason,
    navaids_point.directionfinder_t.mobile,
    navaids_point.directionfinder_t.mobilenilreason,
    navaids_point.directionfinder_t.magneticvariation,
    navaids_point.directionfinder_t.magneticvariationnilreason,
    navaids_point.directionfinder_t.magneticvariationaccuracy,
    navaids_point.directionfinder_t.magneticvariationaccuracynilreason,
    navaids_point.directionfinder_t.datemagneticvariation,
    navaids_point.directionfinder_t.datemagneticvariationnilreason,
    navaids_point.directionfinder_t.flightchecked,
    navaids_point.directionfinder_t.flightcheckednilreason,
    navaids_point.directionfinder_t.doppler,
    navaids_point.directionfinder_t.dopplernilreason
from aixm.aixm_feature
inner join navaids_point.directionfinder_f on aixm.aixm_feature.hjid = navaids_point.directionfinder_f.hjid
inner join navaids_point.directionfinder_tp on aixm.aixm_feature.hjid = navaids_point.directionfinder_tp.timeslice_hjid
inner join navaids_point.directionfinder_t on navaids_point.directionfinder_tp.directionfindertimeslice_hjid = navaids_point.directionfinder_t.hjid
inner join aixm.aixm_timeslice on navaids_point.directionfinder_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_directionfinder_id on navaids_point.directionfinder_view (id);

--navaids_point.distanceindication_view

drop view if exists navaids_point.distanceindication_view cascade;
create view navaids_point.distanceindication_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.distanceindication_t.type,
    navaids_point.distanceindication_t.typenilreason,
    navaids_point.distanceindication_t.distance,
    navaids_point.distanceindication_t.distanceuom,
    navaids_point.distanceindication_t.distancenilreason,
    navaids_point.distanceindication_t.minimumreceptionaltitude,
    navaids_point.distanceindication_t.minimumreceptionaltitudeuom,
    navaids_point.distanceindication_t.minimumreceptionaltitudenilreason
from aixm.aixm_feature
inner join navaids_point.distanceindication_f on aixm.aixm_feature.hjid = navaids_point.distanceindication_f.hjid
inner join navaids_point.distanceindication_tp on aixm.aixm_feature.hjid = navaids_point.distanceindication_tp.timeslice_hjid
inner join navaids_point.distanceindication_t on navaids_point.distanceindication_tp.distanceindicationtimeslice_hjid = navaids_point.distanceindication_t.hjid
inner join aixm.aixm_timeslice on navaids_point.distanceindication_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_distanceindication_id on navaids_point.distanceindication_view (id);

--navaids_point.dme_view

drop view if exists navaids_point.dme_view cascade;
create view navaids_point.dme_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.dme_t.designator,
    navaids_point.dme_t.designatornilreason,
    navaids_point.dme_t.name,
    navaids_point.dme_t.namenilreason,
    navaids_point.dme_t.emissionclass,
    navaids_point.dme_t.emissionclassnilreason,
    navaids_point.dme_t.mobile,
    navaids_point.dme_t.mobilenilreason,
    navaids_point.dme_t.magneticvariation,
    navaids_point.dme_t.magneticvariationnilreason,
    navaids_point.dme_t.magneticvariationaccuracy,
    navaids_point.dme_t.magneticvariationaccuracynilreason,
    navaids_point.dme_t.datemagneticvariation,
    navaids_point.dme_t.datemagneticvariationnilreason,
    navaids_point.dme_t.flightchecked,
    navaids_point.dme_t.flightcheckednilreason,
    navaids_point.dme_t.type,
    navaids_point.dme_t.typenilreason,
    navaids_point.dme_t.channel,
    navaids_point.dme_t.channelnilreason,
    navaids_point.dme_t.ghostfrequency,
    navaids_point.dme_t.ghostfrequencyuom,
    navaids_point.dme_t.ghostfrequencynilreason,
    navaids_point.dme_t.displace,
    navaids_point.dme_t.displaceuom,
    navaids_point.dme_t.displacenilreason
from aixm.aixm_feature
inner join navaids_point.dme_f on aixm.aixm_feature.hjid = navaids_point.dme_f.hjid
inner join navaids_point.dme_tp on aixm.aixm_feature.hjid = navaids_point.dme_tp.timeslice_hjid
inner join navaids_point.dme_t on navaids_point.dme_tp.dmetimeslice_hjid = navaids_point.dme_t.hjid
inner join aixm.aixm_timeslice on navaids_point.dme_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_dme_id on navaids_point.dme_view (id);

--navaids_point.elevation_view

drop view if exists navaids_point.elevation_view cascade;
create view navaids_point.elevation_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.elevation_t.designator,
    navaids_point.elevation_t.designatornilreason,
    navaids_point.elevation_t.name,
    navaids_point.elevation_t.namenilreason,
    navaids_point.elevation_t.emissionclass,
    navaids_point.elevation_t.emissionclassnilreason,
    navaids_point.elevation_t.mobile,
    navaids_point.elevation_t.mobilenilreason,
    navaids_point.elevation_t.magneticvariation,
    navaids_point.elevation_t.magneticvariationnilreason,
    navaids_point.elevation_t.magneticvariationaccuracy,
    navaids_point.elevation_t.magneticvariationaccuracynilreason,
    navaids_point.elevation_t.datemagneticvariation,
    navaids_point.elevation_t.datemagneticvariationnilreason,
    navaids_point.elevation_t.flightchecked,
    navaids_point.elevation_t.flightcheckednilreason,
    navaids_point.elevation_t.anglenominal,
    navaids_point.elevation_t.anglenominalnilreason,
    navaids_point.elevation_t.angleminimum,
    navaids_point.elevation_t.angleminimumnilreason,
    navaids_point.elevation_t.anglespan,
    navaids_point.elevation_t.anglespannilreason,
    navaids_point.elevation_t.angleaccuracy,
    navaids_point.elevation_t.angleaccuracynilreason
from aixm.aixm_feature
inner join navaids_point.elevation_f on aixm.aixm_feature.hjid = navaids_point.elevation_f.hjid
inner join navaids_point.elevation_tp on aixm.aixm_feature.hjid = navaids_point.elevation_tp.timeslice_hjid
inner join navaids_point.elevation_t on navaids_point.elevation_tp.elevationtimeslice_hjid = navaids_point.elevation_t.hjid
inner join aixm.aixm_timeslice on navaids_point.elevation_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_elevation_id on navaids_point.elevation_view (id);

--procedure.finalleg_view

drop view if exists procedure.finalleg_view cascade;
create view procedure.finalleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.finalleg_t.endconditiondesignator,
    procedure.finalleg_t.endconditiondesignatornilreason,
    procedure.finalleg_t.legpath,
    procedure.finalleg_t.legpathnilreason,
    procedure.finalleg_t.legtypearinc,
    procedure.finalleg_t.legtypearincnilreason,
    procedure.finalleg_t.course,
    procedure.finalleg_t.coursenilreason,
    procedure.finalleg_t.coursetype,
    procedure.finalleg_t.coursetypenilreason,
    procedure.finalleg_t.coursedirection,
    procedure.finalleg_t.coursedirectionnilreason,
    procedure.finalleg_t.turndirection,
    procedure.finalleg_t.turndirectionnilreason,
    procedure.finalleg_t.speedreference,
    procedure.finalleg_t.speedreferencenilreason,
    procedure.finalleg_t.speedinterpretation,
    procedure.finalleg_t.speedinterpretationnilreason,
    procedure.finalleg_t.bankangle,
    procedure.finalleg_t.bankanglenilreason,
    procedure.finalleg_t.procedureturnrequired,
    procedure.finalleg_t.procedureturnrequirednilreason,
    procedure.finalleg_t.upperlimitreference,
    procedure.finalleg_t.upperlimitreferencenilreason,
    procedure.finalleg_t.lowerlimitreference,
    procedure.finalleg_t.lowerlimitreferencenilreason,
    procedure.finalleg_t.altitudeinterpretation,
    procedure.finalleg_t.altitudeinterpretationnilreason,
    procedure.finalleg_t.altitudeoverridereference,
    procedure.finalleg_t.altitudeoverridereferencenilreason,
    procedure.finalleg_t.verticalangle,
    procedure.finalleg_t.verticalanglenilreason,
    procedure.finalleg_t.guidancesystem,
    procedure.finalleg_t.guidancesystemnilreason,
    procedure.finalleg_t.landingsystemcategory,
    procedure.finalleg_t.landingsystemcategorynilreason,
    procedure.finalleg_t.rnpdmeauthorized,
    procedure.finalleg_t.rnpdmeauthorizednilreason,
    procedure.finalleg_t.courseoffsetangle,
    procedure.finalleg_t.courseoffsetanglenilreason,
    procedure.finalleg_t.courseoffsetside,
    procedure.finalleg_t.courseoffsetsidenilreason,
    procedure.finalleg_t.coursecentrelineintersect,
    procedure.finalleg_t.coursecentrelineintersectnilreason,
    procedure.finalleg_t.speedlimit,
    procedure.finalleg_t.speedlimituom,
    procedure.finalleg_t.speedlimitnilreason,
    procedure.finalleg_t.length,
    procedure.finalleg_t.lengthuom,
    procedure.finalleg_t.lengthnilreason,
    procedure.finalleg_t.duration,
    procedure.finalleg_t.durationuom,
    procedure.finalleg_t.durationnilreason,
    procedure.finalleg_t.upperlimitaltitude,
    procedure.finalleg_t.upperlimitaltitudeuom,
    procedure.finalleg_t.upperlimitaltitudenilreason,
    procedure.finalleg_t.lowerlimitaltitude,
    procedure.finalleg_t.lowerlimitaltitudeuom,
    procedure.finalleg_t.lowerlimitaltitudenilreason,
    procedure.finalleg_t.altitudeoverrideatc,
    procedure.finalleg_t.altitudeoverrideatcuom,
    procedure.finalleg_t.altitudeoverrideatcnilreason,
    procedure.finalleg_t.minimumbarovnavtemperature,
    procedure.finalleg_t.minimumbarovnavtemperatureuom,
    procedure.finalleg_t.minimumbarovnavtemperaturenilreason,
    procedure.finalleg_t.coursecentrelinedistance,
    procedure.finalleg_t.coursecentrelinedistanceuom,
    procedure.finalleg_t.coursecentrelinedistancenilreason,
    procedure.finalleg_t.courseoffsetdistance,
    procedure.finalleg_t.courseoffsetdistanceuom,
    procedure.finalleg_t.courseoffsetdistancenilreason
from aixm.aixm_feature
inner join procedure.finalleg_f on aixm.aixm_feature.hjid = procedure.finalleg_f.hjid
inner join procedure.finalleg_tp on aixm.aixm_feature.hjid = procedure.finalleg_tp.timeslice_hjid
inner join procedure.finalleg_t on procedure.finalleg_tp.finallegtimeslice_hjid = procedure.finalleg_t.hjid
inner join aixm.aixm_timeslice on procedure.finalleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_finalleg_id on procedure.finalleg_view (id);

--service.firefightingservice_view

drop view if exists service.firefightingservice_view cascade;
create view service.firefightingservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.firefightingservice_t.flightoperations,
    service.firefightingservice_t.flightoperationsnilreason,
    service.firefightingservice_t.rank,
    service.firefightingservice_t.ranknilreason,
    service.firefightingservice_t.complianticao,
    service.firefightingservice_t.complianticaonilreason,
    service.firefightingservice_t.name,
    service.firefightingservice_t.namenilreason,
    service.firefightingservice_t.category,
    service.firefightingservice_t.categorynilreason,
    service.firefightingservice_t.standard,
    service.firefightingservice_t.standardnilreason
from aixm.aixm_feature
inner join service.firefightingservice_f on aixm.aixm_feature.hjid = service.firefightingservice_f.hjid
inner join service.firefightingservice_tp on aixm.aixm_feature.hjid = service.firefightingservice_tp.timeslice_hjid
inner join service.firefightingservice_t on service.firefightingservice_tp.firefightingservicetimeslice_hjid = service.firefightingservice_t.hjid
inner join aixm.aixm_timeslice on service.firefightingservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_firefightingservice_id on service.firefightingservice_view (id);

--route.flightrestriction_view

drop view if exists route.flightrestriction_view cascade;
create view route.flightrestriction_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    route.flightrestriction_t.designator,
    route.flightrestriction_t.designatornilreason,
    route.flightrestriction_t.type,
    route.flightrestriction_t.typenilreason,
    route.flightrestriction_t.instruction,
    route.flightrestriction_t.instructionnilreason
from aixm.aixm_feature
inner join route.flightrestriction_f on aixm.aixm_feature.hjid = route.flightrestriction_f.hjid
inner join route.flightrestriction_tp on aixm.aixm_feature.hjid = route.flightrestriction_tp.timeslice_hjid
inner join route.flightrestriction_t on route.flightrestriction_tp.flightrestrictiontimeslice_hjid = route.flightrestriction_t.hjid
inner join aixm.aixm_timeslice on route.flightrestriction_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists route_flightrestriction_id on route.flightrestriction_view (id);

--airport_heliport.floatingdocksite_view

drop view if exists airport_heliport.floatingdocksite_view cascade;
create view airport_heliport.floatingdocksite_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join airport_heliport.floatingdocksite_f on aixm.aixm_feature.hjid = airport_heliport.floatingdocksite_f.hjid
inner join airport_heliport.floatingdocksite_tp on aixm.aixm_feature.hjid = airport_heliport.floatingdocksite_tp.timeslice_hjid
inner join airport_heliport.floatingdocksite_t on airport_heliport.floatingdocksite_tp.floatingdocksitetimeslice_hjid = airport_heliport.floatingdocksite_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.floatingdocksite_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_floatingdocksite_id on airport_heliport.floatingdocksite_view (id);

--airspace.geoborder_view

drop view if exists airspace.geoborder_view cascade;
create view airspace.geoborder_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airspace.geoborder_t.name,
    airspace.geoborder_t.namenilreason,
    airspace.geoborder_t.type,
    airspace.geoborder_t.typenilreason
from aixm.aixm_feature
inner join airspace.geoborder_f on aixm.aixm_feature.hjid = airspace.geoborder_f.hjid
inner join airspace.geoborder_tp on aixm.aixm_feature.hjid = airspace.geoborder_tp.timeslice_hjid
inner join airspace.geoborder_t on airspace.geoborder_tp.geobordertimeslice_hjid = airspace.geoborder_t.hjid
inner join aixm.aixm_timeslice on airspace.geoborder_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airspace_geoborder_id on airspace.geoborder_view (id);

--navaids_point.glidepath_view

drop view if exists navaids_point.glidepath_view cascade;
create view navaids_point.glidepath_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.glidepath_t.designator,
    navaids_point.glidepath_t.designatornilreason,
    navaids_point.glidepath_t.name,
    navaids_point.glidepath_t.namenilreason,
    navaids_point.glidepath_t.emissionclass,
    navaids_point.glidepath_t.emissionclassnilreason,
    navaids_point.glidepath_t.mobile,
    navaids_point.glidepath_t.mobilenilreason,
    navaids_point.glidepath_t.magneticvariation,
    navaids_point.glidepath_t.magneticvariationnilreason,
    navaids_point.glidepath_t.magneticvariationaccuracy,
    navaids_point.glidepath_t.magneticvariationaccuracynilreason,
    navaids_point.glidepath_t.datemagneticvariation,
    navaids_point.glidepath_t.datemagneticvariationnilreason,
    navaids_point.glidepath_t.flightchecked,
    navaids_point.glidepath_t.flightcheckednilreason,
    navaids_point.glidepath_t.slope,
    navaids_point.glidepath_t.slopenilreason,
    navaids_point.glidepath_t.angleaccuracy,
    navaids_point.glidepath_t.angleaccuracynilreason,
    navaids_point.glidepath_t.frequency,
    navaids_point.glidepath_t.frequencyuom,
    navaids_point.glidepath_t.frequencynilreason,
    navaids_point.glidepath_t.rdh,
    navaids_point.glidepath_t.rdhuom,
    navaids_point.glidepath_t.rdhnilreason,
    navaids_point.glidepath_t.rdhaccuracy,
    navaids_point.glidepath_t.rdhaccuracyuom,
    navaids_point.glidepath_t.rdhaccuracynilreason
from aixm.aixm_feature
inner join navaids_point.glidepath_f on aixm.aixm_feature.hjid = navaids_point.glidepath_f.hjid
inner join navaids_point.glidepath_tp on aixm.aixm_feature.hjid = navaids_point.glidepath_tp.timeslice_hjid
inner join navaids_point.glidepath_t on navaids_point.glidepath_tp.glidepathtimeslice_hjid = navaids_point.glidepath_t.hjid
inner join aixm.aixm_timeslice on navaids_point.glidepath_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_glidepath_id on navaids_point.glidepath_view (id);

--service.groundtrafficcontrolservice_view

drop view if exists service.groundtrafficcontrolservice_view cascade;
create view service.groundtrafficcontrolservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.groundtrafficcontrolservice_t.flightoperations,
    service.groundtrafficcontrolservice_t.flightoperationsnilreason,
    service.groundtrafficcontrolservice_t.rank,
    service.groundtrafficcontrolservice_t.ranknilreason,
    service.groundtrafficcontrolservice_t.complianticao,
    service.groundtrafficcontrolservice_t.complianticaonilreason,
    service.groundtrafficcontrolservice_t.name,
    service.groundtrafficcontrolservice_t.namenilreason,
    service.groundtrafficcontrolservice_t.radarassisted,
    service.groundtrafficcontrolservice_t.radarassistednilreason,
    service.groundtrafficcontrolservice_t.datalinkenabled,
    service.groundtrafficcontrolservice_t.datalinkenablednilreason,
    service.groundtrafficcontrolservice_t.datalinkchannel,
    service.groundtrafficcontrolservice_t.datalinkchannelnilreason,
    service.groundtrafficcontrolservice_t.type,
    service.groundtrafficcontrolservice_t.typenilreason
from aixm.aixm_feature
inner join service.groundtrafficcontrolservice_f on aixm.aixm_feature.hjid = service.groundtrafficcontrolservice_f.hjid
inner join service.groundtrafficcontrolservice_tp on aixm.aixm_feature.hjid = service.groundtrafficcontrolservice_tp.timeslice_hjid
inner join service.groundtrafficcontrolservice_t on service.groundtrafficcontrolservice_tp.groundtrafficcontrolservicetimeslice_hjid = service.groundtrafficcontrolservice_t.hjid
inner join aixm.aixm_timeslice on service.groundtrafficcontrolservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_groundtrafficcontrolservice_id on service.groundtrafficcontrolservice_view (id);

--airport_heliport.guidancelinelightsystem_view

drop view if exists airport_heliport.guidancelinelightsystem_view cascade;
create view airport_heliport.guidancelinelightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.guidancelinelightsystem_t.emergencylighting,
    airport_heliport.guidancelinelightsystem_t.emergencylightingnilreason,
    airport_heliport.guidancelinelightsystem_t.intensitylevel,
    airport_heliport.guidancelinelightsystem_t.intensitylevelnilreason,
    airport_heliport.guidancelinelightsystem_t.colour,
    airport_heliport.guidancelinelightsystem_t.colournilreason
from aixm.aixm_feature
inner join airport_heliport.guidancelinelightsystem_f on aixm.aixm_feature.hjid = airport_heliport.guidancelinelightsystem_f.hjid
inner join airport_heliport.guidancelinelightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.guidancelinelightsystem_tp.timeslice_hjid
inner join airport_heliport.guidancelinelightsystem_t on airport_heliport.guidancelinelightsystem_tp.guidancelinelightsystemtimeslice_hjid = airport_heliport.guidancelinelightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.guidancelinelightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_guidancelinelightsystem_id on airport_heliport.guidancelinelightsystem_view (id);

--airport_heliport.guidancelinemarking_view

drop view if exists airport_heliport.guidancelinemarking_view cascade;
create view airport_heliport.guidancelinemarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.guidancelinemarking_t.markingicaostandard,
    airport_heliport.guidancelinemarking_t.markingicaostandardnilreason,
    airport_heliport.guidancelinemarking_t.condition,
    airport_heliport.guidancelinemarking_t.conditionnilreason
from aixm.aixm_feature
inner join airport_heliport.guidancelinemarking_f on aixm.aixm_feature.hjid = airport_heliport.guidancelinemarking_f.hjid
inner join airport_heliport.guidancelinemarking_tp on aixm.aixm_feature.hjid = airport_heliport.guidancelinemarking_tp.timeslice_hjid
inner join airport_heliport.guidancelinemarking_t on airport_heliport.guidancelinemarking_tp.guidancelinemarkingtimeslice_hjid = airport_heliport.guidancelinemarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.guidancelinemarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_guidancelinemarking_id on airport_heliport.guidancelinemarking_view (id);

--airport_heliport.guidanceline_view

drop view if exists airport_heliport.guidanceline_view cascade;
create view airport_heliport.guidanceline_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.guidanceline_t.designator,
    airport_heliport.guidanceline_t.designatornilreason,
    airport_heliport.guidanceline_t.type,
    airport_heliport.guidanceline_t.typenilreason,
    airport_heliport.guidanceline_t.usagedirection,
    airport_heliport.guidanceline_t.usagedirectionnilreason,
    airport_heliport.guidanceline_t.maxspeed,
    airport_heliport.guidanceline_t.maxspeeduom,
    airport_heliport.guidanceline_t.maxspeednilreason
from aixm.aixm_feature
inner join airport_heliport.guidanceline_f on aixm.aixm_feature.hjid = airport_heliport.guidanceline_f.hjid
inner join airport_heliport.guidanceline_tp on aixm.aixm_feature.hjid = airport_heliport.guidanceline_tp.timeslice_hjid
inner join airport_heliport.guidanceline_t on airport_heliport.guidanceline_tp.guidancelinetimeslice_hjid = airport_heliport.guidanceline_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.guidanceline_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_guidanceline_id on airport_heliport.guidanceline_view (id);

--shared.holdingassessment_view

drop view if exists shared.holdingassessment_view cascade;
create view shared.holdingassessment_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    shared.holdingassessment_t.upperlimitreference,
    shared.holdingassessment_t.upperlimitreferencenilreason,
    shared.holdingassessment_t.lowerlimitreference,
    shared.holdingassessment_t.lowerlimitreferencenilreason,
    shared.holdingassessment_t.patterntemplate,
    shared.holdingassessment_t.patterntemplatenilreason,
    shared.holdingassessment_t.turbulentair,
    shared.holdingassessment_t.turbulentairnilreason,
    shared.holdingassessment_t.upperlimit,
    shared.holdingassessment_t.upperlimituom,
    shared.holdingassessment_t.upperlimitnilreason,
    shared.holdingassessment_t.lowerlimit,
    shared.holdingassessment_t.lowerlimituom,
    shared.holdingassessment_t.lowerlimitnilreason,
    shared.holdingassessment_t.speedlimit,
    shared.holdingassessment_t.speedlimituom,
    shared.holdingassessment_t.speedlimitnilreason,
    shared.holdingassessment_t.leglengthtoward,
    shared.holdingassessment_t.leglengthtowarduom,
    shared.holdingassessment_t.leglengthtowardnilreason,
    shared.holdingassessment_t.leglengthaway,
    shared.holdingassessment_t.leglengthawayuom,
    shared.holdingassessment_t.leglengthawaynilreason
from aixm.aixm_feature
inner join shared.holdingassessment_f on aixm.aixm_feature.hjid = shared.holdingassessment_f.hjid
inner join shared.holdingassessment_tp on aixm.aixm_feature.hjid = shared.holdingassessment_tp.timeslice_hjid
inner join shared.holdingassessment_t on shared.holdingassessment_tp.holdingassessmenttimeslice_hjid = shared.holdingassessment_t.hjid
inner join aixm.aixm_timeslice on shared.holdingassessment_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists shared_holdingassessment_id on shared.holdingassessment_view (id);

--holding.holdingpattern_view

drop view if exists holding.holdingpattern_view cascade;
create view holding.holdingpattern_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    holding.holdingpattern_t.type,
    holding.holdingpattern_t.typenilreason,
    holding.holdingpattern_t.outboundcourse,
    holding.holdingpattern_t.outboundcoursenilreason,
    holding.holdingpattern_t.outboundcoursetype,
    holding.holdingpattern_t.outboundcoursetypenilreason,
    holding.holdingpattern_t.inboundcourse,
    holding.holdingpattern_t.inboundcoursenilreason,
    holding.holdingpattern_t.turndirection,
    holding.holdingpattern_t.turndirectionnilreason,
    holding.holdingpattern_t.upperlimitreference,
    holding.holdingpattern_t.upperlimitreferencenilreason,
    holding.holdingpattern_t.lowerlimitreference,
    holding.holdingpattern_t.lowerlimitreferencenilreason,
    holding.holdingpattern_t.instruction,
    holding.holdingpattern_t.instructionnilreason,
    holding.holdingpattern_t.nonstandardholding,
    holding.holdingpattern_t.nonstandardholdingnilreason,
    holding.holdingpattern_t.upperlimit,
    holding.holdingpattern_t.upperlimituom,
    holding.holdingpattern_t.upperlimitnilreason,
    holding.holdingpattern_t.lowerlimit,
    holding.holdingpattern_t.lowerlimituom,
    holding.holdingpattern_t.lowerlimitnilreason,
    holding.holdingpattern_t.speedlimit,
    holding.holdingpattern_t.speedlimituom,
    holding.holdingpattern_t.speedlimitnilreason
from aixm.aixm_feature
inner join holding.holdingpattern_f on aixm.aixm_feature.hjid = holding.holdingpattern_f.hjid
inner join holding.holdingpattern_tp on aixm.aixm_feature.hjid = holding.holdingpattern_tp.timeslice_hjid
inner join holding.holdingpattern_t on holding.holdingpattern_tp.holdingpatterntimeslice_hjid = holding.holdingpattern_t.hjid
inner join aixm.aixm_timeslice on holding.holdingpattern_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists holding_holdingpattern_id on holding.holdingpattern_view (id);

--service.informationservice_view

drop view if exists service.informationservice_view cascade;
create view service.informationservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.informationservice_t.flightoperations,
    service.informationservice_t.flightoperationsnilreason,
    service.informationservice_t.rank,
    service.informationservice_t.ranknilreason,
    service.informationservice_t.complianticao,
    service.informationservice_t.complianticaonilreason,
    service.informationservice_t.name,
    service.informationservice_t.namenilreason,
    service.informationservice_t.type,
    service.informationservice_t.typenilreason,
    service.informationservice_t.voice,
    service.informationservice_t.voicenilreason,
    service.informationservice_t.datalink,
    service.informationservice_t.datalinknilreason,
    service.informationservice_t.recorded,
    service.informationservice_t.recordednilreason
from aixm.aixm_feature
inner join service.informationservice_f on aixm.aixm_feature.hjid = service.informationservice_f.hjid
inner join service.informationservice_tp on aixm.aixm_feature.hjid = service.informationservice_tp.timeslice_hjid
inner join service.informationservice_t on service.informationservice_tp.informationservicetimeslice_hjid = service.informationservice_t.hjid
inner join aixm.aixm_timeslice on service.informationservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_informationservice_id on service.informationservice_view (id);

--procedure.initialleg_view

drop view if exists procedure.initialleg_view cascade;
create view procedure.initialleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.initialleg_t.endconditiondesignator,
    procedure.initialleg_t.endconditiondesignatornilreason,
    procedure.initialleg_t.legpath,
    procedure.initialleg_t.legpathnilreason,
    procedure.initialleg_t.legtypearinc,
    procedure.initialleg_t.legtypearincnilreason,
    procedure.initialleg_t.course,
    procedure.initialleg_t.coursenilreason,
    procedure.initialleg_t.coursetype,
    procedure.initialleg_t.coursetypenilreason,
    procedure.initialleg_t.coursedirection,
    procedure.initialleg_t.coursedirectionnilreason,
    procedure.initialleg_t.turndirection,
    procedure.initialleg_t.turndirectionnilreason,
    procedure.initialleg_t.speedreference,
    procedure.initialleg_t.speedreferencenilreason,
    procedure.initialleg_t.speedinterpretation,
    procedure.initialleg_t.speedinterpretationnilreason,
    procedure.initialleg_t.bankangle,
    procedure.initialleg_t.bankanglenilreason,
    procedure.initialleg_t.procedureturnrequired,
    procedure.initialleg_t.procedureturnrequirednilreason,
    procedure.initialleg_t.upperlimitreference,
    procedure.initialleg_t.upperlimitreferencenilreason,
    procedure.initialleg_t.lowerlimitreference,
    procedure.initialleg_t.lowerlimitreferencenilreason,
    procedure.initialleg_t.altitudeinterpretation,
    procedure.initialleg_t.altitudeinterpretationnilreason,
    procedure.initialleg_t.altitudeoverridereference,
    procedure.initialleg_t.altitudeoverridereferencenilreason,
    procedure.initialleg_t.verticalangle,
    procedure.initialleg_t.verticalanglenilreason,
    procedure.initialleg_t.requirednavigationperformance,
    procedure.initialleg_t.requirednavigationperformancenilreason,
    procedure.initialleg_t.speedlimit,
    procedure.initialleg_t.speedlimituom,
    procedure.initialleg_t.speedlimitnilreason,
    procedure.initialleg_t.length,
    procedure.initialleg_t.lengthuom,
    procedure.initialleg_t.lengthnilreason,
    procedure.initialleg_t.duration,
    procedure.initialleg_t.durationuom,
    procedure.initialleg_t.durationnilreason,
    procedure.initialleg_t.upperlimitaltitude,
    procedure.initialleg_t.upperlimitaltitudeuom,
    procedure.initialleg_t.upperlimitaltitudenilreason,
    procedure.initialleg_t.lowerlimitaltitude,
    procedure.initialleg_t.lowerlimitaltitudeuom,
    procedure.initialleg_t.lowerlimitaltitudenilreason,
    procedure.initialleg_t.altitudeoverrideatc,
    procedure.initialleg_t.altitudeoverrideatcuom,
    procedure.initialleg_t.altitudeoverrideatcnilreason
from aixm.aixm_feature
inner join procedure.initialleg_f on aixm.aixm_feature.hjid = procedure.initialleg_f.hjid
inner join procedure.initialleg_tp on aixm.aixm_feature.hjid = procedure.initialleg_tp.timeslice_hjid
inner join procedure.initialleg_t on procedure.initialleg_tp.initiallegtimeslice_hjid = procedure.initialleg_t.hjid
inner join aixm.aixm_timeslice on procedure.initialleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_initialleg_id on procedure.initialleg_view (id);

--procedure.instrumentapproachprocedure_view

drop view if exists procedure.instrumentapproachprocedure_view cascade;
create view procedure.instrumentapproachprocedure_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.instrumentapproachprocedure_t.communicationfailureinstruction,
    procedure.instrumentapproachprocedure_t.communicationfailureinstructionnilreason,
    procedure.instrumentapproachprocedure_t.instruction,
    procedure.instrumentapproachprocedure_t.instructionnilreason,
    procedure.instrumentapproachprocedure_t.designcriteria,
    procedure.instrumentapproachprocedure_t.designcriterianilreason,
    procedure.instrumentapproachprocedure_t.codingstandard,
    procedure.instrumentapproachprocedure_t.codingstandardnilreason,
    procedure.instrumentapproachprocedure_t.flightchecked,
    procedure.instrumentapproachprocedure_t.flightcheckednilreason,
    procedure.instrumentapproachprocedure_t.name,
    procedure.instrumentapproachprocedure_t.namenilreason,
    procedure.instrumentapproachprocedure_t.rnav,
    procedure.instrumentapproachprocedure_t.rnavnilreason,
    procedure.instrumentapproachprocedure_t.approachprefix,
    procedure.instrumentapproachprocedure_t.approachprefixnilreason,
    procedure.instrumentapproachprocedure_t.approachtype,
    procedure.instrumentapproachprocedure_t.approachtypenilreason,
    procedure.instrumentapproachprocedure_t.multipleidentification,
    procedure.instrumentapproachprocedure_t.multipleidentificationnilreason,
    procedure.instrumentapproachprocedure_t.coptertrack,
    procedure.instrumentapproachprocedure_t.coptertracknilreason,
    procedure.instrumentapproachprocedure_t.circlingidentification,
    procedure.instrumentapproachprocedure_t.circlingidentificationnilreason,
    procedure.instrumentapproachprocedure_t.coursereversalinstruction,
    procedure.instrumentapproachprocedure_t.coursereversalinstructionnilreason,
    procedure.instrumentapproachprocedure_t.additionalequipment,
    procedure.instrumentapproachprocedure_t.additionalequipmentnilreason,
    procedure.instrumentapproachprocedure_t.channelgnss,
    procedure.instrumentapproachprocedure_t.channelgnssnilreason,
    procedure.instrumentapproachprocedure_t.waasreliable,
    procedure.instrumentapproachprocedure_t.waasreliablenilreason
from aixm.aixm_feature
inner join procedure.instrumentapproachprocedure_f on aixm.aixm_feature.hjid = procedure.instrumentapproachprocedure_f.hjid
inner join procedure.instrumentapproachprocedure_tp on aixm.aixm_feature.hjid = procedure.instrumentapproachprocedure_tp.timeslice_hjid
inner join procedure.instrumentapproachprocedure_t on procedure.instrumentapproachprocedure_tp.instrumentapproachproceduretimeslice_hjid = procedure.instrumentapproachprocedure_t.hjid
inner join aixm.aixm_timeslice on procedure.instrumentapproachprocedure_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_instrumentapproachprocedure_id on procedure.instrumentapproachprocedure_view (id);

--procedure.intermediateleg_view

drop view if exists procedure.intermediateleg_view cascade;
create view procedure.intermediateleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.intermediateleg_t.endconditiondesignator,
    procedure.intermediateleg_t.endconditiondesignatornilreason,
    procedure.intermediateleg_t.legpath,
    procedure.intermediateleg_t.legpathnilreason,
    procedure.intermediateleg_t.legtypearinc,
    procedure.intermediateleg_t.legtypearincnilreason,
    procedure.intermediateleg_t.course,
    procedure.intermediateleg_t.coursenilreason,
    procedure.intermediateleg_t.coursetype,
    procedure.intermediateleg_t.coursetypenilreason,
    procedure.intermediateleg_t.coursedirection,
    procedure.intermediateleg_t.coursedirectionnilreason,
    procedure.intermediateleg_t.turndirection,
    procedure.intermediateleg_t.turndirectionnilreason,
    procedure.intermediateleg_t.speedreference,
    procedure.intermediateleg_t.speedreferencenilreason,
    procedure.intermediateleg_t.speedinterpretation,
    procedure.intermediateleg_t.speedinterpretationnilreason,
    procedure.intermediateleg_t.bankangle,
    procedure.intermediateleg_t.bankanglenilreason,
    procedure.intermediateleg_t.procedureturnrequired,
    procedure.intermediateleg_t.procedureturnrequirednilreason,
    procedure.intermediateleg_t.upperlimitreference,
    procedure.intermediateleg_t.upperlimitreferencenilreason,
    procedure.intermediateleg_t.lowerlimitreference,
    procedure.intermediateleg_t.lowerlimitreferencenilreason,
    procedure.intermediateleg_t.altitudeinterpretation,
    procedure.intermediateleg_t.altitudeinterpretationnilreason,
    procedure.intermediateleg_t.altitudeoverridereference,
    procedure.intermediateleg_t.altitudeoverridereferencenilreason,
    procedure.intermediateleg_t.verticalangle,
    procedure.intermediateleg_t.verticalanglenilreason,
    procedure.intermediateleg_t.requirednavigationperformance,
    procedure.intermediateleg_t.requirednavigationperformancenilreason,
    procedure.intermediateleg_t.speedlimit,
    procedure.intermediateleg_t.speedlimituom,
    procedure.intermediateleg_t.speedlimitnilreason,
    procedure.intermediateleg_t.length,
    procedure.intermediateleg_t.lengthuom,
    procedure.intermediateleg_t.lengthnilreason,
    procedure.intermediateleg_t.duration,
    procedure.intermediateleg_t.durationuom,
    procedure.intermediateleg_t.durationnilreason,
    procedure.intermediateleg_t.upperlimitaltitude,
    procedure.intermediateleg_t.upperlimitaltitudeuom,
    procedure.intermediateleg_t.upperlimitaltitudenilreason,
    procedure.intermediateleg_t.lowerlimitaltitude,
    procedure.intermediateleg_t.lowerlimitaltitudeuom,
    procedure.intermediateleg_t.lowerlimitaltitudenilreason,
    procedure.intermediateleg_t.altitudeoverrideatc,
    procedure.intermediateleg_t.altitudeoverrideatcuom,
    procedure.intermediateleg_t.altitudeoverrideatcnilreason
from aixm.aixm_feature
inner join procedure.intermediateleg_f on aixm.aixm_feature.hjid = procedure.intermediateleg_f.hjid
inner join procedure.intermediateleg_tp on aixm.aixm_feature.hjid = procedure.intermediateleg_tp.timeslice_hjid
inner join procedure.intermediateleg_t on procedure.intermediateleg_tp.intermediatelegtimeslice_hjid = procedure.intermediateleg_t.hjid
inner join aixm.aixm_timeslice on procedure.intermediateleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_intermediateleg_id on procedure.intermediateleg_view (id);

--navaids_point.localizer_view

drop view if exists navaids_point.localizer_view cascade;
create view navaids_point.localizer_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.localizer_t.designator,
    navaids_point.localizer_t.designatornilreason,
    navaids_point.localizer_t.name,
    navaids_point.localizer_t.namenilreason,
    navaids_point.localizer_t.emissionclass,
    navaids_point.localizer_t.emissionclassnilreason,
    navaids_point.localizer_t.mobile,
    navaids_point.localizer_t.mobilenilreason,
    navaids_point.localizer_t.magneticvariation,
    navaids_point.localizer_t.magneticvariationnilreason,
    navaids_point.localizer_t.magneticvariationaccuracy,
    navaids_point.localizer_t.magneticvariationaccuracynilreason,
    navaids_point.localizer_t.datemagneticvariation,
    navaids_point.localizer_t.datemagneticvariationnilreason,
    navaids_point.localizer_t.flightchecked,
    navaids_point.localizer_t.flightcheckednilreason,
    navaids_point.localizer_t.magneticbearing,
    navaids_point.localizer_t.magneticbearingnilreason,
    navaids_point.localizer_t.magneticbearingaccuracy,
    navaids_point.localizer_t.magneticbearingaccuracynilreason,
    navaids_point.localizer_t.truebearing,
    navaids_point.localizer_t.truebearingnilreason,
    navaids_point.localizer_t.truebearingaccuracy,
    navaids_point.localizer_t.truebearingaccuracynilreason,
    navaids_point.localizer_t.declination,
    navaids_point.localizer_t.declinationnilreason,
    navaids_point.localizer_t.widthcourse,
    navaids_point.localizer_t.widthcoursenilreason,
    navaids_point.localizer_t.widthcourseaccuracy,
    navaids_point.localizer_t.widthcourseaccuracynilreason,
    navaids_point.localizer_t.backcourseusable,
    navaids_point.localizer_t.backcourseusablenilreason,
    navaids_point.localizer_t.frequency,
    navaids_point.localizer_t.frequencyuom,
    navaids_point.localizer_t.frequencynilreason
from aixm.aixm_feature
inner join navaids_point.localizer_f on aixm.aixm_feature.hjid = navaids_point.localizer_f.hjid
inner join navaids_point.localizer_tp on aixm.aixm_feature.hjid = navaids_point.localizer_tp.timeslice_hjid
inner join navaids_point.localizer_t on navaids_point.localizer_tp.localizertimeslice_hjid = navaids_point.localizer_t.hjid
inner join aixm.aixm_timeslice on navaids_point.localizer_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_localizer_id on navaids_point.localizer_view (id);

--navaids_point.markerbeacon_view

drop view if exists navaids_point.markerbeacon_view cascade;
create view navaids_point.markerbeacon_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.markerbeacon_t.designator,
    navaids_point.markerbeacon_t.designatornilreason,
    navaids_point.markerbeacon_t.name,
    navaids_point.markerbeacon_t.namenilreason,
    navaids_point.markerbeacon_t.emissionclass,
    navaids_point.markerbeacon_t.emissionclassnilreason,
    navaids_point.markerbeacon_t.mobile,
    navaids_point.markerbeacon_t.mobilenilreason,
    navaids_point.markerbeacon_t.magneticvariation,
    navaids_point.markerbeacon_t.magneticvariationnilreason,
    navaids_point.markerbeacon_t.magneticvariationaccuracy,
    navaids_point.markerbeacon_t.magneticvariationaccuracynilreason,
    navaids_point.markerbeacon_t.datemagneticvariation,
    navaids_point.markerbeacon_t.datemagneticvariationnilreason,
    navaids_point.markerbeacon_t.flightchecked,
    navaids_point.markerbeacon_t.flightcheckednilreason,
    navaids_point.markerbeacon_t.class,
    navaids_point.markerbeacon_t.classnilreason,
    navaids_point.markerbeacon_t.axisbearing,
    navaids_point.markerbeacon_t.axisbearingnilreason,
    navaids_point.markerbeacon_t.auralmorsecode,
    navaids_point.markerbeacon_t.auralmorsecodenilreason,
    navaids_point.markerbeacon_t.frequency,
    navaids_point.markerbeacon_t.frequencyuom,
    navaids_point.markerbeacon_t.frequencynilreason
from aixm.aixm_feature
inner join navaids_point.markerbeacon_f on aixm.aixm_feature.hjid = navaids_point.markerbeacon_f.hjid
inner join navaids_point.markerbeacon_tp on aixm.aixm_feature.hjid = navaids_point.markerbeacon_tp.timeslice_hjid
inner join navaids_point.markerbeacon_t on navaids_point.markerbeacon_tp.markerbeacontimeslice_hjid = navaids_point.markerbeacon_t.hjid
inner join aixm.aixm_timeslice on navaids_point.markerbeacon_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_markerbeacon_id on navaids_point.markerbeacon_view (id);

--airport_heliport.markingbuoy_view

drop view if exists airport_heliport.markingbuoy_view cascade;
create view airport_heliport.markingbuoy_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.markingbuoy_t.type,
    airport_heliport.markingbuoy_t.typenilreason,
    airport_heliport.markingbuoy_t.colour,
    airport_heliport.markingbuoy_t.colournilreason
from aixm.aixm_feature
inner join airport_heliport.markingbuoy_f on aixm.aixm_feature.hjid = airport_heliport.markingbuoy_f.hjid
inner join airport_heliport.markingbuoy_tp on aixm.aixm_feature.hjid = airport_heliport.markingbuoy_tp.timeslice_hjid
inner join airport_heliport.markingbuoy_t on airport_heliport.markingbuoy_tp.markingbuoytimeslice_hjid = airport_heliport.markingbuoy_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.markingbuoy_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_markingbuoy_id on airport_heliport.markingbuoy_view (id);

--procedure.missedapproachleg_view

drop view if exists procedure.missedapproachleg_view cascade;
create view procedure.missedapproachleg_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.missedapproachleg_t.endconditiondesignator,
    procedure.missedapproachleg_t.endconditiondesignatornilreason,
    procedure.missedapproachleg_t.legpath,
    procedure.missedapproachleg_t.legpathnilreason,
    procedure.missedapproachleg_t.legtypearinc,
    procedure.missedapproachleg_t.legtypearincnilreason,
    procedure.missedapproachleg_t.course,
    procedure.missedapproachleg_t.coursenilreason,
    procedure.missedapproachleg_t.coursetype,
    procedure.missedapproachleg_t.coursetypenilreason,
    procedure.missedapproachleg_t.coursedirection,
    procedure.missedapproachleg_t.coursedirectionnilreason,
    procedure.missedapproachleg_t.turndirection,
    procedure.missedapproachleg_t.turndirectionnilreason,
    procedure.missedapproachleg_t.speedreference,
    procedure.missedapproachleg_t.speedreferencenilreason,
    procedure.missedapproachleg_t.speedinterpretation,
    procedure.missedapproachleg_t.speedinterpretationnilreason,
    procedure.missedapproachleg_t.bankangle,
    procedure.missedapproachleg_t.bankanglenilreason,
    procedure.missedapproachleg_t.procedureturnrequired,
    procedure.missedapproachleg_t.procedureturnrequirednilreason,
    procedure.missedapproachleg_t.upperlimitreference,
    procedure.missedapproachleg_t.upperlimitreferencenilreason,
    procedure.missedapproachleg_t.lowerlimitreference,
    procedure.missedapproachleg_t.lowerlimitreferencenilreason,
    procedure.missedapproachleg_t.altitudeinterpretation,
    procedure.missedapproachleg_t.altitudeinterpretationnilreason,
    procedure.missedapproachleg_t.altitudeoverridereference,
    procedure.missedapproachleg_t.altitudeoverridereferencenilreason,
    procedure.missedapproachleg_t.verticalangle,
    procedure.missedapproachleg_t.verticalanglenilreason,
    procedure.missedapproachleg_t.type,
    procedure.missedapproachleg_t.typenilreason,
    procedure.missedapproachleg_t.thresholdaftermapt,
    procedure.missedapproachleg_t.thresholdaftermaptnilreason,
    procedure.missedapproachleg_t.requirednavigationperformance,
    procedure.missedapproachleg_t.requirednavigationperformancenilreason,
    procedure.missedapproachleg_t.speedlimit,
    procedure.missedapproachleg_t.speedlimituom,
    procedure.missedapproachleg_t.speedlimitnilreason,
    procedure.missedapproachleg_t.length,
    procedure.missedapproachleg_t.lengthuom,
    procedure.missedapproachleg_t.lengthnilreason,
    procedure.missedapproachleg_t.duration,
    procedure.missedapproachleg_t.durationuom,
    procedure.missedapproachleg_t.durationnilreason,
    procedure.missedapproachleg_t.upperlimitaltitude,
    procedure.missedapproachleg_t.upperlimitaltitudeuom,
    procedure.missedapproachleg_t.upperlimitaltitudenilreason,
    procedure.missedapproachleg_t.lowerlimitaltitude,
    procedure.missedapproachleg_t.lowerlimitaltitudeuom,
    procedure.missedapproachleg_t.lowerlimitaltitudenilreason,
    procedure.missedapproachleg_t.altitudeoverrideatc,
    procedure.missedapproachleg_t.altitudeoverrideatcuom,
    procedure.missedapproachleg_t.altitudeoverrideatcnilreason,
    procedure.missedapproachleg_t.heightmapt,
    procedure.missedapproachleg_t.heightmaptuom,
    procedure.missedapproachleg_t.heightmaptnilreason
from aixm.aixm_feature
inner join procedure.missedapproachleg_f on aixm.aixm_feature.hjid = procedure.missedapproachleg_f.hjid
inner join procedure.missedapproachleg_tp on aixm.aixm_feature.hjid = procedure.missedapproachleg_tp.timeslice_hjid
inner join procedure.missedapproachleg_t on procedure.missedapproachleg_tp.missedapproachlegtimeslice_hjid = procedure.missedapproachleg_t.hjid
inner join aixm.aixm_timeslice on procedure.missedapproachleg_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_missedapproachleg_id on procedure.missedapproachleg_view (id);

--navaids_point.navaid_view

drop view if exists navaids_point.navaid_view cascade;
create view navaids_point.navaid_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.navaid_t.type,
    navaids_point.navaid_t.typenilreason,
    navaids_point.navaid_t.designator,
    navaids_point.navaid_t.designatornilreason,
    navaids_point.navaid_t.name,
    navaids_point.navaid_t.namenilreason,
    navaids_point.navaid_t.flightchecked,
    navaids_point.navaid_t.flightcheckednilreason,
    navaids_point.navaid_t.purpose,
    navaids_point.navaid_t.purposenilreason,
    navaids_point.navaid_t.signalperformance,
    navaids_point.navaid_t.signalperformancenilreason,
    navaids_point.navaid_t.coursequality,
    navaids_point.navaid_t.coursequalitynilreason,
    navaids_point.navaid_t.integritylevel,
    navaids_point.navaid_t.integritylevelnilreason
from aixm.aixm_feature
inner join navaids_point.navaid_f on aixm.aixm_feature.hjid = navaids_point.navaid_f.hjid
inner join navaids_point.navaid_tp on aixm.aixm_feature.hjid = navaids_point.navaid_tp.timeslice_hjid
inner join navaids_point.navaid_t on navaids_point.navaid_tp.navaidtimeslice_hjid = navaids_point.navaid_t.hjid
inner join aixm.aixm_timeslice on navaids_point.navaid_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_navaid_id on navaids_point.navaid_view (id);

--procedure.navigationarearestriction_view

drop view if exists procedure.navigationarearestriction_view cascade;
create view procedure.navigationarearestriction_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.navigationarearestriction_t.type,
    procedure.navigationarearestriction_t.typenilreason
from aixm.aixm_feature
inner join procedure.navigationarearestriction_f on aixm.aixm_feature.hjid = procedure.navigationarearestriction_f.hjid
inner join procedure.navigationarearestriction_tp on aixm.aixm_feature.hjid = procedure.navigationarearestriction_tp.timeslice_hjid
inner join procedure.navigationarearestriction_t on procedure.navigationarearestriction_tp.navigationarearestrictiontimeslice_hjid = procedure.navigationarearestriction_t.hjid
inner join aixm.aixm_timeslice on procedure.navigationarearestriction_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_navigationarearestriction_id on procedure.navigationarearestriction_view (id);

--procedure.navigationarea_view

drop view if exists procedure.navigationarea_view cascade;
create view procedure.navigationarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.navigationarea_t.navigationareatype,
    procedure.navigationarea_t.navigationareatypenilreason,
    procedure.navigationarea_t.minimumceiling,
    procedure.navigationarea_t.minimumceilinguom,
    procedure.navigationarea_t.minimumceilingnilreason,
    procedure.navigationarea_t.minimumvisibility,
    procedure.navigationarea_t.minimumvisibilityuom,
    procedure.navigationarea_t.minimumvisibilitynilreason
from aixm.aixm_feature
inner join procedure.navigationarea_f on aixm.aixm_feature.hjid = procedure.navigationarea_f.hjid
inner join procedure.navigationarea_tp on aixm.aixm_feature.hjid = procedure.navigationarea_tp.timeslice_hjid
inner join procedure.navigationarea_t on procedure.navigationarea_tp.navigationareatimeslice_hjid = procedure.navigationarea_t.hjid
inner join aixm.aixm_timeslice on procedure.navigationarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_navigationarea_id on procedure.navigationarea_view (id);

--navaids_point.ndb_view

drop view if exists navaids_point.ndb_view cascade;
create view navaids_point.ndb_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.ndb_t.designator,
    navaids_point.ndb_t.designatornilreason,
    navaids_point.ndb_t.name,
    navaids_point.ndb_t.namenilreason,
    navaids_point.ndb_t.emissionclass,
    navaids_point.ndb_t.emissionclassnilreason,
    navaids_point.ndb_t.mobile,
    navaids_point.ndb_t.mobilenilreason,
    navaids_point.ndb_t.magneticvariation,
    navaids_point.ndb_t.magneticvariationnilreason,
    navaids_point.ndb_t.magneticvariationaccuracy,
    navaids_point.ndb_t.magneticvariationaccuracynilreason,
    navaids_point.ndb_t.datemagneticvariation,
    navaids_point.ndb_t.datemagneticvariationnilreason,
    navaids_point.ndb_t.flightchecked,
    navaids_point.ndb_t.flightcheckednilreason,
    navaids_point.ndb_t.class,
    navaids_point.ndb_t.classnilreason,
    navaids_point.ndb_t.emissionband,
    navaids_point.ndb_t.emissionbandnilreason,
    navaids_point.ndb_t.frequency,
    navaids_point.ndb_t.frequencyuom,
    navaids_point.ndb_t.frequencynilreason
from aixm.aixm_feature
inner join navaids_point.ndb_f on aixm.aixm_feature.hjid = navaids_point.ndb_f.hjid
inner join navaids_point.ndb_tp on aixm.aixm_feature.hjid = navaids_point.ndb_tp.timeslice_hjid
inner join navaids_point.ndb_t on navaids_point.ndb_tp.ndbtimeslice_hjid = navaids_point.ndb_t.hjid
inner join aixm.aixm_timeslice on navaids_point.ndb_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_ndb_id on navaids_point.ndb_view (id);

--airport_heliport.nonmovementarea_view

drop view if exists airport_heliport.nonmovementarea_view cascade;
create view airport_heliport.nonmovementarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join airport_heliport.nonmovementarea_f on aixm.aixm_feature.hjid = airport_heliport.nonmovementarea_f.hjid
inner join airport_heliport.nonmovementarea_tp on aixm.aixm_feature.hjid = airport_heliport.nonmovementarea_tp.timeslice_hjid
inner join airport_heliport.nonmovementarea_t on airport_heliport.nonmovementarea_tp.nonmovementareatimeslice_hjid = airport_heliport.nonmovementarea_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.nonmovementarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_nonmovementarea_id on airport_heliport.nonmovementarea_view (id);

--obstacle.obstaclearea_view

drop view if exists obstacle.obstaclearea_view cascade;
create view obstacle.obstaclearea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    obstacle.obstaclearea_t.type,
    obstacle.obstaclearea_t.typenilreason,
    obstacle.obstaclearea_t.obstructionidsurfacecondition,
    obstacle.obstaclearea_t.obstructionidsurfaceconditionnilreason
from aixm.aixm_feature
inner join obstacle.obstaclearea_f on aixm.aixm_feature.hjid = obstacle.obstaclearea_f.hjid
inner join obstacle.obstaclearea_tp on aixm.aixm_feature.hjid = obstacle.obstaclearea_tp.timeslice_hjid
inner join obstacle.obstaclearea_t on obstacle.obstaclearea_tp.obstacleareatimeslice_hjid = obstacle.obstaclearea_t.hjid
inner join aixm.aixm_timeslice on obstacle.obstaclearea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists obstacle_obstaclearea_id on obstacle.obstaclearea_view (id);

--organisation.organisationauthority_view

drop view if exists organisation.organisationauthority_view cascade;
create view organisation.organisationauthority_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    organisation.organisationauthority_t.name,
    organisation.organisationauthority_t.namenilreason,
    organisation.organisationauthority_t.designator,
    organisation.organisationauthority_t.designatornilreason,
    organisation.organisationauthority_t.type,
    organisation.organisationauthority_t.typenilreason,
    organisation.organisationauthority_t.military,
    organisation.organisationauthority_t.militarynilreason
from aixm.aixm_feature
inner join organisation.organisationauthority_f on aixm.aixm_feature.hjid = organisation.organisationauthority_f.hjid
inner join organisation.organisationauthority_tp on aixm.aixm_feature.hjid = organisation.organisationauthority_tp.timeslice_hjid
inner join organisation.organisationauthority_t on organisation.organisationauthority_tp.organisationauthoritytimeslice_hjid = organisation.organisationauthority_t.hjid
inner join aixm.aixm_timeslice on organisation.organisationauthority_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists organisation_organisationauthority_id on organisation.organisationauthority_view (id);

--airport_heliport.passengerloadingbridge_view

drop view if exists airport_heliport.passengerloadingbridge_view cascade;
create view airport_heliport.passengerloadingbridge_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.passengerloadingbridge_t.type,
    airport_heliport.passengerloadingbridge_t.typenilreason
from aixm.aixm_feature
inner join airport_heliport.passengerloadingbridge_f on aixm.aixm_feature.hjid = airport_heliport.passengerloadingbridge_f.hjid
inner join airport_heliport.passengerloadingbridge_tp on aixm.aixm_feature.hjid = airport_heliport.passengerloadingbridge_tp.timeslice_hjid
inner join airport_heliport.passengerloadingbridge_t on airport_heliport.passengerloadingbridge_tp.passengerloadingbridgetimeslice_hjid = airport_heliport.passengerloadingbridge_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.passengerloadingbridge_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_passengerloadingbridge_id on airport_heliport.passengerloadingbridge_view (id);

--service.passengerservice_view

drop view if exists service.passengerservice_view cascade;
create view service.passengerservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.passengerservice_t.flightoperations,
    service.passengerservice_t.flightoperationsnilreason,
    service.passengerservice_t.rank,
    service.passengerservice_t.ranknilreason,
    service.passengerservice_t.complianticao,
    service.passengerservice_t.complianticaonilreason,
    service.passengerservice_t.name,
    service.passengerservice_t.namenilreason,
    service.passengerservice_t.type,
    service.passengerservice_t.typenilreason
from aixm.aixm_feature
inner join service.passengerservice_f on aixm.aixm_feature.hjid = service.passengerservice_f.hjid
inner join service.passengerservice_tp on aixm.aixm_feature.hjid = service.passengerservice_tp.timeslice_hjid
inner join service.passengerservice_t on service.passengerservice_tp.passengerservicetimeslice_hjid = service.passengerservice_t.hjid
inner join aixm.aixm_timeslice on service.passengerservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_passengerservice_id on service.passengerservice_view (id);

--service.pilotcontrolledlighting_view

drop view if exists service.pilotcontrolledlighting_view cascade;
create view service.pilotcontrolledlighting_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.pilotcontrolledlighting_t.type,
    service.pilotcontrolledlighting_t.typenilreason,
    service.pilotcontrolledlighting_t.intensitysteps,
    service.pilotcontrolledlighting_t.intensitystepsnilreason,
    service.pilotcontrolledlighting_t.standbyintensity,
    service.pilotcontrolledlighting_t.standbyintensitynilreason,
    service.pilotcontrolledlighting_t.activationinstruction,
    service.pilotcontrolledlighting_t.activationinstructionnilreason,
    service.pilotcontrolledlighting_t.duration,
    service.pilotcontrolledlighting_t.durationuom,
    service.pilotcontrolledlighting_t.durationnilreason,
    service.pilotcontrolledlighting_t.radiofrequency,
    service.pilotcontrolledlighting_t.radiofrequencyuom,
    service.pilotcontrolledlighting_t.radiofrequencynilreason
from aixm.aixm_feature
inner join service.pilotcontrolledlighting_f on aixm.aixm_feature.hjid = service.pilotcontrolledlighting_f.hjid
inner join service.pilotcontrolledlighting_tp on aixm.aixm_feature.hjid = service.pilotcontrolledlighting_tp.timeslice_hjid
inner join service.pilotcontrolledlighting_t on service.pilotcontrolledlighting_tp.pilotcontrolledlightingtimeslice_hjid = service.pilotcontrolledlighting_t.hjid
inner join aixm.aixm_timeslice on service.pilotcontrolledlighting_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_pilotcontrolledlighting_id on service.pilotcontrolledlighting_view (id);

--surveillance.precisionapproachradar_view

drop view if exists surveillance.precisionapproachradar_view cascade;
create view surveillance.precisionapproachradar_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    surveillance.precisionapproachradar_t.name,
    surveillance.precisionapproachradar_t.namenilreason,
    surveillance.precisionapproachradar_t.serialnumber,
    surveillance.precisionapproachradar_t.serialnumbernilreason,
    surveillance.precisionapproachradar_t.dualchannel,
    surveillance.precisionapproachradar_t.dualchannelnilreason,
    surveillance.precisionapproachradar_t.movingtargetindicator,
    surveillance.precisionapproachradar_t.movingtargetindicatornilreason,
    surveillance.precisionapproachradar_t.standbypower,
    surveillance.precisionapproachradar_t.standbypowernilreason,
    surveillance.precisionapproachradar_t.digital,
    surveillance.precisionapproachradar_t.digitalnilreason,
    surveillance.precisionapproachradar_t.militaryuseonly,
    surveillance.precisionapproachradar_t.militaryuseonlynilreason,
    surveillance.precisionapproachradar_t.specialuseonly,
    surveillance.precisionapproachradar_t.specialuseonlynilreason,
    surveillance.precisionapproachradar_t.specialaircraftonly,
    surveillance.precisionapproachradar_t.specialaircraftonlynilreason,
    surveillance.precisionapproachradar_t.magneticvariation,
    surveillance.precisionapproachradar_t.magneticvariationnilreason,
    surveillance.precisionapproachradar_t.magneticvariationaccuracy,
    surveillance.precisionapproachradar_t.magneticvariationaccuracynilreason,
    surveillance.precisionapproachradar_t.datemagneticvariation,
    surveillance.precisionapproachradar_t.datemagneticvariationnilreason,
    surveillance.precisionapproachradar_t.precisionapproachradartype,
    surveillance.precisionapproachradar_t.precisionapproachradartypenilreason,
    surveillance.precisionapproachradar_t.slope,
    surveillance.precisionapproachradar_t.slopenilreason,
    surveillance.precisionapproachradar_t.slopeaccuracy,
    surveillance.precisionapproachradar_t.slopeaccuracynilreason,
    surveillance.precisionapproachradar_t.range,
    surveillance.precisionapproachradar_t.rangeuom,
    surveillance.precisionapproachradar_t.rangenilreason,
    surveillance.precisionapproachradar_t.rangeaccuracy,
    surveillance.precisionapproachradar_t.rangeaccuracyuom,
    surveillance.precisionapproachradar_t.rangeaccuracynilreason
from aixm.aixm_feature
inner join surveillance.precisionapproachradar_f on aixm.aixm_feature.hjid = surveillance.precisionapproachradar_f.hjid
inner join surveillance.precisionapproachradar_tp on aixm.aixm_feature.hjid = surveillance.precisionapproachradar_tp.timeslice_hjid
inner join surveillance.precisionapproachradar_t on surveillance.precisionapproachradar_tp.precisionapproachradartimeslice_hjid = surveillance.precisionapproachradar_t.hjid
inner join aixm.aixm_timeslice on surveillance.precisionapproachradar_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists surveillance_precisionapproachradar_id on surveillance.precisionapproachradar_view (id);

--surveillance.primarysurveillanceradar_view

drop view if exists surveillance.primarysurveillanceradar_view cascade;
create view surveillance.primarysurveillanceradar_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    surveillance.primarysurveillanceradar_t.name,
    surveillance.primarysurveillanceradar_t.namenilreason,
    surveillance.primarysurveillanceradar_t.serialnumber,
    surveillance.primarysurveillanceradar_t.serialnumbernilreason,
    surveillance.primarysurveillanceradar_t.dualchannel,
    surveillance.primarysurveillanceradar_t.dualchannelnilreason,
    surveillance.primarysurveillanceradar_t.movingtargetindicator,
    surveillance.primarysurveillanceradar_t.movingtargetindicatornilreason,
    surveillance.primarysurveillanceradar_t.standbypower,
    surveillance.primarysurveillanceradar_t.standbypowernilreason,
    surveillance.primarysurveillanceradar_t.digital,
    surveillance.primarysurveillanceradar_t.digitalnilreason,
    surveillance.primarysurveillanceradar_t.militaryuseonly,
    surveillance.primarysurveillanceradar_t.militaryuseonlynilreason,
    surveillance.primarysurveillanceradar_t.specialuseonly,
    surveillance.primarysurveillanceradar_t.specialuseonlynilreason,
    surveillance.primarysurveillanceradar_t.specialaircraftonly,
    surveillance.primarysurveillanceradar_t.specialaircraftonlynilreason,
    surveillance.primarysurveillanceradar_t.magneticvariation,
    surveillance.primarysurveillanceradar_t.magneticvariationnilreason,
    surveillance.primarysurveillanceradar_t.magneticvariationaccuracy,
    surveillance.primarysurveillanceradar_t.magneticvariationaccuracynilreason,
    surveillance.primarysurveillanceradar_t.datemagneticvariation,
    surveillance.primarysurveillanceradar_t.datemagneticvariationnilreason,
    surveillance.primarysurveillanceradar_t.verticalcoverageazimuth,
    surveillance.primarysurveillanceradar_t.verticalcoverageazimuthnilreason,
    surveillance.primarysurveillanceradar_t.antennatiltfixed,
    surveillance.primarysurveillanceradar_t.antennatiltfixednilreason,
    surveillance.primarysurveillanceradar_t.tiltangle,
    surveillance.primarysurveillanceradar_t.tiltanglenilreason,
    surveillance.primarysurveillanceradar_t.automatedradarterminalsystem,
    surveillance.primarysurveillanceradar_t.automatedradarterminalsystemnilreason,
    surveillance.primarysurveillanceradar_t.type,
    surveillance.primarysurveillanceradar_t.typenilreason,
    surveillance.primarysurveillanceradar_t.range,
    surveillance.primarysurveillanceradar_t.rangeuom,
    surveillance.primarysurveillanceradar_t.rangenilreason,
    surveillance.primarysurveillanceradar_t.rangeaccuracy,
    surveillance.primarysurveillanceradar_t.rangeaccuracyuom,
    surveillance.primarysurveillanceradar_t.rangeaccuracynilreason,
    surveillance.primarysurveillanceradar_t.verticalcoveragealtitude,
    surveillance.primarysurveillanceradar_t.verticalcoveragealtitudeuom,
    surveillance.primarysurveillanceradar_t.verticalcoveragealtitudenilreason,
    surveillance.primarysurveillanceradar_t.verticalcoveragedistance,
    surveillance.primarysurveillanceradar_t.verticalcoveragedistanceuom,
    surveillance.primarysurveillanceradar_t.verticalcoveragedistancenilreason
from aixm.aixm_feature
inner join surveillance.primarysurveillanceradar_f on aixm.aixm_feature.hjid = surveillance.primarysurveillanceradar_f.hjid
inner join surveillance.primarysurveillanceradar_tp on aixm.aixm_feature.hjid = surveillance.primarysurveillanceradar_tp.timeslice_hjid
inner join surveillance.primarysurveillanceradar_t on surveillance.primarysurveillanceradar_tp.primarysurveillanceradartimeslice_hjid = surveillance.primarysurveillanceradar_t.hjid
inner join aixm.aixm_timeslice on surveillance.primarysurveillanceradar_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists surveillance_primarysurveillanceradar_id on surveillance.primarysurveillanceradar_view (id);

--procedure.proceduredme_view

drop view if exists procedure.proceduredme_view cascade;
create view procedure.proceduredme_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.proceduredme_t.criticaldme,
    procedure.proceduredme_t.criticaldmenilreason,
    procedure.proceduredme_t.satisfactory,
    procedure.proceduredme_t.satisfactorynilreason
from aixm.aixm_feature
inner join procedure.proceduredme_f on aixm.aixm_feature.hjid = procedure.proceduredme_f.hjid
inner join procedure.proceduredme_tp on aixm.aixm_feature.hjid = procedure.proceduredme_tp.timeslice_hjid
inner join procedure.proceduredme_t on procedure.proceduredme_tp.proceduredmetimeslice_hjid = procedure.proceduredme_t.hjid
inner join aixm.aixm_timeslice on procedure.proceduredme_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_proceduredme_id on procedure.proceduredme_view (id);

--surveillance.radarsystem_view

drop view if exists surveillance.radarsystem_view cascade;
create view surveillance.radarsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    surveillance.radarsystem_t.type,
    surveillance.radarsystem_t.typenilreason,
    surveillance.radarsystem_t.model,
    surveillance.radarsystem_t.modelnilreason,
    surveillance.radarsystem_t.generalterrainmonitor,
    surveillance.radarsystem_t.generalterrainmonitornilreason,
    surveillance.radarsystem_t.broadcastidentifier,
    surveillance.radarsystem_t.broadcastidentifiernilreason
from aixm.aixm_feature
inner join surveillance.radarsystem_f on aixm.aixm_feature.hjid = surveillance.radarsystem_f.hjid
inner join surveillance.radarsystem_tp on aixm.aixm_feature.hjid = surveillance.radarsystem_tp.timeslice_hjid
inner join surveillance.radarsystem_t on surveillance.radarsystem_tp.radarsystemtimeslice_hjid = surveillance.radarsystem_t.hjid
inner join aixm.aixm_timeslice on surveillance.radarsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists surveillance_radarsystem_id on surveillance.radarsystem_view (id);

--service.radiocommunicationchannel_view

drop view if exists service.radiocommunicationchannel_view cascade;
create view service.radiocommunicationchannel_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.radiocommunicationchannel_t.mode,
    service.radiocommunicationchannel_t.modenilreason,
    service.radiocommunicationchannel_t.rank,
    service.radiocommunicationchannel_t.ranknilreason,
    service.radiocommunicationchannel_t.channel,
    service.radiocommunicationchannel_t.channelnilreason,
    service.radiocommunicationchannel_t.logon,
    service.radiocommunicationchannel_t.logonnilreason,
    service.radiocommunicationchannel_t.emissiontype,
    service.radiocommunicationchannel_t.emissiontypenilreason,
    service.radiocommunicationchannel_t.selectivecall,
    service.radiocommunicationchannel_t.selectivecallnilreason,
    service.radiocommunicationchannel_t.flightchecked,
    service.radiocommunicationchannel_t.flightcheckednilreason,
    service.radiocommunicationchannel_t.trafficdirection,
    service.radiocommunicationchannel_t.trafficdirectionnilreason,
    service.radiocommunicationchannel_t.frequencytransmission,
    service.radiocommunicationchannel_t.frequencytransmissionuom,
    service.radiocommunicationchannel_t.frequencytransmissionnilreason,
    service.radiocommunicationchannel_t.frequencyreception,
    service.radiocommunicationchannel_t.frequencyreceptionuom,
    service.radiocommunicationchannel_t.frequencyreceptionnilreason
from aixm.aixm_feature
inner join service.radiocommunicationchannel_f on aixm.aixm_feature.hjid = service.radiocommunicationchannel_f.hjid
inner join service.radiocommunicationchannel_tp on aixm.aixm_feature.hjid = service.radiocommunicationchannel_tp.timeslice_hjid
inner join service.radiocommunicationchannel_t on service.radiocommunicationchannel_tp.radiocommunicationchanneltimeslice_hjid = service.radiocommunicationchannel_t.hjid
inner join aixm.aixm_timeslice on service.radiocommunicationchannel_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_radiocommunicationchannel_id on service.radiocommunicationchannel_view (id);

--shared.radiofrequencyarea_view

drop view if exists shared.radiofrequencyarea_view cascade;
create view shared.radiofrequencyarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    shared.radiofrequencyarea_t.type,
    shared.radiofrequencyarea_t.typenilreason,
    shared.radiofrequencyarea_t.anglescallop,
    shared.radiofrequencyarea_t.anglescallopnilreason,
    shared.radiofrequencyarea_t.signaltype,
    shared.radiofrequencyarea_t.signaltypenilreason
from aixm.aixm_feature
inner join shared.radiofrequencyarea_f on aixm.aixm_feature.hjid = shared.radiofrequencyarea_f.hjid
inner join shared.radiofrequencyarea_tp on aixm.aixm_feature.hjid = shared.radiofrequencyarea_tp.timeslice_hjid
inner join shared.radiofrequencyarea_t on shared.radiofrequencyarea_tp.radiofrequencyareatimeslice_hjid = shared.radiofrequencyarea_t.hjid
inner join aixm.aixm_timeslice on shared.radiofrequencyarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists shared_radiofrequencyarea_id on shared.radiofrequencyarea_view (id);

--airport_heliport.road_view

drop view if exists airport_heliport.road_view cascade;
create view airport_heliport.road_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.road_t.designator,
    airport_heliport.road_t.designatornilreason,
    airport_heliport.road_t.status,
    airport_heliport.road_t.statusnilreason,
    airport_heliport.road_t.type,
    airport_heliport.road_t.typenilreason,
    airport_heliport.road_t.abandoned,
    airport_heliport.road_t.abandonednilreason
from aixm.aixm_feature
inner join airport_heliport.road_f on aixm.aixm_feature.hjid = airport_heliport.road_f.hjid
inner join airport_heliport.road_tp on aixm.aixm_feature.hjid = airport_heliport.road_tp.timeslice_hjid
inner join airport_heliport.road_t on airport_heliport.road_tp.roadtimeslice_hjid = airport_heliport.road_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.road_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_road_id on airport_heliport.road_view (id);

--route.routedme_view

drop view if exists route.routedme_view cascade;
create view route.routedme_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    route.routedme_t.criticaldme,
    route.routedme_t.criticaldmenilreason,
    route.routedme_t.satisfactory,
    route.routedme_t.satisfactorynilreason
from aixm.aixm_feature
inner join route.routedme_f on aixm.aixm_feature.hjid = route.routedme_f.hjid
inner join route.routedme_tp on aixm.aixm_feature.hjid = route.routedme_tp.timeslice_hjid
inner join route.routedme_t on route.routedme_tp.routedmetimeslice_hjid = route.routedme_t.hjid
inner join aixm.aixm_timeslice on route.routedme_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists route_routedme_id on route.routedme_view (id);

--route.routesegment_view

drop view if exists route.routesegment_view cascade;
create view route.routesegment_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    route.routesegment_t.level,
    route.routesegment_t.levelnilreason,
    route.routesegment_t.upperlimitreference,
    route.routesegment_t.upperlimitreferencenilreason,
    route.routesegment_t.lowerlimitreference,
    route.routesegment_t.lowerlimitreferencenilreason,
    route.routesegment_t.pathtype,
    route.routesegment_t.pathtypenilreason,
    route.routesegment_t.truetrack,
    route.routesegment_t.truetracknilreason,
    route.routesegment_t.magnetictrack,
    route.routesegment_t.magnetictracknilreason,
    route.routesegment_t.reversetruetrack,
    route.routesegment_t.reversetruetracknilreason,
    route.routesegment_t.reversemagnetictrack,
    route.routesegment_t.reversemagnetictracknilreason,
    route.routesegment_t.turndirection,
    route.routesegment_t.turndirectionnilreason,
    route.routesegment_t.signalgap,
    route.routesegment_t.signalgapnilreason,
    route.routesegment_t.minimumcrossingatendreference,
    route.routesegment_t.minimumcrossingatendreferencenilreason,
    route.routesegment_t.maximumcrossingatendreference,
    route.routesegment_t.maximumcrossingatendreferencenilreason,
    route.routesegment_t.navigationtype,
    route.routesegment_t.navigationtypenilreason,
    route.routesegment_t.requirednavigationperformance,
    route.routesegment_t.requirednavigationperformancenilreason,
    route.routesegment_t.designatorsuffix,
    route.routesegment_t.designatorsuffixnilreason,
    route.routesegment_t.upperlimit,
    route.routesegment_t.upperlimituom,
    route.routesegment_t.upperlimitnilreason,
    route.routesegment_t.lowerlimit,
    route.routesegment_t.lowerlimituom,
    route.routesegment_t.lowerlimitnilreason,
    route.routesegment_t.minimumobstacleclearancealtitude,
    route.routesegment_t.minimumobstacleclearancealtitudeuom,
    route.routesegment_t.minimumobstacleclearancealtitudenilreason,
    route.routesegment_t.length,
    route.routesegment_t.lengthuom,
    route.routesegment_t.lengthnilreason,
    route.routesegment_t.widthleft,
    route.routesegment_t.widthleftuom,
    route.routesegment_t.widthleftnilreason,
    route.routesegment_t.widthright,
    route.routesegment_t.widthrightuom,
    route.routesegment_t.widthrightnilreason,
    route.routesegment_t.minimumenroutealtitude,
    route.routesegment_t.minimumenroutealtitudeuom,
    route.routesegment_t.minimumenroutealtitudenilreason,
    route.routesegment_t.minimumcrossingatend,
    route.routesegment_t.minimumcrossingatenduom,
    route.routesegment_t.minimumcrossingatendnilreason,
    route.routesegment_t.maximumcrossingatend,
    route.routesegment_t.maximumcrossingatenduom,
    route.routesegment_t.maximumcrossingatendnilreason
from aixm.aixm_feature
inner join route.routesegment_f on aixm.aixm_feature.hjid = route.routesegment_f.hjid
inner join route.routesegment_tp on aixm.aixm_feature.hjid = route.routesegment_tp.timeslice_hjid
inner join route.routesegment_t on route.routesegment_tp.routesegmenttimeslice_hjid = route.routesegment_t.hjid
inner join aixm.aixm_timeslice on route.routesegment_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists route_routesegment_id on route.routesegment_view (id);

--route.route_view

drop view if exists route.route_view cascade;
create view route.route_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    route.route_t.designatorprefix,
    route.route_t.designatorprefixnilreason,
    route.route_t.designatorsecondletter,
    route.route_t.designatorsecondletternilreason,
    route.route_t.designatornumber,
    route.route_t.designatornumbernilreason,
    route.route_t.multipleidentifier,
    route.route_t.multipleidentifiernilreason,
    route.route_t.locationdesignator,
    route.route_t.locationdesignatornilreason,
    route.route_t.name,
    route.route_t.namenilreason,
    route.route_t.type,
    route.route_t.typenilreason,
    route.route_t.flightrule,
    route.route_t.flightrulenilreason,
    route.route_t.internationaluse,
    route.route_t.internationalusenilreason,
    route.route_t.militaryuse,
    route.route_t.militaryusenilreason,
    route.route_t.militarytrainingtype,
    route.route_t.militarytrainingtypenilreason
from aixm.aixm_feature
inner join route.route_f on aixm.aixm_feature.hjid = route.route_f.hjid
inner join route.route_tp on aixm.aixm_feature.hjid = route.route_tp.timeslice_hjid
inner join route.route_t on route.route_tp.routetimeslice_hjid = route.route_t.hjid
inner join aixm.aixm_timeslice on route.route_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists route_route_id on route.route_view (id);

--rules_procedure.rulesprocedures_view

drop view if exists rules_procedure.rulesprocedures_view cascade;
create view rules_procedure.rulesprocedures_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    rules_procedure.rulesprocedures_t.category,
    rules_procedure.rulesprocedures_t.categorynilreason,
    rules_procedure.rulesprocedures_t.title,
    rules_procedure.rulesprocedures_t.titlenilreason
from aixm.aixm_feature
inner join rules_procedure.rulesprocedures_f on aixm.aixm_feature.hjid = rules_procedure.rulesprocedures_f.hjid
inner join rules_procedure.rulesprocedures_tp on aixm.aixm_feature.hjid = rules_procedure.rulesprocedures_tp.timeslice_hjid
inner join rules_procedure.rulesprocedures_t on rules_procedure.rulesprocedures_tp.rulesprocedurestimeslice_hjid = rules_procedure.rulesprocedures_t.hjid
inner join aixm.aixm_timeslice on rules_procedure.rulesprocedures_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists rules_procedure_rulesprocedures_id on rules_procedure.rulesprocedures_view (id);

--airport_heliport.runwayblastpad_view

drop view if exists airport_heliport.runwayblastpad_view cascade;
create view airport_heliport.runwayblastpad_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwayblastpad_t.status,
    airport_heliport.runwayblastpad_t.statusnilreason,
    airport_heliport.runwayblastpad_t.length,
    airport_heliport.runwayblastpad_t.lengthuom,
    airport_heliport.runwayblastpad_t.lengthnilreason
from aixm.aixm_feature
inner join airport_heliport.runwayblastpad_f on aixm.aixm_feature.hjid = airport_heliport.runwayblastpad_f.hjid
inner join airport_heliport.runwayblastpad_tp on aixm.aixm_feature.hjid = airport_heliport.runwayblastpad_tp.timeslice_hjid
inner join airport_heliport.runwayblastpad_t on airport_heliport.runwayblastpad_tp.runwayblastpadtimeslice_hjid = airport_heliport.runwayblastpad_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwayblastpad_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwayblastpad_id on airport_heliport.runwayblastpad_view (id);

--airport_heliport.runwaycentrelinepoint_view

drop view if exists airport_heliport.runwaycentrelinepoint_view cascade;
create view airport_heliport.runwaycentrelinepoint_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwaycentrelinepoint_t.role,
    airport_heliport.runwaycentrelinepoint_t.rolenilreason,
    airport_heliport.runwaycentrelinepoint_t.designator,
    airport_heliport.runwaycentrelinepoint_t.designatornilreason
from aixm.aixm_feature
inner join airport_heliport.runwaycentrelinepoint_f on aixm.aixm_feature.hjid = airport_heliport.runwaycentrelinepoint_f.hjid
inner join airport_heliport.runwaycentrelinepoint_tp on aixm.aixm_feature.hjid = airport_heliport.runwaycentrelinepoint_tp.timeslice_hjid
inner join airport_heliport.runwaycentrelinepoint_t on airport_heliport.runwaycentrelinepoint_tp.runwaycentrelinepointtimeslice_hjid = airport_heliport.runwaycentrelinepoint_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwaycentrelinepoint_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwaycentrelinepoint_id on airport_heliport.runwaycentrelinepoint_view (id);

--airport_heliport.runwaydirectionlightsystem_view

drop view if exists airport_heliport.runwaydirectionlightsystem_view cascade;
create view airport_heliport.runwaydirectionlightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwaydirectionlightsystem_t.emergencylighting,
    airport_heliport.runwaydirectionlightsystem_t.emergencylightingnilreason,
    airport_heliport.runwaydirectionlightsystem_t.intensitylevel,
    airport_heliport.runwaydirectionlightsystem_t.intensitylevelnilreason,
    airport_heliport.runwaydirectionlightsystem_t.colour,
    airport_heliport.runwaydirectionlightsystem_t.colournilreason,
    airport_heliport.runwaydirectionlightsystem_t.position,
    airport_heliport.runwaydirectionlightsystem_t.positionnilreason
from aixm.aixm_feature
inner join airport_heliport.runwaydirectionlightsystem_f on aixm.aixm_feature.hjid = airport_heliport.runwaydirectionlightsystem_f.hjid
inner join airport_heliport.runwaydirectionlightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.runwaydirectionlightsystem_tp.timeslice_hjid
inner join airport_heliport.runwaydirectionlightsystem_t on airport_heliport.runwaydirectionlightsystem_tp.runwaydirectionlightsystemtimeslice_hjid = airport_heliport.runwaydirectionlightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwaydirectionlightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwaydirectionlightsystem_id on airport_heliport.runwaydirectionlightsystem_view (id);

--airport_heliport.runwaydirection_view

drop view if exists airport_heliport.runwaydirection_view cascade;
create view airport_heliport.runwaydirection_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwaydirection_t.designator,
    airport_heliport.runwaydirection_t.designatornilreason,
    airport_heliport.runwaydirection_t.truebearing,
    airport_heliport.runwaydirection_t.truebearingnilreason,
    airport_heliport.runwaydirection_t.truebearingaccuracy,
    airport_heliport.runwaydirection_t.truebearingaccuracynilreason,
    airport_heliport.runwaydirection_t.magneticbearing,
    airport_heliport.runwaydirection_t.magneticbearingnilreason,
    airport_heliport.runwaydirection_t.patternvfr,
    airport_heliport.runwaydirection_t.patternvfrnilreason,
    airport_heliport.runwaydirection_t.slopetdz,
    airport_heliport.runwaydirection_t.slopetdznilreason,
    airport_heliport.runwaydirection_t.approachmarkingtype,
    airport_heliport.runwaydirection_t.approachmarkingtypenilreason,
    airport_heliport.runwaydirection_t.approachmarkingcondition,
    airport_heliport.runwaydirection_t.approachmarkingconditionnilreason,
    airport_heliport.runwaydirection_t.classlightingjar,
    airport_heliport.runwaydirection_t.classlightingjarnilreason,
    airport_heliport.runwaydirection_t.precisionapproachguidance,
    airport_heliport.runwaydirection_t.precisionapproachguidancenilreason,
    airport_heliport.runwaydirection_t.elevationtdz,
    airport_heliport.runwaydirection_t.elevationtdzuom,
    airport_heliport.runwaydirection_t.elevationtdznilreason,
    airport_heliport.runwaydirection_t.elevationtdzaccuracy,
    airport_heliport.runwaydirection_t.elevationtdzaccuracyuom,
    airport_heliport.runwaydirection_t.elevationtdzaccuracynilreason
from aixm.aixm_feature
inner join airport_heliport.runwaydirection_f on aixm.aixm_feature.hjid = airport_heliport.runwaydirection_f.hjid
inner join airport_heliport.runwaydirection_tp on aixm.aixm_feature.hjid = airport_heliport.runwaydirection_tp.timeslice_hjid
inner join airport_heliport.runwaydirection_t on airport_heliport.runwaydirection_tp.runwaydirectiontimeslice_hjid = airport_heliport.runwaydirection_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwaydirection_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwaydirection_id on airport_heliport.runwaydirection_view (id);

--airport_heliport.runwayelement_view

drop view if exists airport_heliport.runwayelement_view cascade;
create view airport_heliport.runwayelement_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwayelement_t.type,
    airport_heliport.runwayelement_t.typenilreason,
    airport_heliport.runwayelement_t.gradeseparation,
    airport_heliport.runwayelement_t.gradeseparationnilreason,
    airport_heliport.runwayelement_t.length,
    airport_heliport.runwayelement_t.lengthuom,
    airport_heliport.runwayelement_t.lengthnilreason,
    airport_heliport.runwayelement_t.width,
    airport_heliport.runwayelement_t.widthuom,
    airport_heliport.runwayelement_t.widthnilreason
from aixm.aixm_feature
inner join airport_heliport.runwayelement_f on aixm.aixm_feature.hjid = airport_heliport.runwayelement_f.hjid
inner join airport_heliport.runwayelement_tp on aixm.aixm_feature.hjid = airport_heliport.runwayelement_tp.timeslice_hjid
inner join airport_heliport.runwayelement_t on airport_heliport.runwayelement_tp.runwayelementtimeslice_hjid = airport_heliport.runwayelement_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwayelement_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwayelement_id on airport_heliport.runwayelement_view (id);

--airport_heliport.runwaymarking_view

drop view if exists airport_heliport.runwaymarking_view cascade;
create view airport_heliport.runwaymarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwaymarking_t.markingicaostandard,
    airport_heliport.runwaymarking_t.markingicaostandardnilreason,
    airport_heliport.runwaymarking_t.condition,
    airport_heliport.runwaymarking_t.conditionnilreason,
    airport_heliport.runwaymarking_t.markinglocation,
    airport_heliport.runwaymarking_t.markinglocationnilreason
from aixm.aixm_feature
inner join airport_heliport.runwaymarking_f on aixm.aixm_feature.hjid = airport_heliport.runwaymarking_f.hjid
inner join airport_heliport.runwaymarking_tp on aixm.aixm_feature.hjid = airport_heliport.runwaymarking_tp.timeslice_hjid
inner join airport_heliport.runwaymarking_t on airport_heliport.runwaymarking_tp.runwaymarkingtimeslice_hjid = airport_heliport.runwaymarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwaymarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwaymarking_id on airport_heliport.runwaymarking_view (id);

--airport_heliport.runwayprotectarealightsystem_view

drop view if exists airport_heliport.runwayprotectarealightsystem_view cascade;
create view airport_heliport.runwayprotectarealightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwayprotectarealightsystem_t.emergencylighting,
    airport_heliport.runwayprotectarealightsystem_t.emergencylightingnilreason,
    airport_heliport.runwayprotectarealightsystem_t.intensitylevel,
    airport_heliport.runwayprotectarealightsystem_t.intensitylevelnilreason,
    airport_heliport.runwayprotectarealightsystem_t.colour,
    airport_heliport.runwayprotectarealightsystem_t.colournilreason,
    airport_heliport.runwayprotectarealightsystem_t.position,
    airport_heliport.runwayprotectarealightsystem_t.positionnilreason
from aixm.aixm_feature
inner join airport_heliport.runwayprotectarealightsystem_f on aixm.aixm_feature.hjid = airport_heliport.runwayprotectarealightsystem_f.hjid
inner join airport_heliport.runwayprotectarealightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.runwayprotectarealightsystem_tp.timeslice_hjid
inner join airport_heliport.runwayprotectarealightsystem_t on airport_heliport.runwayprotectarealightsystem_tp.runwayprotectarealightsystemtimeslice_hjid = airport_heliport.runwayprotectarealightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwayprotectarealightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwayprotectarealightsystem_id on airport_heliport.runwayprotectarealightsystem_view (id);

--airport_heliport.runwayprotectarea_view

drop view if exists airport_heliport.runwayprotectarea_view cascade;
create view airport_heliport.runwayprotectarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwayprotectarea_t.lighting,
    airport_heliport.runwayprotectarea_t.lightingnilreason,
    airport_heliport.runwayprotectarea_t.obstaclefree,
    airport_heliport.runwayprotectarea_t.obstaclefreenilreason,
    airport_heliport.runwayprotectarea_t.type,
    airport_heliport.runwayprotectarea_t.typenilreason,
    airport_heliport.runwayprotectarea_t.status,
    airport_heliport.runwayprotectarea_t.statusnilreason,
    airport_heliport.runwayprotectarea_t.width,
    airport_heliport.runwayprotectarea_t.widthuom,
    airport_heliport.runwayprotectarea_t.widthnilreason,
    airport_heliport.runwayprotectarea_t.length,
    airport_heliport.runwayprotectarea_t.lengthuom,
    airport_heliport.runwayprotectarea_t.lengthnilreason
from aixm.aixm_feature
inner join airport_heliport.runwayprotectarea_f on aixm.aixm_feature.hjid = airport_heliport.runwayprotectarea_f.hjid
inner join airport_heliport.runwayprotectarea_tp on aixm.aixm_feature.hjid = airport_heliport.runwayprotectarea_tp.timeslice_hjid
inner join airport_heliport.runwayprotectarea_t on airport_heliport.runwayprotectarea_tp.runwayprotectareatimeslice_hjid = airport_heliport.runwayprotectarea_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwayprotectarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwayprotectarea_id on airport_heliport.runwayprotectarea_view (id);

--airport_heliport.runway_view

drop view if exists airport_heliport.runway_view cascade;
create view airport_heliport.runway_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runway_t.designator,
    airport_heliport.runway_t.designatornilreason,
    airport_heliport.runway_t.type,
    airport_heliport.runway_t.typenilreason,
    airport_heliport.runway_t.abandoned,
    airport_heliport.runway_t.abandonednilreason,
    airport_heliport.runway_t.nominallength,
    airport_heliport.runway_t.nominallengthuom,
    airport_heliport.runway_t.nominallengthnilreason,
    airport_heliport.runway_t.lengthaccuracy,
    airport_heliport.runway_t.lengthaccuracyuom,
    airport_heliport.runway_t.lengthaccuracynilreason,
    airport_heliport.runway_t.nominalwidth,
    airport_heliport.runway_t.nominalwidthuom,
    airport_heliport.runway_t.nominalwidthnilreason,
    airport_heliport.runway_t.widthaccuracy,
    airport_heliport.runway_t.widthaccuracyuom,
    airport_heliport.runway_t.widthaccuracynilreason,
    airport_heliport.runway_t.widthshoulder,
    airport_heliport.runway_t.widthshoulderuom,
    airport_heliport.runway_t.widthshouldernilreason,
    airport_heliport.runway_t.lengthstrip,
    airport_heliport.runway_t.lengthstripuom,
    airport_heliport.runway_t.lengthstripnilreason,
    airport_heliport.runway_t.widthstrip,
    airport_heliport.runway_t.widthstripuom,
    airport_heliport.runway_t.widthstripnilreason,
    airport_heliport.runway_t.lengthoffset,
    airport_heliport.runway_t.lengthoffsetuom,
    airport_heliport.runway_t.lengthoffsetnilreason,
    airport_heliport.runway_t.widthoffset,
    airport_heliport.runway_t.widthoffsetuom,
    airport_heliport.runway_t.widthoffsetnilreason
from aixm.aixm_feature
inner join airport_heliport.runway_f on aixm.aixm_feature.hjid = airport_heliport.runway_f.hjid
inner join airport_heliport.runway_tp on aixm.aixm_feature.hjid = airport_heliport.runway_tp.timeslice_hjid
inner join airport_heliport.runway_t on airport_heliport.runway_tp.runwaytimeslice_hjid = airport_heliport.runway_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runway_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runway_id on airport_heliport.runway_view (id);

--airport_heliport.runwayvisualrange_view

drop view if exists airport_heliport.runwayvisualrange_view cascade;
create view airport_heliport.runwayvisualrange_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.runwayvisualrange_t.readingposition,
    airport_heliport.runwayvisualrange_t.readingpositionnilreason
from aixm.aixm_feature
inner join airport_heliport.runwayvisualrange_f on aixm.aixm_feature.hjid = airport_heliport.runwayvisualrange_f.hjid
inner join airport_heliport.runwayvisualrange_tp on aixm.aixm_feature.hjid = airport_heliport.runwayvisualrange_tp.timeslice_hjid
inner join airport_heliport.runwayvisualrange_t on airport_heliport.runwayvisualrange_tp.runwayvisualrangetimeslice_hjid = airport_heliport.runwayvisualrange_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.runwayvisualrange_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_runwayvisualrange_id on airport_heliport.runwayvisualrange_view (id);

--procedure.safealtitudearea_view

drop view if exists procedure.safealtitudearea_view cascade;
create view procedure.safealtitudearea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.safealtitudearea_t.safeareatype,
    procedure.safealtitudearea_t.safeareatypenilreason
from aixm.aixm_feature
inner join procedure.safealtitudearea_f on aixm.aixm_feature.hjid = procedure.safealtitudearea_f.hjid
inner join procedure.safealtitudearea_tp on aixm.aixm_feature.hjid = procedure.safealtitudearea_tp.timeslice_hjid
inner join procedure.safealtitudearea_t on procedure.safealtitudearea_tp.safealtitudeareatimeslice_hjid = procedure.safealtitudearea_t.hjid
inner join aixm.aixm_timeslice on procedure.safealtitudearea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_safealtitudearea_id on procedure.safealtitudearea_view (id);

--navaids_point.sdf_view

drop view if exists navaids_point.sdf_view cascade;
create view navaids_point.sdf_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.sdf_t.designator,
    navaids_point.sdf_t.designatornilreason,
    navaids_point.sdf_t.name,
    navaids_point.sdf_t.namenilreason,
    navaids_point.sdf_t.emissionclass,
    navaids_point.sdf_t.emissionclassnilreason,
    navaids_point.sdf_t.mobile,
    navaids_point.sdf_t.mobilenilreason,
    navaids_point.sdf_t.magneticvariation,
    navaids_point.sdf_t.magneticvariationnilreason,
    navaids_point.sdf_t.magneticvariationaccuracy,
    navaids_point.sdf_t.magneticvariationaccuracynilreason,
    navaids_point.sdf_t.datemagneticvariation,
    navaids_point.sdf_t.datemagneticvariationnilreason,
    navaids_point.sdf_t.flightchecked,
    navaids_point.sdf_t.flightcheckednilreason,
    navaids_point.sdf_t.magneticbearing,
    navaids_point.sdf_t.magneticbearingnilreason,
    navaids_point.sdf_t.truebearing,
    navaids_point.sdf_t.truebearingnilreason,
    navaids_point.sdf_t.frequency,
    navaids_point.sdf_t.frequencyuom,
    navaids_point.sdf_t.frequencynilreason
from aixm.aixm_feature
inner join navaids_point.sdf_f on aixm.aixm_feature.hjid = navaids_point.sdf_f.hjid
inner join navaids_point.sdf_tp on aixm.aixm_feature.hjid = navaids_point.sdf_tp.timeslice_hjid
inner join navaids_point.sdf_t on navaids_point.sdf_tp.sdftimeslice_hjid = navaids_point.sdf_t.hjid
inner join aixm.aixm_timeslice on navaids_point.sdf_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_sdf_id on navaids_point.sdf_view (id);

--airport_heliport.seaplanelandingarea_view

drop view if exists airport_heliport.seaplanelandingarea_view cascade;
create view airport_heliport.seaplanelandingarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join airport_heliport.seaplanelandingarea_f on aixm.aixm_feature.hjid = airport_heliport.seaplanelandingarea_f.hjid
inner join airport_heliport.seaplanelandingarea_tp on aixm.aixm_feature.hjid = airport_heliport.seaplanelandingarea_tp.timeslice_hjid
inner join airport_heliport.seaplanelandingarea_t on airport_heliport.seaplanelandingarea_tp.seaplanelandingareatimeslice_hjid = airport_heliport.seaplanelandingarea_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.seaplanelandingarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_seaplanelandingarea_id on airport_heliport.seaplanelandingarea_view (id);

--airport_heliport.seaplanerampsite_view

drop view if exists airport_heliport.seaplanerampsite_view cascade;
create view airport_heliport.seaplanerampsite_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end
from aixm.aixm_feature
inner join airport_heliport.seaplanerampsite_f on aixm.aixm_feature.hjid = airport_heliport.seaplanerampsite_f.hjid
inner join airport_heliport.seaplanerampsite_tp on aixm.aixm_feature.hjid = airport_heliport.seaplanerampsite_tp.timeslice_hjid
inner join airport_heliport.seaplanerampsite_t on airport_heliport.seaplanerampsite_tp.seaplanerampsitetimeslice_hjid = airport_heliport.seaplanerampsite_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.seaplanerampsite_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_seaplanerampsite_id on airport_heliport.seaplanerampsite_view (id);

--service.searchrescueservice_view

drop view if exists service.searchrescueservice_view cascade;
create view service.searchrescueservice_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    service.searchrescueservice_t.flightoperations,
    service.searchrescueservice_t.flightoperationsnilreason,
    service.searchrescueservice_t.rank,
    service.searchrescueservice_t.ranknilreason,
    service.searchrescueservice_t.complianticao,
    service.searchrescueservice_t.complianticaonilreason,
    service.searchrescueservice_t.name,
    service.searchrescueservice_t.namenilreason,
    service.searchrescueservice_t.type,
    service.searchrescueservice_t.typenilreason
from aixm.aixm_feature
inner join service.searchrescueservice_f on aixm.aixm_feature.hjid = service.searchrescueservice_f.hjid
inner join service.searchrescueservice_tp on aixm.aixm_feature.hjid = service.searchrescueservice_tp.timeslice_hjid
inner join service.searchrescueservice_t on service.searchrescueservice_tp.searchrescueservicetimeslice_hjid = service.searchrescueservice_t.hjid
inner join aixm.aixm_timeslice on service.searchrescueservice_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists service_searchrescueservice_id on service.searchrescueservice_view (id);

--surveillance.secondarysurveillanceradar_view

drop view if exists surveillance.secondarysurveillanceradar_view cascade;
create view surveillance.secondarysurveillanceradar_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    surveillance.secondarysurveillanceradar_t.name,
    surveillance.secondarysurveillanceradar_t.namenilreason,
    surveillance.secondarysurveillanceradar_t.serialnumber,
    surveillance.secondarysurveillanceradar_t.serialnumbernilreason,
    surveillance.secondarysurveillanceradar_t.dualchannel,
    surveillance.secondarysurveillanceradar_t.dualchannelnilreason,
    surveillance.secondarysurveillanceradar_t.movingtargetindicator,
    surveillance.secondarysurveillanceradar_t.movingtargetindicatornilreason,
    surveillance.secondarysurveillanceradar_t.standbypower,
    surveillance.secondarysurveillanceradar_t.standbypowernilreason,
    surveillance.secondarysurveillanceradar_t.digital,
    surveillance.secondarysurveillanceradar_t.digitalnilreason,
    surveillance.secondarysurveillanceradar_t.militaryuseonly,
    surveillance.secondarysurveillanceradar_t.militaryuseonlynilreason,
    surveillance.secondarysurveillanceradar_t.specialuseonly,
    surveillance.secondarysurveillanceradar_t.specialuseonlynilreason,
    surveillance.secondarysurveillanceradar_t.specialaircraftonly,
    surveillance.secondarysurveillanceradar_t.specialaircraftonlynilreason,
    surveillance.secondarysurveillanceradar_t.magneticvariation,
    surveillance.secondarysurveillanceradar_t.magneticvariationnilreason,
    surveillance.secondarysurveillanceradar_t.magneticvariationaccuracy,
    surveillance.secondarysurveillanceradar_t.magneticvariationaccuracynilreason,
    surveillance.secondarysurveillanceradar_t.datemagneticvariation,
    surveillance.secondarysurveillanceradar_t.datemagneticvariationnilreason,
    surveillance.secondarysurveillanceradar_t.verticalcoverageazimuth,
    surveillance.secondarysurveillanceradar_t.verticalcoverageazimuthnilreason,
    surveillance.secondarysurveillanceradar_t.antennatiltfixed,
    surveillance.secondarysurveillanceradar_t.antennatiltfixednilreason,
    surveillance.secondarysurveillanceradar_t.tiltangle,
    surveillance.secondarysurveillanceradar_t.tiltanglenilreason,
    surveillance.secondarysurveillanceradar_t.automatedradarterminalsystem,
    surveillance.secondarysurveillanceradar_t.automatedradarterminalsystemnilreason,
    surveillance.secondarysurveillanceradar_t.transponder,
    surveillance.secondarysurveillanceradar_t.transpondernilreason,
    surveillance.secondarysurveillanceradar_t.autonomous,
    surveillance.secondarysurveillanceradar_t.autonomousnilreason,
    surveillance.secondarysurveillanceradar_t.monopulse,
    surveillance.secondarysurveillanceradar_t.monopulsenilreason,
    surveillance.secondarysurveillanceradar_t.range,
    surveillance.secondarysurveillanceradar_t.rangeuom,
    surveillance.secondarysurveillanceradar_t.rangenilreason,
    surveillance.secondarysurveillanceradar_t.rangeaccuracy,
    surveillance.secondarysurveillanceradar_t.rangeaccuracyuom,
    surveillance.secondarysurveillanceradar_t.rangeaccuracynilreason,
    surveillance.secondarysurveillanceradar_t.verticalcoveragealtitude,
    surveillance.secondarysurveillanceradar_t.verticalcoveragealtitudeuom,
    surveillance.secondarysurveillanceradar_t.verticalcoveragealtitudenilreason,
    surveillance.secondarysurveillanceradar_t.verticalcoveragedistance,
    surveillance.secondarysurveillanceradar_t.verticalcoveragedistanceuom,
    surveillance.secondarysurveillanceradar_t.verticalcoveragedistancenilreason
from aixm.aixm_feature
inner join surveillance.secondarysurveillanceradar_f on aixm.aixm_feature.hjid = surveillance.secondarysurveillanceradar_f.hjid
inner join surveillance.secondarysurveillanceradar_tp on aixm.aixm_feature.hjid = surveillance.secondarysurveillanceradar_tp.timeslice_hjid
inner join surveillance.secondarysurveillanceradar_t on surveillance.secondarysurveillanceradar_tp.secondarysurveillanceradartimeslice_hjid = surveillance.secondarysurveillanceradar_t.hjid
inner join aixm.aixm_timeslice on surveillance.secondarysurveillanceradar_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists surveillance_secondarysurveillanceradar_id on surveillance.secondarysurveillanceradar_view (id);

--navaids_point.significantpointinairspace_view

drop view if exists navaids_point.significantpointinairspace_view cascade;
create view navaids_point.significantpointinairspace_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.significantpointinairspace_t.type,
    navaids_point.significantpointinairspace_t.typenilreason,
    navaids_point.significantpointinairspace_t.relativelocation,
    navaids_point.significantpointinairspace_t.relativelocationnilreason
from aixm.aixm_feature
inner join navaids_point.significantpointinairspace_f on aixm.aixm_feature.hjid = navaids_point.significantpointinairspace_f.hjid
inner join navaids_point.significantpointinairspace_tp on aixm.aixm_feature.hjid = navaids_point.significantpointinairspace_tp.timeslice_hjid
inner join navaids_point.significantpointinairspace_t on navaids_point.significantpointinairspace_tp.significantpointinairspacetimeslice_hjid = navaids_point.significantpointinairspace_t.hjid
inner join aixm.aixm_timeslice on navaids_point.significantpointinairspace_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_significantpointinairspace_id on navaids_point.significantpointinairspace_view (id);

--shared.specialdate_view

drop view if exists shared.specialdate_view cascade;
create view shared.specialdate_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    shared.specialdate_t.type,
    shared.specialdate_t.typenilreason,
    shared.specialdate_t.dateday,
    shared.specialdate_t.datedaynilreason,
    shared.specialdate_t.dateyear,
    shared.specialdate_t.dateyearnilreason,
    shared.specialdate_t.name,
    shared.specialdate_t.namenilreason
from aixm.aixm_feature
inner join shared.specialdate_f on aixm.aixm_feature.hjid = shared.specialdate_f.hjid
inner join shared.specialdate_tp on aixm.aixm_feature.hjid = shared.specialdate_tp.timeslice_hjid
inner join shared.specialdate_t on shared.specialdate_tp.specialdatetimeslice_hjid = shared.specialdate_t.hjid
inner join aixm.aixm_timeslice on shared.specialdate_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists shared_specialdate_id on shared.specialdate_view (id);

--navaids_point.specialnavigationstation_view

drop view if exists navaids_point.specialnavigationstation_view cascade;
create view navaids_point.specialnavigationstation_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.specialnavigationstation_t.name,
    navaids_point.specialnavigationstation_t.namenilreason,
    navaids_point.specialnavigationstation_t.type,
    navaids_point.specialnavigationstation_t.typenilreason,
    navaids_point.specialnavigationstation_t.emission,
    navaids_point.specialnavigationstation_t.emissionnilreason,
    navaids_point.specialnavigationstation_t.frequency,
    navaids_point.specialnavigationstation_t.frequencyuom,
    navaids_point.specialnavigationstation_t.frequencynilreason
from aixm.aixm_feature
inner join navaids_point.specialnavigationstation_f on aixm.aixm_feature.hjid = navaids_point.specialnavigationstation_f.hjid
inner join navaids_point.specialnavigationstation_tp on aixm.aixm_feature.hjid = navaids_point.specialnavigationstation_tp.timeslice_hjid
inner join navaids_point.specialnavigationstation_t on navaids_point.specialnavigationstation_tp.specialnavigationstationtimeslice_hjid = navaids_point.specialnavigationstation_t.hjid
inner join aixm.aixm_timeslice on navaids_point.specialnavigationstation_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_specialnavigationstation_id on navaids_point.specialnavigationstation_view (id);

--navaids_point.specialnavigationsystem_view

drop view if exists navaids_point.specialnavigationsystem_view cascade;
create view navaids_point.specialnavigationsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.specialnavigationsystem_t.type,
    navaids_point.specialnavigationsystem_t.typenilreason,
    navaids_point.specialnavigationsystem_t.designator,
    navaids_point.specialnavigationsystem_t.designatornilreason,
    navaids_point.specialnavigationsystem_t.name,
    navaids_point.specialnavigationsystem_t.namenilreason
from aixm.aixm_feature
inner join navaids_point.specialnavigationsystem_f on aixm.aixm_feature.hjid = navaids_point.specialnavigationsystem_f.hjid
inner join navaids_point.specialnavigationsystem_tp on aixm.aixm_feature.hjid = navaids_point.specialnavigationsystem_tp.timeslice_hjid
inner join navaids_point.specialnavigationsystem_t on navaids_point.specialnavigationsystem_tp.specialnavigationsystemtimeslice_hjid = navaids_point.specialnavigationsystem_t.hjid
inner join aixm.aixm_timeslice on navaids_point.specialnavigationsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_specialnavigationsystem_id on navaids_point.specialnavigationsystem_view (id);

--procedure.standardinstrumentarrival_view

drop view if exists procedure.standardinstrumentarrival_view cascade;
create view procedure.standardinstrumentarrival_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.standardinstrumentarrival_t.communicationfailureinstruction,
    procedure.standardinstrumentarrival_t.communicationfailureinstructionnilreason,
    procedure.standardinstrumentarrival_t.instruction,
    procedure.standardinstrumentarrival_t.instructionnilreason,
    procedure.standardinstrumentarrival_t.designcriteria,
    procedure.standardinstrumentarrival_t.designcriterianilreason,
    procedure.standardinstrumentarrival_t.codingstandard,
    procedure.standardinstrumentarrival_t.codingstandardnilreason,
    procedure.standardinstrumentarrival_t.flightchecked,
    procedure.standardinstrumentarrival_t.flightcheckednilreason,
    procedure.standardinstrumentarrival_t.name,
    procedure.standardinstrumentarrival_t.namenilreason,
    procedure.standardinstrumentarrival_t.rnav,
    procedure.standardinstrumentarrival_t.rnavnilreason,
    procedure.standardinstrumentarrival_t.designator,
    procedure.standardinstrumentarrival_t.designatornilreason
from aixm.aixm_feature
inner join procedure.standardinstrumentarrival_f on aixm.aixm_feature.hjid = procedure.standardinstrumentarrival_f.hjid
inner join procedure.standardinstrumentarrival_tp on aixm.aixm_feature.hjid = procedure.standardinstrumentarrival_tp.timeslice_hjid
inner join procedure.standardinstrumentarrival_t on procedure.standardinstrumentarrival_tp.standardinstrumentarrivaltimeslice_hjid = procedure.standardinstrumentarrival_t.hjid
inner join aixm.aixm_timeslice on procedure.standardinstrumentarrival_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_standardinstrumentarrival_id on procedure.standardinstrumentarrival_view (id);

--procedure.standardinstrumentdeparture_view

drop view if exists procedure.standardinstrumentdeparture_view cascade;
create view procedure.standardinstrumentdeparture_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.standardinstrumentdeparture_t.communicationfailureinstruction,
    procedure.standardinstrumentdeparture_t.communicationfailureinstructionnilreason,
    procedure.standardinstrumentdeparture_t.instruction,
    procedure.standardinstrumentdeparture_t.instructionnilreason,
    procedure.standardinstrumentdeparture_t.designcriteria,
    procedure.standardinstrumentdeparture_t.designcriterianilreason,
    procedure.standardinstrumentdeparture_t.codingstandard,
    procedure.standardinstrumentdeparture_t.codingstandardnilreason,
    procedure.standardinstrumentdeparture_t.flightchecked,
    procedure.standardinstrumentdeparture_t.flightcheckednilreason,
    procedure.standardinstrumentdeparture_t.name,
    procedure.standardinstrumentdeparture_t.namenilreason,
    procedure.standardinstrumentdeparture_t.rnav,
    procedure.standardinstrumentdeparture_t.rnavnilreason,
    procedure.standardinstrumentdeparture_t.designator,
    procedure.standardinstrumentdeparture_t.designatornilreason,
    procedure.standardinstrumentdeparture_t.contingencyroute,
    procedure.standardinstrumentdeparture_t.contingencyroutenilreason
from aixm.aixm_feature
inner join procedure.standardinstrumentdeparture_f on aixm.aixm_feature.hjid = procedure.standardinstrumentdeparture_f.hjid
inner join procedure.standardinstrumentdeparture_tp on aixm.aixm_feature.hjid = procedure.standardinstrumentdeparture_tp.timeslice_hjid
inner join procedure.standardinstrumentdeparture_t on procedure.standardinstrumentdeparture_tp.standardinstrumentdeparturetimeslice_hjid = procedure.standardinstrumentdeparture_t.hjid
inner join aixm.aixm_timeslice on procedure.standardinstrumentdeparture_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_standardinstrumentdeparture_id on procedure.standardinstrumentdeparture_view (id);

--shared.standardlevelcolumn_view

drop view if exists shared.standardlevelcolumn_view cascade;
create view shared.standardlevelcolumn_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    shared.standardlevelcolumn_t.series,
    shared.standardlevelcolumn_t.seriesnilreason,
    shared.standardlevelcolumn_t.separation,
    shared.standardlevelcolumn_t.separationnilreason
from aixm.aixm_feature
inner join shared.standardlevelcolumn_f on aixm.aixm_feature.hjid = shared.standardlevelcolumn_f.hjid
inner join shared.standardlevelcolumn_tp on aixm.aixm_feature.hjid = shared.standardlevelcolumn_tp.timeslice_hjid
inner join shared.standardlevelcolumn_t on shared.standardlevelcolumn_tp.standardlevelcolumntimeslice_hjid = shared.standardlevelcolumn_t.hjid
inner join aixm.aixm_timeslice on shared.standardlevelcolumn_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists shared_standardlevelcolumn_id on shared.standardlevelcolumn_view (id);

--shared.standardlevelsector_view

drop view if exists shared.standardlevelsector_view cascade;
create view shared.standardlevelsector_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    shared.standardlevelsector_t.flightrule,
    shared.standardlevelsector_t.flightrulenilreason,
    shared.standardlevelsector_t.fromtrack,
    shared.standardlevelsector_t.fromtracknilreason,
    shared.standardlevelsector_t.totrack,
    shared.standardlevelsector_t.totracknilreason,
    shared.standardlevelsector_t.angletype,
    shared.standardlevelsector_t.angletypenilreason
from aixm.aixm_feature
inner join shared.standardlevelsector_f on aixm.aixm_feature.hjid = shared.standardlevelsector_f.hjid
inner join shared.standardlevelsector_tp on aixm.aixm_feature.hjid = shared.standardlevelsector_tp.timeslice_hjid
inner join shared.standardlevelsector_t on shared.standardlevelsector_tp.standardlevelsectortimeslice_hjid = shared.standardlevelsector_t.hjid
inner join aixm.aixm_timeslice on shared.standardlevelsector_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists shared_standardlevelsector_id on shared.standardlevelsector_view (id);

--shared.standardleveltable_view

drop view if exists shared.standardleveltable_view cascade;
create view shared.standardleveltable_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    shared.standardleveltable_t.name,
    shared.standardleveltable_t.namenilreason,
    shared.standardleveltable_t.standardicao,
    shared.standardleveltable_t.standardicaonilreason
from aixm.aixm_feature
inner join shared.standardleveltable_f on aixm.aixm_feature.hjid = shared.standardleveltable_f.hjid
inner join shared.standardleveltable_tp on aixm.aixm_feature.hjid = shared.standardleveltable_tp.timeslice_hjid
inner join shared.standardleveltable_t on shared.standardleveltable_tp.standardleveltabletimeslice_hjid = shared.standardleveltable_t.hjid
inner join aixm.aixm_timeslice on shared.standardleveltable_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists shared_standardleveltable_id on shared.standardleveltable_view (id);

--airport_heliport.standmarking_view

drop view if exists airport_heliport.standmarking_view cascade;
create view airport_heliport.standmarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.standmarking_t.markingicaostandard,
    airport_heliport.standmarking_t.markingicaostandardnilreason,
    airport_heliport.standmarking_t.condition,
    airport_heliport.standmarking_t.conditionnilreason
from aixm.aixm_feature
inner join airport_heliport.standmarking_f on aixm.aixm_feature.hjid = airport_heliport.standmarking_f.hjid
inner join airport_heliport.standmarking_tp on aixm.aixm_feature.hjid = airport_heliport.standmarking_tp.timeslice_hjid
inner join airport_heliport.standmarking_t on airport_heliport.standmarking_tp.standmarkingtimeslice_hjid = airport_heliport.standmarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.standmarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_standmarking_id on airport_heliport.standmarking_view (id);

--airport_heliport.surveycontrolpoint_view

drop view if exists airport_heliport.surveycontrolpoint_view cascade;
create view airport_heliport.surveycontrolpoint_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.surveycontrolpoint_t.designator,
    airport_heliport.surveycontrolpoint_t.designatornilreason
from aixm.aixm_feature
inner join airport_heliport.surveycontrolpoint_f on aixm.aixm_feature.hjid = airport_heliport.surveycontrolpoint_f.hjid
inner join airport_heliport.surveycontrolpoint_tp on aixm.aixm_feature.hjid = airport_heliport.surveycontrolpoint_tp.timeslice_hjid
inner join airport_heliport.surveycontrolpoint_t on airport_heliport.surveycontrolpoint_tp.surveycontrolpointtimeslice_hjid = airport_heliport.surveycontrolpoint_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.surveycontrolpoint_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_surveycontrolpoint_id on airport_heliport.surveycontrolpoint_view (id);

--navaids_point.tacan_view

drop view if exists navaids_point.tacan_view cascade;
create view navaids_point.tacan_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.tacan_t.designator,
    navaids_point.tacan_t.designatornilreason,
    navaids_point.tacan_t.name,
    navaids_point.tacan_t.namenilreason,
    navaids_point.tacan_t.emissionclass,
    navaids_point.tacan_t.emissionclassnilreason,
    navaids_point.tacan_t.mobile,
    navaids_point.tacan_t.mobilenilreason,
    navaids_point.tacan_t.magneticvariation,
    navaids_point.tacan_t.magneticvariationnilreason,
    navaids_point.tacan_t.magneticvariationaccuracy,
    navaids_point.tacan_t.magneticvariationaccuracynilreason,
    navaids_point.tacan_t.datemagneticvariation,
    navaids_point.tacan_t.datemagneticvariationnilreason,
    navaids_point.tacan_t.flightchecked,
    navaids_point.tacan_t.flightcheckednilreason,
    navaids_point.tacan_t.channel,
    navaids_point.tacan_t.channelnilreason,
    navaids_point.tacan_t.declination,
    navaids_point.tacan_t.declinationnilreason
from aixm.aixm_feature
inner join navaids_point.tacan_f on aixm.aixm_feature.hjid = navaids_point.tacan_f.hjid
inner join navaids_point.tacan_tp on aixm.aixm_feature.hjid = navaids_point.tacan_tp.timeslice_hjid
inner join navaids_point.tacan_t on navaids_point.tacan_tp.tacantimeslice_hjid = navaids_point.tacan_t.hjid
inner join aixm.aixm_timeslice on navaids_point.tacan_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_tacan_id on navaids_point.tacan_view (id);

--airport_heliport.taxiholdingpositionlightsystem_view

drop view if exists airport_heliport.taxiholdingpositionlightsystem_view cascade;
create view airport_heliport.taxiholdingpositionlightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiholdingpositionlightsystem_t.emergencylighting,
    airport_heliport.taxiholdingpositionlightsystem_t.emergencylightingnilreason,
    airport_heliport.taxiholdingpositionlightsystem_t.intensitylevel,
    airport_heliport.taxiholdingpositionlightsystem_t.intensitylevelnilreason,
    airport_heliport.taxiholdingpositionlightsystem_t.colour,
    airport_heliport.taxiholdingpositionlightsystem_t.colournilreason,
    airport_heliport.taxiholdingpositionlightsystem_t.type,
    airport_heliport.taxiholdingpositionlightsystem_t.typenilreason
from aixm.aixm_feature
inner join airport_heliport.taxiholdingpositionlightsystem_f on aixm.aixm_feature.hjid = airport_heliport.taxiholdingpositionlightsystem_f.hjid
inner join airport_heliport.taxiholdingpositionlightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.taxiholdingpositionlightsystem_tp.timeslice_hjid
inner join airport_heliport.taxiholdingpositionlightsystem_t on airport_heliport.taxiholdingpositionlightsystem_tp.taxiholdingpositionlightsystemtimeslice_hjid = airport_heliport.taxiholdingpositionlightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiholdingpositionlightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiholdingpositionlightsystem_id on airport_heliport.taxiholdingpositionlightsystem_view (id);

--airport_heliport.taxiholdingpositionmarking_view

drop view if exists airport_heliport.taxiholdingpositionmarking_view cascade;
create view airport_heliport.taxiholdingpositionmarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiholdingpositionmarking_t.markingicaostandard,
    airport_heliport.taxiholdingpositionmarking_t.markingicaostandardnilreason,
    airport_heliport.taxiholdingpositionmarking_t.condition,
    airport_heliport.taxiholdingpositionmarking_t.conditionnilreason
from aixm.aixm_feature
inner join airport_heliport.taxiholdingpositionmarking_f on aixm.aixm_feature.hjid = airport_heliport.taxiholdingpositionmarking_f.hjid
inner join airport_heliport.taxiholdingpositionmarking_tp on aixm.aixm_feature.hjid = airport_heliport.taxiholdingpositionmarking_tp.timeslice_hjid
inner join airport_heliport.taxiholdingpositionmarking_t on airport_heliport.taxiholdingpositionmarking_tp.taxiholdingpositionmarkingtimeslice_hjid = airport_heliport.taxiholdingpositionmarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiholdingpositionmarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiholdingpositionmarking_id on airport_heliport.taxiholdingpositionmarking_view (id);

--airport_heliport.taxiholdingposition_view

drop view if exists airport_heliport.taxiholdingposition_view cascade;
create view airport_heliport.taxiholdingposition_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiholdingposition_t.landingcategory,
    airport_heliport.taxiholdingposition_t.landingcategorynilreason,
    airport_heliport.taxiholdingposition_t.status,
    airport_heliport.taxiholdingposition_t.statusnilreason
from aixm.aixm_feature
inner join airport_heliport.taxiholdingposition_f on aixm.aixm_feature.hjid = airport_heliport.taxiholdingposition_f.hjid
inner join airport_heliport.taxiholdingposition_tp on aixm.aixm_feature.hjid = airport_heliport.taxiholdingposition_tp.timeslice_hjid
inner join airport_heliport.taxiholdingposition_t on airport_heliport.taxiholdingposition_tp.taxiholdingpositiontimeslice_hjid = airport_heliport.taxiholdingposition_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiholdingposition_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiholdingposition_id on airport_heliport.taxiholdingposition_view (id);

--airport_heliport.taxiwayelement_view

drop view if exists airport_heliport.taxiwayelement_view cascade;
create view airport_heliport.taxiwayelement_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiwayelement_t.type,
    airport_heliport.taxiwayelement_t.typenilreason,
    airport_heliport.taxiwayelement_t.gradeseparation,
    airport_heliport.taxiwayelement_t.gradeseparationnilreason,
    airport_heliport.taxiwayelement_t.length,
    airport_heliport.taxiwayelement_t.lengthuom,
    airport_heliport.taxiwayelement_t.lengthnilreason,
    airport_heliport.taxiwayelement_t.width,
    airport_heliport.taxiwayelement_t.widthuom,
    airport_heliport.taxiwayelement_t.widthnilreason
from aixm.aixm_feature
inner join airport_heliport.taxiwayelement_f on aixm.aixm_feature.hjid = airport_heliport.taxiwayelement_f.hjid
inner join airport_heliport.taxiwayelement_tp on aixm.aixm_feature.hjid = airport_heliport.taxiwayelement_tp.timeslice_hjid
inner join airport_heliport.taxiwayelement_t on airport_heliport.taxiwayelement_tp.taxiwayelementtimeslice_hjid = airport_heliport.taxiwayelement_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiwayelement_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiwayelement_id on airport_heliport.taxiwayelement_view (id);

--airport_heliport.taxiwaylightsystem_view

drop view if exists airport_heliport.taxiwaylightsystem_view cascade;
create view airport_heliport.taxiwaylightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiwaylightsystem_t.emergencylighting,
    airport_heliport.taxiwaylightsystem_t.emergencylightingnilreason,
    airport_heliport.taxiwaylightsystem_t.intensitylevel,
    airport_heliport.taxiwaylightsystem_t.intensitylevelnilreason,
    airport_heliport.taxiwaylightsystem_t.colour,
    airport_heliport.taxiwaylightsystem_t.colournilreason,
    airport_heliport.taxiwaylightsystem_t.position,
    airport_heliport.taxiwaylightsystem_t.positionnilreason
from aixm.aixm_feature
inner join airport_heliport.taxiwaylightsystem_f on aixm.aixm_feature.hjid = airport_heliport.taxiwaylightsystem_f.hjid
inner join airport_heliport.taxiwaylightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.taxiwaylightsystem_tp.timeslice_hjid
inner join airport_heliport.taxiwaylightsystem_t on airport_heliport.taxiwaylightsystem_tp.taxiwaylightsystemtimeslice_hjid = airport_heliport.taxiwaylightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiwaylightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiwaylightsystem_id on airport_heliport.taxiwaylightsystem_view (id);

--airport_heliport.taxiwaymarking_view

drop view if exists airport_heliport.taxiwaymarking_view cascade;
create view airport_heliport.taxiwaymarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiwaymarking_t.markingicaostandard,
    airport_heliport.taxiwaymarking_t.markingicaostandardnilreason,
    airport_heliport.taxiwaymarking_t.condition,
    airport_heliport.taxiwaymarking_t.conditionnilreason,
    airport_heliport.taxiwaymarking_t.markinglocation,
    airport_heliport.taxiwaymarking_t.markinglocationnilreason
from aixm.aixm_feature
inner join airport_heliport.taxiwaymarking_f on aixm.aixm_feature.hjid = airport_heliport.taxiwaymarking_f.hjid
inner join airport_heliport.taxiwaymarking_tp on aixm.aixm_feature.hjid = airport_heliport.taxiwaymarking_tp.timeslice_hjid
inner join airport_heliport.taxiwaymarking_t on airport_heliport.taxiwaymarking_tp.taxiwaymarkingtimeslice_hjid = airport_heliport.taxiwaymarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiwaymarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiwaymarking_id on airport_heliport.taxiwaymarking_view (id);

--airport_heliport.taxiway_view

drop view if exists airport_heliport.taxiway_view cascade;
create view airport_heliport.taxiway_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.taxiway_t.designator,
    airport_heliport.taxiway_t.designatornilreason,
    airport_heliport.taxiway_t.type,
    airport_heliport.taxiway_t.typenilreason,
    airport_heliport.taxiway_t.abandoned,
    airport_heliport.taxiway_t.abandonednilreason,
    airport_heliport.taxiway_t.width,
    airport_heliport.taxiway_t.widthuom,
    airport_heliport.taxiway_t.widthnilreason,
    airport_heliport.taxiway_t.widthshoulder,
    airport_heliport.taxiway_t.widthshoulderuom,
    airport_heliport.taxiway_t.widthshouldernilreason,
    airport_heliport.taxiway_t.length,
    airport_heliport.taxiway_t.lengthuom,
    airport_heliport.taxiway_t.lengthnilreason
from aixm.aixm_feature
inner join airport_heliport.taxiway_f on aixm.aixm_feature.hjid = airport_heliport.taxiway_f.hjid
inner join airport_heliport.taxiway_tp on aixm.aixm_feature.hjid = airport_heliport.taxiway_tp.timeslice_hjid
inner join airport_heliport.taxiway_t on airport_heliport.taxiway_tp.taxiwaytimeslice_hjid = airport_heliport.taxiway_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.taxiway_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_taxiway_id on airport_heliport.taxiway_view (id);

--procedure.terminalarrivalarea_view

drop view if exists procedure.terminalarrivalarea_view cascade;
create view procedure.terminalarrivalarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    procedure.terminalarrivalarea_t.arrivalareatype,
    procedure.terminalarrivalarea_t.arrivalareatypenilreason,
    procedure.terminalarrivalarea_t.outerbufferwidth,
    procedure.terminalarrivalarea_t.outerbufferwidthuom,
    procedure.terminalarrivalarea_t.outerbufferwidthnilreason,
    procedure.terminalarrivalarea_t.lateralbufferwidth,
    procedure.terminalarrivalarea_t.lateralbufferwidthuom,
    procedure.terminalarrivalarea_t.lateralbufferwidthnilreason
from aixm.aixm_feature
inner join procedure.terminalarrivalarea_f on aixm.aixm_feature.hjid = procedure.terminalarrivalarea_f.hjid
inner join procedure.terminalarrivalarea_tp on aixm.aixm_feature.hjid = procedure.terminalarrivalarea_tp.timeslice_hjid
inner join procedure.terminalarrivalarea_t on procedure.terminalarrivalarea_tp.terminalarrivalareatimeslice_hjid = procedure.terminalarrivalarea_t.hjid
inner join aixm.aixm_timeslice on procedure.terminalarrivalarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists procedure_terminalarrivalarea_id on procedure.terminalarrivalarea_view (id);

--airport_heliport.touchdownliftofflightsystem_view

drop view if exists airport_heliport.touchdownliftofflightsystem_view cascade;
create view airport_heliport.touchdownliftofflightsystem_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.touchdownliftofflightsystem_t.emergencylighting,
    airport_heliport.touchdownliftofflightsystem_t.emergencylightingnilreason,
    airport_heliport.touchdownliftofflightsystem_t.intensitylevel,
    airport_heliport.touchdownliftofflightsystem_t.intensitylevelnilreason,
    airport_heliport.touchdownliftofflightsystem_t.colour,
    airport_heliport.touchdownliftofflightsystem_t.colournilreason,
    airport_heliport.touchdownliftofflightsystem_t.position,
    airport_heliport.touchdownliftofflightsystem_t.positionnilreason
from aixm.aixm_feature
inner join airport_heliport.touchdownliftofflightsystem_f on aixm.aixm_feature.hjid = airport_heliport.touchdownliftofflightsystem_f.hjid
inner join airport_heliport.touchdownliftofflightsystem_tp on aixm.aixm_feature.hjid = airport_heliport.touchdownliftofflightsystem_tp.timeslice_hjid
inner join airport_heliport.touchdownliftofflightsystem_t on airport_heliport.touchdownliftofflightsystem_tp.touchdownliftofflightsystemtimeslice_hjid = airport_heliport.touchdownliftofflightsystem_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.touchdownliftofflightsystem_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_touchdownliftofflightsystem_id on airport_heliport.touchdownliftofflightsystem_view (id);

--airport_heliport.touchdownliftoffmarking_view

drop view if exists airport_heliport.touchdownliftoffmarking_view cascade;
create view airport_heliport.touchdownliftoffmarking_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.touchdownliftoffmarking_t.markingicaostandard,
    airport_heliport.touchdownliftoffmarking_t.markingicaostandardnilreason,
    airport_heliport.touchdownliftoffmarking_t.condition,
    airport_heliport.touchdownliftoffmarking_t.conditionnilreason,
    airport_heliport.touchdownliftoffmarking_t.markinglocation,
    airport_heliport.touchdownliftoffmarking_t.markinglocationnilreason
from aixm.aixm_feature
inner join airport_heliport.touchdownliftoffmarking_f on aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffmarking_f.hjid
inner join airport_heliport.touchdownliftoffmarking_tp on aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffmarking_tp.timeslice_hjid
inner join airport_heliport.touchdownliftoffmarking_t on airport_heliport.touchdownliftoffmarking_tp.touchdownliftoffmarkingtimeslice_hjid = airport_heliport.touchdownliftoffmarking_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.touchdownliftoffmarking_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_touchdownliftoffmarking_id on airport_heliport.touchdownliftoffmarking_view (id);

--airport_heliport.touchdownliftoffsafearea_view

drop view if exists airport_heliport.touchdownliftoffsafearea_view cascade;
create view airport_heliport.touchdownliftoffsafearea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.touchdownliftoffsafearea_t.lighting,
    airport_heliport.touchdownliftoffsafearea_t.lightingnilreason,
    airport_heliport.touchdownliftoffsafearea_t.obstaclefree,
    airport_heliport.touchdownliftoffsafearea_t.obstaclefreenilreason,
    airport_heliport.touchdownliftoffsafearea_t.width,
    airport_heliport.touchdownliftoffsafearea_t.widthuom,
    airport_heliport.touchdownliftoffsafearea_t.widthnilreason,
    airport_heliport.touchdownliftoffsafearea_t.length,
    airport_heliport.touchdownliftoffsafearea_t.lengthuom,
    airport_heliport.touchdownliftoffsafearea_t.lengthnilreason
from aixm.aixm_feature
inner join airport_heliport.touchdownliftoffsafearea_f on aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffsafearea_f.hjid
inner join airport_heliport.touchdownliftoffsafearea_tp on aixm.aixm_feature.hjid = airport_heliport.touchdownliftoffsafearea_tp.timeslice_hjid
inner join airport_heliport.touchdownliftoffsafearea_t on airport_heliport.touchdownliftoffsafearea_tp.touchdownliftoffsafeareatimeslice_hjid = airport_heliport.touchdownliftoffsafearea_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.touchdownliftoffsafearea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_touchdownliftoffsafearea_id on airport_heliport.touchdownliftoffsafearea_view (id);

--airport_heliport.touchdownliftoff_view

drop view if exists airport_heliport.touchdownliftoff_view cascade;
create view airport_heliport.touchdownliftoff_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.touchdownliftoff_t.designator,
    airport_heliport.touchdownliftoff_t.designatornilreason,
    airport_heliport.touchdownliftoff_t.slope,
    airport_heliport.touchdownliftoff_t.slopenilreason,
    airport_heliport.touchdownliftoff_t.helicopterclass,
    airport_heliport.touchdownliftoff_t.helicopterclassnilreason,
    airport_heliport.touchdownliftoff_t.abandoned,
    airport_heliport.touchdownliftoff_t.abandonednilreason,
    airport_heliport.touchdownliftoff_t.length,
    airport_heliport.touchdownliftoff_t.lengthuom,
    airport_heliport.touchdownliftoff_t.lengthnilreason,
    airport_heliport.touchdownliftoff_t.width,
    airport_heliport.touchdownliftoff_t.widthuom,
    airport_heliport.touchdownliftoff_t.widthnilreason
from aixm.aixm_feature
inner join airport_heliport.touchdownliftoff_f on aixm.aixm_feature.hjid = airport_heliport.touchdownliftoff_f.hjid
inner join airport_heliport.touchdownliftoff_tp on aixm.aixm_feature.hjid = airport_heliport.touchdownliftoff_tp.timeslice_hjid
inner join airport_heliport.touchdownliftoff_t on airport_heliport.touchdownliftoff_tp.touchdownliftofftimeslice_hjid = airport_heliport.touchdownliftoff_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.touchdownliftoff_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_touchdownliftoff_id on airport_heliport.touchdownliftoff_view (id);

--organisation.unit_view

drop view if exists organisation.unit_view cascade;
create view organisation.unit_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    organisation.unit_t.name,
    organisation.unit_t.namenilreason,
    organisation.unit_t.type,
    organisation.unit_t.typenilreason,
    organisation.unit_t.complianticao,
    organisation.unit_t.complianticaonilreason,
    organisation.unit_t.designator,
    organisation.unit_t.designatornilreason,
    organisation.unit_t.military,
    organisation.unit_t.militarynilreason
from aixm.aixm_feature
inner join organisation.unit_f on aixm.aixm_feature.hjid = organisation.unit_f.hjid
inner join organisation.unit_tp on aixm.aixm_feature.hjid = organisation.unit_tp.timeslice_hjid
inner join organisation.unit_t on organisation.unit_tp.unittimeslice_hjid = organisation.unit_t.hjid
inner join aixm.aixm_timeslice on organisation.unit_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists organisation_unit_id on organisation.unit_view (id);

--holding.unplannedholding_view

drop view if exists holding.unplannedholding_view cascade;
create view holding.unplannedholding_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    holding.unplannedholding_t.unplannedholding,
    holding.unplannedholding_t.unplannedholdingnilreason,
    holding.unplannedholding_t.altitudereference,
    holding.unplannedholding_t.altitudereferencenilreason,
    holding.unplannedholding_t.controlledairspace,
    holding.unplannedholding_t.controlledairspacenilreason,
    holding.unplannedholding_t.authorizedaltitude,
    holding.unplannedholding_t.authorizedaltitudeuom,
    holding.unplannedholding_t.authorizedaltitudenilreason
from aixm.aixm_feature
inner join holding.unplannedholding_f on aixm.aixm_feature.hjid = holding.unplannedholding_f.hjid
inner join holding.unplannedholding_tp on aixm.aixm_feature.hjid = holding.unplannedholding_tp.timeslice_hjid
inner join holding.unplannedholding_t on holding.unplannedholding_tp.unplannedholdingtimeslice_hjid = holding.unplannedholding_t.hjid
inner join aixm.aixm_timeslice on holding.unplannedholding_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists holding_unplannedholding_id on holding.unplannedholding_view (id);

--obstacle.verticalstructure_view

drop view if exists obstacle.verticalstructure_view cascade;
create view obstacle.verticalstructure_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    obstacle.verticalstructure_t.name,
    obstacle.verticalstructure_t.namenilreason,
    obstacle.verticalstructure_t.type,
    obstacle.verticalstructure_t.typenilreason,
    obstacle.verticalstructure_t.lighted,
    obstacle.verticalstructure_t.lightednilreason,
    obstacle.verticalstructure_t.markingicaostandard,
    obstacle.verticalstructure_t.markingicaostandardnilreason,
    obstacle.verticalstructure_t.group_,
    obstacle.verticalstructure_t.groupnilreason,
    obstacle.verticalstructure_t.lightingicaostandard,
    obstacle.verticalstructure_t.lightingicaostandardnilreason,
    obstacle.verticalstructure_t.synchronisedlighting,
    obstacle.verticalstructure_t.synchronisedlightingnilreason,
    obstacle.verticalstructure_t.length,
    obstacle.verticalstructure_t.lengthuom,
    obstacle.verticalstructure_t.lengthnilreason,
    obstacle.verticalstructure_t.width,
    obstacle.verticalstructure_t.widthuom,
    obstacle.verticalstructure_t.widthnilreason,
    obstacle.verticalstructure_t.radius,
    obstacle.verticalstructure_t.radiusuom,
    obstacle.verticalstructure_t.radiusnilreason
from aixm.aixm_feature
inner join obstacle.verticalstructure_f on aixm.aixm_feature.hjid = obstacle.verticalstructure_f.hjid
inner join obstacle.verticalstructure_tp on aixm.aixm_feature.hjid = obstacle.verticalstructure_tp.timeslice_hjid
inner join obstacle.verticalstructure_t on obstacle.verticalstructure_tp.verticalstructuretimeslice_hjid = obstacle.verticalstructure_t.hjid
inner join aixm.aixm_timeslice on obstacle.verticalstructure_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists obstacle_verticalstructure_id on obstacle.verticalstructure_view (id);

--airport_heliport.visualglideslopeindicator_view

drop view if exists airport_heliport.visualglideslopeindicator_view cascade;
create view airport_heliport.visualglideslopeindicator_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.visualglideslopeindicator_t.emergencylighting,
    airport_heliport.visualglideslopeindicator_t.emergencylightingnilreason,
    airport_heliport.visualglideslopeindicator_t.intensitylevel,
    airport_heliport.visualglideslopeindicator_t.intensitylevelnilreason,
    airport_heliport.visualglideslopeindicator_t.colour,
    airport_heliport.visualglideslopeindicator_t.colournilreason,
    airport_heliport.visualglideslopeindicator_t.type,
    airport_heliport.visualglideslopeindicator_t.typenilreason,
    airport_heliport.visualglideslopeindicator_t.position,
    airport_heliport.visualglideslopeindicator_t.positionnilreason,
    airport_heliport.visualglideslopeindicator_t.numberbox,
    airport_heliport.visualglideslopeindicator_t.numberboxnilreason,
    airport_heliport.visualglideslopeindicator_t.portable,
    airport_heliport.visualglideslopeindicator_t.portablenilreason,
    airport_heliport.visualglideslopeindicator_t.slopeangle,
    airport_heliport.visualglideslopeindicator_t.slopeanglenilreason,
    airport_heliport.visualglideslopeindicator_t.minimumeyeheightoverthreshold,
    airport_heliport.visualglideslopeindicator_t.minimumeyeheightoverthresholduom,
    airport_heliport.visualglideslopeindicator_t.minimumeyeheightoverthresholdnilreason
from aixm.aixm_feature
inner join airport_heliport.visualglideslopeindicator_f on aixm.aixm_feature.hjid = airport_heliport.visualglideslopeindicator_f.hjid
inner join airport_heliport.visualglideslopeindicator_tp on aixm.aixm_feature.hjid = airport_heliport.visualglideslopeindicator_tp.timeslice_hjid
inner join airport_heliport.visualglideslopeindicator_t on airport_heliport.visualglideslopeindicator_tp.visualglideslopeindicatortimeslice_hjid = airport_heliport.visualglideslopeindicator_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.visualglideslopeindicator_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_visualglideslopeindicator_id on airport_heliport.visualglideslopeindicator_view (id);

--navaids_point.vor_view

drop view if exists navaids_point.vor_view cascade;
create view navaids_point.vor_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    navaids_point.vor_t.designator,
    navaids_point.vor_t.designatornilreason,
    navaids_point.vor_t.name,
    navaids_point.vor_t.namenilreason,
    navaids_point.vor_t.emissionclass,
    navaids_point.vor_t.emissionclassnilreason,
    navaids_point.vor_t.mobile,
    navaids_point.vor_t.mobilenilreason,
    navaids_point.vor_t.magneticvariation,
    navaids_point.vor_t.magneticvariationnilreason,
    navaids_point.vor_t.magneticvariationaccuracy,
    navaids_point.vor_t.magneticvariationaccuracynilreason,
    navaids_point.vor_t.datemagneticvariation,
    navaids_point.vor_t.datemagneticvariationnilreason,
    navaids_point.vor_t.flightchecked,
    navaids_point.vor_t.flightcheckednilreason,
    navaids_point.vor_t.type,
    navaids_point.vor_t.typenilreason,
    navaids_point.vor_t.zerobearingdirection,
    navaids_point.vor_t.zerobearingdirectionnilreason,
    navaids_point.vor_t.declination,
    navaids_point.vor_t.declinationnilreason,
    navaids_point.vor_t.frequency,
    navaids_point.vor_t.frequencyuom,
    navaids_point.vor_t.frequencynilreason
from aixm.aixm_feature
inner join navaids_point.vor_f on aixm.aixm_feature.hjid = navaids_point.vor_f.hjid
inner join navaids_point.vor_tp on aixm.aixm_feature.hjid = navaids_point.vor_tp.timeslice_hjid
inner join navaids_point.vor_t on navaids_point.vor_tp.vortimeslice_hjid = navaids_point.vor_t.hjid
inner join aixm.aixm_timeslice on navaids_point.vor_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists navaids_point_vor_id on navaids_point.vor_view (id);

--airport_heliport.workarea_view

drop view if exists airport_heliport.workarea_view cascade;
create view airport_heliport.workarea_view as
select distinct on (aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number)
    (row_number() over ())::integer as row,
    aixm.aixm_message.hjid as message_id,
    aixm.aixm_message.id as message_tid,
    aixm.aixm_message.identifier as message_tidentifier,
    aixm.aixm_feature.hjid,
    aixm.aixm_feature.id as feature_tid,
    aixm.aixm_feature.identifier,
    aixm.aixm_timeslice.id as timeslice_id,
    aixm.aixm_timeslice.hjid as timeslice_tid,
    aixm.aixm_timeslice.interpretation,
    aixm.aixm_timeslice.sequence_number,
    aixm.aixm_timeslice.correction_number,
    aixm.aixm_timeslice.feature_lifetime_begin,
    aixm.aixm_timeslice.feature_lifetime_end,
    aixm.aixm_timeslice.valid_time_begin,
    aixm.aixm_timeslice.valid_time_end,
    airport_heliport.workarea_t.type,
    airport_heliport.workarea_t.typenilreason,
    airport_heliport.workarea_t.plannedoperational,
    airport_heliport.workarea_t.plannedoperationalnilreason
from aixm.aixm_feature
inner join airport_heliport.workarea_f on aixm.aixm_feature.hjid = airport_heliport.workarea_f.hjid
inner join airport_heliport.workarea_tp on aixm.aixm_feature.hjid = airport_heliport.workarea_tp.timeslice_hjid
inner join airport_heliport.workarea_t on airport_heliport.workarea_tp.workareatimeslice_hjid = airport_heliport.workarea_t.hjid
inner join aixm.aixm_timeslice on airport_heliport.workarea_t.hjid = aixm.aixm_timeslice.hjid
inner join aixm.message_member on aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
inner join aixm.message_member_link on aixm.message_member.hjid = aixm.message_member_link.member_hjid
inner join aixm.aixm_message on aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
where aixm.aixm_feature.lifecycle_status = 'APPROVED'
  and aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
order by aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number desc, aixm.aixm_timeslice.correction_number desc;
create index if not exists airport_heliport_workarea_id on airport_heliport.workarea_view (id);

--object

--public.abstractdirectflight_view

drop view if exists public.abstractdirectflight_view cascade;
create view public.abstractdirectflight_view as
select
    public.abstractdirectflight_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from public.abstractdirectflight_p 
inner join aixm.aixm_property on public.abstractdirectflight_p.hjid = aixm.aixm_property.hjid
inner join public.abstractdirectflight_o on public.abstractdirectflight_p.abstractdirectflight_hjid = public.abstractdirectflight_o.hjid
inner join aixm.aixm_object on public.abstractdirectflight_o.hjid = aixm.aixm_object.hjid
;
create index if not exists public_abstractdirectflight_id on public.abstractdirectflight_view (id);

--public.abstractpropertieswithschedule_view

drop view if exists public.abstractpropertieswithschedule_view cascade;
create view public.abstractpropertieswithschedule_view as
select
    public.abstractpropertieswithschedule_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from public.abstractpropertieswithschedule_p 
inner join aixm.aixm_property on public.abstractpropertieswithschedule_p.hjid = aixm.aixm_property.hjid
inner join public.abstractpropertieswithschedule_o on public.abstractpropertieswithschedule_p.abstractpropertieswithschedule_hjid = public.abstractpropertieswithschedule_o.hjid
inner join aixm.aixm_object on public.abstractpropertieswithschedule_o.hjid = aixm.aixm_object.hjid
;
create index if not exists public_abstractpropertieswithschedule_id on public.abstractpropertieswithschedule_view (id);

--public.abstractsegmentpoint_view

drop view if exists public.abstractsegmentpoint_view cascade;
create view public.abstractsegmentpoint_view as
select
    public.abstractsegmentpoint_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from public.abstractsegmentpoint_p 
inner join aixm.aixm_property on public.abstractsegmentpoint_p.hjid = aixm.aixm_property.hjid
inner join public.abstractsegmentpoint_o on public.abstractsegmentpoint_p.abstractsegmentpoint_hjid = public.abstractsegmentpoint_o.hjid
inner join aixm.aixm_object on public.abstractsegmentpoint_o.hjid = aixm.aixm_object.hjid
;
create index if not exists public_abstractsegmentpoint_id on public.abstractsegmentpoint_view (id);

--public.abstractsurfacecontamination_view

drop view if exists public.abstractsurfacecontamination_view cascade;
create view public.abstractsurfacecontamination_view as
select
    public.abstractsurfacecontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from public.abstractsurfacecontamination_p 
inner join aixm.aixm_property on public.abstractsurfacecontamination_p.hjid = aixm.aixm_property.hjid
inner join public.abstractsurfacecontamination_o on public.abstractsurfacecontamination_p.abstractsurfacecontamination_hjid = public.abstractsurfacecontamination_o.hjid
inner join aixm.aixm_object on public.abstractsurfacecontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists public_abstractsurfacecontamination_id on public.abstractsurfacecontamination_view (id);

--public.abstractusagecondition_view

drop view if exists public.abstractusagecondition_view cascade;
create view public.abstractusagecondition_view as
select
    public.abstractusagecondition_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from public.abstractusagecondition_p 
inner join aixm.aixm_property on public.abstractusagecondition_p.hjid = aixm.aixm_property.hjid
inner join public.abstractusagecondition_o on public.abstractusagecondition_p.abstractusagecondition_hjid = public.abstractusagecondition_o.hjid
inner join aixm.aixm_object on public.abstractusagecondition_o.hjid = aixm.aixm_object.hjid
;
create index if not exists public_abstractusagecondition_id on public.abstractusagecondition_view (id);

--aerial_refuelling.aerialrefuellinganchor_view

drop view if exists aerial_refuelling.aerialrefuellinganchor_view cascade;
create view aerial_refuelling.aerialrefuellinganchor_view as
select
    aerial_refuelling.aerialrefuellinganchor_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    aerial_refuelling.aerialrefuellinganchor_o.outboundcourse,
    aerial_refuelling.aerialrefuellinganchor_o.outboundcoursenilreason,
    aerial_refuelling.aerialrefuellinganchor_o.outboundcoursetype,
    aerial_refuelling.aerialrefuellinganchor_o.outboundcoursetypenilreason,
    aerial_refuelling.aerialrefuellinganchor_o.inboundcourse,
    aerial_refuelling.aerialrefuellinganchor_o.inboundcoursenilreason,
    aerial_refuelling.aerialrefuellinganchor_o.turndirection,
    aerial_refuelling.aerialrefuellinganchor_o.turndirectionnilreason,
    aerial_refuelling.aerialrefuellinganchor_o.refuellingbaselevelreference,
    aerial_refuelling.aerialrefuellinganchor_o.refuellingbaselevelreferencenilreason,
    aerial_refuelling.aerialrefuellinganchor_o.speedlimit,
    aerial_refuelling.aerialrefuellinganchor_o.speedlimituom,
    aerial_refuelling.aerialrefuellinganchor_o.speedlimitnilreason,
    aerial_refuelling.aerialrefuellinganchor_o.legseparation,
    aerial_refuelling.aerialrefuellinganchor_o.legseparationuom,
    aerial_refuelling.aerialrefuellinganchor_o.legseparationnilreason,
    aerial_refuelling.aerialrefuellinganchor_o.leglength,
    aerial_refuelling.aerialrefuellinganchor_o.leglengthuom,
    aerial_refuelling.aerialrefuellinganchor_o.leglengthnilreason,
    aerial_refuelling.aerialrefuellinganchor_o.refuellingbaselevel,
    aerial_refuelling.aerialrefuellinganchor_o.refuellingbaseleveluom,
    aerial_refuelling.aerialrefuellinganchor_o.refuellingbaselevelnilreason
from aerial_refuelling.aerialrefuellinganchor_p 
inner join aixm.aixm_property on aerial_refuelling.aerialrefuellinganchor_p.hjid = aixm.aixm_property.hjid
inner join aerial_refuelling.aerialrefuellinganchor_o on aerial_refuelling.aerialrefuellinganchor_p.aerialrefuellinganchor_hjid = aerial_refuelling.aerialrefuellinganchor_o.hjid
inner join aixm.aixm_object on aerial_refuelling.aerialrefuellinganchor_o.hjid = aixm.aixm_object.hjid
;
create index if not exists aerial_refuelling_aerialrefuellinganchor_id on aerial_refuelling.aerialrefuellinganchor_view (id);

--aerial_refuelling.aerialrefuellingpoint_view

drop view if exists aerial_refuelling.aerialrefuellingpoint_view cascade;
create view aerial_refuelling.aerialrefuellingpoint_view as
select
    aerial_refuelling.aerialrefuellingpoint_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    aerial_refuelling.aerialrefuellingpoint_o.reportingatc,
    aerial_refuelling.aerialrefuellingpoint_o.reportingatcnilreason,
    aerial_refuelling.aerialrefuellingpoint_o.flyover,
    aerial_refuelling.aerialrefuellingpoint_o.flyovernilreason,
    aerial_refuelling.aerialrefuellingpoint_o.waypoint,
    aerial_refuelling.aerialrefuellingpoint_o.waypointnilreason,
    aerial_refuelling.aerialrefuellingpoint_o.radarguidance,
    aerial_refuelling.aerialrefuellingpoint_o.radarguidancenilreason,
    aerial_refuelling.aerialrefuellingpoint_o.sequence,
    aerial_refuelling.aerialrefuellingpoint_o.sequencenilreason,
    aerial_refuelling.aerialrefuellingpoint_o.usagetype,
    aerial_refuelling.aerialrefuellingpoint_o.usagetypenilreason
from aerial_refuelling.aerialrefuellingpoint_p 
inner join aixm.aixm_property on aerial_refuelling.aerialrefuellingpoint_p.hjid = aixm.aixm_property.hjid
inner join aerial_refuelling.aerialrefuellingpoint_o on aerial_refuelling.aerialrefuellingpoint_p.aerialrefuellingpoint_hjid = aerial_refuelling.aerialrefuellingpoint_o.hjid
inner join aixm.aixm_object on aerial_refuelling.aerialrefuellingpoint_o.hjid = aixm.aixm_object.hjid
;
create index if not exists aerial_refuelling_aerialrefuellingpoint_id on aerial_refuelling.aerialrefuellingpoint_view (id);

--aerial_refuelling.aerialrefuellingtrack_view

drop view if exists aerial_refuelling.aerialrefuellingtrack_view cascade;
create view aerial_refuelling.aerialrefuellingtrack_view as
select
    aerial_refuelling.aerialrefuellingtrack_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from aerial_refuelling.aerialrefuellingtrack_p 
inner join aixm.aixm_property on aerial_refuelling.aerialrefuellingtrack_p.hjid = aixm.aixm_property.hjid
inner join aerial_refuelling.aerialrefuellingtrack_o on aerial_refuelling.aerialrefuellingtrack_p.aerialrefuellingtrack_hjid = aerial_refuelling.aerialrefuellingtrack_o.hjid
inner join aixm.aixm_object on aerial_refuelling.aerialrefuellingtrack_o.hjid = aixm.aixm_object.hjid
;
create index if not exists aerial_refuelling_aerialrefuellingtrack_id on aerial_refuelling.aerialrefuellingtrack_view (id);

--shared.aircraftcharacteristic_view

drop view if exists shared.aircraftcharacteristic_view cascade;
create view shared.aircraftcharacteristic_view as
select
    shared.aircraftcharacteristic_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.aircraftcharacteristic_o.type,
    shared.aircraftcharacteristic_o.typenilreason,
    shared.aircraftcharacteristic_o.engine,
    shared.aircraftcharacteristic_o.enginenilreason,
    shared.aircraftcharacteristic_o.numberengine,
    shared.aircraftcharacteristic_o.numberenginenilreason,
    shared.aircraftcharacteristic_o.typeaircrafticao,
    shared.aircraftcharacteristic_o.typeaircrafticaonilreason,
    shared.aircraftcharacteristic_o.aircraftlandingcategory,
    shared.aircraftcharacteristic_o.aircraftlandingcategorynilreason,
    shared.aircraftcharacteristic_o.wingspaninterpretation,
    shared.aircraftcharacteristic_o.wingspaninterpretationnilreason,
    shared.aircraftcharacteristic_o.classwingspan,
    shared.aircraftcharacteristic_o.classwingspannilreason,
    shared.aircraftcharacteristic_o.weightinterpretation,
    shared.aircraftcharacteristic_o.weightinterpretationnilreason,
    shared.aircraftcharacteristic_o.passengers,
    shared.aircraftcharacteristic_o.passengersnilreason,
    shared.aircraftcharacteristic_o.passengersinterpretation,
    shared.aircraftcharacteristic_o.passengersinterpretationnilreason,
    shared.aircraftcharacteristic_o.speedinterpretation,
    shared.aircraftcharacteristic_o.speedinterpretationnilreason,
    shared.aircraftcharacteristic_o.waketurbulence,
    shared.aircraftcharacteristic_o.waketurbulencenilreason,
    shared.aircraftcharacteristic_o.navigationequipment,
    shared.aircraftcharacteristic_o.navigationequipmentnilreason,
    shared.aircraftcharacteristic_o.navigationspecification,
    shared.aircraftcharacteristic_o.navigationspecificationnilreason,
    shared.aircraftcharacteristic_o.verticalseparationcapability,
    shared.aircraftcharacteristic_o.verticalseparationcapabilitynilreason,
    shared.aircraftcharacteristic_o.anticollisionandseparationequipment,
    shared.aircraftcharacteristic_o.anticollisionandseparationequipmentnilreason,
    shared.aircraftcharacteristic_o.communicationequipment,
    shared.aircraftcharacteristic_o.communicationequipmentnilreason,
    shared.aircraftcharacteristic_o.surveillanceequipment,
    shared.aircraftcharacteristic_o.surveillanceequipmentnilreason,
    shared.aircraftcharacteristic_o.wingspan,
    shared.aircraftcharacteristic_o.wingspanuom,
    shared.aircraftcharacteristic_o.wingspannilreason,
    shared.aircraftcharacteristic_o.weight,
    shared.aircraftcharacteristic_o.weightuom,
    shared.aircraftcharacteristic_o.weightnilreason,
    shared.aircraftcharacteristic_o.speed,
    shared.aircraftcharacteristic_o.speeduom,
    shared.aircraftcharacteristic_o.speednilreason
from shared.aircraftcharacteristic_p 
inner join aixm.aixm_property on shared.aircraftcharacteristic_p.hjid = aixm.aixm_property.hjid
inner join shared.aircraftcharacteristic_o on shared.aircraftcharacteristic_p.aircraftcharacteristic_hjid = shared.aircraftcharacteristic_o.hjid
inner join aixm.aixm_object on shared.aircraftcharacteristic_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_aircraftcharacteristic_id on shared.aircraftcharacteristic_view (id);

--airport_heliport.aircraftstandcontamination_view

drop view if exists airport_heliport.aircraftstandcontamination_view cascade;
create view airport_heliport.aircraftstandcontamination_view as
select
    airport_heliport.aircraftstandcontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.aircraftstandcontamination_o.observationtime,
    airport_heliport.aircraftstandcontamination_o.observationtimenilreason,
    airport_heliport.aircraftstandcontamination_o.frictioncoefficient,
    airport_heliport.aircraftstandcontamination_o.frictioncoefficientnilreason,
    airport_heliport.aircraftstandcontamination_o.frictionestimation,
    airport_heliport.aircraftstandcontamination_o.frictionestimationnilreason,
    airport_heliport.aircraftstandcontamination_o.frictiondevice,
    airport_heliport.aircraftstandcontamination_o.frictiondevicenilreason,
    airport_heliport.aircraftstandcontamination_o.obscuredlights,
    airport_heliport.aircraftstandcontamination_o.obscuredlightsnilreason,
    airport_heliport.aircraftstandcontamination_o.furtherclearancetime,
    airport_heliport.aircraftstandcontamination_o.furtherclearancetimenilreason,
    airport_heliport.aircraftstandcontamination_o.furthertotalclearance,
    airport_heliport.aircraftstandcontamination_o.furthertotalclearancenilreason,
    airport_heliport.aircraftstandcontamination_o.nextobservationtime,
    airport_heliport.aircraftstandcontamination_o.nextobservationtimenilreason,
    airport_heliport.aircraftstandcontamination_o.proportion,
    airport_heliport.aircraftstandcontamination_o.proportionnilreason,
    airport_heliport.aircraftstandcontamination_o.depth,
    airport_heliport.aircraftstandcontamination_o.depthuom,
    airport_heliport.aircraftstandcontamination_o.depthnilreason
from airport_heliport.aircraftstandcontamination_p 
inner join aixm.aixm_property on airport_heliport.aircraftstandcontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.aircraftstandcontamination_o on airport_heliport.aircraftstandcontamination_p.aircraftstandcontamination_hjid = airport_heliport.aircraftstandcontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.aircraftstandcontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_aircraftstandcontamination_id on airport_heliport.aircraftstandcontamination_view (id);

--airport_heliport.airportheliportavailability_view

drop view if exists airport_heliport.airportheliportavailability_view cascade;
create view airport_heliport.airportheliportavailability_view as
select
    airport_heliport.airportheliportavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.airportheliportavailability_o.operationalstatus,
    airport_heliport.airportheliportavailability_o.operationalstatusnilreason,
    airport_heliport.airportheliportavailability_o.warning,
    airport_heliport.airportheliportavailability_o.warningnilreason
from airport_heliport.airportheliportavailability_p 
inner join aixm.aixm_property on airport_heliport.airportheliportavailability_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.airportheliportavailability_o on airport_heliport.airportheliportavailability_p.airportheliportavailability_hjid = airport_heliport.airportheliportavailability_o.hjid
inner join aixm.aixm_object on airport_heliport.airportheliportavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_airportheliportavailability_id on airport_heliport.airportheliportavailability_view (id);

--airport_heliport.airportheliportcontamination_view

drop view if exists airport_heliport.airportheliportcontamination_view cascade;
create view airport_heliport.airportheliportcontamination_view as
select
    airport_heliport.airportheliportcontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.airportheliportcontamination_o.observationtime,
    airport_heliport.airportheliportcontamination_o.observationtimenilreason,
    airport_heliport.airportheliportcontamination_o.frictioncoefficient,
    airport_heliport.airportheliportcontamination_o.frictioncoefficientnilreason,
    airport_heliport.airportheliportcontamination_o.frictionestimation,
    airport_heliport.airportheliportcontamination_o.frictionestimationnilreason,
    airport_heliport.airportheliportcontamination_o.frictiondevice,
    airport_heliport.airportheliportcontamination_o.frictiondevicenilreason,
    airport_heliport.airportheliportcontamination_o.obscuredlights,
    airport_heliport.airportheliportcontamination_o.obscuredlightsnilreason,
    airport_heliport.airportheliportcontamination_o.furtherclearancetime,
    airport_heliport.airportheliportcontamination_o.furtherclearancetimenilreason,
    airport_heliport.airportheliportcontamination_o.furthertotalclearance,
    airport_heliport.airportheliportcontamination_o.furthertotalclearancenilreason,
    airport_heliport.airportheliportcontamination_o.nextobservationtime,
    airport_heliport.airportheliportcontamination_o.nextobservationtimenilreason,
    airport_heliport.airportheliportcontamination_o.proportion,
    airport_heliport.airportheliportcontamination_o.proportionnilreason,
    airport_heliport.airportheliportcontamination_o.depth,
    airport_heliport.airportheliportcontamination_o.depthuom,
    airport_heliport.airportheliportcontamination_o.depthnilreason
from airport_heliport.airportheliportcontamination_p 
inner join aixm.aixm_property on airport_heliport.airportheliportcontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.airportheliportcontamination_o on airport_heliport.airportheliportcontamination_p.airportheliportcontamination_hjid = airport_heliport.airportheliportcontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.airportheliportcontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_airportheliportcontamination_id on airport_heliport.airportheliportcontamination_view (id);

--airport_heliport.airportheliportresponsibilityorganisation_view

drop view if exists airport_heliport.airportheliportresponsibilityorganisation_view cascade;
create view airport_heliport.airportheliportresponsibilityorganisation_view as
select
    airport_heliport.airportheliportresponsibilityorganisation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.airportheliportresponsibilityorganisation_o.role,
    airport_heliport.airportheliportresponsibilityorganisation_o.rolenilreason
from airport_heliport.airportheliportresponsibilityorganisation_p 
inner join aixm.aixm_property on airport_heliport.airportheliportresponsibilityorganisation_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.airportheliportresponsibilityorganisation_o on airport_heliport.airportheliportresponsibilityorganisation_p.airportheliportresponsibilityorganisation_hjid = airport_heliport.airportheliportresponsibilityorganisation_o.hjid
inner join aixm.aixm_object on airport_heliport.airportheliportresponsibilityorganisation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_airportheliportresponsibilityorganisation_id on airport_heliport.airportheliportresponsibilityorganisation_view (id);

--airport_heliport.airportheliportusage_view

drop view if exists airport_heliport.airportheliportusage_view cascade;
create view airport_heliport.airportheliportusage_view as
select
    airport_heliport.airportheliportusage_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.airportheliportusage_o.type,
    airport_heliport.airportheliportusage_o.typenilreason,
    airport_heliport.airportheliportusage_o.operation,
    airport_heliport.airportheliportusage_o.operationnilreason,
    airport_heliport.airportheliportusage_o.priorpermission,
    airport_heliport.airportheliportusage_o.priorpermissionuom,
    airport_heliport.airportheliportusage_o.priorpermissionnilreason
from airport_heliport.airportheliportusage_p 
inner join aixm.aixm_property on airport_heliport.airportheliportusage_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.airportheliportusage_o on airport_heliport.airportheliportusage_p.airportheliportusage_hjid = airport_heliport.airportheliportusage_o.hjid
inner join aixm.aixm_object on airport_heliport.airportheliportusage_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_airportheliportusage_id on airport_heliport.airportheliportusage_view (id);

--airspace.airspaceactivation_view

drop view if exists airspace.airspaceactivation_view cascade;
create view airspace.airspaceactivation_view as
select
    airspace.airspaceactivation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airspace.airspaceactivation_o.activity,
    airspace.airspaceactivation_o.activitynilreason,
    airspace.airspaceactivation_o.status,
    airspace.airspaceactivation_o.statusnilreason
from airspace.airspaceactivation_p 
inner join aixm.aixm_property on airspace.airspaceactivation_p.hjid = aixm.aixm_property.hjid
inner join airspace.airspaceactivation_o on airspace.airspaceactivation_p.airspaceactivation_hjid = airspace.airspaceactivation_o.hjid
inner join aixm.aixm_object on airspace.airspaceactivation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airspace_airspaceactivation_id on airspace.airspaceactivation_view (id);

--airspace.airspacegeometrycomponent_view

drop view if exists airspace.airspacegeometrycomponent_view cascade;
create view airspace.airspacegeometrycomponent_view as
select
    airspace.airspacegeometrycomponent_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airspace.airspacegeometrycomponent_o.operation,
    airspace.airspacegeometrycomponent_o.operationnilreason,
    airspace.airspacegeometrycomponent_o.operationsequence,
    airspace.airspacegeometrycomponent_o.operationsequencenilreason
from airspace.airspacegeometrycomponent_p 
inner join aixm.aixm_property on airspace.airspacegeometrycomponent_p.hjid = aixm.aixm_property.hjid
inner join airspace.airspacegeometrycomponent_o on airspace.airspacegeometrycomponent_p.airspacegeometrycomponent_hjid = airspace.airspacegeometrycomponent_o.hjid
inner join aixm.aixm_object on airspace.airspacegeometrycomponent_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airspace_airspacegeometrycomponent_id on airspace.airspacegeometrycomponent_view (id);

--airspace.airspacelayerclass_view

drop view if exists airspace.airspacelayerclass_view cascade;
create view airspace.airspacelayerclass_view as
select
    airspace.airspacelayerclass_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airspace.airspacelayerclass_o.classification,
    airspace.airspacelayerclass_o.classificationnilreason
from airspace.airspacelayerclass_p 
inner join aixm.aixm_property on airspace.airspacelayerclass_p.hjid = aixm.aixm_property.hjid
inner join airspace.airspacelayerclass_o on airspace.airspacelayerclass_p.airspacelayerclass_hjid = airspace.airspacelayerclass_o.hjid
inner join aixm.aixm_object on airspace.airspacelayerclass_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airspace_airspacelayerclass_id on airspace.airspacelayerclass_view (id);

--shared.airspacelayer_view

drop view if exists shared.airspacelayer_view cascade;
create view shared.airspacelayer_view as
select
    shared.airspacelayer_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.airspacelayer_o.upperlimitreference,
    shared.airspacelayer_o.upperlimitreferencenilreason,
    shared.airspacelayer_o.lowerlimitreference,
    shared.airspacelayer_o.lowerlimitreferencenilreason,
    shared.airspacelayer_o.altitudeinterpretation,
    shared.airspacelayer_o.altitudeinterpretationnilreason,
    shared.airspacelayer_o.upperlimit,
    shared.airspacelayer_o.upperlimituom,
    shared.airspacelayer_o.upperlimitnilreason,
    shared.airspacelayer_o.lowerlimit,
    shared.airspacelayer_o.lowerlimituom,
    shared.airspacelayer_o.lowerlimitnilreason
from shared.airspacelayer_p 
inner join aixm.aixm_property on shared.airspacelayer_p.hjid = aixm.aixm_property.hjid
inner join shared.airspacelayer_o on shared.airspacelayer_p.airspacelayer_hjid = shared.airspacelayer_o.hjid
inner join aixm.aixm_object on shared.airspacelayer_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_airspacelayer_id on shared.airspacelayer_view (id);

--airspace.airspacevolumedependency_view

drop view if exists airspace.airspacevolumedependency_view cascade;
create view airspace.airspacevolumedependency_view as
select
    airspace.airspacevolumedependency_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airspace.airspacevolumedependency_o.dependency,
    airspace.airspacevolumedependency_o.dependencynilreason
from airspace.airspacevolumedependency_p 
inner join aixm.aixm_property on airspace.airspacevolumedependency_p.hjid = aixm.aixm_property.hjid
inner join airspace.airspacevolumedependency_o on airspace.airspacevolumedependency_p.airspacevolumedependency_hjid = airspace.airspacevolumedependency_o.hjid
inner join aixm.aixm_object on airspace.airspacevolumedependency_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airspace_airspacevolumedependency_id on airspace.airspacevolumedependency_view (id);

--airspace.airspacevolume_view

drop view if exists airspace.airspacevolume_view cascade;
create view airspace.airspacevolume_view as
select
    airspace.airspacevolume_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airspace.airspacevolume_o.upperlimitreference,
    airspace.airspacevolume_o.upperlimitreferencenilreason,
    airspace.airspacevolume_o.maximumlimitreference,
    airspace.airspacevolume_o.maximumlimitreferencenilreason,
    airspace.airspacevolume_o.lowerlimitreference,
    airspace.airspacevolume_o.lowerlimitreferencenilreason,
    airspace.airspacevolume_o.minimumlimitreference,
    airspace.airspacevolume_o.minimumlimitreferencenilreason,
    airspace.airspacevolume_o.upperlimit,
    airspace.airspacevolume_o.upperlimituom,
    airspace.airspacevolume_o.upperlimitnilreason,
    airspace.airspacevolume_o.maximumlimit,
    airspace.airspacevolume_o.maximumlimituom,
    airspace.airspacevolume_o.maximumlimitnilreason,
    airspace.airspacevolume_o.lowerlimit,
    airspace.airspacevolume_o.lowerlimituom,
    airspace.airspacevolume_o.lowerlimitnilreason,
    airspace.airspacevolume_o.minimumlimit,
    airspace.airspacevolume_o.minimumlimituom,
    airspace.airspacevolume_o.minimumlimitnilreason,
    airspace.airspacevolume_o.width,
    airspace.airspacevolume_o.widthuom,
    airspace.airspacevolume_o.widthnilreason
from airspace.airspacevolume_p 
inner join aixm.aixm_property on airspace.airspacevolume_p.hjid = aixm.aixm_property.hjid
inner join airspace.airspacevolume_o on airspace.airspacevolume_p.airspacevolume_hjid = airspace.airspacevolume_o.hjid
inner join aixm.aixm_object on airspace.airspacevolume_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airspace_airspacevolume_id on airspace.airspacevolume_view (id);

--airport_heliport.altimetersourcestatus_view

drop view if exists airport_heliport.altimetersourcestatus_view cascade;
create view airport_heliport.altimetersourcestatus_view as
select
    airport_heliport.altimetersourcestatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.altimetersourcestatus_o.operationalstatus,
    airport_heliport.altimetersourcestatus_o.operationalstatusnilreason
from airport_heliport.altimetersourcestatus_p 
inner join aixm.aixm_property on airport_heliport.altimetersourcestatus_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.altimetersourcestatus_o on airport_heliport.altimetersourcestatus_p.altimetersourcestatus_hjid = airport_heliport.altimetersourcestatus_o.hjid
inner join aixm.aixm_object on airport_heliport.altimetersourcestatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_altimetersourcestatus_id on airport_heliport.altimetersourcestatus_view (id);

--shared.altitudeadjustment_view

drop view if exists shared.altitudeadjustment_view cascade;
create view shared.altitudeadjustment_view as
select
    shared.altitudeadjustment_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.altitudeadjustment_o.altitudeadjustmenttype,
    shared.altitudeadjustment_o.altitudeadjustmenttypenilreason,
    shared.altitudeadjustment_o.primaryalternateminimum,
    shared.altitudeadjustment_o.primaryalternateminimumnilreason,
    shared.altitudeadjustment_o.localremotecode,
    shared.altitudeadjustment_o.localremotecodenilreason,
    shared.altitudeadjustment_o.altitudeadjustment,
    shared.altitudeadjustment_o.altitudeadjustmentuom,
    shared.altitudeadjustment_o.altitudeadjustmentnilreason
from shared.altitudeadjustment_p 
inner join aixm.aixm_property on shared.altitudeadjustment_p.hjid = aixm.aixm_property.hjid
inner join shared.altitudeadjustment_o on shared.altitudeadjustment_p.altitudeadjustment_hjid = shared.altitudeadjustment_o.hjid
inner join aixm.aixm_object on shared.altitudeadjustment_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_altitudeadjustment_id on shared.altitudeadjustment_view (id);

--navaids_point.angleuse_view

drop view if exists navaids_point.angleuse_view cascade;
create view navaids_point.angleuse_view as
select
    navaids_point.angleuse_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.angleuse_o.alongcourseguidance,
    navaids_point.angleuse_o.alongcourseguidancenilreason
from navaids_point.angleuse_p 
inner join aixm.aixm_property on navaids_point.angleuse_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.angleuse_o on navaids_point.angleuse_p.angleuse_hjid = navaids_point.angleuse_o.hjid
inner join aixm.aixm_object on navaids_point.angleuse_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_angleuse_id on navaids_point.angleuse_view (id);

--procedure.approachaltitudetable_view

drop view if exists procedure.approachaltitudetable_view cascade;
create view procedure.approachaltitudetable_view as
select
    procedure.approachaltitudetable_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.approachaltitudetable_o.measurementpoint,
    procedure.approachaltitudetable_o.measurementpointnilreason,
    procedure.approachaltitudetable_o.altitudereference,
    procedure.approachaltitudetable_o.altitudereferencenilreason,
    procedure.approachaltitudetable_o.altitude,
    procedure.approachaltitudetable_o.altitudeuom,
    procedure.approachaltitudetable_o.altitudenilreason
from procedure.approachaltitudetable_p 
inner join aixm.aixm_property on procedure.approachaltitudetable_p.hjid = aixm.aixm_property.hjid
inner join procedure.approachaltitudetable_o on procedure.approachaltitudetable_p.approachaltitudetable_hjid = procedure.approachaltitudetable_o.hjid
inner join aixm.aixm_object on procedure.approachaltitudetable_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_approachaltitudetable_id on procedure.approachaltitudetable_view (id);

--procedure.approachcondition_view

drop view if exists procedure.approachcondition_view cascade;
create view procedure.approachcondition_view as
select
    procedure.approachcondition_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.approachcondition_o.finalapproachpath,
    procedure.approachcondition_o.finalapproachpathnilreason,
    procedure.approachcondition_o.requirednavigationperformance,
    procedure.approachcondition_o.requirednavigationperformancenilreason,
    procedure.approachcondition_o.climbgradient,
    procedure.approachcondition_o.climbgradientnilreason
from procedure.approachcondition_p 
inner join aixm.aixm_property on procedure.approachcondition_p.hjid = aixm.aixm_property.hjid
inner join procedure.approachcondition_o on procedure.approachcondition_p.approachcondition_hjid = procedure.approachcondition_o.hjid
inner join aixm.aixm_object on procedure.approachcondition_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_approachcondition_id on procedure.approachcondition_view (id);

--procedure.approachdistancetable_view

drop view if exists procedure.approachdistancetable_view cascade;
create view procedure.approachdistancetable_view as
select
    procedure.approachdistancetable_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.approachdistancetable_o.startingmeasurementpoint,
    procedure.approachdistancetable_o.startingmeasurementpointnilreason,
    procedure.approachdistancetable_o.endingmeasurementpoint,
    procedure.approachdistancetable_o.endingmeasurementpointnilreason,
    procedure.approachdistancetable_o.valuehat,
    procedure.approachdistancetable_o.valuehatuom,
    procedure.approachdistancetable_o.valuehatnilreason,
    procedure.approachdistancetable_o.distance,
    procedure.approachdistancetable_o.distanceuom,
    procedure.approachdistancetable_o.distancenilreason
from procedure.approachdistancetable_p 
inner join aixm.aixm_property on procedure.approachdistancetable_p.hjid = aixm.aixm_property.hjid
inner join procedure.approachdistancetable_o on procedure.approachdistancetable_p.approachdistancetable_hjid = procedure.approachdistancetable_o.hjid
inner join aixm.aixm_object on procedure.approachdistancetable_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_approachdistancetable_id on procedure.approachdistancetable_view (id);

--procedure.approachtimingtable_view

drop view if exists procedure.approachtimingtable_view cascade;
create view procedure.approachtimingtable_view as
select
    procedure.approachtimingtable_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.approachtimingtable_o.startingmeasurementpoint,
    procedure.approachtimingtable_o.startingmeasurementpointnilreason,
    procedure.approachtimingtable_o.endingmeasurementpoint,
    procedure.approachtimingtable_o.endingmeasurementpointnilreason,
    procedure.approachtimingtable_o.time,
    procedure.approachtimingtable_o.timeuom,
    procedure.approachtimingtable_o.timenilreason,
    procedure.approachtimingtable_o.speed,
    procedure.approachtimingtable_o.speeduom,
    procedure.approachtimingtable_o.speednilreason
from procedure.approachtimingtable_p 
inner join aixm.aixm_property on procedure.approachtimingtable_p.hjid = aixm.aixm_property.hjid
inner join procedure.approachtimingtable_o on procedure.approachtimingtable_p.approachtimingtable_hjid = procedure.approachtimingtable_o.hjid
inner join aixm.aixm_object on procedure.approachtimingtable_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_approachtimingtable_id on procedure.approachtimingtable_view (id);

--airport_heliport.apronareaavailability_view

drop view if exists airport_heliport.apronareaavailability_view cascade;
create view airport_heliport.apronareaavailability_view as
select
    airport_heliport.apronareaavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.apronareaavailability_o.operationalstatus,
    airport_heliport.apronareaavailability_o.operationalstatusnilreason,
    airport_heliport.apronareaavailability_o.warning,
    airport_heliport.apronareaavailability_o.warningnilreason
from airport_heliport.apronareaavailability_p 
inner join aixm.aixm_property on airport_heliport.apronareaavailability_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.apronareaavailability_o on airport_heliport.apronareaavailability_p.apronareaavailability_hjid = airport_heliport.apronareaavailability_o.hjid
inner join aixm.aixm_object on airport_heliport.apronareaavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_apronareaavailability_id on airport_heliport.apronareaavailability_view (id);

--airport_heliport.apronareausage_view

drop view if exists airport_heliport.apronareausage_view cascade;
create view airport_heliport.apronareausage_view as
select
    airport_heliport.apronareausage_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.apronareausage_o.type,
    airport_heliport.apronareausage_o.typenilreason,
    airport_heliport.apronareausage_o.priorpermission,
    airport_heliport.apronareausage_o.priorpermissionuom,
    airport_heliport.apronareausage_o.priorpermissionnilreason
from airport_heliport.apronareausage_p 
inner join aixm.aixm_property on airport_heliport.apronareausage_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.apronareausage_o on airport_heliport.apronareausage_p.apronareausage_hjid = airport_heliport.apronareausage_o.hjid
inner join aixm.aixm_object on airport_heliport.apronareausage_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_apronareausage_id on airport_heliport.apronareausage_view (id);

--airport_heliport.aproncontamination_view

drop view if exists airport_heliport.aproncontamination_view cascade;
create view airport_heliport.aproncontamination_view as
select
    airport_heliport.aproncontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.aproncontamination_o.observationtime,
    airport_heliport.aproncontamination_o.observationtimenilreason,
    airport_heliport.aproncontamination_o.frictioncoefficient,
    airport_heliport.aproncontamination_o.frictioncoefficientnilreason,
    airport_heliport.aproncontamination_o.frictionestimation,
    airport_heliport.aproncontamination_o.frictionestimationnilreason,
    airport_heliport.aproncontamination_o.frictiondevice,
    airport_heliport.aproncontamination_o.frictiondevicenilreason,
    airport_heliport.aproncontamination_o.obscuredlights,
    airport_heliport.aproncontamination_o.obscuredlightsnilreason,
    airport_heliport.aproncontamination_o.furtherclearancetime,
    airport_heliport.aproncontamination_o.furtherclearancetimenilreason,
    airport_heliport.aproncontamination_o.furthertotalclearance,
    airport_heliport.aproncontamination_o.furthertotalclearancenilreason,
    airport_heliport.aproncontamination_o.nextobservationtime,
    airport_heliport.aproncontamination_o.nextobservationtimenilreason,
    airport_heliport.aproncontamination_o.proportion,
    airport_heliport.aproncontamination_o.proportionnilreason,
    airport_heliport.aproncontamination_o.depth,
    airport_heliport.aproncontamination_o.depthuom,
    airport_heliport.aproncontamination_o.depthnilreason
from airport_heliport.aproncontamination_p 
inner join aixm.aixm_property on airport_heliport.aproncontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.aproncontamination_o on airport_heliport.aproncontamination_p.aproncontamination_hjid = airport_heliport.aproncontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.aproncontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_aproncontamination_id on airport_heliport.aproncontamination_view (id);

--aerial_refuelling.authorityforaerialrefuelling_view

drop view if exists aerial_refuelling.authorityforaerialrefuelling_view cascade;
create view aerial_refuelling.authorityforaerialrefuelling_view as
select
    aerial_refuelling.authorityforaerialrefuelling_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    aerial_refuelling.authorityforaerialrefuelling_o.type,
    aerial_refuelling.authorityforaerialrefuelling_o.typenilreason
from aerial_refuelling.authorityforaerialrefuelling_p 
inner join aixm.aixm_property on aerial_refuelling.authorityforaerialrefuelling_p.hjid = aixm.aixm_property.hjid
inner join aerial_refuelling.authorityforaerialrefuelling_o on aerial_refuelling.authorityforaerialrefuelling_p.authorityforaerialrefuelling_hjid = aerial_refuelling.authorityforaerialrefuelling_o.hjid
inner join aixm.aixm_object on aerial_refuelling.authorityforaerialrefuelling_o.hjid = aixm.aixm_object.hjid
;
create index if not exists aerial_refuelling_authorityforaerialrefuelling_id on aerial_refuelling.authorityforaerialrefuelling_view (id);

--navaids_point.authorityfornavaidequipment_view

drop view if exists navaids_point.authorityfornavaidequipment_view cascade;
create view navaids_point.authorityfornavaidequipment_view as
select
    navaids_point.authorityfornavaidequipment_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.authorityfornavaidequipment_o.type,
    navaids_point.authorityfornavaidequipment_o.typenilreason
from navaids_point.authorityfornavaidequipment_p 
inner join aixm.aixm_property on navaids_point.authorityfornavaidequipment_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.authorityfornavaidequipment_o on navaids_point.authorityfornavaidequipment_p.authorityfornavaidequipment_hjid = navaids_point.authorityfornavaidequipment_o.hjid
inner join aixm.aixm_object on navaids_point.authorityfornavaidequipment_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_authorityfornavaidequipment_id on navaids_point.authorityfornavaidequipment_view (id);

--navaids_point.authorityforspecialnavigationstation_view

drop view if exists navaids_point.authorityforspecialnavigationstation_view cascade;
create view navaids_point.authorityforspecialnavigationstation_view as
select
    navaids_point.authorityforspecialnavigationstation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.authorityforspecialnavigationstation_o.type,
    navaids_point.authorityforspecialnavigationstation_o.typenilreason
from navaids_point.authorityforspecialnavigationstation_p 
inner join aixm.aixm_property on navaids_point.authorityforspecialnavigationstation_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.authorityforspecialnavigationstation_o on navaids_point.authorityforspecialnavigationstation_p.authorityforspecialnavigationstation_hjid = navaids_point.authorityforspecialnavigationstation_o.hjid
inner join aixm.aixm_object on navaids_point.authorityforspecialnavigationstation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_authorityforspecialnavigationstation_id on navaids_point.authorityforspecialnavigationstation_view (id);

--navaids_point.authorityforspecialnavigationsystem_view

drop view if exists navaids_point.authorityforspecialnavigationsystem_view cascade;
create view navaids_point.authorityforspecialnavigationsystem_view as
select
    navaids_point.authorityforspecialnavigationsystem_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.authorityforspecialnavigationsystem_o.type,
    navaids_point.authorityforspecialnavigationsystem_o.typenilreason
from navaids_point.authorityforspecialnavigationsystem_p 
inner join aixm.aixm_property on navaids_point.authorityforspecialnavigationsystem_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.authorityforspecialnavigationsystem_o on navaids_point.authorityforspecialnavigationsystem_p.authorityforspecialnavigationsystem_hjid = navaids_point.authorityforspecialnavigationsystem_o.hjid
inner join aixm.aixm_object on navaids_point.authorityforspecialnavigationsystem_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_authorityforspecialnavigationsystem_id on navaids_point.authorityforspecialnavigationsystem_view (id);

--service.callsigndetail_view

drop view if exists service.callsigndetail_view cascade;
create view service.callsigndetail_view as
select
    service.callsigndetail_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.callsigndetail_o.callsign,
    service.callsigndetail_o.callsignnilreason,
    service.callsigndetail_o.language,
    service.callsigndetail_o.languagenilreason
from service.callsigndetail_p 
inner join aixm.aixm_property on service.callsigndetail_p.hjid = aixm.aixm_property.hjid
inner join service.callsigndetail_o on service.callsigndetail_p.callsigndetail_hjid = service.callsigndetail_o.hjid
inner join aixm.aixm_object on service.callsigndetail_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_callsigndetail_id on service.callsigndetail_view (id);

--shared.circlesector_view

drop view if exists shared.circlesector_view cascade;
create view shared.circlesector_view as
select
    shared.circlesector_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.circlesector_o.arcdirection,
    shared.circlesector_o.arcdirectionnilreason,
    shared.circlesector_o.fromangle,
    shared.circlesector_o.fromanglenilreason,
    shared.circlesector_o.toangle,
    shared.circlesector_o.toanglenilreason,
    shared.circlesector_o.angletype,
    shared.circlesector_o.angletypenilreason,
    shared.circlesector_o.angledirectionreference,
    shared.circlesector_o.angledirectionreferencenilreason,
    shared.circlesector_o.upperlimitreference,
    shared.circlesector_o.upperlimitreferencenilreason,
    shared.circlesector_o.lowerlimitreference,
    shared.circlesector_o.lowerlimitreferencenilreason,
    shared.circlesector_o.innerdistance,
    shared.circlesector_o.innerdistanceuom,
    shared.circlesector_o.innerdistancenilreason,
    shared.circlesector_o.outerdistance,
    shared.circlesector_o.outerdistanceuom,
    shared.circlesector_o.outerdistancenilreason,
    shared.circlesector_o.upperlimit,
    shared.circlesector_o.upperlimituom,
    shared.circlesector_o.upperlimitnilreason,
    shared.circlesector_o.lowerlimit,
    shared.circlesector_o.lowerlimituom,
    shared.circlesector_o.lowerlimitnilreason
from shared.circlesector_p 
inner join aixm.aixm_property on shared.circlesector_p.hjid = aixm.aixm_property.hjid
inner join shared.circlesector_o on shared.circlesector_p.circlesector_hjid = shared.circlesector_o.hjid
inner join aixm.aixm_object on shared.circlesector_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_circlesector_id on shared.circlesector_view (id);

--procedure.circlingrestriction_view

drop view if exists procedure.circlingrestriction_view cascade;
create view procedure.circlingrestriction_view as
select
    procedure.circlingrestriction_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from procedure.circlingrestriction_p 
inner join aixm.aixm_property on procedure.circlingrestriction_p.hjid = aixm.aixm_property.hjid
inner join procedure.circlingrestriction_o on procedure.circlingrestriction_p.circlingrestriction_hjid = procedure.circlingrestriction_o.hjid
inner join aixm.aixm_object on procedure.circlingrestriction_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_circlingrestriction_id on procedure.circlingrestriction_view (id);

--airport_heliport.city_view

drop view if exists airport_heliport.city_view cascade;
create view airport_heliport.city_view as
select
    airport_heliport.city_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.city_o.name,
    airport_heliport.city_o.namenilreason
from airport_heliport.city_p 
inner join aixm.aixm_property on airport_heliport.city_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.city_o on airport_heliport.city_p.city_hjid = airport_heliport.city_o.hjid
inner join aixm.aixm_object on airport_heliport.city_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_city_id on airport_heliport.city_view (id);

--airport_heliport.conditioncombination_view

drop view if exists airport_heliport.conditioncombination_view cascade;
create view airport_heliport.conditioncombination_view as
select
    airport_heliport.conditioncombination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.conditioncombination_o.logicaloperator,
    airport_heliport.conditioncombination_o.logicaloperatornilreason
from airport_heliport.conditioncombination_p 
inner join aixm.aixm_property on airport_heliport.conditioncombination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.conditioncombination_o on airport_heliport.conditioncombination_p.conditioncombination_hjid = airport_heliport.conditioncombination_o.hjid
inner join aixm.aixm_object on airport_heliport.conditioncombination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_conditioncombination_id on airport_heliport.conditioncombination_view (id);

--shared.contactinformation_view

drop view if exists shared.contactinformation_view cascade;
create view shared.contactinformation_view as
select
    shared.contactinformation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.contactinformation_o.name,
    shared.contactinformation_o.namenilreason,
    shared.contactinformation_o.title,
    shared.contactinformation_o.titlenilreason
from shared.contactinformation_p 
inner join aixm.aixm_property on shared.contactinformation_p.hjid = aixm.aixm_property.hjid
inner join shared.contactinformation_o on shared.contactinformation_p.contactinformation_hjid = shared.contactinformation_o.hjid
inner join aixm.aixm_object on shared.contactinformation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_contactinformation_id on shared.contactinformation_view (id);

--procedure.departurearrivalcondition_view

drop view if exists procedure.departurearrivalcondition_view cascade;
create view procedure.departurearrivalcondition_view as
select
    procedure.departurearrivalcondition_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.departurearrivalcondition_o.minimumcrossingatendreference,
    procedure.departurearrivalcondition_o.minimumcrossingatendreferencenilreason,
    procedure.departurearrivalcondition_o.maximumcrossingatendreference,
    procedure.departurearrivalcondition_o.maximumcrossingatendreferencenilreason,
    procedure.departurearrivalcondition_o.minimumenroutealtitude,
    procedure.departurearrivalcondition_o.minimumenroutealtitudeuom,
    procedure.departurearrivalcondition_o.minimumenroutealtitudenilreason,
    procedure.departurearrivalcondition_o.minimumcrossingatend,
    procedure.departurearrivalcondition_o.minimumcrossingatenduom,
    procedure.departurearrivalcondition_o.minimumcrossingatendnilreason,
    procedure.departurearrivalcondition_o.maximumcrossingatend,
    procedure.departurearrivalcondition_o.maximumcrossingatenduom,
    procedure.departurearrivalcondition_o.maximumcrossingatendnilreason
from procedure.departurearrivalcondition_p 
inner join aixm.aixm_property on procedure.departurearrivalcondition_p.hjid = aixm.aixm_property.hjid
inner join procedure.departurearrivalcondition_o on procedure.departurearrivalcondition_p.departurearrivalcondition_hjid = procedure.departurearrivalcondition_o.hjid
inner join aixm.aixm_object on procedure.departurearrivalcondition_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_departurearrivalcondition_id on procedure.departurearrivalcondition_view (id);

--route.directflightclass_view

drop view if exists route.directflightclass_view cascade;
create view route.directflightclass_view as
select
    route.directflightclass_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.directflightclass_o.exceedlength,
    route.directflightclass_o.exceedlengthuom,
    route.directflightclass_o.exceedlengthnilreason
from route.directflightclass_p 
inner join aixm.aixm_property on route.directflightclass_p.hjid = aixm.aixm_property.hjid
inner join route.directflightclass_o on route.directflightclass_p.directflightclass_hjid = route.directflightclass_o.hjid
inner join aixm.aixm_object on route.directflightclass_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_directflightclass_id on route.directflightclass_view (id);

--route.directflightsegment_view

drop view if exists route.directflightsegment_view cascade;
create view route.directflightsegment_view as
select
    route.directflightsegment_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from route.directflightsegment_p 
inner join aixm.aixm_property on route.directflightsegment_p.hjid = aixm.aixm_property.hjid
inner join route.directflightsegment_o on route.directflightsegment_p.directflightsegment_hjid = route.directflightsegment_o.hjid
inner join aixm.aixm_object on route.directflightsegment_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_directflightsegment_id on route.directflightsegment_view (id);

--navaids_point.enroutesegmentpoint_view

drop view if exists navaids_point.enroutesegmentpoint_view cascade;
create view navaids_point.enroutesegmentpoint_view as
select
    navaids_point.enroutesegmentpoint_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.enroutesegmentpoint_o.reportingatc,
    navaids_point.enroutesegmentpoint_o.reportingatcnilreason,
    navaids_point.enroutesegmentpoint_o.flyover,
    navaids_point.enroutesegmentpoint_o.flyovernilreason,
    navaids_point.enroutesegmentpoint_o.waypoint,
    navaids_point.enroutesegmentpoint_o.waypointnilreason,
    navaids_point.enroutesegmentpoint_o.radarguidance,
    navaids_point.enroutesegmentpoint_o.radarguidancenilreason,
    navaids_point.enroutesegmentpoint_o.rolefreeflight,
    navaids_point.enroutesegmentpoint_o.rolefreeflightnilreason,
    navaids_point.enroutesegmentpoint_o.rolervsm,
    navaids_point.enroutesegmentpoint_o.rolervsmnilreason,
    navaids_point.enroutesegmentpoint_o.rolemilitarytraining,
    navaids_point.enroutesegmentpoint_o.rolemilitarytrainingnilreason,
    navaids_point.enroutesegmentpoint_o.turnradius,
    navaids_point.enroutesegmentpoint_o.turnradiusuom,
    navaids_point.enroutesegmentpoint_o.turnradiusnilreason
from navaids_point.enroutesegmentpoint_p 
inner join aixm.aixm_property on navaids_point.enroutesegmentpoint_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.enroutesegmentpoint_o on navaids_point.enroutesegmentpoint_p.enroutesegmentpoint_hjid = navaids_point.enroutesegmentpoint_o.hjid
inner join aixm.aixm_object on navaids_point.enroutesegmentpoint_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_enroutesegmentpoint_id on navaids_point.enroutesegmentpoint_view (id);

--procedure.equipmentunavailableadjustmentcolumn_view

drop view if exists procedure.equipmentunavailableadjustmentcolumn_view cascade;
create view procedure.equipmentunavailableadjustmentcolumn_view as
select
    procedure.equipmentunavailableadjustmentcolumn_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.equipmentunavailableadjustmentcolumn_o.guidanceequipment,
    procedure.equipmentunavailableadjustmentcolumn_o.guidanceequipmentnilreason,
    procedure.equipmentunavailableadjustmentcolumn_o.landingsystemlights,
    procedure.equipmentunavailableadjustmentcolumn_o.landingsystemlightsnilreason,
    procedure.equipmentunavailableadjustmentcolumn_o.equipmentrvr,
    procedure.equipmentunavailableadjustmentcolumn_o.equipmentrvrnilreason,
    procedure.equipmentunavailableadjustmentcolumn_o.approachlightinginoperative,
    procedure.equipmentunavailableadjustmentcolumn_o.approachlightinginoperativenilreason,
    procedure.equipmentunavailableadjustmentcolumn_o.visibilityadjustment,
    procedure.equipmentunavailableadjustmentcolumn_o.visibilityadjustmentuom,
    procedure.equipmentunavailableadjustmentcolumn_o.visibilityadjustmentnilreason
from procedure.equipmentunavailableadjustmentcolumn_p 
inner join aixm.aixm_property on procedure.equipmentunavailableadjustmentcolumn_p.hjid = aixm.aixm_property.hjid
inner join procedure.equipmentunavailableadjustmentcolumn_o on procedure.equipmentunavailableadjustmentcolumn_p.equipmentunavailableadjustmentcolumn_hjid = procedure.equipmentunavailableadjustmentcolumn_o.hjid
inner join aixm.aixm_object on procedure.equipmentunavailableadjustmentcolumn_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_equipmentunavailableadjustmentcolumn_id on procedure.equipmentunavailableadjustmentcolumn_view (id);

--procedure.equipmentunavailableadjustment_view

drop view if exists procedure.equipmentunavailableadjustment_view cascade;
create view procedure.equipmentunavailableadjustment_view as
select
    procedure.equipmentunavailableadjustment_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.equipmentunavailableadjustment_o.type,
    procedure.equipmentunavailableadjustment_o.typenilreason,
    procedure.equipmentunavailableadjustment_o.approachlightinginoperative,
    procedure.equipmentunavailableadjustment_o.approachlightinginoperativenilreason
from procedure.equipmentunavailableadjustment_p 
inner join aixm.aixm_property on procedure.equipmentunavailableadjustment_p.hjid = aixm.aixm_property.hjid
inner join procedure.equipmentunavailableadjustment_o on procedure.equipmentunavailableadjustment_p.equipmentunavailableadjustment_hjid = procedure.equipmentunavailableadjustment_o.hjid
inner join aixm.aixm_object on procedure.equipmentunavailableadjustment_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_equipmentunavailableadjustment_id on procedure.equipmentunavailableadjustment_view (id);

--procedure.fasdatablock_view

drop view if exists procedure.fasdatablock_view cascade;
create view procedure.fasdatablock_view as
select
    procedure.fasdatablock_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.fasdatablock_o.horizontalalarmlimit,
    procedure.fasdatablock_o.horizontalalarmlimitnilreason,
    procedure.fasdatablock_o.verticalalarmlimit,
    procedure.fasdatablock_o.verticalalarmlimitnilreason,
    procedure.fasdatablock_o.crcremainder,
    procedure.fasdatablock_o.crcremaindernilreason,
    procedure.fasdatablock_o.operationtype,
    procedure.fasdatablock_o.operationtypenilreason,
    procedure.fasdatablock_o.serviceprovidersbas,
    procedure.fasdatablock_o.serviceprovidersbasnilreason,
    procedure.fasdatablock_o.approachperformancedesignator,
    procedure.fasdatablock_o.approachperformancedesignatornilreason,
    procedure.fasdatablock_o.referencepathdataselector,
    procedure.fasdatablock_o.referencepathdataselectornilreason,
    procedure.fasdatablock_o.thresholdcoursewidth,
    procedure.fasdatablock_o.thresholdcoursewidthuom,
    procedure.fasdatablock_o.thresholdcoursewidthnilreason,
    procedure.fasdatablock_o.lengthoffset,
    procedure.fasdatablock_o.lengthoffsetuom,
    procedure.fasdatablock_o.lengthoffsetnilreason
from procedure.fasdatablock_p 
inner join aixm.aixm_property on procedure.fasdatablock_p.hjid = aixm.aixm_property.hjid
inner join procedure.fasdatablock_o on procedure.fasdatablock_p.fasdatablock_hjid = procedure.fasdatablock_o.hjid
inner join aixm.aixm_object on procedure.fasdatablock_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_fasdatablock_id on procedure.fasdatablock_view (id);

--procedure.finalprofile_view

drop view if exists procedure.finalprofile_view cascade;
create view procedure.finalprofile_view as
select
    procedure.finalprofile_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from procedure.finalprofile_p 
inner join aixm.aixm_property on procedure.finalprofile_p.hjid = aixm.aixm_property.hjid
inner join procedure.finalprofile_o on procedure.finalprofile_p.finalprofile_hjid = procedure.finalprofile_o.hjid
inner join aixm.aixm_object on procedure.finalprofile_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_finalprofile_id on procedure.finalprofile_view (id);

--shared.flightcharacteristic_view

drop view if exists shared.flightcharacteristic_view cascade;
create view shared.flightcharacteristic_view as
select
    shared.flightcharacteristic_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.flightcharacteristic_o.type,
    shared.flightcharacteristic_o.typenilreason,
    shared.flightcharacteristic_o.rule,
    shared.flightcharacteristic_o.rulenilreason,
    shared.flightcharacteristic_o.status,
    shared.flightcharacteristic_o.statusnilreason,
    shared.flightcharacteristic_o.military,
    shared.flightcharacteristic_o.militarynilreason,
    shared.flightcharacteristic_o.origin,
    shared.flightcharacteristic_o.originnilreason,
    shared.flightcharacteristic_o.purpose,
    shared.flightcharacteristic_o.purposenilreason
from shared.flightcharacteristic_p 
inner join aixm.aixm_property on shared.flightcharacteristic_p.hjid = aixm.aixm_property.hjid
inner join shared.flightcharacteristic_o on shared.flightcharacteristic_p.flightcharacteristic_hjid = shared.flightcharacteristic_o.hjid
inner join aixm.aixm_object on shared.flightcharacteristic_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_flightcharacteristic_id on shared.flightcharacteristic_view (id);

--route.flightconditioncircumstance_view

drop view if exists route.flightconditioncircumstance_view cascade;
create view route.flightconditioncircumstance_view as
select
    route.flightconditioncircumstance_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.flightconditioncircumstance_o.referencelocation,
    route.flightconditioncircumstance_o.referencelocationnilreason,
    route.flightconditioncircumstance_o.relationwithlocation,
    route.flightconditioncircumstance_o.relationwithlocationnilreason
from route.flightconditioncircumstance_p 
inner join aixm.aixm_property on route.flightconditioncircumstance_p.hjid = aixm.aixm_property.hjid
inner join route.flightconditioncircumstance_o on route.flightconditioncircumstance_p.flightconditioncircumstance_hjid = route.flightconditioncircumstance_o.hjid
inner join aixm.aixm_object on route.flightconditioncircumstance_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_flightconditioncircumstance_id on route.flightconditioncircumstance_view (id);

--route.flightconditioncombination_view

drop view if exists route.flightconditioncombination_view cascade;
create view route.flightconditioncombination_view as
select
    route.flightconditioncombination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.flightconditioncombination_o.logicaloperator,
    route.flightconditioncombination_o.logicaloperatornilreason
from route.flightconditioncombination_p 
inner join aixm.aixm_property on route.flightconditioncombination_p.hjid = aixm.aixm_property.hjid
inner join route.flightconditioncombination_o on route.flightconditioncombination_p.flightconditioncombination_hjid = route.flightconditioncombination_o.hjid
inner join aixm.aixm_object on route.flightconditioncombination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_flightconditioncombination_id on route.flightconditioncombination_view (id);

--route.flightconditionelement_view

drop view if exists route.flightconditionelement_view cascade;
create view route.flightconditionelement_view as
select
    route.flightconditionelement_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.flightconditionelement_o.index,
    route.flightconditionelement_o.indexnilreason
from route.flightconditionelement_p 
inner join aixm.aixm_property on route.flightconditionelement_p.hjid = aixm.aixm_property.hjid
inner join route.flightconditionelement_o on route.flightconditionelement_p.flightconditionelement_hjid = route.flightconditionelement_o.hjid
inner join aixm.aixm_object on route.flightconditionelement_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_flightconditionelement_id on route.flightconditionelement_view (id);

--route.flightrestrictionlevel_view

drop view if exists route.flightrestrictionlevel_view cascade;
create view route.flightrestrictionlevel_view as
select
    route.flightrestrictionlevel_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.flightrestrictionlevel_o.upperlevelreference,
    route.flightrestrictionlevel_o.upperlevelreferencenilreason,
    route.flightrestrictionlevel_o.lowerlevelreference,
    route.flightrestrictionlevel_o.lowerlevelreferencenilreason,
    route.flightrestrictionlevel_o.upperlevel,
    route.flightrestrictionlevel_o.upperleveluom,
    route.flightrestrictionlevel_o.upperlevelnilreason,
    route.flightrestrictionlevel_o.lowerlevel,
    route.flightrestrictionlevel_o.lowerleveluom,
    route.flightrestrictionlevel_o.lowerlevelnilreason
from route.flightrestrictionlevel_p 
inner join aixm.aixm_property on route.flightrestrictionlevel_p.hjid = aixm.aixm_property.hjid
inner join route.flightrestrictionlevel_o on route.flightrestrictionlevel_p.flightrestrictionlevel_hjid = route.flightrestrictionlevel_o.hjid
inner join aixm.aixm_object on route.flightrestrictionlevel_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_flightrestrictionlevel_id on route.flightrestrictionlevel_view (id);

--route.flightrestrictionroute_view

drop view if exists route.flightrestrictionroute_view cascade;
create view route.flightrestrictionroute_view as
select
    route.flightrestrictionroute_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.flightrestrictionroute_o.priorpermission,
    route.flightrestrictionroute_o.priorpermissionnilreason
from route.flightrestrictionroute_p 
inner join aixm.aixm_property on route.flightrestrictionroute_p.hjid = aixm.aixm_property.hjid
inner join route.flightrestrictionroute_o on route.flightrestrictionroute_p.flightrestrictionroute_hjid = route.flightrestrictionroute_o.hjid
inner join aixm.aixm_object on route.flightrestrictionroute_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_flightrestrictionroute_id on route.flightrestrictionroute_view (id);

--route.flightroutingelement_view

drop view if exists route.flightroutingelement_view cascade;
create view route.flightroutingelement_view as
select
    route.flightroutingelement_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.flightroutingelement_o.ordernumber,
    route.flightroutingelement_o.ordernumbernilreason,
    route.flightroutingelement_o.speedreference,
    route.flightroutingelement_o.speedreferencenilreason,
    route.flightroutingelement_o.speedcriteria,
    route.flightroutingelement_o.speedcriterianilreason,
    route.flightroutingelement_o.speed,
    route.flightroutingelement_o.speeduom,
    route.flightroutingelement_o.speednilreason
from route.flightroutingelement_p 
inner join aixm.aixm_property on route.flightroutingelement_p.hjid = aixm.aixm_property.hjid
inner join route.flightroutingelement_o on route.flightroutingelement_p.flightroutingelement_hjid = route.flightroutingelement_o.hjid
inner join aixm.aixm_object on route.flightroutingelement_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_flightroutingelement_id on route.flightroutingelement_view (id);

--service.fuel_view

drop view if exists service.fuel_view cascade;
create view service.fuel_view as
select
    service.fuel_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.fuel_o.category,
    service.fuel_o.categorynilreason
from service.fuel_p 
inner join aixm.aixm_property on service.fuel_p.hjid = aixm.aixm_property.hjid
inner join service.fuel_o on service.fuel_p.fuel_hjid = service.fuel_o.hjid
inner join aixm.aixm_object on service.fuel_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_fuel_id on service.fuel_view (id);

--airport_heliport.groundlightingavailability_view

drop view if exists airport_heliport.groundlightingavailability_view cascade;
create view airport_heliport.groundlightingavailability_view as
select
    airport_heliport.groundlightingavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.groundlightingavailability_o.operationalstatus,
    airport_heliport.groundlightingavailability_o.operationalstatusnilreason
from airport_heliport.groundlightingavailability_p 
inner join aixm.aixm_property on airport_heliport.groundlightingavailability_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.groundlightingavailability_o on airport_heliport.groundlightingavailability_p.groundlightingavailability_hjid = airport_heliport.groundlightingavailability_o.hjid
inner join aixm.aixm_object on airport_heliport.groundlightingavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_groundlightingavailability_id on airport_heliport.groundlightingavailability_view (id);

--holding.holdingpatterndistance_view

drop view if exists holding.holdingpatterndistance_view cascade;
create view holding.holdingpatterndistance_view as
select
    holding.holdingpatterndistance_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    holding.holdingpatterndistance_o.length,
    holding.holdingpatterndistance_o.lengthuom,
    holding.holdingpatterndistance_o.lengthnilreason
from holding.holdingpatterndistance_p 
inner join aixm.aixm_property on holding.holdingpatterndistance_p.hjid = aixm.aixm_property.hjid
inner join holding.holdingpatterndistance_o on holding.holdingpatterndistance_p.holdingpatterndistance_hjid = holding.holdingpatterndistance_o.hjid
inner join aixm.aixm_object on holding.holdingpatterndistance_o.hjid = aixm.aixm_object.hjid
;
create index if not exists holding_holdingpatterndistance_id on holding.holdingpatterndistance_view (id);

--holding.holdingpatternduration_view

drop view if exists holding.holdingpatternduration_view cascade;
create view holding.holdingpatternduration_view as
select
    holding.holdingpatternduration_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    holding.holdingpatternduration_o.duration,
    holding.holdingpatternduration_o.durationuom,
    holding.holdingpatternduration_o.durationnilreason
from holding.holdingpatternduration_p 
inner join aixm.aixm_property on holding.holdingpatternduration_p.hjid = aixm.aixm_property.hjid
inner join holding.holdingpatternduration_o on holding.holdingpatternduration_p.holdingpatternduration_hjid = holding.holdingpatternduration_o.hjid
inner join aixm.aixm_object on holding.holdingpatternduration_o.hjid = aixm.aixm_object.hjid
;
create index if not exists holding_holdingpatternduration_id on holding.holdingpatternduration_view (id);

--procedure.holdinguse_view

drop view if exists procedure.holdinguse_view cascade;
create view procedure.holdinguse_view as
select
    procedure.holdinguse_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.holdinguse_o.holdinguse,
    procedure.holdinguse_o.holdingusenilreason,
    procedure.holdinguse_o.instruction,
    procedure.holdinguse_o.instructionnilreason,
    procedure.holdinguse_o.instructionaltitudereference,
    procedure.holdinguse_o.instructionaltitudereferencenilreason,
    procedure.holdinguse_o.instructedaltitude,
    procedure.holdinguse_o.instructedaltitudeuom,
    procedure.holdinguse_o.instructedaltitudenilreason
from procedure.holdinguse_p 
inner join aixm.aixm_property on procedure.holdinguse_p.hjid = aixm.aixm_property.hjid
inner join procedure.holdinguse_o on procedure.holdinguse_p.holdinguse_hjid = procedure.holdinguse_o.hjid
inner join aixm.aixm_object on procedure.holdinguse_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_holdinguse_id on procedure.holdinguse_view (id);

--procedure.landingtakeoffareacollection_view

drop view if exists procedure.landingtakeoffareacollection_view cascade;
create view procedure.landingtakeoffareacollection_view as
select
    procedure.landingtakeoffareacollection_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from procedure.landingtakeoffareacollection_p 
inner join aixm.aixm_property on procedure.landingtakeoffareacollection_p.hjid = aixm.aixm_property.hjid
inner join procedure.landingtakeoffareacollection_o on procedure.landingtakeoffareacollection_p.landingtakeoffareacollection_hjid = procedure.landingtakeoffareacollection_o.hjid
inner join aixm.aixm_object on procedure.landingtakeoffareacollection_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_landingtakeoffareacollection_id on procedure.landingtakeoffareacollection_view (id);

--airport_heliport.lightactivation_view

drop view if exists airport_heliport.lightactivation_view cascade;
create view airport_heliport.lightactivation_view as
select
    airport_heliport.lightactivation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.lightactivation_o.clicks,
    airport_heliport.lightactivation_o.clicksnilreason,
    airport_heliport.lightactivation_o.intensitylevel,
    airport_heliport.lightactivation_o.intensitylevelnilreason,
    airport_heliport.lightactivation_o.activation,
    airport_heliport.lightactivation_o.activationnilreason
from airport_heliport.lightactivation_p 
inner join aixm.aixm_property on airport_heliport.lightactivation_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.lightactivation_o on airport_heliport.lightactivation_p.lightactivation_hjid = airport_heliport.lightactivation_o.hjid
inner join aixm.aixm_object on airport_heliport.lightactivation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_lightactivation_id on airport_heliport.lightactivation_view (id);

--shared.lightelementstatus_view

drop view if exists shared.lightelementstatus_view cascade;
create view shared.lightelementstatus_view as
select
    shared.lightelementstatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.lightelementstatus_o.status,
    shared.lightelementstatus_o.statusnilreason
from shared.lightelementstatus_p 
inner join aixm.aixm_property on shared.lightelementstatus_p.hjid = aixm.aixm_property.hjid
inner join shared.lightelementstatus_o on shared.lightelementstatus_p.lightelementstatus_hjid = shared.lightelementstatus_o.hjid
inner join aixm.aixm_object on shared.lightelementstatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_lightelementstatus_id on shared.lightelementstatus_view (id);

--shared.lightelement_view

drop view if exists shared.lightelement_view cascade;
create view shared.lightelement_view as
select
    shared.lightelement_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.lightelement_o.colour,
    shared.lightelement_o.colournilreason,
    shared.lightelement_o.intensitylevel,
    shared.lightelement_o.intensitylevelnilreason,
    shared.lightelement_o.type,
    shared.lightelement_o.typenilreason,
    shared.lightelement_o.intensity,
    shared.lightelement_o.intensityuom,
    shared.lightelement_o.intensitynilreason
from shared.lightelement_p 
inner join aixm.aixm_property on shared.lightelement_p.hjid = aixm.aixm_property.hjid
inner join shared.lightelement_o on shared.lightelement_p.lightelement_hjid = shared.lightelement_o.hjid
inner join aixm.aixm_object on shared.lightelement_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_lightelement_id on shared.lightelement_view (id);

--note.linguisticnote_view

drop view if exists note.linguisticnote_view cascade;
create view note.linguisticnote_view as
select
    note.linguisticnote_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    note.linguisticnote_o.note,
    note.linguisticnote_o.notenilreason,
    note.linguisticnote_o.NOTE_ITEM_LANG
from note.linguisticnote_p 
inner join aixm.aixm_property on note.linguisticnote_p.hjid = aixm.aixm_property.hjid
inner join note.linguisticnote_o on note.linguisticnote_p.linguisticnote_hjid = note.linguisticnote_o.hjid
inner join aixm.aixm_object on note.linguisticnote_o.hjid = aixm.aixm_object.hjid
;
create index if not exists note_linguisticnote_id on note.linguisticnote_view (id);

--airport_heliport.manoeuvringareaavailability_view

drop view if exists airport_heliport.manoeuvringareaavailability_view cascade;
create view airport_heliport.manoeuvringareaavailability_view as
select
    airport_heliport.manoeuvringareaavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.manoeuvringareaavailability_o.operationalstatus,
    airport_heliport.manoeuvringareaavailability_o.operationalstatusnilreason,
    airport_heliport.manoeuvringareaavailability_o.warning,
    airport_heliport.manoeuvringareaavailability_o.warningnilreason
from airport_heliport.manoeuvringareaavailability_p 
inner join aixm.aixm_property on airport_heliport.manoeuvringareaavailability_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.manoeuvringareaavailability_o on airport_heliport.manoeuvringareaavailability_p.manoeuvringareaavailability_hjid = airport_heliport.manoeuvringareaavailability_o.hjid
inner join aixm.aixm_object on airport_heliport.manoeuvringareaavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_manoeuvringareaavailability_id on airport_heliport.manoeuvringareaavailability_view (id);

--airport_heliport.manoeuvringareausage_view

drop view if exists airport_heliport.manoeuvringareausage_view cascade;
create view airport_heliport.manoeuvringareausage_view as
select
    airport_heliport.manoeuvringareausage_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.manoeuvringareausage_o.type,
    airport_heliport.manoeuvringareausage_o.typenilreason,
    airport_heliport.manoeuvringareausage_o.operation,
    airport_heliport.manoeuvringareausage_o.operationnilreason,
    airport_heliport.manoeuvringareausage_o.priorpermission,
    airport_heliport.manoeuvringareausage_o.priorpermissionuom,
    airport_heliport.manoeuvringareausage_o.priorpermissionnilreason
from airport_heliport.manoeuvringareausage_p 
inner join aixm.aixm_property on airport_heliport.manoeuvringareausage_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.manoeuvringareausage_o on airport_heliport.manoeuvringareausage_p.manoeuvringareausage_hjid = airport_heliport.manoeuvringareausage_o.hjid
inner join aixm.aixm_object on airport_heliport.manoeuvringareausage_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_manoeuvringareausage_id on airport_heliport.manoeuvringareausage_view (id);

--airport_heliport.markingelement_view

drop view if exists airport_heliport.markingelement_view cascade;
create view airport_heliport.markingelement_view as
select
    airport_heliport.markingelement_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.markingelement_o.colour,
    airport_heliport.markingelement_o.colournilreason,
    airport_heliport.markingelement_o.style,
    airport_heliport.markingelement_o.stylenilreason
from airport_heliport.markingelement_p 
inner join aixm.aixm_property on airport_heliport.markingelement_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.markingelement_o on airport_heliport.markingelement_p.markingelement_hjid = airport_heliport.markingelement_o.hjid
inner join aixm.aixm_object on airport_heliport.markingelement_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_markingelement_id on airport_heliport.markingelement_view (id);

--shared.meteorology_view

drop view if exists shared.meteorology_view cascade;
create view shared.meteorology_view as
select
    shared.meteorology_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.meteorology_o.flightconditions,
    shared.meteorology_o.flightconditionsnilreason,
    shared.meteorology_o.visibilityinterpretation,
    shared.meteorology_o.visibilityinterpretationnilreason,
    shared.meteorology_o.runwayvisualrangeinterpretation,
    shared.meteorology_o.runwayvisualrangeinterpretationnilreason,
    shared.meteorology_o.visibility,
    shared.meteorology_o.visibilityuom,
    shared.meteorology_o.visibilitynilreason,
    shared.meteorology_o.runwayvisualrange,
    shared.meteorology_o.runwayvisualrangeuom,
    shared.meteorology_o.runwayvisualrangenilreason
from shared.meteorology_p 
inner join aixm.aixm_property on shared.meteorology_p.hjid = aixm.aixm_property.hjid
inner join shared.meteorology_o on shared.meteorology_p.meteorology_hjid = shared.meteorology_o.hjid
inner join aixm.aixm_object on shared.meteorology_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_meteorology_id on shared.meteorology_view (id);

--procedure.minima_view

drop view if exists procedure.minima_view cascade;
create view procedure.minima_view as
select
    procedure.minima_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.minima_o.altitudecode,
    procedure.minima_o.altitudecodenilreason,
    procedure.minima_o.altitudereference,
    procedure.minima_o.altitudereferencenilreason,
    procedure.minima_o.heightcode,
    procedure.minima_o.heightcodenilreason,
    procedure.minima_o.heightreference,
    procedure.minima_o.heightreferencenilreason,
    procedure.minima_o.mandatoryrvr,
    procedure.minima_o.mandatoryrvrnilreason,
    procedure.minima_o.remotealtimeterminima,
    procedure.minima_o.remotealtimeterminimanilreason,
    procedure.minima_o.altitude,
    procedure.minima_o.altitudeuom,
    procedure.minima_o.altitudenilreason,
    procedure.minima_o.height,
    procedure.minima_o.heightuom,
    procedure.minima_o.heightnilreason,
    procedure.minima_o.militaryheight,
    procedure.minima_o.militaryheightuom,
    procedure.minima_o.militaryheightnilreason,
    procedure.minima_o.radioheight,
    procedure.minima_o.radioheightuom,
    procedure.minima_o.radioheightnilreason,
    procedure.minima_o.visibility,
    procedure.minima_o.visibilityuom,
    procedure.minima_o.visibilitynilreason,
    procedure.minima_o.militaryvisibility,
    procedure.minima_o.militaryvisibilityuom,
    procedure.minima_o.militaryvisibilitynilreason
from procedure.minima_p 
inner join aixm.aixm_property on procedure.minima_p.hjid = aixm.aixm_property.hjid
inner join procedure.minima_o on procedure.minima_p.minima_hjid = procedure.minima_o.hjid
inner join aixm.aixm_object on procedure.minima_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_minima_id on procedure.minima_view (id);

--procedure.missedapproachgroup_view

drop view if exists procedure.missedapproachgroup_view cascade;
create view procedure.missedapproachgroup_view as
select
    procedure.missedapproachgroup_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.missedapproachgroup_o.instruction,
    procedure.missedapproachgroup_o.instructionnilreason,
    procedure.missedapproachgroup_o.alternateclimbinstruction,
    procedure.missedapproachgroup_o.alternateclimbinstructionnilreason,
    procedure.missedapproachgroup_o.alternateclimbaltitude,
    procedure.missedapproachgroup_o.alternateclimbaltitudeuom,
    procedure.missedapproachgroup_o.alternateclimbaltitudenilreason
from procedure.missedapproachgroup_p 
inner join aixm.aixm_property on procedure.missedapproachgroup_p.hjid = aixm.aixm_property.hjid
inner join procedure.missedapproachgroup_o on procedure.missedapproachgroup_p.missedapproachgroup_hjid = procedure.missedapproachgroup_o.hjid
inner join aixm.aixm_object on procedure.missedapproachgroup_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_missedapproachgroup_id on procedure.missedapproachgroup_view (id);

--navaids_point.navaidcomponent_view

drop view if exists navaids_point.navaidcomponent_view cascade;
create view navaids_point.navaidcomponent_view as
select
    navaids_point.navaidcomponent_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.navaidcomponent_o.collocationgroup,
    navaids_point.navaidcomponent_o.collocationgroupnilreason,
    navaids_point.navaidcomponent_o.markerposition,
    navaids_point.navaidcomponent_o.markerpositionnilreason,
    navaids_point.navaidcomponent_o.providesnavigablelocation,
    navaids_point.navaidcomponent_o.providesnavigablelocationnilreason
from navaids_point.navaidcomponent_p 
inner join aixm.aixm_property on navaids_point.navaidcomponent_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.navaidcomponent_o on navaids_point.navaidcomponent_p.navaidcomponent_hjid = navaids_point.navaidcomponent_o.hjid
inner join aixm.aixm_object on navaids_point.navaidcomponent_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_navaidcomponent_id on navaids_point.navaidcomponent_view (id);

--airport_heliport.navaidequipmentdistance_view

drop view if exists airport_heliport.navaidequipmentdistance_view cascade;
create view airport_heliport.navaidequipmentdistance_view as
select
    airport_heliport.navaidequipmentdistance_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.navaidequipmentdistance_o.distance,
    airport_heliport.navaidequipmentdistance_o.distanceuom,
    airport_heliport.navaidequipmentdistance_o.distancenilreason,
    airport_heliport.navaidequipmentdistance_o.distanceaccuracy,
    airport_heliport.navaidequipmentdistance_o.distanceaccuracyuom,
    airport_heliport.navaidequipmentdistance_o.distanceaccuracynilreason
from airport_heliport.navaidequipmentdistance_p 
inner join aixm.aixm_property on airport_heliport.navaidequipmentdistance_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.navaidequipmentdistance_o on airport_heliport.navaidequipmentdistance_p.navaidequipmentdistance_hjid = airport_heliport.navaidequipmentdistance_o.hjid
inner join aixm.aixm_object on airport_heliport.navaidequipmentdistance_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_navaidequipmentdistance_id on airport_heliport.navaidequipmentdistance_view (id);

--navaids_point.navaidequipmentmonitoring_view

drop view if exists navaids_point.navaidequipmentmonitoring_view cascade;
create view navaids_point.navaidequipmentmonitoring_view as
select
    navaids_point.navaidequipmentmonitoring_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.navaidequipmentmonitoring_o.monitored,
    navaids_point.navaidequipmentmonitoring_o.monitorednilreason
from navaids_point.navaidequipmentmonitoring_p 
inner join aixm.aixm_property on navaids_point.navaidequipmentmonitoring_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.navaidequipmentmonitoring_o on navaids_point.navaidequipmentmonitoring_p.navaidequipmentmonitoring_hjid = navaids_point.navaidequipmentmonitoring_o.hjid
inner join aixm.aixm_object on navaids_point.navaidequipmentmonitoring_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_navaidequipmentmonitoring_id on navaids_point.navaidequipmentmonitoring_view (id);

--navaids_point.navaidoperationalstatus_view

drop view if exists navaids_point.navaidoperationalstatus_view cascade;
create view navaids_point.navaidoperationalstatus_view as
select
    navaids_point.navaidoperationalstatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.navaidoperationalstatus_o.operationalstatus,
    navaids_point.navaidoperationalstatus_o.operationalstatusnilreason,
    navaids_point.navaidoperationalstatus_o.signaltype,
    navaids_point.navaidoperationalstatus_o.signaltypenilreason
from navaids_point.navaidoperationalstatus_p 
inner join aixm.aixm_property on navaids_point.navaidoperationalstatus_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.navaidoperationalstatus_o on navaids_point.navaidoperationalstatus_p.navaidoperationalstatus_hjid = navaids_point.navaidoperationalstatus_o.hjid
inner join aixm.aixm_object on navaids_point.navaidoperationalstatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_navaidoperationalstatus_id on navaids_point.navaidoperationalstatus_view (id);

--procedure.navigationareasector_view

drop view if exists procedure.navigationareasector_view cascade;
create view procedure.navigationareasector_view as
select
    procedure.navigationareasector_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from procedure.navigationareasector_p 
inner join aixm.aixm_property on procedure.navigationareasector_p.hjid = aixm.aixm_property.hjid
inner join procedure.navigationareasector_o on procedure.navigationareasector_p.navigationareasector_hjid = procedure.navigationareasector_o.hjid
inner join aixm.aixm_object on procedure.navigationareasector_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_navigationareasector_id on procedure.navigationareasector_view (id);

--service.nitrogen_view

drop view if exists service.nitrogen_view cascade;
create view service.nitrogen_view as
select
    service.nitrogen_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.nitrogen_o.type,
    service.nitrogen_o.typenilreason
from service.nitrogen_p 
inner join aixm.aixm_property on service.nitrogen_p.hjid = aixm.aixm_property.hjid
inner join service.nitrogen_o on service.nitrogen_p.nitrogen_hjid = service.nitrogen_o.hjid
inner join aixm.aixm_object on service.nitrogen_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_nitrogen_id on service.nitrogen_view (id);

--note.note_view

drop view if exists note.note_view cascade;
create view note.note_view as
select
    note.note_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    note.note_o.propertyname,
    note.note_o.propertynamenilreason,
    note.note_o.purpose,
    note.note_o.purposenilreason
from note.note_p 
inner join aixm.aixm_property on note.note_p.hjid = aixm.aixm_property.hjid
inner join note.note_o on note.note_p.note_hjid = note.note_o.hjid
inner join aixm.aixm_object on note.note_o.hjid = aixm.aixm_object.hjid
;
create index if not exists note_note_id on note.note_view (id);

--shared.obstacleassessmentarea_view

drop view if exists shared.obstacleassessmentarea_view cascade;
create view shared.obstacleassessmentarea_view as
select
    shared.obstacleassessmentarea_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.obstacleassessmentarea_o.type,
    shared.obstacleassessmentarea_o.typenilreason,
    shared.obstacleassessmentarea_o.sectionnumber,
    shared.obstacleassessmentarea_o.sectionnumbernilreason,
    shared.obstacleassessmentarea_o.slope,
    shared.obstacleassessmentarea_o.slopenilreason,
    shared.obstacleassessmentarea_o.gradientlowhigh,
    shared.obstacleassessmentarea_o.gradientlowhighnilreason,
    shared.obstacleassessmentarea_o.surfacezone,
    shared.obstacleassessmentarea_o.surfacezonenilreason,
    shared.obstacleassessmentarea_o.safetyregulation,
    shared.obstacleassessmentarea_o.safetyregulationnilreason,
    shared.obstacleassessmentarea_o.assessedaltitude,
    shared.obstacleassessmentarea_o.assessedaltitudeuom,
    shared.obstacleassessmentarea_o.assessedaltitudenilreason,
    shared.obstacleassessmentarea_o.slopeloweraltitude,
    shared.obstacleassessmentarea_o.slopeloweraltitudeuom,
    shared.obstacleassessmentarea_o.slopeloweraltitudenilreason
from shared.obstacleassessmentarea_p 
inner join aixm.aixm_property on shared.obstacleassessmentarea_p.hjid = aixm.aixm_property.hjid
inner join shared.obstacleassessmentarea_o on shared.obstacleassessmentarea_p.obstacleassessmentarea_hjid = shared.obstacleassessmentarea_o.hjid
inner join aixm.aixm_object on shared.obstacleassessmentarea_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_obstacleassessmentarea_id on shared.obstacleassessmentarea_view (id);

--shared.obstacleplacement_view

drop view if exists shared.obstacleplacement_view cascade;
create view shared.obstacleplacement_view as
select
    shared.obstacleplacement_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.obstacleplacement_o.obstaclebearing,
    shared.obstacleplacement_o.obstaclebearingnilreason,
    shared.obstacleplacement_o.pointtype,
    shared.obstacleplacement_o.pointtypenilreason,
    shared.obstacleplacement_o.obstacleplacement,
    shared.obstacleplacement_o.obstacleplacementnilreason,
    shared.obstacleplacement_o.obstacledistance,
    shared.obstacleplacement_o.obstacledistanceuom,
    shared.obstacleplacement_o.obstacledistancenilreason
from shared.obstacleplacement_p 
inner join aixm.aixm_property on shared.obstacleplacement_p.hjid = aixm.aixm_property.hjid
inner join shared.obstacleplacement_o on shared.obstacleplacement_p.obstacleplacement_hjid = shared.obstacleplacement_o.hjid
inner join aixm.aixm_object on shared.obstacleplacement_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_obstacleplacement_id on shared.obstacleplacement_view (id);

--shared.obstruction_view

drop view if exists shared.obstruction_view cascade;
create view shared.obstruction_view as
select
    shared.obstruction_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.obstruction_o.surfacepenetration,
    shared.obstruction_o.surfacepenetrationnilreason,
    shared.obstruction_o.slopepenetration,
    shared.obstruction_o.slopepenetrationnilreason,
    shared.obstruction_o.controlling,
    shared.obstruction_o.controllingnilreason,
    shared.obstruction_o.closein,
    shared.obstruction_o.closeinnilreason,
    shared.obstruction_o.requiredclearance,
    shared.obstruction_o.requiredclearanceuom,
    shared.obstruction_o.requiredclearancenilreason,
    shared.obstruction_o.minimumaltitude,
    shared.obstruction_o.minimumaltitudeuom,
    shared.obstruction_o.minimumaltitudenilreason
from shared.obstruction_p 
inner join aixm.aixm_property on shared.obstruction_p.hjid = aixm.aixm_property.hjid
inner join shared.obstruction_o on shared.obstruction_p.obstruction_hjid = shared.obstruction_o.hjid
inner join aixm.aixm_object on shared.obstruction_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_obstruction_id on shared.obstruction_view (id);

--service.oil_view

drop view if exists service.oil_view cascade;
create view service.oil_view as
select
    service.oil_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.oil_o.category,
    service.oil_o.categorynilreason
from service.oil_p 
inner join aixm.aixm_property on service.oil_p.hjid = aixm.aixm_property.hjid
inner join service.oil_o on service.oil_p.oil_hjid = service.oil_o.hjid
inner join aixm.aixm_object on service.oil_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_oil_id on service.oil_view (id);

--shared.onlinecontact_view

drop view if exists shared.onlinecontact_view cascade;
create view shared.onlinecontact_view as
select
    shared.onlinecontact_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.onlinecontact_o.network,
    shared.onlinecontact_o.networknilreason,
    shared.onlinecontact_o.linkage,
    shared.onlinecontact_o.linkagenilreason,
    shared.onlinecontact_o.protocol,
    shared.onlinecontact_o.protocolnilreason,
    shared.onlinecontact_o.email,
    shared.onlinecontact_o.emailnilreason
from shared.onlinecontact_p 
inner join aixm.aixm_property on shared.onlinecontact_p.hjid = aixm.aixm_property.hjid
inner join shared.onlinecontact_o on shared.onlinecontact_p.onlinecontact_hjid = shared.onlinecontact_o.hjid
inner join aixm.aixm_object on shared.onlinecontact_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_onlinecontact_id on shared.onlinecontact_view (id);

--organisation.organisationauthorityassociation_view

drop view if exists organisation.organisationauthorityassociation_view cascade;
create view organisation.organisationauthorityassociation_view as
select
    organisation.organisationauthorityassociation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    organisation.organisationauthorityassociation_o.type,
    organisation.organisationauthorityassociation_o.typenilreason
from organisation.organisationauthorityassociation_p 
inner join aixm.aixm_property on organisation.organisationauthorityassociation_p.hjid = aixm.aixm_property.hjid
inner join organisation.organisationauthorityassociation_o on organisation.organisationauthorityassociation_p.organisationauthorityassociation_hjid = organisation.organisationauthorityassociation_o.hjid
inner join aixm.aixm_object on organisation.organisationauthorityassociation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists organisation_organisationauthorityassociation_id on organisation.organisationauthorityassociation_view (id);

--service.oxygen_view

drop view if exists service.oxygen_view cascade;
create view service.oxygen_view as
select
    service.oxygen_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.oxygen_o.type,
    service.oxygen_o.typenilreason
from service.oxygen_p 
inner join aixm.aixm_property on service.oxygen_p.hjid = aixm.aixm_property.hjid
inner join service.oxygen_o on service.oxygen_p.oxygen_hjid = service.oxygen_o.hjid
inner join aixm.aixm_object on service.oxygen_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_oxygen_id on service.oxygen_view (id);

--navaids_point.pointreference_view

drop view if exists navaids_point.pointreference_view cascade;
create view navaids_point.pointreference_view as
select
    navaids_point.pointreference_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.pointreference_o.role,
    navaids_point.pointreference_o.rolenilreason,
    navaids_point.pointreference_o.priorfixtolerance,
    navaids_point.pointreference_o.priorfixtoleranceuom,
    navaids_point.pointreference_o.priorfixtolerancenilreason,
    navaids_point.pointreference_o.postfixtolerance,
    navaids_point.pointreference_o.postfixtoleranceuom,
    navaids_point.pointreference_o.postfixtolerancenilreason
from navaids_point.pointreference_p 
inner join aixm.aixm_property on navaids_point.pointreference_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.pointreference_o on navaids_point.pointreference_p.pointreference_hjid = navaids_point.pointreference_o.hjid
inner join aixm.aixm_object on navaids_point.pointreference_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_pointreference_id on navaids_point.pointreference_view (id);

--shared.postaladdress_view

drop view if exists shared.postaladdress_view cascade;
create view shared.postaladdress_view as
select
    shared.postaladdress_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.postaladdress_o.deliverypoint,
    shared.postaladdress_o.deliverypointnilreason,
    shared.postaladdress_o.city,
    shared.postaladdress_o.citynilreason,
    shared.postaladdress_o.administrativearea,
    shared.postaladdress_o.administrativeareanilreason,
    shared.postaladdress_o.postalcode,
    shared.postaladdress_o.postalcodenilreason,
    shared.postaladdress_o.country,
    shared.postaladdress_o.countrynilreason
from shared.postaladdress_p 
inner join aixm.aixm_property on shared.postaladdress_p.hjid = aixm.aixm_property.hjid
inner join shared.postaladdress_o on shared.postaladdress_p.postaladdress_hjid = shared.postaladdress_o.hjid
inner join aixm.aixm_object on shared.postaladdress_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_postaladdress_id on shared.postaladdress_view (id);

--procedure.procedureavailability_view

drop view if exists procedure.procedureavailability_view cascade;
create view procedure.procedureavailability_view as
select
    procedure.procedureavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.procedureavailability_o.status,
    procedure.procedureavailability_o.statusnilreason
from procedure.procedureavailability_p 
inner join aixm.aixm_property on procedure.procedureavailability_p.hjid = aixm.aixm_property.hjid
inner join procedure.procedureavailability_o on procedure.procedureavailability_p.procedureavailability_hjid = procedure.procedureavailability_o.hjid
inner join aixm.aixm_object on procedure.procedureavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_procedureavailability_id on procedure.procedureavailability_view (id);

--procedure.proceduretransitionleg_view

drop view if exists procedure.proceduretransitionleg_view cascade;
create view procedure.proceduretransitionleg_view as
select
    procedure.proceduretransitionleg_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.proceduretransitionleg_o.seqnumberarinc,
    procedure.proceduretransitionleg_o.seqnumberarincnilreason
from procedure.proceduretransitionleg_p 
inner join aixm.aixm_property on procedure.proceduretransitionleg_p.hjid = aixm.aixm_property.hjid
inner join procedure.proceduretransitionleg_o on procedure.proceduretransitionleg_p.proceduretransitionleg_hjid = procedure.proceduretransitionleg_o.hjid
inner join aixm.aixm_object on procedure.proceduretransitionleg_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_proceduretransitionleg_id on procedure.proceduretransitionleg_view (id);

--procedure.proceduretransition_view

drop view if exists procedure.proceduretransition_view cascade;
create view procedure.proceduretransition_view as
select
    procedure.proceduretransition_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.proceduretransition_o.transitionid,
    procedure.proceduretransition_o.transitionidnilreason,
    procedure.proceduretransition_o.type,
    procedure.proceduretransition_o.typenilreason,
    procedure.proceduretransition_o.instruction,
    procedure.proceduretransition_o.instructionnilreason,
    procedure.proceduretransition_o.vectorheading,
    procedure.proceduretransition_o.vectorheadingnilreason
from procedure.proceduretransition_p 
inner join aixm.aixm_property on procedure.proceduretransition_p.hjid = aixm.aixm_property.hjid
inner join procedure.proceduretransition_o on procedure.proceduretransition_p.proceduretransition_hjid = procedure.proceduretransition_o.hjid
inner join aixm.aixm_object on procedure.proceduretransition_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_proceduretransition_id on procedure.proceduretransition_view (id);

--surveillance.radarcomponent_view

drop view if exists surveillance.radarcomponent_view cascade;
create view surveillance.radarcomponent_view as
select
    surveillance.radarcomponent_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    surveillance.radarcomponent_o.collocationgroup,
    surveillance.radarcomponent_o.collocationgroupnilreason
from surveillance.radarcomponent_p 
inner join aixm.aixm_property on surveillance.radarcomponent_p.hjid = aixm.aixm_property.hjid
inner join surveillance.radarcomponent_o on surveillance.radarcomponent_p.radarcomponent_hjid = surveillance.radarcomponent_o.hjid
inner join aixm.aixm_object on surveillance.radarcomponent_o.hjid = aixm.aixm_object.hjid
;
create index if not exists surveillance_radarcomponent_id on surveillance.radarcomponent_view (id);

--service.radiocommunicationoperationalstatus_view

drop view if exists service.radiocommunicationoperationalstatus_view cascade;
create view service.radiocommunicationoperationalstatus_view as
select
    service.radiocommunicationoperationalstatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.radiocommunicationoperationalstatus_o.operationalstatus,
    service.radiocommunicationoperationalstatus_o.operationalstatusnilreason
from service.radiocommunicationoperationalstatus_p 
inner join aixm.aixm_property on service.radiocommunicationoperationalstatus_p.hjid = aixm.aixm_property.hjid
inner join service.radiocommunicationoperationalstatus_o on service.radiocommunicationoperationalstatus_p.radiocommunicationoperationalstatus_hjid = service.radiocommunicationoperationalstatus_o.hjid
inner join aixm.aixm_object on service.radiocommunicationoperationalstatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_radiocommunicationoperationalstatus_id on service.radiocommunicationoperationalstatus_view (id);

--surveillance.reflector_view

drop view if exists surveillance.reflector_view cascade;
create view surveillance.reflector_view as
select
    surveillance.reflector_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    surveillance.reflector_o.type,
    surveillance.reflector_o.typenilreason
from surveillance.reflector_p 
inner join aixm.aixm_property on surveillance.reflector_p.hjid = aixm.aixm_property.hjid
inner join surveillance.reflector_o on surveillance.reflector_p.reflector_hjid = surveillance.reflector_o.hjid
inner join aixm.aixm_object on surveillance.reflector_o.hjid = aixm.aixm_object.hjid
;
create index if not exists surveillance_reflector_id on surveillance.reflector_view (id);

--airport_heliport.ridge_view

drop view if exists airport_heliport.ridge_view cascade;
create view airport_heliport.ridge_view as
select
    airport_heliport.ridge_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.ridge_o.side,
    airport_heliport.ridge_o.sidenilreason,
    airport_heliport.ridge_o.distance,
    airport_heliport.ridge_o.distanceuom,
    airport_heliport.ridge_o.distancenilreason,
    airport_heliport.ridge_o.depth,
    airport_heliport.ridge_o.depthuom,
    airport_heliport.ridge_o.depthnilreason
from airport_heliport.ridge_p 
inner join aixm.aixm_property on airport_heliport.ridge_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.ridge_o on airport_heliport.ridge_p.ridge_hjid = airport_heliport.ridge_o.hjid
inner join aixm.aixm_object on airport_heliport.ridge_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_ridge_id on airport_heliport.ridge_view (id);

--route.routeavailability_view

drop view if exists route.routeavailability_view cascade;
create view route.routeavailability_view as
select
    route.routeavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    route.routeavailability_o.direction,
    route.routeavailability_o.directionnilreason,
    route.routeavailability_o.cardinaldirection,
    route.routeavailability_o.cardinaldirectionnilreason,
    route.routeavailability_o.status,
    route.routeavailability_o.statusnilreason
from route.routeavailability_p 
inner join aixm.aixm_property on route.routeavailability_p.hjid = aixm.aixm_property.hjid
inner join route.routeavailability_o on route.routeavailability_p.routeavailability_hjid = route.routeavailability_o.hjid
inner join aixm.aixm_object on route.routeavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_routeavailability_id on route.routeavailability_view (id);

--route.routeportion_view

drop view if exists route.routeportion_view cascade;
create view route.routeportion_view as
select
    route.routeportion_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid
from route.routeportion_p 
inner join aixm.aixm_property on route.routeportion_p.hjid = aixm.aixm_property.hjid
inner join route.routeportion_o on route.routeportion_p.routeportion_hjid = route.routeportion_o.hjid
inner join aixm.aixm_object on route.routeportion_o.hjid = aixm.aixm_object.hjid
;
create index if not exists route_routeportion_id on route.routeportion_view (id);

--airport_heliport.runwaycontamination_view

drop view if exists airport_heliport.runwaycontamination_view cascade;
create view airport_heliport.runwaycontamination_view as
select
    airport_heliport.runwaycontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.runwaycontamination_o.observationtime,
    airport_heliport.runwaycontamination_o.observationtimenilreason,
    airport_heliport.runwaycontamination_o.frictioncoefficient,
    airport_heliport.runwaycontamination_o.frictioncoefficientnilreason,
    airport_heliport.runwaycontamination_o.frictionestimation,
    airport_heliport.runwaycontamination_o.frictionestimationnilreason,
    airport_heliport.runwaycontamination_o.frictiondevice,
    airport_heliport.runwaycontamination_o.frictiondevicenilreason,
    airport_heliport.runwaycontamination_o.obscuredlights,
    airport_heliport.runwaycontamination_o.obscuredlightsnilreason,
    airport_heliport.runwaycontamination_o.furtherclearancetime,
    airport_heliport.runwaycontamination_o.furtherclearancetimenilreason,
    airport_heliport.runwaycontamination_o.furthertotalclearance,
    airport_heliport.runwaycontamination_o.furthertotalclearancenilreason,
    airport_heliport.runwaycontamination_o.nextobservationtime,
    airport_heliport.runwaycontamination_o.nextobservationtimenilreason,
    airport_heliport.runwaycontamination_o.proportion,
    airport_heliport.runwaycontamination_o.proportionnilreason,
    airport_heliport.runwaycontamination_o.clearedside,
    airport_heliport.runwaycontamination_o.clearedsidenilreason,
    airport_heliport.runwaycontamination_o.obscuredlightsside,
    airport_heliport.runwaycontamination_o.obscuredlightssidenilreason,
    airport_heliport.runwaycontamination_o.taxiwayavailable,
    airport_heliport.runwaycontamination_o.taxiwayavailablenilreason,
    airport_heliport.runwaycontamination_o.apronavailable,
    airport_heliport.runwaycontamination_o.apronavailablenilreason,
    airport_heliport.runwaycontamination_o.depth,
    airport_heliport.runwaycontamination_o.depthuom,
    airport_heliport.runwaycontamination_o.depthnilreason,
    airport_heliport.runwaycontamination_o.clearedlength,
    airport_heliport.runwaycontamination_o.clearedlengthuom,
    airport_heliport.runwaycontamination_o.clearedlengthnilreason,
    airport_heliport.runwaycontamination_o.clearedwidth,
    airport_heliport.runwaycontamination_o.clearedwidthuom,
    airport_heliport.runwaycontamination_o.clearedwidthnilreason,
    airport_heliport.runwaycontamination_o.furtherclearancelength,
    airport_heliport.runwaycontamination_o.furtherclearancelengthuom,
    airport_heliport.runwaycontamination_o.furtherclearancelengthnilreason,
    airport_heliport.runwaycontamination_o.furtherclearancewidth,
    airport_heliport.runwaycontamination_o.furtherclearancewidthuom,
    airport_heliport.runwaycontamination_o.furtherclearancewidthnilreason,
    airport_heliport.runwaycontamination_o.clearedlengthbegin,
    airport_heliport.runwaycontamination_o.clearedlengthbeginuom,
    airport_heliport.runwaycontamination_o.clearedlengthbeginnilreason
from airport_heliport.runwaycontamination_p 
inner join aixm.aixm_property on airport_heliport.runwaycontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.runwaycontamination_o on airport_heliport.runwaycontamination_p.runwaycontamination_hjid = airport_heliport.runwaycontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.runwaycontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_runwaycontamination_id on airport_heliport.runwaycontamination_view (id);

--airport_heliport.runwaydeclareddistance_view

drop view if exists airport_heliport.runwaydeclareddistance_view cascade;
create view airport_heliport.runwaydeclareddistance_view as
select
    airport_heliport.runwaydeclareddistance_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.runwaydeclareddistance_o.type,
    airport_heliport.runwaydeclareddistance_o.typenilreason
from airport_heliport.runwaydeclareddistance_p 
inner join aixm.aixm_property on airport_heliport.runwaydeclareddistance_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.runwaydeclareddistance_o on airport_heliport.runwaydeclareddistance_p.runwaydeclareddistance_hjid = airport_heliport.runwaydeclareddistance_o.hjid
inner join aixm.aixm_object on airport_heliport.runwaydeclareddistance_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_runwaydeclareddistance_id on airport_heliport.runwaydeclareddistance_view (id);

--airport_heliport.runwaydeclareddistancevalue_view

drop view if exists airport_heliport.runwaydeclareddistancevalue_view cascade;
create view airport_heliport.runwaydeclareddistancevalue_view as
select
    airport_heliport.runwaydeclareddistancevalue_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.runwaydeclareddistancevalue_o.distance,
    airport_heliport.runwaydeclareddistancevalue_o.distanceuom,
    airport_heliport.runwaydeclareddistancevalue_o.distancenilreason,
    airport_heliport.runwaydeclareddistancevalue_o.distanceaccuracy,
    airport_heliport.runwaydeclareddistancevalue_o.distanceaccuracyuom,
    airport_heliport.runwaydeclareddistancevalue_o.distanceaccuracynilreason
from airport_heliport.runwaydeclareddistancevalue_p 
inner join aixm.aixm_property on airport_heliport.runwaydeclareddistancevalue_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.runwaydeclareddistancevalue_o on airport_heliport.runwaydeclareddistancevalue_p.runwaydeclareddistancevalue_hjid = airport_heliport.runwaydeclareddistancevalue_o.hjid
inner join aixm.aixm_object on airport_heliport.runwaydeclareddistancevalue_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_runwaydeclareddistancevalue_id on airport_heliport.runwaydeclareddistancevalue_view (id);

--airport_heliport.runwaysectioncontamination_view

drop view if exists airport_heliport.runwaysectioncontamination_view cascade;
create view airport_heliport.runwaysectioncontamination_view as
select
    airport_heliport.runwaysectioncontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.runwaysectioncontamination_o.observationtime,
    airport_heliport.runwaysectioncontamination_o.observationtimenilreason,
    airport_heliport.runwaysectioncontamination_o.frictioncoefficient,
    airport_heliport.runwaysectioncontamination_o.frictioncoefficientnilreason,
    airport_heliport.runwaysectioncontamination_o.frictionestimation,
    airport_heliport.runwaysectioncontamination_o.frictionestimationnilreason,
    airport_heliport.runwaysectioncontamination_o.frictiondevice,
    airport_heliport.runwaysectioncontamination_o.frictiondevicenilreason,
    airport_heliport.runwaysectioncontamination_o.obscuredlights,
    airport_heliport.runwaysectioncontamination_o.obscuredlightsnilreason,
    airport_heliport.runwaysectioncontamination_o.furtherclearancetime,
    airport_heliport.runwaysectioncontamination_o.furtherclearancetimenilreason,
    airport_heliport.runwaysectioncontamination_o.furthertotalclearance,
    airport_heliport.runwaysectioncontamination_o.furthertotalclearancenilreason,
    airport_heliport.runwaysectioncontamination_o.nextobservationtime,
    airport_heliport.runwaysectioncontamination_o.nextobservationtimenilreason,
    airport_heliport.runwaysectioncontamination_o.proportion,
    airport_heliport.runwaysectioncontamination_o.proportionnilreason,
    airport_heliport.runwaysectioncontamination_o.section,
    airport_heliport.runwaysectioncontamination_o.sectionnilreason,
    airport_heliport.runwaysectioncontamination_o.depth,
    airport_heliport.runwaysectioncontamination_o.depthuom,
    airport_heliport.runwaysectioncontamination_o.depthnilreason
from airport_heliport.runwaysectioncontamination_p 
inner join aixm.aixm_property on airport_heliport.runwaysectioncontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.runwaysectioncontamination_o on airport_heliport.runwaysectioncontamination_p.runwaysectioncontamination_hjid = airport_heliport.runwaysectioncontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.runwaysectioncontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_runwaysectioncontamination_id on airport_heliport.runwaysectioncontamination_view (id);

--procedure.safealtitudeareasector_view

drop view if exists procedure.safealtitudeareasector_view cascade;
create view procedure.safealtitudeareasector_view as
select
    procedure.safealtitudeareasector_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.safealtitudeareasector_o.bufferwidth,
    procedure.safealtitudeareasector_o.bufferwidthuom,
    procedure.safealtitudeareasector_o.bufferwidthnilreason
from procedure.safealtitudeareasector_p 
inner join aixm.aixm_property on procedure.safealtitudeareasector_p.hjid = aixm.aixm_property.hjid
inner join procedure.safealtitudeareasector_o on procedure.safealtitudeareasector_p.safealtitudeareasector_hjid = procedure.safealtitudeareasector_o.hjid
inner join aixm.aixm_object on procedure.safealtitudeareasector_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_safealtitudeareasector_id on procedure.safealtitudeareasector_view (id);

--procedure.sectordesign_view

drop view if exists procedure.sectordesign_view cascade;
create view procedure.sectordesign_view as
select
    procedure.sectordesign_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.sectordesign_o.turndirection,
    procedure.sectordesign_o.turndirectionnilreason,
    procedure.sectordesign_o.designgradient,
    procedure.sectordesign_o.designgradientnilreason,
    procedure.sectordesign_o.turnpermitted,
    procedure.sectordesign_o.turnpermittednilreason,
    procedure.sectordesign_o.terminationaltitude,
    procedure.sectordesign_o.terminationaltitudeuom,
    procedure.sectordesign_o.terminationaltitudenilreason
from procedure.sectordesign_p 
inner join aixm.aixm_property on procedure.sectordesign_p.hjid = aixm.aixm_property.hjid
inner join procedure.sectordesign_o on procedure.sectordesign_p.sectordesign_hjid = procedure.sectordesign_o.hjid
inner join aixm.aixm_object on procedure.sectordesign_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_sectordesign_id on procedure.sectordesign_view (id);

--service.serviceoperationalstatus_view

drop view if exists service.serviceoperationalstatus_view cascade;
create view service.serviceoperationalstatus_view as
select
    service.serviceoperationalstatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    service.serviceoperationalstatus_o.operationalstatus,
    service.serviceoperationalstatus_o.operationalstatusnilreason
from service.serviceoperationalstatus_p 
inner join aixm.aixm_property on service.serviceoperationalstatus_p.hjid = aixm.aixm_property.hjid
inner join service.serviceoperationalstatus_o on service.serviceoperationalstatus_p.serviceoperationalstatus_hjid = service.serviceoperationalstatus_o.hjid
inner join aixm.aixm_object on service.serviceoperationalstatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists service_serviceoperationalstatus_id on service.serviceoperationalstatus_view (id);

--navaids_point.specialnavigationstationstatus_view

drop view if exists navaids_point.specialnavigationstationstatus_view cascade;
create view navaids_point.specialnavigationstationstatus_view as
select
    navaids_point.specialnavigationstationstatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.specialnavigationstationstatus_o.operationalstatus,
    navaids_point.specialnavigationstationstatus_o.operationalstatusnilreason
from navaids_point.specialnavigationstationstatus_p 
inner join aixm.aixm_property on navaids_point.specialnavigationstationstatus_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.specialnavigationstationstatus_o on navaids_point.specialnavigationstationstatus_p.specialnavigationstationstatus_hjid = navaids_point.specialnavigationstationstatus_o.hjid
inner join aixm.aixm_object on navaids_point.specialnavigationstationstatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_specialnavigationstationstatus_id on navaids_point.specialnavigationstationstatus_view (id);

--shared.standardlevel_view

drop view if exists shared.standardlevel_view cascade;
create view shared.standardlevel_view as
select
    shared.standardlevel_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.standardlevel_o.verticaldistance,
    shared.standardlevel_o.verticaldistanceuom,
    shared.standardlevel_o.verticaldistancenilreason
from shared.standardlevel_p 
inner join aixm.aixm_property on shared.standardlevel_p.hjid = aixm.aixm_property.hjid
inner join shared.standardlevel_o on shared.standardlevel_p.standardlevel_hjid = shared.standardlevel_o.hjid
inner join aixm.aixm_object on shared.standardlevel_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_standardlevel_id on shared.standardlevel_view (id);

--airport_heliport.surfacecharacteristics_view

drop view if exists airport_heliport.surfacecharacteristics_view cascade;
create view airport_heliport.surfacecharacteristics_view as
select
    airport_heliport.surfacecharacteristics_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.surfacecharacteristics_o.composition,
    airport_heliport.surfacecharacteristics_o.compositionnilreason,
    airport_heliport.surfacecharacteristics_o.preparation,
    airport_heliport.surfacecharacteristics_o.preparationnilreason,
    airport_heliport.surfacecharacteristics_o.surfacecondition,
    airport_heliport.surfacecharacteristics_o.surfaceconditionnilreason,
    airport_heliport.surfacecharacteristics_o.classpcn,
    airport_heliport.surfacecharacteristics_o.classpcnnilreason,
    airport_heliport.surfacecharacteristics_o.pavementtypepcn,
    airport_heliport.surfacecharacteristics_o.pavementtypepcnnilreason,
    airport_heliport.surfacecharacteristics_o.pavementsubgradepcn,
    airport_heliport.surfacecharacteristics_o.pavementsubgradepcnnilreason,
    airport_heliport.surfacecharacteristics_o.maxtyrepressurepcn,
    airport_heliport.surfacecharacteristics_o.maxtyrepressurepcnnilreason,
    airport_heliport.surfacecharacteristics_o.evaluationmethodpcn,
    airport_heliport.surfacecharacteristics_o.evaluationmethodpcnnilreason,
    airport_heliport.surfacecharacteristics_o.classlcn,
    airport_heliport.surfacecharacteristics_o.classlcnnilreason,
    airport_heliport.surfacecharacteristics_o.weightsiwl,
    airport_heliport.surfacecharacteristics_o.weightsiwluom,
    airport_heliport.surfacecharacteristics_o.weightsiwlnilreason,
    airport_heliport.surfacecharacteristics_o.tyrepressuresiwl,
    airport_heliport.surfacecharacteristics_o.tyrepressuresiwluom,
    airport_heliport.surfacecharacteristics_o.tyrepressuresiwlnilreason,
    airport_heliport.surfacecharacteristics_o.weightauw,
    airport_heliport.surfacecharacteristics_o.weightauwuom,
    airport_heliport.surfacecharacteristics_o.weightauwnilreason
from airport_heliport.surfacecharacteristics_p 
inner join aixm.aixm_property on airport_heliport.surfacecharacteristics_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.surfacecharacteristics_o on airport_heliport.surfacecharacteristics_p.surfacecharacteristics_hjid = airport_heliport.surfacecharacteristics_o.hjid
inner join aixm.aixm_object on airport_heliport.surfacecharacteristics_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_surfacecharacteristics_id on airport_heliport.surfacecharacteristics_view (id);

--airport_heliport.surfacecontaminationlayer_view

drop view if exists airport_heliport.surfacecontaminationlayer_view cascade;
create view airport_heliport.surfacecontaminationlayer_view as
select
    airport_heliport.surfacecontaminationlayer_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.surfacecontaminationlayer_o.layerorder,
    airport_heliport.surfacecontaminationlayer_o.layerordernilreason,
    airport_heliport.surfacecontaminationlayer_o.type,
    airport_heliport.surfacecontaminationlayer_o.typenilreason
from airport_heliport.surfacecontaminationlayer_p 
inner join aixm.aixm_property on airport_heliport.surfacecontaminationlayer_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.surfacecontaminationlayer_o on airport_heliport.surfacecontaminationlayer_p.surfacecontaminationlayer_hjid = airport_heliport.surfacecontaminationlayer_o.hjid
inner join aixm.aixm_object on airport_heliport.surfacecontaminationlayer_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_surfacecontaminationlayer_id on airport_heliport.surfacecontaminationlayer_view (id);

--surveillance.surveillancegroundstation_view

drop view if exists surveillance.surveillancegroundstation_view cascade;
create view surveillance.surveillancegroundstation_view as
select
    surveillance.surveillancegroundstation_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    surveillance.surveillancegroundstation_o.videomap,
    surveillance.surveillancegroundstation_o.videomapnilreason
from surveillance.surveillancegroundstation_p 
inner join aixm.aixm_property on surveillance.surveillancegroundstation_p.hjid = aixm.aixm_property.hjid
inner join surveillance.surveillancegroundstation_o on surveillance.surveillancegroundstation_p.surveillancegroundstation_hjid = surveillance.surveillancegroundstation_o.hjid
inner join aixm.aixm_object on surveillance.surveillancegroundstation_o.hjid = aixm.aixm_object.hjid
;
create index if not exists surveillance_surveillancegroundstation_id on surveillance.surveillancegroundstation_view (id);

--airport_heliport.taxiwaycontamination_view

drop view if exists airport_heliport.taxiwaycontamination_view cascade;
create view airport_heliport.taxiwaycontamination_view as
select
    airport_heliport.taxiwaycontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.taxiwaycontamination_o.observationtime,
    airport_heliport.taxiwaycontamination_o.observationtimenilreason,
    airport_heliport.taxiwaycontamination_o.frictioncoefficient,
    airport_heliport.taxiwaycontamination_o.frictioncoefficientnilreason,
    airport_heliport.taxiwaycontamination_o.frictionestimation,
    airport_heliport.taxiwaycontamination_o.frictionestimationnilreason,
    airport_heliport.taxiwaycontamination_o.frictiondevice,
    airport_heliport.taxiwaycontamination_o.frictiondevicenilreason,
    airport_heliport.taxiwaycontamination_o.obscuredlights,
    airport_heliport.taxiwaycontamination_o.obscuredlightsnilreason,
    airport_heliport.taxiwaycontamination_o.furtherclearancetime,
    airport_heliport.taxiwaycontamination_o.furtherclearancetimenilreason,
    airport_heliport.taxiwaycontamination_o.furthertotalclearance,
    airport_heliport.taxiwaycontamination_o.furthertotalclearancenilreason,
    airport_heliport.taxiwaycontamination_o.nextobservationtime,
    airport_heliport.taxiwaycontamination_o.nextobservationtimenilreason,
    airport_heliport.taxiwaycontamination_o.proportion,
    airport_heliport.taxiwaycontamination_o.proportionnilreason,
    airport_heliport.taxiwaycontamination_o.depth,
    airport_heliport.taxiwaycontamination_o.depthuom,
    airport_heliport.taxiwaycontamination_o.depthnilreason,
    airport_heliport.taxiwaycontamination_o.clearedwidth,
    airport_heliport.taxiwaycontamination_o.clearedwidthuom,
    airport_heliport.taxiwaycontamination_o.clearedwidthnilreason
from airport_heliport.taxiwaycontamination_p 
inner join aixm.aixm_property on airport_heliport.taxiwaycontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.taxiwaycontamination_o on airport_heliport.taxiwaycontamination_p.taxiwaycontamination_hjid = airport_heliport.taxiwaycontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.taxiwaycontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_taxiwaycontamination_id on airport_heliport.taxiwaycontamination_view (id);

--shared.telephonecontact_view

drop view if exists shared.telephonecontact_view cascade;
create view shared.telephonecontact_view as
select
    shared.telephonecontact_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.telephonecontact_o.voice,
    shared.telephonecontact_o.voicenilreason,
    shared.telephonecontact_o.facsimile,
    shared.telephonecontact_o.facsimilenilreason
from shared.telephonecontact_p 
inner join aixm.aixm_property on shared.telephonecontact_p.hjid = aixm.aixm_property.hjid
inner join shared.telephonecontact_o on shared.telephonecontact_p.telephonecontact_hjid = shared.telephonecontact_o.hjid
inner join aixm.aixm_object on shared.telephonecontact_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_telephonecontact_id on shared.telephonecontact_view (id);

--procedure.terminalarrivalareasector_view

drop view if exists procedure.terminalarrivalareasector_view cascade;
create view procedure.terminalarrivalareasector_view as
select
    procedure.terminalarrivalareasector_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    procedure.terminalarrivalareasector_o.flybycode,
    procedure.terminalarrivalareasector_o.flybycodenilreason,
    procedure.terminalarrivalareasector_o.procedureturnrequired,
    procedure.terminalarrivalareasector_o.procedureturnrequirednilreason,
    procedure.terminalarrivalareasector_o.altitudedescription,
    procedure.terminalarrivalareasector_o.altitudedescriptionnilreason
from procedure.terminalarrivalareasector_p 
inner join aixm.aixm_property on procedure.terminalarrivalareasector_p.hjid = aixm.aixm_property.hjid
inner join procedure.terminalarrivalareasector_o on procedure.terminalarrivalareasector_p.terminalarrivalareasector_hjid = procedure.terminalarrivalareasector_o.hjid
inner join aixm.aixm_object on procedure.terminalarrivalareasector_o.hjid = aixm.aixm_object.hjid
;
create index if not exists procedure_terminalarrivalareasector_id on procedure.terminalarrivalareasector_view (id);

--navaids_point.terminalsegmentpoint_view

drop view if exists navaids_point.terminalsegmentpoint_view cascade;
create view navaids_point.terminalsegmentpoint_view as
select
    navaids_point.terminalsegmentpoint_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    navaids_point.terminalsegmentpoint_o.reportingatc,
    navaids_point.terminalsegmentpoint_o.reportingatcnilreason,
    navaids_point.terminalsegmentpoint_o.flyover,
    navaids_point.terminalsegmentpoint_o.flyovernilreason,
    navaids_point.terminalsegmentpoint_o.waypoint,
    navaids_point.terminalsegmentpoint_o.waypointnilreason,
    navaids_point.terminalsegmentpoint_o.radarguidance,
    navaids_point.terminalsegmentpoint_o.radarguidancenilreason,
    navaids_point.terminalsegmentpoint_o.role,
    navaids_point.terminalsegmentpoint_o.rolenilreason,
    navaids_point.terminalsegmentpoint_o.leadradial,
    navaids_point.terminalsegmentpoint_o.leadradialnilreason,
    navaids_point.terminalsegmentpoint_o.indicatorfacf,
    navaids_point.terminalsegmentpoint_o.indicatorfacfnilreason,
    navaids_point.terminalsegmentpoint_o.leaddme,
    navaids_point.terminalsegmentpoint_o.leaddmeuom,
    navaids_point.terminalsegmentpoint_o.leaddmenilreason
from navaids_point.terminalsegmentpoint_p 
inner join aixm.aixm_property on navaids_point.terminalsegmentpoint_p.hjid = aixm.aixm_property.hjid
inner join navaids_point.terminalsegmentpoint_o on navaids_point.terminalsegmentpoint_p.terminalsegmentpoint_hjid = navaids_point.terminalsegmentpoint_o.hjid
inner join aixm.aixm_object on navaids_point.terminalsegmentpoint_o.hjid = aixm.aixm_object.hjid
;
create index if not exists navaids_point_terminalsegmentpoint_id on navaids_point.terminalsegmentpoint_view (id);

--shared.timesheet_view

drop view if exists shared.timesheet_view cascade;
create view shared.timesheet_view as
select
    shared.timesheet_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    shared.timesheet_o.timereference,
    shared.timesheet_o.timereferencenilreason,
    shared.timesheet_o.startdate,
    shared.timesheet_o.startdatenilreason,
    shared.timesheet_o.enddate,
    shared.timesheet_o.enddatenilreason,
    shared.timesheet_o.day,
    shared.timesheet_o.daynilreason,
    shared.timesheet_o.daytil,
    shared.timesheet_o.daytilnilreason,
    shared.timesheet_o.starttime,
    shared.timesheet_o.starttimenilreason,
    shared.timesheet_o.startevent,
    shared.timesheet_o.starteventnilreason,
    shared.timesheet_o.starteventinterpretation,
    shared.timesheet_o.starteventinterpretationnilreason,
    shared.timesheet_o.endtime,
    shared.timesheet_o.endtimenilreason,
    shared.timesheet_o.endevent,
    shared.timesheet_o.endeventnilreason,
    shared.timesheet_o.endeventinterpretation,
    shared.timesheet_o.endeventinterpretationnilreason,
    shared.timesheet_o.daylightsavingadjust,
    shared.timesheet_o.daylightsavingadjustnilreason,
    shared.timesheet_o.excluded,
    shared.timesheet_o.excludednilreason,
    shared.timesheet_o.starttimerelativeevent,
    shared.timesheet_o.starttimerelativeeventuom,
    shared.timesheet_o.starttimerelativeeventnilreason,
    shared.timesheet_o.endtimerelativeevent,
    shared.timesheet_o.endtimerelativeeventuom,
    shared.timesheet_o.endtimerelativeeventnilreason
from shared.timesheet_p 
inner join aixm.aixm_property on shared.timesheet_p.hjid = aixm.aixm_property.hjid
inner join shared.timesheet_o on shared.timesheet_p.timesheet_hjid = shared.timesheet_o.hjid
inner join aixm.aixm_object on shared.timesheet_o.hjid = aixm.aixm_object.hjid
;
create index if not exists shared_timesheet_id on shared.timesheet_view (id);

--airport_heliport.touchdownliftoffcontamination_view

drop view if exists airport_heliport.touchdownliftoffcontamination_view cascade;
create view airport_heliport.touchdownliftoffcontamination_view as
select
    airport_heliport.touchdownliftoffcontamination_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.touchdownliftoffcontamination_o.observationtime,
    airport_heliport.touchdownliftoffcontamination_o.observationtimenilreason,
    airport_heliport.touchdownliftoffcontamination_o.frictioncoefficient,
    airport_heliport.touchdownliftoffcontamination_o.frictioncoefficientnilreason,
    airport_heliport.touchdownliftoffcontamination_o.frictionestimation,
    airport_heliport.touchdownliftoffcontamination_o.frictionestimationnilreason,
    airport_heliport.touchdownliftoffcontamination_o.frictiondevice,
    airport_heliport.touchdownliftoffcontamination_o.frictiondevicenilreason,
    airport_heliport.touchdownliftoffcontamination_o.obscuredlights,
    airport_heliport.touchdownliftoffcontamination_o.obscuredlightsnilreason,
    airport_heliport.touchdownliftoffcontamination_o.furtherclearancetime,
    airport_heliport.touchdownliftoffcontamination_o.furtherclearancetimenilreason,
    airport_heliport.touchdownliftoffcontamination_o.furthertotalclearance,
    airport_heliport.touchdownliftoffcontamination_o.furthertotalclearancenilreason,
    airport_heliport.touchdownliftoffcontamination_o.nextobservationtime,
    airport_heliport.touchdownliftoffcontamination_o.nextobservationtimenilreason,
    airport_heliport.touchdownliftoffcontamination_o.proportion,
    airport_heliport.touchdownliftoffcontamination_o.proportionnilreason,
    airport_heliport.touchdownliftoffcontamination_o.depth,
    airport_heliport.touchdownliftoffcontamination_o.depthuom,
    airport_heliport.touchdownliftoffcontamination_o.depthnilreason
from airport_heliport.touchdownliftoffcontamination_p 
inner join aixm.aixm_property on airport_heliport.touchdownliftoffcontamination_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.touchdownliftoffcontamination_o on airport_heliport.touchdownliftoffcontamination_p.touchdownliftoffcontamination_hjid = airport_heliport.touchdownliftoffcontamination_o.hjid
inner join aixm.aixm_object on airport_heliport.touchdownliftoffcontamination_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_touchdownliftoffcontamination_id on airport_heliport.touchdownliftoffcontamination_view (id);

--organisation.unitavailability_view

drop view if exists organisation.unitavailability_view cascade;
create view organisation.unitavailability_view as
select
    organisation.unitavailability_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    organisation.unitavailability_o.operationalstatus,
    organisation.unitavailability_o.operationalstatusnilreason
from organisation.unitavailability_p 
inner join aixm.aixm_property on organisation.unitavailability_p.hjid = aixm.aixm_property.hjid
inner join organisation.unitavailability_o on organisation.unitavailability_p.unitavailability_hjid = organisation.unitavailability_o.hjid
inner join aixm.aixm_object on organisation.unitavailability_o.hjid = aixm.aixm_object.hjid
;
create index if not exists organisation_unitavailability_id on organisation.unitavailability_view (id);

--organisation.unitdependency_view

drop view if exists organisation.unitdependency_view cascade;
create view organisation.unitdependency_view as
select
    organisation.unitdependency_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    organisation.unitdependency_o.type,
    organisation.unitdependency_o.typenilreason
from organisation.unitdependency_p 
inner join aixm.aixm_property on organisation.unitdependency_p.hjid = aixm.aixm_property.hjid
inner join organisation.unitdependency_o on organisation.unitdependency_p.unitdependency_hjid = organisation.unitdependency_o.hjid
inner join aixm.aixm_object on organisation.unitdependency_o.hjid = aixm.aixm_object.hjid
;
create index if not exists organisation_unitdependency_id on organisation.unitdependency_view (id);

--obstacle.verticalstructurelightingstatus_view

drop view if exists obstacle.verticalstructurelightingstatus_view cascade;
create view obstacle.verticalstructurelightingstatus_view as
select
    obstacle.verticalstructurelightingstatus_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    obstacle.verticalstructurelightingstatus_o.status,
    obstacle.verticalstructurelightingstatus_o.statusnilreason
from obstacle.verticalstructurelightingstatus_p 
inner join aixm.aixm_property on obstacle.verticalstructurelightingstatus_p.hjid = aixm.aixm_property.hjid
inner join obstacle.verticalstructurelightingstatus_o on obstacle.verticalstructurelightingstatus_p.verticalstructurelightingstatus_hjid = obstacle.verticalstructurelightingstatus_o.hjid
inner join aixm.aixm_object on obstacle.verticalstructurelightingstatus_o.hjid = aixm.aixm_object.hjid
;
create index if not exists obstacle_verticalstructurelightingstatus_id on obstacle.verticalstructurelightingstatus_view (id);

--obstacle.verticalstructurepart_view

drop view if exists obstacle.verticalstructurepart_view cascade;
create view obstacle.verticalstructurepart_view as
select
    obstacle.verticalstructurepart_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    obstacle.verticalstructurepart_o.type,
    obstacle.verticalstructurepart_o.typenilreason,
    obstacle.verticalstructurepart_o.constructionstatus,
    obstacle.verticalstructurepart_o.constructionstatusnilreason,
    obstacle.verticalstructurepart_o.markingpattern,
    obstacle.verticalstructurepart_o.markingpatternnilreason,
    obstacle.verticalstructurepart_o.markingfirstcolour,
    obstacle.verticalstructurepart_o.markingfirstcolournilreason,
    obstacle.verticalstructurepart_o.markingsecondcolour,
    obstacle.verticalstructurepart_o.markingsecondcolournilreason,
    obstacle.verticalstructurepart_o.mobile,
    obstacle.verticalstructurepart_o.mobilenilreason,
    obstacle.verticalstructurepart_o.frangible,
    obstacle.verticalstructurepart_o.frangiblenilreason,
    obstacle.verticalstructurepart_o.visiblematerial,
    obstacle.verticalstructurepart_o.visiblematerialnilreason,
    obstacle.verticalstructurepart_o.designator,
    obstacle.verticalstructurepart_o.designatornilreason,
    obstacle.verticalstructurepart_o.verticalextent,
    obstacle.verticalstructurepart_o.verticalextentuom,
    obstacle.verticalstructurepart_o.verticalextentnilreason,
    obstacle.verticalstructurepart_o.verticalextentaccuracy,
    obstacle.verticalstructurepart_o.verticalextentaccuracyuom,
    obstacle.verticalstructurepart_o.verticalextentaccuracynilreason
from obstacle.verticalstructurepart_p 
inner join aixm.aixm_property on obstacle.verticalstructurepart_p.hjid = aixm.aixm_property.hjid
inner join obstacle.verticalstructurepart_o on obstacle.verticalstructurepart_p.verticalstructurepart_hjid = obstacle.verticalstructurepart_o.hjid
inner join aixm.aixm_object on obstacle.verticalstructurepart_o.hjid = aixm.aixm_object.hjid
;
create index if not exists obstacle_verticalstructurepart_id on obstacle.verticalstructurepart_view (id);

--airport_heliport.workareaactivity_view

drop view if exists airport_heliport.workareaactivity_view cascade;
create view airport_heliport.workareaactivity_view as
select
    airport_heliport.workareaactivity_p.hjid as hjid,
    aixm.aixm_property.nil_reason::text AS nilreason,
    aixm.aixm_object.id,
    aixm.aixm_object.id as object_hjid,
    airport_heliport.workareaactivity_o.isactive,
    airport_heliport.workareaactivity_o.isactivenilreason
from airport_heliport.workareaactivity_p 
inner join aixm.aixm_property on airport_heliport.workareaactivity_p.hjid = aixm.aixm_property.hjid
inner join airport_heliport.workareaactivity_o on airport_heliport.workareaactivity_p.workareaactivity_hjid = airport_heliport.workareaactivity_o.hjid
inner join aixm.aixm_object on airport_heliport.workareaactivity_o.hjid = aixm.aixm_object.hjid
;
create index if not exists airport_heliport_workareaactivity_id on airport_heliport.workareaactivity_view (id);

--property

