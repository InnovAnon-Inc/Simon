/**
 * 
 */
package com.innovanon.simon.util.stream;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class ErrorEatingSupplier<T> extends ErrorEater<T, Throwable> implements Supplier<Optional<T>> {

	private Supplier<T> supplier;

	/**
	 * @param exceptionClassesToCatch
	 * @param rememberErrors
	 */
	public ErrorEatingSupplier(Collection<Class<? extends Throwable>> exceptionClassesToCatch, boolean rememberErrors,
			Supplier<T> supplier) {
		super(exceptionClassesToCatch, rememberErrors);
		this.supplier = supplier;
	}

	public Optional<T> get() {
		return super.apply(supplier::get, x -> x);
	}
}
