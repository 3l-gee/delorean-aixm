# Syntax & Capabilities

## Execution modes

The CLI has exactly **one required, mutually exclusive** choice: run from a
YAML workflow file, or run a single direct command. Picocli enforces this via
an `ArgGroup` with `multiplicity = "1"` — you must supply `-y` **or** the
direct-mode option group, never both, never neither.

```
delorean-cli (-y <file> | [direct-mode options])
```

### Common flags

Since the CLI extends Picocli's `mixinStandardHelpOptions`, these are always
available:

| Flag | Description |
|---|---|
| `-h, --help` | Show help and exit |
| `-V, --version` | Print version (`0.2.0`) and exit |

!!! warning "`-h` is overloaded"
    In **Direct CLI Mode**, `-h` is redefined to mean `--host`, not
    `--help`. Use `--help` explicitly if you need the help text while also
    using direct mode flags.

---

## YAML Mode

```
delorean-cli -y workflow.yaml
delorean-cli --yaml workflow.yaml
```

The file is validated (existence check only — `validateYaml` currently
always returns `true`), parsed as YAML via Jackson, and executed section by
section as a single pipeline run.

### Top-level YAML structure

```yaml
name: <string>            # optional, defaults to "Unnamed Workflow"
logging: <object|string>  # optional
service: <object>         # optional
containers: [ ... ]       # optional list of container definitions
pipeline: [ ... ]         # ordered list of pipeline steps
```

### `logging`

Accepts either a plain string (interpreted as the level) or an object:

```yaml
logging:
  level: DEBUG            # default "INFO"
  log_to_file: true       # default false
  file_path: logs/delorean.log
```

### `service`

Feeds `GlobalDeloreanConfig`. Any field omitted keeps its existing default.

```yaml
service:
  worker_threads: 8
  io_threads: 4
  batch_size: 500
```

### `containers`

Each entry allocates a named container on the processor and (optionally)
sets its database credentials.

```yaml
containers:
  - container: main
    database:
      url: jdbc:postgresql://localhost:5432/aixm
      username: delorean
      password: secret
      hbm2ddl: update       # Hibernate schema strategy
```

A container with an empty/blank name is skipped. If `database` is omitted,
the container is created without credentials being set (you'd need to set
them via a `startup` step or beforehand).

### `pipeline`

An ordered array of steps. Every step needs an `action`; most also need a
`target` naming the container to run against.

```yaml
pipeline:
  - action: startup
    target: main
  - action: unmarshal
    target: main
    path: data/input.xml
  - action: persist
    target: main
  - action: shutdown
    target: main
```

#### Container actions (require `target`)

| Action | Required args | Notes |
|---|---|---|
| `startup` | — | Optional `domain-check: true/false` |
| `shutdown` | — | Closes DB connections for the container |
| `set_status` | `status` | |
| `unmarshal` | `path` | Optional `description` |
| `marshal` | `path` | |
| `persist` | — | |
| `merge` | `field`, `value` | `value` coerced to `int` if it's a JSON int, else text |
| `diff` | `path` | |
| `sax_inspection` | — | |
| `temporality_inspection` | — | |
| `summary_inspection` | — | |
| `inspect_persisted_message` | — | |
| `extract` | `field`, `value` | |
| `predicate` | `time`, `field`, `value` | |
| `integrate` | `path`, `field`, `value` | |
| `render` | — | |
| `filter` | `type` | Delegates to `filterAction` (subclass hook) |

An unrecognized `action` value, or a `target` container that hasn't been
declared/created, raises an `IllegalArgumentException` and aborts the run.

#### Global actions (no `target` — operate on the processor)

| Action | Required args | Notes |
|---|---|---|
| `set_context` | `description` | |
| `register_context` | `salt`, `description` | |
| `clear_contexts` | — | |
| `un_set_active_context` | — | |

#### Cross-container actions (use `from` / `to` instead of `target`)

| Action | Required args | Notes |
|---|---|---|
| `prune` | `type` | Delegates to `pruneAction` (subclass hook) |
| `clone` | — | Reassigns the local `from` reference; use with care |

```yaml
pipeline:
  - action: prune
    from: staging
    to: main
    type: expired
```

If either the `from` or `to` container name doesn't resolve to a created
container, the run aborts with an `IllegalArgumentException`.

---

## Direct CLI Mode

Skips YAML entirely: allocates one fresh container, sets its credentials,
starts it up, runs a single action, then shuts it down.

```batch
delorean-cli -h <host> -p <port> -d <dbname> -U <user> [-W] -a <action> 

[-f <file>] [--id <id>] [--time <time>]
```

### Options

| Flag | Description |
|---|---|
| `-h, --host` | Database host or socket directory |
| `-p, --port` | Database port |
| `-d, --dbname` | Database name |
| `-U, --username` | Database user |
| `-W, --password` | Prompts interactively for the password (arity `0..1`) |
| `-a, --action` | **Required.** One of `persist`, `extract`, `merge`, `prune` |
| `-f, --file` | Target data file path |
| `--id` | Entity identifier, used with `extract` |
| `--time` | Timestamp, used with `predicate`-style lookups |

### What each action actually does

The connection string is always built as
`jdbc:postgresql://<host>:<port>/<dbname>`, credentials are set with
`hbm2ddl=update`, and the container is started before the action runs.

- **`persist`** — requires `-f`; unmarshals the file into the container,
  then persists it.
- **`merge`** — requires `-f`; unmarshals the file, then persists it (same
  effective behavior as `persist` in this code path today).
- **`extract`** — requires `-f`; marshals the container to the given file,
  then extracts the record matching `--id` (matched on the `hjid` field).

!!! danger "`prune` is not wired up in Direct Mode"
    `ActionType` includes `prune`, but `executeDirectAction` only branches
    on `persist`, `merge`, `extract`, and an unreachable `predicate` case
    that isn't part of the enum. Passing `-a prune` on the command line will
    pass validation but silently do nothing beyond startup/shutdown. Use
    the `prune` pipeline action in YAML mode instead.

Any exception during direct execution is caught and reported as a fatal
execution failure; the container is not guaranteed to be cleanly shut down
in that path.

---

## Exit codes

| Code | Meaning |
|---|---|
| `0` | Success |
| `1` | Processor not initialized, YAML file missing/invalid, unknown action, or any other execution failure |
