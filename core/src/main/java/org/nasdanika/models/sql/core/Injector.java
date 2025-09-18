package org.nasdanika.models.sql.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.nasdanika.common.Composable;

/**
 * Injects data from {@link ResultSet}
 */
public interface Injector<T> extends Composable<Injector<T>> {
	
	void inject(ResultSet resultSet, T target) throws SQLException;
	
	@Override
	default Injector<T> compose(Injector<T> other) {
		if (other == null) {
			return this;
		}
		
		return (resultSet,target) -> {
			this.inject(resultSet, target);
			other.inject(resultSet, target);
		};
	}

}
