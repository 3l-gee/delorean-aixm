package com.aixm.delorean.cli;

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

import com.aixm.delorean.core.DeloreanProcessor;
import com.aixm.delorean.core.container.Container;
import com.aixm.delorean.core.container.ContainerWarehouse;
import com.aixm.delorean.core.log.ConsoleLogger;
import com.aixm.delorean.core.log.LogLevel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

@Command(mixinStandardHelpOptions = true, version = "0.2.0")
public abstract class DeloreanCLI implements Callable<Integer> {

    @Option(names = {"-y", "--yaml"}, required = true, description = "YAML configuration file")
    File yamlFile;

    @Option(names = {"-v","--verbose"}, required = false, description = "Enable verbose output")
    boolean verbose;

    @Option(names = {"-s","--strict"}, required = false, description = "Enable strict mode")
    boolean strict;

    protected abstract DeloreanProcessor createProcessor();

    @Override
    public Integer call() throws Exception {
        DeloreanProcessor processor = createProcessor();
        if (processor == null) {
            System.err.println("Internal Error: Processor not initialized.");
            return 1;
        }

        if (yamlFile == null || !yamlFile.exists()) {
            System.err.println("Error: Configuration file not found: " + 
                (yamlFile != null ? yamlFile.getAbsolutePath() : "No file specified"));
            return 1;
        }

        if (!validateYaml(yamlFile)) {
            System.err.println("Validation failures encountered. Halting execution pipeline.");
            return 1;
        }

        return executePipeline(processor, yamlFile) ? 0 : 1;
    }

    private boolean validateYaml(File yaml) {
        return true;
    }

    public void configureEnvironment() {
        if (this.verbose) {
            LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
            
            // Turn the root logger to DEBUG
            loggerContext.getLogger("ROOT").setLevel(Level.DEBUG);
            
            // Turn framework loggers to DEBUG
            loggerContext.getLogger("org.hibernate").setLevel(Level.DEBUG);
            loggerContext.getLogger("com.zaxxer.hikari").setLevel(Level.DEBUG);
            loggerContext.getLogger("com.aixm.delorean").setLevel(Level.DEBUG);
            
            ConsoleLogger.info("Verbose mode enabled");
        }
    }

    private boolean executePipeline(DeloreanProcessor processor, File yaml) {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            JsonNode rootNode = mapper.readTree(yamlFile);
            String name = rootNode.path("name").asText("Unnamed Workflow");
            String logLevel = rootNode.path("logging").asText("INFO");
            boolean verbose = rootNode.path("verbose").asBoolean(false);
            
            // Initialize Containers
            JsonNode containersNode = rootNode.path("containers");
            Set<Map.Entry<String, JsonNode>> containerFields = containersNode.properties();
            for (Map.Entry<String, JsonNode> containerNode : containerFields) {
                String containerName = containerNode.getKey();
                JsonNode dbNode = containerNode.getValue().path("database");

                processor.createNewContainer(containerName);
                Container<?,?,?,?,?,?> container = processor.getContainerByName(containerName);
            
                if (container != null && dbNode != null) {
                    container.SetCredentials(
                        dbNode.path("url").asText(),
                        dbNode.path("username").asText(),
                        dbNode.path("password").asText(),
                        dbNode.path("hbm2ddl").asText()
                    );
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
                    case "sax_validation":
                    case "print_validation":
                    case "statistics":
                    case "info":
                    case "get_persisted_message":
                    case "extract":
                    case "predicate":
                    case "integrate":
                        String containerName = actionNode.path("target").asText();
                        Container<?,?,?,?,?,?> container = processor.getContainerByName(containerName);
                        if (container != null) {
                            runContainerAtomicAction(container, actionName, actionNode);
                        } else {
                            throw new IllegalArgumentException("Container not found with name: " + containerName);
                        }
                        break;
                    
                    case "set_context":
                    case "register_context":
                    case "remove_context":
                    case "clear_contexts":
                    case "un_set_active_context":
                        runGlobalAtomicAction(processor, actionName, actionNode);
                        break;
                    
                    case "prune":
                    case "clone":
                        break;

                    default:
                        ConsoleLogger.error("Warning: Skipping unknown pipeline action: " + actionName);
                        break;
                }


            }
            ConsoleLogger.info("Workflow successfully completed.");
            return true;
        } catch (Exception e) {
            System.err.println("Fatal execution failure during sequential processing: " + e.getMessage());
            if (verbose) e.printStackTrace();
            return false;
        }
    }

    private void runContainerWarehouseAtomicAction(Container<?,?,?,?,?,?> container, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "prune":
                break;
                
            case "clone":
                System.out.println("Registering context with salt: " + args.path("salt").asText());
                break;

            case "log_summary":
                System.out.println("Pipeline step milestone completed.");
                break;

            default:
                System.err.println("Unknown global command: " + commandName);
                break;
        }
    }

    private void runContainerAtomicAction(Container<?,?,?,?,?,?> container, String commandName, JsonNode args) {
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
                }
                break;
            case "marshal":
                if (args != null && args.has("path")) {
                    container.marshal(args.get("path").asText());
                }
                break;
            case "persist":
                container.persist();
                break;
            case "merge":
                container.merge();
                break;
            case "diff":
                container.diff();
                break;
            case "sax_validation":
                container.saxValidation();
                break;
            case "print_validation":
                container.printValidation();
                break;
            case "statistics":
                container.statistics();
                break;
            case "info":
                container.info();
                break;
            case "get_persisted_message":
                container.getPersitedMessage();
                break;
            case "extract":
                if (args != null && args.has("id")) {
                    // Extracts handling String or Int identifiers dynamically
                    JsonNode idNode = args.get("id");
                    Object id = idNode.isInt() ? idNode.asInt() : idNode.asText();
                    container.extract(id);
                }
                break;
            case "predicate":
                if (args != null && args.has("time")) {
                    container.predicate(args.get("time").asText());
                }
                break;
            case "integrate":
                if (args != null && args.has("path")) {
                    container.integrate(args.get("path").asText());
                }
                break;
            default:
                System.err.println("Unknown container command: " + commandName);
                break;
        }
    }

    private void runGlobalAtomicAction(DeloreanProcessor processor, String commandName, JsonNode args) {
        switch (commandName.toLowerCase().trim()) {
            case "set_context":
                if (args != null && args.has("description")){
                    String description = args.get("description").asText();
                    processor.setContext(description);
                }

                break;
                
            case "register_context":
                System.out.println("Registering context with salt: " + args.path("salt").asText());
                break;

            case "log_summary":
                System.out.println("Pipeline step milestone completed.");
                break;

            default:
                System.err.println("Unknown global command: " + commandName);
                break;
        }
    }

    // @SuppressWarnings("unchecked")
    // private boolean executePipeline(DeloreanProcessor processor, File yaml) {
    //     try {
    //         ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    //         Map<String, Object> rootConfig = mapper.readValue(yaml, Map.class);

    //         List<Object> pipelineSteps = (List<Object>) rootConfig.get("pipeline");
    //         for (Object stepObj : pipelineSteps) {

    //         }

    //         // 1. Setup Global Default Variables
    //         String context = (String) rootConfig.getOrDefault("context", "donlon");
    //         processor.setContext(context, "");

    //         Map<String, Object> dbCreds = (Map<String, Object>) rootConfig.get("database");
    //         List<Object> pipelineSteps = (List<Object>) rootConfig.get("pipeline");

    //         if (dbCreds == null || pipelineSteps == null) {
    //             System.err.println("Malformed configuration file: Missing 'database' or 'pipeline' sequence blocks.");
    //             return false;
    //         }

    //         // Track active space context blocks predictably inside an isolation memory map
    //         Map<String, Container<?,?,?,?>> containers = new HashMap<>();

    //         // 2. Drive sequentially through the pipeline sequence
    //         for (Object stepObj : pipelineSteps) {
    //             if (!(stepObj instanceof Map)) continue;
    //             Map<String, Object> block = (Map<String, Object>) stepObj;

    //             // --- Scenario 1: Process Container Configuration Blocks ---
    //             if (block.containsKey("container")) {
    //                 String id = String.valueOf(block.get("container"));
    //                 List<Object> actionSteps = (List<Object>) block.get("actions");

    //                 if (verbose) System.out.println("-> Constructing isolation space environment: [" + id + "]");
                    
    //                 Container<?,?,?,?> container = processor.newContainer();
    //                 container.getDatabaseBinding().setUrl((String) dbCreds.get("url"));
    //                 container.getDatabaseBinding().setUsername((String) dbCreds.get("username"));
    //                 container.getDatabaseBinding().setPassword((String) dbCreds.get("password"));
    //                 container.getDatabaseBinding().setHbm2ddl("create");
    //                 container.startup();

    //                 if (actionSteps != null) {
    //                     for (Object step : actionSteps) {
    //                         if (step instanceof String) {
    //                             runAtomicAction(container, (String) step, null);
    //                         } else if (step instanceof Map) {
    //                             Map<String, Object> stepMap = (Map<String, Object>) step;
    //                             String commandName = stepMap.keySet().iterator().next();
    //                             runAtomicAction(container, commandName, stepMap.get(commandName));
    //                         }
    //                     }
    //                 }
    //                 containers.put(id, container);
    //             } 
                
    //             // --- Scenario 2: Process Explicit Merge Blocks ---
    //             else if (block.containsKey("merge")) {
    //                 Map<String, Object> mergeOpts = (Map<String, Object>) block.get("merge");
    //                 String srcKey = String.valueOf(mergeOpts.get("source"));
    //                 String tgtKey = String.valueOf(mergeOpts.get("target"));

    //                 Container<?,?,?,?> source = containers.get(srcKey);
    //                 Container<?,?,?,?> target = containers.get(tgtKey);

    //                 if (source == null || target == null) {
    //                     throw new IllegalStateException("Execution pipeline fault: Cannot merge '" + srcKey + "' to '" + tgtKey + "'. Active space uninitialized.");
    //                 }

    //                 if (verbose) System.out.println("-> Running Merge Operation: Mapping [" + srcKey + "] into [" + tgtKey + "]");
    //                 target.merge(source);
    //             } 
                
    //             // --- Scenario 3: Process Explicit Filter Blocks ---
    //             else if (block.containsKey("filter")) {
    //                 Map<String, Object> filterOpts = (Map<String, Object>) block.get("filter");
    //                 String posKey = String.valueOf(filterOpts.get("positive"));
    //                 String negKey = String.valueOf(filterOpts.get("negative"));

    //                 if (verbose) System.out.println("-> Running Split Filter. Tracking outputs across: [" + posKey + " / " + negKey + "]");
    //             }
    //         }

    //         // 3. Cleanup tracked dependencies gracefully
    //         for (Container<?,?,?,?> activeContainer : containers.values()) {
    //             try { activeContainer.shutdown(); } catch (Exception ignored) {}
    //         }

    //         return true;
    //     } catch (Exception e) {
    //         System.err.println("Fatal execution failure during sequential processing: " + e.getMessage());
    //         if (verbose) e.printStackTrace();
    //         return false;
    //     }
    // }

    private void run(DeloreanProcessor processor) {
        try {
            // processor.setContext("donlon", "");
            // Container<?,?,?,?,?,?> baseline = processor.newContainer();
            // baseline.SetCredentials("jdbc:postgresql://localhost:5433/aixm51-test", "postgres", "postgres", "create");
            // baseline.startup();
            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm51/baseline.xml");
            // baseline.info();
            // baseline.saxValidation();
            // baseline.printValidation();
            // baseline.persist();
            // baseline.getPersitedMessage();

            // processor.setContext("donlon", "");
            // Container<?,?,?,?,?,?> notam = processor.newContainer();
            // notam.SetCredentials("jdbc:postgresql://localhost:5433/aixm51-test", "postgres", "postgres", "none");
            // notam.startup();
            // notam.getPersitedMessage();
            // notam.extract(1L);
            // notam.info();
            // notam.saxValidation();
            // notam.printValidation();
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/2025-10-02-skyguide-obst.aixm.xml");

            // processor.setContext("donlon", "");
            // Container<?,?,?,?,?,?> baseline = processor.newContainer();
            // baseline.SetCredentials("jdbc:postgresql://localhost:5433/aixm51", "postgres", "postgres", "create");
            // baseline.startup();
            // // Skyguide AIP Obstacles
            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm51/2025-10-02-skyguide-obst.aixm.xml");
            // baseline.persist();

            // processor.setContext("donlon", "");
            // Container<?,?,?,?,?,?> supplement = processor.newContainer();
            // supplement.SetCredentials("jdbc:postgresql://localhost:5433/aixm51", "postgres", "postgres", "none");
            // supplement.startup();

            // // SIA AIP Datasets
            // supplement.unmarshal("C:/Users/rapha/Downloads/aixm51/LF_AIP_DS_PartOf_20240516_AIRAC.xml");
            // supplement.persist();

            // // DONLOON Aerodrome Mapping
            // supplement.unmarshal("C:/Users/rapha/Downloads/aixm51/EA_AIP_DS_FULL_20170701_mod.xml");
            // supplement.persist();

            // // PANSA AIP Datasets
            // supplement.unmarshal("C:/Users/rapha/Downloads/aixm51/EP_AIP_DS_FULL_20220421_AIRAC.xml");
            // supplement.persist();

            // // PANSA AIP Datasets
            // supplement.unmarshal("C:/Users/rapha/Downloads/aixm51/EP_OBS_DS_FULL_20220421_AIRAC.xml");
            // supplement.persist();

            // processor.setContext("donlon", "");
            // Container<?,?,?,?,?,?> first = processor.createNewContainer();
            // first.SetCredentials("jdbc:postgresql://localhost:5433/aixm511", "postgres", "postgres", "create");
            // first.startup();

            // first.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDB_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // first.persist();


            // processor.setContext("donlon", "");
            // Container<?,?,?,?,?,?> baseline = processor.createNewContainer();
            // baseline.SetCredentials("jdbc:postgresql://localhost:5433/aixm511", "postgres", "postgres", "none");
            // baseline.startup();
            
            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDB_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDLP_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDN_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDN_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDLN_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDG_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDAZ_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDFQ_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDMA_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDFH_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDTL_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDSB_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDSB_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDHI_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDQD_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDC_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDGS_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDLW_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDE_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDF_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();
            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDK_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDLV_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDQA_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDVE_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDL_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDS_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDJA_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDR_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDDM_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDQC_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();

            // baseline.unmarshal("C:/Users/rapha/Downloads/aixm511/aerodrome_mapping_EDTY_AerodromeMapping_2026-05-14_2026-05-14_snapshot.zip");
            // baseline.persist();


            // Container<?,?,?,?> notam = processor.newContainer();
            // notam.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            // notam.getDatabaseBinding().setUsername("postgres");
            // notam.getDatabaseBinding().setPassword("postgres");
            // notam.getDatabaseBinding().setHbm2ddl("none");
            // notam.startup();
            // notam.extract(1L);
            // baseline.info();
            // notam.saxValidation();
            // notam.printValidation();    
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/obst.xml");

            // notam.predicate("2024-01-01T00:00:00Z");
            // notam.integrate("C:/Users/rapha/Downloads/aixm51/permdelta.xml");
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/integrate.xml");
            // notam.merge();

            // notam.extract(1L);
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/full.xml");
            // notam.diff();
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/diff.xml");


            // notam.extract(1);
            // notam.marshal("C:/Users/rapha/Downloads/aixm51/extract.xml");

            // container.unmarshal("C:/Users/rapha/Downloads/aixm51/LF_AIP_DS_PartOf_20240516_AIRAC.xml");
            // container.persist();

            // // container.unmarshal("C:/Users/rapha/Downloads/aixm51/EDDF_AerodromeMapping_2025-08-07_2025-08-07_snapshot.xml");
            // // container.persist();

            // container.unmarshal("C:/Users/rapha/Downloads/aixm51/2025-10-02-skyguide-obst.aixm.xml");
            // container.persist();

            // container.unmarshal("C:/Users/rapha/Downloads/aixm51/EA_AIP_DS_FULL_20170701_mod.xml");
            // container.persist();

            // Container<?,?,?,?> containerA = processor.newContainer();
            // containerA.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            // containerA.getDatabaseBinding().setUsername("postgres");
            // containerA.getDatabaseBinding().setPassword("postgres");
            // containerA.getDatabaseBinding().setHbm2ddl("update");
            // containerA.startup();
            // containerA.extract(1L);
            // containerA.marshal("C:/Users/rapha/Downloads/data/extract.xml");
            // containerA.predicate("2020-01-01T00:00:00Z");
            // containerA.marshal("C:/Users/rapha/Downloads/data/predicate.xml");


            // container.unmarshal("C:/Users/rapha/Downloads/2025-10-02-skyguide-obst.aixm.xml");
            // container.getDatabaseBinding().setUrl("jdbc:postgresql://localhost:5433/aixm51");
            // container.getDatabaseBinding().setUsername("postgres");
            // container.getDatabaseBinding().setPassword("postgres");
            // container.getDatabaseBinding().setHbm2ddl("create");
            // container.startup();
            // container.persist();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            if (verbose) e.printStackTrace();
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
    }
}



// import com.aixm.delorean.core.configuration.StructureConfig;
// import com.aixm.delorean.core.container.ContainerFactory;
// import com.aixm.delorean.core.container.ContainerWarehouse;
// import com.aixm.delorean.core.database.DatabaseBinding;
// import com.aixm.delorean.core.database.DatabaseConfig;
// import com.aixm.delorean.core.log.ConsoleLogger;
// import com.aixm.delorean.core.log.LogLevel;
// import com.aixm.delorean.core.xml.XMLBinding;
// import com.aixm.delorean.core.xml.XMLConfig;
// import com.aixm.delorean.core.qgis.QgisProjectBinding;
// import com.aixm.delorean.core.qgis.QgisConfig;

// import java.io.Console;
// import java.util.Scanner;

// public class Main {
    
//     public static void main(String[] args) {
//         Main mainInstance = new Main(); 
//         for (String arg : args) {
//             switch (arg) {
//                     break;
//             }
//         }
         
//         mainInstance.run();
//     }

//     private void run() {
//         Scanner scanner = new Scanner(System.in);
//         String command;
//         System.out.println("");
//         System.out.println(" ██████╗ ███████╗██╗      ██████╗ ██████╗ ███████╗ █████╗ ███╗   ██╗         █████╗ ██╗██╗  ██╗███╗   ███╗ ");
//         System.out.println(" ██╔══██╗██╔════╝██║     ██╔═══██╗██╔══██╗██╔════╝██╔══██╗████╗  ██║        ██╔══██╗██║╚██╗██╔╝████╗ ████║ ");
//         System.out.println(" ██║  ██║█████╗  ██║     ██║   ██║██████╔╝█████╗  ███████║██╔██╗ ██║ █████╗ ███████║██║ ╚███╔╝ ██╔████╔██║ ");
//         System.out.println(" ██║  ██║██╔══╝  ██║     ██║   ██║██╔══██╗██╔══╝  ██╔══██║██║╚██╗██║ ╚════╝ ██╔══██║██║ ██╔██╗ ██║╚██╔╝██║ ");
//         System.out.println(" ██████╔╝███████╗███████╗╚██████╔╝██║  ██║███████╗██║  ██║██║ ╚████║        ██║  ██║██║██╔╝ ██╗██║ ╚═╝ ██║ ");
//         System.out.println(" ╚═════╝ ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝        ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝     ╚═╝ v1.0.0");
//         System.out.println("");
//         System.out.println("       version : 1.0.0");
//         System.out.println("       license : GPL v3");
//         System.out.println("        author : Raphaël Gerth");
//         System.out.println("          repo : https://github.com/3l-gee/delorean-aixm");
//         System.out.println("           web : https://delorean-aixm.io/");
//         System.out.println("          help : 'help' ");
//         System.out.println("");

//         while (true) {
//             System.out.print("> ");
//             command = scanner.nextLine().trim();

//             if (command.equalsIgnoreCase("exit")) {
//                 System.out.println("Exiting...");
//                 break;
//             }

//             try {
//                 executeCommand(command, scanner);
//             } catch (IllegalArgumentException e) {
//                 System.out.println("Invalid arguments: " + e.getMessage());
//             }
//         }

//         scanner.close();
//     }

//     private void executeCommand(String command, Scanner scanner) {
//         Action Argument Parameter Optipon
//         String[] parts = command.split(" ");
//         String action = parts[0];
//         String argument = null;
//         String parameter = null;
//         String option = null;

//         if (parts.length > 1) {
//             argument = parts[1];
//             if ("-".equals(argument)) {
//                 argument = this.containerWarehouse.getLastContainerId();
//             }
//         }

//         if (parts.length > 2) {
//             parameter = parts[2];
//         }

//         if (parts.length > 3) {
//             option = parts[3];
//         }


//         switch (action.toLowerCase()) {
//             case "/h": 
//             case "--help": 
//             case "-h":
//             case "?":
//             case "help":
//             System.out.println("""
//                -={ delorean-aixm Shell Commands }=-
//     help                                                              : Display this help message
//     new         [a5.1, a5.1.1]                                        : Create a new container with the specified argument       
//     xml-config  <container id, - >      [a5.1, a5.1.1]                : Configures the xml schema to use for the specified container
//     db-config   <container id, - >      [a5.1, a5.1.1]                : Configures the db connection for the specified container
//     qgis-config <container id, - >      [a5.1, a5.1.1]                : Configures the qgis project for the specified container
//     xml         <container id, - >      load             <path>       : load the xml data from the specified path
//     xml         <container id, - >      export           <path>       : export the xml data to the specified path
//     db          <container id, - >      startup                       : start the database
//     db          <container id, - >      load                          : load the data into the database
//     db          <container id, - >      compute                       : generates the views required for visualisation
//     db          <container id, - >      export           <id / time>  : (export the master aixmmessage with the specified id) broken
//     qgis        <container id, - >      init                          : format the qgis project
//     list                                                              : List all the containers
//     exit                                                              : Exit the shell                                    
//                 """);
//             break;

//             case "new":
//             executeNewCommand(argument, scanner, parameter, option);
//             break;

//             case "xml-config":
//             excuteXmlConfigurationCommand(argument,scanner, parameter, option);
//             break;

//             case "xml" :
//             executeXmlActionCommand(argument,scanner, parameter, option);
//             break;

//             case "db-config":
//             executeDbConfigurationCommand(argument, scanner, parameter, option);
//             break;

//             case "db" :
//             executeDbActionCommand(argument, scanner, parameter, option);
//             break;

//             case "qgis-config" :
//             executeQgisConfigurationCommand(argument, scanner, parameter, option);
//             break;

//             case "qgis" :
//             executeQgisActionCommand(argument, scanner, parameter, option);
//             break;

//             case "list":
//             executeListCommand();
//             break;          

//             case "format":
//                 executeFormatCommand();
//                 break;

//             case "show":
//             executeShowCommand(argument);
//             break;

//             default:
//             ConsoleLogger.log(LogLevel.ERROR, "Invalid command: " + action);
//             break;
//         }
//     }

// }
