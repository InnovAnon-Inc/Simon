/**
 * 
 */
package com.innovanon.simon.primitives.doubles;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomDoublePInstantiator extends DoublePInstantiatorAbs {

	private Random random;

	/**
	 * @param random
	 */
	public RandomDoublePInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.DoubleSupplier#getAsDouble()
	 */
	@Override
	public double getAsDouble() {
		return random.nextDouble();
	}
}
