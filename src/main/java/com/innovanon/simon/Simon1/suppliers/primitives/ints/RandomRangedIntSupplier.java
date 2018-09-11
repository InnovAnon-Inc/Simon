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
package com.innovanon.simon.Simon1.suppliers.primitives.ints;

import java.util.function.IntSupplier;

import com.innovanon.simon.Simon1.randoms.primitives.ints.RandomIntWrapper;
import com.innovanon.simon.Simon1.suppliers.RandomSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomRangedIntSupplier extends RandomSupplier<Integer, RandomIntWrapper> implements IntSupplier {

	private int min;
	private int max;

	/**
	 * @param random
	 */
	public RandomRangedIntSupplier(RandomIntWrapper random, int min, int max) {
		super(random);
		this.min = min;
		this.max = max;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntSupplier#getAsInt()
	 */
	@Override
	public int getAsInt() {
		return getRandom().nextInt(min, max);
	}
}
