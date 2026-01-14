package com.aixm.delorean.aixm511.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.locationtech.jts.index.bintree.Root;

import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
import com.aixm.delorean.core.database.HibernateHelper;
import com.aixm.delorean.core.database.MutationFeatureTimeslice;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.database.TimeSliceAction;
import com.aixm.delorean.core.database.BasicMessage;

import jakarta.persistence.Tuple;

import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMObjectType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;


public class Aixm511DatabaseFunction extends AbstractDatabaseFunctions<AIXMBasicMessageType, AbstractAIXMFeatureType, AbstractAIXMTimeSliceType, AbstractAIXMObjectType> {

    private static List<String> featureList = List.of(
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
    );

    @Override
    public AIXMBasicMessageType predicateValidTimeslice(List<Long> BasicMessageMemberIds , List<Long> TimeslicePropertyIds, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();

        session.enableFilter("TSPHjidFilter").setParameterList("ids", TimeslicePropertyIds);
        session.enableFilter("BMMHjidFilter").setParameterList("ids", BasicMessageMemberIds);
        Transaction transaction = null; 

        try {
            transaction = session.beginTransaction();

            AIXMBasicMessageType msg = session.createQuery("from AIXMBasicMessageType m where m.hjid = :id",AIXMBasicMessageType.class).setParameter("id", 1L).getSingleResult();

            transaction.commit();
            return msg;

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public void merge(AIXMBasicMessageType message, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<MutationFeatureTimeslice> mutationFeatureTimeslices = new ArrayList<>();

        // 1. Convert to AixmBasicMesage to separet message and memeber
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        // 2. extract current top timeslice from db (top = last)
        mutationFeatureTimeslices.addAll(Aixm511DatabaseFunction.generateTimesliceAction(session, featureList));

        // 3. feature, timeslice and correction slice are merged
        Transaction mergeTransaction = session.beginTransaction();
        int i = 0;
        for (BasicMessageMemberAIXMPropertyType bmm : basicMessageMembers) {
            AbstractAIXMFeatureType abstractFeature = bmm.getAbstractAIXMFeatureValue();
            String identifier = abstractFeature.getId();
            MutationFeatureTimeslice existing = mutationFeatureTimeslices.stream()
                    .filter(f -> f.getIdentifier().equals(identifier))
                    .findFirst()
                    .orElse(null);

            Aixm511DatabaseFunction.extractTimeslice(bmm, existing, session);

            if (++i % 50 == 0) {
                session.flush();
                session.clear();
            }
        }
        mergeTransaction.commit();

        // 4. Use StatelessSession for manual batch operations
        Transaction updateTransaction = session.beginTransaction();
        for (MutationFeatureTimeslice mft : mutationFeatureTimeslices){
            if (mft != null) {
                mft.appplyMutation(session); // << implement this
            }

            if (++i % 50 == 0) {
                session.flush();
                session.clear();
            }
        }
        updateTransaction.commit();

        // 5. Link new BasicMessageMemberAIXMPropertyType to 
        Transaction linkTransaction = session.beginTransaction();
        BasicMessage result = session.createQuery("SELECT new com.aixm.delorean.core.database.BasicMessage(m.hjid, m.id) FROM AIXMBasicMessageType m", BasicMessage.class).setMaxResults(1).getSingleResult();

        Long messageHjid = result.hjid();
        String messageId = result.id();
                
        List<Long> featureHjids = new ArrayList<>();
        for (BasicMessageMemberAIXMPropertyType bmm : basicMessageMembers) {
            if (bmm.gethjid() != null) {
                featureHjids.add(bmm.gethjid());
            }
        } 

        for (Long featId : featureHjids) {
            session.createNativeMutationQuery(
                    "INSERT INTO aixm.message_member_link (message_id, feature_id) VALUES (:msg, :feat)")
                .setParameter("msg", messageHjid)
                .setParameter("feat", featId)
                .executeUpdate();
        }

        linkTransaction.commit();

        session.close();
    }

    private static <T extends AbstractAIXMFeatureType> MutationFeatureTimeslice extractTimeslice(BasicMessageMemberAIXMPropertyType basicMessageMember, MutationFeatureTimeslice existing, Session session){
        AbstractAIXMTimeSliceType ts;
        List<Object> tsps = new ArrayList<>(); // Ensure tsps is a valid List
        AbstractAIXMFeatureType abstractFeature = basicMessageMember.getAbstractAIXMFeatureValue(); 
        String getTimesliceMethod = "get" + abstractFeature.getClass().getSimpleName().replace("Type", "") + "TimeSlice";

        
		try {
            tsps.addAll((List<Object>) abstractFeature.getClass().getMethod("getTimeSlice").invoke(abstractFeature));
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("No such method: getTimeSlice for feature type: " + abstractFeature.getClass().getSimpleName(), e);
		} catch (Exception e) {
			throw new RuntimeException("Failed to access value/nilReason", e);
		}

        for (Object tsp : tsps) {
            try {
                ts = (AbstractAIXMTimeSliceType) tsp.getClass().getMethod(getTimesliceMethod).invoke(tsp);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("No such method: " + getTimesliceMethod + " for feature type: " + tsp.getClass().getSimpleName(), e);
            } catch (Exception e) {
                throw new RuntimeException("Failed to access value/nilReason", e);
            }
            
            return Aixm511DatabaseFunction.mergeTimeSlice(ts, tsp, abstractFeature, existing, basicMessageMember, session);
        }

        return existing;
    }

    private static MutationFeatureTimeslice mergeTimeSlice(
            AbstractAIXMTimeSliceType ts,
            Object tsp,
            AbstractAIXMFeatureType feature,
            MutationFeatureTimeslice existing,
            BasicMessageMemberAIXMPropertyType bmm,
            Session session) {
        // 1. malformed timeslice are ignored
        if (ts == null) {
            return existing;
        }

        int incomingSeq = ts.getSequenceNumber().intValue();
        int incomingCorr = ts.getCorrectionNumber().intValue();

        // 2. new feature are persited at the basic message level
        if (existing == null) {
            session.persist(bmm);
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(bmm);
                return null;
            });
            return existing;

        // 3. new changes are merged on the existing feature
        } else if (incomingSeq > existing.getSequenceNumber()) {
            // 3.a missing timesclice result in an error
            if (incomingSeq != existing.getSequenceNumber() + 1) {
                ConsoleLogger.log(LogLevel.WARN, "Missing Timeslice for feature [" + feature.getClass().getSimpleName() + "] : " +  existing.getIdentifier() + " between sequence numbers: " + existing.getSequenceNumber() + " and " + incomingSeq);
            }
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(tsp);
                return null;
            });
            existing.setAction(TimeSliceAction.CHANGE);
            existing.setTimeSlicePropertyObject(tsp);
            existing.setNewTimeSliceStart(ts.getValidTime().getBeginPosition());
            return existing;

        
        // 4. correction changes are merged on the existing feature
        } else if (incomingSeq == existing.getSequenceNumber() && incomingCorr > existing.getCorrectionNumber()) {
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(tsp);
                return null;
            });
            existing.setAction(TimeSliceAction.CORRECTION);
            existing.setTimeSlicePropertyObject(tsp);
            return existing;

        } else {
            existing.setAction(TimeSliceAction.NOTHING);
            return existing;

        }
    }

    private static List<MutationFeatureTimeslice> generateTimesliceAction(Session session, List<String> featureList){
        List<MutationFeatureTimeslice> featureTimeslices = new ArrayList<>();
        for (String name : featureList) {
            String sql = Aixm511DatabaseFunction.querryValidTimeslice(name);
            List<Tuple> tuples = session.createNativeQuery(sql, Tuple.class).getResultList();
            featureTimeslices.addAll(tuples.stream()
                .map(t -> new MutationFeatureTimeslice(
                    t.get("feature_id", Long.class),
                    t.get("id", String.class),
                    t.get("sequence_number", Long.class),
                    t.get("correction_number", Long.class),
                    t.get("timeslice_property_id", Long.class),
                    t.get("timeslice_id", Long.class),
                    name
                ))
                .toList());
        }

        return featureTimeslices;
    }

    private static String querryValidTimeslice(String featureSchemaName) {
        String schema = featureSchemaName.split("\\.")[0];
        String feature = featureSchemaName.split("\\.")[1];

        String timeSlice =  feature + "_ts";
        String timeSliceProperty = feature + "_tsp";
        String featureTimeSliceLink = "timeslice_" + feature + "_link";
        String featureType = feature + "type";

        String sql = """
            SELECT DISTINCT ON (aixm.aixm_feature.id)
                aixm.aixm_feature.id,
                aixm.aixm_timeslice.sequence_number as sequence_number,
                aixm.aixm_timeslice.correction_number as correction_number,
                aixm.aixm_feature.hjid as feature_id,
                aixm.aixm_timeslice.hjid as timeslice_id,
                %1$s.%2$s.hjid as timeslice_property_id
            FROM aixm.aixm_feature
            INNER JOIN %1$s.%5$s
            ON aixm.aixm_feature.hjid = %1$s.%5$s.hjid
            INNER JOIN %1$s.%4$s
            ON aixm.aixm_feature.hjid = %1$s.%4$s.timeslice
            INNER JOIN %1$s.%2$s
            ON %1$s.%4$s.%3$s = %1$s.%2$s.hjid
            INNER JOIN %1$s.%6$s
            ON %1$s.%2$s.ts_id = %1$s.%6$s.hjid
            INNER JOIN aixm.aixm_timeslice
            ON %1$s.%6$s.hjid = aixm.aixm_timeslice.hjid
            -- WHERE
            --	aixm.aixm_feature.approval_status = 'APPROVED'
            --	AND 
            --	aixm.aixm_timeslice.approval_status = 'APPROVED'
            ORDER BY id, sequence_number DESC, correction_number DESC;
        """.formatted(schema, timeSliceProperty, featureType, featureTimeSliceLink, feature, timeSlice);

        return sql;
    }
}
