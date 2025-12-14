package com.aixm.delorean.core.database;

import java.time.Instant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDatabaseFunctions {

    public abstract void merge(SessionFactory sessionFactory, Object object);

    public abstract Object predicateValidTimeslice(SessionFactory sessionFactory, Instant time);
    
}