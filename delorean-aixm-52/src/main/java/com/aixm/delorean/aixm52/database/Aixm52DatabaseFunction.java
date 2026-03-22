package com.aixm.delorean.aixm52.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
import com.aixm.delorean.core.database.HibernateHelper;
import com.aixm.delorean.core.database.MutationFeatureTimeslice;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.database.TimeSliceAction;
import com.aixm.delorean.core.database.BasicMessage;

import jakarta.persistence.Tuple;

import com.aixm.delorean.aixm52.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm52.schema.AbstractAIXMObjectType;
import com.aixm.delorean.aixm52.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm52.schema.message.BasicMessageMemberAIXMPropertyType;
import com.aixm.delorean.aixm52.schema.AbstractAIXMTimeSliceType;


public class Aixm52DatabaseFunction extends AbstractDatabaseFunctions<AIXMBasicMessageType, AbstractAIXMFeatureType, AbstractAIXMTimeSliceType, AbstractAIXMObjectType> {

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

        session.enableFilter("TPHjidFilter").setParameterList("ids", TimeslicePropertyIds);
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
    public void persist(AIXMBasicMessageType message, SessionFactory sessionFactory) {
        ConsoleLogger.startProgress("Persisting", message.getHasMember().size());
        Session session = sessionFactory.openSession();

        // 1. Convert to AixmBasicMesage to separet message and memeber
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        // 2. feature, timeslice and correction slice are merged
        Transaction mergeTransaction = session.beginTransaction();
        session.persist(message);

        int i = 0;
        for (BasicMessageMemberAIXMPropertyType bmm : basicMessageMembers) {
            session.persist(bmm);

            ConsoleLogger.incrementProgress(1);

            if (++i % 50 == 0) {
                session.flush();
                session.clear();
            }
        }
        mergeTransaction.commit();

        session.close();

        ConsoleLogger.stopProgress();
    }

    @Override
    public void merge(AIXMBasicMessageType message, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<MutationFeatureTimeslice> mutationFeatureTimeslices = new ArrayList<>();

        // 1. Convert to AixmBasicMesage to separet message and memeber
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        // 2. extract current top timeslice from db (top = last)
        mutationFeatureTimeslices.addAll(Aixm52DatabaseFunction.generateTimesliceAction(session, featureList));

        ConsoleLogger.startProgress("Merging", message.getHasMember().size() + mutationFeatureTimeslices.size());

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

            Aixm52DatabaseFunction.extractTimeslice(bmm, existing, session);

            ConsoleLogger.incrementProgress(1);

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

            ConsoleLogger.incrementProgress(1);

            if (++i % 50 == 0) {
                session.flush();
                session.clear();
            }
        }
        updateTransaction.commit();

        // 5. Link new BasicMessageMemberAIXMPropertyType to curent message
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
                    "INSERT INTO aixm.message_member_link (message_hjid, feature_hjid) VALUES (:msg, :feat)")
                .setParameter("msg", messageHjid)
                .setParameter("feat", featId)
                .executeUpdate();
        }

        linkTransaction.commit();

        session.close();
        
        ConsoleLogger.stopProgress();
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
            
            return Aixm52DatabaseFunction.mergeTimeSlice(ts, tsp, abstractFeature, existing, basicMessageMember, session);
        }

        return existing;
    }

    private static MutationFeatureTimeslice mergeTimeSlice(
            AbstractAIXMTimeSliceType timeSlice,
            Object timeSliceProperty,
            AbstractAIXMFeatureType feature,
            MutationFeatureTimeslice existing,
            BasicMessageMemberAIXMPropertyType basicMessageMember,
            Session session) {
        // 1. malformed timeslice are ignored
        if (timeSlice == null) {
            ConsoleLogger.log(LogLevel.WARN, "Malformed timeslice for feature [" + feature.getClass().getSimpleName() + "] : " +  feature.getIdentifier());
            return existing;
        }

        int incomingSeq = timeSlice.getSequenceNumber().intValue();
        int incomingCorr = timeSlice.getCorrectionNumber().intValue();

        // 2. new feature are persited at the basic message level
        if (existing == null) {
            session.persist(basicMessageMember);
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(basicMessageMember);
                return null;
            });
            ConsoleLogger.log(LogLevel.DEBUG, "New feature [" + feature.getClass().getSimpleName() + "] with identifier: " + feature.getIdentifier());
            return existing;

        // 3. new changes are merged on the existing feature
        } else if (incomingSeq > existing.getSequenceNumber()) {
            // 3.a missing timeslice result in an error
            if (incomingSeq != existing.getSequenceNumber() + 1) {
                ConsoleLogger.log(LogLevel.WARN, "Missing Timeslice for feature [" + feature.getClass().getSimpleName() + "] : " +  existing.getIdentifier() + " between sequence numbers: " + existing.getSequenceNumber() + " and " + incomingSeq);
            }
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(timeSliceProperty);
                return null;
            });
            existing.setAction(TimeSliceAction.VERSION);
            existing.setTimeSlicePropertyObject(timeSliceProperty);
            existing.setNewTimeSliceStart(timeSlice.getValidTime().getBeginPosition());
            ConsoleLogger.log(LogLevel.DEBUG, "Version change for feature [" + feature.getClass().getSimpleName() + "] with identifier: " + feature.getIdentifier());
            return existing;

        
        // 4. correction changes are merged on the existing feature
        } else if (incomingSeq == existing.getSequenceNumber() && incomingCorr > existing.getCorrectionNumber()) {
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(timeSliceProperty);
                return null;
            });
            existing.setAction(TimeSliceAction.CORRECTION);
            existing.setTimeSlicePropertyObject(timeSliceProperty);
            ConsoleLogger.log(LogLevel.DEBUG, "Correction change for feature [" + feature.getClass().getSimpleName() + "] with identifier: " + feature.getIdentifier());
            return existing;

        } else {
            existing.setAction(TimeSliceAction.NOTHING);
            ConsoleLogger.log(LogLevel.DEBUG, "No change for feature [" + feature.getClass().getSimpleName() + "] with identifier: " + feature.getIdentifier());
            return existing;

        }
    }

    private static List<MutationFeatureTimeslice> generateTimesliceAction(Session session, List<String> featureList){
        List<MutationFeatureTimeslice> featureTimeslices = new ArrayList<>();
        for (String name : featureList) {
            String sql = Aixm52DatabaseFunction.queryValidTimeslice(name);
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

    private static String queryValidTimeslice(String featureSchemaName) {
        String[] parts = featureSchemaName.split("\\.");
        String schema = parts[0];
        String feature = parts[1];

        String featureTable              = schema + "." + feature + "_f";
        String timeSliceTable            = schema + "." + feature + "_t";
        String timeSlicePropertyTable    = schema + "." + feature + "_tp";
        String timeSliceTableJoinColumn  = feature + "timeslice_hjid";

        /* concrete exemple with dme : 
        SELECT 
        *
        FROM aixm.aixm_feature
        INNER JOIN navaids_point.dme_f ON aixm.aixm_feature.hjid = navaids_point.dme_f.hjid
        INNER JOIN navaids_point.dme_tp ON aixm.aixm_feature.hjid = navaids_point.dme_tp.timeslice_hjid
        INNER JOIN navaids_point.dme_t ON navaids_point.dme_tp.dmetimeslice_hjid = navaids_point.dme_t.hjid
        INNER JOIN aixm.aixm_timeslice ON navaids_point.dme_t.hjid = aixm.aixm_timeslice.hjid
        */

        return """
            SELECT DISTINCT ON (aixm.aixm_feature.id)
                aixm.aixm_feature.id,
                aixm.aixm_timeslice.sequence_number,
                aixm.aixm_timeslice.correction_number,
                aixm.aixm_feature.hjid  AS feature_id,
                aixm.aixm_timeslice.hjid AS timeslice_id,
                %2$s.hjid AS timeslice_property_id
            FROM aixm.aixm_feature
            INNER JOIN %1$s ON aixm.aixm_feature.hjid = %1$s.hjid
            INNER JOIN %2$s ON aixm.aixm_feature.hjid = %2$s.timeslice_hjid
            INNER JOIN %3$s ON %2$s.%4$s = %3$s.hjid
            INNER JOIN aixm.aixm_timeslice ON %3$s.hjid = aixm.aixm_timeslice.hjid
            -- WHERE 
            -- aixm.aixm_feature.lifecycle_status = 'APPROVED' 
            -- AND 
            -- aixm.aixm_timeslice.lifecycle_status = 'APPROVED' 
            ORDER BY aixm.aixm_feature.id, aixm.aixm_timeslice.sequence_number DESC, aixm.aixm_timeslice.correction_number DESC;
            """
            .formatted(
                featureTable,             // %1$s
                timeSlicePropertyTable,   // %2$s
                timeSliceTable,           // %3$s
                timeSliceTableJoinColumn  // %4$s
            );
    }
}
