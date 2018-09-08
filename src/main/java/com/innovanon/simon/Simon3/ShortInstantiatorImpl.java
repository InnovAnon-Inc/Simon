/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class ShortInstantiatorImpl extends RangeIntegerInstantiator implements ShortInstantiator {

	/**
	 * @param random
	 */
	public ShortInstantiatorImpl(Random random) {
		super (random, Short.MIN_VALUE, Short.MAX_VALUE);
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.ShortInstantiator#instantiateShort()
	 */
	@Override
	public short instantiateShort() {
		return (short) super.instantiateInteger();
	}

}
