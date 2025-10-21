package org.nasdanika.models.sql.core;

import java.sql.SQLException;

public interface Processor<T,V> {
	
	V process(T data) throws SQLException;

}
