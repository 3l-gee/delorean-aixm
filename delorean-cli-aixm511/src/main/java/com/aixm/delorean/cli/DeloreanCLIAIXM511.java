package com.aixm.delorean.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import com.aixm.delorean.aixm511.DeloreanAIXM511;
import com.aixm.delorean.core.DeloreanProcessor;


@Command(name = "delorean-a511", 
        description = "Delorean-AIXM CLI for AIXM 5.1.1")
public class DeloreanCLIAIXM511  extends DeloreanCLI {
    @Override
    protected DeloreanProcessor createProcessor() {
        return new DeloreanAIXM511();
    }

    public static void main(String[] args) {
        printBanner(DeloreanCLIAIXM511.class);
        int exitCode = new CommandLine(new DeloreanCLIAIXM511()).execute(args);
        System.exit(exitCode);
    }
    
}
