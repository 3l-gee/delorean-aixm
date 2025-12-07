package com.aixm.delorean.core.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDatabaseHelper {

    public abstract void merge(SessionFactory sessionFactory, Session session, Object object);
    
}