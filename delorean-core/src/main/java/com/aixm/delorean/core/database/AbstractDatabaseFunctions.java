package com.aixm.delorean.core.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDatabaseFunctions {

    public abstract void merge(SessionFactory sessionFactory, Object object);
    
}