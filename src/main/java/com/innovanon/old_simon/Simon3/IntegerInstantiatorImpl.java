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
package com.innovanon.old_simon.Simon3;

import java.security.SecureRandom;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class IntegerInstantiatorImpl implements IntegerInstantiator {

	private Supplier<Integer> random;
	
	/**
	 * @param random
	 */
	public IntegerInstantiatorImpl(Supplier<Integer> random) {
		this.random = random;
	}
	public IntegerInstantiatorImpl(Random random) {
		this.random = new Supplier<Integer> () {
			@Override public Integer get () { return random.nextInt(); }
		};
	}
	public IntegerInstantiatorImpl(SplittableRandom random) {
		this.random = new Supplier<Integer> () {
			@Override public Integer get () { return random.nextInt(); }
		};
	}
	public IntegerInstantiatorImpl(SecureRandom random) {
		this.random = new Supplier<Integer> () {
			@Override public Integer get () { return random.nextInt(); }
		};
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.IntegerInstantiator#instantiateInteger()
	 */
	@Override
	public int instantiateInteger() {
		return random.get();
	}
}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */