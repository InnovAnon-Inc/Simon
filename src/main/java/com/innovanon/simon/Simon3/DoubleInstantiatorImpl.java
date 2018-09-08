/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class DoubleInstantiatorImpl implements DoubleInstantiator {

	private Random random;
	
	
	
	/**
	 * @param random
	 */
	public DoubleInstantiatorImpl(Random random) {
		this.random = random;
	}



	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.DoubleInstantiator#instantiateDouble()
	 */
	@Override
	public double instantiateDouble() {
		return random.nextDouble();
	}

}
