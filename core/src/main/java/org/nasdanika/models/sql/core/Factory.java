package org.nasdanika.models.sql.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Creates and loads objects from result sets
 * @param <T>
 */
public interface Factory<T> {

	/**
	 * Creates a single object
	 * @param resultSet
	 * @return
	 * @throws SQLException
	 */
	T create(ResultSet resultSet) throws SQLException;
	
	default List<T> toList(ResultSet resultSet) throws SQLException {
		List<T> ret = new ArrayList<>();
		load(resultSet, ret::add);
		return ret;
	}

	default void load(ResultSet resultSet, Consumer<? super T> consumer) throws SQLException {
		while (resultSet.next()) {
			consumer.accept(create(resultSet));
		}		
	}	
	
}
