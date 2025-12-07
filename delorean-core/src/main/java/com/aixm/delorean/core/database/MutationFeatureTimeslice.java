package com.aixm.delorean.core.database;

import org.hibernate.Session;
import org.hibernate.StatelessSession;

import com.aixm.delorean.core.database.TimeSliceAction;

import java.lang.reflect.Method;
import java.time.Instant;

public class MutationFeatureTimeslice {
    private String identifier;
    private Long featureId;
    private Long sequenceNumber;
    private Long correctionNumber;

    private TimeSliceAction action;
    private Object timeSlicePropertyObject;
    private Instant newTimeSliceStart;

    private String schema;
    private String feature;

    private String timeSlice;
    private String timeSliceProperty;
    private String featureTimeSliceLink;
    private String featureType;

    private Long oldTimeSlicePropertyId;
    private Long oldTimeSliceId;

    public MutationFeatureTimeslice(Long featureId, String identifier, Long sequenceNumber, Long correctionNumber, Long TSPid, Long TSid, String featureSchemaName) {
        this.featureId = featureId;
        this.identifier = identifier;
        this.sequenceNumber = sequenceNumber;
        this.correctionNumber = correctionNumber;
        this.oldTimeSlicePropertyId = TSPid;
        this.oldTimeSliceId = TSid;
        this.action = TimeSliceAction.NOTHING;
        this.schema = featureSchemaName.split("\\.")[0];
        this.feature = featureSchemaName.split("\\.")[1];

        this.timeSlice =  feature + "_ts";
        this.timeSliceProperty = feature + "_tsp";
        this.featureTimeSliceLink = "timeslice_" + feature + "_link";
        this.featureType = feature + "type";
    }

    public Long getFeatureId(){
        return this.featureId;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }

    public Long getCorrectionNumber(){
        return this.correctionNumber;
    }

    public Long getOldTimeSlicePropertyId(){
        return this.oldTimeSlicePropertyId;
    }

    public Long getOldTimeSliceId(){
        return this.oldTimeSliceId;
    }

    public TimeSliceAction getAction(){
        return this.action;
    }

    public void setAction(TimeSliceAction action){
        this.action = action;
    }

    public Object getTimeSlicePropertyObject(){
        return this.timeSlicePropertyObject;
    }

    public void setTimeSlicePropertyObject(Object tsp){
        this.timeSlicePropertyObject = tsp;
    }

    private Long extractHjid(Object tsp) {
        try {
            Method m = tsp.getClass().getMethod("gethjid");
            return (Long) m.invoke(tsp);
        } catch (Exception e) {
            throw new RuntimeException("Cannot extract hjid from tsp of type: " + tsp.getClass(), e);
        }
    }

    public Instant getNewTimeSliceStart(){
        return this.newTimeSliceStart;
    }

    public void setNewTimeSliceStart(Instant newTSstart){
        this.newTimeSliceStart = newTSstart;
    }

    public void appplyMutationStateless(StatelessSession session){
        switch (this.action) {
            case TimeSliceAction.NEW:
            case TimeSliceAction.NOTHING:
                break;

            case TimeSliceAction.CHANGE:
                this.appendNewTSP(session, this.extractHjid(this.timeSlicePropertyObject));
                this.cutOldTSP(session);
                break;

            case TimeSliceAction.CORRECTION:
                this.appendNewTSP(session, this.extractHjid(this.timeSlicePropertyObject));
                break;
        }
    }

    public void appplyMutation(Session session){
        switch (this.action) {
            case TimeSliceAction.NEW:
                break;
            case TimeSliceAction.NOTHING:
                break;
                                
            case TimeSliceAction.CHANGE:            
                this.appendNewTSP(session, this.extractHjid(this.timeSlicePropertyObject));    
                this.cutOldTSP(session);
                break;

            case TimeSliceAction.CORRECTION:
                this.appendNewTSP(session, this.extractHjid(this.timeSlicePropertyObject));
                break;
        }
    }

    private void appendNewTSP(Session session, Long newTSPid){
        String sql = """
            INSERT INTO %1$s.%2$s (%3$s, timeslice)
            VALUES (:tspId, :featureId)
        """.formatted(this.schema, this.featureTimeSliceLink, this.featureType);

        session.createNativeMutationQuery(sql)
        .setParameter("featureId", this.featureId)
        .setParameter("tspId", newTSPid)
        .executeUpdate();
    }

    private void appendNewTSP(StatelessSession session, Long newTSPid){
        String sql = """
            INSERT INTO  %1$s.%2$s (%3$s, timeslice)
            VALUES (:tspId, :featureId)
        """.formatted(this.schema, this.featureTimeSliceLink, this.featureType);

        session.createNativeMutationQuery(sql)
        .setParameter("featureId", this.featureId)
        .setParameter("tspId", newTSPid)
        .executeUpdate();
    }

    private void cutOldTSP(Session session) {
        String sql = """
            UPDATE aixm.aixm_timeslice
            SET valid_time_end = :new_begin_position
            WHERE hjid = :time_slice_id
            """;

        session.createNativeMutationQuery(sql)
            .setParameter("new_begin_position", this.newTimeSliceStart)
            .setParameter("time_slice_id", this.oldTimeSliceId)
            .executeUpdate();
    }

    private void cutOldTSP(StatelessSession session) {
        String sql = """
            UPDATE aixm.aixm_timeslice
            SET valid_time_end = :new_begin_position
            WHERE hjid = :time_slice_id
            """;

        session.createNativeMutationQuery(sql)
            .setParameter("new_begin_position", this.newTimeSliceStart)
            .setParameter("time_slice_id", this.oldTimeSliceId)
            .executeUpdate();
    }


}
