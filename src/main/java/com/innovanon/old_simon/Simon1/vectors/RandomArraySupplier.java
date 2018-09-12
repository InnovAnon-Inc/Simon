/**
 * 
 */
package com.innovanon.old_simon.Simon1.vectors;

import java.lang.reflect.Array;

import com.innovanon.old_simon.Simon1.randoms.RandomWrapper;
import com.innovanon.old_simon.Simon1.suppliers.RandomSupplier;
import com.innovanon.old_simon.Simon1.suppliers.primitives.ints.RandomIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public abstract class RandomArraySupplier<T, E, S extends RandomSupplier<E, ?extends RandomWrapper<E>>>
		extends RandomVectorSupplier<T, E, S> {

	/**
	 * @param random
	 * @param length
	 */
	public RandomArraySupplier(S random, RandomIntSupplier length) {
		super(random, length);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get() {
		Class<T> t = getClassType();
		if (!t.isArray())
			throw new Error();
		Class<?> componentType = t.getComponentType();
		int length = getLength().getAsInt();
		Object arr = Array.newInstance(componentType, length);
		instantiateElementsHelper(arr, 0, length);
		return (T) arr;
	}
	
	public abstract Class<T> getClassType();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.functions.RandomVectorFunction#instantiateElements(
	 * java.lang.Object, java.lang.Class, int, int)
	 */
	@Override
	public void instantiateElements(T arr, int start, int range) {
		//if (!arr.getClass().getComponentType().isAssignableFrom(componentType))
			//throw new Error();
		instantiateElementsHelper(arr,  start, range);
	}

	private void instantiateElementsHelper(Object arr,  int start, int range) {
		//assert arr.getClass().getComponentType().isAssignableFrom(componentType);
		// TODO parallelize for large ranges
		for (int i = start; i < start + range; i++) {
			Object value = getRandom().get();
			Array.set(arr, i, value);
		}
	}
}
