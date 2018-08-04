/**
 * 
 */
package com.innovanon.simon.Simon.primitives;

import java.util.Random;

/**
 * Instantiates ints.
 * 
 * @author seanrdev
 */
public class IntegerInstantiator extends NumberInstantiator<Integer> {

	public IntegerInstantiator(Random random) {
		super(random);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer instantiate() {
		return Integer.valueOf(instantiateInt());
	}
	
	protected int instantiateInt() {
		return random.nextInt();
	}
}
