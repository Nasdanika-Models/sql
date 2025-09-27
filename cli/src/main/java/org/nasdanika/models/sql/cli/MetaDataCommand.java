package org.nasdanika.models.sql.cli;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.EObjectSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.Database;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Loads database metadata into a model",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "metadata")
@ParentCommands(SqlCommand.class)
public class MetaDataCommand extends CommandGroup implements EObjectSupplier<Database> {

	protected MetaDataCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}

	@ParentCommand
	private SqlCommand sqlCommand;
	
	@Option(
			names = "--schema", 
			description = {
				"Schema pattern",
				"all schemas if not provided.",
			})
	private String schemaPattern;	
	
	@Option(
			names = "--table", 
			description = {
				"Table name pattern",
				"all tables if not provided.",
			})
	private String tableNamePattern;	
	
	@Option(
			names = "--table-types", 
			description = {
				"Table names to include",
				"all table types if not provided.",
			})
	private String[] tableTypes;	

	@Override
	public Collection<Database> getEObjects(ProgressMonitor progressMonitor) {
		try {
			return sqlCommand.apply(
				(connection, pm) -> {
					return Collections.singleton(Database.create(connection.getMetaData(), schemaPattern, tableNamePattern, tableTypes));			
				},
				progressMonitor);
		} catch (SQLException e) {
			throw new CommandLine.ExecutionException(spec.commandLine(), "Error loading metadata: " + e, e);
		}
	}	

}
