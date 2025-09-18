package org.nasdanika.models.crewai.cli;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.ProgressMonitorMixIn;
import org.nasdanika.cli.ResourceSetMixIn;
import org.nasdanika.cli.TelemetryCommand;
import org.nasdanika.common.Description;
import org.nasdanika.common.EObjectSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.util.CrewGenerator;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExecutionException;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Generates CrewAI code and configuration from a model",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "crew-ai")
@ParentCommands(EObjectSupplier.class)
@Description(icon = "https://crew-ai.models.nasdanika.org/images/crewai.svg")
public class CrewAIGeneratorCommand extends TelemetryCommand {

	public CrewAIGeneratorCommand(OpenTelemetry openTelemetry, CapabilityLoader capabilityLoader) {
		super(openTelemetry, capabilityLoader);
	}

	@ParentCommand
	private EObjectSupplier<EObject> eObjectSupplier;
		
	@Parameters(
		index =  "0",	
		arity = "1",
		description = "Crew class output file")
	private File output;
	
	@Mixin
	private ProgressMonitorMixIn progressMonitorMixIn;
	
	@Mixin
	private ResourceSetMixIn resourceSetMixIn;
		
	@Override
	public Integer execute(Span commandSpan) throws Exception {
		if (eObjectSupplier == null) {
			throw new ExecutionException(spec.commandLine(), "No parent command");
		}
		
		try (ProgressMonitor progressMonitor = progressMonitorMixIn.createProgressMonitor(1)) {
			Collection<EObject> eObjects = eObjectSupplier.getEObjects(progressMonitor);
			if (eObjects == null) {
				throw new ExecutionException(spec.commandLine(), "No input objects");				
			}
			if (eObjects.size() != 1) {
				throw new ExecutionException(spec.commandLine(), "Expected a single input object, got " + eObjects.size());				
			}
			EObject inputObj = eObjects.iterator().next();
			if (inputObj instanceof Crew) {
				ResourceSet resourceSet = resourceSetMixIn.createResourceSet(progressMonitor.split("Creating a resource set", 1));				
				URI crewSourceURI = URI.createFileURI(output.getAbsolutePath());
				CrewGenerator crewGenerator = createGenerator();
				crewGenerator.generate(
						(Crew) inputObj, 
						crewSourceURI, 
						resourceSet, 
						progressMonitor);
				return 0;				
			}
			
			throw new ExecutionException(spec.commandLine(), "Input object must be of type " + Crew.class.getName() + ", got " + inputObj);								
		}
	}

	/**
	 * Override to customize the generator
	 * @return
	 */
	protected CrewGenerator createGenerator() {
		return new CrewGenerator();
	}	

}
