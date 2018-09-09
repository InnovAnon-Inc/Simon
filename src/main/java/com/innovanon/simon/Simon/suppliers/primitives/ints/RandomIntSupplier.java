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
package com.innovanon.simon.Simon.suppliers.primitives.ints;

import java.util.function.IntSupplier;

import com.innovanon.simon.Simon.randoms.primitives.ints.RandomIntWrapper;
import com.innovanon.simon.Simon.suppliers.RandomSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomIntSupplier extends RandomSupplier<Integer, RandomIntWrapper> implements IntSupplier {

	/**
	 * @param random
	 */
	public RandomIntSupplier(RandomIntWrapper random) {
		super(random);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.IntSupplier#getAsInt()
	 */
	@Override
	public int getAsInt() {
		return getRandom().nextInt();
	}
}
