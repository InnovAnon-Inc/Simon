/**
 * 
 */
package com.innovanon.old_simon.Simon1.vectors;

import java.util.function.Supplier;

import com.innovanon.old_simon.Simon1.RandomVectorInstantiator;
import com.innovanon.old_simon.Simon1.randoms.RandomWrapper;
import com.innovanon.old_simon.Simon1.suppliers.RandomSupplier;
import com.innovanon.old_simon.Simon1.suppliers.primitives.ints.RandomIntSupplier;

/**
 * @author gouldbergstein
 */
public abstract class RandomVectorSupplier<T, E, S extends RandomSupplier<E, ? extends RandomWrapper<E>>>
		extends RandomVectorInstantiator<T, E, S> implements Supplier<T>{

	private RandomIntSupplier length;

	/**
	 * @param random
	 */
	public RandomVectorSupplier(S random, RandomIntSupplier length) {
		super(random);
		this.length = length;
	}

	/**
	 * @return the length
	 */
	public RandomIntSupplier getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(RandomIntSupplier length) {
		this.length = length;
	}

	public abstract void instantiateElements(T arr, int start, int range);
}
