package com.delorean.aixm.core.database;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
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

    public abstract ROOT extract(Long messageHjid, SessionFactory sessionFactory);

    public abstract void merge(ROOT message, SessionFactory sessionFactory, Long messageHjid);

    public abstract ROOT predicateValidTimeslice(List<Long> BasicMessageMemberIds, List<Long> TimeslicePropertyIds, SessionFactory sessionFactory, Long hjid);

/**
     * Reads an SQL script from an {@link InputStream} and converts its contents into a single formatted SQL String.
     *
     * @param inputStream the {@link InputStream} containing the raw SQL content; may be {@code null}
     * @return the SQL content as a {@link String}, or {@code null} if the input stream is {@code null} or an I/O error occurs
     */
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

/**
     * Retrieves the surrogate key primary key ({@code hjid}) of an {@code AIXMBasicMessageType} entity 
     * based on a specific field name and target value match.
     *
     * @param sessionFactory the Hibernate {@link SessionFactory} used to open a database session; must not be {@code null}
     * @param fieldName the entity property name to query against; must contain only alphanumeric characters, underscores, or dots
     * @param value the target value to match against the specified field
     * @return the {@link Long} primary key ({@code hjid}) corresponding to the matching entity
     * @throws IllegalStateException if {@code sessionFactory} is {@code null}
     * @throws IllegalArgumentException if {@code fieldName} contains invalid characters, if no matching entity is found,
     *                                  or if multiple matching entities exist for the given criteria
     * @throws RuntimeException if an unexpected error occurs during session management or database execution
     */
    public Long getMessageHjid(SessionFactory sessionFactory, String fieldName, Object value){
        if (sessionFactory == null) {
            throw new IllegalStateException("SessionFactory must not be null");
        }

        // Prevent HQL Injection by validating fieldName format
        if (fieldName == null || !fieldName.matches("^[a-zA-Z0-9_.]+$")) {
            throw new IllegalArgumentException("Invalid or unsafe field name provided: " + fieldName);
        }
        
        try (Session session = sessionFactory.openSession()) {
            String hjidQuery = "SELECT m.hjid FROM AIXMBasicMessageType m WHERE m." + fieldName + " = :value";

            try {
                log.atDebug().setMessage("Executing query : {} with field {} and value {}").addArgument(hjidQuery).addArgument(fieldName).addArgument(value).log();
                Long hjid = session.createQuery(hjidQuery, Long.class)
                    .setParameter("value", value)
                    .uniqueResult();

                if (hjid == null) {
                    throw new IllegalArgumentException("No AIXMBasicMessageType found with " + fieldName + " = " + value);
                }

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

/** 
     * Partitions a source {@link List} into smaller sub-lists of a fixed batch size.
     *
     * @param <T> the element type stored in the list
     * @param list the source list to partition
     * @param batchSize the maximum number of elements per partitioned sub-list
     * @return a {@link List} of sub-lists, each containing up to {@code batchSize} elements
     */
    protected static <T> List<List<T>> partitionFixedSize(List<T> list, int batchSize) {
        List<List<T>> out = new ArrayList<>();
        for (int i = 0; i < list.size(); i += batchSize) {
            out.add(list.subList(i, Math.min(list.size(), i + batchSize)));
        }
        return out;
    }
}