package com.aixm.delorean.core.database;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;

import com.aixm.delorean.core.log.ConsoleLogger;

public abstract class AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> {

    public abstract void getPersitedMessage(SessionFactory sessionFactory);

    public abstract void persist(ROOT message, SessionFactory sessionFactory);

    public abstract void merge(ROOT message, SessionFactory sessionFactory);

    public abstract ROOT predicateValidTimeslice(List<Long> BasicMessageMemberIds , List<Long> TimeslicePropertyIds, SessionFactory sessionFactory);

    public String inputStreamToSQL(InputStream inputStream) {
        if (inputStream == null) {
            ConsoleLogger.warn("SQL input stream is null");
            return null;
        }

        try {
            String string = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines().collect(Collectors.joining("\n"));
            return string;
        } catch (Exception e) {
            ConsoleLogger.error("Error reading SQL resource stream", e);
            return null;
        }
    }
}