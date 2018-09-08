/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class BooleanInstantiatorImpl implements BooleanInstantiator {

	private Random random;
	
	/**
	 * @param random
	 */
	public BooleanInstantiatorImpl(Random random) {
		this.random = random;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.BooleanInstantiator#instantiateBoolean()
	 */
	@Override
	public boolean instantiateBoolean() {
		return random.nextBoolean(); 
	}

}
