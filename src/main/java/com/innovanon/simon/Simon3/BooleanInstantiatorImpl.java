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

import java.security.SecureRandom;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class BooleanInstantiatorImpl implements BooleanInstantiator {

	private Supplier<Boolean> random;
	
	/**
	 * @param random
	 */
	public BooleanInstantiatorImpl(Supplier<Boolean> random) {
		this.random = random;
	}
	
	public BooleanInstantiatorImpl(Random random) {
		this.random = new Supplier<Boolean> () {
			@Override public Boolean get () { return random.nextBoolean(); }
		};
	}
	public BooleanInstantiatorImpl(SplittableRandom random) {
		this.random = new Supplier<Boolean> () {
			@Override public Boolean get () { return random.nextBoolean(); }
		};
	}public BooleanInstantiatorImpl(SecureRandom random) {
		this.random = new Supplier<Boolean> () {
			@Override public Boolean get () { return random.nextBoolean(); }
		};
	}

	/* (non-Javadoc)
	 * @see com.innovanon.simon.Simon3.BooleanInstantiator#instantiateBoolean()
	 */
	@Override
	public boolean instantiateBoolean() {
		return random.get(); 
	}

}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */