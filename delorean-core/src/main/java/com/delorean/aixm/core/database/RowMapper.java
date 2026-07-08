package com.delorean.aixm.core.database;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface RowMapper<R> {
    /**
     * Maps the current row of the ResultSet to an object of type T.
     * The ResultSet cursor is already positioned at the correct row.
     * @param rs The ResultSet from the executed query.
     * @return An object of type R.
     * @throws SQLException if a database access error occurs.
     */
    R mapRow(ResultSet rs) throws SQLException;
}
