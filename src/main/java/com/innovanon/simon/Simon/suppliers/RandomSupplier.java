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
package com.innovanon.simon.Simon.suppliers;

import java.util.function.Supplier;

import com.innovanon.simon.Simon.randoms.RandomWrapper;

/**
 * @author gouldbergstein
 */
public class RandomSupplier<T, R extends RandomWrapper<T>> implements Supplier<T> {

	private R random;

	/**
	 * @param random
	 */
	public RandomSupplier(R random) {
		this.random = random;
	}

	/* (non-Javadoc)
	 * @see java.util.function.Supplier#get()
	 */
	@Override
	public T get() {
		return random.next();
	}

	/**
	 * @return the random
	 */
	public R getRandom() {
		return random;
	}

	/**
	 * @param random the random to set
	 */
	public void setRandom(R random) {
		this.random = random;
	}
}