/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 * 
 * InnovAnon, Inc. Proprietary
 * 
 * NOTICE:
 * All reproductions, total or partial, of this work must retain this notice.
 * 
 * Possession or use of this technology implies consent to our Terms of Service.
 * 
 * Owner and management NOT responsible for injury or death resulting from the use of this equipment.
 * 
 * If any clause in this notice is invalid or unenforceable in your jurisdiction, that does NOT necessarily invalidate any other clause in this notice.
 * 
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
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

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */