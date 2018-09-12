/**
 * 
 */
package com.innovanon.simon.objects_special;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import com.innovanon.simon.instantiator.Instantiator;

/**
 * @author gouldbergstein
 *
 */
public class ArrayPopulator implements Consumer<Object> {

	private Function<Class<?>, Instantiator<Object>> elements;

	/**
	 * @param elements
	 */
	public ArrayPopulator(Function<Class<?>, Instantiator<Object>> elements) {
		Objects.requireNonNull(elements);
		this.elements = elements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntConsumer#accept(int)
	 */
	//@SuppressWarnings("unchecked")
	@Override
	public void accept(Object array) {
		Objects.requireNonNull(array);
		int length = Array.getLength(array);
		Class<?> componentType = array.getClass().getComponentType();
		Instantiator<Object>e = elements.apply(componentType);
		for (int index = 0; index < length; index++) {
			//Class<Object> componentType2 = (Class<Object>) componentType;
			//Object value = elements.apply( componentType2);
			Object value = e.apply(componentType);
			Array.set(array, index, value);
		}
	}
}
