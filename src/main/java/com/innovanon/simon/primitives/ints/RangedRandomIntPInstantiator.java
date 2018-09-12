/**
 * 
 */
package com.innovanon.simon.primitives.ints;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RangedRandomIntPInstantiator extends IntPInstantiatorAbs {

	private Random random;
	private int bound;
	private int offset;

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
