/**
 * 
 */
package com.innovanon.old_simon.Simon1.functions;

import java.util.function.Function;

import com.innovanon.old_simon.Simon1.RandomVectorInstantiator;
import com.innovanon.old_simon.Simon1.randoms.RandomWrapper;
import com.innovanon.old_simon.Simon1.suppliers.RandomSupplier;
import com.innovanon.old_simon.Simon1.suppliers.primitives.ints.RandomIntSupplier;

/**
 * @author gouldbergstein
 */
public abstract class RandomVectorFunction<T, E, S extends RandomSupplier<E,?extends  RandomWrapper<E>>>
		extends RandomVectorInstantiator<T, E, S> implements Function<Class<T>, T> {

	private RandomIntSupplier length;

	/**
	 * @param random
	 */
	public RandomVectorFunction(S random, RandomIntSupplier length) {
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

	public abstract void instantiateElements(T arr, Class<? extends E> componentType, int start, int range);
}
