package org.nasdanika.models.sql.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Creates and loads objects from result sets
 * @param <T>
 */
public interface Factory<T> {
	
	T create(ResultSet resultSet) throws SQLException;

}
