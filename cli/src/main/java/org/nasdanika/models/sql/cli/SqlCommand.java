package org.nasdanika.models.sql.cli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.RootCommand;
import org.nasdanika.common.Description;
import org.nasdanika.common.Invocable;
import org.nasdanika.models.sql.core.ConnectionFunction;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import picocli.CommandLine;
import picocli.CommandLine.ArgGroup;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(
		description = "Connects to a SQL database",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "sql")
@ParentCommands(RootCommand.class)
@Description(icon = "https://sql.models.nasdanika.org/images/sql-server.svg")
public class SqlCommand extends CommandGroup implements Invocable.Invoker {

	protected OpenTelemetry openTelemetry;

	public SqlCommand(OpenTelemetry openTelemetry, CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
		this.openTelemetry = openTelemetry;
	}
	
	@Parameters(
		index =  "0",	
		arity = "1",
		description = "Connection URL")
	private String connectionURL;
	
	public static class DriverClassLoaderOptions {
		
		@Option(
				names = "--driver-jar", 
				description = {
					"URLs of driver jar file(s) resolved relative",
					"to the current directory.",
				})
		private List<String> driverJar;
		
		@Option(
				names = "--driver-dependency", 
				description = {
					"Driver Maven dependencies in",
					"<group id>:<artifact id>[:<classifier>]:<version>",
					"format. For example, com.h2database:h2:2.4.240"
				})
		private List<String> driverDependency;
		
	}
	
	@ArgGroup(exclusive = true, multiplicity = "0..1")
	public DriverClassLoaderOptions driverClassLoaderOptions;
	
	@Option(
			names = "--user", 
			description = "Database user")
	private String user;
		
	@Option(
			names = "--password",
			interactive = true,
			arity = "0..1",
			description = {
					"Database user password",
					"The password can be provided directly",
					"as the value of this option, or entered",
					"interactively via a prompt if the option",
					"is specified without a value"
			})
	private String password;	
	
	// user name and password options - password as explained in picocli interactive if needed
	
	protected Tracer getTracer() {
		return openTelemetry.getTracer(getInstrumentationScopeName(), getInstrumentationScopeVersion());
	}
	
	protected String getCommandPath() {
		String ret = null;
		for (CommandSpec pathElement = spec; pathElement != null; pathElement = pathElement.parent()) {
			if (ret == null) {
				ret = pathElement.name();
			} else {
				ret = pathElement.name() + " " + ret;
			}
		}
		return ret;
	}
	
	protected String getInstrumentationScopeName() {
		return getClass().getName();
	}
	
	protected String getInstrumentationScopeVersion() {
		String[] version = spec.version();
		if (version == null) {
			return null;
		}
		return String.join(System.lineSeparator(), version);
	}
	
	protected String getSpanName() {
		return getCommandPath();
	}
	
	/**
	 * Applies the argument function in a try-catch with resources block of {@link Connection}
	 */
	public <Т> Т apply(ConnectionFunction<Т> function) throws SQLException {
		Span commandSpan = getTracer().spanBuilder(getSpanName()).startSpan();
		try (Scope scope = commandSpan.makeCurrent()) {
	        try (Connection conn = getConnection()) {
	        	Т result = function.apply(conn);	
	        	commandSpan.setStatus(StatusCode.OK);
	        	return result;
	        }
		} catch (Exception e) {
			commandSpan.recordException(e);
	        commandSpan.setStatus(StatusCode.ERROR);
			throw new CommandLine.ExecutionException(spec.commandLine(), e.getMessage(), e);
		} finally {			
			commandSpan.end();
		}				
	}

	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(connectionURL, "sa", "");
	}

	@Override
	public Object invoke(Invocable invocable) {
		Span commandSpan = getTracer().spanBuilder(getSpanName()).startSpan();
		try (Scope scope = commandSpan.makeCurrent()) {
	        try (Connection conn = getConnection()) {
	        	Object result = invocable
	        			.bindByName("connection", conn)
	        			.bindByName("capabilityLoader", capabilityLoader)
	        			.invoke();
	        	commandSpan.setStatus(StatusCode.OK);
	        	return result;
	        }
		} catch (Exception e) {
			commandSpan.recordException(e);
	        commandSpan.setStatus(StatusCode.ERROR);
			throw new CommandLine.ExecutionException(spec.commandLine(), e.getMessage(), e);
		} finally {			
			commandSpan.end();
		}				
	}	

}
