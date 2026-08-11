package com.delorean.aixm.core.database;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> {

    public abstract void persistedMessageinspection(SessionFactory sessionFactory);

    public abstract void persist(ROOT message, SessionFactory sessionFactory);

    public abstract void merge(ROOT message, SessionFactory sessionFactory, Long hjid);

    public abstract ROOT predicateValidTimeslice(List<Long> BasicMessageMemberIds, List<Long> TimeslicePropertyIds, SessionFactory sessionFactory, Long hjid);

    public String inputStreamToSQL(InputStream inputStream) {
        if (inputStream == null) {
            log.warn("SQL input stream is null");
            return null;
        }

        try {
            String string = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines()
                    .collect(Collectors.joining("\n"));
            return string;
        } catch (Exception e) {
            log.error("Error reading SQL resource stream", e);
            return null;
        }
    }

    public Long getMessageHjid(SessionFactory sessionFactory, String fieldName, Object value){
        if (sessionFactory == null) {
            throw new IllegalStateException("SessionFactory must not be null");
        }
        
        try (Session session = sessionFactory.openSession()) {
            String hjidQuery = "SELECT m.hjid FROM AIXMBasicMessageType m WHERE m." + fieldName + " = :value";

            try {
                log.atDebug().setMessage("Executing query : {} with field {} and value {}").addArgument(hjidQuery).addArgument(fieldName).addArgument(value).log();
                Long hjid = session.createQuery(hjidQuery, Long.class)
                    .setParameter("value", value)
                    .uniqueResult();

                return hjid;

            } catch (NoResultException e) {
                throw new IllegalArgumentException("No AIXMBasicMessageType found with " + fieldName + " = " + value, e);

            } catch (NonUniqueResultException e) {
                throw new IllegalArgumentException("Multiple AIXMBasicMessageType instances found with " + fieldName + " = " + value, e);

            } catch (Exception e) {
                throw new RuntimeException("Error executing query for AIXMBasicMessageType with " + fieldName + " = " + value, e);

            }   

        } catch (Exception e) {
            throw new RuntimeException("Error opening session for AIXMBasicMessageType query", e);

        }
    }
}