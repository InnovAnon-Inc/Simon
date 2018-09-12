/**
 * 
 */
package com.innovanon.simon.primitives;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomIntPInstantiator implements IntPInstantiator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return int.class.equals(t) || Integer.class.equals(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Integer get() {
		return Integer.valueOf(getAsInt());
	}

	private Random random;

	/**
	 * @param random
	 */
	public RandomIntPInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntSupplier#getAsInt()
	 */
	@Override
	public int getAsInt() {
		return random.nextInt();
	}
}
