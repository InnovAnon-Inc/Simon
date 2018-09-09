/**
 * 
 */
package com.innovanon.simon.Simon.functions;

import java.util.function.Function;

import com.innovanon.simon.Simon.RandomVectorInstantiator;
import com.innovanon.simon.Simon.randoms.RandomWrapper;
import com.innovanon.simon.Simon.suppliers.RandomSupplier;
import com.innovanon.simon.Simon.suppliers.primitives.ints.RandomIntSupplier;

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
