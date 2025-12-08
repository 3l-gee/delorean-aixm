package com.aixm.delorean.aixm511.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
import com.aixm.delorean.core.database.MutationFeatureTimeslice;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.database.TimeSliceAction;

import jakarta.persistence.Tuple;

import com.aixm.delorean.aixm511.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm511.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;
import com.aixm.delorean.aixm511.schema.AbstractAIXMTimeSliceType;

public class Aixm511DatabaseFunction extends AbstractDatabaseFunctions {

    private static List<String> featureList = List.of(
    "aerial_refuelling.aerialrefuelling",
            "navaids_point.aeronauticalgroundlight",
            "airport_heliport.aircraftstand",
            "airport_heliport.airportheliportcollocation",
            "airport_heliport.airportheliport",
            "airport_heliport.airporthotspot",
            "airport_heliport.airportprotectionareamarking",
            "route.airspacebordercrossing",
            "airspace.airspace",
            "service.airtrafficmanagementservice",
            "airport_heliport.altimetersource",
            "navaids_point.angleindication",
            "airport_heliport.approachlightingsystem",
            "airport_heliport.apronelement",
            "airport_heliport.apronlightsystem",
            "airport_heliport.apronmarking",
            "airport_heliport.apron",
            "airport_heliport.arrestinggear",
            "procedure.arrivalleg",
            "airspace.authorityforairspace",
            "navaids_point.azimuth",
            "route.changeoverpoint",
            "navaids_point.checkpointins",
            "navaids_point.checkpointvor",
            "procedure.circlingarea",
            "airport_heliport.deicingareamarking",
            "airport_heliport.deicingarea",
            "procedure.departureleg",
            "navaids_point.designatedpoint",
            "navaids_point.directionfinder",
            "navaids_point.distanceindication",
            "navaids_point.dme",
            "navaids_point.elevation",
            "route.flightrestriction",
            "airport_heliport.floatingdocksite",
            "airspace.geoborder",
            "navaids_point.glidepath",
            "airport_heliport.guidancelinelightsystem",
            "airport_heliport.guidancelinemarking",
            "airport_heliport.guidanceline",
            "shared.holdingassessment",
            "holding.holdingpattern",
            "service.informationservice",
            "procedure.instrumentapproachprocedure",
            "navaids_point.localizer",
            "navaids_point.markerbeacon",
            "airport_heliport.markingbuoy",
            "navaids_point.navaid",
            "procedure.navigationarearestriction",
            "procedure.navigationarea",
            "navaids_point.ndb",
            "airport_heliport.nonmovementarea",
            "obstacle.obstaclearea",
            "organisation.organisationauthority",
            "airport_heliport.passengerloadingbridge",
            "service.pilotcontrolledlighting",
            "surveillance.precisionapproachradar",
            "procedure.proceduredme",
            "surveillance.radarsystem",
            "service.radiocommunicationchannel",
            "shared.radiofrequencyarea",
            "airport_heliport.road",
            "route.routedme",
            "route.routesegment",
            "route.route",
            "rules_procedure.rulesprocedures",
            "airport_heliport.runwayblastpad",
            "airport_heliport.runwaycentrelinepoint",
            "airport_heliport.runwaydirectionlightsystem",
            "airport_heliport.runwaydirection",
            "airport_heliport.runwayelement",
            "airport_heliport.runwaymarking",
            "airport_heliport.runwayprotectarealightsystem",
            "airport_heliport.runwayprotectarea",
            "airport_heliport.runway",
            "airport_heliport.runwayvisualrange",
            "procedure.safealtitudearea",
            "navaids_point.sdf",
            "airport_heliport.seaplanelandingarea",
            "airport_heliport.seaplanerampsite",
            "service.searchrescueservice",
            "navaids_point.significantpointinairspace",
            "shared.specialdate",
            "navaids_point.specialnavigationstation",
            "navaids_point.specialnavigationsystem",
            "procedure.standardinstrumentarrival",
            "procedure.standardinstrumentdeparture",
            "shared.standardlevelcolumn",
            "shared.standardlevelsector",
            "shared.standardleveltable",
            "airport_heliport.standmarking",
            "airport_heliport.surveycontrolpoint",
            "navaids_point.tacan",
            "airport_heliport.taxiholdingpositionlightsystem",
            "airport_heliport.taxiholdingpositionmarking",
            "airport_heliport.taxiholdingposition",
            "airport_heliport.taxiwayelement",
            "airport_heliport.taxiwaylightsystem",
            "airport_heliport.taxiwaymarking",
            "airport_heliport.taxiway",
            "procedure.terminalarrivalarea",
            "airport_heliport.touchdownliftofflightsystem",
            "airport_heliport.touchdownliftoffmarking",
            "airport_heliport.touchdownliftoffsafearea",
            "airport_heliport.touchdownliftoff",
            "organisation.unit",
            "holding.unplannedholding",
            "obstacle.verticalstructure",
            "airport_heliport.visualglideslopeindicator",
            "navaids_point.vor",
            "airport_heliport.workarea");

    @Override
    public void merge(SessionFactory sessionFactory, Object object) {

        if (!(object instanceof AIXMBasicMessageType)) {
        // Handle incorrect object type, e.g., throw IllegalArgumentException or log and return
            ConsoleLogger.log(LogLevel.ERROR, "Object is not an AIXMBasicMessageType: " + object.getClass().getName());
            return;
        }
        
        AIXMBasicMessageType message = (AIXMBasicMessageType) object;
        Session session = sessionFactory.openSession();
        Transaction newTimeSliceTransaction = null;
        List<MutationFeatureTimeslice> mutationFeatureTimeslices = new ArrayList<>();

        try {
            // 1. Convert to AixmBasicMesage to separet message and memeber
            List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
            message.unsetHasMember();
            newTimeSliceTransaction = session.beginTransaction();
            // 2. Persite memeberless message
            session.persist(message); 

            // 3. extract current top timeslice from db (top = last)
            mutationFeatureTimeslices.addAll(Aixm511DatabaseFunction.generateTimesliceAction(session, featureList));

            // 4. merge timeslice
            basicMessageMembers.parallelStream().forEach(bmm -> {
                try (Session threadSession = sessionFactory.openSession()) {
                    threadSession.beginTransaction();

                    AbstractAIXMFeatureType abstractFeature = bmm.getAbstractAIXMFeatureValue();
                    String identifier = abstractFeature.getId();
                    MutationFeatureTimeslice existing = mutationFeatureTimeslices.stream()
                        .filter(f -> f.getIdentifier().equals(identifier))
                        .findFirst()
                        .orElse(null);

                    Aixm511DatabaseFunction.extractTimeslice(bmm, existing, threadSession);

                    threadSession.getTransaction().commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            // 5. flush and close original session after persisting message
            session.flush();
        } catch (Exception e) {
            if (newTimeSliceTransaction != null) {
                newTimeSliceTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        Transaction oldTimesliceUpdateTransaction = null;
        try {
            // 6. Use StatelessSession for manual batch operations
            oldTimesliceUpdateTransaction = session.beginTransaction();
            for (MutationFeatureTimeslice mft : mutationFeatureTimeslices){
                if (mft != null) {
                    mft.appplyMutation(session); // << implement this
                }
            }

            oldTimesliceUpdateTransaction.commit();
            //TODO : link BasicMessageMemberAIXMPropertyType back to AIXMBasicMessageType, but how do i know to wich one ?
        } catch (Exception e) {
            if (oldTimesliceUpdateTransaction != null) {
                oldTimesliceUpdateTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static <T extends AbstractAIXMFeatureType> MutationFeatureTimeslice extractTimeslice(BasicMessageMemberAIXMPropertyType basicMessageMember, MutationFeatureTimeslice existing, Session session){

        AbstractAIXMTimeSliceType ts;
        List<Object> tsps;
        AbstractAIXMFeatureType abstractFeature = basicMessageMember.getAbstractAIXMFeatureValue(); 
        String getTimesliceMethod = "get" + abstractFeature.getClass().getSimpleName().replace("Type", "") + "TimeSlice";

		try {
			tsps = (List<Object>) abstractFeature.getClass().getMethod("getTimeSlice").invoke(abstractFeature);
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
            return existing;

        // 3. new changes are merged on the existing feature
        } else if (incomingSeq > existing.getSequenceNumber()) {
            // 3.a missing timesclice result in an error
            if (incomingSeq != existing.getSequenceNumber() + 1) {
                ConsoleLogger.log(LogLevel.WARN, "Missing Timeslice for feature [" + feature.getClass().getSimpleName() + "] : " +  existing.getIdentifier() + " between sequence numbers: " + existing.getSequenceNumber() + " and " + incomingSeq);
            }
            session.persist(tsp);
            existing.setAction(TimeSliceAction.CHANGE);
            existing.setTimeSlicePropertyObject(tsp);
            existing.setNewTimeSliceStart(ts.getValidTime().getBeginPosition());
            return existing;

        
        // 4. correction changes are merged on the existing feature
        } else if (incomingSeq == existing.getSequenceNumber() && incomingCorr > existing.getCorrectionNumber()) {
            session.persist(tsp);
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
