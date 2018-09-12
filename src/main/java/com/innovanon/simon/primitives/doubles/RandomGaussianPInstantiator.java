/**
 * 
 */
package com.innovanon.simon.primitives.doubles;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomGaussianPInstantiator extends DoublePInstantiatorAbs {

	private Random random;

	/**
	 * @param random
	 */
	public RandomGaussianPInstantiator(Random random) {
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.DoubleSupplier#getAsDouble()
	 */
	@Override
	public double getAsDouble() {
		return random.nextGaussian();
	}
}
