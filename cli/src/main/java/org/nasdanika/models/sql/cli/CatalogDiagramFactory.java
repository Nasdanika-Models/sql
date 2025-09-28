package org.nasdanika.models.sql.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class CatalogDiagramFactory extends SubCommandCapabilityFactory<CatalogDiagramCommand> {

	@Override
	protected Class<CatalogDiagramCommand> getCommandType() {
		return CatalogDiagramCommand.class;
	}
	
	@Override
	protected CompletionStage<CatalogDiagramCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new CatalogDiagramCommand(loader.getCapabilityLoader()));
	}

}
