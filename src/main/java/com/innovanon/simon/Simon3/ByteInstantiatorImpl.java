/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class ByteInstantiatorImpl implements ByteInstantiator {

	private Random random;
	
	
	
	/**
	 * @param random
	 */
	public ByteInstantiatorImpl(Random random) {
		this.random = random;
	}



	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.ByteInstantiator#instantiateByte()
	 */
	@Override
	public byte instantiateByte() {
		byte[] bytes = new byte[1];
		random.nextBytes( bytes);
		return bytes[0];
	}

}
