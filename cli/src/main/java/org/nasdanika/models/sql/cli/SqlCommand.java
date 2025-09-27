package org.nasdanika.models.sql.cli;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.requirements.ClassLoaderRequirement;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.ProgressMonitorMixIn;
import org.nasdanika.cli.PropertiesMixIn;
import org.nasdanika.cli.RootCommand;
import org.nasdanika.common.Description;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.core.ConnectionFunction;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import picocli.CommandLine;
import picocli.CommandLine.ArgGroup;
import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
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
		private String[] driverJar;
		
		@Option(
				names = "--driver-dependency", 
				description = {
					"Driver Maven dependencies in",
					"<group id>:<artifact id>[:<classifier>]:<version>",
					"format. For example, com.h2database:h2:2.4.240"
				})
		private String[] driverDependency;
		
	}
	
	@ArgGroup(exclusive = true, multiplicity = "0..1")
	public DriverClassLoaderOptions driverClassLoaderOptions;
	
	@Option(
			names = "--user", 
			description = "Database user")
	private String user;
		
	@Option(
			names = "--driver-class", 
			description = { 
				"Driver class. Required if",
				"the driver class is loaded",
				"from a Maven dependency or",
				"a jar file"					
			})
	private String driverClass;	
		
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
	
	@Mixin
	private PropertiesMixIn propertiesMixIn;	
	
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
	public <Т> Т apply(ConnectionFunction<Т> function, ProgressMonitor progressMonitor) throws SQLException {
		Span commandSpan = getTracer().spanBuilder(getSpanName()).startSpan();
		try (Scope scope = commandSpan.makeCurrent()) {
	        try (Connection conn = getConnection(progressMonitor)) {
	        	Т result = function.apply(conn, progressMonitor);	
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
	
	protected ClassLoader getClassLoader(ClassLoader parent, ProgressMonitor progressMonitor) throws URISyntaxException, IOException {
		if (driverClassLoaderOptions == null) {
			return Thread.currentThread().getContextClassLoader();
		}
		
		if (driverClassLoaderOptions.driverJar != null) {						
			URI baseURI = new File("").getCanonicalFile().toURI();
			URL[] urls = new URL[driverClassLoaderOptions.driverJar.length];
			for (int i = 0; i < urls.length; ++i) {
				urls[i] = baseURI.resolve(driverClassLoaderOptions.driverJar[i]).toURL();
			}
			return new URLClassLoader(urls, parent); 			
		}
		
		ClassLoaderRequirement requirement = new ClassLoaderRequirement(
				null, // String[] modulePath,
				null, // String[] rootModules,
				new ModuleLayer[] { getClass().getModule().getLayer() }, 
				getClass().getClassLoader(), // ClassLoader parentClassLoader,
				true, // boolean singleLayerClassLoader,				
				driverClassLoaderOptions.driverDependency, 
				null, 
				null, 
				"target/test-repo",
				System.out::println);
				
		return capabilityLoader.loadOne(
				ServiceCapabilityFactory.createRequirement(ClassLoader.class, null, requirement),
				progressMonitor);
	}

	protected Connection getConnection(ProgressMonitor progressMonitor) throws Exception {
        java.util.Properties info = new java.util.Properties();

        if (user != null) {
            info.put("user", user);
        }
        if (password != null) {
            info.put("password", password);
        }
		if (propertiesMixIn != null) {
			Map<Object, Object> properties = propertiesMixIn.getProperties();
			if (properties != null && !properties.isEmpty()) {
				info.putAll(properties);
			}
		}
		
		Thread currentThread = Thread.currentThread();
		ClassLoader threadContextClassLoader = currentThread.getContextClassLoader();
		try {
			ClassLoader driverClassLoader = getClassLoader(threadContextClassLoader, progressMonitor);
			currentThread.setContextClassLoader(driverClassLoader);
			
			if (driverClass != null) {
				Driver driver = (Driver) Class.forName(driverClass, true, driverClassLoader).getDeclaredConstructor().newInstance();
				return driver.connect(connectionURL, info);
			}		
			
			return DriverManager.getConnection(connectionURL, info);
		} finally {
			currentThread.setContextClassLoader(threadContextClassLoader);
		}
	}
	
	@Mixin
	private ProgressMonitorMixIn progressMonitorMixIn;

	@Override
	public Object invoke(Invocable invocable) {
		Span commandSpan = getTracer().spanBuilder(getSpanName()).startSpan();
		try (Scope scope = commandSpan.makeCurrent()) {
	        try (ProgressMonitor progressMonitor =  progressMonitorMixIn.createProgressMonitor(1); Connection conn = getConnection(progressMonitor)) {
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
