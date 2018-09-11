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
package com.innovanon.simon.Simon1.suppliers.primitives.booleans;

import java.util.function.BooleanSupplier;

import com.innovanon.simon.Simon1.randoms.primitives.booleans.RandomBooleanWrapper;
import com.innovanon.simon.Simon1.suppliers.RandomSupplier;

/**
 * @author gouldbergstein
 *
 */
public class RandomBooleanSupplier extends RandomSupplier<Boolean, RandomBooleanWrapper> implements BooleanSupplier {

	/**
	 * @param random
	 */
	public RandomBooleanSupplier(RandomBooleanWrapper random) {
		super(random);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.BooleanSupplier#getAsBoolean()
	 */
	@Override
	public boolean getAsBoolean() {
		return getRandom().nextBoolean();
	}
}
