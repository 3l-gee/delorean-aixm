# Delorean-AIXM

Welcome to the documentation repository for **Delorean-AIXM**, an open-source ETL toolkit designed to process, convert, and store AIXM 5.1, 5.1.1, and 5.2 aeronautical datasets into postgresql databases thanks to the postgis extension.

AIXM is a complex schema that requires specialised software to display it. Delorean solves this issue by creating a schema-compliant database that can be queried using standard GIS tools. This abstracts the inherent structure of AIXM, rendering the complex GML geometry and building the correct timeslice structure as a time series.

## Key Features

* **Multi-Version**: Work seamlessly with datasets across AIXM 5.1, 5.1.1, and 5.2 schemas.
* **Persistence**: Load, extract, merge, and filter AIXM messages and features directly into spatial PostgreSQL tables and views.
* **OGC Geometries**: Convert complex GML structures into standard OGC geometries directly in the database.
* **CLI & SDK**: Run directly as a standalone terminal tool or integrate into Java projects as a Maven dependency.

## User system requirements

* **Java Runtime (JDK / JRE)** 21
* **PostgreSQL** 15+
* **PostGIS Extension** 3.x+

## Project layout

```text
delorean-aixm/
├── concepts/        # Architectural concepts & AIXM mappings
├── cli-manual/      # Command-line interface executable documentation
├── sdk-manual/      # Core AIXM parser & PostGIS bindings documentation
├── dev-manual/      # Developer guide & environment setup
└── roadmap/         # Future development plans & feature goals
```
