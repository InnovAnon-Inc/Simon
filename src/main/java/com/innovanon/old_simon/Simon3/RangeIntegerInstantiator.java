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

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author gouldbergstein
 *
 */
public class RangeIntegerInstantiator extends IntegerInstantiatorImpl {

	/**
	 * 
	 * @param random
	 */
	public RangeIntegerInstantiator(Function<Integer, Integer> random, int min, int max) {
		super(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return random.apply(max - min + 1) + min;
			}
		});
	}
}

/**
 * Om
 * Krim Krim Krim Hum Hum Hrim Hrim Daksine Kalike
 * Krim Krim Krim Hum Hum Hrim Hrim Svaha
 */