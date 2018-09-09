/**
 * 
 */
package com.innovanon.simon.Simon;

import com.innovanon.simon.Simon.randoms.RandomWrapper;

/**
 * @author gouldbergstein
 *
 */
public class RandomVectorInstantiator<T, E, R extends RandomWrapper<E>> extends RandomInstantiator<T, R> {

	/**
	 * @param random
	 */
	public RandomVectorInstantiator(R random) {
		super(random);
	}
}
