/**
 * 
 */
package com.innovanon.simon.util.stream;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author gouldbergstein
 *
 */
public enum StreamUtil {
	;
	/**
	 * 
	 * @param stream
	 * @param conv
	 * @param exceptionClassesToCatch
	 * @return
	 */
	public static <A, R> Stream<R> errorEatingConversion(Stream<A> stream, Function<A, R> conv,
			Collection<Class<? extends Throwable>> exceptionClassesToCatch) {
		ErrorEatingOptionalConverter<A, R> eater = new ErrorEatingOptionalConverter<A, R>(conv,
				exceptionClassesToCatch,false);
		Stream<Optional<R>> a = stream.map(eater::apply);
		Stream<R> b = a.flatMap(new OptionalEatingMap<>());
		return b;
	}
}
