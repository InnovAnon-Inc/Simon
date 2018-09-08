/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RangeIntegerInstantiator implements IntegerInstantiator {

	private Random random;
	private int offset, range;
	  
	/*  *  
	 * @param random
	 */
	public RangeIntegerInstantiator(Random random, int min, int max) {
		this.random = random;
		this.offset = min;
		this.range = max - min + 1;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.IntegerInstantiator#instantiateInteger()
	 */
	@Override
	public int instantiateInteger() {
		return offset + random.nextInt(range);
	}


}
