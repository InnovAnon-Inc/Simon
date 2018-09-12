/**
 * 
 */
package com.innovanon.simon.util;

import java.util.function.Predicate;

/**
 * @author gouldbergstein
 *
 */
public class InvariablePredicate<T> implements Predicate<Predicate<T>> {
	
	private T t;

	/**
	 * @param t
	 */
	public InvariablePredicate(T t) {
		this.t = t;
	}
	
	/* (non-Javadoc)
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Predicate<T> t0) {
			return t0.test(t);
	}
}
