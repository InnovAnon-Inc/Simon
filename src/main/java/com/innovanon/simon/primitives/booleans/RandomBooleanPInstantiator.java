/**
 * 
 */
package com.innovanon.simon.primitives.booleans;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomBooleanPInstantiator extends BooleanPInstantiatorAbs {

	private Random random;

	/**
	 * @param random
	 */
	public RandomBooleanPInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.BooleanSupplier#getAsBoolean()
	 */
	@Override
	public boolean getAsBoolean() {
		return random.nextBoolean();
	}
}
