/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

/**
 * Instantiates floats.
 * 
 * @author seanrdev
 */
public class FloatInstantiator extends NumberInstantiator<Float> {

	public FloatInstantiator(Random random) {
		super(random);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float instantiate() {
		return Float.valueOf(instantiateFloat());
	}
	
	protected float instantiateFloat() {
		return random.nextFloat();
	}
}
