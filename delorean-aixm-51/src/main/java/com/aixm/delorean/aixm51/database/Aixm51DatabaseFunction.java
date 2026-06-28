package com.aixm.delorean.aixm51.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aixm.delorean.core.context.ContextWarehouse;
import com.aixm.delorean.core.database.AbstractDatabaseFunctions;
import com.aixm.delorean.core.database.HibernateHelper;
import com.aixm.delorean.core.database.MutationFeatureTimeslice;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;
import com.aixm.delorean.core.org.gml.v_3_2.StringOrRefType;
import com.aixm.delorean.core.database.TimeSliceAction;
import com.aixm.delorean.core.database.BasicMessage;
import com.aixm.delorean.core.database.MessageMemberLink;

import jakarta.persistence.Tuple;

import com.aixm.delorean.aixm51.schema.AbstractAIXMFeatureType;
import com.aixm.delorean.aixm51.schema.AbstractAIXMObjectType;
import com.aixm.delorean.aixm51.schema.message.AIXMBasicMessageType;
import com.aixm.delorean.aixm51.schema.message.BasicMessageMemberAIXMPropertyType;
import com.aixm.delorean.aixm51.schema.AbstractAIXMTimeSliceType;

public class Aixm51DatabaseFunction extends
        AbstractDatabaseFunctions<AIXMBasicMessageType, AbstractAIXMFeatureType, AbstractAIXMTimeSliceType, AbstractAIXMObjectType> {

    private static List<String> featureList = List.of(
            "aerial_refuelling.aerialrefuelling",
            "airport_heliport.airportheliport",
            "airport_heliport.airportheliportcollocation",
            "airport_heliport.airporthotspot",
            "airport_heliport.altimetersource",
            "airport_heliport.nonmovementarea",
            "airport_heliport.surveycontrolpoint",
            "airport_heliport.workarea",
            "airport_heliport.aircraftstand",
            "airport_heliport.apron",
            "airport_heliport.apronelement",
            "airport_heliport.deicingarea",
            "airport_heliport.passengerloadingbridge",
            "airport_heliport.road",
            "airport_heliport.touchdownliftoff",
            "airport_heliport.touchdownliftoffsafearea",
            "airport_heliport.approachlightingsystem",
            "airport_heliport.apronlightsystem",
            "airport_heliport.guidancelinelightsystem",
            "airport_heliport.runwaydirectionlightsystem",
            "airport_heliport.runwayprotectarealightsystem",
            "airport_heliport.taxiholdingpositionlightsystem",
            "airport_heliport.taxiwaylightsystem",
            "airport_heliport.touchdownliftofflightsystem",
            "airport_heliport.airportprotectionareamarking",
            "airport_heliport.apronmarking",
            "airport_heliport.deicingareamarking",
            "airport_heliport.guidancelinemarking",
            "airport_heliport.runwaymarking",
            "airport_heliport.standmarking",
            "airport_heliport.taxiholdingpositionmarking",
            "airport_heliport.taxiwaymarking",
            "airport_heliport.touchdownliftoffmarking",
            "airport_heliport.arrestinggear",
            "airport_heliport.runway",
            "airport_heliport.runwayblastpad",
            "airport_heliport.runwaycentrelinepoint",
            "airport_heliport.runwaydirection",
            "airport_heliport.runwayelement",
            "airport_heliport.runwayprotectarea",
            "airport_heliport.runwayvisualrange",
            "airport_heliport.visualglideslopeindicator",
            "airport_heliport.floatingdocksite",
            "airport_heliport.markingbuoy",
            "airport_heliport.seaplanelandingarea",
            "airport_heliport.seaplanerampsite",
            "airport_heliport.guidanceline",
            "airport_heliport.taxiholdingposition",
            "airport_heliport.taxiway",
            "airport_heliport.taxiwayelement",
            "airspace.airspace",
            "airspace.authorityforairspace",
            "airspace.geoborder",
            "holding.holdingpattern",
            "holding.unplannedholding",
            "navaids_point.azimuth",
            "navaids_point.checkpointins",
            "navaids_point.checkpointvor",
            "navaids_point.directionfinder",
            "navaids_point.dme",
            "navaids_point.elevation",
            "navaids_point.glidepath",
            "navaids_point.localizer",
            "navaids_point.markerbeacon",
            "navaids_point.navaid",
            "navaids_point.ndb",
            "navaids_point.sdf",
            "navaids_point.specialnavigationstation",
            "navaids_point.specialnavigationsystem",
            "navaids_point.tacan",
            "navaids_point.vor",
            "navaids_point.angleindication",
            "navaids_point.distanceindication",
            "navaids_point.designatedpoint",
            "navaids_point.significantpointinairspace",
            "navaids_point.aeronauticalgroundlight",
            "obstacle.obstaclearea",
            "obstacle.verticalstructure",
            "organisation.organisationauthority",
            "organisation.unit",
            "procedure.instrumentapproachprocedure",
            "procedure.terminalarrivalarea",
            "procedure.circlingarea",
            "procedure.standardinstrumentarrival",
            "procedure.navigationarea",
            "procedure.standardinstrumentdeparture",
            "procedure.safealtitudearea",
            "procedure.arrivalfeederleg",
            "procedure.arrivalleg",
            "procedure.departureleg",
            "procedure.finalleg",
            "procedure.initialleg",
            "procedure.intermediateleg",
            "procedure.missedapproachleg",
            "procedure.navigationarearestriction",
            "procedure.proceduredme",
            "route.changeoverpoint",
            "route.route",
            "route.routedme",
            "route.routesegment",
            "route.airspacebordercrossing",
            "route.flightrestriction",
            "rules_procedure.rulesprocedures",
            "service.aircraftgroundservice",
            "service.airportclearanceservice",
            "service.airportsuppliesservice",
            "service.airtrafficcontrolservice",
            "service.airtrafficmanagementservice",
            "service.firefightingservice",
            "service.groundtrafficcontrolservice",
            "service.informationservice",
            "service.passengerservice",
            "service.pilotcontrolledlighting",
            "service.radiocommunicationchannel",
            "service.searchrescueservice",
            "shared.radiofrequencyarea",
            "shared.specialdate",
            "shared.standardlevelcolumn",
            "shared.standardlevelsector",
            "shared.standardleveltable",
            "shared.holdingassessment",
            "surveillance.precisionapproachradar",
            "surveillance.primarysurveillanceradar",
            "surveillance.radarsystem",
            "surveillance.secondarysurveillanceradar");

    /**
     * Gets and logs all persisted AIXMBasicMessageType instances from the database.
     * This method opens a Hibernate session, retrieves all AIXMBasicMessageType
     * instances using a simple HQL query, and iterates through the results to log
     * key properties of each message, including its HJID, ID, description, and the
     * count of its members. Finally, the session is closed to free up resources.
     * 
     * @param sessionFactory The Hibernate SessionFactory to use for database
     *                       operations.
     */
    @Override
    public void persistedMessageinspection(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<AIXMBasicMessageType> messages = session
                .createQuery("from AIXMBasicMessageType m", AIXMBasicMessageType.class).getResultList();
        for (AIXMBasicMessageType m : messages) {

            // Extracting the requested properties (adjust getters if named differently in
            // your JAXB/Entity class)
            Long hjid = m.gethjid();
            String id = m.getId();
            String salt = m.getSalt();
            String saltDescription = m.getSaltDescription();
            StringOrRefType description = m.getDescription();
            int memberCount = m.getHasMember() != null ? m.getHasMember().size() : 0;

            ConsoleLogger.info(String.format("HJID: %d | ID: %s | Members: %d | Salt: %s | Description: %s",
                    hjid, id, memberCount, salt != null ? salt : "N/A (Non hashed IDs)",
                    description != null ? description.getValue() : "N/A"));
        }

        session.close();
    }

    /**
     * Persists an AIXMBasicMessageType instance along with its associated
     * BasicMessageMemberAIXMPropertyType instances. This method first persists the
     * message itself, then iterates through the list of
     * BasicMessageMemberAIXMPropertyType instances, persisting each one and
     * creating a link between the message and its members in the database. The
     * method uses batching to optimize performance when persisting a large number
     * of members.
     * 
     * @param message        The AIXMBasicMessageType instance to persist.
     * @param sessionFactory The Hibernate SessionFactory to use for database
     *                       operations.
     */
    @Override
    public void persist(AIXMBasicMessageType message, SessionFactory sessionFactory) {
        ConsoleLogger.startProgress("Persisting", message.getHasMember().size());
        Session session = sessionFactory.openSession();
        List<MessageMemberLink> pendingLinks = new ArrayList<>();

        // 1. Convert to AixmBasicMesage to separet message and memeber
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        // 2. feature, timeslice and correction slice are merged
        Transaction mergeTransaction = session.beginTransaction();
        if (ContextWarehouse.hasActiveContext()) {
            message.setSalt(ContextWarehouse.getActiveSalt());
            message.setSaltDescription(ContextWarehouse.getActiveSaltDescription());
        }

        session.persist(message);
        Long messageId = message.gethjid();

        int i = 0;
        for (BasicMessageMemberAIXMPropertyType bmm : basicMessageMembers) {
            session.persist(bmm);

            pendingLinks.add(new MessageMemberLink(messageId, bmm.gethjid()));
            ConsoleLogger.incrementProgress(1);

            if (++i % 50 == 0) {
                session.flush();
                session.clear();
            }
        }

        session.flush();
        session.clear();

        for (MessageMemberLink link : pendingLinks) {
            session.createNativeMutationQuery(
                    "INSERT INTO aixm.message_member_link (member_hjid, message_hjid) VALUES (:member, :message)")
                    .setParameter("message", link.messageId())
                    .setParameter("member", link.memberId())
                    .executeUpdate();

        }

        mergeTransaction.commit();

        session.close();

        ConsoleLogger.stopProgress();
    }

    /**
     * Retrieves an AIXMBasicMessageType instance from the database, along with its
     * associated BasicMessageMemberAIXMPropertyType instances that are valid for a
     * given timeslice. This method uses Hibernate filters to efficiently retrieve
     * only the relevant members based on the provided BasicMessageMemberIds and
     * TimeslicePropertyIds. The method returns the AIXMBasicMessageType instance
     * with its valid members populated.
     * 
     * @param BasicMessageMemberIds A list of IDs for
     *                              BasicMessageMemberAIXMPropertyType instances to
     *                              filter by.
     * @param TimeslicePropertyIds  A list of IDs for timeslice properties to filter
     *                              by.
     * @param sessionFactory        The Hibernate SessionFactory to use for database
     *                              operations.
     * @return
     */
    @Override
    public AIXMBasicMessageType predicateValidTimeslice(List<Long> BasicMessageMemberIds,
            List<Long> TimeslicePropertyIds, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();

        session.enableFilter("TPHjidFilter").setParameterList("ids", TimeslicePropertyIds);
        session.enableFilter("BMMHjidFilter").setParameterList("ids", BasicMessageMemberIds);
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            AIXMBasicMessageType msg = session
                    .createQuery("from AIXMBasicMessageType m where m.hjid = :id", AIXMBasicMessageType.class)
                    .setParameter("id", 1L).getSingleResult();

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

    /**
     * Merges an AIXMBasicMessageType instance with the existing data in the
     * database. This method first retrieves the current top timeslice for each
     * feature from the database, then iterates through the members of the provided
     * message, comparing them with the existing timeslices to determine if they
     * represent a new version, a correction, or no change. Based on this
     * comparison, the method updates the database accordingly, either by persisting
     * new members or by applying changes to existing features. Finally, it links
     * the new BasicMessageMemberAIXMPropertyType instances to the current message
     * in the database.
     * 
     * @param message        The AIXMBasicMessageType instance to merge.
     * @param sessionFactory The Hibernate SessionFactory to use for database
     *                       operations.
     */
    @Override
    public void merge(AIXMBasicMessageType message, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<MutationFeatureTimeslice> mutationFeatureTimeslices = new ArrayList<>();

        // 1. Convert to AixmBasicMesage to separet message and memeber
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        // 2. extract current top timeslice from db (top = last)
        mutationFeatureTimeslices.addAll(Aixm51DatabaseFunction.generateTimesliceAction(session, featureList));

        ConsoleLogger.startProgress("Merging", message.getHasMember().size() + mutationFeatureTimeslices.size());

        // 3. feature, timeslice and correction slice are merged
        Transaction mergeTransaction = session.beginTransaction();
        int i = 0;
        for (BasicMessageMemberAIXMPropertyType bmm : basicMessageMembers) {
            AbstractAIXMFeatureType abstractFeature = bmm.getAbstractAIXMFeatureValue();
            String identifier = abstractFeature.getIdentifier().getValue();
            MutationFeatureTimeslice existing = mutationFeatureTimeslices.stream()
                    .filter(f -> f.getIdentifier().equals(identifier))
                    .findFirst()
                    .orElse(null);

            Aixm51DatabaseFunction.extractTimeslice(bmm, existing, session);

            ConsoleLogger.incrementProgress(1);

            if (++i % 50 == 0) {
                session.flush();
                session.clear();
            }
        }

        mergeTransaction.commit();

        // 4. Use StatelessSession for manual batch operations
        Transaction updateTransaction = session.beginTransaction();
        for (MutationFeatureTimeslice mft : mutationFeatureTimeslices) {
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
        BasicMessage result = session.createQuery(
                "SELECT new com.aixm.delorean.core.database.BasicMessage(m.hjid, m.id) FROM AIXMBasicMessageType m",
                BasicMessage.class).setMaxResults(1).getSingleResult();

        Long messageHjid = result.hjid();
        String messageId = result.id();

        List<Long> memberHjids = new ArrayList<>();
        for (BasicMessageMemberAIXMPropertyType bmm : basicMessageMembers) {
            if (bmm.gethjid() != null) {
                memberHjids.add(bmm.gethjid());
            }
        }

        for (Long memberHjid : memberHjids) {
            session.createNativeMutationQuery(
                    "INSERT INTO aixm.message_member_link (member_hjid, message_hjid) VALUES (:member, :message)")
                    .setParameter("message", messageHjid)
                    .setParameter("member", memberHjid)
                    .executeUpdate();
        }

        linkTransaction.commit();

        session.close();

        ConsoleLogger.stopProgress();
    }

    /**
     * Extracts the timeslice from a BasicMessageMemberAIXMPropertyType instance and
     * merges it with the existing timeslice data in the database. This method uses
     * reflection to access the timeslice information from the feature associated
     * with the BasicMessageMemberAIXMPropertyType, then compares it with the
     * existing timeslice data to determine if it represents a new version, a
     * correction, or no change. Based on this comparison, the method updates the
     * MutationFeatureTimeslice instance accordingly, which will later be used to
     * apply changes to the database.
     * 
     * @param <T>                The type of the feature being processed, extends
     *                           AbstractAIXMFeatureType.
     * @param basicMessageMember The BasicMessageMemberAIXMPropertyType instance
     *                           containing the feature and timeslice information to
     *                           extract and merge.
     * @param existing           The existing MutationFeatureTimeslice instance to
     *                           merge with.
     * @param session            The Hibernate session.
     * @return The updated MutationFeatureTimeslice instance.
     */
    private static <T extends AbstractAIXMFeatureType> MutationFeatureTimeslice extractTimeslice(
            BasicMessageMemberAIXMPropertyType basicMessageMember, MutationFeatureTimeslice existing, Session session) {
        AbstractAIXMTimeSliceType ts;
        List<Object> tsps = new ArrayList<>(); // Ensure tsps is a valid List
        AbstractAIXMFeatureType abstractFeature = basicMessageMember.getAbstractAIXMFeatureValue();
        String getTimesliceMethod = "get" + abstractFeature.getClass().getSimpleName().replace("Type", "")
                + "TimeSlice";

        try {
            tsps.addAll((List<Object>) abstractFeature.getClass().getMethod("getTimeSlice").invoke(abstractFeature));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(
                    "No such method: getTimeSlice for feature type: " + abstractFeature.getClass().getSimpleName(), e);
        } catch (Exception e) {
            throw new RuntimeException("Failed to access value/nilReason", e);
        }

        for (Object tsp : tsps) {
            try {
                ts = (AbstractAIXMTimeSliceType) tsp.getClass().getMethod(getTimesliceMethod).invoke(tsp);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("No such method: " + getTimesliceMethod + " for feature type: "
                        + tsp.getClass().getSimpleName(), e);
            } catch (Exception e) {
                throw new RuntimeException("Failed to access value/nilReason", e);
            }

            return Aixm51DatabaseFunction.mergeTimeSlice(ts, tsp, abstractFeature, existing, basicMessageMember,
                    session);
        }

        return existing;
    }

    /**
     * Merges a new timeslice with the existing timeslice data for a feature. This
     * method compares the sequence number and correction number of the incoming
     * timeslice with the existing timeslice data to determine if it represents a
     * new version, a correction, or no change. Based on this comparison, the method
     * updates the MutationFeatureTimeslice instance accordingly, setting the
     * appropriate action (VERSION, CORRECTION, NOTHING) and preparing it for later
     * application to the database.
     * 
     * @param timeSlice          The incoming timeslice to merge.
     * @param timeSliceProperty  The property representing the timeslice.
     * @param feature            The feature for which to merge the timeslice.
     * @param existing           The existing MutationFeatureTimeslice instance to
     *                           merge with.
     * @param basicMessageMember The BasicMessageMemberAIXMPropertyType instance
     *                           containing the feature and timeslice information.
     * @param session            The Hibernate session.
     * @return The updated MutationFeatureTimeslice instance.
     */
    private static MutationFeatureTimeslice mergeTimeSlice(
            AbstractAIXMTimeSliceType timeSlice,
            Object timeSliceProperty,
            AbstractAIXMFeatureType feature,
            MutationFeatureTimeslice existing,
            BasicMessageMemberAIXMPropertyType basicMessageMember,
            Session session) {
        // 1. malformed timeslice are ignored
        if (timeSlice == null) {
            ConsoleLogger.info("Malformed timeslice for feature [" + feature.getClass().getSimpleName() + "] : "
                    + feature.getIdentifier());
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
            ConsoleLogger.info("New feature [" + feature.getClass().getSimpleName() + "] with identifier: "
                    + feature.getIdentifier());
            return existing;

            // 3. new changes are merged on the existing feature
        } else if (incomingSeq > existing.getSequenceNumber()) {
            // 3.a missing timeslice result in an error
            if (incomingSeq != existing.getSequenceNumber() + 1) {
                ConsoleLogger.info("Missing Timeslice for feature [" + feature.getClass().getSimpleName() + "] : "
                        + existing.getIdentifier() + " between sequence numbers: " + existing.getSequenceNumber()
                        + " and " + incomingSeq);
            }
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(timeSliceProperty);
                return null;
            });
            existing.setAction(TimeSliceAction.VERSION);
            existing.setTimeSlicePropertyObject(timeSliceProperty);
            existing.setNewTimeSliceStart(timeSlice.getValidTime().getBeginPosition());
            ConsoleLogger.info("Version change for feature [" + feature.getClass().getSimpleName()
                    + "] with identifier: " + feature.getIdentifier());
            return existing;

            // 4. correction changes are merged on the existing feature
        } else if (incomingSeq == existing.getSequenceNumber() && incomingCorr > existing.getCorrectionNumber()) {
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(timeSliceProperty);
                return null;
            });
            existing.setAction(TimeSliceAction.CORRECTION);
            existing.setTimeSlicePropertyObject(timeSliceProperty);
            ConsoleLogger.info("Correction change for feature [" + feature.getClass().getSimpleName()
                    + "] with identifier: " + feature.getIdentifier());
            return existing;

        } else {
            existing.setAction(TimeSliceAction.NOTHING);
            ConsoleLogger.info("No change for feature [" + feature.getClass().getSimpleName() + "] with identifier: "
                    + feature.getIdentifier());
            return existing;

        }
    }

    /**
     * Generates a list of MutationFeatureTimeslice instances representing the
     * current top timeslice for each feature in the database. This method iterates
     * through a predefined list of feature schema names, constructs and executes a
     * SQL query to retrieve the relevant timeslice information for each feature,
     * and maps the results to MutationFeatureTimeslice instances. The resulting
     * list provides a snapshot of the current state of each feature's timeslice
     * data, which can be used for comparison during the merge process.
     * 
     * @param session     The Hibernate session
     * @param featureList A list of feature schema names to query for timeslice
     *                    information.
     * @return A list of MutationFeatureTimeslice instances representing the current
     *         top timeslice for each feature in the database.
     */
    private static List<MutationFeatureTimeslice> generateTimesliceAction(Session session, List<String> featureList) {
        List<MutationFeatureTimeslice> featureTimeslices = new ArrayList<>();
        for (String name : featureList) {
            String sql = Aixm51DatabaseFunction.queryValidTimeslice(name);
            List<Tuple> tuples = session.createNativeQuery(sql, Tuple.class).getResultList();
            featureTimeslices.addAll(tuples.stream()
                    .map(t -> new MutationFeatureTimeslice(
                            t.get("feature_id", Long.class),
                            t.get("identifier", String.class),
                            t.get("sequence_number", Long.class),
                            t.get("correction_number", Long.class),
                            t.get("timeslice_property_id", Long.class),
                            t.get("timeslice_id", Long.class),
                            name))
                    .toList());
        }

        return featureTimeslices;
    }

    /**
     * Constructs a SQL query to retrieve the current top timeslice information for
     * a given feature schema name. The query joins the relevant tables to extract
     * the feature identifier, sequence number, correction number, and associated
     * timeslice property ID for each feature instance. The results are ordered by
     * identifier and timeslice information to ensure that the top timeslice is
     * retrieved for each feature.
     * 
     * @param featureSchemaName The schema name of the feature for which to
     *                          construct the query, in the format "schema.feature".
     * @return A SQL query string to retrieve the current top timeslice information
     *         for the specified feature schema name.
     */
    private static String queryValidTimeslice(String featureSchemaName) {
        String[] parts = featureSchemaName.split("\\.");
        String schema = parts[0];
        String feature = parts[1];

        String featureTable = schema + "." + feature + "_f";
        String timeSliceTable = schema + "." + feature + "_t";
        String timeSlicePropertyTable = schema + "." + feature + "_tp";
        String timeSliceTableJoinColumn = feature + "timeslice_hjid";

        /*
         * concrete exemple with dme :
         * SELECT
         *
         * FROM aixm.aixm_feature
         * INNER JOIN navaids_point.dme_f ON aixm.aixm_feature.hjid =
         * navaids_point.dme_f.hjid
         * INNER JOIN navaids_point.dme_tp ON aixm.aixm_feature.hjid =
         * navaids_point.dme_tp.timeslice_hjid
         * INNER JOIN navaids_point.dme_t ON navaids_point.dme_tp.dmetimeslice_hjid =
         * navaids_point.dme_t.hjid
         * INNER JOIN aixm.aixm_timeslice ON navaids_point.dme_t.hjid =
         * aixm.aixm_timeslice.hjid
         * INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid =
         * aixm.message_member.feature_id
         * INNER JOIN aixm.message_member_link ON aixm.message_member.hjid =
         * aixm.message_member_link.member_hjid
         * INNER JOIN aixm.aixm_message ON aixm.message_member_link.message_hjid =
         * aixm.aixm_message.hjid
         * -- WHERE aixm.aixm_message.hjid =1
         * -- WHERE
         * -- aixm.aixm_feature.lifecycle_status = 'APPROVED'
         * -- AND
         * -- aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
         * ORDER BY aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number
         * DESC, aixm.aixm_timeslice.correction_number DESC;
         */

        return """
                SELECT DISTINCT ON (aixm.aixm_feature.identifier)
                    aixm.aixm_feature.identifier,
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
                ORDER BY aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number DESC, aixm.aixm_timeslice.correction_number DESC;
                """
                .formatted(
                        featureTable, // %1$s
                        timeSlicePropertyTable, // %2$s
                        timeSliceTable, // %3$s
                        timeSliceTableJoinColumn // %4$s
                );
    }
}
