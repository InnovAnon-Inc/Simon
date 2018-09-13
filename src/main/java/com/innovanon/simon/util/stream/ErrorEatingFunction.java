/**
 * 
 */
package com.innovanon.simon.util.stream;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;

import com.innovanon.struct.Structs.pair.Pair;
import com.innovanon.struct.Structs.pair.PairImpl;

/**
 * @author gouldbergstein
 *
 */
public class ErrorEatingFunction<A, R> extends ErrorEater<R, Pair<A, Throwable>> implements Function<A, Optional<R>> {

	private Function<A, R> supplier;

	/**
	 * @param exceptionClassesToCatch
	 * @param rememberErrors
	 */
	public ErrorEatingFunction(Collection<Class<? extends Throwable>> exceptionClassesToCatch, boolean rememberErrors,
			Function<A, R> supplier) {
		super(exceptionClassesToCatch, rememberErrors);
		this.supplier = supplier;
	}

	@Override
	public Optional<R> apply(A arg) {
		return super.apply(() -> supplier.apply(arg), e -> new PairImpl<>(arg, e));
	}
}
