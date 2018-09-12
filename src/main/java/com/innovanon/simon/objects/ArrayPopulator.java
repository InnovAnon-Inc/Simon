/**
 * 
 */
package com.innovanon.simon.objects;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author gouldbergstein
 *
 */
public class ArrayPopulator implements Consumer<Object> {

	private Function<Class<?>, Object> elements;

	/**
	 * @param elements
	 */
	public ArrayPopulator(Function<Class<?>, Object> elements) {
		this.elements = elements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntConsumer#accept(int)
	 */
	@Override
	public void accept(Object array) {
		int length = Array.getLength(array);
		Class<?> componentType = array.getClass().getComponentType();
		for (int index = 0; index < length; index++) {
			Object value = elements.apply((Class<Object>) componentType);
			Array.set(array, index, value);
		}
	}
}
