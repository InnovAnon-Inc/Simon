/**
 * 
 */
package com.innovanon.old_simon.Simon1;

import com.innovanon.old_simon.Simon1.randoms.RandomWrapper;
import com.innovanon.old_simon.Simon1.suppliers.RandomSupplier;

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
