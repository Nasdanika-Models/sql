package org.nasdanika.models.sql.core;

import java.sql.Connection;
import java.sql.SQLException;

import org.nasdanika.common.ProgressMonitor;

/**
 * A function computing value in the context of SQL {@link Connection}.
 * @param <T>
 */
public interface ConnectionFunction<T> {
	
	T apply(Connection connection, ProgressMonitor progressMonitor) throws SQLException;

}

