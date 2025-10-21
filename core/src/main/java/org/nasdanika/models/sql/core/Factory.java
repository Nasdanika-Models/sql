package org.nasdanika.models.sql.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
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
	
	default <R> void process(
			ResultSet resultSet,
			Processor<? super T, ? extends R> processor,
			Consumer<? super R> consumer) throws SQLException {
		
		while (resultSet.next()) {
			T arg = create(resultSet);
			R result = processor.process(arg);
			if (consumer != null) {
				consumer.accept(result);
			}
		}		
	}
	
	default <R> void process(
			ResultSet resultSet,
			Executor executor,
			Processor<? super T, ? extends R> processor,
			Consumer<? super CompletionStage<? super R>> consumer) throws SQLException {
		
		while (resultSet.next()) {
			CompletableFuture<R> cf = new CompletableFuture<>();
			
			executor.execute(() -> {
				try {
					T arg = create(resultSet);
					R result = processor.process(arg);
					cf.complete(result);
				} catch (Exception e) {
					cf.completeExceptionally(e);
				}
			});
			
			if (consumer != null) {
				consumer.accept(cf);
			}
		}		
	}
	
}
