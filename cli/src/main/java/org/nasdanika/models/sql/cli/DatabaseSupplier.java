package org.nasdanika.models.sql.cli;

import java.util.Collection;
import java.util.Collections;

import org.nasdanika.common.EObjectSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.sql.Database;

public interface DatabaseSupplier extends EObjectSupplier<Database> {
		
	Database getDatabase(ProgressMonitor progressMonitor);
	
	@Override
	default Collection<Database> getEObjects(ProgressMonitor progressMonitor) {
		return Collections.singleton(getDatabase(progressMonitor));
	}
		
}
