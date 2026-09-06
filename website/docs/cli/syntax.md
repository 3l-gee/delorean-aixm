# Syntax

YAML workflow files contain four parts, ensuring optimal configuration of all required settings.

```yaml
name: <string>            # optional, defaults to "Unnamed Workflow"
logging: <object|string>  # optional
service: <object>         # optional
containers: [ ... ]       # optional list of container definitions
pipeline: [ ... ]         # ordered list of pipeline steps
```

## `logging`

Per default, `logging` is be enabled at the `INFO` level and `log_to_file` as `false`, no logs are written to files as default.
`Logging` accepts a logging level, a `log_to_file` option and a `file_path` used as logging path.
```yaml
logging:
  level: DEBUG            # default "INFO"
  log_to_file: true       # default false
  file_path: logs/delorean.log
```

## `service`

Per default `service` is configured with `worker_threads : 4`, `io_threads: 4` and `200 batch_size`. 
`worker_threads` opnes as many threads and sess

### `worker_threads`

The `worker_threads` setting dictates how many concurrent Hibernate sessions process incoming inserts/reads/updates concurrently.

 * Set this to a maximum of 2× the physical CPU core count on the host machine to prevent context-switching overhead.
 * Higher thread counts increase connection pool usage and database lock contention, spiking end-to-end insertion latency instead of improving throughput.

### `io_threads`

The `io_threads` setting determines the number of concurrent, non-blocking database sessions that execute geometry rendering on unlogged staging tables through inserts.

 * Set this to a maximum of 1x the physical CPU core count allocated to the database hosting machine to prevent context-switching overhead.
 * Databases that require their displayed geometry to be re-rendered should first be over-provisioned, with only a portion of their CPU being allocated to geometry rendering. A database hosted on a single CPU will be unavailable during the rendering process.

### `batch_size`

The `batch_size` setting controls how many entities are held in the Hibernate Session state and flushed via JDBC batch statements before resetting session memory.

 * Hibernate must hold all managed entity instances in the First-Level Cache (Session memory). For complex AIXM top-level features with deep, geometry-heavy child object graphs, setting batch_size too high causes memory pressure, excessive Garbage Collection pauses, or `OutOfMemoryError` prior to the final commit.

```yaml
service:
  worker_threads: 8       # default 4
  io_threads: 4           # default 4
  batch_size: 500         # default 200
```

## `containers`

A container comprises a name, a database connection, and an AIXM message. Multiple containers can be opened simultaneously to handle different or split datasets in different ways. A database-less container can be created that only operates with AIXM message file in memory.

```yaml
containers:
  - container: main         # container name
    database:
      url: jdbc:postgresql://localhost:5432/aixm # database connection string jdbc:postgresql://<host>:<port>/<database name>
      username: delorean    # database user
      password: secret      # database password
      hbm2ddl: update       # Hibernate schema generation strategy (none, create)
```

## `pipeline`

An ordered array of steps. Every step needs an `action`, certain `action` require a `target`, some additional parameters are also required. 

```yaml
pipeline:
  - action: startup          # action name
    target: main             # target container

  - action: unmarshal        # action name
    target: main             # target container
    path: data/input.xml     # additomal attribut path

  - action: persist
    target: main

  - action: shutdown
    target: main
```

## `startup`

Initializes the target container's runtime state (Hibernate session, connection pool, etc.) so it can accept unmarshal/persist/extract calls.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `domain-check` | no | Boolean. If `true`, build postgresql domain in the database schema as part of startup. Defaults to `false`. |

```yaml
- action: startup
  target: main
  domain-check: true
```

## `shutdown`

Gracefully releases the target container's database connections and runtime resources. No additional parameters.

```yaml
- action: shutdown
  target: main
```

## `unmarshal`

Loads an AIXM XML file from disk and loads it into the target container's in-memory model, accepts `.xml` and `.zip` extension (as long as it is zipped xml file).

**Parameters**

| Key | Required | Description |
|---|---|---|
| `path` | yes | Path to the source AIXM XML file. |
| `description` | no | Free-text label recorded against this unmarshal operation. |

```yaml
- action: unmarshal
  target: main
  path: data/input.xml
  description: Initial AIP snapshot
```

## `marshal`

Serializes the target container's current in-memory model back out to an AIXM XML file, accepts `.xml` and `.zip` extension and will automatically zip the serialized AIXM message.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `path` | yes | Destination path for the output XML file. |

```yaml
- action: marshal
  target: main
  path: out/result.xml
```

## `sax_inspection`

Runs a SAX-based structural pass over the target container's loaded AIXM message and reports parsing-level issues. No additional parameters.

```yaml
- action: sax_inspection
  target: main
```

## `temporality_inspection`

Inspects the target container's AIXM message time-slice structure for temporal consistency issues (overlaps, gaps, ordering). No additional parameters.

```yaml
- action: temporality_inspection
  target: main
```

## `inspect_persisted_message`

Using the container database connection, inspects already persisted AIXM message. No additional parameters.

```yaml
- action: inspect_persisted_message
  target: main
```

## `summary_inspection`

Produces a summary inspection report (feature counts, type breakdown) for the target container AIXM message. No additional parameters.

```yaml
- action: summary_inspection
  target: main
```

## `persist`

Writes the target container's AIXM message into the database. No additional parameters.

```yaml
- action: persist
  target: main
```

## `merge`

Merges the target container's AIXM message into an persisted AIXM message using the target container database connections, matched by a field/value pair (e.g. merging by `hjid`).

This will add new timeslices to existing features, ignore old or duplicate timeslices, and add new features that have not yet been persisted in the existing message.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `field` | yes | Field name to match on (e.g. `hjid`). |
| `value` | yes | Value to match against. Integers are parsed as `int`, otherwise treated as text. |

```yaml
- action: merge
  target: main
  field: hjid
  value: 10432
```
## `diff`

Computes a diff for the target container's AIXM message and unmarshalling the output to a AIXM file at `path`. This turn a `BASELINE` AIXM message containing all the features and timeslices into a `PERMDELTA` AIXM message by keeping only the changed features. The time range is assumed to have been defined previously, either by a `predicate` or a `timeslice` action.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `path` | yes | Path to the AIXM XML file to diff against. |

```yaml
- action: diff
  target: main
  path: data/previous.xml
```

## `extract`

Extracts AIXM message from the target container matching a field/value pair, staging them for a subsequent `marshal`.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `field` | yes | Field name to match on. |
| `value` | yes | Value to match against. Integers are parsed as `int`, otherwise treated as text. |

```yaml
- action: extract
  target: main
  field: hjid
  value: 10432
```

## `predicate`

Extracts AIXM message from the target container that are active past a given timestamp, filtered further by a field/value pair.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `time` | yes | ISO-8601 timestamp (e.g. `2026-09-01T12:00:00Z`) defining the active time slice. |
| `field` | yes | Field name to match on. |
| `value` | yes | Value to match against. Integers are parsed as `int`, otherwise treated as text. |

```yaml
- action: predicate
  target: main
  time: "2026-09-01T12:00:00Z"
  field: hjid
  value: 10432
```

## `integrate`

Integrates an external `PERMDELTA` AIXM message file into the target container's AIXM message. Merges a `PERMDELTA` AIXM message into a existing Baseline that converting partial timelice into full timelices. Can then be merged into the persisted AIXM messaege.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `path` | yes | Path to the AIXM XML file to integrate. |

```yaml
- action: integrate
  target: main
  path: data/patch.xml
```

## `render`

Triggers rendering of geometry and materialized views for the target container. No additional parameters.

```yaml
- action: render
  target: main
```

## `set_status`

Sets a status flag on the target container.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `status` | yes | Status value to apply. |

```yaml
- action: set_status
  target: main
  status: ACTIVE
```

## `filter`

## `set_context`

Set a new registerd context as global context that converts gml:ID into UUID. This process allows multiple AIXM messages to coexist in the same database, mapping the same gml:ID to the same UUID using the same context.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `description` | yes | Description to set as the active context. |

```yaml
- action: set_context
  description: EAD cycle 2026-09
```

## `register_context`

Set a existing registerd context as global context that converts gml:ID into UUID. This process allows multiple AIXM messages to coexist in the same database, mapping the same gml:ID to the same UUID using the same context.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `salt` | yes | Unique key/identifier for the context. |
| `description` | yes | Description associated with the context. |

```yaml
- action: register_context
  salt: cycle-2026-09
  description: EAD cycle 2026-09
```

## `clear_contexts`

Clears all registered contexts from the processor. No additional parameters, no `target`.

```yaml
- action: clear_contexts
```

## `un_set_active_context`

Unsets the currently active context on the processor, without clearing the registered contexts. No additional parameters, no `target`.

```yaml
- action: un_set_active_context
```

## `filter`

Applies a filter to the target container's feature or time-slice model, narrowing what subsequent actions operate on.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `type` | yes | One of `feature_indentifier`, `feature_type`, `timeslice_valid_time`. |
| `nullHandling` | yes | How to treat missing/null data during evaluation (consumed by the base filter specification). |
| `evaluationType` | yes | Evaluation mode for the filter (consumed by the base filter specification). |

**Filter types**

| `type` value | Specification class | Applies to |
|---|---|---|
| `feature_indentifier` | `FeatureIdentifierSpecification` | Feature filter |
| `feature_type` | `FeatureTypeSpecification` | Feature filter |
| `timeslice_valid_time` | `TimeSliceValidTimeSpecification` | Time-slice filter |

### `feature_indentifier`

Matches features whose `gml:identifier` value is in a given list (case-insensitive).

| Key | Required | Description |
|---|---|---|
| `identifiers` | yes | Array of feature identifier strings to match against. |

```yaml
- action: filter
  target: main
  type: feature_indentifier
  nullHandling: EXCLUDE
  evaluationType: INCLUDE
  identifiers:
    - EG-RWY-0001
    - EG-RWY-0002
```

### `feature_type`

Matches features by Java class simple name is in a given list `types`.

| Key | Required | Description |
|---|---|---|
| `types` | yes | Array of feature type names (matched against `feature.getClass().getSimpleName()`, lowercased). |

```yaml
- action: filter
  target: main
  type: feature_type
  nullHandling: EXCLUDE
  evaluationType: INCLUDE
  types:
    - RunwayElement
```

### `timeslice_valid_time`

Matches time slices whose valid-time begin/end fall before, after, or at given instants. All fields are optional individually, but at least one is needed for the filter to do anything.

| Key | Required | Description |
|---|---|---|
| `beforeBegin` | no | ISO-8601 instant — valid-time begin must be strictly before this. |
| `afterBegin` | no | ISO-8601 instant — valid-time begin must be strictly after this. |
| `atBegin` | no | ISO-8601 instant — valid-time begin must equal this. |
| `beforeEnd` | no | ISO-8601 instant — valid-time end must be strictly before this. |
| `afterEnd` | no | ISO-8601 instant — valid-time end must be strictly after this. |
| `atEnd` | no | ISO-8601 instant — valid-time end must equal this. |

```yaml
- action: filter
  target: main
  type: timeslice_valid_time
  nullHandling: EXCLUDE
  evaluationType: INCLUDE
  afterBegin: "2026-01-01T00:00:00Z"
  beforeEnd: "2026-12-31T23:59:59Z"
```

## `prune`

Prunes data from one container into another, using the same filter-specification types and JSON shape as `filter` (see above) to select what gets pruned. Uses `from`/`to` instead of `target`.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `from` | yes | Name of the source container. |
| `to` | yes | Name of the destination container. |
| `type` | yes | One of `feature_indentifier`, `feature_type`, `timeslice_valid_time` — same filter types as `filter`. |
| *(additional)* | depends | Same per-type keys as `filter` (see above). |

```yaml
- action: prune
  from: staging
  to: main
  type: timeslice_valid_time
  nullHandling: EXCLUDE
  evaluationType: INCLUDE
  afterBegin: "2026-01-01T00:00:00Z"
```
## `clone`

Clones one container's state into another. Uses `from`/`to` instead of `target`.

**Parameters**

| Key | Required | Description |
|---|---|---|
| `from` | yes | Name of the container to clone into. |
| `to` | yes | Name of the container being cloned. |

```yaml
- action: clone
  from: backup
  to: main
```