/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class LongInstantiatorImpl implements LongInstantiator {

	private Random random;
	
	/**
	 * @param random
	 */
	public LongInstantiatorImpl(Random random) {
		this.random = random;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.LongInstantiator#instantiateLong()
	 */
	@Override
	public long instantiateLong() {
		return random.nextLong();
	}

}
