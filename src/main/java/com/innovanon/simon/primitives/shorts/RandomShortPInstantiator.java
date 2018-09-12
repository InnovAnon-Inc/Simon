/**
 * 
 */
package com.innovanon.simon.primitives.shorts;

import java.util.Random;
import java.util.function.IntSupplier;

import com.innovanon.old_simon.Simon2.RangedIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomShortPInstantiator extends ShortPInstantiatorAbs {

	private IntSupplier random;

	/**
	 * @param random
	 */
	public RandomShortPInstantiator(Random random) {
		this.random = new RangedIntSupplier(random, Short.MIN_VALUE, Short.MAX_VALUE);
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.primitives.shorts.ShortSupplier#getAsShort()
	 */
	@Override
	public short getAsShort() {
		int ret = random.getAsInt();
		assert Short.MIN_VALUE<=ret;
		assert ret<=Short.MAX_VALUE;
		return (short) ret;
	}
}
