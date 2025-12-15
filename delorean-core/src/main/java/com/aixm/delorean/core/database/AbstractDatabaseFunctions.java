package com.aixm.delorean.core.database;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

public abstract class AbstractDatabaseFunctions {

    public abstract void merge(SessionFactory sessionFactory, Object object);

    public abstract Object predicateValidTimeslice(SessionFactory sessionFactory, List<Long> BasicMessageMemberIds , List<Long> TimeslicePropertyIds);

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