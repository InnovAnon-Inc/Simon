/**
 * 
 */
package com.innovanon.simon.primitives.bytes;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class RandomBytePInstantiator extends BytePInstantiatorAbs {

	private Random random;
	private byte[] bytes;

	/**
	 * @param random
	 */
	public RandomBytePInstantiator(Random random) {
		this.random = random;
		bytes = new byte[1];
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.primitives.bytes.ByteSupplier#getAsByte()
	 */
	@Override
	public byte getAsByte() {
		random.nextBytes(bytes);
		return bytes[0];
	}
}
