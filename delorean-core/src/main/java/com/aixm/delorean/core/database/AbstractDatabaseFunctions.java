package com.aixm.delorean.core.database;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

public abstract class AbstractDatabaseFunctions<ROOT, FEATURE, TIMESLICE, OBJECT> {

    public abstract void getPersitedMessage(SessionFactory sessionFactory);

    public abstract void persist(ROOT message, SessionFactory sessionFactory);

    public abstract void merge(ROOT message, SessionFactory sessionFactory);

    public abstract ROOT predicateValidTimeslice(List<Long> BasicMessageMemberIds , List<Long> TimeslicePropertyIds, SessionFactory sessionFactory);

    public String inputStreamToSQL(InputStream inputStream) {
        try {
            String string = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines().collect(Collectors.joining("\n"));
            return string;
        } catch (Exception e) {
            ConsoleLogger.log(LogLevel.ERROR, "Error reading SQL resource stream", e);
            return null;
        }
    }
}