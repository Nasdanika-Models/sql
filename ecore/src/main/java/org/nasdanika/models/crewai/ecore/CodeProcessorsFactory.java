package org.nasdanika.models.crewai.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;

@EClassifierNodeProcessorFactory(classifierID = CrewaiPackage.CODE)
public class CodeProcessorsFactory {
	private Context context;
	
	public CodeProcessorsFactory(Context context) {
		this.context = context;
	}	
		
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			icon = "https://crew-ai.models.nasdanika.org/images/script.svg", 
			description = "Base class for producers of python code",
			documentation = 
					"""
					Base class for model element which generate python code.
					  					
                    """
	)
	public EClassNodeProcessor createCodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
			@Override
			protected EList<? super Action> getMembersActionCollection(Action parent) {
				return parent.getChildren();
			}
			
			@Override
			protected EList<? super Action> getMembersCollection(Action membersAction) {
				return membersAction.getChildren();
			}
						
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CODE,
			featureID = CrewaiPackage.CODE__CODE,
			description = "Python code (template)",
			documentation = 
					"""
					How code attribute is used is subclass-specific:
					
					* [Crew](../../../../Crew/index.html) - code is added to the top of the generated crew class after configuration fields and before any other declarations.  
					* [Agent](../../../../Agent/index.html) and [Task](references/eClassifiers/Agent/index.html) - 	code is used as agent/task method body template.
					* [Function](../../../../Function/index.html) - code is used to produce function body.  					
					* [Tool](../../../../Crew/index.html) - what is added to the tools array. E.g. ``SerperDevTool()``.
					
					Code can contain interpolation tokens for adding imports. 
					Example: 
					
					```python
					my_var = ${spel:addItemImport('my_module', 'my_item').item}
					```
					
					* ``spel:`` is a prefix for [Spring Expression Language](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions) tokens.
					* ``addItemImport('my_module', 'my_item').item`` - calls ``org.nasdanika.models.python.Source.addImport()`` method and then ``getItem()`` value of the result. Import methods:
					    * ``addItemImport(module, item)`` - the method used above
					    * ``addItemImport(module, item, name)`` - in this case use ``.name``
					    * ``addModuleImport(module)`` - in this case use add dot and imported item after the token. e.g. ``${spel:addModuleImport('my_module').module}.my_item``
					    * ``addModuleImport(module, alias)`` - in this case use add dot and imported item after the token. e.g. ``${spel:addModuleImport('my_module', 'mi_modulo').alias}.my_item``  					  				
					
					"""
	)
	public EAttributeNodeProcessor createCodeAttributeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CODE,
			featureID = CrewaiPackage.CODE__IMPORTS,
			description = "A YAML map of imports",
			documentation = 
					"""
					Imports used by code can be specified as a list of maps or a single map with the keys corresponding to [Import attributes](https://python.models.nasdanika.org/references/eClassifiers/Import/attributes.html). 					  					  				
					
					"""
	)
	public EAttributeNodeProcessor createImportsProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.CODE,
			featureID = CrewaiPackage.CODE__COMMENT,
			description = "Code comment",
			documentation = 
					"""
					Comment to add before the code. 					  					  				
					
					"""
	)
	public EAttributeNodeProcessor createCommentProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}

}
