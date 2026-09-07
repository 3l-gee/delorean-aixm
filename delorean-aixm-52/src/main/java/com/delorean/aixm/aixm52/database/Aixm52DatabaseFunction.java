package com.delorean.aixm.aixm52.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.Tuple;

import lombok.extern.slf4j.Slf4j;

import com.delorean.aixm.core.config.GlobalDeloreanConfig;
import com.delorean.aixm.core.context.ContextWarehouse;
import com.delorean.aixm.core.database.AbstractDatabaseFunctions;
import com.delorean.aixm.core.database.HibernateHelper;
import com.delorean.aixm.core.database.MessageMemberLink;
import com.delorean.aixm.core.database.MutationFeatureTimeslice;
import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.database.TimeSliceAction;
import com.delorean.aixm.core.database.BasicMessage;
import com.delorean.aixm.core.org.gml.v_3_2.StringOrRefType;

import com.delorean.aixm.aixm52.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm52.schema.AbstractAIXMObjectType;
import com.delorean.aixm.aixm52.schema.message.AIXMBasicMessageType;
import com.delorean.aixm.aixm52.schema.message.BasicMessageMemberAIXMPropertyType;
import com.delorean.aixm.aixm52.schema.AbstractAIXMTimeSliceType;

@Slf4j
public class Aixm52DatabaseFunction extends
        AbstractDatabaseFunctions<AIXMBasicMessageType, AbstractAIXMFeatureType, AbstractAIXMTimeSliceType, AbstractAIXMObjectType> {

    private static List<String> featureList = List.of(
            "aerial_refuelling.aerialrefuelling",
            "airport_heliport.airportheliport",
            "airport_heliport.airportheliportcollocation",
            "airport_heliport.airporthotspot",
            "airport_heliport.nonmovementarea",
            "airport_heliport.surveycontrolpoint",
            "airport_heliport.waterbody",
            "airport_heliport.weathersource",
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
            "airport_heliport.airportsign",
            "airport_heliport.arrestinggear",
            "airport_heliport.runway",
            "airport_heliport.runwayblastpad",
            "airport_heliport.runwaycentrelinepoint",
            "airport_heliport.runwaydirection",
            "airport_heliport.runwayelement",
            "airport_heliport.runwayprotectarea",
            "airport_heliport.runwayvisualrangeequipment",
            "airport_heliport.visualglideslopeindicator",
            "airport_heliport.floatingdocksite",
            "airport_heliport.gangway",
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
            "navaids_point.altimetercheckpoint",
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
            "navaids_point.designatedpoint",
            "navaids_point.significantpointinairspace",
            "navaids_point.gbas",
            "navaids_point.gbasservice",
            "navaids_point.satelliteservice",
            "navaids_point.satellitesystem",
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
            "procedure.minimumaltitudearea",
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
            "route.flightrestriction",
            "rules_procedure.rulesprocedures",
            "service.aircraftgroundservice",
            "service.airportclearanceservice",
            "service.airportsuppliesservice",
            "service.airtrafficcontrolservice",
            "service.airtrafficflowmanagementservice",
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
     * 
     * @param sessionFactory The Hibernate SessionFactory to use.
     */
    @Override
    public void persistedMessageinspection(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<AIXMBasicMessageType> messages = session
                .createQuery("from AIXMBasicMessageType m", AIXMBasicMessageType.class).getResultList();
        for (AIXMBasicMessageType m : messages) {

            Long hjid = m.gethjid();
            String id = m.getId();
            String salt = m.getSalt();
            String saltDescription = m.getSaltDescription();
            StringOrRefType description = m.getDescription();
            int memberCount = m.getHasMember() != null ? m.getHasMember().size() : 0;

            log.info("HJID: {} ID: {} Members: {} Salt: {} Description: {}",
                hjid, 
                id, 
                memberCount, 
                salt != null ? salt : "N/A (Non hashed IDs)",
                description != null ? description.getValue() : "N/A");
        }

        session.close();
    }

    /**
     * Extracts a aixm basic message and all its members for a given message ID. 
     * The work is split between the message and its members, which are then subdivided into threads and batches.
     * 
     * @param messageHjid the hjid of the message to extract
     * @param sessionFactory The Hibernate SessionFactory to use
     * 
     * @return the coresponding aixm basic message 
     */
    @Override
    public AIXMBasicMessageType extract(Long messageHjid, SessionFactory sessionFactory){
        int threads = GlobalDeloreanConfig.getInstance().getService().getWorkerThreads();
        int batchSize = GlobalDeloreanConfig.getInstance().getService().getBatchSize();

        // STEP 1: Gather required info — load the root message and the ids of its members
        AIXMBasicMessageType message;
        List<Long> memberHjids;
        try (Session session = sessionFactory.openSession()) {
            message = session.find(AIXMBasicMessageType.class, messageHjid);
            if (message == null) {
                return null;
            }

            memberHjids = session.createNativeQuery(
                    "SELECT member_hjid FROM aixm.message_member_link WHERE message_hjid = :messageHjid",
                    Long.class)
                .setParameter("messageHjid", messageHjid)
                .getResultList();
        }

        log.atDebug().setMessage("Extracting Message hjid={} with {} member(s)")
            .addArgument(() -> messageHjid)
            .addArgument(() -> memberHjids.size())
            .log();

        ConsoleLogger.startProgress("Extracting", memberHjids.size());

        if (memberHjids.isEmpty()) {
            message.setHasMember(new ArrayList<>());
            ConsoleLogger.stopProgress();
            return message;
        }

        // STEP 2: Prepare thread pool and work — one batch of BATCH_SIZE ids per queue entry
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        Queue<List<Long>> batchQueue = new ConcurrentLinkedQueue<>(partitionFixedSize(memberHjids, batchSize));
        Map<Long, BasicMessageMemberAIXMPropertyType> byId = new ConcurrentHashMap<>(memberHjids.size());

        log.atDebug().setMessage("Extracting Message hjid={} through {} thread(s) for {} batches")
            .addArgument(() -> messageHjid)
            .addArgument(() -> threads)
            .addArgument(() -> batchQueue.size())
            .log();
        
        try {
            // STEP 3: Delegate work to threads — each thread drains batches until the queue is empty
            List<Future<?>> futures = new ArrayList<>();
            for (int t = 0; t < threads; t++) {
                futures.add(pool.submit(() -> extractChuck(batchQueue, sessionFactory, byId)));
            }

            for (Future<?> f : futures) {
                f.get();
            }

            // STEP 4: Build output — attach only the members that passed the filter, in original order.
            List<BasicMessageMemberAIXMPropertyType> orderedMembers = new ArrayList<>(memberHjids.size());
            for (Long id : memberHjids) {
                BasicMessageMemberAIXMPropertyType member = byId.get(id);
                if (member != null) {
                    orderedMembers.add(member);
                }
            }
            message.setHasMember(orderedMembers);
            ConsoleLogger.stopProgress();

            return message;

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("extraction interrupted", e);
        } catch (ExecutionException e) {
            throw new RuntimeException("member extraction failed", e.getCause());
        } finally {
            pool.shutdown();
        }
    }

    /**
     * Extracts a queue of list of member ids appends them to a sink
     * 
     * @param batchQueue queue of list of hjids to be extracted
     * @param sessionFactory The Hibernate SessionFactory to use
     * @param sink the thread-safe map used as a destination to collect extracted member
     */
    private void extractChuck(Queue<List<Long>> batchQueue, SessionFactory sessionFactory, Map<Long, BasicMessageMemberAIXMPropertyType> sink) {
        List<Long> batch;
        try (Session session = sessionFactory.openSession()) {
            session.setDefaultReadOnly(true);
            while ((batch = batchQueue.poll()) != null) {
                final List<Long> currentBatch = batch;

                log.atDebug().setMessage("Chuck Extracting batch={}")
                    .addArgument(() -> currentBatch)
                    .log();

                List<BasicMessageMemberAIXMPropertyType> members = session.findMultiple(BasicMessageMemberAIXMPropertyType.class, batch);
                members.forEach(m -> sink.put(m.gethjid(), m));

                session.clear();
                ConsoleLogger.incrementProgress(batch.size());
            }
        }
    }

    /**
     * Persists a aixm basic message along its associated member, metadata etc.
     * The work is split between the message and its members, which are then subdivided into threads.
     * 
     * @param message        The AIXMBasicMessageType instance to persist.
     * @param sessionFactory The Hibernate SessionFactory to use for database
     *                       operations.
     */
    @Override
    public void persist(AIXMBasicMessageType message, SessionFactory sessionFactory) {
        int threads = GlobalDeloreanConfig.getInstance().getService().getWorkerThreads();
        int batchSize = GlobalDeloreanConfig.getInstance().getService().getBatchSize();

        // STEP 1: Gather required info — persist the root message first, sequentially, to obtain its id.
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        Long messageId;
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            try {
                if (ContextWarehouse.hasActiveContext()) {
                    message.setSalt(ContextWarehouse.getActiveSalt());
                    message.setSaltDescription(ContextWarehouse.getActiveSaltDescription());
                }
                session.persist(message);
                tx.commit();
                messageId = message.gethjid();
            } catch (Exception e) {
                tx.rollback();
                throw e;
            }
        }

        log.atDebug().setMessage("Persisted root message messageId={}")
            .addArgument(() -> messageId)
            .log();

        ConsoleLogger.startProgress("Persisting", basicMessageMembers.size());

        // STEP 2: Prepare thread pool and work — split members into THREADS chunks
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        List<List<BasicMessageMemberAIXMPropertyType>> chunks = partitionFixedSize(basicMessageMembers, batchSize);

        log.atDebug().setMessage("Persisting member through {} thread(s) for {} chunk(s)")
            .addArgument(() -> threads)
            .addArgument(() -> chunks.size())
            .log();

        try {
            // STEP 3: Delegate work to threads — each thread persists its chunk, then links it to messageId
            List<Future<?>> futures = new ArrayList<>();
            for (List<BasicMessageMemberAIXMPropertyType> chunk : chunks) {
                if (chunk.isEmpty()) continue;
                futures.add(pool.submit(() -> persistChunk(chunk, messageId, sessionFactory)));
            }

            for (Future<?> f : futures) {
                f.get();
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("persist interrupted", e);
        } catch (ExecutionException e) {
            throw new RuntimeException("member persist failed", e.getCause());
        } finally {
            pool.shutdown();
        }

        ConsoleLogger.stopProgress();
    }

    /**
     * Persists a list of member and links them to a aixm message
     * 
     * @param chunk List of message member to persisit
     * @param messageHjid message hjid id to link to
     * @param sessionFactory The Hibernate SessionFactory to use
     */
    private void persistChunk(List<BasicMessageMemberAIXMPropertyType> chunk, Long messageHjid, SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            try {
                int i = 0;
                log.atDebug().setMessage("Chuck Persisting member chunck {}")
                    .addArgument(() -> chunk.size())
                    .log();

                for (BasicMessageMemberAIXMPropertyType bmm : chunk) {

                    session.persist(bmm);
                    ConsoleLogger.incrementProgress(1);

                    if (++i % 50 == 0) {
                        session.flush();
                        session.clear();
                    }
                }
                session.flush();

                log.atDebug().setMessage("Chuck Persisting links chunck {}")
                    .addArgument(() -> chunk.size())
                    .log();

                // pass 2: now safe to insert links — all member rows exist
                for (BasicMessageMemberAIXMPropertyType bmm : chunk) {
                    session.createNativeMutationQuery(
                            "INSERT INTO aixm.message_member_link (member_hjid, message_hjid) VALUES (:member, :message)")
                        .setParameter("message", messageHjid)
                        .setParameter("member", bmm.gethjid())
                        .executeUpdate();
                }
                session.clear();
                tx.commit();
            } catch (Exception e) {
                tx.rollback();
                throw e;
            }
        }
    }

    /**
     * Predicates an aixm message instance from the database, along with its
     * associated message member instances that are valid for a
     * given timeslice.
     * 
     * @param messageHjid The hjid of the axim message instance to retrieve.
     * @param memberHjids A list of hjid for message member instances to retrieve.
     * @param timeslicHjids  A list of hjid for timeslice properties to retrieve.
     * @param sessionFactory The Hibernate SessionFactory to use for database operations.
     * @return a extracted aixm message with the predicated content respecting the cut off date and message hjid.
     */
    @Override
    public AIXMBasicMessageType predicateValidTimeslice(List<Long> memberHjids, List<Long> timeslicHjids, SessionFactory sessionFactory, Long messageHjid) {
        int threads = GlobalDeloreanConfig.getInstance().getService().getWorkerThreads();
        int batchSize = GlobalDeloreanConfig.getInstance().getService().getBatchSize();

        // STEP 1: Gather required info — load the root message and normalize the filter ids
        long[] timesliceIdsArray = timeslicHjids != null 
                ? timeslicHjids.stream().mapToLong(Long::longValue).toArray() 
                : new long[0];

        AIXMBasicMessageType message;
        try (Session session = sessionFactory.openSession()) {
            message = session.find(AIXMBasicMessageType.class, messageHjid);
            if (message == null) {
                return null;
            }
        }

        log.atDebug().setMessage("Predicating: messageHjid={} members={} timesliceFilterIds={}")
            .addArgument(() -> messageHjid)
            .addArgument(() -> memberHjids != null ? memberHjids.size() : 0)
            .addArgument(() -> timesliceIdsArray.length)
            .log();

        ConsoleLogger.startProgress("Predicating", memberHjids.size());

        // STEP 2: Prepare thread pool and work — one batch of BATCH_SIZE ids per queue entry
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        Queue<List<Long>> batchMemberHjids = new ConcurrentLinkedQueue<>(partitionFixedSize(memberHjids, batchSize));
        Map<Long, BasicMessageMemberAIXMPropertyType> byId = new ConcurrentHashMap<>(memberHjids.size());

        log.atDebug().setMessage("Predicating member through {} thread(s) for {} chunk(s)")
            .addArgument(() -> threads)
            .addArgument(() -> batchMemberHjids.size())
            .log();

        try {
            // STEP 3: Delegate work to threads — each thread drains batches until the queue is empty
            List<Future<?>> futures = new ArrayList<>();
            for (int t = 0; t < threads; t++) {
                futures.add(pool.submit(() -> predicateChunk(batchMemberHjids, sessionFactory, timesliceIdsArray, byId)));
            }

            for (Future<?> f : futures) {
                f.get();
            }

            ConsoleLogger.stopProgress();

            // STEP 3: Build output — attach only the members that passed the filter, in original order.
            List<BasicMessageMemberAIXMPropertyType> orderedMembers = new ArrayList<>(memberHjids.size());
            for (Long id : memberHjids) {
                BasicMessageMemberAIXMPropertyType member = byId.get(id);
                if (member != null) {
                    orderedMembers.add(member);
                }
            }
            message.setHasMember(orderedMembers);

            return message;

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("predicating interrupted", e);
        } catch (ExecutionException e) {
            throw new RuntimeException("member predicating failed", e.getCause());
        } finally {
            pool.shutdown();
        }
    }

    /**
     * Predicates a queue of list of member and links them to a aixm message
     * 
     * @param memberHjids A queue of a list of memebers hjids
     * @param sessionFactory The Hibernate SessionFactory to use for database operations.
     * @param timesliceHjids A list of hjid for timeslice properties to retrieve.
     * @param sink the thread-safe map used as a destination to collect predicated member
     */
    private void predicateChunk(Queue<List<Long>> memberHjids, SessionFactory sessionFactory, long[] timesliceHjids, Map<Long, BasicMessageMemberAIXMPropertyType> sink) {
        List<Long> batch;
        try (Session session = sessionFactory.openSession()) {
            session.setDefaultReadOnly(true);
            while ((batch = memberHjids.poll()) != null) {
                final List<Long> currentBatch = batch;
                session.enableFilter("TPHjidFilter").setParameter("ids", timesliceHjids);

                log.atDebug().setMessage("Chuck Predicating member batch={} and timeslice={}")
                    .addArgument(() -> currentBatch)
                    .addArgument(() -> timesliceHjids)
                    .log();

                List<BasicMessageMemberAIXMPropertyType> members = session
                    .createQuery("from BasicMessageMemberAIXMPropertyType m where m.hjid in :ids",
                            BasicMessageMemberAIXMPropertyType.class)
                    .setParameter("ids", batch)
                    .setReadOnly(true)
                    .getResultList();

                members.forEach(m -> sink.put(m.gethjid(), m));

                session.clear();
                ConsoleLogger.incrementProgress(batch.size());
            }
        }
    }

    /**
     * Merges an aixm message with the existing data into another already persirted aixm message.
     * The merge follows aixm timeslice logic by adding new features (if indentifier not present) and merges the timeslices for existing features.
     * 
     * @param message The aixm message to merge.
     * @param sessionFactory The Hibernate SessionFactory to use for database operations.
     * @param messageHjid The hjid of the axim message instance to merge into.
     */
    @Override
    public void merge(AIXMBasicMessageType message, SessionFactory sessionFactory, Long messageHjid) {
        int threads = GlobalDeloreanConfig.getInstance().getService().getWorkerThreads();
        int batchSize = GlobalDeloreanConfig.getInstance().getService().getBatchSize();

        // STEP 1: Gather required info — pull incoming members off the message, and load the
        List<BasicMessageMemberAIXMPropertyType> basicMessageMembers = message.getHasMember();
        message.unsetHasMember();

        List<MutationFeatureTimeslice> mutationFeatureTimeslices;
        try (Session session = sessionFactory.openSession()) {
            mutationFeatureTimeslices = Aixm52DatabaseFunction.generateTimesliceAction(session, featureList, messageHjid);
        }

        Map<String, MutationFeatureTimeslice> byIdentifier = mutationFeatureTimeslices.stream()
        .collect(Collectors.toMap(MutationFeatureTimeslice::getIdentifier, f -> f, (a, b) -> a));

        log.atDebug().setMessage("Merging in messageHjid={} with Members {} and Timeslices {}")
            .addArgument(() -> messageHjid)
            .addArgument(() -> basicMessageMembers.size())
            .addArgument(() -> mutationFeatureTimeslices.size())
            .log();

        ConsoleLogger.startProgress("Merging", basicMessageMembers.size() + mutationFeatureTimeslices.size());

        // PHASE 1: merge each incoming member against its current timeslice
        ExecutorService mergePool = Executors.newFixedThreadPool(threads);
        List<List<BasicMessageMemberAIXMPropertyType>> memberChunks = partitionFixedSize(basicMessageMembers, batchSize);

        log.atDebug().setMessage("Merging through {} thread(s) for {} member insert chunk(s)")
            .addArgument(() -> threads)
            .addArgument(() -> memberChunks.size())
            .log();
        
        try {   
            List<Future<?>> futures = new ArrayList<>();
            for (List<BasicMessageMemberAIXMPropertyType> chunk : memberChunks) {
                if (chunk.isEmpty()) continue;
                futures.add(mergePool.submit(() -> mergeMembersChunk(chunk, byIdentifier, sessionFactory)));
            }

            for (Future<?> f : futures) {
                f.get();
            };

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("merge interrupted", e);
        } catch (ExecutionException e) {
            throw new RuntimeException("merge chunk failed", e.getCause());
        } finally {
            mergePool.shutdown();
        }

        // PHASE 2: apply the resulting mutations (new version / correction / nothing)
        ExecutorService mutationPool = Executors.newFixedThreadPool(threads);
        List<List<MutationFeatureTimeslice>> mutationChunks = partitionFixedSize(mutationFeatureTimeslices, batchSize);

        log.atDebug().setMessage("Merging through {} thread(s) for {} timeslice mutation chunk(s)")
            .addArgument(() -> threads)
            .addArgument(() -> mutationChunks.size())
            .log();

        try {
            List<Future<?>> futures = new ArrayList<>();
            for (List<MutationFeatureTimeslice> chunk : mutationChunks) {
                if (chunk.isEmpty()) continue;
                futures.add(mutationPool.submit(() -> applyMutationsChunk(chunk, sessionFactory)));
            }

            for (Future<?> f : futures) {
                f.get();
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("merge interrupted (step 4)", e);
        } catch (ExecutionException e) {
            throw new RuntimeException("merge chunk failed (step 4)", e.getCause());
        } finally {
            mutationPool.shutdown();
        }

        // PHASE 3: link every member to the message — must run after phase 1
        List<Long> memberHjids = basicMessageMembers.stream()
            .map(BasicMessageMemberAIXMPropertyType::gethjid)
            .filter(Objects::nonNull)
            .toList();

        ExecutorService linkPool = Executors.newFixedThreadPool(threads);
        List<List<Long>> linkChunks = partitionFixedSize(memberHjids, batchSize);
        
        try {
            List<Future<?>> futures = new ArrayList<>();
            for (List<Long> chunk : linkChunks) {
                if (chunk.isEmpty()) continue;
                futures.add(linkPool.submit(() -> {
                    try (Session session = sessionFactory.openSession()) {
                        Transaction tx = session.beginTransaction();
                        try {
                            for (Long memberHjid : chunk) {

                                log.atDebug().setMessage("INSERT INTO aixm.message_member_link (member_hjid, message_hjid) VALUES ({}, {})")
                                    .addArgument(() -> messageHjid)
                                    .addArgument(() ->memberHjid)
                                    .log();
                                    
                                session.createNativeMutationQuery(
                                        "INSERT INTO aixm.message_member_link (member_hjid, message_hjid) VALUES (:member, :message)")
                                    .setParameter("message", messageHjid)
                                    .setParameter("member", memberHjid)
                                    .executeUpdate();
                            }
                            tx.commit();
                        } catch (Exception e) {
                            tx.rollback();
                            throw e;
                        }
                    }
                }));
            }
            for (Future<?> f : futures) f.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("merge interrupted (phase 3)", e);
        } catch (ExecutionException e) {
            throw new RuntimeException("merge chunk failed (phase 3)", e.getCause());
        } finally {
            linkPool.shutdown();
        }

        ConsoleLogger.stopProgress();
    }

    /**
     * Merges a list of aixm member onto a persited aixm message. 
     * 
     * @param chunk List of aixm member
     * @param mutationTask A map of identifier and mutation task to be applied
     */
    private void mergeMembersChunk(List<BasicMessageMemberAIXMPropertyType> chunk, Map<String, MutationFeatureTimeslice> mutationTask, SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            try {
                int i = 0;
                for (BasicMessageMemberAIXMPropertyType bmm : chunk) {
                    AbstractAIXMFeatureType abstractFeature = bmm.getAbstractAIXMFeatureValue();
                    String identifier = abstractFeature.getIdentifier().getValue();
                    MutationFeatureTimeslice existing = mutationTask.get(identifier);
                    Aixm52DatabaseFunction.extractTimeslice(bmm, existing, session);

                    if (++i % 50 == 0) {
                        session.flush();
                        session.clear();
                    }

                    ConsoleLogger.incrementProgress(1);
                }
                session.flush();
                session.clear();
                tx.commit();
            } catch (Exception e) {
                tx.rollback();
                throw e;
            }
        }
    }

    /**
     * Apply a list of mutations to timeslices
     * 
     * @param chunk a list of mutation to feature timeslices
     * @param sessionFactory The Hibernate SessionFactory to use for database operations.
     */
    private void applyMutationsChunk(List<MutationFeatureTimeslice> chunk, SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            try {
                int i = 0;
                for (MutationFeatureTimeslice mft : chunk) {
                    if (mft != null) {
                        mft.appplyMutation(session);
                    }
                    ConsoleLogger.incrementProgress(1);

                    if (++i % 50 == 0) {
                        session.flush();
                        session.clear();
                    }
                }
                session.flush();
                session.clear();
                tx.commit();
            } catch (Exception e) {
                tx.rollback();
                throw e;
            }
        }
    }

    /**
     * Extracts the timeslice from a BasicMessageMemberAIXMPropertyType instance and
     * merges it with the existing timeslice data in the database.
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
    private static void extractTimeslice(BasicMessageMemberAIXMPropertyType basicMessageMember, MutationFeatureTimeslice existing, Session session) {
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

            Aixm52DatabaseFunction.mergeTimeSlice(ts, tsp, abstractFeature, existing, basicMessageMember,session);
        }
    }

    /**
     * Merges a new timeslice with the existing timeslice data for a feature.
     * 
     * @param timeSlice          The incoming timeslice to merge.
     * @param timeSliceProperty  The property representing the timeslice.
     * @param feature            The feature for which to merge the timeslice.
     * @param existing           The existing MutationFeatureTimeslice instance to
     *                           merge with.
     * @param basicMessageMember The BasicMessageMemberAIXMPropertyType instance
     *                           containing the feature and timeslice information.
     * @param session            The Hibernate session.
     */
    private static void mergeTimeSlice(
            AbstractAIXMTimeSliceType timeSlice,
            Object timeSliceProperty,
            AbstractAIXMFeatureType feature,
            MutationFeatureTimeslice existing,
            BasicMessageMemberAIXMPropertyType basicMessageMember,
            Session session) {
        // 1. malformed timeslice are ignored
        if (timeSlice == null) {
            throw new IllegalArgumentException("Malformed timeslice for feature [" + feature.getClass().getSimpleName() + "] : "+ feature.getIdentifier());
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
            log.atDebug().setMessage("New feature: {} with identifier: {}")
            .addArgument(() -> feature.getClass().getSimpleName())
            .addArgument(() -> feature.getIdentifier())
            .log();

            // 3. new changes are merged on the existing feature
        } else if (incomingSeq > existing.getSequenceNumber()) {
            // 3.a missing timeslice result in an error
            if (incomingSeq != existing.getSequenceNumber() + 1) {
                log.warn("Missing Timeslice for feature: {} with identifier: {} between sequence numbers: {} and {}",
                    feature.getClass().getSimpleName(),
                    feature.getIdentifier(),
                    existing.getSequenceNumber(),
                    incomingSeq);
            }
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(timeSliceProperty);
                return null;
            });
            existing.setAction(TimeSliceAction.VERSION);
            existing.setTimeSlicePropertyObject(timeSliceProperty);
            existing.setNewTimeSliceStart(timeSlice.getValidTime().getBeginPosition());
            log.atDebug().setMessage("New version for feature: {} with identifier: {}")
                .addArgument(() -> feature.getClass().getSimpleName())
                .addArgument(() -> feature.getIdentifier())
                .log();

            // 4. correction changes are merged on the existing feature
        } else if (incomingSeq == existing.getSequenceNumber() && incomingCorr > existing.getCorrectionNumber()) {
            HibernateHelper.doWithoutTransaction(session, s -> {
                s.persist(timeSliceProperty);
                return null;
            });
            existing.setAction(TimeSliceAction.CORRECTION);
            existing.setTimeSlicePropertyObject(timeSliceProperty);
            log.atDebug().setMessage("New correction for feature: {} with identifier: {}")
                .addArgument(() -> feature.getClass().getSimpleName())
                .addArgument(() -> feature.getIdentifier())
                .log();

        } else {
            existing.setAction(TimeSliceAction.NOTHING);
            log.atDebug().setMessage("No change for feature: {} with identifier: {}")
                .addArgument(() -> feature.getClass().getSimpleName())
                .addArgument(() -> feature.getIdentifier())
                .log();

        }
    }

    /**
     * Generates a list of MutationFeatureTimeslice instances representing the
     * current top timeslice for each feature in the database.
     * 
     * @param session     The Hibernate session
     * @param featureList A list of feature schema names to query for timeslice
     *                    information.
     * @return A list of MutationFeatureTimeslice instances representing the current
     *         top timeslice for each feature in the database.
     */
    private static List<MutationFeatureTimeslice> generateTimesliceAction(Session session, List<String> featureList, Long messageHjid) {
        List<MutationFeatureTimeslice> featureTimeslices = new ArrayList<>();
        for (String name : featureList) {
            String sql = Aixm52DatabaseFunction.queryValidTimeslice(name, messageHjid);
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
     * a given feature schema name. 
     * 
     * @param featureSchemaName The schema name of the feature for which to
     *                          construct the query, in the format "schema.feature".
     * @return A SQL query string to retrieve the current top timeslice information
     *         for the specified feature schema name.
     */
    private static String queryValidTimeslice(String featureSchemaName, Long messageHjid) {
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
         * aixm.message_member.feature_hjid
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
                INNER JOIN aixm.message_member ON aixm.aixm_feature.hjid = aixm.message_member.feature_hjid
                INNER JOIN aixm.message_member_link ON aixm.message_member.hjid = aixm.message_member_link.member_hjid
                INNER JOIN aixm.aixm_message ON aixm.message_member_link.message_hjid = aixm.aixm_message.hjid
                WHERE aixm.aixm_message.hjid = %5$s
                AND
                aixm.aixm_feature.lifecycle_status = 'APPROVED'
                AND
                aixm.aixm_timeslice.lifecycle_status = 'APPROVED'
                ORDER BY aixm.aixm_feature.identifier, aixm.aixm_timeslice.sequence_number DESC, aixm.aixm_timeslice.correction_number DESC;
                """
                .formatted(
                        featureTable, // %1$s
                        timeSlicePropertyTable, // %2$s
                        timeSliceTable, // %3$s
                        timeSliceTableJoinColumn, // %4$s
                        messageHjid // %5$s
                );
    }
}

