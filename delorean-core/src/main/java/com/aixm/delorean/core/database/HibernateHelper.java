package com.aixm.delorean.core.database;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateHelper {

    private static final int DEFAULT_RETRIES = 3;
    private static final long RETRY_DELAY_MS = 500;

    public static <T> T doWithoutTransaction(Session session, HibernateOperation<T> operation) {
        return operation.apply(session);
    }

    public static <T> T doInTransaction(Session session, HibernateOperation<T> operation) {
        Transaction tx = null;

        try {
            tx = session.getTransaction();
            if (tx == null || !tx.isActive()) {
                tx = session.beginTransaction();
            }

            T result = operation.apply(session);

            tx.commit();
            return result;

        } catch (Exception ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw ex;
        }
    }

    public static <T> T doInTransactionWithRetry(Session session, HibernateOperation<T> op) {
        int retries = DEFAULT_RETRIES;

        while (true) {
            try {
                return doInTransaction(session, op);

            } catch (Exception ex) {

                if (!isRetryable(ex) || retries == 0) {
                    throw ex;
                }

                System.err.println("Retryable error, retrying... attempts left: " + retries);
                retries--;

                try { Thread.sleep(RETRY_DELAY_MS); }
                catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Retry interrupted", ie);
                }
            }
        }
    }

    private static boolean isRetryable(Throwable ex) {
        // Deadlock or serialization failure
        if (ex.getMessage() != null &&
            (ex.getMessage().contains("40P01") || ex.getMessage().contains("40001"))) {
            return true;
        }

        // Optimistic lock retry
        if (ex instanceof org.hibernate.StaleObjectStateException) {
            return true;
        }

        // Connection loss
        if (ex.getCause() instanceof java.net.SocketException) {
            return true;
        }

        return false;
    }

    @FunctionalInterface
    public interface HibernateOperation<T> {
        T apply(Session session);
    }
}
