/**
 * 
 */
package com.innovanon.simon.Simon;

import com.innovanon.simon.Simon.randoms.RandomWrapper;
import com.innovanon.simon.Simon.suppliers.RandomSupplier;

/**
 * @author gouldbergstein
 *
 */
public abstract class RandomVectorInstantiator<T, E, S extends RandomSupplier<E, ?extends RandomWrapper<E>>>
		extends RandomInstantiator<T, S> {

	/**
	 * @param random
	 */
	public RandomVectorInstantiator(S random) {
		super(random);
	}
}
