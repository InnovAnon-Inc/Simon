/**
 * 
 */
package com.innovanon.simon.Simon;

import com.innovanon.simon.Simon.randoms.RandomWrapper;

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
