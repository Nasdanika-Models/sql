package org.nasdanika.models.sql.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class EcoreGeneratorCommandFactory extends SubCommandCapabilityFactory<EcoreGeneratorCommand> {

	@Override
	protected Class<EcoreGeneratorCommand> getCommandType() {
		return EcoreGeneratorCommand.class;
	}
	
	@Override
	protected CompletionStage<EcoreGeneratorCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new EcoreGeneratorCommand(loader.getCapabilityLoader()));
	}

}
