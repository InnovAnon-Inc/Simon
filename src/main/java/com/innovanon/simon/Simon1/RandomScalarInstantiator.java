/**
 * 
 */
package com.innovanon.simon.Simon1;

import com.innovanon.simon.Simon1.randoms.RandomWrapper;

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
