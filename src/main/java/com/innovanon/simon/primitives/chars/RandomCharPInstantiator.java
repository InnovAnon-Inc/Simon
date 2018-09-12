/**
 * 
 */
package com.innovanon.simon.primitives.chars;

import java.util.Random;
import java.util.function.IntSupplier;

import com.innovanon.old_simon.Simon2.RangedIntSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomCharPInstantiator extends CharPInstantiatorAbs {

	private IntSupplier random;

	/**
	 * @param random
	 */
	public RandomCharPInstantiator(Random random) {
		this.random = new RangedIntSupplier(random, Character.MIN_VALUE, Character.MAX_VALUE);
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.util.function.CharSupplier#getAsChar()
	 */
	@Override
	public char getAsChar() {
		int ret = random.getAsInt();
		assert Character.MIN_VALUE<=ret;
		assert ret<=Character.MAX_VALUE;
		return (char) ret;
	}
}
