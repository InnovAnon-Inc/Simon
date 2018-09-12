/**
 * 
 */
package com.innovanon.simon.primitives.floats;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomFloatPInstantiator extends FloatPInstantiatorAbs {

	private Random random;

	/**
	 * @param random
	 */
	public RandomFloatPInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.primitives.floats.FloatSupplier#getAsFloat()
	 */
	@Override
	public float getAsFloat() {
		return random.nextFloat();
	}
}
