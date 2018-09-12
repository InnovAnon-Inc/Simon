/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 * 
 * InnovAnon, Inc. Proprietary
 * 
 * NOTICE:
 * All reproductions, total or partial, of this work must retain this notice.
 * 
 * Possession or use of this technology implies consent to our Terms of Service.
 * 
 * Owner and management NOT responsible for injury or death resulting from the use of this equipment.
 * 
 * If any clause in this notice is invalid or unenforceable in your jurisdiction, that does NOT necessarily invalidate any other clause in this notice.
 * 
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */
package com.innovanon.old_simon.Simon3;

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

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */