/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class GaussianInstantiatorImpl implements DoubleInstantiator {

	private Random random;
	
	
	
	/**
	 * @param random
	 */
	public GaussianInstantiatorImpl(Random random) {
		this.random = random;
	}



	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.DoubleInstantiator#instantiateDouble()
	 */
	@Override
	public double instantiateDouble() {
		return random.nextGaussian();
	}

}
