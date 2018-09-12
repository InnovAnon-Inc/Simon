/**
 * 
 */
package com.innovanon.simon.objects;

import java.util.Arrays;
import java.util.Random;

import com.innovanon.simon.instantiator.Instantiator;
import com.innovanon.simon.struct.Bag;
import com.innovanon.simon.struct.BagImpl;

/**
 * @author gouldbergstein
 *
 */
public class EnumInstantiator implements Instantiator<Object> {

	private Random random;
	
	/**
	 * @param random
	 */
	public EnumInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return t.isEnum();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public Object apply(Class<?> t) {
		Object[] constants = t.getEnumConstants();
		Bag<Object> bag = new BagImpl<>(Arrays.asList(constants), random);
		return t.cast(bag.remove());
	}
}
