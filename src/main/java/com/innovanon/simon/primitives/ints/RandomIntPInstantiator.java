/**
 * 
 */
package com.innovanon.simon.primitives.ints;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomIntPInstantiator extends IntPInstantiatorAbs {

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
