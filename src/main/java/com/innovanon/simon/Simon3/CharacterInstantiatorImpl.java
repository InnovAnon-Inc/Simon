/**
 * 
 */
package com.innovanon.simon.Simon3;

import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class CharacterInstantiatorImpl implements CharacterInstantiator {

	private Random random;
	
	/**
	 * @param random
	 */
	public CharacterInstantiatorImpl(Random random) {
		this.random = random;
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.CharacterInstantiator#instantiateCharacter()
	 */
	@Override
	public char instantiateCharacter() {
		byte[] bytes = new byte[Character.BYTES];
		random.nextBytes(bytes);
		String string = new String (bytes, StandardCharsets.UTF_16);
		assert string.length () == 1;
		return string.charAt(0);
	}

}
