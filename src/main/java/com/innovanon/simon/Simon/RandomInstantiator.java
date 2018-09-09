/**
 * 
 */
package com.innovanon.simon.Simon;

import com.innovanon.simon.Simon.randoms.RandomWrapper;

/**
 * @author gouldbergstein
 *
 */
public class RandomInstantiator<T, R extends RandomWrapper<?>> {

	private R random;

	/**
	 * @param random
	 */
	public RandomInstantiator(R random) {
		this.random = random;
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
