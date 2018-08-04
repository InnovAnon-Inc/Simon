/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

/**
 * Instantiates doubles.
 * 
 * @author seanrdev
 */
public class DoubleInstantiator extends NumberInstantiator<Double> {

	public DoubleInstantiator(Random random) {
		super(random);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double instantiate() {
		return Double.valueOf(instantiateDouble());
	}
	
	protected double instantiateDouble() {
		return random.nextDouble();
	}
}
