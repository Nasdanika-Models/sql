package org.nasdanika.models.sql.cli;

import java.util.List;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import io.opentelemetry.api.OpenTelemetry;
import picocli.CommandLine;

public class SqlCommandFactory extends SubCommandCapabilityFactory<SqlCommand> {

	@Override
	protected Class<SqlCommand> getCommandType() {
		return SqlCommand.class;
	}
	
	@Override
	protected CompletionStage<SqlCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		Requirement<Object, OpenTelemetry> requirement = ServiceCapabilityFactory.createRequirement(OpenTelemetry.class);
		CompletionStage<OpenTelemetry> openTelemetryCS = loader.loadOne(requirement, progressMonitor);		
		return openTelemetryCS.thenApply(ot -> new SqlCommand(ot, loader.getCapabilityLoader()));
	}

}
