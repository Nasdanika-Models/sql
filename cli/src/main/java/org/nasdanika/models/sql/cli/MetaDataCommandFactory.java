package org.nasdanika.models.sql.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class MetaDataCommandFactory extends SubCommandCapabilityFactory<MetaDataCommand> {

	@Override
	protected Class<MetaDataCommand> getCommandType() {
		return MetaDataCommand.class;
	}
	
	@Override
	protected CompletionStage<MetaDataCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new MetaDataCommand(loader.getCapabilityLoader()));
	}

}
