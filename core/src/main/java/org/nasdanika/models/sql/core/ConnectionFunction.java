package org.nasdanika.models.sql.core;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * A function computing value in the context of SQL {@link Connection}.
 * @param <T>
 */
public interface ConnectionFunction<T> {
	
	T apply(Connection connection) throws SQLException;

}

