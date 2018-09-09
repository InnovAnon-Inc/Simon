/**
 * 
 */
package com.innovanon.simon.Simon.functions;

import java.lang.reflect.Array;

import com.innovanon.simon.Simon.randoms.RandomWrapper;
import com.innovanon.simon.Simon.suppliers.RandomSupplier;
import com.innovanon.simon.Simon.suppliers.primitives.ints.RandomIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomArrayFunction<T, E, S extends RandomSupplier<E, ?extends RandomWrapper<E>>>
		extends RandomVectorFunction<T, E, S> {

	/**
	 * @param random
	 * @param length
	 */
	public RandomArrayFunction(S random, RandomIntSupplier length) {
		super(random, length);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T apply(Class<T> t) {
		if (!t.isArray())
			throw new Error();
		Class<?> componentType = t.getComponentType();
		int length = getLength().getAsInt();
		Object arr = Array.newInstance(componentType, length);
		instantiateElementsHelper(arr, componentType, 0, length);
		return (T) arr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.innovanon.simon.Simon.functions.RandomVectorFunction#instantiateElements(
	 * java.lang.Object, java.lang.Class, int, int)
	 */
	@Override
	public void instantiateElements(T arr, Class<? extends E> componentType, int start, int range) {
		if (!arr.getClass().getComponentType().isAssignableFrom(componentType))
			throw new Error();
		instantiateElementsHelper(arr, componentType, start, range);
	}

	private void instantiateElementsHelper(Object arr, Class<?> componentType, int start, int range) {
		assert arr.getClass().getComponentType().isAssignableFrom(componentType);
		// TODO parallelize for large ranges
		for (int i = start; i < start + range; i++) {
			Object value = getRandom().get();
			Array.set(arr, i, value);
		}
	}
}
