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
package com.innovanon.simon.Simon.randoms.primitives.ints;

import com.innovanon.simon.Simon.randoms.RandomWrapper;

/**
 * @author gouldbergstein
 *
 */
public interface RandomIntWrapper extends RandomWrapper<Integer> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Random#nextInt()
	 */
	int nextInt ();
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Random#nextInt(int)
	 */
	int nextInt (int range);
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.SplittableRandom#nextInt(int, int)
	 */
	int nextInt (int min, int max);
}
