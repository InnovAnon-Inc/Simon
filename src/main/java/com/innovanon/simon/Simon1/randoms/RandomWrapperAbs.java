/**
 * 
 */
package com.innovanon.simon.Simon1.randoms;

/**
 * @author gouldbergstein
 *
 */
public abstract class RandomWrapperAbs<T, R> implements RandomWrapper<T> {

	private R random;

	/**
	 * @param random
	 */
	public RandomWrapperAbs(R random) {
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
