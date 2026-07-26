package com.delorean.aixm.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import com.delorean.aixm.aixm511.DeloreanAIXM511;
import com.delorean.aixm.aixm511.filter.Aixm511FilterConfig;
import com.delorean.aixm.aixm511.filter.type.FeatureIdentifierSpecification;
import com.delorean.aixm.aixm511.filter.type.FeatureTypeSpecification;
import com.delorean.aixm.aixm511.filter.type.TimeSliceValidTimeSpecification;
import com.delorean.aixm.aixm511.schema.AbstractAIXMFeatureType;
import com.delorean.aixm.aixm511.schema.AbstractAIXMTimeSliceType;
import com.delorean.aixm.aixm511.schema.message.BasicMessageMemberAIXMPropertyType;
import com.delorean.aixm.core.DeloreanProcessor;
import com.delorean.aixm.core.container.Container;
import com.fasterxml.jackson.databind.JsonNode;


@Command(name = "delorean-a511", 
        description = "Delorean-AIXM CLI for AIXM 5.1.1")
public class DeloreanCLIAIXM511  extends DeloreanCLI {

    @Override
    protected DeloreanProcessor createProcessor() {
        return new DeloreanAIXM511();
    }

    
    @Override
    public void filterAction(Container<?, ?, ?, ?, ?, ?> container, String commandName, JsonNode args) {
        if (container == null) {
            throw new IllegalArgumentException("Action '" + commandName + "' failed: no target container resolved.");
        }

        if (args == null || !args.has("type")) {
            throw new IllegalArgumentException("AIXM 5.1.1 prune requires a 'type'.");
        }

        String filterType = args.get("type").asText();
        Aixm511FilterConfig config = new Aixm511FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);

        switch (filterType) {
            case "feature_indetifier":
                config.addFeatureFilter(new FeatureIdentifierSpecification(args));
                break;

            case "feature_type":
                config.addFeatureFilter(new FeatureTypeSpecification(args));
                break;

            case "timeslice_valid_time":
                config.addTimesliceFilter(new TimeSliceValidTimeSpecification(args));
                break;

            default:
                throw new IllegalArgumentException("Unknown filter command: " + filterType);
        }

        container.filter(config);
    }

    @Override
    public void pruneAction(Container<?, ?, ?, ?, ?, ?> fromContainer, Container<?, ?, ?, ?, ?, ?> toContainer, String commandName, JsonNode args) {
        if (fromContainer == null || toContainer== null) {
            throw new IllegalArgumentException("Action '" + commandName + "' failed: no target or source container resolved.");
        }

        if (args == null || !args.has("type")) {
            throw new IllegalArgumentException("AIXM 5.1.1 prune requires a 'type'.");
        }

        String filterType = args.get("type").asText();
        Aixm511FilterConfig config = new Aixm511FilterConfig(BasicMessageMemberAIXMPropertyType.class, AbstractAIXMFeatureType.class, AbstractAIXMTimeSliceType.class);

        switch (filterType) {
            case "feature_indetifier":
                config.addFeatureFilter(new FeatureIdentifierSpecification(args));
                break;

            case "feature_type":
                config.addFeatureFilter(new FeatureTypeSpecification(args));
                break;

            case "timeslice_valid_time":
                config.addTimesliceFilter(new TimeSliceValidTimeSpecification(args));
                break;

            default:
                throw new IllegalArgumentException("Unknown filter command: " + filterType);
        }

        toContainer = fromContainer.prune(config);
    }

    public static void main(String[] args) {
        printBanner(DeloreanCLIAIXM511.class);
        int exitCode = new CommandLine(new DeloreanCLIAIXM511()).execute(args);
    }
    
}

