/**
 * 
 */
package com.innovanon.simon.primitives.longs;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomLongPInstantiator extends LongPInstantiatorAbs {

	private Random random;

	/**
	 * @param random
	 */
	public RandomLongPInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.LongSupplier#getAsLong()
	 */
	@Override
	public long getAsLong() {
		return random.nextLong();
	}
}
