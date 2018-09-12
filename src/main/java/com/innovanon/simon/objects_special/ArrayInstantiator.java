/**
 * 
 */
package com.innovanon.simon.objects_special;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.function.IntSupplier;

import com.innovanon.simon.instantiator.Instantiator;

/**
 * @author gouldbergstein
 *
 */
public class ArrayInstantiator implements Instantiator<Object> {

	private IntSupplier lengths;
		
	/**
	 * @param lengths
	 */
	public ArrayInstantiator(IntSupplier lengths) {
		Objects.requireNonNull(lengths);
		this.lengths = lengths;
	}

	/* (non-Javadoc)
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		Objects.requireNonNull(t);
		return t.isArray();
	}

	/* (non-Javadoc)
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		Objects.requireNonNull(t);
		Class<?> componentType = t.getComponentType();
		int length=lengths.getAsInt();
		return Array.newInstance(componentType, length);
	}
}
