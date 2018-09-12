/**
 * 
 */
package com.innovanon.simon.util.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import com.innovanon.simon.struct.pair.Pair;
import com.innovanon.simon.struct.pair.PairImpl;
import com.innovanon.simon.util.IsInstancePredicate;

/**
 * @author gouldbergstein
 */
public class ErrorEatingOptionalConverter<A, R> implements Function<A, Optional<R>> {
	private Function<A, R> nameToClassConverter;
	private Collection<Class<? extends Throwable>> tastyExceptions;
	private List<Pair<A, ? extends Throwable>> errors;

	/**
	 * @param nameToClassConverter
	 * @param exceptionClassesToCatch
	 * @param rememberErrors
	 */
	public ErrorEatingOptionalConverter(Function<A, R> nameToClassConverter,
			Collection<Class<? extends Throwable>> exceptionClassesToCatch, boolean rememberErrors) {
		this.nameToClassConverter = nameToClassConverter;
		tastyExceptions = exceptionClassesToCatch;
		if (rememberErrors)
			errors = new ArrayList<>();
	}

	/**
	 * @throws Error
	 * @see java.lang.ClassNotFoundException
	 * @see Class#forName(String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Optional<R> apply(A className) {
		// Objects.requireNonNull(className);
		try {
			return Optional.of(nameToClassConverter.apply(className));
		} catch (Throwable e) {
			Predicate<? super Class<? extends Throwable>> predicate = new IsInstancePredicate<>(e);
			if (!tastyExceptions.stream().anyMatch(predicate))
				throw e;
			if (errors != null) {
				Pair<A, ? extends Throwable> pair = new PairImpl<>(className, e);
				errors.add(pair);
			}
			return Optional.empty();
		}
	}

	/**
	 * @return the errors
	 */
	public List<Pair<A, ? extends Throwable>> getErrors() {
		return Collections.unmodifiableList(errors);
	}
}
