# CLI-Manual

The `DeloreanCLI` is the command line interface for interacting with the Delorean-AIXM app. It supports three AIXM schema flavours:

* **delorean-cli-aixm51** for AIXM 5.1
* **delorean-cli-aixm511** for AIXM 5.1.1
* **delorean-cli-aixm52** for AIXM 5.2

The `DeloreanCLI` can be launched directly from the command line by executing the packaged JAR file using Java:

```batch
java -jar delorean-cli-<flavour>.jar [options] [command]
```

Replace `<flavour>` with the target schema variant (e.g., `aixm51`, `aixm511`, or `aixm52`).

Common Flags

| Flag | Description |
|---|---|
| `-h, --help` | Show help and exit |

These modules support two possible types of interaction:

## Direct CLI Mode

Connect to a single database and run one action (persist, extract, or merge, render) against a freshly allocated container.

```batch
delorean-cli -h <host> -p <port> -d <dbname> -U <user> [-W] -a <action> 
  [-f <file>] 
  [--id <id>] 
  [--time <time>]
```

| Flag | Description | Exemple |
|---|---|---|
| `-h, --host` | Database host or socket directory | `localhost` |
| `-p, --port` | Database port | `5432` |
| `-d, --dbname` | Database name | `aixm-dataset-51` |
| `-U, --username` | Database user | `postgres` |
| `-W, --password` | Prompts interactively for the password| `postgres` |
| `-a, --action` | One of `persist`, `extract`, `merge`, `predicate`, `render` | `persist` |
| `-f, --file` | Target data file path | `C:\dataset\aixm.xml` |
| `--id` | Entity identifier, used with | `31` |
| `--time` | Timestamp, used with `predicate`-style lookups | `2026-09-01T23:39:45Z` |

* **persist** : Load AIXM XML data from a file into the database.
    - requires a `--file` parameter used to load the AIXM data can be in XML or zipped XML format.
* **extract** : Extracts AIXM records from the database into an XML file.
    - requires a `--file` parameter to extract AIXM data can be in XML or zipped XML format.
* **merge** : Combine multi-temporal AIXM datasets into a single timeline.
    - requires a `--id` parameter to merge AIXM data into is the hjid of the AIXM message that has already been persisted and onto which this data shall be merged.
    - requires a `--file` parameter to load AIXM data from can be in XML or zipped XML format.
* **predicate** : Extracts AIXM records from the database using a predicate that selects active time slices and writes them into an XML file.
    - requires a `--file` parameter to extract AIXM data can be in XML or zipped XML format.
    - requires a `--id` parameter to merge AIXM data into is the hjid of the AIXM message that has already been persisted and onto which this data shall be merged.
    - requires a `--time` parameter to predicate only the timeslice that are active during and after this time period.
* **render** : Render AIXM geometry and materialised views.

## Yaml CLI Mode

Describe a complete multi-container pipeline in a workflow file, then run the entire pipeline from start to finish with a single invocation. This process can be automated as a task that runs at fixed intervals. YAML files also allow for more granular control of the app's configuration and a wider range of functions to be used in the pipeline.

```batch
java -jar delorean-cli-aixm51-0.2.0.jar --yaml file.yaml
```

The workflow file is structured as follows : 

```yaml
name: <string>            # optional, defaults to "Unnamed Workflow"
logging: <object|string>  # optional
service: <object>         # optional
containers: [ ... ]       # list of container definitions
pipeline: [ ... ]         # ordered list of pipeline steps
```

You can find a list of all the options in the yaml-syntax directory, and examples in the yaml-examples directory.