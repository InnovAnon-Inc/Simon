/**
 * 
 */
package com.innovanon.old_simon.Simon1;

import com.innovanon.old_simon.Simon1.randoms.RandomWrapper;

/**
 * @author gouldbergstein
 *
 */
public abstract class RandomScalarInstantiator<T, R extends RandomWrapper<T>> extends RandomInstantiator<T, R> {

	/**
	 * @param random
	 */
	public RandomScalarInstantiator(R random) {
		super(random);
	}
}
