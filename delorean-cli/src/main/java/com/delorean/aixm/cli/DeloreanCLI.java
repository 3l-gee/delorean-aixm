package com.delorean.aixm.cli;

import picocli.CommandLine.ArgGroup;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;
import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;

import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import com.delorean.aixm.cli.DeloreanCLI.ActionType;
import com.delorean.aixm.core.DeloreanProcessor;
import com.delorean.aixm.core.config.GlobalDeloreanConfig;
import com.delorean.aixm.core.container.Container;
import com.delorean.aixm.core.container.ContainerWarehouse;
import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.log.LogLevel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.slf4j.MDC;
import lombok.extern.slf4j.Slf4j;


/**
 * Main Command Line Interface entry point for the Delorean AIXM, it muse be
 * used wiht wiht according AIXM schema version.
 * *
 * <p>
 * This CLI operates using two strictly mutually exclusive execution strategies
 * managed
 * by Picocli argument groups:
 * <ul>
 * <li><b>YAML Mode:</b> Takes a structural setup workflow document via
 * {@code -y} to run
 * multi-layered linear pipelines seamlessly.</li>
 * <li><b>Direct CLI Mode:</b> Grants transactional terminal access to an
 * isolated,
 * freshly allocated processing container targeting localized workflows.</li>
 * </ul>
 * * @author Raphaël Gerth
 * 
 * @version 0.2.0
 */
@Slf4j
@Command(
    mixinStandardHelpOptions = true, 
    version = "0.2.0", 
    customSynopsis = {
        "delorean-a511 --yaml <config.yaml>",
        "delorean-a511 -a <action> -f <file> -d <dbname> -U <user> [options]"
    },
    description = {
        "Process and manage AIXM 5.1.1 aviation datasets.",
        "",
        "MODES OF OPERATION:",
        "  1. Direct Command Line Mode",
        "     Execute a single action (persist, extract, merge, prune) directly.",
        "  2. YAML Workflow Mode",
        "     Run a multi-step pipeline defined in a configuration file.",
        "",
        "ACTIONS (-a, --action):",
        "  persist   Load AIXM XML data from a file into the database.",
        "  extract   Extracts AIXM records from the database into an XML file.",
        "  merge     Combine multi-temporal AIXM datasets into a single timeline.",
        "  predicate Extracts AIXM records from the database using a predicate that selects active time slices and writes them into an XML file.",
        "  render    Render AIXM geometry and materialised views.",
    }
)
public abstract class DeloreanCLI implements Callable<Integer> {

    // Global Options
    @Option(names = {"--help", "help"}, usageHelp = true, description = "Show this help message and exit.")
    boolean helpRequested;

    @Option(names = {"-v", "--version"}, versionHelp = true, description = "Show CLI and binding version information.")
    boolean versionRequested;

    @ArgGroup(multiplicity = "1")
    ExecutionMode mode;

    static class ExecutionMode {
        @ArgGroup(exclusive = false, heading = "%nWORKFLOW OPTIONS:%n")
        YamlOptions yamlMode;

        @ArgGroup(exclusive = false, heading = "%nOPTIONS:%n")
        DirectCommandOptions directCmd;
    }

    static class YamlOptions {
        @Option(names = { "-y", "--yaml" }, required = true, paramLabel = "<path>", description = "Path to YAML pipeline configuration file.")
        File yamlFile;
    }

    static class DirectCommandOptions {
        @Option(names = { "-a", "--action" }, required = true, paramLabel = "<action>", description = "Required for direct mode. Action to perform.")
        ActionType action;

        @Option(names = { "-f", "--file" }, paramLabel = "<path>", description = "Path to the input or output AIXM XML file.")
        String file;

        @Option(names = { "--id" }, paramLabel = "<gml:identifier>", description = "Filter extraction by feature UUID/ID.")
        String id;

        @Option(names = { "--time" }, paramLabel = "<timestamp>", description = {
            "Target timestamp for temporal snapshot extraction",
            "(ISO-8601, e.g., '2026-09-01T12:00:00Z')."
        })
        String time;

        @ArgGroup(exclusive = false, heading = "%nDATABASE OPTIONS:%n")
        DatabaseOptions connection;
    }

    static class DatabaseOptions {
        @Option(names = { "-h", "--host" }, paramLabel = "<host>", description = "Database server host [default: localhost].")
        String host = "localhost";

        @Option(names = { "-p", "--port" }, paramLabel = "<port>", description = "Database server port [default: 5432].")
        String port = "5432";

        @Option(names = { "-d", "--dbname" }, paramLabel = "<name>", description = "Target PostgreSQL/PostGIS database name.")
        String database;

        @Option(names = { "-U", "--username" }, paramLabel = "<user>", description = "Database user name.")
        String user;

        @Option(names = { "-W", "--password" }, paramLabel = "[<pass>]", description = "Prompt for or specify database password.", interactive = true, arity = "0..1")
        String password;
    }

    enum ActionType {
        persist, extract, merge, prune, predicate, render
    }

    protected abstract DeloreanProcessor createProcessor();

    @Override
    public Integer call() throws Exception {
        DeloreanProcessor processor = createProcessor();
        if (processor == null) {
            System.err.println("Internal Error: Processor not initialized.");
            return 1;
        }

        File yamlFile = mode.yamlMode.yamlFile;

        // Mode 1: YAML Execution Processing
        if (yamlFile != null) {
            if (!yamlFile.exists()) {
                System.err.println("Error: Configuration file not found: " + yamlFile.getAbsolutePath());
                return 1;
            }
            if (!validateYaml(yamlFile)) {
                System.err.println("Validation failures encountered. Halting execution pipeline.");
                return 1;
            }
            return executePipeline(processor, yamlFile) ? 0 : 1;
        }

        // Mode 2: Direct Command Line Restricted Execution Pathway
        if (mode.directCmd != null) {
            return executeDirectAction(processor, mode.directCmd) ? 0 : 1;
        }

        return 1;
    }

    private boolean validateYaml(File yaml) {
        return true;
    }

    private boolean executeDirectAction(DeloreanProcessor processor, DirectCommandOptions opts) {
        try {

            Container<?, ?, ?, ?, ?, ?> container = processor.createNewContainer();

            if (container == null) {
                log.error("Failed to instantiate targeted workspace container instance.");
                return false;
            }

            String dbUrl = "jdbc:postgresql://" + opts.connection.host + ":" + opts.connection.port + "/" + opts.connection.database;
            container.SetCredentials(dbUrl, opts.connection.user, opts.connection.password, "update");

            container.startup(false);

            // Synthesize programmatic arguments for matching existing switch cases
            ObjectNode syntheticArgs = JsonNodeFactory.instance.objectNode();
            if (opts.file != null)
                syntheticArgs.put("path", opts.file);
            if (opts.id != null)
                syntheticArgs.put("id", opts.id);

            String baseActionName = opts.action.name();

            // --- PRE-ACTION: Automated Unmarshalling Phase ---
            if ("persist".equals(baseActionName) || "merge".equals(baseActionName)) {
                if (opts.file == null) {
                    log.error("A source file (-f / --file) is required to unmarshal data for " + baseActionName);
                    container.shutdown();
                    return false;
                }

                container.unmarshal(opts.file, null);

                if ("persist".equals(baseActionName)) {
                    container.persist();
                }

                if ("merge".equals(baseActionName)) {
                    if (opts.id == null) {
                        log.error("A feature identifier (--id) is required to merge data for " + baseActionName);
                        container.shutdown();
                        return false;
                    }
                    container.merge("hjid", opts.id);
                }

                container.render();
            }

            // --- POST-ACTION: Automated Marshalling Phase ---
            if ("extract".equals(baseActionName) || "predicate".equals(baseActionName)) {
                if (opts.file == null) {
                    log.error("A source file (-f / --file) is required to unmarshal data for " + baseActionName);
                    container.shutdown();
                }

                if ("extract".equals(baseActionName)) {
                    container.extract("hjid", opts.id);
                }

                if ("predicate".equals(baseActionName)) {
                    if (opts.time == null) {
                        log.error("A timestamp (--time) is required to predicate data for " + baseActionName);
                        container.shutdown();
                        return false;
                    }

                    if (opts.id == null) {
                        log.error("A feature identifier (--id) is required to predicate data for " + baseActionName);
                        container.shutdown();
                        return false;
                    }
                    container.predicate(opts.time, "hjid", opts.id);
                }

                container.marshal(opts.file);
            }

            // Gracefully release DB connections upon completion
            container.shutdown();

            return true;
        } catch (Exception e) {
            System.err.println("Fatal execution failure during standalone parameter processing: " + e.getMessage());
            return false;
        }
    }

    private boolean executePipeline(DeloreanProcessor processor, File yaml) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            JsonNode rootNode = mapper.readTree(yaml);
            String name = rootNode.path("name").asText("Unnamed Workflow");

            // Access the global singleton instance
            GlobalDeloreanConfig config = GlobalDeloreanConfig.getInstance();
            // 1. Map Logging section
            JsonNode loggingNode = rootNode.path("logging");
            if (loggingNode.isObject()) {
                String logLevel = loggingNode.path("level").asText("INFO");
                boolean logToFile = loggingNode.path("log_to_file").asBoolean(false);
                String filePath = loggingNode.path("file_path").asText("logs/delorean.log");

                config.getLogging().setLevel(logLevel);
                config.getLogging().setLogToFile(logToFile);
                config.getLogging().setFilePath(filePath);
            } else if (loggingNode.isTextual()) {
                config.getLogging().setLevel(loggingNode.asText("INFO"));
            }

            // 2. Map Service section
            JsonNode serviceNode = rootNode.path("service");
            if (serviceNode.isObject()) {
                int workerThreads = serviceNode.path("worker_threads").asInt(config.getService().getWorkerThreads());
                int ioThreads = serviceNode.path("io_threads").asInt(config.getService().getIoThreads());
                int batchSize = serviceNode.path("batch_size").asInt(config.getService().getBatchSize());

                config.getService().setWorkerThreads(workerThreads);
                config.getService().setIoThreads(ioThreads);
                config.getService().setBatchSize(batchSize);
            }

            // Initialize Containers
            JsonNode containersNode = rootNode.path("containers");
            if (containersNode.isArray()) {
                for (JsonNode containerItem : containersNode) {
                    String containerName = containerItem.path("container").asText();
                    JsonNode dbNode = containerItem.path("database");

                    if (!containerName.isEmpty()) {
                        processor.createNewContainer(containerName);
                        Container<?, ?, ?, ?, ?, ?> container = processor.getContainerByName(containerName);

                        if (container != null && !dbNode.isMissingNode()) {
                            container.SetCredentials(
                                    dbNode.path("url").asText(),
                                    dbNode.path("username").asText(),
                                    dbNode.path("password").asText(),
                                    dbNode.path("hbm2ddl").asText());
                        }
                    }
                }
            }

            // Process Pipeline Steps
            JsonNode actionsNode = rootNode.path("pipeline");
            for (JsonNode actionNode : actionsNode) {
                String actionName = actionNode.path("action").asText();

                switch (actionName) {
                    case "startup":
                    case "shutdown":
                    case "unmarshal":
                    case "marshal":
                    case "persist":
                    case "merge":
                    case "diff":
                    case "sax_inspection":
                    case "summary_inspection":
                    case "temporality_inspection":
                    case "inspect_persisted_message":
                    case "extract":
                    case "predicate":
                    case "integrate":
                    case "set_status":
                    case "render":
                    case "filter":
                        String containerName = actionNode.path("target").asText();
                        Container<?, ?, ?, ?, ?, ?> container = processor.getContainerByName(containerName);
                        if (container != null) {
                            runContainerAtomicAction(container, actionName, actionNode);
                        } else {
                            throw new IllegalArgumentException("Container not found with name: " + containerName);
                        }
                        break;

                    case "set_context":
                    case "register_context":
                    case "clear_contexts":
                    case "un_set_active_context":
                        runGlobalAtomicAction(processor, actionName, actionNode);
                        break;

                    case "prune":
                    case "clone":
                        String fromContainerName = actionNode.path("from").asText();
                        String toContainerName = actionNode.path("to").asText();
                        Container<?, ?, ?, ?, ?, ?> fromContainer = processor.getContainerByName(fromContainerName);
                        Container<?, ?, ?, ?, ?, ?> toContainer = processor.getContainerByName(toContainerName);
                        if (fromContainer != null && toContainer != null) {
                            runContainerWarehouseAtomicAction(fromContainer, toContainer, actionName, actionNode);

                        } else if (fromContainer == null) {
                            throw new IllegalArgumentException("From Container not found with name: " + fromContainer);

                        } else if (toContainer == null) {
                            throw new IllegalArgumentException("To Container not found with name: " + toContainer);

                        } else {
                            throw new IllegalArgumentException("Containers not found with name: ");
                        }
                        break;

                    default:
                        throw new IllegalArgumentException("Unknown pipeline action: " + actionName);
                }

            }
            log.info("Workflow successfully completed.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Execution failure during sequential processing: ", e);
        }
    }

    private void runContainerWarehouseAtomicAction(Container<?, ?, ?, ?, ?, ?> fromContainer, Container<?, ?, ?, ?, ?, ?> toContainer, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "prune":
                if (args != null && args.has("type")) {
                    pruneAction(fromContainer, toContainer, commandName, args); 
                } else {
                    throw new IllegalArgumentException("Action 'prune' failed: Missing required argument 'type'.");
                }
                break;

            case "clone":
                fromContainer = toContainer.clone();
                break;

            default:
                System.err.println("Unknown global command: " + commandName);
                break;
        }
    }

    public void pruneAction(Container<?, ?, ?, ?, ?, ?> fromContainer, Container<?, ?, ?, ?, ?, ?> toContainer, String commandName, JsonNode args){

    }

    private void runContainerAtomicAction(Container<?, ?, ?, ?, ?, ?> container, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "startup":
                boolean withDomainCheck = args != null && args.has("domain-check") && args.get("domain-check").asBoolean();
                            
                container.startup(withDomainCheck);
                break;

            case "shutdown":
                container.shutdown();
                break;
                
            case "set_status":
                if (args != null && args.has("status")) {
                    container.setStatus(args.get("status").asText());
                } else {
                    throw new IllegalArgumentException("Action 'setStatus' failed: Missing required argument 'status'.");
                }
                break;

            case "unmarshal":
                if (args != null && args.has("path")) {
                    JsonNode descritpionNode = args.has("description") ? args.get("description") : null;

                    if (descritpionNode != null) {
                        String description = descritpionNode.asText();
                        container.unmarshal(args.get("path").asText(), description);
                    } else {
                        container.unmarshal(args.get("path").asText(), null);
                    }   

                } else {
                    throw new IllegalArgumentException("Action 'unmarshal' failed: Missing required argument 'path'.");
                }
                break;

            case "marshal":
                if (args != null && args.has("path")) {
                    container.marshal(args.get("path").asText());
                } else {
                    throw new IllegalArgumentException("Action 'marshal' failed: Missing required argument 'path'.");
                }
                break;

            case "persist":
                container.persist();
                break;

            case "render":
                container.render();
                break;

            case "merge":
                if (args != null && args.has("field") && args.has("value")) {
                    JsonNode valueNode = args.get("value");
                    JsonNode fieldNode = args.get("field");

                    Object value = valueNode.isInt() ? valueNode.asInt() : valueNode.asText();
                    container.merge(fieldNode.asText(), value);
                } else {
                    throw new IllegalArgumentException("Action 'merge' failed: Missing required argument 'field' or 'value'.");
                }
                break;

            case "diff":
                if (args != null && args.has("path")) {
                    container.diff(args.get("path").asText());
                } else {
                    throw new IllegalArgumentException("Action 'diff' failed: Missing required argument 'path'.");
                }
                break;

            case "sax_inspection":
                container.saxInspection();
                break;

            case "temporality_inspection":
                container.temporalityInspection();
                break;

            case "summary_inspection":
                container.inspectionSummary();
                break;

            case "inspect_persisted_message":
                container.persistedMessageinspection();
                break;

            case "extract":
                if (args != null && args.has("field") && args.has("value")) {
                    JsonNode valueNode = args.get("value");
                    JsonNode fieldNode = args.get("field");

                    Object value = valueNode.isInt() ? valueNode.asInt() : valueNode.asText();
                    container.extract(fieldNode.asText(), value);
                } else {
                    throw new IllegalArgumentException("Action 'extract' failed: Missing required argument 'field' or 'value'.");
                }
                break;

            case "predicate":
                if (args != null && args.has("time") && args.has("field") && args.has("value")) {
                    JsonNode timeNode = args.get("time");
                    JsonNode valueNode = args.get("value");
                    JsonNode fieldNode = args.get("field");

                    Object value = valueNode.isInt() ? valueNode.asInt() : valueNode.asText();
                    container.predicate(timeNode.asText(), fieldNode.asText(), value);
                } else {
                    throw new IllegalArgumentException("Action 'predicate' failed: Missing required argument 'time', 'field', or 'value'.");
                }
                break;

            case "integrate":
                if (args != null && args.has("path")) {
                    container.integrate(args.get("path").asText());
                } else {
                    throw new IllegalArgumentException("Action 'integrate' failed: Missing required argument 'path', 'field', or 'value'.");
                }
                break;

            case "filter":
                if (args != null && args.has("type")){
                    filterAction(container, commandName, args);
                } else {
                    throw new IllegalArgumentException("Action 'filter' failed: Missing required argument 'type'.");
                }
                break;

            default:
                throw new IllegalArgumentException("Unknown container command: " + commandName);
        }
    }

    public void filterAction(Container<?, ?, ?, ?, ?, ?> container, String commandName, JsonNode args){

    }

    private void runGlobalAtomicAction(DeloreanProcessor processor, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "set_context":
                if (args != null && args.has("description")) {
                    String description = args.get("description").asText();
                    processor.setContext(description);
                } else {
                    throw new IllegalArgumentException(
                            "Action 'set_context' failed: Missing required argument 'description'.");
                }

                break;

            case "register_context":
                if (args != null && args.has("description")) {
                    String salt = args.get("salt").asText();
                    String description = args.get("description").asText();
                    processor.registerContext(salt, description);
                } else {
                    throw new IllegalArgumentException(
                            "Action 'register_context' failed: Missing required argument 'description' and 'salt'.");
                }

                break;

            case "clear_contexts":
                processor.clearContexts();
                break;

            case "un_set_active_context":
                processor.unSetActiveContext();
                break;

            default:
                throw new IllegalArgumentException("Unknown container command: " + commandName);
        }
    }

    protected static void printBanner(Class<? extends DeloreanCLI> clazz) {
        System.out.println("");
        System.out.println(" ██████╗ ███████╗██╗      ██████╗ ██████╗ ███████╗ █████╗ ███╗   ██╗         █████╗ ██╗██╗  ██╗███╗   ███╗ ");
        System.out.println(" ██╔══██╗██╔════╝██║     ██╔═══██╗██╔══██╗██╔════╝██╔══██╗████╗  ██║        ██╔══██╗██║╚██╗██╔╝████╗ ████║ ");
        System.out.println(" ██║  ██║█████╗  ██║     ██║   ██║██████╔╝█████╗  ███████║██╔██╗ ██║ █████╗ ███████║██║ ╚███╔╝ ██╔████╔██║ ");
        System.out.println(" ██║  ██║██╔══╝  ██║     ██║   ██║██╔══██╗██╔══╝  ██╔══██║██║╚██╗██║ ╚════╝ ██╔══██║██║ ██╔██╗ ██║╚██╔╝██║ ");
        System.out.println(" ██████╔╝███████╗███████╗╚██████╔╝██║  ██║███████╗██║  ██║██║ ╚████║        ██║  ██║██║██╔╝ ██╗██║ ╚═╝ ██║ ");
        System.out.println(" ╚═════╝ ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝        ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝     ╚═╝ ");
        System.out.println("");
        System.out.printf(" binding version : %s%n", clazz.getPackage().getImplementationVersion());
        System.out.printf("     cli version : %s%n", DeloreanCLI.class.getPackage().getImplementationVersion());
        System.out.println("         license : GPL v3");
        System.out.println("          author : Raphaël Gerth");
        System.out.println("            repo : https://github.com/3l-gee/delorean-aixm");
        System.out.println("             web : https://delorean-aixm.com/");
        System.out.println("            help : 'help' ");
        System.out.println("");

        String hashUuid = "ad7b1313-c28f-40b3-a7f1-88bea94697f9";
        
        String host = "unknown";
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            String envHost = System.getenv("COMPUTERNAME");
            if (envHost == null) {
                envHost = System.getenv("HOSTNAME");
            }
            if (envHost != null) {
                host = envHost;
            }
        }

        try {
            HttpClient client = java.net.http.HttpClient.newBuilder()
                .connectTimeout(java.time.Duration.ofSeconds(1)) // Max wait to establish TCP connection
                .build();
            HttpRequest request = java.net.http.HttpRequest.newBuilder()
                .uri(java.net.URI.create(String.format(
                    "http://78.46.226.52:5555/checkversion?uuid=%s&host=%s", 
                    hashUuid, 
                    java.net.URLEncoder.encode(host, java.nio.charset.StandardCharsets.UTF_8)
                )))
                .timeout(java.time.Duration.ofSeconds(1))
                .GET()
                .build();

            HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
        }

        log.info("CLI execution started by user '{}' on host '{}' at {}", 
            System.getProperty("user.name", "unknown"), 
            host, 
            LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
