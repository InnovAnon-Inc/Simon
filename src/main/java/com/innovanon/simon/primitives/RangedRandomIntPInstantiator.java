/**
 * 
 */
package com.innovanon.simon.primitives;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RangedRandomIntPInstantiator implements IntPInstantiator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 */
	@Override
	public boolean test(Class<?> t) {
		return int.class.equals(t) || Integer.class.equals(t);
	}

	private Random random;
	private int bound;
	private int offset;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public Integer get() {
		return Integer.valueOf(getAsInt());
	}

	/**
	 * @param random
	 * @param bound
	 * @param offset
	 */
	public RangedRandomIntPInstantiator(Random random, int bound, int offset) {
		this.random = random;
		this.bound = bound;
		this.offset = offset;
	}

	/**
	 * @param random
	 * @param max
	 * @param min
	 */
	// public RangedRandomIntSupplier(Random random, int min, int max) {
	// this (random, max - min, min);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntSupplier#getAsInt()
	 */
	@Override
	public int getAsInt() {
		return random.nextInt(bound) + offset;
	}
}
