/**
 * 
 */
package com.innovanon.old_simon.Simon1;

/**
 * @author gouldbergstein
 *
 */
public class RandomInstantiator<T, R> {

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
