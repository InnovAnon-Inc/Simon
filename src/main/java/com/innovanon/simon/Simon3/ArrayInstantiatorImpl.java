/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.lang.reflect.Array;

/**
 * @author gouldbergstein
 *
 */
public class ArrayInstantiatorImpl<T> implements ArrayInstantiator<T> {
	private Instantiator<Object> componentTypeInstantiator;
	private IntegerInstantiator arrayLengthInstantiator;

	/**
	 * @param componentTypeInstantiator
	 */
	public ArrayInstantiatorImpl(Instantiator<Object> componentTypeInstantiator, IntegerInstantiator arrayLengthInstantiator) {
		this.componentTypeInstantiator = componentTypeInstantiator;
		this.arrayLengthInstantiator = arrayLengthInstantiator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.Simon3.ArrayInstantiator#instantiateArray(java.lang.
	 * Class)
	 */
	@Override
	public Object instantiateArray(Class<? extends T> clazz) {
		int length = arrayLengthInstantiator.instantiateInteger();
		Class<?> componentType = clazz.getComponentType();
		Object ret = Array.newInstance(componentType, length);
		populateArray(ret, 0,length, componentType);
		return ret;
	}
	
	public void populateArray (Object array, int start, int length, Class<?> componentType) {
		for (int i = start; i < length; i++) {
			Object value = componentTypeInstantiator.instantiate(componentType);
			Array.set(array, i, value);
		}
	}
}
