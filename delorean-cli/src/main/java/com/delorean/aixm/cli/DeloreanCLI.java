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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;

import com.delorean.aixm.cli.DeloreanCLI.ActionType;
import com.delorean.aixm.core.DeloreanProcessor;
import com.delorean.aixm.core.container.Container;
import com.delorean.aixm.core.container.ContainerWarehouse;
import com.delorean.aixm.core.log.ConsoleLogger;
import com.delorean.aixm.core.log.LogLevel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

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
@Command(mixinStandardHelpOptions = true, version = "0.2.0", description = "Executes structured aeronautical data transformation pipelines via YAML files or isolated direct command contexts.")
public abstract class DeloreanCLI implements Callable<Integer> {

    @ArgGroup(multiplicity = "1", heading = "Execution Mode (Choose either YAML pipeline or Direct CLI command):%n")
    ExecutionMode mode;

    static class ExecutionMode {
        @Option(names = { "-y", "--yaml" }, required = true, description = "YAML workflow configuration file")
        File yamlFile;

        @ArgGroup(exclusive = false, heading = "Direct CLI Mode Options:%n")
        DirectCommandOptions directCmd;
    }

    static class DirectCommandOptions {

        @Option(names = { "-h", "--host" }, description = "Database server host or socket directory")
        String host;

        @Option(names = { "-p", "--port" }, description = "Database server port")
        String port;

        @Option(names = { "-d", "--dbname" }, description = "Database name to connect to")
        String database;

        @Option(names = { "-U", "--username" }, description = "Database user name")
        String user;

        @Option(names = { "-W",
                "--password" }, description = "Database authentication password.", interactive = true, arity = "0..1")
        String password;

        @Option(names = { "-a",
                "--action" }, required = true, description = "Action to perform: [persist, extract, merge, prune]")
        ActionType action;

        @Option(names = { "-f", "--file" }, description = "Target contextual data file path target string identifier")
        String file;

        @Option(names = { "--id" }, description = "Entity identity payload variable argument mapping for extraction")
        String id;

        @Option(names = { "--time" }, description = "Entity identity payload variable argument mapping for extraction")
        String time;

    }

    enum ActionType {
        persist, extract, merge, prune
    }

    protected abstract DeloreanProcessor createProcessor();

    @Override
    public Integer call() throws Exception {
        DeloreanProcessor processor = createProcessor();
        if (processor == null) {
            System.err.println("Internal Error: Processor not initialized.");
            return 1;
        }

        // Mode 1: YAML Execution Processing
        if (mode.yamlFile != null) {
            if (!mode.yamlFile.exists()) {
                System.err.println("Error: Configuration file not found: " + mode.yamlFile.getAbsolutePath());
                return 1;
            }
            if (!validateYaml(mode.yamlFile)) {
                System.err.println("Validation failures encountered. Halting execution pipeline.");
                return 1;
            }
            return executePipeline(processor, mode.yamlFile) ? 0 : 1;
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
                ConsoleLogger.error("Failed to instantiate targeted workspace container instance.");
                return false;
            }

            String dbUrl = "jdbc:postgresql://" + opts.host + ":" + opts.port + "/" + opts.database;
            container.SetCredentials(dbUrl, opts.user, opts.password, "update");

            container.startup();

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
                    ConsoleLogger
                            .error("A source file (-f / --file) is required to unmarshal data for " + baseActionName);
                    container.shutdown();
                    return false;
                }

                container.unmarshal(opts.file);

                if ("persist".equals(baseActionName)) {
                    container.persist();
                }

                if ("merge".equals(baseActionName)) {
                    container.persist();
                }
            }

            // --- POST-ACTION: Automated Marshalling Phase ---
            if ("extract".equals(baseActionName) || "predicate".equals(baseActionName)) {
                if (opts.file == null) {
                    ConsoleLogger
                            .error("A source file (-f / --file) is required to unmarshal data for " + baseActionName);
                    container.shutdown();
                }

                container.marshal(opts.file);

                if ("extract".equals(baseActionName)) {
                    container.extract(opts.id);
                }

                if ("predicate".equals(baseActionName)) {
                    container.predicate(opts.time);
                }
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
            JsonNode rootNode = mapper.readTree(mode.yamlFile);
            String name = rootNode.path("name").asText("Unnamed Workflow");
            String logLevel = rootNode.path("logging").asText("INFO");
            boolean verbose = rootNode.path("verbose").asBoolean(false);

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
            ConsoleLogger.info("Workflow successfully completed.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Execution failure during sequential processing: ", e);
        }
    }

    private void runContainerWarehouseAtomicAction(Container<?, ?, ?, ?, ?, ?> fromContainer,
            Container<?, ?, ?, ?, ?, ?> toContainer, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "prune":
                break;

            case "clone":
                System.out.println("Registering context with salt: " + args.path("salt").asText());
                break;

            default:
                System.err.println("Unknown global command: " + commandName);
                break;
        }
    }

    private void runContainerAtomicAction(Container<?, ?, ?, ?, ?, ?> container, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "startup":
                container.startup();
                break;

            case "shutdown":
                container.shutdown();
                break;

            case "unmarshal":
                if (args != null && args.has("path")) {
                    container.unmarshal(args.get("path").asText());
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

            case "merge":
                container.merge();
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
                if (args != null && args.has("id")) {
                    JsonNode idNode = args.get("id");
                    Object id = idNode.isInt() ? idNode.asInt() : idNode.asText();
                    container.extract(id);
                } else {
                    throw new IllegalArgumentException("Action 'extract' failed: Missing required argument 'id'.");
                }
                break;

            case "predicate":
                if (args != null && args.has("time")) {
                    container.predicate(args.get("time").asText());
                } else {
                    throw new IllegalArgumentException("Action 'predicate' failed: Missing required argument 'time'.");
                }
                break;

            case "integrate":
                if (args != null && args.has("path")) {
                    container.integrate(args.get("path").asText());
                } else {
                    throw new IllegalArgumentException("Action 'integrate' failed: Missing required argument 'path'.");
                }
                break;

            default:
                throw new IllegalArgumentException("Unknown container command: " + commandName);
        }
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
        System.out.println(
                " ██████╗ ███████╗██╗      ██████╗ ██████╗ ███████╗ █████╗ ███╗   ██╗         █████╗ ██╗██╗  ██╗███╗   ███╗ ");
        System.out.println(
                " ██╔══██╗██╔════╝██║     ██╔═══██╗██╔══██╗██╔════╝██╔══██╗████╗  ██║        ██╔══██╗██║╚██╗██╔╝████╗ ████║ ");
        System.out.println(
                " ██║  ██║█████╗  ██║     ██║   ██║██████╔╝█████╗  ███████║██╔██╗ ██║ █████╗ ███████║██║ ╚███╔╝ ██╔████╔██║ ");
        System.out.println(
                " ██║  ██║██╔══╝  ██║     ██║   ██║██╔══██╗██╔══╝  ██╔══██║██║╚██╗██║ ╚════╝ ██╔══██║██║ ██╔██╗ ██║╚██╔╝██║ ");
        System.out.println(
                " ██████╔╝███████╗███████╗╚██████╔╝██║  ██║███████╗██║  ██║██║ ╚████║        ██║  ██║██║██╔╝ ██╗██║ ╚═╝ ██║ ");
        System.out.println(
                " ╚═════╝ ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝        ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝     ╚═╝ ");
        System.out.println("");
        System.out.printf(" binding version : %s%n", clazz.getPackage().getImplementationVersion());
        System.out.printf("     cli version : %s%n", DeloreanCLI.class.getPackage().getImplementationVersion());
        System.out.println("         license : GPL v3");
        System.out.println("          author : Raphaël Gerth");
        System.out.println("            repo : https://github.com/3l-gee/delorean-aixm");
        System.out.println("             web : https://delorean-aixm.com/");
        System.out.println("            help : 'help' ");
        System.out.println("");
    }
}
