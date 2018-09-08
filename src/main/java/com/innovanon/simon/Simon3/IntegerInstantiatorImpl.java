/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class IntegerInstantiatorImpl implements IntegerInstantiator {

	private Random random;
	
	/**
	 * @param random
	 */
	public IntegerInstantiatorImpl(Random random) {
		this.random = random;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.IntegerInstantiator#instantiateInteger()
	 */
	@Override
	public int instantiateInteger() {
		return random.nextInt();
	}
}
