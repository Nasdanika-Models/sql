package org.nasdanika.models.sql.core;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.nasdanika.common.Composable;

public interface PreparedStatementParameterizer extends Composable<PreparedStatementParameterizer> {

	void parameterizePreparedStatement(PreparedStatement preparedStatement) throws SQLException;
		
	@Override
	default PreparedStatementParameterizer compose(PreparedStatementParameterizer other) {
		if (other == null) {
			return this;
		}
		
		return preparedStatement -> {
			this.parameterizePreparedStatement(preparedStatement);
			other.parameterizePreparedStatement(preparedStatement);
		};
	}
	

}
