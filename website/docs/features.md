# Features

Delorean-AIXM provides a comprehensive open-source solution to manage the full lifecycle of aeronautical data, supporting key operations in Aeronautical Information Management (AIM).

At its core, Delorean-AIXM transforms a PostgreSQL/PostGIS database into a high-performance aeronautical database. The system’s architecture mirrors the native AIXM 5 schema directly: datasets stored on disk as XML, marshalled in Java memory, or persisted in PostgreSQL maintain an identical, unified structural hierarchy of Messages (Containers), Features and Time-Slices. Delorean containers are only a shell around a aixm message.

# Marshalling & Unmarshalling

JAXB is the I/O layer that handles the serialisation of data (unmarshalling and marshalling) between physical `.xml` file and in-memory object, This process can be performed on plain `.xml` files, compressed `.zip` archives, or remote `http/https` URLs. During parsing, incoming payloads undergo XSD schema validation to guarantee structural compliance before processing. When marshalling in-memory message containers back into standardised, the messages are serialised into well-formed AIXM GML XML packages, ready for distribution or client consumption. This process can be performed on plain `.xml` files, compressed `.zip` archives.

| Name | Description |
| ---- | ----------- |
| `unmarshal` | Loads an AIXM XML file from disk into the container's in-memory model|
| `marshal` | Serializes the container's AIXM message to an AIXM XML file |
| `integrate` | Integrates an external `PERMDELTA` AIXM message file into the container's AIXM message. Merges a `PERMDELTA` AIXM message into a existing Baseline converting partial timelice into full timelices. |
| `diff` | Computes a diff for the container's AIXM message and marshalling the output to a AIXM file at `path`. This turn a `BASELINE` AIXM message containing all the features and timeslices into a `PERMDELTA` AIXM message by keeping only the changed features and changed attributes. |

# State tranistion

Hibernate is the core database engine that manages state transitions between memory representations and PostgreSQL via parallelised batch streaming. Multiple messages can be stored together or merged into one. Incremental updates can be merged directly into existing datasets, preserving the full temporal history without the need to re-export the entire dataset. A message dataset can be extracted from the database, or predicated by taking only the valid timeslices from a persisted message. 

| Name | Description |
| ---- | ----------- |
| `persist` | Writes a container's AIXM message into the database |
| `merge` | Merges a container's AIXM message into an persisted AIXM message, matched by a field/value pair. |
| `extract` | Extracts AIXM message from the database matching a field/value pair. |
| `predicate` | Extracts AIXM message from the database with only active timeslice past a given timestamp, filtered further by a field/value pair |

# Geomtry Rendering

PostGIS is the geometry rendering engine. During parsing, Delorean-AIXM converts GML geometries into geometry fragments as PostGIS geometry types, and these fragments are then stored in the `gml` schema. The fragments are then recombined to build the full geometry: first for curves by building arcs, circles and geodesics and merging them, and then for surfaces by ordering, cutting and merging the required curves. This is achieved by writing to unlogged tables in a multithreaded way, which are then used in materialised views.

| Name | Description |
| ---- | ----------- |
| `render` | Triggers rendering of geometry and materialized views for the container.

# Initialisation

The initialisation phase prepares the PostgreSQL database for storing AIXM data. It loads the `postgis` and `uuid-ossp` extensions, builds the 17 required schemas. These 17 schemas follow the same structure as the AIXM documentation, with a few Delorean-AIXM-specific schemas.

| Name | Description |
| ---- | ----------- |
| `aerial_refuelling` | air-to-air refueling tracks, anchors, tracks, and associated restrictions.|
| `airport_heliport` | Aerodrome and heliport infrastructure, including runways, taxiways, aprons, movement areas, lighting, and ground markings. |
| `airspace ` | Structure and definitions of controlled/uncontrolled airspace, FIRs/CTRs, special use airspace (danger, restricted, prohibited), and sectorization |
| `aixm` | Core AIXM domain concepts, message, metadata, abstract feature, abstract timeslice |
| `event` | Digital NOTAM (1.0.0 not yet implemented) |
| `gml` | Geometry rendering with geometry fragment, segement, curves and surface. |
| `holding` | Holding patterns, racetrack procedures, entry sectors, speed limits, and holding facility associations. |
| `navaids_point` | En-route and terminal navigation aids (VOR, NDB, DME, ILS components) and designated fixes, waypoints, or intersections. |
| `note` | Textual annotations, remarks, operational disclaimers, and unstructured explanatory content attached to AIXM features. |
| `obstacle` | Vertical structures, buildings, terrain features, and obstacle identification surfaces (OIS) posing potential hazards to air navigation. |
| `organisation` | Authorities, service providers, unit designations, contact information, and organizational hierarchies (e.g., ATS units, AROs). |
| `procedure` | Instrument approach (IAP), departure (SID), and arrival (STAR) procedure structures, legs, segments, and minima. |
| `public` | others |
| `route` | ATS route networks, upper/lower airway segments, waypoints sequences, directionality constraints, and route availability. |
| `rules_procedure` | General flight rules, altimeter setting procedures, speed limits, noise abatement rules, and local operational regulations. |
| `service` | Aviation services provided to aircraft, including communication (COM), navigation, air traffic services (ATS), search and rescue (SAR), and weather (MET). |
| `shared` | Reusable cross-domain feature properties, contact details, schedules, operational hours, and service availability windows. |
| `surveillance` | Radar and surveillance infrastructure features, including Primary Surveillance Radar (PSR), Secondary Surveillance Radar (SSR), and Mode S/ADS-B sensors. |

In delorean-aixm, database tables are generated using a deterministic naming strategy based on the AIXM 5 temporality and schema hierarchy. Each AIXM feature, time slice, property association, and complex object is mapped to a PostgreSQL relational table whose name ends with a specific suffix indicating its structural role in the model:

| Suffix | AIXM Type | Description |
| ------ | --------- | ----------- |
| `_f` | (Feature)Type | Represents the root feature entity |
| `_tp` | (Feature)TimeSlicePropertyType | Serves as the container associating features with their temporal state history. |
| `_t` | (Feature)TimeSliceTypee | Holds the actual temporal slice and core feature attributes. |
| `_te` | (Feature)TimeSliceExtensionType | Stores custom extension elements extending a feature time slice. |
| `_p` | (Feature)PropertyType | Represents associations and complex properties referencing other features or objects. |
| `_o` | (Object)Type | Stores embedded, non-feature complex objects. |
| `_oe` | (Object)ExtensionType | Stores custom extensions attached to non-feature complex objects. |

In each table, attributes types like elevation are disolved into the main table. Additionally, each attribute is created with the correct column definition, in accordance with AIXM schemas, using custom domains. During initialisation, constraints can also be added to these domains to ensure that only valid values can be stored.

| Suffix | AIXM Type | Description |
| ------ | --------- | ----------- |
| ` ` | Value | The field holding the value |
| `uom` | Unit Of Measurement | The field holding the unit of measurement |
| `nilreason` | NilReason | When the value is nil the reason why |
| `accuracy` | Accuracy | The accuracy of the value |
| `lang` | Language | The laguage of the value |

All the tables follow the same primary key principle called `hjid`, which is created by a unique sequence called `delorean_seq_gen`. Reference Column always end up with `hjid` at the end. When two tables are linked through a join table, the join table is named after the origin table and the role of the relationship, followed by `_link`. The join table contains two columns that reference the primary key of each linked table. The join column contains the name of the originating table, and the inverse join column contains the name of the linked table. Join table Names are shortened using a phonetic acronym generator that strips vowels (except for the initial character of each word segment) while preserving consonant skeletons:

| Origin Table | Role | Join table name | Join table join column | Join table invers join column |
| -------- | --------- | ----------- | ----------- | ----------- |
| DMETimeSliceType | Annotation | `dmetmslctp_annttn_link` | `dme_t_hjid` | `annotation_hjid` |

| Name | Description |
| ---- | ----------- |
| `startup` | All of the above |

# Gml ID & oid 

In XML, relationships are established by assigning a GML ID to a target object and pointing to it from another object via an href attribute, with the exact scope and persistence of the link determined by whether the IDs and references use local, web-hosted, or universally unique identifiers.

| Identifier / Reference Pattern | Type | Scope & Description |
| :--- | :--- | :--- |
| `urn.uuid` | GML ID | Permanent identifier that uniquely identifies objects across documents. |
| `id_xxxx` | GML ID | Document ID that is only valid within the specific containing document. |
| `www...` | `href` Reference | Web-hosted reference pointing to an external GML ID. |
| `#...` | `href` Reference | Internal reference pointing to a GML ID within the same document. |
| `urn.uuid` | `href` Reference | Absolute reference pointing to a global GML ID (internal or external). |

Standard document GML IDs and their internal references pose a key technical issue: they describe permanent logical relationships using temporary IDs. Because these GML IDs are typically simple sequential numbers, they offer no built-in protection against ID collisions across different documents.

To resolve this, Delorean combines temporary GML IDs with a specific salt to generate permanent, deterministic UUIDs:

* Collision Prevention: Two separate documents using the same sequential ID (e.g., id_0001), but hashed with different salts, will produce distinct UUIDs.
* Reference Integrity: When a document references another document's GML ID, hashing the reference with the same salt produces a matching UUID, ensuring relationships remain accurate and consistent across the system.

| Name | Description |
| ---- | ----------- |
| `set_context` | Set a new registerd context as global context that converts gml:ID into UUID. |
| `register_context` | Set a existing registerd context as global context that converts gml:ID into UUID. |
| `clear_contexts` | Clears all registered contexts from the processor. |
| `un_set_active_context` | Unsets the currently active context on the processor, without clearing the registered contexts. |

The salt and decription are stored in the root aixm message table in the aixm schema.

# Validation

# Filter