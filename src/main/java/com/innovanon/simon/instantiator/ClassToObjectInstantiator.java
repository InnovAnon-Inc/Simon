/**
 * 
 */
package com.innovanon.simon.instantiator;

import java.util.Objects;

import com.innovanon.simon.instantiators.Instantiators;

/**
 * @author gouldbergstein
 *
 */
public class ClassToObjectInstantiator implements Instantiator<Object> {

	private Instantiators<Object> delegate;
	
	/**
	 * @param delegate
	 */
	public ClassToObjectInstantiator(Instantiators<Object> delegate) {
		Objects.requireNonNull(delegate);
		this.delegate = delegate;
	}

	/* (non-Javadoc)
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return delegate.apply(t).test(t);
	}

	/* (non-Javadoc)
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		return delegate.apply(t).apply(t);
	}
}
