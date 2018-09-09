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

import java.util.Random;

/**
 * @author gouldbergstein
 *
 */
public class DoubleInstantiatorImpl implements DoubleInstantiator {

	private Random random;
	
	
	
	/**
	 * @param random
	 */
	public DoubleInstantiatorImpl(Random random) {
		this.random = random;
	}



	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.DoubleInstantiator#instantiateDouble()
	 */
	@Override
	public double instantiateDouble() {
		return random.nextDouble();
	}

}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */