# Examples

## Direct CLI Mode

### Persist a file into a fresh container

```bash
delorean-cli \
  -h localhost \
  -p 5432 \
  -d aixm \
  -U delorean \
  -a persist \
  -f data/aerodromes.xml
```

You'll be prompted interactively for the password.

### Extract a AIXM message feature by hjid

```bash
delorean-cli \
  -h localhost -p 5432 -d aixm -U delorean -W \
  -a extract \
  -f out/extracted.xml \
  --id 4457231
```

This marshals the container to `out/extracted.xml`, then extracts the
AIXM message whose `hjid` matches `--id`.

### Merge an update file

```bash
delorean-cli \
  -h db.internal -p 5432 -d aixm_prod -U etl_svc -W \
  -a merge \
  -f data/delta.xml
```

---

## YAML Mode

### Minimal single-container round trip

```yaml
name: single-container-roundtrip

containers:
  - container: main
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: create

pipeline:
  - action: startup
    target: main
  - action: unmarshal
    target: main
    path: data/input.xml
  - action: persist
    target: main
  - action: render
    target: main
```

```bash
delorean-cli -y single-container-roundtrip.yaml
```

### Minimal single-container round trip with logging

```yaml
name: single-container-roundtrip

logging:
  level: INFO
  log_to_file: true
  file_path: log/logs.txt

containers:
  - container: main
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: create

pipeline:
  - action: startup
    target: main
  - action: unmarshal
    target: main
    path: data/input.xml
  - action: persist
    target: main
  - action: render
    target: main
```

### Minimal single-container round trip with system config

```yaml
name: single-container-roundtrip

service:
  worker_threads: 16
  io_threads: 16
  batch_size: 200

containers:
  - container: main
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: create

pipeline:
  - action: startup
    target: main
  - action: unmarshal
    target: main
    path: data/input.xml
  - action: persist
    target: main
  - action: render
    target: main
```

### Startup with domain check, then extract and marshal out

```yaml
name: extract-workflow

containers:
  - container: main
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: none

pipeline:
  - action: startup
    target: main
    domain-check: true
  - action: extract
    target: main
    field: identifier
    value: a90c57de-c1bf-43a4-9d0d-f3503c4edee8
  - action: marshal
    target: main
    path: out/lfpg.xml
```

### Time-sliced predicate lookup

```yaml
name: predicate-workflow

containers:
  - container: main
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: none
    
pipeline:
  - action: startup
    target: main
  - action: predicate
    target: main
    time: "2026-01-01T00:00:00Z"   # must be a full ISO-8601 instant with offset
    field: designator
    value: RWY09L
  - action: marshal
    target: main
    path: out/lfpg.xml
```

`time` also accepts the macros `MIN` / `MAX` (case-insensitive) to pull the
earliest/latest valid timeslice without pinning to a specific instant:

```yaml
  - action: predicate
    target: main
    time: MAX
    field: designator
    value: RWY09L
```

### Integrating a delta file onto a unmarshalled message

```yaml
pipeline:
  - action: startup
    target: main
  - action: unmarshal
    target: main
    path: data/baseline.xml
  - action: integrate
    target: main
    path: data/delta.xml
  - action: persist
    target: main
  - action: render
    target: main
```

`integrate` unmarshals `path` as a standalone payload, then asks the engine
to merge it temporally onto whatever is already loaded in the container.

### Integrating a delta file onto a persisted message

```yaml
pipeline:
  - action: startup
    target: main
  - action: extract
    target: main
    field: designator
    value: RWY09L
  - action: unmarshal
    target: main
    path: data/baseline.xml
  - action: integrate
    target: main
    path: data/delta.xml
  - action: merge
    target: main
    field: designator
    value: RWY09L
  - action: shutdown
    target: main
```

`integrate` unmarshals `path` as a standalone payload, then asks the engine
to merge it temporally onto whatever is already loaded in the container.

### Context management inside a pipeline

```yaml
pipeline:
  - action: register_context
    salt: run-2026-09-01
    description: Nightly ETL batch
  - action: startup
    target: main
  - action: unmarshal
    target: main
    path: data/nightly.xml
  - action: persist
    target: main
  - action: render
    target: main
  - action: clear_contexts
```

### Multiple containers processed independently in one run

```yaml
name: multi-airport-load

containers:
  - container: lfpg
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: update
  - container: lfpo
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: update

pipeline:
  - action: startup
    target: lfpg
  - action: unmarshal
    target: lfpg
    path: data/lfpg.xml
  - action: persist
    target: lfpg
  - action: render
    target: lfpg

  - action: startup
    target: lfpo
  - action: unmarshal
    target: lfpo
    path: data/lfpo.xml
  - action: persist
    target: lfpo
  - action: render
    target: lfpo
```