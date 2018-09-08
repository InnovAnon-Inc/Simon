/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class FloatInstantiatorImpl implements FloatInstantiator {

	private Random random;
	
	
	
	/**
	 * @param random
	 */
	public FloatInstantiatorImpl(Random random) {
		this.random = random;
	}



	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.FloatInstantiator#instantiateFloat()
	 */
	@Override
	public float instantiateFloat() {
		return random.nextFloat();
	}

}
