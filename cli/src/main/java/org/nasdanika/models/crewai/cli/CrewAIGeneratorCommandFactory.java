package org.nasdanika.models.crewai.cli;

import java.util.List;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import io.opentelemetry.api.OpenTelemetry;
import picocli.CommandLine;

public class CrewAIGeneratorCommandFactory extends SubCommandCapabilityFactory<CrewAIGeneratorCommand> {

	@Override
	protected Class<CrewAIGeneratorCommand> getCommandType() {
		return CrewAIGeneratorCommand.class;
	}
	
	@Override
	protected CompletionStage<CrewAIGeneratorCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		Requirement<Object, OpenTelemetry> requirement = ServiceCapabilityFactory.createRequirement(OpenTelemetry.class);
		CompletionStage<OpenTelemetry> openTelemetryCS = loader.loadOne(requirement, progressMonitor);		
		return openTelemetryCS.thenApply(ot -> new CrewAIGeneratorCommand(ot, loader.getCapabilityLoader()));
	}

}
