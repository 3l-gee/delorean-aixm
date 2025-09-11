-- Required schema for QGIS project
CREATE SCHEMA IF NOT EXISTS qgis;

-- Stores QGIS project files, their metadata, and names
CREATE TABLE IF NOT EXISTS qgis.qgis_projects (
    name text NOT NULL PRIMARY KEY,
    metadata jsonb,
    content bytea -- Binary QGIS project file
);